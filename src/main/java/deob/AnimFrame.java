package deob;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.a")
	public static int field161 = 9;

	@ObfuscatedName("h.b")
	public static boolean field162 = true;

	@ObfuscatedName("h.c")
	public static AnimFrame[] field163;

	@ObfuscatedName("h.d")
	public int field164;

	@ObfuscatedName("h.e")
	public AnimBase field165;

	@ObfuscatedName("h.f")
	public int field166;

	@ObfuscatedName("h.g")
	public int[] field167;

	@ObfuscatedName("h.h")
	public int[] field168;

	@ObfuscatedName("h.i")
	public int[] field169;

	@ObfuscatedName("h.j")
	public int[] field170;

	@ObfuscatedName("h.a(I)V")
	public static void method58(int arg0) {
		field163 = new AnimFrame[arg0 + 1];
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void method59(int arg0, byte[] arg1) {
		Packet var2 = new Packet((byte) -109, arg1);
		var2.field719 = arg1.length - 8;
		int var3 = var2.method240();
		int var4 = var2.method240();
		int var5 = var2.method240();
		int var6 = var2.method240();
		byte var7 = 0;
		Packet var8 = new Packet((byte) -109, arg1);
		int var9 = 88 / arg0;
		var8.field719 = var7;
		int var10 = var3 + 2 + var7;
		Packet var11 = new Packet((byte) -109, arg1);
		var11.field719 = var10;
		int var12 = var4 + var10;
		Packet var13 = new Packet((byte) -109, arg1);
		var13.field719 = var12;
		int var14 = var5 + var12;
		Packet var15 = new Packet((byte) -109, arg1);
		var15.field719 = var14;
		int var16 = var6 + var14;
		Packet var17 = new Packet((byte) -109, arg1);
		var17.field719 = var16;
		AnimBase var18 = new AnimBase(var17, field161);
		int var19 = var8.method240();
		int[] var20 = new int[500];
		int[] var21 = new int[500];
		int[] var22 = new int[500];
		int[] var23 = new int[500];
		for (int var24 = 0; var24 < var19; var24++) {
			int var25 = var8.method240();
			AnimFrame var26 = field163[var25] = new AnimFrame();
			var26.field164 = var15.method238();
			var26.field165 = var18;
			int var27 = var8.method238();
			int var28 = -1;
			int var29 = 0;
			for (int var30 = 0; var30 < var27; var30++) {
				int var32 = var11.method238();
				if (var32 > 0) {
					if (var18.field159[var30] != 0) {
						for (int var33 = var30 - 1; var33 > var28; var33--) {
							if (var18.field159[var33] == 0) {
								var20[var29] = var33;
								var21[var29] = 0;
								var22[var29] = 0;
								var23[var29] = 0;
								var29++;
								break;
							}
						}
					}
					var20[var29] = var30;
					short var34 = 0;
					if (var18.field159[var20[var29]] == 3) {
						var34 = 128;
					}
					if ((var32 & 0x1) == 0) {
						var21[var29] = var34;
					} else {
						var21[var29] = var13.method251();
					}
					if ((var32 & 0x2) == 0) {
						var22[var29] = var34;
					} else {
						var22[var29] = var13.method251();
					}
					if ((var32 & 0x4) == 0) {
						var23[var29] = var34;
					} else {
						var23[var29] = var13.method251();
					}
					var28 = var30;
					var29++;
				}
			}
			var26.field166 = var29;
			var26.field167 = new int[var29];
			var26.field168 = new int[var29];
			var26.field169 = new int[var29];
			var26.field170 = new int[var29];
			for (int var31 = 0; var31 < var29; var31++) {
				var26.field167[var31] = var20[var31];
				var26.field168[var31] = var21[var31];
				var26.field169[var31] = var22[var31];
				var26.field170[var31] = var23[var31];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void method60(byte arg0) {
		if (arg0 == 9) {
			field163 = null;
		}
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame method61(int arg0, int arg1) {
		while (arg1 >= 0) {
		}
		if (field163 == null) {
			return null;
		} else {
			return field163[arg0];
		}
	}
}
