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

	@ObfuscatedName("ab.s")
	public static int[] intLocals;

	@ObfuscatedName("fc.r")
	public static JagString[] stringLocals;

	@ObfuscatedName("pf.M")
	public static int[] arrayLengths = new int[5];

	@ObfuscatedName("na.e")
	public static int[][] arrays = new int[5][5000];

	@ObfuscatedName("fb.J")
	public static int[] intStack = new int[1000];

	@ObfuscatedName("i.n")
	public static JagString[] stringStack = new JagString[1000];

	@ObfuscatedName("ua.u")
	public static int fp = 0;

	@ObfuscatedName("i.k")
	public static ClientGosubFrame[] frames = new ClientGosubFrame[50];

	@ObfuscatedName("wd.A")
	public static IfType activeComponent;

	@ObfuscatedName("ja.h")
	public static IfType activeComponent2;

	@ObfuscatedName("v.d")
	public static Calendar calendar = Calendar.getInstance();

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
	public static JagString[] months = new JagString[] { field3351, field3338, field3350, field3340, field3330, field3326, field3337, field3334, field3332, field3327, field3328, field3352 };

	@ObfuscatedName("of.e")
	public static JagString field2406 = JagString.wrap("event_opbase");
	@ObfuscatedName("ma.c")
	public static JagString field1970 = JagString.wrap("null");
	@ObfuscatedName("wf.j")
	public static JagString field3652 = JagString.wrap("");
	@ObfuscatedName("ha.y")
	public static JagString field1152 = JagString.wrap("<img=0>");
	@ObfuscatedName("kf.n")
	public static JagString field1768 = JagString.wrap("<img=1>");
	@ObfuscatedName("mb.g")
	public static JagString field1984 = JagString.wrap(")2");
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
		Object[] var1 = arg0.onop;
		int var2 = (Integer) var1[0];
		ClientScript var3 = ClientScript.get(var2);
		if (var3 == null) {
			return;
		}
		fp = 0;
		int var4 = 0;
		int var5 = 0;
		int[] var6 = var3.instructions;
		int[] var7 = var3.intOperands;
		byte var8 = -1;
		int var9 = -1;
		try {
			stringLocals = new JagString[var3.stringLocalCount];
			int var10 = 0;
			intLocals = new int[var3.intLocalCount];
			int var11 = 0;
			for (int var12 = 1; var12 < var1.length; var12++) {
				if (var1[var12] instanceof Integer) {
					int var14 = (Integer) var1[var12];
					if (var14 == -2147483647) {
						var14 = arg0.mouseX;
					}
					if (var14 == -2147483646) {
						var14 = arg0.mouseY;
					}
					if (var14 == -2147483645) {
						var14 = arg0.component == null ? -1 : arg0.component.parentId;
					}
					if (var14 == -2147483644) {
						var14 = arg0.opindex;
					}
					if (var14 == -2147483643) {
						var14 = arg0.component == null ? -1 : arg0.component.subId;
					}
					if (var14 == -2147483642) {
						var14 = arg0.drop == null ? -1 : arg0.drop.parentId;
					}
					if (var14 == -2147483641) {
						var14 = arg0.drop == null ? -1 : arg0.drop.subId;
					}
					if (var14 == -2147483640) {
						var14 = arg0.keyCode;
					}
					if (var14 == -2147483639) {
						var14 = arg0.keyChar;
					}
					intLocals[var10++] = var14;
				} else if (var1[var12] instanceof JagString) {
					JagString var13 = (JagString) var1[var12];
					if (var13.strEquals(field2406)) {
						var13 = arg0.opbase;
					}
					stringLocals[var11++] = var13;
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
						intStack[var5++] = var7[var9];
						continue;
					}
					if (var270 == 1) {
						int var16 = var7[var9];
						intStack[var5++] = VarCache.var[var16];
						continue;
					}
					if (var270 == 2) {
						int var17 = var7[var9];
						var5--;
						VarCache.var[var17] = intStack[var5];
						continue;
					}
					if (var270 == 3) {
						stringStack[var4++] = var3.stringOperands[var9];
						continue;
					}
					if (var270 == 6) {
						var9 += var7[var9];
						continue;
					}
					if (var270 == 7) {
						var5 -= 2;
						if (intStack[var5] != intStack[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 8) {
						var5 -= 2;
						if (intStack[var5] == intStack[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 9) {
						var5 -= 2;
						if (intStack[var5 + 1] > intStack[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 10) {
						var5 -= 2;
						if (intStack[var5] > intStack[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 21) {
						if (fp == 0) {
							return;
						}
						ClientGosubFrame var18 = frames[--fp];
						stringLocals = var18.stringLocals;
						var9 = var18.pc;
						var3 = var18.script;
						var6 = var3.instructions;
						intLocals = var18.intLocals;
						var7 = var3.intOperands;
						continue;
					}
					if (var270 == 25) {
						int var19 = var7[var9];
						intStack[var5++] = VarCache.getVarbit(var19);
						continue;
					}
					if (var270 == 27) {
						int var20 = var7[var9];
						var5--;
						VarCache.setVarbit(intStack[var5], var20);
						continue;
					}
					if (var270 == 31) {
						var5 -= 2;
						if (intStack[var5] <= intStack[var5 + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 32) {
						var5 -= 2;
						if (intStack[var5 + 1] <= intStack[var5]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (var270 == 33) {
						intStack[var5++] = intLocals[var7[var9]];
						continue;
					}
					int var10001;
					if (var270 == 34) {
						var10001 = var7[var9];
						var5--;
						intLocals[var10001] = intStack[var5];
						continue;
					}
					if (var270 == 35) {
						stringStack[var4++] = stringLocals[var7[var9]];
						continue;
					}
					if (var270 == 36) {
						var10001 = var7[var9];
						var4--;
						stringLocals[var10001] = stringStack[var4];
						continue;
					}
					if (var270 == 37) {
						int var21 = var7[var9];
						var4 -= var21;
						JagString var22 = JagString.method655(stringStack, var21, var4);
						stringStack[var4++] = var22;
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
						ClientScript var24 = ClientScript.get(var23);
						int[] var25 = new int[var24.intLocalCount];
						JagString[] var26 = new JagString[var24.stringLocalCount];
						for (int var27 = 0; var27 < var24.intArgCount; var27++) {
							var25[var27] = intStack[var5 + var27 - var24.intArgCount];
						}
						for (int var28 = 0; var28 < var24.stringArgCount; var28++) {
							var26[var28] = stringStack[var4 + var28 - var24.stringArgCount];
						}
						var4 -= var24.stringArgCount;
						var5 -= var24.intArgCount;
						ClientGosubFrame var29 = new ClientGosubFrame();
						var29.pc = var9;
						var29.script = var3;
						var9 = -1;
						var29.stringLocals = stringLocals;
						var3 = var24;
						var29.intLocals = intLocals;
						frames[fp++] = var29;
						intLocals = var25;
						var6 = var24.instructions;
						stringLocals = var26;
						var7 = var24.intOperands;
						continue;
					}
					if (var270 == 42) {
						intStack[var5++] = Client.field1831[var7[var9]];
						continue;
					}
					if (var270 == 43) {
						var10001 = var7[var9];
						var5--;
						Client.field1831[var10001] = intStack[var5];
						continue;
					}
					if (var270 == 44) {
						int var30 = var7[var9] >> 16;
						int var31 = var7[var9] & 0xFFFF;
						var5--;
						int var32 = intStack[var5];
						if (var32 >= 0 && var32 <= 5000) {
							arrayLengths[var30] = var32;
							byte var33 = -1;
							if (var31 == 105) {
								var33 = 0;
							}
							int var34 = 0;
							while (true) {
								if (var34 >= var32) {
									continue label1965;
								}
								arrays[var30][var34] = var33;
								var34++;
							}
						}
						throw new RuntimeException();
					}
					if (var270 == 45) {
						int var35 = var7[var9];
						var5--;
						int var36 = intStack[var5];
						if (var36 >= 0 && var36 < arrayLengths[var35]) {
							intStack[var5++] = arrays[var35][var36];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 46) {
						int var37 = var7[var9];
						var5 -= 2;
						int var38 = intStack[var5];
						if (var38 >= 0 && arrayLengths[var37] > var38) {
							arrays[var37][var38] = intStack[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var270 == 47) {
						JagString var39 = Client.field3626[var7[var9]];
						if (var39 == null) {
							var39 = field1970;
						}
						stringStack[var4++] = var39;
						continue;
					}
					if (var270 == 48) {
						var10001 = var7[var9];
						var4--;
						Client.field3626[var10001] = stringStack[var4];
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
						int var41 = intStack[var5];
						int var42 = intStack[var5 + 1];
						int var43 = intStack[var5 + 2];
						if (var42 == 0) {
							throw new RuntimeException();
						}
						IfType var44 = IfType.get(var41);
						if (var44.subcomponents == null) {
							var44.subcomponents = new IfType[var43 + 1];
						}
						if (var43 >= var44.subcomponents.length) {
							IfType[] var45 = new IfType[var43 + 1];
							for (int var46 = 0; var46 < var44.subcomponents.length; var46++) {
								var45[var46] = var44.subcomponents[var46];
							}
							var44.subcomponents = var45;
						}
						if (var43 > 0 && var44.subcomponents[var43 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var43 - 1));
						}
						IfType var47 = new IfType();
						var47.type = var42;
						var47.v3 = true;
						var47.subId = var43;
						var47.layerId = var47.parentId = var44.parentId;
						var44.subcomponents[var43] = var47;
						if (var40) {
							activeComponent2 = var47;
						} else {
							activeComponent = var47;
						}
						Client.componentUpdated(var44);
						continue;
					}
					if (var270 == 101) {
						IfType var48 = var40 ? activeComponent2 : activeComponent;
						IfType var49 = IfType.get(var48.parentId);
						var49.subcomponents[var48.subId] = null;
						Client.componentUpdated(var49);
						continue;
					}
					if (var270 == 102) {
						var5--;
						IfType var50 = IfType.get(intStack[var5]);
						var50.subcomponents = null;
						Client.componentUpdated(var50);
						continue;
					}
					if (var270 == 200) {
						var5 -= 2;
						int var51 = intStack[var5 + 1];
						int var52 = intStack[var5];
						IfType var53 = IfType.get(var51, var52);
						if (var53 != null && var51 != -1) {
							intStack[var5++] = 1;
							if (var40) {
								activeComponent2 = var53;
							} else {
								activeComponent = var53;
							}
							continue;
						}
						intStack[var5++] = 0;
						continue;
					}
				} else if (var270 >= 1000 && var270 < 1100 || !(var270 < 2000 || var270 >= 2100)) {
					IfType var263;
					if (var270 < 2000) {
						var263 = var40 ? activeComponent2 : activeComponent;
					} else {
						var270 -= 1000;
						var5--;
						var263 = IfType.get(intStack[var5]);
					}
					if (var270 == 1000) {
						var5 -= 2;
						var263.x = intStack[var5];
						var263.y = intStack[var5 + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (var270 == 1001) {
						var5 -= 2;
						var263.width = intStack[var5];
						var263.height = intStack[var5 + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (var270 == 1003) {
						var5--;
						boolean var264 = intStack[var5] == 1;
						if (var263.hide != var264) {
							var263.hide = var264;
							Client.componentUpdated(var263);
						}
						continue;
					}
				} else if (var270 >= 1100 && var270 < 1200 || !(var270 < 2100 || var270 >= 2200)) {
					IfType var54;
					if (var270 >= 2000) {
						var270 -= 1000;
						var5--;
						var54 = IfType.get(intStack[var5]);
					} else {
						var54 = var40 ? activeComponent2 : activeComponent;
					}
					if (var270 == 1100) {
						var5 -= 2;
						var54.field843 = intStack[var5];
						if (var54.scrollWidth - var54.width < var54.field843) {
							var54.field843 = var54.scrollWidth - var54.width;
						}
						if (var54.field843 < 0) {
							var54.field843 = 0;
						}
						var54.scrollPosY = intStack[var5 + 1];
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
						var54.colour = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1102) {
						var5--;
						var54.fill = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1103) {
						var5--;
						var54.trans = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1104) {
						var5--;
						var54.lineWidth = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1105) {
						var5--;
						var54.graphic = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1106) {
						var5--;
						var54.rotate = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1107) {
						var5--;
						var54.tiling = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1108) {
						var54.model1Type = 1;
						var5--;
						var54.model1Id = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1109) {
						var5 -= 6;
						var54.modelXOf = intStack[var5];
						var54.modelYOf = intStack[var5 + 1];
						var54.modelXAn = intStack[var5 + 2];
						var54.modelYAn = intStack[var5 + 3];
						var54.modelZAn = intStack[var5 + 4];
						var54.modelZoom = intStack[var5 + 5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1110) {
						var5--;
						int var55 = intStack[var5];
						if (var55 != var54.modelAnim) {
							var54.field839 = 0;
							var54.field762 = 0;
							var54.modelAnim = var55;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (var270 == 1111) {
						var5--;
						var54.orthog = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1112) {
						var4--;
						JagString var56 = stringStack[var4];
						if (!var56.strEquals(var54.text)) {
							var54.text = var56;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (var270 == 1113) {
						var5--;
						var54.font = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1114) {
						var5 -= 3;
						var54.hAlign = intStack[var5];
						var54.vAlign = intStack[var5 + 1];
						var54.lineHeight = intStack[var5 + 2];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1115) {
						var5--;
						var54.shadow = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1116) {
						var5--;
						var54.outline = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1117) {
						var5--;
						var54.shadowColour = intStack[var5];
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1118) {
						var5--;
						var54.vFlip = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1119) {
						var5--;
						var54.hFlip = intStack[var5] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (var270 == 1120) {
						var5 -= 2;
						var54.scrollWidth = intStack[var5];
						var54.scrollHeight = intStack[var5 + 1];
						Client.componentUpdated(var54);
						continue;
					}
				} else if (var270 >= 1200 && var270 < 1300 || !(var270 < 2200 || var270 >= 2300)) {
					IfType var57;
					if (var270 < 2000) {
						var57 = var40 ? activeComponent2 : activeComponent;
					} else {
						var270 -= 1000;
						var5--;
						var57 = IfType.get(intStack[var5]);
					}
					Client.componentUpdated(var57);
					if (var270 == 1200) {
						var5 -= 2;
						int var58 = intStack[var5];
						int var59 = intStack[var5 + 1];
						var57.field786 = var59;
						var57.field804 = var58;
						ObjType var60 = ObjType.list(var58);
						var57.modelYAn = var60.yan2d;
						var57.modelXAn = var60.xan2d;
						var57.modelZoom = var60.zoom2d;
						var57.modelYOf = var60.yof2d;
						var57.modelZAn = var60.zan2d;
						if (var57.width > 0) {
							var57.modelZoom = var57.modelZoom * 32 / var57.width;
						}
						var57.modelXOf = var60.xof2d;
						continue;
					}
					if (var270 == 1201) {
						var57.model1Type = 2;
						var5--;
						var57.model1Id = intStack[var5];
						continue;
					}
					if (var270 == 1202) {
						var57.model1Type = 3;
						var57.model1Id = Client.localPlayer.model.method234();
						continue;
					}
				} else if ((var270 < 1300 || var270 >= 1400) && (var270 < 2300 || var270 >= 2400)) {
					if (var270 >= 1400 && var270 < 1500 || var270 >= 2400 && var270 < 2500) {
						IfType var61;
						if (var270 < 2000) {
							var61 = var40 ? activeComponent2 : activeComponent;
						} else {
							var5--;
							var61 = IfType.get(intStack[var5]);
							var270 -= 1000;
						}
						var4--;
						JagString var62 = stringStack[var4];
						int[] var63 = null;
						if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 89) {
							var5--;
							int var64 = intStack[var5];
							if (var64 > 0) {
								var63 = new int[var64];
								while (var64-- > 0) {
									var5--;
									var63[var64] = intStack[var5];
								}
							}
							var62 = var62.substring(0, var62.length() - 1);
						}
						Object[] var65 = new Object[var62.length() + 1];
						for (int var66 = var65.length - 1; var66 >= 1; var66--) {
							if (var62.charAt(var66 - 1) == 115) {
								var4--;
								var65[var66] = stringStack[var4];
							} else {
								var5--;
								var65[var66] = Integer.valueOf(intStack[var5]);
							}
						}
						var5--;
						int var67 = intStack[var5];
						if (var67 == -1) {
							var65 = null;
						} else {
							var65[0] = Integer.valueOf(var67);
						}
						if (var270 == 1405) {
							var61.ondrag = var65;
						}
						if (var270 == 1412) {
							var61.onmouserepeat = var65;
						}
						if (var270 == 1400) {
							var61.onclick = var65;
						}
						if (var270 == 1406) {
							var61.ontargetleave = var65;
						}
						if (var270 == 1404) {
							var61.onmouseleave = var65;
						}
						if (var270 == 1415) {
							var61.onstattransmit = var65;
							var61.onstattransmitlist = var63;
						}
						if (var270 == 1421) {
							var61.field793 = var65;
						}
						if (var270 == 1418) {
							var61.field782 = var65;
						}
						if (var270 == 1402) {
							var61.onrelease = var65;
						}
						if (var270 == 1401) {
							var61.onhold = var65;
						}
						if (var270 == 1424) {
							var61.field795 = var65;
						}
						if (var270 == 1414) {
							var61.oninvtransmitlist = var63;
							var61.oninvtransmit = var65;
						}
						var61.hashook = true;
						if (var270 == 1409) {
							var61.onop = var65;
						}
						if (var270 == 1420) {
							var61.field780 = var65;
						}
						if (var270 == 1407) {
							var61.onvartransmitlist = var63;
							var61.onvartransmit = var65;
						}
						if (var270 == 1422) {
							var61.field822 = var65;
						}
						if (var270 == 1419) {
							var61.field741 = var65;
						}
						if (var270 == 1416) {
							var61.ontargetenter = var65;
						}
						if (var270 == 1423) {
							var61.field758 = var65;
						}
						if (var270 == 1417) {
							var61.onscrollwheel = var65;
						}
						if (var270 == 1403) {
							var61.onmouseover = var65;
						}
						if (var270 == 1411) {
							var61.onclickrepeat = var65;
						}
						if (var270 == 1410) {
							var61.ondragcomplete = var65;
						}
						if (var270 == 1408) {
							var61.ontimer = var65;
						}
						continue;
					}
					if (var270 < 1600) {
						IfType var258 = var40 ? activeComponent2 : activeComponent;
						if (var270 == 1500) {
							intStack[var5++] = var258.x;
							continue;
						}
						if (var270 == 1501) {
							intStack[var5++] = var258.y;
							continue;
						}
						if (var270 == 1502) {
							intStack[var5++] = var258.width;
							continue;
						}
						if (var270 == 1503) {
							intStack[var5++] = var258.height;
							continue;
						}
						if (var270 == 1504) {
							intStack[var5++] = var258.hide ? 1 : 0;
							continue;
						}
						if (var270 == 1505) {
							intStack[var5++] = var258.layerId;
							continue;
						}
					} else if (var270 < 1700) {
						IfType var68 = var40 ? activeComponent2 : activeComponent;
						if (var270 == 1600) {
							intStack[var5++] = var68.field843;
							continue;
						}
						if (var270 == 1601) {
							intStack[var5++] = var68.scrollPosY;
							continue;
						}
						if (var270 == 1602) {
							stringStack[var4++] = var68.text;
							continue;
						}
						if (var270 == 1603) {
							intStack[var5++] = var68.scrollWidth;
							continue;
						}
						if (var270 == 1604) {
							intStack[var5++] = var68.scrollHeight;
							continue;
						}
						if (var270 == 1605) {
							intStack[var5++] = var68.modelZoom;
							continue;
						}
						if (var270 == 1606) {
							intStack[var5++] = var68.modelXAn;
							continue;
						}
						if (var270 == 1607) {
							intStack[var5++] = var68.modelZAn;
							continue;
						}
						if (var270 == 1608) {
							intStack[var5++] = var68.modelYAn;
							continue;
						}
					} else if (var270 < 1800) {
						IfType var69 = var40 ? activeComponent2 : activeComponent;
						if (var270 == 1700) {
							intStack[var5++] = var69.field804;
							continue;
						}
						if (var270 == 1701) {
							if (var69.field804 == -1) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var69.field786;
							}
							continue;
						}
						if (var270 == 1702) {
							intStack[var5++] = var69.subId;
							continue;
						}
					} else if (var270 < 1900) {
						IfType var256 = var40 ? activeComponent2 : activeComponent;
						if (var270 == 1800) {
							intStack[var5++] = ServerActive.targetMask(Client.getActive(var256));
							continue;
						}
						if (var270 == 1801) {
							var5--;
							int var257 = intStack[var5];
							int var272 = var257 - 1;
							if (var256.opNames != null && var256.opNames.length > var272 && var256.opNames[var272] != null) {
								stringStack[var4++] = var256.opNames[var272];
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 1802) {
							if (var256.baseOpName == null) {
								stringStack[var4++] = field3652;
							} else {
								stringStack[var4++] = var256.baseOpName;
							}
							continue;
						}
					} else if (var270 < 2600) {
						var5--;
						IfType var70 = IfType.get(intStack[var5]);
						if (var270 == 2500) {
							intStack[var5++] = var70.x;
							continue;
						}
						if (var270 == 2501) {
							intStack[var5++] = var70.y;
							continue;
						}
						if (var270 == 2502) {
							intStack[var5++] = var70.width;
							continue;
						}
						if (var270 == 2503) {
							intStack[var5++] = var70.height;
							continue;
						}
						if (var270 == 2504) {
							intStack[var5++] = var70.hide ? 1 : 0;
							continue;
						}
						if (var270 == 2505) {
							intStack[var5++] = var70.layerId;
							continue;
						}
					} else if (var270 < 2700) {
						var5--;
						IfType var255 = IfType.get(intStack[var5]);
						if (var270 == 2600) {
							intStack[var5++] = var255.field843;
							continue;
						}
						if (var270 == 2601) {
							intStack[var5++] = var255.scrollPosY;
							continue;
						}
						if (var270 == 2602) {
							stringStack[var4++] = var255.text;
							continue;
						}
						if (var270 == 2603) {
							intStack[var5++] = var255.scrollWidth;
							continue;
						}
						if (var270 == 2604) {
							intStack[var5++] = var255.scrollHeight;
							continue;
						}
						if (var270 == 2605) {
							intStack[var5++] = var255.modelZoom;
							continue;
						}
						if (var270 == 2606) {
							intStack[var5++] = var255.modelXAn;
							continue;
						}
						if (var270 == 2607) {
							intStack[var5++] = var255.modelZAn;
							continue;
						}
						if (var270 == 2608) {
							intStack[var5++] = var255.modelYAn;
							continue;
						}
					} else if (var270 < 2800) {
						if (var270 == 2700) {
							var5--;
							IfType var71 = IfType.get(intStack[var5]);
							intStack[var5++] = var71.field804;
							continue;
						}
						if (var270 == 2701) {
							var5--;
							IfType var72 = IfType.get(intStack[var5]);
							if (var72.field804 == -1) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var72.field786;
							}
							continue;
						}
						if (var270 == 2702) {
							var5--;
							int var73 = intStack[var5];
							SubInterface var74 = (SubInterface) Client.subinterfaces.find((long) var73);
							if (var74 == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = 1;
							}
							continue;
						}
					} else if (var270 < 2900) {
						var5--;
						IfType var75 = IfType.get(intStack[var5]);
						if (var270 == 2800) {
							intStack[var5++] = ServerActive.targetMask(Client.getActive(var75));
							continue;
						}
						if (var270 == 2801) {
							var5--;
							int var76 = intStack[var5];
							int var271 = var76 - 1;
							if (var75.opNames != null && var75.opNames.length > var271 && var75.opNames[var271] != null) {
								stringStack[var4++] = var75.opNames[var271];
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 2802) {
							if (var75.baseOpName == null) {
								stringStack[var4++] = field3652;
							} else {
								stringStack[var4++] = var75.baseOpName;
							}
							continue;
						}
					} else if (var270 < 3200) {
						if (var270 == 3100) {
							var4--;
							JagString var241 = stringStack[var4];
							Client.addChat(var241, 0, field3652);
							continue;
						}
						if (var270 == 3101) {
							var5 -= 2;
							Client.method1023(intStack[var5 + 1], Client.localPlayer, intStack[var5]);
							continue;
						}
						if (var270 == 3103) {
							Client.closeModal();
							continue;
						}
						if (var270 == 3104) {
							var4--;
							JagString var242 = stringStack[var4];
							int var243 = 0;
							if (var242.method274()) {
								var243 = var242.checkedParseInt();
							}
							Client.out.p1Enc(216);
							Client.out.p4(var243);
							continue;
						}
						if (var270 == 3105) {
							var4--;
							JagString var244 = stringStack[var4];
							Client.out.p1Enc(36);
							Client.out.p8(var244.method259());
							continue;
						}
						if (var270 == 3106) {
							var4--;
							JagString var245 = stringStack[var4];
							Client.out.p1Enc(86);
							Client.out.p1(var245.length() + 1);
							Client.out.pjstr(var245);
							continue;
						}
						if (var270 == 3107) {
							var5--;
							int var246 = intStack[var5];
							var4--;
							JagString var247 = stringStack[var4];
							Client.opPlayer(var246, var247);
							continue;
						}
						if (var270 == 3108) {
							var5 -= 3;
							int var248 = intStack[var5];
							int var249 = intStack[var5 + 1];
							int var250 = intStack[var5 + 2];
							IfType var251 = IfType.get(var250);
							Client.method127(var251, var249, var248);
							continue;
						}
						if (var270 == 3109) {
							var5 -= 2;
							int var252 = intStack[var5];
							int var253 = intStack[var5 + 1];
							IfType var254 = var40 ? activeComponent2 : activeComponent;
							Client.method127(var254, var253, var252);
							continue;
						}
					} else if (var270 < 3300) {
						if (var270 == 3200) {
							var5 -= 3;
							Client.method17(intStack[var5], intStack[var5 + 2], intStack[var5 + 1]);
							continue;
						}
						if (var270 == 3201) {
							var5--;
							Client.playSongs(intStack[var5]);
							continue;
						}
						if (var270 == 3202) {
							var5 -= 2;
							Client.playJingle(intStack[var5], intStack[var5 + 1]);
							continue;
						}
					} else if (var270 < 3400) {
						if (var270 == 3300) {
							intStack[var5++] = Client.loopCycle;
							continue;
						}
						if (var270 == 3301) {
							var5 -= 2;
							int var77 = intStack[var5];
							int var78 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getType(var78, var77);
							continue;
						}
						if (var270 == 3302) {
							var5 -= 2;
							int var79 = intStack[var5];
							int var80 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getCount(var79, var80);
							continue;
						}
						if (var270 == 3303) {
							var5 -= 2;
							int var81 = intStack[var5 + 1];
							int var82 = intStack[var5];
							intStack[var5++] = ClientInvCache.getTotal(var82, var81);
							continue;
						}
						if (var270 == 3304) {
							var5--;
							int var83 = intStack[var5];
							intStack[var5++] = InvType.list(var83).size;
							continue;
						}
						if (var270 == 3305) {
							var5--;
							int var84 = intStack[var5];
							intStack[var5++] = Client.statEffectiveLevel[var84];
							continue;
						}
						if (var270 == 3306) {
							var5--;
							int var85 = intStack[var5];
							intStack[var5++] = Client.statBaseLevel[var85];
							continue;
						}
						if (var270 == 3307) {
							var5--;
							int var86 = intStack[var5];
							intStack[var5++] = Client.statXP[var86];
							continue;
						}
						if (var270 == 3308) {
							int var87 = Client.minusedlevel;
							int var88 = (Client.localPlayer.x >> 7) + Client.mapBuildBaseX;
							int var89 = Client.mapBuildBaseZ + (Client.localPlayer.z >> 7);
							intStack[var5++] = var89 + (var87 << 28) + (var88 << 14);
							continue;
						}
						if (var270 == 3309) {
							var5--;
							int var90 = intStack[var5];
							intStack[var5++] = var90 >> 14 & 0x3FFF;
							continue;
						}
						if (var270 == 3310) {
							var5--;
							int var91 = intStack[var5];
							intStack[var5++] = var91 >> 28;
							continue;
						}
						if (var270 == 3311) {
							var5--;
							int var92 = intStack[var5];
							intStack[var5++] = var92 & 0x3FFF;
							continue;
						}
						if (var270 == 3312) {
							intStack[var5++] = Client.memServer ? 1 : 0;
							continue;
						}
						if (var270 == 3313) {
							var5 -= 2;
							int var93 = intStack[var5] + 32768;
							int var94 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getType(var94, var93);
							continue;
						}
						if (var270 == 3314) {
							var5 -= 2;
							int var95 = intStack[var5] + 32768;
							int var96 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getCount(var95, var96);
							continue;
						}
						if (var270 == 3315) {
							var5 -= 2;
							int var97 = intStack[var5] + 32768;
							int var98 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getTotal(var97, var98);
							continue;
						}
						if (var270 == 3316) {
							if (Client.staffmodlevel >= 2) {
								intStack[var5++] = Client.staffmodlevel;
							} else {
								intStack[var5++] = 0;
							}
							continue;
						}
						if (var270 == 3317) {
							intStack[var5++] = Client.logoutTimer;
							continue;
						}
						if (var270 == 3318) {
							intStack[var5++] = Client.worldid;
							continue;
						}
						if (var270 == 3321) {
							intStack[var5++] = Client.runenergy;
							continue;
						}
						if (var270 == 3322) {
							intStack[var5++] = Client.runweight;
							continue;
						}
						if (var270 == 3323) {
							if (Client.staffmodlevel == 1) {
								intStack[var5++] = 1;
							} else {
								intStack[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3500) {
						if (var270 == 3400) {
							var5 -= 2;
							int var99 = intStack[var5];
							int var100 = intStack[var5 + 1];
							EnumType var101 = EnumType.list(var99);
							for (int var102 = 0; var102 < var101.count; var102++) {
								if (var100 == var101.keys[var102]) {
									stringStack[var4++] = var101.stringValues[var102];
									var101 = null;
									break;
								}
							}
							if (var101 != null) {
								stringStack[var4++] = var101.defaultString;
							}
							continue;
						}
						if (var270 == 3408) {
							var5 -= 4;
							int var103 = intStack[var5 + 1];
							int var104 = intStack[var5];
							int var105 = intStack[var5 + 2];
							int var106 = intStack[var5 + 3];
							EnumType var107 = EnumType.list(var105);
							if (var107.inputtype == var104 && var103 == var107.outputtype) {
								for (int var108 = 0; var108 < var107.count; var108++) {
									if (var106 == var107.keys[var108]) {
										if (var103 == 115) {
											stringStack[var4++] = var107.stringValues[var108];
										} else {
											intStack[var5++] = var107.intValues[var108];
										}
										var107 = null;
										break;
									}
								}
								if (var107 != null) {
									if (var103 == 115) {
										stringStack[var4++] = var107.defaultString;
									} else {
										intStack[var5++] = var107.defaultInt;
									}
								}
								continue;
							}
							if (var103 == 115) {
								stringStack[var4++] = field1970;
							} else {
								intStack[var5++] = 0;
							}
							continue;
						}
					} else if (var270 < 3700) {
						if (var270 == 3600) {
							if (Client.field1356 == 0) {
								intStack[var5++] = -2;
							} else if (Client.field1356 == 1) {
								intStack[var5++] = -1;
							} else {
								intStack[var5++] = Client.friendCount;
							}
							continue;
						}
						if (var270 == 3601) {
							var5--;
							int var223 = intStack[var5];
							if (Client.field1356 == 2 && Client.friendCount > var223) {
								stringStack[var4++] = Client.field239[var223];
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 3602) {
							var5--;
							int var224 = intStack[var5];
							if (Client.field1356 == 2 && Client.friendCount > var224) {
								intStack[var5++] = Client.field2094[var224];
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var270 == 3603) {
							var5--;
							int var225 = intStack[var5];
							if (Client.field1356 == 2 && Client.friendCount > var225) {
								intStack[var5++] = Client.field103[var225];
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var270 == 3604) {
							var4--;
							JagString var226 = stringStack[var4];
							var5--;
							int var227 = intStack[var5];
							Client.method744(var227, var226);
							continue;
						}
						if (var270 == 3605) {
							var4--;
							JagString var228 = stringStack[var4];
							Client.method719(var228.method259());
							continue;
						}
						if (var270 == 3606) {
							var4--;
							JagString var229 = stringStack[var4];
							Client.method305(var229.method259());
							continue;
						}
						if (var270 == 3607) {
							var4--;
							JagString var230 = stringStack[var4];
							Client.method164(var230.method259());
							continue;
						}
						if (var270 == 3608) {
							var4--;
							JagString var231 = stringStack[var4];
							Client.method189(var231.method259());
							continue;
						}
						if (var270 == 3609) {
							var4--;
							JagString var232 = stringStack[var4];
							if (var232.startsWith(field1152) || var232.startsWith(field1768)) {
								var232 = var232.substring(7);
							}
							intStack[var5++] = Client.isFriend(var232) ? 1 : 0;
							continue;
						}
						if (var270 == 3611) {
							if (Client.field3010 == null) {
								stringStack[var4++] = field3652;
							} else {
								stringStack[var4++] = Client.field3010.method264();
							}
							continue;
						}
						if (var270 == 3612) {
							if (Client.field3010 == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = Client.friendChatCount;
							}
							continue;
						}
						if (var270 == 3613) {
							var5--;
							int var233 = intStack[var5];
							if (Client.field3010 != null && var233 < Client.friendChatCount) {
								stringStack[var4++] = Client.friendChatList[var233].username.method264();
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 3614) {
							var5--;
							int var234 = intStack[var5];
							if (Client.field3010 != null && var234 < Client.friendChatCount) {
								intStack[var5++] = Client.friendChatList[var234].world;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var270 == 3615) {
							var5--;
							int var235 = intStack[var5];
							if (Client.field3010 != null && var235 < Client.friendChatCount) {
								intStack[var5++] = Client.friendChatList[var235].rank;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var270 == 3616) {
							intStack[var5++] = Client.chatMinKick;
							continue;
						}
						if (var270 == 3617) {
							var4--;
							JagString var236 = stringStack[var4];
							Client.method725(var236);
							continue;
						}
						if (var270 == 3618) {
							intStack[var5++] = Client.chatRank;
							continue;
						}
						if (var270 == 3619) {
							var4--;
							JagString var237 = stringStack[var4];
							Client.method1112(var237.method259());
							continue;
						}
						if (var270 == 3620) {
							Client.method903();
							continue;
						}
						if (var270 == 3621) {
							if (Client.field1356 == 0) {
								intStack[var5++] = -1;
							} else {
								intStack[var5++] = Client.ignoreCount;
							}
							continue;
						}
						if (var270 == 3622) {
							var5--;
							int var238 = intStack[var5];
							if (Client.field1356 != 0 && var238 < Client.ignoreCount) {
								stringStack[var4++] = JString.toRawUsername(Client.ignoreList[var238]).method264();
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 3623) {
							var4--;
							JagString var239 = stringStack[var4];
							if (var239.startsWith(field1152) || var239.startsWith(field1768)) {
								var239 = var239.substring(7);
							}
							intStack[var5++] = Client.method876(var239) ? 1 : 0;
							continue;
						}
						if (var270 == 3624) {
							var5--;
							int var240 = intStack[var5];
							if (Client.friendChatList != null && Client.friendChatCount > var240 && Client.friendChatList[var240].username.equalsIgnoreCase(Client.localPlayer.name)) {
								intStack[var5++] = 1;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var270 == 3625) {
							if (Client.field2924 == null) {
								stringStack[var4++] = field3652;
							} else {
								stringStack[var4++] = Client.field2924.method264();
							}
							continue;
						}
					} else if (var270 < 4100) {
						if (var270 == 4000) {
							var5 -= 2;
							int var109 = intStack[var5 + 1];
							int var110 = intStack[var5];
							intStack[var5++] = var110 + var109;
							continue;
						}
						if (var270 == 4001) {
							var5 -= 2;
							int var111 = intStack[var5];
							int var112 = intStack[var5 + 1];
							intStack[var5++] = var111 - var112;
							continue;
						}
						if (var270 == 4002) {
							var5 -= 2;
							int var113 = intStack[var5 + 1];
							int var114 = intStack[var5];
							intStack[var5++] = var114 * var113;
							continue;
						}
						if (var270 == 4003) {
							var5 -= 2;
							int var115 = intStack[var5];
							int var116 = intStack[var5 + 1];
							intStack[var5++] = var115 / var116;
							continue;
						}
						if (var270 == 4004) {
							var5--;
							int var117 = intStack[var5];
							intStack[var5++] = (int) (Math.random() * (double) var117);
							continue;
						}
						if (var270 == 4005) {
							var5--;
							int var118 = intStack[var5];
							intStack[var5++] = (int) ((double) (var118 + 1) * Math.random());
							continue;
						}
						if (var270 == 4006) {
							var5 -= 5;
							int var119 = intStack[var5];
							int var120 = intStack[var5 + 1];
							int var121 = intStack[var5 + 2];
							int var122 = intStack[var5 + 4];
							int var123 = intStack[var5 + 3];
							intStack[var5++] = (var120 - var119) * (var122 + -var121) / (var123 - var121) + var119;
							continue;
						}
						if (var270 == 4007) {
							var5 -= 2;
							int var124 = intStack[var5];
							int var125 = intStack[var5 + 1];
							intStack[var5++] = var125 * var124 / 100 + var124;
							continue;
						}
						if (var270 == 4008) {
							var5 -= 2;
							int var126 = intStack[var5];
							int var127 = intStack[var5 + 1];
							intStack[var5++] = 0x1 << var127 | var126;
							continue;
						}
						if (var270 == 4009) {
							var5 -= 2;
							int var128 = intStack[var5];
							int var129 = intStack[var5 + 1];
							intStack[var5++] = var128 & -(0x1 << var129) - 1;
							continue;
						}
						if (var270 == 4010) {
							var5 -= 2;
							int var130 = intStack[var5 + 1];
							int var131 = intStack[var5];
							intStack[var5++] = (0x1 << var130 & var131) == 0 ? 0 : 1;
							continue;
						}
						if (var270 == 4011) {
							var5 -= 2;
							int var132 = intStack[var5];
							int var133 = intStack[var5 + 1];
							intStack[var5++] = var132 % var133;
							continue;
						}
						if (var270 == 4012) {
							var5 -= 2;
							int var134 = intStack[var5];
							int var135 = intStack[var5 + 1];
							if (var134 == 0) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = (int) Math.pow((double) var134, (double) var135);
							}
							continue;
						}
						if (var270 == 4013) {
							var5 -= 2;
							int var136 = intStack[var5 + 1];
							int var137 = intStack[var5];
							if (var137 == 0) {
								intStack[var5++] = 0;
							} else if (var136 == 0) {
								intStack[var5++] = Integer.MAX_VALUE;
							} else {
								intStack[var5++] = (int) Math.pow((double) var137, 1.0D / (double) var136);
							}
							continue;
						}
						if (var270 == 4014) {
							var5 -= 2;
							int var138 = intStack[var5 + 1];
							int var139 = intStack[var5];
							intStack[var5++] = var138 & var139;
							continue;
						}
						if (var270 == 4015) {
							var5 -= 2;
							int var140 = intStack[var5];
							int var141 = intStack[var5 + 1];
							intStack[var5++] = var141 | var140;
							continue;
						}
					} else if (var270 < 4200) {
						if (var270 == 4100) {
							var4--;
							JagString var142 = stringStack[var4];
							var5--;
							int var143 = intStack[var5];
							stringStack[var4++] = JagString.join(new JagString[]{var142, JagString.parseInt(var143)});
							continue;
						}
						if (var270 == 4101) {
							var4 -= 2;
							JagString var144 = stringStack[var4];
							JagString var145 = stringStack[var4 + 1];
							stringStack[var4++] = JagString.join(new JagString[]{var144, var145});
							continue;
						}
						if (var270 == 4102) {
							var4--;
							JagString var146 = stringStack[var4];
							var5--;
							int var147 = intStack[var5];
							stringStack[var4++] = JagString.join(new JagString[]{var146, JagString.method1090(var147)});
							continue;
						}
						if (var270 == 4103) {
							var4--;
							JagString var148 = stringStack[var4];
							stringStack[var4++] = var148.toLowerCase();
							continue;
						}
						if (var270 == 4104) {
							var5--;
							int var149 = intStack[var5];
							long var150 = (long) var149 * 86400000L + 1014768000000L;
							calendar.setTime(new Date(var150));
							int var152 = calendar.get(5);
							int var153 = calendar.get(2);
							int var154 = calendar.get(1);
							stringStack[var4++] = JagString.join(new JagString[]{JagString.parseInt(var152), field1984, months[var153], field1984, JagString.parseInt(var154)});
							continue;
						}
						if (var270 == 4105) {
							var4 -= 2;
							JagString var155 = stringStack[var4 + 1];
							JagString var156 = stringStack[var4];
							if (Client.localPlayer.model != null && Client.localPlayer.model.gender) {
								stringStack[var4++] = var155;
								continue;
							}
							stringStack[var4++] = var156;
							continue;
						}
						if (var270 == 4106) {
							var5--;
							int var157 = intStack[var5];
							stringStack[var4++] = JagString.parseInt(var157);
							continue;
						}
						if (var270 == 4107) {
							var4 -= 2;
							intStack[var5++] = stringStack[var4].method245(stringStack[var4 + 1]);
							continue;
						}
						if (var270 == 4108) {
							var5 -= 2;
							var4--;
							JagString var158 = stringStack[var4];
							int var159 = intStack[var5];
							int var160 = intStack[var5 + 1];
							byte[] var161 = Client.fontMetrics.getFile(var160, 0);
							PixFontGeneric var162 = new PixFontGeneric(var161);
							intStack[var5++] = var162.predictLinesMultiline(var158, var159);
							continue;
						}
						if (var270 == 4109) {
							var5 -= 2;
							int var163 = intStack[var5 + 1];
							var4--;
							JagString var164 = stringStack[var4];
							int var165 = intStack[var5];
							byte[] var166 = Client.fontMetrics.getFile(var163, 0);
							PixFontGeneric var167 = new PixFontGeneric(var166);
							intStack[var5++] = var167.predictWidthMultiline(var164, var165);
							continue;
						}
						if (var270 == 4110) {
							var4 -= 2;
							JagString var168 = stringStack[var4];
							JagString var169 = stringStack[var4 + 1];
							var5--;
							if (intStack[var5] == 1) {
								stringStack[var4++] = var168;
							} else {
								stringStack[var4++] = var169;
							}
							continue;
						}
						if (var270 == 4111) {
							var4--;
							JagString var170 = stringStack[var4];
							stringStack[var4++] = PixFont.escape(var170);
							continue;
						}
						if (var270 == 4112) {
							var5--;
							int var171 = intStack[var5];
							var4--;
							JagString var172 = stringStack[var4];
							stringStack[var4++] = var172.method277(var171);
							continue;
						}
						if (var270 == 4113) {
							var5--;
							int var173 = intStack[var5];
							intStack[var5++] = StringTools.method166(var173) ? 1 : 0;
							continue;
						}
						if (var270 == 4114) {
							var5--;
							int var174 = intStack[var5];
							intStack[var5++] = StringTools.method1212(var174) ? 1 : 0;
							continue;
						}
						if (var270 == 4115) {
							var5--;
							int var175 = intStack[var5];
							intStack[var5++] = StringTools.method626(var175) ? 1 : 0;
							continue;
						}
						if (var270 == 4116) {
							var5--;
							int var176 = intStack[var5];
							intStack[var5++] = StringTools.method1193(var176) ? 1 : 0;
							continue;
						}
						if (var270 == 4117) {
							var4--;
							JagString var177 = stringStack[var4];
							if (var177 == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var177.length();
							}
							continue;
						}
						if (var270 == 4118) {
							var5 -= 2;
							var4--;
							JagString var178 = stringStack[var4];
							int var179 = intStack[var5];
							int var180 = intStack[var5 + 1];
							stringStack[var4++] = var178.substring(var179, var180);
							continue;
						}
						if (var270 == 4119) {
							var4--;
							JagString var181 = stringStack[var4];
							JagString var182 = JagString.newStringBuilder(var181.length());
							boolean var183 = false;
							for (int var184 = 0; var184 < var181.length(); var184++) {
								int var185 = var181.charAt(var184);
								if (var185 == 60) {
									var183 = true;
								} else if (var185 == 62) {
									var183 = false;
								} else if (!var183) {
									var182.append(var185);
								}
							}
							var182.method269();
							stringStack[var4++] = var182;
							continue;
						}
						if (var270 == 4120) {
							var4--;
							JagString var186 = stringStack[var4];
							var5--;
							int var187 = intStack[var5];
							intStack[var5++] = var186.method263(var187);
							continue;
						}
					} else if (var270 < 4300) {
						if (var270 == 4200) {
							var5--;
							int var209 = intStack[var5];
							stringStack[var4++] = ObjType.list(var209).name;
							continue;
						}
						if (var270 == 4201) {
							var5 -= 2;
							int var210 = intStack[var5];
							int var211 = intStack[var5 + 1];
							ObjType var212 = ObjType.list(var210);
							if (var211 >= 1 && var211 <= 5 && var212.op[var211 - 1] != null) {
								stringStack[var4++] = var212.op[var211 - 1];
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 4202) {
							var5 -= 2;
							int var213 = intStack[var5];
							int var214 = intStack[var5 + 1];
							ObjType var215 = ObjType.list(var213);
							if (var214 >= 1 && var214 <= 5 && var215.iop[var214 - 1] != null) {
								stringStack[var4++] = var215.iop[var214 - 1];
								continue;
							}
							stringStack[var4++] = field3652;
							continue;
						}
						if (var270 == 4203) {
							var5--;
							int var216 = intStack[var5];
							intStack[var5++] = ObjType.list(var216).cost;
							continue;
						}
						if (var270 == 4204) {
							var5--;
							int var217 = intStack[var5];
							intStack[var5++] = ObjType.list(var217).stackable == 1 ? 1 : 0;
							continue;
						}
						if (var270 == 4205) {
							var5--;
							int var218 = intStack[var5];
							ObjType var219 = ObjType.list(var218);
							if (var219.certtemplate == -1 && var219.certlink >= 0) {
								intStack[var5++] = var219.certlink;
								continue;
							}
							intStack[var5++] = var218;
							continue;
						}
						if (var270 == 4206) {
							var5--;
							int var220 = intStack[var5];
							ObjType var221 = ObjType.list(var220);
							if (var221.certtemplate >= 0 && var221.certlink >= 0) {
								intStack[var5++] = var221.certlink;
								continue;
							}
							intStack[var5++] = var220;
							continue;
						}
						if (var270 == 4207) {
							var5--;
							int var222 = intStack[var5];
							intStack[var5++] = ObjType.list(var222).members ? 1 : 0;
							continue;
						}
					} else if (var270 < 5100) {
						if (var270 == 5000) {
							intStack[var5++] = Client.chatPublicMode;
							continue;
						}
						if (var270 == 5001) {
							var5 -= 3;
							Client.chatPublicMode = intStack[var5];
							Client.chatPrivateMode = intStack[var5 + 1];
							Client.chatTradeMode = intStack[var5 + 2];
							Client.out.p1Enc(69);
							Client.out.p1(Client.chatPublicMode);
							Client.out.p1(Client.chatPrivateMode);
							Client.out.p1(Client.chatTradeMode);
							continue;
						}
						if (var270 == 5002) {
							var4--;
							JagString var188 = stringStack[var4];
							var5 -= 2;
							int var189 = intStack[var5 + 1];
							int var190 = intStack[var5];
							Client.out.p1Enc(192);
							Client.out.p8(var188.method259());
							Client.out.p1(var190 - 1);
							Client.out.p1(var189);
							continue;
						}
						if (var270 == 5003) {
							var5--;
							int var191 = intStack[var5];
							JagString var192 = null;
							if (var191 < 100) {
								var192 = Client.field832[var191];
							}
							if (var192 == null) {
								var192 = field3652;
							}
							stringStack[var4++] = var192;
							continue;
						}
						if (var270 == 5004) {
							var5--;
							int var193 = intStack[var5];
							int var194 = -1;
							if (var193 < 100 && Client.field832[var193] != null) {
								var194 = Client.field347[var193];
							}
							intStack[var5++] = var194;
							continue;
						}
						if (var270 == 5005) {
							intStack[var5++] = Client.chatPrivateMode;
							continue;
						}
						if (var270 == 5008) {
							var4--;
							JagString var195 = stringStack[var4];
							if (var195.startsWith(field3110)) {
								Client.doCheat(var195);
							} else {
								JagString var196 = var195.toLowerCase();
								byte var197 = 0;
								byte var198 = 0;
								if (var196.startsWith(Text.field2947)) {
									var198 = 0;
									var195 = var195.substring(Text.field2947.length());
								} else if (var196.startsWith(Text.field2177)) {
									var198 = 1;
									var195 = var195.substring(Text.field2177.length());
								} else if (var196.startsWith(Text.field906)) {
									var195 = var195.substring(Text.field906.length());
									var198 = 2;
								} else if (var196.startsWith(Text.field3463)) {
									var198 = 3;
									var195 = var195.substring(Text.field3463.length());
								} else if (var196.startsWith(Text.field3000)) {
									var198 = 4;
									var195 = var195.substring(Text.field3000.length());
								} else if (var196.startsWith(Text.field107)) {
									var195 = var195.substring(Text.field107.length());
									var198 = 5;
								} else if (var196.startsWith(Text.field488)) {
									var198 = 6;
									var195 = var195.substring(Text.field488.length());
								} else if (var196.startsWith(Text.field931)) {
									var198 = 7;
									var195 = var195.substring(Text.field931.length());
								} else if (var196.startsWith(Text.field84)) {
									var195 = var195.substring(Text.field84.length());
									var198 = 8;
								} else if (var196.startsWith(Text.field1073)) {
									var198 = 9;
									var195 = var195.substring(Text.field1073.length());
								} else if (var196.startsWith(Text.field3188)) {
									var198 = 10;
									var195 = var195.substring(Text.field3188.length());
								} else if (var196.startsWith(Text.field2824)) {
									var198 = 11;
									var195 = var195.substring(Text.field2824.length());
								} else if (Client.lang != 0) {
									if (var196.startsWith(Text.field2962)) {
										var198 = 0;
										var195 = var195.substring(Text.field2962.length());
									} else if (var196.startsWith(Text.field2163)) {
										var195 = var195.substring(Text.field2163.length());
										var198 = 1;
									} else if (var196.startsWith(Text.field918)) {
										var198 = 2;
										var195 = var195.substring(Text.field918.length());
									} else if (var196.startsWith(Text.field3470)) {
										var198 = 3;
										var195 = var195.substring(Text.field3470.length());
									} else if (var196.startsWith(Text.field2994)) {
										var198 = 4;
										var195 = var195.substring(Text.field2994.length());
									} else if (var196.startsWith(Text.field109)) {
										var198 = 5;
										var195 = var195.substring(Text.field109.length());
									} else if (var196.startsWith(Text.field489)) {
										var195 = var195.substring(Text.field489.length());
										var198 = 6;
									} else if (var196.startsWith(Text.field942)) {
										var195 = var195.substring(Text.field942.length());
										var198 = 7;
									} else if (var196.startsWith(Text.field83)) {
										var195 = var195.substring(Text.field83.length());
										var198 = 8;
									} else if (var196.startsWith(Text.field1074)) {
										var198 = 9;
										var195 = var195.substring(Text.field1074.length());
									} else if (var196.startsWith(Text.field3192)) {
										var195 = var195.substring(Text.field3192.length());
										var198 = 10;
									} else if (var196.startsWith(Text.field2818)) {
										var198 = 11;
										var195 = var195.substring(Text.field2818.length());
									}
								}
								JagString var199 = var195.toLowerCase();
								if (var199.startsWith(Text.field1439)) {
									var195 = var195.substring(Text.field1439.length());
									var197 = 1;
								} else if (var199.startsWith(Text.field3618)) {
									var197 = 2;
									var195 = var195.substring(Text.field3618.length());
								} else if (var199.startsWith(Text.field2524)) {
									var195 = var195.substring(Text.field2524.length());
									var197 = 3;
								} else if (var199.startsWith(Text.field2884)) {
									var197 = 4;
									var195 = var195.substring(Text.field2884.length());
								} else if (var199.startsWith(Text.field2523)) {
									var195 = var195.substring(Text.field2523.length());
									var197 = 5;
								} else if (Client.lang != 0) {
									if (var199.startsWith(Text.field1433)) {
										var197 = 1;
										var195 = var195.substring(Text.field1433.length());
									} else if (var199.startsWith(Text.field3628)) {
										var197 = 2;
										var195 = var195.substring(Text.field3628.length());
									} else if (var199.startsWith(Text.field2531)) {
										var195 = var195.substring(Text.field2531.length());
										var197 = 3;
									} else if (var199.startsWith(Text.field2891)) {
										var197 = 4;
										var195 = var195.substring(Text.field2891.length());
									} else if (var199.startsWith(Text.field2527)) {
										var195 = var195.substring(Text.field2527.length());
										var197 = 5;
									}
								}
								Client.out.p1Enc(27);
								Client.out.p1(0);
								int var200 = Client.out.pos;
								Client.out.p1(var198);
								Client.out.p1(var197);
								JagString.method1194(var195, Client.out);
								Client.out.psize1(Client.out.pos - var200);
							}
							continue;
						}
						if (var270 == 5009) {
							var4 -= 2;
							JagString var201 = stringStack[var4];
							JagString var202 = stringStack[var4 + 1];
							Client.out.p1Enc(164);
							Client.out.p1(0);
							int var203 = Client.out.pos;
							Client.out.p8(var201.method259());
							JagString.method1194(var202, Client.out);
							Client.out.psize1(Client.out.pos - var203);
							continue;
						}
						if (var270 == 5010) {
							var5--;
							int var204 = intStack[var5];
							JagString var205 = null;
							if (var204 < 100) {
								var205 = Client.field245[var204];
							}
							if (var205 == null) {
								var205 = field3652;
							}
							stringStack[var4++] = var205;
							continue;
						}
						if (var270 == 5011) {
							var5--;
							int var206 = intStack[var5];
							JagString var207 = null;
							if (var206 < 100) {
								var207 = Client.field2610[var206];
							}
							if (var207 == null) {
								var207 = field3652;
							}
							stringStack[var4++] = var207;
							continue;
						}
						if (var270 == 5015) {
							JagString var208;
							if (Client.localPlayer == null || Client.localPlayer.name == null) {
								var208 = TitleScreen.loginUser;
							} else {
								var208 = Client.localPlayer.name;
							}
							stringStack[var4++] = var208;
							continue;
						}
						if (var270 == 5016) {
							intStack[var5++] = Client.chatTradeMode;
							continue;
						}
						if (var270 == 5017) {
							intStack[var5++] = Client.field423;
							continue;
						}
					}
				} else {
					IfType var259;
					if (var270 >= 2000) {
						var5--;
						var259 = IfType.get(intStack[var5]);
						var270 -= 1000;
					} else {
						var259 = var40 ? activeComponent2 : activeComponent;
					}
					if (var270 == 1300) {
						var5--;
						int var260 = intStack[var5] - 1;
						if (var260 >= 0 && var260 <= 9) {
							var4--;
							var259.setOpName(stringStack[var4], var260);
							continue;
						}
						var4--;
						continue;
					}
					if (var270 == 1301) {
						var5 -= 2;
						int var261 = intStack[var5 + 1];
						int var262 = intStack[var5];
						var259.draggable = IfType.get(var261, var262);
						continue;
					}
					if (var270 == 1302) {
						var5--;
						var259.draggablebehavior = intStack[var5] == 1;
						continue;
					}
					if (var270 == 1303) {
						var5--;
						var259.dragdeadzone = intStack[var5];
						continue;
					}
					if (var270 == 1304) {
						var5--;
						var259.dragdeadtime = intStack[var5];
						continue;
					}
					if (var270 == 1305) {
						var4--;
						var259.baseOpName = stringStack[var4];
						continue;
					}
					if (var270 == 1306) {
						var4--;
						var259.targetVerb = stringStack[var4];
						continue;
					}
					if (var270 == 1307) {
						var259.opNames = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var269) {
			if (var3.name == null) {
				if (Client.modewhere != 0) {
					Client.addChat(field2808, 0, field3652);
				}
				JagException.report("CS2 - scr:" + var3.key + " op:" + var8, var269);
			} else {
				JagString var266 = JagString.newStringBuilder(30);
				var266.append(field714).append(var3.name);
				for (int var267 = fp - 1; var267 >= 0; var267--) {
					var266.append(field1924).append(frames[var267].script.name);
				}
				if (var8 == 40) {
					int var268 = var7[var9];
					var266.append(field695).append(JagString.parseInt(var268));
				}
				if (Client.modewhere != 0) {
					Client.addChat(JagString.join(new JagString[]{field1675, var3.name}), 0, field3652);
				}
				JagException.report("CS2 - scr:" + var3.key + " op:" + var8 + new String(var266.method255()), var269);
			}
		}
	}

	@ObfuscatedName("jb.a(II)V")
	public static void executeOnLoad(int arg0) {
		if (arg0 == -1 || !IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.onload != null) {
				HookReq var4 = new HookReq();
				var4.component = var3;
				var4.onop = var3.onload;
				executeScript(var4);
			}
		}
	}
}
