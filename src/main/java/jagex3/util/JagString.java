package jagex3.util;

import deob.ObfuscatedName;
import deob.class39;
import jagex3.client.Client;
import jagex3.constants.Text;
import jagex3.datastruct.HashTable;
import jagex3.io.Packet;
import jagex3.wordfilter2.WordPack;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ec")
public final class JagString implements StringInterface {

	@ObfuscatedName("dd.R")
	public static JagString field479 = wrap("null");
	@ObfuscatedName("jb.a")
	public static JagString field1477 = wrap(")3");
	@ObfuscatedName("kf.o")
	public static JagString field1769 = wrap(")1");
	@ObfuscatedName("tc.h")
	public static JagString field3138 = wrap(" <col=00ff80>");
	@ObfuscatedName("fb.U")
	public static JagString field927 = wrap(" <col=ffffff>");
	@ObfuscatedName("ve.o")
	public static JagString field3466 = wrap(" <col=ffff00>");
	@ObfuscatedName("jc.U")
	public static JagString field1508 = wrap("<)4col>");
	@ObfuscatedName("ee.Y")
	public static JagString field717 = wrap(": ");
	@ObfuscatedName("la.O")
	public static int[] field1807 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };
	@ObfuscatedName("wd.t")
	public static HashTable field3597;
	@ObfuscatedName("pb.T")
	public static JagString field2501 = wrap("(Y<)4col>");
	@ObfuscatedName("ec.a")
	public byte[] field618;

	@ObfuscatedName("ec.b")
	public int field619;

	@ObfuscatedName("ec.fb")
	public int field674;

	@ObfuscatedName("ec.H")
	public boolean field651 = true;

	@ObfuscatedName("kd.a(Ljava/lang/String;Z)Lec;")
	public static JagString wrap(String arg0) {
		byte[] var2 = arg0.getBytes();
		int var3 = var2.length;
		JagString var4 = new JagString();
		var4.field618 = new byte[var3];
		int var5 = 0;
		while (var3 > var5) {
			int var6 = var2[var5++] & 0xFF;
			if (var6 <= 45 && var6 >= 40) {
				if (var5 >= var3) {
					break;
				}
				int var7 = var2[var5++] & 0xFF;
				var4.field618[var4.field674++] = (byte) (var7 + (var6 + -40) * 43 - 48);
			} else if (var6 != 0) {
				var4.field618[var4.field674++] = (byte) var6;
			}
		}
		var4.method269();
		return var4.method254((byte) 10);
	}

	@ObfuscatedName("hc.a([Lec;B)Lec;")
	public static JagString join(JagString[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return method655(arg0, arg0.length, 0);
	}

	@ObfuscatedName("ma.a([Lec;IIB)Lec;")
	public static JagString method655(JagString[] arg0, int arg1, int arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg1; var4++) {
			if (arg0[var4 + arg2] == null) {
				arg0[arg2 + var4] = field479;
			}
			var3 += arg0[var4 + arg2].field674;
		}
		byte[] var5 = new byte[var3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg1; var7++) {
			JagString var8 = arg0[arg2 + var7];
			ArrayUtil.method457(var8.field618, 0, var5, var6, var8.field674);
			var6 += var8.field674;
		}
		JagString var9 = new JagString();
		var9.field674 = var3;
		var9.field618 = var5;
		return var9;
	}

	@ObfuscatedName("wf.a(II)Lec;")
	public static JagString parseInt(int arg0) {
		return method975(arg0, false);
	}

	@ObfuscatedName("rf.a(IIIZ)Lec;")
	public static JagString method975(int arg0, boolean arg1) {
		int var2 = 1;
		int var3 = arg0 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg0 < 0 || arg1) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg0 < 0) {
			var5[0] = 45;
		} else if (arg1) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg0 % 10;
			arg0 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		JagString var8 = new JagString();
		var8.field674 = var4;
		var8.field618 = var5;
		return var8;
	}

	@ObfuscatedName("df.a(II)Lec;")
	public static JagString method191(int arg0) {
		return join(new JagString[] { parseInt(arg0 >> 24 & 0xFF), field1477, parseInt(arg0 >> 16 & 0xFF), field1477, parseInt(arg0 >> 8 & 0xFF), field1477, parseInt(arg0 & 0xFF) });
	}

	@ObfuscatedName("jb.a(ZI)Lec;")
	public static JagString method491(int arg0) {
		JagString var1 = new JagString();
		var1.field618 = new byte[arg0];
		var1.field674 = 0;
		return var1;
	}

	@ObfuscatedName("s.a(II)Lec;")
	public static JagString method978(int arg0) {
		JagString var1 = parseInt(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = join(new JagString[] { var1.substring(0, var2), field1769, var1.method268(var2) });
		}
		if (var1.length() > 9) {
			return join(new JagString[] { field3138, var1.substring(0, var1.length() - 8), Text.field1044, Client.field954, var1, field2501 });
		} else if (var1.length() > 6) {
			return join(new JagString[] { field927, var1.substring(0, var1.length() - 4), Text.field2050, Client.field954, var1, field2501 });
		} else {
			return join(new JagString[] { field3466, var1, field1508 });
		}
	}

	@ObfuscatedName("s.a([Lec;I)[Lec;")
	public static JagString[] method984(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = join(new JagString[] { parseInt(var2), field717 });
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = join(new JagString[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("wa.a(Lec;BLjd;)I")
	public static int method1194(JagString arg0, Packet arg1) {
		int var2 = arg1.pos;
		arg1.method545(arg0.field674);
		arg1.pos += WordPack.field2088.method75(0, arg0.field674, arg1.pos, arg0.field618, arg1.data);
		return arg1.pos - var2;
	}

	@ObfuscatedName("dd.a([BBII)Lec;")
	public static JagString method186(byte[] arg0, int arg1, int arg2) {
		JagString var3 = new JagString();
		var3.field674 = 0;
		var3.field618 = new byte[arg2];
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			if (arg0[var4] != 0) {
				var3.field618[var3.field674++] = arg0[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("uf.a(IZB)Lec;")
	public static JagString method1090(int arg0) {
		return method975(arg0, true);
	}

	@ObfuscatedName("sd.a(BLjd;)Lec;")
	public static JagString unpack2(Packet arg0) {
		return WordPack.unpack2(arg0);
	}

	@ObfuscatedName("ec.a(BIII[B)I")
	public int method235(int arg0, int arg1, byte[] arg2) {
		ArrayUtil.method457(this.field618, 0, arg2, arg0, arg1);
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
		if (!(arg0 instanceof JagString)) {
			throw new IllegalArgumentException();
		}
		return this.method272((JagString) arg0);
	}

	@ObfuscatedName("ec.a(ILec;)I")
	public int method238(JagString arg0) {
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
	public int length() {
		return this.field674;
	}

	@ObfuscatedName("ec.a(BII)Lec;")
	public JagString substring(int arg0, int arg1) {
		JagString var3 = new JagString();
		var3.field674 = arg1 - arg0;
		var3.field618 = new byte[arg1 - arg0];
		ArrayUtil.method457(this.field618, arg0, var3.field618, 0, var3.field674);
		return var3;
	}

	@ObfuscatedName("ec.a(Lec;B)Lec;")
	public JagString method243(JagString arg0) {
		if (!this.field651) {
			throw new IllegalArgumentException();
		}
		this.field619 = 0;
		if (this.field674 + arg0.field674 > this.field618.length) {
			int var2;
			for (var2 = 1; var2 < arg0.field674 + this.field674; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			ArrayUtil.method457(this.field618, 0, var3, 0, this.field674);
			this.field618 = var3;
		}
		ArrayUtil.method457(arg0.field618, 0, this.field618, this.field674, arg0.field674);
		this.field674 += arg0.field674;
		return this;
	}

	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@ObfuscatedName("ec.c(B)Lec;")
	public JagString method244() {
		JagString var1 = new JagString();
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
	public int method245(JagString arg0) {
		int var2;
		if (this.field674 > arg0.field674) {
			var2 = arg0.field674;
		} else {
			var2 = this.field674;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (field1807[this.field618[var3] & 0xFF] < field1807[arg0.field618[var3] & 0xFF]) {
				return -1;
			}
			if (field1807[this.field618[var3] & 0xFF] > field1807[arg0.field618[var3] & 0xFF]) {
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
	public JagString method248() {
		JagString var1 = new JagString();
		var1.field674 = this.field674;
		var1.field618 = new byte[this.field674];
		for (int var2 = 0; var2 < this.field674; var2++) {
			var1.field618[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("ec.a(Lec;II)I")
	public int method249(JagString arg0) {
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
	public int stringWidth(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.field618, 0, this.field674, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.field618, 0, this.field674);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("ec.a(IIILjava/awt/Graphics;)V")
	public void drawString(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.field618, 0, this.field674, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.field618, 0, this.field674);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("ec.d(B)Lec;")
	public JagString method254(byte arg0) {
		if (arg0 != 10) {
			return null;
		}
		long var2 = this.method246(arg0 ^ 0x68);
		Class var4 = JagString.class;
		synchronized (JagString.class) {
			if (field3597 == null) {
				field3597 = new HashTable(4096);
			} else {
				for (class39 var5 = (class39) field3597.find(var2); var5 != null; var5 = (class39) field3597.method1202()) {
					if (this.method272(var5.field929)) {
						return var5.field929;
					}
				}
			}
			class39 var7 = new class39();
			this.field651 = false;
			var7.field929 = this;
			field3597.put(var2, var7);
			return this;
		}
	}

	@ObfuscatedName("ec.e(I)[B")
	public byte[] method255() {
		byte[] var1 = new byte[this.field674];
		ArrayUtil.method457(this.field618, 0, var1, 0, this.field674);
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
	public JagString forceCapitalisationOfWords() {
		JagString var1 = new JagString();
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
	public boolean method262(JagString arg0) {
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
	public JagString method264() {
		JagString var1 = new JagString();
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
	public boolean method266(JagString arg0) {
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
	public int method267(JagString arg0) {
		return this.method249(arg0);
	}

	@ObfuscatedName("ec.b(BI)Lec;")
	public JagString method268(int arg0) {
		return this.substring(arg0, this.field674);
	}

	@ObfuscatedName("ec.i(I)Lec;")
	public JagString method269() {
		if (!this.field651) {
			throw new IllegalArgumentException();
		}
		this.field619 = 0;
		if (this.field618.length != this.field674) {
			byte[] var1 = new byte[this.field674];
			ArrayUtil.method457(this.field618, 0, var1, 0, this.field674);
			this.field618 = var1;
		}
		return this;
	}

	@ObfuscatedName("ec.a(Z)Lec;")
	public JagString method270() {
		JagString var1 = new JagString();
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
	public boolean method271(JagString arg0) {
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
	public boolean method272(JagString arg0) {
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
	public JagString method273(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.field651) {
			this.field619 = 0;
			if (this.field674 == this.field618.length) {
				int var2;
				for (var2 = 1; var2 <= this.field674; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				ArrayUtil.method457(this.field618, 0, var3, 0, this.field674);
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
	public JagString trim() {
		int var1;
		for (var1 = 0; this.field674 > var1 && (this.field618[var1] >= 0 && this.field618[var1] <= 32 || (this.field618[var1] & 0xFF) == 160); var1++) {
		}
		int var2;
		for (var2 = this.field674; var1 < var2 && (this.field618[var2 - 1] >= 0 && this.field618[var2 - 1] <= 32 || (this.field618[var2 - 1] & 0xFF) == 160); var2--) {
		}
		if (var1 == 0 && var2 == this.field674) {
			return this;
		}
		JagString var3 = new JagString();
		var3.field674 = var2 - var1;
		var3.field618 = new byte[var3.field674];
		for (int var4 = 0; var4 < var3.field674; var4++) {
			var3.field618[var4] = this.field618[var4 + var1];
		}
		return var3;
	}

	@ObfuscatedName("ec.d(II)Lec;")
	public JagString method277(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		JagString var2 = new JagString();
		var2.field618 = new byte[this.field674 + 1];
		var2.field674 = this.field674 + 1;
		ArrayUtil.method457(this.field618, 0, var2.field618, 0, this.field674);
		var2.field618[this.field674] = (byte) arg0;
		return var2;
	}

	@ObfuscatedName("ec.k(I)Ljava/net/URL;")
	public URL method278() throws MalformedURLException {
		return new URL(new String(this.field618, 0, this.field674));
	}
}
