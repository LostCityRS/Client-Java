package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class53;
import jagex3.graphics.Pix2D;
import jagex3.graphics.PixFont;
import jagex3.util.JagString;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("uc.I")
	public static JagString field3071 = Statics.field3067;

	@ObfuscatedName("td.d(I)V")
	public static void loop() {
		Statics.method542();
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
				Client.method399(20);
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
}
