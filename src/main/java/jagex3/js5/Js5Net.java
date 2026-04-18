package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.LinkList2;
import jagex3.io.ClientStream;
import jagex3.io.Packet;

import java.io.IOException;
import java.util.zip.CRC32;

public class Js5Net {
	@ObfuscatedName("mb.n")
	public static int field1803 = 0;
	@ObfuscatedName("mb.P")
	public static HashTable field1831 = new HashTable(4096);
	@ObfuscatedName("ra.h")
	public static HashTable field2596 = new HashTable(4096);
	@ObfuscatedName("n.k")
	public static HashTable field1917 = new HashTable(32);
	@ObfuscatedName("ia.nc")
	public static HashTable field1328 = new HashTable(4096);
	@ObfuscatedName("wc.d")
	public static int field3285 = 0;
	@ObfuscatedName("g.s")
	public static LinkList2 field996 = new LinkList2();
	@ObfuscatedName("i.f")
	public static int field1260 = 0;
	@ObfuscatedName("sd.p")
	public static ClientStream field2769;
	@ObfuscatedName("cc.Jb")
	public static int field525 = 0;
	@ObfuscatedName("pb.a")
	public static long field2271;
	@ObfuscatedName("hc.q")
	public static int field1189 = 0;
	@ObfuscatedName("oa.s")
	public static int field2144 = 0;
	@ObfuscatedName("f.s")
	public static int field845 = 0;
	@ObfuscatedName("fe.Jc")
	public static Js5NetRequest field967;
	@ObfuscatedName("r.a")
	public static int field2559 = 0;
	@ObfuscatedName("rb.sb")
	public static Packet field2613;
	@ObfuscatedName("ca.B")
	public static byte field476 = 0;
	@ObfuscatedName("qb.k")
	public static Packet field2415;
	@ObfuscatedName("id.d")
	public static CRC32 field1363 = new CRC32();
	@ObfuscatedName("vd.yd")
	public static boolean field3180;
	@ObfuscatedName("pb.E")
	public static Packet field2301 = new Packet(8);
	@ObfuscatedName("ib.f")
	public static Js5Loader[] field1350 = new Js5Loader[256];

	@ObfuscatedName("id.a(B)Z")
	public static boolean loop() {
		long var0 = Statics.currentTime();
		int var2 = (int) (var0 - field2271);
		field2271 = var0;
		if (var2 > 200) {
			var2 = 200;
		}
		field1189 += var2;
		if (field2144 == 0 && field845 == 0 && field1260 == 0 && field3285 == 0) {
			return true;
		} else if (field2769 == null) {
			return false;
		} else {
			try {
				if (field1189 > 30000) {
					throw new IOException();
				}
				while (field845 < 20 && field3285 > 0) {
					Js5NetRequest var3 = (Js5NetRequest) field2596.search();
					Packet var4 = new Packet(4);
					var4.p1(1);
					var4.method153((int) var3.key);
					field2769.write(4, var4.data);
					field1917.put(var3, var3.key);
					field3285--;
					field845++;
				}
				while (field2144 < 20 && field1260 > 0) {
					Js5NetRequest var5 = (Js5NetRequest) field996.next();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.method153((int) var5.key);
					field2769.write(4, var6.data);
					var5.unlink2();
					field1831.put(var5, var5.key);
					field2144++;
					field1260--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = field2769.available();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					field1189 = 0;
					byte var9 = 0;
					if (field967 == null) {
						var9 = 8;
					} else if (field2559 == 0) {
						var9 = 1;
					}
					if (var9 <= 0) {
						int var10 = field2613.data.length - field967.field2619;
						int var11 = 512 - field2559;
						if (var10 - field2613.pos < var11) {
							var11 = var10 - field2613.pos;
						}
						if (var11 > var8) {
							var11 = var8;
						}
						field2769.read(field2613.pos, var11, field2613.data);
						if (field476 != 0) {
							for (int var12 = 0; var12 < var11; var12++) {
								field2613.data[field2613.pos + var12] ^= field476;
							}
						}
						field2613.pos += var11;
						field2559 += var11;
						if (field2613.pos == var10) {
							if (field967.key == 16711935L) {
								field2415 = field2613;
								for (int var14 = 0; var14 < 256; var14++) {
									Js5Loader var15 = field1350[var14];
									if (var15 != null) {
										field2415.pos = var14 * 4 + 5;
										int var16 = field2415.method167();
										var15.method980(var16);
									}
								}
							} else {
								field1363.reset();
								field1363.update(field2613.data, 0, var10);
								int var13 = (int) field1363.getValue();
								if (field967.field2624 != var13) {
									try {
										field2769.close();
									} catch (Exception var28) {
									}
									field476 = (byte) (Math.random() * 255.0D + 1.0D);
									field2769 = null;
									field1803++;
									return false;
								}
								field525 = 0;
								field1803 = 0;
								field967.field2615.method976((field967.key & 0xFF0000L) == 16711680L, (int) (field967.key & 0xFFFFL), field3180, field2613.data);
							}
							field967.unlink();
							field967 = null;
							field2613 = null;
							field2559 = 0;
							if (field3180) {
								field845--;
							} else {
								field2144--;
							}
						} else {
							if (field2559 != 512) {
								break;
							}
							field2559 = 0;
						}
					} else {
						int var17 = var9 - field2301.pos;
						if (var17 > var8) {
							var17 = var8;
						}
						field2769.read(field2301.pos, var17, field2301.data);
						if (field476 != 0) {
							for (int var18 = 0; var18 < var17; var18++) {
								field2301.data[field2301.pos + var18] ^= field476;
							}
						}
						field2301.pos += var17;
						if (var9 > field2301.pos) {
							break;
						}
						if (field967 == null) {
							field2301.pos = 0;
							int var19 = field2301.g1();
							int var20 = field2301.g2();
							int var21 = field2301.g1();
							int var22 = field2301.method167();
							long var23 = (long) ((var19 << 16) + var20);
							Js5NetRequest var25 = (Js5NetRequest) field1917.find(var23);
							field3180 = true;
							if (var25 == null) {
								var25 = (Js5NetRequest) field1831.find(var23);
								field3180 = false;
							}
							if (var25 == null) {
								throw new IOException();
							}
							field967 = var25;
							int var26 = var21 == 0 ? 5 : 9;
							field2613 = new Packet(field967.field2619 + var26 + var22);
							field2613.p1(var21);
							field2613.p4(var22);
							field2559 = 8;
							field2301.pos = 0;
						} else if (field2559 == 0) {
							if (field2301.data[0] == -1) {
								field2301.pos = 0;
								field2559 = 1;
							} else {
								field967 = null;
							}
						}
					}
				}
				return true;
			} catch (IOException var29) {
				try {
					field2769.close();
				} catch (Exception var27) {
				}
				field525++;
				field2769 = null;
				return false;
			}
		}
	}

    @ObfuscatedName("kd.a(ZI)V")
    public static void method617(boolean arg0) {
        if (field2769 == null) {
            return;
        }
        try {
            Packet var1 = new Packet(4);
            var1.p1(arg0 ? 2 : 3);
            var1.method153(0);
            field2769.write(4, var1.data);
        } catch (IOException var3) {
            try {
                field2769.close();
            } catch (Exception var2) {
            }
            field2769 = null;
            field525++;
        }
    }

	@ObfuscatedName("i.a(ZLu;IIBIB)V")
	public static void method495(boolean arg0, Js5Loader arg1, int arg2, int arg3, byte arg4, int arg5) {
		long var6 = (long) ((arg2 << 16) + arg3);
		Js5NetRequest var8 = (Js5NetRequest) field2596.find(var6);
		if (var8 != null) {
			return;
		}
		Js5NetRequest var9 = (Js5NetRequest) field1917.find(var6);
		if (var9 != null) {
			return;
		}
		Js5NetRequest var10 = (Js5NetRequest) field1328.find(var6);
		if (var10 == null) {
			if (!arg0) {
				Js5NetRequest var11 = (Js5NetRequest) field1831.find(var6);
				if (var11 != null) {
					return;
				}
			}
			Js5NetRequest var12 = new Js5NetRequest();
			var12.field2624 = arg5;
			var12.field2619 = arg4;
			var12.field2615 = arg1;
			if (arg0) {
				field2596.put(var12, var6);
				field3285++;
			} else {
				field996.push(var12);
				field1328.put(var12, var6);
				field1260++;
			}
		} else if (arg0) {
			var10.unlink2();
			field2596.put(var10, var6);
			field1260--;
			field3285++;
		}
	}

	@ObfuscatedName("kc.a(BZZ)I")
	public static int method614() {
		return field845 + field3285;
	}

	@ObfuscatedName("client.a(Lu;BI)V")
	public static void method280(Js5Loader arg0, int arg1) {
		if (field2415 == null) {
			method495(true, null, 255, 255, (byte) 0, 0);
			field1350[arg1] = arg0;
		} else {
			field2415.pos = arg1 * 4 + 5;
			int var2 = field2415.method167();
			arg0.method980(var2);
		}
	}

	@ObfuscatedName("f.a(Lvc;IZ)V")
	public static void method381(ClientStream arg0, boolean arg1) {
		if (field2769 != null) {
			try {
				field2769.close();
			} catch (Exception var7) {
			}
			field2769 = null;
		}
		field2769 = arg0;
		method617(arg1);
		field2301.pos = 0;
		field2613 = null;
		field2559 = 0;
		field967 = null;
		while (true) {
			Js5NetRequest var2 = (Js5NetRequest) field1917.search();
			if (var2 == null) {
				while (true) {
					Js5NetRequest var3 = (Js5NetRequest) field1831.search();
					if (var3 == null) {
						if (field476 != 0) {
							try {
								Packet var4 = new Packet(4);
								var4.p1(4);
								var4.p1(field476);
								var4.method150(0);
								field2769.write(4, var4.data);
							} catch (IOException var6) {
								try {
									field2769.close();
								} catch (Exception var5) {
								}
								field2769 = null;
								field525++;
							}
						}
						field1189 = 0;
						field2271 = Statics.currentTime();
						return;
					}
					field996.pushFront(var3);
					field1328.put(var3, var3.key);
					field2144--;
					field1260++;
				}
			}
			field2596.put(var2, var2.key);
			field845--;
			field3285++;
		}
	}

	@ObfuscatedName("h.f(I)V")
	public static void method447() {
		if (field2769 != null) {
			field2769.close();
		}
	}

    @ObfuscatedName("mb.a(BII)I")
    public static int method684(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return field967 != null && field967.key == var2 ? field2613.pos * 99 / (field2613.data.length - field967.field2619) + 1 : 0;
    }

    @ObfuscatedName("ld.a(III)V")
    public static void method661(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        Js5NetRequest var4 = (Js5NetRequest) field1328.find(var2);
        if (var4 != null) {
            field996.pushFront(var4);
        }
    }
}
