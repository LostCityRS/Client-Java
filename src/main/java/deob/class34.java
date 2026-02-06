package deob;

@ObfuscatedName("ee")
public final class class34 extends class13 {

	@ObfuscatedName("ee.ab")
	public static int[] field719;

	@ObfuscatedName("ee.db")
	public int field722;

	@ObfuscatedName("ee.eb")
	public static class36 field723;

	@ObfuscatedName("ee.fb")
	public int field724;

	@ObfuscatedName("ee.ib")
	public static class32 field727 = class73.method593("Location", true);

	@ObfuscatedName("ee.cb")
	public static class32 field721 = field727;

	@ObfuscatedName("ee.jb")
	public static class32 field728 = class73.method593("OFF", true);

	@ObfuscatedName("ee.kb")
	public static int field729 = 0;

	@ObfuscatedName("ee.I")
	public static int field701 = 2;

	@ObfuscatedName("ee.K")
	public static int field703 = 0;

	@ObfuscatedName("ee.R")
	public static int field710 = 0;

	@ObfuscatedName("ee.Y")
	public static class32 field717 = class73.method593(": ", true);

	@ObfuscatedName("ee.S")
	public static class32 field711 = class73.method593("<col=ffffff> )4 ", true);

	@ObfuscatedName("ee.P")
	public static class32 field708 = class73.method593("Konfig geladen)3", true);

	@ObfuscatedName("ee.V")
	public static class32 field714 = class73.method593("(U0a )2 in: ", true);

	@ObfuscatedName("ee.W")
	public static class32 field715 = field728;

	@ObfuscatedName("ee.Q")
	public static class156 field709 = new class156(32);

	@ObfuscatedName("ee.M")
	public int field705 = 0;

	@ObfuscatedName("ee.L")
	public int field704;

	@ObfuscatedName("ee.N")
	public int field706;

	@ObfuscatedName("ee.Z")
	public static class30 field718;

	@ObfuscatedName("ee.a(IIII)I")
	public static int method287(int arg0, int arg1, int arg2) {
		if ((class3.field50[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (class3.field50[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ee.a(ILf;)V")
	public static void method289(class36 arg0) {
		int var1 = arg0.field845;
		if (var1 == 324) {
			if (class70.field1633 == -1) {
				class61.field1358 = arg0.field844;
				class70.field1633 = arg0.field819;
			}
			if (class61.field1360.field606) {
				arg0.field819 = class70.field1633;
			} else {
				arg0.field819 = class61.field1358;
			}
		} else if (var1 == 325) {
			if (class70.field1633 == -1) {
				class70.field1633 = arg0.field819;
				class61.field1358 = arg0.field844;
			}
			if (class61.field1360.field606) {
				arg0.field819 = class61.field1358;
			} else {
				arg0.field819 = class70.field1633;
			}
		} else if (var1 == 327) {
			arg0.field812 = 150;
			arg0.field874 = (int) (Math.sin((double) class140.field3217 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field770 = 5;
			arg0.field849 = 0;
		} else if (var1 == 328) {
			arg0.field812 = 150;
			arg0.field874 = (int) (Math.sin((double) class140.field3217 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field770 = 5;
			arg0.field849 = 1;
		}
	}

	@ObfuscatedName("ee.a(ZZI)I")
	public static int method293() {
		return class158.field3627 + class64.field1494;
	}

	@ObfuscatedName("ee.a(IZ)V")
	public void method288(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = var2;
		if (var4 < var2) {
			var6 = var4;
		}
		double var8 = (double) (arg0 & 0xFF) / 256.0D;
		double var10 = 0.0D;
		double var12 = var2;
		double var14 = 0.0D;
		if (var4 > var2) {
			var12 = var4;
		}
		if (var8 > var12) {
			var12 = var8;
		}
		if (var8 < var6) {
			var6 = var8;
		}
		double var16 = (var12 + var6) / 2.0D;
		this.field704 = (int) (var16 * 256.0D);
		if (this.field704 < 0) {
			this.field704 = 0;
		} else if (this.field704 > 255) {
			this.field704 = 255;
		}
		if (var6 != var12) {
			if (var16 < 0.5D) {
				var10 = (var12 - var6) / (var6 + var12);
			}
			if (var12 == var2) {
				var14 = (var4 - var8) / (-var6 + var12);
			} else if (var12 == var4) {
				var14 = (var8 - var2) / (-var6 + var12) + 2.0D;
			} else if (var8 == var12) {
				var14 = (var2 - var4) / (-var6 + var12) + 4.0D;
			}
			if (var16 >= 0.5D) {
				var10 = (var12 - var6) / (2.0D - var12 - var6);
			}
		}
		if (var16 > 0.5D) {
			this.field724 = (int) ((1.0D - var16) * var10 * 512.0D);
		} else {
			this.field724 = (int) (var16 * var10 * 512.0D);
		}
		this.field706 = (int) (var10 * 256.0D);
		if (this.field706 < 0) {
			this.field706 = 0;
		} else if (this.field706 > 255) {
			this.field706 = 255;
		}
		double var18 = var14 / 6.0D;
		if (this.field724 < 1) {
			this.field724 = 1;
		}
		this.field722 = (int) (var18 * (double) this.field724);
	}

	@ObfuscatedName("ee.a(ZILjd;)V")
	public void method291(int arg0, class66 arg1) {
		while (true) {
			int var3 = arg1.method532();
			if (var3 == 0) {
				return;
			}
			this.method294(arg0, arg1, var3);
		}
	}

	@ObfuscatedName("ee.a(B)V")
	public void method292() {
		this.method288(this.field705);
	}

	@ObfuscatedName("ee.a(IILjd;I)V")
	public void method294(int arg0, class66 arg1, int arg2) {
		if (arg2 == 1) {
			this.field705 = arg1.method517();
		}
	}
}
