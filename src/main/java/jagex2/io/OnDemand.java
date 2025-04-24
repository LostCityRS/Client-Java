package jagex2.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import deob.ObfuscatedName;
import jagex2.client.client;
import jagex2.client.sign.signlink;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;

@ObfuscatedName("vb")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("vb.g")
	public int[][] versions = new int[4][];

	@ObfuscatedName("vb.h")
	public int[][] checksums = new int[4][];

	@ObfuscatedName("vb.i")
	public byte[][] priorities = new byte[4][];

	@ObfuscatedName("vb.j")
	public int topPriority;

	@ObfuscatedName("vb.k")
	public byte[] models;

	@ObfuscatedName("vb.l")
	public int[] mapIndex;

	@ObfuscatedName("vb.m")
	public int[] mapLand;

	@ObfuscatedName("vb.n")
	public int[] mapLoc;

	@ObfuscatedName("vb.o")
	public int[] mapMembers;

	@ObfuscatedName("vb.p")
	public int[] animIndex;

	@ObfuscatedName("vb.q")
	public int[] midiIndex;

	@ObfuscatedName("vb.r")
	public boolean running = true;

	@ObfuscatedName("vb.s")
	public client app;

	@ObfuscatedName("vb.t")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("vb.u")
	public boolean active = false;

	@ObfuscatedName("vb.v")
	public int importantCount;

	@ObfuscatedName("vb.w")
	public int requestCount;

	@ObfuscatedName("vb.x")
	public DoublyLinkList requests = new DoublyLinkList();

	@ObfuscatedName("vb.y")
	public LinkList queue = new LinkList();

	@ObfuscatedName("vb.z")
	public LinkList missing = new LinkList();

	@ObfuscatedName("vb.A")
	public LinkList pending = new LinkList();

	@ObfuscatedName("vb.B")
	public LinkList completed = new LinkList();

	@ObfuscatedName("vb.C")
	public LinkList prefetches = new LinkList();

	@ObfuscatedName("vb.D")
	public String message = "";

	@ObfuscatedName("vb.M")
	public byte[] buf = new byte[500];

	@ObfuscatedName("vb.N")
	public byte[] data = new byte[65000];

	@ObfuscatedName("vb.E")
	public int loadedPrefetchFiles;

	@ObfuscatedName("vb.F")
	public int totalPrefetchFiles;

	@ObfuscatedName("vb.K")
	public int partOffset;

	@ObfuscatedName("vb.L")
	public int partAvailable;

	@ObfuscatedName("vb.O")
	public int waitCycles;

	@ObfuscatedName("vb.P")
	public int heartbeatCycle;

	@ObfuscatedName("vb.R")
	public int cycle;

	@ObfuscatedName("vb.Q")
	public long socketOpenTime;

	@ObfuscatedName("vb.J")
	public OnDemandRequest current;

	@ObfuscatedName("vb.H")
	public InputStream in;

	@ObfuscatedName("vb.I")
	public OutputStream out;

	@ObfuscatedName("vb.G")
	public Socket socket;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void unpack(Jagfile arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var26 = arg0.read(var3[var4], null);
			int var27 = var26.length / 2;
			Packet var28 = new Packet(var26);
			this.versions[var4] = new int[var27];
			this.priorities[var4] = new byte[var27];
			for (int var29 = 0; var29 < var27; var29++) {
				this.versions[var4][var29] = var28.g2();
			}
		}
		String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var6 = 0; var6 < 4; var6++) {
			byte[] var22 = arg0.read(var5[var6], null);
			int var23 = var22.length / 4;
			Packet var24 = new Packet(var22);
			this.checksums[var6] = new int[var23];
			for (int var25 = 0; var25 < var23; var25++) {
				this.checksums[var6][var25] = var24.g4();
			}
		}
		byte[] var7 = arg0.read("model_index", null);
		int var8 = this.versions[0].length;
		this.models = new byte[var8];
		for (int var9 = 0; var9 < var8; var9++) {
			if (var9 < var7.length) {
				this.models[var9] = var7[var9];
			} else {
				this.models[var9] = 0;
			}
		}
		byte[] var10 = arg0.read("map_index", null);
		Packet var11 = new Packet(var10);
		int var12 = var10.length / 7;
		this.mapIndex = new int[var12];
		this.mapLand = new int[var12];
		this.mapLoc = new int[var12];
		this.mapMembers = new int[var12];
		for (int var13 = 0; var13 < var12; var13++) {
			this.mapIndex[var13] = var11.g2();
			this.mapLand[var13] = var11.g2();
			this.mapLoc[var13] = var11.g2();
			this.mapMembers[var13] = var11.g1();
		}
		byte[] var14 = arg0.read("anim_index", null);
		Packet var15 = new Packet(var14);
		int var16 = var14.length / 2;
		this.animIndex = new int[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			this.animIndex[var17] = var15.g2();
		}
		byte[] var18 = arg0.read("midi_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length;
		this.midiIndex = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.midiIndex[var21] = var19.g1();
		}
		this.app = arg1;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void stop() {
		this.running = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int getFileCount(int arg0) {
		return this.versions[arg0].length;
	}

	@ObfuscatedName("vb.a(B)I")
	public final int getAnimCount() {
		return this.animIndex.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int getMapFile(int arg0, int arg1, int arg2) {
		int var5 = (arg1 << 8) + arg0;
		for (int var6 = 0; var6 < this.mapIndex.length; var6++) {
			if (this.mapIndex[var6] == var5) {
				if (arg2 == 0) {
					return this.mapLand[var6];
				}
				return this.mapLoc[var6];
			}
		}
		return -1;
	}

	@ObfuscatedName("vb.a(ZI)V")
	public final void prefetchMaps(boolean arg0) {
		int var3 = this.mapIndex.length;
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg0 || this.mapMembers[var4] != 0) {
				this.prefetch(3, this.mapLoc[var4], (byte) 2);
				this.prefetch(3, this.mapLand[var4], (byte) 2);
			}
		}
	}

	@ObfuscatedName("vb.b(II)Z")
	public final boolean hasMapLocFile(int arg0) {
		for (int var3 = 0; var3 < this.mapIndex.length; var3++) {
			if (this.mapLoc[var3] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("vb.c(II)I")
	public final int getModelFlags(int arg1) {
		return this.models[arg1] & 0xFF;
	}

	@ObfuscatedName("vb.d(II)Z")
	public final boolean shouldPrefetchMidi(int arg0) {
		return this.midiIndex[arg0] == 1;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void requestModel(int arg0) {
		this.request(0, arg0);
	}

	@ObfuscatedName("vb.e(II)V")
	public final void request(int arg0, int arg1) {
		if (arg0 < 0 || arg0 > this.versions.length || arg1 < 0 || arg1 > this.versions[arg0].length || this.versions[arg0][arg1] == 0) {
			return;
		}
		DoublyLinkList var3 = this.requests;
		synchronized (this.requests) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.requests.head(); var4 != null; var4 = (OnDemandRequest) this.requests.next()) {
				if (var4.archive == arg0 && var4.file == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.archive = arg0;
			var5.file = arg1;
			var5.urgent = true;
			LinkList var6 = this.queue;
			synchronized (this.queue) {
				this.queue.addTail(var5);
			}
			this.requests.addTail(var5);
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int remaining() {
		DoublyLinkList var1 = this.requests;
		synchronized (this.requests) {
			return this.requests.size();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final OnDemandRequest cycle() {
		LinkList var1 = this.completed;
		OnDemandRequest var2;
		synchronized (this.completed) {
			var2 = (OnDemandRequest) this.completed.removeHead();
		}
		if (var2 == null) {
			return null;
		}
		DoublyLinkList var3 = this.requests;
		synchronized (this.requests) {
			var2.unlink2();
		}
		if (var2.data == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
			while (true) {
				if (this.data.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.data, var4, this.data.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.data = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.data[var7] = this.data[var7];
		}
		return var2;
	}

	@ObfuscatedName("vb.a(IZIB)V")
	public final void prefetch(int arg0, int arg2, byte arg3) {
		if (this.app.fileStreams[0] == null || this.versions[arg0][arg2] == 0) {
			return;
		}
		byte[] var5 = this.app.fileStreams[arg0 + 1].read(arg2);
		if (this.validate(var5, this.checksums[arg0][arg2], this.versions[arg0][arg2])) {
			return;
		}
		this.priorities[arg0][arg2] = arg3;
		if (arg3 > this.topPriority) {
			this.topPriority = arg3;
		}
		this.totalPrefetchFiles++;
	}

	@ObfuscatedName("vb.b(I)V")
	public final void clearPrefetches() {
		LinkList var2 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.clear();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void prefetch(int arg0, int arg1) {
		if (this.app.fileStreams[0] == null || this.versions[arg0][arg1] == 0 || this.priorities[arg0][arg1] == 0 || this.topPriority == 0) {
			return;
		}
		OnDemandRequest var4 = new OnDemandRequest();
		var4.archive = arg0;
		var4.file = arg1;
		var4.urgent = false;
		LinkList var5 = this.prefetches;
		synchronized (this.prefetches) {
			this.prefetches.addTail(var4);
		}
	}

	public final void run() {
		try {
			while (this.running) {
				this.cycle++;
				byte var1 = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.active = true;
				for (int var2 = 0; var2 < 100 && this.active; var2++) {
					this.active = false;
					this.handleQueue();
					this.handlePending();
					if (this.importantCount == 0 && var2 >= 5) {
						break;
					}
					this.handleExtras();
					if (this.in != null) {
						this.read();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next()) {
					if (var4.urgent) {
						var3 = true;
						var4.cycle++;
						if (var4.cycle > 50) {
							var4.cycle = 0;
							this.send(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.pending.head(); var5 != null; var5 = (OnDemandRequest) this.pending.next()) {
						var3 = true;
						var5.cycle++;
						if (var5.cycle > 50) {
							var5.cycle = 0;
							this.send(var5);
						}
					}
				}
				if (var3) {
					this.waitCycles++;
					if (this.waitCycles > 750) {
						try {
							this.socket.close();
						} catch (Exception var8) {
						}
						this.socket = null;
						this.in = null;
						this.out = null;
						this.partAvailable = 0;
					}
				} else {
					this.waitCycles = 0;
					this.message = "";
				}
				if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
					this.heartbeatCycle++;
					if (this.heartbeatCycle > 500) {
						this.heartbeatCycle = 0;
						this.buf[0] = 0;
						this.buf[1] = 0;
						this.buf[2] = 0;
						this.buf[3] = 10;
						try {
							this.out.write(this.buf, 0, 4);
						} catch (IOException var7) {
							this.waitCycles = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.b(B)V")
	public final void handleQueue() {
		LinkList var2 = this.queue;
		OnDemandRequest var3;
		synchronized (this.queue) {
			var3 = (OnDemandRequest) this.queue.removeHead();
		}
		while (var3 != null) {
			this.active = true;
			byte[] var4 = null;
			if (this.app.fileStreams[0] != null) {
				var4 = this.app.fileStreams[var3.archive + 1].read(var3.file);
			}
			if (!this.validate(var4, this.checksums[var3.archive][var3.file], this.versions[var3.archive][var3.file])) {
				var4 = null;
			}
			LinkList var5 = this.queue;
			synchronized (this.queue) {
				if (var4 == null) {
					this.missing.addTail(var3);
				} else {
					var3.data = var4;
					LinkList var6 = this.completed;
					synchronized (this.completed) {
						this.completed.addTail(var3);
					}
				}
				var3 = (OnDemandRequest) this.queue.removeHead();
			}
		}
	}

	@ObfuscatedName("vb.c(B)V")
	public final void handlePending() {
		this.importantCount = 0;
		this.requestCount = 0;
		for (OnDemandRequest var2 = (OnDemandRequest) this.pending.head(); var2 != null; var2 = (OnDemandRequest) this.pending.next()) {
			if (var2.urgent) {
				this.importantCount++;
			} else {
				this.requestCount++;
			}
		}
		while (this.importantCount < 10) {
			OnDemandRequest var3 = (OnDemandRequest) this.missing.removeHead();
			if (var3 == null) {
				break;
			}
			if (this.priorities[var3.archive][var3.file] != 0) {
				this.loadedPrefetchFiles++;
			}
			this.priorities[var3.archive][var3.file] = 0;
			this.pending.addTail(var3);
			this.importantCount++;
			this.send(var3);
			this.active = true;
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void handleExtras() {
		while (this.importantCount == 0) {
			if (this.requestCount >= 10 || this.topPriority == 0) {
				return;
			}
			LinkList var2 = this.prefetches;
			OnDemandRequest var3;
			synchronized (this.prefetches) {
				var3 = (OnDemandRequest) this.prefetches.removeHead();
			}
			while (var3 != null) {
				if (this.priorities[var3.archive][var3.file] != 0) {
					this.priorities[var3.archive][var3.file] = 0;
					this.pending.addTail(var3);
					this.send(var3);
					this.active = true;
					if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
						this.loadedPrefetchFiles++;
					}
					this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
					this.requestCount++;
					if (this.requestCount == 10) {
						return;
					}
				}
				LinkList var4 = this.prefetches;
				synchronized (this.prefetches) {
					var3 = (OnDemandRequest) this.prefetches.removeHead();
				}
			}
			for (int var5 = 0; var5 < 4; var5++) {
				byte[] var6 = this.priorities[var5];
				int var7 = var6.length;
				for (int var8 = 0; var8 < var7; var8++) {
					if (var6[var8] == this.topPriority) {
						var6[var8] = 0;
						OnDemandRequest var9 = new OnDemandRequest();
						var9.archive = var5;
						var9.file = var8;
						var9.urgent = false;
						this.pending.addTail(var9);
						this.send(var9);
						this.active = true;
						if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
							this.loadedPrefetchFiles++;
						}
						this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
						this.requestCount++;
						if (this.requestCount == 10) {
							return;
						}
					}
				}
			}
			this.topPriority--;
		}
	}

	@ObfuscatedName("vb.d(B)V")
	public final void read() {
		try {
			int var2 = this.in.available();
			if (this.partAvailable == 0 && var2 >= 6) {
				this.active = true;
				for (int var3 = 0; var3 < 6; var3 += this.in.read(this.buf, var3, 6 - var3)) {
				}
				int var4 = this.buf[0] & 0xFF;
				int var5 = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
				int var6 = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
				int var7 = this.buf[5] & 0xFF;
				this.current = null;
				for (OnDemandRequest var8 = (OnDemandRequest) this.pending.head(); var8 != null; var8 = (OnDemandRequest) this.pending.next()) {
					if (var8.archive == var4 && var8.file == var5) {
						this.current = var8;
					}
					if (this.current != null) {
						var8.cycle = 0;
					}
				}
				if (this.current != null) {
					this.waitCycles = 0;
					if (var6 == 0) {
						signlink.reporterror("Rej: " + var4 + "," + var5);
						this.current.data = null;
						if (this.current.urgent) {
							LinkList var9 = this.completed;
							synchronized (this.completed) {
								this.completed.addTail(this.current);
							}
						} else {
							this.current.unlink();
						}
						this.current = null;
					} else {
						if (this.current.data == null && var7 == 0) {
							this.current.data = new byte[var6];
						}
						if (this.current.data == null && var7 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.partOffset = var7 * 500;
				this.partAvailable = 500;
				if (this.partAvailable > var6 - var7 * 500) {
					this.partAvailable = var6 - var7 * 500;
				}
			}
			if (this.partAvailable > 0 && var2 >= this.partAvailable) {
				this.active = true;
				byte[] var10 = this.buf;
				int var11 = 0;
				if (this.current != null) {
					var10 = this.current.data;
					var11 = this.partOffset;
				}
				for (int var12 = 0; var12 < this.partAvailable; var12 += this.in.read(var10, var11 + var12, this.partAvailable - var12)) {
				}
				if (this.partAvailable + this.partOffset >= var10.length && this.current != null) {
					if (this.app.fileStreams[0] != null) {
						this.app.fileStreams[this.current.archive + 1].write(var10, this.current.file, var10.length);
					}
					if (!this.current.urgent && this.current.archive == 3) {
						this.current.urgent = true;
						this.current.archive = 93;
					}
					if (this.current.urgent) {
						LinkList var13 = this.completed;
						synchronized (this.completed) {
							this.completed.addTail(this.current);
						}
					} else {
						this.current.unlink();
					}
				}
				this.partAvailable = 0;
			}
		} catch (IOException var18) {
			try {
				this.socket.close();
			} catch (Exception var15) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}

	@ObfuscatedName("vb.a([BIII)Z")
	public final boolean validate(byte[] arg0, int arg1, int arg3) {
		if (arg0 == null || arg0.length < 2) {
			return false;
		}
		int var5 = arg0.length - 2;
		int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
		this.crc32.reset();
		this.crc32.update(arg0, 0, var5);
		int var7 = (int) this.crc32.getValue();
		if (arg3 == var6) {
			return arg1 == var7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("vb.a(Lnb;Z)V")
	public final void send(OnDemandRequest arg0) {
		try {
			if (this.socket == null) {
				long var3 = System.currentTimeMillis();
				if (var3 - this.socketOpenTime < 5000L) {
					return;
				}
				this.socketOpenTime = var3;
				this.socket = this.app.openSocket(client.portOffset + 43594);
				this.in = this.socket.getInputStream();
				this.out = this.socket.getOutputStream();
				this.out.write(15);
				for (int var5 = 0; var5 < 8; var5++) {
					this.in.read();
				}
				this.waitCycles = 0;
			}
			this.buf[0] = (byte) arg0.archive;
			this.buf[1] = (byte) (arg0.file >> 8);
			this.buf[2] = (byte) arg0.file;
			if (arg0.urgent) {
				this.buf[3] = 2;
			} else if (this.app.ingame) {
				this.buf[3] = 0;
			} else {
				this.buf[3] = 1;
			}
			this.out.write(this.buf, 0, 4);
			this.heartbeatCycle = 0;
		} catch (IOException var8) {
			try {
				this.socket.close();
			} catch (Exception var7) {
			}
			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}
}
