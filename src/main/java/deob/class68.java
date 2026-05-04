package deob;

@ObfuscatedName("ga")
public final class class68 implements class61 {

	@ObfuscatedName("ga.a")
	public final byte[] field1222;

	@ObfuscatedName("ga.b")
	public final boolean[] field1223;

	@ObfuscatedName("ga.c")
	public final byte[] field1224;

	@ObfuscatedName("ga.e")
	public final class144 field1226;

	@ObfuscatedName("ga.f")
	public int field1227 = 50;

	@ObfuscatedName("ga.g")
	public static final class88 field1228 = class208.method1423(105, "Connecting to update server");

	@ObfuscatedName("ga.h")
	public final short[] field1229;

	@ObfuscatedName("ga.k")
	public final class92 field1232;

	@ObfuscatedName("ga.l")
	public final byte[] field1233;

	@ObfuscatedName("ga.m")
	public static final class88 field1234 = class208.method1423(105, "Unerwartete Antwort vom Anmelde)2Server)3");

	@ObfuscatedName("ga.n")
	public final class144 field1235;

	@ObfuscatedName("ga.o")
	public static final class156 field1236 = new class156(0, 0);

	@ObfuscatedName("ga.p")
	public final boolean[] field1237;

	@ObfuscatedName("ga.q")
	public static final class88 field1238 = class208.method1423(105, " (X");

	@ObfuscatedName("ga.t")
	public final boolean[] field1241;

	@ObfuscatedName("ga.v")
	public final boolean[] field1243;

	@ObfuscatedName("ga.D")
	public static class88 field1251 = field1228;

	@ObfuscatedName("ga.A")
	public boolean field1248 = false;

	@ObfuscatedName("ga.E")
	public final boolean[] field1252;

	@ObfuscatedName("ga.C")
	public final byte[] field1250;

	@ObfuscatedName("ga.a(IZ)Z")
	public static boolean method465(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	public class68(class144 arg0, class144 arg1, class144 arg2, int arg3, boolean arg4) {
		this.field1248 = arg4;
		this.field1226 = arg0;
		this.field1235 = arg2;
		this.field1227 = 20;
		this.field1232 = new class92(this.field1227);
		class46 var6 = new class46(arg1.method939(0, 0));
		int var7 = var6.method301();
		this.field1222 = new byte[var7];
		this.field1223 = new boolean[var7];
		this.field1252 = new boolean[var7];
		this.field1224 = new byte[var7];
		this.field1250 = new byte[var7];
		this.field1237 = new boolean[var7];
		this.field1243 = new boolean[var7];
		this.field1241 = new boolean[var7];
		this.field1233 = new byte[var7];
		this.field1229 = new short[var7];
		for (int var8 = 0; var8 < var7; var8++) {
			this.field1243[var8] = var6.method347() == 1;
		}
		for (int var9 = 0; var9 < var7; var9++) {
			if (this.field1243[var9]) {
				this.field1223[var9] = var6.method347() == 1;
			}
		}
		for (int var10 = 0; var10 < var7; var10++) {
			if (this.field1243[var10]) {
				this.field1252[var10] = var6.method347() == 1;
			}
		}
		for (int var11 = 0; var11 < var7; var11++) {
			if (this.field1243[var11]) {
				this.field1237[var11] = var6.method347() == 1;
			}
		}
		for (int var12 = 0; var12 < var7; var12++) {
			if (this.field1243[var12]) {
				this.field1241[var12] = var6.method347() == 1;
			}
		}
		for (int var13 = 0; var13 < var7; var13++) {
			if (this.field1243[var13]) {
				this.field1222[var13] = var6.method324();
			}
		}
		for (int var14 = 0; var14 < var7; var14++) {
			if (this.field1243[var14]) {
				this.field1250[var14] = var6.method324();
			}
		}
		for (int var15 = 0; var15 < var7; var15++) {
			if (this.field1243[var15]) {
				this.field1224[var15] = var6.method324();
			}
		}
		for (int var16 = 0; var16 < var7; var16++) {
			if (this.field1243[var16]) {
				this.field1233[var16] = var6.method324();
			}
		}
		for (int var17 = 0; var17 < var7; var17++) {
			if (this.field1243[var17]) {
				this.field1229[var17] = (short) var6.method301();
			}
		}
	}

	@ObfuscatedName("ga.a(II)Z")
	@Override
	public boolean method434(int arg0) {
		return this.field1252[arg0];
	}

	@ObfuscatedName("ga.a(IB)Z")
	@Override
	public boolean method436(int arg0) {
		return this.field1223[arg0];
	}

	@ObfuscatedName("ga.c(IB)Z")
	@Override
	public boolean method439(int arg0) {
		class199 var2 = this.method462(arg0);
		return var2 == null ? false : var2.method1368(this, this.field1235);
	}

	@ObfuscatedName("ga.b(II)I")
	@Override
	public int method438(int arg0) {
		return this.field1229[arg0] & 0xFFFF;
	}

	@ObfuscatedName("ga.d(IB)Lsc;")
	public class199 method462(int arg0) {
		class199 var2 = (class199) this.field1232.method665((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field1226.method939(0, arg0);
		if (var3 == null) {
			return null;
		} else {
			class46 var4 = new class46(var3);
			class199 var5 = new class199(var4);
			this.field1232.method663((long) arg0, var5);
			return var5;
		}
	}

	@ObfuscatedName("ga.b(IB)Z")
	@Override
	public boolean method437(int arg0) {
		return this.field1248 || this.field1237[arg0];
	}

	@ObfuscatedName("ga.b(I)V")
	public void method464() {
		this.field1232.method670();
	}

	@ObfuscatedName("ga.c(II)[I")
	@Override
	public int[] method440(int arg0) {
		class199 var2 = this.method462(arg0);
		return var2 == null ? null : var2.method1366(this.field1235, this.field1248 || this.field1237[arg0], this);
	}

	@ObfuscatedName("ga.d(II)V")
	public void method466(int arg0) {
		for (class199 var2 = (class199) this.field1232.method671(); var2 != null; var2 = (class199) this.field1232.method664()) {
			if (var2.field3800) {
				var2.method1367(arg0);
				var2.field3800 = false;
			}
		}
	}

	@ObfuscatedName("ga.a(FIZ)[I")
	@Override
	public int[] method435(float arg0, int arg1) {
		class199 var3 = this.method462(arg1);
		if (var3 == null) {
			return null;
		} else {
			var3.field3800 = true;
			return var3.method1369(this, arg0, this.field1235, this.field1248 || this.field1237[arg1]);
		}
	}
}
