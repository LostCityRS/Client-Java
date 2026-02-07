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
	@ObfuscatedName("client.cb")
	public static int crcErrorCount = 0;
	@ObfuscatedName("ie.R")
	public static int ioErrorCount = 0;
	@ObfuscatedName("ac.kb")
	public static ClientStream stream;
	@ObfuscatedName("ie.Q")
	public static Packet incomingTransferHeader = new Packet(8);
	@ObfuscatedName("fb.O")
	public static int incomingChunkPos = 0;
	@ObfuscatedName("pb.vb")
	public static Packet incomingGroupBuffer;
	@ObfuscatedName("vc.N")
	public static Js5NetRequest incomingRequest;
	@ObfuscatedName("qa.d")
	public static HashTable urgentQueue = new HashTable(32);
	@ObfuscatedName("eb.f")
	public static HashTable prefetchQueue = new HashTable(4096);
	@ObfuscatedName("ta.K")
	public static int timeoutMs = 0;
	@ObfuscatedName("td.cb")
	public static long lastTickMs;
	@ObfuscatedName("sa.d")
	public static LinkList2 requestQueue = new LinkList2();
	@ObfuscatedName("t.j")
	public static HashTable pendingPrefetchQueue = new HashTable(4096);
	@ObfuscatedName("ed.r")
	public static int pendingPrefetchQueueSize = 0;
	@ObfuscatedName("jd.wb")
	public static int prefetchQueueSize = 0;
	@ObfuscatedName("o.ib")
	public static HashTable pendingUrgentQueue = new HashTable(4096);
	@ObfuscatedName("we.t")
	public static int pendingUrgentQueueSize = 0;
	@ObfuscatedName("jb.r")
	public static int urgentQueueSize = 0;
	@ObfuscatedName("nb.H")
	public static byte xorKey = 0;
	@ObfuscatedName("be.z")
	public static boolean incomingUrgentRequest;
	@ObfuscatedName("ra.i")
	public static Packet masterIndexBuffer;
	@ObfuscatedName("me.t")
	public static Js5Loader[] field2047 = new Js5Loader[256];
	@ObfuscatedName("da.J")
	public static CRC32 crc32 = new CRC32();

	@ObfuscatedName("tc.a(Lb;IZ)V")
	public static void init(ClientStream arg0, boolean arg1) {
		if (stream != null) {
			try {
				stream.close();
			} catch (Exception var7) {
			}
			stream = null;
		}
		stream = arg0;
		sendLoginLogoutPacket(arg1);
		incomingTransferHeader.pos = 0;
		incomingChunkPos = 0;
		incomingGroupBuffer = null;
		incomingRequest = null;
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
								stream.write(var4.data, 4);
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
			pendingUrgentQueueSize++;
			urgentQueueSize--;
		}
	}

	@ObfuscatedName("fe.a(Z)V")
	public static void closeStream() {
		if (stream != null) {
			stream.close();
		}
	}

	@ObfuscatedName("sa.a(ZBBIILga;I)V")
	public static void queueRequest(boolean arg0, byte arg1, int arg2, int arg3, Js5Loader arg4, int arg5) {
		long var6 = (long) (arg2 + (arg3 << 16));
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
			if (!arg0) {
				Js5NetRequest var11 = (Js5NetRequest) prefetchQueue.find(var6);
				if (var11 != null) {
					return;
				}
			}
			Js5NetRequest var12 = new Js5NetRequest();
			var12.padding = arg1;
			var12.provider = arg4;
			var12.expectedCrc = arg5;
			if (arg0) {
				pendingUrgentQueue.put(var6, var12);
				pendingUrgentQueueSize++;
			} else {
				requestQueue.push(var12);
				pendingPrefetchQueue.put(var6, var12);
				pendingPrefetchQueueSize++;
			}
		} else if (arg0) {
			var10.unlink2();
			pendingUrgentQueue.put(var6, var10);
			pendingUrgentQueueSize++;
			pendingPrefetchQueueSize--;
		}
	}

	@ObfuscatedName("nd.a(IZ)V")
	public static void sendLoginLogoutPacket(boolean arg0) {
		if (stream == null) {
			return;
		}
		try {
			Packet var1 = new Packet(4);
			var1.p1(arg0 ? 2 : 3);
			var1.p3(0);
			stream.write(var1.data, 4);
		} catch (IOException var3) {
			try {
				stream.close();
			} catch (Exception var2) {
			}
			stream = null;
			ioErrorCount++;
		}
	}

	@ObfuscatedName("jf.a(I)Z")
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
					stream.write(var4.data, 4);
					urgentQueue.put(var3.key, var3);
					urgentQueueSize++;
					pendingUrgentQueueSize--;
				}
				while (prefetchQueueSize < 20 && pendingPrefetchQueueSize > 0) {
					Js5NetRequest var5 = (Js5NetRequest) requestQueue.next();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.p3((int) var5.key);
					stream.write(var6.data, 4);
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
					timeoutMs = 0;
					byte var9 = 0;
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
								incomingTransferHeader.data[var11 + incomingTransferHeader.pos] ^= xorKey;
							}
						}
						incomingTransferHeader.pos += var10;
						if (incomingTransferHeader.pos < var9) {
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
							incomingGroupBuffer = new Packet(incomingRequest.padding + var17 + var19);
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
						if (var20 - incomingGroupBuffer.pos < var21) {
							var21 = var20 - incomingGroupBuffer.pos;
						}
						if (var21 > var8) {
							var21 = var8;
						}
						stream.read(incomingGroupBuffer.pos, incomingGroupBuffer.data, var21);
						if (xorKey != 0) {
							for (int var22 = 0; var22 < var21; var22++) {
								incomingGroupBuffer.data[incomingGroupBuffer.pos + var22] = (byte) (incomingGroupBuffer.data[incomingGroupBuffer.pos + var22] ^ xorKey);
							}
						}
						incomingChunkPos += var21;
						incomingGroupBuffer.pos += var21;
						if (var20 == incomingGroupBuffer.pos) {
							if (incomingRequest.key == 16711935L) {
								masterIndexBuffer = incomingGroupBuffer;
								for (int var24 = 0; var24 < 256; var24++) {
									Js5Loader var25 = field2047[var24];
									if (var25 != null) {
										masterIndexBuffer.pos = var24 * 8 + 5;
										int var26 = masterIndexBuffer.g4();
										int var27 = masterIndexBuffer.g4();
										var25.requestIndex(var27, var26);
									}
								}
							} else {
								crc32.reset();
								crc32.update(incomingGroupBuffer.data, 0, var20);
								int var23 = (int) crc32.getValue();
								if (var23 != incomingRequest.expectedCrc) {
									try {
										stream.close();
									} catch (Exception var29) {
									}
									crcErrorCount++;
									xorKey = (byte) (Math.random() * 255.0D + 1.0D);
									stream = null;
									return false;
								}
								crcErrorCount = 0;
								ioErrorCount = 0;
								incomingRequest.provider.write(incomingUrgentRequest, (int) (incomingRequest.key & 0xFFFFL), (incomingRequest.key & 0xFF0000L) == 16711680L, incomingGroupBuffer.data);
							}
							incomingRequest.unlink();
							if (incomingUrgentRequest) {
								urgentQueueSize--;
							} else {
								prefetchQueueSize--;
							}
							incomingGroupBuffer = null;
							incomingRequest = null;
							incomingChunkPos = 0;
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
				stream = null;
				ioErrorCount++;
				return false;
			}
		}
	}

	@ObfuscatedName("eb.a(III)V")
	public static void updateCacheHint(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		Js5NetRequest var4 = (Js5NetRequest) pendingPrefetchQueue.find(var2);
		if (var4 != null) {
			requestQueue.pushFront(var4);
		}
	}

	@ObfuscatedName("ee.a(ZZI)I")
	public static int urgentQueueSize() {
		return pendingUrgentQueueSize + urgentQueueSize;
	}

	@ObfuscatedName("hc.a(ILga;I)V")
	public static void method405(int arg0, Js5Loader arg1) {
		if (masterIndexBuffer == null) {
			queueRequest(true, (byte) 0, 255, 255, null, 0);
			field2047[arg0] = arg1;
		} else {
			masterIndexBuffer.pos = arg0 * 8 + 5;
			int var2 = masterIndexBuffer.g4();
			int var3 = masterIndexBuffer.g4();
			arg1.requestIndex(var3, var2);
		}
	}

	@ObfuscatedName("j.a(IIB)I")
	public static int transferProgress(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		return incomingRequest != null && var2 == incomingRequest.key ? incomingGroupBuffer.pos * 99 / (incomingGroupBuffer.data.length - incomingRequest.padding) + 1 : 0;
	}
}
