package jagex3.jstring;

import deob.ObfuscatedName;
import jagex3.client.BrowserControl;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.StringNode;
import jagex3.util.ArrayUtil;

import java.applet.Applet;
import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("i")
public final class JagString implements StringInterface {

	@ObfuscatedName("vd.i")
	public static final int[] field4373 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };
	@ObfuscatedName("ei.g")
	public static final byte[] field1008 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	@ObfuscatedName("bc.l")
	public static final JagString field233 = wrap("null");
	@ObfuscatedName("ha.w")
	public static final JagString field1411 = wrap("");
	@ObfuscatedName("mj.n")
	public static final JagString field2612 = wrap(")3");
	@ObfuscatedName("va.w")
	public static HashTable field4313;
	@ObfuscatedName("i.h")
	public boolean field1606 = true;

	@ObfuscatedName("i.kb")
	public int length;

	@ObfuscatedName("i.r")
	public int field1616;

	@ObfuscatedName("i.T")
	public byte[] chars;

	@ObfuscatedName("ta.a(ILjava/lang/String;)Li;")
	public static JagString wrap(String arg1) {
		byte[] var2 = arg1.getBytes();
		int var3 = 0;
		int var4 = var2.length;
		JagString var5 = new JagString();
		var5.chars = new byte[var4];
		while (var4 > var3) {
			int var6 = var2[var3++] & 0xFF;
			if (var6 <= 45 && var6 >= 40) {
				if (var4 <= var3) {
					break;
				}
				int var7 = var2[var3++] & 0xFF;
				var5.chars[var5.length++] = (byte) ((var6 - 40) * 43 + var7 - 48);
			} else if (var6 != 0) {
				var5.chars[var5.length++] = (byte) var6;
			}
		}
		var5.method629();
		return var5.method601(-35);
	}

	@ObfuscatedName("pc.a([Li;I)Li;")
	public static JagString join(JagString[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return method1133(arg0.length, arg0, 0);
	}

	@ObfuscatedName("pb.a(I[Li;II)Li;")
	public static JagString method1133(int arg0, JagString[] arg1, int arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			if (arg1[var4 + arg2] == null) {
				arg1[arg2 + var4] = field233;
			}
			var3 += arg1[var4 + arg2].length;
		}
		int var5 = 0;
		byte[] var6 = new byte[var3];
		for (int var7 = 0; var7 < arg0; var7++) {
			JagString var8 = arg1[var7 + arg2];
			ArrayUtil.copy(var8.chars, 0, var6, var5, var8.length);
			var5 += var8.length;
		}
		JagString var9 = new JagString();
		var9.chars = var6;
		var9.length = var3;
		return var9;
	}

	@ObfuscatedName("pb.a(IB)Li;")
	public static JagString newStringBuilder(int arg0) {
		JagString var1 = new JagString();
		var1.length = 0;
		var1.chars = new byte[arg0];
		return var1;
	}

	@ObfuscatedName("ei.a(IB[BI)Li;")
	public static JagString fromBytes(int arg0, byte[] arg1, int arg2) {
		JagString var3 = new JagString();
		var3.length = 0;
		var3.chars = new byte[arg2];
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			if (arg1[var4] != 0) {
				var3.chars[var3.length++] = arg1[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("pg.f(II)Li;")
	public static JagString parseInt(int arg0) {
		return method1481(false, arg0);
	}

	@ObfuscatedName("sd.a(JB)Li;")
	public static JagString toRawUsername(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			long var3 = arg0;
			while (var3 != 0L) {
				var3 /= 37L;
				var2++;
			}
			byte[] var5 = new byte[var2];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var2--;
				var5[var2] = field1008[(int) (var6 - arg0 * 37L)];
			}
			JagString var8 = new JagString();
			var8.chars = var5;
			var8.length = var5.length;
			return var8;
		}
	}

	@ObfuscatedName("ua.a(ZIII)Li;")
	public static JagString method1481(boolean arg0, int arg1) {
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
		var8.length = var4;
		var8.chars = var5;
		return var8;
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;)Li;")
	public static JagString method765(String arg0) {
		byte[] var1;
		try {
			var1 = arg0.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException var4) {
			var1 = arg0.getBytes();
		}
		JagString var2 = new JagString();
		var2.length = 0;
		var2.chars = var1;
		for (int var3 = 0; var3 < var1.length; var3++) {
			if (var1[var3] != 0) {
				var1[var2.length++] = var1[var3];
			}
		}
		return var2;
	}

	@ObfuscatedName("mj.a(II)Li;")
	public static JagString formatIPv4(int arg0) {
		return join(new JagString[] { parseInt(arg0 >> 24 & 0xFF), field2612, parseInt(arg0 >> 16 & 0xFF), field2612, parseInt(arg0 >> 8 & 0xFF), field2612, parseInt(arg0 & 0xFF) });
	}

	@ObfuscatedName("wa.a(ZIJZ)Li;")
	public static JagString method1586(long arg0) {
		int var2 = 1;
		for (long var3 = arg0 / (long) 10; var3 != 0L; var3 /= 10) {
			var2++;
		}
		int var5 = var2;
		if (arg0 < 0L) {
			var5 = var2 + 1;
		}
		byte[] var6 = new byte[var5];
		if (arg0 < 0L) {
			var6[0] = 45;
		}
		for (int var7 = 0; var7 < var2; var7++) {
			int var8 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (var8 < 0) {
				var8 = -var8;
			}
			if (var8 > 9) {
				var8 += 39;
			}
			var6[var5 - var7 - 1] = (byte) (var8 + 48);
		}
		JagString var9 = new JagString();
		var9.chars = var6;
		var9.length = var5;
		return var9;
	}

	@ObfuscatedName("ee.a(BZI)Li;")
	public static JagString method375(int arg0) {
		return method1481(true, arg0);
	}

	@ObfuscatedName("ve.a(IJ)Li;")
	public static JagString method1556(long arg0) {
		return method1586(arg0);
	}

	@ObfuscatedName("bi.a(II)I")
	public static int method102(int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("ah.b(II)I")
	public static int method51(int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("uc.a(II)Z")
	public static boolean method1489(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("ke.a(ZI)Z")
	public static boolean method782(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("k.b(II)Z")
	public static boolean method746(int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@ObfuscatedName("ac.c(II)Z")
	public static boolean method24(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("i.a(BII)I")
	public int method594(int arg0, int arg1) {
		byte var3 = (byte) arg0;
		for (int var4 = arg1; var4 < this.length; var4++) {
			if (this.chars[var4] == var3) {
				return var4;
			}
		}
		return -1;
	}

	@ObfuscatedName("i.a(ILi;)Z")
	public boolean method595(JagString arg0) {
		if (arg0.length > this.length) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.length; var2++) {
			byte var3 = this.chars[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			byte var4 = arg0.chars[var2];
			if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
				var4 = (byte) (var4 + 32);
			}
			if (var3 != var4) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("i.a(Z)Li;")
	public JagString method596() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.chars = new byte[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			var1.chars[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("i.b(ILi;)Z")
	public boolean strEquals(JagString arg1) {
		if (arg1 == null) {
			return false;
		} else if (arg1.length == this.length) {
			if (!this.field1606 || !arg1.field1606) {
				if (this.field1616 == 0) {
					this.field1616 = this.computeCp1252HashFromUtf8();
					if (this.field1616 == 0) {
						this.field1616 = 1;
					}
				}
				if (arg1.field1616 == 0) {
					arg1.field1616 = arg1.computeCp1252HashFromUtf8();
					if (arg1.field1616 == 0) {
						arg1.field1616 = 1;
					}
				}
				if (this.field1616 != arg1.field1616) {
					return false;
				}
			}
			for (int var3 = 0; var3 < this.length; var3++) {
				if (arg1.chars[var3] != this.chars[var3]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("i.a(II)I")
	public int charAt(int arg0) {
		return this.chars[arg0] & 0xFF;
	}

	@ObfuscatedName("i.a(BI)[Li;")
	public JagString[] method600(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.length; var3++) {
			if (arg0 == this.chars[var3]) {
				var2++;
			}
		}
		JagString[] var4 = new JagString[var2 + 1];
		if (var2 == 0) {
			var4[0] = this;
			return var4;
		}
		int var5 = 0;
		int var6 = 0;
		for (int var7 = 0; var7 < var2; var7++) {
			int var8;
			for (var8 = 0; this.chars[var6 + var8] != arg0; var8++) {
			}
			var4[var5++] = this.substring(var6, var6 + var8);
			var6 += var8 + 1;
		}
		var4[var2] = this.substring(var6, this.length);
		return var4;
	}

	@ObfuscatedName("i.b(I)Li;")
	public JagString method601(int arg0) {
		long var2 = this.method637((byte) 84);
		Class var4 = JagString.class;
		synchronized (JagString.class) {
			if (field4313 == null) {
				field4313 = new HashTable(4096);
			} else {
				for (StringNode var5 = (StringNode) field4313.find(var2); var5 != null; var5 = (StringNode) field4313.method1054(3)) {
					if (this.strEquals(var5.field4046)) {
						return var5.field4046;
					}
				}
			}
			if (arg0 != -35) {
				return null;
			}
			StringNode var8 = new StringNode();
			var8.field4046 = this;
			this.field1606 = false;
			field4313.put(var2, var8);
			return this;
		}
	}

	@ObfuscatedName("i.c(I)Li;")
	public JagString method602() {
		int var1;
		for (var1 = 0; var1 < this.length && (this.chars[var1] >= 0 && this.chars[var1] <= 32 || (this.chars[var1] & 0xFF) == 160); var1++) {
		}
		int var2;
		for (var2 = this.length; var1 < var2 && (this.chars[var2 - 1] >= 0 && this.chars[var2 - 1] <= 32 || (this.chars[var2 - 1] & 0xFF) == 160); var2--) {
		}
		if (var1 == 0 && this.length == var2) {
			return this;
		}
		JagString var3 = new JagString();
		var3.length = var2 - var1;
		var3.chars = new byte[var3.length];
		for (int var4 = 0; var4 < var3.length; var4++) {
			var3.chars[var4] = this.chars[var1 + var4];
		}
		return var3;
	}

	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@ObfuscatedName("i.b(Z)I")
	public int method603() {
		return this.method607(10);
	}

	@ObfuscatedName("i.a(B)I")
	public int length() {
		return this.length;
	}

	@ObfuscatedName("i.b(B)I")
	public int computeCp1252HashFromUtf8() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.length; var2++) {
			var1 = (this.chars[var2] & 0xFF) + ((var1 << 5) - var1);
		}
		return var1;
	}

	@ObfuscatedName("i.c(Z)Ljava/net/URL;")
	public URL method606() throws MalformedURLException {
		return new URL(new String(this.chars, 0, this.length));
	}

	@ObfuscatedName("i.b(II)I")
	public int method607(int arg0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		for (int var5 = 0; var5 < this.length; var5++) {
			int var6 = this.chars[var5] & 0xFF;
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
			if (arg0 <= var6) {
				throw new NumberFormatException();
			}
			if (var2) {
				var6 = -var6;
			}
			int var7 = var4 * arg0 + var6;
			if (var7 / arg0 != var4) {
				throw new NumberFormatException();
			}
			var4 = var7;
			var3 = true;
		}
		if (!var3) {
			throw new NumberFormatException();
		}
		return var4;
	}

	@ObfuscatedName("i.a(Ljava/applet/Applet;I)Li;")
	public JagString method608(Applet arg0) {
		String var2 = new String(this.chars, 0, this.length);
		String var3 = arg0.getParameter(var2);
		return var3 == null ? null : method765(var3);
	}

	@ObfuscatedName("i.a(ZLjava/awt/FontMetrics;)I")
	public int method609(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.chars, 0, this.length);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("i.d(I)V")
	public void method610() {
		String var1;
		try {
			var1 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (UnsupportedEncodingException var2) {
			var1 = new String(this.chars, 0, this.length);
		}
		System.out.println(var1);
	}

	@ObfuscatedName("i.d(Z)Li;")
	public JagString method611() {
		JagString var1 = toRawUsername(this.toUserhash());
		return var1 == null ? field1411 : var1;
	}

	@ObfuscatedName("i.a(IIII[B)I")
	public int method612(int arg0, int arg1, byte[] arg2) {
		ArrayUtil.copy(this.chars, 0, arg2, arg1, arg0);
		return arg0;
	}

	@ObfuscatedName("i.e(I)[B")
	public byte[] copy() {
		byte[] var1 = new byte[this.length];
		ArrayUtil.copy(this.chars, 0, var1, 0, this.length);
		return var1;
	}

	@ObfuscatedName("i.c(B)Li;")
	public JagString toScreenName() {
		boolean var1 = true;
		JagString var2 = new JagString();
		var2.length = this.length;
		var2.chars = new byte[this.length];
		for (int var3 = 0; var3 < this.length; var3++) {
			byte var4 = this.chars[var3];
			if (var4 == 95) {
				var1 = true;
				var2.chars[var3] = 32;
			} else if (var4 >= 97 && var4 <= 122 && var1) {
				var2.chars[var3] = (byte) (var4 - 32);
				var1 = false;
			} else {
				var1 = false;
				var2.chars[var3] = var4;
			}
		}
		return var2;
	}

	@ObfuscatedName("i.c(II)Z")
	public boolean method615() {
		boolean var1 = false;
		int var2 = 0;
		boolean var3 = false;
		for (int var4 = 0; var4 < this.length; var4++) {
			int var5 = this.chars[var4] & 0xFF;
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
			int var6 = var5 + var2 * 10;
			if (var2 != var6 / 10) {
				return false;
			}
			var3 = true;
			var2 = var6;
		}
		return var3;
	}

	@ObfuscatedName("i.a(Li;B)Li;")
	public JagString append(JagString arg0) {
		if (!this.field1606) {
			throw new IllegalArgumentException();
		}
		this.field1616 = 0;
		if (this.chars.length < this.length + arg0.length) {
			int var2;
			for (var2 = 1; var2 < arg0.length + this.length; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			ArrayUtil.copy(this.chars, 0, var3, 0, this.length);
			this.chars = var3;
		}
		ArrayUtil.copy(arg0.chars, 0, this.chars, this.length, arg0.length);
		this.length += arg0.length;
		return this;
	}

	@ObfuscatedName("i.c(ILi;)I")
	public int indexOf(JagString arg0) {
		return this.method634(0, arg0);
	}

	@ObfuscatedName("i.d(II)Li;")
	public JagString method618(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		JagString var2 = new JagString();
		var2.chars = new byte[this.length + 1];
		var2.length = this.length + 1;
		ArrayUtil.copy(this.chars, 0, var2.chars, 0, this.length);
		var2.chars[this.length] = (byte) arg0;
		return var2;
	}

	@ObfuscatedName("i.d(ILi;)Z")
	public boolean startsWith(JagString arg0) {
		if (this.length < arg0.length) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg0.chars[var2] != this.chars[var2]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof JagString)) {
			throw new IllegalArgumentException();
		}
		return this.strEquals((JagString) arg0);
	}

	@ObfuscatedName("i.a(IILjava/awt/Graphics;I)V")
	public void drawString(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.chars, 0, this.length, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.chars, 0, this.length);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("i.f(I)Z")
	public boolean method621() {
		return this.method615();
	}

	@ObfuscatedName("i.g(I)Li;")
	public JagString method622() {
		byte var1 = 2;
		JagString var2 = new JagString();
		var2.length = this.length;
		var2.chars = new byte[this.length];
		for (int var3 = 0; var3 < this.length; var3++) {
			byte var4 = this.chars[var3];
			if (var4 >= 97 && var4 <= 122 || var4 >= -32 && var4 <= -2 && var4 != -9) {
				if (var1 == 2) {
					var4 = (byte) (var4 - 32);
				}
				var1 = 0;
			} else if (var4 >= 65 && var4 <= 90 || !(var4 < -64 || var4 > -34 || var4 == -41)) {
				if (var1 == 0) {
					var4 = (byte) (var4 + 32);
				}
				var1 = 0;
			} else if (var4 == 46 || var4 == 33 || var4 == 63) {
				var1 = 2;
			} else if (var4 != 32) {
				var1 = 1;
			} else if (var1 != 2) {
				var1 = 1;
			}
			var2.chars[var3] = var4;
		}
		return var2;
	}

	@Override
	public int hashCode() {
		return this.computeCp1252HashFromUtf8();
	}

	@ObfuscatedName("i.a(IBI)Li;")
	public JagString substring(int arg0, int arg1) {
		JagString var3 = new JagString();
		var3.chars = new byte[arg1 - arg0];
		var3.length = arg1 - arg0;
		ArrayUtil.copy(this.chars, arg0, var3.chars, 0, var3.length);
		return var3;
	}

	@ObfuscatedName("i.b(Li;B)Z")
	public boolean equalsIgnoreCase(JagString arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.length == this.length) {
			for (int var2 = 0; var2 < this.length; var2++) {
				byte var3 = this.chars[var2];
				if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
					var3 = (byte) (var3 + 32);
				}
				byte var4 = arg0.chars[var2];
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

	@ObfuscatedName("i.a(ZLi;)I")
	public int compare(JagString arg0) {
		int var2;
		if (this.length <= arg0.length) {
			var2 = this.length;
		} else {
			var2 = arg0.length;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if ((arg0.chars[var3] & 0xFF) > (this.chars[var3] & 0xFF)) {
				return -1;
			}
			if ((arg0.chars[var3] & 0xFF) < (this.chars[var3] & 0xFF)) {
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

	@ObfuscatedName("i.a(IZI)Li;")
	public JagString method626() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.chars = new byte[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			byte var3 = this.chars[var2];
			if (var3 == 47) {
				var1.chars[var2] = 32;
			} else {
				var1.chars[var2] = var3;
			}
		}
		return var1;
	}

	@ObfuscatedName("i.a(BLi;)I")
	public int method627(JagString arg0) {
		int var2;
		if (arg0.length >= this.length) {
			var2 = this.length;
		} else {
			var2 = arg0.length;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (field4373[this.chars[var3] & 0xFF] < field4373[arg0.chars[var3] & 0xFF]) {
				return -1;
			}
			if (field4373[this.chars[var3] & 0xFF] > field4373[arg0.chars[var3] & 0xFF]) {
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

	@ObfuscatedName("i.a(Ljava/applet/Applet;Z)Ljava/lang/Object;")
	public Object browserCall(Applet arg0) throws Throwable {
		String var2 = new String(this.chars, 0, this.length);
		Object var3 = BrowserControl.call(null, arg0, var2);
		if (var3 instanceof String) {
			byte[] var4 = ((String) var3).getBytes();
			var3 = fromBytes(0, var4, var4.length);
		}
		return var3;
	}

	@ObfuscatedName("i.d(B)Li;")
	public JagString method629() {
		if (!this.field1606) {
			throw new IllegalArgumentException();
		}
		this.field1616 = 0;
		if (this.chars.length != this.length) {
			byte[] var1 = new byte[this.length];
			ArrayUtil.copy(this.chars, 0, var1, 0, this.length);
			this.chars = var1;
		}
		return this;
	}

	@ObfuscatedName("i.e(Z)J")
	public long toUserhash() {
		long var1 = 0L;
		for (int var3 = 0; this.length > var3 && var3 < 12; var3++) {
			byte var4 = this.chars[var3];
			var1 *= 37L;
			if (var4 >= 65 && var4 <= 90) {
				var1 += var4 - 64;
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

	@ObfuscatedName("i.e(ILi;)Z")
	public boolean endsWith(JagString arg0) {
		if (arg0.length > this.length) {
			return false;
		}
		int var2 = this.length - arg0.length;
		for (int var3 = 0; var3 < arg0.length; var3++) {
			if (arg0.chars[var3] != this.chars[var3 + var2]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("i.a(Ljava/net/URL;B)Ljava/net/URL;")
	public URL method632(URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.chars, 0, this.length));
	}

	@ObfuscatedName("i.a(IBLi;)I")
	public int method634(int arg0, JagString arg1) {
		int[] var3 = new int[arg1.length];
		int[] var4 = new int[256];
		int[] var5 = new int[arg1.length];
		for (int var6 = 0; var6 < var4.length; var6++) {
			var4[var6] = arg1.length;
		}
		for (int var7 = 1; var7 <= arg1.length; var7++) {
			var3[var7 - 1] = (arg1.length << 1) - var7;
			var4[arg1.chars[var7 - 1] & 0xFF] = arg1.length - var7;
		}
		int var8 = arg1.length + 1;
		int var9 = arg1.length;
		while (var9 > 0) {
			var5[var9 - 1] = var8;
			while (var8 <= arg1.length && arg1.chars[var8 - 1] != arg1.chars[var9 - 1]) {
				if (arg1.length - var9 <= var3[var8 + -1]) {
					var3[var8 - 1] = arg1.length - var9;
				}
				var8 = var5[var8 - 1];
			}
			var9--;
			var8--;
		}
		int var10 = var8;
		int var11 = 1;
		int var12 = arg1.length + 1 - var8;
		int var13 = 0;
		int var14 = 1;
		while (var12 >= var14) {
			var5[var14 - 1] = var13;
			while (var13 >= 1 && arg1.chars[var13 - 1] != arg1.chars[var14 - 1]) {
				var13 = var5[var13 - 1];
			}
			var14++;
			var13++;
		}
		while (var10 < arg1.length) {
			for (int var15 = var11; var15 <= var10; var15++) {
				if (var3[var15 - 1] >= var10 + arg1.length - var15) {
					var3[var15 - 1] = var10 + arg1.length - var15;
				}
			}
			var11 = var10 + 1;
			var10 = var12 + var10 - var5[var12 + -1];
			var12 = var5[var12 - 1];
		}
		int var17;
		for (int var16 = arg1.length + arg0 - 1; var16 < this.length; var16 += Math.max(var4[this.chars[var16] & 0xFF], var3[var17])) {
			for (var17 = arg1.length - 1; var17 >= 0 && this.chars[var16] == arg1.chars[var17]; var17--) {
				var16--;
			}
			if (var17 == -1) {
				return var16 + 1;
			}
		}
		return -1;
	}

	@ObfuscatedName("i.e(II)Li;")
	public JagString substring(int arg0) {
		return this.substring(arg0, this.length);
	}

	@ObfuscatedName("i.a(ILjava/applet/Applet;)V")
	public void eval(Applet arg0) throws Throwable {
		String var2 = new String(this.chars, 0, this.length);
		BrowserControl.eval(arg0, var2);
	}

	@ObfuscatedName("i.e(B)J")
	public long method637(byte arg0) {
		long var2 = 0L;
		if (arg0 == 84) {
			for (int var4 = 0; var4 < this.length; var4++) {
				var2 = (long) (this.chars[var4] & 0xFF) + (var2 << 5) - var2;
			}
			return var2;
		} else {
			return -103L;
		}
	}

	@ObfuscatedName("i.f(II)Li;")
	public JagString append(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.field1606) {
			this.field1616 = 0;
			if (this.length == this.chars.length) {
				int var2;
				for (var2 = 1; var2 <= this.length; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				ArrayUtil.copy(this.chars, 0, var3, 0, this.length);
				this.chars = var3;
			}
			this.chars[this.length++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("i.i(I)Li;")
	public JagString toLowerCase() {
		JagString var1 = new JagString();
		var1.length = this.length;
		var1.chars = new byte[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			byte var3 = this.chars[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			var1.chars[var2] = var3;
		}
		return var1;
	}
}
