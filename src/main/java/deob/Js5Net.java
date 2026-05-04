package deob;

import java.io.IOException;
import java.util.zip.CRC32;

public class Js5Net {
	@ObfuscatedName("ha.t")
	public static final Packet field1408 = new Packet(8);
	@ObfuscatedName("nj.a")
	public static final HashTable field2922 = new HashTable(32);
	@ObfuscatedName("jj.s")
	public static final HashTable field1951 = new HashTable(4096);
	@ObfuscatedName("mg.yb")
	public static final LinkList2 field2559 = new LinkList2();
	@ObfuscatedName("si.K")
	public static final HashTable field3907 = new HashTable(4096);
	@ObfuscatedName("wb.e")
	public static final HashTable field4465 = new HashTable(4096);
	@ObfuscatedName("id.p")
	public static final CRC32 field1732 = new CRC32();
	@ObfuscatedName("ai.a")
	public static final Js5Loader[] field141 = new Js5Loader[256];
	@ObfuscatedName("ng.Zb")
	public static Packet field2908;
	@ObfuscatedName("tg.a")
	public static ClientStream field4033;
	@ObfuscatedName("ce.bb")
	public static int field473 = 0;
	@ObfuscatedName("eh.x")
	public static Js5NetRequest field990;
	@ObfuscatedName("bf.D")
	public static byte field294 = 0;
	@ObfuscatedName("nh.h")
	public static int field2916 = 0;
	@ObfuscatedName("hd.p")
	public static long field1456;
	@ObfuscatedName("ub.Z")
	public static int field4157 = 0;
	@ObfuscatedName("vb.P")
	public static int field4333 = 0;
	@ObfuscatedName("sg.C")
	public static int field3876 = 0;
	@ObfuscatedName("ta.R")
	public static int field3943 = 0;
	@ObfuscatedName("h.K")
	public static int field1389 = 0;
	@ObfuscatedName("mg.Gb")
	public static boolean field2567;
	@ObfuscatedName("nj.q")
	public static int field2938 = 0;
	@ObfuscatedName("hb.T")
	public static Packet field1427;

	@ObfuscatedName("ja.a(I)Z")
	public static boolean method687() {
		long var0 = MonotonicTime.currentTime();
		int var2 = (int) (var0 - field1456);
		if (var2 > 200) {
			var2 = 200;
		}
		field2916 += var2;
		field1456 = var0;
		if (field4333 == 0 && field3876 == 0 && field4157 == 0 && field3943 == 0) {
			return true;
		} else if (field4033 == null) {
			return false;
		} else {
			try {
				if (field2916 > 30000) {
					throw new IOException();
				}
				while (field3876 < 20 && field3943 > 0) {
					Js5NetRequest var3 = (Js5NetRequest) field4465.method1047();
					Packet var4 = new Packet(4);
					var4.p1(1);
					var4.method337((int) var3.key);
					field4033.write(4, var4.data);
					field2922.put(var3.key, var3);
					field3943--;
					field3876++;
				}
				while (field4333 < 20 && field4157 > 0) {
					Js5NetRequest var5 = (Js5NetRequest) field2559.method1381();
					Packet var6 = new Packet(4);
					var6.p1(0);
					var6.method337((int) var5.key);
					field4033.write(4, var6.data);
					var5.method907();
					field1951.put(var5.key, var5);
					field4333++;
					field4157--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = field4033.available();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					byte var9 = 0;
					field2916 = 0;
					if (field990 == null) {
						var9 = 8;
					} else if (field473 == 0) {
						var9 = 1;
					}
					if (var9 > 0) {
						int var10 = var9 - field1408.pos;
						if (var8 < var10) {
							var10 = var8;
						}
						field4033.read(field1408.pos, field1408.data, var10);
						if (field294 != 0) {
							for (int var11 = 0; var11 < var10; var11++) {
								field1408.data[field1408.pos + var11] ^= field294;
							}
						}
						field1408.pos += var10;
						if (var9 > field1408.pos) {
							break;
						}
						if (field990 == null) {
							field1408.pos = 0;
							int var12 = field1408.g1();
							int var13 = field1408.g2();
							long var14 = (long) (var13 + (var12 << 16));
							int var16 = field1408.g1();
							int var17 = field1408.g4();
							Js5NetRequest var18 = (Js5NetRequest) field2922.method1049(var14);
							field2567 = true;
							if (var18 == null) {
								var18 = (Js5NetRequest) field1951.method1049(var14);
								field2567 = false;
							}
							if (var18 == null) {
								throw new IOException();
							}
							field990 = var18;
							int var19 = var16 == 0 ? 5 : 9;
							field2908 = new Packet(var17 + var19 + field990.field1782);
							field2908.p1(var16);
							field2908.p4(var17);
							field1408.pos = 0;
							field473 = 8;
						} else if (field473 == 0) {
							if (field1408.data[0] == -1) {
								field1408.pos = 0;
								field473 = 1;
							} else {
								field990 = null;
							}
						}
					} else {
						int var20 = field2908.data.length - field990.field1782;
						int var21 = 512 - field473;
						if (var21 > var20 - field2908.pos) {
							var21 = var20 - field2908.pos;
						}
						if (var8 < var21) {
							var21 = var8;
						}
						field4033.read(field2908.pos, field2908.data, var21);
						if (field294 != 0) {
							for (int var22 = 0; var22 < var21; var22++) {
								field2908.data[var22 + field2908.pos] ^= field294;
							}
						}
						field2908.pos += var21;
						field473 += var21;
						if (field2908.pos == var20) {
							if (field990.key == 16711935L) {
								field1427 = field2908;
								for (int var23 = 0; var23 < 256; var23++) {
									Js5Loader var24 = field141[var23];
									if (var24 != null) {
										field1427.pos = var23 * 8 + 5;
										int var25 = field1427.g4();
										int var26 = field1427.g4();
										var24.method109(var25, var26);
									}
								}
							} else {
								field1732.reset();
								field1732.update(field2908.data, 0, var20);
								int var27 = (int) field1732.getValue();
								if (field990.field1780 != var27) {
									try {
										field4033.close();
									} catch (Exception var29) {
									}
									field294 = (byte) (Math.random() * 255.0D + 1.0D);
									field2938++;
									field4033 = null;
									return false;
								}
								field2938 = 0;
								field1389 = 0;
								field990.field1787.method105((int) (field990.key & 0xFFFFL), field2908.data, field2567, (field990.key & 0xFF0000L) == 16711680L);
							}
							field990.unlink();
							field473 = 0;
							if (field2567) {
								field3876--;
							} else {
								field4333--;
							}
							field990 = null;
							field2908 = null;
						} else {
							if (field473 != 512) {
								break;
							}
							field473 = 0;
						}
					}
				}
				return true;
			} catch (IOException var30) {
				try {
					field4033.close();
				} catch (Exception var28) {
				}
				field1389++;
				field4033 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("hc.a(ZILmf;)V")
	public static void method529(boolean arg0, ClientStream arg1) {
		if (field4033 != null) {
			try {
				field4033.close();
			} catch (Exception var7) {
			}
			field4033 = null;
		}
		field4033 = arg1;
		method988(arg0);
		field2908 = null;
		field473 = 0;
		field990 = null;
		field1408.pos = 0;
		while (true) {
			Js5NetRequest var2 = (Js5NetRequest) field2922.method1047();
			if (var2 == null) {
				while (true) {
					Js5NetRequest var3 = (Js5NetRequest) field1951.method1047();
					if (var3 == null) {
						if (field294 != 0) {
							try {
								Packet var4 = new Packet(4);
								var4.p1(4);
								var4.p1(field294);
								var4.method305(0);
								field4033.write(4, var4.data);
							} catch (IOException var6) {
								try {
									field4033.close();
								} catch (Exception var5) {
								}
								field4033 = null;
								field1389++;
							}
						}
						field2916 = 0;
						field1456 = MonotonicTime.currentTime();
						return;
					}
					field2559.method1388(var3);
					field3907.put(var3.key, var3);
					field4157++;
					field4333--;
				}
			}
			field4465.put(var2.key, var2);
			field3876--;
			field3943++;
		}
	}

	@ObfuscatedName("ne.a(BZ)V")
	public static void method988(boolean arg0) {
		if (field4033 == null) {
			return;
		}
		try {
			Packet var1 = new Packet(4);
			var1.p1(arg0 ? 2 : 3);
			var1.method337(0);
			field4033.write(4, var1.data);
		} catch (IOException var3) {
			try {
				field4033.close();
			} catch (Exception var2) {
			}
			field4033 = null;
			field1389++;
		}
	}
}
