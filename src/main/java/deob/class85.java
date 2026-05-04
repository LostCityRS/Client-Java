package deob;

@ObfuscatedName("hh")
public final class class85 extends class23 {

	@ObfuscatedName("hh.ab")
	public static final class88 field1540 = class208.method1423(105, "Loaded wordpack");

	@ObfuscatedName("hh.bb")
	public static int[] field1541;

	@ObfuscatedName("hh.cb")
	public final int[] field1542 = new int[3];

	@ObfuscatedName("hh.db")
	public int field1543 = 3216;

	@ObfuscatedName("hh.fb")
	public static class144 field1545;

	@ObfuscatedName("hh.gb")
	public static class22 field1546;

	@ObfuscatedName("hh.hb")
	public static class88 field1547 = field1540;

	@ObfuscatedName("hh.R")
	public static int field1531 = 0;

	@ObfuscatedName("hh.U")
	public static final class88 field1534 = class208.method1423(105, "Bitte warten Sie eine Minute");

	@ObfuscatedName("hh.W")
	public static final class88 field1536 = class208.method1423(105, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@ObfuscatedName("hh.X")
	public static final class88 field1537 = class208.method1423(105, "Spielwelt erstellt)3");

	@ObfuscatedName("hh.Y")
	public int field1538 = 3216;

	@ObfuscatedName("hh.Q")
	public int field1530 = 4096;

	@ObfuscatedName("hh.a(ZI)V")
	public static void method576() {
		byte[][] var0 = class45.field774;
		for (int var1 = 0; var1 < 4; var1++) {
			class219.method1479();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					int var4 = class111.field2024[var1][var2][var3];
					if (var4 != -1) {
						int var5 = var4 >> 24 & 0x3;
						int var6 = var4 >> 1 & 0x3;
						int var7 = var4 >> 14 & 0x3FF;
						int var8 = var4 >> 3 & 0x7FF;
						int var9 = (var7 / 8 << 8) + (var8 / 8);
						for (int var10 = 0; var10 < class146.field2731.length; var10++) {
							if (var9 == class146.field2731[var10] && var0[var10] != null) {
								class212.method1447(var6, (var7 & 0x7) * 8, class166.field3200, (var8 & 0x7) * 8, var1, var0[var10], var5, var3 * 8, var2 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hh.a(Lea;I)Llb;")
	public static class122 method577(class46 arg0) {
		return new class122(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method304(), arg0.method304(), arg0.method347());
	}

	@ObfuscatedName("hh.a()V")
	public static void method579() {
		for (int var0 = 0; var0 < class11.field152; var0++) {
			for (int var1 = 0; var1 < class48.field899; var1++) {
				for (int var2 = 0; var2 < class66.field1202; var2++) {
					class29.field489[var0][var1][var2] = null;
				}
			}
		}
		for (int var3 = 0; var3 < class62.field1147; var3++) {
			for (int var4 = 0; var4 < class62.field1148[var3]; var4++) {
				class62.field1149[var3][var4] = null;
			}
			class62.field1148[var3] = 0;
		}
		for (int var5 = 0; var5 < class25.field396; var5++) {
			class149.field2906[var5] = null;
		}
		class25.field396 = 0;
		for (int var6 = 0; var6 < class239.field4447.length; var6++) {
			class239.field4447[var6] = null;
		}
	}

	public class85() {
		super(1, true);
	}

	@ObfuscatedName("hh.b(B)V")
	@Override
	public void method123() {
		this.method578();
	}

	@ObfuscatedName("hh.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = this.field1530 * class43.field738 >> 12;
			int[] var4 = this.method120(class220.field4158 & arg0 - 1, 0);
			int[] var5 = this.method120(arg0, 0);
			int[] var6 = this.method120(class220.field4158 & arg0 + 1, 0);
			for (int var7 = 0; var7 < class70.field1276; var7++) {
				int var8 = (var6[var7] - var4[var7]) * var3 >> 12;
				int var9 = var3 * (var5[class45.field789 & var7 - 1] - var5[var7 + 1 & class45.field789]) >> 12;
				int var10 = var9 >> 4;
				if (var10 < 0) {
					var10 = -var10;
				}
				if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var8 >> 4;
				if (var11 < 0) {
					var11 = -var11;
				}
				if (var11 > 255) {
					var11 = 255;
				}
				int var12 = class130.field2431[((var11 + 1) * var11 >> 1) + var10] & 0xFF;
				int var13 = var12 * 4096 >> 8;
				int var14 = this.field1542[2] * var13 >> 12;
				int var15 = var9 * var12 >> 8;
				int var16 = this.field1542[0] * var15 >> 12;
				int var17 = var8 * var12 >> 8;
				int var18 = this.field1542[1] * var17 >> 12;
				var2[var7] = var16 + var18 + var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("hh.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1530 = arg0.method301();
		} else if (arg1 == 1) {
			this.field1543 = arg0.method301();
		} else if (arg1 == 2) {
			this.field1538 = arg0.method301();
		}
	}

	@ObfuscatedName("hh.f(I)V")
	public void method578() {
		double var1 = Math.cos((double) ((float) this.field1538 / 4096.0F));
		this.field1542[0] = (int) (var1 * Math.sin((double) ((float) this.field1543 / 4096.0F)) * 4096.0D);
		this.field1542[1] = (int) (Math.cos((double) ((float) this.field1543 / 4096.0F)) * 4096.0D * var1);
		this.field1542[2] = (int) (Math.sin((double) ((float) this.field1538 / 4096.0F)) * 4096.0D);
		int var3 = this.field1542[1] * this.field1542[1] >> 12;
		int var4 = this.field1542[0] * this.field1542[0] >> 12;
		int var5 = this.field1542[2] * this.field1542[2] >> 12;
		int var6 = (int) (Math.sqrt((double) (var5 + var4 + var3 >> 12)) * 4096.0D);
		if (var6 != 0) {
			this.field1542[0] = (this.field1542[0] << 12) / var6;
			this.field1542[2] = (this.field1542[2] << 12) / var6;
			this.field1542[1] = (this.field1542[1] << 12) / var6;
		}
	}
}
