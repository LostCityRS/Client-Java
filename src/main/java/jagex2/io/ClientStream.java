package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class ClientStream implements Runnable {

	@ObfuscatedName("e.b")
	public final InputStream in;

	@ObfuscatedName("e.c")
	public final OutputStream out;

	@ObfuscatedName("e.d")
	public final Socket socket;

	@ObfuscatedName("e.e")
	public boolean dummy = false;

	@ObfuscatedName("e.j")
	public boolean writer = false;

	@ObfuscatedName("e.i")
	public int tnum;

	@ObfuscatedName("e.k")
	public boolean ioerror = false;

	@ObfuscatedName("e.a")
	public final boolean field131 = false;

	@ObfuscatedName("e.f")
	public final GameShell shell;

	@ObfuscatedName("e.g")
	public byte[] data;

	@ObfuscatedName("e.h")
	public int tcycl;

	public ClientStream(Socket arg0, int arg1, GameShell arg2) throws IOException {
		shell = arg2;
		socket = arg0;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		in = socket.getInputStream();
		out = socket.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void close() {
		dummy = true;
		try {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		writer = false;
		synchronized (this) {
			notify();
		}
		data = null;
	}

	@ObfuscatedName("e.b()I")
	public int read() throws IOException {
		return dummy ? 0 : in.read();
	}

	@ObfuscatedName("e.a([BII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = in.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.c()I")
	public int available() throws IOException {
		return dummy ? 0 : in.available();
	}

	@ObfuscatedName("e.a(I[BII)V")
	public void write(byte[] arg0, int arg1) throws IOException {
		if (dummy) {
			return;
		}
		if (ioerror) {
			ioerror = false;
			throw new IOException("Error in writer thread");
		}
		if (data == null) {
			data = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg1; var4++) {
				data[tnum] = arg0[var4];
				tnum = (tnum + 1) % 5000;
				if (tnum == (tcycl + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!writer) {
				writer = true;
				shell.startThread(this, 3);
			}
			notify();
		}
	}

	@Override
	public void run() {
		while (writer) {
			int var2;
			int var3;
			synchronized (this) {
				if (tnum == tcycl) {
					try {
						wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!writer) {
					return;
				}
				var2 = tcycl;
				if (tnum >= tcycl) {
					var3 = tnum - tcycl;
				} else {
					var3 = 5000 - tcycl;
				}
			}
			if (var3 > 0) {
				try {
					out.write(data, var2, var3);
				} catch (IOException var5) {
					ioerror = true;
				}
				tcycl = (tcycl + var3) % 5000;
				try {
					if (tnum == tcycl) {
						out.flush();
					}
				} catch (IOException var4) {
					ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void debug() {
		System.out.println("dummy:" + dummy);
		System.out.println("tcycl:" + tcycl);
		System.out.println("tnum:" + tnum);
		System.out.println("writer:" + writer);
		System.out.println("ioerror:" + ioerror);
		try {
			System.out.println("available:" + available());
		} catch (IOException var1) {
		}
	}
}
