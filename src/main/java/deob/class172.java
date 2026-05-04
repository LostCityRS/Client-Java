package deob;

@ObfuscatedName("pi")
public final class class172 extends class23 {

	@ObfuscatedName("pi.bb")
	public static int field3343;

	@ObfuscatedName("pi.db")
	public static int field3345;

	@ObfuscatedName("pi.eb")
	public int field3346;

	@ObfuscatedName("pi.U")
	public static int field3336 = -1;

	@ObfuscatedName("pi.V")
	public static final class88 field3337 = class208.method1423(105, "::noclip");

	@ObfuscatedName("pi.Y")
	public static final class88 field3340 = class208.method1423(105, "Mitglieder)2Welt");

	@ObfuscatedName("pi.S")
	public static final class88 field3334 = class208.method1423(105, ":clan:");

	@ObfuscatedName("pi.X")
	public static int field3339 = 0;

	@ObfuscatedName("pi.R")
	public static int field3333 = 0;

	@ObfuscatedName("pi.c(B)V")
	public static void method1218() {
		for (int var0 = 0; var0 < class192.field3702; var0++) {
			int var1 = class139.field2579[var0];
			class44 var2 = class244.field4491[var1];
			int var3 = class230.field4312.method347();
			if ((var3 & 0x2) != 0) {
				var3 += class230.field4312.method347() << 8;
			}
			class203.method1394(var3, var2, var1);
		}
	}

	@ObfuscatedName("pi.a(ILog;)V")
	public static void method1219(class159 arg0) {
		long var1 = 0L;
		if (arg0.field3063 == 0) {
			var1 = class157.method1062(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		int var3 = 0;
		int var4 = 0;
		int var5 = -1;
		if (arg0.field3063 == 1) {
			var1 = class161.method1082(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 2) {
			var1 = class112.method770(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 3) {
			var1 = class74.method501(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (var1 != 0L) {
			var4 = (int) var1 >> 20 & 0x3;
			var5 = (int) (var1 >>> 32) & Integer.MAX_VALUE;
			var3 = (int) var1 >> 14 & 0x1F;
		}
		arg0.field3064 = var4;
		arg0.field3053 = var5;
		arg0.field3060 = var3;
	}

	@ObfuscatedName("pi.a(Lea;Li;B)I")
	public static int method1220(class46 arg0, class88 arg1) {
		int var2 = arg0.field831;
		arg0.method308(arg1.field1660);
		arg0.field831 += class112.field2033.method1456(arg1.field1643, arg0.field831, arg1.field1660, 0, arg0.field842);
		return arg0.field831 - var2;
	}

	@ObfuscatedName("pi.b(II)V")
	public static void method1221(int arg0) {
		class157.field3033 = arg0;
		class34.field594 = -1;
		class34.field594 = -1;
		class245.method1604();
	}

	public class172(int arg0) {
		super(0, true);
		this.field3346 = 4096;
		this.field3346 = 4096;
	}

	public class172() {
		this(4096);
	}

	@ObfuscatedName("pi.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			class124.method837(var2, 0, class70.field1276, this.field3346);
		}
		return var2;
	}

	@ObfuscatedName("pi.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3346 = (arg0.method347() << 12) / 255;
		}
	}
}
