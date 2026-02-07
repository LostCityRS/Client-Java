package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.client.GameShell;
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
	public static Packet field1354 = new Packet(8);
	@ObfuscatedName("fb.O")
	public static int field921 = 0;
	@ObfuscatedName("pb.vb")
	public static Packet field2529;
	@ObfuscatedName("vc.N")
	public static Js5NetRequest field3372;
	@ObfuscatedName("qa.d")
	public static HashTable field2616 = new HashTable(32);
	@ObfuscatedName("eb.f")
	public static HashTable field593 = new HashTable(4096);
	@ObfuscatedName("ta.K")
	public static int field3040 = 0;
	@ObfuscatedName("td.cb")
	public static long field3157;
	@ObfuscatedName("sa.d")
	public static LinkList2 field2918 = new LinkList2();
	@ObfuscatedName("t.j")
	public static HashTable field3029 = new HashTable(4096);
	@ObfuscatedName("ed.r")
	public static int field697 = 0;
	@ObfuscatedName("jd.wb")
	public static int field1579 = 0;
	@ObfuscatedName("o.ib")
	public static HashTable field2212 = new HashTable(4096);
	@ObfuscatedName("we.t")
	public static int field3627 = 0;
	@ObfuscatedName("jb.r")
	public static int field1494 = 0;
	@ObfuscatedName("nb.H")
	public static byte field2118 = 0;
	@ObfuscatedName("be.z")
	public static boolean field219;
	@ObfuscatedName("ra.i")
	public static Packet masterIndexBuffer;
	@ObfuscatedName("me.t")
	public static Js5Loader[] field2047 = new Js5Loader[256];
	@ObfuscatedName("da.J")
	public static CRC32 field415 = new CRC32();

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
		method740(arg1);
		field1354.pos = 0;
		field921 = 0;
		field2529 = null;
		field3372 = null;
		while (true) {
			Js5NetRequest var2 = (Js5NetRequest) field2616.search();
			if (var2 == null) {
				while (true) {
					Js5NetRequest var3 = (Js5NetRequest) field593.search();
					if (var3 == null) {
						if (field2118 != 0) {
							try {
								Packet var4 = new Packet(4);
								var4.p1(4);
								var4.p1(field2118);
								var4.method513(0);
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
						field3040 = 0;
						field3157 = MonotonicTime.currentTime();
						return;
					}
					field2918.method1168(var3);
					field3029.put(var3.field3324, var3);
					field697++;
					field1579--;
				}
			}
			field2212.put(var2.field3324, var2);
			field3627++;
			field1494--;
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
		Js5NetRequest var8 = (Js5NetRequest) field2212.method1196(var6);
		if (var8 != null) {
			return;
		}
		Js5NetRequest var9 = (Js5NetRequest) field2616.method1196(var6);
		if (var9 != null) {
			return;
		}
		Js5NetRequest var10 = (Js5NetRequest) field3029.method1196(var6);
		if (var10 == null) {
			if (!arg0) {
				Js5NetRequest var11 = (Js5NetRequest) field593.method1196(var6);
				if (var11 != null) {
					return;
				}
			}
			Js5NetRequest var12 = new Js5NetRequest();
			var12.field2587 = arg1;
			var12.field2589 = arg4;
			var12.field2578 = arg5;
			if (arg0) {
				field2212.put(var6, var12);
				field3627++;
			} else {
				field2918.method1171(var12);
				field3029.put(var6, var12);
				field697++;
			}
		} else if (arg0) {
			var10.method68();
			field2212.put(var6, var10);
			field3627++;
			field697--;
		}
	}

	@ObfuscatedName("nd.a(IZ)V")
	public static void method740(boolean arg0) {
		if (stream == null) {
			return;
		}
		try {
			Packet var1 = new Packet(4);
			var1.p1(arg0 ? 2 : 3);
			var1.method550(0);
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

	@ObfuscatedName("ja.c(B)V")
	public static void shutdown() {
		Object var0 = Js5NetThread.lock;
		synchronized (var0) {
			if (Js5NetThread.keepAlive != 0) {
				Js5NetThread.keepAlive = 1;
				try {
					Js5NetThread.lock.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("q.c(B)V")
	public static void method875() {
		Object var0 = Js5NetThread.lock;
		synchronized (Js5NetThread.lock) {
			if (Js5NetThread.keepAlive == 0) {
				GameShell.signlink.threadreq(5, new Js5NetThread(), 112);
			}
			Js5NetThread.keepAlive = 600;
		}
	}

	@ObfuscatedName("jf.a(I)Z")
	public static boolean method562() {
		long var0 = MonotonicTime.currentTime();
		int var2 = (int) (var0 - field3157);
		if (var2 > 200) {
			var2 = 200;
		}
		field3040 += var2;
		field3157 = var0;
		if (field1579 == 0 && field1494 == 0 && field697 == 0 && field3627 == 0) {
			return true;
		} else if (stream == null) {
			return false;
		} else {
			try {
				if (field3040 > 30000) {
					throw new IOException();
				}
				while (field1494 < 20 && field3627 > 0) {
					Js5NetRequest var3 = (Js5NetRequest) field2212.search();
					Packet var4 = new Packet(4);
					var4.p1(1);
					var4.method550((int) var3.field3324);
					stream.write(var4.data, 4);
					field2616.put(var3.field3324, var3);
					field1494++;
					field3627--;
				}
				while (field1579 < 20 && field697 > 0) {
					Js5NetRequest var5 = (Js5NetRequest) field2918.method1170();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.method550((int) var5.field3324);
					stream.write(var6.data, 4);
					var5.method68();
					field593.put(var5.field3324, var5);
					field1579++;
					field697--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = stream.available();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					field3040 = 0;
					byte var9 = 0;
					if (field3372 == null) {
						var9 = 8;
					} else if (field921 == 0) {
						var9 = 1;
					}
					if (var9 > 0) {
						int var10 = var9 - field1354.pos;
						if (var8 < var10) {
							var10 = var8;
						}
						stream.read(field1354.pos, field1354.data, var10);
						if (field2118 != 0) {
							for (int var11 = 0; var11 < var10; var11++) {
								field1354.data[var11 + field1354.pos] ^= field2118;
							}
						}
						field1354.pos += var10;
						if (field1354.pos < var9) {
							break;
						}
						if (field3372 == null) {
							field1354.pos = 0;
							int var12 = field1354.g1();
							int var13 = field1354.g2();
							long var14 = (long) (var13 + (var12 << 16));
							int var16 = field1354.g1();
							int var17 = field1354.g4();
							Js5NetRequest var18 = (Js5NetRequest) field2616.method1196(var14);
							field219 = true;
							if (var18 == null) {
								var18 = (Js5NetRequest) field593.method1196(var14);
								field219 = false;
							}
							if (var18 == null) {
								throw new IOException();
							}
							field3372 = var18;
							int var19 = var16 == 0 ? 5 : 9;
							field2529 = new Packet(field3372.field2587 + var17 + var19);
							field2529.p1(var16);
							field2529.p4(var17);
							field1354.pos = 0;
							field921 = 8;
						} else if (field921 == 0) {
							if (field1354.data[0] == -1) {
								field1354.pos = 0;
								field921 = 1;
							} else {
								field3372 = null;
							}
						}
					} else {
						int var20 = field2529.data.length - field3372.field2587;
						int var21 = 512 - field921;
						if (var20 - field2529.pos < var21) {
							var21 = var20 - field2529.pos;
						}
						if (var21 > var8) {
							var21 = var8;
						}
						stream.read(field2529.pos, field2529.data, var21);
						if (field2118 != 0) {
							for (int var22 = 0; var22 < var21; var22++) {
								field2529.data[field2529.pos + var22] = (byte) (field2529.data[field2529.pos + var22] ^ field2118);
							}
						}
						field921 += var21;
						field2529.pos += var21;
						if (var20 == field2529.pos) {
							if (field3372.field3324 == 16711935L) {
								masterIndexBuffer = field2529;
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
								field415.reset();
								field415.update(field2529.data, 0, var20);
								int var23 = (int) field415.getValue();
								if (var23 != field3372.field2578) {
									try {
										stream.close();
									} catch (Exception var29) {
									}
									crcErrorCount++;
									field2118 = (byte) (Math.random() * 255.0D + 1.0D);
									stream = null;
									return false;
								}
								crcErrorCount = 0;
								ioErrorCount = 0;
								field3372.field2589.method335(field219, (int) (field3372.field3324 & 0xFFFFL), (field3372.field3324 & 0xFF0000L) == 16711680L, field2529.data);
							}
							field3372.unlink();
							if (field219) {
								field1494--;
							} else {
								field1579--;
							}
							field2529 = null;
							field3372 = null;
							field921 = 0;
						} else {
							if (field921 != 512) {
								break;
							}
							field921 = 0;
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
	public static void method226(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		Js5NetRequest var4 = (Js5NetRequest) field3029.method1196(var2);
		if (var4 != null) {
			field2918.method1168(var4);
		}
	}

	@ObfuscatedName("ee.a(ZZI)I")
	public static int method293() {
		return field3627 + field1494;
	}
}
