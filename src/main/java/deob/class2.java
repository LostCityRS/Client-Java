package deob;

import java.util.zip.Inflater;

@ObfuscatedName("aa")
public final class class2 {

	@ObfuscatedName("aa.a")
	public Inflater field15;

	@ObfuscatedName("aa.d")
	public static class157 field18 = new class157();

	@ObfuscatedName("aa.f")
	public static int field20 = 0;

	@ObfuscatedName("aa.g")
	public static int field21 = 0;

	@ObfuscatedName("aa.i")
	public static int field23 = 0;

	@ObfuscatedName("aa.j")
	public static class63 field24 = new class63(64);

	@ObfuscatedName("aa.l")
	public static int field26 = 0;

	@ObfuscatedName("aa.m")
	public static int[] field27;

	@ObfuscatedName("aa.n")
	public static class32 field28 = class73.method593("::gc", true);

	@ObfuscatedName("aa.a(I)V")
	public static void method5() {
		field18 = null;
		field24 = null;
		field27 = null;
		field28 = null;
	}

	@ObfuscatedName("aa.a(BI)V")
	public static void method7(int arg0) {
		int[] var1 = class142.field3252.field1144;
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 0;
		}
		for (int var4 = 1; var4 < 103; var4++) {
			int var5 = (52736 - var4 * 512) * 4 + 24628;
			for (int var6 = 1; var6 < 103; var6++) {
				if ((class3.field50[arg0][var6][var4] & 0x18) == 0) {
					class159.field3657.method1149(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (class3.field50[arg0 + 1][var6][var4] & 0x8) != 0) {
					class159.field3657.method1149(var1, var5, arg0 + 1, var6, var4);
				}
				var5 += 4;
			}
		}
		class142.field3252.method388();
		int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 228;
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var10 = 1; var10 < 103; var10++) {
				if ((class3.field50[arg0][var10][var9] & 0x18) == 0) {
					class30.method211(var7, arg0, var10, var9, var8);
				}
				if (arg0 < 3 && (class3.field50[arg0 + 1][var10][var9] & 0x8) != 0) {
					class30.method211(var7, arg0 + 1, var10, var9, var8);
				}
			}
		}
		class82.field1908 = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = class159.field3657.method1134(class43.field989, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = class5.method22(var14).field1209;
					if (var15 >= 0) {
						int var16 = var11;
						int var17 = var12;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = class105.field2482[class43.field989].field2811;
							for (int var19 = 0; var19 < 10; var19++) {
								int var20 = (int) (Math.random() * 4.0D);
								if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
									var16--;
								}
								if (var20 == 1 && var16 < 103 && var11 + 3 > var16 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
									var16++;
								}
								if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
									var17--;
								}
								if (var20 == 3 && var17 < 103 && var12 + 3 > var17 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
									var17++;
								}
							}
						}
						class158.field3624[class82.field1908] = class111.field2601[var15];
						class119.field2850[class82.field1908] = var16;
						class83.field1957[class82.field1908] = var17;
						class82.field1908++;
					}
				}
			}
		}
		class50.field1157.method361();
	}

	@ObfuscatedName("aa.a(Lea;Lec;Lec;I)Lh;")
	public static class49 method8(class30 arg0, class32 arg1, class32 arg2) {
		int var3 = arg0.method201(arg2);
		int var4 = arg0.method215(arg1, var3);
		return class36.method312(var4, arg0, var3);
	}

	public class2() {
		this(-1, 1000000, 1000000);
	}

	public class2(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("aa.a([BBLjd;)V")
	public void method6(byte[] arg0, class66 arg1) {
		if (arg1.field1586[arg1.field1568] != 31 || arg1.field1586[arg1.field1568 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.field15 == null) {
			this.field15 = new Inflater(true);
		}
		try {
			this.field15.setInput(arg1.field1586, arg1.field1568 + 10, arg1.field1586.length + -8 + -arg1.field1568 + -10);
			this.field15.inflate(arg0);
		} catch (Exception var3) {
			this.field15.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.field15.reset();
	}
}
