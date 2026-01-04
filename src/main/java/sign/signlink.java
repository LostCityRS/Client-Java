package sign;

import jagex2.io.*;

import java.applet.Applet;
import java.io.*;
import java.net.Socket;
import java.net.URL;

public class signlink implements Runnable {

	public static int storeid = 32;

	public static WebClientStream socket = null;

	public static int threadreqpri = 1;

	public static Runnable threadreq = null;

	public static String dnsreq = null;

	public static String dns = null;

	public static String urlreq = null;

	public static FileDownloadStream urlstream = null;

	public static String savereq = null;

	public static byte[] savebuf = null;

	public static String midi = null;

	public static String wave = null;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final int clientversion = 254;

	public static int midifade;

	public static int midipos;

	public static int midivol;

	public static int savelen;

	public static int socketreq;

	public static int threadliveid;

	public static int uid;

	public static int wavepos;

	public static int wavevol;

	public static String socketip;

	public static boolean active;

	public static boolean midiplay;

	public static boolean sunjava;

	public static boolean waveplay;

	public static void startpriv(String arg0) {
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
		// todo: init indexeddb

		active = true;
		uid = 0; // todo: uid

		int var5 = threadliveid;
		while (threadliveid == var5) {
			// todo: audio loop

			if (socketreq != 0) {
				try {
					socket = new WebClientStream(socketip, socketreq);
					socket.connect();
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
					dns = dnsreq;
				} catch (Exception var12) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					// todo: save file
				}
				if (waveplay) {
					wave = savereq;
					waveplay = false;
				}
				if (midiplay) {
					midi = savereq;
					midiplay = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new FileDownloadStream(urlreq);
				} catch (Exception var10) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var9) {
			}
		}
	}

	public static synchronized WebClientStream opensocket(int arg0) throws IOException {
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

	public static synchronized FileDownloadStream openurl(String arg0) throws IOException {
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
			openurl("reporterror" + clientversion + ".cgi?error=" + errorname + " " + var4);
		} catch (IOException var6) {
		}
	}
}
