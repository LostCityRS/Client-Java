package jagex2.client;

import javax.sound.midi.MidiSystem;
import javax.sound.sampled.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.LockSupport;

public class SignLink implements Runnable {

	public static int storeid = 32;

	public static RandomAccessFile cache_dat = null;

	public static RandomAccessFile[] cache_idx = new RandomAccessFile[5];

    // Applet support removed for modern JDKs; keep a placeholder for compatibility

	public static Socket socket = null;

	public static int threadreqpri = 1;

	public static Runnable threadreq = null;

	public static String dnsreq = null;

	public static String dns = null;

	public static String urlreq = null;

	public static DataInputStream urlstream = null;

	public static String savereq = null;

	public static byte[] savebuf = null;

	public static String midi = "none";

	public static String wave = "none";

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final int CLIENT_VERSION = 244;

	public static int midifade;

	public static int midipos;

	public static int midivol = 96;

	public static int savelen;

	public static int socketreq;

	public static int threadliveid;

	public static int uid;

	public static int wavepos;

	public static int wavevol = 96;

	public static InetAddress socketip;

	public static boolean active;

	public static boolean midiplay;

	public static boolean sunjava;

	public static boolean waveplay;

	public static final void startpriv(InetAddress ip) {
		threadliveid = (int) (Math.random() * 9.9999999E7D);

        if (active) {
            LockSupport.parkNanos(500L * 1_000_000L);
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
            }
            active = false;
        }

		socketreq = 0;
		threadreq = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = ip;

		Thread thread = new Thread(new SignLink());
		thread.setDaemon(true);
		thread.start();

		// Wait for the background thread to become active without busy-sleeping
		synchronized (SignLink.class) {
			while (!active) {
				try {
					SignLink.class.wait(50L);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
					break;
				}
			}
		}
	}

	@Override
	public final void run() {
		active = true;
		// Notify any waiters that we've become active
		synchronized (SignLink.class) {
			SignLink.class.notifyAll();
		}

		String cachedir = findcachedir();
		uid = getuid(cachedir);

		try {
			midiPlayer = new MidiPlayer();
		} catch (Exception ex) {
		}

		try {
			File dat = new File(cachedir + "main_file_cache.dat");
			if (dat.exists() && dat.length() > 52428800L) {
				dat.delete();
			}

			cache_dat = new RandomAccessFile(cachedir + "main_file_cache.dat", "rw");

			for (int i = 0; i < 5; i++) {
				cache_idx[i] = new RandomAccessFile(cachedir + "main_file_cache.idx" + i, "rw");
			}
			} catch (IOException e) {
				System.err.println("Failed to initialize cache files: " + e.getMessage());
			}

		int threadid = threadliveid;
		while (threadliveid == threadid) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (IOException ignore) {
					socket = null;
				}

				synchronized (SignLink.class) {
					socketreq = 0;
					SignLink.class.notifyAll();
				}
			} else if (threadreq != null) {
				Thread thread = new Thread(threadreq);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(threadreqpri);

				threadreq = null;
			} else if (dnsreq != null) {
					try {
						dns = InetAddress.getByName(dnsreq).getHostName();
					} catch (UnknownHostException ignore) {
						dns = "unknown";
					}

				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try (FileOutputStream out = new FileOutputStream(cachedir + savereq)) {
						out.write(savebuf, 0, savelen);
					} catch (IOException ignore) {
					}
				}

				if (waveplay) {
					wave = cachedir + savereq;
					waveplay = false;
				}

				if (midiplay) {
					midi = cachedir + savereq;
					midiplay = false;
				}

				savereq = null;
			} else if (urlreq != null) {
					try {
                        URL base = getAppletCodeBaseSafe();
                        URL resolved = null;
                        if (base != null) {
                            try {
                                resolved = base.toURI().resolve(urlreq).toURL();
                            } catch (URISyntaxException use) {
                                // fall through to null resolved
                            }
                        } else {
                            // Only use direct URL when absolute; avoid deprecated URL(URL, String)
                            try {
                                URI candidate = URI.create(urlreq);
                                if (candidate.isAbsolute()) {
                                    resolved = candidate.toURL();
                                }
                            } catch (IllegalArgumentException ignoreIAE) {
                                // leave resolved null
                            }
                        }
                        urlstream = (resolved != null) ? new DataInputStream(resolved.openStream()) : null;
                    } catch (IOException ignore) {
                        urlstream = null;
                    }

					synchronized (SignLink.class) {
						urlreq = null;
						SignLink.class.notifyAll();
					}
			}

			audioLoop();

			// Park for ~50ms instead of sleeping to avoid warnings
			LockSupport.parkNanos(50L * 1_000_000L);
		}
	}

	public static final String findcachedir() {
		String[] search = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		if (storeid < 32 || storeid > 34) {
			storeid = 32;
		}

		String target = ".file_store_" + storeid;
		for (String dir : search) {
			try {

				if (dir.length() > 0) {
					File f = new File(dir);
					if (!f.exists()) {
						continue;
					}
				}

				File full = new File(dir + target);
				if (full.exists() || full.mkdir()) {
					return dir + target + "/";
				}
			} catch (SecurityException ignore) {
			}
		}

		return null;
	}

	public static final int getuid(String cachedir) {
		try {
			File uidFile = new File(cachedir + "uid.dat");
			if (!uidFile.exists() || uidFile.length() < 4L) {
				try (DataOutputStream out = new DataOutputStream(new FileOutputStream(cachedir + "uid.dat"))) {
					out.writeInt((int) (Math.random() * 9.9999999E7D));
				}
			}
		} catch (IOException ignore) {
		}

		try (DataInputStream in = new DataInputStream(new FileInputStream(cachedir + "uid.dat"))) {
			int readUid = in.readInt();

			return readUid + 1;
		} catch (IOException ignore) {
			return 0;
		}
	}

	public static final synchronized Socket opensocket(int port) throws IOException {
		socketreq = port;

		while (socketreq != 0) {
			try {
				SignLink.class.wait(50L);
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				break;
			}
		}

		if (socket == null) {
			throw new IOException("could not open socket");
		}

		return socket;
	}

	public static final synchronized DataInputStream openurl(String url) throws IOException {
		urlreq = url;

		while (urlreq != null) {
			try {
				SignLink.class.wait(50L);
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				break;
			}
		}

		if (urlstream == null) {
			throw new IOException("could not open: " + url);
		}

		return urlstream;
	}

	public static final synchronized void dnslookup(String address) {
		if (address == null) {
			return;
		}

		dnsreq = address;

		while (dnsreq != null) {
			try {
				SignLink.class.wait(50L);
			} catch (InterruptedException ie) {
				Thread.currentThread().interrupt();
				break;
			}
		}
	}

	public static final synchronized boolean wavesave(byte[] buf, int len) {
		if (buf == null) {
			return false;
		}

		try {
			String safe = "sound" + (int) (Math.random() * 9.9999999E7D) + ".wav";
			if (wavevol < 64) {
				return false;
			}

			savelen = len;
			savebuf = buf;
			savereq = safe;
			waveplay = true;

			return true;
		} catch (Exception ignore) {
			return false;
		}
	}

	public static final synchronized boolean wavereplay() {
		if (wavevol < 64 || wave.equals("none")) {
			return false;
		}

		waveplay = true;
		return true;
	}

	public static final synchronized void midisave(byte[] buf, int len) {
		if (buf == null) {
			return;
		}

		try {
			String safe = "jingle" + (int) (Math.random() * 9.9999999E7D) + ".mid";
			if (midivol == 0) {
				return;
			}

			savelen = len;
			savebuf = buf;
			savereq = safe;
			midiplay = true;
		} catch (Exception ignore) {
		}
	}

	public static final void reporterror(String err) {
		if (!reporterror || err == null) {
			return;
		}

		try {
			String safe = err.replace(':', '_');
			safe = safe.replace('@', '_');
			safe = safe.replace('&', '_');
			safe = safe.replace('#', '_');

			try (DataInputStream stream = openurl("reporterror" + CLIENT_VERSION + ".cgi?error=" + errorname + " " + safe);
			     BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.ISO_8859_1))) {
				reader.readLine();
			}
		} catch (IOException ignore) {
		}
	}

	private MidiPlayer midiPlayer;
	public boolean midiFadingIn = false;
	public boolean midiFadingOut = false;
	public int midiFadeVol = 0;
	private final Position curPosition = Position.NORMAL;

	enum Position {
		LEFT, RIGHT, NORMAL
	}

	public void playMidi(String music) {
		if (midiFadingOut) {
			return;
		} else if (!midiFadingIn && midifade != 0 && midiPlayer.running()) {
			midiFadingOut = true;
			midiFadeVol = midivol;
			return;
		}

		try {
			if (midifade != 0 && midiFadingIn) {
				midiFadingOut = false;
				midiFadeVol = 0;
				midiPlayer.play(MidiSystem.getSequence(new File(music)), midifade, midiFadeVol);
			} else {
				midiPlayer.play(MidiSystem.getSequence(new File(music)), midifade, midivol);
			}
		} catch (javax.sound.midi.InvalidMidiDataException | java.io.IOException ignore) {
		}
	}

	// adapted from play_members.html's JS loop
	private void audioLoop() {
		if (midiFadingIn) {
			midiFadeVol += 8;
			if (midiFadeVol > midivol) {
				midiFadeVol = midivol;
			}
			midiPlayer.setVolume(0, midiFadeVol);
			if (midiFadeVol == midivol) {
				midiFadingIn = false;
			}
		} else if (midiFadingOut) {
			midiFadeVol -= 8;
			if (midiFadeVol < 0) {
				midiFadeVol = 0;
			}
			midiPlayer.setVolume(0, midiFadeVol);
			if (midiFadeVol == 0) {
				midiFadingOut = false;
				midiFadingIn = true;
			}
		}

		if (!midi.equals("none")) {
                switch (midi) {
                    case "stop" -> midiPlayer.stop();
                    case "voladjust" -> midiPlayer.setVolume(0, midivol);
                    default -> playMidi(midi);
                }

                if (!midiFadingOut) {
                    midi = "none";
                }
            }

		if (!wave.equals("none")) {
			try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(wave))) {
                    AudioFormat format = audioInputStream.getFormat();
                    DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

                    try (SourceDataLine auline = (SourceDataLine) AudioSystem.getLine(info)) {
                        auline.open(format);

                        if (auline.isControlSupported(FloatControl.Type.PAN)) {
                            FloatControl pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
                            if (curPosition == Position.RIGHT) {
                                pan.setValue(1.0f);
                            } else if (curPosition == Position.LEFT) {
                                pan.setValue(-1.0f);
                            }
                        }

                        auline.start();
                        int nBytesRead = 0;
                        int EXTERNAL_BUFFER_SIZE = 524288;
                        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

                        try {
                            while (nBytesRead != -1) {
                                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                                if (nBytesRead >= 0) {
                                    auline.write(abData, 0, nBytesRead);
                                }
                            }
                        } catch (IOException ignore) {
                        } finally {
                            auline.drain();
                        }
                    } catch (LineUnavailableException ignore) {
                        return;
                    }
                } catch (UnsupportedAudioFileException | IOException ignore) {
                    return;
                }

			wave = "none";
		}
	}

    private static URL getAppletCodeBaseSafe() {
        // Applet environment is not supported; no base URL
        return null;
    }
}
