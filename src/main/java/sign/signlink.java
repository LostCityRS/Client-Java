package sign;

import javax.sound.midi.MidiSystem;
import javax.sound.sampled.*;
import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class signlink implements Runnable {

	public static int storeid = 32;

	public static RandomAccessFile cache_dat = null;

	public static RandomAccessFile[] cache_idx = new RandomAccessFile[5];

	public static Applet mainapp = null;

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

	public static final int clientversion = 377;

	public static int midifade;

	public static int midipos;

	public static int midivol = 96;

	public static int savelen;

	public static int socketreq;

	public static int threadliveid;

	public static int uid;

	public static int wavepos;

	public static int wavevol = 50;

	public static InetAddress socketip;

	public static boolean active;

	public static boolean midiplay;

	public static boolean sunjava;

	public static boolean waveplay;

	public static void startpriv(InetAddress arg0) {
		threadliveid = (int) (Math.random() * 9.9999999E7D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch (Exception var3) {
			}
			active = false;
		}
		socketreq = 0;
		threadreq = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = arg0;
		Thread var1 = new Thread(new signlink());
		var1.setDaemon(true);
		var1.start();
		while (!active) {
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public void run() {
		active = true;
		String var1 = findcachedir();
		uid = getuid(var1);
		try {
			midiPlayer = new MidiPlayer();
		} catch (Exception ex) {
		}
		try {
			File var2 = new File(var1 + "main_file_cache.dat");
			if (var2.exists() && var2.length() > 52428800L) {
				var2.delete();
			}
			cache_dat = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");
			for (int var3 = 0; var3 < 5; var3++) {
				cache_idx[var3] = new RandomAccessFile(var1 + "main_file_cache.idx" + var3, "rw");
			}
		} catch (Exception var13) {
			var13.printStackTrace();
		}
		int var5 = threadliveid;
		while (threadliveid == var5) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (Exception var8) {
					socket = null;
				}
				socketreq = 0;
			} else if (threadreq != null) {
				Thread var6 = new Thread(threadreq);
				var6.setDaemon(true);
				var6.start();
				var6.setPriority(threadreqpri);
				threadreq = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (Exception var12) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						FileOutputStream var7 = new FileOutputStream(var1 + savereq);
						var7.write(savebuf, 0, savelen);
						var7.close();
					} catch (Exception var11) {
					}
				}
				if (waveplay) {
					wave = var1 + savereq;
					waveplay = false;
				}
				if (midiplay) {
					midi = var1 + savereq;
					midiplay = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (Exception var10) {
					urlstream = null;
				}
				urlreq = null;
			}
			audioLoop();
			try {
				Thread.sleep(50L);
			} catch (Exception var9) {
			}
		}
	}

	public static String findcachedir() {
		String[] var0 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache" };
		if (storeid < 32 || storeid > 34) {
			storeid = 32;
		}
		String var1 = ".file_store_" + storeid;
		for (int var2 = 0; var2 < var0.length; var2++) {
			try {
				String var3 = var0[var2];
				if (var3.length() > 0) {
					File var4 = new File(var3);
					if (!var4.exists()) {
						continue;
					}
				}
				File var5 = new File(var3 + var1);
				if (var5.exists() || var5.mkdir()) {
					return var3 + var1 + "/";
				}
			} catch (Exception var6) {
			}
		}
		return null;
	}

	public static int getuid(String arg0) {
		try {
			File var1 = new File(arg0 + "uid.dat");
			if (!var1.exists() || var1.length() < 4L) {
				DataOutputStream var2 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
				var2.writeInt((int) (Math.random() * 9.9999999E7D));
				var2.close();
			}
		} catch (Exception var6) {
		}
		try {
			DataInputStream var3 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
			int var4 = var3.readInt();
			var3.close();
			return var4 + 1;
		} catch (Exception var5) {
			return 0;
		}
	}

	public static synchronized Socket opensocket(int arg0) throws IOException {
		socketreq = arg0;
		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		if (socket == null) {
			throw new IOException("could not open socket");
		}
		return socket;
	}

	public static synchronized DataInputStream openurl(String arg0) throws IOException {
		urlreq = arg0;
		while (urlreq != null) {
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		if (urlstream == null) {
			throw new IOException("could not open: " + arg0);
		}
		return urlstream;
	}

	public static synchronized void dnslookup(String arg0) {
		dns = arg0;
		dnsreq = arg0;
	}

	public static synchronized void startthread(Runnable arg0, int arg1) {
		threadreqpri = arg1;
		threadreq = arg0;
	}

	public static synchronized boolean wavesave(byte[] arg0, int arg1) {
		if (arg1 > 2000000) {
			return false;
		} else if (savereq == null) {
			wavepos = (wavepos + 1) % 5;
			savelen = arg1;
			savebuf = arg0;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		} else {
			return false;
		}
	}

	public static synchronized boolean wavereplay() {
		if (savereq == null) {
			savebuf = null;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		} else {
			return false;
		}
	}

	public static synchronized void midisave(byte[] arg0, int arg1) {
		if (arg1 > 2000000 || savereq != null) {
			return;
		}
		midipos = (midipos + 1) % 5;
		savelen = arg1;
		savebuf = arg0;
		midiplay = true;
		savereq = "jingle" + midipos + ".mid";
	}

	public static void reporterror(String arg0) {
		if (!reporterror || !active) {
			return;
		}
		System.out.println("Error: " + arg0);
		try {
			String var1 = arg0.replace(':', '_');
			String var2 = var1.replace('@', '_');
			String var3 = var2.replace('&', '_');
			String var4 = var3.replace('#', '_');
			DataInputStream var5 = openurl("reporterror" + 377 + ".cgi?error=" + errorname + " " + var4);
			var5.readLine();
			var5.close();
		} catch (IOException var6) {
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
		} catch (Exception ignore) {
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
			if (midi.equals("stop")) {
				midiPlayer.stop();
			} else if (midi.equals("voladjust")) {
				midiPlayer.setVolume(0, midivol);
			} else {
				playMidi(midi);
			}

			if (!midiFadingOut) {
				midi = "none";
			}
		}

		if (!wave.equals("none")) {
			AudioInputStream audioInputStream;

			try {
				audioInputStream = AudioSystem.getAudioInputStream(new File(wave));
			} catch (Exception ignore) {
				return;
			}

			AudioFormat format = audioInputStream.getFormat();
			SourceDataLine auline;
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

			try {
				auline = (SourceDataLine) AudioSystem.getLine(info);
				auline.open(format);
			} catch (Exception ignore) {
				return;
			}

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
				auline.close();
			}

			wave = "none";
		}
	}
}
