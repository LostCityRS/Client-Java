package jagex3.client;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

@ObfuscatedName("re")
public final class ClientKeyboardListener implements KeyListener, FocusListener {

	@ObfuscatedName("tc.m")
	public static ClientKeyboardListener instance = new ClientKeyboardListener();
	@ObfuscatedName("ia.lc")
	public static int keyHeldReadPos = 0;
	@ObfuscatedName("qc.f")
	public static volatile int idleTimer = 0;
	@ObfuscatedName("wa.y")
	public static int[] KEY_CODE_MAP = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	@ObfuscatedName("a.Z")
	public static int[] keyHeldBuffer = new int[128];
	@ObfuscatedName("pe.Fb")
	public static int keyWritePos = 0;
	@ObfuscatedName("tc.j")
	public static int keyReadPos = 0;
	@ObfuscatedName("jc.sb")
	public static int[] keyCodeBuffer = new int[128];
	@ObfuscatedName("rb.Eb")
	public static int[] keyChBuffer = new int[128];
	@ObfuscatedName("va.rb")
	public static int keyHeldWritePos = 0;
    @ObfuscatedName("rc.d")
    public static int lastKeyWritePos = 0;
	@ObfuscatedName("je.Qb")
	public static boolean[] keyHeld = new boolean[112];
	@ObfuscatedName("ta.zc")
	public static int code;
	@ObfuscatedName("tc.i")
	public static int ch;

	@ObfuscatedName("ta.b(B)V")
	public static void shutdown() {
		if (instance != null) {
			ClientKeyboardListener var0 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@ObfuscatedName("ua.b(I)V")
	public static void setupKeyCodeMap() {
		if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KEY_CODE_MAP[186] = 57;
			KEY_CODE_MAP[187] = 27;
			KEY_CODE_MAP[188] = 71;
			KEY_CODE_MAP[189] = 26;
			KEY_CODE_MAP[190] = 72;
			KEY_CODE_MAP[191] = 73;
			KEY_CODE_MAP[192] = 58;
			KEY_CODE_MAP[219] = 42;
			KEY_CODE_MAP[220] = 74;
			KEY_CODE_MAP[221] = 43;
			KEY_CODE_MAP[222] = 59;
			KEY_CODE_MAP[223] = 28;
		} else {
			KEY_CODE_MAP[44] = 71;
			KEY_CODE_MAP[45] = 26;
			KEY_CODE_MAP[46] = 72;
			KEY_CODE_MAP[47] = 73;
			KEY_CODE_MAP[59] = 57;
			KEY_CODE_MAP[61] = 27;
			KEY_CODE_MAP[91] = 42;
			KEY_CODE_MAP[92] = 74;
			KEY_CODE_MAP[93] = 43;
			if (SignLink.setFocusTraversalKeysEnabled == null) {
				KEY_CODE_MAP[192] = 58;
				KEY_CODE_MAP[222] = 59;
			} else {
				KEY_CODE_MAP[192] = 28;
				KEY_CODE_MAP[222] = 58;
				KEY_CODE_MAP[520] = 59;
			}
		}
	}

	@ObfuscatedName("ga.a(BLjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeKeyListener(instance);
		arg0.removeFocusListener(instance);
	}

	@ObfuscatedName("qd.a(Ljava/awt/Component;I)V")
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

	@ObfuscatedName("qd.f(I)V")
	public static void loop() {
		ClientKeyboardListener var0 = instance;
		synchronized (instance) {
			keyReadPos = lastKeyWritePos;
			if (keyHeldReadPos < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					keyHeld[var1] = false;
				}
				keyHeldReadPos = keyHeldWritePos;
			} else {
				while (keyHeldReadPos != keyHeldWritePos) {
					int var2 = keyHeldBuffer[keyHeldWritePos];
					keyHeldWritePos = keyHeldWritePos + 1 & 0x7F;
					if (var2 < 0) {
						keyHeld[~var2] = false;
					} else {
						keyHeld[var2] = true;
					}
				}
			}
			lastKeyWritePos = keyWritePos;
		}
	}

	@ObfuscatedName("mb.a(B)Z")
	public static boolean pollKey() {
		ClientKeyboardListener var0 = instance;
		synchronized (instance) {
			if (keyReadPos == lastKeyWritePos) {
				return false;
			} else {
				code = keyCodeBuffer[keyReadPos];
				ch = keyChBuffer[keyReadPos];
				keyReadPos = keyReadPos + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("f.a(Z)I")
	public static int getIdleTimer() {
		return idleTimer++;
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
		if (instance != null) {
			keyHeldReadPos = -1;
		}
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && var2 < KEY_CODE_MAP.length) {
				var3 = KEY_CODE_MAP[var2];
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
			if (keyHeldReadPos >= 0 && var3 >= 0) {
				keyHeldBuffer[keyHeldReadPos] = var3;
				keyHeldReadPos = keyHeldReadPos + 1 & 0x7F;
				if (keyHeldReadPos == keyHeldWritePos) {
					keyHeldReadPos = -1;
				}
			}
			if (var3 >= 0 || var4 >= 0) {
				int var5 = keyWritePos + 1 & 0x7F;
				if (keyReadPos != var5) {
					keyCodeBuffer[keyWritePos] = var3;
					keyChBuffer[keyWritePos] = var4;
					keyWritePos = var5;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && KEY_CODE_MAP.length > var2) {
				var3 = KEY_CODE_MAP[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (keyHeldReadPos >= 0 && var3 >= 0) {
				keyHeldBuffer[keyHeldReadPos] = ~var3;
				keyHeldReadPos = keyHeldReadPos + 1 & 0x7F;
				if (keyHeldReadPos == keyHeldWritePos) {
					keyHeldReadPos = -1;
				}
			}
		}
		arg0.consume();
	}
}
