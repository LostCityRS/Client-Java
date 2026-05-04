package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.constants.Text;
import jagex3.graphics.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.js5.Js5Net;
import jagex3.jstring.JagString;
import jagex3.midi2.MidiManager;
import jagex3.util.MillisTimer;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("tb.q")
	public static final JagString field3972 = JagString.wrap("");
	@ObfuscatedName("wa.b")
	public static final int[] field4454 = new int[256];
	@ObfuscatedName("tb.z")
	public static JagString field3981 = field3972;
	@ObfuscatedName("tb.y")
	public static JagString field3980 = field3972;
	@ObfuscatedName("tb.x")
	public static JagString field3979 = field3972;
	@ObfuscatedName("tb.o")
	public static JagString loginPass = field3972;
	@ObfuscatedName("tb.l")
	public static JagString loginUser = field3972;
	@ObfuscatedName("tb.h")
	public static JagString loadString = field3972;
	@ObfuscatedName("ae.Wb")
	public static int loadPos = 10;
	@ObfuscatedName("ib.B")
	public static boolean field1707;
	@ObfuscatedName("i.Q")
	public static SoftwarePix32 field1640;
	@ObfuscatedName("jg.A")
	public static SoftwarePix32 field1901;
	@ObfuscatedName("ta.U")
	public static Pix8 field3946;
	@ObfuscatedName("wc.D")
	public static Pix8 field4473;
	@ObfuscatedName("li.G")
	public static Pix8 field2416;
	@ObfuscatedName("va.E")
	public static SoftwarePix8[] field4320;
	@ObfuscatedName("kg.X")
	public static Pix8[] field2095;
	@ObfuscatedName("ab.g")
	public static int[] field32;
	@ObfuscatedName("bc.m")
	public static int[] field234;
	@ObfuscatedName("od.E")
	public static int[] field3014;
	@ObfuscatedName("oe.r")
	public static int[] field3034;
	@ObfuscatedName("uc.c")
	public static int[] field4169;
	@ObfuscatedName("kd.db")
	public static int[] field2049;
	@ObfuscatedName("mj.k")
	public static int[] field2609;
	@ObfuscatedName("fi.B")
	public static int field1182 = 0;
	@ObfuscatedName("tb.d")
	public static boolean field3959 = false;
	@ObfuscatedName("fi.D")
	public static int field1183 = 255;
	@ObfuscatedName("m.r")
	public static boolean field2460 = false;
	@ObfuscatedName("re.a")
	public static int[] field3667;
	@ObfuscatedName("d.cb")
	public static SoftwarePix32 field589;
	@ObfuscatedName("ia.o")
	public static SoftwarePix32 field1675;
	@ObfuscatedName("pd.fb")
	public static Pix8[] field3217;
	@ObfuscatedName("c.G")
	public static Pix8[] field372;
	@ObfuscatedName("di.eb")
	public static Pix8[] field736;
	@ObfuscatedName("hc.ab")
	public static Pix32[] field1448;
	@ObfuscatedName("ci.r")
	public static Pix8 field518;
	@ObfuscatedName("hj.x")
	public static int field1581 = -1;
	@ObfuscatedName("jf.kb")
	public static int field1895 = 0;
	@ObfuscatedName("sf.e")
	public static WorldEntry[] field3845;
	@ObfuscatedName("ob.f")
	public static int field2969 = 0;
	@ObfuscatedName("oi.a")
	public static int field3099 = 0;
	@ObfuscatedName("li.E")
	public static HTTPRequest field2414;
	@ObfuscatedName("cd.k")
	public static int[] field461 = new int[] { 0, 1, 2, 3 };
	@ObfuscatedName("ia.z")
	public static int[] field1686 = new int[] { 1, 1, 1, 1 };

	@ObfuscatedName("rc.a(Lcc;BLcc;)V")
    public static void draw(PixfontGeneric arg0, PixfontGeneric arg1) {
        if (field3959) {
            method804(arg0, arg1);
            return;
        }
        if (Client.state == 0 || Client.state == 5) {
            arg1.method141(Text.field2466, 382, 225, 16777215, -1);
            Pix2D.method476(230, 233, 304, 34, 9179409);
            Pix2D.method476(231, 234, 302, 32, 0);
            Pix2D.method478(232, 235, loadPos * 3, 30, 9179409);
            Pix2D.method478(loadPos * 3 + 232, 235, 300 - loadPos * 3, 30, 0);
            arg1.method141(loadString, 382, 256, 16777215, -1);
        }
        if (Client.state == 20) {
            field4473.method876(382 - field4473.field2434 / 2, 271 - field4473.field2437 / 2);
            short var2 = 211;
            arg1.method141(field3981, 382, 211, 16776960, 0);
            int var8 = var2 + 15;
            arg1.method141(field3979, 382, 226, 16776960, 0);
            int var9 = var8 + 15;
            arg1.method141(field3980, 382, 241, 16776960, 0);
            int var10 = var9 + 15;
            int var11 = var10 + 10;
            arg1.method154(JagString.join(new JagString[] { Text.field713, PixfontGeneric.method162(loginUser) }), 272, 266, 16777215, 0);
            int var13 = var11 + 15;
            arg1.method154(JagString.join(new JagString[] { Text.field1697, loginPass.method596() }), 274, 281, 16777215, 0);
            int var15 = var13 + 15;
        }
        if (Client.state == 10) {
            field4473.method876(202, 171);
            if (field1182 == 0) {
                short var7 = 251;
                arg1.method141(Text.field3522, 382, 251, 16776960, 0);
                field2416.method876(229, 271);
                arg1.method153(Text.field3601, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
                int var19 = var7 + 30;
                field2416.method876(389, 271);
                arg1.method153(Text.field3903, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1182 == 2) {
                short var3 = 211;
                arg1.method141(field3981, 382, 211, 16776960, 0);
                int var12 = var3 + 15;
                arg1.method141(field3979, 382, 226, 16776960, 0);
                int var14 = var12 + 15;
                arg1.method141(field3980, 382, 241, 16776960, 0);
                boolean var4;
                if (Statics.field2620 == 0 && Client.field2113 % 40 < 20 && GameShell.field3520) {
                    var4 = true;
                } else {
                    var4 = false;
                }
                var12 = var14 + 15;
                var12 += 10;
                arg1.method154(JagString.join(new JagString[] { Text.field713, PixfontGeneric.method162(loginUser), var4 ? Statics.field3843 : field3972}), 272, 266, 16777215, 0);
                boolean var5;
                if (Statics.field2620 == 1 && Client.field2113 % 40 < 20 && GameShell.field3520) {
                    var5 = true;
                } else {
                    var5 = false;
                }
                var12 += 15;
                arg1.method154(JagString.join(new JagString[] { Text.field1697, loginPass.method596(), var5 ? Statics.field3843 : field3972}), 274, 281, 16777215, 0);
                field2416.method876(229, 301);
                var12 += 15;
                arg1.method141(Text.field4117, 302, 326, 16777215, 0);
                field2416.method876(389, 301);
                arg1.method141(Text.field76, 462, 326, 16777215, 0);
            } else if (field1182 == 3) {
                arg1.method141(Text.field2921, 382, 211, 16776960, 0);
                short var6 = 236;
                arg1.method141(Text.field3753, 382, 236, 16777215, 0);
                int var16 = var6 + 15;
                arg1.method141(Text.field1591, 382, 251, 16777215, 0);
                int var17 = var16 + 15;
                arg1.method141(Text.field1152, 382, 266, 16777215, 0);
                int var18 = var17 + 15;
                arg1.method141(Text.field2943, 382, 281, 16777215, 0);
                int var20 = var18 + 15;
                field2416.method876(309, 301);
                arg1.method141(Text.field76, 382, 326, 16777215, 0);
            }
        }
        if (Client.game != 1) {
            if (Statics.field1550 > 0) {
                method535(Statics.field1550);
                Statics.field1550 = 0;
            }
            method1307();
        }
        field2095[field2460 ? 1 : 0].method876(725, 463);
		if (Client.state > 5 && Client.plug != 2) {
			if (field518 == null) {
				field518 = PixLoader.method1454(Statics.field4247, Client.sprites);
			}
			if (field518 != null) {
				field518.method876(5, 463);
				arg1.method141(JagString.join(new JagString[]{Text.field1326, Statics.field3787, JagString.method1212(Client.worldid)}), 55, 478, 16777215, 0);
				if (field2414 != null) {
					arg0.method141(Text.field3763, 55, 492, 16777215, 0);
					return;
				}
				arg0.method141(Text.field1751, 55, 492, 16777215, 0);
			}
		}
	}

	@ObfuscatedName("ee.a(BLhj;)V")
	public static void loop(GameShell arg0) {
		if (field3959) {
			Statics.method453(arg0);
			return;
		}
		if (ClientMouseListener.field625 == 1 && ClientMouseListener.field4239 >= 715 && ClientMouseListener.field3339 >= 453) {
			field2460 = !field2460;
			if (field2460) {
				MidiManager.method5();
			} else {
				MidiManager.method388(Client.songs, Statics.field1552, 255);
			}
		}
		if (Client.state == 5) {
			return;
		}
		Statics.field1550++;
		if (Client.state != 10) {
			return;
		}
		if (Client.plug != 2) {
			if (ClientMouseListener.field625 == 1 && ClientMouseListener.field4239 >= 5 && ClientMouseListener.field4239 <= 105 && ClientMouseListener.field3339 >= 463 && ClientMouseListener.field3339 <= 498) {
				method779();
				return;
			}
			if (field2414 != null) {
				method779();
			}
		}
		int var1 = ClientMouseListener.field625;
		int var2 = ClientMouseListener.field4239;
		int var3 = ClientMouseListener.field3339;
		if (field1182 == 0) {
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 271 && var3 <= 311) {
				Statics.field2620 = 0;
				field1182 = 3;
			}
			boolean var4 = false;
			if (Client.modewhere != 0) {
				while (ClientKeyboardListener.method279()) {
					if (ClientKeyboardListener.field2556 == 84) {
						var4 = true;
						break;
					}
				}
			}
			if (var4 || var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 271 && var3 <= 311) {
				field1182 = 2;
				field3980 = Text.field1277;
				field3981 = Text.field1298;
				Statics.field2620 = 0;
				field3979 = Text.field242;
			}
		} else if (field1182 == 2) {
			short var5 = 231;
			int var8 = var5 + 30;
			if (var1 == 1 && var3 >= 246 && var3 < 261) {
				Statics.field2620 = 0;
			}
			var8 += 15;
			if (var1 == 1 && var3 >= 261 && var3 < 276) {
				Statics.field2620 = 1;
			}
			var8 += 15;
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 301 && var3 <= 341) {
				loginUser = loginUser.method611().method614();
				if (loginUser.method604() == 0) {
					loginMes(Text.field1285, Text.field1295, Text.field38);
				} else if (loginPass.method604() == 0) {
					loginMes(Text.field1288, Text.field1290, Text.field662);
				} else {
					loginMes(Text.field1306, Text.field1275, Text.field1117);
					Client.setMainState(20);
				}
			} else {
				if (var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 301 && var3 <= 341) {
					loginUser = field3972;
					field1182 = 0;
					loginPass = field3972;
				}
				while (true) {
					boolean var6;
					label226: do {
						while (ClientKeyboardListener.method279()) {
							var6 = false;
							for (int var7 = 0; var7 < Statics.field1339.method604(); var7++) {
								if (ClientKeyboardListener.field4148 == Statics.field1339.method599(var7)) {
									var6 = true;
									break;
								}
							}
							if (Statics.field2620 != 0) {
								continue label226;
							}
							if (ClientKeyboardListener.field2556 == 85 && loginUser.method604() > 0) {
								loginUser = loginUser.method623(0, loginUser.method604() - 1);
							}
							if (ClientKeyboardListener.field2556 == 84 || ClientKeyboardListener.field2556 == 80) {
								Statics.field2620 = 1;
							}
							if (var6 && loginUser.method604() < 12) {
								loginUser = loginUser.method618(ClientKeyboardListener.field4148);
							}
						}
						return;
					} while (Statics.field2620 != 1);
					if (ClientKeyboardListener.field2556 == 85 && loginPass.method604() > 0) {
						loginPass = loginPass.method623(0, loginPass.method604() - 1);
					}
					if (ClientKeyboardListener.field2556 == 84 || ClientKeyboardListener.field2556 == 80) {
						Statics.field2620 = 0;
					}
					if (Client.modewhere != 0 && ClientKeyboardListener.field2556 == 84) {
						loginUser = loginUser.method611().method614();
						if (loginUser.method604() == 0) {
							loginMes(Text.field1285, Text.field1295, Text.field38);
							return;
						}
						if (loginPass.method604() == 0) {
							loginMes(Text.field1288, Text.field1290, Text.field662);
							return;
						}
						loginMes(Text.field1306, Text.field1275, Text.field1117);
						Client.setMainState(20);
						return;
					}
					if (var6 && loginPass.method604() < 20) {
						loginPass = loginPass.method618(ClientKeyboardListener.field4148);
					}
				}
			}
		} else if (field1182 == 3 && var1 == 1 && var2 >= 307 && var2 <= 457 && var3 >= 301 && var3 <= 341) {
			field1182 = 0;
		}
	}

	@ObfuscatedName("qj.a(Lnb;Ljava/awt/Component;ZLnb;)V")
	public static void open(Js5 arg0, Component arg1, Js5 arg2) {
		if (field1707) {
			return;
		}
		Pix2D.method481();
		byte[] var3 = arg0.getFile(0, Statics.field2009);
		field1640 = new SoftwarePix32(var3, arg1);
		field1901 = field1640.method1156();
		field3946 = PixLoader.method826(Statics.field2932, arg2);
		field4473 = PixLoader.method826(Statics.field1896, arg2);
		field2416 = PixLoader.method826(Statics.field3019, arg2);
		field4320 = PixLoader.method830(arg2, Statics.field4502);
		field2095 = PixLoader.method700(arg2, Statics.field2912);
		field32 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field32[var4] = var4 * 262144;
		}
		for (int var5 = 0; var5 < 64; var5++) {
			field32[var5 + 64] = var5 * 1024 + 16711680;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			field32[var6 + 128] = var6 * 4 + 16776960;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			field32[var7 + 192] = 16777215;
		}
		field234 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field234[var8] = var8 * 1024;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			field234[var9 + 64] = var9 * 4 + 65280;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			field234[var10 + 128] = var10 * 262144 + 65535;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			field234[var11 + 192] = 16777215;
		}
		field3014 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field3014[var12] = var12 * 4;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			field3014[var13 + 64] = var13 * 262144 + 255;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			field3014[var14 + 128] = var14 * 1024 + 16711935;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			field3014[var15 + 192] = 16777215;
		}
		field3034 = new int[256];
		field4169 = new int[32768];
		field2049 = new int[32768];
		method369(null);
		field2609 = new int[32768];
		loginPass = field3972;
		field1182 = 0;
		field3959 = false;
		if (field1183 == 0) {
			field2460 = true;
		} else {
			field2460 = false;
		}
		loginUser = field3972;
		field3667 = new int[32768];
		if (field2460) {
			MidiManager.method795();
		} else {
			MidiManager.method730(255, Statics.field1552, Client.songs);
		}
		Js5Net.method988(false);
		field1707 = true;
		method1493();
		field589 = new SoftwarePix32(128, 254);
		field1675 = new SoftwarePix32(128, 254);
	}

	@ObfuscatedName("sf.c(I)V")
	public static void close() {
		if (!field1707) {
			return;
		}
		field3946 = null;
		field589 = null;
		field4320 = null;
		field2609 = null;
		field3217 = null;
		field372 = null;
		field4473 = null;
		field3014 = null;
		field2416 = null;
		field736 = null;
		field2095 = null;
		field1901 = null;
		field32 = null;
		field1448 = null;
		field2049 = null;
		field3034 = null;
		field1640 = null;
		field3667 = null;
		field4169 = null;
		field234 = null;
		field518 = null;
		field1675 = null;
		MidiManager.method795();
		Js5Net.method988(true);
		field1707 = false;
	}

	@ObfuscatedName("uc.b(I)V")
	public static void method1493() {
		field1640.method1161(0, 0);
		field1901.method1161(382, 0);
		field3946.method876(382 - field3946.field2434 / 2, 18);
	}

	@ObfuscatedName("ed.a(Lrh;I)V")
	public static void method369(SoftwarePix8 arg0) {
		for (int var1 = 0; var1 < field4169.length; var1++) {
			field4169[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			field4169[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					field2049[var7] = (field4169[var7 - 128] + field4169[var7 + 1] + field4169[var7 - 1] + field4169[var7 - -128]) / 4;
				}
			}
			int[] var8 = field4169;
			field4169 = field2049;
			field2049 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field2437; var10++) {
			for (int var11 = 0; var11 < arg0.field2434; var11++) {
				if (arg0.field3704[var9++] != 0) {
					int var12 = arg0.field2438 + var11 + 16;
					int var13 = arg0.field2432 + var10 + 16;
					int var14 = var12 + (var13 << 7);
					field4169[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("d.a(BLi;Li;Li;)V")
	public static void loginMes(JagString arg0, JagString arg1, JagString arg2) {
		field3981 = arg1;
		field3980 = arg0;
		field3979 = arg2;
	}

	@ObfuscatedName("hc.a(BI)V")
	public static void method535(int arg0) {
		MillisTimer.field526 += arg0 * 128;
		if (MillisTimer.field526 > field4169.length) {
			MillisTimer.field526 -= field4169.length;
			int var1 = (int) (Math.random() * 12.0D);
			method369(field4320[var1]);
		}
		int var2 = 0;
		int var3 = arg0 * 128;
		int var4 = (256 - arg0) * 128;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = field3667[var3 + var2] - arg0 * field4169[field4169.length - 1 & MillisTimer.field526 + var2] / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			field3667[var2++] = var6;
		}
		for (int var7 = 256 - arg0; var7 < 256; var7++) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int) (Math.random() * 100.0D);
				if (var10 < 50 && var9 > 10 && var9 < 118) {
					field3667[var9 + var8] = 255;
				} else {
					field3667[var8 + var9] = 0;
				}
			}
		}
		if (field3099 > 0) {
			field3099 -= arg0 * 4;
		}
		if (field2969 > 0) {
			field2969 -= arg0 * 4;
		}
		if (field2969 == 0 && field3099 == 0) {
			int var11 = (int) (Math.random() * (double) (2000 / arg0));
			if (var11 == 1) {
				field3099 = 1024;
			}
			if (var11 == 0) {
				field2969 = 1024;
			}
		}
		for (int var12 = 0; var12 < 256 - arg0; var12++) {
			field4454[var12] = field4454[arg0 + var12];
		}
		for (int var13 = 256 - arg0; var13 < 256; var13++) {
			field4454[var13] = (int) (Math.sin((double) Statics.field924 / 14.0D) * 16.0D + Math.sin((double) Statics.field924 / 15.0D) * 14.0D + Math.sin((double) Statics.field924 / 16.0D) * 12.0D);
			Statics.field924++;
		}
		Statics.field1192 += arg0;
		int var14 = ((Client.field2113 & 0x1) + arg0) / 2;
		if (var14 <= 0) {
			return;
		}
		for (int var15 = 0; var15 < Statics.field1192 * 100; var15++) {
			int var16 = (int) (Math.random() * 124.0D) + 2;
			int var17 = (int) (Math.random() * 128.0D) + 128;
			field3667[var16 + (var17 << 7)] = 192;
		}
		Statics.field1192 = 0;
		for (int var18 = 0; var18 < 256; var18++) {
			int var19 = 0;
			int var20 = var18 * 128;
			for (int var21 = -var14; var21 < 128; var21++) {
				if (var14 + var21 < 128) {
					var19 += field3667[var20 + var21 + var14];
				}
				if (var21 - var14 - 1 >= 0) {
					var19 -= field3667[var21 + var20 - var14 - 1];
				}
				if (var21 >= 0) {
					field2609[var21 + var20] = var19 / (var14 * 2 + 1);
				}
			}
		}
		for (int var22 = 0; var22 < 128; var22++) {
			int var23 = 0;
			for (int var24 = -var14; var24 < 256; var24++) {
				int var25 = var24 * 128;
				if (var14 + var24 < 256) {
					var23 += field2609[var14 * 128 + var22 + var25];
				}
				if (var24 - var14 - 1 >= 0) {
					var23 -= field2609[var22 + var25 - var14 * 128 - 128];
				}
				if (var24 >= 0) {
					field3667[var25 + var22] = var23 / (var14 * 2 + 1);
				}
			}
		}
	}

	@ObfuscatedName("ki.a(Lcc;Lcc;B)V")
	public static void method804(PixfontGeneric arg0, PixfontGeneric arg1) {
		if (field1448 == null) {
			field1448 = PixLoader.method230(0, Client.sprites, Statics.field209);
		}
		if (field372 == null) {
			field372 = PixLoader.method1325(Statics.field119, Client.sprites, 0);
		}
		if (field3217 == null) {
			field3217 = PixLoader.method1325(Statics.field1783, Client.sprites, 0);
		}
		if (field736 == null) {
			field736 = PixLoader.method1325(Statics.field2195, Client.sprites, 0);
		}
		Pix2D.method478(0, 23, 765, 480, 0);
		Pix2D.method482(0, 0, 138, 23, 12425273, 9135624);
		Pix2D.method482(138, 0, 640, 23, 5197647, 2697513);
		arg1.method141(Text.field2425, 69, 15, 0, -1);
		if (field736 != null) {
			field736[1].method876(140, 1);
			arg0.method154(Text.field2404, 152, 10, 16777215, -1);
			field736[0].method876(140, 12);
			arg0.method154(Text.field2074, 152, 21, 16777215, -1);
		}
		if (field3217 != null) {
			if (field461[0] == 0 && field1686[0] == 0) {
				field3217[2].method876(280, 4);
			} else {
				field3217[0].method876(280, 4);
			}
			if (field461[0] == 0 && field1686[0] == 1) {
				field3217[3].method876(295, 4);
			} else {
				field3217[1].method876(295, 4);
			}
			arg1.method154(Text.field1312, 312, 17, 16777215, -1);
			if (field461[0] == 1 && field1686[0] == 0) {
				field3217[2].method876(390, 4);
			} else {
				field3217[0].method876(390, 4);
			}
			if (field461[0] == 1 && field1686[0] == 1) {
				field3217[3].method876(405, 4);
			} else {
				field3217[1].method876(405, 4);
			}
			arg1.method154(Text.field4362, 422, 17, 16777215, -1);
			if (field461[0] == 2 && field1686[0] == 0) {
				field3217[2].method876(500, 4);
			} else {
				field3217[0].method876(500, 4);
			}
			if (field461[0] == 2 && field1686[0] == 1) {
				field3217[3].method876(515, 4);
			} else {
				field3217[1].method876(515, 4);
			}
			arg1.method154(Text.field2734, 532, 17, 16777215, -1);
			if (field461[0] == 3 && field1686[0] == 0) {
				field3217[2].method876(610, 4);
			} else {
				field3217[0].method876(610, 4);
			}
			if (field461[0] == 3 && field1686[0] == 1) {
				field3217[3].method876(625, 4);
			} else {
				field3217[1].method876(625, 4);
			}
			arg1.method154(Text.field3950, 642, 17, 16777215, -1);
		}
		Pix2D.method478(700, 4, 58, 16, 0);
		arg0.method141(Text.field76, 729, 16, 16777215, -1);
		field1581 = -1;
		if (field1448 == null) {
			return;
		}
		int var2 = 24;
		int var3 = 8;
		int var4;
		int var5;
		do {
			var4 = var2;
			var5 = var3;
			if (field1895 <= var2 * (var3 - 1)) {
				var3--;
			}
			if (var3 * (var2 - 1) >= field1895) {
				var2--;
			}
			if (field1895 <= (var2 - 1) * var3) {
				var2--;
			}
		} while (var2 != var4 || var5 != var3);
		int var6 = (765 - var3 * 88) / (var3 + 1);
		int var7 = (480 - var2 * 19) / (var2 + 1);
		if (var7 > 5) {
			var7 = 5;
		}
		if (var6 > 5) {
			var6 = 5;
		}
		int var8 = (765 - var6 * (var3 - 1) - var3 * 88) / 2;
		int var9 = var8;
		int var10 = (480 - var2 * 19 - var7 * (var2 + -1)) / 2;
		int var11 = var10 + 23;
		int var12 = 0;
		for (int var13 = 0; var13 < field1895; var13++) {
			WorldEntry var14 = field3845[var13];
			boolean var15 = true;
			JagString var16 = JagString.method1212(var14.field1255);
			if (var14.field1255 == -1) {
				var16 = Text.field901;
				var15 = false;
			} else if (var14.field1255 > 1980) {
				var16 = Text.field1745;
				var15 = false;
			}
			if (ClientMouseListener.field471 >= var9 && ClientMouseListener.field4449 >= var11 && ClientMouseListener.field471 < var9 + 88 && ClientMouseListener.field4449 < var11 + 19 && var15) {
				field1581 = var13;
				field1448[var14.field1257 ? 1 : 0].method1160(var9, var11);
			} else {
				field1448[var14.field1257 ? 1 : 0].method1161(var9, var11);
			}
			if (field372 != null) {
				field372[var14.field1260 + (var14.field1257 ? 8 : 0)].method876(var9 + 29, var11);
			}
			arg1.method141(JagString.method1212(var14.field1261), var9 + 15, 5 + 9 + var11, 0, -1);
			arg0.method141(var16, var9 + 60, var11 - -5 + 9, 268435455, -1);
			var11 += var7 + 19;
			var12++;
			if (var2 <= var12) {
				var11 = var10 + 23;
				var12 = 0;
				var9 += var6 + 88;
			}
		}
	}

	@ObfuscatedName("ra.d(Z)V")
	public static void method1307() {
		if (field2969 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (field2969 > 768) {
					field3034[var0] = Statics.method1525(field234[var0], 1024 - field2969, field32[var0]);
				} else if (field2969 <= 256) {
					field3034[var0] = Statics.method1525(field32[var0], 256 - field2969, field234[var0]);
				} else {
					field3034[var0] = field234[var0];
				}
			}
		} else if (field3099 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (field3099 > 768) {
					field3034[var1] = Statics.method1525(field3014[var1], 1024 - field3099, field32[var1]);
				} else if (field3099 <= 256) {
					field3034[var1] = Statics.method1525(field32[var1], 256 - field3099, field3014[var1]);
				} else {
					field3034[var1] = field3014[var1];
				}
			}
		} else {
			for (int var2 = 0; var2 < 256; var2++) {
				field3034[var2] = field32[var2];
			}
		}
		int var3 = field1640.field3654 * 9;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 1; var6 < 255; var6++) {
			int var7 = field4454[var6] * (256 - var6) / 256 + 22;
			if (var7 < 0) {
				var7 = 0;
			}
			var4 += var7;
			for (int var8 = var7; var8 < 128; var8++) {
				int var9 = field3667[var4++];
				int var10 = field1640.field3247[var3++];
				if (var9 == 0) {
					field589.field3247[var5++] = var10;
				} else {
					int var12 = 256 - var9;
					int var13 = field3034[var9];
					field589.field3247[var5++] = ((var13 & 0xFF00FF) * var9 + var12 * (var10 & 0xFF00FF) & 0xFF00FF00) + (var12 * (var10 & 0xFF00) + (var13 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			for (int var14 = 0; var14 < var7; var14++) {
				field589.field3247[var5++] = field1640.field3247[var3++];
			}
			var3 += field1640.field3654 - 128;
		}
		int var15 = 0;
		int var16 = 0;
		field589.method1161(0, 9);
		int var17 = field1640.field3654 * 9 + 128;
		for (int var18 = 1; var18 < 255; var18++) {
			int var19 = field4454[var18] * (256 - var18) / 256 + 22;
			if (var19 < 0) {
				var19 = 0;
			}
			for (int var20 = 0; var20 < var19; var20++) {
				int var10001 = var15++;
				var17--;
				field1675.field3247[var10001] = field1640.field3247[var17];
			}
			for (int var21 = var19; var21 < 128; var21++) {
				int var22 = field3667[var16++];
				var17--;
				int var23 = field1640.field3247[var17];
				if (var22 == 0) {
					field1675.field3247[var15++] = var23;
				} else {
					int var25 = 256 - var22;
					int var26 = field3034[var22];
					field1675.field3247[var15++] = ((var23 & 0xFF00) * var25 + var22 * (var26 & 0xFF00) & 0xFF0000) + ((var23 & 0xFF00FF) * var25 + (var26 & 0xFF00FF) * var22 & 0xFF00FF00) >> 8;
				}
			}
			var17 += field1640.field3654 + 128;
			var16 += var19;
		}
		field1675.method1161(637, 9);
	}

	@ObfuscatedName("ac.a(ZII)V")
	public static void method23(int arg0, int arg1) {
		if (field1183 != 0 && arg0 != -1) {
			MidiManager.method388(Client.jingles, arg0, field1183);
			Client.field2012 = true;
		}
	}

	@ObfuscatedName("ke.d(I)V")
	public static void method779() {
		try {
			if (field2414 == null) {
				field2414 = new HTTPRequest(GameShell.signlink, JagString.join(new JagString[] { Statics.field3983, JagString.method1212(Client.lang), Statics.field915}).method606());
			} else {
				byte[] var0 = field2414.method12();
				if (var0 != null) {
					Packet var1 = new Packet(var0);
					field1895 = var1.g2();
					field3845 = new WorldEntry[field1895];
					for (int var2 = 0; var2 < field1895; var2++) {
						WorldEntry var3 = field3845[var2] = new WorldEntry();
						int var4 = var1.g2();
						var3.field1261 = var4 & 0x7FFF;
						var3.field1257 = (var4 & 0x8000) != 0;
						var3.field1262 = var1.gjstr();
						var3.field1255 = var1.method334();
						var3.field1258 = var2;
						var3.field1260 = Statics.method528(var1.g2());
					}
					method1143(0, field3845, field3845.length - 1);
					field3959 = true;
					field2414 = null;
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			field2414 = null;
		}
	}

	@ObfuscatedName("pd.a(I[Lgd;II)V")
	public static void method1143(int arg0, WorldEntry[] arg1, int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		int var3 = arg0 - 1;
		int var4 = (arg0 + arg2) / 2;
		int var5 = arg2 + 1;
		WorldEntry var6 = arg1[var4];
		arg1[var4] = arg1[arg0];
		arg1[arg0] = var6;
		while (var3 < var5) {
			boolean var7 = true;
			do {
				var5--;
				for (int var8 = 0; var8 < 4; var8++) {
					int var9;
					int var10;
					if (field461[var8] == 2) {
						var10 = arg1[var5].field1258;
						var9 = var6.field1258;
					} else if (field461[var8] == 1) {
						var9 = var6.field1255;
						if (var9 == -1 && field1686[var8] == 1) {
							var9 = 2001;
						}
						var10 = arg1[var5].field1255;
						if (var10 == -1 && field1686[var8] == 1) {
							var10 = 2001;
						}
					} else if (field461[var8] == 3) {
						var10 = arg1[var5].field1257 ? 1 : 0;
						var9 = var6.field1257 ? 1 : 0;
					} else {
						var10 = arg1[var5].field1261;
						var9 = var6.field1261;
					}
					if (var10 != var9) {
						if ((field1686[var8] != 1 || var10 <= var9) && (field1686[var8] != 0 || var10 >= var9)) {
							var7 = false;
						}
						break;
					}
					if (var8 == 3) {
						var7 = false;
					}
				}
			} while (var7);
			boolean var11 = true;
			do {
				var3++;
				for (int var12 = 0; var12 < 4; var12++) {
					int var13;
					int var14;
					if (field461[var12] == 2) {
						var13 = arg1[var3].field1258;
						var14 = var6.field1258;
					} else if (field461[var12] == 1) {
						var13 = arg1[var3].field1255;
						if (var13 == -1 && field1686[var12] == 1) {
							var13 = 2001;
						}
						var14 = var6.field1255;
						if (var14 == -1 && field1686[var12] == 1) {
							var14 = 2001;
						}
					} else if (field461[var12] == 3) {
						var13 = arg1[var3].field1257 ? 1 : 0;
						var14 = var6.field1257 ? 1 : 0;
					} else {
						var13 = arg1[var3].field1261;
						var14 = var6.field1261;
					}
					if (var13 != var14) {
						if ((field1686[var12] != 1 || var13 >= var14) && (field1686[var12] != 0 || var13 <= var14)) {
							var11 = false;
						}
						break;
					}
					if (var12 == 3) {
						var11 = false;
					}
				}
			} while (var11);
			if (var5 > var3) {
				WorldEntry var15 = arg1[var3];
				arg1[var3] = arg1[var5];
				arg1[var5] = var15;
			}
		}
		method1143(arg0, arg1, var5);
		method1143(var5 + 1, arg1, arg2);
	}
}
