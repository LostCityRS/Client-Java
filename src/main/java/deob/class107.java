package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("re")
public final class class107 implements KeyListener, FocusListener {

	@ObfuscatedName("re.a")
	public static class1 field2687 = Statics.method931("Benutzername: ");

	@ObfuscatedName("re.h")
	public static class92 field2694 = new class92();

	@ObfuscatedName("re.l")
	public static int[] field2698 = new int[256];

	@ObfuscatedName("re.m")
	public static class1 field2699;

	@ObfuscatedName("re.n")
	public static class1 field2700;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field2698[var0] = var1;
		}
		field2699 = Statics.method931("@yel@");
		field2700 = Statics.method931("compass");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		arg0.consume();
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class117.field2924 != null) {
			class49.field1326 = -1;
		}
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (class117.field2924 != null) {
			class99.field2430 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && var2 < class132.field3231.length) {
				var3 = class132.field3231[var2];
				if ((var3 & 0x80) != 0) {
					var3 = -1;
				}
			} else {
				var3 = -1;
			}
			int var4;
			if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
				var4 = -1;
			} else {
				var4 = Statics.method870(arg0);
			}
			if (class49.field1326 >= 0 && var3 >= 0) {
				class1.field52[class49.field1326] = var3;
				class49.field1326 = class49.field1326 + 1 & 0x7F;
				if (class49.field1326 == class127.field3122) {
					class49.field1326 = -1;
				}
			}
			if (var3 >= 0 || var4 >= 0) {
				int var5 = class95.field2365 + 1 & 0x7F;
				if (class117.field2921 != var5) {
					class57.field1465[class95.field2365] = var3;
					class104.field2625[class95.field2365] = var4;
					class95.field2365 = var5;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (class117.field2924 != null) {
			class99.field2430 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && class132.field3231.length > var2) {
				var3 = class132.field3231[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (class49.field1326 >= 0 && var3 >= 0) {
				class1.field52[class49.field1326] = ~var3;
				class49.field1326 = class49.field1326 + 1 & 0x7F;
				if (class49.field1326 == class127.field3122) {
					class49.field1326 = -1;
				}
			}
		}
		arg0.consume();
	}
}
