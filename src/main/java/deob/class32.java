package deob;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ec")
public final class class32 implements class127 {

	@ObfuscatedName("ec.a")
	public byte[] field618;

	@ObfuscatedName("ec.b")
	public int field619;

	@ObfuscatedName("ec.fb")
	public int field674;

	@ObfuscatedName("ec.i")
	public static class32 field626 = field655;

	@ObfuscatedName("ec.ib")
	public static int field677 = -1;

	@ObfuscatedName("ec.k")
	public static class32 field628 = field657;

	@ObfuscatedName("ec.o")
	public static class32 field632 = class73.method593("logo", true);

	@ObfuscatedName("ec.x")
	public static int[][][] field641 = new int[4][13][13];

	@ObfuscatedName("ec.L")
	public static class32 field655 = class73.method593("Welcome to RuneScape", true);

	@ObfuscatedName("ec.N")
	public static class32 field657 = class73.method593("Free world", true);

	@ObfuscatedName("ec.H")
	public boolean field651 = true;

	@ObfuscatedName("ec.I")
	public static int field652;

	@ObfuscatedName("ec.M")
	public static Font field656;

	@ObfuscatedName("ec.a(BI)Z")
	public static boolean method237(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = class44.field1034[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1005;
	}

	@ObfuscatedName("ec.a(I)V")
	public static void method239() {
		field657 = null;
		field655 = null;
		field632 = null;
		field628 = null;
		field656 = null;
		field626 = null;
		field641 = null;
	}

	@ObfuscatedName("ec.b(B)V")
	public static void method242() {
		for (int var0 = 0; var0 < class61.field1352; var0++) {
			int var1 = class62.field1418[var0];
			class111 var2 = class14.field230[var1];
			int var3 = class158.field3612.method532();
			if ((var3 & 0x1) != 0) {
				var2.field2595 = class17.method130(class158.field3612.method524());
				var2.field2729 = var2.field2595.field2211;
				var2.field2711 = var2.field2595.field2196;
				var2.field2716 = var2.field2595.field2185;
				var2.field2723 = var2.field2595.field2219;
				var2.field2687 = var2.field2595.field2195;
				var2.field2709 = var2.field2595.field2202;
				var2.field2693 = var2.field2595.field2218;
				var2.field2734 = var2.field2595.field2201;
				var2.field2744 = var2.field2595.field2209;
			}
			if ((var3 & 0x8) != 0) {
				var2.field2731 = class158.field3612.method519();
				int var4 = class158.field3612.method509();
				var2.field2704 = (var4 & 0xFFFF) + class140.field3217;
				if (var2.field2731 == 65535) {
					var2.field2731 = -1;
				}
				var2.field2727 = var4 >> 16;
				var2.field2701 = 0;
				var2.field2754 = 0;
				if (var2.field2704 > class140.field3217) {
					var2.field2754 = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				int var5 = class158.field3612.method529();
				int var6 = class158.field3612.method529();
				var2.method906(class140.field3217, var6, var5);
				var2.field2691 = class140.field3217 + 300;
				var2.field2755 = class158.field3612.method520();
				var2.field2738 = class158.field3612.method535();
			}
			if ((var3 & 0x40) != 0) {
				var2.field2721 = class158.field3612.method555();
				var2.field2706 = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.field2756 = class158.field3612.method524();
				if (var2.field2756 == 65535) {
					var2.field2756 = -1;
				}
			}
			if ((var3 & 0x80) != 0) {
				int var7 = class158.field3612.method532();
				int var8 = class158.field3612.method520();
				var2.method906(class140.field3217, var8, var7);
				var2.field2691 = class140.field3217 + 300;
				var2.field2755 = class158.field3612.method520();
				var2.field2738 = class158.field3612.method532();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = class158.field3612.method519();
				int var10 = class158.field3612.method520();
				if (var9 == 65535) {
					var9 = -1;
				}
				if (var9 == var2.field2712 && var9 != -1) {
					int var11 = class97.method760(var9).field3395;
					if (var11 == 1) {
						var2.field2737 = 0;
						var2.field2714 = 0;
						var2.field2715 = var10;
						var2.field2725 = 0;
					}
					if (var11 == 2) {
						var2.field2714 = 0;
					}
				} else if (var9 == -1 || var2.field2712 == -1 || class97.method760(var9).field3384 >= class97.method760(var2.field2712).field3384) {
					var2.field2748 = var2.field2696;
					var2.field2714 = 0;
					var2.field2712 = var9;
					var2.field2725 = 0;
					var2.field2715 = var10;
					var2.field2737 = 0;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.field2741 = class158.field3612.method524();
				var2.field2697 = class158.field3612.method519();
			}
		}
	}

	@ObfuscatedName("ec.a(ILo;III)V")
	public static void method251(int arg0, class97 arg1, int arg2, int arg3) {
		if (class119.field2849 >= 400) {
			return;
		}
		if (arg1.field2214 != null) {
			arg1 = arg1.method757();
		}
		if (arg1 == null || !arg1.field2188) {
			return;
		}
		class32 var4 = arg1.field2204;
		if (arg1.field2198 != 0) {
			var4 = class52.method402(new class32[] { var4, class27.method187(arg1.field2198, class20.field373.field1635), class41.field954, class62.field1437, class159.method1228(arg1.field2198), class23.field403 });
		}
		if (class125.field2913 == 1) {
			class56.method442(arg2, class41.field965, arg3, 58, class52.method402(new class32[] { class50.field1148, class75.field1755, var4 }), arg0);
		} else if (!class151.field3468) {
			class32[] var5 = arg1.field2189;
			if (class94.field2164) {
				var5 = class125.method984(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].method271(class72.field1704)) {
						byte var7 = 0;
						if (var6 == 0) {
							var7 = 14;
						}
						if (var6 == 1) {
							var7 = 28;
						}
						if (var6 == 2) {
							var7 = 10;
						}
						if (var6 == 3) {
							var7 = 9;
						}
						if (var6 == 4) {
							var7 = 24;
						}
						class56.method442(arg2, var5[var6], arg3, var7, class52.method402(new class32[] { class137.field3182, var4 }), arg0);
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method271(class72.field1704)) {
						short var9 = 0;
						if (arg1.field2198 > class20.field373.field1635) {
							var9 = 2000;
						}
						int var10 = 0;
						if (var8 == 0) {
							var10 = var9 + 14;
						}
						if (var8 == 1) {
							var10 = var9 + 28;
						}
						if (var8 == 2) {
							var10 = var9 + 10;
						}
						if (var8 == 3) {
							var10 = var9 + 9;
						}
						if (var8 == 4) {
							var10 = var9 + 24;
						}
						class56.method442(arg2, var5[var8], arg3, var10, class52.method402(new class32[] { class137.field3182, var4 }), arg0);
					}
				}
			}
			class56.method442(arg2, class135.field3140, arg3, 1006, class52.method402(new class32[] { class137.field3182, var4 }), arg0);
		} else if ((class88.field2045 & 0x2) == 2) {
			class56.method442(arg2, class147.field3353, arg3, 12, class52.method402(new class32[] { class14.field234, class75.field1755, var4 }), arg0);
			return;
		}
	}

	@ObfuscatedName("ec.a(BIIIII)V")
	public static void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
		class98.field2252[0].method399(arg2, arg1);
		class98.field2252[1].method399(arg2, arg1 + arg4 - 16);
		class141.method1053(arg2, arg1 + 16, 16, arg4 - 32, class112.field2615);
		int var5 = arg4 * (arg4 - 32) / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = arg0 * (arg4 - var5 - 32) / (arg3 - arg4);
		class141.method1053(arg2, var6 + arg1 + 16, 16, var5, class73.field1727);
		class141.method1060(arg2, arg1 + var6 + 16, var5, class143.field3275);
		class141.method1060(arg2 + 1, var6 + 16 + arg1, var5, class143.field3275);
		class141.method1063(arg2, arg1 + var6 + 16, 16, class143.field3275);
		class141.method1063(arg2, var6 + arg1 + 17, 16, class143.field3275);
		class141.method1060(arg2 + 15, arg1 + 16 + var6, var5, class109.field2566);
		class141.method1060(arg2 + 14, arg1 - -var6 + 17, var5 - 1, class109.field2566);
		class141.method1063(arg2, arg1 + var6 + var5 + 15, 16, class109.field2566);
		class141.method1063(arg2 + 1, var5 + 14 + arg1 - -var6, 15, class109.field2566);
	}

	@ObfuscatedName("ec.a(IIIIB)V")
	public static void method265(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < class133.field3081; var4++) {
			if (arg2 < class144.field3287[var4] + class28.field512[var4] && class144.field3287[var4] < arg2 + arg0 && class124.field2892[var4] + class20.field366[var4] > arg1 && class124.field2892[var4] < arg3 + arg1) {
				class81.field1863[var4] = true;
			}
		}
	}

	@ObfuscatedName("ec.b(ZI)Lud;")
	public static class143 method276(int arg0) {
		class143 var1 = (class143) class50.field1146.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class98.field2246.method206(arg0, 0);
		if (var2 == null) {
			return null;
		}
		class143 var3 = new class143();
		class66 var4 = new class66(var2);
		int var5 = 0;
		var4.field1568 = var4.field1586.length - 12;
		int var6 = var4.method538();
		var3.field3259 = var4.method531();
		var3.field3264 = var4.method531();
		var3.field3267 = var4.method531();
		var3.field3263 = var4.method531();
		var4.field1568 = 0;
		var3.field3261 = var4.method507();
		var3.field3265 = new int[var6];
		var3.field3268 = new class32[var6];
		var3.field3270 = new int[var6];
		while (var4.field1586.length - 12 > var4.field1568) {
			int var7 = var4.method531();
			if (var7 == 3) {
				var3.field3268[var5] = var4.method555();
			} else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
				var3.field3270[var5] = var4.method532();
			} else {
				var3.field3270[var5] = var4.method538();
			}
			var3.field3265[var5++] = var7;
		}
		class50.field1146.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ec.a(BIII[B)I")
	public int method235(int arg0, int arg1, byte[] arg2) {
		class60.method457(this.field618, 0, arg2, arg0, arg1);
		return arg1;
	}

	@ObfuscatedName("ec.a(II)Z")
	public boolean method236() {
		boolean var1 = false;
		int var2 = 0;
		boolean var3 = false;
		for (int var4 = 0; var4 < this.field674; var4++) {
			int var5 = this.field618[var4] & 0xFF;
			if (var4 == 0) {
				if (var5 == 45) {
					var3 = true;
					continue;
				}
				if (var5 == 43) {
					continue;
				}
			}
			if (var5 >= 48 && var5 <= 57) {
				var5 -= 48;
			} else if (var5 >= 65 && var5 <= 90) {
				var5 -= 55;
			} else if (var5 >= 97 && var5 <= 122) {
				var5 -= 87;
			} else {
				return false;
			}
			if (var5 >= 10) {
				return false;
			}
			if (var3) {
				var5 = -var5;
			}
			int var6 = var5 + var2 * 10;
			if (var6 / 10 != var2) {
				return false;
			}
			var2 = var6;
			var1 = true;
		}
		return var1;
	}

	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class32)) {
			throw new IllegalArgumentException();
		}
		return this.method272((class32) arg0);
	}

	@ObfuscatedName("ec.a(ILec;)I")
	public int method238(class32 arg0) {
		int var2;
		if (arg0.field674 < this.field674) {
			var2 = arg0.field674;
		} else {
			var2 = this.field674;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if ((arg0.field618[var3] & 0xFF) > (this.field618[var3] & 0xFF)) {
				return -1;
			}
			if ((this.field618[var3] & 0xFF) > (arg0.field618[var3] & 0xFF)) {
				return 1;
			}
		}
		if (this.field674 < arg0.field674) {
			return -1;
		} else if (arg0.field674 < this.field674) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ec.a(B)I")
	public int method240() {
		return this.field674;
	}

	@ObfuscatedName("ec.a(BII)Lec;")
	public class32 method241(int arg0, int arg1) {
		class32 var3 = new class32();
		var3.field674 = arg1 - arg0;
		var3.field618 = new byte[arg1 - arg0];
		class60.method457(this.field618, arg0, var3.field618, 0, var3.field674);
		return var3;
	}

	@ObfuscatedName("ec.a(Lec;B)Lec;")
	public class32 method243(class32 arg0) {
		if (!this.field651) {
			throw new IllegalArgumentException();
		}
		this.field619 = 0;
		if (this.field674 + arg0.field674 > this.field618.length) {
			int var2;
			for (var2 = 1; var2 < arg0.field674 + this.field674; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			class60.method457(this.field618, 0, var3, 0, this.field674);
			this.field618 = var3;
		}
		class60.method457(arg0.field618, 0, this.field618, this.field674, arg0.field674);
		this.field674 += arg0.field674;
		return this;
	}

	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@ObfuscatedName("ec.c(B)Lec;")
	public class32 method244() {
		class32 var1 = new class32();
		var1.field618 = new byte[12];
		int var2 = 0;
		var1.field674 = 0;
		for (int var3 = 0; var3 < this.field674; var3++) {
			if (this.field618[var3] >= 65 && this.field618[var3] <= 90) {
				var1.field618[var2++] = (byte) (this.field618[var3] + 97 - 65);
				var1.field674 = var2;
			} else if (this.field618[var3] >= 97 && this.field618[var3] <= 122 || this.field618[var3] >= 48 && this.field618[var3] <= 57) {
				var1.field618[var2++] = this.field618[var3];
				var1.field674 = var2;
			} else if (var2 > 0) {
				var1.field618[var2++] = 95;
			}
			if (var2 == 12) {
				break;
			}
		}
		return var1;
	}

	@ObfuscatedName("ec.b(ILec;)I")
	public int method245(class32 arg0) {
		int var2;
		if (this.field674 > arg0.field674) {
			var2 = arg0.field674;
		} else {
			var2 = this.field674;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (class77.field1807[this.field618[var3] & 0xFF] < class77.field1807[arg0.field618[var3] & 0xFF]) {
				return -1;
			}
			if (class77.field1807[this.field618[var3] & 0xFF] > class77.field1807[arg0.field618[var3] & 0xFF]) {
				return 1;
			}
		}
		if (this.field674 < arg0.field674) {
			return -1;
		} else if (arg0.field674 < this.field674) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ec.b(I)J")
	public long method246(int arg0) {
		long var2 = 0L;
		int var4 = 0;
		if (arg0 <= 80) {
			this.method247();
		}
		while (this.field674 > var4) {
			var2 = (var2 << 5) + (long) (this.field618[var4] & 0xFF) - var2;
			var4++;
		}
		return var2;
	}

	@ObfuscatedName("ec.c(I)I")
	public int method247() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field674; var2++) {
			var1 = (var1 << 5) + (this.field618[var2] & 0xFF) - var1;
		}
		return var1;
	}

	@ObfuscatedName("ec.d(I)Lec;")
	public class32 method248() {
		class32 var1 = new class32();
		var1.field674 = this.field674;
		var1.field618 = new byte[this.field674];
		for (int var2 = 0; var2 < this.field674; var2++) {
			var1.field618[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("ec.a(Lec;II)I")
	public int method249(class32 arg0) {
		int[] var2 = new int[arg0.field674];
		int[] var3 = new int[256];
		int[] var4 = new int[arg0.field674];
		for (int var5 = 0; var5 < var3.length; var5++) {
			var3[var5] = arg0.field674;
		}
		for (int var6 = 1; var6 <= arg0.field674; var6++) {
			var2[var6 - 1] = (arg0.field674 << 1) - var6;
			var3[arg0.field618[var6 - 1] & 0xFF] = arg0.field674 - var6;
		}
		int var7 = arg0.field674 + 1;
		for (int var8 = arg0.field674; var8 > 0; var8--) {
			var4[var8 - 1] = var7;
			while (arg0.field674 >= var7 && arg0.field618[var7 - 1] != arg0.field618[var8 - 1]) {
				if (var2[var7 - 1] >= arg0.field674 - var8) {
					var2[var7 - 1] = arg0.field674 - var8;
				}
				var7 = var4[var7 - 1];
			}
			var7--;
		}
		int var9 = var7;
		int var10 = 0;
		int var11 = 1;
		int var12 = arg0.field674 + 1 - var7;
		int var13 = 1;
		while (var12 >= var13) {
			var4[var13 - 1] = var10;
			while (var10 >= 1 && arg0.field618[var10 - 1] != arg0.field618[var13 - 1]) {
				var10 = var4[var10 - 1];
			}
			var13++;
			var10++;
		}
		while (arg0.field674 > var9) {
			for (int var14 = var11; var14 <= var9; var14++) {
				if (arg0.field674 + var9 - var14 <= var2[var14 - 1]) {
					var2[var14 - 1] = var9 + arg0.field674 - var14;
				}
			}
			var11 = var9 + 1;
			var9 = var12 + var9 - var4[var12 + -1];
			var12 = var4[var12 - 1];
		}
		int var16;
		for (int var15 = arg0.field674 - 1; var15 < this.field674; var15 += Math.max(var3[this.field618[var15] & 0xFF], var2[var16])) {
			for (var16 = arg0.field674 - 1; var16 >= 0 && arg0.field618[var16] == this.field618[var15]; var16--) {
				var15--;
			}
			if (var16 == -1) {
				return var15 + 1;
			}
		}
		return -1;
	}

	@ObfuscatedName("ec.a(III)I")
	public int method250(int arg0) {
		byte var2 = (byte) arg0;
		for (int var3 = 0; var3 < this.field674; var3++) {
			if (this.field618[var3] == var2) {
				return var3;
			}
		}
		return -1;
	}

	@Override
	public int hashCode() {
		return this.method247();
	}

	@ObfuscatedName("ec.a(ILjava/awt/FontMetrics;)I")
	public int method252(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.field618, 0, this.field674, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.field618, 0, this.field674);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("ec.a(IIILjava/awt/Graphics;)V")
	public void method253(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.field618, 0, this.field674, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.field618, 0, this.field674);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("ec.d(B)Lec;")
	public class32 method254(byte arg0) {
		if (arg0 != 10) {
			return null;
		}
		long var2 = this.method246(arg0 ^ 0x68);
		Class var4 = class32.class;
		synchronized (class32.class) {
			if (class157.field3597 == null) {
				class157.field3597 = new class156(4096);
			} else {
				for (class39 var5 = (class39) class157.field3597.method1196(var2); var5 != null; var5 = (class39) class157.field3597.method1202((byte) -36)) {
					if (this.method272(var5.field929)) {
						return var5.field929;
					}
				}
			}
			class39 var7 = new class39();
			this.field651 = false;
			var7.field929 = this;
			class157.field3597.method1201(var2, var7);
			return this;
		}
	}

	@ObfuscatedName("ec.e(I)[B")
	public byte[] method255() {
		byte[] var1 = new byte[this.field674];
		class60.method457(this.field618, 0, var1, 0, this.field674);
		return var1;
	}

	@ObfuscatedName("ec.a(ZI)I")
	public int method256(int arg0) {
		boolean var2 = false;
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < this.field674; var5++) {
			int var6 = this.field618[var5] & 0xFF;
			if (var5 == 0) {
				if (var6 == 45) {
					var2 = true;
					continue;
				}
				if (var6 == 43) {
					continue;
				}
			}
			if (var6 >= 48 && var6 <= 57) {
				var6 -= 48;
			} else if (var6 >= 65 && var6 <= 90) {
				var6 -= 55;
			} else if (var6 >= 97 && var6 <= 122) {
				var6 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (var6 >= arg0) {
				throw new NumberFormatException();
			}
			if (var2) {
				var6 = -var6;
			}
			int var7 = var6 + var3 * arg0;
			if (var7 / arg0 != var3) {
				throw new NumberFormatException();
			}
			var3 = var7;
			var4 = true;
		}
		if (!var4) {
			throw new NumberFormatException();
		}
		return var3;
	}

	@ObfuscatedName("ec.f(I)Lec;")
	public class32 method258() {
		class32 var1 = new class32();
		byte var2 = 2;
		var1.field674 = this.field674;
		var1.field618 = new byte[this.field674];
		for (int var3 = 0; var3 < this.field674; var3++) {
			byte var4 = this.field618[var3];
			if (var4 >= 97 && var4 <= 122 || !(var4 < -32 || var4 > -2 || var4 == -9)) {
				if (var2 == 2) {
					var4 = (byte) (var4 - 32);
				}
				var2 = 0;
			} else if (var4 >= 65 && var4 <= 90 || !(var4 < -64 || var4 > -34 || var4 == -41)) {
				if (var2 == 0) {
					var4 = (byte) (var4 + 32);
				}
				var2 = 0;
			} else if (var4 == 46 || var4 == 33 || var4 == 63) {
				var2 = 2;
			} else if (var4 != 32) {
				var2 = 1;
			} else if (var2 != 2) {
				var2 = 1;
			}
			var1.field618[var3] = var4;
		}
		return var1;
	}

	@ObfuscatedName("ec.g(I)J")
	public long method259() {
		long var1 = 0L;
		for (int var3 = 0; this.field674 > var3 && var3 < 12; var3++) {
			var1 *= 37L;
			byte var4 = this.field618[var3];
			if (var4 >= 65 && var4 <= 90) {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 97 && var4 <= 122) {
				var1 += var4 - 96;
			} else if (var4 >= 48 && var4 <= 57) {
				var1 += var4 + 27 - 48;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("ec.b(II)I")
	public int method260(int arg0) {
		return this.field618[arg0] & 0xFF;
	}

	@ObfuscatedName("ec.h(I)I")
	public int method261() {
		return this.method256(10);
	}

	@ObfuscatedName("ec.a(Lec;Z)Z")
	public boolean method262(class32 arg0) {
		if (this.field674 < arg0.field674) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.field674; var2++) {
			if (arg0.field618[var2] != this.field618[var2]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ec.a(IB)I")
	public int method263(int arg0) {
		return this.method250(arg0);
	}

	@ObfuscatedName("ec.e(B)Lec;")
	public class32 method264() {
		class32 var1 = new class32();
		var1.field674 = this.field674;
		boolean var2 = true;
		var1.field618 = new byte[this.field674];
		for (int var3 = 0; var3 < this.field674; var3++) {
			byte var4 = this.field618[var3];
			if (var4 == 95) {
				var1.field618[var3] = 32;
				var2 = true;
			} else if (var4 >= 97 && var4 <= 122 && var2) {
				var1.field618[var3] = (byte) (var4 - 32);
				var2 = false;
			} else {
				var1.field618[var3] = var4;
				var2 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("ec.c(ILec;)Z")
	public boolean method266(class32 arg0) {
		if (this.field674 < arg0.field674) {
			return false;
		}
		int var2 = this.field674 - arg0.field674;
		for (int var3 = 0; var3 < arg0.field674; var3++) {
			if (this.field618[var2 + var3] != arg0.field618[var3]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ec.d(ILec;)I")
	public int method267(class32 arg0) {
		return this.method249(arg0);
	}

	@ObfuscatedName("ec.b(BI)Lec;")
	public class32 method268(int arg0) {
		return this.method241(arg0, this.field674);
	}

	@ObfuscatedName("ec.i(I)Lec;")
	public class32 method269() {
		if (!this.field651) {
			throw new IllegalArgumentException();
		}
		this.field619 = 0;
		if (this.field618.length != this.field674) {
			byte[] var1 = new byte[this.field674];
			class60.method457(this.field618, 0, var1, 0, this.field674);
			this.field618 = var1;
		}
		return this;
	}

	@ObfuscatedName("ec.a(Z)Lec;")
	public class32 method270() {
		class32 var1 = new class32();
		var1.field674 = this.field674;
		var1.field618 = new byte[this.field674];
		for (int var2 = 0; var2 < this.field674; var2++) {
			byte var3 = this.field618[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			var1.field618[var2] = var3;
		}
		return var1;
	}

	@ObfuscatedName("ec.a(BLec;)Z")
	public boolean method271(class32 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.field674 == this.field674) {
			for (int var2 = 0; var2 < this.field674; var2++) {
				byte var3 = arg0.field618[var2];
				if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
					var3 = (byte) (var3 + 32);
				}
				byte var4 = this.field618[var2];
				if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
					var4 = (byte) (var4 + 32);
				}
				if (var3 != var4) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ec.a(ZLec;)Z")
	public boolean method272(class32 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.field674 == this.field674) {
			if (!this.field651 || !arg0.field651) {
				if (this.field619 == 0) {
					this.field619 = this.method247();
					if (this.field619 == 0) {
						this.field619 = 1;
					}
				}
				if (arg0.field619 == 0) {
					arg0.field619 = arg0.method247();
					if (arg0.field619 == 0) {
						arg0.field619 = 1;
					}
				}
				if (this.field619 != arg0.field619) {
					return false;
				}
			}
			for (int var2 = 0; var2 < this.field674; var2++) {
				if (arg0.field618[var2] != this.field618[var2]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ec.c(II)Lec;")
	public class32 method273(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.field651) {
			this.field619 = 0;
			if (this.field674 == this.field618.length) {
				int var2;
				for (var2 = 1; var2 <= this.field674; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				class60.method457(this.field618, 0, var3, 0, this.field674);
				this.field618 = var3;
			}
			this.field618[this.field674++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ec.f(B)Z")
	public boolean method274() {
		return this.method236();
	}

	@ObfuscatedName("ec.j(I)Lec;")
	public class32 method275() {
		int var1;
		for (var1 = 0; this.field674 > var1 && (this.field618[var1] >= 0 && this.field618[var1] <= 32 || (this.field618[var1] & 0xFF) == 160); var1++) {
		}
		int var2;
		for (var2 = this.field674; var1 < var2 && (this.field618[var2 - 1] >= 0 && this.field618[var2 - 1] <= 32 || (this.field618[var2 - 1] & 0xFF) == 160); var2--) {
		}
		if (var1 == 0 && var2 == this.field674) {
			return this;
		}
		class32 var3 = new class32();
		var3.field674 = var2 - var1;
		var3.field618 = new byte[var3.field674];
		for (int var4 = 0; var4 < var3.field674; var4++) {
			var3.field618[var4] = this.field618[var4 + var1];
		}
		return var3;
	}

	@ObfuscatedName("ec.d(II)Lec;")
	public class32 method277(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		class32 var2 = new class32();
		var2.field618 = new byte[this.field674 + 1];
		var2.field674 = this.field674 + 1;
		class60.method457(this.field618, 0, var2.field618, 0, this.field674);
		var2.field618[this.field674] = (byte) arg0;
		return var2;
	}

	@ObfuscatedName("ec.k(I)Ljava/net/URL;")
	public URL method278() throws MalformedURLException {
		return new URL(new String(this.field618, 0, this.field674));
	}
}
