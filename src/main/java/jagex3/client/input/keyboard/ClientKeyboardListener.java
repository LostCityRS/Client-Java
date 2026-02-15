package jagex3.client.input.keyboard;

import deob.ObfuscatedName;
import jagex3.client.applet.SignLink;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

@ObfuscatedName("ld")
public final class ClientKeyboardListener implements KeyListener, FocusListener {

	@ObfuscatedName("fb.M")
	public static ClientKeyboardListener instance = new ClientKeyboardListener();
	@ObfuscatedName("nb.J")
	public static int[] field2120 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@ObfuscatedName("wd.i")
	public static volatile int field3586 = 0;
	@ObfuscatedName("bf.e")
	public static int field231 = 0;
	@ObfuscatedName("ac.K")
	public static int[] field55 = new int[128];
	@ObfuscatedName("j.lb")
	public static int field1396 = 0;
	@ObfuscatedName("a.h")
	public static int field8 = 0;
	@ObfuscatedName("ue.w")
	public static int[] field3285 = new int[128];
	@ObfuscatedName("pb.kb")
	public static int[] field2518 = new int[128];
	@ObfuscatedName("qc.q")
	public static int field2660 = 0;
	@ObfuscatedName("be.E")
	public static int code;
	@ObfuscatedName("pe.n")
	public static int ch;
	@ObfuscatedName("pc.z")
	public static boolean[] keyHeld = new boolean[112];
	@ObfuscatedName("fc.z")
	public static int field936 = 0;

	@ObfuscatedName("rc.e(I)V")
	public static void cycle() {
		ClientKeyboardListener var0 = instance;
		synchronized (instance) {
			field8 = field936;
			if (field231 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					keyHeld[var1] = false;
				}
				field231 = field2660;
			} else {
				while (field2660 != field231) {
					int var2 = field55[field2660];
					field2660 = field2660 + 1 & 0x7F;
					if (var2 >= 0) {
						keyHeld[var2] = true;
					} else {
						keyHeld[~var2] = false;
					}
				}
			}
			field936 = field1396;
		}
	}

	@ObfuscatedName("cb.a(ILjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeKeyListener(instance);
		arg0.removeFocusListener(instance);
		field231 = -1;
	}

	@ObfuscatedName("hc.a(Ljava/awt/Component;I)V")
	public static void addListeners(Component arg0) {
		Method var1 = SignLink.setFocusTraversalKeysEnabled;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(instance);
		arg0.addFocusListener(instance);
	}

	@ObfuscatedName("t.a(I)V")
	public static void shutdown() {
		if (instance != null) {
			ClientKeyboardListener var0 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@ObfuscatedName("bd.a(B)V")
	public static void setupKeyCodeMap() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			field2120[191] = 73;
			field2120[220] = 74;
			field2120[190] = 72;
			field2120[222] = 59;
			field2120[221] = 43;
			field2120[219] = 42;
			field2120[223] = 28;
			field2120[187] = 27;
			field2120[189] = 26;
			field2120[192] = 58;
			field2120[188] = 71;
			field2120[186] = 57;
			return;
		}
		field2120[92] = 74;
		field2120[61] = 27;
		field2120[46] = 72;
		if (SignLink.setFocusTraversalKeysEnabled == null) {
			field2120[192] = 58;
			field2120[222] = 59;
		} else {
			field2120[222] = 58;
			field2120[520] = 59;
			field2120[192] = 28;
		}
		field2120[44] = 71;
		field2120[93] = 43;
		field2120[47] = 73;
		field2120[59] = 57;
		field2120[45] = 26;
		field2120[91] = 42;
	}

	@ObfuscatedName("uf.b(B)Z")
	public static boolean pollKey() {
		ClientKeyboardListener var0 = instance;
		synchronized (instance) {
			if (field936 == field8) {
				return false;
			} else {
				code = field3285[field8];
				ch = field2518[field8];
				field8 = field8 + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("qb.a(B)I")
	public static int getIdleTimer() {
		return field3586++;
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

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (instance != null) {
			field231 = -1;
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (instance != null) {
			field3586 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && var2 < field2120.length) {
				var3 = field2120[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (field231 >= 0 && var3 >= 0) {
				field55[field231] = ~var3;
				field231 = field231 + 1 & 0x7F;
				if (field231 == field2660) {
					field231 = -1;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		int var2 = method618(arg0);
		if (var2 >= 0) {
			int var3 = field1396 + 1 & 0x7F;
			if (field8 != var3) {
				field3285[field1396] = -1;
				field2518[field1396] = var2;
				field1396 = var3;
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (instance == null) {
			return;
		}
		field3586 = 0;
		int var2 = arg0.getKeyCode();
		int var3;
		if (var2 >= 0 && field2120.length > var2) {
			var3 = field2120[var2];
			if ((var3 & 0x80) != 0) {
				var3 = -1;
			}
		} else {
			var3 = -1;
		}
		if (field231 >= 0 && var3 >= 0) {
			field55[field231] = var3;
			field231 = field231 + 1 & 0x7F;
			if (field231 == field2660) {
				field231 = -1;
			}
		}
		if (var3 >= 0) {
			int var4 = field1396 + 1 & 0x7F;
			if (field8 != var4) {
				field3285[field1396] = var3;
				field2518[field1396] = -1;
				field1396 = var4;
			}
		}
		int var5 = arg0.getModifiers();
		if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
			arg0.consume();
		}
	}
}
