package jagex3.client;

import deob.ObfuscatedName;
import jagex3.client.input.keyboard.ClientKeyboardListener;
import jagex3.client.input.mouse.ClientMouseListener;
import jagex3.constants.Text;
import jagex3.graphics.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.js5.Js5Net;
import jagex3.midi2.MidiManager;
import jagex3.util.JagString;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("b.k")
	public static int loadPos = 10;
	@ObfuscatedName("ke.m")
	public static JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("ke.s")
	public static JagString loginMes1 = AUTO_EMPTY;
	@ObfuscatedName("ke.p")
	public static JagString loginUser = AUTO_EMPTY;
	@ObfuscatedName("ke.h")
	public static JagString loadString = AUTO_EMPTY;
	@ObfuscatedName("ke.g")
	public static JagString loginMes2 = AUTO_EMPTY;
	@ObfuscatedName("ke.e")
	public static JagString loginMes3 = AUTO_EMPTY;
	@ObfuscatedName("ke.c")
	public static JagString loginPass = AUTO_EMPTY;
	@ObfuscatedName("wc.k")
	public static Pix8 slButton;
	@ObfuscatedName("le.B")
	public static HTTPRequest gameworldListDownloadRequest;
	@ObfuscatedName("jd.nb")
	public static int flameCycle = 0;
	@ObfuscatedName("uc.x")
	public static JagString AUTO_SLRWS = JagString.wrap(")4slr)3ws?order=LPWM");
	@ObfuscatedName("qf.p")
	public static boolean switchScreen = false;
	@ObfuscatedName("o.Fb")
	public static WorldEntry[] list;
	@ObfuscatedName("te.s")
	public static int slLastWorld = -1;
	@ObfuscatedName("oc.f")
	public static Pix32 titleBack;
	@ObfuscatedName("gb.f")
	public static Pix32 titleBack2;
	@ObfuscatedName("oa.J")
	public static Pix8 logo;
	@ObfuscatedName("ea.n")
	public static boolean mute = false;
	@ObfuscatedName("kd.s")
	public static JagString AUTO_SCAPE_MAIN = JagString.wrap("scape main");
	@ObfuscatedName("bc.s")
	public static int loginscreen = 0;
	@ObfuscatedName("tc.d")
	public static int loginSelect = 0;
	@ObfuscatedName("na.x")
	public static JagString AUTO_CHARLIST = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("na.i")
	public static JagString charList = AUTO_CHARLIST;
	@ObfuscatedName("ac.ab")
	public static Pix8 titleBox;
	@ObfuscatedName("ld.p")
	public static Pix8 titleBut;
	@ObfuscatedName("bf.k")
	public static Pix8[] titleMute;
	@ObfuscatedName("qf.N")
	public static JagString AUTO_SLBUTTON = JagString.wrap("sl_button");
	@ObfuscatedName("td.pb")
	public static boolean open;
	@ObfuscatedName("ke.q")
	public static Pix8[] runes;
	@ObfuscatedName("nd.j")
	public static int[] flameGradient0;
	@ObfuscatedName("ta.Eb")
	public static int[] flameGradient1;
	@ObfuscatedName("rf.i")
	public static int[] flameGradient2;
	@ObfuscatedName("ad.q")
	public static int[] flameBuffer0;
	@ObfuscatedName("ba.b")
	public static int[] flameBuffer1;
	@ObfuscatedName("ja.c")
	public static int[] flameGradient;
	@ObfuscatedName("g.J")
	public static int[] flameBuffer2;
	@ObfuscatedName("ab.p")
	public static int[] flameBuffer3;
	@ObfuscatedName("le.x")
	public static int[] flameLineOffset = new int[256];
	@ObfuscatedName("qd.qc")
	public static JagString AUTO_TITLEBUTTON = JagString.wrap("titlebutton");
	@ObfuscatedName("ec.o")
	public static JagString AUTO_LOGO = JagString.wrap("logo");
	@ObfuscatedName("fe.F")
	public static Pix8[] slArrows;
	@ObfuscatedName("jf.e")
	public static JagString AUTO_TITLEBOX = JagString.wrap("titlebox");
	@ObfuscatedName("ga.Fb")
	public static JagString AUTO_FULLDOMAIN = JagString.wrap("http:)4)4www)3runescape)3com");
	@ObfuscatedName("wa.r")
	public static int[] ordering = new int[] { 0, 1, 2, 3 };
	@ObfuscatedName("oa.L")
	public static int[] dirs = new int[] { 1, 1, 1, 1 };
	@ObfuscatedName("kf.d")
	public static int num = 0;
	@ObfuscatedName("sf.d")
	public static JagString AUTO_MN = JagString.wrap("mn");
	@ObfuscatedName("sc.cb")
	public static JagString AUTO_JOLT = JagString.wrap("jolt");
	@ObfuscatedName("ra.f")
	public static JagString AUTO_NAV = JagString.wrap("nav");
	@ObfuscatedName("vc.U")
	public static JagString AUTO_JLV = JagString.wrap("jlv");
	@ObfuscatedName("fb.T")
	public static JagString AUTO_AU = JagString.wrap("au");
	@ObfuscatedName("he.h")
	public static JagString AUTO_AMS = JagString.wrap("ams");
	@ObfuscatedName("ab.t")
	public static JagString AUTO_ME = JagString.wrap("me");
	@ObfuscatedName("tc.f")
	public static JagString AUTO_SWE = JagString.wrap("swe");
	@ObfuscatedName("wd.o")
	public static JagString AUTO_HEL = JagString.wrap("hel");
	@ObfuscatedName("nb.t")
	public static JagString AUTO_INPUT = JagString.wrap("<col=ffff00>*V");
	@ObfuscatedName("la.I")
	public static JagString AUTO_SPACE = JagString.wrap(" ");
	@ObfuscatedName("lf.B")
	public static JagString AUTO_TITLEJPG = JagString.wrap("title)3jpg");
	@ObfuscatedName("kb.l")
	public static JagString AUTO_RUNES = JagString.wrap("runes");
	@ObfuscatedName("pa.t")
	public static JagString AUTO_TITLEMUTE = JagString.wrap("title_mute");
	@ObfuscatedName("wc.b")
	public static Pix8[] slStars;
	@ObfuscatedName("ka.dd")
	public static Pix32[] slBack;
	@ObfuscatedName("he.a")
	public static Pix8[] slFlags;
	@ObfuscatedName("kb.A")
	public static JagString AUTO_SLBACK = JagString.wrap("sl_back");
	@ObfuscatedName("jc.R")
	public static JagString AUTO_SLFLAGS = JagString.wrap("sl_flags");
	@ObfuscatedName("ja.p")
	public static JagString AUTO_SLARROWS = JagString.wrap("sl_arrows");
	@ObfuscatedName("q.Tc")
	public static JagString AUTO_SLSTARS = JagString.wrap("sl_stars");
	@ObfuscatedName("jb.p")
	public static JagString AUTO_DOMAIN = JagString.wrap(")3runescape)3com");
	@ObfuscatedName("wa.J")
	public static JagString AUTO_PROTOCOL = JagString.wrap("http:)4)4");
	@ObfuscatedName("vc.jb")
	public static int flameCycle0 = 0;
	@ObfuscatedName("mb.s")
	public static int flameGradientCycle1 = 0;
	@ObfuscatedName("jd.Cb")
	public static int flameGradientCycle0 = 0;
	@ObfuscatedName("u.P")
	public static int loopCycle = 0;
	@ObfuscatedName("hd.lb")
	public static int flameSparks = 0;
	@ObfuscatedName("ve.e")
	public static JagString AUTO_ANDL = JagString.wrap(")4l");
	@ObfuscatedName("ja.f")
	public static JagString AUTO_ANDP = JagString.wrap(")1p");
	@ObfuscatedName("c.x")
	public static JagString AUTO_ANDJS = JagString.wrap(")1j");

	@ObfuscatedName("da.a(BLlf;)V")
	public static void loop(GameShell arg0) {
		if (switchScreen) {
			worldSwitchLoop(arg0);
			return;
		}
		if (ClientMouseListener.mouseClickButton == 1 && ClientMouseListener.mouseClickX >= 715 && ClientMouseListener.mouseClickY >= 453) {
			mute = !mute;
			if (mute) {
				MidiManager.stop();
			} else {
				MidiManager.play(AUTO_EMPTY, Client.songs, AUTO_SCAPE_MAIN);
			}
		}
		if (Client.state == 5) {
			return;
		}
		flameCycle++;
		if (Client.state != 10) {
			return;
		}
		if (Client.plug != 2 && Client.lang == 0) {
			if (ClientMouseListener.mouseClickButton == 1 && ClientMouseListener.mouseClickX >= 5 && ClientMouseListener.mouseClickX <= 105 && ClientMouseListener.mouseClickY >= 463 && ClientMouseListener.mouseClickY <= 498) {
				listFetch();
				return;
			}
			if (gameworldListDownloadRequest != null) {
				listFetch();
			}
		}
		int var1 = ClientMouseListener.mouseClickButton;
		int var2 = ClientMouseListener.mouseClickY;
		int var3 = ClientMouseListener.mouseClickX;
		if (loginscreen == 0) {
			if (var1 == 1 && var3 >= 227 && var3 <= 377 && var2 >= 271 && var2 <= 311) {
				loginSelect = 0;
				loginscreen = 3;
			}
			if (var1 == 1 && var3 >= 387 && var3 <= 537 && var2 >= 271 && var2 <= 311) {
				loginMes1 = Text.PLEASELOGIN1;
				loginMes3 = Text.PLEASELOGIN3;
				loginSelect = 0;
				loginMes2 = Text.PLEASELOGIN2;
				loginscreen = 2;
				return;
			}
		} else if (loginscreen == 2) {
			short var4 = 231;
			int var7 = var4 + 30;
			if (var1 == 1 && var2 >= 246 && var2 < 261) {
				loginSelect = 0;
			}
			var7 += 15;
			if (var1 == 1 && var2 >= 261 && var2 < 276) {
				loginSelect = 1;
			}
			var7 += 15;
			if (var1 == 1 && var3 >= 227 && var3 <= 377 && var2 >= 301 && var2 <= 341) {
				loginUser = loginUser.method244().toScreenName();
				if (loginUser.length() == 0) {
					loginMes(Text.LOGIN_USER_LENGTH_A, Text.LOGIN_USER_LENGTH_B, Text.LOGIN_USER_LENGTH_C);
					return;
				}
				if (loginPass.length() == 0) {
					loginMes(Text.LOGIN_PASS_LENGTH_A, Text.LOGIN_PASS_LENGTH_B, Text.LOGIN_PASS_LENGTH_C);
					return;
				}
				loginMes(Text.CONNECTING1, Text.CONNECTING2, Text.CONNECTING3);
				Client.setMainState(20);
				return;
			}
			if (var1 == 1 && var3 >= 387 && var3 <= 537 && var2 >= 301 && var2 <= 341) {
				loginPass = AUTO_EMPTY;
				loginscreen = 0;
				loginUser = AUTO_EMPTY;
			}
			while (true) {
				while (ClientKeyboardListener.pollKey()) {
					boolean var5 = false;
					for (int var6 = 0; charList.length() > var6; var6++) {
						if (ClientKeyboardListener.ch == charList.charAt(var6)) {
							var5 = true;
							break;
						}
					}
					if (loginSelect == 0) {
						if (ClientKeyboardListener.code == 85 && loginUser.length() > 0) {
							loginUser = loginUser.substring(0, loginUser.length() - 1);
						}
						if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
							loginSelect = 1;
						}
						if (var5 && loginUser.length() < 12) {
							loginUser = loginUser.method277(ClientKeyboardListener.ch);
						}
					} else if (loginSelect == 1) {
						if (ClientKeyboardListener.code == 85 && loginPass.length() > 0) {
							loginPass = loginPass.substring(0, loginPass.length() - 1);
						}
						if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
							loginSelect = 0;
						}
						if (Client.modewhere == 2 && ClientKeyboardListener.code == 84) {
							loginUser = loginUser.method244().toScreenName();
							if (loginUser.length() == 0) {
								loginMes(Text.LOGIN_USER_LENGTH_A, Text.LOGIN_USER_LENGTH_B, Text.LOGIN_USER_LENGTH_C);
								return;
							}
							if (loginPass.length() == 0) {
								loginMes(Text.LOGIN_PASS_LENGTH_A, Text.LOGIN_PASS_LENGTH_B, Text.LOGIN_PASS_LENGTH_C);
								return;
							}
							loginMes(Text.CONNECTING1, Text.CONNECTING2, Text.CONNECTING3);
							Client.setMainState(20);
							return;
						}
						if (var5 && loginPass.length() < 20) {
							loginPass = loginPass.method277(ClientKeyboardListener.ch);
						}
					}
				}
				return;
			}
		} else if (loginscreen == 3 && var1 == 1 && var3 >= 307 && var3 <= 457 && var2 >= 301 && var2 <= 341) {
			loginscreen = 0;
			return;
		}
	}

	@ObfuscatedName("wf.a(Lnf;ILnf;)V")
	public static void draw(PixFontGeneric arg0, PixFontGeneric arg1) {
		if (switchScreen) {
			worldSwitchRender(arg1, arg0);
			return;
		}
		if (Client.state == 0 || Client.state == 5) {
			arg1.centreString(Text.LOADING_TITLE, 382, 225, 16777215, -1);
			Pix2D.drawRect(230, 233, 304, 34, 9179409);
			Pix2D.drawRect(231, 234, 302, 32, 0);
			Pix2D.fillRect(232, 235, loadPos * 3, 30, 9179409);
			Pix2D.fillRect(loadPos * 3 + 232, 235, 300 - loadPos * 3, 30, 0);
			arg1.centreString(loadString, 382, 256, 16777215, -1);
		}
		if (Client.state == 20) {
			short var2 = 211;
			titleBox.plotSprite(382 - titleBox.wi / 2, 271 - titleBox.hi / 2);
			arg1.centreString(loginMes1, 382, 211, 16776960, 0);
			int var8 = var2 + 15;
			arg1.centreString(loginMes2, 382, 226, 16776960, 0);
			int var9 = var8 + 15;
			arg1.centreString(loginMes3, 382, 241, 16776960, 0);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg1.drawString(JagString.join(new JagString[] { Text.USERNAMEPROMPT, PixFont.escape(loginUser) }), 272, 266, 16777215, 0);
			int var13 = var11 + 15;
			arg1.drawString(JagString.join(new JagString[] { Text.PASSWORDPROMPT, loginPass.method248() }), 274, 281, 16777215, 0);
			int var15 = var13 + 15;
		}
		if (Client.state == 10) {
			titleBox.plotSprite(202, 171);
			if (loginscreen == 0) {
				short var5 = 251;
				arg1.centreString(Text.WELCOMETORUNESCAPE, 382, 251, 16776960, 0);
				titleBut.plotSprite(229, 271);
				arg1.drawStringMultiline(Text.NEWUSER, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				int var21 = var5 + 30;
				titleBut.plotSprite(389, 271);
				arg1.drawStringMultiline(Text.EXISTINGUSER, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (loginscreen == 2) {
				short var4 = 211;
				arg1.centreString(loginMes1, 382, 211, 16776960, 0);
				int var17 = var4 + 15;
				arg1.centreString(loginMes2, 382, 226, 16776960, 0);
				int var19 = var17 + 15;
				arg1.centreString(loginMes3, 382, 241, 16776960, 0);
				int var20 = var19 + 15;
				int var22 = var20 + 10;
				arg1.drawString(JagString.join(new JagString[] { Text.USERNAMEPROMPT, PixFont.escape(loginUser), loginSelect == 0 & Client.loopCycle % 40 < 20 ? AUTO_INPUT : AUTO_EMPTY}), 272, 266, 16777215, 0);
				int var23 = var22 + 15;
				arg1.drawString(JagString.join(new JagString[] { Text.PASSWORDPROMPT, loginPass.method248(), Client.loopCycle % 40 < 20 & loginSelect == 1 ? AUTO_INPUT : AUTO_EMPTY}), 274, 281, 16777215, 0);
				int var24 = var23 + 15;
				titleBut.plotSprite(229, 301);
				arg1.centreString(Text.LOGIN, 302, 326, 16777215, 0);
				titleBut.plotSprite(389, 301);
				arg1.centreString(Text.CANCEL, 462, 326, 16777215, 0);
			} else if (loginscreen == 3) {
				short var3 = 236;
				arg1.centreString(Text.NEWUSER1, 382, 211, 16776960, 0);
				arg1.centreString(Text.NEWUSER2, 382, 236, 16777215, 0);
				int var12 = var3 + 15;
				arg1.centreString(Text.NEWUSER3, 382, 251, 16777215, 0);
				int var14 = var12 + 15;
				arg1.centreString(Text.NEWUSER4, 382, 266, 16777215, 0);
				int var16 = var14 + 15;
				arg1.centreString(Text.NEWUSER5, 382, 281, 16777215, 0);
				titleBut.plotSprite(309, 301);
				arg1.centreString(Text.CANCEL, 382, 326, 16777215, 0);
				int var18 = var16 + 15;
			}
		}
		if (Client.modegame != 1) {
			if (flameCycle > 0) {
				method589(flameCycle);
				flameCycle = 0;
			}
			method977();
		}
		titleMute[mute ? 1 : 0].plotSprite(725, 463);
		if (Client.state > 5 && Client.plug != 2 && Client.lang == 0) {
			if (slButton == null) {
				slButton = PixLoader.makePix8(AUTO_EMPTY, Client.sprites, AUTO_SLBUTTON);
			} else {
				slButton.plotSprite(5, 463);
				arg1.centreString(JagString.join(new JagString[] { Text.WORLD, AUTO_SPACE, JagString.parseInt(Client.worldid) }), 55, 478, 16777215, 0);
				if (gameworldListDownloadRequest == null) {
					arg0.centreString(Text.CLICKTOSWITCH, 55, 492, 16777215, 0);
				} else {
					arg0.centreString(Text.LOADINGDOTDOTDOT, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			Graphics var6 = GameShell.canvas.getGraphics();
			GameShell.drawArea.draw(var6);
		} catch (Exception var7) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("qa.a(Lea;BLea;Ljava/awt/Component;)V")
	public static void open(Js5 arg0, Js5 arg1, Component arg2) {
		if (open) {
			return;
		}
		Pix2D.cls();
		byte[] var3 = arg0.getFile(AUTO_TITLEJPG, AUTO_EMPTY);
		titleBack = new Pix32(var3, arg2);
		titleBack2 = titleBack.copyHFlip();
		logo = PixLoader.makePix8(AUTO_EMPTY, arg1, AUTO_LOGO);
		titleBox = PixLoader.makePix8(AUTO_EMPTY, arg1, AUTO_TITLEBOX);
		titleBut = PixLoader.makePix8(AUTO_EMPTY, arg1, AUTO_TITLEBUTTON);
		runes = PixLoader.makePix8Array(AUTO_EMPTY, AUTO_RUNES, arg1);
		titleMute = PixLoader.makePix8Array(AUTO_EMPTY, AUTO_TITLEMUTE, arg1);
		flameGradient0 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			flameGradient0[var4] = var4 * 262144;
		}
		for (int var5 = 0; var5 < 64; var5++) {
			flameGradient0[var5 + 64] = var5 * 1024 + 16711680;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			flameGradient0[var6 + 128] = var6 * 4 + 16776960;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			flameGradient0[var7 + 192] = 16777215;
		}
		flameGradient1 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			flameGradient1[var8] = var8 * 1024;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			flameGradient1[var9 + 64] = var9 * 4 + 65280;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			flameGradient1[var10 + 128] = var10 * 262144 + 65535;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			flameGradient1[var11 + 192] = 16777215;
		}
		flameGradient2 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			flameGradient2[var12] = var12 * 4;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			flameGradient2[var13 + 64] = var13 * 262144 + 255;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			flameGradient2[var14 + 128] = var14 * 1024 + 16711935;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			flameGradient2[var15 + 192] = 16777215;
		}
		flameBuffer0 = new int[32768];
		flameBuffer1 = new int[32768];
		flameGradient = new int[256];
		generateFlameCoolingMap(null);
		loginUser = AUTO_EMPTY;
		if (Client.midiVolume == 0) {
			mute = true;
		} else {
			mute = false;
		}
		loginscreen = 0;
		switchScreen = false;
		flameBuffer2 = new int[32768];
		loginPass = AUTO_EMPTY;
		flameBuffer3 = new int[32768];
		if (mute) {
			MidiManager.stop2();
		} else {
			MidiManager.swap(Client.songs, AUTO_SCAPE_MAIN, AUTO_EMPTY);
		}
		Js5Net.sendLoginLogoutPacket(false);
		open = true;
		titleBack.quickPlotSprite(0, 0);
		titleBack2.quickPlotSprite(382, 0);
		logo.plotSprite(382 - logo.wi / 2, 18);
	}

	@ObfuscatedName("da.a(B)V")
	public static void close() {
		if (!open) {
			return;
		}
		flameBuffer2 = null;
		slStars = null;
		runes = null;
		slArrows = null;
		slButton = null;
		titleBack2 = null;
		titleBut = null;
		slBack = null;
		flameBuffer3 = null;
		titleBack = null;
		logo = null;
		titleBox = null;
		flameGradient2 = null;
		flameGradient1 = null;
		flameGradient0 = null;
		flameBuffer0 = null;
		titleMute = null;
		flameGradient = null;
		flameBuffer1 = null;
		slFlags = null;
		MidiManager.stop2();
		Js5Net.sendLoginLogoutPacket(true);
		open = false;
	}

	@ObfuscatedName("uc.a(ILea;Lea;)I")
	public static int ready(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg1.requestDownload(AUTO_TITLEJPG, AUTO_EMPTY)) {
			var2++;
		}
		if (arg0.requestDownload(AUTO_LOGO, AUTO_EMPTY)) {
			var2++;
		}
		if (arg0.requestDownload(AUTO_TITLEBOX, AUTO_EMPTY)) {
			var2++;
		}
		if (arg0.requestDownload(AUTO_TITLEBUTTON, AUTO_EMPTY)) {
			var2++;
		}
		if (arg0.requestDownload(AUTO_RUNES, AUTO_EMPTY)) {
			var2++;
		}
		if (arg0.requestDownload(AUTO_TITLEMUTE, AUTO_EMPTY)) {
			var2++;
		}
		arg0.requestDownload(AUTO_SLBACK, AUTO_EMPTY);
		arg0.requestDownload(AUTO_SLFLAGS, AUTO_EMPTY);
		arg0.requestDownload(AUTO_SLARROWS, AUTO_EMPTY);
		arg0.requestDownload(AUTO_SLSTARS, AUTO_EMPTY);
		arg0.requestDownload(AUTO_SLBUTTON, AUTO_EMPTY);
		return var2;
	}

	@ObfuscatedName("qa.a(I)I")
	public static int readyMax() {
		return 6;
	}

	@ObfuscatedName("ha.a(Lnf;ZLnf;)V")
	public static void worldSwitchRender(PixFontGeneric arg0, PixFontGeneric arg1) {
		if (slBack == null) {
			slBack = PixLoader.makePix32Array(AUTO_SLBACK, Client.sprites, AUTO_EMPTY);
		}
		if (slFlags == null) {
			slFlags = PixLoader.makePix8Array(AUTO_EMPTY, AUTO_SLFLAGS, Client.sprites);
		}
		if (slArrows == null) {
			slArrows = PixLoader.makePix8Array(AUTO_EMPTY, AUTO_SLARROWS, Client.sprites);
		}
		if (slStars == null) {
			slStars = PixLoader.makePix8Array(AUTO_EMPTY, AUTO_SLSTARS, Client.sprites);
		}
		Pix2D.fillRect(0, 23, 765, 480, 0);
		Pix2D.fillRectVGrad(0, 0, 125, 23, 12425273, 9135624);
		Pix2D.fillRectVGrad(125, 0, 640, 23, 5197647, 2697513);
		arg0.centreString(Text.SELECTAWORLD, 62, 15, 0, -1);
		if (slStars != null) {
			slStars[1].plotSprite(140, 1);
			arg1.drawString(Text.MEMBERSONLYWORLD, 152, 10, 16777215, -1);
			slStars[0].plotSprite(140, 12);
			arg1.drawString(Text.FREEWORLD, 152, 21, 16777215, -1);
		}
		if (slArrows != null) {
			if (ordering[0] == 0 && dirs[0] == 0) {
				slArrows[2].plotSprite(280, 4);
			} else {
				slArrows[0].plotSprite(280, 4);
			}
			if (ordering[0] == 0 && dirs[0] == 1) {
				slArrows[3].plotSprite(295, 4);
			} else {
				slArrows[1].plotSprite(295, 4);
			}
			arg0.drawString(Text.SL_WORLD, 312, 17, 16777215, -1);
			if (ordering[0] == 1 && dirs[0] == 0) {
				slArrows[2].plotSprite(390, 4);
			} else {
				slArrows[0].plotSprite(390, 4);
			}
			if (ordering[0] == 1 && dirs[0] == 1) {
				slArrows[3].plotSprite(405, 4);
			} else {
				slArrows[1].plotSprite(405, 4);
			}
			arg0.drawString(Text.SL_PLAYERS, 422, 17, 16777215, -1);
			if (ordering[0] == 2 && dirs[0] == 0) {
				slArrows[2].plotSprite(500, 4);
			} else {
				slArrows[0].plotSprite(500, 4);
			}
			if (ordering[0] == 2 && dirs[0] == 1) {
				slArrows[3].plotSprite(515, 4);
			} else {
				slArrows[1].plotSprite(515, 4);
			}
			arg0.drawString(Text.SL_LOCATION, 532, 17, 16777215, -1);
			if (ordering[0] == 3 && dirs[0] == 0) {
				slArrows[2].plotSprite(610, 4);
			} else {
				slArrows[0].plotSprite(610, 4);
			}
			if (ordering[0] == 3 && dirs[0] == 1) {
				slArrows[3].plotSprite(625, 4);
			} else {
				slArrows[1].plotSprite(625, 4);
			}
			arg0.drawString(Text.SL_TYPE, 642, 17, 16777215, -1);
		}
		Pix2D.fillRect(708, 4, 50, 16, 0);
		arg1.centreString(Text.CANCEL, 733, 16, 16777215, -1);
		slLastWorld = -1;
		if (slBack != null) {
			int var2 = 8;
			int var3 = 24;
			int var4;
			int var5;
			do {
				var4 = var3;
				var5 = var2;
				if (var3 * (var2 - 1) >= num) {
					var2--;
				}
				if (num <= (var3 - 1) * var2) {
					var3--;
				}
				if (num <= (var3 - 1) * var2) {
					var3--;
				}
			} while (var3 != var4 || var2 != var5);
			int var6 = (480 - var3 * 19) / (var3 + 1);
			if (var6 > 5) {
				var6 = 5;
			}
			int var7 = (765 - var2 * 88) / (var2 + 1);
			if (var7 > 5) {
				var7 = 5;
			}
			int var8 = (765 - var2 * 88 - var7 * (var2 - 1)) / 2;
			int var9 = (480 - var6 * (var3 - 1) - var3 * 19) / 2;
			int var10 = var9 + 23;
			int var11 = var8;
			int var12 = 0;
			for (int var13 = 0; var13 < num; var13++) {
				WorldEntry var14 = list[var13];
				boolean var15 = true;
				JagString var16 = JagString.parseInt(var14.players);
				if (var14.players == -1) {
					var16 = Text.OFFLINEWORLD;
					var15 = false;
				} else if (var14.players > 1980) {
					var16 = Text.FULLWORLD;
					var15 = false;
				}
				if (var11 <= ClientMouseListener.mouseX && ClientMouseListener.mouseY >= var10 && var11 + 88 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var10 + 19 && var15) {
					slLastWorld = var13;
					slBack[var14.members ? 1 : 0].litPlotSprite(var11, var10);
				} else {
					slBack[var14.members ? 1 : 0].quickPlotSprite(var11, var10);
				}
				if (slFlags != null) {
					slFlags[(var14.members ? 8 : 0) + var14.country].plotSprite(var11 + 29, var10);
				}
				arg0.centreString(JagString.parseInt(var14.id), var11 + 15, var10 + 9 + 5, 0, -1);
				arg1.centreString(var16, var11 + 60, var10 + 5 + 9, 268435455, -1);
				var10 += var6 + 19;
				var12++;
				if (var3 <= var12) {
					var10 = var9 + 23;
					var12 = 0;
					var11 += var7 + 88;
				}
			}
		}
		try {
			Graphics var17 = GameShell.canvas.getGraphics();
			GameShell.drawArea.draw(var17);
		} catch (Exception var18) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("ha.a(II[II[I[Loe;)V")
	public static void quickSort(int arg0, int arg1, int[] arg2, int[] arg3, WorldEntry[] arg4) {
		if (arg0 >= arg1) {
			return;
		}
		int var5 = arg1 + 1;
		int var6 = (arg0 + arg1) / 2;
		WorldEntry var7 = arg4[var6];
		arg4[var6] = arg4[arg0];
		int var8 = arg0 - 1;
		arg4[arg0] = var7;
		while (var8 < var5) {
			boolean var9 = true;
			do {
				var5--;
				for (int var10 = 0; var10 < 4; var10++) {
					int var11;
					int var12;
					if (arg3[var10] == 2) {
						var12 = var7.index;
						var11 = arg4[var5].index;
					} else if (arg3[var10] == 1) {
						var11 = arg4[var5].players;
						var12 = var7.players;
						if (var11 == -1 && arg2[var10] == 1) {
							var11 = 2001;
						}
						if (var12 == -1 && arg2[var10] == 1) {
							var12 = 2001;
						}
					} else if (arg3[var10] == 3) {
						var11 = arg4[var5].members ? 1 : 0;
						var12 = var7.members ? 1 : 0;
					} else {
						var12 = var7.id;
						var11 = arg4[var5].id;
					}
					if (var11 != var12) {
						if ((arg2[var10] != 1 || var11 <= var12) && (arg2[var10] != 0 || var12 <= var11)) {
							var9 = false;
						}
						break;
					}
					if (var10 == 3) {
						var9 = false;
					}
				}
			} while (var9);
			boolean var13 = true;
			do {
				var8++;
				for (int var14 = 0; var14 < 4; var14++) {
					int var15;
					int var16;
					if (arg3[var14] == 2) {
						var15 = var7.index;
						var16 = arg4[var8].index;
					} else if (arg3[var14] == 1) {
						var15 = var7.players;
						if (var15 == -1 && arg2[var14] == 1) {
							var15 = 2001;
						}
						var16 = arg4[var8].players;
						if (var16 == -1 && arg2[var14] == 1) {
							var16 = 2001;
						}
					} else if (arg3[var14] == 3) {
						var16 = arg4[var8].members ? 1 : 0;
						var15 = var7.members ? 1 : 0;
					} else {
						var15 = var7.id;
						var16 = arg4[var8].id;
					}
					if (var15 != var16) {
						if ((arg2[var14] != 1 || var15 <= var16) && (arg2[var14] != 0 || var15 >= var16)) {
							var13 = false;
						}
						break;
					}
					if (var14 == 3) {
						var13 = false;
					}
				}
			} while (var13);
			if (var8 < var5) {
				WorldEntry var17 = arg4[var8];
				arg4[var8] = arg4[var5];
				arg4[var5] = var17;
			}
		}
		quickSort(arg0, var5, arg2, arg3, arg4);
		quickSort(var5 + 1, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("kb.a(ILhb;)V")
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
					flameBuffer1[var7] = (flameBuffer0[var7 - 1] + flameBuffer0[var7 + 1] + flameBuffer0[var7 + -128] + flameBuffer0[var7 + 128]) / 4;
				}
			}
			int[] var8 = flameBuffer0;
			flameBuffer0 = flameBuffer1;
			flameBuffer1 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.hi; var10++) {
			for (int var11 = 0; var11 < arg0.wi; var11++) {
				if (arg0.data[var9++] != 0) {
					int var12 = arg0.xof + var11 + 16;
					int var13 = var10 + arg0.yof + 16;
					int var14 = (var13 << 7) + var12;
					flameBuffer0[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("m.b(I)V")
	public static void listFetch() {
		try {
			if (gameworldListDownloadRequest == null) {
				gameworldListDownloadRequest = new HTTPRequest(GameShell.signlink, JagString.join(new JagString[] {AUTO_FULLDOMAIN, Client.ACTIVE_LANG, AUTO_SLRWS}).method278());
				return;
			}

			byte[] src = gameworldListDownloadRequest.getData();
			if (src == null) {
				return;
			}

			Packet buf = new Packet(src);
			num = buf.g2();
			list = new WorldEntry[num];

			for (int i = 0; i < num; i++) {
				WorldEntry world = list[i] = new WorldEntry();
				int info = buf.g2();
				world.id = info & 0x7FFF;
				world.members = (info & 0x8000) != 0;
				world.host = buf.gjstr();
				world.players = buf.g2b();
				world.index = i;
				world.country = getCountry(world.host);
			}

			quickSort(0, list.length - 1, dirs, ordering, list);
			switchScreen = true;
			gameworldListDownloadRequest = null;
		} catch (Exception ex) {
			ex.printStackTrace();
			gameworldListDownloadRequest = null;
		}
	}

	@ObfuscatedName("me.a(IBI)V")
	public static void listReorder(int arg0, int arg1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var3[0] = arg1;
		int var4 = 1;
		var2[0] = arg0;
		for (int var5 = 0; var5 < 4; var5++) {
			if (ordering[var5] != arg1) {
				var3[var4] = ordering[var5];
				var2[var4] = dirs[var5];
				var4++;
			}
		}
		ordering = var3;
		dirs = var2;
		quickSort(0, list.length - 1, dirs, ordering, list);
	}

	@ObfuscatedName("qc.a(ZLec;Lec;Lec;)V")
	public static void loginMes(JagString arg0, JagString arg2, JagString arg1) {
		loginMes2 = arg2;
		loginMes1 = arg0;
		loginMes3 = arg1;
	}

	@ObfuscatedName("ra.a(BLlf;)V")
	public static void worldSwitchLoop(GameShell arg0) {
		if (ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		if (ClientMouseListener.mouseClickX >= 280 && ClientMouseListener.mouseClickX <= 294 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 295 && ClientMouseListener.mouseClickX <= 360 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 390 && ClientMouseListener.mouseClickX <= 404 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 405 && ClientMouseListener.mouseClickX <= 470 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 500 && ClientMouseListener.mouseClickX <= 514 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 2);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 515 && ClientMouseListener.mouseClickX <= 580 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 2);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 610 && ClientMouseListener.mouseClickX <= 624 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 3);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 625 && ClientMouseListener.mouseClickX <= 690 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 3);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 708 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickX <= 758 && ClientMouseListener.mouseClickY <= 20) {
			switchScreen = false;
			titleBack.quickPlotSprite(0, 0);
			titleBack2.quickPlotSprite(382, 0);
			logo.plotSprite(382 - logo.wi / 2, 18);
			return;
		}
		if (slLastWorld != -1) {
			WorldEntry var1 = list[slLastWorld];
			if (Client.memServer == var1.members) {
				byte[] var2 = JagString.join(new JagString[]{var1.host, AUTO_DOMAIN}).copy();
				Client.loginHost = new String(var2, 0, var2.length);
				if (Client.modewhere != 0) {
					Client.loginPort = 43594;
					Client.loginGamePort = 43594;
					Client.modewhere = 0;
					Client.loginJs5Port = 443;
				}
				Client.worldid = var1.id;
				switchScreen = false;
				titleBack.quickPlotSprite(0, 0);
				titleBack2.quickPlotSprite(382, 0);
				logo.plotSprite(382 - logo.wi / 2, 18);
				return;
			}
			JagString var3 = JagString.join(new JagString[]{AUTO_PROTOCOL, var1.host, AUTO_DOMAIN, Client.ACTIVE_LANG, AUTO_ANDL, JagString.parseInt(Client.lowMem ? 1 : 0), AUTO_ANDP, JagString.parseInt(Client.plug), AUTO_ANDJS, JagString.parseInt(Client.js)});
			try {
				arg0.getAppletContext().showDocument(var3.method278(), "_self");
			} catch (Exception var4) {
			}
		}
	}

	@ObfuscatedName("kc.a(IZ)V")
	public static void method589(int arg0) {
		flameCycle0 += arg0 * 128;
		if (flameCycle0 > flameBuffer0.length) {
			flameCycle0 -= flameBuffer0.length;
			int var1 = (int) (Math.random() * 12.0D);
			generateFlameCoolingMap(runes[var1]);
		}
		int var2 = 0;
		int var3 = arg0 * 128;
		int var4 = (256 - arg0) * 128;
		for (int var5 = 0; var5 < var4; var5++) {
			int var6 = flameBuffer2[var2 + var3] - flameBuffer0[flameBuffer0.length - 1 & var2 + flameCycle0] * arg0 / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			flameBuffer2[var2++] = var6;
		}
		for (int var7 = 256 - arg0; var7 < 256; var7++) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; var9++) {
				int var10 = (int) (Math.random() * 100.0D);
				if (var10 < 50 && var9 > 10 && var9 < 118) {
					flameBuffer2[var8 + var9] = 255;
				} else {
					flameBuffer2[var8 + var9] = 0;
				}
			}
		}
		if (flameGradientCycle0 > 0) {
			flameGradientCycle0 -= arg0 * 4;
		}
		if (flameGradientCycle1 > 0) {
			flameGradientCycle1 -= arg0 * 4;
		}
		if (flameGradientCycle0 == 0 && flameGradientCycle1 == 0) {
			int var11 = (int) ((double) (2000 / arg0) * Math.random());
			if (var11 == 0) {
				flameGradientCycle0 = 1024;
			}
			if (var11 == 1) {
				flameGradientCycle1 = 1024;
			}
		}
		for (int var12 = 0; var12 < 256 - arg0; var12++) {
			flameLineOffset[var12] = flameLineOffset[arg0 + var12];
		}
		for (int var13 = 256 - arg0; var13 < 256; var13++) {
			flameLineOffset[var13] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
			loopCycle++;
		}
		int var14 = (arg0 + (Client.loopCycle & 0x1)) / 2;
		flameSparks += arg0;
		if (var14 <= 0) {
			return;
		}
		for (int var15 = 0; var15 < flameSparks * 100; var15++) {
			int var16 = (int) (Math.random() * 128.0D) + 128;
			int var17 = (int) (Math.random() * 124.0D) + 2;
			flameBuffer2[(var16 << 7) + var17] = 192;
		}
		flameSparks = 0;
		for (int var18 = 0; var18 < 256; var18++) {
			int var19 = 0;
			int var20 = var18 * 128;
			for (int var21 = -var14; var21 < 128; var21++) {
				if (var21 + var14 < 128) {
					var19 += flameBuffer2[var14 + var20 + var21];
				}
				if (var21 - var14 - 1 >= 0) {
					var19 -= flameBuffer2[var20 + var21 - var14 - 1];
				}
				if (var21 >= 0) {
					flameBuffer3[var21 + var20] = var19 / (var14 * 2 + 1);
				}
			}
		}
		for (int var22 = 0; var22 < 128; var22++) {
			int var23 = 0;
			for (int var24 = -var14; var24 < 256; var24++) {
				int var25 = var24 * 128;
				if (var24 + var14 < 256) {
					var23 += flameBuffer3[var22 + var25 + var14 * 128];
				}
				if (var24 - var14 - 1 >= 0) {
					var23 -= flameBuffer3[var25 + var22 - var14 * 128 - 128];
				}
				if (var24 >= 0) {
					flameBuffer2[var22 + var25] = var23 / (var14 * 2 + 1);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Z)V")
	public static void method977() {
		if (flameGradientCycle0 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (flameGradientCycle0 > 768) {
					flameGradient[var0] = merge(flameGradient1[var0], 1024 - flameGradientCycle0, flameGradient0[var0]);
				} else if (flameGradientCycle0 > 256) {
					flameGradient[var0] = flameGradient1[var0];
				} else {
					flameGradient[var0] = merge(flameGradient0[var0], 256 - flameGradientCycle0, flameGradient1[var0]);
				}
			}
		} else if (flameGradientCycle1 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (flameGradientCycle1 > 768) {
					flameGradient[var1] = merge(flameGradient2[var1], 1024 - flameGradientCycle1, flameGradient0[var1]);
				} else if (flameGradientCycle1 <= 256) {
					flameGradient[var1] = merge(flameGradient0[var1], 256 - flameGradientCycle1, flameGradient2[var1]);
				} else {
					flameGradient[var1] = flameGradient2[var1];
				}
			}
		} else {
			for (int var2 = 0; var2 < 256; var2++) {
				flameGradient[var2] = flameGradient0[var2];
			}
		}
		int var3 = 0;
		int var4 = 6885;
		Pix2D.setClipping(0, 9, 128, 263);
		titleBack.quickPlotSprite(0, 0);
		Pix2D.resetClipping();
		for (int var5 = 1; var5 < 255; var5++) {
			int var6 = (256 - var5) * flameLineOffset[var5] / 256;
			int var7 = var6 + 22;
			if (var7 < 0) {
				var7 = 0;
			}
			var3 += var7;
			for (int var8 = var7; var8 < 128; var8++) {
				int var9 = flameBuffer2[var3++];
				if (var9 == 0) {
					var4++;
				} else {
					int var11 = GameShell.drawArea.data[var4];
					int var12 = 256 - var9;
					int var13 = flameGradient[var9];
					GameShell.drawArea.data[var4++] = ((var13 & 0xFF00) * var9 + var12 * (var11 & 0xFF00) & 0xFF0000) + (var12 * (var11 & 0xFF00FF) + (var13 & 0xFF00FF) * var9 & 0xFF00FF00) >> 8;
				}
			}
			var4 += var7 + 765 - 128;
		}
		int var14 = 7546;
		int var15 = 0;
		Pix2D.setClipping(637, 9, 765, 263);
		titleBack2.quickPlotSprite(382, 0);
		Pix2D.resetClipping();
		for (int var16 = 1; var16 < 255; var16++) {
			int var17 = flameLineOffset[var16] * (256 - var16) / 256;
			int var18 = var14 + var17;
			int var19 = 103 - var17;
			for (int var20 = 0; var20 < var19; var20++) {
				int var21 = flameBuffer2[var15++];
				if (var21 == 0) {
					var18++;
				} else {
					int var23 = 256 - var21;
					int var24 = GameShell.drawArea.data[var18];
					int var25 = flameGradient[var21];
					GameShell.drawArea.data[var18++] = ((var25 & 0xFF00FF) * var21 + var23 * (var24 & 0xFF00FF) & 0xFF00FF00) + ((var25 & 0xFF00) * var21 + var23 * (var24 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			var15 += 128 - var19;
			var14 = var18 + 765 - var17 - var19;
		}
	}

	@ObfuscatedName("ce.a(ILec;)I")
	public static int getCountry(JagString arg0) {
		if (Client.lang == 1) {
			return 7;
		} else if (arg0.startsWith(AUTO_MN)) {
			return 1;
		} else if (arg0.startsWith(AUTO_JOLT)) {
			return 1;
		} else if (arg0.startsWith(AUTO_NAV)) {
			return 2;
		} else if (arg0.startsWith(AUTO_JLV)) {
			return 2;
		} else if (arg0.startsWith(AUTO_AU)) {
			return 3;
		} else if (arg0.startsWith(AUTO_AMS)) {
			return 4;
		} else if (arg0.startsWith(AUTO_ME)) {
			return 4;
		} else if (arg0.startsWith(AUTO_SWE)) {
			return 5;
		} else if (arg0.startsWith(AUTO_HEL)) {
			return 6;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("mb.a(IIBI)I")
	public static int merge(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) + (arg1 * (arg0 & 0xFF00) + var3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}
}
