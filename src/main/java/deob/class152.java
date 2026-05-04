package deob;

@ObfuscatedName("o")
public final class class152 extends class23 {

	@ObfuscatedName("o.T")
	public static final class88 field2945 = class208.method1423(105, "Anmelde)2Limit -Uberschritten)3");

	@ObfuscatedName("o.W")
	public static final int[][] field2948 = new int[104][104];

	@ObfuscatedName("o.S")
	public static final class88 field2944 = class208.method1423(105, "button near the top of that page)3");

	@ObfuscatedName("o.R")
	public static class88 field2943 = field2944;

	@ObfuscatedName("o.Y")
	public static final class88 field2950 = class208.method1423(105, "mem=");

	@ObfuscatedName("o.a(II[Li;I[S)V")
	public static void method1037(int arg0, class88[] arg1, int arg2, short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		int var4 = (arg0 + arg2) / 2;
		class88 var5 = arg1[var4];
		arg1[var4] = arg1[arg2];
		int var6 = arg0;
		arg1[arg2] = var5;
		short var7 = arg3[var4];
		arg3[var4] = arg3[arg2];
		arg3[arg2] = var7;
		for (int var8 = arg0; var8 < arg2; var8++) {
			if (var5 == null || arg1[var8] != null && arg1[var8].method625(var5) < (var8 & 0x1)) {
				class88 var9 = arg1[var8];
				arg1[var8] = arg1[var6];
				arg1[var6] = var9;
				short var10 = arg3[var8];
				arg3[var8] = arg3[var6];
				arg3[var6++] = var10;
			}
		}
		arg1[arg2] = arg1[var6];
		arg1[var6] = var5;
		arg3[arg2] = arg3[var6];
		arg3[var6] = var7;
		method1037(arg0, arg1, var6 - 1, arg3);
		method1037(var6 + 1, arg1, arg2, arg3);
	}

	@ObfuscatedName("o.a(Lnb;Lnb;ILnb;)V")
	public static void method1038(class144 arg0, class144 arg1, class144 arg2) {
		class110.field2009 = arg1.method964(class39.field689);
		class151.field2932 = arg2.method964(class62.field1143);
		class104.field1896 = arg2.method964(client.field561);
		class157.field3019 = arg2.method964(class116.field2089);
		class245.field4502 = arg2.method964(class20.field316);
		class150.field2912 = arg2.method964(class92.field1733);
		class14.field209 = arg2.method964(class228.field4278);
		class8.field119 = arg2.method964(class212.field4011);
		class97.field1783 = arg2.method964(class47.field881);
		class120.field2195 = arg2.method964(class7.field102);
		class226.field4247 = arg2.method964(class89.field1682);
		class86.field1552 = arg0.method964(class119.field2156);
	}

	@ObfuscatedName("o.f(I)I")
	public static int method1040() {
		int var0 = class239.method1584(class79.field1428, class184.field3608, class149.field2907);
		return var0 - class108.field1954 >= 800 || (class116.field2098[class149.field2907][class79.field1428 >> 7][class184.field3608 >> 7] & 0x4) == 0 ? 3 : class149.field2907;
	}

	public class152() {
		super(1, true);
	}

	@ObfuscatedName("o.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			for (int var7 = 0; var7 < class70.field1276; var7++) {
				var2[var7] = (var4[var7] + var6[var7] + var5[var7]) / 3;
			}
		}
		return var2;
	}
}
