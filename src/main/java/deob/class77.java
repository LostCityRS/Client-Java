package deob;

import java.awt.event.KeyEvent;

@ObfuscatedName("la")
public final class class77 extends class146 {

	@ObfuscatedName("la.ab")
	public int field1819;

	@ObfuscatedName("la.s")
	public int field1785;

	@ObfuscatedName("la.t")
	public static class32 field1786 = class73.method593("", true);

	@ObfuscatedName("la.r")
	public static class32 field1784 = field1786;

	@ObfuscatedName("la.v")
	public class90 field1788;

	@ObfuscatedName("la.w")
	public static boolean field1789 = false;

	@ObfuscatedName("la.x")
	public static class32 field1790 = class73.method593("Enter your username (V password)3", true);

	@ObfuscatedName("la.u")
	public static class32 field1787 = field1790;

	@ObfuscatedName("la.T")
	public static boolean field1812 = true;

	@ObfuscatedName("la.U")
	public static class32 field1813 = class73.method593("The server is being updated)3", true);

	@ObfuscatedName("la.O")
	public static int[] field1807 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@ObfuscatedName("la.Q")
	public static class32 field1809 = field1813;

	@ObfuscatedName("la.I")
	public static class32 field1801 = class73.method593(" ", true);

	@ObfuscatedName("la.y")
	public int field1791;

	@ObfuscatedName("la.z")
	public int field1792;

	@ObfuscatedName("la.A")
	public int field1793;

	@ObfuscatedName("la.B")
	public int field1794;

	@ObfuscatedName("la.C")
	public int field1795;

	@ObfuscatedName("la.G")
	public int field1799;

	@ObfuscatedName("la.H")
	public int field1800;

	@ObfuscatedName("la.J")
	public int field1802;

	@ObfuscatedName("la.K")
	public int field1803;

	@ObfuscatedName("la.M")
	public int field1805;

	@ObfuscatedName("la.R")
	public int field1810;

	@ObfuscatedName("la.V")
	public int field1814;

	@ObfuscatedName("la.X")
	public int field1816;

	@ObfuscatedName("la.Y")
	public int field1817;

	@ObfuscatedName("la.Z")
	public int field1818;

	@ObfuscatedName("la.S")
	public class58 field1811;

	@ObfuscatedName("la.D")
	public class72 field1796;

	@ObfuscatedName("la.L")
	public class73 field1804;

	@ObfuscatedName("la.a(Z)V")
	public static void method614() {
		field1801 = null;
		field1787 = null;
		field1809 = null;
		field1807 = null;
		field1784 = null;
		field1786 = null;
		field1790 = null;
		field1813 = null;
	}

	@ObfuscatedName("la.a(IILec;II)V")
	public static void method616(int arg0, int arg1, class32 arg2, int arg3) {
		class36 var4 = class130.method1000(arg3, arg1);
		if (var4 == null) {
			return;
		}
		if (var4.field794 != null) {
			class12 var5 = new class12();
			var5.field209 = var4;
			var5.field203 = arg2;
			var5.field205 = arg0;
			var5.field208 = var4.field794;
			class158.method1222(var5);
		}
		boolean var6 = true;
		if (var4.field845 > 0) {
			var6 = client.method152(var4);
		}
		if (!var6 || !class13.method69(class147.method1100(var4), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			class44.field1026.method356(221);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 2) {
			class44.field1026.method356(108);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 3) {
			class44.field1026.method356(181);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 4) {
			class44.field1026.method356(143);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 5) {
			class44.field1026.method356(167);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 6) {
			class44.field1026.method356(175);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 7) {
			class44.field1026.method356(162);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 8) {
			class44.field1026.method356(98);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 9) {
			class44.field1026.method356(103);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
		if (arg0 == 10) {
			class44.field1026.method356(150);
			class44.field1026.method530(arg1);
			class44.field1026.method513(arg3);
		}
	}

	@ObfuscatedName("la.a(Lea;Lea;BLea;)V")
	public static void method617(class30 arg0, class30 arg1, class30 arg2) {
		class79.field1828 = arg1;
		class3.field45 = arg2;
		class137.field3193 = arg0;
	}

	@ObfuscatedName("la.a(BLjava/awt/event/KeyEvent;)I")
	public static int method618(KeyEvent arg0) {
		int var1 = arg0.getKeyChar();
		if (var1 == 8364) {
			return 128;
		} else {
			if (var1 <= 0 || var1 >= 256) {
				var1 = -1;
			}
			return var1;
		}
	}

	@ObfuscatedName("la.d(I)V")
	public void method615() {
		this.field1804 = null;
		this.field1788 = null;
		this.field1796 = null;
		this.field1811 = null;
	}
}
