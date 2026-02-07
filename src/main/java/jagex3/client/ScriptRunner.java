package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.config.EnumType;
import jagex3.config.InvType;
import jagex3.config.ObjType;
import jagex3.config.iftype.IfType;
import jagex3.config.iftype.ServerActive;
import jagex3.constants.Text;
import jagex3.graphics.PixFont;
import jagex3.graphics.PixFontGeneric;
import jagex3.jstring.JString;
import jagex3.jstring.StringTools;
import jagex3.util.JagString;
import jagex3.var.VarCache;

import java.util.Calendar;
import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("ua.u")
	public static int field3233 = 0;
	@ObfuscatedName("fc.r")
	public static JagString[] field928;
	@ObfuscatedName("ab.s")
	public static int[] field47;
	@ObfuscatedName("of.e")
	public static JagString field2406 = JagString.wrap("event_opbase");
	@ObfuscatedName("fb.J")
	public static int[] field916 = new int[1000];
	@ObfuscatedName("i.n")
	public static JagString[] field1305 = new JagString[1000];
	@ObfuscatedName("i.k")
	public static ClientGosubFrame[] field1302 = new ClientGosubFrame[50];
	@ObfuscatedName("pf.M")
	public static int[] field2581 = new int[5];
	@ObfuscatedName("na.e")
	public static int[][] field2079 = new int[5][5000];
	@ObfuscatedName("ma.c")
	public static JagString field1970 = JagString.wrap("null");
	@ObfuscatedName("ja.h")
	public static IfType field1447;
	@ObfuscatedName("wd.A")
	public static IfType field3604;
	@ObfuscatedName("wf.j")
	public static JagString field3652 = JagString.wrap("");
	@ObfuscatedName("ha.y")
	public static JagString field1152 = JagString.wrap("<img=0>");
	@ObfuscatedName("kf.n")
	public static JagString field1768 = JagString.wrap("<img=1>");
	@ObfuscatedName("v.d")
	public static Calendar field3311 = Calendar.getInstance();
	@ObfuscatedName("mb.g")
	public static JagString field1984 = JagString.wrap(")2");
	@ObfuscatedName("va.A")
	public static JagString field3351 = JagString.wrap("Jan");
	@ObfuscatedName("va.n")
	public static JagString field3338 = JagString.wrap("Feb");
	@ObfuscatedName("va.z")
	public static JagString field3350 = JagString.wrap("Mar");
	@ObfuscatedName("va.p")
	public static JagString field3340 = JagString.wrap("Apr");
	@ObfuscatedName("va.f")
	public static JagString field3330 = JagString.wrap("May");
	@ObfuscatedName("va.b")
	public static JagString field3326 = JagString.wrap("Jun");
	@ObfuscatedName("va.m")
	public static JagString field3337 = JagString.wrap("Jul");
	@ObfuscatedName("va.j")
	public static JagString field3334 = JagString.wrap("Aug");
	@ObfuscatedName("va.h")
	public static JagString field3332 = JagString.wrap("Sep");
	@ObfuscatedName("va.c")
	public static JagString field3327 = JagString.wrap("Oct");
	@ObfuscatedName("va.d")
	public static JagString field3328 = JagString.wrap("Nov");
	@ObfuscatedName("va.B")
	public static JagString field3352 = JagString.wrap("Dec");
	@ObfuscatedName("va.i")
	public static JagString[] field3333 = new JagString[] { field3351, field3338, field3350, field3340, field3330, field3326, field3337, field3334, field3332, field3327, field3328, field3352 };
	@ObfuscatedName("tb.c")
	public static JagString field3110 = JagString.wrap("::");
	@ObfuscatedName("qf.F")
	public static JagString field2808 = JagString.wrap("Clientscript error )2 check log for details");
	@ObfuscatedName("ee.V")
	public static JagString field714 = JagString.wrap("(U0a )2 in: ");
	@ObfuscatedName("m.c")
	public static JagString field1924 = JagString.wrap("(U0a )2 via: ");
	@ObfuscatedName("ed.p")
	public static JagString field695 = JagString.wrap("(U0a )2 non)2existant gosub script)2num: ");
	@ObfuscatedName("kb.n")
	public static JagString field1675 = JagString.wrap("Clientscript error in: ");

	@ObfuscatedName("we.a(Lbd;B)V")
	public static void executeScript(HookReq arg0) {
		Object[] var1 = arg0.field208;
		int var2 = (Integer) var1[0];
		ClientScript var3 = ClientScript.method276(var2);
		if (var3 == null) {
			return;
		}
		field3233 = 0;
		int var4 = 0;
		int var5 = 0;
		int[] var6 = var3.field3265;
		int[] var7 = var3.field3270;
		byte var8 = -1;
		int var9 = -1;
		try {
			field928 = new JagString[var3.field3264];
			int var10 = 0;
			field47 = new int[var3.field3259];
			int var11 = 0;
			for (int var12 = 1; var12 < var1.length; var12++) {
				if (var1[var12] instanceof Integer) {
					int var14 = (Integer) var1[var12];
					if (var14 == -2147483647) {
						var14 = arg0.field204;
					}
					if (var14 == -2147483646) {
						var14 = arg0.field210;
					}
					if (var14 == -2147483645) {
						var14 = arg0.field209 == null ? -1 : arg0.field209.field743;
					}
					if (var14 == -2147483644) {
						var14 = arg0.field205;
					}
					if (var14 == -2147483643) {
						var14 = arg0.field209 == null ? -1 : arg0.field209.field828;
					}
					if (var14 == -2147483642) {
						var14 = arg0.field202 == null ? -1 : arg0.field202.field743;
					}
					if (var14 == -2147483641) {
						var14 = arg0.field202 == null ? -1 : arg0.field202.field828;
					}
					if (var14 == -2147483640) {
						var14 = arg0.field199;
					}
					if (var14 == -2147483639) {
						var14 = arg0.field207;
					}
					field47[var10++] = var14;
				} else if (var1[var12] instanceof JagString) {
					JagString var13 = (JagString) var1[var12];
					if (var13.method272(field2406)) {
						var13 = arg0.field203;
					}
					field928[var11++] = var13;
				}
			}
			int var15 = 0;
			label1965:
			while (true) {
				var15++;
				if (var15 > 200000) {
					throw new RuntimeException("slow");
				}
				var9++;
				int var270 = var6[var9];
				if (var270 < 100) {
					if (var270 == 0) {
						field916[var5++] = var7[var9];
						continue;
					}
					if (var270 == 1) {
						int var16 = var7[var9];
						field916[var5++] = VarCache.field504[var16];
						continue;
					}
					if (var270 == 2) {
						int var17 = var7[var9];
						var5--;
						VarCache.field504[var17] = field916[var5];
						continue;
					}
					if (var270 == 3) {
						field1305[var4++] = var3.field3268[var9];
						continue;
					}
					if (var270 == 6) {
						var9 += var7[var9];
						continue;
					}
					if (var270 == 7) {
						var5 -= 2;
						if (field916[var5] != field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 8) {
						var5 -= 2;
						if (field916[var5] == field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 9) {
						var5 -= 2;
						if (field916[var5 + 1] > field916[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 10) {
						var5 -= 2;
						if (field916[var5] > field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 21) {
						if (field3233 == 0) {
							return;
						}
						ClientGosubFrame var18 = field1302[--field3233];
						field928 = var18.field2916;
						var9 = var18.field2920;
						var3 = var18.field2921;
						var6 = var3.field3265;
						field47 = var18.field2917;
						var7 = var3.field3270;
						continue;
					}
					if (var270 == 25) {
						int var19 = var7[var9];
						field916[var5++] = VarCache.getVarbit(var19);
						continue;
					}
					if (var270 == 27) {
						int var20 = var7[var9];
						var5--;
						VarCache.setVarbit(field916[var5], var20);
						continue;
					}
					if (var270 == 31) {
						var5 -= 2;
						if (field916[var5] <= field916[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 32) {
						var5 -= 2;
						if (field916[var5 + 1] <= field916[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 33) {
						field916[var5++] = field47[var7[var9]];
						continue;
					}
					int var10001;
					if (var270 == 34) {
						var10001 = var7[var9];
						var5--;
						field47[var10001] = field916[var5];
						continue;
					}
					if (var270 == 35) {
						field1305[var4++] = field928[var7[var9]];
						continue;
					}
					if (var270 == 36) {
						var10001 = var7[var9];
						var4--;
						field928[var10001] = field1305[var4];
						continue;
					}
					if (var270 == 37) {
						int var21 = var7[var9];
						var4 -= var21;
						JagString var22 = JagString.method655(field1305, var21, var4);
						field1305[var4++] = var22;
						continue;
					}
					if (var270 == 38) {
						var5--;
						continue;
					}
					if (var270 == 39) {
						var4--;
						continue;
					}
					if (var270 == 40) {
						int var23 = var7[var9];
						ClientScript var24 = ClientScript.method276(var23);
						int[] var25 = new int[var24.field3259];
						JagString[] var26 = new JagString[var24.field3264];
						for (int var27 = 0; var27 < var24.field3267; var27++) {
							var25[var27] = field916[var5 + var27 - var24.field3267];
						}
						for (int var28 = 0; var28 < var24.field3263; var28++) {
							var26[var28] = field1305[var4 + var28 - var24.field3263];
						}
						var4 -= var24.field3263;
						var5 -= var24.field3267;
						ClientGosubFrame var29 = new ClientGosubFrame();
						var29.field2920 = var9;
						var29.field2921 = var3;
						var9 = -1;
						var29.field2916 = field928;
						var3 = var24;
						var29.field2917 = field47;
						field1302[field3233++] = var29;
						field47 = var25;
						var6 = var24.field3265;
						field928 = var26;
						var7 = var24.field3270;
						continue;
					}
					if (var270 == 42) {
						field916[var5++] = Client.field1831[var7[var9]];
						continue;
					}
					if (var270 == 43) {
						var10001 = var7[var9];
						var5--;
						Client.field1831[var10001] = field916[var5];
						continue;
					}
					if (var270 == 44) {
						int var30 = var7[var9] >> 16;
						int var31 = var7[var9] & 0xFFFF;
						var5--;
						int var32 = field916[var5];
						if (var32 >= 0 && var32 <= 5000) {
							field2581[var30] = var32;
							byte var33 = -1;
							if (var31 == 105) {
								var33 = 0;
							}
							int var34 = 0;
							while (true) {
								if (var34 >= var32) {
									continue label1965;
								}
								field2079[var30][var34] = var33;
								var34++;
							}
						}
						throw new RuntimeException();
					}
					if (var270 == 45) {
						int var35 = var7[var9];
						var5--;
						int var36 = field916[var5];
						if (var36 >= 0 && var36 < field2581[var35]) {
							field916[var5++] = field2079[var35][var36];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 46) {
						int var37 = var7[var9];
						var5 -= 2;
						int var38 = field916[var5];
						if (var38 >= 0 && field2581[var37] > var38) {
							field2079[var37][var38] = field916[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 47) {
						JagString var39 = Client.field3626[var7[var9]];
						if (var39 == null) {
							var39 = field1970;
						}
						field1305[var4++] = var39;
						continue;
					}
					if (var270 == 48) {
						var10001 = var7[var9];
						var4--;
						Client.field3626[var10001] = field1305[var4];
						continue;
					}
				}
				boolean var40;
				if (var7[var9] == 1) {
					var40 = true;
				} else {
					var40 = false;
				}
				if (var270 < 1000) {
					if (var270 == 100) {
						var5 -= 3;
						int var41 = field916[var5];
						int var42 = field916[var5 + 1];
						int var43 = field916[var5 + 2];
						if (var42 == 0) {
							throw new RuntimeException();
						}
						IfType var44 = IfType.get(var41);
						if (var44.field754 == null) {
							var44.field754 = new IfType[var43 + 1];
						}
						if (var43 >= var44.field754.length) {
							IfType[] var45 = new IfType[var43 + 1];
							for (int var46 = 0; var46 < var44.field754.length; var46++) {
								var45[var46] = var44.field754[var46];
							}
							var44.field754 = var45;
						}
						if (var43 > 0 && var44.field754[var43 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var43 - 1));
						}
						IfType var47 = new IfType();
						var47.field755 = var42;
						var47.field848 = true;
						var47.field828 = var43;
						var47.field864 = var47.field743 = var44.field743;
						var44.field754[var43] = var47;
						if (var40) {
							field1447 = var47;
						} else {
							field3604 = var47;
						}
						Client.componentUpdated(var44);
						continue;
					}
					if (var270 == 101) {
						IfType var48 = var40 ? field1447 : field3604;
						IfType var49 = IfType.get(var48.field743);
						var49.field754[var48.field828] = null;
						Client.componentUpdated(var49);
						continue;
					}
					if (var270 == 102) {
						var5--;
						IfType var50 = IfType.get(field916[var5]);
						var50.field754 = null;
						Client.componentUpdated(var50);
						continue;
					}
					if (var270 == 200) {
						var5 -= 2;
						int var51 = field916[var5 + 1];
						int var52 = field916[var5];
						IfType var53 = IfType.get(var51, var52);
						if (var53 != null && var51 != -1) {
							field916[var5++] = 1;
							if (var40) {
								field1447 = var53;
							} else {
								field3604 = var53;
							}
							continue;
						}
						field916[var5++] = 0;
						continue;
					}
				} else if (var270 >= 1000 && var270 < 1100 || !(var270 < 2000 || var270 >= 2100)) {
					IfType var263;
					if (var270 < 2000) {
						var263 = var40 ? field1447 : field3604;
					} else {
						var270 -= 1000;
						var5--;
						var263 = IfType.get(field916[var5]);
					}
					if (var270 == 1000) {
						var5 -= 2;
						var263.field829 = field916[var5];
						var263.field855 = field916[var5 + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (var270 == 1001) {
						var5 -= 2;
						var263.field810 = field916[var5];
						var263.height = field916[var5 + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (var270 == 1003) {
						var5--;
						boolean var264 = field916[var5] == 1;
						if (var263.field740 != var264) {
							var263.field740 = var264;
							Client.componentUpdated(var263);
						}
						continue;
					}
				} else if (var270 >= 1100 && var270 < 1200 || !(var270 < 2100 || var270 >= 2200)) {
					IfType var54;
					if (var270 >= 2000) {
						var270 -= 1000;
						var5--;
						var54 = IfType.get(field916[var5]);
					} else {
						var54 = var40 ? field1447 : field3604;
					}
					if (var270 == 1100) {
						var5 -= 2;
						var54.field843 = field916[var5];
						if (var54.field860 - var54.field810 < var54.field843) {
							var54.field843 = var54.field860 - var54.field810;
						}
						if (var54.field843 < 0) {
							var54.field843 = 0;
						}
						var54.scrollPosY = field916[var5 + 1];
						if (var54.scrollPosY > var54.scrollHeight - var54.height) {
							var54.scrollPosY = var54.scrollHeight - var54.height;
						}
						if (var54.scrollPosY < 0) {
							var54.scrollPosY = 0;
						}
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1101) {
						var5--;
						var54.field776 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1102) {
						var5--;
						var54.field803 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1103) {
						var5--;
						var54.field861 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1104) {
						var5--;
						var54.field788 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1105) {
						var5--;
						var54.field819 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1106) {
						var5--;
						var54.field777 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1107) {
						var5--;
						var54.field748 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1108) {
						var54.field770 = 1;
						var5--;
						var54.field849 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1109) {
						var5 -= 6;
						var54.field816 = field916[var5];
						var54.field851 = field916[var5 + 1];
						var54.field812 = field916[var5 + 2];
						var54.field874 = field916[var5 + 3];
						var54.field750 = field916[var5 + 4];
						var54.field808 = field916[var5 + 5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1110) {
						var5--;
						int var55 = field916[var5];
						if (var55 != var54.field765) {
							var54.field839 = 0;
							var54.field762 = 0;
							var54.field765 = var55;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (var270 == 1111) {
						var5--;
						var54.field853 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1112) {
						var4--;
						JagString var56 = field1305[var4];
						if (!var56.method272(var54.field763)) {
							var54.field763 = var56;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (var270 == 1113) {
						var5--;
						var54.field807 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1114) {
						var5 -= 3;
						var54.field841 = field916[var5];
						var54.field799 = field916[var5 + 1];
						var54.field838 = field916[var5 + 2];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1115) {
						var5--;
						var54.field856 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1116) {
						var5--;
						var54.field796 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1117) {
						var5--;
						var54.field817 = field916[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1118) {
						var5--;
						var54.field814 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1119) {
						var5--;
						var54.field772 = field916[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1120) {
						var5 -= 2;
						var54.field860 = field916[var5];
						var54.scrollHeight = field916[var5 + 1];
						Client.componentUpdated(var54);
						continue;
					}
				} else if (var270 >= 1200 && var270 < 1300 || !(var270 < 2200 || var270 >= 2300)) {
					IfType var57;
					if (var270 < 2000) {
						var57 = var40 ? field1447 : field3604;
					} else {
						var270 -= 1000;
						var5--;
						var57 = IfType.get(field916[var5]);
					}
					Client.componentUpdated(var57);
					if (var270 == 1200) {
						var5 -= 2;
						int var58 = field916[var5];
						int var59 = field916[var5 + 1];
						var57.field786 = var59;
						var57.field804 = var58;
						ObjType var60 = ObjType.method1092(var58);
						var57.field874 = var60.field1416;
						var57.field812 = var60.field1426;
						var57.field808 = var60.field1391;
						var57.field851 = var60.field1376;
						var57.field750 = var60.field1374;
						if (var57.field810 > 0) {
							var57.field808 = var57.field808 * 32 / var57.field810;
						}
						var57.field816 = var60.field1384;
						continue;
					}
					if (var270 == 1201) {
						var57.field770 = 2;
						var5--;
						var57.field849 = field916[var5];
						continue;
					}
					if (var270 == 1202) {
						var57.field770 = 3;
						var57.field849 = Client.field373.field1631.method234();
						continue;
					}
				} else if ((var270 < 1300 || var270 >= 1400) && (var270 < 2300 || var270 >= 2400)) {
					if (var270 >= 1400 && var270 < 1500 || var270 >= 2400 && var270 < 2500) {
						IfType var61;
						if (var270 < 2000) {
							var61 = var40 ? field1447 : field3604;
						} else {
							var5--;
							var61 = IfType.get(field916[var5]);
							var270 -= 1000;
						}
						var4--;
						JagString var62 = field1305[var4];
						int[] var63 = null;
						if (var62.length() > 0 && var62.method260(var62.length() - 1) == 89) {
							var5--;
							int var64 = field916[var5];
							if (var64 > 0) {
								var63 = new int[var64];
								while (var64-- > 0) {
									var5--;
									var63[var64] = field916[var5];
								}
							}
							var62 = var62.substring(0, var62.length() - 1);
						}
						Object[] var65 = new Object[var62.length() + 1];
						for (int var66 = var65.length - 1; var66 >= 1; var66--) {
							if (var62.method260(var66 - 1) == 115) {
								var4--;
								var65[var66] = field1305[var4];
							} else {
								var5--;
								var65[var66] = Integer.valueOf(field916[var5]);
							}
						}
						var5--;
						int var67 = field916[var5];
						if (var67 == -1) {
							var65 = null;
						} else {
							var65[0] = Integer.valueOf(var67);
						}
						if (var270 == 1405) {
							var61.field852 = var65;
						}
						if (var270 == 1412) {
							var61.field836 = var65;
						}
						if (var270 == 1400) {
							var61.field865 = var65;
						}
						if (var270 == 1406) {
							var61.field802 = var65;
						}
						if (var270 == 1404) {
							var61.field775 = var65;
						}
						if (var270 == 1415) {
							var61.field771 = var65;
							var61.field875 = var63;
						}
						if (var270 == 1421) {
							var61.field793 = var65;
						}
						if (var270 == 1418) {
							var61.field782 = var65;
						}
						if (var270 == 1402) {
							var61.field835 = var65;
						}
						if (var270 == 1401) {
							var61.field779 = var65;
						}
						if (var270 == 1424) {
							var61.field795 = var65;
						}
						if (var270 == 1414) {
							var61.field747 = var63;
							var61.field751 = var65;
						}
						var61.field847 = true;
						if (var270 == 1409) {
							var61.field794 = var65;
						}
						if (var270 == 1420) {
							var61.field780 = var65;
						}
						if (var270 == 1407) {
							var61.field821 = var63;
							var61.field800 = var65;
						}
						if (var270 == 1422) {
							var61.field822 = var65;
						}
						if (var270 == 1419) {
							var61.field741 = var65;
						}
						if (var270 == 1416) {
							var61.field837 = var65;
						}
						if (var270 == 1423) {
							var61.field758 = var65;
						}
						if (var270 == 1417) {
							var61.field866 = var65;
						}
						if (var270 == 1403) {
							var61.field850 = var65;
						}
						if (var270 == 1411) {
							var61.field846 = var65;
						}
						if (var270 == 1410) {
							var61.field871 = var65;
						}
						if (var270 == 1408) {
							var61.field766 = var65;
						}
						continue;
					}
					if (var270 < 1600) {
						IfType var258 = var40 ? field1447 : field3604;
						if (var270 == 1500) {
							field916[var5++] = var258.field829;
							continue;
						}
						if (var270 == 1501) {
							field916[var5++] = var258.field855;
							continue;
						}
						if (var270 == 1502) {
							field916[var5++] = var258.field810;
							continue;
						}
						if (var270 == 1503) {
							field916[var5++] = var258.height;
							continue;
						}
						if (var270 == 1504) {
							field916[var5++] = var258.field740 ? 1 : 0;
							continue;
						}
						if (var270 == 1505) {
							field916[var5++] = var258.field864;
							continue;
						}
					} else if (var270 < 1700) {
						IfType var68 = var40 ? field1447 : field3604;
						if (var270 == 1600) {
							field916[var5++] = var68.field843;
							continue;
						}
						if (var270 == 1601) {
							field916[var5++] = var68.scrollPosY;
							continue;
						}
						if (var270 == 1602) {
							field1305[var4++] = var68.field763;
							continue;
						}
						if (var270 == 1603) {
							field916[var5++] = var68.field860;
							continue;
						}
						if (var270 == 1604) {
							field916[var5++] = var68.scrollHeight;
							continue;
						}
						if (var270 == 1605) {
							field916[var5++] = var68.field808;
							continue;
						}
						if (var270 == 1606) {
							field916[var5++] = var68.field812;
							continue;
						}
						if (var270 == 1607) {
							field916[var5++] = var68.field750;
							continue;
						}
						if (var270 == 1608) {
							field916[var5++] = var68.field874;
							continue;
						}
					} else if (var270 < 1800) {
						IfType var69 = var40 ? field1447 : field3604;
						if (var270 == 1700) {
							field916[var5++] = var69.field804;
							continue;
						}
						if (var270 == 1701) {
							if (var69.field804 == -1) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = var69.field786;
							}
							continue;
						}
						if (var270 == 1702) {
							field916[var5++] = var69.field828;
							continue;
						}
					} else if (var270 < 1900) {
						IfType var256 = var40 ? field1447 : field3604;
						if (var270 == 1800) {
							field916[var5++] = ServerActive.method768(Client.method1100(var256));
							continue;
						}
						if (var270 == 1801) {
							var5--;
							int var257 = field916[var5];
							int var272 = var257 - 1;
							if (var256.field738 != null && var256.field738.length > var272 && var256.field738[var272] != null) {
								field1305[var4++] = var256.field738[var272];
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 1802) {
							if (var256.field813 == null) {
								field1305[var4++] = field3652;
							} else {
								field1305[var4++] = var256.field813;
							}
							continue;
						}
					} else if (var270 < 2600) {
						var5--;
						IfType var70 = IfType.get(field916[var5]);
						if (var270 == 2500) {
							field916[var5++] = var70.field829;
							continue;
						}
						if (var270 == 2501) {
							field916[var5++] = var70.field855;
							continue;
						}
						if (var270 == 2502) {
							field916[var5++] = var70.field810;
							continue;
						}
						if (var270 == 2503) {
							field916[var5++] = var70.height;
							continue;
						}
						if (var270 == 2504) {
							field916[var5++] = var70.field740 ? 1 : 0;
							continue;
						}
						if (var270 == 2505) {
							field916[var5++] = var70.field864;
							continue;
						}
					} else if (var270 < 2700) {
						var5--;
						IfType var255 = IfType.get(field916[var5]);
						if (var270 == 2600) {
							field916[var5++] = var255.field843;
							continue;
						}
						if (var270 == 2601) {
							field916[var5++] = var255.scrollPosY;
							continue;
						}
						if (var270 == 2602) {
							field1305[var4++] = var255.field763;
							continue;
						}
						if (var270 == 2603) {
							field916[var5++] = var255.field860;
							continue;
						}
						if (var270 == 2604) {
							field916[var5++] = var255.scrollHeight;
							continue;
						}
						if (var270 == 2605) {
							field916[var5++] = var255.field808;
							continue;
						}
						if (var270 == 2606) {
							field916[var5++] = var255.field812;
							continue;
						}
						if (var270 == 2607) {
							field916[var5++] = var255.field750;
							continue;
						}
						if (var270 == 2608) {
							field916[var5++] = var255.field874;
							continue;
						}
					} else if (var270 < 2800) {
						if (var270 == 2700) {
							var5--;
							IfType var71 = IfType.get(field916[var5]);
							field916[var5++] = var71.field804;
							continue;
						}
						if (var270 == 2701) {
							var5--;
							IfType var72 = IfType.get(field916[var5]);
							if (var72.field804 == -1) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = var72.field786;
							}
							continue;
						}
						if (var270 == 2702) {
							var5--;
							int var73 = field916[var5];
							SubInterface var74 = (SubInterface) Client.field2571.find((long) var73);
							if (var74 == null) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = 1;
							}
							continue;
						}
					} else if (var270 < 2900) {
						var5--;
						IfType var75 = IfType.get(field916[var5]);
						if (var270 == 2800) {
							field916[var5++] = ServerActive.method768(Client.method1100(var75));
							continue;
						}
						if (var270 == 2801) {
							var5--;
							int var76 = field916[var5];
							int var271 = var76 - 1;
							if (var75.field738 != null && var75.field738.length > var271 && var75.field738[var271] != null) {
								field1305[var4++] = var75.field738[var271];
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 2802) {
							if (var75.field813 == null) {
								field1305[var4++] = field3652;
							} else {
								field1305[var4++] = var75.field813;
							}
							continue;
						}
					} else if (var270 < 3200) {
						if (var270 == 3100) {
							var4--;
							JagString var241 = field1305[var4];
							Client.addChat(var241, 0, field3652);
							continue;
						}
						if (var270 == 3101) {
							var5 -= 2;
							Client.method1023(field916[var5 + 1], Client.field373, field916[var5]);
							continue;
						}
						if (var270 == 3103) {
							Client.method871();
							continue;
						}
						if (var270 == 3104) {
							var4--;
							JagString var242 = field1305[var4];
							int var243 = 0;
							if (var242.method274()) {
								var243 = var242.method261();
							}
							Client.out.p1Enc(216);
							Client.out.p4(var243);
							continue;
						}
						if (var270 == 3105) {
							var4--;
							JagString var244 = field1305[var4];
							Client.out.p1Enc(36);
							Client.out.p8(var244.method259());
							continue;
						}
						if (var270 == 3106) {
							var4--;
							JagString var245 = field1305[var4];
							Client.out.p1Enc(86);
							Client.out.p1(var245.length() + 1);
							Client.out.pjstr(var245);
							continue;
						}
						if (var270 == 3107) {
							var5--;
							int var246 = field916[var5];
							var4--;
							JagString var247 = field1305[var4];
							Client.opPlayer(var246, var247);
							continue;
						}
						if (var270 == 3108) {
							var5 -= 3;
							int var248 = field916[var5];
							int var249 = field916[var5 + 1];
							int var250 = field916[var5 + 2];
							IfType var251 = IfType.get(var250);
							Client.method127(var251, var249, var248);
							continue;
						}
						if (var270 == 3109) {
							var5 -= 2;
							int var252 = field916[var5];
							int var253 = field916[var5 + 1];
							IfType var254 = var40 ? field1447 : field3604;
							Client.method127(var254, var253, var252);
							continue;
						}
					} else if (var270 < 3300) {
						if (var270 == 3200) {
							var5 -= 3;
							Client.method17(field916[var5], field916[var5 + 2], field916[var5 + 1]);
							continue;
						}
						if (var270 == 3201) {
							var5--;
							Client.method825(field916[var5]);
							continue;
						}
						if (var270 == 3202) {
							var5 -= 2;
							Client.method315(field916[var5], field916[var5 + 1]);
							continue;
						}
					} else if (var270 < 3400) {
						if (var270 == 3300) {
							field916[var5++] = Client.loopCycle;
							continue;
						}
						if (var270 == 3301) {
							var5 -= 2;
							int var77 = field916[var5];
							int var78 = field916[var5 + 1];
							field916[var5++] = ClientInvCache.method597(var78, var77);
							continue;
						}
						if (var270 == 3302) {
							var5 -= 2;
							int var79 = field916[var5];
							int var80 = field916[var5 + 1];
							field916[var5++] = ClientInvCache.method406(var79, var80);
							continue;
						}
						if (var270 == 3303) {
							var5 -= 2;
							int var81 = field916[var5 + 1];
							int var82 = field916[var5];
							field916[var5++] = ClientInvCache.method196(var82, var81);
							continue;
						}
						if (var270 == 3304) {
							var5--;
							int var83 = field916[var5];
							field916[var5++] = InvType.method724(var83).field3207;
							continue;
						}
						if (var270 == 3305) {
							var5--;
							int var84 = field916[var5];
							field916[var5++] = Client.field3173[var84];
							continue;
						}
						if (var270 == 3306) {
							var5--;
							int var85 = field916[var5];
							field916[var5++] = Client.field1159[var85];
							continue;
						}
						if (var270 == 3307) {
							var5--;
							int var86 = field916[var5];
							field916[var5++] = Client.field343[var86];
							continue;
						}
						if (var270 == 3308) {
							int var87 = Client.minusedlevel;
							int var88 = (Client.field373.field2747 >> 7) + Client.field1700;
							int var89 = Client.field2836 + (Client.field373.field2698 >> 7);
							field916[var5++] = var89 + (var87 << 28) + (var88 << 14);
							continue;
						}
						if (var270 == 3309) {
							var5--;
							int var90 = field916[var5];
							field916[var5++] = var90 >> 14 & 0x3FFF;
							continue;
						}
						if (var270 == 3310) {
							var5--;
							int var91 = field916[var5];
							field916[var5++] = var91 >> 28;
							continue;
						}
						if (var270 == 3311) {
							var5--;
							int var92 = field916[var5];
							field916[var5++] = var92 & 0x3FFF;
							continue;
						}
						if (var270 == 3312) {
							field916[var5++] = Client.memServer ? 1 : 0;
							continue;
						}
						if (var270 == 3313) {
							var5 -= 2;
							int var93 = field916[var5] + 32768;
							int var94 = field916[var5 + 1];
							field916[var5++] = ClientInvCache.method597(var94, var93);
							continue;
						}
						if (var270 == 3314) {
							var5 -= 2;
							int var95 = field916[var5] + 32768;
							int var96 = field916[var5 + 1];
							field916[var5++] = ClientInvCache.method406(var95, var96);
							continue;
						}
						if (var270 == 3315) {
							var5 -= 2;
							int var97 = field916[var5] + 32768;
							int var98 = field916[var5 + 1];
							field916[var5++] = ClientInvCache.method196(var97, var98);
							continue;
						}
						if (var270 == 3316) {
							if (Client.staffmodlevel >= 2) {
								field916[var5++] = Client.staffmodlevel;
							} else {
								field916[var5++] = 0;
							}
							continue;
						}
						if (var270 == 3317) {
							field916[var5++] = Client.field1294;
							continue;
						}
						if (var270 == 3318) {
							field916[var5++] = Client.worldid;
							continue;
						}
						if (var270 == 3321) {
							field916[var5++] = Client.field3153;
							continue;
						}
						if (var270 == 3322) {
							field916[var5++] = Client.field49;
							continue;
						}
						if (var270 == 3323) {
							if (Client.staffmodlevel == 1) {
								field916[var5++] = 1;
							} else {
								field916[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3500) {
						if (var270 == 3400) {
							var5 -= 2;
							int var99 = field916[var5];
							int var100 = field916[var5 + 1];
							EnumType var101 = EnumType.method938(var99);
							for (int var102 = 0; var102 < var101.field2991; var102++) {
								if (var100 == var101.field2985[var102]) {
									field1305[var4++] = var101.field2989[var102];
									var101 = null;
									break;
								}
							}
							if (var101 != null) {
								field1305[var4++] = var101.field2984;
							}
							continue;
						}
						if (var270 == 3408) {
							var5 -= 4;
							int var103 = field916[var5 + 1];
							int var104 = field916[var5];
							int var105 = field916[var5 + 2];
							int var106 = field916[var5 + 3];
							EnumType var107 = EnumType.method938(var105);
							if (var107.field3005 == var104 && var103 == var107.field3002) {
								for (int var108 = 0; var108 < var107.field2991; var108++) {
									if (var106 == var107.field2985[var108]) {
										if (var103 == 115) {
											field1305[var4++] = var107.field2989[var108];
										} else {
											field916[var5++] = var107.field2988[var108];
										}
										var107 = null;
										break;
									}
								}
								if (var107 != null) {
									if (var103 == 115) {
										field1305[var4++] = var107.field2984;
									} else {
										field916[var5++] = var107.field2996;
									}
								}
								continue;
							}
							if (var103 == 115) {
								field1305[var4++] = field1970;
							} else {
								field916[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3700) {
						if (var270 == 3600) {
							if (Client.field1356 == 0) {
								field916[var5++] = -2;
							} else if (Client.field1356 == 1) {
								field916[var5++] = -1;
							} else {
								field916[var5++] = Client.field20;
							}
							continue;
						}
						if (var270 == 3601) {
							var5--;
							int var223 = field916[var5];
							if (Client.field1356 == 2 && Client.field20 > var223) {
								field1305[var4++] = Client.field239[var223];
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 3602) {
							var5--;
							int var224 = field916[var5];
							if (Client.field1356 == 2 && Client.field20 > var224) {
								field916[var5++] = Client.field2094[var224];
								continue;
							}
							field916[var5++] = 0;
							continue;
						}
						if (var270 == 3603) {
							var5--;
							int var225 = field916[var5];
							if (Client.field1356 == 2 && Client.field20 > var225) {
								field916[var5++] = Client.field103[var225];
								continue;
							}
							field916[var5++] = 0;
							continue;
						}
						if (var270 == 3604) {
							var4--;
							JagString var226 = field1305[var4];
							var5--;
							int var227 = field916[var5];
							Client.method744(var227, var226);
							continue;
						}
						if (var270 == 3605) {
							var4--;
							JagString var228 = field1305[var4];
							Client.method719(var228.method259());
							continue;
						}
						if (var270 == 3606) {
							var4--;
							JagString var229 = field1305[var4];
							Client.method305(var229.method259());
							continue;
						}
						if (var270 == 3607) {
							var4--;
							JagString var230 = field1305[var4];
							Client.method164(var230.method259());
							continue;
						}
						if (var270 == 3608) {
							var4--;
							JagString var231 = field1305[var4];
							Client.method189(var231.method259());
							continue;
						}
						if (var270 == 3609) {
							var4--;
							JagString var232 = field1305[var4];
							if (var232.method262(field1152) || var232.method262(field1768)) {
								var232 = var232.method268(7);
							}
							field916[var5++] = Client.method922(var232) ? 1 : 0;
							continue;
						}
						if (var270 == 3611) {
							if (Client.field3010 == null) {
								field1305[var4++] = field3652;
							} else {
								field1305[var4++] = Client.field3010.method264();
							}
							continue;
						}
						if (var270 == 3612) {
							if (Client.field3010 == null) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = Client.field3636;
							}
							continue;
						}
						if (var270 == 3613) {
							var5--;
							int var233 = field916[var5];
							if (Client.field3010 != null && var233 < Client.field3636) {
								field1305[var4++] = Client.field2609[var233].field885.method264();
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 3614) {
							var5--;
							int var234 = field916[var5];
							if (Client.field3010 != null && var234 < Client.field3636) {
								field916[var5++] = Client.field2609[var234].field887;
								continue;
							}
							field916[var5++] = 0;
							continue;
						}
						if (var270 == 3615) {
							var5--;
							int var235 = field916[var5];
							if (Client.field3010 != null && var235 < Client.field3636) {
								field916[var5++] = Client.field2609[var235].field880;
								continue;
							}
							field916[var5++] = 0;
							continue;
						}
						if (var270 == 3616) {
							field916[var5++] = Client.field2389;
							continue;
						}
						if (var270 == 3617) {
							var4--;
							JagString var236 = field1305[var4];
							Client.method725(var236);
							continue;
						}
						if (var270 == 3618) {
							field916[var5++] = Client.field3383;
							continue;
						}
						if (var270 == 3619) {
							var4--;
							JagString var237 = field1305[var4];
							Client.method1112(var237.method259());
							continue;
						}
						if (var270 == 3620) {
							Client.method903();
							continue;
						}
						if (var270 == 3621) {
							if (Client.field1356 == 0) {
								field916[var5++] = -1;
							} else {
								field916[var5++] = Client.field2504;
							}
							continue;
						}
						if (var270 == 3622) {
							var5--;
							int var238 = field916[var5];
							if (Client.field1356 != 0 && var238 < Client.field2504) {
								field1305[var4++] = JString.method59(Client.field2407[var238]).method264();
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 3623) {
							var4--;
							JagString var239 = field1305[var4];
							if (var239.method262(field1152) || var239.method262(field1768)) {
								var239 = var239.method268(7);
							}
							field916[var5++] = Client.method876(var239) ? 1 : 0;
							continue;
						}
						if (var270 == 3624) {
							var5--;
							int var240 = field916[var5];
							if (Client.field2609 != null && Client.field3636 > var240 && Client.field2609[var240].field885.method271(Client.field373.field1659)) {
								field916[var5++] = 1;
								continue;
							}
							field916[var5++] = 0;
							continue;
						}
						if (var270 == 3625) {
							if (Client.field2924 == null) {
								field1305[var4++] = field3652;
							} else {
								field1305[var4++] = Client.field2924.method264();
							}
							continue;
						}
					} else if (var270 < 4100) {
						if (var270 == 4000) {
							var5 -= 2;
							int var109 = field916[var5 + 1];
							int var110 = field916[var5];
							field916[var5++] = var110 + var109;
							continue;
						}
						if (var270 == 4001) {
							var5 -= 2;
							int var111 = field916[var5];
							int var112 = field916[var5 + 1];
							field916[var5++] = var111 - var112;
							continue;
						}
						if (var270 == 4002) {
							var5 -= 2;
							int var113 = field916[var5 + 1];
							int var114 = field916[var5];
							field916[var5++] = var114 * var113;
							continue;
						}
						if (var270 == 4003) {
							var5 -= 2;
							int var115 = field916[var5];
							int var116 = field916[var5 + 1];
							field916[var5++] = var115 / var116;
							continue;
						}
						if (var270 == 4004) {
							var5--;
							int var117 = field916[var5];
							field916[var5++] = (int) (Math.random() * (double) var117);
							continue;
						}
						if (var270 == 4005) {
							var5--;
							int var118 = field916[var5];
							field916[var5++] = (int) ((double) (var118 + 1) * Math.random());
							continue;
						}
						if (var270 == 4006) {
							var5 -= 5;
							int var119 = field916[var5];
							int var120 = field916[var5 + 1];
							int var121 = field916[var5 + 2];
							int var122 = field916[var5 + 4];
							int var123 = field916[var5 + 3];
							field916[var5++] = (var120 - var119) * (var122 + -var121) / (var123 - var121) + var119;
							continue;
						}
						if (var270 == 4007) {
							var5 -= 2;
							int var124 = field916[var5];
							int var125 = field916[var5 + 1];
							field916[var5++] = var125 * var124 / 100 + var124;
							continue;
						}
						if (var270 == 4008) {
							var5 -= 2;
							int var126 = field916[var5];
							int var127 = field916[var5 + 1];
							field916[var5++] = 0x1 << var127 | var126;
							continue;
						}
						if (var270 == 4009) {
							var5 -= 2;
							int var128 = field916[var5];
							int var129 = field916[var5 + 1];
							field916[var5++] = var128 & -(0x1 << var129) - 1;
							continue;
						}
						if (var270 == 4010) {
							var5 -= 2;
							int var130 = field916[var5 + 1];
							int var131 = field916[var5];
							field916[var5++] = (0x1 << var130 & var131) == 0 ? 0 : 1;
							continue;
						}
						if (var270 == 4011) {
							var5 -= 2;
							int var132 = field916[var5];
							int var133 = field916[var5 + 1];
							field916[var5++] = var132 % var133;
							continue;
						}
						if (var270 == 4012) {
							var5 -= 2;
							int var134 = field916[var5];
							int var135 = field916[var5 + 1];
							if (var134 == 0) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = (int) Math.pow((double) var134, (double) var135);
							}
							continue;
						}
						if (var270 == 4013) {
							var5 -= 2;
							int var136 = field916[var5 + 1];
							int var137 = field916[var5];
							if (var137 == 0) {
								field916[var5++] = 0;
							} else if (var136 == 0) {
								field916[var5++] = Integer.MAX_VALUE;
							} else {
								field916[var5++] = (int) Math.pow((double) var137, 1.0D / (double) var136);
							}
							continue;
						}
						if (var270 == 4014) {
							var5 -= 2;
							int var138 = field916[var5 + 1];
							int var139 = field916[var5];
							field916[var5++] = var138 & var139;
							continue;
						}
						if (var270 == 4015) {
							var5 -= 2;
							int var140 = field916[var5];
							int var141 = field916[var5 + 1];
							field916[var5++] = var141 | var140;
							continue;
						}
					} else if (var270 < 4200) {
						if (var270 == 4100) {
							var4--;
							JagString var142 = field1305[var4];
							var5--;
							int var143 = field916[var5];
							field1305[var4++] = JagString.join(new JagString[]{var142, JagString.parseInt(var143)});
							continue;
						}
						if (var270 == 4101) {
							var4 -= 2;
							JagString var144 = field1305[var4];
							JagString var145 = field1305[var4 + 1];
							field1305[var4++] = JagString.join(new JagString[]{var144, var145});
							continue;
						}
						if (var270 == 4102) {
							var4--;
							JagString var146 = field1305[var4];
							var5--;
							int var147 = field916[var5];
							field1305[var4++] = JagString.join(new JagString[]{var146, JagString.method1090(var147)});
							continue;
						}
						if (var270 == 4103) {
							var4--;
							JagString var148 = field1305[var4];
							field1305[var4++] = var148.method270();
							continue;
						}
						if (var270 == 4104) {
							var5--;
							int var149 = field916[var5];
							long var150 = (long) var149 * 86400000L + 1014768000000L;
							field3311.setTime(new Date(var150));
							int var152 = field3311.get(5);
							int var153 = field3311.get(2);
							int var154 = field3311.get(1);
							field1305[var4++] = JagString.join(new JagString[]{JagString.parseInt(var152), field1984, field3333[var153], field1984, JagString.parseInt(var154)});
							continue;
						}
						if (var270 == 4105) {
							var4 -= 2;
							JagString var155 = field1305[var4 + 1];
							JagString var156 = field1305[var4];
							if (Client.field373.field1631 != null && Client.field373.field1631.field606) {
								field1305[var4++] = var155;
								continue;
							}
							field1305[var4++] = var156;
							continue;
						}
						if (var270 == 4106) {
							var5--;
							int var157 = field916[var5];
							field1305[var4++] = JagString.parseInt(var157);
							continue;
						}
						if (var270 == 4107) {
							var4 -= 2;
							field916[var5++] = field1305[var4].method245(field1305[var4 + 1]);
							continue;
						}
						if (var270 == 4108) {
							var5 -= 2;
							var4--;
							JagString var158 = field1305[var4];
							int var159 = field916[var5];
							int var160 = field916[var5 + 1];
							byte[] var161 = Client.fontMetrics.method206(var160, 0);
							PixFontGeneric var162 = new PixFontGeneric(var161);
							field916[var5++] = var162.method775(var158, var159);
							continue;
						}
						if (var270 == 4109) {
							var5 -= 2;
							int var163 = field916[var5 + 1];
							var4--;
							JagString var164 = field1305[var4];
							int var165 = field916[var5];
							byte[] var166 = Client.fontMetrics.method206(var163, 0);
							PixFontGeneric var167 = new PixFontGeneric(var166);
							field916[var5++] = var167.method789(var164, var165);
							continue;
						}
						if (var270 == 4110) {
							var4 -= 2;
							JagString var168 = field1305[var4];
							JagString var169 = field1305[var4 + 1];
							var5--;
							if (field916[var5] == 1) {
								field1305[var4++] = var168;
							} else {
								field1305[var4++] = var169;
							}
							continue;
						}
						if (var270 == 4111) {
							var4--;
							JagString var170 = field1305[var4];
							field1305[var4++] = PixFont.escape(var170);
							continue;
						}
						if (var270 == 4112) {
							var5--;
							int var171 = field916[var5];
							var4--;
							JagString var172 = field1305[var4];
							field1305[var4++] = var172.method277(var171);
							continue;
						}
						if (var270 == 4113) {
							var5--;
							int var173 = field916[var5];
							field916[var5++] = StringTools.method166(var173) ? 1 : 0;
							continue;
						}
						if (var270 == 4114) {
							var5--;
							int var174 = field916[var5];
							field916[var5++] = StringTools.method1212(var174) ? 1 : 0;
							continue;
						}
						if (var270 == 4115) {
							var5--;
							int var175 = field916[var5];
							field916[var5++] = StringTools.method626(var175) ? 1 : 0;
							continue;
						}
						if (var270 == 4116) {
							var5--;
							int var176 = field916[var5];
							field916[var5++] = StringTools.method1193(var176) ? 1 : 0;
							continue;
						}
						if (var270 == 4117) {
							var4--;
							JagString var177 = field1305[var4];
							if (var177 == null) {
								field916[var5++] = 0;
							} else {
								field916[var5++] = var177.length();
							}
							continue;
						}
						if (var270 == 4118) {
							var5 -= 2;
							var4--;
							JagString var178 = field1305[var4];
							int var179 = field916[var5];
							int var180 = field916[var5 + 1];
							field1305[var4++] = var178.substring(var179, var180);
							continue;
						}
						if (var270 == 4119) {
							var4--;
							JagString var181 = field1305[var4];
							JagString var182 = JagString.method491(var181.length());
							boolean var183 = false;
							for (int var184 = 0; var184 < var181.length(); var184++) {
								int var185 = var181.method260(var184);
								if (var185 == 60) {
									var183 = true;
								} else if (var185 == 62) {
									var183 = false;
								} else if (!var183) {
									var182.method273(var185);
								}
							}
							var182.method269();
							field1305[var4++] = var182;
							continue;
						}
						if (var270 == 4120) {
							var4--;
							JagString var186 = field1305[var4];
							var5--;
							int var187 = field916[var5];
							field916[var5++] = var186.method263(var187);
							continue;
						}
					} else if (var270 < 4300) {
						if (var270 == 4200) {
							var5--;
							int var209 = field916[var5];
							field1305[var4++] = ObjType.method1092(var209).field1429;
							continue;
						}
						if (var270 == 4201) {
							var5 -= 2;
							int var210 = field916[var5];
							int var211 = field916[var5 + 1];
							ObjType var212 = ObjType.method1092(var210);
							if (var211 >= 1 && var211 <= 5 && var212.field1410[var211 - 1] != null) {
								field1305[var4++] = var212.field1410[var211 - 1];
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 4202) {
							var5 -= 2;
							int var213 = field916[var5];
							int var214 = field916[var5 + 1];
							ObjType var215 = ObjType.method1092(var213);
							if (var214 >= 1 && var214 <= 5 && var215.field1428[var214 - 1] != null) {
								field1305[var4++] = var215.field1428[var214 - 1];
								continue;
							}
							field1305[var4++] = field3652;
							continue;
						}
						if (var270 == 4203) {
							var5--;
							int var216 = field916[var5];
							field916[var5++] = ObjType.method1092(var216).field1375;
							continue;
						}
						if (var270 == 4204) {
							var5--;
							int var217 = field916[var5];
							field916[var5++] = ObjType.method1092(var217).field1409 == 1 ? 1 : 0;
							continue;
						}
						if (var270 == 4205) {
							var5--;
							int var218 = field916[var5];
							ObjType var219 = ObjType.method1092(var218);
							if (var219.field1388 == -1 && var219.field1411 >= 0) {
								field916[var5++] = var219.field1411;
								continue;
							}
							field916[var5++] = var218;
							continue;
						}
						if (var270 == 4206) {
							var5--;
							int var220 = field916[var5];
							ObjType var221 = ObjType.method1092(var220);
							if (var221.field1388 >= 0 && var221.field1411 >= 0) {
								field916[var5++] = var221.field1411;
								continue;
							}
							field916[var5++] = var220;
							continue;
						}
						if (var270 == 4207) {
							var5--;
							int var222 = field916[var5];
							field916[var5++] = ObjType.method1092(var222).field1392 ? 1 : 0;
							continue;
						}
					} else if (var270 < 5100) {
						if (var270 == 5000) {
							field916[var5++] = Client.field21;
							continue;
						}
						if (var270 == 5001) {
							var5 -= 3;
							Client.field21 = field916[var5];
							Client.field23 = field916[var5 + 1];
							Client.field990 = field916[var5 + 2];
							Client.out.p1Enc(69);
							Client.out.p1(Client.field21);
							Client.out.p1(Client.field23);
							Client.out.p1(Client.field990);
							continue;
						}
						if (var270 == 5002) {
							var4--;
							JagString var188 = field1305[var4];
							var5 -= 2;
							int var189 = field916[var5 + 1];
							int var190 = field916[var5];
							Client.out.p1Enc(192);
							Client.out.p8(var188.method259());
							Client.out.p1(var190 - 1);
							Client.out.p1(var189);
							continue;
						}
						if (var270 == 5003) {
							var5--;
							int var191 = field916[var5];
							JagString var192 = null;
							if (var191 < 100) {
								var192 = Client.field832[var191];
							}
							if (var192 == null) {
								var192 = field3652;
							}
							field1305[var4++] = var192;
							continue;
						}
						if (var270 == 5004) {
							var5--;
							int var193 = field916[var5];
							int var194 = -1;
							if (var193 < 100 && Client.field832[var193] != null) {
								var194 = Client.field347[var193];
							}
							field916[var5++] = var194;
							continue;
						}
						if (var270 == 5005) {
							field916[var5++] = Client.field23;
							continue;
						}
						if (var270 == 5008) {
							var4--;
							JagString var195 = field1305[var4];
							if (var195.method262(field3110)) {
								Client.doCheat(var195);
							} else {
								JagString var196 = var195.method270();
								byte var197 = 0;
								byte var198 = 0;
								if (var196.method262(Text.field2947)) {
									var198 = 0;
									var195 = var195.method268(Text.field2947.length());
								} else if (var196.method262(Text.field2177)) {
									var198 = 1;
									var195 = var195.method268(Text.field2177.length());
								} else if (var196.method262(Text.field906)) {
									var195 = var195.method268(Text.field906.length());
									var198 = 2;
								} else if (var196.method262(Text.field3463)) {
									var198 = 3;
									var195 = var195.method268(Text.field3463.length());
								} else if (var196.method262(Text.field3000)) {
									var198 = 4;
									var195 = var195.method268(Text.field3000.length());
								} else if (var196.method262(Text.field107)) {
									var195 = var195.method268(Text.field107.length());
									var198 = 5;
								} else if (var196.method262(Text.field488)) {
									var198 = 6;
									var195 = var195.method268(Text.field488.length());
								} else if (var196.method262(Text.field931)) {
									var198 = 7;
									var195 = var195.method268(Text.field931.length());
								} else if (var196.method262(Text.field84)) {
									var195 = var195.method268(Text.field84.length());
									var198 = 8;
								} else if (var196.method262(Text.field1073)) {
									var198 = 9;
									var195 = var195.method268(Text.field1073.length());
								} else if (var196.method262(Text.field3188)) {
									var198 = 10;
									var195 = var195.method268(Text.field3188.length());
								} else if (var196.method262(Text.field2824)) {
									var198 = 11;
									var195 = var195.method268(Text.field2824.length());
								} else if (Client.lang != 0) {
									if (var196.method262(Text.field2962)) {
										var198 = 0;
										var195 = var195.method268(Text.field2962.length());
									} else if (var196.method262(Text.field2163)) {
										var195 = var195.method268(Text.field2163.length());
										var198 = 1;
									} else if (var196.method262(Text.field918)) {
										var198 = 2;
										var195 = var195.method268(Text.field918.length());
									} else if (var196.method262(Text.field3470)) {
										var198 = 3;
										var195 = var195.method268(Text.field3470.length());
									} else if (var196.method262(Text.field2994)) {
										var198 = 4;
										var195 = var195.method268(Text.field2994.length());
									} else if (var196.method262(Text.field109)) {
										var198 = 5;
										var195 = var195.method268(Text.field109.length());
									} else if (var196.method262(Text.field489)) {
										var195 = var195.method268(Text.field489.length());
										var198 = 6;
									} else if (var196.method262(Text.field942)) {
										var195 = var195.method268(Text.field942.length());
										var198 = 7;
									} else if (var196.method262(Text.field83)) {
										var195 = var195.method268(Text.field83.length());
										var198 = 8;
									} else if (var196.method262(Text.field1074)) {
										var198 = 9;
										var195 = var195.method268(Text.field1074.length());
									} else if (var196.method262(Text.field3192)) {
										var195 = var195.method268(Text.field3192.length());
										var198 = 10;
									} else if (var196.method262(Text.field2818)) {
										var198 = 11;
										var195 = var195.method268(Text.field2818.length());
									}
								}
								JagString var199 = var195.method270();
								if (var199.method262(Text.field1439)) {
									var195 = var195.method268(Text.field1439.length());
									var197 = 1;
								} else if (var199.method262(Text.field3618)) {
									var197 = 2;
									var195 = var195.method268(Text.field3618.length());
								} else if (var199.method262(Text.field2524)) {
									var195 = var195.method268(Text.field2524.length());
									var197 = 3;
								} else if (var199.method262(Text.field2884)) {
									var197 = 4;
									var195 = var195.method268(Text.field2884.length());
								} else if (var199.method262(Text.field2523)) {
									var195 = var195.method268(Text.field2523.length());
									var197 = 5;
								} else if (Client.lang != 0) {
									if (var199.method262(Text.field1433)) {
										var197 = 1;
										var195 = var195.method268(Text.field1433.length());
									} else if (var199.method262(Text.field3628)) {
										var197 = 2;
										var195 = var195.method268(Text.field3628.length());
									} else if (var199.method262(Text.field2531)) {
										var195 = var195.method268(Text.field2531.length());
										var197 = 3;
									} else if (var199.method262(Text.field2891)) {
										var197 = 4;
										var195 = var195.method268(Text.field2891.length());
									} else if (var199.method262(Text.field2527)) {
										var195 = var195.method268(Text.field2527.length());
										var197 = 5;
									}
								}
								Client.out.p1Enc(27);
								Client.out.p1(0);
								int var200 = Client.out.pos;
								Client.out.p1(var198);
								Client.out.p1(var197);
								JagString.method1194(var195, Client.out);
								Client.out.method515(Client.out.pos - var200);
							}
							continue;
						}
						if (var270 == 5009) {
							var4 -= 2;
							JagString var201 = field1305[var4];
							JagString var202 = field1305[var4 + 1];
							Client.out.p1Enc(164);
							Client.out.p1(0);
							int var203 = Client.out.pos;
							Client.out.p8(var201.method259());
							JagString.method1194(var202, Client.out);
							Client.out.method515(Client.out.pos - var203);
							continue;
						}
						if (var270 == 5010) {
							var5--;
							int var204 = field916[var5];
							JagString var205 = null;
							if (var204 < 100) {
								var205 = Client.field245[var204];
							}
							if (var205 == null) {
								var205 = field3652;
							}
							field1305[var4++] = var205;
							continue;
						}
						if (var270 == 5011) {
							var5--;
							int var206 = field916[var5];
							JagString var207 = null;
							if (var206 < 100) {
								var207 = Client.field2610[var206];
							}
							if (var207 == null) {
								var207 = field3652;
							}
							field1305[var4++] = var207;
							continue;
						}
						if (var270 == 5015) {
							JagString var208;
							if (Client.field373 == null || Client.field373.field1659 == null) {
								var208 = TitleScreen.loginUser;
							} else {
								var208 = Client.field373.field1659;
							}
							field1305[var4++] = var208;
							continue;
						}
						if (var270 == 5016) {
							field916[var5++] = Client.field990;
							continue;
						}
						if (var270 == 5017) {
							field916[var5++] = Client.field423;
							continue;
						}
					}
				} else {
					IfType var259;
					if (var270 >= 2000) {
						var5--;
						var259 = IfType.get(field916[var5]);
						var270 -= 1000;
					} else {
						var259 = var40 ? field1447 : field3604;
					}
					if (var270 == 1300) {
						var5--;
						int var260 = field916[var5] - 1;
						if (var260 >= 0 && var260 <= 9) {
							var4--;
							var259.method301(field1305[var4], var260);
							continue;
						}
						var4--;
						continue;
					}
					if (var270 == 1301) {
						var5 -= 2;
						int var261 = field916[var5 + 1];
						int var262 = field916[var5];
						var259.field824 = IfType.get(var261, var262);
						continue;
					}
					if (var270 == 1302) {
						var5--;
						var259.field862 = field916[var5] == 1;
						continue;
					}
					if (var270 == 1303) {
						var5--;
						var259.field760 = field916[var5];
						continue;
					}
					if (var270 == 1304) {
						var5--;
						var259.field746 = field916[var5];
						continue;
					}
					if (var270 == 1305) {
						var4--;
						var259.field813 = field1305[var4];
						continue;
					}
					if (var270 == 1306) {
						var4--;
						var259.field825 = field1305[var4];
						continue;
					}
					if (var270 == 1307) {
						var259.field738 = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var269) {
			if (var3.field3261 == null) {
				if (Client.modewhere != 0) {
					Client.addChat(field2808, 0, field3652);
				}
				JagException.report(var269, "CS2 - scr:" + var3.key + " op:" + var8);
			} else {
				JagString var266 = JagString.method491(30);
				var266.method243(field714).method243(var3.field3261);
				for (int var267 = field3233 - 1; var267 >= 0; var267--) {
					var266.method243(field1924).method243(field1302[var267].field2921.field3261);
				}
				if (var8 == 40) {
					int var268 = var7[var9];
					var266.method243(field695).method243(JagString.parseInt(var268));
				}
				if (Client.modewhere != 0) {
					Client.addChat(JagString.join(new JagString[]{field1675, var3.field3261}), 0, field3652);
				}
				JagException.report(var269, "CS2 - scr:" + var3.key + " op:" + var8 + new String(var266.method255()));
			}
		}
	}

	@ObfuscatedName("jb.a(II)V")
	public static void executeOnLoad(int arg0) {
		if (arg0 == -1 || !IfType.method192(arg0)) {
			return;
		}
		IfType[] var1 = IfType.field1825[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.field867 != null) {
				HookReq var4 = new HookReq();
				var4.field209 = var3;
				var4.field208 = var3.field867;
				executeScript(var4);
			}
		}
	}
}
