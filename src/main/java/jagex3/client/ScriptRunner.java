package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.IfType;
import jagex3.config.ObjType;
import jagex3.jstring.StringTools;
import jagex3.util.JagString;
import jagex3.var.VarCache;

import java.util.Calendar;
import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("l.j")
	public static int fp = 0;
	@ObfuscatedName("ca.e")
	public static Calendar calendar = Calendar.getInstance();
	@ObfuscatedName("hb.hb")
	public static int[] intLocals;
	@ObfuscatedName("ra.r")
	public static JagString[] stringLocals;
	@ObfuscatedName("wb.o")
	public static int[] intStack = new int[1000];
	@ObfuscatedName("te.ib")
	public static JagString[] stringStack = new JagString[1000];
	@ObfuscatedName("sa.l")
	public static ClientGosubFrame[] frames = new ClientGosubFrame[50];
	@ObfuscatedName("jc.vb")
	public static IfType activeComponent2;
	@ObfuscatedName("uc.F")
	public static IfType activeComponent;
	@ObfuscatedName("d.mc")
	public static JagString field642 = JagString.wrap("Jun");
	@ObfuscatedName("d.pc")
	public static JagString field645 = JagString.wrap("Nov");
	@ObfuscatedName("d.rc")
	public static JagString field647 = JagString.wrap("Mar");
	@ObfuscatedName("d.sc")
	public static JagString field648 = JagString.wrap("Jul");
	@ObfuscatedName("d.Qb")
	public static JagString field620 = JagString.wrap("Feb");
	@ObfuscatedName("d.Wb")
	public static JagString field626 = JagString.wrap("Aug");
	@ObfuscatedName("d.Ub")
	public static JagString field624 = JagString.wrap("Dec");
	@ObfuscatedName("d.zc")
	public static JagString field655 = JagString.wrap("May");
	@ObfuscatedName("d.Sb")
	public static JagString field622 = JagString.wrap("Oct");
	@ObfuscatedName("d.Nc")
	public static JagString field669 = JagString.wrap("Jan");
	@ObfuscatedName("d.Tb")
	public static JagString field623 = JagString.wrap("Sep");
	@ObfuscatedName("d.Qc")
	public static JagString field672 = JagString.wrap("Apr");
	@ObfuscatedName("d.Rb")
	public static JagString[] months = new JagString[]{field669, field620, field647, field672, field655, field642, field648, field626, field623, field622, field645, field624};
	@ObfuscatedName("kc.h")
	public static JagString field1572 = JagString.wrap(")2");
	@ObfuscatedName("r.A")
	public static JagString field2585 = JagString.wrap("");

	@ObfuscatedName("ob.a([Ljava/lang/Object;IILqd;IZ)V")
	public static void executeScript(Object[] arg0, int arg1, IfType arg2, int arg3) {
		int isp = 0;
		ClientScript var5 = ClientScript.get((Integer) arg0[0], 76);
		int[] var6 = var5.intOperands;
		int[] var7 = var5.instructions;
		int ssp = 0;
		int var9 = -1;
		try {
			intLocals = new int[var5.intLocalCount];
			stringLocals = new JagString[var5.stringLocalCount];
			int var10 = 0;
			int var11 = 0;
			for (int var12 = 1; var12 < arg0.length; var12++) {
				if (arg0[var12] instanceof Integer) {
					int var13 = (Integer) arg0[var12];
					if (var13 == -2147483647) {
						var13 = arg3;
					}
					if (var13 == -2147483646) {
						var13 = arg1;
					}
					if (var13 == -2147483645) {
						var13 = arg2.parentId;
					}
					if (var13 == -2147483644) {
						var13 = 0;
					}
					intLocals[var10++] = var13;
				} else if (arg0[var12] instanceof JagString) {
					stringLocals[var11++] = (JagString) arg0[var12];
				}
			}
			while (true) {
				int opcode;
				while (true) {
					var9++;
					opcode = var7[var9];
					if (opcode >= 100) {
						break;
					}
					if (opcode == 0) {
						// push_constant_int
						intStack[isp++] = var6[var9];
					} else if (opcode == 1) {
						// push_varp
						int var15 = var6[var9];
						intStack[isp++] = VarCache.var[var15];
					} else if (opcode == 2) {
						// pop_varp
						int var16 = var6[var9];
						isp--;
						VarCache.var[var16] = intStack[isp];
					} else if (opcode == 3) {
						// push_constant_string
						stringStack[ssp++] = var5.stringOperands[var9];
					} else if (opcode == 6) {
						// branch
						var9 += var6[var9];
					} else if (opcode == 7) {
						// branch_not
						isp -= 2;
						if (intStack[isp + 1] != intStack[isp]) {
							var9 += var6[var9];
						}
					} else if (opcode == 8) {
						// branch_equals
						isp -= 2;
						if (intStack[isp + 1] == intStack[isp]) {
							var9 += var6[var9];
						}
					} else if (opcode == 9) {
						// branch_less_than
						isp -= 2;
						if (intStack[isp + 1] > intStack[isp]) {
							var9 += var6[var9];
						}
					} else if (opcode == 10) {
						// branch_greater_than
						isp -= 2;
						if (intStack[isp + 1] < intStack[isp]) {
							var9 += var6[var9];
						}
					} else if (opcode == 21) {
						// return
						if (fp == 0) {
							return;
						}
						ClientGosubFrame var17 = frames[--fp];
						stringLocals = var17.stringLocals;
						intLocals = var17.intLocals;
						var9 = var17.pc;
						var5 = var17.script;
						var6 = var5.intOperands;
						var7 = var5.instructions;
					} else if (opcode == 25) {
						// push_varbit
						int var18 = var6[var9];
						intStack[isp++] = VarCache.getVarbit(var18);
					} else if (opcode == 27) {
						// pop_varbit
						int var19 = var6[var9];
						isp--;
						VarCache.setVarbit(intStack[isp], var19);
					} else if (opcode == 31) {
						// branch_less_than_or_equals
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							var9 += var6[var9];
						}
					} else if (opcode == 32) {
						// branch_greater_than_or_equals
						isp -= 2;
						if (intStack[isp + 1] <= intStack[isp]) {
							var9 += var6[var9];
						}
					} else if (opcode == 33) {
						// push_int_local
						intStack[isp++] = intLocals[var6[var9]];
					} else {
						int var10001;
						if (opcode == 34) {
							// pop_int_local
							var10001 = var6[var9];
							isp--;
							intLocals[var10001] = intStack[isp];
						} else if (opcode == 35) {
							// push_string_local
							stringStack[ssp++] = stringLocals[var6[var9]];
						} else if (opcode == 36) {
							// pop_string_local
							var10001 = var6[var9];
							ssp--;
							stringLocals[var10001] = stringStack[ssp];
						} else if (opcode == 37) {
							// join_string
							int var20 = var6[var9];
							ssp -= var20;
							JagString var21 = StringTools.join(var20, ssp, stringStack);
							stringStack[ssp++] = var21;
						} else if (opcode == 38) {
							// pop_int_discard
							isp--;
						} else if (opcode == 39) {
							// pop_string_discard
							ssp--;
						} else if (opcode == 40) {
							// gosub_with_params
							int var22 = var6[var9];
							ClientScript var23 = ClientScript.get(var22, 73);
							int[] var24 = new int[var23.intLocalCount];
							JagString[] var25 = new JagString[var23.stringLocalCount];
							for (int var26 = 0; var26 < var23.intArgCount; var26++) {
								var24[var26] = intStack[isp + var26 - var23.intArgCount];
							}
							for (int var27 = 0; var27 < var23.stringArgCount; var27++) {
								var25[var27] = stringStack[ssp + var27 - var23.stringArgCount];
							}
							ssp -= var23.stringArgCount;
							isp -= var23.intArgCount;
							ClientGosubFrame var28 = new ClientGosubFrame();
							var28.stringLocals = stringLocals;
							var28.script = var5;
							var28.intLocals = intLocals;
							var5 = var23;
							var28.pc = var9;
							frames[fp++] = var28;
							var6 = var23.intOperands;
							stringLocals = var25;
							var9 = -1;
							intLocals = var24;
							var7 = var23.instructions;
						} else if (opcode == 42) {
							// push_varc_int
							intStack[isp++] = VarCache.varcInt[var6[var9]];
						} else {
							if (opcode != 43) {
								break;
							}
							// pop_varc_int
							var10001 = var6[var9];
							isp--;
							VarCache.varcInt[var10001] = intStack[isp];
						}
					}
				}
				boolean secondary;
				if (var6[var9] == 1) {
					secondary = true;
				} else {
					secondary = false;
				}
				if (opcode < 1000) {
					if (opcode == 100) {
						// cc_create
						isp -= 3;
						int var30 = intStack[isp];
						int var31 = intStack[isp + 1];
						int var32 = intStack[isp + 2];
						IfType var33 = IfType.get(var30);
						if (var33.subcomponents == null) {
							var33.subcomponents = new IfType[var32 + 1];
						}
						if (var32 >= var33.subcomponents.length) {
							IfType[] var34 = new IfType[var32 + 1];
							for (int var35 = 0; var35 < var33.subcomponents.length; var35++) {
								var34[var35] = var33.subcomponents[var35];
							}
							var33.subcomponents = var34;
						}
						IfType var36 = new IfType();
						var36.layerId = var33.parentId;
						var36.type = var31;
						var36.parentId = ((var33.parentId & 0xFFFF) << 15) + var32 + Integer.MIN_VALUE;
						var33.subcomponents[var32] = var36;
						if (secondary) {
							activeComponent2 = var36;
						} else {
							activeComponent = var36;
						}
					} else if (opcode == 101) {
						// cc_delete
						IfType var37 = secondary ? activeComponent2 : activeComponent;
						IfType var38 = IfType.get(var37.layerId);
						var38.subcomponents[var37.parentId & 0x7FFF] = null;
					} else {
						if (opcode != 102) {
							break;
						}
						// cc_deleteall
						isp--;
						IfType var39 = IfType.get(intStack[isp]);
						var39.subcomponents = null;
					}
				} else if (opcode >= 1000 && opcode < 1100 || !(opcode < 2000 || opcode >= 2100)) {
					IfType var40;
					if (opcode >= 2000) {
						isp--;
						var40 = IfType.get(intStack[isp]);
						opcode -= 1000;
					} else {
						var40 = secondary ? activeComponent2 : activeComponent;
					}
					if (opcode == 1000) {
						// if/cc_setposition
						isp -= 2;
						var40.x = intStack[isp];
						var40.y = intStack[isp + 1];
					} else if (opcode == 1001) {
						// if/cc_setsize
						isp -= 2;
						var40.width = intStack[isp];
						var40.height = intStack[isp + 1];
					} else if (opcode == 1003) {
						// if/cc_sethide
						isp--;
						var40.hide = intStack[isp] == 1;
					} else {
						if (opcode != 1004) {
							break;
						}
						isp--;
						var40.hashook = intStack[isp] == 1;
					}
				} else if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
					IfType var41;
					if (opcode < 2000) {
						var41 = secondary ? activeComponent2 : activeComponent;
					} else {
						isp--;
						var41 = IfType.get(intStack[isp]);
						opcode -= 1000;
					}
					if (opcode == 1100) {
						// if/cc_setscrollpos
						isp -= 2;
						var41.scrollPosX = intStack[isp];
						var41.scrollPosY = intStack[isp + 1];
					} else if (opcode == 1101) {
						// if/cc_setcolour
						isp--;
						int var42 = intStack[isp];
						int var43 = var42 >> 10 & 0x1F;
						int var44 = var42 & 0x1F;
						int var45 = var42 >> 5 & 0x1F;
						var41.colour = (var43 << 19) + (var45 << 11) + (var44 << 3);
					} else if (opcode == 1102) {
						// if/cc_setfill
						isp--;
						var41.fill = intStack[isp] == 1;
					} else if (opcode == 1103) {
						// if/cc_settrans
						isp--;
						var41.trans = intStack[isp];
					} else if (opcode == 1104) {
						// if/cc_setlinewid
						isp--;
					} else if (opcode == 1105) {
						// if/cc_setgraphic
						isp--;
						var41.graphic = intStack[isp];
					} else if (opcode == 1106) {
						// if/cc_set2dangle
						isp--;
						var41.rotate = intStack[isp];
					} else if (opcode == 1107) {
						// if/cc_settiling
						isp--;
						var41.tiling = intStack[isp] == 1;
					} else if (opcode == 1108) {
						// if/cc_setmodel
						var41.model1Type = 1;
						isp--;
						var41.model1Id = intStack[isp];
					} else if (opcode == 1109) {
						// if/cc_setmodelangle
						isp -= 6;
						var41.modelXOf = intStack[isp];
						var41.modelYOf = intStack[isp + 1];
						var41.modelXAn = intStack[isp + 2];
						var41.modelYAn = intStack[isp + 3];
						var41.modelZAn = intStack[isp + 4];
						var41.modelZoom = intStack[isp + 5];
					} else if (opcode == 1110) {
						// if/cc_setmodelanim
						isp--;
						var41.modelAnim = intStack[isp];
					} else if (opcode == 1111) {
						// if/cc_setmodelorthog
						isp--;
						var41.orthog = intStack[isp] == 1;
					} else if (opcode == 1112) {
						// if/cc_settext
						ssp--;
						var41.text = stringStack[ssp];
					} else if (opcode == 1113) {
						// if/cc_settextfont
						isp--;
						var41.font = intStack[isp];
					} else if (opcode == 1114) {
						// if/cc_settextalign
						isp -= 3;
						var41.hAlign = intStack[isp];
						var41.vAlign = intStack[isp + 1];
						var41.lineHeight = intStack[isp + 2];
					} else {
						if (opcode != 1115) {
							break;
						}
						// if/cc_settextshadow
						isp--;
						var41.shadow = intStack[isp] == 1;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					IfType var128;
					if (opcode < 2000) {
						var128 = secondary ? activeComponent2 : activeComponent;
					} else {
						isp--;
						var128 = IfType.get(intStack[isp]);
						opcode -= 1000;
					}
					if (opcode == 1200) {
						// if/cc_setobject
						isp -= 3;
						int var129 = intStack[isp];
						int var130 = intStack[isp + 2];
						if (var129 == -1) {
							var128.model1Type = 0;
						} else {
							ObjType var131 = ObjType.list(var129);
							var128.model1Type = 4;
							var128.modelXAn = var131.xan2d;
							var128.modelZAn = var131.zan2d;
							var128.modelZoom = var131.zoom2d * 100 / var130;
							var128.modelYAn = var131.yan2d;
							var128.modelYOf = var131.yof2d;
							var128.modelXOf = var131.xof2d;
							var128.model1Id = var129;
						}
					} else if (opcode == 1201) {
						// if/cc_setnpchead
						var128.model1Type = 2;
						isp--;
						var128.model1Id = intStack[isp];
					} else if (opcode == 1202) {
						// if/cc_setplayerhead_self
						var128.model1Type = 3;
						var128.model1Id = Client.localPlayer.model.method634();
					} else {
						if (opcode != 1203) {
							break;
						}
						IfType var132 = secondary ? activeComponent : activeComponent2;
						var128.field2544 = var132.parentId;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					IfType var121;
					if (opcode >= 2000) {
						isp--;
						var121 = IfType.get(intStack[isp]);
						opcode -= 1000;
					} else {
						var121 = secondary ? activeComponent2 : activeComponent;
					}
					if (opcode >= 1300 && opcode <= 1309 || !(opcode < 1314 || opcode > 1317)) {
						ssp--;
						JagString var122 = stringStack[ssp];
						Object[] var123 = new Object[var122.length() + 1];
						for (int var124 = var123.length - 1; var124 >= 1; var124--) {
							if (var122.charAt(var124 - 1) == 115) {
								ssp--;
								var123[var124] = stringStack[ssp];
							} else {
								isp--;
								var123[var124] = Integer.valueOf(intStack[isp]);
							}
						}
						isp--;
						var123[0] = Integer.valueOf(intStack[isp]);
						if (opcode == 1303) {
							var121.field2513 = var123;
						}
						if (opcode == 1317) {
							var121.field2486 = var123;
						}
						if (opcode == 1304) {
							var121.field2464 = var123;
						}
						if (opcode == 1302) {
							var121.field2450 = var123;
						}
						if (opcode == 1316) {
							var121.field2553 = var123;
						}
						if (opcode == 1301) {
							var121.field2487 = var123;
						}
						if (opcode == 1300) {
							var121.field2483 = var123;
						}
						if (opcode == 1315) {
							var121.field2501 = var123;
						}
						if (opcode == 1306) {
							var121.field2475 = var123;
						}
						if (opcode == 1305) {
							var121.field2478 = var123;
						}
						if (opcode == 1309) {
							var121.field2518 = var123;
						}
						if (opcode == 1308) {
							var121.field2456 = var123;
						}
					} else if (opcode == 1310) {
						isp--;
						int var125 = intStack[isp] - 1;
						if (var125 >= 0 && var125 <= 9) {
							if (var121.opNames == null || var121.opNames.length <= var125) {
								JagString[] var126 = new JagString[var125 + 1];
								if (var121.opNames != null) {
									for (int var127 = 0; var127 < var121.opNames.length; var127++) {
										var126[var127] = var121.opNames[var127];
									}
								}
								var121.opNames = var126;
							}
							ssp--;
							var121.opNames[var125] = stringStack[ssp];
						} else {
							ssp--;
						}
					} else if (opcode == 1311) {
						isp--;
						var121.field2544 = intStack[isp];
					} else if (opcode == 1312) {
						isp--;
						var121.field2500 = intStack[isp] == 1;
					} else {
						if (opcode != 1313) {
							break;
						}
						isp--;
					}
				} else if (opcode < 1500) {
					if (opcode == 1400) {
						isp -= 2;
						int var46 = intStack[isp + 1];
						int var47 = intStack[isp];
						IfType var48 = IfType.get(var47);
						if (var48.subcomponents == null || var48.subcomponents.length <= var46 || var48.subcomponents[var46] == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (secondary) {
								activeComponent2 = var48.subcomponents[var46];
							} else {
								activeComponent = var48.subcomponents[var46];
							}
						}
					} else if (opcode == 1401) {
						isp -= 3;
						int var49 = intStack[isp];
						int var50 = intStack[isp + 2];
						int var51 = intStack[isp + 1];
						IfType var52 = Client.getTopComponent(IfType.list[var49], var50, true, 0, -1, 0, var51);
						if (var52 == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (secondary) {
								activeComponent2 = var52;
							} else {
								activeComponent = var52;
							}
						}
					} else {
						if (opcode != 1402) {
							break;
						}
						isp -= 3;
						IfType var53 = IfType.get(intStack[isp]);
						int var54 = intStack[isp + 2];
						int var55 = intStack[isp + 1];
						IfType var56 = Client.getTopComponent(var53.subcomponents, var54, true, var53.scrollPosY, var53.parentId, var53.scrollPosX, var55);
						if (var56 == null) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
							if (secondary) {
								activeComponent2 = var56;
							} else {
								activeComponent = var56;
							}
						}
					}
				} else if (opcode < 1600) {
					IfType var57 = secondary ? activeComponent2 : activeComponent;
					if (opcode == 1500) {
						// cc_getx
						intStack[isp++] = var57.x;
					} else if (opcode == 1501) {
						// cc_gety
						intStack[isp++] = var57.y;
					} else if (opcode == 1502) {
						// cc_getwidth
						intStack[isp++] = var57.width;
					} else if (opcode == 1503) {
						// cc_getheight
						intStack[isp++] = var57.height;
					} else if (opcode == 1504) {
						// cc_gethide
						intStack[isp++] = var57.hide ? 1 : 0;
					} else {
						if (opcode != 1505) {
							break;
						}
						// cc_getlayer
						intStack[isp++] = var57.layerId;
					}
				} else if (opcode < 1700) {
					IfType var120 = secondary ? activeComponent2 : activeComponent;
					if (opcode == 1600) {
						// cc_getscrollx
						intStack[isp++] = var120.scrollPosX;
					} else {
						if (opcode != 1601) {
							break;
						}
						// cc_getscrolly
						intStack[isp++] = var120.scrollPosY;
					}
				} else if (opcode < 2500) {
					if (opcode == 2401) {
						isp -= 3;
						int var58 = intStack[isp + 1];
						int var59 = intStack[isp];
						int var60 = intStack[isp + 2];
						IfType var61 = Client.getTopComponent(IfType.list[var59], var60, false, 0, -1, 0, var58);
						if (var61 == null) {
							intStack[isp++] = -1;
						} else {
							intStack[isp++] = var61.parentId;
						}
					} else {
						if (opcode != 2402) {
							break;
						}
						isp -= 3;
						IfType var62 = IfType.get(intStack[isp]);
						int var63 = intStack[isp + 1];
						int var64 = intStack[isp + 2];
						IfType var65 = Client.getTopComponent(IfType.list[var62.parentId >> 16], var64, false, var62.scrollPosY, var62.parentId & 0xFFFF, var62.scrollPosX, var63);
						if (var65 == null) {
							intStack[isp++] = -1;
						} else {
							intStack[isp++] = var65.parentId;
						}
					}
				} else if (opcode < 2600) {
					isp--;
					IfType var119 = IfType.get(intStack[isp]);
					if (opcode == 2500) {
						// if_getx
						intStack[isp++] = var119.x;
					} else if (opcode == 2501) {
						// if_gety
						intStack[isp++] = var119.y;
					} else if (opcode == 2502) {
						// if_getwidth
						intStack[isp++] = var119.width;
					} else if (opcode == 2503) {
						// if_getheight
						intStack[isp++] = var119.height;
					} else if (opcode == 2504) {
						// if_gethide
						intStack[isp++] = var119.hide ? 1 : 0;
					} else {
						if (opcode != 2505) {
							break;
						}
						// if_getlayer
						intStack[isp++] = var119.layerId;
					}
				} else if (opcode < 2700) {
					isp--;
					IfType var66 = IfType.get(intStack[isp]);
					if (opcode == 2600) {
						// if_getscrollx
						intStack[isp++] = var66.scrollPosX;
					} else {
						if (opcode != 2601) {
							break;
						}
						// if_getscrolly
						intStack[isp++] = var66.scrollPosY;
					}
				} else {
					if (opcode < 2800) {
						break;
					}
					if (opcode < 3100) {
						if (opcode == 3000) {
							isp--;
							int var67 = intStack[isp];
							if (Client.resumePauseComId == -1) {
								Client.resumePauseButton(0, var67);
								Client.resumePauseComId = var67;
							}
						} else if (opcode == 3001 || opcode == 3003) {
							isp -= 2;
							int var68 = intStack[isp];
							int var69 = intStack[isp + 1];
							Client.ifButtonX(0, var69, var68);
						} else if (opcode == 3002) {
							IfType var70 = secondary ? activeComponent2 : activeComponent;
							if (Client.resumePauseComId == -1) {
								Client.resumePauseButton(var70.parentId & 0x7FFF, var70.layerId);
								Client.resumePauseComId = var70.parentId;
							}
						} else {
							if (opcode != 3003) {
								break;
							}
							IfType var71 = secondary ? activeComponent2 : activeComponent;
							isp--;
							int var72 = intStack[isp];
							Client.ifButtonX(var71.parentId & 0x7FFF, var72, var71.layerId);
						}
					} else if (opcode >= 3200) {
						if (opcode < 3300) {
							if (opcode == 3200) {
								// sound_synth
								isp -= 3;
								Client.playSynth(intStack[isp], intStack[isp + 1], intStack[isp + 2]);
							} else if (opcode == 3201) {
								// sound_song
								isp--;
								Client.playSongs(intStack[isp]);
							} else {
								if (opcode != 3202) {
									break;
								}
								// sound_jingle
								isp -= 2;
								Client.playJingle(intStack[isp + 1], intStack[isp]);
							}
						} else if (opcode < 3400) {
							if (opcode != 3300) {
								break;
							}
							intStack[isp++] = Client.loopCycle;
						} else if (opcode >= 4100) {
							if (opcode >= 4200) {
								break;
							}
							if (opcode == 4100) {
								// append_num
								ssp--;
								JagString var102 = stringStack[ssp];
								isp--;
								int var103 = intStack[isp];
								stringStack[ssp++] = JagString.join(new JagString[]{var102, JagString.parseInt(var103)});
							} else if (opcode == 4101) {
								// append
								ssp -= 2;
								JagString var104 = stringStack[ssp + 1];
								JagString var105 = stringStack[ssp];
								stringStack[ssp++] = JagString.join(new JagString[]{var105, var104});
							} else if (opcode == 4102) {
								// append_signnum
								ssp--;
								JagString var106 = stringStack[ssp];
								isp--;
								int var107 = intStack[isp];
								stringStack[ssp++] = JagString.join(new JagString[]{var106, JagString.fromInt(var107)});
							} else if (opcode == 4103) {
								// lowercase
								ssp--;
								JagString var108 = stringStack[ssp];
								stringStack[ssp++] = var108.toLowerCase();
							} else if (opcode == 4104) {
								// fromdate
								isp--;
								int var109 = intStack[isp];
								long var110 = ((long) var109 + 11745L) * 86400000L;
								calendar.setTime(new Date(var110));
								int var112 = calendar.get(5);
								int var113 = calendar.get(2);
								int var114 = calendar.get(1);
								stringStack[ssp++] = JagString.join(new JagString[]{JagString.parseInt(var112), field1572, months[var113], field1572, JagString.parseInt(var114)});
							} else if (opcode == 4105) {
								// text_gender
								ssp -= 2;
								JagString var115 = stringStack[ssp];
								JagString var116 = stringStack[ssp + 1];
								if (Client.localPlayer.model != null && Client.localPlayer.model.gender) {
									stringStack[ssp++] = var116;
								} else {
									stringStack[ssp++] = var115;
								}
							} else if (opcode == 4106) {
								// tostring
								isp--;
								int var117 = intStack[isp];
								stringStack[ssp++] = JagString.parseInt(var117);
							} else {
								if (opcode != 4107) {
									break;
								}
								// compare
								ssp -= 2;
								intStack[isp++] = stringStack[ssp].compare(stringStack[ssp + 1]);
							}
						} else if (opcode == 4000) {
							// add
							isp -= 2;
							int var73 = intStack[isp];
							int var74 = intStack[isp + 1];
							intStack[isp++] = var73 + var74;
						} else if (opcode == 4001) {
							// sub
							isp -= 2;
							int var75 = intStack[isp + 1];
							int var76 = intStack[isp];
							intStack[isp++] = var76 - var75;
						} else if (opcode == 4002) {
							// multiply
							isp -= 2;
							int var77 = intStack[isp + 1];
							int var78 = intStack[isp];
							intStack[isp++] = var77 * var78;
						} else if (opcode == 4003) {
							// divide
							isp -= 2;
							int var79 = intStack[isp];
							int var80 = intStack[isp + 1];
							intStack[isp++] = var79 / var80;
						} else if (opcode == 4004) {
							// random
							isp--;
							int var81 = intStack[isp];
							intStack[isp++] = (int) (Math.random() * (double) var81);
						} else if (opcode == 4005) {
							// randominc
							isp--;
							int var82 = intStack[isp];
							intStack[isp++] = (int) ((double) (var82 + 1) * Math.random());
						} else if (opcode == 4006) {
							// interpolate
							isp -= 5;
							int var83 = intStack[isp + 1];
							int var84 = intStack[isp];
							int var85 = intStack[isp + 3];
							int var86 = intStack[isp + 4];
							int var87 = intStack[isp + 2];
							intStack[isp++] = var84 + (var83 - var84) * (-var87 + var86) / (var85 - var87);
						} else if (opcode == 4007) {
							// addpercent
							isp -= 2;
							int var88 = intStack[isp];
							int var89 = intStack[isp + 1];
							intStack[isp++] = var88 * var89 / 100 + var88;
						} else if (opcode == 4008) {
							// setbit
							isp -= 2;
							int var90 = intStack[isp];
							int var91 = intStack[isp + 1];
							intStack[isp++] = 0x1 << var91 | var90;
						} else if (opcode == 4009) {
							// clearbit
							isp -= 2;
							int var92 = intStack[isp];
							int var93 = intStack[isp + 1];
							intStack[isp++] = var92 & -(0x1 << var93) - 1;
						} else if (opcode == 4010) {
							// testbit
							isp -= 2;
							int var94 = intStack[isp];
							int var95 = intStack[isp + 1];
							intStack[isp++] = (0x1 << var95 & var94) == 0 ? 0 : 1;
						} else if (opcode == 4011) {
							// modulo
							isp -= 2;
							int var96 = intStack[isp + 1];
							int var97 = intStack[isp];
							intStack[isp++] = var97 % var96;
						} else if (opcode == 4012) {
							// pow
							isp -= 2;
							int var98 = intStack[isp];
							int var99 = intStack[isp + 1];
							if (var98 == 0) {
								intStack[isp++] = 0;
							} else {
								intStack[isp++] = (int) Math.pow((double) var98, (double) var99);
							}
						} else {
							if (opcode != 4013) {
								break;
							}
							// invpow
							isp -= 2;
							int var100 = intStack[isp];
							int var101 = intStack[isp + 1];
							if (var100 == 0) {
								intStack[isp++] = 0;
							} else if (var101 == 0) {
								intStack[isp++] = Integer.MAX_VALUE;
							} else {
								intStack[isp++] = (int) Math.pow((double) var100, 1.0D / (double) var101);
							}
						}
					} else if (opcode == 3100) {
						// mes
						ssp--;
						JagString var118 = stringStack[ssp];
						Client.addChat(0, var118, field2585);
					} else {
						if (opcode != 3101) {
							break;
						}
						// anim
						isp -= 2;
						Client.triggerPlayerAnim(intStack[isp], intStack[isp + 1], Client.localPlayer);
					}
				}
			}
		} catch (Exception var133) {
		}
	}

}
