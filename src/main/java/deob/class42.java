package deob;

@ObfuscatedName("ff")
public final class class42 {

	@ObfuscatedName("ff.a")
	public static int[] field972 = new int[500];

	@ObfuscatedName("ff.b")
	public static int[] field973 = new int[500];

	@ObfuscatedName("ff.c")
	public class92 field974 = null;

	@ObfuscatedName("ff.d")
	public int field975 = -1;

	@ObfuscatedName("ff.e")
	public final int[] field976;

	@ObfuscatedName("ff.f")
	public boolean field977 = false;

	@ObfuscatedName("ff.g")
	public static int[] field978 = new int[500];

	@ObfuscatedName("ff.h")
	public final int[] field979;

	@ObfuscatedName("ff.i")
	public static int[] field980 = new int[500];

	@ObfuscatedName("ff.j")
	public final int[] field981;

	@ObfuscatedName("ff.k")
	public final int[] field982;

	public class42(byte[] arg0, class92 arg1) {
		this.field974 = arg1;
		class66 var3 = new class66(arg0);
		class66 var4 = new class66(arg0);
		var3.field1568 = 2;
		int var5 = var3.method532();
		int var6 = -1;
		int var7 = 0;
		var4.field1568 = var3.field1568 + var5;
		for (int var8 = 0; var8 < var5; var8++) {
			int var9 = var3.method532();
			if (var9 > 0) {
				if (this.field974.field2106[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; var10--) {
						if (this.field974.field2106[var10] == 0) {
							field973[var7] = var10;
							field980[var7] = 0;
							field978[var7] = 0;
							field972[var7] = 0;
							var7++;
							break;
						}
					}
				}
				field973[var7] = var8;
				short var11 = 0;
				if (this.field974.field2106[var8] == 3) {
					var11 = 128;
				}
				if ((var9 & 0x1) == 0) {
					field980[var7] = var11;
				} else {
					field980[var7] = var4.method516();
				}
				if ((var9 & 0x2) == 0) {
					field978[var7] = var11;
				} else {
					field978[var7] = var4.method516();
				}
				if ((var9 & 0x4) == 0) {
					field972[var7] = var11;
				} else {
					field972[var7] = var4.method516();
				}
				var6 = var8;
				var7++;
				if (this.field974.field2106[var8] == 5) {
					this.field977 = true;
				}
			}
		}
		if (var4.field1568 != arg0.length) {
			throw new RuntimeException();
		}
		this.field975 = var7;
		this.field981 = new int[var7];
		this.field979 = new int[var7];
		this.field982 = new int[var7];
		this.field976 = new int[var7];
		for (int var12 = 0; var12 < var7; var12++) {
			this.field981[var12] = field973[var12];
			this.field979[var12] = field980[var12];
			this.field982[var12] = field978[var12];
			this.field976[var12] = field972[var12];
		}
	}
}
