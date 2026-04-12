package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.config.LocType;
import jagex3.dash3d.ClientLocAnim;
import jagex3.dash3d.CollisionMap;
import jagex3.dash3d.ModelSource;
import jagex3.dash3d.World;
import jagex3.graphics.PixMap;
import jagex3.util.JagString;
import jagex3.util.ThreadUtil;
import jagex3.util.Timer;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;

@ObfuscatedName("kd")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("nc.o")
	public static final int field2049 = 20;
	@ObfuscatedName("kd.b")
	public static int[] field1599 = new int[5];

	@ObfuscatedName("kd.d")
	public static long[] field1601 = new long[32];
	@ObfuscatedName("dc.lb")
	public static int mindel = 1;
	@ObfuscatedName("gb.y")
	public static SignLink signlink;
	@ObfuscatedName("ac.Y")
	public static PixMap field187;
	@ObfuscatedName("ld.A")
	public static Timer field1747;
	@ObfuscatedName("bd.i")
	public static long field369 = 0L;
	@ObfuscatedName("dc.hb")
	public static int field681;
	@ObfuscatedName("pe.Mb")
	public static int field2372;
	@ObfuscatedName("dd.k")
	public static int field711;
	@ObfuscatedName("ub.w")
	public static Canvas canvas;
	@ObfuscatedName("fe.Oc")
	public static boolean field972 = false;
	@ObfuscatedName("mc.n")
	public static Frame frame;
	@ObfuscatedName("ae.g")
	public static GameShell shell = null;
	@ObfuscatedName("qa.Fb")
	public static volatile boolean field2402 = true;
	@ObfuscatedName("wb.b")
	public static volatile boolean canvasReplaceRecommended = false;
	@ObfuscatedName("rc.e")
	public static volatile boolean field2631 = true;
	@ObfuscatedName("nc.d")
	public static int field2038;
	@ObfuscatedName("la.b")
	public static int field1656;
	@ObfuscatedName("rc.i")
	public static int field2635 = 0;
	@ObfuscatedName("nd.p")
	public static int field2075 = 500;
	@ObfuscatedName("wb.O")
	public static long[] field3281 = new long[32];
	@ObfuscatedName("ub.v")
	public static int field3048;
	@ObfuscatedName("i.w")
	public static boolean field1277;
	@ObfuscatedName("ae.b")
	public static volatile long field225 = 0L;

	@ObfuscatedName("kd.Q")
	public boolean field1640 = false;

	@ObfuscatedName("j.a(ILjava/awt/Color;La;I)V")
	public static void drawProgress(int arg0, Color arg1, JagString arg2) {
		try {
			Graphics var3 = canvas.getGraphics();
			if (Statics.field842 == null) {
				Statics.field842 = new Font("Helvetica", 1, 13);
				Statics.field469 = canvas.getFontMetrics(Statics.field842);
			}
			if (field2402) {
				field2402 = false;
				var3.setColor(Color.black);
				var3.fillRect(0, 0, field711, field2372);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Statics.field1397 == null) {
					Statics.field1397 = canvas.createImage(304, 34);
				}
				Graphics var4 = Statics.field1397.getGraphics();
				var4.setColor(arg1);
				var4.drawRect(0, 0, 303, 33);
				var4.fillRect(2, 2, arg0 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(1, 1, 301, 31);
				var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				var4.setFont(Statics.field842);
				var4.setColor(Color.white);
				arg2.method16((304 - arg2.method24(Statics.field469)) / 2, 22, var4);
				var3.drawImage(Statics.field1397, field711 / 2 - 152, field2372 / 2 + -18, null);
			} catch (Exception var7) {
				int var5 = field711 / 2 - 152;
				int var6 = field2372 / 2 - 18;
				var3.setColor(arg1);
				var3.drawRect(var5, var6, 303, 33);
				var3.fillRect(var5 + 2, var6 - -2, arg0 * 3, 30);
				var3.setColor(Color.black);
				var3.drawRect(var5 + 1, var6 + 1, 301, 31);
				var3.fillRect(arg0 * 3 + var5 + 2, var6 + 2, 300 - arg0 * 3, 30);
				var3.setFont(Statics.field842);
				var3.setColor(Color.white);
				arg2.method16((304 - arg2.method24(Statics.field469)) / 2 + var5, var6 + 22, var3);
			}
		} catch (Exception var8) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("td.c(I)V")
	public static void doneslowupdate() {
		field1747.init();
		for (int var0 = 0; var0 < 32; var0++) {
			field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field3281[var1] = 0L;
		}
		field681 = 0;
	}

	@ObfuscatedName("cc.a(Lad;IIIILab;IIII)V")
	public static void method270(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, World arg5, int arg6, int arg7, int arg8) {
		int var9 = ClientBuild.groundh[arg2][arg8][arg7];
		int var10 = ClientBuild.groundh[arg2][arg8 + 1][arg7];
		int var11 = ClientBuild.groundh[arg2][arg8][arg7 + 1];
		int var12 = ClientBuild.groundh[arg2][arg8 + 1][arg7 + 1];
		LocType var13 = LocType.method389(arg1);
		int var14 = var9 + var11 + var10 + var12 >> 2;
		int var15 = (arg6 << 6) + arg4;
		int var16 = arg8 + (arg7 << 7) + (arg1 << 14) + 1073741824;
		if (var13.field1329 == 0) {
			var16 += Integer.MIN_VALUE;
		}
		if (var13.field1316 == 1) {
			var15 += 256;
		}
		if (arg4 == 22) {
			ModelSource var17;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var17 = var13.method505(var12, var11, arg6, var9, 22, var10);
			} else {
				var17 = new ClientLocAnim(arg1, 22, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method88(arg3, arg8, arg7, var14, var17, var16, var15);
			if (var13.field1284 && var13.field1329 == 1) {
				arg0.method115(arg7, arg8);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var18;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var18 = var13.method505(var12, var11, arg6, var9, 10, var10);
			} else {
				var18 = new ClientLocAnim(arg1, 10, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			if (var18 != null) {
				int var19;
				int var20;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var13.field1286;
					var19 = var13.field1298;
				} else {
					var19 = var13.field1286;
					var20 = var13.field1298;
				}
				int var21 = 0;
				if (arg4 == 11) {
					var21 += 256;
				}
				arg5.method93(arg3, arg8, arg7, var14, var19, var20, var18, var21, var16, var15);
			}
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else if (arg4 >= 12) {
			ModelSource var22;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var22 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var22 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method93(arg3, arg8, arg7, var14, 1, 1, var22, 0, var16, var15);
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else if (arg4 == 0) {
			ModelSource var23;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var23 = var13.method505(var12, var11, arg6, var9, 0, var10);
			} else {
				var23 = new ClientLocAnim(arg1, 0, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var23, null, ClientBuild.field1740[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 1) {
			ModelSource var24;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var24 = var13.method505(var12, var11, arg6, var9, 1, var10);
			} else {
				var24 = new ClientLocAnim(arg1, 1, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var24, null, ClientBuild.field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 2) {
			int var25 = arg6 + 1 & 0x3;
			ModelSource var26;
			ModelSource var27;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var26 = var13.method505(var12, var11, arg6 + 4, var9, 2, var10);
				var27 = var13.method505(var12, var11, var25, var9, 2, var10);
			} else {
				var26 = new ClientLocAnim(arg1, 2, arg6 + 4, var9, var10, var12, var11, var13.field1289, true);
				var27 = new ClientLocAnim(arg1, 2, var25, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var26, var27, ClientBuild.field1740[arg6], ClientBuild.field1740[var25], var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 3) {
			ModelSource var28;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var28 = var13.method505(var12, var11, arg6, var9, 3, var10);
			} else {
				var28 = new ClientLocAnim(arg1, 3, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var28, null, ClientBuild.field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 9) {
			ModelSource var29;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var29 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var29 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method93(arg3, arg8, arg7, var14, 1, 1, var29, 0, var16, var15);
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else {
			if (var13.field1313) {
				if (arg6 == 1) {
					int var33 = var11;
					var11 = var12;
					var12 = var10;
					var10 = var9;
					var9 = var33;
				} else if (arg6 == 2) {
					int var31 = var11;
					var11 = var10;
					var10 = var31;
					int var32 = var12;
					var12 = var9;
					var9 = var32;
				} else if (arg6 == 3) {
					int var30 = var11;
					var11 = var9;
					var9 = var10;
					var10 = var12;
					var12 = var30;
				}
			}
			if (arg4 == 4) {
				ModelSource var34;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var34 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var34 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var34, ClientBuild.field1740[arg6], arg6 * 512, 0, 0, var16, var15);
			} else if (arg4 == 5) {
				int var35 = 16;
				int var36 = arg5.method78(arg3, arg8, arg7);
				if (var36 > 0) {
					var35 = LocType.method389(var36 >> 14 & 0x7FFF).field1288;
				}
				ModelSource var37;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var37 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var37 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var37, ClientBuild.field1740[arg6], arg6 * 512, ClientBuild.field1595[arg6] * var35, ClientBuild.field181[arg6] * var35, var16, var15);
			} else if (arg4 == 6) {
				ModelSource var38;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var38 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var38 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var38, 256, arg6, 0, 0, var16, var15);
			} else if (arg4 == 7) {
				ModelSource var39;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var39 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var39 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var39, 512, arg6, 0, 0, var16, var15);
			} else if (arg4 == 8) {
				ModelSource var40;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var40 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var40 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var40, 768, arg6, 0, 0, var16, var15);
			}
		}
	}

	@ObfuscatedName("ha.b(I)V")
	public static void doneslowupdate2() {
		field1747.reset();
		for (int var0 = 0; var0 < 32; var0++) {
			field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field3281[var1] = 0L;
		}
		field681 = 0;
	}

	@Override
	public final void run() {
		try {
			if (SignLink.javaVendor != null) {
				String var1 = SignLink.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = SignLink.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					mindel = 5;
				} else if (var1.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			if (signlink.applet != null) {
				Method var3 = SignLink.field1703;
				if (var3 != null) {
					try {
						var3.invoke(signlink.applet, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
			}
			this.addCanvas();
			field187 = PixMap.method875(field2372, field711, canvas);
			this.method290();
			field1747 = Timer.create();
			field1747.init();
			while (field369 == 0L || Statics.currentTime() < field369) {
				field681 = field1747.count(field2049, mindel);
				for (int var4 = 0; var4 < field681; var4++) {
					this.method625();
				}
				this.method622();
			}
		} catch (Exception var7) {
			JagException.report(null, var7);
			this.error("crash");
		}
		this.method615();
	}

	@ObfuscatedName("kd.b(I)V")
	public synchronized void method615() {
		if (field972) {
			return;
		}
		field972 = true;
		try {
			canvas.removeFocusListener(this);
		} catch (Exception var4) {
		}
		try {
			this.method286();
		} catch (Exception var3) {
		}
		if (frame != null) {
			try {
				System.exit(0);
			} catch (Throwable var2) {
			}
		}
		if (signlink != null) {
			try {
				signlink.method647();
			} catch (Exception var1) {
			}
		}
		this.method288();
	}

	@Override
	public final void stop() {
		if (shell == this && !field972) {
			field369 = Statics.currentTime() + 4000L;
		}
	}

	@ObfuscatedName("kd.c(I)Z")
	public final boolean method619() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (var1.endsWith("jagex.com")) {
			return true;
		} else if (var1.endsWith("runescape.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}
			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.error("invalidhost");
				return false;
			}
		}
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.a(BLjava/lang/String;)V")
	public final void error(String arg0) {
		if (this.field1640) {
			return;
		}
		this.field1640 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (Exception var2) {
		}
	}

	@Override
	public final void start() {
		if (shell == this && !field972) {
			field369 = 0L;
		}
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		field2631 = false;
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (shell != this || field972) {
			return;
		}
		field2402 = true;
		if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.5") && Statics.currentTime() - field225 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || field711 <= var2.width && var2.height >= field2372) {
				canvasReplaceRecommended = true;
			}
		}
	}

	@Override
	public final void destroy() {
		if (shell == this && !field972) {
			field369 = Statics.currentTime();
			ThreadUtil.sleepPrecise(5000L);
			JagException.signlink = null;
			this.method615();
		}
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		field2631 = true;
		field2402 = true;
	}

	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.a(BIIII)V")
	public final void method621(int arg0) {
		try {
			if (shell != null) {
				this.error("alreadyloaded");
				return;
			}
			field711 = 765;
			field2038 = 435;
			field2372 = 503;
			shell = this;
			if (signlink == null) {
				JagException.signlink = signlink = new SignLink(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
			}
			signlink.method656(1, this);
		} catch (Exception var3) {
			JagException.report(null, var3);
			this.error("crash");
		}
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	public static void providesignlink(SignLink arg0) {
		signlink = arg0;
		JagException.signlink = arg0;
	}

	@ObfuscatedName("kd.a(B)V")
	public void method622() {
		long var1 = Statics.currentTime();
		long var3 = field1601[field1656];
		field1601[field1656] = var1;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			field2635 = ((var5 >> 1) + 32000) / var5;
		}
		field1656 = field1656 + 1 & 0x1F;
		if (field2075++ > 50) {
			field2075 -= 50;
			field2402 = true;
			canvas.setSize(field711, field2372);
			canvas.setVisible(true);
			if (frame == null) {
				canvas.setLocation(0, 0);
			} else {
				Insets var6 = frame.getInsets();
				canvas.setLocation(var6.left, var6.top);
			}
		}
		this.method283();
	}

	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.b(Z)V")
	public void method625() {
		long var1 = Statics.currentTime();
		long var3 = field3281[field3048];
		boolean var10000;
		if (var3 == 0L || var1 <= var3) {
			var10000 = false;
		} else {
			var10000 = true;
		}
		field3281[field3048] = var1;
		field3048 = field3048 + 1 & 0x1F;
		synchronized (this) {
			field1277 = field2631;
		}
		this.mainloop();
	}

	@ObfuscatedName("kd.a(Ljava/lang/String;IIIILjava/net/InetAddress;II)V")
	public final void method626(String arg0, int arg1, int arg2, int arg3, InetAddress arg4, int arg5, int arg6) {
		try {
			field2038 = arg5;
			field711 = arg6;
			shell = this;
			field2372 = arg2;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(false);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			Insets var8 = frame.getInsets();
			frame.setSize(arg6 + var8.left + var8.right, var8.top + var8.bottom + arg2);
			JagException.signlink = signlink = new SignLink(true, null, arg4, arg3, arg0, arg1);
			signlink.method656(1, this);
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@Override
	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final String getParameter(String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.b(B)V")
	public final synchronized void addCanvas() {
		Container var1;
		if (frame == null) {
			var1 = signlink.applet;
		} else {
			var1 = frame;
		}
		if (canvas != null) {
			canvas.removeFocusListener(this);
			var1.remove(canvas);
		}
		canvas = new GameCanvas(this);
		var1.add(canvas);
		canvas.setSize(field711, field2372);
		canvas.setVisible(true);
		if (frame == null) {
			canvas.setLocation(0, 0);
		} else {
			Insets var2 = frame.getInsets();
			canvas.setLocation(var2.left, var2.top);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		field2402 = true;
		canvasReplaceRecommended = false;
		field225 = Statics.currentTime();
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.a(I)V")
	public abstract void method288();

	public abstract void init();

	@ObfuscatedName("kd.d(I)V")
	public abstract void mainloop();

	@ObfuscatedName("kd.e(I)V")
	public abstract void method286();

	@ObfuscatedName("kd.c(Z)V")
	public abstract void method290();

	@ObfuscatedName("kd.f(I)V")
	public abstract void method283();
}
