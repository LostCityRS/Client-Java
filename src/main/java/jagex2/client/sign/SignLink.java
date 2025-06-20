package jagex2.client.sign;

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

public class SignLink implements Runnable {

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

	public static String midi = null;

	public static String wave = null;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final int clientversion = 244;

	public static int midifade;

	public static int midipos;

	public static int midivol;

	public static int savelen;

	public static int socketreq;

	public static int threadliveid;

	public static int uid;

	public static int wavepos;

	public static int wavevol;

	public static InetAddress socketip;

	public static boolean active;

	public static boolean midiplay;

	public static boolean sunjava;

	public static boolean waveplay;

	public static final void startpriv(InetAddress ip) {
		threadliveid = (int) (Math.random() * 9.9999999E7D);

		if (active) {
			try {
				Thread.sleep(500L);
			} catch (Exception ignore) {
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

		while (!active) {
			try {
				Thread.sleep(50L);
			} catch (Exception ignore) {
			}
		}
	}

	public final void run() {
		active = true;

		String cachedir = findcachedir();
		uid = getuid(cachedir);

		try {
			File dat = new File(cachedir + "main_file_cache.dat");
			if (dat.exists() && dat.length() > 52428800L) {
				dat.delete();
			}

			cache_dat = new RandomAccessFile(cachedir + "main_file_cache.dat", "rw");

			for (int i = 0; i < 5; i++) {
				cache_idx[i] = new RandomAccessFile(cachedir + "main_file_cache.idx" + i, "rw");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		int threadid = threadliveid;
		while (threadliveid == threadid) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (Exception ignore) {
					socket = null;
				}

				socketreq = 0;
			} else if (threadreq != null) {
				Thread thread = new Thread(threadreq);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(threadreqpri);

				threadreq = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (Exception ignore) {
					dns = "unknown";
				}

				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						FileOutputStream out = new FileOutputStream(cachedir + savereq);
						out.write(savebuf, 0, savelen);
						out.close();
					} catch (Exception ignore) {
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
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (Exception ignore) {
					urlstream = null;
				}

				urlreq = null;
			}

			try {
				Thread.sleep(50L);
			} catch (Exception ignore) {
			}
		}
	}

	public static final String findcachedir() {
		String[] search = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		if (storeid < 32 || storeid > 34) {
			storeid = 32;
		}

		String target = ".file_store_" + storeid;
		for (int i = 0; i < search.length; i++) {
			try {
				String dir = search[i];

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
			} catch (Exception ignore) {
			}
		}

		return null;
	}

	public static final int getuid(String cachedir) {
		try {
			File uid = new File(cachedir + "uid.dat");
			if (!uid.exists() || uid.length() < 4L) {
				DataOutputStream out = new DataOutputStream(new FileOutputStream(cachedir + "uid.dat"));
				out.writeInt((int) (Math.random() * 9.9999999E7D));
				out.close();
			}
		} catch (Exception ignore) {
		}

		try {
			DataInputStream in = new DataInputStream(new FileInputStream(cachedir + "uid.dat"));
			int uid = in.readInt();
			in.close();

			return uid + 1;
		} catch (Exception ignore) {
			return 0;
		}
	}

	public static final synchronized Socket opensocket(int port) throws IOException {
		socketreq = port;

		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch (Exception ignore) {
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
				Thread.sleep(50L);
			} catch (Exception ignore) {
			}
		}

		if (urlstream == null) {
			throw new IOException("could not open: " + url);
		}

		return urlstream;
	}

	public static final synchronized void dnslookup(String address) {
		dns = address;
		dnsreq = address;
	}

	public static final synchronized void startthread(Runnable thread, int priority) {
		threadreqpri = priority;
		threadreq = thread;
	}

	public static final synchronized boolean wavesave(byte[] buf, int len) {
		if (len > 2000000) {
			return false;
		}

		if (savereq != null) {
			return false;
		}

		wavepos = (wavepos + 1) % 5;
		savelen = len;
		savebuf = buf;
		waveplay = true;
		savereq = "sound" + wavepos + ".wav";
		return true;
	}

	public static final synchronized boolean wavereplay() {
		if (savereq != null) {
			return false;
		}

		savebuf = null;
		waveplay = true;
		savereq = "sound" + wavepos + ".wav";
		return true;
	}

	public static final synchronized void midisave(byte[] buf, int len) {
		if (len > 2000000 || savereq != null) {
			return;
		}

		midipos = (midipos + 1) % 5;
		savelen = len;
		savebuf = buf;
		midiplay = true;
		savereq = "jingle" + midipos + ".mid";
	}

	public static final void reporterror(String err) {
		if (!reporterror || !active) {
			return;
		}

		System.out.println("Error: " + err);

		try {
			String safe = err.replace(':', '_');
			safe = safe.replace('@', '_');
			safe = safe.replace('&', '_');
			safe = safe.replace('#', '_');

			DataInputStream stream = openurl("reporterror" + 244 + ".cgi?error=" + errorname + " " + safe);
			stream.readLine();
			stream.close();
		} catch (IOException ignore) {
		}
	}
}
