package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

@ObfuscatedName("re")
public final class ClientKeyboardListener implements KeyListener, FocusListener {

	@ObfuscatedName("tc.m")
	public static ClientKeyboardListener field2924 = new ClientKeyboardListener();
	@ObfuscatedName("ia.lc")
	public static int field1326 = 0;
	@ObfuscatedName("qc.f")
	public static volatile int field2430 = 0;
	@ObfuscatedName("wa.y")
	public static int[] field3231 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	@ObfuscatedName("a.Z")
	public static int[] field52 = new int[128];
	@ObfuscatedName("pe.Fb")
	public static int field2365 = 0;
	@ObfuscatedName("tc.j")
	public static int field2921 = 0;
	@ObfuscatedName("jc.sb")
	public static int[] field1465 = new int[128];
	@ObfuscatedName("rb.Eb")
	public static int[] field2625 = new int[128];
	@ObfuscatedName("va.rb")
	public static int field3122 = 0;
    @ObfuscatedName("rc.d")
    public static int field2630 = 0;

    @ObfuscatedName("ta.b(B)V")
	public static void method945() {
		if (field2924 != null) {
			ClientKeyboardListener var0 = field2924;
			synchronized (field2924) {
				field2924 = null;
			}
		}
	}

	@ObfuscatedName("ua.b(I)V")
	public static void method987() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			field3231[186] = 57;
			field3231[187] = 27;
			field3231[188] = 71;
			field3231[189] = 26;
			field3231[190] = 72;
			field3231[191] = 73;
			field3231[192] = 58;
			field3231[219] = 42;
			field3231[220] = 74;
			field3231[221] = 43;
			field3231[222] = 59;
			field3231[223] = 28;
			return;
		}
		field3231[44] = 71;
		field3231[45] = 26;
		field3231[46] = 72;
		field3231[47] = 73;
		field3231[59] = 57;
		field3231[61] = 27;
		field3231[91] = 42;
		field3231[92] = 74;
		field3231[93] = 43;
		if (SignLink.field1708 == null) {
			field3231[192] = 58;
			field3231[222] = 59;
		} else {
			field3231[192] = 28;
			field3231[222] = 58;
			field3231[520] = 59;
		}
	}

	@ObfuscatedName("ga.a(BLjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeKeyListener(field2924);
		arg0.removeFocusListener(field2924);
	}

	@ObfuscatedName("qd.a(Ljava/awt/Component;I)V")
	public static void addListeners(Component arg0) {
		Method var1 = SignLink.field1708;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(field2924);
		arg0.addFocusListener(field2924);
	}

	@ObfuscatedName("qd.f(I)V")
	public static void cycle() {
		ClientKeyboardListener var0 = field2924;
		synchronized (field2924) {
			field2921 = field2630;
			if (field1326 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					Client.field1488[var1] = false;
				}
				field1326 = field3122;
			} else {
				while (field1326 != field3122) {
					int var2 = field52[field3122];
					field3122 = field3122 + 1 & 0x7F;
					if (var2 < 0) {
						Client.field1488[~var2] = false;
					} else {
						Client.field1488[var2] = true;
					}
				}
			}
			field2630 = field2365;
		}
	}

	@ObfuscatedName("mb.a(B)Z")
	public static boolean method685() {
		ClientKeyboardListener var0 = field2924;
		synchronized (field2924) {
			if (field2921 == field2630) {
				return false;
			} else {
				Statics.field2885 = field1465[field2921];
				Statics.field2920 = field2625[field2921];
				field2921 = field2921 + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("f.a(Z)I")
	public static int method382() {
		return field2430++;
	}

    @ObfuscatedName("ra.a(ILjava/awt/event/KeyEvent;)I")
    public static int method870(KeyEvent arg0) {
        int var1 = arg0.getKeyChar();
        if (var1 <= 0 || var1 >= 256) {
            var1 = -1;
        }
        return var1;
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
		if (field2924 != null) {
			field1326 = -1;
		}
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (field2924 != null) {
			field2430 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && var2 < field3231.length) {
				var3 = field3231[var2];
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
				var4 = method870(arg0);
			}
			if (field1326 >= 0 && var3 >= 0) {
				field52[field1326] = var3;
				field1326 = field1326 + 1 & 0x7F;
				if (field1326 == field3122) {
					field1326 = -1;
				}
			}
			if (var3 >= 0 || var4 >= 0) {
				int var5 = field2365 + 1 & 0x7F;
				if (field2921 != var5) {
					field1465[field2365] = var3;
					field2625[field2365] = var4;
					field2365 = var5;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (field2924 != null) {
			field2430 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && field3231.length > var2) {
				var3 = field3231[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (field1326 >= 0 && var3 >= 0) {
				field52[field1326] = ~var3;
				field1326 = field1326 + 1 & 0x7F;
				if (field1326 == field3122) {
					field1326 = -1;
				}
			}
		}
		arg0.consume();
	}
}
