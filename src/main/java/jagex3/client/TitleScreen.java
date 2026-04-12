package jagex3.client;

import deob.*;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.PixFont;
import jagex3.graphics.PixMap;
import jagex3.js5.Js5;
import jagex3.util.JagString;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("uc.I")
	public static JagString field3071 = Statics.field3067;

	@ObfuscatedName("td.d(I)V")
	public static void loop() {
		method542();
		if (Client.state != 10) {
			return;
		}
		int var0 = Client.field2762 - 202;
		int var1 = Client.field3050;
		int var2 = Client.field14 - 171;
		if (class53.field1395 == 0) {
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 100 && var2 <= 140) {
				Statics.field2084 = 0;
				class53.field1395 = 3;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 100 && var2 <= 140) {
				class53.field1395 = 2;
				Statics.field2084 = 0;
				Statics.field3060 = Statics.field2104;
				Statics.field3077 = Statics.field1030;
				Statics.field3062 = Statics.field2088;
				return;
			}
			return;
		}
		if (class53.field1395 == 2) {
			byte var3 = 60;
			int var6 = var3 + 30;
			if (var1 == 1 && var2 >= 75 && var2 < 90) {
				Statics.field2084 = 0;
			}
			var6 += 15;
			if (var1 == 1 && var2 >= 90 && var2 < 105) {
				Statics.field2084 = 1;
			}
			var6 += 15;
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 130 && var2 <= 170) {
				field3071 = field3071.method13().method36();
				loginMes(Statics.field2101, Statics.field2095, Statics.field666);
				Client.setMainState(20);
				return;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 130 && var2 <= 170) {
				field3071 = Statics.field3067;
				Statics.field3055 = Statics.field3067;
				class53.field1395 = 0;
			}
			while (true) {
				boolean var4;
				label138:
				do {
					while (ClientKeyboardListener.method685()) {
						var4 = false;
						for (int var5 = 0; var5 < Statics.field3074.method10(); var5++) {
							if (Statics.field2920 == Statics.field3074.method6(var5)) {
								var4 = true;
								break;
							}
						}
						if (Statics.field2084 != 0) {
							continue label138;
						}
						if (Statics.field2885 == 85 && field3071.method10() > 0) {
							field3071 = field3071.method19(0, field3071.method10() - 1);
						}
						if (Statics.field2885 == 84 || Statics.field2885 == 80) {
							Statics.field2084 = 1;
						}
						if (var4 && field3071.method10() < 12) {
							field3071 = field3071.method21(Statics.field2920);
						}
					}
					return;
				} while (Statics.field2084 != 1);
				if (Statics.field2885 == 85 && Statics.field3055.method10() > 0) {
					Statics.field3055 = Statics.field3055.method19(0, Statics.field3055.method10() - 1);
				}
				if (Statics.field2885 == 84 || Statics.field2885 == 80) {
					Statics.field2084 = 0;
				}
				if (var4 && Statics.field3055.method10() < 20) {
					Statics.field3055 = Statics.field3055.method21(Statics.field2920);
				}
			}
		}
		if (class53.field1395 != 3 || var1 != 1 || var0 < 105 || var0 > 255 || var2 < 130 || var2 > 170) {
			return;
		}
		class53.field1395 = 0;
	}

	@ObfuscatedName("rd.a(ILbc;Lbc;)V")
	public static void draw(PixFont arg0, PixFont arg1) {
		Statics.field1935.method1054();
		if (Client.state == 0 || Client.state == 5) {
			arg0.method209(Statics.field2405, 180, 54, 16777215);
			Pix2D.method922(28, 62, 304, 34, 9179409);
			Pix2D.method922(29, 63, 302, 32, 0);
			Pix2D.method913(30, 64, Client.field3274 * 3, 30, 9179409);
			Pix2D.method913(Client.field3274 * 3 + 30, 64, 300 - Client.field3274 * 3, 30, 0);
			arg0.method209(Client.field3079, 180, 85, 16777215);
		}
		if (Client.state == 20) {
			byte var2 = 40;
			Statics.field2806.method329(0, 0);
			arg0.method211(Statics.field3060, 180, 40, 16776960, true);
			int var8 = var2 + 15;
			arg0.method211(Statics.field3077, 180, 55, 16776960, true);
			int var9 = var8 + 15;
			arg0.method211(Statics.field3062, 180, 70, 16776960, true);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg0.method206(JagString.join(new JagString[]{Statics.field3002, field3071}), 90, 95, 16777215, true);
			int var13 = var11 + 15;
			arg0.method206(JagString.join(new JagString[]{Statics.field1037, Statics.field3055.method12()}), 92, 110, 16777215, true);
			int var15 = var13 + 15;
		}
		if (Client.state == 10) {
			Statics.field2806.method329(0, 0);
			if (class53.field1395 == 0) {
				byte var5 = 80;
				arg0.method211(Client.field582, 180, 80, 16776960, true);
				int var23 = var5 + 30;
				Statics.field2919.method329(27, 100);
				arg0.method195(Statics.field2639, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Statics.field2919.method329(187, 100);
				arg0.method195(Statics.field2149, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (class53.field1395 == 2) {
				byte var3 = 40;
				arg0.method211(Statics.field3060, 180, 40, 16776960, true);
				int var12 = var3 + 15;
				arg0.method211(Statics.field3077, 180, 55, 16776960, true);
				int var14 = var12 + 15;
				arg0.method211(Statics.field3062, 180, 70, 16776960, true);
				int var16 = var14 + 15;
				int var17 = var16 + 10;
				arg0.method206(JagString.join(new JagString[]{Statics.field3002, field3071, Client.loopCycle % 40 < 20 & Statics.field2084 == 0 ? Statics.field1204 : Statics.field3067}), 90, 95, 16777215, true);
				int var19 = var17 + 15;
				arg0.method206(JagString.join(new JagString[]{Statics.field1037, Statics.field3055.method12(), Client.loopCycle % 40 < 20 & Statics.field2084 == 1 ? Statics.field1204 : Statics.field3067}), 92, 110, 16777215, true);
				Statics.field2919.method329(27, 130);
				int var21 = var19 + 15;
				arg0.method211(Statics.field926, 100, 155, 16777215, true);
				Statics.field2919.method329(187, 130);
				arg0.method211(Statics.field3302, 260, 155, 16777215, true);
			} else if (class53.field1395 == 3) {
				arg0.method211(Statics.field3265, 180, 40, 16776960, true);
				byte var4 = 65;
				arg0.method211(Statics.field2757, 180, 65, 16777215, true);
				int var18 = var4 + 15;
				arg0.method211(Statics.field2675, 180, 80, 16777215, true);
				int var20 = var18 + 15;
				arg0.method211(Statics.field2667, 180, 95, 16777215, true);
				int var22 = var20 + 15;
				arg0.method211(Statics.field2400, 180, 110, 16777215, true);
				Statics.field2919.method329(107, 130);
				arg0.method211(Statics.field3302, 180, 155, 16777215, true);
				int var24 = var22 + 15;
			}
		}
		Statics.method281();
		try {
			Graphics var6 = GameShell.canvas.getGraphics();
			Statics.field1935.method101(202, var6, 171);
			Statics.field472.method101(0, var6, 0);
			Statics.field1435.method101(637, var6, 0);
			if (GameShell.field2402) {
				GameShell.field2402 = false;
				Statics.field2044.method101(128, var6, 0);
				Statics.field2608.method101(202, var6, 371);
				Statics.field844.method101(0, var6, 265);
				Statics.field2701.method101(562, var6, 265);
				Statics.field1307.method101(128, var6, 171);
				Statics.field3298.method101(562, var6, 171);
			}
		} catch (Exception var7) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("m.a(La;La;La;B)V")
	public static void loginMes(JagString arg0, JagString arg1, JagString arg2) {
		Statics.field3062 = arg0;
		Statics.field3077 = arg2;
		Statics.field3060 = arg1;
	}

	@ObfuscatedName("je.a(Ljava/awt/Component;ZLbd;Lbd;)V")
	public static void open(Component arg0, Js5 arg1, Js5 arg2) {
		if (Statics.field1062) {
			return;
		}
		Statics.field472 = PixMap.method875(265, 128, arg0);
		Pix2D.method920();
		Statics.field1435 = PixMap.method875(265, 128, arg0);
		Pix2D.method920();
		Statics.field2044 = PixMap.method875(171, 509, arg0);
		Pix2D.method920();
		Statics.field2608 = PixMap.method875(132, 360, arg0);
		Pix2D.method920();
		Statics.field1935 = PixMap.method875(200, 360, arg0);
		Pix2D.method920();
		Statics.field844 = PixMap.method875(238, 202, arg0);
		Pix2D.method920();
		Statics.field2701 = PixMap.method875(238, 203, arg0);
		Pix2D.method920();
		Statics.field1307 = PixMap.method875(94, 74, arg0);
		Pix2D.method920();
		Statics.field3298 = PixMap.method875(94, 75, arg0);
		Pix2D.method920();
		byte[] var3 = arg1.method215(Statics.field3067, Statics.field1751);
		Pix32 var4 = new Pix32(var3, arg0);
		Statics.field472.method1054();
		var4.method557(0, 0);
		Statics.field1435.method1054();
		var4.method557(-637, 0);
		Statics.field2044.method1054();
		var4.method557(-128, 0);
		Statics.field2608.method1054();
		var4.method557(-202, -371);
		Statics.field1935.method1054();
		var4.method557(-202, -171);
		Statics.field844.method1054();
		var4.method557(0, -265);
		Statics.field2701.method1054();
		var4.method557(-562, -265);
		Statics.field1307.method1054();
		var4.method557(-128, -171);
		Statics.field3298.method1054();
		var4.method557(-562, -171);
		int[] var5 = new int[var4.field1476];
		for (int var6 = 0; var6 < var4.field1475; var6++) {
			for (int var7 = 0; var7 < var4.field1476; var7++) {
				var5[var7] = var4.field1480[var4.field1476 * var6 + var4.field1476 - var7 - 1];
			}
			for (int var8 = 0; var8 < var4.field1476; var8++) {
				var4.field1480[var4.field1476 * var6 + var8] = var5[var8];
			}
		}
		Statics.field472.method1054();
		var4.method557(382, 0);
		Statics.field1435.method1054();
		var4.method557(-255, 0);
		Statics.field2044.method1054();
		var4.method557(254, 0);
		Statics.field2608.method1054();
		var4.method557(180, -371);
		Statics.field1935.method1054();
		var4.method557(180, -171);
		Statics.field844.method1054();
		var4.method557(382, -265);
		Statics.field2701.method1054();
		var4.method557(-180, -265);
		Statics.field1307.method1054();
		var4.method557(254, -171);
		Statics.field3298.method1054();
		var4.method557(-180, -171);
		Pix32 var9 = Statics.method1038(arg2, Client.field583, Statics.field3067);
		Statics.field2044.method1054();
		var9.method551(382 - var9.field1476 / 2 - 128, 18);
		Statics.field2806 = Statics.method605(Statics.field1245, Statics.field3067, arg2);
		Statics.field2919 = Statics.method605(Statics.field1056, Statics.field3067, arg2);
		Statics.field1177 = Statics.method372(arg2, Statics.field473, Statics.field3067);
		Statics.field2055 = new Pix32(128, 265);
		Statics.field851 = new Pix32(128, 265);
		for (int var10 = 0; var10 < 33920; var10++) {
			Statics.field2055.field1480[var10] = Statics.field472.field3288[var10];
		}
		for (int var11 = 0; var11 < 33920; var11++) {
			Statics.field851.field1480[var11] = Statics.field1435.field3288[var11];
		}
		Statics.field2600 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			Statics.field2600[var12] = var12 * 262144;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			Statics.field2600[var13 + 64] = var13 * 1024 + 16711680;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			Statics.field2600[var14 + 128] = var14 * 4 + 16776960;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			Statics.field2600[var15 + 192] = 16777215;
		}
		Statics.field3139 = new int[256];
		for (int var16 = 0; var16 < 64; var16++) {
			Statics.field3139[var16] = var16 * 1024;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			Statics.field3139[var17 + 64] = var17 * 4 + 65280;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			Statics.field3139[var18 + 128] = var18 * 262144 + 65535;
		}
		for (int var19 = 0; var19 < 64; var19++) {
			Statics.field3139[var19 + 192] = 16777215;
		}
		Statics.field2904 = new int[256];
		for (int var20 = 0; var20 < 64; var20++) {
			Statics.field2904[var20] = var20 * 4;
		}
		for (int var21 = 0; var21 < 64; var21++) {
			Statics.field2904[var21 + 64] = var21 * 262144 + 255;
		}
		for (int var22 = 0; var22 < 64; var22++) {
			Statics.field2904[var22 + 128] = var22 * 1024 + 16711935;
		}
		for (int var23 = 0; var23 < 64; var23++) {
			Statics.field2904[var23 + 192] = 16777215;
		}
		Statics.field2151 = new int[256];
		Statics.field3025 = new int[32768];
		Statics.field2570 = new int[32768];
		Statics.method1010(null);
		Statics.field2911 = new int[32768];
		Statics.field3055 = Statics.field3067;
		field3071 = Statics.field3067;
		Statics.field229 = new int[32768];
		class53.field1395 = 0;
		if (Client.field1554 == 0 || Client.lowMem) {
			Statics.method672();
		} else {
			Statics.method679(Client.field2702, Statics.field1691, Statics.field3067, Client.field1554);
		}
		Statics.method617(false);
		GameShell.field2402 = true;
		Statics.field1062 = true;
	}

	@ObfuscatedName("na.b(B)V")
	public static void close() {
		if (!Statics.field1062) {
			return;
		}
		Statics.field2600 = null;
		Statics.field1435 = null;
		Statics.field3298 = null;
		Statics.field2608 = null;
		Statics.field2570 = null;
		Statics.field2911 = null;
		Statics.field2919 = null;
		Statics.field3025 = null;
		Statics.field2806 = null;
		Statics.field3139 = null;
		Statics.field472 = null;
		Statics.field2044 = null;
		Statics.field1307 = null;
		Statics.field2055 = null;
		Statics.field1177 = null;
		Statics.field2904 = null;
		Statics.field1935 = null;
		Statics.field851 = null;
		Statics.field229 = null;
		Statics.field2701 = null;
		Statics.field844 = null;
		Statics.field2151 = null;
		Statics.method672();
		Statics.method617(true);
		Statics.field1062 = false;
	}

	@ObfuscatedName("jc.b(I)V")
	public static void method542() {
		for (int var0 = 10; var0 < 117; var0++) {
			int var1 = (int) (Math.random() * 100.0D);
			if (var1 < 50) {
				Statics.field229[var0 + 32512] = 255;
			}
		}
		for (int var2 = 0; var2 < 100; var2++) {
			int var3 = (int) (Math.random() * 124.0D) + 2;
			int var4 = (int) (Math.random() * 128.0D) + 128;
			int var5 = (var4 << 7) + var3;
			Statics.field229[var5] = 192;
		}
		for (int var6 = 1; var6 < 255; var6++) {
			for (int var7 = 1; var7 < 127; var7++) {
				int var8 = var7 + (var6 << 7);
				Statics.field2911[var8] = (Statics.field229[var8 - 1] + Statics.field229[var8 + 1] + Statics.field229[var8 + -128] + Statics.field229[var8 + 128]) / 4;
			}
		}
		Statics.field1144 += 128;
		if (Statics.field1144 > Statics.field2570.length) {
			Statics.field1144 -= Statics.field2570.length;
			int var9 = (int) (Math.random() * 12.0D);
			Statics.method1010(Statics.field1177[var9]);
		}
		for (int var10 = 1; var10 < 255; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = (var10 << 7) + var11;
				int var13 = Statics.field2911[var12 + 128] - Statics.field2570[var12 + Statics.field1144 & Statics.field2570.length + -1] / 5;
				if (var13 < 0) {
					var13 = 0;
				}
				Statics.field229[var12] = var13;
			}
		}
		for (int var14 = 0; var14 < 255; var14++) {
			class31.field847[var14] = class31.field847[var14 + 1];
		}
		class31.field847[255] = (int) (Math.sin((double) Client.loopCycle / 14.0D) * 16.0D + Math.sin((double) Client.loopCycle / 15.0D) * 14.0D + Math.sin((double) Client.loopCycle / 16.0D) * 12.0D);
		if (class46.field1209 > 0) {
			class46.field1209 -= 4;
		}
		if (Statics.field2380 > 0) {
			Statics.field2380 -= 4;
		}
		if (class46.field1209 != 0 || Statics.field2380 != 0) {
			return;
		}
		int var15 = (int) (Math.random() * 2000.0D);
		if (var15 == 0) {
			class46.field1209 = 1024;
		}
		if (var15 == 1) {
			Statics.field2380 = 1024;
			return;
		}
	}
}
