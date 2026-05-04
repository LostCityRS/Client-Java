package deob;

@ObfuscatedName("ig")
public final class class94 extends class23 {

	@ObfuscatedName("ig.R")
	public int field1753 = 1;

	@ObfuscatedName("ig.W")
	public int field1758 = 1;

	@ObfuscatedName("ig.U")
	public static int field1756;

	@ObfuscatedName("ig.a(ILea;)Lc;")
	public static class23 method674(class46 arg0) {
		arg0.method347();
		int var1 = arg0.method347();
		class23 var2 = class233.method1552(var1);
		var2.field363 = arg0.method347();
		int var3 = arg0.method347();
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = arg0.method347();
			var2.method11(arg0, var5);
		}
		var2.method123();
		return var2;
	}

	@ObfuscatedName("ig.a(IIIILnc;JLnc;Lnc;)V")
	public static void method675(int arg0, int arg1, int arg2, int arg3, class145 arg4, long arg5, class145 arg6, class145 arg7) {
		class239 var9 = new class239();
		var9.field4443 = arg4;
		var9.field4451 = arg1 * 128 + 64;
		var9.field4439 = arg2 * 128 + 64;
		var9.field4444 = arg3;
		var9.field4440 = arg5;
		var9.field4446 = arg6;
		var9.field4448 = arg7;
		int var10 = 0;
		class52 var11 = class29.field489[arg0][arg1][arg2];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field962; var12++) {
				class108 var13 = var11.field963[var12];
				if ((var13.field1948 & 0x400000L) == 4194304L) {
					int var14 = var13.field1943.method88();
					if (var14 != -32768 && var14 < var10) {
						var10 = var14;
					}
				}
			}
		}
		var9.field4435 = -var10;
		if (class29.field489[arg0][arg1][arg2] == null) {
			class29.field489[arg0][arg1][arg2] = new class52(arg0, arg1, arg2);
		}
		class29.field489[arg0][arg1][arg2].field948 = var9;
	}

	public class94() {
		super(1, false);
	}

	@ObfuscatedName("ig.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = this.field1753 + this.field1753 + 1;
			int var4 = 65536 / var3;
			int var5 = this.field1758 + this.field1758 + 1;
			int[][] var6 = new int[var3][];
			int var7 = 65536 / var5;
			for (int var8 = arg0 - this.field1753; var8 <= arg0 + this.field1753; var8++) {
				int[] var9 = this.method120(class220.field4158 & var8, 0);
				int[] var10 = new int[class70.field1276];
				int var11 = 0;
				for (int var12 = -this.field1758; var12 <= this.field1758; var12++) {
					var11 += var9[class45.field789 & var12];
				}
				int var13 = 0;
				while (class70.field1276 > var13) {
					var10[var13] = var7 * var11 >> 16;
					int var14 = var11 - var9[var13 - this.field1758 & class45.field789];
					var13++;
					var11 = var14 + var9[class45.field789 & var13 + this.field1758];
				}
				var6[this.field1753 + var8 - arg0] = var10;
			}
			for (int var15 = 0; var15 < class70.field1276; var15++) {
				int var16 = 0;
				for (int var17 = 0; var17 < var3; var17++) {
					var16 += var6[var17][var15];
				}
				var2[var15] = var16 * var4 >> 16;
			}
		}
		return var2;
	}

	@ObfuscatedName("ig.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1758 = arg0.method347();
		} else if (arg1 == 1) {
			this.field1753 = arg0.method347();
		} else if (arg1 == 2) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("ig.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int var3 = this.field1753 + this.field1753 + 1;
			int var4 = 65536 / var3;
			int var5 = this.field1758 + this.field1758 + 1;
			int[][][] var6 = new int[var3][][];
			int var7 = 65536 / var5;
			for (int var8 = arg0 - this.field1753; var8 <= arg0 + this.field1753; var8++) {
				int var9 = 0;
				int var10 = 0;
				int[][] var11 = this.method121(0, class220.field4158 & var8);
				int var12 = 0;
				int[][] var13 = new int[3][class70.field1276];
				int[] var14 = var11[0];
				int[] var15 = var11[1];
				int[] var16 = var11[2];
				for (int var17 = -this.field1758; var17 <= this.field1758; var17++) {
					int var18 = var17 & class45.field789;
					var10 += var16[var18];
					var12 += var14[var18];
					var9 += var15[var18];
				}
				int[] var19 = var13[1];
				int[] var20 = var13[0];
				int[] var21 = var13[2];
				int var22 = 0;
				while (class70.field1276 > var22) {
					var20[var22] = var12 * var7 >> 16;
					var19[var22] = var7 * var9 >> 16;
					var21[var22] = var7 * var10 >> 16;
					int var23 = var22 - this.field1758 & class45.field789;
					int var24 = var12 - var14[var23];
					int var25 = var9 - var15[var23];
					int var26 = var10 - var16[var23];
					var22++;
					int var27 = class45.field789 & this.field1758 + var22;
					var10 = var26 + var16[var27];
					var12 = var24 + var14[var27];
					var9 = var25 + var15[var27];
				}
				var6[var8 + this.field1753 - arg0] = var13;
			}
			int[] var28 = var2[0];
			int[] var29 = var2[1];
			int[] var30 = var2[2];
			for (int var31 = 0; var31 < class70.field1276; var31++) {
				int var32 = 0;
				int var33 = 0;
				int var34 = 0;
				for (int var35 = 0; var35 < var3; var35++) {
					int[][] var36 = var6[var35];
					var33 += var36[1][var31];
					var34 += var36[2][var31];
					var32 += var36[0][var31];
				}
				var28[var31] = var32 * var4 >> 16;
				var29[var31] = var4 * var33 >> 16;
				var30[var31] = var34 * var4 >> 16;
			}
		}
		return var2;
	}
}
