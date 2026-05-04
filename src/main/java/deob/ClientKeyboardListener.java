package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

@ObfuscatedName("eh")
public final class ClientKeyboardListener implements KeyListener, FocusListener {

	@ObfuscatedName("ke.I")
	public static final int[] field2059 = new int[128];
	@ObfuscatedName("vh.T")
	public static final int[] field4423 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@ObfuscatedName("q.vb")
	public static final int[] field3438 = new int[128];
	@ObfuscatedName("jg.H")
	public static final int[] field1908 = new int[128];

	@ObfuscatedName("pc.b")
	public static ClientKeyboardListener field3188 = new ClientKeyboardListener();
	@ObfuscatedName("ke.S")
	public static volatile int field2068 = 0;
	@ObfuscatedName("ci.x")
	public static int field524 = 0;
	@ObfuscatedName("nf.lb")
	public static int field2801 = 0;
	@ObfuscatedName("rf.Gb")
	public static int field3681 = 0;
	@ObfuscatedName("sg.k")
	public static int field3858 = 0;
	@ObfuscatedName("mf.x")
	public static int field2556;
	@ObfuscatedName("ua.r")
	public static int field4148;

	@ObfuscatedName("l.a(Ljava/awt/Component;I)V")
	public static void removeListeners(java.awt.Component arg0) {
		arg0.removeKeyListener(field3188);
		arg0.removeFocusListener(field3188);
		field524 = -1;
	}

	@ObfuscatedName("fj.a(Ljava/awt/event/KeyEvent;I)I")
	public static int method455(KeyEvent arg0) {
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

	@ObfuscatedName("di.c(B)Z")
	public static boolean method279() {
		ClientKeyboardListener var0 = field3188;
		synchronized (field3188) {
			if (field3858 == Statics.field898) {
				return false;
			} else {
				field2556 = field3438[field3858];
				field4148 = field1908[field3858];
				field3858 = field3858 + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("ec.b(I)V")
	public static void method366() {
		ClientKeyboardListener var0 = field3188;
		synchronized (field3188) {
			field2068++;
			field3858 = Statics.field898;
			if (field524 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					Statics.field4511[var1] = false;
				}
				field524 = field2801;
			} else {
				while (field2801 != field524) {
					int var2 = field2059[field2801];
					field2801 = field2801 + 1 & 0x7F;
					if (var2 >= 0) {
						Statics.field4511[var2] = true;
					} else {
						Statics.field4511[~var2] = false;
					}
				}
			}
			Statics.field898 = field3681;
		}
	}

	@ObfuscatedName("sh.c(I)V")
	public static void method1401() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			field4423[223] = 28;
			field4423[222] = 59;
			field4423[189] = 26;
			field4423[191] = 73;
			field4423[190] = 72;
			field4423[192] = 58;
			field4423[219] = 42;
			field4423[221] = 43;
			field4423[220] = 74;
			field4423[187] = 27;
			field4423[188] = 71;
			field4423[186] = 57;
			return;
		}
		field4423[46] = 72;
		field4423[44] = 71;
		field4423[92] = 74;
		field4423[59] = 57;
		field4423[61] = 27;
		if (SignLink.setFocusTraversalKeysEnabled == null) {
			field4423[192] = 58;
			field4423[222] = 59;
		} else {
			field4423[520] = 59;
			field4423[192] = 28;
			field4423[222] = 58;
		}
		field4423[47] = 73;
		field4423[91] = 42;
		field4423[93] = 43;
		field4423[45] = 26;
	}

	@ObfuscatedName("na.a(BLjava/awt/Component;)V")
	public static void method935(java.awt.Component arg0) {
		Method var1 = SignLink.setFocusTraversalKeysEnabled;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(field3188);
		arg0.addFocusListener(field3188);
	}

	@ObfuscatedName("nd.a(I)V")
	public static void method975() {
		if (field3188 != null) {
			ClientKeyboardListener var0 = field3188;
			synchronized (field3188) {
				field3188 = null;
			}
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (field3188 != null) {
			field2068 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && field4423.length > var2) {
				var3 = field4423[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (field524 >= 0 && var3 >= 0) {
				field2059[field524] = ~var3;
				field524 = field524 + 1 & 0x7F;
				if (field2801 == field524) {
					field524 = -1;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (field3188 == null) {
			return;
		}
		field2068 = 0;
		int var2 = arg0.getKeyCode();
		int var3;
		if (var2 >= 0 && field4423.length > var2) {
			var3 = field4423[var2];
			if ((var3 & 0x80) != 0) {
				var3 = -1;
			}
		} else {
			var3 = -1;
		}
		if (field524 >= 0 && var3 >= 0) {
			field2059[field524] = var3;
			field524 = field524 + 1 & 0x7F;
			if (field524 == field2801) {
				field524 = -1;
			}
		}
		if (var3 >= 0) {
			int var4 = field3681 + 1 & 0x7F;
			if (var4 != field3858) {
				field3438[field3681] = var3;
				field1908[field3681] = -1;
				field3681 = var4;
			}
		}
		int var5 = arg0.getModifiers();
		if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (field3188 != null) {
			field524 = -1;
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (field3188 != null) {
			int var2 = method455(arg0);
			if (var2 >= 0) {
				int var3 = field3681 + 1 & 0x7F;
				if (field3858 != var3) {
					field3438[field3681] = -1;
					field1908[field3681] = var2;
					field3681 = var3;
				}
			}
		}
		arg0.consume();
	}
}
