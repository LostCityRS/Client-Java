package jagex3.util;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.StringNode;
import jagex3.jstring.StringTools;

import java.awt.*;
import java.io.UnsupportedEncodingException;

@ObfuscatedName("a")
public final class JagString implements StringInterface {

	@ObfuscatedName("mb.f")
	public static HashTable cache;
	@ObfuscatedName("nd.ab")
	public static JagString field2112 = wrap(")3");
	@ObfuscatedName("kd.B")
	public static JagString field1625 = wrap("null");
	@ObfuscatedName("a.u")
	public boolean field21 = true;

	@ObfuscatedName("a.z")
	public int length;

	@ObfuscatedName("a.P")
	public int field42;

	@ObfuscatedName("a.L")
	public byte[] charCode;

	@ObfuscatedName("se.a(ILjava/lang/String;)La;")
	public static JagString wrap(String arg1) {
		byte[] var2 = arg1.getBytes();
		int var3 = var2.length;
		JagString var4 = new JagString();
		int var5 = 0;
		var4.charCode = new byte[var3];
		while (var3 > var5) {
			int var6 = var2[var5++] & 0xFF;
			if (var6 <= 45 && var6 >= 40) {
				if (var5 >= var3) {
					break;
				}
				int var7 = var2[var5++] & 0xFF;
				var4.charCode[var4.length++] = (byte) ((var6 - 40) * 43 + var7 - 48);
			} else if (var6 != 0) {
				var4.charCode[var4.length++] = (byte) var6;
			}
		}
		var4.method28();
		return var4.method17();
	}

	@ObfuscatedName("tb.a(I[La;)La;")
	public static JagString join(JagString[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return StringTools.join(arg0.length, 0, arg0);
	}

    @ObfuscatedName("i.a(II)La;")
    public static JagString parseInt(int arg0) {
        return fromInt(false, arg0);
    }

	@ObfuscatedName("fe.a(ZBII)La;")
	public static JagString fromInt(boolean arg0, int arg1) {
		int var2 = 1;
		int var3 = arg1 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg1 < 0 || arg0) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg1 < 0) {
			var5[0] = 45;
		} else if (arg0) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg1 % 10;
			arg1 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		JagString var8 = new JagString();
		var8.charCode = var5;
		var8.length = var4;
		return var8;
	}

	@ObfuscatedName("wa.a(ZBI)La;")
	public static JagString fromInt(int arg0) {
		return fromInt(true, arg0);
	}

	@ObfuscatedName("je.b(II)La;")
	public static JagString method566() {
		JagString var0 = new JagString();
		var0.charCode = new byte[100];
		var0.length = 0;
		return var0;
	}

	@ObfuscatedName("u.f(II)La;")
	public static JagString method984(int arg0) {
		return join(new JagString[]{parseInt(arg0 >> 24 & 0xFF), field2112, parseInt(arg0 >> 16 & 0xFF), field2112, parseInt(arg0 >> 8 & 0xFF), field2112, parseInt(arg0 & 0xFF)});
	}

	@ObfuscatedName("g.a([BZII)La;")
	public static JagString method419(byte[] arg0, int arg1, int arg2) {
		JagString var3 = new JagString();
		var3.length = 0;
		var3.charCode = new byte[arg2];
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			if (arg0[var4] != 0) {
				var3.charCode[var3.length++] = arg0[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("a.a(BI)La;")
	public JagString substring(int arg0) {
		return this.substring(arg0, this.length);
	}

	@ObfuscatedName("a.a(II[BII)I")
	public int method2(int arg0, byte[] arg1, int arg2) {
		ArrayUtil.copy(this.charCode, 0, arg1, arg2, arg0);
		return arg0;
	}

	@ObfuscatedName("a.a(B)I")
	public int method3() {
		return this.method39();
	}

	@ObfuscatedName("a.a(I)La;")
	public JagString method4() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.charCode = new byte[this.length];
		boolean var2 = true;
		for (int var3 = 0; var3 < this.length; var3++) {
			byte var4 = this.charCode[var3];
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
			var1.charCode[var3] = var4;
			if (var4 == 46 || var4 == 33 || var4 == 63) {
				var2 = true;
			}
		}
		return var1;
	}

	@ObfuscatedName("a.a(La;I)Z")
	public boolean strEquals(JagString arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.length == arg0.length) {
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
			for (int var2 = 0; var2 < this.length; var2++) {
				if (this.charCode[var2] != arg0.charCode[var2]) {
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
		return this.charCode[arg0] & 0xFF;
	}

	@ObfuscatedName("a.b(BI)I")
	public int method8() {
		return this.method15();
	}

	@ObfuscatedName("a.b(B)J")
	public long toUserhash() {
		long var1 = 0L;
		for (int var3 = 0; this.length > var3 && var3 < 12; var3++) {
			var1 *= 37L;
			byte var4 = this.charCode[var3];
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
	public int length() {
		return this.length;
	}

	@ObfuscatedName("a.b(La;I)I")
	public int indexOf(JagString arg0) {
		return this.method32(arg0);
	}

	@ObfuscatedName("a.a(Z)La;")
	public JagString method12() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.charCode = new byte[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			var1.charCode[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("a.c(I)La;")
	public JagString method13() {
		JagString var1 = new JagString();
		var1.length = 0;
		int var2 = 0;
		var1.charCode = new byte[12];
		for (int var3 = 0; var3 < this.length; var3++) {
			if (this.charCode[var3] >= 65 && this.charCode[var3] <= 90) {
				var1.charCode[var2++] = (byte) (this.charCode[var3] + 97 - 65);
				var1.length = var2;
			} else if (this.charCode[var3] >= 97 && this.charCode[var3] <= 122 || this.charCode[var3] >= 48 && this.charCode[var3] <= 57) {
				var1.charCode[var2++] = this.charCode[var3];
				var1.length = var2;
			} else if (var2 > 0) {
				var1.charCode[var2++] = 95;
			}
			if (var2 == 12) {
				break;
			}
		}
		return var1;
	}

	@ObfuscatedName("a.a(La;Z)Z")
	public boolean equalsIgnoreCase(JagString arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.length == arg0.length) {
			for (int var2 = 0; var2 < this.length; var2++) {
				byte var3 = arg0.charCode[var2];
				byte var4 = this.charCode[var2];
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
		for (int var1 = 0; var1 < this.length; var1++) {
			if (this.charCode[var1] == 32) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("a.a(BIILjava/awt/Graphics;)V")
	public void drawString(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.charCode, 0, this.length, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.charCode, 0, this.length);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("a.d(I)La;")
	public JagString method17() {
		long var2 = this.method37();
		Class var4 = JagString.class;
		synchronized (JagString.class) {
			if (cache == null) {
				cache = new HashTable(4096);
			} else {
				for (StringNode var5 = (StringNode) cache.find(var2); var5 != null; var5 = (StringNode) cache.searchnext()) {
					if (this.strEquals(var5.value)) {
						return var5.value;
					}
				}
			}
			StringNode var7 = new StringNode();
			this.field21 = false;
			var7.value = this;
			cache.put(var7, var2);
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
		for (int var4 = 0; var4 < this.length; var4++) {
			int var5 = this.charCode[var4] & 0xFF;
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
	public JagString substring(int arg0, int arg1) {
		JagString var3 = new JagString();
		var3.charCode = new byte[arg1 - arg0];
		var3.length = arg1 - arg0;
		ArrayUtil.copy(this.charCode, arg0, var3.charCode, 0, var3.length);
		return var3;
	}

	@ObfuscatedName("a.a(La;II)La;")
	public JagString method20(JagString arg0, int arg1) {
		if (!this.field21) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.length) {
			throw new IllegalArgumentException();
		} else {
			this.field42 = 0;
			if (arg0.length + arg1 > this.charCode.length) {
				int var3;
				for (var3 = 1; var3 < arg0.length + arg1; var3 += var3) {
				}
				byte[] var4 = new byte[var3];
				ArrayUtil.copy(this.charCode, 0, var4, 0, this.length);
				this.charCode = var4;
			}
			ArrayUtil.copy(arg0.charCode, 0, this.charCode, arg1, arg0.length);
			if (this.length < arg1 + arg0.length) {
				this.length = arg0.length + arg1;
			}
			return this;
		}
	}

	@ObfuscatedName("a.b(II)La;")
	public JagString method21(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		JagString var2 = new JagString();
		var2.charCode = new byte[this.length + 1];
		var2.length = this.length + 1;
		ArrayUtil.copy(this.charCode, 0, var2.charCode, 0, this.length);
		var2.charCode[this.length] = (byte) arg0;
		return var2;
	}

	@Override
	public boolean equals(Object arg0) {
		throw new RuntimeException();
	}

	@ObfuscatedName("a.a(La;B)La;")
	public JagString method23(JagString arg0) {
		if (!this.field21) {
			throw new IllegalArgumentException();
		}
		this.field42 = 0;
		if (this.length + arg0.length > this.charCode.length) {
			int var2;
			for (var2 = 1; var2 < this.length + arg0.length; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			ArrayUtil.copy(this.charCode, 0, var3, 0, this.length);
			this.charCode = var3;
		}
		ArrayUtil.copy(arg0.charCode, 0, this.charCode, this.length, arg0.length);
		this.length += arg0.length;
		return this;
	}

	@ObfuscatedName("a.a(ILjava/awt/FontMetrics;)I")
	public int stringWidth(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.charCode, 0, this.length, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.charCode, 0, this.length);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("a.a(BLa;)Z")
	public boolean method26(JagString arg0) {
		if (arg0.length > this.length) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (this.charCode[var2] != arg0.charCode[var2]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("a.c(B)I")
	public int method27() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.length; var2++) {
			var1 = (var1 << 5) + (this.charCode[var2] & 0xFF) - var1;
		}
		return var1;
	}

	@ObfuscatedName("a.d(B)La;")
	public JagString method28() {
		if (!this.field21) {
			throw new IllegalArgumentException();
		}
		this.field42 = 0;
		if (this.charCode.length != this.length) {
			byte[] var1 = new byte[this.length];
			ArrayUtil.copy(this.charCode, 0, var1, 0, this.length);
			this.charCode = var1;
		}
		return this;
	}

	@ObfuscatedName("a.c(II)La;")
	public JagString method29(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.field21) {
			this.field42 = 0;
			if (this.charCode.length == this.length) {
				int var2;
				for (var2 = 1; var2 <= this.length; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				ArrayUtil.copy(this.charCode, 0, var3, 0, this.length);
				this.charCode = var3;
			}
			this.charCode[this.length++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("a.f(I)La;")
	public JagString toLowerCase() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.charCode = new byte[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			byte var3 = this.charCode[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			var1.charCode[var2] = var3;
		}
		return var1;
	}

	@ObfuscatedName("a.g(I)[B")
	public byte[] method31() {
		byte[] var1 = new byte[this.length];
		ArrayUtil.copy(this.charCode, 0, var1, 0, this.length);
		return var1;
	}

	@ObfuscatedName("a.a(La;IZ)I")
	public int method32(JagString arg0) {
		int[] var2 = new int[arg0.length];
		int[] var3 = new int[arg0.length];
		int[] var4 = new int[256];
		for (int var5 = 0; var5 < var4.length; var5++) {
			var4[var5] = arg0.length;
		}
		for (int var6 = 1; var6 <= arg0.length; var6++) {
			var2[var6 - 1] = (arg0.length << 1) - var6;
			var4[arg0.charCode[var6 - 1] & 0xFF] = arg0.length - var6;
		}
		int var7 = arg0.length + 1;
		for (int var8 = arg0.length; var8 > 0; var8--) {
			var3[var8 - 1] = var7;
			while (arg0.length >= var7 && arg0.charCode[var7 - 1] != arg0.charCode[var8 - 1]) {
				if (arg0.length - var8 <= var2[var7 - 1]) {
					var2[var7 - 1] = arg0.length - var8;
				}
				var7 = var3[var7 - 1];
			}
			var7--;
		}
		int var9 = var7;
		int var10 = arg0.length + 1 - var7;
		int var11 = 1;
		int var12 = 0;
		for (int var13 = 1; var13 <= var10; var13++) {
			var3[var13 - 1] = var12;
			while (var12 >= 1 && arg0.charCode[var12 - 1] != arg0.charCode[var13 - 1]) {
				var12 = var3[var12 - 1];
			}
			var12++;
		}
		while (var9 < arg0.length) {
			for (int var14 = var11; var14 <= var9; var14++) {
				if (var9 + arg0.length - var14 <= var2[var14 + -1]) {
					var2[var14 - 1] = arg0.length + var9 - var14;
				}
			}
			var11 = var9 + 1;
			var9 = var9 + var10 - var3[var10 + -1];
			var10 = var3[var10 - 1];
		}
		int var16;
		for (int var15 = arg0.length - 1; var15 < this.length; var15 += Math.max(var4[this.charCode[var15] & 0xFF], var2[var16])) {
			for (var16 = arg0.length - 1; var16 >= 0 && this.charCode[var15] == arg0.charCode[var16]; var16--) {
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
	public int compare(JagString arg0) {
		int var2;
		if (arg0.length >= this.length) {
			var2 = this.length;
		} else {
			var2 = arg0.length;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0.charCode[var3] > this.charCode[var3]) {
				return -1;
			}
			if (this.charCode[var3] > arg0.charCode[var3]) {
				return 1;
			}
		}
		if (this.length < arg0.length) {
			return -1;
		} else if (arg0.length < this.length) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("a.i(I)La;")
	public JagString method36() {
		boolean var1 = true;
		JagString var2 = new JagString();
		var2.length = this.length;
		var2.charCode = new byte[this.length];
		for (int var3 = 0; var3 < this.length; var3++) {
			byte var4 = this.charCode[var3];
			if (var4 == 95) {
				var2.charCode[var3] = 32;
				var1 = true;
			} else if (var4 >= 97 && var4 <= 122 && var1) {
				var1 = false;
				var2.charCode[var3] = (byte) (var4 - 32);
			} else {
				var2.charCode[var3] = var4;
				var1 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("a.j(I)J")
	public long method37() {
		long var2 = 0L;
		for (int var4 = 0; var4 < this.length; var4++) {
			var2 = (var2 << 5) + (long) (this.charCode[var4] & 0xFF) - var2;
		}
		return var2;
	}

	@ObfuscatedName("a.a(ILa;)Z")
	public boolean method38(JagString arg0) {
		if (arg0.length > this.length) {
			return false;
		}
		int var2 = this.length - arg0.length;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (this.charCode[var2 + var3] != arg0.charCode[var3]) {
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
		for (int var4 = 0; var4 < this.length; var4++) {
			int var5 = this.charCode[var4] & 0xFF;
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
	public JagString method40() {
		int var1 = 0;
		int var2 = this.length;
		while (var1 < this.length && (this.charCode[var1] >= 0 && this.charCode[var1] <= 32 || (this.charCode[var1] & 0xFF) == 160)) {
			var1++;
		}
		while (var2 > var1 && (this.charCode[var2 - 1] >= 0 && this.charCode[var2 - 1] <= 32 || (this.charCode[var2 - 1] & 0xFF) == 160)) {
			var2--;
		}
		if (var1 == 0 && this.length == var2) {
			return this;
		}
		JagString var3 = new JagString();
		var3.length = var2 - var1;
		var3.charCode = new byte[var3.length];
		for (int var4 = 0; var4 < var3.length; var4++) {
			var3.charCode[var4] = this.charCode[var1 + var4];
		}
		return var3;
	}
}
