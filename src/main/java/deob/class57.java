package deob;

@ObfuscatedName("fa")
public final class class57 extends class23 {

	@ObfuscatedName("fa.db")
	public boolean field1088 = true;

	@ObfuscatedName("fa.eb")
	public boolean field1089 = true;

	@ObfuscatedName("fa.gb")
	public static class174 field1091;

	@ObfuscatedName("fa.S")
	public static boolean field1077 = false;

	@ObfuscatedName("fa.V")
	public static final class88 field1080 = class208.method1423(105, "AUS");

	@ObfuscatedName("fa.T")
	public static final class88 field1078 = class208.method1423(105, "wave:");

	@ObfuscatedName("fa.bb")
	public static class88 field1086 = field1078;

	@ObfuscatedName("fa.Z")
	public static final class88 field1084 = class208.method1423(105, "Ein kostenloses Spielkonto erstellen)3");

	@ObfuscatedName("fa.Y")
	public static final class88 field1083 = field1078;

	@ObfuscatedName("fa.a(ZIILq;I)V")
	public static void method416(boolean arg0, int arg1, int arg2, class174 arg3) {
		int var4 = arg3.field3380;
		if (arg3.field3463 == 0) {
			arg3.field3380 = arg3.field3501;
		} else if (arg3.field3463 == 1) {
			arg3.field3380 = arg2 - arg3.field3501;
		} else if (arg3.field3463 == 2) {
			arg3.field3380 = arg2 * arg3.field3501 >> 14;
		} else if (arg3.field3463 == 3) {
			if (arg3.field3390 == 2) {
				arg3.field3380 = arg3.field3501 * 32 + arg3.field3466 * (arg3.field3501 - 1);
			} else if (arg3.field3390 == 7) {
				arg3.field3380 = (arg3.field3501 - 1) * arg3.field3466 + arg3.field3501 * 115;
			}
		}
		int var5 = arg3.field3422;
		if (arg3.field3394 == 0) {
			arg3.field3422 = arg3.field3418;
		} else if (arg3.field3394 == 1) {
			arg3.field3422 = arg1 - arg3.field3418;
		} else if (arg3.field3394 == 2) {
			arg3.field3422 = arg3.field3418 * arg1 >> 14;
		} else if (arg3.field3394 == 3) {
			if (arg3.field3390 == 2) {
				arg3.field3422 = arg3.field3508 * (arg3.field3418 - 1) + arg3.field3418 * 32;
			} else if (arg3.field3390 == 7) {
				arg3.field3422 = arg3.field3508 * (arg3.field3418 - 1) + arg3.field3418 * 12;
			}
		}
		if (class116.field2103 && (class80.method530(arg3) != 0 || arg3.field3390 == 0)) {
			if (arg3.field3422 < 5 && arg3.field3380 < 5) {
				arg3.field3380 = 5;
				arg3.field3422 = 5;
			} else {
				if (arg3.field3422 <= 0) {
					arg3.field3422 = 5;
				}
				if (arg3.field3380 <= 0) {
					arg3.field3380 = 5;
				}
			}
		}
		if (arg0 && arg3.field3426 != null && (arg3.field3380 != var4 || arg3.field3422 != var5)) {
			class39 var6 = new class39();
			var6.field681 = arg3.field3426;
			var6.field678 = arg3;
			class200.method1373(var6);
		}
	}

	@ObfuscatedName("fa.b(II)V")
	public static void method417(int arg0) {
		if (arg0 == -3) {
			class34.method227(class70.field1273, class11.field162, class223.field4209);
		} else if (arg0 == -2) {
			class34.method227(class70.field1274, class70.field1294, class151.field2926);
		} else if (arg0 == -1) {
			class34.method227(class70.field1271, class29.field478, class223.field4194);
		} else if (arg0 == 3) {
			class34.method227(class70.field1297, class70.field1268, class236.field4399);
		} else if (arg0 == 4) {
			class34.method227(class70.field1291, class8.field117, class55.field1016);
		} else if (arg0 == 5) {
			class34.method227(class70.field1305, class223.field4205, class175.field3525);
		} else if (arg0 == 6) {
			class34.method227(class70.field1266, class114.field2064, class65.field1186);
		} else if (arg0 == 7) {
			class34.method227(class70.field1302, class88.field1655, class230.field4319);
		} else if (arg0 == 8) {
			class34.method227(class70.field1267, class217.field4056, class159.field3074);
		} else if (arg0 == 9) {
			class34.method227(class70.field1293, class220.field4165, class16.field243);
		} else if (arg0 == 10) {
			class34.method227(class70.field1280, class217.field4057, class171.field3329);
		} else if (arg0 == 11) {
			class34.method227(class70.field1286, class48.field902, class200.field3823);
		} else if (arg0 == 12) {
			class34.method227(class70.field1282, class122.field2226, class210.field3991);
		} else if (arg0 == 13) {
			class34.method227(class70.field1299, class80.field1445, class223.field4197);
		} else if (arg0 == 14) {
			class34.method227(class70.field1300, class166.field3191, class154.field2968);
		} else if (arg0 == 16) {
			class34.method227(class70.field1278, class227.field4259, class53.field998);
		} else if (arg0 == 17) {
			class34.method227(class70.field1272, class20.field312, class153.field2951);
		} else if (arg0 == 18) {
			class34.method227(class70.field1287, class29.field480, class102.field1846);
		} else if (arg0 == 19) {
			class34.method227(class230.field4317, class155.field3002, class117.field2111);
		} else if (arg0 == 20) {
			class34.method227(class70.field1289, class4.field56, class223.field4200);
		} else if (arg0 == 22) {
			class34.method227(class70.field1284, class48.field896, class246.field4508);
		} else if (arg0 == 23) {
			class34.method227(class70.field1269, class48.field906, class154.field2988);
		} else if (arg0 == 24) {
			class34.method227(class70.field1303, class132.field2470, class232.field4348);
		} else if (arg0 == 25) {
			class34.method227(class70.field1283, class10.field143, class223.field4206);
		} else if (arg0 == 26) {
			class34.method227(class70.field1301, class53.field983, class109.field1998);
		} else if (arg0 == 27) {
			class34.method227(class70.field1279, class70.field1296, class161.field3112);
		} else {
			class34.method227(class70.field1304, class247.field4524, class223.field4207);
		}
		class131.method881(10);
	}

	@ObfuscatedName("fa.a(IIIILq;Lrc;I)V")
	public static void method418(int arg0, int arg1, int arg2, class174 arg3, class188 arg4, int arg5) {
		if (arg4 == null) {
			return;
		}
		int var6 = class52.field943 + class207.field3930 & 0x7FF;
		int var7 = arg5 * arg5 + arg2 * arg2;
		int var8 = Math.max(arg3.field3380 / 2, arg3.field3422 / 2) + 10;
		if (var7 > var8 * var8) {
			return;
		}
		int var9 = class173.field3354[var6];
		int var10 = var9 * 256 / (class65.field1185 + 256);
		int var11 = class173.field3359[var6];
		int var12 = var11 * 256 / (class65.field1185 + 256);
		int var13 = var10 * arg2 - arg5 * var12 >> 16;
		int var14 = arg5 * var10 + arg2 * var12 >> 16;
		((class169) arg4).method1165(arg3.field3380 / 2 + arg1 + var14 - arg4.field3649 / 2, -(arg4.field3645 / 2) + arg3.field3422 / 2 + arg0 + -var13, arg3.field3402, arg3.field3421);
	}

	@ObfuscatedName("fa.a(IIIII)I")
	public static int method419(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - class173.field3354[arg2 * 1024 / arg0] >> 1;
		return (arg1 * (65536 - var4) >> 16) + (arg3 * var4 >> 16);
	}

	public class57() {
		super(1, false);
	}

	@ObfuscatedName("fa.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1089 = arg0.method347() == 1;
		} else if (arg1 == 1) {
			this.field1088 = arg0.method347() == 1;
		} else if (arg1 == 2) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("fa.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, this.field1088 ? class220.field4158 - arg0 : arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			if (this.field1089) {
				for (int var11 = 0; var11 < class70.field1276; var11++) {
					var7[var11] = var4[class45.field789 - var11];
					var8[var11] = var6[class45.field789 - var11];
					var9[var11] = var5[class45.field789 - var11];
				}
			} else {
				for (int var10 = 0; var10 < class70.field1276; var10++) {
					var7[var10] = var4[var10];
					var8[var10] = var6[var10];
					var9[var10] = var5[var10];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("fa.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(this.field1088 ? class220.field4158 - arg0 : arg0, 0);
			if (this.field1089) {
				for (int var4 = 0; var4 < class70.field1276; var4++) {
					var2[var4] = var3[class45.field789 - var4];
				}
			} else {
				class124.method838(var3, 0, var2, 0, class70.field1276);
			}
		}
		return var2;
	}
}
