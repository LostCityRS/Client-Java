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
	@ObfuscatedName("mb.n")
	public static int crcErrorCount = 0;
	@ObfuscatedName("mb.P")
	public static HashTable prefetchQueue = new HashTable(4096);
	@ObfuscatedName("ra.h")
	public static HashTable pendingUrgentQueue = new HashTable(4096);
	@ObfuscatedName("n.k")
	public static HashTable urgentQueue = new HashTable(32);
	@ObfuscatedName("ia.nc")
	public static HashTable pendingPrefetchQueue = new HashTable(4096);
	@ObfuscatedName("wc.d")
	public static int pendingUrgentQueueSize = 0;
	@ObfuscatedName("g.s")
	public static LinkList2 requestQueue = new LinkList2();
	@ObfuscatedName("i.f")
	public static int pendingPrefetchQueueSize = 0;
	@ObfuscatedName("sd.p")
	public static ClientStream stream;
	@ObfuscatedName("cc.Jb")
	public static int ioErrorCount = 0;
	@ObfuscatedName("pb.a")
	public static long lastTickMs;
	@ObfuscatedName("hc.q")
	public static int timeoutMs = 0;
	@ObfuscatedName("oa.s")
	public static int prefetchQueueSize = 0;
	@ObfuscatedName("f.s")
	public static int field845 = 0;
	@ObfuscatedName("fe.Jc")
	public static Js5NetRequest incomingRequest;
	@ObfuscatedName("r.a")
	public static int incomingChunkPos = 0;
	@ObfuscatedName("rb.sb")
	public static Packet incomingGroupBuffer;
	@ObfuscatedName("ca.B")
	public static byte xorKey = 0;
	@ObfuscatedName("qb.k")
	public static Packet masterIndexBuffer;
	@ObfuscatedName("id.d")
	public static CRC32 crc32 = new CRC32();
	@ObfuscatedName("vd.yd")
	public static boolean incomingUrgentRequest;
	@ObfuscatedName("pb.E")
	public static Packet field2301 = new Packet(8);
	@ObfuscatedName("ib.f")
	public static Js5Loader[] field1350 = new Js5Loader[256];

	@ObfuscatedName("id.a(B)Z")
	public static boolean loop() {
		long var0 = MonotonicTime.currentTime();
		int var2 = (int) (var0 - lastTickMs);
		lastTickMs = var0;
		if (var2 > 200) {
			var2 = 200;
		}
		timeoutMs += var2;
		if (prefetchQueueSize == 0 && field845 == 0 && pendingPrefetchQueueSize == 0 && pendingUrgentQueueSize == 0) {
			return true;
		} else if (stream == null) {
			return false;
		} else {
			try {
				if (timeoutMs > 30000) {
					throw new IOException();
				}
				while (field845 < 20 && pendingUrgentQueueSize > 0) {
					Js5NetRequest var3 = (Js5NetRequest) pendingUrgentQueue.search();
					Packet var4 = new Packet(4);
					var4.p1(1);
					var4.p3((int) var3.key);
					stream.write(4, var4.data);
					urgentQueue.put(var3, var3.key);
					pendingUrgentQueueSize--;
					field845++;
				}
				while (prefetchQueueSize < 20 && pendingPrefetchQueueSize > 0) {
					Js5NetRequest var5 = (Js5NetRequest) requestQueue.next();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.p3((int) var5.key);
					stream.write(4, var6.data);
					var5.unlink2();
					prefetchQueue.put(var5, var5.key);
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
					if (var9 <= 0) {
						int var10 = incomingGroupBuffer.data.length - incomingRequest.padding;
						int var11 = 512 - incomingChunkPos;
						if (var10 - incomingGroupBuffer.pos < var11) {
							var11 = var10 - incomingGroupBuffer.pos;
						}
						if (var11 > var8) {
							var11 = var8;
						}
						stream.read(incomingGroupBuffer.pos, var11, incomingGroupBuffer.data);
						if (xorKey != 0) {
							for (int var12 = 0; var12 < var11; var12++) {
								incomingGroupBuffer.data[incomingGroupBuffer.pos + var12] ^= xorKey;
							}
						}
						incomingGroupBuffer.pos += var11;
						incomingChunkPos += var11;
						if (incomingGroupBuffer.pos == var10) {
							if (incomingRequest.key == 16711935L) {
								masterIndexBuffer = incomingGroupBuffer;
								for (int var14 = 0; var14 < 256; var14++) {
									Js5Loader var15 = field1350[var14];
									if (var15 != null) {
										masterIndexBuffer.pos = var14 * 4 + 5;
										int var16 = masterIndexBuffer.g4();
										var15.requestIndex(var16);
									}
								}
							} else {
								crc32.reset();
								crc32.update(incomingGroupBuffer.data, 0, var10);
								int var13 = (int) crc32.getValue();
								if (incomingRequest.expectedCrc != var13) {
									try {
										stream.close();
									} catch (Exception var28) {
									}
									xorKey = (byte) (Math.random() * 255.0D + 1.0D);
									stream = null;
									crcErrorCount++;
									return false;
								}
								ioErrorCount = 0;
								crcErrorCount = 0;
								incomingRequest.provider.write((incomingRequest.key & 0xFF0000L) == 16711680L, (int) (incomingRequest.key & 0xFFFFL), incomingUrgentRequest, incomingGroupBuffer.data);
							}
							incomingRequest.unlink();
							incomingRequest = null;
							incomingGroupBuffer = null;
							incomingChunkPos = 0;
							if (incomingUrgentRequest) {
								field845--;
							} else {
								prefetchQueueSize--;
							}
						} else {
							if (incomingChunkPos != 512) {
								break;
							}
							incomingChunkPos = 0;
						}
					} else {
						int var17 = var9 - field2301.pos;
						if (var17 > var8) {
							var17 = var8;
						}
						stream.read(field2301.pos, var17, field2301.data);
						if (xorKey != 0) {
							for (int var18 = 0; var18 < var17; var18++) {
								field2301.data[field2301.pos + var18] ^= xorKey;
							}
						}
						field2301.pos += var17;
						if (var9 > field2301.pos) {
							break;
						}
						if (incomingRequest == null) {
							field2301.pos = 0;
							int var19 = field2301.g1();
							int var20 = field2301.g2();
							int var21 = field2301.g1();
							int var22 = field2301.g4();
							long var23 = (long) ((var19 << 16) + var20);
							Js5NetRequest var25 = (Js5NetRequest) urgentQueue.find(var23);
							incomingUrgentRequest = true;
							if (var25 == null) {
								var25 = (Js5NetRequest) prefetchQueue.find(var23);
								incomingUrgentRequest = false;
							}
							if (var25 == null) {
								throw new IOException();
							}
							incomingRequest = var25;
							int var26 = var21 == 0 ? 5 : 9;
							incomingGroupBuffer = new Packet(incomingRequest.padding + var26 + var22);
							incomingGroupBuffer.p1(var21);
							incomingGroupBuffer.p4(var22);
							incomingChunkPos = 8;
							field2301.pos = 0;
						} else if (incomingChunkPos == 0) {
							if (field2301.data[0] == -1) {
								field2301.pos = 0;
								incomingChunkPos = 1;
							} else {
								incomingRequest = null;
							}
						}
					}
				}
				return true;
			} catch (IOException var29) {
				try {
					stream.close();
				} catch (Exception var27) {
				}
				ioErrorCount++;
				stream = null;
				return false;
			}
		}
	}

    @ObfuscatedName("kd.a(ZI)V")
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

	@ObfuscatedName("i.a(ZLu;IIBIB)V")
	public static void queueRequest(boolean arg0, Js5Loader arg1, int arg2, int arg3, byte arg4, int arg5) {
		long var6 = (long) ((arg2 << 16) + arg3);
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
			var12.expectedCrc = arg5;
			var12.padding = arg4;
			var12.provider = arg1;
			if (arg0) {
				pendingUrgentQueue.put(var12, var6);
				pendingUrgentQueueSize++;
			} else {
				requestQueue.push(var12);
				pendingPrefetchQueue.put(var12, var6);
				pendingPrefetchQueueSize++;
			}
		} else if (arg0) {
			var10.unlink2();
			pendingUrgentQueue.put(var10, var6);
			pendingPrefetchQueueSize--;
			pendingUrgentQueueSize++;
		}
	}

	@ObfuscatedName("kc.a(BZZ)I")
	public static int urgentQueueSize() {
		return field845 + pendingUrgentQueueSize;
	}

	@ObfuscatedName("client.a(Lu;BI)V")
	public static void method280(Js5Loader arg0, int arg1) {
		if (masterIndexBuffer == null) {
			queueRequest(true, null, 255, 255, (byte) 0, 0);
			field1350[arg1] = arg0;
		} else {
			masterIndexBuffer.pos = arg1 * 4 + 5;
			int var2 = masterIndexBuffer.g4();
			arg0.requestIndex(var2);
		}
	}

	@ObfuscatedName("f.a(Lvc;IZ)V")
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
		field2301.pos = 0;
		incomingGroupBuffer = null;
		incomingChunkPos = 0;
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
					pendingPrefetchQueue.put(var3, var3.key);
					prefetchQueueSize--;
					pendingPrefetchQueueSize++;
				}
			}
			pendingUrgentQueue.put(var2, var2.key);
			field845--;
			pendingUrgentQueueSize++;
		}
	}

	@ObfuscatedName("h.f(I)V")
	public static void closeStream() {
		if (stream != null) {
			stream.close();
		}
	}

    @ObfuscatedName("mb.a(BII)I")
    public static int transferProgress(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return incomingRequest != null && incomingRequest.key == var2 ? incomingGroupBuffer.pos * 99 / (incomingGroupBuffer.data.length - incomingRequest.padding) + 1 : 0;
    }

    @ObfuscatedName("ld.a(III)V")
    public static void updateCacheHint(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        Js5NetRequest var4 = (Js5NetRequest) pendingPrefetchQueue.find(var2);
        if (var4 != null) {
            requestQueue.pushFront(var4);
        }
    }
}
