package jagex2.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.client.sign.SignLink;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;

@ObfuscatedName("vb")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("vb.g")
	public int[][] versions = new int[4][];

	@ObfuscatedName("vb.h")
	public int[][] crcs = new int[4][];

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
	public Client app;

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
	public final void unpack(Jagfile versionlist, Client c) {
		String[] version = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int i = 0; i < 4; i++) {
			byte[] data = versionlist.read(version[i], null);
			int count = data.length / 2;
			Packet buf = new Packet(data);

			this.versions[i] = new int[count];
			this.priorities[i] = new byte[count];

			for (int j = 0; j < count; j++) {
				this.versions[i][j] = buf.g2();
			}
		}

		String[] crc = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int i = 0; i < 4; i++) {
			byte[] data = versionlist.read(crc[i], null);
			int count = data.length / 4;
			Packet buf = new Packet(data);

			this.crcs[i] = new int[count];

			for (int j = 0; j < count; j++) {
				this.crcs[i][j] = buf.g4();
			}
		}

		byte[] data = versionlist.read("model_index", null);
		int count = this.versions[0].length;

		this.models = new byte[count];

		for (int i = 0; i < count; i++) {
			if (i < data.length) {
				this.models[i] = data[i];
			} else {
				this.models[i] = 0;
			}
		}

		data = versionlist.read("map_index", null);
		Packet buf = new Packet(data);
		count = data.length / 7;

		this.mapIndex = new int[count];
		this.mapLand = new int[count];
		this.mapLoc = new int[count];
		this.mapMembers = new int[count];

		for (int i = 0; i < count; i++) {
			this.mapIndex[i] = buf.g2();
			this.mapLand[i] = buf.g2();
			this.mapLoc[i] = buf.g2();
			this.mapMembers[i] = buf.g1();
		}

		data = versionlist.read("anim_index", null);
		buf = new Packet(data);
		count = data.length / 2;

		this.animIndex = new int[count];

		for (int i = 0; i < count; i++) {
			this.animIndex[i] = buf.g2();
		}

		data = versionlist.read("midi_index", null);
		buf = new Packet(data);
		count = data.length;

		this.midiIndex = new int[count];

		for (int i = 0; i < count; i++) {
			this.midiIndex[i] = buf.g1();
		}

		this.app = c;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void stop() {
		this.running = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int getFileCount(int archive) {
		return this.versions[archive].length;
	}

	@ObfuscatedName("vb.a(B)I")
	public final int getAnimCount() {
		return this.animIndex.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int getMapFile(int z, int x, int type) {
		int map = (x << 8) + z;

		for (int i = 0; i < this.mapIndex.length; i++) {
			if (this.mapIndex[i] == map) {
				if (type == 0) {
					return this.mapLand[i];
				} else {
					return this.mapLoc[i];
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(ZI)V")
	public final void prefetchMaps(boolean members) {
		int count = this.mapIndex.length;
		for (int i = 0; i < count; i++) {
			if (members || this.mapMembers[i] != 0) {
				this.prefetchPriority(3, this.mapLoc[i], (byte) 2);
				this.prefetchPriority(3, this.mapLand[i], (byte) 2);
			}
		}
	}

	@ObfuscatedName("vb.b(II)Z")
	public final boolean hasMapLocFile(int file) {
		for (int i = 0; i < this.mapIndex.length; i++) {
			if (this.mapLoc[i] == file) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.c(II)I")
	public final int getModelFlags(int id) {
		return this.models[id] & 0xFF;
	}

	@ObfuscatedName("vb.d(II)Z")
	public final boolean shouldPrefetchMidi(int id) {
		return this.midiIndex[id] == 1;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void requestModel(int id) {
		this.request(0, id);
	}

	@ObfuscatedName("vb.e(II)V")
	public final void request(int archive, int file) {
		if (archive < 0 || archive > this.versions.length || file < 0 || file > this.versions[archive].length || this.versions[archive][file] == 0) {
			return;
		}

		DoublyLinkList lock = this.requests;
		synchronized (lock) {
			for (OnDemandRequest req = (OnDemandRequest) this.requests.head(); req != null; req = (OnDemandRequest) this.requests.next()) {
				if (req.archive == archive && req.file == file) {
					return;
				}
			}

			OnDemandRequest req = new OnDemandRequest();
			req.archive = archive;
			req.file = file;
			req.urgent = true;

			LinkList lock2 = this.queue;
			synchronized (lock2) {
				this.queue.push(req);
			}

			this.requests.push(req);
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int remaining() {
		DoublyLinkList lock = this.requests;
		synchronized (lock) {
			return this.requests.size();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final OnDemandRequest cycle() {
		LinkList lock = this.completed;

		OnDemandRequest req;
		synchronized (lock) {
			req = (OnDemandRequest) this.completed.pop();
		}

		if (req == null) {
			return null;
		}

		DoublyLinkList lock2 = this.requests;
		synchronized (lock2) {
			req.unlink2();
		}

		if (req.data == null) {
			return req;
		}

		int pos = 0;
		try {
			GZIPInputStream gzip = new GZIPInputStream(new ByteArrayInputStream(req.data));
			while (true) {
				if (this.data.length == pos) {
					throw new RuntimeException("buffer overflow!");
				}

				int n = gzip.read(this.data, pos, this.data.length - pos);
				if (n == -1) {
					break;
				}

				pos += n;
			}
		} catch (IOException ignore) {
			throw new RuntimeException("error unzipping");
		}

		req.data = new byte[pos];
		for (int i = 0; i < pos; i++) {
			req.data[i] = this.data[i];
		}
		return req;
	}

	@ObfuscatedName("vb.a(IZIB)V")
	public final void prefetchPriority(int archive, int file, byte priority) {
		if (this.app.fileStreams[0] == null || this.versions[archive][file] == 0) {
			return;
		}

		byte[] data = this.app.fileStreams[archive + 1].read(file);
		if (this.validate(data, this.crcs[archive][file], this.versions[archive][file])) {
			return;
		}

		this.priorities[archive][file] = priority;
		if (priority > this.topPriority) {
			this.topPriority = priority;
		}

		this.totalPrefetchFiles++;
	}

	@ObfuscatedName("vb.b(I)V")
	public final void clearPrefetches() {
		LinkList lock = this.prefetches;
		synchronized (lock) {
			this.prefetches.clear();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void prefetch(int archive, int file) {
		if (this.app.fileStreams[0] == null || this.versions[archive][file] == 0 || this.priorities[archive][file] == 0 || this.topPriority == 0) {
			return;
		}

		OnDemandRequest req = new OnDemandRequest();
		req.archive = archive;
		req.file = file;
		req.urgent = false;

		LinkList lock = this.prefetches;
		synchronized (lock) {
			this.prefetches.push(req);
		}
	}

	public final void run() {
		try {
			while (this.running) {
				this.cycle++;

				byte del = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
					del = 50;
				}

				try {
					Thread.sleep(del);
				} catch (Exception ignore) {
				}

				this.active = true;

				for (int i = 0; i < 100 && this.active; i++) {
					this.active = false;

					this.handleQueue();
					this.handlePending();

					if (this.importantCount == 0 && i >= 5) {
						break;
					}

					this.handleExtras();

					if (this.in != null) {
						this.read();
					}
				}

				boolean loading = false;

				for (OnDemandRequest req = (OnDemandRequest) this.pending.head(); req != null; req = (OnDemandRequest) this.pending.next()) {
					if (req.urgent) {
						loading = true;
						req.cycle++;

						if (req.cycle > 50) {
							req.cycle = 0;
							this.send(req);
						}
					}
				}

				if (!loading) {
					for (OnDemandRequest req = (OnDemandRequest) this.pending.head(); req != null; req = (OnDemandRequest) this.pending.next()) {
						loading = true;
						req.cycle++;

						if (req.cycle > 50) {
							req.cycle = 0;
							this.send(req);
						}
					}
				}

				if (loading) {
					this.waitCycles++;

					if (this.waitCycles > 750) {
						try {
							this.socket.close();
						} catch (Exception ignore) {
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
						} catch (IOException ignore) {
							this.waitCycles = 5000;
						}
					}
				}
			}
		} catch (Exception ex) {
			SignLink.reporterror("od_ex " + ex.getMessage());
		}
	}

	@ObfuscatedName("vb.b(B)V")
	public final void handleQueue() {
		LinkList lock = this.queue;

		OnDemandRequest req;
		synchronized (lock) {
			req = (OnDemandRequest) this.queue.pop();
		}

		while (req != null) {
			this.active = true;
			byte[] data = null;

			if (this.app.fileStreams[0] != null) {
				data = this.app.fileStreams[req.archive + 1].read(req.file);
			}

			if (!this.validate(data, this.crcs[req.archive][req.file], this.versions[req.archive][req.file])) {
				data = null;
			}

			LinkList lock2 = this.queue;
			synchronized (lock2) {
				if (data == null) {
					this.missing.push(req);
				} else {
					req.data = data;

					LinkList lock3 = this.completed;
					synchronized (lock3) {
						this.completed.push(req);
					}
				}

				req = (OnDemandRequest) this.queue.pop();
			}
		}
	}

	@ObfuscatedName("vb.c(B)V")
	public final void handlePending() {
		this.importantCount = 0;
		this.requestCount = 0;

		for (OnDemandRequest req = (OnDemandRequest) this.pending.head(); req != null; req = (OnDemandRequest) this.pending.next()) {
			if (req.urgent) {
				this.importantCount++;
			} else {
				this.requestCount++;
			}
		}

		while (this.importantCount < 10) {
			OnDemandRequest req = (OnDemandRequest) this.missing.pop();
			if (req == null) {
				break;
			}

			if (this.priorities[req.archive][req.file] != 0) {
				this.loadedPrefetchFiles++;
			}

			this.priorities[req.archive][req.file] = 0;
			this.pending.push(req);
			this.importantCount++;
			this.send(req);
			this.active = true;
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void handleExtras() {
		while (this.importantCount == 0 && this.requestCount < 10) {
			if (this.topPriority == 0) {
				return;
			}

			LinkList lock = this.prefetches;

			OnDemandRequest extra;
			synchronized (lock) {
				extra = (OnDemandRequest) this.prefetches.pop();
			}

			while (extra != null) {
				if (this.priorities[extra.archive][extra.file] != 0) {
					this.priorities[extra.archive][extra.file] = 0;
					this.pending.push(extra);
					this.send(extra);
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

				LinkList lock2 = this.prefetches;
				synchronized (lock2) {
					extra = (OnDemandRequest) this.prefetches.pop();
				}
			}

			for (int archive = 0; archive < 4; archive++) {
				byte[] priorities = this.priorities[archive];
				int count = priorities.length;

				for (int i = 0; i < count; i++) {
					if (priorities[i] == this.topPriority) {
						priorities[i] = 0;

						OnDemandRequest req = new OnDemandRequest();
						req.archive = archive;
						req.file = i;
						req.urgent = false;
						this.pending.push(req);
						this.send(req);
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
			int available = this.in.available();

			if (this.partAvailable == 0 && available >= 6) {
				this.active = true;

				for (int off = 0; off < 6; off += this.in.read(this.buf, off, 6 - off)) {
				}

				int archive = this.buf[0] & 0xFF;
				int file = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
				int size = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
				int part = this.buf[5] & 0xFF;

				this.current = null;

				for (OnDemandRequest req = (OnDemandRequest) this.pending.head(); req != null; req = (OnDemandRequest) this.pending.next()) {
					if (req.archive == archive && req.file == file) {
						this.current = req;
					}

					if (this.current != null) {
						req.cycle = 0;
					}
				}

				if (this.current != null) {
					this.waitCycles = 0;

					if (size == 0) {
						SignLink.reporterror("Rej: " + archive + "," + file);

						this.current.data = null;

						if (this.current.urgent) {
							LinkList lock = this.completed;
							synchronized (lock) {
								this.completed.push(this.current);
							}
						} else {
							this.current.unlink();
						}

						this.current = null;
					} else {
						if (this.current.data == null && part == 0) {
							this.current.data = new byte[size];
						}

						if (this.current.data == null && part != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				this.partOffset = part * 500;
				this.partAvailable = 500;

				if (this.partAvailable > size - part * 500) {
					this.partAvailable = size - part * 500;
				}
			}

			if (this.partAvailable > 0 && available >= this.partAvailable) {
				this.active = true;

				byte[] dst = this.buf;
				int off = 0;

				if (this.current != null) {
					dst = this.current.data;
					off = this.partOffset;
				}

				for (int n = 0; n < this.partAvailable; n += this.in.read(dst, off + n, this.partAvailable - n)) {
				}

				if (this.partAvailable + this.partOffset >= dst.length && this.current != null) {
					if (this.app.fileStreams[0] != null) {
						this.app.fileStreams[this.current.archive + 1].write(dst, this.current.file, dst.length);
					}

					if (!this.current.urgent && this.current.archive == 3) {
						this.current.urgent = true;
						this.current.archive = 93;
					}

					if (this.current.urgent) {
						LinkList lock = this.completed;
						synchronized (lock) {
							this.completed.push(this.current);
						}
					} else {
						this.current.unlink();
					}
				}

				this.partAvailable = 0;
			}
		} catch (IOException ignore) {
			try {
				this.socket.close();
			} catch (Exception ignored) {
			}

			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}

	@ObfuscatedName("vb.a([BIII)Z")
	public final boolean validate(byte[] src, int expectedCrc, int expectedVersion) {
		if (src == null || src.length < 2) {
			return false;
		}

		int trailerPos = src.length - 2;

		int version = ((src[trailerPos] & 0xFF) << 8) + (src[trailerPos + 1] & 0xFF);

		this.crc32.reset();
		this.crc32.update(src, 0, trailerPos);
		int crc = (int) this.crc32.getValue();

		return expectedVersion == version && expectedCrc == crc;
	}

	@ObfuscatedName("vb.a(Lnb;Z)V")
	public final void send(OnDemandRequest req) {
		try {
			if (this.socket == null) {
				long now = System.currentTimeMillis();
				if (now - this.socketOpenTime < 5000L) {
					return;
				}

				this.socketOpenTime = now;
				this.socket = this.app.openSocket(Client.portOffset + 43594);
				this.in = this.socket.getInputStream();
				this.out = this.socket.getOutputStream();
				this.out.write(15);

				for (int i = 0; i < 8; i++) {
					this.in.read();
				}

				this.waitCycles = 0;
			}

			this.buf[0] = (byte) req.archive;
			this.buf[1] = (byte) (req.file >> 8);
			this.buf[2] = (byte) req.file;

			if (req.urgent) {
				this.buf[3] = 2;
			} else if (this.app.ingame) {
				this.buf[3] = 0;
			} else {
				this.buf[3] = 1;
			}

			this.out.write(this.buf, 0, 4);
			this.heartbeatCycle = 0;
		} catch (IOException ignore) {
			try {
				this.socket.close();
			} catch (Exception ignored) {
			}

			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}
}
