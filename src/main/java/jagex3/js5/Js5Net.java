package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.LinkList2;
import jagex3.io.ClientStream;
import jagex3.io.Packet;
import jagex3.util.MonotonicTime;

import java.io.IOException;
import java.util.zip.CRC32;

public class Js5Net {
	@ObfuscatedName("ha.t")
	public static final Packet incomingTransferHeader = new Packet(8);
	@ObfuscatedName("nj.a")
	public static final HashTable urgentQueue = new HashTable(32);
	@ObfuscatedName("jj.s")
	public static final HashTable prefetchQueue = new HashTable(4096);
	@ObfuscatedName("mg.yb")
	public static final LinkList2 requestQueue = new LinkList2();
	@ObfuscatedName("si.K")
	public static final HashTable pendingPrefetchQueue = new HashTable(4096);
	@ObfuscatedName("wb.e")
	public static final HashTable pendingUrgentQueue = new HashTable(4096);
	@ObfuscatedName("id.p")
	public static final CRC32 crc32 = new CRC32();
	@ObfuscatedName("ai.a")
	public static final Js5Loader[] field141 = new Js5Loader[256];
	@ObfuscatedName("ng.Zb")
	public static Packet incomingGroupBuffer;
	@ObfuscatedName("tg.a")
	public static ClientStream stream;
	@ObfuscatedName("ce.bb")
	public static int incomingChunkPos = 0;
	@ObfuscatedName("eh.x")
	public static Js5NetRequest incomingRequest;
	@ObfuscatedName("bf.D")
	public static byte xorKey = 0;
	@ObfuscatedName("nh.h")
	public static int timeoutMs = 0;
	@ObfuscatedName("hd.p")
	public static long lastTickMs;
	@ObfuscatedName("ub.Z")
	public static int pendingPrefetchQueueSize = 0;
	@ObfuscatedName("vb.P")
	public static int prefetchQueueSize = 0;
	@ObfuscatedName("sg.C")
	public static int urgentQueueSize = 0;
	@ObfuscatedName("ta.R")
	public static int pendingUrgentQueueSize = 0;
	@ObfuscatedName("h.K")
	public static int ioErrorCount = 0;
	@ObfuscatedName("mg.Gb")
	public static boolean incomingUrgentRequest;
	@ObfuscatedName("nj.q")
	public static int crcErrorCount = 0;
	@ObfuscatedName("hb.T")
	public static Packet masterIndexBuffer;

	@ObfuscatedName("ja.a(I)Z")
	public static boolean loop() {
		long var0 = MonotonicTime.currentTime();
		int var2 = (int) (var0 - lastTickMs);
		if (var2 > 200) {
			var2 = 200;
		}
		timeoutMs += var2;
		lastTickMs = var0;
		if (prefetchQueueSize == 0 && urgentQueueSize == 0 && pendingPrefetchQueueSize == 0 && pendingUrgentQueueSize == 0) {
			return true;
		} else if (stream == null) {
			return false;
		} else {
			try {
				if (timeoutMs > 30000) {
					throw new IOException();
				}
				while (urgentQueueSize < 20 && pendingUrgentQueueSize > 0) {
					Js5NetRequest var3 = (Js5NetRequest) pendingUrgentQueue.search();
					Packet var4 = new Packet(4);
					var4.p1(1);
					var4.p3((int) var3.key);
					stream.write(4, var4.data);
					urgentQueue.put(var3.key, var3);
					pendingUrgentQueueSize--;
					urgentQueueSize++;
				}
				while (prefetchQueueSize < 20 && pendingPrefetchQueueSize > 0) {
					Js5NetRequest var5 = (Js5NetRequest) requestQueue.next();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.p3((int) var5.key);
					stream.write(4, var6.data);
					var5.unlink2();
					prefetchQueue.put(var5.key, var5);
					prefetchQueueSize++;
					pendingPrefetchQueueSize--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = stream.available();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					byte var9 = 0;
					timeoutMs = 0;
					if (incomingRequest == null) {
						var9 = 8;
					} else if (incomingChunkPos == 0) {
						var9 = 1;
					}
					if (var9 > 0) {
						int var10 = var9 - incomingTransferHeader.pos;
						if (var8 < var10) {
							var10 = var8;
						}
						stream.read(incomingTransferHeader.pos, incomingTransferHeader.data, var10);
						if (xorKey != 0) {
							for (int var11 = 0; var11 < var10; var11++) {
								incomingTransferHeader.data[incomingTransferHeader.pos + var11] ^= xorKey;
							}
						}
						incomingTransferHeader.pos += var10;
						if (var9 > incomingTransferHeader.pos) {
							break;
						}
						if (incomingRequest == null) {
							incomingTransferHeader.pos = 0;
							int var12 = incomingTransferHeader.g1();
							int var13 = incomingTransferHeader.g2();
							long var14 = (long) (var13 + (var12 << 16));
							int var16 = incomingTransferHeader.g1();
							int var17 = incomingTransferHeader.g4();
							Js5NetRequest var18 = (Js5NetRequest) urgentQueue.find(var14);
							incomingUrgentRequest = true;
							if (var18 == null) {
								var18 = (Js5NetRequest) prefetchQueue.find(var14);
								incomingUrgentRequest = false;
							}
							if (var18 == null) {
								throw new IOException();
							}
							incomingRequest = var18;
							int var19 = var16 == 0 ? 5 : 9;
							incomingGroupBuffer = new Packet(var17 + var19 + incomingRequest.padding);
							incomingGroupBuffer.p1(var16);
							incomingGroupBuffer.p4(var17);
							incomingTransferHeader.pos = 0;
							incomingChunkPos = 8;
						} else if (incomingChunkPos == 0) {
							if (incomingTransferHeader.data[0] == -1) {
								incomingTransferHeader.pos = 0;
								incomingChunkPos = 1;
							} else {
								incomingRequest = null;
							}
						}
					} else {
						int var20 = incomingGroupBuffer.data.length - incomingRequest.padding;
						int var21 = 512 - incomingChunkPos;
						if (var21 > var20 - incomingGroupBuffer.pos) {
							var21 = var20 - incomingGroupBuffer.pos;
						}
						if (var8 < var21) {
							var21 = var8;
						}
						stream.read(incomingGroupBuffer.pos, incomingGroupBuffer.data, var21);
						if (xorKey != 0) {
							for (int var22 = 0; var22 < var21; var22++) {
								incomingGroupBuffer.data[var22 + incomingGroupBuffer.pos] ^= xorKey;
							}
						}
						incomingGroupBuffer.pos += var21;
						incomingChunkPos += var21;
						if (incomingGroupBuffer.pos == var20) {
							if (incomingRequest.key == 16711935L) {
								masterIndexBuffer = incomingGroupBuffer;
								for (int var23 = 0; var23 < 256; var23++) {
									Js5Loader var24 = field141[var23];
									if (var24 != null) {
										masterIndexBuffer.pos = var23 * 8 + 5;
										int var25 = masterIndexBuffer.g4();
										int var26 = masterIndexBuffer.g4();
										var24.requestIndex(var25, var26);
									}
								}
							} else {
								crc32.reset();
								crc32.update(incomingGroupBuffer.data, 0, var20);
								int var27 = (int) crc32.getValue();
								if (incomingRequest.expectedCrc != var27) {
									try {
										stream.close();
									} catch (Exception var29) {
									}
									xorKey = (byte) (Math.random() * 255.0D + 1.0D);
									crcErrorCount++;
									stream = null;
									return false;
								}
								crcErrorCount = 0;
								ioErrorCount = 0;
								incomingRequest.provider.write((int) (incomingRequest.key & 0xFFFFL), incomingGroupBuffer.data, incomingUrgentRequest, (incomingRequest.key & 0xFF0000L) == 16711680L);
							}
							incomingRequest.unlink();
							incomingChunkPos = 0;
							if (incomingUrgentRequest) {
								urgentQueueSize--;
							} else {
								prefetchQueueSize--;
							}
							incomingRequest = null;
							incomingGroupBuffer = null;
						} else {
							if (incomingChunkPos != 512) {
								break;
							}
							incomingChunkPos = 0;
						}
					}
				}
				return true;
			} catch (IOException var30) {
				try {
					stream.close();
				} catch (Exception var28) {
				}
				ioErrorCount++;
				stream = null;
				return false;
			}
		}
	}

	@ObfuscatedName("hc.a(ZILmf;)V")
	public static void init(boolean arg0, ClientStream arg1) {
		if (stream != null) {
			try {
				stream.close();
			} catch (Exception var7) {
			}
			stream = null;
		}
		stream = arg1;
		sendLoginLogoutPacket(arg0);
		incomingGroupBuffer = null;
		incomingChunkPos = 0;
		incomingRequest = null;
		incomingTransferHeader.pos = 0;
		while (true) {
			Js5NetRequest var2 = (Js5NetRequest) urgentQueue.search();
			if (var2 == null) {
				while (true) {
					Js5NetRequest var3 = (Js5NetRequest) prefetchQueue.search();
					if (var3 == null) {
						if (xorKey != 0) {
							try {
								Packet var4 = new Packet(4);
								var4.p1(4);
								var4.p1(xorKey);
								var4.p2(0);
								stream.write(4, var4.data);
							} catch (IOException var6) {
								try {
									stream.close();
								} catch (Exception var5) {
								}
								stream = null;
								ioErrorCount++;
							}
						}
						timeoutMs = 0;
						lastTickMs = MonotonicTime.currentTime();
						return;
					}
					requestQueue.pushFront(var3);
					pendingPrefetchQueue.put(var3.key, var3);
					pendingPrefetchQueueSize++;
					prefetchQueueSize--;
				}
			}
			pendingUrgentQueue.put(var2.key, var2);
			urgentQueueSize--;
			pendingUrgentQueueSize++;
		}
	}

	@ObfuscatedName("ne.a(BZ)V")
	public static void sendLoginLogoutPacket(boolean arg0) {
		if (stream == null) {
			return;
		}
		try {
			Packet var1 = new Packet(4);
			var1.p1(arg0 ? 2 : 3);
			var1.p3(0);
			stream.write(4, var1.data);
		} catch (IOException var3) {
			try {
				stream.close();
			} catch (Exception var2) {
			}
			stream = null;
			ioErrorCount++;
		}
	}

	@ObfuscatedName("rc.a(Lbj;IIBIIZ)V")
	public static void queueRequest(Js5Loader arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
		long var6 = (long) (arg1 + (arg2 << 16));
		Js5NetRequest var8 = (Js5NetRequest) pendingUrgentQueue.find(var6);
		if (var8 != null) {
			return;
		}
		Js5NetRequest var9 = (Js5NetRequest) urgentQueue.find(var6);
		if (var9 != null) {
			return;
		}
		Js5NetRequest var10 = (Js5NetRequest) pendingPrefetchQueue.find(var6);
		if (var10 == null) {
			if (!arg5) {
				Js5NetRequest var11 = (Js5NetRequest) prefetchQueue.find(var6);
				if (var11 != null) {
					return;
				}
			}
			Js5NetRequest var12 = new Js5NetRequest();
			var12.padding = arg3;
			var12.expectedCrc = arg4;
			var12.provider = arg0;
			if (arg5) {
				pendingUrgentQueue.put(var6, var12);
				pendingUrgentQueueSize++;
			} else {
				requestQueue.push(var12);
				pendingPrefetchQueue.put(var6, var12);
				pendingPrefetchQueueSize++;
			}
		} else if (arg5) {
			var10.unlink2();
			pendingUrgentQueue.put(var6, var10);
			pendingPrefetchQueueSize--;
			pendingUrgentQueueSize++;
		}
	}

	@ObfuscatedName("fc.a(III)V")
	public static void updateCacheHint(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		Js5NetRequest var4 = (Js5NetRequest) pendingPrefetchQueue.find(var2);
		if (var4 != null) {
			requestQueue.pushFront(var4);
		}
	}

	@ObfuscatedName("e.f(I)V")
	public static void method290() {
		if (stream != null) {
			stream.close();
		}
	}

	@ObfuscatedName("kj.a(IBLbj;)V")
	public static void method814(int arg0, Js5Loader arg1) {
		if (masterIndexBuffer == null) {
			queueRequest(null, 255, 255, (byte) 0, 0, true);
			field141[arg0] = arg1;
		} else {
			masterIndexBuffer.pos = arg0 * 8 + 5;
			int var2 = masterIndexBuffer.g4();
			int var3 = masterIndexBuffer.g4();
			arg1.requestIndex(var2, var3);
		}
	}

	@ObfuscatedName("of.a(ZIZ)I")
	public static int urgentQueueSize() {
		return pendingUrgentQueueSize + urgentQueueSize;
	}

	@ObfuscatedName("uj.a(III)I")
	public static int transferProgress(int arg0, int arg1) {
		long var2 = (long) (arg1 + (arg0 << 16));
		return incomingRequest != null && incomingRequest.key == var2 ? incomingGroupBuffer.pos * 99 / (incomingGroupBuffer.data.length - incomingRequest.padding) + 1 : 0;
	}
}
