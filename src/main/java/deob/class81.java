package deob;

@ObfuscatedName("le")
public final class class81 extends class9 {

	@ObfuscatedName("le.l")
	public static int field1856 = 0;

	@ObfuscatedName("le.n")
	public static class32 field1858 = class73.method593("Fertigkeit)2", true);

	@ObfuscatedName("le.o")
	public static class32 field1859 = class73.method593("Ihr Spielkonto wird bereits benutzt)3", true);

	@ObfuscatedName("le.p")
	public int field1860 = 1;

	@ObfuscatedName("le.q")
	public int field1861 = 0;

	@ObfuscatedName("le.s")
	public static boolean[] field1863 = new boolean[100];

	@ObfuscatedName("le.t")
	public static class32 field1864 = class73.method593("Error connecting to server)3", true);

	@ObfuscatedName("le.m")
	public static class32 field1857 = field1864;

	@ObfuscatedName("le.u")
	public static class32 field1865 = class73.method593("You have only just left another world)3", true);

	@ObfuscatedName("le.v")
	public int field1866 = 256;

	@ObfuscatedName("le.x")
	public static int[] field1868 = new int[256];

	@ObfuscatedName("le.G")
	public static class32 field1877 = class73.method593("Press (Wchange your password(W on front page)3", true);

	@ObfuscatedName("le.C")
	public static class32 field1873 = field1865;

	@ObfuscatedName("le.F")
	public static class32 field1876 = field1877;

	@ObfuscatedName("le.y")
	public final long[] field1869 = new long[10];

	@ObfuscatedName("le.H")
	public long field1878 = class52.method407();

	@ObfuscatedName("le.z")
	public int field1870;

	@ObfuscatedName("le.B")
	public static class11 field1872;

	@ObfuscatedName("le.c(B)Lh;")
	public static class49 method638() {
		class49 var0 = new class49();
		var0.field1138 = class152.field3506;
		var0.field1142 = class34.field719[0];
		var0.field1143 = class74.field1746[0];
		var0.field1141 = class126.field2925[0];
		byte[] var1 = class147.field3344[0];
		int var2 = var0.field1141 * var0.field1142;
		var0.field1139 = class70.field1638[0];
		var0.field1144 = new int[var2];
		var0.field1140 = class128.field2965;
		for (int var3 = 0; var3 < var2; var3++) {
			var0.field1144[var3] = class31.field616[var1[var3] & 0xFF];
		}
		class70.method579();
		return var0;
	}

	public class81() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1869[var1] = this.field1878;
		}
	}

	@ObfuscatedName("le.a(III)I")
	@Override
	public int method58(int arg0, int arg1) {
		int var3 = this.field1866;
		this.field1866 = 300;
		int var4 = this.field1860;
		this.field1860 = 1;
		this.field1878 = class52.method407();
		if (this.field1869[this.field1870] == 0L) {
			this.field1866 = var3;
			this.field1860 = var4;
		} else if (this.field1878 > this.field1869[this.field1870]) {
			this.field1866 = (int) ((long) (arg0 * 2560) / (this.field1878 - this.field1869[this.field1870]));
		}
		if (this.field1866 < 25) {
			this.field1866 = 25;
		}
		if (this.field1866 > 256) {
			this.field1866 = 256;
			this.field1860 = (int) ((long) arg0 - (this.field1878 - this.field1869[this.field1870]) / 10L);
		}
		if (this.field1860 > arg0) {
			this.field1860 = arg0;
		}
		this.field1869[this.field1870] = this.field1878;
		this.field1870 = (this.field1870 + 1) % 10;
		if (this.field1860 > 1) {
			for (int var5 = 0; var5 < 10; var5++) {
				if (this.field1869[var5] != 0L) {
					this.field1869[var5] += this.field1860;
				}
			}
		}
		if (arg1 > this.field1860) {
			this.field1860 = arg1;
		}
		class54.method426((long) this.field1860);
		int var6 = 0;
		while (this.field1861 < 256) {
			this.field1861 += this.field1866;
			var6++;
		}
		this.field1861 &= 0xFF;
		return var6;
	}

	@ObfuscatedName("le.a(I)V")
	@Override
	public void method57() {
		for (int var1 = 0; var1 < 10; var1++) {
			this.field1869[var1] = 0L;
		}
	}
}
