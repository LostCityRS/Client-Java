package jagex3.client;

import deob.*;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.IntNode;
import jagex3.graphics.PixfontGeneric;
import jagex3.graphics.SoftwarePixFont;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

import java.util.Date;

public class ScriptRunner {
	@ObfuscatedName("md.a(BLi;)Z")
	public static boolean method901(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < Statics.field2729; var1++) {
			if (arg0.method624(Statics.field370[var1])) {
				return true;
			}
		}
		return arg0.method624(Client.localPlayer.field766);
	}

	@ObfuscatedName("md.a(BLde;I)V")
	public static void executeScript(HookReq arg0, int arg1) {
		Object[] var2 = arg0.field681;
		int var3 = (Integer) var2[0];
		ClientScript var4 = ClientScript.method427(var3);
		if (var4 == null) {
			return;
		}
		int var5 = 0;
		int var6 = 0;
		Statics.field4318 = 0;
		int var7 = -1;
		int[] var8 = var4.field4521;
		byte var9 = -1;
		int[] var10 = var4.field4519;
		try {
			Statics.field4477 = new int[var4.field4526];
			Statics.field2963 = new JagString[var4.field4517];
			int var11 = 0;
			int var12 = 0;
			for (int var13 = 1; var13 < var2.length; var13++) {
				if (var2[var13] instanceof Integer) {
					int var14 = (Integer) var2[var13];
					if (var14 == -2147483647) {
						var14 = arg0.field694;
					}
					if (var14 == -2147483646) {
						var14 = arg0.field691;
					}
					if (var14 == -2147483645) {
						var14 = arg0.field678 == null ? -1 : arg0.field678.parentId;
					}
					if (var14 == -2147483644) {
						var14 = arg0.field679;
					}
					if (var14 == -2147483643) {
						var14 = arg0.field678 == null ? -1 : arg0.field678.field3406;
					}
					if (var14 == -2147483642) {
						var14 = arg0.field676 == null ? -1 : arg0.field676.parentId;
					}
					if (var14 == -2147483641) {
						var14 = arg0.field676 == null ? -1 : arg0.field676.field3406;
					}
					if (var14 == -2147483640) {
						var14 = arg0.field682;
					}
					if (var14 == -2147483639) {
						var14 = arg0.field692;
					}
					Statics.field4477[var12++] = var14;
				} else if (var2[var13] instanceof JagString) {
					JagString var15 = (JagString) var2[var13];
					if (var15.method597(Statics.field3707)) {
						var15 = arg0.field677;
					}
					Statics.field2963[var11++] = var15;
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
						Statics.field1944[var5++] = var8[var7];
						continue;
					}
					if (var382 == 1) {
						int var17 = var8[var7];
						Statics.field1944[var5++] = Client.field2050[var17];
						continue;
					}
					if (var382 == 2) {
						int var18 = var8[var7];
						var5--;
						Client.field2050[var18] = Statics.field1944[var5];
						continue;
					}
					if (var382 == 3) {
						Statics.field3330[var6++] = var4.field4522[var7];
						continue;
					}
					if (var382 == 6) {
						var7 += var8[var7];
						continue;
					}
					if (var382 == 7) {
						var5 -= 2;
						if (Statics.field1944[var5] != Statics.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 8) {
						var5 -= 2;
						if (Statics.field1944[var5 + 1] == Statics.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 9) {
						var5 -= 2;
						if (Statics.field1944[var5 + 1] > Statics.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 10) {
						var5 -= 2;
						if (Statics.field1944[var5] > Statics.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 21) {
						if (Statics.field4318 == 0) {
							return;
						}
						ClientGosubFrame var19 = Statics.field1446[--Statics.field4318];
						Statics.field2963 = var19.field2604;
						Statics.field4477 = var19.field2599;
						var4 = var19.field2605;
						var7 = var19.field2603;
						var8 = var4.field4521;
						var10 = var4.field4519;
						continue;
					}
					if (var382 == 25) {
						int var20 = var8[var7];
						Statics.field1944[var5++] = Statics.method930(var20);
						continue;
					}
					if (var382 == 27) {
						int var21 = var8[var7];
						var5--;
						Statics.method755(var21, Statics.field1944[var5]);
						continue;
					}
					if (var382 == 31) {
						var5 -= 2;
						if (Statics.field1944[var5 + 1] >= Statics.field1944[var5]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 32) {
						var5 -= 2;
						if (Statics.field1944[var5] >= Statics.field1944[var5 + 1]) {
							var7 += var8[var7];
						}
						continue;
					}
					if (var382 == 33) {
						Statics.field1944[var5++] = Statics.field4477[var8[var7]];
						continue;
					}
					int var10001;
					if (var382 == 34) {
						var10001 = var8[var7];
						var5--;
						Statics.field4477[var10001] = Statics.field1944[var5];
						continue;
					}
					if (var382 == 35) {
						Statics.field3330[var6++] = Statics.field2963[var8[var7]];
						continue;
					}
					if (var382 == 36) {
						var10001 = var8[var7];
						var6--;
						Statics.field2963[var10001] = Statics.field3330[var6];
						continue;
					}
					if (var382 == 37) {
						int var22 = var8[var7];
						var6 -= var22;
						JagString var23 = JagString.method1133(var22, Statics.field3330, var6);
						Statics.field3330[var6++] = var23;
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
						ClientScript var25 = ClientScript.method427(var24);
						JagString[] var26 = new JagString[var25.field4517];
						int[] var27 = new int[var25.field4526];
						for (int var28 = 0; var28 < var25.field4520; var28++) {
							var27[var28] = Statics.field1944[var28 + var5 - var25.field4520];
						}
						for (int var29 = 0; var29 < var25.field4518; var29++) {
							var26[var29] = Statics.field3330[var29 + var6 - var25.field4518];
						}
						var5 -= var25.field4520;
						var6 -= var25.field4518;
						ClientGosubFrame var30 = new ClientGosubFrame();
						var30.field2605 = var4;
						var30.field2604 = Statics.field2963;
						var30.field2603 = var7;
						var30.field2599 = Statics.field4477;
						if (Statics.field4318 >= Statics.field1446.length) {
							throw new RuntimeException();
						}
						var4 = var25;
						var7 = -1;
						Statics.field1446[Statics.field4318++] = var30;
						var10 = var25.field4519;
						Statics.field4477 = var27;
						var8 = var25.field4521;
						Statics.field2963 = var26;
						continue;
					}
					if (var382 == 42) {
						Statics.field1944[var5++] = Statics.field2167[var8[var7]];
						continue;
					}
					if (var382 == 43) {
						var10001 = var8[var7];
						var5--;
						Statics.field2167[var10001] = Statics.field1944[var5];
						continue;
					}
					if (var382 == 44) {
						int var31 = var8[var7] >> 16;
						var5--;
						int var32 = Statics.field1944[var5];
						int var33 = var8[var7] & 0xFFFF;
						if (var32 >= 0 && var32 <= 5000) {
							Statics.field1762[var31] = var32;
							byte var34 = -1;
							if (var33 == 105) {
								var34 = 0;
							}
							int var35 = 0;
							while (true) {
								if (var35 >= var32) {
									continue label2550;
								}
								Statics.field247[var31][var35] = var34;
								var35++;
							}
						}
						throw new RuntimeException();
					}
					if (var382 == 45) {
						int var36 = var8[var7];
						var5--;
						int var37 = Statics.field1944[var5];
						if (var37 >= 0 && Statics.field1762[var36] > var37) {
							Statics.field1944[var5++] = Statics.field247[var36][var37];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 46) {
						var5 -= 2;
						int var38 = Statics.field1944[var5];
						int var39 = var8[var7];
						if (var38 >= 0 && var38 < Statics.field1762[var39]) {
							Statics.field247[var39][var38] = Statics.field1944[var5 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (var382 == 47) {
						JagString var40 = Statics.field114[var8[var7]];
						if (var40 == null) {
							var40 = Statics.field207;
						}
						Statics.field3330[var6++] = var40;
						continue;
					}
					if (var382 == 48) {
						var10001 = var8[var7];
						var6--;
						Statics.field114[var10001] = Statics.field3330[var6];
						continue;
					}
					if (var382 == 51) {
						HashTable var41 = var4.field4514[var8[var7]];
						var5--;
						IntNode var42 = (IntNode) var41.method1049((long) Statics.field1944[var5]);
						if (var42 != null) {
							var7 += var42.field3698;
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
						int var44 = Statics.field1944[var5];
						int var45 = Statics.field1944[var5 + 1];
						int var46 = Statics.field1944[var5 + 2];
						if (var45 == 0) {
							throw new RuntimeException();
						}
						IfType var47 = Client.method1579(var44);
						if (var47.field3465 == null) {
							var47.field3465 = new IfType[var46 + 1];
						}
						if (var46 >= var47.field3465.length) {
							IfType[] var48 = new IfType[var46 + 1];
							for (int var49 = 0; var49 < var47.field3465.length; var49++) {
								var48[var49] = var47.field3465[var49];
							}
							var47.field3465 = var48;
						}
						if (var46 > 0 && var47.field3465[var46 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var46 - 1));
						}
						IfType var50 = new IfType();
						var50.field3410 = true;
						var50.field3406 = var46;
						var50.field3390 = var45;
						var50.field3504 = var50.parentId = var47.parentId;
						var47.field3465[var46] = var50;
						if (var43) {
							Statics.field3871 = var50;
						} else {
							Statics.field2426 = var50;
						}
						Client.method1371(var47);
						continue;
					}
					if (var382 == 101) {
						IfType var51 = var43 ? Statics.field3871 : Statics.field2426;
						if (var51.field3406 == -1) {
							if (var43) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						IfType var52 = Client.method1579(var51.parentId);
						var52.field3465[var51.field3406] = null;
						Client.method1371(var52);
						continue;
					}
					if (var382 == 102) {
						var5--;
						IfType var53 = Client.method1579(Statics.field1944[var5]);
						var53.field3465 = null;
						Client.method1371(var53);
						continue;
					}
					if (var382 == 200) {
						var5 -= 2;
						int var54 = Statics.field1944[var5 + 1];
						int var55 = Statics.field1944[var5];
						IfType var56 = Statics.method238(var54, var55);
						if (var56 != null && var54 != -1) {
							Statics.field1944[var5++] = 1;
							if (var43) {
								Statics.field3871 = var56;
							} else {
								Statics.field2426 = var56;
							}
							continue;
						}
						Statics.field1944[var5++] = 0;
						continue;
					}
					if (var382 == 201) {
						var5--;
						int var57 = Statics.field1944[var5];
						IfType var58 = Client.method1579(var57);
						if (var58 == null) {
							Statics.field1944[var5++] = 0;
						} else {
							Statics.field1944[var5++] = 1;
							if (var43) {
								Statics.field3871 = var58;
							} else {
								Statics.field2426 = var58;
							}
						}
						continue;
					}
				} else if (var382 < 500) {
					if (var382 == 403) {
						var5 -= 2;
						int var372 = Statics.field1944[var5];
						if (var372 >= 7) {
							var372 -= 7;
						}
						int var373 = Statics.field1944[var5 + 1];
						Client.localPlayer.field768.method1435(var372, var373);
						continue;
					}
					if (var382 == 404) {
						var5 -= 2;
						int var374 = Statics.field1944[var5 + 1];
						int var375 = Statics.field1944[var5];
						Client.localPlayer.field768.method1432(var374, var375);
						continue;
					}
					if (var382 == 410) {
						var5--;
						boolean var376 = Statics.field1944[var5] != 0;
						Client.localPlayer.field768.method1434(var376);
						continue;
					}
				} else if (var382 >= 1000 && var382 < 1100 || !(var382 < 2000 || var382 >= 2100)) {
					IfType var368;
					if (var382 < 2000) {
						var368 = var43 ? Statics.field3871 : Statics.field2426;
					} else {
						var382 -= 1000;
						var5--;
						var368 = Client.method1579(Statics.field1944[var5]);
					}
					if (var382 == 1000) {
						var368.field3367 = 0;
						var5 -= 2;
						var368.field3366 = var368.field3391 = Statics.field1944[var5];
						var368.field3451 = 0;
						var368.field3441 = var368.field3514 = Statics.field1944[var5 + 1];
						Client.method1371(var368);
						continue;
					}
					if (var382 == 1001) {
						var368.field3463 = 0;
						var5 -= 2;
						var368.field3380 = var368.field3501 = Statics.field1944[var5];
						var368.field3468 = 0;
						var368.field3394 = 0;
						var368.field3422 = var368.field3418 = Statics.field1944[var5 + 1];
						var368.field3417 = 0;
						Client.method1371(var368);
						if (var368.field3390 == 0) {
							Client.method759(false, var368);
						}
						Client.method10(var368);
						continue;
					}
					if (var382 == 1003) {
						var5--;
						boolean var369 = Statics.field1944[var5] == 1;
						if (var368.field3378 != var369) {
							var368.field3378 = var369;
							Client.method1371(var368);
						}
						continue;
					}
					if (var382 == 1004) {
						var5 -= 4;
						var368.field3391 = Statics.field1944[var5];
						var368.field3514 = Statics.field1944[var5 + 1];
						int var370 = Statics.field1944[var5 + 2];
						int var371 = Statics.field1944[var5 + 3];
						if (var371 < 0) {
							var371 = 0;
						} else if (var371 > 2) {
							var371 = 2;
						}
						var368.field3451 = (byte) (var371 + 3);
						if (var370 < 0) {
							var370 = 0;
						} else if (var370 > 2) {
							var370 = 2;
						}
						var368.field3367 = (byte) (var370 + 3);
						Client.method1371(var368);
						Client.method10(var368);
						continue;
					}
					if (var382 == 1005) {
						var368.field3367 = 2;
						var5 -= 2;
						var368.field3391 = Statics.field1944[var5];
						var368.field3451 = 2;
						var368.field3514 = Statics.field1944[var5 + 1];
						Client.method1371(var368);
						if (var368.field3390 == 0) {
							Client.method759(false, var368);
						}
						Client.method10(var368);
						continue;
					}
				} else if (var382 >= 1100 && var382 < 1200 || !(var382 < 2100 || var382 >= 2200)) {
					IfType var365;
					if (var382 >= 2000) {
						var5--;
						var365 = Client.method1579(Statics.field1944[var5]);
						var382 -= 1000;
					} else {
						var365 = var43 ? Statics.field3871 : Statics.field2426;
					}
					if (var382 == 1100) {
						var5 -= 2;
						var365.field3393 = Statics.field1944[var5];
						if (var365.field3384 - var365.field3380 < var365.field3393) {
							var365.field3393 = var365.field3384 - var365.field3380;
						}
						if (var365.field3393 < 0) {
							var365.field3393 = 0;
						}
						var365.field3415 = Statics.field1944[var5 + 1];
						if (var365.field3415 > var365.field3375 - var365.field3422) {
							var365.field3415 = var365.field3375 - var365.field3422;
						}
						if (var365.field3415 < 0) {
							var365.field3415 = 0;
						}
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1101) {
						var5--;
						var365.field3414 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1102) {
						var5--;
						var365.field3496 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1103) {
						var5--;
						var365.field3480 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1104) {
						var5--;
						var365.field3497 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1105) {
						var5--;
						var365.field3473 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1106) {
						var5--;
						var365.field3437 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1107) {
						var5--;
						var365.field3420 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1108) {
						var365.field3430 = 1;
						var5--;
						var365.field3409 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1109) {
						var5 -= 6;
						var365.field3365 = Statics.field1944[var5];
						var365.field3498 = Statics.field1944[var5 + 1];
						var365.field3455 = Statics.field1944[var5 + 2];
						var365.field3509 = Statics.field1944[var5 + 3];
						var365.field3517 = Statics.field1944[var5 + 4];
						var365.field3485 = Statics.field1944[var5 + 5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1110) {
						var5--;
						int var366 = Statics.field1944[var5];
						if (var365.field3404 != var366) {
							var365.field3487 = 0;
							var365.field3404 = var366;
							var365.field3379 = 0;
							Client.method1371(var365);
						}
						continue;
					}
					if (var382 == 1111) {
						var5--;
						var365.field3403 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1112) {
						var6--;
						JagString var367 = Statics.field3330[var6];
						if (!var367.method597(var365.field3383)) {
							var365.field3383 = var367;
							Client.method1371(var365);
						}
						continue;
					}
					if (var382 == 1113) {
						var5--;
						var365.field3461 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1114) {
						var5 -= 3;
						var365.field3479 = Statics.field1944[var5];
						var365.field3469 = Statics.field1944[var5 + 1];
						var365.field3396 = Statics.field1944[var5 + 2];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1115) {
						var5--;
						var365.field3435 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1116) {
						var5--;
						var365.field3429 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1117) {
						var5--;
						var365.field3425 = Statics.field1944[var5];
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1118) {
						var5--;
						var365.field3387 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1119) {
						var5--;
						var365.field3483 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
					if (var382 == 1120) {
						var5 -= 2;
						var365.field3384 = Statics.field1944[var5];
						var365.field3375 = Statics.field1944[var5 + 1];
						Client.method1371(var365);
						if (var365.field3390 == 0) {
							Client.method759(false, var365);
						}
						continue;
					}
					if (var382 == 1121) {
						Client.method1371(var365);
						var5--;
						continue;
					}
					if (var382 == 1122) {
						var5--;
						var365.field3477 = Statics.field1944[var5] == 1;
						Client.method1371(var365);
						continue;
					}
				} else if (var382 >= 1200 && var382 < 1300 || var382 >= 2200 && var382 < 2300) {
					IfType var59;
					if (var382 >= 2000) {
						var382 -= 1000;
						var5--;
						var59 = Client.method1579(Statics.field1944[var5]);
					} else {
						var59 = var43 ? Statics.field3871 : Statics.field2426;
					}
					Client.method1371(var59);
					if (var382 == 1200 || var382 == 1205) {
						var5 -= 2;
						int var60 = Statics.field1944[var5 + 1];
						int var61 = Statics.field1944[var5];
						if (var61 == -1) {
							var59.field3399 = -1;
							var59.field3409 = -1;
							var59.field3430 = 1;
						} else {
							var59.field3399 = var61;
							var59.field3482 = var60;
							ObjType var62 = ObjType.list(var61);
							var59.field3365 = var62.field2876;
							var59.field3509 = var62.field2872;
							var59.field3498 = var62.field2870;
							if (var382 == 1205) {
								var59.field3464 = false;
							} else {
								var59.field3464 = true;
							}
							var59.field3455 = var62.field2873;
							var59.field3517 = var62.field2847;
							var59.field3485 = var62.field2889;
							if (var59.field3468 > 0) {
								var59.field3485 = var59.field3485 * 32 / var59.field3468;
							} else if (var59.field3501 > 0) {
								var59.field3485 = var59.field3485 * 32 / var59.field3501;
							}
						}
						continue;
					}
					if (var382 == 1201) {
						var59.field3430 = 2;
						var5--;
						var59.field3409 = Statics.field1944[var5];
						continue;
					}
					if (var382 == 1202) {
						var59.field3430 = 3;
						var59.field3409 = Client.localPlayer.field768.method1427();
						continue;
					}
					if (var382 == 1203) {
						var59.field3430 = 6;
						var5--;
						var59.field3409 = Statics.field1944[var5];
						continue;
					}
					if (var382 == 1204) {
						var59.field3430 = 5;
						var5--;
						var59.field3409 = Statics.field1944[var5];
						continue;
					}
				} else if ((var382 < 1300 || var382 >= 1400) && (var382 < 2300 || var382 >= 2400)) {
					if (var382 >= 1400 && var382 < 1500 || var382 >= 2400 && var382 < 2500) {
						int[] var63 = null;
						IfType var64;
						if (var382 < 2000) {
							var64 = var43 ? Statics.field3871 : Statics.field2426;
						} else {
							var5--;
							var64 = Client.method1579(Statics.field1944[var5]);
							var382 -= 1000;
						}
						var6--;
						JagString var65 = Statics.field3330[var6];
						if (var65.method604() > 0 && var65.method599(var65.method604() - 1) == 89) {
							var5--;
							int var66 = Statics.field1944[var5];
							if (var66 > 0) {
								var63 = new int[var66];
								while (var66-- > 0) {
									var5--;
									var63[var66] = Statics.field1944[var5];
								}
							}
							var65 = var65.method623(0, var65.method604() - 1);
						}
						Object[] var67 = new Object[var65.method604() + 1];
						for (int var68 = var67.length - 1; var68 >= 1; var68--) {
							if (var65.method599(var68 - 1) == 115) {
								var6--;
								var67[var68] = Statics.field3330[var6];
							} else {
								var5--;
								var67[var68] = Integer.valueOf(Statics.field1944[var5]);
							}
						}
						var5--;
						int var69 = Statics.field1944[var5];
						if (var69 == -1) {
							var67 = null;
						} else {
							var67[0] = Integer.valueOf(var69);
						}
						if (var382 == 1417) {
							var64.field3471 = var67;
						}
						if (var382 == 1403) {
							var64.field3370 = var67;
						}
						if (var382 == 1421) {
							var64.field3381 = var67;
						}
						if (var382 == 1407) {
							var64.field3481 = var67;
							var64.field3450 = var63;
						}
						if (var382 == 1408) {
							var64.field3458 = var67;
						}
						if (var382 == 1412) {
							var64.field3510 = var67;
						}
						if (var382 == 1418) {
							var64.field3518 = var67;
						}
						if (var382 == 1405) {
							var64.field3456 = var67;
						}
						if (var382 == 1402) {
							var64.field3408 = var67;
						}
						if (var382 == 1420) {
							var64.field3484 = var67;
						}
						if (var382 == 1400) {
							var64.field3490 = var67;
						}
						if (var382 == 1425) {
							var64.field3505 = var67;
						}
						if (var382 == 1404) {
							var64.field3448 = var67;
						}
						if (var382 == 1427) {
							var64.field3426 = var67;
						}
						if (var382 == 1423) {
							var64.field3434 = var67;
						}
						if (var382 == 1401) {
							var64.field3503 = var67;
						}
						if (var382 == 1422) {
							var64.field3444 = var67;
						}
						if (var382 == 1409) {
							var64.field3401 = var67;
						}
						if (var382 == 1419) {
							var64.field3377 = var67;
						}
						if (var382 == 1414) {
							var64.field3443 = var67;
							var64.field3369 = var63;
						}
						if (var382 == 1406) {
							var64.field3440 = var67;
						}
						var64.field3449 = true;
						if (var382 == 1411) {
							var64.field3452 = var67;
						}
						if (var382 == 1415) {
							var64.field3398 = var63;
							var64.field3454 = var67;
						}
						if (var382 == 1416) {
							var64.field3447 = var67;
						}
						if (var382 == 1424) {
							var64.field3495 = var67;
						}
						if (var382 == 1410) {
							var64.field3412 = var67;
						}
						continue;
					}
					if (var382 < 1600) {
						IfType var70 = var43 ? Statics.field3871 : Statics.field2426;
						if (var382 == 1500) {
							Statics.field1944[var5++] = var70.field3366;
							continue;
						}
						if (var382 == 1501) {
							Statics.field1944[var5++] = var70.field3441;
							continue;
						}
						if (var382 == 1502) {
							Statics.field1944[var5++] = var70.field3380;
							continue;
						}
						if (var382 == 1503) {
							Statics.field1944[var5++] = var70.field3422;
							continue;
						}
						if (var382 == 1504) {
							Statics.field1944[var5++] = var70.field3378 ? 1 : 0;
							continue;
						}
						if (var382 == 1505) {
							Statics.field1944[var5++] = var70.field3504;
							continue;
						}
					} else if (var382 < 1700) {
						IfType var71 = var43 ? Statics.field3871 : Statics.field2426;
						if (var382 == 1600) {
							Statics.field1944[var5++] = var71.field3393;
							continue;
						}
						if (var382 == 1601) {
							Statics.field1944[var5++] = var71.field3415;
							continue;
						}
						if (var382 == 1602) {
							Statics.field3330[var6++] = var71.field3383;
							continue;
						}
						if (var382 == 1603) {
							Statics.field1944[var5++] = var71.field3384;
							continue;
						}
						if (var382 == 1604) {
							Statics.field1944[var5++] = var71.field3375;
							continue;
						}
						if (var382 == 1605) {
							Statics.field1944[var5++] = var71.field3485;
							continue;
						}
						if (var382 == 1606) {
							Statics.field1944[var5++] = var71.field3455;
							continue;
						}
						if (var382 == 1607) {
							Statics.field1944[var5++] = var71.field3517;
							continue;
						}
						if (var382 == 1608) {
							Statics.field1944[var5++] = var71.field3509;
							continue;
						}
						if (var382 == 1609) {
							Statics.field1944[var5++] = var71.field3480;
							continue;
						}
					} else if (var382 < 1800) {
						IfType var72 = var43 ? Statics.field3871 : Statics.field2426;
						if (var382 == 1700) {
							Statics.field1944[var5++] = var72.field3399;
							continue;
						}
						if (var382 == 1701) {
							if (var72.field3399 == -1) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = var72.field3482;
							}
							continue;
						}
						if (var382 == 1702) {
							Statics.field1944[var5++] = var72.field3406;
							continue;
						}
					} else if (var382 < 1900) {
						IfType var73 = var43 ? Statics.field3871 : Statics.field2426;
						if (var382 == 1800) {
							Statics.field1944[var5++] = GameShell.method592(Statics.method530(var73));
							continue;
						}
						if (var382 == 1801) {
							var5--;
							int var74 = Statics.field1944[var5];
							int var383 = var74 - 1;
							if (var73.field3373 != null && var73.field3373.length > var383 && var73.field3373[var383] != null) {
								Statics.field3330[var6++] = var73.field3373[var383];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 1802) {
							if (var73.field3457 == null) {
								Statics.field3330[var6++] = Statics.field1468;
							} else {
								Statics.field3330[var6++] = var73.field3457;
							}
							continue;
						}
					} else if (var382 < 2600) {
						var5--;
						IfType var75 = Client.method1579(Statics.field1944[var5]);
						if (var382 == 2500) {
							Statics.field1944[var5++] = var75.field3366;
							continue;
						}
						if (var382 == 2501) {
							Statics.field1944[var5++] = var75.field3441;
							continue;
						}
						if (var382 == 2502) {
							Statics.field1944[var5++] = var75.field3380;
							continue;
						}
						if (var382 == 2503) {
							Statics.field1944[var5++] = var75.field3422;
							continue;
						}
						if (var382 == 2504) {
							Statics.field1944[var5++] = var75.field3378 ? 1 : 0;
							continue;
						}
						if (var382 == 2505) {
							Statics.field1944[var5++] = var75.field3504;
							continue;
						}
					} else if (var382 < 2700) {
						var5--;
						IfType var76 = Client.method1579(Statics.field1944[var5]);
						if (var382 == 2600) {
							Statics.field1944[var5++] = var76.field3393;
							continue;
						}
						if (var382 == 2601) {
							Statics.field1944[var5++] = var76.field3415;
							continue;
						}
						if (var382 == 2602) {
							Statics.field3330[var6++] = var76.field3383;
							continue;
						}
						if (var382 == 2603) {
							Statics.field1944[var5++] = var76.field3384;
							continue;
						}
						if (var382 == 2604) {
							Statics.field1944[var5++] = var76.field3375;
							continue;
						}
						if (var382 == 2605) {
							Statics.field1944[var5++] = var76.field3485;
							continue;
						}
						if (var382 == 2606) {
							Statics.field1944[var5++] = var76.field3455;
							continue;
						}
						if (var382 == 2607) {
							Statics.field1944[var5++] = var76.field3517;
							continue;
						}
						if (var382 == 2608) {
							Statics.field1944[var5++] = var76.field3509;
							continue;
						}
						if (var382 == 2609) {
							Statics.field1944[var5++] = var76.field3480;
							continue;
						}
					} else if (var382 < 2800) {
						if (var382 == 2700) {
							var5--;
							IfType var351 = Client.method1579(Statics.field1944[var5]);
							Statics.field1944[var5++] = var351.field3399;
							continue;
						}
						if (var382 == 2701) {
							var5--;
							IfType var352 = Client.method1579(Statics.field1944[var5]);
							if (var352.field3399 == -1) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = var352.field3482;
							}
							continue;
						}
						if (var382 == 2702) {
							var5--;
							int var353 = Statics.field1944[var5];
							SubInterface var354 = (SubInterface) Statics.field2395.method1049((long) var353);
							if (var354 == null) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = 1;
							}
							continue;
						}
						if (var382 == 2703) {
							var5--;
							IfType var355 = Client.method1579(Statics.field1944[var5]);
							if (var355.field3465 == null) {
								Statics.field1944[var5++] = 0;
								continue;
							}
							int var356 = var355.field3465.length;
							for (int var357 = 0; var357 < var355.field3465.length; var357++) {
								if (var355.field3465[var357] == null) {
									var356 = var357;
									break;
								}
							}
							Statics.field1944[var5++] = var356;
							continue;
						}
						if (var382 == 2704 || var382 == 2705) {
							var5 -= 2;
							int var358 = Statics.field1944[var5];
							int var359 = Statics.field1944[var5 + 1];
							SubInterface var360 = (SubInterface) Statics.field2395.method1049((long) var358);
							if (var360 != null && var360.field3229 == var359) {
								Statics.field1944[var5++] = 1;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
					} else if (var382 < 2900) {
						var5--;
						IfType var77 = Client.method1579(Statics.field1944[var5]);
						if (var382 == 2800) {
							Statics.field1944[var5++] = GameShell.method592(Statics.method530(var77));
							continue;
						}
						if (var382 == 2801) {
							var5--;
							int var78 = Statics.field1944[var5];
							int var384 = var78 - 1;
							if (var77.field3373 != null && var77.field3373.length > var384 && var77.field3373[var384] != null) {
								Statics.field3330[var6++] = var77.field3373[var384];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 2802) {
							if (var77.field3457 == null) {
								Statics.field3330[var6++] = Statics.field1468;
							} else {
								Statics.field3330[var6++] = var77.field3457;
							}
							continue;
						}
					} else if (var382 < 3200) {
						if (var382 == 3100) {
							var6--;
							JagString var336 = Statics.field3330[var6];
							Client.method1499(var336, 0, Statics.field1468);
							continue;
						}
						if (var382 == 3101) {
							var5 -= 2;
							Client.method1515(Statics.field1944[var5], Statics.field1944[var5 + 1], Client.localPlayer);
							continue;
						}
						if (var382 == 3103) {
							Statics.method174();
							continue;
						}
						if (var382 == 3104) {
							var6--;
							JagString var337 = Statics.field3330[var6];
							int var338 = 0;
							if (var337.method621()) {
								var338 = var337.method603();
							}
							Client.out.method30(152);
							Client.out.p4(var338);
							continue;
						}
						if (var382 == 3105) {
							var6--;
							JagString var339 = Statics.field3330[var6];
							Client.out.method30(54);
							Client.out.p8(var339.toUserhash());
							continue;
						}
						if (var382 == 3106) {
							var6--;
							JagString var340 = Statics.field3330[var6];
							Client.out.method30(60);
							Client.out.p1(var340.method604() + 1);
							Client.out.pjstr(var340);
							continue;
						}
						if (var382 == 3107) {
							var5--;
							int var341 = Statics.field1944[var5];
							var6--;
							JagString var342 = Statics.field3330[var6];
							Client.method82(var342, var341);
							continue;
						}
						if (var382 == 3108) {
							var5 -= 3;
							int var343 = Statics.field1944[var5];
							int var344 = Statics.field1944[var5 + 1];
							int var345 = Statics.field1944[var5 + 2];
							IfType var346 = Client.method1579(var345);
							Client.method532(var343, var344, var346);
							continue;
						}
						if (var382 == 3109) {
							var5 -= 2;
							int var347 = Statics.field1944[var5];
							int var348 = Statics.field1944[var5 + 1];
							IfType var349 = var43 ? Statics.field3871 : Statics.field2426;
							Client.method532(var347, var348, var349);
							continue;
						}
						if (var382 == 3110) {
							var5--;
							int var350 = Statics.field1944[var5];
							Client.out.method30(194);
							Client.out.method305(var350);
							continue;
						}
					} else if (var382 < 3300) {
						if (var382 == 3200) {
							var5 -= 3;
							Statics.method668(Statics.field1944[var5 + 1], Statics.field1944[var5 + 2], Statics.field1944[var5]);
							continue;
						}
						if (var382 == 3201) {
							var5--;
							Client.method788(Statics.field1944[var5]);
							continue;
						}
						if (var382 == 3202) {
							var5 -= 2;
							Statics.method23(Statics.field1944[var5], Statics.field1944[var5 + 1]);
							continue;
						}
					} else if (var382 < 3400) {
						if (var382 == 3300) {
							Statics.field1944[var5++] = Client.field2113;
							continue;
						}
						if (var382 == 3301) {
							var5 -= 2;
							int var314 = Statics.field1944[var5 + 1];
							int var315 = Statics.field1944[var5];
							Statics.field1944[var5++] = ClientInvCache.method255(var314, var315);
							continue;
						}
						if (var382 == 3302) {
							var5 -= 2;
							int var316 = Statics.field1944[var5];
							int var317 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = ClientInvCache.method747(var316, var317);
							continue;
						}
						if (var382 == 3303) {
							var5 -= 2;
							int var318 = Statics.field1944[var5 + 1];
							int var319 = Statics.field1944[var5];
							Statics.field1944[var5++] = ClientInvCache.method1608(var319, var318);
							continue;
						}
						if (var382 == 3304) {
							var5--;
							int var320 = Statics.field1944[var5];
							Statics.field1944[var5++] = InvType.method458(var320).field2067;
							continue;
						}
						if (var382 == 3305) {
							var5--;
							int var321 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.field1907[var321];
							continue;
						}
						if (var382 == 3306) {
							var5--;
							int var322 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.field4066[var322];
							continue;
						}
						if (var382 == 3307) {
							var5--;
							int var323 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.field3562[var323];
							continue;
						}
						if (var382 == 3308) {
							int var324 = Client.field2907;
							int var325 = (Client.localPlayer.field4121 >> 7) + Client.field3679;
							int var326 = Client.field4212 + (Client.localPlayer.field4136 >> 7);
							Statics.field1944[var5++] = var325 + (var326 << 14) + (var324 << 28);
							continue;
						}
						if (var382 == 3309) {
							var5--;
							int var327 = Statics.field1944[var5];
							Statics.field1944[var5++] = var327 >> 14 & 0x3FFF;
							continue;
						}
						if (var382 == 3310) {
							var5--;
							int var328 = Statics.field1944[var5];
							Statics.field1944[var5++] = var328 >> 28;
							continue;
						}
						if (var382 == 3311) {
							var5--;
							int var329 = Statics.field1944[var5];
							Statics.field1944[var5++] = var329 & 0x3FFF;
							continue;
						}
						if (var382 == 3312) {
							Statics.field1944[var5++] = Client.memServer ? 1 : 0;
							continue;
						}
						if (var382 == 3313) {
							var5 -= 2;
							int var330 = Statics.field1944[var5 + 1];
							int var331 = Statics.field1944[var5] + 32768;
							Statics.field1944[var5++] = ClientInvCache.method255(var330, var331);
							continue;
						}
						if (var382 == 3314) {
							var5 -= 2;
							int var332 = Statics.field1944[var5] + 32768;
							int var333 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = ClientInvCache.method747(var332, var333);
							continue;
						}
						if (var382 == 3315) {
							var5 -= 2;
							int var334 = Statics.field1944[var5] + 32768;
							int var335 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = ClientInvCache.method1608(var334, var335);
							continue;
						}
						if (var382 == 3316) {
							if (Client.staffmodlevel < 2) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = Client.staffmodlevel;
							}
							continue;
						}
						if (var382 == 3317) {
							Statics.field1944[var5++] = Statics.field2061;
							continue;
						}
						if (var382 == 3318) {
							Statics.field1944[var5++] = Client.worldid;
							continue;
						}
						if (var382 == 3321) {
							Statics.field1944[var5++] = Statics.field4458;
							continue;
						}
						if (var382 == 3322) {
							Statics.field1944[var5++] = Statics.field3788;
							continue;
						}
						if (var382 == 3323) {
							if (Client.mouseTracked >= 5 && Client.mouseTracked <= 9) {
								Statics.field1944[var5++] = 1;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3324) {
							if (Client.mouseTracked >= 5 && Client.mouseTracked <= 9) {
								Statics.field1944[var5++] = Client.mouseTracked;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3325) {
							if (Client.membersAccount > 0) {
								Statics.field1944[var5++] = 1;
							} else {
								Statics.field1944[var5++] = 0;
							}
							continue;
						}
						if (var382 == 3326) {
							Statics.field1944[var5++] = Client.localPlayer.field747;
							continue;
						}
						if (var382 == 3327) {
							Statics.field1944[var5++] = Client.localPlayer.field768.field3957 ? 1 : 0;
							continue;
						}
						if (var382 == 3328) {
							Statics.field1944[var5++] = Client.field4428;
							continue;
						}
						if (var382 == 3329) {
							Statics.field1944[var5++] = Client.field3535;
							continue;
						}
					} else if (var382 < 3500) {
						if (var382 == 3400) {
							var5 -= 2;
							int var306 = Statics.field1944[var5];
							int var307 = Statics.field1944[var5 + 1];
							EnumType var308 = EnumType.list(var306);
							Statics.field3330[var6++] = var308.getValueString(var307);
							continue;
						}
						if (var382 == 3408) {
							var5 -= 4;
							int var309 = Statics.field1944[var5 + 1];
							int var310 = Statics.field1944[var5 + 2];
							int var311 = Statics.field1944[var5 + 3];
							int var312 = Statics.field1944[var5];
							EnumType var313 = EnumType.list(var310);
							if (var312 == var313.field873 && var309 == var313.field882) {
								if (var309 == 115) {
									Statics.field3330[var6++] = var313.getValueString(var311);
								} else {
									Statics.field1944[var5++] = var313.method356(var311);
								}
								continue;
							}
							if (var309 == 115) {
								Statics.field3330[var6++] = Statics.field207;
							} else {
								Statics.field1944[var5++] = 0;
							}
							continue;
						}
					} else if (var382 < 3700) {
						if (var382 == 3600) {
							if (Statics.field2078 == 0) {
								Statics.field1944[var5++] = -2;
							} else if (Statics.field2078 == 1) {
								Statics.field1944[var5++] = -1;
							} else {
								Statics.field1944[var5++] = Statics.field2729;
							}
							continue;
						}
						if (var382 == 3601) {
							var5--;
							int var79 = Statics.field1944[var5];
							if (Statics.field2078 == 2 && var79 < Statics.field2729) {
								Statics.field3330[var6++] = Statics.field370[var79];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 3602) {
							var5--;
							int var80 = Statics.field1944[var5];
							if (Statics.field2078 == 2 && var80 < Statics.field2729) {
								Statics.field1944[var5++] = Statics.field3092[var80];
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3603) {
							var5--;
							int var81 = Statics.field1944[var5];
							if (Statics.field2078 == 2 && var81 < Statics.field2729) {
								Statics.field1944[var5++] = Statics.field845[var81];
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3604) {
							var6--;
							JagString var82 = Statics.field3330[var6];
							var5--;
							int var83 = Statics.field1944[var5];
							Client.method1213(var82, var83);
							continue;
						}
						if (var382 == 3605) {
							var6--;
							JagString var84 = Statics.field3330[var6];
							Client.method64(var84.toUserhash());
							continue;
						}
						if (var382 == 3606) {
							var6--;
							JagString var85 = Statics.field3330[var6];
							Client.method777(var85.toUserhash());
							continue;
						}
						if (var382 == 3607) {
							var6--;
							JagString var86 = Statics.field3330[var6];
							Client.method55(var86.toUserhash());
							continue;
						}
						if (var382 == 3608) {
							var6--;
							JagString var87 = Statics.field3330[var6];
							Client.method973(var87.toUserhash());
							continue;
						}
						if (var382 == 3609) {
							var6--;
							JagString var88 = Statics.field3330[var6];
							if (var88.method619(Statics.field3554) || var88.method619(Statics.field3141)) {
								var88 = var88.method635(7);
							}
							Statics.field1944[var5++] = method901(var88) ? 1 : 0;
							continue;
						}
						if (var382 == 3610) {
							var5--;
							int var89 = Statics.field1944[var5];
							if (Statics.field2078 == 2 && Statics.field2729 > var89) {
								Statics.field3330[var6++] = Statics.field3238[var89];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 3611) {
							if (Statics.field4182 == null) {
								Statics.field3330[var6++] = Statics.field1468;
							} else {
								Statics.field3330[var6++] = Statics.field4182.method614();
							}
							continue;
						}
						if (var382 == 3612) {
							if (Statics.field4182 == null) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = Client.field885;
							}
							continue;
						}
						if (var382 == 3613) {
							var5--;
							int var90 = Statics.field1944[var5];
							if (Statics.field4182 != null && Client.field885 > var90) {
								Statics.field3330[var6++] = Client.field1647[var90].field1323.method614();
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 3614) {
							var5--;
							int var91 = Statics.field1944[var5];
							if (Statics.field4182 != null && Client.field885 > var91) {
								Statics.field1944[var5++] = Client.field1647[var91].field1317;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3615) {
							var5--;
							int var92 = Statics.field1944[var5];
							if (Statics.field4182 != null && Client.field885 > var92) {
								Statics.field1944[var5++] = Client.field1647[var92].field1315;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3616) {
							Statics.field1944[var5++] = Statics.field3301;
							continue;
						}
						if (var382 == 3617) {
							var6--;
							JagString var93 = Statics.field3330[var6];
							Client.method701(var93);
							continue;
						}
						if (var382 == 3618) {
							Statics.field1944[var5++] = Client.field2631;
							continue;
						}
						if (var382 == 3619) {
							var6--;
							JagString var94 = Statics.field3330[var6];
							Client.method900(var94.toUserhash());
							continue;
						}
						if (var382 == 3620) {
							Client.method1621();
							continue;
						}
						if (var382 == 3621) {
							if (Statics.field2078 == 0) {
								Statics.field1944[var5++] = -1;
							} else {
								Statics.field1944[var5++] = Client.field1221;
							}
							continue;
						}
						if (var382 == 3622) {
							var5--;
							int var95 = Statics.field1944[var5];
							if (Statics.field2078 != 0 && var95 < Client.field1221) {
								Statics.field3330[var6++] = JagString.method1375(Client.field1764[var95]).method614();
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 3623) {
							var6--;
							JagString var96 = Statics.field3330[var6];
							if (var96.method619(Statics.field3554) || var96.method619(Statics.field3141)) {
								var96 = var96.method635(7);
							}
							Statics.field1944[var5++] = Statics.method1130(var96) ? 1 : 0;
							continue;
						}
						if (var382 == 3624) {
							var5--;
							int var97 = Statics.field1944[var5];
							if (Client.field1647 != null && Client.field885 > var97 && Client.field1647[var97].field1323.method624(Client.localPlayer.field766)) {
								Statics.field1944[var5++] = 1;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3625) {
							if (Statics.field4219 == null) {
								Statics.field3330[var6++] = Statics.field1468;
							} else {
								Statics.field3330[var6++] = Statics.field4219.method614();
							}
							continue;
						}
						if (var382 == 3626) {
							var5--;
							int var98 = Statics.field1944[var5];
							if (Statics.field4182 != null && Client.field885 > var98) {
								Statics.field3330[var6++] = Client.field1647[var98].field1321;
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 3627) {
							var5--;
							int var99 = Statics.field1944[var5];
							if (Statics.field2078 == 2 && var99 >= 0 && var99 < Statics.field2729) {
								Statics.field1944[var5++] = Statics.field1120[var99] ? 1 : 0;
								continue;
							}
							Statics.field1944[var5++] = 0;
							continue;
						}
						if (var382 == 3628) {
							var6--;
							JagString var100 = Statics.field3330[var6];
							if (var100.method619(Statics.field3554) || var100.method619(Statics.field3141)) {
								var100 = var100.method635(7);
							}
							Statics.field1944[var5++] = Statics.method823(var100);
							continue;
						}
					} else if (var382 < 4000) {
						if (var382 == 3903) {
							var5--;
							int var101 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var101].method882();
							continue;
						}
						if (var382 == 3904) {
							var5--;
							int var102 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var102].field2455;
							continue;
						}
						if (var382 == 3905) {
							var5--;
							int var103 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var103].field2454;
							continue;
						}
						if (var382 == 3906) {
							var5--;
							int var104 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var104].field2450;
							continue;
						}
						if (var382 == 3907) {
							var5--;
							int var105 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var105].field2457;
							continue;
						}
						if (var382 == 3908) {
							var5--;
							int var106 = Statics.field1944[var5];
							Statics.field1944[var5++] = Client.field140[var106].field2459;
							continue;
						}
						if (var382 == 3910) {
							var5--;
							int var107 = Statics.field1944[var5];
							int var108 = Client.field140[var107].method886();
							Statics.field1944[var5++] = var108 == 0 ? 1 : 0;
							continue;
						}
						if (var382 == 3911) {
							var5--;
							int var109 = Statics.field1944[var5];
							int var110 = Client.field140[var109].method886();
							Statics.field1944[var5++] = var110 == 2 ? 1 : 0;
							continue;
						}
						if (var382 == 3912) {
							var5--;
							int var111 = Statics.field1944[var5];
							int var112 = Client.field140[var111].method886();
							Statics.field1944[var5++] = var112 == 5 ? 1 : 0;
							continue;
						}
						if (var382 == 3913) {
							var5--;
							int var113 = Statics.field1944[var5];
							int var114 = Client.field140[var113].method886();
							Statics.field1944[var5++] = var114 == 1 ? 1 : 0;
							continue;
						}
					} else if (var382 < 4100) {
						if (var382 == 4000) {
							var5 -= 2;
							int var115 = Statics.field1944[var5];
							int var116 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var115 + var116;
							continue;
						}
						if (var382 == 4001) {
							var5 -= 2;
							int var117 = Statics.field1944[var5];
							int var118 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var117 - var118;
							continue;
						}
						if (var382 == 4002) {
							var5 -= 2;
							int var119 = Statics.field1944[var5 + 1];
							int var120 = Statics.field1944[var5];
							Statics.field1944[var5++] = var120 * var119;
							continue;
						}
						if (var382 == 4003) {
							var5 -= 2;
							int var121 = Statics.field1944[var5];
							int var122 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var121 / var122;
							continue;
						}
						if (var382 == 4004) {
							var5--;
							int var123 = Statics.field1944[var5];
							Statics.field1944[var5++] = (int) (Math.random() * (double) var123);
							continue;
						}
						if (var382 == 4005) {
							var5--;
							int var124 = Statics.field1944[var5];
							Statics.field1944[var5++] = (int) ((double) (var124 + 1) * Math.random());
							continue;
						}
						if (var382 == 4006) {
							var5 -= 5;
							int var125 = Statics.field1944[var5];
							int var126 = Statics.field1944[var5 + 1];
							int var127 = Statics.field1944[var5 + 2];
							int var128 = Statics.field1944[var5 + 3];
							int var129 = Statics.field1944[var5 + 4];
							Statics.field1944[var5++] = var125 + (var129 - var127) * (-var125 + var126) / (var128 - var127);
							continue;
						}
						if (var382 == 4007) {
							var5 -= 2;
							long var130 = (long) Statics.field1944[var5 + 1];
							long var132 = (long) Statics.field1944[var5];
							Statics.field1944[var5++] = (int) (var130 * var132 / 100L + var132);
							continue;
						}
						if (var382 == 4008) {
							var5 -= 2;
							int var134 = Statics.field1944[var5];
							int var135 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = 0x1 << var135 | var134;
							continue;
						}
						if (var382 == 4009) {
							var5 -= 2;
							int var136 = Statics.field1944[var5 + 1];
							int var137 = Statics.field1944[var5];
							Statics.field1944[var5++] = var137 & -(0x1 << var136) - 1;
							continue;
						}
						if (var382 == 4010) {
							var5 -= 2;
							int var138 = Statics.field1944[var5 + 1];
							int var139 = Statics.field1944[var5];
							Statics.field1944[var5++] = (var139 & 0x1 << var138) == 0 ? 0 : 1;
							continue;
						}
						if (var382 == 4011) {
							var5 -= 2;
							int var140 = Statics.field1944[var5 + 1];
							int var141 = Statics.field1944[var5];
							Statics.field1944[var5++] = var141 % var140;
							continue;
						}
						if (var382 == 4012) {
							var5 -= 2;
							int var142 = Statics.field1944[var5];
							int var143 = Statics.field1944[var5 + 1];
							if (var142 == 0) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = (int) Math.pow((double) var142, (double) var143);
							}
							continue;
						}
						if (var382 == 4013) {
							var5 -= 2;
							int var144 = Statics.field1944[var5];
							int var145 = Statics.field1944[var5 + 1];
							if (var144 == 0) {
								Statics.field1944[var5++] = 0;
							} else if (var145 == 0) {
								Statics.field1944[var5++] = Integer.MAX_VALUE;
							} else {
								Statics.field1944[var5++] = (int) Math.pow((double) var144, 1.0D / (double) var145);
							}
							continue;
						}
						if (var382 == 4014) {
							var5 -= 2;
							int var146 = Statics.field1944[var5 + 1];
							int var147 = Statics.field1944[var5];
							Statics.field1944[var5++] = var146 & var147;
							continue;
						}
						if (var382 == 4015) {
							var5 -= 2;
							int var148 = Statics.field1944[var5 + 1];
							int var149 = Statics.field1944[var5];
							Statics.field1944[var5++] = var149 | var148;
							continue;
						}
						if (var382 == 4016) {
							var5 -= 2;
							int var150 = Statics.field1944[var5];
							int var151 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var150 < var151 ? var150 : var151;
							continue;
						}
						if (var382 == 4017) {
							var5 -= 2;
							int var152 = Statics.field1944[var5];
							int var153 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var152 <= var153 ? var153 : var152;
							continue;
						}
						if (var382 == 4018) {
							var5 -= 3;
							long var154 = (long) Statics.field1944[var5];
							long var156 = (long) Statics.field1944[var5 + 1];
							long var158 = (long) Statics.field1944[var5 + 2];
							Statics.field1944[var5++] = (int) (var158 * var154 / var156);
							continue;
						}
					} else if (var382 < 4200) {
						if (var382 == 4100) {
							var6--;
							JagString var254 = Statics.field3330[var6];
							var5--;
							int var255 = Statics.field1944[var5];
							Statics.field3330[var6++] = JagString.join(new JagString[]{var254, JagString.method1212(var255)});
							continue;
						}
						if (var382 == 4101) {
							var6 -= 2;
							JagString var256 = Statics.field3330[var6 + 1];
							JagString var257 = Statics.field3330[var6];
							Statics.field3330[var6++] = JagString.join(new JagString[]{var257, var256});
							continue;
						}
						if (var382 == 4102) {
							var6--;
							JagString var258 = Statics.field3330[var6];
							var5--;
							int var259 = Statics.field1944[var5];
							Statics.field3330[var6++] = JagString.join(new JagString[]{var258, Statics.method375(var259)});
							continue;
						}
						if (var382 == 4103) {
							var6--;
							JagString var260 = Statics.field3330[var6];
							Statics.field3330[var6++] = var260.method639();
							continue;
						}
						if (var382 == 4104) {
							var5--;
							int var261 = Statics.field1944[var5];
							long var262 = ((long) var261 + 11745L) * 86400000L;
							Statics.field353.setTime(new Date(var262));
							int var264 = Statics.field353.get(5);
							int var265 = Statics.field353.get(2);
							int var266 = Statics.field353.get(1);
							Statics.field3330[var6++] = JagString.join(new JagString[]{JagString.method1212(var264), Statics.field2171, Statics.field992[var265], Statics.field2171, JagString.method1212(var266)});
							continue;
						}
						if (var382 == 4105) {
							var6 -= 2;
							JagString var267 = Statics.field3330[var6];
							JagString var268 = Statics.field3330[var6 + 1];
							if (Client.localPlayer.field768 != null && Client.localPlayer.field768.field3957) {
								Statics.field3330[var6++] = var268;
								continue;
							}
							Statics.field3330[var6++] = var267;
							continue;
						}
						if (var382 == 4106) {
							var5--;
							int var269 = Statics.field1944[var5];
							Statics.field3330[var6++] = JagString.method1212(var269);
							continue;
						}
						if (var382 == 4107) {
							var6 -= 2;
							Statics.field1944[var5++] = Statics.field3330[var6].method627(Statics.field3330[var6 + 1]);
							continue;
						}
						if (var382 == 4108) {
							var5 -= 2;
							int var270 = Statics.field1944[var5];
							var6--;
							JagString var271 = Statics.field3330[var6];
							int var272 = Statics.field1944[var5 + 1];
							byte[] var273 = Client.fontmetrics.getFile(0, var272);
							SoftwarePixFont var274 = new SoftwarePixFont(var273);
							var274.method149(Statics.field587, null);
							Statics.field1944[var5++] = var274.method163(var271, var270);
							continue;
						}
						if (var382 == 4109) {
							var5 -= 2;
							var6--;
							JagString var275 = Statics.field3330[var6];
							int var276 = Statics.field1944[var5 + 1];
							int var277 = Statics.field1944[var5];
							byte[] var278 = Client.fontmetrics.getFile(0, var276);
							SoftwarePixFont var279 = new SoftwarePixFont(var278);
							var279.method149(Statics.field587, null);
							Statics.field1944[var5++] = var279.method156(var275, var277);
							continue;
						}
						if (var382 == 4110) {
							var6 -= 2;
							JagString var280 = Statics.field3330[var6 + 1];
							JagString var281 = Statics.field3330[var6];
							var5--;
							if (Statics.field1944[var5] == 1) {
								Statics.field3330[var6++] = var281;
							} else {
								Statics.field3330[var6++] = var280;
							}
							continue;
						}
						if (var382 == 4111) {
							var6--;
							JagString var282 = Statics.field3330[var6];
							Statics.field3330[var6++] = PixfontGeneric.method162(var282);
							continue;
						}
						if (var382 == 4112) {
							var5--;
							int var283 = Statics.field1944[var5];
							var6--;
							JagString var284 = Statics.field3330[var6];
							if (var283 == -1) {
								throw new RuntimeException("null char");
							}
							Statics.field3330[var6++] = var284.method618(var283);
							continue;
						}
						if (var382 == 4113) {
							var5--;
							int var285 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.method1489(var285) ? 1 : 0;
							continue;
						}
						if (var382 == 4114) {
							var5--;
							int var286 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.method782(var286) ? 1 : 0;
							continue;
						}
						if (var382 == 4115) {
							var5--;
							int var287 = Statics.field1944[var5];
							Statics.field1944[var5++] = SeqType.method746(var287) ? 1 : 0;
							continue;
						}
						if (var382 == 4116) {
							var5--;
							int var288 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.method24(var288) ? 1 : 0;
							continue;
						}
						if (var382 == 4117) {
							var6--;
							JagString var289 = Statics.field3330[var6];
							if (var289 == null) {
								Statics.field1944[var5++] = 0;
							} else {
								Statics.field1944[var5++] = var289.method604();
							}
							continue;
						}
						if (var382 == 4118) {
							var5 -= 2;
							var6--;
							JagString var290 = Statics.field3330[var6];
							int var291 = Statics.field1944[var5 + 1];
							int var292 = Statics.field1944[var5];
							Statics.field3330[var6++] = var290.method623(var292, var291);
							continue;
						}
						if (var382 == 4119) {
							var6--;
							JagString var293 = Statics.field3330[var6];
							JagString var294 = JagString.method1135(var293.method604());
							boolean var295 = false;
							for (int var296 = 0; var293.method604() > var296; var296++) {
								int var297 = var293.method599(var296);
								if (var297 == 60) {
									var295 = true;
								} else if (var297 == 62) {
									var295 = false;
								} else if (!var295) {
									var294.method638(var297);
								}
							}
							var294.method629();
							Statics.field3330[var6++] = var294;
							continue;
						}
						if (var382 == 4120) {
							var5 -= 2;
							var6--;
							JagString var298 = Statics.field3330[var6];
							int var299 = Statics.field1944[var5];
							int var300 = Statics.field1944[var5 + 1];
							Statics.field1944[var5++] = var298.method594(var299, var300);
							continue;
						}
						if (var382 == 4121) {
							var6 -= 2;
							JagString var301 = Statics.field3330[var6 + 1];
							var5--;
							int var302 = Statics.field1944[var5];
							JagString var303 = Statics.field3330[var6];
							Statics.field1944[var5++] = var303.method634(var302, var301);
							continue;
						}
						if (var382 == 4122) {
							var5--;
							int var304 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.method102(var304);
							continue;
						}
						if (var382 == 4123) {
							var5--;
							int var305 = Statics.field1944[var5];
							Statics.field1944[var5++] = Statics.method51(var305);
							continue;
						}
					} else if (var382 < 4300) {
						if (var382 == 4200) {
							var5--;
							int var160 = Statics.field1944[var5];
							Statics.field3330[var6++] = ObjType.list(var160).name;
							continue;
						}
						if (var382 == 4201) {
							var5 -= 2;
							int var161 = Statics.field1944[var5];
							int var162 = Statics.field1944[var5 + 1];
							ObjType var163 = ObjType.list(var161);
							if (var162 >= 1 && var162 <= 5 && var163.field2898[var162 - 1] != null) {
								Statics.field3330[var6++] = var163.field2898[var162 - 1];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 4202) {
							var5 -= 2;
							int var164 = Statics.field1944[var5 + 1];
							int var165 = Statics.field1944[var5];
							ObjType var166 = ObjType.list(var165);
							if (var164 >= 1 && var164 <= 5 && var166.field2904[var164 - 1] != null) {
								Statics.field3330[var6++] = var166.field2904[var164 - 1];
								continue;
							}
							Statics.field3330[var6++] = Statics.field1468;
							continue;
						}
						if (var382 == 4203) {
							var5--;
							int var167 = Statics.field1944[var5];
							Statics.field1944[var5++] = ObjType.list(var167).field2854;
							continue;
						}
						if (var382 == 4204) {
							var5--;
							int var168 = Statics.field1944[var5];
							Statics.field1944[var5++] = ObjType.list(var168).field2852 == 1 ? 1 : 0;
							continue;
						}
						if (var382 == 4205) {
							var5--;
							int var169 = Statics.field1944[var5];
							ObjType var170 = ObjType.list(var169);
							if (var170.field2867 == -1 && var170.field2841 >= 0) {
								Statics.field1944[var5++] = var170.field2841;
								continue;
							}
							Statics.field1944[var5++] = var169;
							continue;
						}
						if (var382 == 4206) {
							var5--;
							int var171 = Statics.field1944[var5];
							ObjType var172 = ObjType.list(var171);
							if (var172.field2867 >= 0 && var172.field2841 >= 0) {
								Statics.field1944[var5++] = var172.field2841;
								continue;
							}
							Statics.field1944[var5++] = var171;
							continue;
						}
						if (var382 == 4207) {
							var5--;
							int var173 = Statics.field1944[var5];
							Statics.field1944[var5++] = ObjType.list(var173).field2877 ? 1 : 0;
							continue;
						}
						if (var382 == 4208) {
							var5 -= 2;
							int var174 = Statics.field1944[var5 + 1];
							int var175 = Statics.field1944[var5];
							ParamType var176 = ParamType.method1467(var174);
							if (var176.method17()) {
								Statics.field3330[var6++] = ObjType.list(var175).method1009(var176.field57, var174);
							} else {
								Statics.field1944[var5++] = ObjType.list(var175).method1010(var174, var176.field53);
							}
							continue;
						}
						if (var382 == 4210) {
							var5--;
							int var177 = Statics.field1944[var5];
							var6--;
							JagString var178 = Statics.field3330[var6];
							Statics.method467(var177 == 1, var178);
							Statics.field1944[var5++] = Statics.field3893;
							continue;
						}
						if (var382 == 4211) {
							if (Statics.field1210 != null && Statics.field3893 > ClientMouseListener.field2107) {
								Statics.field1944[var5++] = Statics.field1210[ClientMouseListener.field2107++] & 0xFFFF;
								continue;
							}
							Statics.field1944[var5++] = -1;
							continue;
						}
						if (var382 == 4212) {
							ClientMouseListener.field2107 = 0;
							continue;
						}
					} else if (var382 < 4400) {
						if (var382 == 4300) {
							var5 -= 2;
							int var179 = Statics.field1944[var5];
							int var180 = Statics.field1944[var5 + 1];
							ParamType var181 = ParamType.method1467(var180);
							if (var181.method17()) {
								Statics.field3330[var6++] = NpcType.list(var179).method860(var180, var181.field57);
							} else {
								Statics.field1944[var5++] = NpcType.list(var179).method854(var181.field53, var180);
							}
							continue;
						}
					} else if (var382 >= 4500) {
						if (var382 >= 4600) {
							if (var382 < 5100) {
								if (var382 == 5000) {
									Statics.field1944[var5++] = Statics.field1206;
									continue;
								}
								if (var382 == 5001) {
									var5 -= 3;
									Statics.field1206 = Statics.field1944[var5];
									Statics.field142 = Statics.field1944[var5 + 1];
									Statics.field2408 = Statics.field1944[var5 + 2];
									Client.out.method30(115);
									Client.out.p1(Statics.field1206);
									Client.out.p1(Statics.field142);
									Client.out.p1(Statics.field2408);
									continue;
								}
								if (var382 == 5002) {
									var5 -= 2;
									int var182 = Statics.field1944[var5];
									var6--;
									JagString var183 = Statics.field3330[var6];
									int var184 = Statics.field1944[var5 + 1];
									Client.out.method30(99);
									Client.out.p8(var183.toUserhash());
									Client.out.p1(var182 - 1);
									Client.out.p1(var184);
									continue;
								}
								if (var382 == 5003) {
									var5--;
									int var185 = Statics.field1944[var5];
									JagString var186 = null;
									if (var185 < 100) {
										var186 = Client.field4019[var185];
									}
									if (var186 == null) {
										var186 = Statics.field1468;
									}
									Statics.field3330[var6++] = var186;
									continue;
								}
								if (var382 == 5004) {
									int var187 = -1;
									var5--;
									int var188 = Statics.field1944[var5];
									if (var188 < 100 && Client.field4019[var188] != null) {
										var187 = Client.field3708[var188];
									}
									Statics.field1944[var5++] = var187;
									continue;
								}
								if (var382 == 5005) {
									Statics.field1944[var5++] = Statics.field142;
									continue;
								}
								if (var382 == 5008) {
									var6--;
									JagString var189 = Statics.field3330[var6];
									if (var189.method619(Statics.field2194)) {
										Client.method682(var189);
										continue;
									}
									if (Client.staffmodlevel == 0 && (Client.field4428 == 1 || Client.field3535 == 1)) {
										continue;
									}
									JagString var190 = var189.method639();
									byte var191 = 0;
									if (var190.method619(Statics.field488)) {
										var189 = var189.method635(Statics.field488.method604());
										var191 = 0;
									} else if (var190.method619(Statics.field1837)) {
										var191 = 1;
										var189 = var189.method635(Statics.field1837.method604());
									} else if (var190.method619(Statics.field2564)) {
										var189 = var189.method635(Statics.field2564.method604());
										var191 = 2;
									} else if (var190.method619(Statics.field4467)) {
										var191 = 3;
										var189 = var189.method635(Statics.field4467.method604());
									} else if (var190.method619(Statics.field4363)) {
										var189 = var189.method635(Statics.field4363.method604());
										var191 = 4;
									} else if (var190.method619(Statics.field1355)) {
										var189 = var189.method635(Statics.field1355.method604());
										var191 = 5;
									} else if (var190.method619(Statics.field669)) {
										var189 = var189.method635(Statics.field669.method604());
										var191 = 6;
									} else if (var190.method619(Statics.field3690)) {
										var191 = 7;
										var189 = var189.method635(Statics.field3690.method604());
									} else if (var190.method619(Statics.field696)) {
										var189 = var189.method635(Statics.field696.method604());
										var191 = 8;
									} else if (var190.method619(Statics.field3817)) {
										var189 = var189.method635(Statics.field3817.method604());
										var191 = 9;
									} else if (var190.method619(Statics.field3084)) {
										var191 = 10;
										var189 = var189.method635(Statics.field3084.method604());
									} else if (var190.method619(Statics.field3703)) {
										var189 = var189.method635(Statics.field3703.method604());
										var191 = 11;
									} else if (Client.lang != 0) {
										if (var190.method619(Text.field485)) {
											var191 = 0;
											var189 = var189.method635(Text.field485.method604());
										} else if (var190.method619(Text.field1842)) {
											var189 = var189.method635(Text.field1842.method604());
											var191 = 1;
										} else if (var190.method619(Text.field2561)) {
											var191 = 2;
											var189 = var189.method635(Text.field2561.method604());
										} else if (var190.method619(Text.field4463)) {
											var191 = 3;
											var189 = var189.method635(Text.field4463.method604());
										} else if (var190.method619(Text.field4364)) {
											var189 = var189.method635(Text.field4364.method604());
											var191 = 4;
										} else if (var190.method619(Text.field1354)) {
											var189 = var189.method635(Text.field1354.method604());
											var191 = 5;
										} else if (var190.method619(Text.field663)) {
											var189 = var189.method635(Text.field663.method604());
											var191 = 6;
										} else if (var190.method619(Text.field3691)) {
											var191 = 7;
											var189 = var189.method635(Text.field3691.method604());
										} else if (var190.method619(Text.field683)) {
											var189 = var189.method635(Text.field683.method604());
											var191 = 8;
										} else if (var190.method619(Text.field3813)) {
											var189 = var189.method635(Text.field3813.method604());
											var191 = 9;
										} else if (var190.method619(Text.field3081)) {
											var191 = 10;
											var189 = var189.method635(Text.field3081.method604());
										} else if (var190.method619(Text.field3695)) {
											var189 = var189.method635(Text.field3695.method604());
											var191 = 11;
										}
									}
									JagString var192 = var189.method639();
									byte var193 = 0;
									if (var192.method619(Statics.field1083)) {
										var193 = 1;
										var189 = var189.method635(Statics.field1083.method604());
									} else if (var192.method619(Statics.field612)) {
										var189 = var189.method635(Statics.field612.method604());
										var193 = 2;
									} else if (var192.method619(Statics.field1308)) {
										var193 = 3;
										var189 = var189.method635(Statics.field1308.method604());
									} else if (var192.method619(Statics.field263)) {
										var193 = 4;
										var189 = var189.method635(Statics.field263.method604());
									} else if (var192.method619(Statics.field4050)) {
										var189 = var189.method635(Statics.field4050.method604());
										var193 = 5;
									} else if (Client.lang != 0) {
										if (var192.method619(Text.field1086)) {
											var193 = 1;
											var189 = var189.method635(Text.field1086.method604());
										} else if (var192.method619(Text.field618)) {
											var189 = var189.method635(Text.field618.method604());
											var193 = 2;
										} else if (var192.method619(Text.field1313)) {
											var189 = var189.method635(Text.field1313.method604());
											var193 = 3;
										} else if (var192.method619(Text.field267)) {
											var193 = 4;
											var189 = var189.method635(Text.field267.method604());
										} else if (var192.method619(Text.field4049)) {
											var193 = 5;
											var189 = var189.method635(Text.field4049.method604());
										}
									}
									Client.out.method30(189);
									Client.out.p1(0);
									int var194 = Client.out.pos;
									Client.out.p1(var191);
									Client.out.p1(var193);
									Statics.method1220(Client.out, var189);
									Client.out.method341(Client.out.pos - var194);
									continue;
								}
								if (var382 == 5009) {
									var6 -= 2;
									JagString var195 = Statics.field3330[var6];
									JagString var196 = Statics.field3330[var6 + 1];
									if (Client.staffmodlevel != 0 || Client.field4428 != 1 && Client.field3535 != 1) {
										Client.out.method30(80);
										Client.out.p1(0);
										int var197 = Client.out.pos;
										Client.out.p8(var195.toUserhash());
										Statics.method1220(Client.out, var196);
										Client.out.method341(Client.out.pos - var197);
									}
									continue;
								}
								if (var382 == 5010) {
									var5--;
									int var198 = Statics.field1944[var5];
									JagString var199 = null;
									if (var198 < 100) {
										var199 = Client.field2206[var198];
									}
									if (var199 == null) {
										var199 = Statics.field1468;
									}
									Statics.field3330[var6++] = var199;
									continue;
								}
								if (var382 == 5011) {
									JagString var200 = null;
									var5--;
									int var201 = Statics.field1944[var5];
									if (var201 < 100) {
										var200 = Client.field4280[var201];
									}
									if (var200 == null) {
										var200 = Statics.field1468;
									}
									Statics.field3330[var6++] = var200;
									continue;
								}
								if (var382 == 5012) {
									int var202 = -1;
									var5--;
									int var203 = Statics.field1944[var5];
									if (var203 < 100) {
										var202 = Client.field2483[var203];
									}
									Statics.field1944[var5++] = var202;
									continue;
								}
								if (var382 == 5015) {
									JagString var204;
									if (Client.localPlayer == null || Client.localPlayer.field766 == null) {
										var204 = TitleScreen.loginUser;
									} else {
										var204 = Client.localPlayer.field766;
									}
									Statics.field3330[var6++] = var204;
									continue;
								}
								if (var382 == 5016) {
									Statics.field1944[var5++] = Statics.field2408;
									continue;
								}
								if (var382 == 5017) {
									Statics.field1944[var5++] = Client.field582;
									continue;
								}
								if (var382 == 5050) {
									var5--;
									int var205 = Statics.field1944[var5];
									Statics.field3330[var6++] = QuickChatCatTypeList.method783(var205).field2128;
									continue;
								}
								if (var382 == 5051) {
									var5--;
									int var206 = Statics.field1944[var5];
									QuickChatCatTypeList var207 = QuickChatCatTypeList.method783(var206);
									if (var207.field2116 == null) {
										Statics.field1944[var5++] = 0;
									} else {
										Statics.field1944[var5++] = var207.field2116.length;
									}
									continue;
								}
								if (var382 == 5052) {
									var5 -= 2;
									int var208 = Statics.field1944[var5];
									int var209 = Statics.field1944[var5 + 1];
									QuickChatCatTypeList var210 = QuickChatCatTypeList.method783(var208);
									int var211 = var210.field2116[var209];
									Statics.field1944[var5++] = var211;
									continue;
								}
								if (var382 == 5053) {
									var5--;
									int var212 = Statics.field1944[var5];
									QuickChatCatTypeList var213 = QuickChatCatTypeList.method783(var212);
									if (var213.field2121 == null) {
										Statics.field1944[var5++] = 0;
									} else {
										Statics.field1944[var5++] = var213.field2121.length;
									}
									continue;
								}
								if (var382 == 5054) {
									var5 -= 2;
									int var214 = Statics.field1944[var5];
									int var215 = Statics.field1944[var5 + 1];
									Statics.field1944[var5++] = QuickChatCatTypeList.method783(var214).field2121[var215];
									continue;
								}
								if (var382 == 5055) {
									var5--;
									int var216 = Statics.field1944[var5];
									Statics.field3330[var6++] = QuickChatPhraseType.method1150(var216).method1410();
									continue;
								}
								if (var382 == 5056) {
									var5--;
									int var217 = Statics.field1944[var5];
									QuickChatPhraseType var218 = QuickChatPhraseType.method1150(var217);
									if (var218.field3916 == null) {
										Statics.field1944[var5++] = 0;
									} else {
										Statics.field1944[var5++] = var218.field3916.length;
									}
									continue;
								}
								if (var382 == 5057) {
									var5 -= 2;
									int var219 = Statics.field1944[var5 + 1];
									int var220 = Statics.field1944[var5];
									Statics.field1944[var5++] = QuickChatPhraseType.method1150(var220).field3916[var219];
									continue;
								}
								if (var382 == 5058) {
									Statics.field226 = new QuickChatPhrase();
									var5--;
									Statics.field226.field4058 = Statics.field1944[var5];
									Statics.field226.field4065 = QuickChatPhraseType.method1150(Statics.field226.field4058);
									Statics.field226.field4068 = new int[Statics.field226.field4065.method1407()];
									continue;
								}
								if (var382 == 5059) {
									Client.out.method30(197);
									Client.out.p1(0);
									int var221 = Client.out.pos;
									Client.out.p1(0);
									Client.out.method305(Statics.field226.field4058);
									Statics.field226.field4065.method1414(Client.out, Statics.field226.field4068);
									Client.out.method341(Client.out.pos - var221);
									continue;
								}
								if (var382 == 5060) {
									var6--;
									JagString var222 = Statics.field3330[var6];
									Client.out.method30(242);
									Client.out.p1(0);
									int var223 = Client.out.pos;
									Client.out.p8(var222.toUserhash());
									Client.out.method305(Statics.field226.field4058);
									Statics.field226.field4065.method1414(Client.out, Statics.field226.field4068);
									Client.out.method341(Client.out.pos - var223);
									continue;
								}
								if (var382 == 5061) {
									Client.out.method30(197);
									Client.out.p1(0);
									int var224 = Client.out.pos;
									Client.out.p1(1);
									Client.out.method305(Statics.field226.field4058);
									Statics.field226.field4065.method1414(Client.out, Statics.field226.field4068);
									Client.out.method341(Client.out.pos - var224);
									continue;
								}
								if (var382 == 5062) {
									var5 -= 2;
									int var225 = Statics.field1944[var5 + 1];
									int var226 = Statics.field1944[var5];
									Statics.field1944[var5++] = QuickChatCatTypeList.method783(var226).field2119[var225];
									continue;
								}
								if (var382 == 5063) {
									var5 -= 2;
									int var227 = Statics.field1944[var5 + 1];
									int var228 = Statics.field1944[var5];
									Statics.field1944[var5++] = QuickChatCatTypeList.method783(var228).field2130[var227];
									continue;
								}
								if (var382 == 5064) {
									var5 -= 2;
									int var229 = Statics.field1944[var5];
									int var230 = Statics.field1944[var5 + 1];
									if (var230 == -1) {
										Statics.field1944[var5++] = -1;
									} else {
										Statics.field1944[var5++] = QuickChatCatTypeList.method783(var229).method796(var230);
									}
									continue;
								}
								if (var382 == 5065) {
									var5 -= 2;
									int var231 = Statics.field1944[var5];
									int var232 = Statics.field1944[var5 + 1];
									if (var232 == -1) {
										Statics.field1944[var5++] = -1;
									} else {
										Statics.field1944[var5++] = QuickChatCatTypeList.method783(var231).method792(var232);
									}
									continue;
								}
								if (var382 == 5066) {
									var5--;
									int var233 = Statics.field1944[var5];
									Statics.field1944[var5++] = QuickChatPhraseType.method1150(var233).method1407();
									continue;
								}
								if (var382 == 5067) {
									var5 -= 2;
									int var234 = Statics.field1944[var5];
									int var235 = Statics.field1944[var5 + 1];
									int var236 = QuickChatPhraseType.method1150(var234).method1405(var235);
									Statics.field1944[var5++] = var236;
									continue;
								}
								if (var382 == 5068) {
									var5 -= 2;
									int var237 = Statics.field1944[var5 + 1];
									int var238 = Statics.field1944[var5];
									Statics.field226.field4068[var238] = var237;
									continue;
								}
								if (var382 == 5069) {
									var5 -= 2;
									int var239 = Statics.field1944[var5];
									int var240 = Statics.field1944[var5 + 1];
									Statics.field226.field4068[var239] = var240;
									continue;
								}
								if (var382 == 5070) {
									var5 -= 3;
									int var241 = Statics.field1944[var5];
									int var242 = Statics.field1944[var5 + 1];
									int var243 = Statics.field1944[var5 + 2];
									QuickChatPhraseType var244 = QuickChatPhraseType.method1150(var241);
									if (var244.method1405(var242) != 0) {
										throw new RuntimeException("bad command");
									}
									Statics.field1944[var5++] = var244.method1412(var243, var242);
									continue;
								}
							} else if (var382 < 5200) {
								if (var382 == 5100) {
									if (Statics.field4511[86]) {
										Statics.field1944[var5++] = 1;
									} else {
										Statics.field1944[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5101) {
									if (Statics.field4511[82]) {
										Statics.field1944[var5++] = 1;
									} else {
										Statics.field1944[var5++] = 0;
									}
									continue;
								}
								if (var382 == 5102) {
									if (Statics.field4511[81]) {
										Statics.field1944[var5++] = 1;
									} else {
										Statics.field1944[var5++] = 0;
									}
									continue;
								}
							} else if (var382 < 5300) {
								if (var382 == 5200) {
									var5--;
									Statics.method277(Statics.field1944[var5]);
									continue;
								}
								if (var382 == 5201) {
									Statics.field1944[var5++] = Statics.method708();
									continue;
								}
								if (var382 == 5202) {
									var5--;
									Statics.method581(Statics.field1944[var5]);
									continue;
								}
								if (var382 == 5203) {
									var6--;
									Statics.method879(Statics.field3330[var6]);
									continue;
								}
								if (var382 == 5204) {
									Statics.field3330[var6 - 1] = Statics.method1492(Statics.field3330[var6 - 1]);
									continue;
								}
								if (var382 == 5205) {
									var6--;
									Statics.method764(Statics.field3330[var6]);
									continue;
								}
							} else if (var382 >= 5400) {
								if (var382 < 5500) {
									if (var382 == 5400) {
										var6 -= 2;
										JagString var245 = Statics.field3330[var6];
										JagString var246 = Statics.field3330[var6 + 1];
										var5--;
										int var247 = Statics.field1944[var5];
										Client.out.method30(85);
										Client.out.p1(Packet.pjstrlen(var245) + Packet.pjstrlen(var246) + 1);
										Client.out.pjstr(var245);
										Client.out.pjstr(var246);
										Client.out.p1(var247);
										continue;
									}
									if (var382 == 5401) {
										var5 -= 2;
										Statics.field2108[Statics.field1944[var5]] = (short) Statics.method1559(Statics.field1944[var5 + 1]);
										ObjType.method37();
										ObjType.method1399();
										NpcType.method711();
										Statics.method1050();
										Client.method733();
										continue;
									}
								}
							} else if (var382 == 5304) {
								Statics.field1944[var5++] = 0;
								continue;
							}
						} else if (var382 == 4500) {
							var5 -= 2;
							int var248 = Statics.field1944[var5 + 1];
							int var249 = Statics.field1944[var5];
							ParamType var250 = ParamType.method1467(var248);
							if (var250.method17()) {
								Statics.field3330[var6++] = StructType.method106(var249).method1263(var250.field57, var248);
							} else {
								Statics.field1944[var5++] = StructType.method106(var249).method1265(var250.field53, var248);
							}
							continue;
						}
					} else if (var382 == 4400) {
						var5 -= 2;
						int var251 = Statics.field1944[var5];
						int var252 = Statics.field1944[var5 + 1];
						ParamType var253 = ParamType.method1467(var252);
						if (var253.method17()) {
							Statics.field3330[var6++] = LocType.method1321(var251).method999(var253.field57, var252);
						} else {
							Statics.field1944[var5++] = LocType.method1321(var251).method995(var253.field53, var252);
						}
						continue;
					}
				} else {
					IfType var361;
					if (var382 < 2000) {
						var361 = var43 ? Statics.field3871 : Statics.field2426;
					} else {
						var5--;
						var361 = Client.method1579(Statics.field1944[var5]);
						var382 -= 1000;
					}
					if (var382 == 1300) {
						var5--;
						int var362 = Statics.field1944[var5] - 1;
						if (var362 >= 0 && var362 <= 9) {
							var6--;
							var361.method1253(Statics.field3330[var6], var362);
							continue;
						}
						var6--;
						continue;
					}
					if (var382 == 1301) {
						var5 -= 2;
						int var363 = Statics.field1944[var5];
						int var364 = Statics.field1944[var5 + 1];
						var361.field3502 = Statics.method238(var364, var363);
						continue;
					}
					if (var382 == 1302) {
						var5--;
						var361.field3427 = Statics.field1944[var5] == 1;
						continue;
					}
					if (var382 == 1303) {
						var5--;
						var361.field3413 = Statics.field1944[var5];
						continue;
					}
					if (var382 == 1304) {
						var5--;
						var361.field3475 = Statics.field1944[var5];
						continue;
					}
					if (var382 == 1305) {
						var6--;
						var361.field3457 = Statics.field3330[var6];
						continue;
					}
					if (var382 == 1306) {
						var6--;
						var361.field3512 = Statics.field3330[var6];
						continue;
					}
					if (var382 == 1307) {
						var361.field3373 = null;
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var381) {
			if (var4.field4530 == null) {
				if (Client.modewhere != 0) {
					Client.method1499(Statics.field3563, 0, Statics.field1468);
				}
				JagException.report("CS2 - scr:" + var4.key + " op:" + var9, var381);
			} else {
				JagString var378 = JagString.method1135(30);
				var378.method616(Statics.field3010).method616(var4.field4530);
				for (int var379 = Statics.field4318 - 1; var379 >= 0; var379--) {
					var378.method616(Statics.field356).method616(Statics.field1446[var379].field2605.field4530);
				}
				if (var9 == 40) {
					int var380 = var8[var7];
					var378.method616(Statics.field2496).method616(JagString.method1212(var380));
				}
				if (Client.modewhere != 0) {
					Client.method1499(JagString.join(new JagString[]{Statics.field288, var4.field4530}), 0, Statics.field1468);
				}
				JagException.report("CS2 - scr:" + var4.key + " op:" + var9 + new String(var378.method613()), var381);
			}
		}
	}

	@ObfuscatedName("sd.a(Lde;I)V")
	public static void method1373(HookReq arg0) {
		executeScript(arg0, 200000);
	}
}
