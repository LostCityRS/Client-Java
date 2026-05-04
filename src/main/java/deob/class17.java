package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public final class class17 implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("be.a")
	public static final class88 field250 = class208.method1423(105, "Neuer Benutzer");

	@ObfuscatedName("be.b")
	public static final class92 field251 = new class92(64);

	@ObfuscatedName("be.f")
	public static final boolean[] field255 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@ObfuscatedName("be.j")
	public static final class88 field259 = class208.method1423(105, "<col=00ffff>");

	@ObfuscatedName("be.k")
	public static final class88 field260 = class208.method1423(105, "mapscene");

	@ObfuscatedName("be.l")
	public static int field261 = 0;

	@ObfuscatedName("be.p")
	public static int field265 = 0;

	@ObfuscatedName("be.s")
	public static int[][] field268;

	@ObfuscatedName("be.v")
	public static final class88 field271 = class208.method1423(105, "Sie haben gerade eine andere Welt verlassen)3");

	@ObfuscatedName("be.w")
	public static final class88 field272 = class208.method1423(105, "scroll:");

	@ObfuscatedName("be.n")
	public static final class88 field263 = field272;

	@ObfuscatedName("be.r")
	public static class88 field267 = field272;

	@ObfuscatedName("be.y")
	public static class22 field274;

	@ObfuscatedName("be.B")
	public static boolean field277;

	@ObfuscatedName("be.a(BI)I")
	public static int method81(int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@ObfuscatedName("be.a(ILi;I)V")
	public static void method82(class88 arg0, int arg1) {
		class88 var2 = arg0.method611().method614();
		boolean var3 = false;
		for (int var4 = 0; var4 < class55.field1027; var4++) {
			class44 var5 = class244.field4491[class174.field3428[var4]];
			if (var5 != null && var5.field766 != null && var5.field766.method624(var2)) {
				class207.method1421(1, 0, var5.field4141[0], var5.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				var3 = true;
				if (arg1 == 1) {
					class146.field2747.method30(65);
					class146.field2747.method314(class174.field3428[var4]);
				} else if (arg1 == 4) {
					class146.field2747.method30(214);
					class146.field2747.method331(class174.field3428[var4]);
				} else if (arg1 == 6) {
					class146.field2747.method30(161);
					class146.field2747.method331(class174.field3428[var4]);
				} else if (arg1 == 7) {
					class146.field2747.method30(47);
					class146.field2747.method344(class174.field3428[var4]);
				}
				break;
			}
		}
		if (!var3) {
			class223.method1499(class166.method1140(new class88[] { class114.field2063, var2 }), 0, class174.field3453);
		}
	}

	@ObfuscatedName("be.a(IIZIII)V")
	public static void method83(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg4; var6 <= arg4 + arg2; var6++) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class111.field2020[arg0][var6][var5] = 127;
				}
			}
		}
		for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg4; var8 < arg2 + arg4; var8++) {
				if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
					class62.field1137[arg0][var8][var7] = arg0 <= 0 ? 0 : class62.field1137[arg0 - 1][var8][var7];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (int var9 = arg3 + 1; var9 < arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < 104) {
					class62.field1137[arg0][arg4][var9] = class62.field1137[arg0][arg4 - 1][var9];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (int var10 = arg4 + 1; var10 < arg2 + arg4; var10++) {
				if (var10 >= 0 && var10 < 104) {
					class62.field1137[arg0][var10][arg3] = class62.field1137[arg0][var10][arg3 - 1];
				}
			}
		}
		if (arg4 < 0 || arg3 < 0 || arg4 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 > 0 && class62.field1137[arg0][arg4 - 1][arg3] != 0) {
				class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4 - 1][arg3];
				return;
			}
			if (arg3 > 0 && class62.field1137[arg0][arg4][arg3 - 1] != 0) {
				class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4][arg3 - 1];
				return;
			}
			if (arg4 > 0 && arg3 > 0 && class62.field1137[arg0][arg4 - 1][arg3 - 1] != 0) {
				class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && class62.field1137[arg0 - 1][arg4 - 1][arg3] != class62.field1137[arg0][arg4 - 1][arg3]) {
			class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4 - 1][arg3];
			return;
		}
		if (arg3 > 0 && class62.field1137[arg0][arg4][arg3 - 1] != class62.field1137[arg0 - 1][arg4][arg3 - 1]) {
			class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4][arg3 - 1];
			return;
		}
		if (arg4 > 0 && arg3 > 0 && class62.field1137[arg0 - 1][arg4 - 1][arg3 - 1] != class62.field1137[arg0][arg4 - 1][arg3 - 1]) {
			class62.field1137[arg0][arg4][arg3] = class62.field1137[arg0][arg4 - 1][arg3 - 1];
			return;
		}
	}

	@ObfuscatedName("be.a(IIIZILnf;)V")
	public static void method84(int arg0, int arg1, int arg2, int arg3, class148 arg4) {
		class143 var5 = new class143();
		var5.field2638 = arg4.field2771 * 128;
		var5.field2635 = arg4.field2815;
		var5.field2647 = arg1;
		var5.field2629 = arg4.field2806;
		int var6 = arg4.field2774;
		var5.field2632 = arg3 * 128;
		var5.field2655 = arg0 * 128;
		var5.field2640 = arg4.field2795;
		var5.field2645 = arg4.field2807;
		int var7 = arg4.field2794;
		if (arg2 == 1 || arg2 == 3) {
			var7 = arg4.field2774;
			var6 = arg4.field2794;
		}
		var5.field2639 = (var6 + arg0) * 128;
		var5.field2630 = (arg3 + var7) * 128;
		if (arg4.field2770 != null) {
			var5.field2634 = arg4;
			var5.method938();
		}
		class66.field1196.method1622(var5);
		if (var5.field2635 != null) {
			var5.field2628 = var5.field2645 + (int) ((double) (var5.field2640 - var5.field2645) * Math.random());
		}
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class46.field833 = arg0.getX();
			class139.field2575 = arg0.getY();
			class186.field3631 = class206.method1418();
			if (arg0.isMetaDown()) {
				class158.field3044 = 2;
				class46.field807 = 2;
			} else {
				class158.field3044 = 1;
				class46.field807 = 1;
			}
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class43.field732 != null) {
			class46.field807 = 0;
		}
	}

	@Override
	public synchronized void mouseMoved(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class232.field4353 = arg0.getX();
			class170.field3297 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class232.field4353 = arg0.getX();
			class170.field3297 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class232.field4353 = arg0.getX();
			class170.field3297 = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class232.field4353 = -1;
			class170.field3297 = -1;
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (class43.field732 != null) {
			class190.field3668 = 0;
			class46.field807 = 0;
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
