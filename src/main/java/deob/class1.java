package deob;

import java.awt.*;
import java.io.UnsupportedEncodingException;

@ObfuscatedName("a")
public final class class1 implements class56 {

	@ObfuscatedName("a.eb")
	public static final int field57 = 50;

	@ObfuscatedName("a.gb")
	public static class1 field59 = Statics.method931("Diese Welt ist voll)3");

	@ObfuscatedName("a.jb")
	public static class1 field62 = Statics.method931("chatback");

	@ObfuscatedName("a.n")
	public static int field14 = 0;

	@ObfuscatedName("a.u")
	public boolean field21 = true;

	@ObfuscatedName("a.w")
	public static class1 field23 = Statics.method931("scrollbar");

	@ObfuscatedName("a.K")
	public static class1 field37 = Statics.method931("Private chat");

	@ObfuscatedName("a.J")
	public static int field36 = 0;

	@ObfuscatedName("a.S")
	public static class1 field45 = Statics.method931("purple:");

	@ObfuscatedName("a.kb")
	public static class1 field63 = field45;

	@ObfuscatedName("a.W")
	public static class1 field49 = field37;

	@ObfuscatedName("a.V")
	public static class1 field48 = Statics.method931("Der Anmelde)2Server ist offline)3");

	@ObfuscatedName("a.Z")
	public static int[] field52 = new int[128];

	@ObfuscatedName("a.z")
	public int field26;

	@ObfuscatedName("a.P")
	public int field42;

	@ObfuscatedName("a.L")
	public byte[] field38;

	@ObfuscatedName("a.a(BI)La;")
	public class1 method1(int arg0) {
		return this.method19(arg0, this.field26);
	}

	@ObfuscatedName("a.a(II[BII)I")
	public int method2(int arg0, byte[] arg1, int arg2) {
		class33.method392(this.field38, 0, arg1, arg2, arg0);
		return arg0;
	}

	@ObfuscatedName("a.a(B)I")
	public int method3() {
		return this.method39();
	}

	@ObfuscatedName("a.a(I)La;")
	public class1 method4() {
		class1 var1 = new class1();
		var1.field26 = this.field26;
		var1.field38 = new byte[this.field26];
		boolean var2 = true;
		for (int var3 = 0; var3 < this.field26; var3++) {
			byte var4 = this.field38[var3];
			if (var4 >= 97 && var4 <= 122 || !(var4 < -32 || var4 > -2 || var4 == -9)) {
				if (var2) {
					var4 = (byte) (var4 - 32);
				}
				var2 = false;
			} else if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
				if (!var2) {
					var4 = (byte) (var4 + 32);
				}
				var2 = false;
			}
			var1.field38[var3] = var4;
			if (var4 == 46 || var4 == 33 || var4 == 63) {
				var2 = true;
			}
		}
		return var1;
	}

	@ObfuscatedName("a.a(La;I)Z")
	public boolean method5(class1 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.field26 == arg0.field26) {
			if (!this.field21 || !arg0.field21) {
				if (this.field42 == 0) {
					this.field42 = this.method27();
					if (this.field42 == 0) {
						this.field42 = 1;
					}
				}
				if (arg0.field42 == 0) {
					arg0.field42 = arg0.method27();
					if (arg0.field42 == 0) {
						arg0.field42 = 1;
					}
				}
				if (this.field42 != arg0.field42) {
					return false;
				}
			}
			for (int var2 = 0; var2 < this.field26; var2++) {
				if (this.field38[var2] != arg0.field38[var2]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("a.a(IZ)I")
	public int method6(int arg0) {
		return this.field38[arg0] & 0xFF;
	}

	@ObfuscatedName("a.b(BI)I")
	public int method8() {
		return this.method15();
	}

	@ObfuscatedName("a.b(B)J")
	public long method9() {
		long var1 = 0L;
		for (int var3 = 0; this.field26 > var3 && var3 < 12; var3++) {
			var1 *= 37L;
			byte var4 = this.field38[var3];
			if (var4 >= 65 && var4 <= 90) {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 97 && var4 <= 122) {
				var1 += var4 + 1 - 97;
			} else if (var4 >= 48 && var4 <= 57) {
				var1 += var4 + 27 - 48;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("a.b(I)I")
	public int method10() {
		return this.field26;
	}

	@ObfuscatedName("a.b(La;I)I")
	public int method11(class1 arg0) {
		return this.method32(arg0);
	}

	@ObfuscatedName("a.a(Z)La;")
	public class1 method12() {
		class1 var1 = new class1();
		var1.field26 = this.field26;
		var1.field38 = new byte[this.field26];
		for (int var2 = 0; var2 < this.field26; var2++) {
			var1.field38[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("a.c(I)La;")
	public class1 method13() {
		class1 var1 = new class1();
		var1.field26 = 0;
		int var2 = 0;
		var1.field38 = new byte[12];
		for (int var3 = 0; var3 < this.field26; var3++) {
			if (this.field38[var3] >= 65 && this.field38[var3] <= 90) {
				var1.field38[var2++] = (byte) (this.field38[var3] + 97 - 65);
				var1.field26 = var2;
			} else if (this.field38[var3] >= 97 && this.field38[var3] <= 122 || this.field38[var3] >= 48 && this.field38[var3] <= 57) {
				var1.field38[var2++] = this.field38[var3];
				var1.field26 = var2;
			} else if (var2 > 0) {
				var1.field38[var2++] = 95;
			}
			if (var2 == 12) {
				break;
			}
		}
		return var1;
	}

	@ObfuscatedName("a.a(La;Z)Z")
	public boolean method14(class1 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.field26 == arg0.field26) {
			for (int var2 = 0; var2 < this.field26; var2++) {
				byte var3 = arg0.field38[var2];
				byte var4 = this.field38[var2];
				if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
					var3 = (byte) (var3 + 32);
				}
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

	@ObfuscatedName("a.a(IIZ)I")
	public int method15() {
		for (int var1 = 0; var1 < this.field26; var1++) {
			if (this.field38[var1] == 32) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("a.a(BIILjava/awt/Graphics;)V")
	public void method16(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.field38, 0, this.field26, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.field38, 0, this.field26);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("a.d(I)La;")
	public class1 method17() {
		long var2 = this.method37();
		Class var4 = class1.class;
		synchronized (class1.class) {
			if (Statics.field1795 == null) {
				Statics.field1795 = new class48(4096);
			} else {
				for (class73 var5 = (class73) Statics.field1795.method499(var2); var5 != null; var5 = (class73) Statics.field1795.method501()) {
					if (this.method5(var5.field1781)) {
						return var5.field1781;
					}
				}
			}
			class73 var7 = new class73();
			this.field21 = false;
			var7.field1781 = this;
			Statics.field1795.method498(var7, var2);
			return this;
		}
	}

	@Override
	public int hashCode() {
		return this.method27();
	}

	@ObfuscatedName("a.a(II)Z")
	public boolean method18() {
		boolean var1 = false;
		boolean var2 = false;
		int var3 = 0;
		for (int var4 = 0; var4 < this.field26; var4++) {
			int var5 = this.field38[var4] & 0xFF;
			if (var4 == 0) {
				if (var5 == 45) {
					var1 = true;
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
			if (var1) {
				var5 = -var5;
			}
			int var6 = var3 * 10 + var5;
			if (var6 / 10 != var3) {
				return false;
			}
			var3 = var6;
			var2 = true;
		}
		return var2;
	}

	@ObfuscatedName("a.a(III)La;")
	public class1 method19(int arg0, int arg1) {
		class1 var3 = new class1();
		var3.field38 = new byte[arg1 - arg0];
		var3.field26 = arg1 - arg0;
		class33.method392(this.field38, arg0, var3.field38, 0, var3.field26);
		return var3;
	}

	@ObfuscatedName("a.a(La;II)La;")
	public class1 method20(class1 arg0, int arg1) {
		if (!this.field21) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.field26) {
			throw new IllegalArgumentException();
		} else {
			this.field42 = 0;
			if (arg0.field26 + arg1 > this.field38.length) {
				int var3;
				for (var3 = 1; var3 < arg0.field26 + arg1; var3 += var3) {
				}
				byte[] var4 = new byte[var3];
				class33.method392(this.field38, 0, var4, 0, this.field26);
				this.field38 = var4;
			}
			class33.method392(arg0.field38, 0, this.field38, arg1, arg0.field26);
			if (this.field26 < arg1 + arg0.field26) {
				this.field26 = arg0.field26 + arg1;
			}
			return this;
		}
	}

	@ObfuscatedName("a.b(II)La;")
	public class1 method21(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		class1 var2 = new class1();
		var2.field38 = new byte[this.field26 + 1];
		var2.field26 = this.field26 + 1;
		class33.method392(this.field38, 0, var2.field38, 0, this.field26);
		var2.field38[this.field26] = (byte) arg0;
		return var2;
	}

	@Override
	public boolean equals(Object arg0) {
		throw new RuntimeException();
	}

	@ObfuscatedName("a.a(La;B)La;")
	public class1 method23(class1 arg0) {
		if (!this.field21) {
			throw new IllegalArgumentException();
		}
		this.field42 = 0;
		if (this.field26 + arg0.field26 > this.field38.length) {
			int var2;
			for (var2 = 1; var2 < this.field26 + arg0.field26; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			class33.method392(this.field38, 0, var3, 0, this.field26);
			this.field38 = var3;
		}
		class33.method392(arg0.field38, 0, this.field38, this.field26, arg0.field26);
		this.field26 += arg0.field26;
		return this;
	}

	@ObfuscatedName("a.a(ILjava/awt/FontMetrics;)I")
	public int method24(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.field38, 0, this.field26, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.field38, 0, this.field26);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("a.a(BLa;)Z")
	public boolean method26(class1 arg0) {
		if (arg0.field26 > this.field26) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.field26; var2++) {
			if (this.field38[var2] != arg0.field38[var2]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("a.c(B)I")
	public int method27() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field26; var2++) {
			var1 = (var1 << 5) + (this.field38[var2] & 0xFF) - var1;
		}
		return var1;
	}

	@ObfuscatedName("a.d(B)La;")
	public class1 method28() {
		if (!this.field21) {
			throw new IllegalArgumentException();
		}
		this.field42 = 0;
		if (this.field38.length != this.field26) {
			byte[] var1 = new byte[this.field26];
			class33.method392(this.field38, 0, var1, 0, this.field26);
			this.field38 = var1;
		}
		return this;
	}

	@ObfuscatedName("a.c(II)La;")
	public class1 method29(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.field21) {
			this.field42 = 0;
			if (this.field38.length == this.field26) {
				int var2;
				for (var2 = 1; var2 <= this.field26; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				class33.method392(this.field38, 0, var3, 0, this.field26);
				this.field38 = var3;
			}
			this.field38[this.field26++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("a.f(I)La;")
	public class1 method30() {
		class1 var1 = new class1();
		var1.field26 = this.field26;
		var1.field38 = new byte[this.field26];
		for (int var2 = 0; var2 < this.field26; var2++) {
			byte var3 = this.field38[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			var1.field38[var2] = var3;
		}
		return var1;
	}

	@ObfuscatedName("a.g(I)[B")
	public byte[] method31() {
		byte[] var1 = new byte[this.field26];
		class33.method392(this.field38, 0, var1, 0, this.field26);
		return var1;
	}

	@ObfuscatedName("a.a(La;IZ)I")
	public int method32(class1 arg0) {
		int[] var2 = new int[arg0.field26];
		int[] var3 = new int[arg0.field26];
		int[] var4 = new int[256];
		for (int var5 = 0; var5 < var4.length; var5++) {
			var4[var5] = arg0.field26;
		}
		for (int var6 = 1; var6 <= arg0.field26; var6++) {
			var2[var6 - 1] = (arg0.field26 << 1) - var6;
			var4[arg0.field38[var6 - 1] & 0xFF] = arg0.field26 - var6;
		}
		int var7 = arg0.field26 + 1;
		for (int var8 = arg0.field26; var8 > 0; var8--) {
			var3[var8 - 1] = var7;
			while (arg0.field26 >= var7 && arg0.field38[var7 - 1] != arg0.field38[var8 - 1]) {
				if (arg0.field26 - var8 <= var2[var7 - 1]) {
					var2[var7 - 1] = arg0.field26 - var8;
				}
				var7 = var3[var7 - 1];
			}
			var7--;
		}
		int var9 = var7;
		int var10 = arg0.field26 + 1 - var7;
		int var11 = 1;
		int var12 = 0;
		for (int var13 = 1; var13 <= var10; var13++) {
			var3[var13 - 1] = var12;
			while (var12 >= 1 && arg0.field38[var12 - 1] != arg0.field38[var13 - 1]) {
				var12 = var3[var12 - 1];
			}
			var12++;
		}
		while (var9 < arg0.field26) {
			for (int var14 = var11; var14 <= var9; var14++) {
				if (var9 + arg0.field26 - var14 <= var2[var14 + -1]) {
					var2[var14 - 1] = arg0.field26 + var9 - var14;
				}
			}
			var11 = var9 + 1;
			var9 = var9 + var10 - var3[var10 + -1];
			var10 = var3[var10 - 1];
		}
		int var16;
		for (int var15 = arg0.field26 - 1; var15 < this.field26; var15 += Math.max(var4[this.field38[var15] & 0xFF], var2[var16])) {
			for (var16 = arg0.field26 - 1; var16 >= 0 && this.field38[var15] == arg0.field38[var16]; var16--) {
				var15--;
			}
			if (var16 == -1) {
				return var15 + 1;
			}
		}
		return -1;
	}

	@ObfuscatedName("a.h(I)Z")
	public boolean method33() {
		return this.method18();
	}

	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@ObfuscatedName("a.b(La;B)I")
	public int method35(class1 arg0) {
		int var2;
		if (arg0.field26 >= this.field26) {
			var2 = this.field26;
		} else {
			var2 = arg0.field26;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0.field38[var3] > this.field38[var3]) {
				return -1;
			}
			if (this.field38[var3] > arg0.field38[var3]) {
				return 1;
			}
		}
		if (this.field26 < arg0.field26) {
			return -1;
		} else if (arg0.field26 < this.field26) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("a.i(I)La;")
	public class1 method36() {
		boolean var1 = true;
		class1 var2 = new class1();
		var2.field26 = this.field26;
		var2.field38 = new byte[this.field26];
		for (int var3 = 0; var3 < this.field26; var3++) {
			byte var4 = this.field38[var3];
			if (var4 == 95) {
				var2.field38[var3] = 32;
				var1 = true;
			} else if (var4 >= 97 && var4 <= 122 && var1) {
				var1 = false;
				var2.field38[var3] = (byte) (var4 - 32);
			} else {
				var2.field38[var3] = var4;
				var1 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("a.j(I)J")
	public long method37() {
		long var2 = 0L;
		for (int var4 = 0; var4 < this.field26; var4++) {
			var2 = (var2 << 5) + (long) (this.field38[var4] & 0xFF) - var2;
		}
		return var2;
	}

	@ObfuscatedName("a.a(ILa;)Z")
	public boolean method38(class1 arg0) {
		if (arg0.field26 > this.field26) {
			return false;
		}
		int var2 = this.field26 - arg0.field26;
		for (int var3 = 0; var3 < arg0.field26; var3++) {
			if (this.field38[var2 + var3] != arg0.field38[var3]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("a.a(ZI)I")
	public int method39() {
		boolean var1 = false;
		boolean var2 = false;
		int var3 = 0;
		for (int var4 = 0; var4 < this.field26; var4++) {
			int var5 = this.field38[var4] & 0xFF;
			if (var4 == 0) {
				if (var5 == 45) {
					var2 = true;
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
				throw new NumberFormatException();
			}
			if (var5 >= 10) {
				throw new NumberFormatException();
			}
			if (var2) {
				var5 = -var5;
			}
			int var6 = var3 * 10 + var5;
			if (var6 / 10 != var3) {
				throw new NumberFormatException();
			}
			var3 = var6;
			var1 = true;
		}
		if (!var1) {
			throw new NumberFormatException();
		}
		return var3;
	}

	@ObfuscatedName("a.b(Z)La;")
	public class1 method40() {
		int var1 = 0;
		int var2 = this.field26;
		while (var1 < this.field26 && (this.field38[var1] >= 0 && this.field38[var1] <= 32 || (this.field38[var1] & 0xFF) == 160)) {
			var1++;
		}
		while (var2 > var1 && (this.field38[var2 - 1] >= 0 && this.field38[var2 - 1] <= 32 || (this.field38[var2 - 1] & 0xFF) == 160)) {
			var2--;
		}
		if (var1 == 0 && this.field26 == var2) {
			return this;
		}
		class1 var3 = new class1();
		var3.field26 = var2 - var1;
		var3.field38 = new byte[var3.field26];
		for (int var4 = 0; var4 < var3.field26; var4++) {
			var3.field38[var4] = this.field38[var1 + var4];
		}
		return var3;
	}
}
