package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.LinkList2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("ub")
public final class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("ub.a")
	public final boolean field803 = false;

	@ObfuscatedName("ub.b")
	public final int field804 = -555;

	@ObfuscatedName("ub.c")
	public int field805;

	@ObfuscatedName("ub.d")
	public final byte field806 = 64;

	@ObfuscatedName("ub.e")
	public final int[][] versions = new int[4][];

	@ObfuscatedName("ub.f")
	public final int[][] crcs = new int[4][];

	@ObfuscatedName("ub.g")
	public final byte[][] priorities = new byte[4][];

	@ObfuscatedName("ub.h")
	public int topPriority;

	@ObfuscatedName("ub.i")
	public byte[] modelUse;

	@ObfuscatedName("ub.j")
	public int[] mapIndex;

	@ObfuscatedName("ub.k")
	public int[] mapLand;

	@ObfuscatedName("ub.l")
	public int[] mapLoc;

	@ObfuscatedName("ub.m")
	public int[] mapFree;

	@ObfuscatedName("ub.n")
	public int[] animFrameIndex;

	@ObfuscatedName("ub.o")
	public int[] midiJingle;

	@ObfuscatedName("ub.p")
	public boolean running = true;

	@ObfuscatedName("ub.q")
	public Client app;

	@ObfuscatedName("ub.r")
	public final CRC32 crc32 = new CRC32();

	@ObfuscatedName("ub.s")
	public boolean field821 = false;

	@ObfuscatedName("ub.t")
	public int field822;

	@ObfuscatedName("ub.u")
	public int field823;

	@ObfuscatedName("ub.v")
	public final LinkList2 requests = new LinkList2(9);

	@ObfuscatedName("ub.w")
	public final LinkList field825 = new LinkList(-199);

	@ObfuscatedName("ub.x")
	public final LinkList field826 = new LinkList(-199);

	@ObfuscatedName("ub.y")
	public final LinkList field827 = new LinkList(-199);

	@ObfuscatedName("ub.z")
	public final LinkList completed = new LinkList(-199);

	@ObfuscatedName("ub.A")
	public final LinkList prefetches = new LinkList(-199);

	@ObfuscatedName("ub.B")
	public String message = "";

	@ObfuscatedName("ub.L")
	public final byte[] buf = new byte[500];

	@ObfuscatedName("ub.M")
	public final byte[] data = new byte[65000];

	@ObfuscatedName("ub.C")
	public int field831;

	@ObfuscatedName("ub.D")
	public int totalPrefetchFiles;

	@ObfuscatedName("ub.H")
	public int failCount;

	@ObfuscatedName("ub.J")
	public int field838;

	@ObfuscatedName("ub.K")
	public int field839;

	@ObfuscatedName("ub.N")
	public int field842;

	@ObfuscatedName("ub.O")
	public int field843;

	@ObfuscatedName("ub.Q")
	public int field845;

	@ObfuscatedName("ub.P")
	public long field844;

	@ObfuscatedName("ub.I")
	public OnDemandRequest current;

	@ObfuscatedName("ub.F")
	public InputStream in;

	@ObfuscatedName("ub.G")
	public OutputStream out;

	@ObfuscatedName("ub.E")
	public Socket socket;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public void init(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.read(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5, 15787);
			versions[var4] = new int[var6];
			priorities[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				versions[var4][var8] = var7.g2();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.read(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11, 15787);
			crcs[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				crcs[var10][var14] = var13.g4();
			}
		}
		byte[] var15 = arg0.read("model_index", null);
		int var16 = versions[0].length;
		modelUse = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				modelUse[var17] = var15[var17];
			} else {
				modelUse[var17] = 0;
			}
		}
		byte[] var18 = arg0.read("map_index", null);
		Packet var19 = new Packet(var18, 15787);
		int var20 = var18.length / 7;
		mapIndex = new int[var20];
		mapLand = new int[var20];
		mapLoc = new int[var20];
		mapFree = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			mapIndex[var21] = var19.g2();
			mapLand[var21] = var19.g2();
			mapLoc[var21] = var19.g2();
			mapFree[var21] = var19.g1();
		}
		byte[] var22 = arg0.read("anim_index", null);
		Packet var23 = new Packet(var22, 15787);
		int var24 = var22.length / 2;
		animFrameIndex = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			animFrameIndex[var25] = var23.g2();
		}
		byte[] var26 = arg0.read("midi_index", null);
		Packet var27 = new Packet(var26, 15787);
		int var28 = var26.length;
		midiJingle = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			midiJingle[var29] = var27.g1();
		}
		app = arg1;
		running = true;
		app.startThread(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public void stop() {
		running = false;
	}

	@ObfuscatedName("ub.a(IB)I")
	public int getFileCount(int arg0) {
		return versions[arg0].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public int getAnimFrameCount() {
		return animFrameIndex.length;
	}

	@ObfuscatedName("ub.a(IIII)I")
	public int getMapFile(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < mapIndex.length; var5++) {
			if (mapIndex[var5] == var4) {
				if (arg2 == 0) {
					return mapLand[var5];
				}
				return mapLoc[var5];
			}
		}
		return -1;
	}

	@ObfuscatedName("ub.a(ZZ)V")
	public void prefetchMaps(boolean arg0) {
		int var2 = mapIndex.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || mapFree[var3] != 0) {
				prefetchPriority(3, (byte) 2, mapLoc[var3]);
				prefetchPriority(3, (byte) 2, mapLand[var3]);
			}
		}
	}

	@ObfuscatedName("ub.a(II)Z")
	public boolean hasMapLocFile(int arg0, int arg1) {
		for (int var3 = 0; var3 < mapIndex.length; var3++) {
			if (mapLoc[var3] == arg0) {
				return true;
			}
		}
		if (arg1 != 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		return false;
	}

	@ObfuscatedName("ub.b(II)I")
	public int getModelUse(int arg0) {
		return modelUse[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.c(II)Z")
	public boolean method276(int arg0) {
		return midiJingle[arg0] == 1;
	}

	@ObfuscatedName("ub.a(I)V")
	@Override
	public void requestModel(int arg0) {
		request(0, arg0);
	}

	@ObfuscatedName("ub.d(II)V")
	public void request(int arg0, int arg1) {
		if (arg0 > versions.length || arg1 < 0 || arg1 > versions[arg0].length || versions[arg0][arg1] == 0) {
			return;
		}
		LinkList2 var3 = requests;
		synchronized (requests) {
			for (OnDemandRequest var4 = (OnDemandRequest) requests.head(); var4 != null; var4 = (OnDemandRequest) requests.next()) {
				if (var4.archive == arg0 && var4.file == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.archive = arg0;
			var5.file = arg1;
			var5.field727 = true;
			LinkList var6 = field825;
			synchronized (field825) {
				field825.push(var5);
			}
			requests.push(var5);
		}
	}

	@ObfuscatedName("ub.b()I")
	public int remaining() {
		LinkList2 var1 = requests;
		synchronized (requests) {
			return requests.size();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public OnDemandRequest loop() {
		LinkList var1 = completed;
		OnDemandRequest var2;
		synchronized (completed) {
			var2 = (OnDemandRequest) completed.popFront();
		}
		if (var2 == null) {
			return null;
		}
		LinkList2 var3 = requests;
		synchronized (requests) {
			var2.unlink2();
		}
		if (var2.data == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
			while (true) {
				if (var4 == data.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(data, var4, data.length - var4);
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
			var2.data[var7] = data[var7];
		}
		return var2;
	}

	@ObfuscatedName("ub.a(IIBI)V")
	public void prefetchPriority(int arg0, byte arg1, int arg2) {
		if (app.fileStreams[0] == null || versions[arg0][arg2] == 0) {
			return;
		}
		byte[] var4 = app.fileStreams[arg0 + 1].readFromFile(arg2);
		if (!validate(var4, versions[arg0][arg2], crcs[arg0][arg2])) {
			priorities[arg0][arg2] = arg1;
			if (arg1 > topPriority) {
				topPriority = arg1;
			}
			totalPrefetchFiles++;
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public void clearPrefetches(int arg0) {
		if (arg0 < 0) {
			LinkList var2 = prefetches;
			synchronized (prefetches) {
				prefetches.clear();
			}
		}
	}

	@ObfuscatedName("ub.a(IIB)V")
	public void prefetch(int arg0, int arg1) {
		if (app.fileStreams[0] == null || (versions[arg1][arg0] == 0 || (priorities[arg1][arg0] == 0 || topPriority == 0))) {
			return;
		}
		OnDemandRequest var3 = new OnDemandRequest();
		var3.archive = arg1;
		var3.file = arg0;
		var3.field727 = false;
		LinkList var4 = prefetches;
		synchronized (prefetches) {
			prefetches.push(var3);
		}
	}

	@Override
	public void run() {
		try {
			while (running) {
				field845++;
				byte var1 = 20;
				if (topPriority == 0 && app.fileStreams[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				field821 = true;
				for (int var2 = 0; var2 < 100 && field821; var2++) {
					field821 = false;
					method283();
					method284();
					if (field822 == 0 && var2 >= 5) {
						break;
					}
					method285();
					if (in != null) {
						method286();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) field827.head(); var4 != null; var4 = (OnDemandRequest) field827.next()) {
					if (var4.field727) {
						var3 = true;
						var4.field726++;
						if (var4.field726 > 50) {
							var4.field726 = 0;
							method288(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) field827.head(); var5 != null; var5 = (OnDemandRequest) field827.next()) {
						var3 = true;
						var5.field726++;
						if (var5.field726 > 50) {
							var5.field726 = 0;
							method288(var5);
						}
					}
				}
				if (var3) {
					field842++;
					if (field842 > 750) {
						try {
							socket.close();
						} catch (Exception var8) {
						}
						socket = null;
						in = null;
						out = null;
						field839 = 0;
					}
				} else {
					field842 = 0;
					message = "";
				}
				if (app.ingame && socket != null && out != null && (topPriority > 0 || app.fileStreams[0] == null)) {
					field843++;
					if (field843 > 500) {
						field843 = 0;
						buf[0] = 0;
						buf[1] = 0;
						buf[2] = 0;
						buf[3] = 10;
						try {
							out.write(buf, 0, 4);
						} catch (IOException var7) {
							field842 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.a(B)V")
	public void method283() {
		LinkList var1 = field825;
		OnDemandRequest var2;
		synchronized (field825) {
			var2 = (OnDemandRequest) field825.popFront();
		}
		while (var2 != null) {
			field821 = true;
			byte[] var3 = null;
			if (app.fileStreams[0] != null) {
				var3 = app.fileStreams[var2.archive + 1].readFromFile(var2.file);
			}
			if (!validate(var3, versions[var2.archive][var2.file], crcs[var2.archive][var2.file])) {
				var3 = null;
			}
			LinkList var4 = field825;
			synchronized (field825) {
				if (var3 == null) {
					field826.push(var2);
				} else {
					var2.data = var3;
					LinkList var5 = completed;
					synchronized (completed) {
						completed.push(var2);
					}
				}
				var2 = (OnDemandRequest) field825.popFront();
			}
		}
	}

	@ObfuscatedName("ub.b(B)V")
	public void method284() {
		field822 = 0;
		field823 = 0;
		for (OnDemandRequest var1 = (OnDemandRequest) field827.head(); var1 != null; var1 = (OnDemandRequest) field827.next()) {
			if (var1.field727) {
				field822++;
			} else {
				field823++;
			}
		}
		while (field822 < 10) {
			OnDemandRequest var2 = (OnDemandRequest) field826.popFront();
			if (var2 == null) {
				break;
			}
			if (priorities[var2.archive][var2.file] != 0) {
				field831++;
			}
			priorities[var2.archive][var2.file] = 0;
			field827.push(var2);
			field822++;
			method288(var2);
			field821 = true;
		}
	}

	@ObfuscatedName("ub.d(I)V")
	public void method285() {
		while (field822 == 0) {
			if (field823 >= 10 || topPriority == 0) {
				return;
			}
			LinkList var1 = prefetches;
			OnDemandRequest var2;
			synchronized (prefetches) {
				var2 = (OnDemandRequest) prefetches.popFront();
			}
			while (var2 != null) {
				if (priorities[var2.archive][var2.file] != 0) {
					priorities[var2.archive][var2.file] = 0;
					field827.push(var2);
					method288(var2);
					field821 = true;
					if (field831 < totalPrefetchFiles) {
						field831++;
					}
					message = "Loading extra files - " + field831 * 100 / totalPrefetchFiles + "%";
					field823++;
					if (field823 == 10) {
						return;
					}
				}
				LinkList var3 = prefetches;
				synchronized (prefetches) {
					var2 = (OnDemandRequest) prefetches.popFront();
				}
			}
			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = priorities[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == topPriority) {
						var5[var7] = 0;
						OnDemandRequest var8 = new OnDemandRequest();
						var8.archive = var4;
						var8.file = var7;
						var8.field727 = false;
						field827.push(var8);
						method288(var8);
						field821 = true;
						if (field831 < totalPrefetchFiles) {
							field831++;
						}
						message = "Loading extra files - " + field831 * 100 / totalPrefetchFiles + "%";
						field823++;
						if (field823 == 10) {
							return;
						}
					}
				}
			}
			topPriority--;
		}
	}

	@ObfuscatedName("ub.e(I)V")
	public void method286() {
		try {
			int var1 = in.available();
			if (field839 == 0 && var1 >= 6) {
				field821 = true;
				for (int var2 = 0; var2 < 6; var2 += in.read(buf, var2, 6 - var2)) {
				}
				int var3 = buf[0] & 0xFF;
				int var4 = ((buf[1] & 0xFF) << 8) + (buf[2] & 0xFF);
				int var5 = ((buf[3] & 0xFF) << 8) + (buf[4] & 0xFF);
				int var6 = buf[5] & 0xFF;
				current = null;
				for (OnDemandRequest var7 = (OnDemandRequest) field827.head(); var7 != null; var7 = (OnDemandRequest) field827.next()) {
					if (var7.archive == var3 && var7.file == var4) {
						current = var7;
					}
					if (current != null) {
						var7.field726 = 0;
					}
				}
				if (current != null) {
					field842 = 0;
					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						current.data = null;
						if (current.field727) {
							LinkList var8 = completed;
							synchronized (completed) {
								completed.push(current);
							}
						} else {
							current.unlink();
						}
						current = null;
					} else {
						if (current.data == null && var6 == 0) {
							current.data = new byte[var5];
						}
						if (current.data == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				field838 = var6 * 500;
				field839 = 500;
				if (field839 > var5 - var6 * 500) {
					field839 = var5 - var6 * 500;
				}
			}
			if (field839 > 0 && var1 >= field839) {
				field821 = true;
				byte[] var9 = buf;
				int var10 = 0;
				if (current != null) {
					var9 = current.data;
					var10 = field838;
				}
				for (int var11 = 0; var11 < field839; var11 += in.read(var9, var11 + var10, field839 - var11)) {
				}
				if (field839 + field838 >= var9.length && current != null) {
					if (app.fileStreams[0] != null) {
						app.fileStreams[current.archive + 1].writeToFile(var9, var9.length, current.file);
					}
					if (!current.field727 && current.archive == 3) {
						current.field727 = true;
						current.archive = 93;
					}
					if (current.field727) {
						LinkList var12 = completed;
						synchronized (completed) {
							completed.push(current);
						}
					} else {
						current.unlink();
					}
				}
				field839 = 0;
			}
		} catch (IOException var17) {
			try {
				socket.close();
			} catch (Exception var14) {
			}
			socket = null;
			in = null;
			out = null;
			field839 = 0;
		}
	}

	@ObfuscatedName("ub.a([BIBI)Z")
	public boolean validate(byte[] arg0, int arg1, int arg2) {
		if (arg0 == null || arg0.length < 2) {
			return false;
		}
		int var4 = arg0.length - 2;
		int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
		crc32.reset();
		if (field806 != 64) {
			throw new NullPointerException();
		}
		crc32.update(arg0, 0, var4);
		int var6 = (int) crc32.getValue();
		if (var5 == arg1) {
			return var6 == arg2;
		}
		return false;
	}

	@ObfuscatedName("ub.a(Lmb;I)V")
	public void method288(OnDemandRequest arg0) {
		try {
			if (socket == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field844 < 4000L) {
					return;
				}
				field844 = var2;
				socket = app.openSocket(Client.portOffset + 43594);
				in = socket.getInputStream();
				out = socket.getOutputStream();
				out.write(15);
				for (int var4 = 0; var4 < 8; var4++) {
					in.read();
				}
				field842 = 0;
			}
			buf[0] = (byte) arg0.archive;
			buf[1] = (byte) (arg0.file >> 8);
			buf[2] = (byte) arg0.file;
			if (arg0.field727) {
				buf[3] = 2;
			} else if (app.ingame) {
				buf[3] = 0;
			} else {
				buf[3] = 1;
			}
			out.write(buf, 0, 4);
			field843 = 0;
			failCount = -10000;
		} catch (IOException var7) {
			try {
				socket.close();
			} catch (Exception var6) {
			}
			socket = null;
			in = null;
			out = null;
			field839 = 0;
			failCount++;
		}
	}
}
