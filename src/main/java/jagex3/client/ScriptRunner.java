package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.IntNode;
import jagex3.graphics.PixfontGeneric;
import jagex3.graphics.SoftwarePixFont;
import jagex3.io.Packet;
import jagex3.jstring.JagString;
import jagex3.var.VarCache;
import jagex3.wordfilter2.WordPack;
import jagex3.worldmap.WorldMap;

import java.util.Calendar;
import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("jj.l")
	public static final int[] intStack = new int[1000];
	@ObfuscatedName("ph.ab")
	public static final JagString[] stringStack = new JagString[1000];
	@ObfuscatedName("hc.Y")
	public static final ClientGosubFrame[] frames = new ClientGosubFrame[50];
	@ObfuscatedName("ih.d")
	public static final int[] arrayLengths = new int[5];
	@ObfuscatedName("bd.l")
	public static final int[][] arrays = new int[5][5000];
	@ObfuscatedName("af.Y")
	public static final JagString[] varcStr = new JagString[1000];
	@ObfuscatedName("qe.i")
	public static final JagString field3563 = JagString.wrap("Clientscript error )2 check log for details");
	@ObfuscatedName("hd.B")
	public static final JagString field1468 = JagString.wrap("");
	@ObfuscatedName("od.z")
	public static final JagString field3010 = JagString.wrap("(U0a )2 in: ");
	@ObfuscatedName("bj.Cb")
	public static final JagString field356 = JagString.wrap("(U0a )2 via: ");
	@ObfuscatedName("mc.e")
	public static final JagString field2496 = JagString.wrap("(U0a )2 non)2existant gosub script)2num: ");
	@ObfuscatedName("bf.x")
	public static final JagString field288 = JagString.wrap("Clientscript error in: ");
	@ObfuscatedName("eh.d")
	public static final JagString field970 = JagString.wrap("Apr");
	@ObfuscatedName("eh.k")
	public static final JagString field977 = JagString.wrap("Jun");
	@ObfuscatedName("eh.l")
	public static final JagString field978 = JagString.wrap("Aug");
	@ObfuscatedName("eh.n")
	public static final JagString field980 = JagString.wrap("Sep");
	@ObfuscatedName("eh.o")
	public static final JagString field981 = JagString.wrap("Mar");
	@ObfuscatedName("eh.s")
	public static final JagString field985 = JagString.wrap("Dec");
	@ObfuscatedName("eh.u")
	public static final JagString field987 = JagString.wrap("May");
	@ObfuscatedName("eh.v")
	public static final JagString field988 = JagString.wrap("Jan");
	@ObfuscatedName("eh.w")
	public static final JagString field989 = JagString.wrap("Oct");
	@ObfuscatedName("eh.y")
	public static final JagString field991 = JagString.wrap("Nov");
	@ObfuscatedName("eh.C")
	public static final JagString field995 = JagString.wrap("Feb");
	@ObfuscatedName("eh.D")
	public static final JagString field996 = JagString.wrap("Jul");
	@ObfuscatedName("eh.z")
	public static final JagString[] months = new JagString[] { field988, field995, field981, field970, field987, field977, field996, field978, field980, field989, field991, field985 };
	@ObfuscatedName("kj.t")
	public static final JagString field2171 = JagString.wrap(")2");
	@ObfuscatedName("bb.a")
	public static final JagString field207 = JagString.wrap("null");
	@ObfuscatedName("pa.g")
	public static final JagString field3141 = JagString.wrap("<img=1>");
	@ObfuscatedName("qc.z")
	public static final JagString field3554 = JagString.wrap("<img=0>");
	@ObfuscatedName("ri.R")
	public static final JagString field3707 = JagString.wrap("event_opbase");
	@ObfuscatedName("dc.h")
	public static final JagString field669 = Text.field668;
	@ObfuscatedName("gh.z")
	public static final JagString field1355 = Text.field1356;
	@ObfuscatedName("ge.u")
	public static final JagString field1308 = Text.field1320;
	@ObfuscatedName("sd.f")
	public static final JagString field3817 = Text.field3828;
	@ObfuscatedName("mg.Db")
	public static final JagString field2564 = Text.field2562;
	@ObfuscatedName("rg.v")
	public static final JagString field3690 = Text.field3699;
	@ObfuscatedName("rg.I")
	public static final JagString field3703 = Text.field3689;
	@ObfuscatedName("wb.g")
	public static final JagString field4467 = Text.field4462;
	@ObfuscatedName("oh.h")
	public static final JagString field3084 = Text.field3094;
	@ObfuscatedName("ti.z")
	public static final JagString field4050 = Text.field4053;
	@ObfuscatedName("cf.l")
	public static final JagString field488 = Text.field491;
	@ObfuscatedName("jc.M")
	public static final JagString field1837 = Text.field1839;
	@ObfuscatedName("vc.ib")
	public static final JagString field4363 = Text.field4361;
	@ObfuscatedName("de.N")
	public static final JagString field696 = Text.field688;
	@ObfuscatedName("fa.Y")
	public static final JagString field1083 = Text.field1078;
	@ObfuscatedName("da.hb")
	public static final JagString field612 = Text.field611;
	@ObfuscatedName("be.n")
	public static final JagString field263 = Text.field272;
	@ObfuscatedName("bj.zb")
	public static final Calendar calendar = Calendar.getInstance();
	@ObfuscatedName("va.C")
	public static int fp = 0;
	@ObfuscatedName("oa.F")
	public static JagString[] stringLocals;
	@ObfuscatedName("wc.J")
	public static int[] intLocals;
	@ObfuscatedName("bc.e")
	public static QuickChatPhrase field226;
	@ObfuscatedName("sg.x")
	public static IfType activeComponent2;
	@ObfuscatedName("li.R")
	public static IfType activeComponent;
	@ObfuscatedName("gd.F")
	public static JagString field1286 = Text.field1292;

	@ObfuscatedName("md.a(BLde;I)V")
	public static void executeScript(HookReq arg0, int arg1) {
		Object[] var2 = arg0.onop;
		int var3 = (Integer) var2[0];
		ClientScript var4 = ClientScript.get(var3);
		if (var4 == null) {
			return;
		}
		int var5 = 0;
		int var6 = 0;
		fp = 0;
		int var7 = -1;
		int[] var8 = var4.intOperands;
		byte var9 = -1;
		int[] var10 = var4.instructions;
		try {
			intLocals = new int[var4.intLocalCount];
			stringLocals = new JagString[var4.stringLocalCount];
			int var11 = 0;
			int var12 = 0;
			for (int var13 = 1; var13 < var2.length; var13++) {
				if (var2[var13] instanceof Integer) {
					int var14 = (Integer) var2[var13];
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
					intLocals[var12++] = var14;
				} else if (var2[var13] instanceof JagString) {
					JagString var15 = (JagString) var2[var13];
					if (var15.method597(field3707)) {
						var15 = arg0.opbase;
					}
					stringLocals[var11++] = var15;
				}
			}
			int var16 = 0;
			label2550:
			while (true) {
				var16++;
				if (arg1 < var16) {
					throw new RuntimeException("slow");
				}
				var7++;
				int var382 = var10[var7];
				if (var382 < 100) {
					if (var382 == 0) {
						intStack[var5++] = var8[var7];
						continue;
					}
					if (var382 == 1) {
						int var17 = var8[var7];
						intStack[var5++] = VarCache.var[var17];
						continue;
					}
					if (var382 == 2) {
						int var18 = var8[var7];
						var5--;
						VarCache.var[var18] = intStack[var5];
						continue;
					}
					if (var382 == 3) {
						stringStack[var6++] = var4.stringOperands[var7];
						continue;
					}
					if (var382 == 6) {
						var7 += var8[var7];
						continue;
					}
					if (var382 == 7) {
						var5 -= 2;
						if (intStack[var5] != intStack[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 8) {
						var5 -= 2;
						if (intStack[var5 + 1] == intStack[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 9) {
						var5 -= 2;
						if (intStack[var5 + 1] > intStack[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 10) {
						var5 -= 2;
						if (intStack[var5] > intStack[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 21) {
						if (fp == 0) {
							return;
						}
						ClientGosubFrame var19 = frames[--fp];
						stringLocals = var19.stringLocals;
						intLocals = var19.intLocals;
						var4 = var19.script;
						var7 = var19.pc;
						var8 = var4.intOperands;
						var10 = var4.instructions;
						continue;
					}
					if (var382 == 25) {
						int var20 = var8[var7];
						intStack[var5++] = VarCache.getVarbit(var20);
						continue;
					}
					if (var382 == 27) {
						int var21 = var8[var7];
						var5--;
						VarCache.setVarbit(var21, intStack[var5]);
						continue;
					}
					if (var382 == 31) {
						var5 -= 2;
						if (intStack[var5 + 1] >= intStack[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 32) {
						var5 -= 2;
						if (intStack[var5] >= intStack[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 33) {
						intStack[var5++] = intLocals[var8[var7]];
						continue;
					}
					int var10001;
					if (var382 == 34) {
						var10001 = var8[var7];
						var5--;
						intLocals[var10001] = intStack[var5];
						continue;
					}
					if (var382 == 35) {
						stringStack[var6++] = stringLocals[var8[var7]];
						continue;
					}
					if (var382 == 36) {
						var10001 = var8[var7];
						var6--;
						stringLocals[var10001] = stringStack[var6];
						continue;
					}
					if (var382 == 37) {
						int var22 = var8[var7];
						var6 -= var22;
						JagString var23 = JagString.method1133(var22, stringStack, var6);
						stringStack[var6++] = var23;
						continue;
					}
					if (var382 == 38) {
						var5--;
						continue;
					}
					if (var382 == 39) {
						var6--;
						continue;
					}
					if (var382 == 40) {
						int var24 = var8[var7];
						ClientScript var25 = ClientScript.get(var24);
						JagString[] var26 = new JagString[var25.stringLocalCount];
						int[] var27 = new int[var25.intLocalCount];
						for (int var28 = 0; var28 < var25.intArgCount; var28++) {
							var27[var28] = intStack[var28 + var5 - var25.intArgCount];
						}
						for (int var29 = 0; var29 < var25.stringArgCount; var29++) {
							var26[var29] = stringStack[var29 + var6 - var25.stringArgCount];
						}
						var5 -= var25.intArgCount;
						var6 -= var25.stringArgCount;
						ClientGosubFrame var30 = new ClientGosubFrame();
						var30.script = var4;
						var30.stringLocals = stringLocals;
						var30.pc = var7;
						var30.intLocals = intLocals;
						if (fp >= frames.length) {
							throw new RuntimeException();
						}
						var4 = var25;
						var7 = -1;
						frames[fp++] = var30;
						var10 = var25.instructions;
						intLocals = var27;
						var8 = var25.intOperands;
						stringLocals = var26;
						continue;
					}
					if (var382 == 42) {
						intStack[var5++] = VarCache.varcInt[var8[var7]];
						continue;
					}
					if (var382 == 43) {
						var10001 = var8[var7];
						var5--;
						VarCache.varcInt[var10001] = intStack[var5];
						continue;
					}
					if (var382 == 44) {
						int var31 = var8[var7] >> 16;
						var5--;
						int var32 = intStack[var5];
						int var33 = var8[var7] & 0xFFFF;
						if (var32 >= 0 && var32 <= 5000) {
							arrayLengths[var31] = var32;
							byte var34 = -1;
							if (var33 == 105) {
								var34 = 0;
							}
							int var35 = 0;
							while (true) {
								if (var35 >= var32) {
									continue label2550;
								}
								arrays[var31][var35] = var34;
								var35++;
							}
						}
						throw new RuntimeException();
					}
					if (var382 == 45) {
						int var36 = var8[var7];
						var5--;
						int var37 = intStack[var5];
						if (var37 >= 0 && arrayLengths[var36] > var37) {
							intStack[var5++] = arrays[var36][var37];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 46) {
						var5 -= 2;
						int var38 = intStack[var5];
						int var39 = var8[var7];
						if (var38 >= 0 && var38 < arrayLengths[var39]) {
							arrays[var39][var38] = intStack[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 47) {
						JagString var40 = varcStr[var8[var7]];
						if (var40 == null) {
							var40 = field207;
						}
						stringStack[var6++] = var40;
						continue;
					}
					if (var382 == 48) {
						var10001 = var8[var7];
						var6--;
						varcStr[var10001] = stringStack[var6];
						continue;
					}
					if (var382 == 51) {
						HashTable var41 = var4.switchTables[var8[var7]];
						var5--;
						IntNode var42 = (IntNode) var41.find((long) intStack[var5]);
						if (var42 != null) {
							var7 += var42.value;
						}
						continue;
					}
				}
				boolean var43;
				if (var8[var7] == 1) {
					var43 = true;
				} else {
					var43 = false;
				}
				if (var382 < 300) {
					if (var382 == 100) {
						var5 -= 3;
						int var44 = intStack[var5];
						int var45 = intStack[var5 + 1];
						int var46 = intStack[var5 + 2];
						if (var45 == 0) {
							throw new RuntimeException();
						}
						IfType var47 = IfType.get(var44);
						if (var47.subcomponents == null) {
							var47.subcomponents = new IfType[var46 + 1];
						}
						if (var46 >= var47.subcomponents.length) {
							IfType[] var48 = new IfType[var46 + 1];
							for (int var49 = 0; var49 < var47.subcomponents.length; var49++) {
								var48[var49] = var47.subcomponents[var49];
							}
							var47.subcomponents = var48;
						}
						if (var46 > 0 && var47.subcomponents[var46 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var46 - 1));
						}
						IfType var50 = new IfType();
						var50.v3 = true;
						var50.subId = var46;
						var50.type = var45;
						var50.layerId = var50.parentId = var47.parentId;
						var47.subcomponents[var46] = var50;
						if (var43) {
							activeComponent2 = var50;
						} else {
							activeComponent = var50;
						}
						Client.componentUpdated(var47);
						continue;
					}
					if (var382 == 101) {
						IfType var51 = var43 ? activeComponent2 : activeComponent;
						if (var51.subId == -1) {
							if (var43) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						IfType var52 = IfType.get(var51.parentId);
						var52.subcomponents[var51.subId] = null;
						Client.componentUpdated(var52);
						continue;
					}
					if (var382 == 102) {
						var5--;
						IfType var53 = IfType.get(intStack[var5]);
						var53.subcomponents = null;
						Client.componentUpdated(var53);
						continue;
					}
					if (var382 == 200) {
						var5 -= 2;
						int var54 = intStack[var5 + 1];
						int var55 = intStack[var5];
						IfType var56 = IfType.get(var54, var55);
						if (var56 != null && var54 != -1) {
							intStack[var5++] = 1;
							if (var43) {
								activeComponent2 = var56;
							} else {
								activeComponent = var56;
							}
							continue;
						}
						intStack[var5++] = 0;
						continue;
					}
					if (var382 == 201) {
						var5--;
						int var57 = intStack[var5];
						IfType var58 = IfType.get(var57);
						if (var58 == null) {
							intStack[var5++] = 0;
						} else {
							intStack[var5++] = 1;
							if (var43) {
								activeComponent2 = var58;
							} else {
								activeComponent = var58;
							}
						}
						continue;
					}
				} else if (var382 < 500) {
					if (var382 == 403) {
						var5 -= 2;
						int var372 = intStack[var5];
						if (var372 >= 7) {
							var372 -= 7;
						}
						int var373 = intStack[var5 + 1];
						Client.localPlayer.model.idkChangePart(var372, var373);
						continue;
					}
					if (var382 == 404) {
						var5 -= 2;
						int var374 = intStack[var5 + 1];
						int var375 = intStack[var5];
						Client.localPlayer.model.idkChangeColour(var374, var375);
						continue;
					}
					if (var382 == 410) {
						var5--;
						boolean var376 = intStack[var5] != 0;
						Client.localPlayer.model.idkChangeGender(var376);
						continue;
					}
				} else if (var382 >= 1000 && var382 < 1100 || !(var382 < 2000 || var382 >= 2100)) {
					IfType var368;
					if (var382 < 2000) {
						var368 = var43 ? activeComponent2 : activeComponent;
					} else {
						var382 -= 1000;
						var5--;
						var368 = IfType.get(intStack[var5]);
					}
					if (var382 == 1000) {
						var368.xAlignment = 0;
						var5 -= 2;
						var368.renderX = var368.x = intStack[var5];
						var368.yAlignment = 0;
						var368.renderY = var368.y = intStack[var5 + 1];
						Client.componentUpdated(var368);
						continue;
					}
					if (var382 == 1001) {
						var368.widthAlignment = 0;
						var5 -= 2;
						var368.renderWidth = var368.width = intStack[var5];
						var368.modelBaseWidth = 0;
						var368.heightAlignment = 0;
						var368.renderHeight = var368.height = intStack[var5 + 1];
						var368.modelBaseHeight = 0;
						Client.componentUpdated(var368);
						if (var368.type == 0) {
							Client.computeLayerLayout(false, var368);
						}
						Client.computeComponentLayout(var368);
						continue;
					}
					if (var382 == 1003) {
						var5--;
						boolean var369 = intStack[var5] == 1;
						if (var368.hide != var369) {
							var368.hide = var369;
							Client.componentUpdated(var368);
						}
						continue;
					}
					if (var382 == 1004) {
						var5 -= 4;
						var368.x = intStack[var5];
						var368.y = intStack[var5 + 1];
						int var370 = intStack[var5 + 2];
						int var371 = intStack[var5 + 3];
						if (var371 < 0) {
							var371 = 0;
						} else if (var371 > 2) {
							var371 = 2;
						}
						var368.yAlignment = (byte) (var371 + 3);
						if (var370 < 0) {
							var370 = 0;
						} else if (var370 > 2) {
							var370 = 2;
						}
						var368.xAlignment = (byte) (var370 + 3);
						Client.componentUpdated(var368);
						Client.computeComponentLayout(var368);
						continue;
					}
					if (var382 == 1005) {
						var368.xAlignment = 2;
						var5 -= 2;
						var368.x = intStack[var5];
						var368.yAlignment = 2;
						var368.y = intStack[var5 + 1];
						Client.componentUpdated(var368);
						if (var368.type == 0) {
							Client.computeLayerLayout(false, var368);
						}
						Client.computeComponentLayout(var368);
						continue;
					}
				} else if (var382 >= 1100 && var382 < 1200 || !(var382 < 2100 || var382 >= 2200)) {
					IfType var365;
					if (var382 >= 2000) {
						var5--;
						var365 = IfType.get(intStack[var5]);
						var382 -= 1000;
					} else {
						var365 = var43 ? activeComponent2 : activeComponent;
					}
					if (var382 == 1100) {
						var5 -= 2;
						var365.scrollPosX = intStack[var5];
						if (var365.scrollWidth - var365.renderWidth < var365.scrollPosX) {
							var365.scrollPosX = var365.scrollWidth - var365.renderWidth;
						}
						if (var365.scrollPosX < 0) {
							var365.scrollPosX = 0;
						}
						var365.scrollPosY = intStack[var5 + 1];
						if (var365.scrollPosY > var365.scrollHeight - var365.renderHeight) {
							var365.scrollPosY = var365.scrollHeight - var365.renderHeight;
						}
						if (var365.scrollPosY < 0) {
							var365.scrollPosY = 0;
						}
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1101) {
						var5--;
						var365.colour = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1102) {
						var5--;
						var365.fill = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1103) {
						var5--;
						var365.trans = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1104) {
						var5--;
						var365.lineWidth = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1105) {
						var5--;
						var365.graphic = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1106) {
						var5--;
						var365.rotate = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1107) {
						var5--;
						var365.tiling = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1108) {
						var365.model1Type = 1;
						var5--;
						var365.model1Id = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1109) {
						var5 -= 6;
						var365.field3365 = intStack[var5];
						var365.field3498 = intStack[var5 + 1];
						var365.modelXAn = intStack[var5 + 2];
						var365.modelYAn = intStack[var5 + 3];
						var365.modelZAn = intStack[var5 + 4];
						var365.modelZoom = intStack[var5 + 5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1110) {
						var5--;
						int var366 = intStack[var5];
						if (var365.modelAnim != var366) {
							var365.animCycle = 0;
							var365.modelAnim = var366;
							var365.animFrame = 0;
							Client.componentUpdated(var365);
						}
						continue;
					}
					if (var382 == 1111) {
						var5--;
						var365.orthog = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1112) {
						var6--;
						JagString var367 = stringStack[var6];
						if (!var367.method597(var365.text)) {
							var365.text = var367;
							Client.componentUpdated(var365);
						}
						continue;
					}
					if (var382 == 1113) {
						var5--;
						var365.font = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1114) {
						var5 -= 3;
						var365.hAlign = intStack[var5];
						var365.vAlign = intStack[var5 + 1];
						var365.lineHeight = intStack[var5 + 2];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1115) {
						var5--;
						var365.shadow = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1116) {
						var5--;
						var365.outline = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1117) {
						var5--;
						var365.shadowColour = intStack[var5];
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1118) {
						var5--;
						var365.vFlip = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1119) {
						var5--;
						var365.hFlip = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
					if (var382 == 1120) {
						var5 -= 2;
						var365.scrollWidth = intStack[var5];
						var365.scrollHeight = intStack[var5 + 1];
						Client.componentUpdated(var365);
						if (var365.type == 0) {
							Client.computeLayerLayout(false, var365);
						}
						continue;
					}
					if (var382 == 1121) {
						Client.componentUpdated(var365);
						var5--;
						continue;
					}
					if (var382 == 1122) {
						var5--;
						var365.field3477 = intStack[var5] == 1;
						Client.componentUpdated(var365);
						continue;
					}
				} else if (var382 >= 1200 && var382 < 1300 || var382 >= 2200 && var382 < 2300) {
					IfType var59;
					if (var382 >= 2000) {
						var382 -= 1000;
						var5--;
						var59 = IfType.get(intStack[var5]);
					} else {
						var59 = var43 ? activeComponent2 : activeComponent;
					}
					Client.componentUpdated(var59);
					if (var382 == 1200 || var382 == 1205) {
						var5 -= 2;
						int var60 = intStack[var5 + 1];
						int var61 = intStack[var5];
						if (var61 == -1) {
							var59.invobject = -1;
							var59.model1Id = -1;
							var59.model1Type = 1;
						} else {
							var59.invobject = var61;
							var59.invcount = var60;
							ObjType var62 = ObjType.list(var61);
							var59.field3365 = var62.xof2d;
							var59.modelYAn = var62.yan2d;
							var59.field3498 = var62.yof2d;
							if (var382 == 1205) {
								var59.showCount = false;
							} else {
								var59.showCount = true;
							}
							var59.modelXAn = var62.xan2d;
							var59.modelZAn = var62.zan2d;
							var59.modelZoom = var62.zoom2d;
							if (var59.modelBaseWidth > 0) {
								var59.modelZoom = var59.modelZoom * 32 / var59.modelBaseWidth;
							} else if (var59.width > 0) {
								var59.modelZoom = var59.modelZoom * 32 / var59.width;
							}
						}
						continue;
					}
					if (var382 == 1201) {
						var59.model1Type = 2;
						var5--;
						var59.model1Id = intStack[var5];
						continue;
					}
					if (var382 == 1202) {
						var59.model1Type = 3;
						var59.model1Id = Client.localPlayer.model.method1427();
						continue;
					}
					if (var382 == 1203) {
						var59.model1Type = 6;
						var5--;
						var59.model1Id = intStack[var5];
						continue;
					}
					if (var382 == 1204) {
						var59.model1Type = 5;
						var5--;
						var59.model1Id = intStack[var5];
						continue;
					}
				} else if ((var382 < 1300 || var382 >= 1400) && (var382 < 2300 || var382 >= 2400)) {
					if (var382 >= 1400 && var382 < 1500 || var382 >= 2400 && var382 < 2500) {
						int[] var63 = null;
						IfType var64;
						if (var382 < 2000) {
							var64 = var43 ? activeComponent2 : activeComponent;
						} else {
							var5--;
							var64 = IfType.get(intStack[var5]);
							var382 -= 1000;
						}
						var6--;
						JagString var65 = stringStack[var6];
						if (var65.length() > 0 && var65.charAt(var65.length() - 1) == 89) {
							var5--;
							int var66 = intStack[var5];
							if (var66 > 0) {
								var63 = new int[var66];
								while (var66-- > 0) {
									var5--;
									var63[var66] = intStack[var5];
								}
							}
							var65 = var65.method623(0, var65.length() - 1);
						}
						Object[] var67 = new Object[var65.length() + 1];
						for (int var68 = var67.length - 1; var68 >= 1; var68--) {
							if (var65.charAt(var68 - 1) == 115) {
								var6--;
								var67[var68] = stringStack[var6];
							} else {
								var5--;
								var67[var68] = Integer.valueOf(intStack[var5]);
							}
						}
						var5--;
						int var69 = intStack[var5];
						if (var69 == -1) {
							var67 = null;
						} else {
							var67[0] = Integer.valueOf(var69);
						}
						if (var382 == 1417) {
							var64.onscrollwheel = var67;
						}
						if (var382 == 1403) {
							var64.onmouseover = var67;
						}
						if (var382 == 1421) {
							var64.onclantransmit = var67;
						}
						if (var382 == 1407) {
							var64.onvartransmit = var67;
							var64.onvartransmitlist = var63;
						}
						if (var382 == 1408) {
							var64.ontimer = var67;
						}
						if (var382 == 1412) {
							var64.onmouserepeat = var67;
						}
						if (var382 == 1418) {
							var64.onchattransmit = var67;
						}
						if (var382 == 1405) {
							var64.ondrag = var67;
						}
						if (var382 == 1402) {
							var64.onrelease = var67;
						}
						if (var382 == 1420) {
							var64.onfriendtransmit = var67;
						}
						if (var382 == 1400) {
							var64.onclick = var67;
						}
						if (var382 == 1425) {
							var64.field3505 = var67;
						}
						if (var382 == 1404) {
							var64.onmouseleave = var67;
						}
						if (var382 == 1427) {
							var64.onresize = var67;
						}
						if (var382 == 1423) {
							var64.ondialogabort = var67;
						}
						if (var382 == 1401) {
							var64.onhold = var67;
						}
						if (var382 == 1422) {
							var64.onmisctransmit = var67;
						}
						if (var382 == 1409) {
							var64.onop = var67;
						}
						if (var382 == 1419) {
							var64.onkey = var67;
						}
						if (var382 == 1414) {
							var64.oninvtransmit = var67;
							var64.oninvtransmitlist = var63;
						}
						if (var382 == 1406) {
							var64.ontargetleave = var67;
						}
						var64.hashook = true;
						if (var382 == 1411) {
							var64.onclickrepeat = var67;
						}
						if (var382 == 1415) {
							var64.onstattransmitlist = var63;
							var64.onstattransmit = var67;
						}
						if (var382 == 1416) {
							var64.ontargetenter = var67;
						}
						if (var382 == 1424) {
							var64.onsubchange = var67;
						}
						if (var382 == 1410) {
							var64.ondragcomplete = var67;
						}
						continue;
					}
					if (var382 < 1600) {
						IfType var70 = var43 ? activeComponent2 : activeComponent;
						if (var382 == 1500) {
							intStack[var5++] = var70.renderX;
							continue;
						}
						if (var382 == 1501) {
							intStack[var5++] = var70.renderY;
							continue;
						}
						if (var382 == 1502) {
							intStack[var5++] = var70.renderWidth;
							continue;
						}
						if (var382 == 1503) {
							intStack[var5++] = var70.renderHeight;
							continue;
						}
						if (var382 == 1504) {
							intStack[var5++] = var70.hide ? 1 : 0;
							continue;
						}
						if (var382 == 1505) {
							intStack[var5++] = var70.layerId;
							continue;
						}
					} else if (var382 < 1700) {
						IfType var71 = var43 ? activeComponent2 : activeComponent;
						if (var382 == 1600) {
							intStack[var5++] = var71.scrollPosX;
							continue;
						}
						if (var382 == 1601) {
							intStack[var5++] = var71.scrollPosY;
							continue;
						}
						if (var382 == 1602) {
							stringStack[var6++] = var71.text;
							continue;
						}
						if (var382 == 1603) {
							intStack[var5++] = var71.scrollWidth;
							continue;
						}
						if (var382 == 1604) {
							intStack[var5++] = var71.scrollHeight;
							continue;
						}
						if (var382 == 1605) {
							intStack[var5++] = var71.modelZoom;
							continue;
						}
						if (var382 == 1606) {
							intStack[var5++] = var71.modelXAn;
							continue;
						}
						if (var382 == 1607) {
							intStack[var5++] = var71.modelZAn;
							continue;
						}
						if (var382 == 1608) {
							intStack[var5++] = var71.modelYAn;
							continue;
						}
						if (var382 == 1609) {
							intStack[var5++] = var71.trans;
							continue;
						}
					} else if (var382 < 1800) {
						IfType var72 = var43 ? activeComponent2 : activeComponent;
						if (var382 == 1700) {
							intStack[var5++] = var72.invobject;
							continue;
						}
						if (var382 == 1701) {
							if (var72.invobject == -1) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var72.invcount;
							}
							continue;
						}
						if (var382 == 1702) {
							intStack[var5++] = var72.subId;
							continue;
						}
					} else if (var382 < 1900) {
						IfType var73 = var43 ? activeComponent2 : activeComponent;
						if (var382 == 1800) {
							intStack[var5++] = ServerActive.targetMask(Client.getActive(var73));
							continue;
						}
						if (var382 == 1801) {
							var5--;
							int var74 = intStack[var5];
							int var383 = var74 - 1;
							if (var73.opNames != null && var73.opNames.length > var383 && var73.opNames[var383] != null) {
								stringStack[var6++] = var73.opNames[var383];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 1802) {
							if (var73.baseOpName == null) {
								stringStack[var6++] = field1468;
							} else {
								stringStack[var6++] = var73.baseOpName;
							}
							continue;
						}
					} else if (var382 < 2600) {
						var5--;
						IfType var75 = IfType.get(intStack[var5]);
						if (var382 == 2500) {
							intStack[var5++] = var75.renderX;
							continue;
						}
						if (var382 == 2501) {
							intStack[var5++] = var75.renderY;
							continue;
						}
						if (var382 == 2502) {
							intStack[var5++] = var75.renderWidth;
							continue;
						}
						if (var382 == 2503) {
							intStack[var5++] = var75.renderHeight;
							continue;
						}
						if (var382 == 2504) {
							intStack[var5++] = var75.hide ? 1 : 0;
							continue;
						}
						if (var382 == 2505) {
							intStack[var5++] = var75.layerId;
							continue;
						}
					} else if (var382 < 2700) {
						var5--;
						IfType var76 = IfType.get(intStack[var5]);
						if (var382 == 2600) {
							intStack[var5++] = var76.scrollPosX;
							continue;
						}
						if (var382 == 2601) {
							intStack[var5++] = var76.scrollPosY;
							continue;
						}
						if (var382 == 2602) {
							stringStack[var6++] = var76.text;
							continue;
						}
						if (var382 == 2603) {
							intStack[var5++] = var76.scrollWidth;
							continue;
						}
						if (var382 == 2604) {
							intStack[var5++] = var76.scrollHeight;
							continue;
						}
						if (var382 == 2605) {
							intStack[var5++] = var76.modelZoom;
							continue;
						}
						if (var382 == 2606) {
							intStack[var5++] = var76.modelXAn;
							continue;
						}
						if (var382 == 2607) {
							intStack[var5++] = var76.modelZAn;
							continue;
						}
						if (var382 == 2608) {
							intStack[var5++] = var76.modelYAn;
							continue;
						}
						if (var382 == 2609) {
							intStack[var5++] = var76.trans;
							continue;
						}
					} else if (var382 < 2800) {
						if (var382 == 2700) {
							var5--;
							IfType var351 = IfType.get(intStack[var5]);
							intStack[var5++] = var351.invobject;
							continue;
						}
						if (var382 == 2701) {
							var5--;
							IfType var352 = IfType.get(intStack[var5]);
							if (var352.invobject == -1) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var352.invcount;
							}
							continue;
						}
						if (var382 == 2702) {
							var5--;
							int var353 = intStack[var5];
							SubInterface var354 = (SubInterface) Client.subinterfaces.find((long) var353);
							if (var354 == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = 1;
							}
							continue;
						}
						if (var382 == 2703) {
							var5--;
							IfType var355 = IfType.get(intStack[var5]);
							if (var355.subcomponents == null) {
								intStack[var5++] = 0;
								continue;
							}
							int var356 = var355.subcomponents.length;
							for (int var357 = 0; var357 < var355.subcomponents.length; var357++) {
								if (var355.subcomponents[var357] == null) {
									var356 = var357;
									break;
								}
							}
							intStack[var5++] = var356;
							continue;
						}
						if (var382 == 2704 || var382 == 2705) {
							var5 -= 2;
							int var358 = intStack[var5];
							int var359 = intStack[var5 + 1];
							SubInterface var360 = (SubInterface) Client.subinterfaces.find((long) var358);
							if (var360 != null && var360.field3229 == var359) {
								intStack[var5++] = 1;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
					} else if (var382 < 2900) {
						var5--;
						IfType var77 = IfType.get(intStack[var5]);
						if (var382 == 2800) {
							intStack[var5++] = ServerActive.targetMask(Client.getActive(var77));
							continue;
						}
						if (var382 == 2801) {
							var5--;
							int var78 = intStack[var5];
							int var384 = var78 - 1;
							if (var77.opNames != null && var77.opNames.length > var384 && var77.opNames[var384] != null) {
								stringStack[var6++] = var77.opNames[var384];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 2802) {
							if (var77.baseOpName == null) {
								stringStack[var6++] = field1468;
							} else {
								stringStack[var6++] = var77.baseOpName;
							}
							continue;
						}
					} else if (var382 < 3200) {
						if (var382 == 3100) {
							var6--;
							JagString var336 = stringStack[var6];
							Client.addChat(var336, 0, field1468);
							continue;
						}
						if (var382 == 3101) {
							var5 -= 2;
							Client.triggerPlayerAnim(intStack[var5], intStack[var5 + 1], Client.localPlayer);
							continue;
						}
						if (var382 == 3103) {
							Client.closeModal();
							continue;
						}
						if (var382 == 3104) {
							var6--;
							JagString var337 = stringStack[var6];
							int var338 = 0;
							if (var337.method621()) {
								var338 = var337.method603();
							}
							Client.out.p1Enc(152);
							Client.out.p4(var338);
							continue;
						}
						if (var382 == 3105) {
							var6--;
							JagString var339 = stringStack[var6];
							Client.out.p1Enc(54);
							Client.out.p8(var339.toUserhash());
							continue;
						}
						if (var382 == 3106) {
							var6--;
							JagString var340 = stringStack[var6];
							Client.out.p1Enc(60);
							Client.out.p1(var340.length() + 1);
							Client.out.pjstr(var340);
							continue;
						}
						if (var382 == 3107) {
							var5--;
							int var341 = intStack[var5];
							var6--;
							JagString var342 = stringStack[var6];
							Client.opPlayer(var342, var341);
							continue;
						}
						if (var382 == 3108) {
							var5 -= 3;
							int var343 = intStack[var5];
							int var344 = intStack[var5 + 1];
							int var345 = intStack[var5 + 2];
							IfType var346 = IfType.get(var345);
							Client.dragTryPickup(var343, var344, var346);
							continue;
						}
						if (var382 == 3109) {
							var5 -= 2;
							int var347 = intStack[var5];
							int var348 = intStack[var5 + 1];
							IfType var349 = var43 ? activeComponent2 : activeComponent;
							Client.dragTryPickup(var347, var348, var349);
							continue;
						}
						if (var382 == 3110) {
							var5--;
							int var350 = intStack[var5];
							Client.out.p1Enc(194);
							Client.out.p2(var350);
							continue;
						}
					} else if (var382 < 3300) {
						if (var382 == 3200) {
							var5 -= 3;
							Client.playSynth(intStack[var5 + 1], intStack[var5 + 2], intStack[var5]);
							continue;
						}
						if (var382 == 3201) {
							var5--;
							Client.playSongs(intStack[var5]);
							continue;
						}
						if (var382 == 3202) {
							var5 -= 2;
							Client.playJingle(intStack[var5], intStack[var5 + 1]);
							continue;
						}
					} else if (var382 < 3400) {
						if (var382 == 3300) {
							intStack[var5++] = Client.loopCycle;
							continue;
						}
						if (var382 == 3301) {
							var5 -= 2;
							int var314 = intStack[var5 + 1];
							int var315 = intStack[var5];
							intStack[var5++] = ClientInvCache.getType(var314, var315);
							continue;
						}
						if (var382 == 3302) {
							var5 -= 2;
							int var316 = intStack[var5];
							int var317 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getCount(var316, var317);
							continue;
						}
						if (var382 == 3303) {
							var5 -= 2;
							int var318 = intStack[var5 + 1];
							int var319 = intStack[var5];
							intStack[var5++] = ClientInvCache.invTotal(var319, var318);
							continue;
						}
						if (var382 == 3304) {
							var5--;
							int var320 = intStack[var5];
							intStack[var5++] = InvType.list(var320).size;
							continue;
						}
						if (var382 == 3305) {
							var5--;
							int var321 = intStack[var5];
							intStack[var5++] = Client.statEffectiveLevel[var321];
							continue;
						}
						if (var382 == 3306) {
							var5--;
							int var322 = intStack[var5];
							intStack[var5++] = Client.statBaseLevel[var322];
							continue;
						}
						if (var382 == 3307) {
							var5--;
							int var323 = intStack[var5];
							intStack[var5++] = Client.statXP[var323];
							continue;
						}
						if (var382 == 3308) {
							int var324 = Client.minusedlevel;
							int var325 = (Client.localPlayer.z >> 7) + Client.mapBuildBaseZ;
							int var326 = Client.mapBuildBaseX + (Client.localPlayer.x >> 7);
							intStack[var5++] = var325 + (var326 << 14) + (var324 << 28);
							continue;
						}
						if (var382 == 3309) {
							var5--;
							int var327 = intStack[var5];
							intStack[var5++] = var327 >> 14 & 0x3FFF;
							continue;
						}
						if (var382 == 3310) {
							var5--;
							int var328 = intStack[var5];
							intStack[var5++] = var328 >> 28;
							continue;
						}
						if (var382 == 3311) {
							var5--;
							int var329 = intStack[var5];
							intStack[var5++] = var329 & 0x3FFF;
							continue;
						}
						if (var382 == 3312) {
							intStack[var5++] = Client.memServer ? 1 : 0;
							continue;
						}
						if (var382 == 3313) {
							var5 -= 2;
							int var330 = intStack[var5 + 1];
							int var331 = intStack[var5] + 32768;
							intStack[var5++] = ClientInvCache.getType(var330, var331);
							continue;
						}
						if (var382 == 3314) {
							var5 -= 2;
							int var332 = intStack[var5] + 32768;
							int var333 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.getCount(var332, var333);
							continue;
						}
						if (var382 == 3315) {
							var5 -= 2;
							int var334 = intStack[var5] + 32768;
							int var335 = intStack[var5 + 1];
							intStack[var5++] = ClientInvCache.invTotal(var334, var335);
							continue;
						}
						if (var382 == 3316) {
							if (Client.staffmodlevel < 2) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = Client.staffmodlevel;
							}
							continue;
						}
						if (var382 == 3317) {
							intStack[var5++] = Client.rebootTimer;
							continue;
						}
						if (var382 == 3318) {
							intStack[var5++] = Client.worldid;
							continue;
						}
						if (var382 == 3321) {
							intStack[var5++] = Client.runenergy;
							continue;
						}
						if (var382 == 3322) {
							intStack[var5++] = Client.runweight;
							continue;
						}
						if (var382 == 3323) {
							if (Client.blackmarks >= 5 && Client.blackmarks <= 9) {
								intStack[var5++] = 1;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3324) {
							if (Client.blackmarks >= 5 && Client.blackmarks <= 9) {
								intStack[var5++] = Client.blackmarks;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3325) {
							if (Client.membersAccount > 0) {
								intStack[var5++] = 1;
							} else {
								intStack[var5++] = 0;
							}
							continue;
						}
						if (var382 == 3326) {
							intStack[var5++] = Client.localPlayer.combatLevel;
							continue;
						}
						if (var382 == 3327) {
							intStack[var5++] = Client.localPlayer.model.gender ? 1 : 0;
							continue;
						}
						if (var382 == 3328) {
							intStack[var5++] = Client.underage;
							continue;
						}
						if (var382 == 3329) {
							intStack[var5++] = Client.mapQuickchat;
							continue;
						}
					} else if (var382 < 3500) {
						if (var382 == 3400) {
							var5 -= 2;
							int var306 = intStack[var5];
							int var307 = intStack[var5 + 1];
							EnumType var308 = EnumType.list(var306);
							stringStack[var6++] = var308.getValueString(var307);
							continue;
						}
						if (var382 == 3408) {
							var5 -= 4;
							int var309 = intStack[var5 + 1];
							int var310 = intStack[var5 + 2];
							int var311 = intStack[var5 + 3];
							int var312 = intStack[var5];
							EnumType var313 = EnumType.list(var310);
							if (var312 == var313.inputtype && var309 == var313.outputtype) {
								if (var309 == 115) {
									stringStack[var6++] = var313.getValueString(var311);
								} else {
									intStack[var5++] = var313.getValueInt(var311);
								}
								continue;
							}
							if (var309 == 115) {
								stringStack[var6++] = field207;
							} else {
								intStack[var5++] = 0;
							}
							continue;
						}
					} else if (var382 < 3700) {
						if (var382 == 3600) {
							if (Client.friendServerStatus == 0) {
								intStack[var5++] = -2;
							} else if (Client.friendServerStatus == 1) {
								intStack[var5++] = -1;
							} else {
								intStack[var5++] = Client.friendCount;
							}
							continue;
						}
						if (var382 == 3601) {
							var5--;
							int var79 = intStack[var5];
							if (Client.friendServerStatus == 2 && var79 < Client.friendCount) {
								stringStack[var6++] = Client.field370[var79];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 3602) {
							var5--;
							int var80 = intStack[var5];
							if (Client.friendServerStatus == 2 && var80 < Client.friendCount) {
								intStack[var5++] = Client.field3092[var80];
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3603) {
							var5--;
							int var81 = intStack[var5];
							if (Client.friendServerStatus == 2 && var81 < Client.friendCount) {
								intStack[var5++] = Client.field845[var81];
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3604) {
							var6--;
							JagString var82 = stringStack[var6];
							var5--;
							int var83 = intStack[var5];
							Client.setFriendRank(var82, var83);
							continue;
						}
						if (var382 == 3605) {
							var6--;
							JagString var84 = stringStack[var6];
							Client.addFriend(var84.toUserhash());
							continue;
						}
						if (var382 == 3606) {
							var6--;
							JagString var85 = stringStack[var6];
							Client.delFriend(var85.toUserhash());
							continue;
						}
						if (var382 == 3607) {
							var6--;
							JagString var86 = stringStack[var6];
							Client.addIgnore(var86.toUserhash());
							continue;
						}
						if (var382 == 3608) {
							var6--;
							JagString var87 = stringStack[var6];
							Client.delIgnore(var87.toUserhash());
							continue;
						}
						if (var382 == 3609) {
							var6--;
							JagString var88 = stringStack[var6];
							if (var88.method619(field3554) || var88.method619(field3141)) {
								var88 = var88.method635(7);
							}
							intStack[var5++] = Client.isFriend(var88) ? 1 : 0;
							continue;
						}
						if (var382 == 3610) {
							var5--;
							int var89 = intStack[var5];
							if (Client.friendServerStatus == 2 && Client.friendCount > var89) {
								stringStack[var6++] = Client.field3238[var89];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 3611) {
							if (Client.chatDisplayName == null) {
								stringStack[var6++] = field1468;
							} else {
								stringStack[var6++] = Client.chatDisplayName.method614();
							}
							continue;
						}
						if (var382 == 3612) {
							if (Client.chatDisplayName == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = Client.friendChatCount;
							}
							continue;
						}
						if (var382 == 3613) {
							var5--;
							int var90 = intStack[var5];
							if (Client.chatDisplayName != null && Client.friendChatCount > var90) {
								stringStack[var6++] = Client.friendChatList[var90].field1323.method614();
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 3614) {
							var5--;
							int var91 = intStack[var5];
							if (Client.chatDisplayName != null && Client.friendChatCount > var91) {
								intStack[var5++] = Client.friendChatList[var91].field1317;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3615) {
							var5--;
							int var92 = intStack[var5];
							if (Client.chatDisplayName != null && Client.friendChatCount > var92) {
								intStack[var5++] = Client.friendChatList[var92].field1315;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3616) {
							intStack[var5++] = Client.chatMinKick;
							continue;
						}
						if (var382 == 3617) {
							var6--;
							JagString var93 = stringStack[var6];
							Client.friendsChatKickUser(var93);
							continue;
						}
						if (var382 == 3618) {
							intStack[var5++] = Client.chatRank;
							continue;
						}
						if (var382 == 3619) {
							var6--;
							JagString var94 = stringStack[var6];
							Client.friendsChatJoinChat(var94.toUserhash());
							continue;
						}
						if (var382 == 3620) {
							Client.friendsChatLeaveChat();
							continue;
						}
						if (var382 == 3621) {
							if (Client.friendServerStatus == 0) {
								intStack[var5++] = -1;
							} else {
								intStack[var5++] = Client.privateMessageCount;
							}
							continue;
						}
						if (var382 == 3622) {
							var5--;
							int var95 = intStack[var5];
							if (Client.friendServerStatus != 0 && var95 < Client.privateMessageCount) {
								stringStack[var6++] = JagString.method1375(Client.messageIds[var95]).method614();
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 3623) {
							var6--;
							JagString var96 = stringStack[var6];
							if (var96.method619(field3554) || var96.method619(field3141)) {
								var96 = var96.method635(7);
							}
							intStack[var5++] = Client.isIgnored(var96) ? 1 : 0;
							continue;
						}
						if (var382 == 3624) {
							var5--;
							int var97 = intStack[var5];
							if (Client.friendChatList != null && Client.friendChatCount > var97 && Client.friendChatList[var97].field1323.method624(Client.localPlayer.name)) {
								intStack[var5++] = 1;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3625) {
							if (Client.chatOwnerName == null) {
								stringStack[var6++] = field1468;
							} else {
								stringStack[var6++] = Client.chatOwnerName.method614();
							}
							continue;
						}
						if (var382 == 3626) {
							var5--;
							int var98 = intStack[var5];
							if (Client.chatDisplayName != null && Client.friendChatCount > var98) {
								stringStack[var6++] = Client.friendChatList[var98].field1321;
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 3627) {
							var5--;
							int var99 = intStack[var5];
							if (Client.friendServerStatus == 2 && var99 >= 0 && var99 < Client.friendCount) {
								intStack[var5++] = Client.field1120[var99] ? 1 : 0;
								continue;
							}
							intStack[var5++] = 0;
							continue;
						}
						if (var382 == 3628) {
							var6--;
							JagString var100 = stringStack[var6];
							if (var100.method619(field3554) || var100.method619(field3141)) {
								var100 = var100.method635(7);
							}
							intStack[var5++] = Client.getFriendIndex(var100);
							continue;
						}
					} else if (var382 < 4000) {
						if (var382 == 3903) {
							var5--;
							int var101 = intStack[var5];
							intStack[var5++] = Client.field140[var101].method882();
							continue;
						}
						if (var382 == 3904) {
							var5--;
							int var102 = intStack[var5];
							intStack[var5++] = Client.field140[var102].field2455;
							continue;
						}
						if (var382 == 3905) {
							var5--;
							int var103 = intStack[var5];
							intStack[var5++] = Client.field140[var103].field2454;
							continue;
						}
						if (var382 == 3906) {
							var5--;
							int var104 = intStack[var5];
							intStack[var5++] = Client.field140[var104].field2450;
							continue;
						}
						if (var382 == 3907) {
							var5--;
							int var105 = intStack[var5];
							intStack[var5++] = Client.field140[var105].field2457;
							continue;
						}
						if (var382 == 3908) {
							var5--;
							int var106 = intStack[var5];
							intStack[var5++] = Client.field140[var106].field2459;
							continue;
						}
						if (var382 == 3910) {
							var5--;
							int var107 = intStack[var5];
							int var108 = Client.field140[var107].method886();
							intStack[var5++] = var108 == 0 ? 1 : 0;
							continue;
						}
						if (var382 == 3911) {
							var5--;
							int var109 = intStack[var5];
							int var110 = Client.field140[var109].method886();
							intStack[var5++] = var110 == 2 ? 1 : 0;
							continue;
						}
						if (var382 == 3912) {
							var5--;
							int var111 = intStack[var5];
							int var112 = Client.field140[var111].method886();
							intStack[var5++] = var112 == 5 ? 1 : 0;
							continue;
						}
						if (var382 == 3913) {
							var5--;
							int var113 = intStack[var5];
							int var114 = Client.field140[var113].method886();
							intStack[var5++] = var114 == 1 ? 1 : 0;
							continue;
						}
					} else if (var382 < 4100) {
						if (var382 == 4000) {
							var5 -= 2;
							int var115 = intStack[var5];
							int var116 = intStack[var5 + 1];
							intStack[var5++] = var115 + var116;
							continue;
						}
						if (var382 == 4001) {
							var5 -= 2;
							int var117 = intStack[var5];
							int var118 = intStack[var5 + 1];
							intStack[var5++] = var117 - var118;
							continue;
						}
						if (var382 == 4002) {
							var5 -= 2;
							int var119 = intStack[var5 + 1];
							int var120 = intStack[var5];
							intStack[var5++] = var120 * var119;
							continue;
						}
						if (var382 == 4003) {
							var5 -= 2;
							int var121 = intStack[var5];
							int var122 = intStack[var5 + 1];
							intStack[var5++] = var121 / var122;
							continue;
						}
						if (var382 == 4004) {
							var5--;
							int var123 = intStack[var5];
							intStack[var5++] = (int) (Math.random() * (double) var123);
							continue;
						}
						if (var382 == 4005) {
							var5--;
							int var124 = intStack[var5];
							intStack[var5++] = (int) ((double) (var124 + 1) * Math.random());
							continue;
						}
						if (var382 == 4006) {
							var5 -= 5;
							int var125 = intStack[var5];
							int var126 = intStack[var5 + 1];
							int var127 = intStack[var5 + 2];
							int var128 = intStack[var5 + 3];
							int var129 = intStack[var5 + 4];
							intStack[var5++] = var125 + (var129 - var127) * (-var125 + var126) / (var128 - var127);
							continue;
						}
						if (var382 == 4007) {
							var5 -= 2;
							long var130 = (long) intStack[var5 + 1];
							long var132 = (long) intStack[var5];
							intStack[var5++] = (int) (var130 * var132 / 100L + var132);
							continue;
						}
						if (var382 == 4008) {
							var5 -= 2;
							int var134 = intStack[var5];
							int var135 = intStack[var5 + 1];
							intStack[var5++] = 0x1 << var135 | var134;
							continue;
						}
						if (var382 == 4009) {
							var5 -= 2;
							int var136 = intStack[var5 + 1];
							int var137 = intStack[var5];
							intStack[var5++] = var137 & -(0x1 << var136) - 1;
							continue;
						}
						if (var382 == 4010) {
							var5 -= 2;
							int var138 = intStack[var5 + 1];
							int var139 = intStack[var5];
							intStack[var5++] = (var139 & 0x1 << var138) == 0 ? 0 : 1;
							continue;
						}
						if (var382 == 4011) {
							var5 -= 2;
							int var140 = intStack[var5 + 1];
							int var141 = intStack[var5];
							intStack[var5++] = var141 % var140;
							continue;
						}
						if (var382 == 4012) {
							var5 -= 2;
							int var142 = intStack[var5];
							int var143 = intStack[var5 + 1];
							if (var142 == 0) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = (int) Math.pow((double) var142, (double) var143);
							}
							continue;
						}
						if (var382 == 4013) {
							var5 -= 2;
							int var144 = intStack[var5];
							int var145 = intStack[var5 + 1];
							if (var144 == 0) {
								intStack[var5++] = 0;
							} else if (var145 == 0) {
								intStack[var5++] = Integer.MAX_VALUE;
							} else {
								intStack[var5++] = (int) Math.pow((double) var144, 1.0D / (double) var145);
							}
							continue;
						}
						if (var382 == 4014) {
							var5 -= 2;
							int var146 = intStack[var5 + 1];
							int var147 = intStack[var5];
							intStack[var5++] = var146 & var147;
							continue;
						}
						if (var382 == 4015) {
							var5 -= 2;
							int var148 = intStack[var5 + 1];
							int var149 = intStack[var5];
							intStack[var5++] = var149 | var148;
							continue;
						}
						if (var382 == 4016) {
							var5 -= 2;
							int var150 = intStack[var5];
							int var151 = intStack[var5 + 1];
							intStack[var5++] = var150 < var151 ? var150 : var151;
							continue;
						}
						if (var382 == 4017) {
							var5 -= 2;
							int var152 = intStack[var5];
							int var153 = intStack[var5 + 1];
							intStack[var5++] = var152 <= var153 ? var153 : var152;
							continue;
						}
						if (var382 == 4018) {
							var5 -= 3;
							long var154 = (long) intStack[var5];
							long var156 = (long) intStack[var5 + 1];
							long var158 = (long) intStack[var5 + 2];
							intStack[var5++] = (int) (var158 * var154 / var156);
							continue;
						}
					} else if (var382 < 4200) {
						if (var382 == 4100) {
							var6--;
							JagString var254 = stringStack[var6];
							var5--;
							int var255 = intStack[var5];
							stringStack[var6++] = JagString.join(new JagString[]{var254, JagString.method1212(var255)});
							continue;
						}
						if (var382 == 4101) {
							var6 -= 2;
							JagString var256 = stringStack[var6 + 1];
							JagString var257 = stringStack[var6];
							stringStack[var6++] = JagString.join(new JagString[]{var257, var256});
							continue;
						}
						if (var382 == 4102) {
							var6--;
							JagString var258 = stringStack[var6];
							var5--;
							int var259 = intStack[var5];
							stringStack[var6++] = JagString.join(new JagString[]{var258, JagString.method375(var259)});
							continue;
						}
						if (var382 == 4103) {
							var6--;
							JagString var260 = stringStack[var6];
							stringStack[var6++] = var260.method639();
							continue;
						}
						if (var382 == 4104) {
							var5--;
							int var261 = intStack[var5];
							long var262 = ((long) var261 + 11745L) * 86400000L;
							calendar.setTime(new Date(var262));
							int var264 = calendar.get(5);
							int var265 = calendar.get(2);
							int var266 = calendar.get(1);
							stringStack[var6++] = JagString.join(new JagString[]{JagString.method1212(var264), field2171, months[var265], field2171, JagString.method1212(var266)});
							continue;
						}
						if (var382 == 4105) {
							var6 -= 2;
							JagString var267 = stringStack[var6];
							JagString var268 = stringStack[var6 + 1];
							if (Client.localPlayer.model != null && Client.localPlayer.model.gender) {
								stringStack[var6++] = var268;
								continue;
							}
							stringStack[var6++] = var267;
							continue;
						}
						if (var382 == 4106) {
							var5--;
							int var269 = intStack[var5];
							stringStack[var6++] = JagString.method1212(var269);
							continue;
						}
						if (var382 == 4107) {
							var6 -= 2;
							intStack[var5++] = stringStack[var6].method627(stringStack[var6 + 1]);
							continue;
						}
						if (var382 == 4108) {
							var5 -= 2;
							int var270 = intStack[var5];
							var6--;
							JagString var271 = stringStack[var6];
							int var272 = intStack[var5 + 1];
							byte[] var273 = Client.fontmetrics.getFile(0, var272);
							SoftwarePixFont var274 = new SoftwarePixFont(var273);
							var274.setIcons(Client.modIcons, null);
							intStack[var5++] = var274.predictLinesMultiline(var271, var270);
							continue;
						}
						if (var382 == 4109) {
							var5 -= 2;
							var6--;
							JagString var275 = stringStack[var6];
							int var276 = intStack[var5 + 1];
							int var277 = intStack[var5];
							byte[] var278 = Client.fontmetrics.getFile(0, var276);
							SoftwarePixFont var279 = new SoftwarePixFont(var278);
							var279.setIcons(Client.modIcons, null);
							intStack[var5++] = var279.predictWidthMultiline(var275, var277);
							continue;
						}
						if (var382 == 4110) {
							var6 -= 2;
							JagString var280 = stringStack[var6 + 1];
							JagString var281 = stringStack[var6];
							var5--;
							if (intStack[var5] == 1) {
								stringStack[var6++] = var281;
							} else {
								stringStack[var6++] = var280;
							}
							continue;
						}
						if (var382 == 4111) {
							var6--;
							JagString var282 = stringStack[var6];
							stringStack[var6++] = PixfontGeneric.escape(var282);
							continue;
						}
						if (var382 == 4112) {
							var5--;
							int var283 = intStack[var5];
							var6--;
							JagString var284 = stringStack[var6];
							if (var283 == -1) {
								throw new RuntimeException("null char");
							}
							stringStack[var6++] = var284.method618(var283);
							continue;
						}
						if (var382 == 4113) {
							var5--;
							int var285 = intStack[var5];
							intStack[var5++] = Statics.method1489(var285) ? 1 : 0;
							continue;
						}
						if (var382 == 4114) {
							var5--;
							int var286 = intStack[var5];
							intStack[var5++] = Statics.method782(var286) ? 1 : 0;
							continue;
						}
						if (var382 == 4115) {
							var5--;
							int var287 = intStack[var5];
							intStack[var5++] = Statics.method746(var287) ? 1 : 0;
							continue;
						}
						if (var382 == 4116) {
							var5--;
							int var288 = intStack[var5];
							intStack[var5++] = Statics.method24(var288) ? 1 : 0;
							continue;
						}
						if (var382 == 4117) {
							var6--;
							JagString var289 = stringStack[var6];
							if (var289 == null) {
								intStack[var5++] = 0;
							} else {
								intStack[var5++] = var289.length();
							}
							continue;
						}
						if (var382 == 4118) {
							var5 -= 2;
							var6--;
							JagString var290 = stringStack[var6];
							int var291 = intStack[var5 + 1];
							int var292 = intStack[var5];
							stringStack[var6++] = var290.method623(var292, var291);
							continue;
						}
						if (var382 == 4119) {
							var6--;
							JagString var293 = stringStack[var6];
							JagString var294 = JagString.method1135(var293.length());
							boolean var295 = false;
							for (int var296 = 0; var293.length() > var296; var296++) {
								int var297 = var293.charAt(var296);
								if (var297 == 60) {
									var295 = true;
								} else if (var297 == 62) {
									var295 = false;
								} else if (!var295) {
									var294.method638(var297);
								}
							}
							var294.method629();
							stringStack[var6++] = var294;
							continue;
						}
						if (var382 == 4120) {
							var5 -= 2;
							var6--;
							JagString var298 = stringStack[var6];
							int var299 = intStack[var5];
							int var300 = intStack[var5 + 1];
							intStack[var5++] = var298.method594(var299, var300);
							continue;
						}
						if (var382 == 4121) {
							var6 -= 2;
							JagString var301 = stringStack[var6 + 1];
							var5--;
							int var302 = intStack[var5];
							JagString var303 = stringStack[var6];
							intStack[var5++] = var303.method634(var302, var301);
							continue;
						}
						if (var382 == 4122) {
							var5--;
							int var304 = intStack[var5];
							intStack[var5++] = Statics.method102(var304);
							continue;
						}
						if (var382 == 4123) {
							var5--;
							int var305 = intStack[var5];
							intStack[var5++] = Statics.method51(var305);
							continue;
						}
					} else if (var382 < 4300) {
						if (var382 == 4200) {
							var5--;
							int var160 = intStack[var5];
							stringStack[var6++] = ObjType.list(var160).name;
							continue;
						}
						if (var382 == 4201) {
							var5 -= 2;
							int var161 = intStack[var5];
							int var162 = intStack[var5 + 1];
							ObjType var163 = ObjType.list(var161);
							if (var162 >= 1 && var162 <= 5 && var163.op[var162 - 1] != null) {
								stringStack[var6++] = var163.op[var162 - 1];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 4202) {
							var5 -= 2;
							int var164 = intStack[var5 + 1];
							int var165 = intStack[var5];
							ObjType var166 = ObjType.list(var165);
							if (var164 >= 1 && var164 <= 5 && var166.iop[var164 - 1] != null) {
								stringStack[var6++] = var166.iop[var164 - 1];
								continue;
							}
							stringStack[var6++] = field1468;
							continue;
						}
						if (var382 == 4203) {
							var5--;
							int var167 = intStack[var5];
							intStack[var5++] = ObjType.list(var167).cost;
							continue;
						}
						if (var382 == 4204) {
							var5--;
							int var168 = intStack[var5];
							intStack[var5++] = ObjType.list(var168).stackable == 1 ? 1 : 0;
							continue;
						}
						if (var382 == 4205) {
							var5--;
							int var169 = intStack[var5];
							ObjType var170 = ObjType.list(var169);
							if (var170.certtemplate == -1 && var170.certlink >= 0) {
								intStack[var5++] = var170.certlink;
								continue;
							}
							intStack[var5++] = var169;
							continue;
						}
						if (var382 == 4206) {
							var5--;
							int var171 = intStack[var5];
							ObjType var172 = ObjType.list(var171);
							if (var172.certtemplate >= 0 && var172.certlink >= 0) {
								intStack[var5++] = var172.certlink;
								continue;
							}
							intStack[var5++] = var171;
							continue;
						}
						if (var382 == 4207) {
							var5--;
							int var173 = intStack[var5];
							intStack[var5++] = ObjType.list(var173).members ? 1 : 0;
							continue;
						}
						if (var382 == 4208) {
							var5 -= 2;
							int var174 = intStack[var5 + 1];
							int var175 = intStack[var5];
							ParamType var176 = ParamType.list(var174);
							if (var176.isString()) {
								stringStack[var6++] = ObjType.list(var175).getParamString(var176.defaultString, var174);
							} else {
								intStack[var5++] = ObjType.list(var175).getParamInt(var174, var176.defaultInt);
							}
							continue;
						}
						if (var382 == 4210) {
							var5--;
							int var177 = intStack[var5];
							var6--;
							JagString var178 = stringStack[var6];
							ObjType.method467(var177 == 1, var178);
							intStack[var5++] = Statics.field3893;
							continue;
						}
						if (var382 == 4211) {
							if (Statics.field1210 != null && Statics.field3893 > ClientMouseListener.field2107) {
								intStack[var5++] = Statics.field1210[ClientMouseListener.field2107++] & 0xFFFF;
								continue;
							}
							intStack[var5++] = -1;
							continue;
						}
						if (var382 == 4212) {
							ClientMouseListener.field2107 = 0;
							continue;
						}
					} else if (var382 < 4400) {
						if (var382 == 4300) {
							var5 -= 2;
							int var179 = intStack[var5];
							int var180 = intStack[var5 + 1];
							ParamType var181 = ParamType.list(var180);
							if (var181.isString()) {
								stringStack[var6++] = NpcType.list(var179).getParamString(var180, var181.defaultString);
							} else {
								intStack[var5++] = NpcType.list(var179).getParamInt(var181.defaultInt, var180);
							}
							continue;
						}
					} else if (var382 >= 4500) {
						if (var382 >= 4600) {
							if (var382 < 5100) {
								if (var382 == 5000) {
									intStack[var5++] = Client.chatPublicMode;
									continue;
								}
								if (var382 == 5001) {
									var5 -= 3;
									Client.chatPublicMode = intStack[var5];
									Client.chatPrivateMode = intStack[var5 + 1];
									Client.chatTradeMode = intStack[var5 + 2];
									Client.out.p1Enc(115);
									Client.out.p1(Client.chatPublicMode);
									Client.out.p1(Client.chatPrivateMode);
									Client.out.p1(Client.chatTradeMode);
									continue;
								}
								if (var382 == 5002) {
									var5 -= 2;
									int var182 = intStack[var5];
									var6--;
									JagString var183 = stringStack[var6];
									int var184 = intStack[var5 + 1];
									Client.out.p1Enc(99);
									Client.out.p8(var183.toUserhash());
									Client.out.p1(var182 - 1);
									Client.out.p1(var184);
									continue;
								}
								if (var382 == 5003) {
									var5--;
									int var185 = intStack[var5];
									JagString var186 = null;
									if (var185 < 100) {
										var186 = Client.chatText[var185];
									}
									if (var186 == null) {
										var186 = field1468;
									}
									stringStack[var6++] = var186;
									continue;
								}
								if (var382 == 5004) {
									int var187 = -1;
									var5--;
									int var188 = intStack[var5];
									if (var188 < 100 && Client.chatText[var188] != null) {
										var187 = Client.chatType[var188];
									}
									intStack[var5++] = var187;
									continue;
								}
								if (var382 == 5005) {
									intStack[var5++] = Client.chatPrivateMode;
									continue;
								}
								if (var382 == 5008) {
									var6--;
									JagString var189 = stringStack[var6];
									if (var189.method619(Client.field2194)) {
										Client.doCheat(var189);
										continue;
									}
									if (Client.staffmodlevel == 0 && (Client.underage == 1 || Client.mapQuickchat == 1)) {
										continue;
									}
									JagString var190 = var189.method639();
									byte var191 = 0;
									if (var190.method619(field488)) {
										var189 = var189.method635(field488.length());
										var191 = 0;
									} else if (var190.method619(field1837)) {
										var191 = 1;
										var189 = var189.method635(field1837.length());
									} else if (var190.method619(field2564)) {
										var189 = var189.method635(field2564.length());
										var191 = 2;
									} else if (var190.method619(field4467)) {
										var191 = 3;
										var189 = var189.method635(field4467.length());
									} else if (var190.method619(field4363)) {
										var189 = var189.method635(field4363.length());
										var191 = 4;
									} else if (var190.method619(field1355)) {
										var189 = var189.method635(field1355.length());
										var191 = 5;
									} else if (var190.method619(field669)) {
										var189 = var189.method635(field669.length());
										var191 = 6;
									} else if (var190.method619(field3690)) {
										var191 = 7;
										var189 = var189.method635(field3690.length());
									} else if (var190.method619(field696)) {
										var189 = var189.method635(field696.length());
										var191 = 8;
									} else if (var190.method619(field3817)) {
										var189 = var189.method635(field3817.length());
										var191 = 9;
									} else if (var190.method619(field3084)) {
										var191 = 10;
										var189 = var189.method635(field3084.length());
									} else if (var190.method619(field3703)) {
										var189 = var189.method635(field3703.length());
										var191 = 11;
									} else if (Client.lang != 0) {
										if (var190.method619(Text.CHATCOL_YELLOW)) {
											var191 = 0;
											var189 = var189.method635(Text.CHATCOL_YELLOW.length());
										} else if (var190.method619(Text.CHATCOL_RED)) {
											var189 = var189.method635(Text.CHATCOL_RED.length());
											var191 = 1;
										} else if (var190.method619(Text.CHATCOL_GREEN)) {
											var191 = 2;
											var189 = var189.method635(Text.CHATCOL_GREEN.length());
										} else if (var190.method619(Text.CHATCOL_CYAN)) {
											var191 = 3;
											var189 = var189.method635(Text.CHATCOL_CYAN.length());
										} else if (var190.method619(Text.CHATCOL_PURPLE)) {
											var189 = var189.method635(Text.CHATCOL_PURPLE.length());
											var191 = 4;
										} else if (var190.method619(Text.CHATCOL_WHITE)) {
											var189 = var189.method635(Text.CHATCOL_WHITE.length());
											var191 = 5;
										} else if (var190.method619(Text.CHATEFFECT_FLASH1)) {
											var189 = var189.method635(Text.CHATEFFECT_FLASH1.length());
											var191 = 6;
										} else if (var190.method619(Text.CHATEFFECT_FLASH2)) {
											var191 = 7;
											var189 = var189.method635(Text.CHATEFFECT_FLASH2.length());
										} else if (var190.method619(Text.CHATEFFECT_FLASH3)) {
											var189 = var189.method635(Text.CHATEFFECT_FLASH3.length());
											var191 = 8;
										} else if (var190.method619(Text.CHATEFFECT_GLOW1)) {
											var189 = var189.method635(Text.CHATEFFECT_GLOW1.length());
											var191 = 9;
										} else if (var190.method619(Text.CHATEFFECT_GLOW2)) {
											var191 = 10;
											var189 = var189.method635(Text.CHATEFFECT_GLOW2.length());
										} else if (var190.method619(Text.CHATEFFECT_GLOW3)) {
											var189 = var189.method635(Text.CHATEFFECT_GLOW3.length());
											var191 = 11;
										}
									}
									JagString var192 = var189.method639();
									byte var193 = 0;
									if (var192.method619(field1083)) {
										var193 = 1;
										var189 = var189.method635(field1083.length());
									} else if (var192.method619(field612)) {
										var189 = var189.method635(field612.length());
										var193 = 2;
									} else if (var192.method619(field1308)) {
										var193 = 3;
										var189 = var189.method635(field1308.length());
									} else if (var192.method619(field263)) {
										var193 = 4;
										var189 = var189.method635(field263.length());
									} else if (var192.method619(field4050)) {
										var189 = var189.method635(field4050.length());
										var193 = 5;
									} else if (Client.lang != 0) {
										if (var192.method619(Text.CHATEFFECT_WAVE)) {
											var193 = 1;
											var189 = var189.method635(Text.CHATEFFECT_WAVE.length());
										} else if (var192.method619(Text.CHATEFFECT_WAVE2)) {
											var189 = var189.method635(Text.CHATEFFECT_WAVE2.length());
											var193 = 2;
										} else if (var192.method619(Text.CHATEFFECT_SHAKE)) {
											var189 = var189.method635(Text.CHATEFFECT_SHAKE.length());
											var193 = 3;
										} else if (var192.method619(Text.CHATEFFECT_SCROLL)) {
											var193 = 4;
											var189 = var189.method635(Text.CHATEFFECT_SCROLL.length());
										} else if (var192.method619(Text.CHATEFFECT_SLIDE)) {
											var193 = 5;
											var189 = var189.method635(Text.CHATEFFECT_SLIDE.length());
										}
									}
									Client.out.p1Enc(189);
									Client.out.p1(0);
									int var194 = Client.out.pos;
									Client.out.p1(var191);
									Client.out.p1(var193);
									WordPack.pack(Client.out, var189);
									Client.out.method341(Client.out.pos - var194);
									continue;
								}
								if (var382 == 5009) {
									var6 -= 2;
									JagString var195 = stringStack[var6];
									JagString var196 = stringStack[var6 + 1];
									if (Client.staffmodlevel != 0 || Client.underage != 1 && Client.mapQuickchat != 1) {
										Client.out.p1Enc(80);
										Client.out.p1(0);
										int var197 = Client.out.pos;
										Client.out.p8(var195.toUserhash());
										WordPack.pack(Client.out, var196);
										Client.out.method341(Client.out.pos - var197);
									}
									continue;
								}
								if (var382 == 5010) {
									var5--;
									int var198 = intStack[var5];
									JagString var199 = null;
									if (var198 < 100) {
										var199 = Client.chatUsername[var198];
									}
									if (var199 == null) {
										var199 = field1468;
									}
									stringStack[var6++] = var199;
									continue;
								}
								if (var382 == 5011) {
									JagString var200 = null;
									var5--;
									int var201 = intStack[var5];
									if (var201 < 100) {
										var200 = Client.chatScreenName[var201];
									}
									if (var200 == null) {
										var200 = field1468;
									}
									stringStack[var6++] = var200;
									continue;
								}
								if (var382 == 5012) {
									int var202 = -1;
									var5--;
									int var203 = intStack[var5];
									if (var203 < 100) {
										var202 = Client.field2483[var203];
									}
									intStack[var5++] = var202;
									continue;
								}
								if (var382 == 5015) {
									JagString var204;
									if (Client.localPlayer == null || Client.localPlayer.name == null) {
										var204 = TitleScreen.loginUser;
									} else {
										var204 = Client.localPlayer.name;
									}
									stringStack[var6++] = var204;
									continue;
								}
								if (var382 == 5016) {
									intStack[var5++] = Client.chatTradeMode;
									continue;
								}
								if (var382 == 5017) {
									intStack[var5++] = Client.chatHistoryLength;
									continue;
								}
								if (var382 == 5050) {
									var5--;
									int var205 = intStack[var5];
									stringStack[var6++] = QuickChatCatTypeList.list(var205).description;
									continue;
								}
								if (var382 == 5051) {
									var5--;
									int var206 = intStack[var5];
									QuickChatCatTypeList var207 = QuickChatCatTypeList.list(var206);
									if (var207.subcategoryIds == null) {
										intStack[var5++] = 0;
									} else {
										intStack[var5++] = var207.subcategoryIds.length;
									}
									continue;
								}
								if (var382 == 5052) {
									var5 -= 2;
									int var208 = intStack[var5];
									int var209 = intStack[var5 + 1];
									QuickChatCatTypeList var210 = QuickChatCatTypeList.list(var208);
									int var211 = var210.subcategoryIds[var209];
									intStack[var5++] = var211;
									continue;
								}
								if (var382 == 5053) {
									var5--;
									int var212 = intStack[var5];
									QuickChatCatTypeList var213 = QuickChatCatTypeList.list(var212);
									if (var213.phraseIds == null) {
										intStack[var5++] = 0;
									} else {
										intStack[var5++] = var213.phraseIds.length;
									}
									continue;
								}
								if (var382 == 5054) {
									var5 -= 2;
									int var214 = intStack[var5];
									int var215 = intStack[var5 + 1];
									intStack[var5++] = QuickChatCatTypeList.list(var214).phraseIds[var215];
									continue;
								}
								if (var382 == 5055) {
									var5--;
									int var216 = intStack[var5];
									stringStack[var6++] = QuickChatPhraseType.list(var216).getText();
									continue;
								}
								if (var382 == 5056) {
									var5--;
									int var217 = intStack[var5];
									QuickChatPhraseType var218 = QuickChatPhraseType.list(var217);
									if (var218.autoResponses == null) {
										intStack[var5++] = 0;
									} else {
										intStack[var5++] = var218.autoResponses.length;
									}
									continue;
								}
								if (var382 == 5057) {
									var5 -= 2;
									int var219 = intStack[var5 + 1];
									int var220 = intStack[var5];
									intStack[var5++] = QuickChatPhraseType.list(var220).autoResponses[var219];
									continue;
								}
								if (var382 == 5058) {
									field226 = new QuickChatPhrase();
									var5--;
									field226.field4058 = intStack[var5];
									field226.field4065 = QuickChatPhraseType.list(field226.field4058);
									field226.field4068 = new int[field226.field4065.getDynamicCommandCount()];
									continue;
								}
								if (var382 == 5059) {
									Client.out.p1Enc(197);
									Client.out.p1(0);
									int var221 = Client.out.pos;
									Client.out.p1(0);
									Client.out.p2(field226.field4058);
									field226.field4065.encodeMessage(Client.out, field226.field4068);
									Client.out.method341(Client.out.pos - var221);
									continue;
								}
								if (var382 == 5060) {
									var6--;
									JagString var222 = stringStack[var6];
									Client.out.p1Enc(242);
									Client.out.p1(0);
									int var223 = Client.out.pos;
									Client.out.p8(var222.toUserhash());
									Client.out.p2(field226.field4058);
									field226.field4065.encodeMessage(Client.out, field226.field4068);
									Client.out.method341(Client.out.pos - var223);
									continue;
								}
								if (var382 == 5061) {
									Client.out.p1Enc(197);
									Client.out.p1(0);
									int var224 = Client.out.pos;
									Client.out.p1(1);
									Client.out.p2(field226.field4058);
									field226.field4065.encodeMessage(Client.out, field226.field4068);
									Client.out.method341(Client.out.pos - var224);
									continue;
								}
								if (var382 == 5062) {
									var5 -= 2;
									int var225 = intStack[var5 + 1];
									int var226 = intStack[var5];
									intStack[var5++] = QuickChatCatTypeList.list(var226).subcategoryShortcuts[var225];
									continue;
								}
								if (var382 == 5063) {
									var5 -= 2;
									int var227 = intStack[var5 + 1];
									int var228 = intStack[var5];
									intStack[var5++] = QuickChatCatTypeList.list(var228).phraseShortcuts[var227];
									continue;
								}
								if (var382 == 5064) {
									var5 -= 2;
									int var229 = intStack[var5];
									int var230 = intStack[var5 + 1];
									if (var230 == -1) {
										intStack[var5++] = -1;
									} else {
										intStack[var5++] = QuickChatCatTypeList.list(var229).getSubcategoryByShortcut(var230);
									}
									continue;
								}
								if (var382 == 5065) {
									var5 -= 2;
									int var231 = intStack[var5];
									int var232 = intStack[var5 + 1];
									if (var232 == -1) {
										intStack[var5++] = -1;
									} else {
										intStack[var5++] = QuickChatCatTypeList.list(var231).getPhraseByShortcut(var232);
									}
									continue;
								}
								if (var382 == 5066) {
									var5--;
									int var233 = intStack[var5];
									intStack[var5++] = QuickChatPhraseType.list(var233).getDynamicCommandCount();
									continue;
								}
								if (var382 == 5067) {
									var5 -= 2;
									int var234 = intStack[var5];
									int var235 = intStack[var5 + 1];
									int var236 = QuickChatPhraseType.list(var234).getDynamicCommand(var235);
									intStack[var5++] = var236;
									continue;
								}
								if (var382 == 5068) {
									var5 -= 2;
									int var237 = intStack[var5 + 1];
									int var238 = intStack[var5];
									field226.field4068[var238] = var237;
									continue;
								}
								if (var382 == 5069) {
									var5 -= 2;
									int var239 = intStack[var5];
									int var240 = intStack[var5 + 1];
									field226.field4068[var239] = var240;
									continue;
								}
								if (var382 == 5070) {
									var5 -= 3;
									int var241 = intStack[var5];
									int var242 = intStack[var5 + 1];
									int var243 = intStack[var5 + 2];
									QuickChatPhraseType var244 = QuickChatPhraseType.list(var241);
									if (var244.getDynamicCommand(var242) != 0) {
										throw new RuntimeException("bad command");
									}
									intStack[var5++] = var244.getDynamicCommandParam(var243, var242);
									continue;
								}
							} else if (var382 < 5200) {
								if (var382 == 5100) {
									if (ClientKeyboardListener.keyHeld[86]) {
										intStack[var5++] = 1;
									} else {
										intStack[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5101) {
									if (ClientKeyboardListener.keyHeld[82]) {
										intStack[var5++] = 1;
									} else {
										intStack[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5102) {
									if (ClientKeyboardListener.keyHeld[81]) {
										intStack[var5++] = 1;
									} else {
										intStack[var5++] = 0;
									}
									continue;
								}
							} else if (var382 < 5300) {
								if (var382 == 5200) {
									var5--;
									WorldMap.setZoom(intStack[var5]);
									continue;
								}
								if (var382 == 5201) {
									intStack[var5++] = WorldMap.getZoom();
									continue;
								}
								if (var382 == 5202) {
									var5--;
									WorldMap.flashMapFunction(intStack[var5]);
									continue;
								}
								if (var382 == 5203) {
									var6--;
									WorldMap.jumpToLabel(stringStack[var6]);
									continue;
								}
								if (var382 == 5204) {
									stringStack[var6 - 1] = WorldMap.getLabelName(stringStack[var6 - 1]);
									continue;
								}
								if (var382 == 5205) {
									var6--;
									WorldMap.setMap(stringStack[var6]);
									continue;
								}
							} else if (var382 >= 5400) {
								if (var382 < 5500) {
									if (var382 == 5400) {
										var6 -= 2;
										JagString var245 = stringStack[var6];
										JagString var246 = stringStack[var6 + 1];
										var5--;
										int var247 = intStack[var5];
										Client.out.p1Enc(85);
										Client.out.p1(Packet.pjstrlen(var245) + Packet.pjstrlen(var246) + 1);
										Client.out.pjstr(var245);
										Client.out.pjstr(var246);
										Client.out.p1(var247);
										continue;
									}
									if (var382 == 5401) {
										var5 -= 2;
										Client.clientpalette[intStack[var5]] = (short) FloType.getColour(intStack[var5 + 1]);
										ObjType.resetModelCache();
										ObjType.resetSpriteCache();
										NpcType.resetModelCache();
										NpcType.resetHeadModelCache();
										Client.redrawAllComponents();
										continue;
									}
								}
							} else if (var382 == 5304) {
								intStack[var5++] = 0;
								continue;
							}
						} else if (var382 == 4500) {
							var5 -= 2;
							int var248 = intStack[var5 + 1];
							int var249 = intStack[var5];
							ParamType var250 = ParamType.list(var248);
							if (var250.isString()) {
								stringStack[var6++] = StructType.list(var249).getParamString(var250.defaultString, var248);
							} else {
								intStack[var5++] = StructType.list(var249).getParamInt(var250.defaultInt, var248);
							}
							continue;
						}
					} else if (var382 == 4400) {
						var5 -= 2;
						int var251 = intStack[var5];
						int var252 = intStack[var5 + 1];
						ParamType var253 = ParamType.list(var252);
						if (var253.isString()) {
							stringStack[var6++] = LocType.list(var251).getParamString(var253.defaultString, var252);
						} else {
							intStack[var5++] = LocType.list(var251).getParamInt(var253.defaultInt, var252);
						}
						continue;
					}
				} else {
					IfType var361;
					if (var382 < 2000) {
						var361 = var43 ? activeComponent2 : activeComponent;
					} else {
						var5--;
						var361 = IfType.get(intStack[var5]);
						var382 -= 1000;
					}
					if (var382 == 1300) {
						var5--;
						int var362 = intStack[var5] - 1;
						if (var362 >= 0 && var362 <= 9) {
							var6--;
							var361.setOpName(stringStack[var6], var362);
							continue;
						}
						var6--;
						continue;
					}
					if (var382 == 1301) {
						var5 -= 2;
						int var363 = intStack[var5];
						int var364 = intStack[var5 + 1];
						var361.draggable = IfType.get(var364, var363);
						continue;
					}
					if (var382 == 1302) {
						var5--;
						var361.draggablebehavior = intStack[var5] == 1;
						continue;
					}
					if (var382 == 1303) {
						var5--;
						var361.dragdeadzone = intStack[var5];
						continue;
					}
					if (var382 == 1304) {
						var5--;
						var361.dragdeadtime = intStack[var5];
						continue;
					}
					if (var382 == 1305) {
						var6--;
						var361.baseOpName = stringStack[var6];
						continue;
					}
					if (var382 == 1306) {
						var6--;
						var361.targetVerb = stringStack[var6];
						continue;
					}
					if (var382 == 1307) {
						var361.opNames = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var381) {
			if (var4.name == null) {
				if (Client.modewhere != 0) {
					Client.addChat(field3563, 0, field1468);
				}
				JagException.report("CS2 - scr:" + var4.key + " op:" + var9, var381);
			} else {
				JagString var378 = JagString.method1135(30);
				var378.method616(field3010).method616(var4.name);
				for (int var379 = fp - 1; var379 >= 0; var379--) {
					var378.method616(field356).method616(frames[var379].script.name);
				}
				if (var9 == 40) {
					int var380 = var8[var7];
					var378.method616(field2496).method616(JagString.method1212(var380));
				}
				if (Client.modewhere != 0) {
					Client.addChat(JagString.join(new JagString[]{field288, var4.name}), 0, field1468);
				}
				JagException.report("CS2 - scr:" + var4.key + " op:" + var9 + new String(var378.method613()), var381);
			}
		}
	}

	@ObfuscatedName("sd.a(Lde;I)V")
	public static void executeScript(HookReq arg0) {
		executeScript(arg0, 200000);
	}

	@ObfuscatedName("nd.a(BI)V")
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
				executeScript(var4, 2000000);
			}
		}
	}
}
