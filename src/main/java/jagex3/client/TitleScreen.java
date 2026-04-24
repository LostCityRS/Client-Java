package jagex3.client;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.graphics.*;
import jagex3.js5.Js5;
import jagex3.js5.Js5Net;
import jagex3.sound.MidiManager;
import jagex3.util.JagString;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("uc.E")
	public static JagString field3067 = JagString.wrap("");
	@ObfuscatedName("uc.z")
	public static JagString field3062 = field3067;
	@ObfuscatedName("uc.x")
	public static JagString field3060 = field3067;
	@ObfuscatedName("uc.I")
	public static JagString loginUser = field3067;
	@ObfuscatedName("ie.g")
	public static int field1395 = 0;
	@ObfuscatedName("f.u")
	public static int[] field847 = new int[256];
	@ObfuscatedName("hd.Kb")
	public static int field1209 = 0;
	@ObfuscatedName("uc.s")
	public static JagString loginPass = field3067;
    @ObfuscatedName("wb.H")
    public static int loadPos = 10;
	@ObfuscatedName("uc.Q")
	public static JagString loadString = field3067;
	@ObfuscatedName("nd.y")
	public static int field2084 = 0;
	@ObfuscatedName("pe.Ub")
	public static int field2380 = 0;
	@ObfuscatedName("ha.a")
	public static int field1144 = 0;
	@ObfuscatedName("fa.fb")
	public static Pix32 field851;
	@ObfuscatedName("f.r")
	public static PixMap field844;
	@ObfuscatedName("ca.x")
	public static PixMap field472;
	@ObfuscatedName("wc.q")
	public static PixMap field3298;
	@ObfuscatedName("gb.p")
	public static boolean field1062;
	@ObfuscatedName("hc.e")
	public static Pix8[] field1177;
	@ObfuscatedName("ia.Sb")
	public static PixMap field1307;
	@ObfuscatedName("j.jc")
	public static PixMap field1435;
	@ObfuscatedName("na.g")
	public static PixMap field1935;
	@ObfuscatedName("nc.j")
	public static PixMap field2044;
	@ObfuscatedName("nc.u")
	public static Pix32 field2055;
	@ObfuscatedName("oa.z")
	public static int[] field2151;
	@ObfuscatedName("ae.f")
	public static int[] field229;
	@ObfuscatedName("r.l")
	public static int[] field2570;
	@ObfuscatedName("ra.l")
	public static int[] field2600;
	@ObfuscatedName("ra.t")
	public static PixMap field2608;
	@ObfuscatedName("re.o")
	public static PixMap field2701;
	@ObfuscatedName("t.ub")
	public static Pix8 field2806;
	@ObfuscatedName("tb.bc")
	public static int[] field2904;
	@ObfuscatedName("tb.ic")
	public static int[] field2911;
	@ObfuscatedName("tc.h")
	public static Pix8 field2919;
	@ObfuscatedName("ua.A")
	public static int[] field3025;
	@ObfuscatedName("vb.Cb")
	public static int[] field3139;
	@ObfuscatedName("uc.D")
	public static JagString field3066 = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("uc.L")
	public static JagString field3074 = field3066;
	@ObfuscatedName("he.Qb")
	public static JagString field1245 = JagString.wrap("titlebox");
	@ObfuscatedName("hd.Fb")
	public static JagString field1204 = JagString.wrap("@yel@*V");
	@ObfuscatedName("la.K")
	public static JagString field1691 = JagString.wrap("scape main");
	@ObfuscatedName("uc.O")
	public static JagString field3077 = field3067;
	@ObfuscatedName("gb.j")
	public static JagString field1056 = JagString.wrap("titlebutton");
	@ObfuscatedName("ca.y")
	public static JagString field473 = JagString.wrap("runes");
	@ObfuscatedName("ld.E")
	public static JagString field1751 = JagString.wrap("title)3jpg");

	@ObfuscatedName("td.d(I)V")
	public static void loop() {
		method542();
		if (Client.state != 10) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickX - 202;
		int var1 = ClientMouseListener.mouseClickButton;
		int var2 = ClientMouseListener.mouseClickY - 171;
		if (field1395 == 0) {
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 100 && var2 <= 140) {
				field2084 = 0;
				field1395 = 3;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 100 && var2 <= 140) {
				field1395 = 2;
				field2084 = 0;
				field3060 = Text.field2104;
				field3077 = Text.field1030;
				field3062 = Text.field2088;
				return;
			}
			return;
		}
		if (field1395 == 2) {
			byte var3 = 60;
			int var6 = var3 + 30;
			if (var1 == 1 && var2 >= 75 && var2 < 90) {
				field2084 = 0;
			}
			var6 += 15;
			if (var1 == 1 && var2 >= 90 && var2 < 105) {
				field2084 = 1;
			}
			var6 += 15;
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 130 && var2 <= 170) {
				loginUser = loginUser.getRepeatedCharacter().toRawUsername();
				loginMes(Text.field2101, Text.field2095, Text.field666);
				Client.setMainState(20);
				return;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 130 && var2 <= 170) {
				loginUser = field3067;
				loginPass = field3067;
				field1395 = 0;
			}
			while (true) {
				boolean var4;
				label138:
				do {
					while (ClientKeyboardListener.pollKey()) {
						var4 = false;
						for (int var5 = 0; var5 < field3074.length(); var5++) {
							if (ClientKeyboardListener.ch == field3074.method6(var5)) {
								var4 = true;
								break;
							}
						}
						if (field2084 != 0) {
							continue label138;
						}
						if (ClientKeyboardListener.code == 85 && loginUser.length() > 0) {
							loginUser = loginUser.substring(0, loginUser.length() - 1);
						}
						if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
							field2084 = 1;
						}
						if (var4 && loginUser.length() < 12) {
							loginUser = loginUser.valueOf(ClientKeyboardListener.ch);
						}
					}
					return;
				} while (field2084 != 1);
				if (ClientKeyboardListener.code == 85 && loginPass.length() > 0) {
					loginPass = loginPass.substring(0, loginPass.length() - 1);
				}
				if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
					field2084 = 0;
				}
				if (var4 && loginPass.length() < 20) {
					loginPass = loginPass.valueOf(ClientKeyboardListener.ch);
				}
			}
		}
		if (field1395 != 3 || var1 != 1 || var0 < 105 || var0 > 255 || var2 < 130 || var2 > 170) {
			return;
		}
		field1395 = 0;
	}

	@ObfuscatedName("rd.a(ILbc;Lbc;)V")
	public static void draw(PixFont arg0, PixFont arg1) {
		field1935.bind();
		if (Client.state == 0 || Client.state == 5) {
			arg0.centreString(Text.field2405, 180, 54, 16777215);
			Pix2D.drawRect(28, 62, 304, 34, 9179409);
			Pix2D.drawRect(29, 63, 302, 32, 0);
			Pix2D.fillRect(30, 64, loadPos * 3, 30, 9179409);
			Pix2D.fillRect(loadPos * 3 + 30, 64, 300 - loadPos * 3, 30, 0);
			arg0.centreString(loadString, 180, 85, 16777215);
		}
		if (Client.state == 20) {
			byte var2 = 40;
			field2806.plotSprite(0, 0);
			arg0.centreString(field3060, 180, 40, 16776960, true);
			int var8 = var2 + 15;
			arg0.centreString(field3077, 180, 55, 16776960, true);
			int var9 = var8 + 15;
			arg0.centreString(field3062, 180, 70, 16776960, true);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg0.drawString(JagString.join(new JagString[]{Text.field3002, loginUser}), 90, 95, 16777215, true);
			int var13 = var11 + 15;
			arg0.drawString(JagString.join(new JagString[]{Text.field1037, loginPass.chars()}), 92, 110, 16777215, true);
			int var15 = var13 + 15;
		}
		if (Client.state == 10) {
			field2806.plotSprite(0, 0);
			if (field1395 == 0) {
				byte var5 = 80;
				arg0.centreString(Text.field582, 180, 80, 16776960, true);
				int var23 = var5 + 30;
				field2919.plotSprite(27, 100);
				arg0.drawStringMultiline(Text.field2639, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				field2919.plotSprite(187, 100);
				arg0.drawStringMultiline(Text.field2149, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (field1395 == 2) {
				byte var3 = 40;
				arg0.centreString(field3060, 180, 40, 16776960, true);
				int var12 = var3 + 15;
				arg0.centreString(field3077, 180, 55, 16776960, true);
				int var14 = var12 + 15;
				arg0.centreString(field3062, 180, 70, 16776960, true);
				int var16 = var14 + 15;
				int var17 = var16 + 10;
				arg0.drawString(JagString.join(new JagString[]{Text.field3002, loginUser, Client.loopCycle % 40 < 20 & field2084 == 0 ? field1204 : field3067}), 90, 95, 16777215, true);
				int var19 = var17 + 15;
				arg0.drawString(JagString.join(new JagString[]{Text.field1037, loginPass.chars(), Client.loopCycle % 40 < 20 & field2084 == 1 ? field1204 : field3067}), 92, 110, 16777215, true);
				field2919.plotSprite(27, 130);
				int var21 = var19 + 15;
				arg0.centreString(Text.field926, 100, 155, 16777215, true);
				field2919.plotSprite(187, 130);
				arg0.centreString(Text.field3302, 260, 155, 16777215, true);
			} else if (field1395 == 3) {
				arg0.centreString(Text.field3265, 180, 40, 16776960, true);
				byte var4 = 65;
				arg0.centreString(Text.field2757, 180, 65, 16777215, true);
				int var18 = var4 + 15;
				arg0.centreString(Text.field2675, 180, 80, 16777215, true);
				int var20 = var18 + 15;
				arg0.centreString(Text.field2667, 180, 95, 16777215, true);
				int var22 = var20 + 15;
				arg0.centreString(Text.field2400, 180, 110, 16777215, true);
				field2919.plotSprite(107, 130);
				arg0.centreString(Text.field3302, 180, 155, 16777215, true);
				int var24 = var22 + 15;
			}
		}
		method281();
		try {
			Graphics var6 = GameShell.canvas.getGraphics();
			field1935.draw(202, var6, 171);
			field472.draw(0, var6, 0);
			field1435.draw(637, var6, 0);
			if (GameShell.fullredraw) {
				GameShell.fullredraw = false;
				field2044.draw(128, var6, 0);
				field2608.draw(202, var6, 371);
				field844.draw(0, var6, 265);
				field2701.draw(562, var6, 265);
				field1307.draw(128, var6, 171);
				field3298.draw(562, var6, 171);
			}
		} catch (Exception var7) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("m.a(La;La;La;B)V")
	public static void loginMes(JagString arg0, JagString arg1, JagString arg2) {
		field3062 = arg0;
		field3077 = arg2;
		field3060 = arg1;
	}

	@ObfuscatedName("je.a(Ljava/awt/Component;ZLbd;Lbd;)V")
	public static void open(Component arg0, Js5 arg1, Js5 arg2) {
		if (field1062) {
			return;
		}
		field472 = PixMap.createSafe(265, 128, arg0);
		Pix2D.cls();
		field1435 = PixMap.createSafe(265, 128, arg0);
		Pix2D.cls();
		field2044 = PixMap.createSafe(171, 509, arg0);
		Pix2D.cls();
		field2608 = PixMap.createSafe(132, 360, arg0);
		Pix2D.cls();
		field1935 = PixMap.createSafe(200, 360, arg0);
		Pix2D.cls();
		field844 = PixMap.createSafe(238, 202, arg0);
		Pix2D.cls();
		field2701 = PixMap.createSafe(238, 203, arg0);
		Pix2D.cls();
		field1307 = PixMap.createSafe(94, 74, arg0);
		Pix2D.cls();
		field3298 = PixMap.createSafe(94, 75, arg0);
		Pix2D.cls();
		byte[] var3 = arg1.getFile(field3067, field1751);
		Pix32 var4 = new Pix32(var3, arg0);
		field472.bind();
		var4.quickPlotSprite(0, 0);
		field1435.bind();
		var4.quickPlotSprite(-637, 0);
		field2044.bind();
		var4.quickPlotSprite(-128, 0);
		field2608.bind();
		var4.quickPlotSprite(-202, -371);
		field1935.bind();
		var4.quickPlotSprite(-202, -171);
		field844.bind();
		var4.quickPlotSprite(0, -265);
		field2701.bind();
		var4.quickPlotSprite(-562, -265);
		field1307.bind();
		var4.quickPlotSprite(-128, -171);
		field3298.bind();
		var4.quickPlotSprite(-562, -171);
		int[] var5 = new int[var4.wi];
		for (int var6 = 0; var6 < var4.hi; var6++) {
			for (int var7 = 0; var7 < var4.wi; var7++) {
				var5[var7] = var4.data[var4.wi * var6 + var4.wi - var7 - 1];
			}
			for (int var8 = 0; var8 < var4.wi; var8++) {
				var4.data[var4.wi * var6 + var8] = var5[var8];
			}
		}
		field472.bind();
		var4.quickPlotSprite(382, 0);
		field1435.bind();
		var4.quickPlotSprite(-255, 0);
		field2044.bind();
		var4.quickPlotSprite(254, 0);
		field2608.bind();
		var4.quickPlotSprite(180, -371);
		field1935.bind();
		var4.quickPlotSprite(180, -171);
		field844.bind();
		var4.quickPlotSprite(382, -265);
		field2701.bind();
		var4.quickPlotSprite(-180, -265);
		field1307.bind();
		var4.quickPlotSprite(254, -171);
		field3298.bind();
		var4.quickPlotSprite(-180, -171);
		Pix32 var9 = PixLoader.makePix32(arg2, Client.field583, field3067);
		field2044.bind();
		var9.plotSprite(382 - var9.wi / 2 - 128, 18);
		field2806 = PixLoader.makePix8(field1245, field3067, arg2);
		field2919 = PixLoader.makePix8(field1056, field3067, arg2);
		field1177 = PixLoader.makePix8Array(arg2, field473, field3067);
		field2055 = new Pix32(128, 265);
		field851 = new Pix32(128, 265);
		for (int var10 = 0; var10 < 33920; var10++) {
			field2055.data[var10] = field472.data[var10];
		}
		for (int var11 = 0; var11 < 33920; var11++) {
			field851.data[var11] = field1435.data[var11];
		}
		field2600 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field2600[var12] = var12 * 262144;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			field2600[var13 + 64] = var13 * 1024 + 16711680;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			field2600[var14 + 128] = var14 * 4 + 16776960;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			field2600[var15 + 192] = 16777215;
		}
		field3139 = new int[256];
		for (int var16 = 0; var16 < 64; var16++) {
			field3139[var16] = var16 * 1024;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			field3139[var17 + 64] = var17 * 4 + 65280;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			field3139[var18 + 128] = var18 * 262144 + 65535;
		}
		for (int var19 = 0; var19 < 64; var19++) {
			field3139[var19 + 192] = 16777215;
		}
		field2904 = new int[256];
		for (int var20 = 0; var20 < 64; var20++) {
			field2904[var20] = var20 * 4;
		}
		for (int var21 = 0; var21 < 64; var21++) {
			field2904[var21 + 64] = var21 * 262144 + 255;
		}
		for (int var22 = 0; var22 < 64; var22++) {
			field2904[var22 + 128] = var22 * 1024 + 16711935;
		}
		for (int var23 = 0; var23 < 64; var23++) {
			field2904[var23 + 192] = 16777215;
		}
		field2151 = new int[256];
		field3025 = new int[32768];
		field2570 = new int[32768];
		method1010(null);
		field2911 = new int[32768];
		loginPass = field3067;
		loginUser = field3067;
		field229 = new int[32768];
		field1395 = 0;
		if (Client.midiVolume == 0 || Client.lowMem) {
			MidiManager.method672();
		} else {
			MidiManager.method679(Client.songs, field1691, field3067, Client.midiVolume);
		}
		Js5Net.method617(false);
		GameShell.fullredraw = true;
		field1062 = true;
	}

	@ObfuscatedName("na.b(B)V")
	public static void close() {
		if (!field1062) {
			return;
		}
		field2600 = null;
		field1435 = null;
		field3298 = null;
		field2608 = null;
		field2570 = null;
		field2911 = null;
		field2919 = null;
		field3025 = null;
		field2806 = null;
		field3139 = null;
		field472 = null;
		field2044 = null;
		field1307 = null;
		field2055 = null;
		field1177 = null;
		field2904 = null;
		field1935 = null;
		field851 = null;
		field229 = null;
		field2701 = null;
		field844 = null;
		field2151 = null;
		MidiManager.method672();
		Js5Net.method617(true);
		field1062 = false;
	}

	@ObfuscatedName("jc.b(I)V")
	public static void method542() {
		for (int var0 = 10; var0 < 117; var0++) {
			int var1 = (int) (Math.random() * 100.0D);
			if (var1 < 50) {
				field229[var0 + 32512] = 255;
			}
		}
		for (int var2 = 0; var2 < 100; var2++) {
			int var3 = (int) (Math.random() * 124.0D) + 2;
			int var4 = (int) (Math.random() * 128.0D) + 128;
			int var5 = (var4 << 7) + var3;
			field229[var5] = 192;
		}
		for (int var6 = 1; var6 < 255; var6++) {
			for (int var7 = 1; var7 < 127; var7++) {
				int var8 = var7 + (var6 << 7);
				field2911[var8] = (field229[var8 - 1] + field229[var8 + 1] + field229[var8 + -128] + field229[var8 + 128]) / 4;
			}
		}
		field1144 += 128;
		if (field1144 > field2570.length) {
			field1144 -= field2570.length;
			int var9 = (int) (Math.random() * 12.0D);
			method1010(field1177[var9]);
		}
		for (int var10 = 1; var10 < 255; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = (var10 << 7) + var11;
				int var13 = field2911[var12 + 128] - field2570[var12 + field1144 & field2570.length + -1] / 5;
				if (var13 < 0) {
					var13 = 0;
				}
				field229[var12] = var13;
			}
		}
		for (int var14 = 0; var14 < 255; var14++) {
			field847[var14] = field847[var14 + 1];
		}
		field847[255] = (int) (Math.sin((double) Client.loopCycle / 14.0D) * 16.0D + Math.sin((double) Client.loopCycle / 15.0D) * 14.0D + Math.sin((double) Client.loopCycle / 16.0D) * 12.0D);
		if (field1209 > 0) {
			field1209 -= 4;
		}
		if (field2380 > 0) {
			field2380 -= 4;
		}
		if (field1209 != 0 || field2380 != 0) {
			return;
		}
		int var15 = (int) (Math.random() * 2000.0D);
		if (var15 == 0) {
			field1209 = 1024;
		}
		if (var15 == 1) {
			field2380 = 1024;
			return;
		}
	}

    @ObfuscatedName("client.g(I)V")
    public static void method281() {
        if (field1209 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1209 > 768) {
                    field2151[var2] = merge(field2600[var2], field3139[var2], 1024 - field1209);
                } else if (field1209 > 256) {
                    field2151[var2] = field3139[var2];
                } else {
                    field2151[var2] = merge(field3139[var2], field2600[var2], 256 - field1209);
                }
            }
        } else if (field2380 > 0) {
            for (int var0 = 0; var0 < 256; var0++) {
                if (field2380 > 768) {
                    field2151[var0] = merge(field2600[var0], field2904[var0], 1024 - field2380);
                } else if (field2380 > 256) {
                    field2151[var0] = field2904[var0];
                } else {
                    field2151[var0] = merge(field2904[var0], field2600[var0], 256 - field2380);
                }
            }
        } else {
            for (int var1 = 0; var1 < 256; var1++) {
                field2151[var1] = field2600[var1];
            }
        }
        for (int var3 = 0; var3 < 33920; var3++) {
            field472.data[var3] = field2055.data[var3];
        }
        int var4 = 0;
        int var5 = 1152;
        for (int var6 = 1; var6 < 255; var6++) {
            int var7 = (256 - var6) * field847[var6] / 256;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = field229[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var11 = 256 - var10;
                    int var13 = field2151[var10];
                    int var14 = field472.data[var5];
                    field472.data[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var11 & 0xFF0000) >> 8;
                }
            }
            var5 += var8;
        }
        int var15 = 1176;
        int var16 = 0;
        for (int var17 = 0; var17 < 33920; var17++) {
            field1435.data[var17] = field851.data[var17];
        }
        for (int var18 = 1; var18 < 255; var18++) {
            int var19 = (256 - var18) * field847[var18] / 256;
            int var20 = 103 - var19;
            int var21 = var15 + var19;
            for (int var22 = 0; var22 < var20; var22++) {
                int var23 = field229[var16++];
                if (var23 == 0) {
                    var21++;
                } else {
                    int var25 = field1435.data[var21];
                    int var26 = 256 - var23;
                    int var27 = field2151[var23];
                    field1435.data[var21++] = ((var25 & 0xFF00) * var26 + (var27 & 0xFF00) * var23 & 0xFF0000) + ((var25 & 0xFF00FF) * var26 + (var27 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
                }
            }
            var15 = var21 + 128 - var20 - var19;
            var16 += 128 - var20;
        }
    }

	@ObfuscatedName("va.a(ILe;)V")
	public static void method1010(Pix8 arg0) {
		for (int var1 = 0; var1 < field2570.length; var1++) {
			field2570[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			field2570[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					field3025[var7] = (field2570[var7 + 1] + field2570[var7 + 128] + field2570[var7 - 128] + field2570[var7 + -1]) / 4;
				}
			}
			int[] var8 = field2570;
			field2570 = field3025;
			field3025 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.hi; var10++) {
			for (int var11 = 0; var11 < arg0.wi; var11++) {
				if (arg0.data[var9++] != 0) {
					int var12 = arg0.yof + var10 + 16;
					int var13 = var11 + arg0.xof + 16;
					int var14 = (var12 << 7) + var13;
					field2570[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("td.a(Lbd;Lbd;I)I")
	public static int ready(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg0.requestDownload(field1751, field3067)) {
			var2++;
		}
		if (arg1.requestDownload(Client.field583, field3067)) {
			var2++;
		}
		if (arg1.requestDownload(field1245, field3067)) {
			var2++;
		}
		if (arg1.requestDownload(field1056, field3067)) {
			var2++;
		}
		if (arg1.requestDownload(field473, field3067)) {
			var2++;
		}
		return var2;
	}

	@ObfuscatedName("gb.c(B)I")
	public static int readyMax() {
		return 5;
	}

	@ObfuscatedName("md.a(BIII)I")
	public static int merge(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}
}
