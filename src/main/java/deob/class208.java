package deob;

@ObfuscatedName("ta")
public final class class208 extends class23 {

	@ObfuscatedName("ta.ab")
	public static int field3952 = 0;

	@ObfuscatedName("ta.db")
	public static final short[] field3955 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@ObfuscatedName("ta.Q")
	public static final class88 field3942 = method1423(105, "Type");

	@ObfuscatedName("ta.V")
	public static final class88 field3947 = method1423(105, "oder benutzen Sie eine andere Welt)3");

	@ObfuscatedName("ta.X")
	public static final int[] field3949 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("ta.R")
	public static int field3943 = 0;

	@ObfuscatedName("ta.Y")
	public static class88 field3950 = field3942;

	@ObfuscatedName("ta.U")
	public static class130 field3946;

	@ObfuscatedName("ta.Z")
	public static byte[][][] field3951;

	@ObfuscatedName("ta.a(ILjava/lang/String;)Li;")
	public static class88 method1423(int arg0, String arg1) {
		byte[] var2 = arg1.getBytes();
		int var3 = 0;
		int var4 = var2.length;
		class88 var5 = new class88();
		var5.field1643 = new byte[var4];
		if (arg0 != 105) {
			field3946 = null;
		}
		while (var4 > var3) {
			int var6 = var2[var3++] & 0xFF;
			if (var6 <= 45 && var6 >= 40) {
				if (var4 <= var3) {
					break;
				}
				int var7 = var2[var3++] & 0xFF;
				var5.field1643[var5.field1660++] = (byte) ((var6 - 40) * 43 + var7 - 48);
			} else if (var6 != 0) {
				var5.field1643[var5.field1660++] = (byte) var6;
			}
		}
		var5.method629();
		return var5.method601(-35);
	}

	@ObfuscatedName("ta.a(IZ)V")
	public static void method1425() {
		class151.field2940 = new int[104];
		class28.field468 = 99;
		class85.field1541 = new int[104];
		class221.field4173 = new int[104];
		class156.field3012 = new int[104];
		class221.field4174 = new int[104];
		class111.field2020 = new byte[4][105][105];
		class109.field1962 = new byte[4][104][104];
		class164.field3142 = new byte[4][104][104];
		class234.field4377 = new byte[4][104][104];
		class135.field2511 = new int[4][105][105];
		class8.field115 = new byte[4][104][104];
	}

	public class208() {
		super(0, true);
	}

	@ObfuscatedName("ta.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				var2[var4] = this.method1426(var3, class22.field351[var4]) % 4096;
			}
		}
		return var2;
	}

	@ObfuscatedName("ta.a(IIB)I")
	public int method1426(int arg0, int arg1) {
		int var3 = arg1 + arg0 * 57;
		int var4 = var3 ^ var3 << 1;
		return 4096 - ((var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
