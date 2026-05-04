package deob;

@ObfuscatedName("si")
public final class class205 extends class136 {

	@ObfuscatedName("si.S")
	public static final class88 field3915 = class208.method1423(105, "Untersuchen");

	@ObfuscatedName("si.R")
	public static final class88 field3914 = class208.method1423(105, "Existing User");

	@ObfuscatedName("si.G")
	public static class88 field3903 = field3914;

	@ObfuscatedName("si.K")
	public static final class154 field3907 = new class154(4096);

	@ObfuscatedName("si.I")
	public int[] field3905;

	@ObfuscatedName("si.T")
	public int[] field3916;

	@ObfuscatedName("si.E")
	public class88[] field3901;

	@ObfuscatedName("si.M")
	public int[][] field3909;

	@ObfuscatedName("si.a(BLq;)Lq;")
	public static class174 method1413(class174 arg0) {
		if (arg0.field3504 != -1) {
			return class239.method1579(arg0.field3504);
		}
		int var1 = arg0.field3423 >>> 16;
		for (class168 var2 = (class168) class128.field2395.method1047(); var2 != null; var2 = (class168) class128.field2395.method1048()) {
			if (var1 == var2.field3229) {
				return class239.method1579((int) var2.field1219);
			}
		}
		return null;
	}

	@ObfuscatedName("si.a(BI)I")
	public int method1405(int arg0) {
		return this.field3905 == null || arg0 < 0 || arg0 > this.field3905.length ? -1 : this.field3905[arg0];
	}

	@ObfuscatedName("si.d(B)I")
	public int method1407() {
		return this.field3905 == null ? 0 : this.field3905.length;
	}

	@ObfuscatedName("si.a(BLea;I)V")
	public void method1408(class46 arg0, int arg1) {
		if (arg1 == 1) {
			this.field3901 = arg0.method298().method600(60);
		} else if (arg1 == 2) {
			int var3 = arg0.method347();
			this.field3916 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3916[var4] = arg0.method301();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.method347();
			this.field3909 = new int[var5][];
			this.field3905 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.method301();
				this.field3905[var6] = var7;
				this.field3909[var6] = new int[class92.field1731[var7]];
				for (int var8 = 0; var8 < class92.field1731[var7]; var8++) {
					this.field3909[var6][var8] = arg0.method301();
				}
			}
		}
	}

	@ObfuscatedName("si.a(Lea;I)Li;")
	public class88 method1409(class46 arg0) {
		class88 var2 = class165.method1135(80);
		if (this.field3905 != null) {
			for (int var3 = 0; var3 < this.field3905.length; var3++) {
				var2.method616(this.field3901[var3]);
				var2.method616(class144.method952(arg0.method300(class78.field1420[this.field3905[var3]]), this.field3905[var3], this.field3909[var3]));
			}
		}
		var2.method616(this.field3901[this.field3901.length - 1]);
		return var2.method629();
	}

	@ObfuscatedName("si.e(I)Li;")
	public class88 method1410() {
		class88 var1 = class165.method1135(80);
		if (this.field3901 == null) {
			return class102.field1844;
		}
		var1.method616(this.field3901[0]);
		for (int var2 = 1; var2 < this.field3901.length; var2++) {
			var1.method616(class188.field3644);
			var1.method616(this.field3901[var2]);
		}
		return var1.method629();
	}

	@ObfuscatedName("si.a(Lea;B)V")
	public void method1411(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1408(arg0, var2);
		}
	}

	@ObfuscatedName("si.a(III)I")
	public int method1412(int arg0, int arg1) {
		if (this.field3905 == null || arg1 < 0 || this.field3905.length < arg1) {
			return -1;
		} else if (this.field3909[arg1] == null || arg0 < 0 || arg0 > this.field3909[arg1].length) {
			return -1;
		} else {
			return this.field3909[arg1][arg0];
		}
	}

	@ObfuscatedName("si.a(ILea;[I)V")
	public void method1414(class46 arg0, int[] arg1) {
		if (this.field3905 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field3905.length; var3++) {
			if (var3 >= arg1.length) {
				return;
			}
			int var4 = class135.field2508[this.method1405(var3)];
			if (var4 > 0) {
				arg0.method306(var4, (long) arg1[var3]);
			}
		}
	}

	@ObfuscatedName("si.f(I)V")
	public void method1415() {
		if (this.field3916 != null) {
			for (int var1 = 0; var1 < this.field3916.length; var1++) {
				this.field3916[var1] |= 0x8000;
			}
		}
	}
}
