package deob;

@ObfuscatedName("vb")
public final class class231 extends class136 {

	@ObfuscatedName("vb.ab")
	public static final class88 field4344 = class208.method1423(105, "Take");

	@ObfuscatedName("vb.K")
	public static final int[] field4328 = new int[32];

	@ObfuscatedName("vb.U")
	public static final class88 field4338 = class208.method1423(105, "<col=80ff00>");

	@ObfuscatedName("vb.P")
	public static int field4333 = 0;

	@ObfuscatedName("vb.N")
	public static final class92 field4331 = new class92(64);

	@ObfuscatedName("vb.Y")
	public static final class88 field4342 = class208.method1423(105, " zuerst von Ihrer Ignorieren)2Liste(Q");

	@ObfuscatedName("vb.Z")
	public static class88 field4343 = field4344;

	@ObfuscatedName("vb.T")
	public boolean field4337 = false;

	@ObfuscatedName("vb.V")
	public final int[] field4339 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("vb.X")
	public int field4341 = -1;

	@ObfuscatedName("vb.H")
	public static class75 field4325;

	@ObfuscatedName("vb.G")
	public int[] field4324;

	@ObfuscatedName("vb.D")
	public short[] field4321;

	@ObfuscatedName("vb.J")
	public short[] field4327;

	@ObfuscatedName("vb.M")
	public short[] field4330;

	@ObfuscatedName("vb.S")
	public short[] field4336;

	@ObfuscatedName("vb.a(BI[BI)I")
	public static int method1542(int arg0, byte[] arg1, int arg2) {
		int var3 = -1;
		for (int var4 = arg0; var4 < arg2; var4++) {
			var3 = var3 >>> 8 ^ class216.field4045[(var3 ^ arg1[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("vb.d(I)Lhe;")
	public class82 method1540() {
		if (this.field4324 == null) {
			return null;
		}
		class82[] var1 = new class82[this.field4324.length];
		for (int var2 = 0; var2 < this.field4324.length; var2++) {
			var1[var2] = class82.method568(class43.field733, this.field4324[var2]);
		}
		class82 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class82(var1, var1.length);
		}
		if (this.field4336 != null) {
			for (int var4 = 0; var4 < this.field4336.length; var4++) {
				var3.method564(this.field4336[var4], this.field4327[var4]);
			}
		}
		if (this.field4330 != null) {
			for (int var5 = 0; var5 < this.field4330.length; var5++) {
				var3.method553(this.field4330[var5], this.field4321[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("vb.a(Lea;ZI)V")
	public void method1541(class46 arg0, int arg1) {
		if (arg1 == 1) {
			this.field4341 = arg0.method347();
		} else if (arg1 == 2) {
			int var3 = arg0.method347();
			this.field4324 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field4324[var4] = arg0.method301();
			}
		} else if (arg1 == 3) {
			this.field4337 = true;
		} else if (arg1 == 40) {
			int var7 = arg0.method347();
			this.field4327 = new short[var7];
			this.field4336 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field4336[var8] = (short) arg0.method301();
				this.field4327[var8] = (short) arg0.method301();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method347();
			this.field4321 = new short[var5];
			this.field4330 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field4330[var6] = (short) arg0.method301();
				this.field4321[var6] = (short) arg0.method301();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.field4339[arg1 - 60] = arg0.method301();
			return;
		}
	}

	@ObfuscatedName("vb.b(Z)Lhe;")
	public class82 method1543() {
		int var1 = 0;
		class82[] var2 = new class82[5];
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field4339[var3] != -1) {
				var2[var1++] = class82.method568(class43.field733, this.field4339[var3]);
			}
		}
		class82 var4 = new class82(var2, var1);
		if (this.field4336 != null) {
			for (int var5 = 0; var5 < this.field4336.length; var5++) {
				var4.method564(this.field4336[var5], this.field4327[var5]);
			}
		}
		if (this.field4330 != null) {
			for (int var6 = 0; var6 < this.field4330.length; var6++) {
				var4.method553(this.field4330[var6], this.field4321[var6]);
			}
		}
		return var4;
	}

	@ObfuscatedName("vb.d(B)Z")
	public boolean method1545() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field4339[var2] != -1 && !class43.field733.method959(this.field4339[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("vb.a(ILea;)V")
	public void method1546(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1541(arg0, var2);
		}
	}

	@ObfuscatedName("vb.e(B)Z")
	public boolean method1547() {
		if (this.field4324 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field4324.length; var2++) {
			if (!class43.field733.method959(this.field4324[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}
}
