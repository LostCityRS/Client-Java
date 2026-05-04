package deob;

@ObfuscatedName("ma")
public final class class132 extends class23 {

	@ObfuscatedName("ma.ab")
	public static final int[] field2471 = new int[100];

	@ObfuscatedName("ma.bb")
	public static int field2472;

	@ObfuscatedName("ma.db")
	public static final class88 field2474 = class208.method1423(105, "RuneScape is loading )2 please wait)3)3)3");

	@ObfuscatedName("ma.eb")
	public int field2475 = 1;

	@ObfuscatedName("ma.fb")
	public int field2476 = 0;

	@ObfuscatedName("ma.gb")
	public static final class88 field2477 = class208.method1423(105, "Error loading your profile)3");

	@ObfuscatedName("ma.hb")
	public int field2478 = 0;

	@ObfuscatedName("ma.R")
	public static final class88 field2462 = class208.method1423(105, "<col=00ff80>");

	@ObfuscatedName("ma.W")
	public static final class88 field2467 = class208.method1423(105, "M");

	@ObfuscatedName("ma.T")
	public static class88 field2464 = field2467;

	@ObfuscatedName("ma.Y")
	public static class88 field2469 = field2467;

	@ObfuscatedName("ma.Z")
	public static class88 field2470 = field2477;

	@ObfuscatedName("ma.U")
	public static boolean field2465 = false;

	@ObfuscatedName("ma.V")
	public static class88 field2466 = field2474;

	@ObfuscatedName("ma.a(IIIIIII)V")
	public static void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (class67.field1207 <= arg5 && arg2 <= class12.field183 && arg1 >= class49.field919 && class18.field279 >= arg3) {
			if (arg0 == 1) {
				class207.method1420(arg5, arg2, arg3, arg1, arg4);
			} else {
				class115.method786(arg2, arg4, arg0, arg3, arg1, arg5);
			}
		} else if (arg0 == 1) {
			class150.method1028(arg3, arg4, arg5, arg1, arg2);
		} else {
			class21.method101(arg3, arg0, arg5, arg1, arg2, arg4);
		}
	}

	public class132() {
		super(0, true);
	}

	@ObfuscatedName("ma.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2476 = arg0.method347();
		} else if (arg1 == 1) {
			this.field2478 = arg0.method347();
		} else if (arg1 == 3) {
			this.field2475 = arg0.method347();
		}
	}

	@ObfuscatedName("ma.b(B)V")
	@Override
	public void method123() {
		class108.method740();
	}

	@ObfuscatedName("ma.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			int var4 = var3 - 2048 >> 1;
			for (int var5 = 0; var5 < class70.field1276; var5++) {
				int var6 = class22.field351[var5];
				int var7 = var6 - 2048 >> 1;
				int var8;
				if (this.field2476 == 0) {
					var8 = (var6 - var3) * this.field2475;
				} else {
					int var9 = var4 * var4 + var7 * var7 >> 12;
					int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
					var8 = (int) ((double) (var10 * this.field2475) * 3.141592653589793D);
				}
				int var11 = var8 - (var8 & 0xFFFFF000);
				if (this.field2478 == 0) {
					var11 = class92.field1734[var11 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.field2478 == 2) {
					var11 -= 2048;
					if (var11 < 0) {
						var11 = -var11;
					}
					var11 = 2048 - var11 << 1;
				}
				var2[var5] = var11;
			}
		}
		return var2;
	}
}
