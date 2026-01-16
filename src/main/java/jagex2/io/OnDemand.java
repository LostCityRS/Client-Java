package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ZPGPWCCV.e")
	public byte[][] priorities = new byte[4][];

	@ObfuscatedName("ZPGPWCCV.f")
	public boolean active = false;

	@ObfuscatedName("ZPGPWCCV.g")
	public boolean running = true;

	@ObfuscatedName("ZPGPWCCV.h")
	public LinkList queue = new LinkList();

	@ObfuscatedName("ZPGPWCCV.l")
	public int[][] crcs = new int[4][];

	@ObfuscatedName("ZPGPWCCV.o")
	public String message = "";

	@ObfuscatedName("ZPGPWCCV.s")
	public LinkList missing = new LinkList();

	@ObfuscatedName("ZPGPWCCV.v")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("ZPGPWCCV.y")
	public LinkList completed = new LinkList();

	@ObfuscatedName("ZPGPWCCV.z")
	public LinkList prefetches = new LinkList();

	@ObfuscatedName("ZPGPWCCV.A")
	public byte[] data = new byte[65000];

	@ObfuscatedName("ZPGPWCCV.F")
	public byte[] buf = new byte[500];

	@ObfuscatedName("ZPGPWCCV.K")
	public DoublyLinkList requests = new DoublyLinkList();

	@ObfuscatedName("ZPGPWCCV.P")
	public LinkList pending = new LinkList();

	@ObfuscatedName("ZPGPWCCV.S")
	public int[][] versions = new int[4][];

	@ObfuscatedName("ZPGPWCCV.b")
	public int loadedPrefetchFiles;

	@ObfuscatedName("ZPGPWCCV.i")
	public int topPriority;

	@ObfuscatedName("ZPGPWCCV.j")
	public int urgentCount;

	@ObfuscatedName("ZPGPWCCV.k")
	public int requestCount;

	@ObfuscatedName("ZPGPWCCV.p")
	public int cycle;

	@ObfuscatedName("ZPGPWCCV.r")
	public int totalPrefetchFiles;

	@ObfuscatedName("ZPGPWCCV.u")
	public int waitCycles;

	@ObfuscatedName("ZPGPWCCV.C")
	public int partOffset;

	@ObfuscatedName("ZPGPWCCV.D")
	public int partAvailable;

	@ObfuscatedName("ZPGPWCCV.Q")
	public int heartbeatCycle;

	@ObfuscatedName("ZPGPWCCV.U")
	public int tries;

	@ObfuscatedName("ZPGPWCCV.T")
	public long socketOpenTime;

	@ObfuscatedName("ZPGPWCCV.N")
	public OnDemandRequest current;

	@ObfuscatedName("ZPGPWCCV.O")
	public Client app;

	@ObfuscatedName("ZPGPWCCV.L")
	public InputStream in;

	@ObfuscatedName("ZPGPWCCV.q")
	public OutputStream out;

	@ObfuscatedName("ZPGPWCCV.w")
	public Socket socket;

	@ObfuscatedName("ZPGPWCCV.c")
	public byte[] models;

	@ObfuscatedName("ZPGPWCCV.d")
	public int[] mapMembers;

	@ObfuscatedName("ZPGPWCCV.n")
	public int[] mapIndex;

	@ObfuscatedName("ZPGPWCCV.B")
	public int[] mapLand;

	@ObfuscatedName("ZPGPWCCV.G")
	public int[] mapLoc;

	@ObfuscatedName("ZPGPWCCV.H")
	public int[] midiIndex;

	@ObfuscatedName("ZPGPWCCV.R")
	public int[] animIndex;

	@ObfuscatedName("ZPGPWCCV.a(LATJMVOZR;Lclient;)V")
	public void unpack(Jagfile jag, Client app) {
		String[] version = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int archive = 0; archive < 4; archive++) {
			byte[] data = jag.read(version[archive], null);
			int count = data.length / 2;
			Packet buf = new Packet(data);

			this.versions[archive] = new int[count];
			this.priorities[archive] = new byte[count];

			for (int file = 0; file < count; file++) {
				this.versions[archive][file] = buf.g2();
			}
		}

		String[] crc = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int archive = 0; archive < 4; archive++) {
			byte[] data = jag.read(crc[archive], null);
			int count = data.length / 4;
			Packet buf = new Packet(data);

			this.crcs[archive] = new int[count];

			for (int file = 0; file < count; file++) {
				this.crcs[archive][file] = buf.g4();
			}
		}

		byte[] data = jag.read("model_index", null);
		int count = this.versions[0].length;

		this.models = new byte[count];

		for (int file = 0; file < count; file++) {
			if (file < data.length) {
				this.models[file] = data[file];
			} else {
				this.models[file] = 0;
			}
		}

		data = jag.read("map_index", null);
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

		data = jag.read("anim_index", null);
		buf = new Packet(data);
		count = data.length / 2;

		this.animIndex = new int[count];

		for (int frame = 0; frame < count; frame++) {
			this.animIndex[frame] = buf.g2();
		}

		data = jag.read("midi_index", null);
		buf = new Packet(data);
		count = data.length;

		this.midiIndex = new int[count];

		for (int file = 0; file < count; file++) {
			this.midiIndex[file] = buf.g1();
		}

		this.app = app;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("ZPGPWCCV.c()V")
	public void stop() {
		this.running = false;
	}

	@ObfuscatedName("ZPGPWCCV.c(II)I")
	public int getFileCount(int archive) {
		return this.versions[archive].length;
	}

	@ObfuscatedName("ZPGPWCCV.d(I)I")
	public int getAnimCount() {
		return this.animIndex.length;
	}

	@ObfuscatedName("ZPGPWCCV.a(IIII)I")
	public int getMapFile(int x, int z, int type) {
		int index = (x << 8) + z;

		for (int i = 0; i < this.mapIndex.length; i++) {
			if (this.mapIndex[i] == index) {
				if (type == 0) {
					return this.mapLand[i];
				}
				return this.mapLoc[i];
			}
		}

		return -1;
	}

	@ObfuscatedName("ZPGPWCCV.a(ZB)V")
	public void prefetchMaps(boolean members) {
		int count = this.mapIndex.length;
		for (int i = 0; i < count; i++) {
			if (members || this.mapMembers[i] != 0) {
				this.prefetchPriority(3, (byte) 2, this.mapLoc[i]);
				this.prefetchPriority(3, (byte) 2, this.mapLand[i]);
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(IZ)Z")
	public boolean hasMapLocFile(int id) {
		for (int i = 0; i < this.mapIndex.length; i++) {
			if (this.mapLoc[i] == id) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZPGPWCCV.a(II)I")
	public int getModelFlags(int id) {
		return this.models[id] & 0xFF;
	}

	@ObfuscatedName("ZPGPWCCV.a(IZ)Z")
	public boolean shouldPrefetchMidi(int id) {
		return this.midiIndex[id] == 1;
	}

	@ObfuscatedName("ZPGPWCCV.a(I)V")
	public void requestModel(int id) {
		this.request(0, id);
	}

	@ObfuscatedName("ZPGPWCCV.b(II)V")
	public void request(int archive, int file) {
		if (archive < 0 || archive > this.versions.length || file < 0 || file > this.versions[archive].length || this.versions[archive][file] == 0) {
			return;
		}

		synchronized (this.requests) {
			for (OnDemandRequest req = (OnDemandRequest) this.requests.head(); req != null; req = (OnDemandRequest) this.requests.next()) {
				if (req.archive == archive && req.file == file) {
					return;
				}
			}

			OnDemandRequest req = new OnDemandRequest();
			req.archive = archive;
			req.file = file;
			req.urgent = true;

			synchronized (this.queue) {
				this.queue.push(req);
			}

			this.requests.push(req);
		}
	}

	@ObfuscatedName("ZPGPWCCV.b()I")
	public int remaining() {
		synchronized (this.requests) {
			return this.requests.size();
		}
	}

	@ObfuscatedName("ZPGPWCCV.a()LQSLIGKQQ;")
	public OnDemandRequest cycle() {
		OnDemandRequest req;
		synchronized (this.completed) {
			req = (OnDemandRequest) this.completed.pop();
		}

		if (req == null) {
			return null;
		}

		synchronized (this.requests) {
			req.unlink2();
		}

		if (req.data == null) {
			return req;
		}

		int pos = 0;
		try {
			GZIPInputStream input = new GZIPInputStream(new ByteArrayInputStream(req.data));
			while (true) {
				if (this.data.length == pos) {
					throw new RuntimeException("buffer overflow!");
				}
				int n = input.read(this.data, pos, this.data.length - pos);
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

	@ObfuscatedName("ZPGPWCCV.a(IIBI)V")
	public void prefetchPriority(int archive, byte priority, int file) {
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

	@ObfuscatedName("ZPGPWCCV.a(B)V")
	public void clearPrefetches() {
		synchronized (this.prefetches) {
			this.prefetches.clear();
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(IIB)V")
	public void prefetch(int file, int archive) {
		if (this.app.fileStreams[0] == null || (this.versions[archive][file] == 0 || (this.priorities[archive][file] == 0 || this.topPriority == 0))) {
			return;
		}

		OnDemandRequest req = new OnDemandRequest();
		req.archive = archive;
		req.file = file;
		req.urgent = false;

		synchronized (this.prefetches) {
			this.prefetches.push(req);
		}
	}

	public void run() {
		try {
			while (this.running) {
				this.cycle++;

				byte del = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
					del = 50;
				}

				try {
					Thread.sleep((long) del);
				} catch (Exception ignore) {
				}

				this.active = true;

				for (int i = 0; i < 100 && this.active; i++) {
					this.active = false;

					this.handleQueue();
					this.handlePending();

					if (this.urgentCount == 0 && i >= 5) {
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
			signlink.reporterror("od_ex " + ex.getMessage());
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(Z)V")
	public void handleQueue() {
		OnDemandRequest req;
		synchronized (this.queue) {
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

			synchronized (this.queue) {
				if (data == null) {
					this.missing.push(req);
				} else {
					req.data = data;

					synchronized (this.completed) {
						this.completed.push(req);
					}
				}

				req = (OnDemandRequest) this.queue.pop();
			}
		}
	}

	@ObfuscatedName("ZPGPWCCV.c(I)V")
	public void handlePending() {
		this.urgentCount = 0;
		this.requestCount = 0;

		for (OnDemandRequest req = (OnDemandRequest) this.pending.head(); req != null; req = (OnDemandRequest) this.pending.next()) {
			if (req.urgent) {
				this.urgentCount++;
			} else {
				this.requestCount++;
			}
		}

		while (this.urgentCount < 10) {
			OnDemandRequest req = (OnDemandRequest) this.missing.pop();
			if (req == null) {
				break;
			}

			if (this.priorities[req.archive][req.file] != 0) {
				this.loadedPrefetchFiles++;
			}

			this.priorities[req.archive][req.file] = 0;
			this.pending.push(req);
			this.urgentCount++;

			this.send(req);
			this.active = true;
		}
	}

	@ObfuscatedName("ZPGPWCCV.b(I)V")
	public void handleExtras() {
		while (this.urgentCount == 0) {
			if (this.requestCount >= 10 || this.topPriority == 0) {
				return;
			}

			OnDemandRequest extra;
			synchronized (this.prefetches) {
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

				synchronized (this.prefetches) {
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

	@ObfuscatedName("ZPGPWCCV.a(Z)V")
	public void read() {
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
						signlink.reporterror("Rej: " + archive + "," + file);

						this.current.data = null;

						if (this.current.urgent) {
							synchronized (this.completed) {
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
						this.app.fileStreams[this.current.archive + 1].write(dst.length, dst, this.current.file);
					}

					if (!this.current.urgent && this.current.archive == 3) {
						this.current.urgent = true;
						this.current.archive = 93;
					}

					if (this.current.urgent) {
						synchronized (this.completed) {
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
			} catch (Exception ignore2) {
			}

			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a([BIII)Z")
	public boolean validate(byte[] src, int expectedCrc, int expectedVersion) {
		if (src == null || src.length < 2) {
			return false;
		}

		int versionPos = src.length - 2;
		int version = ((src[versionPos] & 0xFF) << 8) + (src[versionPos + 1] & 0xFF);

		this.crc32.reset();
		this.crc32.update(src, 0, versionPos);

		int crc = (int) this.crc32.getValue();
		if (version == expectedVersion) {
			return crc == expectedCrc;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ZPGPWCCV.a(ILQSLIGKQQ;)V")
	public void send(OnDemandRequest req) {
		try {
			if (this.socket == null) {
				long now = System.currentTimeMillis();
				if (now - this.socketOpenTime < 4000L) {
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
			this.tries = -10000;
		} catch (IOException ignore) {
			try {
				this.socket.close();
			} catch (Exception ignore2) {
			}

			this.socket = null;
			this.in = null;
			this.out = null;
			this.partAvailable = 0;
			this.tries++;
		}
	}
}
