package deob;

@ObfuscatedName("ga")
public final class class44 extends class30 {

	@ObfuscatedName("ga.ab")
	public static class63 field1014 = new class63(64);

	@ObfuscatedName("ga.db")
	public volatile boolean field1017 = false;

	@ObfuscatedName("ga.eb")
	public final int field1018;

	@ObfuscatedName("ga.fb")
	public int field1019 = -1;

	@ObfuscatedName("ga.hb")
	public int field1021;

	@ObfuscatedName("ga.jb")
	public int field1023;

	@ObfuscatedName("ga.kb")
	public final class134 field1024;

	@ObfuscatedName("ga.mb")
	public static class47 field1026 = new class47(5000);

	@ObfuscatedName("ga.nb")
	public boolean field1027 = false;

	@ObfuscatedName("ga.ob")
	public final class134 field1028;

	@ObfuscatedName("ga.pb")
	public static long[] field1029 = new long[32];

	@ObfuscatedName("ga.rb")
	public static class30 field1031;

	@ObfuscatedName("ga.sb")
	public static class152 field1032;

	@ObfuscatedName("ga.tb")
	public static class32 field1033 = class73.method593("Sprites geladen)3", true);

	@ObfuscatedName("ga.ub")
	public static int[] field1034 = new int[500];

	@ObfuscatedName("ga.vb")
	public static int field1035 = 0;

	@ObfuscatedName("ga.wb")
	public static class32 field1036 = class73.method593("M", true);

	@ObfuscatedName("ga.xb")
	public static volatile int field1037 = -1;

	@ObfuscatedName("ga.Bb")
	public static class32 field1041 = field1036;

	@ObfuscatedName("ga.Cb")
	public static boolean[] field1042 = new boolean[8];

	@ObfuscatedName("ga.Fb")
	public static class32 field1045 = class73.method593("http:)4)4www)3runescape)3com", true);

	@ObfuscatedName("ga.Eb")
	public static class32 field1044 = field1036;

	@ObfuscatedName("ga.yb")
	public static int field1038;

	@ObfuscatedName("ga.Ab")
	public volatile boolean[] field1040;

	@ObfuscatedName("ga.f(II)I")
	public static int method342(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

	public class44(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.field1028 = arg1;
		this.field1024 = arg0;
		this.field1027 = arg5;
		this.field1018 = arg2;
		class52.method405(this.field1018, this);
	}

	@ObfuscatedName("ga.a(ZIZZ[B)V")
	public void method335(boolean arg0, int arg1, boolean arg2, byte[] arg3) {
		if (arg2) {
			if (this.field1017) {
				throw new RuntimeException();
			}
			if (this.field1028 != null) {
				class27.method190(this.field1028, this.field1018, arg3);
			}
			this.method209(arg3);
			this.method341();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.field545[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.field545[arg1];
		if (this.field1024 != null) {
			class27.method190(this.field1024, arg1, arg3);
			this.field1040[arg1] = true;
		}
		if (arg0) {
			super.field542[arg1] = class73.method591(arg3);
		}
	}

	@ObfuscatedName("ga.b(BI)V")
	@Override
	public void method205(int arg0) {
		class31.method226(this.field1018, arg0);
	}

	@ObfuscatedName("ga.c(III)V")
	public void method336(int arg0, int arg1) {
		this.field1021 = arg0;
		this.field1023 = arg1;
		if (this.field1028 == null) {
			class126.method985(true, (byte) 0, this.field1018, 255, this, this.field1023);
		} else {
			class88.method669(this.field1018, this, this.field1028);
		}
	}

	@ObfuscatedName("ga.e(I)I")
	public int method338() {
		if (this.field1017) {
			return 100;
		} else if (super.field542 == null) {
			int var1 = class62.method478(this.field1018, 255);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("ga.c(BI)I")
	public int method339(int arg0) {
		if (super.field542[arg0] == null) {
			return this.field1040[arg0] ? 100 : class62.method478(arg0, this.field1018);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ga.a(ZZ[BILtb;)V")
	public void method340(boolean arg0, byte[] arg1, int arg2, class134 arg3) {
		if (this.field1028 != arg3) {
			if (!arg0 && arg2 == this.field1019) {
				this.field1017 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.field1040[arg2] = false;
				if (this.field1027 || arg0) {
					class126.method985(arg0, (byte) 2, arg2, this.field1018, this, super.field564[arg2]);
				}
			} else {
				class134.field3120.reset();
				class134.field3120.update(arg1, 0, arg1.length - 2);
				int var5 = (int) class134.field3120.getValue();
				int var6 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
				if (super.field564[arg2] == var5 && super.field545[arg2] == var6) {
					this.field1040[arg2] = true;
					if (arg0) {
						super.field542[arg2] = class73.method591(arg1);
					}
				} else {
					this.field1040[arg2] = false;
					if (this.field1027 || arg0) {
						class126.method985(arg0, (byte) 2, arg2, this.field1018, this, super.field564[arg2]);
					}
				}
			}
		} else if (this.field1017) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			class126.method985(true, (byte) 0, this.field1018, 255, this, this.field1023);
		} else {
			class134.field3120.reset();
			class134.field3120.update(arg1, 0, arg1.length);
			int var7 = (int) class134.field3120.getValue();
			class66 var8 = new class66(class97.method754(arg1));
			int var9 = var8.method532();
			if (var9 != 5 && var9 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + var9);
			}
			int var10 = 0;
			if (var9 >= 6) {
				var10 = var8.method538();
			}
			if (this.field1023 == var7 && var10 == this.field1021) {
				this.method209(arg1);
				this.method341();
			} else {
				class126.method985(true, (byte) 0, this.field1018, 255, this, this.field1023);
			}
		}
	}

	@ObfuscatedName("ga.f(I)V")
	public void method341() {
		this.field1040 = new boolean[super.field542.length];
		for (int var1 = 0; var1 < this.field1040.length; var1++) {
			this.field1040[var1] = false;
		}
		if (this.field1024 == null) {
			this.field1017 = true;
			return;
		}
		this.field1019 = -1;
		for (int var2 = 0; var2 < this.field1040.length; var2++) {
			if (super.field548[var2] > 0) {
				class130.method1002(var2, this.field1024, this);
				this.field1019 = var2;
			}
		}
		if (this.field1019 == -1) {
			this.field1017 = true;
		}
	}

	@ObfuscatedName("ga.a(II)V")
	@Override
	public void method199(int arg0) {
		if (this.field1024 == null || this.field1040 == null || !this.field1040[arg0]) {
			class126.method985(true, (byte) 2, arg0, this.field1018, this, super.field564[arg0]);
		} else {
			class88.method669(arg0, this, this.field1024);
		}
	}

	@ObfuscatedName("ga.g(I)I")
	public int method343() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < super.field542.length; var3++) {
			if (super.field548[var3] > 0) {
				var1 += this.method339(var3);
				var2 += 100;
			}
		}
		if (var2 == 0) {
			return 100;
		} else {
			return var1 * 100 / var2;
		}
	}
}
