package jagex3.client;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.graphics.*;
import jagex3.js5.Js5;
import jagex3.js5.Js5Net;
import jagex3.midi2.MidiManager;
import jagex3.util.JagString;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("uc.E")
	public static JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("uc.z")
	public static JagString loginMes3 = AUTO_EMPTY;
	@ObfuscatedName("uc.x")
	public static JagString loginMes1 = AUTO_EMPTY;
	@ObfuscatedName("uc.I")
	public static JagString loginUser = AUTO_EMPTY;
	@ObfuscatedName("ie.g")
	public static int loginscreen = 0;
	@ObfuscatedName("f.u")
	public static int[] flameLineOffset = new int[256];
	@ObfuscatedName("hd.Kb")
	public static int flameGradientCycle0 = 0;
	@ObfuscatedName("uc.s")
	public static JagString loginPass = AUTO_EMPTY;
    @ObfuscatedName("wb.H")
    public static int loadPos = 10;
	@ObfuscatedName("uc.Q")
	public static JagString loadString = AUTO_EMPTY;
	@ObfuscatedName("nd.y")
	public static int loginSelect = 0;
	@ObfuscatedName("pe.Ub")
	public static int flameGradientCycle1 = 0;
	@ObfuscatedName("ha.a")
	public static int flameCycle0 = 0;
	@ObfuscatedName("fa.fb")
	public static Pix32 imageFlamesRight;
	@ObfuscatedName("f.r")
	public static PixMap imageTitle5;
	@ObfuscatedName("ca.x")
	public static PixMap imageTitle0;
	@ObfuscatedName("wc.q")
	public static PixMap imageTitle8;
	@ObfuscatedName("gb.p")
	public static boolean open;
	@ObfuscatedName("hc.e")
	public static Pix8[] runes;
	@ObfuscatedName("ia.Sb")
	public static PixMap imageTitle7;
	@ObfuscatedName("j.jc")
	public static PixMap imageTitle1;
	@ObfuscatedName("na.g")
	public static PixMap imageTitle4;
	@ObfuscatedName("nc.j")
	public static PixMap imageTitle2;
	@ObfuscatedName("nc.u")
	public static Pix32 imageFlamesLeft;
	@ObfuscatedName("oa.z")
	public static int[] flameGradient;
	@ObfuscatedName("ae.f")
	public static int[] flameBuffer3;
	@ObfuscatedName("r.l")
	public static int[] flameBuffer0;
	@ObfuscatedName("ra.l")
	public static int[] flameGradient0;
	@ObfuscatedName("ra.t")
	public static PixMap imageTitle3;
	@ObfuscatedName("re.o")
	public static PixMap imageTitle6;
	@ObfuscatedName("t.ub")
	public static Pix8 titleBox;
	@ObfuscatedName("tb.bc")
	public static int[] flameGradient2;
	@ObfuscatedName("tb.ic")
	public static int[] flameBuffer2;
	@ObfuscatedName("tc.h")
	public static Pix8 titleBut;
	@ObfuscatedName("ua.A")
	public static int[] flameBuffer1;
	@ObfuscatedName("vb.Cb")
	public static int[] flameGradient1;
	@ObfuscatedName("uc.D")
	public static JagString AUTO_CHARLIST = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("uc.L")
	public static JagString charList = AUTO_CHARLIST;
	@ObfuscatedName("he.Qb")
	public static JagString AUTO_TITLEBOX = JagString.wrap("titlebox");
	@ObfuscatedName("hd.Fb")
	public static JagString field1204 = JagString.wrap("@yel@*V");
	@ObfuscatedName("la.K")
	public static JagString AUTO_SCAPE_MAIN = JagString.wrap("scape main");
	@ObfuscatedName("uc.O")
	public static JagString loginMes2 = AUTO_EMPTY;
	@ObfuscatedName("gb.j")
	public static JagString AUTO_TITLEBUTTON = JagString.wrap("titlebutton");
	@ObfuscatedName("ca.y")
	public static JagString AUTO_RUNES = JagString.wrap("runes");
	@ObfuscatedName("ld.E")
	public static JagString AUTO_TITLEJPG = JagString.wrap("title)3jpg");
	@ObfuscatedName("client.cb")
	public static JagString AUTO_LOGO = JagString.wrap("logo");

	@ObfuscatedName("td.d(I)V")
	public static void loop() {
		updateFlames();
		if (Client.state != 10) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickX - 202;
		int var1 = ClientMouseListener.mouseClickButton;
		int var2 = ClientMouseListener.mouseClickY - 171;
		if (loginscreen == 0) {
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 100 && var2 <= 140) {
				loginSelect = 0;
				loginscreen = 3;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 100 && var2 <= 140) {
				loginscreen = 2;
				loginSelect = 0;
				loginMes1 = Text.PLEASELOGIN1;
				loginMes2 = Text.PLEASELOGIN2;
				loginMes3 = Text.PLEASELOGIN3;
				return;
			}
			return;
		}
		if (loginscreen == 2) {
			byte var3 = 60;
			int var6 = var3 + 30;
			if (var1 == 1 && var2 >= 75 && var2 < 90) {
				loginSelect = 0;
			}
			var6 += 15;
			if (var1 == 1 && var2 >= 90 && var2 < 105) {
				loginSelect = 1;
			}
			var6 += 15;
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 130 && var2 <= 170) {
				loginUser = loginUser.getRepeatedCharacter().toRawUsername();
				loginMes(Text.CONNECTING3, Text.CONNECTING1, Text.CONNECTING2);
				Client.setMainState(20);
				return;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 130 && var2 <= 170) {
				loginUser = AUTO_EMPTY;
				loginPass = AUTO_EMPTY;
				loginscreen = 0;
			}
			while (true) {
				boolean var4;
				label138:
				do {
					while (ClientKeyboardListener.pollKey()) {
						var4 = false;
						for (int var5 = 0; var5 < charList.length(); var5++) {
							if (ClientKeyboardListener.ch == charList.charAt(var5)) {
								var4 = true;
								break;
							}
						}
						if (loginSelect != 0) {
							continue label138;
						}
						if (ClientKeyboardListener.code == 85 && loginUser.length() > 0) {
							loginUser = loginUser.substring(0, loginUser.length() - 1);
						}
						if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
							loginSelect = 1;
						}
						if (var4 && loginUser.length() < 12) {
							loginUser = loginUser.valueOf(ClientKeyboardListener.ch);
						}
					}
					return;
				} while (loginSelect != 1);
				if (ClientKeyboardListener.code == 85 && loginPass.length() > 0) {
					loginPass = loginPass.substring(0, loginPass.length() - 1);
				}
				if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
					loginSelect = 0;
				}
				if (var4 && loginPass.length() < 20) {
					loginPass = loginPass.valueOf(ClientKeyboardListener.ch);
				}
			}
		}
		if (loginscreen == 3 && var1 == 1 && var0 >= 105 && var0 <= 255 && var2 >= 130 && var2 <= 170) {
			loginscreen = 0;
		}
	}

	@ObfuscatedName("rd.a(ILbc;Lbc;)V")
	public static void draw(PixFont arg0, PixFont arg1) {
		imageTitle4.bind();
		if (Client.state == 0 || Client.state == 5) {
			arg0.centreString(Text.LOADING_TITLE, 180, 54, 16777215);
			Pix2D.drawRect(28, 62, 304, 34, 9179409);
			Pix2D.drawRect(29, 63, 302, 32, 0);
			Pix2D.fillRect(30, 64, loadPos * 3, 30, 9179409);
			Pix2D.fillRect(loadPos * 3 + 30, 64, 300 - loadPos * 3, 30, 0);
			arg0.centreString(loadString, 180, 85, 16777215);
		}
		if (Client.state == 20) {
			byte var2 = 40;
			titleBox.plotSprite(0, 0);
			arg0.centreString(loginMes1, 180, 40, 16776960, true);
			int var8 = var2 + 15;
			arg0.centreString(loginMes2, 180, 55, 16776960, true);
			int var9 = var8 + 15;
			arg0.centreString(loginMes3, 180, 70, 16776960, true);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg0.drawString(JagString.join(new JagString[]{Text.USERNAMEPROMPT, loginUser}), 90, 95, 16777215, true);
			int var13 = var11 + 15;
			arg0.drawString(JagString.join(new JagString[]{Text.PASSWORDPROMPT, loginPass.chars()}), 92, 110, 16777215, true);
			int var15 = var13 + 15;
		}
		if (Client.state == 10) {
			titleBox.plotSprite(0, 0);
			if (loginscreen == 0) {
				byte var5 = 80;
				arg0.centreString(Text.WELCOMETORUNESCAPE, 180, 80, 16776960, true);
				int var23 = var5 + 30;
				titleBut.plotSprite(27, 100);
				arg0.drawStringMultiline(Text.NEWUSER, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				titleBut.plotSprite(187, 100);
				arg0.drawStringMultiline(Text.EXISTINGUSER, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (loginscreen == 2) {
				byte var3 = 40;
				arg0.centreString(loginMes1, 180, 40, 16776960, true);
				int var12 = var3 + 15;
				arg0.centreString(loginMes2, 180, 55, 16776960, true);
				int var14 = var12 + 15;
				arg0.centreString(loginMes3, 180, 70, 16776960, true);
				int var16 = var14 + 15;
				int var17 = var16 + 10;
				arg0.drawString(JagString.join(new JagString[]{Text.USERNAMEPROMPT, loginUser, Client.loopCycle % 40 < 20 & loginSelect == 0 ? field1204 : AUTO_EMPTY}), 90, 95, 16777215, true);
				int var19 = var17 + 15;
				arg0.drawString(JagString.join(new JagString[]{Text.PASSWORDPROMPT, loginPass.chars(), Client.loopCycle % 40 < 20 & loginSelect == 1 ? field1204 : AUTO_EMPTY}), 92, 110, 16777215, true);
				titleBut.plotSprite(27, 130);
				int var21 = var19 + 15;
				arg0.centreString(Text.LOGIN, 100, 155, 16777215, true);
				titleBut.plotSprite(187, 130);
				arg0.centreString(Text.CANCEL, 260, 155, 16777215, true);
			} else if (loginscreen == 3) {
				arg0.centreString(Text.NEWUSER1, 180, 40, 16776960, true);
				byte var4 = 65;
				arg0.centreString(Text.NEWUSER2, 180, 65, 16777215, true);
				int var18 = var4 + 15;
				arg0.centreString(Text.NEWUSER3, 180, 80, 16777215, true);
				int var20 = var18 + 15;
				arg0.centreString(Text.NEWUSER4, 180, 95, 16777215, true);
				int var22 = var20 + 15;
				arg0.centreString(Text.NEWUSER5, 180, 110, 16777215, true);
				titleBut.plotSprite(107, 130);
				arg0.centreString(Text.CANCEL, 180, 155, 16777215, true);
				int var24 = var22 + 15;
			}
		}
		drawFlames();
		try {
			Graphics var6 = GameShell.canvas.getGraphics();
			imageTitle4.draw(202, var6, 171);
			imageTitle0.draw(0, var6, 0);
			imageTitle1.draw(637, var6, 0);
			if (GameShell.fullredraw) {
				GameShell.fullredraw = false;
				imageTitle2.draw(128, var6, 0);
				imageTitle3.draw(202, var6, 371);
				imageTitle5.draw(0, var6, 265);
				imageTitle6.draw(562, var6, 265);
				imageTitle7.draw(128, var6, 171);
				imageTitle8.draw(562, var6, 171);
			}
		} catch (Exception var7) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("m.a(La;La;La;B)V")
	public static void loginMes(JagString arg0, JagString arg1, JagString arg2) {
		loginMes3 = arg0;
		loginMes2 = arg2;
		loginMes1 = arg1;
	}

	@ObfuscatedName("je.a(Ljava/awt/Component;ZLbd;Lbd;)V")
	public static void open(Component arg0, Js5 arg1, Js5 arg2) {
		if (open) {
			return;
		}
		imageTitle0 = PixMap.createSafe(265, 128, arg0);
		Pix2D.cls();
		imageTitle1 = PixMap.createSafe(265, 128, arg0);
		Pix2D.cls();
		imageTitle2 = PixMap.createSafe(171, 509, arg0);
		Pix2D.cls();
		imageTitle3 = PixMap.createSafe(132, 360, arg0);
		Pix2D.cls();
		imageTitle4 = PixMap.createSafe(200, 360, arg0);
		Pix2D.cls();
		imageTitle5 = PixMap.createSafe(238, 202, arg0);
		Pix2D.cls();
		imageTitle6 = PixMap.createSafe(238, 203, arg0);
		Pix2D.cls();
		imageTitle7 = PixMap.createSafe(94, 74, arg0);
		Pix2D.cls();
		imageTitle8 = PixMap.createSafe(94, 75, arg0);
		Pix2D.cls();
		byte[] var3 = arg1.getFile(AUTO_EMPTY, AUTO_TITLEJPG);
		Pix32 var4 = new Pix32(var3, arg0);
		imageTitle0.bind();
		var4.quickPlotSprite(0, 0);
		imageTitle1.bind();
		var4.quickPlotSprite(-637, 0);
		imageTitle2.bind();
		var4.quickPlotSprite(-128, 0);
		imageTitle3.bind();
		var4.quickPlotSprite(-202, -371);
		imageTitle4.bind();
		var4.quickPlotSprite(-202, -171);
		imageTitle5.bind();
		var4.quickPlotSprite(0, -265);
		imageTitle6.bind();
		var4.quickPlotSprite(-562, -265);
		imageTitle7.bind();
		var4.quickPlotSprite(-128, -171);
		imageTitle8.bind();
		var4.quickPlotSprite(-562, -171);
		int[] var5 = new int[var4.wi];
		for (int var6 = 0; var6 < var4.hi; var6++) {
			for (int var7 = 0; var7 < var4.wi; var7++) {
				var5[var7] = var4.data[var4.wi * var6 + var4.wi - var7 - 1];
			}
			for (int var8 = 0; var8 < var4.wi; var8++) {
				var4.data[var4.wi * var6 + var8] = var5[var8];
			}
		}
		imageTitle0.bind();
		var4.quickPlotSprite(382, 0);
		imageTitle1.bind();
		var4.quickPlotSprite(-255, 0);
		imageTitle2.bind();
		var4.quickPlotSprite(254, 0);
		imageTitle3.bind();
		var4.quickPlotSprite(180, -371);
		imageTitle4.bind();
		var4.quickPlotSprite(180, -171);
		imageTitle5.bind();
		var4.quickPlotSprite(382, -265);
		imageTitle6.bind();
		var4.quickPlotSprite(-180, -265);
		imageTitle7.bind();
		var4.quickPlotSprite(254, -171);
		imageTitle8.bind();
		var4.quickPlotSprite(-180, -171);
		Pix32 var9 = PixLoader.makePix32(arg2, AUTO_LOGO, AUTO_EMPTY);
		imageTitle2.bind();
		var9.plotSprite(382 - var9.wi / 2 - 128, 18);
		titleBox = PixLoader.makePix8(AUTO_TITLEBOX, AUTO_EMPTY, arg2);
		titleBut = PixLoader.makePix8(AUTO_TITLEBUTTON, AUTO_EMPTY, arg2);
		runes = PixLoader.makePix8Array(arg2, AUTO_RUNES, AUTO_EMPTY);
		imageFlamesLeft = new Pix32(128, 265);
		imageFlamesRight = new Pix32(128, 265);
		for (int var10 = 0; var10 < 33920; var10++) {
			imageFlamesLeft.data[var10] = imageTitle0.data[var10];
		}
		for (int var11 = 0; var11 < 33920; var11++) {
			imageFlamesRight.data[var11] = imageTitle1.data[var11];
		}
		flameGradient0 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			flameGradient0[var12] = var12 * 262144;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			flameGradient0[var13 + 64] = var13 * 1024 + 16711680;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			flameGradient0[var14 + 128] = var14 * 4 + 16776960;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			flameGradient0[var15 + 192] = 16777215;
		}
		flameGradient1 = new int[256];
		for (int var16 = 0; var16 < 64; var16++) {
			flameGradient1[var16] = var16 * 1024;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			flameGradient1[var17 + 64] = var17 * 4 + 65280;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			flameGradient1[var18 + 128] = var18 * 262144 + 65535;
		}
		for (int var19 = 0; var19 < 64; var19++) {
			flameGradient1[var19 + 192] = 16777215;
		}
		flameGradient2 = new int[256];
		for (int var20 = 0; var20 < 64; var20++) {
			flameGradient2[var20] = var20 * 4;
		}
		for (int var21 = 0; var21 < 64; var21++) {
			flameGradient2[var21 + 64] = var21 * 262144 + 255;
		}
		for (int var22 = 0; var22 < 64; var22++) {
			flameGradient2[var22 + 128] = var22 * 1024 + 16711935;
		}
		for (int var23 = 0; var23 < 64; var23++) {
			flameGradient2[var23 + 192] = 16777215;
		}
		flameGradient = new int[256];
		flameBuffer1 = new int[32768];
		flameBuffer0 = new int[32768];
		generateFlameCoolingMap(null);
		flameBuffer2 = new int[32768];
		loginPass = AUTO_EMPTY;
		loginUser = AUTO_EMPTY;
		flameBuffer3 = new int[32768];
		loginscreen = 0;
		if (Client.midiVolume == 0 || Client.lowMem) {
			MidiManager.stopWithFade();
		} else {
			MidiManager.playNamed(Client.songs, AUTO_SCAPE_MAIN, AUTO_EMPTY, Client.midiVolume);
		}
		Js5Net.sendLoginLogoutPacket(false);
		GameShell.fullredraw = true;
		open = true;
	}

	@ObfuscatedName("na.b(B)V")
	public static void close() {
		if (!open) {
			return;
		}
		flameGradient0 = null;
		imageTitle1 = null;
		imageTitle8 = null;
		imageTitle3 = null;
		flameBuffer0 = null;
		flameBuffer2 = null;
		titleBut = null;
		flameBuffer1 = null;
		titleBox = null;
		flameGradient1 = null;
		imageTitle0 = null;
		imageTitle2 = null;
		imageTitle7 = null;
		imageFlamesLeft = null;
		runes = null;
		flameGradient2 = null;
		imageTitle4 = null;
		imageFlamesRight = null;
		flameBuffer3 = null;
		imageTitle6 = null;
		imageTitle5 = null;
		flameGradient = null;
		MidiManager.stopWithFade();
		Js5Net.sendLoginLogoutPacket(true);
		open = false;
	}

	@ObfuscatedName("jc.b(I)V")
	public static void updateFlames() {
		for (int var0 = 10; var0 < 117; var0++) {
			int var1 = (int) (Math.random() * 100.0D);
			if (var1 < 50) {
				flameBuffer3[var0 + 32512] = 255;
			}
		}
		for (int var2 = 0; var2 < 100; var2++) {
			int var3 = (int) (Math.random() * 124.0D) + 2;
			int var4 = (int) (Math.random() * 128.0D) + 128;
			int var5 = (var4 << 7) + var3;
			flameBuffer3[var5] = 192;
		}
		for (int var6 = 1; var6 < 255; var6++) {
			for (int var7 = 1; var7 < 127; var7++) {
				int var8 = var7 + (var6 << 7);
				flameBuffer2[var8] = (flameBuffer3[var8 - 1] + flameBuffer3[var8 + 1] + flameBuffer3[var8 + -128] + flameBuffer3[var8 + 128]) / 4;
			}
		}
		flameCycle0 += 128;
		if (flameCycle0 > flameBuffer0.length) {
			flameCycle0 -= flameBuffer0.length;
			int var9 = (int) (Math.random() * 12.0D);
			generateFlameCoolingMap(runes[var9]);
		}
		for (int var10 = 1; var10 < 255; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = (var10 << 7) + var11;
				int var13 = flameBuffer2[var12 + 128] - flameBuffer0[var12 + flameCycle0 & flameBuffer0.length + -1] / 5;
				if (var13 < 0) {
					var13 = 0;
				}
				flameBuffer3[var12] = var13;
			}
		}
		for (int var14 = 0; var14 < 255; var14++) {
			flameLineOffset[var14] = flameLineOffset[var14 + 1];
		}
		flameLineOffset[255] = (int) (Math.sin((double) Client.loopCycle / 14.0D) * 16.0D + Math.sin((double) Client.loopCycle / 15.0D) * 14.0D + Math.sin((double) Client.loopCycle / 16.0D) * 12.0D);
		if (flameGradientCycle0 > 0) {
			flameGradientCycle0 -= 4;
		}
		if (flameGradientCycle1 > 0) {
			flameGradientCycle1 -= 4;
		}
		if (flameGradientCycle0 == 0 && flameGradientCycle1 == 0) {
			int var15 = (int) (Math.random() * 2000.0D);
			if (var15 == 0) {
				flameGradientCycle0 = 1024;
			}
			if (var15 == 1) {
				flameGradientCycle1 = 1024;
			}
		}
	}

    @ObfuscatedName("client.g(I)V")
    public static void drawFlames() {
        if (flameGradientCycle0 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (flameGradientCycle0 > 768) {
                    flameGradient[var2] = merge(flameGradient0[var2], flameGradient1[var2], 1024 - flameGradientCycle0);
                } else if (flameGradientCycle0 > 256) {
                    flameGradient[var2] = flameGradient1[var2];
                } else {
                    flameGradient[var2] = merge(flameGradient1[var2], flameGradient0[var2], 256 - flameGradientCycle0);
                }
            }
        } else if (flameGradientCycle1 > 0) {
            for (int var0 = 0; var0 < 256; var0++) {
                if (flameGradientCycle1 > 768) {
                    flameGradient[var0] = merge(flameGradient0[var0], flameGradient2[var0], 1024 - flameGradientCycle1);
                } else if (flameGradientCycle1 > 256) {
                    flameGradient[var0] = flameGradient2[var0];
                } else {
                    flameGradient[var0] = merge(flameGradient2[var0], flameGradient0[var0], 256 - flameGradientCycle1);
                }
            }
        } else {
            for (int var1 = 0; var1 < 256; var1++) {
                flameGradient[var1] = flameGradient0[var1];
            }
        }
        for (int var3 = 0; var3 < 33920; var3++) {
            imageTitle0.data[var3] = imageFlamesLeft.data[var3];
        }
        int var4 = 0;
        int var5 = 1152;
        for (int var6 = 1; var6 < 255; var6++) {
            int var7 = (256 - var6) * flameLineOffset[var6] / 256;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = flameBuffer3[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var11 = 256 - var10;
                    int var13 = flameGradient[var10];
                    int var14 = imageTitle0.data[var5];
                    imageTitle0.data[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var11 & 0xFF0000) >> 8;
                }
            }
            var5 += var8;
        }
        int var15 = 1176;
        int var16 = 0;
        for (int var17 = 0; var17 < 33920; var17++) {
            imageTitle1.data[var17] = imageFlamesRight.data[var17];
        }
        for (int var18 = 1; var18 < 255; var18++) {
            int var19 = (256 - var18) * flameLineOffset[var18] / 256;
            int var20 = 103 - var19;
            int var21 = var15 + var19;
            for (int var22 = 0; var22 < var20; var22++) {
                int var23 = flameBuffer3[var16++];
                if (var23 == 0) {
                    var21++;
                } else {
                    int var25 = imageTitle1.data[var21];
                    int var26 = 256 - var23;
                    int var27 = flameGradient[var23];
                    imageTitle1.data[var21++] = ((var25 & 0xFF00) * var26 + (var27 & 0xFF00) * var23 & 0xFF0000) + ((var25 & 0xFF00FF) * var26 + (var27 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
                }
            }
            var15 = var21 + 128 - var20 - var19;
            var16 += 128 - var20;
        }
    }

	@ObfuscatedName("va.a(ILe;)V")
	public static void generateFlameCoolingMap(Pix8 arg0) {
		for (int var1 = 0; var1 < flameBuffer0.length; var1++) {
			flameBuffer0[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			flameBuffer0[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					flameBuffer1[var7] = (flameBuffer0[var7 + 1] + flameBuffer0[var7 + 128] + flameBuffer0[var7 - 128] + flameBuffer0[var7 + -1]) / 4;
				}
			}
			int[] var8 = flameBuffer0;
			flameBuffer0 = flameBuffer1;
			flameBuffer1 = var8;
		}
		if (arg0 != null) {
			int var9 = 0;
			for (int var10 = 0; var10 < arg0.hi; var10++) {
				for (int var11 = 0; var11 < arg0.wi; var11++) {
					if (arg0.data[var9++] != 0) {
						int var12 = arg0.yof + var10 + 16;
						int var13 = var11 + arg0.xof + 16;
						int var14 = (var12 << 7) + var13;
						flameBuffer0[var14] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("td.a(Lbd;Lbd;I)I")
	public static int ready(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg0.requestDownload(AUTO_TITLEJPG, AUTO_EMPTY)) {
			var2++;
		}
		if (arg1.requestDownload(AUTO_LOGO, AUTO_EMPTY)) {
			var2++;
		}
		if (arg1.requestDownload(AUTO_TITLEBOX, AUTO_EMPTY)) {
			var2++;
		}
		if (arg1.requestDownload(AUTO_TITLEBUTTON, AUTO_EMPTY)) {
			var2++;
		}
		if (arg1.requestDownload(AUTO_RUNES, AUTO_EMPTY)) {
			var2++;
		}
		return var2;
	}

	@ObfuscatedName("gb.c(B)I")
	public static int readyMax() {
		return 5;
	}

	@ObfuscatedName("md.a(BIII)I")
	public static int merge(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}
}
