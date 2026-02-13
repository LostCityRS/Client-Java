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
	public static JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("ha.y")
	public static JagString AUTO_TAG_IMG_0 = JagString.wrap("<img=0>");
	@ObfuscatedName("kf.n")
	public static JagString AUTO_TAG_IMG_1 = JagString.wrap("<img=1>");
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
		int ssp = 0;
		int isp = 0;
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
				int opcode = var6[var9];
				if (opcode < 100) {
					if (opcode == 0) {
						intStack[isp++] = var7[var9];
						continue;
					}
					if (opcode == 1) {
						int var16 = var7[var9];
						intStack[isp++] = VarCache.var[var16];
						continue;
					}
					if (opcode == 2) {
						int var17 = var7[var9];
						isp--;
						VarCache.var[var17] = intStack[isp];
						continue;
					}
					if (opcode == 3) {
						stringStack[ssp++] = var3.stringOperands[var9];
						continue;
					}
					if (opcode == 6) {
						var9 += var7[var9];
						continue;
					}
					if (opcode == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 8) {
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 9) {
						isp -= 2;
						if (intStack[isp + 1] > intStack[isp]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 10) {
						isp -= 2;
						if (intStack[isp] > intStack[isp + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 21) {
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
					if (opcode == 25) {
						int var19 = var7[var9];
						intStack[isp++] = VarCache.getVarbit(var19);
						continue;
					}
					if (opcode == 27) {
						int var20 = var7[var9];
						isp--;
						VarCache.setVarbit(intStack[isp], var20);
						continue;
					}
					if (opcode == 31) {
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 32) {
						isp -= 2;
						if (intStack[isp + 1] <= intStack[isp]) {
							var9 += var7[var9];
						}
						continue;
					}
					if (opcode == 33) {
						intStack[isp++] = intLocals[var7[var9]];
						continue;
					}
					int var10001;
					if (opcode == 34) {
						var10001 = var7[var9];
						isp--;
						intLocals[var10001] = intStack[isp];
						continue;
					}
					if (opcode == 35) {
						stringStack[ssp++] = stringLocals[var7[var9]];
						continue;
					}
					if (opcode == 36) {
						var10001 = var7[var9];
						ssp--;
						stringLocals[var10001] = stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						int var21 = var7[var9];
						ssp -= var21;
						JagString var22 = JagString.method655(stringStack, var21, ssp);
						stringStack[ssp++] = var22;
						continue;
					}
					if (opcode == 38) {
						isp--;
						continue;
					}
					if (opcode == 39) {
						ssp--;
						continue;
					}
					if (opcode == 40) {
						int var23 = var7[var9];
						ClientScript var24 = ClientScript.get(var23);
						int[] var25 = new int[var24.intLocalCount];
						JagString[] var26 = new JagString[var24.stringLocalCount];
						for (int var27 = 0; var27 < var24.intArgCount; var27++) {
							var25[var27] = intStack[isp + var27 - var24.intArgCount];
						}
						for (int var28 = 0; var28 < var24.stringArgCount; var28++) {
							var26[var28] = stringStack[ssp + var28 - var24.stringArgCount];
						}
						ssp -= var24.stringArgCount;
						isp -= var24.intArgCount;
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
					if (opcode == 42) {
						intStack[isp++] = Client.field1831[var7[var9]];
						continue;
					}
					if (opcode == 43) {
						var10001 = var7[var9];
						isp--;
						Client.field1831[var10001] = intStack[isp];
						continue;
					}
					if (opcode == 44) {
						int var30 = var7[var9] >> 16;
						int var31 = var7[var9] & 0xFFFF;
						isp--;
						int var32 = intStack[isp];
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
					if (opcode == 45) {
						int var35 = var7[var9];
						isp--;
						int var36 = intStack[isp];
						if (var36 >= 0 && var36 < arrayLengths[var35]) {
							intStack[isp++] = arrays[var35][var36];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						int var37 = var7[var9];
						isp -= 2;
						int var38 = intStack[isp];
						if (var38 >= 0 && arrayLengths[var37] > var38) {
							arrays[var37][var38] = intStack[isp + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						JagString var39 = Client.field3626[var7[var9]];
						if (var39 == null) {
							var39 = field1970;
						}
						stringStack[ssp++] = var39;
						continue;
					}
					if (opcode == 48) {
						var10001 = var7[var9];
						ssp--;
						Client.field3626[var10001] = stringStack[ssp];
						continue;
					}
				}
				boolean var40;
				if (var7[var9] == 1) {
					var40 = true;
				} else {
					var40 = false;
				}
				if (opcode < 1000) {
					if (opcode == 100) {
						isp -= 3;
						int var41 = intStack[isp];
						int var42 = intStack[isp + 1];
						int var43 = intStack[isp + 2];
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
					if (opcode == 101) {
						IfType var48 = var40 ? activeComponent2 : activeComponent;
						IfType var49 = IfType.get(var48.parentId);
						var49.subcomponents[var48.subId] = null;
						Client.componentUpdated(var49);
						continue;
					}
					if (opcode == 102) {
						isp--;
						IfType var50 = IfType.get(intStack[isp]);
						var50.subcomponents = null;
						Client.componentUpdated(var50);
						continue;
					}
					if (opcode == 200) {
						isp -= 2;
						int var51 = intStack[isp + 1];
						int var52 = intStack[isp];
						IfType var53 = IfType.get(var51, var52);
						if (var53 != null && var51 != -1) {
							intStack[isp++] = 1;
							if (var40) {
								activeComponent2 = var53;
							} else {
								activeComponent = var53;
							}
							continue;
						}
						intStack[isp++] = 0;
						continue;
					}
				} else if (opcode >= 1000 && opcode < 1100 || !(opcode < 2000 || opcode >= 2100)) {
					IfType var263;
					if (opcode < 2000) {
						var263 = var40 ? activeComponent2 : activeComponent;
					} else {
						opcode -= 1000;
						isp--;
						var263 = IfType.get(intStack[isp]);
					}
					if (opcode == 1000) {
						isp -= 2;
						var263.x = intStack[isp];
						var263.y = intStack[isp + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (opcode == 1001) {
						isp -= 2;
						var263.width = intStack[isp];
						var263.height = intStack[isp + 1];
						Client.componentUpdated(var263);
						continue;
					}
					if (opcode == 1003) {
						isp--;
						boolean var264 = intStack[isp] == 1;
						if (var263.hide != var264) {
							var263.hide = var264;
							Client.componentUpdated(var263);
						}
						continue;
					}
				} else if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
					IfType var54;
					if (opcode >= 2000) {
						opcode -= 1000;
						isp--;
						var54 = IfType.get(intStack[isp]);
					} else {
						var54 = var40 ? activeComponent2 : activeComponent;
					}
					if (opcode == 1100) {
						isp -= 2;
						var54.field843 = intStack[isp];
						if (var54.scrollWidth - var54.width < var54.field843) {
							var54.field843 = var54.scrollWidth - var54.width;
						}
						if (var54.field843 < 0) {
							var54.field843 = 0;
						}
						var54.scrollPosY = intStack[isp + 1];
						if (var54.scrollPosY > var54.scrollHeight - var54.height) {
							var54.scrollPosY = var54.scrollHeight - var54.height;
						}
						if (var54.scrollPosY < 0) {
							var54.scrollPosY = 0;
						}
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1101) {
						isp--;
						var54.colour = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1102) {
						isp--;
						var54.fill = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1103) {
						isp--;
						var54.trans = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1104) {
						isp--;
						var54.lineWidth = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1105) {
						isp--;
						var54.graphic = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1106) {
						isp--;
						var54.rotate = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1107) {
						isp--;
						var54.tiling = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1108) {
						var54.model1Type = 1;
						isp--;
						var54.model1Id = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1109) {
						isp -= 6;
						var54.modelXOf = intStack[isp];
						var54.modelYOf = intStack[isp + 1];
						var54.modelXAn = intStack[isp + 2];
						var54.modelYAn = intStack[isp + 3];
						var54.modelZAn = intStack[isp + 4];
						var54.modelZoom = intStack[isp + 5];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1110) {
						isp--;
						int var55 = intStack[isp];
						if (var55 != var54.modelAnim) {
							var54.field839 = 0;
							var54.field762 = 0;
							var54.modelAnim = var55;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (opcode == 1111) {
						isp--;
						var54.orthog = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1112) {
						ssp--;
						JagString var56 = stringStack[ssp];
						if (!var56.strEquals(var54.text)) {
							var54.text = var56;
							Client.componentUpdated(var54);
						}
						continue;
					}
					if (opcode == 1113) {
						isp--;
						var54.font = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1114) {
						isp -= 3;
						var54.hAlign = intStack[isp];
						var54.vAlign = intStack[isp + 1];
						var54.lineHeight = intStack[isp + 2];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1115) {
						isp--;
						var54.shadow = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1116) {
						isp--;
						var54.outline = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1117) {
						isp--;
						var54.shadowColour = intStack[isp];
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1118) {
						isp--;
						var54.vFlip = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1119) {
						isp--;
						var54.hFlip = intStack[isp] == 1;
						Client.componentUpdated(var54);
						continue;
					}
					if (opcode == 1120) {
						isp -= 2;
						var54.scrollWidth = intStack[isp];
						var54.scrollHeight = intStack[isp + 1];
						Client.componentUpdated(var54);
						continue;
					}
				} else if (opcode >= 1200 && opcode < 1300 || !(opcode < 2200 || opcode >= 2300)) {
					IfType var57;
					if (opcode < 2000) {
						var57 = var40 ? activeComponent2 : activeComponent;
					} else {
						opcode -= 1000;
						isp--;
						var57 = IfType.get(intStack[isp]);
					}
					Client.componentUpdated(var57);
					if (opcode == 1200) {
						isp -= 2;
						int var58 = intStack[isp];
						int var59 = intStack[isp + 1];
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
					if (opcode == 1201) {
						var57.model1Type = 2;
						isp--;
						var57.model1Id = intStack[isp];
						continue;
					}
					if (opcode == 1202) {
						var57.model1Type = 3;
						var57.model1Id = Client.localPlayer.model.method234();
						continue;
					}
				} else if ((opcode < 1300 || opcode >= 1400) && (opcode < 2300 || opcode >= 2400)) {
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						IfType var61;
						if (opcode < 2000) {
							var61 = var40 ? activeComponent2 : activeComponent;
						} else {
							isp--;
							var61 = IfType.get(intStack[isp]);
							opcode -= 1000;
						}
						ssp--;
						JagString var62 = stringStack[ssp];
						int[] var63 = null;
						if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 89) {
							isp--;
							int var64 = intStack[isp];
							if (var64 > 0) {
								var63 = new int[var64];
								while (var64-- > 0) {
									isp--;
									var63[var64] = intStack[isp];
								}
							}
							var62 = var62.substring(0, var62.length() - 1);
						}
						Object[] var65 = new Object[var62.length() + 1];
						for (int var66 = var65.length - 1; var66 >= 1; var66--) {
							if (var62.charAt(var66 - 1) == 115) {
								ssp--;
								var65[var66] = stringStack[ssp];
							} else {
								isp--;
								var65[var66] = Integer.valueOf(intStack[isp]);
							}
						}
						isp--;
						int var67 = intStack[isp];
						if (var67 == -1) {
							var65 = null;
						} else {
							var65[0] = Integer.valueOf(var67);
						}
						if (opcode == 1405) {
							var61.ondrag = var65;
						}
						if (opcode == 1412) {
							var61.onmouserepeat = var65;
						}
						if (opcode == 1400) {
							var61.onclick = var65;
						}
						if (opcode == 1406) {
							var61.ontargetleave = var65;
						}
						if (opcode == 1404) {
							var61.onmouseleave = var65;
						}
						if (opcode == 1415) {
							var61.onstattransmit = var65;
							var61.onstattransmitlist = var63;
						}
						if (opcode == 1421) {
							var61.field793 = var65;
						}
						if (opcode == 1418) {
							var61.field782 = var65;
						}
						if (opcode == 1402) {
							var61.onrelease = var65;
						}
						if (opcode == 1401) {
							var61.onhold = var65;
						}
						if (opcode == 1424) {
							var61.field795 = var65;
						}
						if (opcode == 1414) {
							var61.oninvtransmitlist = var63;
							var61.oninvtransmit = var65;
						}
						var61.hashook = true;
						if (opcode == 1409) {
							var61.onop = var65;
						}
						if (opcode == 1420) {
							var61.field780 = var65;
						}
						if (opcode == 1407) {
							var61.onvartransmitlist = var63;
							var61.onvartransmit = var65;
						}
						if (opcode == 1422) {
							var61.field822 = var65;
						}
						if (opcode == 1419) {
							var61.field741 = var65;
						}
						if (opcode == 1416) {
							var61.ontargetenter = var65;
						}
						if (opcode == 1423) {
							var61.field758 = var65;
						}
						if (opcode == 1417) {
							var61.onscrollwheel = var65;
						}
						if (opcode == 1403) {
							var61.onmouseover = var65;
						}
						if (opcode == 1411) {
							var61.onclickrepeat = var65;
						}
						if (opcode == 1410) {
							var61.ondragcomplete = var65;
						}
						if (opcode == 1408) {
							var61.ontimer = var65;
						}
						continue;
					}
					if (opcode < 1600) {
						IfType var258 = var40 ? activeComponent2 : activeComponent;
						if (opcode == 1500) {
							intStack[isp++] = var258.x;
							continue;
						}
						if (opcode == 1501) {
							intStack[isp++] = var258.y;
							continue;
						}
						if (opcode == 1502) {
							intStack[isp++] = var258.width;
							continue;
						}
						if (opcode == 1503) {
							intStack[isp++] = var258.height;
							continue;
						}
						if (opcode == 1504) {
							intStack[isp++] = var258.hide ? 1 : 0;
							continue;
						}
						if (opcode == 1505) {
							intStack[isp++] = var258.layerId;
							continue;
						}
					} else if (opcode < 1700) {
						IfType var68 = var40 ? activeComponent2 : activeComponent;
						if (opcode == 1600) {
							intStack[isp++] = var68.field843;
							continue;
						}
						if (opcode == 1601) {
							intStack[isp++] = var68.scrollPosY;
							continue;
						}
						if (opcode == 1602) {
							stringStack[ssp++] = var68.text;
							continue;
						}
						if (opcode == 1603) {
							intStack[isp++] = var68.scrollWidth;
							continue;
						}
						if (opcode == 1604) {
							intStack[isp++] = var68.scrollHeight;
							continue;
						}
						if (opcode == 1605) {
							intStack[isp++] = var68.modelZoom;
							continue;
						}
						if (opcode == 1606) {
							intStack[isp++] = var68.modelXAn;
							continue;
						}
						if (opcode == 1607) {
							intStack[isp++] = var68.modelZAn;
							continue;
						}
						if (opcode == 1608) {
							intStack[isp++] = var68.modelYAn;
							continue;
						}
					} else if (opcode < 1800) {
						IfType var69 = var40 ? activeComponent2 : activeComponent;
						if (opcode == 1700) {
							intStack[isp++] = var69.field804;
							continue;
						}
						if (opcode == 1701) {
							if (var69.field804 == -1) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = var69.field786;
							}
							continue;
						}
						if (opcode == 1702) {
							intStack[isp++] = var69.subId;
							continue;
						}
					} else if (opcode < 1900) {
						IfType var256 = var40 ? activeComponent2 : activeComponent;
						if (opcode == 1800) {
							intStack[isp++] = ServerActive.targetMask(Client.getActive(var256));
							continue;
						}
						if (opcode == 1801) {
							isp--;
							int var257 = intStack[isp];
							int var272 = var257 - 1;
							if (var256.opNames != null && var256.opNames.length > var272 && var256.opNames[var272] != null) {
								stringStack[ssp++] = var256.opNames[var272];
								continue;
							}
							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 1802) {
							if (var256.baseOpName == null) {
								stringStack[ssp++] = AUTO_EMPTY;
							} else {
								stringStack[ssp++] = var256.baseOpName;
							}
							continue;
						}
					} else if (opcode < 2600) {
						isp--;
						IfType var70 = IfType.get(intStack[isp]);
						if (opcode == 2500) {
							intStack[isp++] = var70.x;
							continue;
						}
						if (opcode == 2501) {
							intStack[isp++] = var70.y;
							continue;
						}
						if (opcode == 2502) {
							intStack[isp++] = var70.width;
							continue;
						}
						if (opcode == 2503) {
							intStack[isp++] = var70.height;
							continue;
						}
						if (opcode == 2504) {
							intStack[isp++] = var70.hide ? 1 : 0;
							continue;
						}
						if (opcode == 2505) {
							intStack[isp++] = var70.layerId;
							continue;
						}
					} else if (opcode < 2700) {
						isp--;
						IfType var255 = IfType.get(intStack[isp]);
						if (opcode == 2600) {
							intStack[isp++] = var255.field843;
							continue;
						}
						if (opcode == 2601) {
							intStack[isp++] = var255.scrollPosY;
							continue;
						}
						if (opcode == 2602) {
							stringStack[ssp++] = var255.text;
							continue;
						}
						if (opcode == 2603) {
							intStack[isp++] = var255.scrollWidth;
							continue;
						}
						if (opcode == 2604) {
							intStack[isp++] = var255.scrollHeight;
							continue;
						}
						if (opcode == 2605) {
							intStack[isp++] = var255.modelZoom;
							continue;
						}
						if (opcode == 2606) {
							intStack[isp++] = var255.modelXAn;
							continue;
						}
						if (opcode == 2607) {
							intStack[isp++] = var255.modelZAn;
							continue;
						}
						if (opcode == 2608) {
							intStack[isp++] = var255.modelYAn;
							continue;
						}
					} else if (opcode < 2800) {
						if (opcode == 2700) {
							isp--;
							IfType var71 = IfType.get(intStack[isp]);
							intStack[isp++] = var71.field804;
							continue;
						}
						if (opcode == 2701) {
							isp--;
							IfType var72 = IfType.get(intStack[isp]);
							if (var72.field804 == -1) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = var72.field786;
							}
							continue;
						}
						if (opcode == 2702) {
							isp--;
							int var73 = intStack[isp];
							SubInterface var74 = (SubInterface) Client.subinterfaces.find((long) var73);
							if (var74 == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = 1;
							}
							continue;
						}
					} else if (opcode < 2900) {
						isp--;
						IfType var75 = IfType.get(intStack[isp]);
						if (opcode == 2800) {
							intStack[isp++] = ServerActive.targetMask(Client.getActive(var75));
							continue;
						}
						if (opcode == 2801) {
							isp--;
							int var76 = intStack[isp];
							int var271 = var76 - 1;
							if (var75.opNames != null && var75.opNames.length > var271 && var75.opNames[var271] != null) {
								stringStack[ssp++] = var75.opNames[var271];
								continue;
							}
							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 2802) {
							if (var75.baseOpName == null) {
								stringStack[ssp++] = AUTO_EMPTY;
							} else {
								stringStack[ssp++] = var75.baseOpName;
							}
							continue;
						}
					} else if (opcode < 3200) {
						if (opcode == 3100) {
							ssp--;
							JagString var241 = stringStack[ssp];
							Client.addChat(var241, 0, AUTO_EMPTY);
							continue;
						}
						if (opcode == 3101) {
							isp -= 2;
							Client.method1023(intStack[isp + 1], Client.localPlayer, intStack[isp]);
							continue;
						}
						if (opcode == 3103) {
							Client.closeModal();
							continue;
						}
						if (opcode == 3104) {
							ssp--;
							JagString var242 = stringStack[ssp];
							int var243 = 0;
							if (var242.method274()) {
								var243 = var242.checkedParseInt();
							}
							Client.out.p1Enc(216);
							Client.out.p4(var243);
							continue;
						}
						if (opcode == 3105) {
							ssp--;
							JagString var244 = stringStack[ssp];
							Client.out.p1Enc(36);
							Client.out.p8(var244.method259());
							continue;
						}
						if (opcode == 3106) {
							ssp--;
							JagString var245 = stringStack[ssp];
							Client.out.p1Enc(86);
							Client.out.p1(var245.length() + 1);
							Client.out.pjstr(var245);
							continue;
						}
						if (opcode == 3107) {
							isp--;
							int var246 = intStack[isp];
							ssp--;
							JagString var247 = stringStack[ssp];
							Client.opPlayer(var246, var247);
							continue;
						}
						if (opcode == 3108) {
							isp -= 3;
							int var248 = intStack[isp];
							int var249 = intStack[isp + 1];
							int var250 = intStack[isp + 2];
							IfType var251 = IfType.get(var250);
							Client.method127(var251, var249, var248);
							continue;
						}
						if (opcode == 3109) {
							isp -= 2;
							int var252 = intStack[isp];
							int var253 = intStack[isp + 1];
							IfType var254 = var40 ? activeComponent2 : activeComponent;
							Client.method127(var254, var253, var252);
							continue;
						}
					} else if (opcode < 3300) {
						if (opcode == 3200) {
							isp -= 3;
							Client.method17(intStack[isp], intStack[isp + 2], intStack[isp + 1]);
							continue;
						}
						if (opcode == 3201) {
							isp--;
							Client.playSongs(intStack[isp]);
							continue;
						}
						if (opcode == 3202) {
							isp -= 2;
							Client.playJingle(intStack[isp], intStack[isp + 1]);
							continue;
						}
					} else if (opcode < 3400) {
						if (opcode == 3300) {
							intStack[isp++] = Client.loopCycle;
							continue;
						}
						if (opcode == 3301) {
							isp -= 2;
							int var77 = intStack[isp];
							int var78 = intStack[isp + 1];
							intStack[isp++] = ClientInvCache.getType(var78, var77);
							continue;
						}
						if (opcode == 3302) {
							isp -= 2;
							int var79 = intStack[isp];
							int var80 = intStack[isp + 1];
							intStack[isp++] = ClientInvCache.getCount(var79, var80);
							continue;
						}
						if (opcode == 3303) {
							isp -= 2;
							int var81 = intStack[isp + 1];
							int var82 = intStack[isp];
							intStack[isp++] = ClientInvCache.getTotal(var82, var81);
							continue;
						}
						if (opcode == 3304) {
							isp--;
							int var83 = intStack[isp];
							intStack[isp++] = InvType.list(var83).size;
							continue;
						}
						if (opcode == 3305) {
							isp--;
							int var84 = intStack[isp];
							intStack[isp++] = Client.statEffectiveLevel[var84];
							continue;
						}
						if (opcode == 3306) {
							isp--;
							int var85 = intStack[isp];
							intStack[isp++] = Client.statBaseLevel[var85];
							continue;
						}
						if (opcode == 3307) {
							isp--;
							int var86 = intStack[isp];
							intStack[isp++] = Client.statXP[var86];
							continue;
						}
						if (opcode == 3308) {
							int var87 = Client.minusedlevel;
							int var88 = (Client.localPlayer.x >> 7) + Client.mapBuildBaseX;
							int var89 = Client.mapBuildBaseZ + (Client.localPlayer.z >> 7);
							intStack[isp++] = var89 + (var87 << 28) + (var88 << 14);
							continue;
						}
						if (opcode == 3309) {
							isp--;
							int var90 = intStack[isp];
							intStack[isp++] = var90 >> 14 & 0x3FFF;
							continue;
						}
						if (opcode == 3310) {
							isp--;
							int var91 = intStack[isp];
							intStack[isp++] = var91 >> 28;
							continue;
						}
						if (opcode == 3311) {
							isp--;
							int var92 = intStack[isp];
							intStack[isp++] = var92 & 0x3FFF;
							continue;
						}
						if (opcode == 3312) {
							intStack[isp++] = Client.memServer ? 1 : 0;
							continue;
						}
						if (opcode == 3313) {
							isp -= 2;
							int var93 = intStack[isp] + 32768;
							int var94 = intStack[isp + 1];
							intStack[isp++] = ClientInvCache.getType(var94, var93);
							continue;
						}
						if (opcode == 3314) {
							isp -= 2;
							int var95 = intStack[isp] + 32768;
							int var96 = intStack[isp + 1];
							intStack[isp++] = ClientInvCache.getCount(var95, var96);
							continue;
						}
						if (opcode == 3315) {
							isp -= 2;
							int var97 = intStack[isp] + 32768;
							int var98 = intStack[isp + 1];
							intStack[isp++] = ClientInvCache.getTotal(var97, var98);
							continue;
						}
						if (opcode == 3316) {
							if (Client.staffmodlevel >= 2) {
								intStack[isp++] = Client.staffmodlevel;
							} else {
								intStack[isp++] = 0;
							}
							continue;
						}
						if (opcode == 3317) {
							intStack[isp++] = Client.logoutTimer;
							continue;
						}
						if (opcode == 3318) {
							intStack[isp++] = Client.worldid;
							continue;
						}
						if (opcode == 3321) {
							intStack[isp++] = Client.runenergy;
							continue;
						}
						if (opcode == 3322) {
							intStack[isp++] = Client.runweight;
							continue;
						}
						if (opcode == 3323) {
							if (Client.staffmodlevel == 1) {
								intStack[isp++] = 1;
							} else {
								intStack[isp++] = 0;
							}
							continue;
						}
					} else if (opcode < 3500) {
						if (opcode == 3400) {
							isp -= 2;
							int var99 = intStack[isp];
							int var100 = intStack[isp + 1];
							EnumType var101 = EnumType.list(var99);
							for (int var102 = 0; var102 < var101.count; var102++) {
								if (var100 == var101.keys[var102]) {
									stringStack[ssp++] = var101.stringValues[var102];
									var101 = null;
									break;
								}
							}
							if (var101 != null) {
								stringStack[ssp++] = var101.defaultString;
							}
							continue;
						}
						if (opcode == 3408) {
							isp -= 4;
							int var103 = intStack[isp + 1];
							int var104 = intStack[isp];
							int var105 = intStack[isp + 2];
							int var106 = intStack[isp + 3];
							EnumType var107 = EnumType.list(var105);
							if (var107.inputtype == var104 && var103 == var107.outputtype) {
								for (int var108 = 0; var108 < var107.count; var108++) {
									if (var106 == var107.keys[var108]) {
										if (var103 == 115) {
											stringStack[ssp++] = var107.stringValues[var108];
										} else {
											intStack[isp++] = var107.intValues[var108];
										}
										var107 = null;
										break;
									}
								}
								if (var107 != null) {
									if (var103 == 115) {
										stringStack[ssp++] = var107.defaultString;
									} else {
										intStack[isp++] = var107.defaultInt;
									}
								}
								continue;
							}
							if (var103 == 115) {
								stringStack[ssp++] = field1970;
							} else {
								intStack[isp++] = 0;
							}
							continue;
						}
					} else if (opcode < 3700) {
						// friend_count
						if (opcode == 3600) {
							if (Client.friendServerStatus == 0) {
								intStack[isp++] = -2;
							} else if (Client.friendServerStatus == 1) {
								intStack[isp++] = -1;
							} else {
								intStack[isp++] = Client.friendCount;
							}
							continue;
						}
						if (opcode == 3601) {
							// friend_getname
							isp--;
							int var223 = intStack[isp];

							if (Client.friendServerStatus == 2 && Client.friendCount > var223) {
								stringStack[ssp++] = Client.field239[var223];
								continue;
							}

							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 3602) {
							// friend_getworld
							isp--;
							int var224 = intStack[isp];

							if (Client.friendServerStatus == 2 && Client.friendCount > var224) {
								intStack[isp++] = Client.field2094[var224];
								continue;
							}
							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3603) {
							// friend_getrank
							isp--;
							int var225 = intStack[isp];

							if (Client.friendServerStatus == 2 && Client.friendCount > var225) {
								intStack[isp++] = Client.field103[var225];
								continue;
							}
							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3604) {
							// friend_setrank
							ssp--;
							JagString var226 = stringStack[ssp];

							isp--;
							int var227 = intStack[isp];

							Client.setFriendRank(var227, var226);
							continue;
						}
						if (opcode == 3605) {
							// friend_add
							ssp--;
							JagString var228 = stringStack[ssp];

							Client.addFriend(var228.method259());
							continue;
						}
						if (opcode == 3606) {
							// friend_del
							ssp--;
							JagString var229 = stringStack[ssp];

							Client.delFriend(var229.method259());
							continue;
						}
						if (opcode == 3607) {
							ssp--;
							JagString var230 = stringStack[ssp];

							Client.addIgnore(var230.method259());
							continue;
						}
						if (opcode == 3608) {
							ssp--;
							JagString var231 = stringStack[ssp];

							Client.delIgnoore(var231.method259());
							continue;
						}
						if (opcode == 3609) {
							// friend_test
							ssp--;
							JagString var232 = stringStack[ssp];
							if (var232.startsWith(AUTO_TAG_IMG_0) || var232.startsWith(AUTO_TAG_IMG_1)) {
								var232 = var232.substring(7);
							}

							intStack[isp++] = Client.isFriend(var232) ? 1 : 0;
							continue;
						}
						if (opcode == 3611) {
							// clan_getchatdisplayname
							if (Client.chatDisplayName == null) {
								stringStack[ssp++] = AUTO_EMPTY;
							} else {
								stringStack[ssp++] = Client.chatDisplayName.toScreenName();
							}
							continue;
						}
						if (opcode == 3612) {
							// clan_getchatcount
							if (Client.chatDisplayName == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = Client.friendChatCount;
							}
							continue;
						}
						if (opcode == 3613) {
							// clan_getchatusername
							isp--;
							int var233 = intStack[isp];

							if (Client.chatDisplayName != null && var233 < Client.friendChatCount) {
								stringStack[ssp++] = Client.friendChatList[var233].username.toScreenName();
								continue;
							}

							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 3614) {
							// clan_getchatuserworld
							isp--;
							int var234 = intStack[isp];

							if (Client.chatDisplayName != null && var234 < Client.friendChatCount) {
								intStack[isp++] = Client.friendChatList[var234].world;
								continue;
							}

							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3615) {
							// clan_getchatuserrank
							isp--;
							int var235 = intStack[isp];

							if (Client.chatDisplayName != null && var235 < Client.friendChatCount) {
								intStack[isp++] = Client.friendChatList[var235].rank;
								continue;
							}

							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3616) {
							// clan_getchatminkick
							intStack[isp++] = Client.chatMinKick;
							continue;
						}
						if (opcode == 3617) {
							// clan_kickuser
							ssp--;
							JagString var236 = stringStack[ssp];
							Client.friendsChatKickUser(var236);
							continue;
						}
						if (opcode == 3618) {
							// clan_getchatrank
							intStack[isp++] = Client.chatRank;
							continue;
						}
						if (opcode == 3619) {
							// clan_joinchat
							ssp--;
							JagString var237 = stringStack[ssp];
							Client.friendsChatJoinChat(var237.method259());
							continue;
						}
						if (opcode == 3620) {
							// clan_leavechat
							Client.friendsChatLeaveChat();
							continue;
						}
						if (opcode == 3621) {
							// ignore_count
							if (Client.friendServerStatus == 0) {
								intStack[isp++] = -1;
							} else {
								intStack[isp++] = Client.ignoreCount;
							}
							continue;
						}
						if (opcode == 3622) {
							isp--;
							int var238 = intStack[isp];
							if (Client.friendServerStatus != 0 && var238 < Client.ignoreCount) {
								stringStack[ssp++] = JString.toRawUsername(Client.ignoreList[var238]).toScreenName();
								continue;
							}
							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 3623) {
							ssp--;
							JagString var239 = stringStack[ssp];
							if (var239.startsWith(AUTO_TAG_IMG_0) || var239.startsWith(AUTO_TAG_IMG_1)) {
								var239 = var239.substring(7);
							}
							intStack[isp++] = Client.method876(var239) ? 1 : 0;
							continue;
						}
						if (opcode == 3624) {
							isp--;
							int var240 = intStack[isp];
							if (Client.friendChatList != null && Client.friendChatCount > var240 && Client.friendChatList[var240].username.equalsIgnoreCase(Client.localPlayer.name)) {
								intStack[isp++] = 1;
								continue;
							}
							intStack[isp++] = 0;
							continue;
						}
						if (opcode == 3625) {
							if (Client.field2924 == null) {
								stringStack[ssp++] = AUTO_EMPTY;
							} else {
								stringStack[ssp++] = Client.field2924.toScreenName();
							}
							continue;
						}
					} else if (opcode < 4100) {
						if (opcode == 4000) {
							isp -= 2;
							int var109 = intStack[isp + 1];
							int var110 = intStack[isp];
							intStack[isp++] = var110 + var109;
							continue;
						}
						if (opcode == 4001) {
							isp -= 2;
							int var111 = intStack[isp];
							int var112 = intStack[isp + 1];
							intStack[isp++] = var111 - var112;
							continue;
						}
						if (opcode == 4002) {
							isp -= 2;
							int var113 = intStack[isp + 1];
							int var114 = intStack[isp];
							intStack[isp++] = var114 * var113;
							continue;
						}
						if (opcode == 4003) {
							isp -= 2;
							int var115 = intStack[isp];
							int var116 = intStack[isp + 1];
							intStack[isp++] = var115 / var116;
							continue;
						}
						if (opcode == 4004) {
							isp--;
							int var117 = intStack[isp];
							intStack[isp++] = (int) (Math.random() * (double) var117);
							continue;
						}
						if (opcode == 4005) {
							isp--;
							int var118 = intStack[isp];
							intStack[isp++] = (int) ((double) (var118 + 1) * Math.random());
							continue;
						}
						if (opcode == 4006) {
							isp -= 5;
							int var119 = intStack[isp];
							int var120 = intStack[isp + 1];
							int var121 = intStack[isp + 2];
							int var122 = intStack[isp + 4];
							int var123 = intStack[isp + 3];
							intStack[isp++] = (var120 - var119) * (var122 + -var121) / (var123 - var121) + var119;
							continue;
						}
						if (opcode == 4007) {
							isp -= 2;
							int var124 = intStack[isp];
							int var125 = intStack[isp + 1];
							intStack[isp++] = var125 * var124 / 100 + var124;
							continue;
						}
						if (opcode == 4008) {
							isp -= 2;
							int var126 = intStack[isp];
							int var127 = intStack[isp + 1];
							intStack[isp++] = 0x1 << var127 | var126;
							continue;
						}
						if (opcode == 4009) {
							isp -= 2;
							int var128 = intStack[isp];
							int var129 = intStack[isp + 1];
							intStack[isp++] = var128 & -(0x1 << var129) - 1;
							continue;
						}
						if (opcode == 4010) {
							isp -= 2;
							int var130 = intStack[isp + 1];
							int var131 = intStack[isp];
							intStack[isp++] = (0x1 << var130 & var131) == 0 ? 0 : 1;
							continue;
						}
						if (opcode == 4011) {
							isp -= 2;
							int var132 = intStack[isp];
							int var133 = intStack[isp + 1];
							intStack[isp++] = var132 % var133;
							continue;
						}
						if (opcode == 4012) {
							isp -= 2;
							int var134 = intStack[isp];
							int var135 = intStack[isp + 1];
							if (var134 == 0) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = (int) Math.pow((double) var134, (double) var135);
							}
							continue;
						}
						if (opcode == 4013) {
							isp -= 2;
							int var136 = intStack[isp + 1];
							int var137 = intStack[isp];
							if (var137 == 0) {
								intStack[isp++] = 0;
							} else if (var136 == 0) {
								intStack[isp++] = Integer.MAX_VALUE;
							} else {
								intStack[isp++] = (int) Math.pow((double) var137, 1.0D / (double) var136);
							}
							continue;
						}
						if (opcode == 4014) {
							isp -= 2;
							int var138 = intStack[isp + 1];
							int var139 = intStack[isp];
							intStack[isp++] = var138 & var139;
							continue;
						}
						if (opcode == 4015) {
							isp -= 2;
							int var140 = intStack[isp];
							int var141 = intStack[isp + 1];
							intStack[isp++] = var141 | var140;
							continue;
						}
					} else if (opcode < 4200) {
						if (opcode == 4100) {
							ssp--;
							JagString var142 = stringStack[ssp];
							isp--;
							int var143 = intStack[isp];
							stringStack[ssp++] = JagString.join(new JagString[]{var142, JagString.parseInt(var143)});
							continue;
						}
						if (opcode == 4101) {
							ssp -= 2;
							JagString var144 = stringStack[ssp];
							JagString var145 = stringStack[ssp + 1];
							stringStack[ssp++] = JagString.join(new JagString[]{var144, var145});
							continue;
						}
						if (opcode == 4102) {
							ssp--;
							JagString var146 = stringStack[ssp];
							isp--;
							int var147 = intStack[isp];
							stringStack[ssp++] = JagString.join(new JagString[]{var146, JagString.method1090(var147)});
							continue;
						}
						if (opcode == 4103) {
							ssp--;
							JagString var148 = stringStack[ssp];
							stringStack[ssp++] = var148.toLowerCase();
							continue;
						}
						if (opcode == 4104) {
							isp--;
							int var149 = intStack[isp];
							long var150 = (long) var149 * 86400000L + 1014768000000L;
							calendar.setTime(new Date(var150));
							int var152 = calendar.get(5);
							int var153 = calendar.get(2);
							int var154 = calendar.get(1);
							stringStack[ssp++] = JagString.join(new JagString[]{JagString.parseInt(var152), field1984, months[var153], field1984, JagString.parseInt(var154)});
							continue;
						}
						if (opcode == 4105) {
							ssp -= 2;
							JagString var155 = stringStack[ssp + 1];
							JagString var156 = stringStack[ssp];
							if (Client.localPlayer.model != null && Client.localPlayer.model.gender) {
								stringStack[ssp++] = var155;
								continue;
							}
							stringStack[ssp++] = var156;
							continue;
						}
						if (opcode == 4106) {
							isp--;
							int var157 = intStack[isp];
							stringStack[ssp++] = JagString.parseInt(var157);
							continue;
						}
						if (opcode == 4107) {
							ssp -= 2;
							intStack[isp++] = stringStack[ssp].method245(stringStack[ssp + 1]);
							continue;
						}
						if (opcode == 4108) {
							isp -= 2;
							ssp--;
							JagString var158 = stringStack[ssp];
							int var159 = intStack[isp];
							int var160 = intStack[isp + 1];
							byte[] var161 = Client.fontMetrics.getFile(var160, 0);
							PixFontGeneric var162 = new PixFontGeneric(var161);
							intStack[isp++] = var162.predictLinesMultiline(var158, var159);
							continue;
						}
						if (opcode == 4109) {
							isp -= 2;
							int var163 = intStack[isp + 1];
							ssp--;
							JagString var164 = stringStack[ssp];
							int var165 = intStack[isp];
							byte[] var166 = Client.fontMetrics.getFile(var163, 0);
							PixFontGeneric var167 = new PixFontGeneric(var166);
							intStack[isp++] = var167.predictWidthMultiline(var164, var165);
							continue;
						}
						if (opcode == 4110) {
							ssp -= 2;
							JagString var168 = stringStack[ssp];
							JagString var169 = stringStack[ssp + 1];
							isp--;
							if (intStack[isp] == 1) {
								stringStack[ssp++] = var168;
							} else {
								stringStack[ssp++] = var169;
							}
							continue;
						}
						if (opcode == 4111) {
							ssp--;
							JagString var170 = stringStack[ssp];
							stringStack[ssp++] = PixFont.escape(var170);
							continue;
						}
						if (opcode == 4112) {
							isp--;
							int var171 = intStack[isp];
							ssp--;
							JagString var172 = stringStack[ssp];
							stringStack[ssp++] = var172.method277(var171);
							continue;
						}
						if (opcode == 4113) {
							isp--;
							int var173 = intStack[isp];
							intStack[isp++] = StringTools.method166(var173) ? 1 : 0;
							continue;
						}
						if (opcode == 4114) {
							isp--;
							int var174 = intStack[isp];
							intStack[isp++] = StringTools.method1212(var174) ? 1 : 0;
							continue;
						}
						if (opcode == 4115) {
							isp--;
							int var175 = intStack[isp];
							intStack[isp++] = StringTools.method626(var175) ? 1 : 0;
							continue;
						}
						if (opcode == 4116) {
							isp--;
							int var176 = intStack[isp];
							intStack[isp++] = StringTools.method1193(var176) ? 1 : 0;
							continue;
						}
						if (opcode == 4117) {
							ssp--;
							JagString var177 = stringStack[ssp];
							if (var177 == null) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = var177.length();
							}
							continue;
						}
						if (opcode == 4118) {
							isp -= 2;
							ssp--;
							JagString var178 = stringStack[ssp];
							int var179 = intStack[isp];
							int var180 = intStack[isp + 1];
							stringStack[ssp++] = var178.substring(var179, var180);
							continue;
						}
						if (opcode == 4119) {
							ssp--;
							JagString var181 = stringStack[ssp];
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
							stringStack[ssp++] = var182;
							continue;
						}
						if (opcode == 4120) {
							ssp--;
							JagString var186 = stringStack[ssp];
							isp--;
							int var187 = intStack[isp];
							intStack[isp++] = var186.method263(var187);
							continue;
						}
					} else if (opcode < 4300) {
						if (opcode == 4200) {
							isp--;
							int var209 = intStack[isp];
							stringStack[ssp++] = ObjType.list(var209).name;
							continue;
						}
						if (opcode == 4201) {
							isp -= 2;
							int var210 = intStack[isp];
							int var211 = intStack[isp + 1];
							ObjType var212 = ObjType.list(var210);
							if (var211 >= 1 && var211 <= 5 && var212.op[var211 - 1] != null) {
								stringStack[ssp++] = var212.op[var211 - 1];
								continue;
							}
							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 4202) {
							isp -= 2;
							int var213 = intStack[isp];
							int var214 = intStack[isp + 1];
							ObjType var215 = ObjType.list(var213);
							if (var214 >= 1 && var214 <= 5 && var215.iop[var214 - 1] != null) {
								stringStack[ssp++] = var215.iop[var214 - 1];
								continue;
							}
							stringStack[ssp++] = AUTO_EMPTY;
							continue;
						}
						if (opcode == 4203) {
							isp--;
							int var216 = intStack[isp];
							intStack[isp++] = ObjType.list(var216).cost;
							continue;
						}
						if (opcode == 4204) {
							isp--;
							int var217 = intStack[isp];
							intStack[isp++] = ObjType.list(var217).stackable == 1 ? 1 : 0;
							continue;
						}
						if (opcode == 4205) {
							isp--;
							int var218 = intStack[isp];
							ObjType var219 = ObjType.list(var218);
							if (var219.certtemplate == -1 && var219.certlink >= 0) {
								intStack[isp++] = var219.certlink;
								continue;
							}
							intStack[isp++] = var218;
							continue;
						}
						if (opcode == 4206) {
							isp--;
							int var220 = intStack[isp];
							ObjType var221 = ObjType.list(var220);
							if (var221.certtemplate >= 0 && var221.certlink >= 0) {
								intStack[isp++] = var221.certlink;
								continue;
							}
							intStack[isp++] = var220;
							continue;
						}
						if (opcode == 4207) {
							isp--;
							int var222 = intStack[isp];
							intStack[isp++] = ObjType.list(var222).members ? 1 : 0;
							continue;
						}
					} else if (opcode < 5100) {
						if (opcode == 5000) {
							intStack[isp++] = Client.chatPublicMode;
							continue;
						}
						if (opcode == 5001) {
							isp -= 3;
							Client.chatPublicMode = intStack[isp];
							Client.chatPrivateMode = intStack[isp + 1];
							Client.chatTradeMode = intStack[isp + 2];
							Client.out.p1Enc(69);
							Client.out.p1(Client.chatPublicMode);
							Client.out.p1(Client.chatPrivateMode);
							Client.out.p1(Client.chatTradeMode);
							continue;
						}
						if (opcode == 5002) {
							ssp--;
							JagString var188 = stringStack[ssp];
							isp -= 2;
							int var189 = intStack[isp + 1];
							int var190 = intStack[isp];
							Client.out.p1Enc(192);
							Client.out.p8(var188.method259());
							Client.out.p1(var190 - 1);
							Client.out.p1(var189);
							continue;
						}
						if (opcode == 5003) {
							isp--;
							int var191 = intStack[isp];
							JagString var192 = null;
							if (var191 < 100) {
								var192 = Client.field832[var191];
							}
							if (var192 == null) {
								var192 = AUTO_EMPTY;
							}
							stringStack[ssp++] = var192;
							continue;
						}
						if (opcode == 5004) {
							isp--;
							int var193 = intStack[isp];
							int var194 = -1;
							if (var193 < 100 && Client.field832[var193] != null) {
								var194 = Client.field347[var193];
							}
							intStack[isp++] = var194;
							continue;
						}
						if (opcode == 5005) {
							intStack[isp++] = Client.chatPrivateMode;
							continue;
						}
						if (opcode == 5008) {
							ssp--;
							JagString var195 = stringStack[ssp];
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
						if (opcode == 5009) {
							ssp -= 2;
							JagString var201 = stringStack[ssp];
							JagString var202 = stringStack[ssp + 1];
							Client.out.p1Enc(164);
							Client.out.p1(0);
							int var203 = Client.out.pos;
							Client.out.p8(var201.method259());
							JagString.method1194(var202, Client.out);
							Client.out.psize1(Client.out.pos - var203);
							continue;
						}
						if (opcode == 5010) {
							isp--;
							int var204 = intStack[isp];
							JagString var205 = null;
							if (var204 < 100) {
								var205 = Client.field245[var204];
							}
							if (var205 == null) {
								var205 = AUTO_EMPTY;
							}
							stringStack[ssp++] = var205;
							continue;
						}
						if (opcode == 5011) {
							isp--;
							int var206 = intStack[isp];
							JagString var207 = null;
							if (var206 < 100) {
								var207 = Client.field2610[var206];
							}
							if (var207 == null) {
								var207 = AUTO_EMPTY;
							}
							stringStack[ssp++] = var207;
							continue;
						}
						if (opcode == 5015) {
							JagString var208;
							if (Client.localPlayer == null || Client.localPlayer.name == null) {
								var208 = TitleScreen.loginUser;
							} else {
								var208 = Client.localPlayer.name;
							}
							stringStack[ssp++] = var208;
							continue;
						}
						if (opcode == 5016) {
							intStack[isp++] = Client.chatTradeMode;
							continue;
						}
						if (opcode == 5017) {
							intStack[isp++] = Client.field423;
							continue;
						}
					}
				} else {
					IfType var259;
					if (opcode >= 2000) {
						isp--;
						var259 = IfType.get(intStack[isp]);
						opcode -= 1000;
					} else {
						var259 = var40 ? activeComponent2 : activeComponent;
					}
					if (opcode == 1300) {
						isp--;
						int var260 = intStack[isp] - 1;
						if (var260 >= 0 && var260 <= 9) {
							ssp--;
							var259.setOpName(stringStack[ssp], var260);
							continue;
						}
						ssp--;
						continue;
					}
					if (opcode == 1301) {
						isp -= 2;
						int var261 = intStack[isp + 1];
						int var262 = intStack[isp];
						var259.draggable = IfType.get(var261, var262);
						continue;
					}
					if (opcode == 1302) {
						isp--;
						var259.draggablebehavior = intStack[isp] == 1;
						continue;
					}
					if (opcode == 1303) {
						isp--;
						var259.dragdeadzone = intStack[isp];
						continue;
					}
					if (opcode == 1304) {
						isp--;
						var259.dragdeadtime = intStack[isp];
						continue;
					}
					if (opcode == 1305) {
						ssp--;
						var259.baseOpName = stringStack[ssp];
						continue;
					}
					if (opcode == 1306) {
						ssp--;
						var259.targetVerb = stringStack[ssp];
						continue;
					}
					if (opcode == 1307) {
						var259.opNames = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var269) {
			if (var3.name == null) {
				if (Client.modewhere != 0) {
					Client.addChat(field2808, 0, AUTO_EMPTY);
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
					Client.addChat(JagString.join(new JagString[]{field1675, var3.name}), 0, AUTO_EMPTY);
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
