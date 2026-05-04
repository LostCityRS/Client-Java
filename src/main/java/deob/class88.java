package deob;

import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("i")
public final class class88 implements class187 {

	@ObfuscatedName("i.c")
	public static final short[] field1601 = new short[] { -10304, 9104, -1, -1, -1 };

	@ObfuscatedName("i.h")
	public boolean field1606 = true;

	@ObfuscatedName("i.kb")
	public int field1660;

	@ObfuscatedName("i.r")
	public int field1616;

	@ObfuscatedName("i.D")
	public static final class88 field1628 = class208.method1423(105, "This world is full)3");

	@ObfuscatedName("i.fb")
	public static class88 field1655 = field1628;

	@ObfuscatedName("i.M")
	public static final class88 field1637 = class208.method1423(105, "<col=ffffff>");

	@ObfuscatedName("i.N")
	public static int field1638 = 0;

	@ObfuscatedName("i.U")
	public static int field1644 = 2;

	@ObfuscatedName("i.J")
	public static int field1634 = 0;

	@ObfuscatedName("i.L")
	public static int field1636;

	@ObfuscatedName("i.Q")
	public static class169 field1640;

	@ObfuscatedName("i.T")
	public byte[] field1643;

	@ObfuscatedName("i.X")
	public static class71[] field1647;

	@ObfuscatedName("i.h(I)V")
	public static void method633() {
		while (true) {
			if (class230.field4312.method31(class228.field4270) >= 27) {
				int var0 = class230.field4312.method28(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (class225.field4223[var0] == null) {
						var1 = true;
						class225.field4223[var0] = new class191();
					}
					class191 var2 = class225.field4223[var0];
					class25.field402[class55.field1041++] = var0;
					var2.field4081 = class117.field2113;
					int var3 = class230.field4312.method28(1);
					int var4 = class230.field4312.method28(5);
					int var5 = class230.field4312.method28(1);
					if (var5 == 1) {
						class139.field2579[class192.field3702++] = var0;
					}
					int var6 = class6.field75[class230.field4312.method28(3)];
					if (var1) {
						var2.field4119 = var2.field4085 = var6;
					}
					var2.field3682 = class147.method985(class230.field4312.method28(14));
					int var7 = class230.field4312.method28(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.field4103 = var2.field3682.field2349;
					if (var4 > 15) {
						var4 -= 32;
					}
					var2.field4084 = var2.field3682.field2351;
					var2.field4105 = var2.field3682.field2325;
					var2.field4122 = var2.field3682.field2337;
					var2.field4091 = var2.field3682.field2317;
					var2.field4102 = var2.field3682.field2339;
					if (var2.field4102 == 0) {
						var2.field4085 = 0;
					}
					var2.field4123 = var2.field3682.field2343;
					var2.field4092 = var2.field3682.field2322;
					var2.field4128 = var2.field3682.field2360;
					var2.method1474(var3 == 1, class240.field4456.field4087[0] + var4, class240.field4456.field4141[0] - -var7);
					continue;
				}
			}
			class230.field4312.method35();
			return;
		}
	}

	@ObfuscatedName("i.a(BII)I")
	public int method594(int arg0, int arg1) {
		byte var3 = (byte) arg0;
		for (int var4 = arg1; var4 < this.field1660; var4++) {
			if (this.field1643[var4] == var3) {
				return var4;
			}
		}
		return -1;
	}

	@ObfuscatedName("i.a(ILi;)Z")
	public boolean method595(class88 arg0) {
		if (arg0.field1660 > this.field1660) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.field1660; var2++) {
			byte var3 = this.field1643[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			byte var4 = arg0.field1643[var2];
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
	public class88 method596() {
		class88 var1 = new class88();
		var1.field1660 = this.field1660;
		var1.field1643 = new byte[this.field1660];
		for (int var2 = 0; var2 < this.field1660; var2++) {
			var1.field1643[var2] = 42;
		}
		return var1;
	}

	@ObfuscatedName("i.b(ILi;)Z")
	public boolean method597(int arg0, class88 arg1) {
		if (arg1 == null) {
			return false;
		} else if (arg1.field1660 == this.field1660) {
			if (!this.field1606 || !arg1.field1606) {
				if (this.field1616 == 0) {
					this.field1616 = this.method605();
					if (this.field1616 == 0) {
						this.field1616 = 1;
					}
				}
				if (arg1.field1616 == 0) {
					arg1.field1616 = arg1.method605();
					if (arg1.field1616 == 0) {
						arg1.field1616 = 1;
					}
				}
				if (this.field1616 != arg1.field1616) {
					return false;
				}
			}
			for (int var3 = 0; var3 < this.field1660; var3++) {
				if (arg1.field1643[var3] != this.field1643[var3]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("i.a(II)I")
	public int method599(int arg0) {
		return this.field1643[arg0] & 0xFF;
	}

	@ObfuscatedName("i.a(BI)[Li;")
	public class88[] method600(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.field1660; var3++) {
			if (arg0 == this.field1643[var3]) {
				var2++;
			}
		}
		class88[] var4 = new class88[var2 + 1];
		if (var2 == 0) {
			var4[0] = this;
			return var4;
		}
		int var5 = 0;
		int var6 = 0;
		for (int var7 = 0; var7 < var2; var7++) {
			int var8;
			for (var8 = 0; this.field1643[var6 + var8] != arg0; var8++) {
			}
			var4[var5++] = this.method623(var6, var6 + var8);
			var6 += var8 + 1;
		}
		var4[var2] = this.method623(var6, this.field1660);
		return var4;
	}

	@ObfuscatedName("i.b(I)Li;")
	public class88 method601(int arg0) {
		long var2 = this.method637((byte) 84);
		Class var4 = class88.class;
		synchronized (class88.class) {
			if (class230.field4313 == null) {
				class230.field4313 = new class154(4096);
			} else {
				for (class216 var5 = (class216) class230.field4313.method1049(var2); var5 != null; var5 = (class216) class230.field4313.method1054(3)) {
					if (this.method597(arg0 ^ 0x49, var5.field4046)) {
						return var5.field4046;
					}
				}
			}
			if (arg0 != -35) {
				return null;
			}
			class216 var8 = new class216();
			var8.field4046 = this;
			this.field1606 = false;
			class230.field4313.method1052(var2, var8);
			return this;
		}
	}

	@ObfuscatedName("i.c(I)Li;")
	public class88 method602() {
		int var1;
		for (var1 = 0; var1 < this.field1660 && (this.field1643[var1] >= 0 && this.field1643[var1] <= 32 || (this.field1643[var1] & 0xFF) == 160); var1++) {
		}
		int var2;
		for (var2 = this.field1660; var1 < var2 && (this.field1643[var2 - 1] >= 0 && this.field1643[var2 - 1] <= 32 || (this.field1643[var2 - 1] & 0xFF) == 160); var2--) {
		}
		if (var1 == 0 && this.field1660 == var2) {
			return this;
		}
		class88 var3 = new class88();
		var3.field1660 = var2 - var1;
		var3.field1643 = new byte[var3.field1660];
		for (int var4 = 0; var4 < var3.field1660; var4++) {
			var3.field1643[var4] = this.field1643[var1 + var4];
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
	public int method604() {
		return this.field1660;
	}

	@ObfuscatedName("i.b(B)I")
	public int method605() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field1660; var2++) {
			var1 = (this.field1643[var2] & 0xFF) + ((var1 << 5) - var1);
		}
		return var1;
	}

	@ObfuscatedName("i.c(Z)Ljava/net/URL;")
	public URL method606() throws MalformedURLException {
		return new URL(new String(this.field1643, 0, this.field1660));
	}

	@ObfuscatedName("i.b(II)I")
	public int method607(int arg0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		for (int var5 = 0; var5 < this.field1660; var5++) {
			int var6 = this.field1643[var5] & 0xFF;
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
	public class88 method608(Applet arg0) {
		String var2 = new String(this.field1643, 0, this.field1660);
		String var3 = arg0.getParameter(var2);
		return var3 == null ? null : class111.method765(var3);
	}

	@ObfuscatedName("i.a(ZLjava/awt/FontMetrics;)I")
	public int method609(FontMetrics arg0) {
		String var2;
		try {
			var2 = new String(this.field1643, 0, this.field1660, "ISO-8859-1");
		} catch (UnsupportedEncodingException var3) {
			var2 = new String(this.field1643, 0, this.field1660);
		}
		return arg0.stringWidth(var2);
	}

	@ObfuscatedName("i.d(I)V")
	public void method610() {
		String var1;
		try {
			var1 = new String(this.field1643, 0, this.field1660, "ISO-8859-1");
		} catch (UnsupportedEncodingException var2) {
			var1 = new String(this.field1643, 0, this.field1660);
		}
		System.out.println(var1);
	}

	@ObfuscatedName("i.d(Z)Li;")
	public class88 method611() {
		class88 var1 = class200.method1375(this.method630());
		return var1 == null ? class78.field1411 : var1;
	}

	@ObfuscatedName("i.a(IIII[B)I")
	public int method612(int arg0, int arg1, byte[] arg2) {
		class124.method836(this.field1643, 0, arg2, arg1, arg0);
		return arg0;
	}

	@ObfuscatedName("i.e(I)[B")
	public byte[] method613() {
		byte[] var1 = new byte[this.field1660];
		class124.method836(this.field1643, 0, var1, 0, this.field1660);
		return var1;
	}

	@ObfuscatedName("i.c(B)Li;")
	public class88 method614() {
		boolean var1 = true;
		class88 var2 = new class88();
		var2.field1660 = this.field1660;
		var2.field1643 = new byte[this.field1660];
		for (int var3 = 0; var3 < this.field1660; var3++) {
			byte var4 = this.field1643[var3];
			if (var4 == 95) {
				var1 = true;
				var2.field1643[var3] = 32;
			} else if (var4 >= 97 && var4 <= 122 && var1) {
				var2.field1643[var3] = (byte) (var4 - 32);
				var1 = false;
			} else {
				var1 = false;
				var2.field1643[var3] = var4;
			}
		}
		return var2;
	}

	@ObfuscatedName("i.c(II)Z")
	public boolean method615() {
		boolean var1 = false;
		int var2 = 0;
		boolean var3 = false;
		for (int var4 = 0; var4 < this.field1660; var4++) {
			int var5 = this.field1643[var4] & 0xFF;
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
	public class88 method616(class88 arg0) {
		if (!this.field1606) {
			throw new IllegalArgumentException();
		}
		this.field1616 = 0;
		if (this.field1643.length < this.field1660 + arg0.field1660) {
			int var2;
			for (var2 = 1; var2 < arg0.field1660 + this.field1660; var2 += var2) {
			}
			byte[] var3 = new byte[var2];
			class124.method836(this.field1643, 0, var3, 0, this.field1660);
			this.field1643 = var3;
		}
		class124.method836(arg0.field1643, 0, this.field1643, this.field1660, arg0.field1660);
		this.field1660 += arg0.field1660;
		return this;
	}

	@ObfuscatedName("i.c(ILi;)I")
	public int method617(class88 arg0) {
		return this.method634(0, arg0);
	}

	@ObfuscatedName("i.d(II)Li;")
	public class88 method618(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		class88 var2 = new class88();
		var2.field1643 = new byte[this.field1660 + 1];
		var2.field1660 = this.field1660 + 1;
		class124.method836(this.field1643, 0, var2.field1643, 0, this.field1660);
		var2.field1643[this.field1660] = (byte) arg0;
		return var2;
	}

	@ObfuscatedName("i.d(ILi;)Z")
	public boolean method619(class88 arg0) {
		if (this.field1660 < arg0.field1660) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.field1660; var2++) {
			if (arg0.field1643[var2] != this.field1643[var2]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class88)) {
			throw new IllegalArgumentException();
		}
		return this.method597(-111, (class88) arg0);
	}

	@ObfuscatedName("i.a(IILjava/awt/Graphics;I)V")
	public void method620(int arg0, int arg1, Graphics arg2) {
		String var4;
		try {
			var4 = new String(this.field1643, 0, this.field1660, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var4 = new String(this.field1643, 0, this.field1660);
		}
		arg2.drawString(var4, arg0, arg1);
	}

	@ObfuscatedName("i.f(I)Z")
	public boolean method621() {
		return this.method615();
	}

	@ObfuscatedName("i.g(I)Li;")
	public class88 method622() {
		byte var1 = 2;
		class88 var2 = new class88();
		var2.field1660 = this.field1660;
		var2.field1643 = new byte[this.field1660];
		for (int var3 = 0; var3 < this.field1660; var3++) {
			byte var4 = this.field1643[var3];
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
			var2.field1643[var3] = var4;
		}
		return var2;
	}

	@Override
	public int hashCode() {
		return this.method605();
	}

	@ObfuscatedName("i.a(IBI)Li;")
	public class88 method623(int arg0, int arg1) {
		class88 var3 = new class88();
		var3.field1643 = new byte[arg1 - arg0];
		var3.field1660 = arg1 - arg0;
		class124.method836(this.field1643, arg0, var3.field1643, 0, var3.field1660);
		return var3;
	}

	@ObfuscatedName("i.b(Li;B)Z")
	public boolean method624(class88 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.field1660 == this.field1660) {
			for (int var2 = 0; var2 < this.field1660; var2++) {
				byte var3 = this.field1643[var2];
				if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
					var3 = (byte) (var3 + 32);
				}
				byte var4 = arg0.field1643[var2];
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
	public int method625(class88 arg0) {
		int var2;
		if (this.field1660 <= arg0.field1660) {
			var2 = this.field1660;
		} else {
			var2 = arg0.field1660;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if ((arg0.field1643[var3] & 0xFF) > (this.field1643[var3] & 0xFF)) {
				return -1;
			}
			if ((arg0.field1643[var3] & 0xFF) < (this.field1643[var3] & 0xFF)) {
				return 1;
			}
		}
		if (this.field1660 < arg0.field1660) {
			return -1;
		} else if (arg0.field1660 < this.field1660) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("i.a(IZI)Li;")
	public class88 method626() {
		class88 var1 = new class88();
		var1.field1660 = this.field1660;
		var1.field1643 = new byte[this.field1660];
		for (int var2 = 0; var2 < this.field1660; var2++) {
			byte var3 = this.field1643[var2];
			if (var3 == 47) {
				var1.field1643[var2] = 32;
			} else {
				var1.field1643[var2] = var3;
			}
		}
		return var1;
	}

	@ObfuscatedName("i.a(BLi;)I")
	public int method627(class88 arg0) {
		int var2;
		if (arg0.field1660 >= this.field1660) {
			var2 = this.field1660;
		} else {
			var2 = arg0.field1660;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			if (class233.field4373[this.field1643[var3] & 0xFF] < class233.field4373[arg0.field1643[var3] & 0xFF]) {
				return -1;
			}
			if (class233.field4373[this.field1643[var3] & 0xFF] > class233.field4373[arg0.field1643[var3] & 0xFF]) {
				return 1;
			}
		}
		if (this.field1660 < arg0.field1660) {
			return -1;
		} else if (arg0.field1660 < this.field1660) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("i.a(Ljava/applet/Applet;Z)Ljava/lang/Object;")
	public Object method628(Applet arg0) throws Throwable {
		String var2 = new String(this.field1643, 0, this.field1660);
		Object var3 = class243.method1597(null, arg0, var2);
		if (var3 instanceof String) {
			byte[] var4 = ((String) var3).getBytes();
			var3 = class54.method395(0, var4, var4.length);
		}
		return var3;
	}

	@ObfuscatedName("i.d(B)Li;")
	public class88 method629() {
		if (!this.field1606) {
			throw new IllegalArgumentException();
		}
		this.field1616 = 0;
		if (this.field1643.length != this.field1660) {
			byte[] var1 = new byte[this.field1660];
			class124.method836(this.field1643, 0, var1, 0, this.field1660);
			this.field1643 = var1;
		}
		return this;
	}

	@ObfuscatedName("i.e(Z)J")
	public long method630() {
		long var1 = 0L;
		for (int var3 = 0; this.field1660 > var3 && var3 < 12; var3++) {
			byte var4 = this.field1643[var3];
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
	public boolean method631(class88 arg0) {
		if (arg0.field1660 > this.field1660) {
			return false;
		}
		int var2 = this.field1660 - arg0.field1660;
		for (int var3 = 0; var3 < arg0.field1660; var3++) {
			if (arg0.field1643[var3] != this.field1643[var3 + var2]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("i.a(Ljava/net/URL;B)Ljava/net/URL;")
	public URL method632(URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.field1643, 0, this.field1660));
	}

	@ObfuscatedName("i.a(IBLi;)I")
	public int method634(int arg0, class88 arg1) {
		int[] var3 = new int[arg1.field1660];
		int[] var4 = new int[256];
		int[] var5 = new int[arg1.field1660];
		for (int var6 = 0; var6 < var4.length; var6++) {
			var4[var6] = arg1.field1660;
		}
		for (int var7 = 1; var7 <= arg1.field1660; var7++) {
			var3[var7 - 1] = (arg1.field1660 << 1) - var7;
			var4[arg1.field1643[var7 - 1] & 0xFF] = arg1.field1660 - var7;
		}
		int var8 = arg1.field1660 + 1;
		int var9 = arg1.field1660;
		while (var9 > 0) {
			var5[var9 - 1] = var8;
			while (var8 <= arg1.field1660 && arg1.field1643[var8 - 1] != arg1.field1643[var9 - 1]) {
				if (arg1.field1660 - var9 <= var3[var8 + -1]) {
					var3[var8 - 1] = arg1.field1660 - var9;
				}
				var8 = var5[var8 - 1];
			}
			var9--;
			var8--;
		}
		int var10 = var8;
		int var11 = 1;
		int var12 = arg1.field1660 + 1 - var8;
		int var13 = 0;
		int var14 = 1;
		while (var12 >= var14) {
			var5[var14 - 1] = var13;
			while (var13 >= 1 && arg1.field1643[var13 - 1] != arg1.field1643[var14 - 1]) {
				var13 = var5[var13 - 1];
			}
			var14++;
			var13++;
		}
		while (var10 < arg1.field1660) {
			for (int var15 = var11; var15 <= var10; var15++) {
				if (var3[var15 - 1] >= var10 + arg1.field1660 - var15) {
					var3[var15 - 1] = var10 + arg1.field1660 - var15;
				}
			}
			var11 = var10 + 1;
			var10 = var12 + var10 - var5[var12 + -1];
			var12 = var5[var12 - 1];
		}
		int var17;
		for (int var16 = arg1.field1660 + arg0 - 1; var16 < this.field1660; var16 += Math.max(var4[this.field1643[var16] & 0xFF], var3[var17])) {
			for (var17 = arg1.field1660 - 1; var17 >= 0 && this.field1643[var16] == arg1.field1643[var17]; var17--) {
				var16--;
			}
			if (var17 == -1) {
				return var16 + 1;
			}
		}
		return -1;
	}

	@ObfuscatedName("i.e(II)Li;")
	public class88 method635(int arg0) {
		return this.method623(arg0, this.field1660);
	}

	@ObfuscatedName("i.a(ILjava/applet/Applet;)V")
	public void method636(Applet arg0) throws Throwable {
		String var2 = new String(this.field1643, 0, this.field1660);
		class243.method1596(arg0, var2);
	}

	@ObfuscatedName("i.e(B)J")
	public long method637(byte arg0) {
		long var2 = 0L;
		if (arg0 == 84) {
			for (int var4 = 0; var4 < this.field1660; var4++) {
				var2 = (long) (this.field1643[var4] & 0xFF) + (var2 << 5) - var2;
			}
			return var2;
		} else {
			return -103L;
		}
	}

	@ObfuscatedName("i.f(II)Li;")
	public class88 method638(int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.field1606) {
			this.field1616 = 0;
			if (this.field1660 == this.field1643.length) {
				int var2;
				for (var2 = 1; var2 <= this.field1660; var2 += var2) {
				}
				byte[] var3 = new byte[var2];
				class124.method836(this.field1643, 0, var3, 0, this.field1660);
				this.field1643 = var3;
			}
			this.field1643[this.field1660++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("i.i(I)Li;")
	public class88 method639() {
		class88 var1 = new class88();
		var1.field1660 = this.field1660;
		var1.field1643 = new byte[this.field1660];
		for (int var2 = 0; var2 < this.field1660; var2++) {
			byte var3 = this.field1643[var2];
			if (var3 >= 65 && var3 <= 90 || var3 >= -64 && var3 <= -34 && var3 != -41) {
				var3 = (byte) (var3 + 32);
			}
			var1.field1643[var2] = var3;
		}
		return var1;
	}
}
