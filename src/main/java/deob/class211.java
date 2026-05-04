package deob;

@ObfuscatedName("td")
public final class class211 extends class23 {

	@ObfuscatedName("td.bb")
	public static int field4004 = 0;

	@ObfuscatedName("td.cb")
	public static final boolean[] field4005 = new boolean[100];

	@ObfuscatedName("td.db")
	public static final class88 field4006 = class208.method1423(105, "Loading wordpack )2 ");

	@ObfuscatedName("td.eb")
	public static class88 field4007 = field4006;

	@ObfuscatedName("td.fb")
	public int field4008 = 204;

	@ObfuscatedName("td.V")
	public static final class92 field3998 = new class92(64);

	@ObfuscatedName("td.Y")
	public int field4001 = 1;

	@ObfuscatedName("td.T")
	public int field3996 = 1;

	@ObfuscatedName("td.a(IIB)I")
	public static int method1439(int arg0, int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			int var2 = arg1 % arg0;
			arg1 = arg0;
			arg0 = var2;
		}
		return arg1;
	}

	@ObfuscatedName("td.a(IZ)I")
	public static int method1441(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("td.b(II)Li;")
	public static class88 method1442(int arg0) {
		return arg0 < 999999999 ? class170.method1212(arg0) : class3.field40;
	}

	@ObfuscatedName("td.a(ILnb;Lnb;)V")
	public static void method1443(class144 arg0, class144 arg1) {
		class141.field2607 = arg0;
		class59.field1114 = arg1;
	}

	@ObfuscatedName("td.a(Lu;I)V")
	public static void method1444(class218 arg0) {
		if (arg0.field4130 == class117.field2113 || arg0.field4077 == -1 || arg0.field4140 != 0 || arg0.field4098 + 1 > class15.method75(arg0.field4077).field1990[arg0.field4101]) {
			int var1 = class117.field2113 - arg0.field4133;
			int var2 = arg0.field4113 * 128 + arg0.field4103 * 64;
			int var3 = arg0.field4130 - arg0.field4133;
			int var4 = arg0.field4094 * 128 + arg0.field4103 * 64;
			int var5 = arg0.field4100 * 128 + arg0.field4103 * 64;
			int var6 = arg0.field4072 * 128 + arg0.field4103 * 64;
			arg0.field4121 = ((var3 - var1) * var4 + var6 * var1) / var3;
			arg0.field4136 = ((var3 - var1) * var2 + var5 * var1) / var3;
		}
		arg0.field4108 = 0;
		if (arg0.field4139 == 0) {
			arg0.field4119 = 1024;
		}
		if (arg0.field4139 == 1) {
			arg0.field4119 = 1536;
		}
		if (arg0.field4139 == 2) {
			arg0.field4119 = 0;
		}
		if (arg0.field4139 == 3) {
			arg0.field4119 = 512;
		}
		arg0.field4085 = arg0.field4119;
	}

	@ObfuscatedName("td.c(II)Z")
	public static boolean method1445(int arg0) {
		if (class167.field3211[arg0]) {
			return true;
		} else if (class85.field1545.method970(arg0)) {
			int var1 = class85.field1545.method942(arg0);
			if (var1 == 0) {
				class167.field3211[arg0] = true;
				return true;
			}
			if (class78.field1418[arg0] == null) {
				class78.field1418[arg0] = new class174[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (class78.field1418[arg0][var2] == null) {
					byte[] var3 = class85.field1545.method939(var2, arg0);
					if (var3 != null) {
						class78.field1418[arg0][var2] = new class174();
						class78.field1418[arg0][var2].field3423 = var2 + (arg0 << 16);
						if (var3[0] == -1) {
							class78.field1418[arg0][var2].method1250(new class46(var3));
						} else {
							class78.field1418[arg0][var2].method1255(new class46(var3));
						}
					}
				}
			}
			class167.field3211[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	public class211() {
		super(0, true);
	}

	@ObfuscatedName("td.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < class70.field1276; var3++) {
				int var4 = class22.field351[var3];
				int var5 = class111.field2021[arg0];
				int var6 = var4 * this.field3996 >> 12;
				int var7 = this.field4001 * var5 >> 12;
				int var8 = this.field3996 * (var4 % (4096 / this.field3996));
				int var9 = var5 % (4096 / this.field4001) * this.field4001;
				if (var9 < this.field4008) {
					for (var6 -= var7; var6 < 0; var6 += 4) {
					}
					while (var6 > 3) {
						var6 -= 4;
					}
					if (var6 != 1) {
						var2[var3] = 0;
						continue;
					}
					if (var8 < this.field4008) {
						var2[var3] = 0;
						continue;
					}
				}
				if (this.field4008 > var8) {
					int var10;
					for (var10 = var6 - var7; var10 < 0; var10 += 4) {
					}
					while (var10 > 3) {
						var10 -= 4;
					}
					if (var10 > 0) {
						var2[var3] = 0;
						continue;
					}
				}
				var2[var3] = 4096;
			}
		}
		return var2;
	}

	@ObfuscatedName("td.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3996 = arg0.method347();
		} else if (arg1 == 1) {
			this.field4001 = arg0.method347();
		} else if (arg1 == 2) {
			this.field4008 = arg0.method301();
		}
	}
}
