package deob;

import java.util.Random;

@ObfuscatedName("ra")
public final class class186 extends class23 {

	@ObfuscatedName("ra.ab")
	public int field3632;

	@ObfuscatedName("ra.cb")
	public int field3634 = 409;

	@ObfuscatedName("ra.db")
	public int field3635 = 2048;

	@ObfuscatedName("ra.eb")
	public static final class88 field3636 = class208.method1423(105, "<col=ff3000>");

	@ObfuscatedName("ra.fb")
	public int field3637 = 1024;

	@ObfuscatedName("ra.gb")
	public static int field3638 = 0;

	@ObfuscatedName("ra.hb")
	public int field3639 = 0;

	@ObfuscatedName("ra.jb")
	public int field3641 = 819;

	@ObfuscatedName("ra.kb")
	public int field3642 = 0;

	@ObfuscatedName("ra.V")
	public static final class88 field3627 = class208.method1423(105, "sch-Utteln:");

	@ObfuscatedName("ra.Z")
	public static volatile long field3631 = 0L;

	@ObfuscatedName("ra.R")
	public static final class210 field3623 = new class210();

	@ObfuscatedName("ra.U")
	public int field3626 = 1024;

	@ObfuscatedName("ra.Q")
	public int field3622 = 1024;

	@ObfuscatedName("ra.S")
	public int field3624 = 1024;

	@ObfuscatedName("ra.d(Z)V")
	public static void method1307() {
		if (class154.field2969 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (class154.field2969 > 768) {
					class157.field3034[var0] = class228.method1525(class15.field234[var0], 1024 - class154.field2969, class3.field32[var0]);
				} else if (class154.field2969 <= 256) {
					class157.field3034[var0] = class228.method1525(class3.field32[var0], 256 - class154.field2969, class15.field234[var0]);
				} else {
					class157.field3034[var0] = class15.field234[var0];
				}
			}
		} else if (class161.field3099 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (class161.field3099 > 768) {
					class157.field3034[var1] = class228.method1525(class156.field3014[var1], 1024 - class161.field3099, class3.field32[var1]);
				} else if (class161.field3099 <= 256) {
					class157.field3034[var1] = class228.method1525(class3.field32[var1], 256 - class161.field3099, class156.field3014[var1]);
				} else {
					class157.field3034[var1] = class156.field3014[var1];
				}
			}
		} else {
			for (int var2 = 0; var2 < 256; var2++) {
				class157.field3034[var2] = class3.field32[var2];
			}
		}
		int var3 = class88.field1640.field3654 * 9;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 1; var6 < 255; var6++) {
			int var7 = class240.field4454[var6] * (256 - var6) / 256 + 22;
			if (var7 < 0) {
				var7 = 0;
			}
			var4 += var7;
			for (int var8 = var7; var8 < 128; var8++) {
				int var9 = class190.field3667[var4++];
				int var10 = class88.field1640.field3247[var3++];
				if (var9 == 0) {
					class34.field589.field3247[var5++] = var10;
				} else {
					int var12 = 256 - var9;
					int var13 = class157.field3034[var9];
					class34.field589.field3247[var5++] = ((var13 & 0xFF00FF) * var9 + var12 * (var10 & 0xFF00FF) & 0xFF00FF00) + (var12 * (var10 & 0xFF00) + (var13 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			for (int var14 = 0; var14 < var7; var14++) {
				class34.field589.field3247[var5++] = class88.field1640.field3247[var3++];
			}
			var3 += class88.field1640.field3654 - 128;
		}
		int var15 = 0;
		int var16 = 0;
		class34.field589.method1161(0, 9);
		int var17 = class88.field1640.field3654 * 9 + 128;
		for (int var18 = 1; var18 < 255; var18++) {
			int var19 = class240.field4454[var18] * (256 - var18) / 256 + 22;
			if (var19 < 0) {
				var19 = 0;
			}
			for (int var20 = 0; var20 < var19; var20++) {
				int var10001 = var15++;
				var17--;
				class89.field1675.field3247[var10001] = class88.field1640.field3247[var17];
			}
			for (int var21 = var19; var21 < 128; var21++) {
				int var22 = class190.field3667[var16++];
				var17--;
				int var23 = class88.field1640.field3247[var17];
				if (var22 == 0) {
					class89.field1675.field3247[var15++] = var23;
				} else {
					int var25 = 256 - var22;
					int var26 = class157.field3034[var22];
					class89.field1675.field3247[var15++] = ((var23 & 0xFF00) * var25 + var22 * (var26 & 0xFF00) & 0xFF0000) + ((var23 & 0xFF00FF) * var25 + (var26 & 0xFF00FF) * var22 & 0xFF00FF00) >> 8;
				}
			}
			var17 += class88.field1640.field3654 + 128;
			var16 += var19;
		}
		class89.field1675.method1161(637, 9);
	}

	public class186() {
		super(0, true);
	}

	@ObfuscatedName("ra.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (!super.field379.field3098) {
			return var2;
		}
		int[][] var3 = super.field379.method1075();
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		boolean var9 = true;
		boolean var10 = true;
		int var11 = 0;
		int var12 = this.field3637 * class70.field1276 >> 12;
		int var13 = 0;
		int var14 = this.field3635 * class70.field1276 >> 12;
		int var15 = class27.field460 * this.field3634 >> 12;
		int var16 = class27.field460 * this.field3641 >> 12;
		if (var16 <= 1) {
			return var3[arg0];
		}
		this.field3632 = this.field3624 * (class70.field1276 / 8) >> 12;
		int var17 = class70.field1276 / var12 + 1;
		int[][] var18 = new int[var17][3];
		Random var19 = new Random((long) this.field3639);
		int[][] var20 = new int[var17][3];
		while (true) {
			while (true) {
				int var21 = var12 + class119.method812(var14 - var12, var19);
				int var22 = var21 + var7;
				int var23 = var15 + class119.method812(var16 - var15, var19);
				if (var22 > class70.field1276) {
					var22 = class70.field1276;
					var21 = class70.field1276 - var7;
				}
				int var27;
				if (var10) {
					var27 = 0;
				} else {
					int var24 = var8;
					int[] var25 = var20[var8];
					int var26 = 0;
					var27 = var25[2];
					int var28 = var22 + var4;
					if (var28 < 0) {
						var28 += class70.field1276;
					}
					if (class70.field1276 < var28) {
						var28 -= class70.field1276;
					}
					while (true) {
						int[] var29 = var20[var24];
						if (var28 >= var29[0] && var28 <= var29[1]) {
							if (var8 != var24) {
								int var30 = var4 + var7;
								if (var30 < 0) {
									var30 += class70.field1276;
								}
								if (var30 > class70.field1276) {
									var30 -= class70.field1276;
								}
								for (int var31 = 1; var31 <= var26; var31++) {
									int[] var32 = var20[(var31 + var8) % var13];
									var27 = Math.max(var27, var32[2]);
								}
								for (int var33 = 0; var33 <= var26; var33++) {
									int[] var34 = var20[(var8 + var33) % var13];
									int var35 = var34[2];
									if (var35 != var27) {
										int var36 = var34[1];
										int var37 = var34[0];
										int var38;
										int var39;
										if (var28 > var30) {
											var39 = Math.max(var30, var37);
											var38 = Math.min(var28, var36);
										} else if (var37 == 0) {
											var38 = Math.min(var28, var36);
											var39 = 0;
										} else {
											var39 = Math.max(var30, var37);
											var38 = class70.field1276;
										}
										this.method1308(var19, var3, var6 + var39, var35, var38 - var39, var27 - var35);
									}
								}
							}
							var8 = var24;
							break;
						}
						var24++;
						if (var24 >= var13) {
							var24 = 0;
						}
						var26++;
					}
				}
				if (var23 + var27 <= class27.field460) {
					var9 = false;
				} else {
					var23 = class27.field460 - var27;
				}
				if (class70.field1276 == var22) {
					this.method1308(var19, var3, var7 + var5, var27, var21, var23);
					if (var9) {
						return var2;
					}
					var9 = true;
					var8 = 0;
					var10 = false;
					int[] var40 = var18[var11++];
					var40[2] = var27 + var23;
					int[][] var41 = var20;
					var13 = var11;
					var40[0] = var7;
					var7 = 0;
					var20 = var18;
					var6 = var5;
					var11 = 0;
					var40[1] = var22;
					var18 = var41;
					var5 = class119.method812(class70.field1276, var19);
					var4 = var5 - var6;
					int var42 = var4;
					if (var4 < 0) {
						var42 = var4 + class70.field1276;
					}
					if (var42 > class70.field1276) {
						var42 -= class70.field1276;
					}
					while (true) {
						int[] var43 = var20[var8];
						if (var42 >= var43[0] && var43[1] >= var42) {
							break;
						}
						var8++;
						if (var8 >= var13) {
							var8 = 0;
						}
					}
				} else {
					int[] var44 = var18[var11++];
					var44[0] = var7;
					var44[2] = var23 + var27;
					var44[1] = var22;
					this.method1308(var19, var3, var7 + var5, var27, var21, var23);
					var7 = var22;
				}
			}
		}
	}

	@ObfuscatedName("ra.a(Ljava/util/Random;[[IIIIZI)V")
	public void method1308(Random arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = this.field3622 <= 0 ? 4096 : 4096 - class119.method812(this.field3622, arg0);
		int var8 = this.field3626 * this.field3632 >> 12;
		int var9 = this.field3632 - (var8 <= 0 ? 0 : class119.method812(var8, arg0));
		if (class70.field1276 <= arg2) {
			arg2 -= class70.field1276;
		}
		if (var9 > 0) {
			if (arg5 <= 0 || arg4 <= 0) {
				return;
			}
			int var14 = arg4 / 2;
			int var15 = arg5 / 2;
			int var16 = var15 >= var9 ? var9 : var15;
			int var17 = var14 >= var9 ? var9 : var14;
			int var18 = var17 + arg2;
			int var19 = arg4 - var17 * 2;
			for (int var20 = 0; var20 < arg5; var20++) {
				int[] var21 = arg1[arg3 + var20];
				if (var16 > var20) {
					int var22 = var7 * var20 / var16;
					if (this.field3642 == 0) {
						for (int var25 = 0; var25 < var17; var25++) {
							int var26 = var7 * var25 / var17;
							var21[arg2 + var25 & class45.field789] = var21[arg4 + arg2 - var25 - 1 & class45.field789] = var22 * var26 >> 12;
						}
					} else {
						for (int var23 = 0; var23 < var17; var23++) {
							int var24 = var23 * var7 / var17;
							var21[var23 + arg2 & class45.field789] = var21[arg2 + arg4 - var23 - 1 & class45.field789] = var22 <= var24 ? var22 : var24;
						}
					}
					if (class70.field1276 < var19 + var18) {
						int var27 = class70.field1276 - var18;
						class124.method837(var21, var18, var27, var22);
						class124.method837(var21, 0, var19 - var27, var22);
					} else {
						class124.method837(var21, var18, var19, var22);
					}
				} else {
					int var28 = arg5 - var20 - 1;
					if (var16 > var28) {
						int var29 = var28 * var7 / var16;
						if (this.field3642 == 0) {
							for (int var32 = 0; var32 < var17; var32++) {
								int var33 = var7 * var32 / var17;
								var21[class45.field789 & var32 + arg2] = var21[class45.field789 & arg2 + arg4 - var32 - 1] = var33 * var29 >> 12;
							}
						} else {
							for (int var30 = 0; var30 < var17; var30++) {
								int var31 = var30 * var7 / var17;
								var21[class45.field789 & var30 + arg2] = var21[class45.field789 & arg2 + arg4 - var30 - 1] = var29 <= var31 ? var29 : var31;
							}
						}
						if (class70.field1276 >= var18 + var19) {
							class124.method837(var21, var18, var19, var29);
						} else {
							int var34 = class70.field1276 - var18;
							class124.method837(var21, var18, var34, var29);
							class124.method837(var21, 0, var19 - var34, var29);
						}
					} else {
						for (int var35 = 0; var35 < var17; var35++) {
							var21[var35 + arg2 & class45.field789] = var21[class45.field789 & arg4 + arg2 - var35 - 1] = var7 * var35 / var17;
						}
						if (var19 + var18 <= class70.field1276) {
							class124.method837(var21, var18, var19, var7);
						} else {
							int var36 = class70.field1276 - var18;
							class124.method837(var21, var18, var36, var7);
							class124.method837(var21, 0, var19 - var36, var7);
						}
					}
				}
			}
		} else if (arg4 + arg2 > class70.field1276) {
			int var10 = class70.field1276 - arg2;
			for (int var11 = 0; var11 < arg5; var11++) {
				int[] var12 = arg1[arg3 + var11];
				class124.method837(var12, arg2, var10, var7);
				class124.method837(var12, 0, arg4 - var10, var7);
			}
		} else {
			for (int var13 = 0; var13 < arg5; var13++) {
				class124.method837(arg1[var13 + arg3], arg2, arg4, var7);
			}
		}
	}

	@ObfuscatedName("ra.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3639 = arg0.method347();
		} else if (arg1 == 1) {
			this.field3637 = arg0.method301();
		} else if (arg1 == 2) {
			this.field3635 = arg0.method301();
		} else if (arg1 == 3) {
			this.field3634 = arg0.method301();
		} else if (arg1 == 4) {
			this.field3641 = arg0.method301();
		} else if (arg1 == 5) {
			this.field3624 = arg0.method301();
		} else if (arg1 == 6) {
			this.field3642 = arg0.method347();
		} else if (arg1 == 7) {
			this.field3626 = arg0.method301();
		} else if (arg1 == 8) {
			this.field3622 = arg0.method301();
		}
	}

	@ObfuscatedName("ra.b(B)V")
	@Override
	public void method123() {
	}
}
