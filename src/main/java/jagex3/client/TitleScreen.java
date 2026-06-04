package jagex3.client;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.graphics.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.js5.Js5Net;
import jagex3.jstring.JagString;
import jagex3.midi2.MidiManager;

import java.awt.*;

public class TitleScreen {
	@ObfuscatedName("tb.q")
	public static final JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("wa.b")
	public static final int[] flameLineOffset = new int[256];
	@ObfuscatedName("ed.e")
	public static final JagString field915 = JagString.wrap(")4slr2)3ws?order=LPWM");
	@ObfuscatedName("de.G")
	public static final JagString AUTO_TITLEJPG = JagString.wrap("title)3jpg");
	@ObfuscatedName("ff.X")
	public static final JagString AUTO_LOGO = JagString.wrap("logo");
	@ObfuscatedName("client.T")
	public static final JagString AUTO_TITLEBOX = JagString.wrap("titlebox");
	@ObfuscatedName("kg.R")
	public static final JagString AUTO_TITLEBUTTON = JagString.wrap("titlebutton");
	@ObfuscatedName("bh.J")
	public static final JagString AUTO_RUNES = JagString.wrap("runes");
	@ObfuscatedName("id.q")
	public static final JagString AUTO_TITLE_MUTE = JagString.wrap("title_mute");
	@ObfuscatedName("uj.l")
	public static final JagString AUTO_SL_BACK = JagString.wrap("sl_back");
	@ObfuscatedName("te.S")
	public static final JagString AUTO_SL_FLAGS = JagString.wrap("sl_flags");
	@ObfuscatedName("eb.O")
	public static final JagString AUTO_SL_ARROWS = JagString.wrap("sl_arrows");
	@ObfuscatedName("af.K")
	public static final JagString AUTO_SL_STARS = JagString.wrap("sl_stars");
	@ObfuscatedName("ia.v")
	public static final JagString AUTO_SL_BUTTON = JagString.wrap("sl_button");
	@ObfuscatedName("kj.e")
	public static final JagString AUTO_SCAPE_MAIN = JagString.wrap("scape main");
	@ObfuscatedName("sj.e")
	public static final JagString field3922 = JagString.wrap(")3runescape)3com");
	@ObfuscatedName("ac.U")
	public static final JagString AUTO_ANDL = JagString.wrap(")4l");
	@ObfuscatedName("aa.Z")
	public static final JagString AUTO_ANDP = JagString.wrap(")1p");
	@ObfuscatedName("gh.o")
	public static final JagString AUTO_CHARLIST = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("gh.j")
	public static final JagString charList = AUTO_CHARLIST;
	@ObfuscatedName("gh.v")
	public static final JagString AUTO_ANDJS = JagString.wrap(")1j");
	@ObfuscatedName("og.U")
	public static final JagString AUTO_DOMAIN = JagString.wrap(")3runescape)3com)4l=");
	@ObfuscatedName("ih.m")
	public static final JagString AUTO_PROTOCOL = JagString.wrap("http:)4)4");
	@ObfuscatedName("sc.D")
	public static final JagString field3787 = JagString.wrap(" ");
	@ObfuscatedName("tc.D")
	public static final JagString field3983 = JagString.wrap("http:)4)4www)3runescape)3com)4l=");
	@ObfuscatedName("sf.c")
	public static final JagString field3843 = JagString.wrap("<col=ffff00>*V");
	@ObfuscatedName("tb.z")
	public static JagString loginMes1 = AUTO_EMPTY;
	@ObfuscatedName("tb.y")
	public static JagString loginMes3 = AUTO_EMPTY;
	@ObfuscatedName("tb.x")
	public static JagString loginMes2 = AUTO_EMPTY;
	@ObfuscatedName("tb.o")
	public static JagString loginPass = AUTO_EMPTY;
	@ObfuscatedName("tb.l")
	public static JagString loginUser = AUTO_EMPTY;
	@ObfuscatedName("tb.h")
	public static JagString loadString = AUTO_EMPTY;
	@ObfuscatedName("ae.Wb")
	public static int loadPos = 10;
	@ObfuscatedName("ib.B")
	public static boolean open;
	@ObfuscatedName("i.Q")
	public static SoftwarePix32 titleBack;
	@ObfuscatedName("jg.A")
	public static SoftwarePix32 titleBack2;
	@ObfuscatedName("ta.U")
	public static Pix8 logo;
	@ObfuscatedName("wc.D")
	public static Pix8 titleBox;
	@ObfuscatedName("li.G")
	public static Pix8 titleBut;
	@ObfuscatedName("va.E")
	public static SoftwarePix8[] runes;
	@ObfuscatedName("kg.X")
	public static Pix8[] titleMute;
	@ObfuscatedName("ab.g")
	public static int[] flameGradient0;
	@ObfuscatedName("bc.m")
	public static int[] flameGradient1;
	@ObfuscatedName("od.E")
	public static int[] flameGradient2;
	@ObfuscatedName("oe.r")
	public static int[] flameGradient;
	@ObfuscatedName("uc.c")
	public static int[] flameBuffer0;
	@ObfuscatedName("kd.db")
	public static int[] flameBuffer1;
	@ObfuscatedName("mj.k")
	public static int[] flameBuffer3;
	@ObfuscatedName("fi.B")
	public static int loginscreen = 0;
	@ObfuscatedName("tb.d")
	public static boolean switchScreen = false;
	@ObfuscatedName("m.r")
	public static boolean mute = false;
	@ObfuscatedName("re.a")
	public static int[] flameBuffer2;
	@ObfuscatedName("d.cb")
	public static SoftwarePix32 titleLeft;
	@ObfuscatedName("ia.o")
	public static SoftwarePix32 titleRight;
	@ObfuscatedName("pd.fb")
	public static Pix8[] slArrows;
	@ObfuscatedName("c.G")
	public static Pix8[] slFlags;
	@ObfuscatedName("di.eb")
	public static Pix8[] slStars;
	@ObfuscatedName("hc.ab")
	public static Pix32[] slBack;
	@ObfuscatedName("ci.r")
	public static Pix8 slButton;
	@ObfuscatedName("hj.x")
	public static int slLastWorld = -1;
	@ObfuscatedName("jf.kb")
	public static int num = 0;
	@ObfuscatedName("sf.e")
	public static WorldEntry[] list;
	@ObfuscatedName("ob.f")
	public static int flameGradientCycle0 = 0;
	@ObfuscatedName("oi.a")
	public static int flameGradientCycle1 = 0;
	@ObfuscatedName("li.E")
	public static HTTPRequest gameworldListDownloadRequest;
	@ObfuscatedName("cd.k")
	public static int[] ordering = new int[] { 0, 1, 2, 3 };
	@ObfuscatedName("ia.z")
	public static int[] dirs = new int[] { 1, 1, 1, 1 };
	@ObfuscatedName("ag.e")
	public static int slFlagsId = -1;
	@ObfuscatedName("ij.H")
	public static int slArrowsId = -1;
	@ObfuscatedName("l.cb")
	public static int slStarsId = -1;
	@ObfuscatedName("bb.c")
	public static int slBackId = -1;
	@ObfuscatedName("fj.f")
	public static int flameSparks = 0;
	@ObfuscatedName("ed.n")
	public static int loopCycle = 0;
	@ObfuscatedName("ka.e")
	public static int titleJpgId = -1;
	@ObfuscatedName("nj.k")
	public static int logoId = -1;
	@ObfuscatedName("jf.lb")
	public static int titleboxId = -1;
	@ObfuscatedName("oe.c")
	public static int titlebuttonId;
	@ObfuscatedName("wf.g")
	public static int runesId = -1;
	@ObfuscatedName("nh.d")
	public static int titleMuteId = -1;
	@ObfuscatedName("hi.d")
	public static int scapeMainId = -1;
	@ObfuscatedName("uh.S")
	public static int slButtonId = -1;
	@ObfuscatedName("ci.z")
	public static int flameCycle0 = 0;
	@ObfuscatedName("hi.b")
	public static int flameCycle = 0;
	@ObfuscatedName("n.h")
	public static int loginSelect = 0;

	@ObfuscatedName("rc.a(Lcc;BLcc;)V")
    public static void draw(PixfontGeneric arg0, PixfontGeneric arg1) {
        if (switchScreen) {
            worldSwitchRender(arg0, arg1);
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
            titleBox.plotSprite(382 - titleBox.wi / 2, 271 - titleBox.hi / 2);
            short var2 = 211;
            arg1.centreString(loginMes1, 382, 211, 16776960, 0);
            int var8 = var2 + 15;
            arg1.centreString(loginMes2, 382, 226, 16776960, 0);
            int var9 = var8 + 15;
            arg1.centreString(loginMes3, 382, 241, 16776960, 0);
            int var10 = var9 + 15;
            int var11 = var10 + 10;
            arg1.drawString(JagString.join(new JagString[] { Text.USERNAMEPROMPT, PixfontGeneric.escape(loginUser) }), 272, 266, 16777215, 0);
            int var13 = var11 + 15;
            arg1.drawString(JagString.join(new JagString[] { Text.PASSWORDPROMPT, loginPass.toMaskedString() }), 274, 281, 16777215, 0);
            int var15 = var13 + 15;
        }
        if (Client.state == 10) {
            titleBox.plotSprite(202, 171);
            if (loginscreen == 0) {
                short var7 = 251;
                arg1.centreString(Text.WELCOMETORUNESCAPE, 382, 251, 16776960, 0);
                titleBut.plotSprite(229, 271);
                arg1.drawStringMultiline(Text.NEWUSER, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
                int var19 = var7 + 30;
                titleBut.plotSprite(389, 271);
                arg1.drawStringMultiline(Text.EXISTINGUSER, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (loginscreen == 2) {
                short var3 = 211;
                arg1.centreString(loginMes1, 382, 211, 16776960, 0);
                int var12 = var3 + 15;
                arg1.centreString(loginMes2, 382, 226, 16776960, 0);
                int var14 = var12 + 15;
                arg1.centreString(loginMes3, 382, 241, 16776960, 0);
                boolean var4;
                if (loginSelect == 0 && Client.loopCycle % 40 < 20 && GameShell.focus) {
                    var4 = true;
                } else {
                    var4 = false;
                }
                var12 = var14 + 15;
                var12 += 10;
                arg1.drawString(JagString.join(new JagString[] { Text.USERNAMEPROMPT, PixfontGeneric.escape(loginUser), var4 ? field3843 : AUTO_EMPTY}), 272, 266, 16777215, 0);
                boolean var5;
                if (loginSelect == 1 && Client.loopCycle % 40 < 20 && GameShell.focus) {
                    var5 = true;
                } else {
                    var5 = false;
                }
                var12 += 15;
                arg1.drawString(JagString.join(new JagString[] { Text.PASSWORDPROMPT, loginPass.toMaskedString(), var5 ? field3843 : AUTO_EMPTY}), 274, 281, 16777215, 0);
                titleBut.plotSprite(229, 301);
                var12 += 15;
                arg1.centreString(Text.LOGIN, 302, 326, 16777215, 0);
                titleBut.plotSprite(389, 301);
                arg1.centreString(Text.CANCEL, 462, 326, 16777215, 0);
            } else if (loginscreen == 3) {
                arg1.centreString(Text.field2921, 382, 211, 16776960, 0);
                short var6 = 236;
                arg1.centreString(Text.field3753, 382, 236, 16777215, 0);
                int var16 = var6 + 15;
                arg1.centreString(Text.field1591, 382, 251, 16777215, 0);
                int var17 = var16 + 15;
                arg1.centreString(Text.field1152, 382, 266, 16777215, 0);
                int var18 = var17 + 15;
                arg1.centreString(Text.field2943, 382, 281, 16777215, 0);
                int var20 = var18 + 15;
                titleBut.plotSprite(309, 301);
                arg1.centreString(Text.CANCEL, 382, 326, 16777215, 0);
            }
        }
        if (Client.modegame != 1) {
            if (flameCycle > 0) {
                updateFlames(flameCycle);
                flameCycle = 0;
            }
            drawFlames();
        }
        titleMute[mute ? 1 : 0].plotSprite(725, 463);
		if (Client.state > 5 && Client.plug != 2) {
			if (slButton == null) {
				slButton = PixLoader.makePix8(slButtonId, Client.sprites);
			}
			if (slButton != null) {
				slButton.plotSprite(5, 463);
				arg1.centreString(JagString.join(new JagString[]{Text.WORLD, field3787, JagString.parseInt(Client.worldid)}), 55, 478, 16777215, 0);
				if (gameworldListDownloadRequest != null) {
					arg0.centreString(Text.LOADINGDOTDOTDOT, 55, 492, 16777215, 0);
					return;
				}
				arg0.centreString(Text.CLICKTOSWITCH, 55, 492, 16777215, 0);
			}
		}
	}

	@ObfuscatedName("ee.a(BLhj;)V")
	public static void loop(GameShell arg0) {
		if (switchScreen) {
			worldSwitchLoop(arg0);
			return;
		}
		if (ClientMouseListener.mouseClickButton == 1 && ClientMouseListener.mouseClickX >= 715 && ClientMouseListener.mouseClickY >= 453) {
			mute = !mute;
			if (mute) {
				MidiManager.stopNow();
			} else {
				MidiManager.playImmediate(Client.songs, scapeMainId, 255);
			}
		}
		if (Client.state == 5) {
			return;
		}
		flameCycle++;
		if (Client.state != 10) {
			return;
		}
		if (Client.plug != 2) {
			if (ClientMouseListener.mouseClickButton == 1 && ClientMouseListener.mouseClickX >= 5 && ClientMouseListener.mouseClickX <= 105 && ClientMouseListener.mouseClickY >= 463 && ClientMouseListener.mouseClickY <= 498) {
				listFetch();
				return;
			}
			if (gameworldListDownloadRequest != null) {
				listFetch();
			}
		}
		int var1 = ClientMouseListener.mouseClickButton;
		int var2 = ClientMouseListener.mouseClickX;
		int var3 = ClientMouseListener.mouseClickY;
		if (loginscreen == 0) {
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 271 && var3 <= 311) {
				loginSelect = 0;
				loginscreen = 3;
			}
			boolean var4 = false;
			if (Client.modewhere != 0) {
				while (ClientKeyboardListener.pollKey()) {
					if (ClientKeyboardListener.code == 84) {
						var4 = true;
						break;
					}
				}
			}
			if (var4 || var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 271 && var3 <= 311) {
				loginscreen = 2;
				loginMes3 = Text.PLEASELOGIN3;
				loginMes1 = Text.PLEASELOGIN1;
				loginSelect = 0;
				loginMes2 = Text.PLEASELOGIN2;
			}
		} else if (loginscreen == 2) {
			short var5 = 231;
			int var8 = var5 + 30;
			if (var1 == 1 && var3 >= 246 && var3 < 261) {
				loginSelect = 0;
			}
			var8 += 15;
			if (var1 == 1 && var3 >= 261 && var3 < 276) {
				loginSelect = 1;
			}
			var8 += 15;
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 301 && var3 <= 341) {
				loginUser = loginUser.toCleanUsername().toScreenName();
				if (loginUser.length() == 0) {
					loginMes(Text.LOGIN_USER_LENGTH_C, Text.LOGIN_USER_LENGTH_A, Text.LOGIN_USER_LENGTH_B);
				} else if (loginPass.length() == 0) {
					loginMes(Text.LOGIN_PASS_LENGTH_C, Text.LOGIN_PASS_LENGTH_A, Text.LOGIN_PASS_LENGTH_B);
				} else {
					loginMes(Text.CONNECTING3, Text.CONNECTING1, Text.CONNECTING2);
					Client.setMainState(20);
				}
			} else {
				if (var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 301 && var3 <= 341) {
					loginUser = AUTO_EMPTY;
					loginscreen = 0;
					loginPass = AUTO_EMPTY;
				}
				while (true) {
					boolean var6;
					label226: do {
						while (ClientKeyboardListener.pollKey()) {
							var6 = false;
							for (int var7 = 0; var7 < charList.length(); var7++) {
								if (ClientKeyboardListener.ch == charList.charAt(var7)) {
									var6 = true;
									break;
								}
							}
							if (loginSelect != 0) {
								continue label226;
							}
							if (ClientKeyboardListener.code == 85 && loginUser.length() > 0) {
								loginUser = loginUser.substring(0, loginUser.length() - 1);
							}
							if (ClientKeyboardListener.code == 84 || ClientKeyboardListener.code == 80) {
								loginSelect = 1;
							}
							if (var6 && loginUser.length() < 12) {
								loginUser = loginUser.appendChar(ClientKeyboardListener.ch);
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
					if (Client.modewhere != 0 && ClientKeyboardListener.code == 84) {
						loginUser = loginUser.toCleanUsername().toScreenName();
						if (loginUser.length() == 0) {
							loginMes(Text.LOGIN_USER_LENGTH_C, Text.LOGIN_USER_LENGTH_A, Text.LOGIN_USER_LENGTH_B);
							return;
						}
						if (loginPass.length() == 0) {
							loginMes(Text.LOGIN_PASS_LENGTH_C, Text.LOGIN_PASS_LENGTH_A, Text.LOGIN_PASS_LENGTH_B);
							return;
						}
						loginMes(Text.CONNECTING3, Text.CONNECTING1, Text.CONNECTING2);
						Client.setMainState(20);
						return;
					}
					if (var6 && loginPass.length() < 20) {
						loginPass = loginPass.appendChar(ClientKeyboardListener.ch);
					}
				}
			}
		} else if (loginscreen == 3 && var1 == 1 && var2 >= 307 && var2 <= 457 && var3 >= 301 && var3 <= 341) {
			loginscreen = 0;
		}
	}

	@ObfuscatedName("qj.a(Lnb;Ljava/awt/Component;ZLnb;)V")
	public static void open(Js5 arg0, Component arg1, Js5 arg2) {
		if (open) {
			return;
		}
		Pix2D.cls();
		byte[] var3 = arg0.getFile(0, titleJpgId);
		titleBack = new SoftwarePix32(var3, arg1);
		titleBack2 = titleBack.copyHFlip();
		logo = PixLoader.method826(logoId, arg2);
		titleBox = PixLoader.method826(titleboxId, arg2);
		titleBut = PixLoader.method826(titlebuttonId, arg2);
		runes = PixLoader.makeSoftwarePix8Array(arg2, runesId);
		titleMute = PixLoader.makePix8Array(arg2, titleMuteId);
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
		flameGradient = new int[256];
		flameBuffer0 = new int[32768];
		flameBuffer1 = new int[32768];
		generateFlameCoolingMap(null);
		flameBuffer3 = new int[32768];
		loginPass = AUTO_EMPTY;
		loginscreen = 0;
		switchScreen = false;
		if (Client.midiVolume == 0) {
			mute = true;
		} else {
			mute = false;
		}
		loginUser = AUTO_EMPTY;
		flameBuffer2 = new int[32768];
		if (mute) {
			MidiManager.fadeStop();
		} else {
			MidiManager.fadeToSong(255, scapeMainId, Client.songs);
		}
		Js5Net.sendLoginLogoutPacket(false);
		open = true;
		drawBack();
		titleLeft = new SoftwarePix32(128, 254);
		titleRight = new SoftwarePix32(128, 254);
	}

	@ObfuscatedName("sf.c(I)V")
	public static void close() {
		if (!open) {
			return;
		}
		logo = null;
		titleLeft = null;
		runes = null;
		flameBuffer3 = null;
		slArrows = null;
		slFlags = null;
		titleBox = null;
		flameGradient2 = null;
		titleBut = null;
		slStars = null;
		titleMute = null;
		titleBack2 = null;
		flameGradient0 = null;
		slBack = null;
		flameBuffer1 = null;
		flameGradient = null;
		titleBack = null;
		flameBuffer2 = null;
		flameBuffer0 = null;
		flameGradient1 = null;
		slButton = null;
		titleRight = null;
		MidiManager.fadeStop();
		Js5Net.sendLoginLogoutPacket(true);
		open = false;
	}

	@ObfuscatedName("uc.b(I)V")
	public static void drawBack() {
		titleBack.quickPlotSprite(0, 0);
		titleBack2.quickPlotSprite(382, 0);
		logo.plotSprite(382 - logo.wi / 2, 18);
	}

	@ObfuscatedName("ed.a(Lrh;I)V")
	public static void generateFlameCoolingMap(SoftwarePix8 arg0) {
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
					flameBuffer1[var7] = (flameBuffer0[var7 - 128] + flameBuffer0[var7 + 1] + flameBuffer0[var7 - 1] + flameBuffer0[var7 - -128]) / 4;
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
					int var13 = arg0.yof + var10 + 16;
					int var14 = var12 + (var13 << 7);
					flameBuffer0[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("d.a(BLi;Li;Li;)V")
	public static void loginMes(JagString arg0, JagString arg1, JagString arg2) {
		loginMes1 = arg1;
		loginMes3 = arg0;
		loginMes2 = arg2;
	}

	@ObfuscatedName("hc.a(BI)V")
	public static void updateFlames(int arg0) {
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
			int var6 = flameBuffer2[var3 + var2] - arg0 * flameBuffer0[flameBuffer0.length - 1 & flameCycle0 + var2] / 6;
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
					flameBuffer2[var9 + var8] = 255;
				} else {
					flameBuffer2[var8 + var9] = 0;
				}
			}
		}
		if (flameGradientCycle1 > 0) {
			flameGradientCycle1 -= arg0 * 4;
		}
		if (flameGradientCycle0 > 0) {
			flameGradientCycle0 -= arg0 * 4;
		}
		if (flameGradientCycle0 == 0 && flameGradientCycle1 == 0) {
			int var11 = (int) (Math.random() * (double) (2000 / arg0));
			if (var11 == 1) {
				flameGradientCycle1 = 1024;
			}
			if (var11 == 0) {
				flameGradientCycle0 = 1024;
			}
		}
		for (int var12 = 0; var12 < 256 - arg0; var12++) {
			flameLineOffset[var12] = flameLineOffset[arg0 + var12];
		}
		for (int var13 = 256 - arg0; var13 < 256; var13++) {
			flameLineOffset[var13] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
			loopCycle++;
		}
		flameSparks += arg0;
		int var14 = ((Client.loopCycle & 0x1) + arg0) / 2;
		if (var14 <= 0) {
			return;
		}
		for (int var15 = 0; var15 < flameSparks * 100; var15++) {
			int var16 = (int) (Math.random() * 124.0D) + 2;
			int var17 = (int) (Math.random() * 128.0D) + 128;
			flameBuffer2[var16 + (var17 << 7)] = 192;
		}
		flameSparks = 0;
		for (int var18 = 0; var18 < 256; var18++) {
			int var19 = 0;
			int var20 = var18 * 128;
			for (int var21 = -var14; var21 < 128; var21++) {
				if (var14 + var21 < 128) {
					var19 += flameBuffer2[var20 + var21 + var14];
				}
				if (var21 - var14 - 1 >= 0) {
					var19 -= flameBuffer2[var21 + var20 - var14 - 1];
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
				if (var14 + var24 < 256) {
					var23 += flameBuffer3[var14 * 128 + var22 + var25];
				}
				if (var24 - var14 - 1 >= 0) {
					var23 -= flameBuffer3[var22 + var25 - var14 * 128 - 128];
				}
				if (var24 >= 0) {
					flameBuffer2[var25 + var22] = var23 / (var14 * 2 + 1);
				}
			}
		}
	}

	@ObfuscatedName("ki.a(Lcc;Lcc;B)V")
	public static void worldSwitchRender(PixfontGeneric arg0, PixfontGeneric arg1) {
		if (slBack == null) {
			slBack = PixLoader.makePix32Array(0, Client.sprites, slBackId);
		}
		if (slFlags == null) {
			slFlags = PixLoader.makePix8Array(slFlagsId, Client.sprites, 0);
		}
		if (slArrows == null) {
			slArrows = PixLoader.makePix8Array(slArrowsId, Client.sprites, 0);
		}
		if (slStars == null) {
			slStars = PixLoader.makePix8Array(slStarsId, Client.sprites, 0);
		}
		Pix2D.fillRect(0, 23, 765, 480, 0);
		Pix2D.method482(0, 0, 138, 23, 12425273, 9135624);
		Pix2D.method482(138, 0, 640, 23, 5197647, 2697513);
		arg1.centreString(Text.SELECTAWORLD, 69, 15, 0, -1);
		if (slStars != null) {
			slStars[1].plotSprite(140, 1);
			arg0.drawString(Text.MEMBERSONLYWORLD, 152, 10, 16777215, -1);
			slStars[0].plotSprite(140, 12);
			arg0.drawString(Text.FREEWORLD, 152, 21, 16777215, -1);
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
			arg1.drawString(Text.SL_WORLD, 312, 17, 16777215, -1);
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
			arg1.drawString(Text.SL_PLAYERS, 422, 17, 16777215, -1);
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
			arg1.drawString(Text.SL_LOCATION, 532, 17, 16777215, -1);
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
			arg1.drawString(Text.SL_TYPE, 642, 17, 16777215, -1);
		}
		Pix2D.fillRect(700, 4, 58, 16, 0);
		arg0.centreString(Text.CANCEL, 729, 16, 16777215, -1);
		slLastWorld = -1;
		if (slBack == null) {
			return;
		}
		int var2 = 24;
		int var3 = 8;
		int var4;
		int var5;
		do {
			var4 = var2;
			var5 = var3;
			if (num <= var2 * (var3 - 1)) {
				var3--;
			}
			if (var3 * (var2 - 1) >= num) {
				var2--;
			}
			if (num <= (var2 - 1) * var3) {
				var2--;
			}
		} while (var2 != var4 || var5 != var3);
		int var6 = (765 - var3 * 88) / (var3 + 1);
		int var7 = (480 - var2 * 19) / (var2 + 1);
		if (var7 > 5) {
			var7 = 5;
		}
		if (var6 > 5) {
			var6 = 5;
		}
		int var8 = (765 - var6 * (var3 - 1) - var3 * 88) / 2;
		int var9 = var8;
		int var10 = (480 - var2 * 19 - var7 * (var2 + -1)) / 2;
		int var11 = var10 + 23;
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
			if (ClientMouseListener.mouseX >= var9 && ClientMouseListener.mouseY >= var11 && ClientMouseListener.mouseX < var9 + 88 && ClientMouseListener.mouseY < var11 + 19 && var15) {
				slLastWorld = var13;
				slBack[var14.members ? 1 : 0].litPlotSprite(var9, var11);
			} else {
				slBack[var14.members ? 1 : 0].quickPlotSprite(var9, var11);
			}
			if (slFlags != null) {
				slFlags[var14.country + (var14.members ? 8 : 0)].plotSprite(var9 + 29, var11);
			}
			arg1.centreString(JagString.parseInt(var14.id), var9 + 15, 5 + 9 + var11, 0, -1);
			arg0.centreString(var16, var9 + 60, var11 - -5 + 9, 268435455, -1);
			var11 += var7 + 19;
			var12++;
			if (var2 <= var12) {
				var11 = var10 + 23;
				var12 = 0;
				var9 += var6 + 88;
			}
		}
	}

	@ObfuscatedName("ra.d(Z)V")
	public static void drawFlames() {
		if (flameGradientCycle0 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (flameGradientCycle0 > 768) {
					flameGradient[var0] = merge(flameGradient1[var0], 1024 - flameGradientCycle0, flameGradient0[var0]);
				} else if (flameGradientCycle0 <= 256) {
					flameGradient[var0] = merge(flameGradient0[var0], 256 - flameGradientCycle0, flameGradient1[var0]);
				} else {
					flameGradient[var0] = flameGradient1[var0];
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
		int var3 = titleBack.wi * 9;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 1; var6 < 255; var6++) {
			int var7 = flameLineOffset[var6] * (256 - var6) / 256 + 22;
			if (var7 < 0) {
				var7 = 0;
			}
			var4 += var7;
			for (int var8 = var7; var8 < 128; var8++) {
				int var9 = flameBuffer2[var4++];
				int var10 = titleBack.data[var3++];
				if (var9 == 0) {
					titleLeft.data[var5++] = var10;
				} else {
					int var12 = 256 - var9;
					int var13 = flameGradient[var9];
					titleLeft.data[var5++] = ((var13 & 0xFF00FF) * var9 + var12 * (var10 & 0xFF00FF) & 0xFF00FF00) + (var12 * (var10 & 0xFF00) + (var13 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			for (int var14 = 0; var14 < var7; var14++) {
				titleLeft.data[var5++] = titleBack.data[var3++];
			}
			var3 += titleBack.wi - 128;
		}
		int var15 = 0;
		int var16 = 0;
		titleLeft.quickPlotSprite(0, 9);
		int var17 = titleBack.wi * 9 + 128;
		for (int var18 = 1; var18 < 255; var18++) {
			int var19 = flameLineOffset[var18] * (256 - var18) / 256 + 22;
			if (var19 < 0) {
				var19 = 0;
			}
			for (int var20 = 0; var20 < var19; var20++) {
				int var10001 = var15++;
				var17--;
				titleRight.data[var10001] = titleBack.data[var17];
			}
			for (int var21 = var19; var21 < 128; var21++) {
				int var22 = flameBuffer2[var16++];
				var17--;
				int var23 = titleBack.data[var17];
				if (var22 == 0) {
					titleRight.data[var15++] = var23;
				} else {
					int var25 = 256 - var22;
					int var26 = flameGradient[var22];
					titleRight.data[var15++] = ((var23 & 0xFF00) * var25 + var22 * (var26 & 0xFF00) & 0xFF0000) + ((var23 & 0xFF00FF) * var25 + (var26 & 0xFF00FF) * var22 & 0xFF00FF00) >> 8;
				}
			}
			var17 += titleBack.wi + 128;
			var16 += var19;
		}
		titleRight.quickPlotSprite(637, 9);
	}

	@ObfuscatedName("ke.d(I)V")
	public static void listFetch() {
		try {
			if (gameworldListDownloadRequest == null) {
				gameworldListDownloadRequest = new HTTPRequest(GameShell.signlink, JagString.join(new JagString[] { field3983, JagString.parseInt(Client.lang), field915}).toURL());
			} else {
				byte[] var0 = gameworldListDownloadRequest.getData();
				if (var0 != null) {
					Packet var1 = new Packet(var0);
					num = var1.g2();
					list = new WorldEntry[num];
					for (int var2 = 0; var2 < num; var2++) {
						WorldEntry var3 = list[var2] = new WorldEntry();
						int var4 = var1.g2();
						var3.id = var4 & 0x7FFF;
						var3.members = (var4 & 0x8000) != 0;
						var3.host = var1.gjstr();
						var3.players = var1.g2b();
						var3.index = var2;
						var3.country = getCountry(var1.g2());
					}
					quickSort(0, list, list.length - 1);
					switchScreen = true;
					gameworldListDownloadRequest = null;
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			gameworldListDownloadRequest = null;
		}
	}

	@ObfuscatedName("pd.a(I[Lgd;II)V")
	public static void quickSort(int arg0, WorldEntry[] arg1, int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		int var3 = arg0 - 1;
		int var4 = (arg0 + arg2) / 2;
		int var5 = arg2 + 1;
		WorldEntry var6 = arg1[var4];
		arg1[var4] = arg1[arg0];
		arg1[arg0] = var6;
		while (var3 < var5) {
			boolean var7 = true;
			do {
				var5--;
				for (int var8 = 0; var8 < 4; var8++) {
					int var9;
					int var10;
					if (ordering[var8] == 2) {
						var10 = arg1[var5].index;
						var9 = var6.index;
					} else if (ordering[var8] == 1) {
						var9 = var6.players;
						if (var9 == -1 && dirs[var8] == 1) {
							var9 = 2001;
						}
						var10 = arg1[var5].players;
						if (var10 == -1 && dirs[var8] == 1) {
							var10 = 2001;
						}
					} else if (ordering[var8] == 3) {
						var10 = arg1[var5].members ? 1 : 0;
						var9 = var6.members ? 1 : 0;
					} else {
						var10 = arg1[var5].id;
						var9 = var6.id;
					}
					if (var10 != var9) {
						if ((dirs[var8] != 1 || var10 <= var9) && (dirs[var8] != 0 || var10 >= var9)) {
							var7 = false;
						}
						break;
					}
					if (var8 == 3) {
						var7 = false;
					}
				}
			} while (var7);
			boolean var11 = true;
			do {
				var3++;
				for (int var12 = 0; var12 < 4; var12++) {
					int var13;
					int var14;
					if (ordering[var12] == 2) {
						var13 = arg1[var3].index;
						var14 = var6.index;
					} else if (ordering[var12] == 1) {
						var13 = arg1[var3].players;
						if (var13 == -1 && dirs[var12] == 1) {
							var13 = 2001;
						}
						var14 = var6.players;
						if (var14 == -1 && dirs[var12] == 1) {
							var14 = 2001;
						}
					} else if (ordering[var12] == 3) {
						var13 = arg1[var3].members ? 1 : 0;
						var14 = var6.members ? 1 : 0;
					} else {
						var13 = arg1[var3].id;
						var14 = var6.id;
					}
					if (var13 != var14) {
						if ((dirs[var12] != 1 || var13 >= var14) && (dirs[var12] != 0 || var13 <= var14)) {
							var11 = false;
						}
						break;
					}
					if (var12 == 3) {
						var11 = false;
					}
				}
			} while (var11);
			if (var5 > var3) {
				WorldEntry var15 = arg1[var3];
				arg1[var3] = arg1[var5];
				arg1[var5] = var15;
			}
		}
		quickSort(arg0, arg1, var5);
		quickSort(var5 + 1, arg1, arg2);
	}

	@ObfuscatedName("ib.a(III)V")
	public static void listReorder(int arg0, int arg1) {
		int[] var2 = new int[4];
		int var3 = 1;
		int[] var4 = new int[4];
		var4[0] = arg0;
		var2[0] = arg1;
		for (int var5 = 0; var5 < 4; var5++) {
			if (arg0 != ordering[var5]) {
				var4[var3] = ordering[var5];
				var2[var3] = dirs[var5];
				var3++;
			}
		}
		dirs = var2;
		ordering = var4;
		quickSort(0, list, list.length - 1);
	}

	@ObfuscatedName("fi.a(Lhj;B)V")
	public static void worldSwitchLoop(GameShell arg0) {
		if (ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		if (ClientMouseListener.mouseClickX >= 280 && ClientMouseListener.mouseClickX <= 294 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 295 && ClientMouseListener.mouseClickX <= 360 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(0, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 390 && ClientMouseListener.mouseClickX <= 404 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 405 && ClientMouseListener.mouseClickX <= 470 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(1, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 500 && ClientMouseListener.mouseClickX <= 514 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(2, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 515 && ClientMouseListener.mouseClickX <= 580 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(2, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 610 && ClientMouseListener.mouseClickX <= 624 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(3, 0);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 625 && ClientMouseListener.mouseClickX <= 690 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickY <= 18) {
			listReorder(3, 1);
			return;
		}
		if (ClientMouseListener.mouseClickX >= 700 && ClientMouseListener.mouseClickY >= 4 && ClientMouseListener.mouseClickX <= 758 && ClientMouseListener.mouseClickY <= 20) {
			switchScreen = false;
			drawBack();
			return;
		}
		if (slLastWorld != -1) {
			WorldEntry var1 = list[slLastWorld];
			if (Client.memServer == var1.members) {
				byte[] var2 = JagString.join(new JagString[]{var1.host, field3922}).copy();
				Client.loginHost = new String(var2, 0, var2.length);
				Client.worldid = var1.id;
				if (Client.modewhere != 0) {
					Client.loginJs5Port = 443;
					Client.modewhere = 0;
					Client.loginPort = 43594;
					Client.loginGamePort = 43594;
				}
				switchScreen = false;
				drawBack();
				return;
			}
			JagString var3 = JagString.join(new JagString[]{AUTO_PROTOCOL, var1.host, AUTO_DOMAIN, JagString.parseInt(Client.lang), AUTO_ANDL, JagString.parseInt(Client.lowMem ? 1 : 0), AUTO_ANDP, JagString.parseInt(Client.plug), AUTO_ANDJS, JagString.parseInt(Client.js)});
			try {
				arg0.getAppletContext().showDocument(var3.toURL(), "_self");
			} catch (Exception var4) {
			}
		}
	}

    @ObfuscatedName("o.a(Lnb;Lnb;ILnb;)V")
    public static void getGroupIds(Js5 arg0, Js5 arg1, Js5 arg2) {
        titleJpgId = arg1.getGroupId(AUTO_TITLEJPG);
        logoId = arg2.getGroupId(AUTO_LOGO);
        titleboxId = arg2.getGroupId(AUTO_TITLEBOX);
        titlebuttonId = arg2.getGroupId(AUTO_TITLEBUTTON);
        runesId = arg2.getGroupId(AUTO_RUNES);
        titleMuteId = arg2.getGroupId(AUTO_TITLE_MUTE);
        slBackId = arg2.getGroupId(AUTO_SL_BACK);
        slFlagsId = arg2.getGroupId(AUTO_SL_FLAGS);
        slArrowsId = arg2.getGroupId(AUTO_SL_ARROWS);
        slStarsId = arg2.getGroupId(AUTO_SL_STARS);
        slButtonId = arg2.getGroupId(AUTO_SL_BUTTON);
        scapeMainId = arg0.getGroupId(AUTO_SCAPE_MAIN);
    }

	@ObfuscatedName("uj.a(IIBI)I")
	public static int merge(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * var3 + arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + var3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@ObfuscatedName("ea.a(Lnb;BLnb;)I")
	public static int ready(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg0.requestDownload(titleJpgId)) {
			var2++;
		}
		if (arg1.requestDownload(logoId)) {
			var2++;
		}
		if (arg1.requestDownload(titleboxId)) {
			var2++;
		}
		if (arg1.requestDownload(titlebuttonId)) {
			var2++;
		}
		if (arg1.requestDownload(runesId)) {
			var2++;
		}
		if (arg1.requestDownload(titleMuteId)) {
			var2++;
		}
		arg1.requestDownload(slBackId);
		arg1.requestDownload(slFlagsId);
		arg1.requestDownload(slArrowsId);
		arg1.requestDownload(slStarsId);
		arg1.requestDownload(slButtonId);
		return var2;
	}

	@ObfuscatedName("hb.b(II)I")
	public static int getCountry(int arg0) {
		if (Client.lang == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("jf.c(B)I")
	public static int readyMax() {
		return 6;
	}
}
