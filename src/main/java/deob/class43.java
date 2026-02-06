package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;

@ObfuscatedName("g")
public final class class43 extends class48 implements ImageProducer, ImageObserver {

	@ObfuscatedName("g.u")
	public ColorModel field984;

	@ObfuscatedName("g.B")
	public static int field990 = 0;

	@ObfuscatedName("g.C")
	public static class32 field991 = class73.method593("You can(Wt add yourself to your own ignore list", true);

	@ObfuscatedName("g.Q")
	public static class32 field1005 = class73.method593("Loaded config", true);

	@ObfuscatedName("g.P")
	public static class32 field1004 = field1005;

	@ObfuscatedName("g.L")
	public static class32 field1000 = class73.method593("::errortest", true);

	@ObfuscatedName("g.H")
	public static class32 field996 = class73.method593("<)4col>", true);

	@ObfuscatedName("g.U")
	public static class32 field1009 = field991;

	@ObfuscatedName("g.R")
	public static class32 field1006 = class73.method593("and choose the (Wcreate account(W", true);

	@ObfuscatedName("g.O")
	public static class32 field1003 = field1006;

	@ObfuscatedName("g.N")
	public static int field1002;

	@ObfuscatedName("g.z")
	public static int field989;

	@ObfuscatedName("g.I")
	public static int field997;

	@ObfuscatedName("g.K")
	public ImageConsumer field999;

	@ObfuscatedName("g.J")
	public static int[] field998;

	@ObfuscatedName("g.b(I)V")
	public static void method329() {
		try {
			if (class52.field1177 == 0) {
				if (class143.field3273 != null) {
					class143.field3273.method52();
					class143.field3273 = null;
				}
				class39.field938 = 0;
				class11.field174 = null;
				class82.field1918 = false;
				class52.field1177 = 1;
			}
			if (class52.field1177 == 1) {
				if (class11.field174 == null) {
					class11.field174 = class154.field3516.method181(class151.field3465, class39.field940);
				}
				if (class11.field174.field355 == 2) {
					throw new IOException();
				}
				if (class11.field174.field355 == 1) {
					class143.field3273 = new class8((Socket) class11.field174.field352, class154.field3516);
					class11.field174 = null;
					class52.field1177 = 2;
				}
			}
			if (class52.field1177 == 2) {
				long var0 = class98.field2259 = class74.field1751.method259();
				int var2 = (int) (var0 >> 16 & 0x1FL);
				class44.field1026.field1568 = 0;
				class44.field1026.method514(14);
				class44.field1026.method514(var2);
				class143.field3273.method49(class44.field1026.field1586, 2);
				class52.field1177 = 3;
				class158.field3612.field1568 = 0;
			}
			if (class52.field1177 == 3) {
				if (class36.field744 != null) {
					class36.field744.method892();
				}
				if (class29.field525 != null) {
					class29.field525.method892();
				}
				int var3 = class143.field3273.method46();
				if (class36.field744 != null) {
					class36.field744.method892();
				}
				if (class29.field525 != null) {
					class29.field525.method892();
				}
				if (var3 != 0) {
					class66.method542(var3);
					return;
				}
				class158.field3612.field1568 = 0;
				class52.field1177 = 4;
			}
			if (class52.field1177 == 4) {
				if (class158.field3612.field1568 < 8) {
					int var4 = class143.field3273.method51();
					if (var4 > 8 - class158.field3612.field1568) {
						var4 = 8 - class158.field3612.field1568;
					}
					if (var4 > 0) {
						class143.field3273.method50(class158.field3612.field1568, class158.field3612.field1586, var4);
						class158.field3612.field1568 += var4;
					}
				}
				if (class158.field3612.field1568 == 8) {
					class158.field3612.field1568 = 0;
					class103.field2404 = class158.field3612.method527();
					class52.field1177 = 5;
				}
			}
			if (class52.field1177 == 5) {
				class44.field1026.field1568 = 0;
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class103.field2404 >> 32), (int) class103.field2404 };
				class44.field1026.method514(10);
				class44.field1026.method530(var5[0]);
				class44.field1026.method530(var5[1]);
				class44.field1026.method530(var5[2]);
				class44.field1026.method530(var5[3]);
				class44.field1026.method541(class74.field1751.method259());
				class44.field1026.method521(class74.field1738);
				class44.field1026.method552(class151.field3453, class64.field1486);
				class139.field3202.field1568 = 0;
				if (class134.field3114 == 40) {
					class139.field3202.method514(18);
				} else {
					class139.field3202.method514(16);
				}
				class139.field3202.method514(class44.field1026.field1568 + 93);
				class139.field3202.method530(468);
				class139.field3202.method514(class154.field3529 ? 1 : 0);
				class146.method1093(class139.field3202);
				class139.field3202.method530(class92.field2124.field565);
				class139.field3202.method530(class38.field923.field565);
				class139.field3202.method530(class64.field1488.field565);
				class139.field3202.method530(class66.field1532.field565);
				class139.field3202.method530(class1.field6.field565);
				class139.field3202.method530(class134.field3115.field565);
				class139.field3202.method530(class124.field2887.field565);
				class139.field3202.method530(class147.field3346.field565);
				class139.field3202.method530(class30.field572.field565);
				class139.field3202.method530(class82.field1920.field565);
				class139.field3202.method530(class72.field1701.field565);
				class139.field3202.method530(class98.field2268.field565);
				class139.field3202.method530(class98.field2246.field565);
				class139.field3202.method530(class157.field3596.field565);
				class139.field3202.method530(class103.field2424.field565);
				class139.field3202.method530(class146.field3317.field565);
				class139.field3202.method543(class44.field1026.field1568, class44.field1026.field1586);
				class143.field3273.method49(class139.field3202.field1586, class139.field3202.field1568);
				class44.field1026.method359(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				class158.field3612.method359(var5);
				class52.field1177 = 6;
			}
			if (class52.field1177 == 6 && class143.field3273.method51() > 0) {
				int var7 = class143.field3273.method46();
				if (var7 == 21 && class134.field3114 == 20) {
					class52.field1177 = 7;
				} else if (var7 == 2) {
					class52.field1177 = 9;
				} else if (var7 == 15 && class134.field3114 == 40) {
					class53.method418();
					return;
				} else if (var7 == 23 && class132.field3033 < 1) {
					class52.field1177 = 0;
					class132.field3033++;
				} else {
					class66.method542(var7);
					return;
				}
			}
			if (class52.field1177 == 7 && class143.field3273.method51() > 0) {
				class117.field2795 = class143.field3273.method46() * 60 + 180;
				class52.field1177 = 8;
			}
			if (class52.field1177 == 8) {
				class39.field938 = 0;
				class114.method891(class81.field1873, class52.method402(new class32[] { class159.method1228(class117.field2795 / 60), class27.field481 }), class15.field309);
				if (--class117.field2795 <= 0) {
					class52.field1177 = 0;
				}
			} else {
				if (class52.field1177 == 9 && class143.field3273.method51() >= 8) {
					class145.field3301 = class143.field3273.method46();
					class109.field2553 = class143.field3273.method46() == 1;
					class37.field891 = class143.field3273.method46();
					class37.field891 <<= 0x8;
					class37.field891 += class143.field3273.method46();
					class158.field3608 = class143.field3273.method46();
					class143.field3273.method50(0, class158.field3612.field1586, 1);
					class158.field3612.field1568 = 0;
					class86.field2004 = class158.field3612.method350();
					class143.field3273.method50(0, class158.field3612.field1586, 2);
					class158.field3612.field1568 = 0;
					class115.field2700 = class158.field3612.method531();
					class52.field1177 = 10;
				}
				if (class52.field1177 != 10) {
					class39.field938++;
					if (class39.field938 > 2000) {
						if (class132.field3033 < 1) {
							if (class39.field940 == class26.field473) {
								class39.field940 = class13.field223;
							} else {
								class39.field940 = class26.field473;
							}
							class52.field1177 = 0;
							class132.field3033++;
						} else {
							class66.method542(-3);
						}
					}
				} else if (class143.field3273.method51() >= class115.field2700) {
					class158.field3612.field1568 = 0;
					class143.field3273.method50(0, class158.field3612.field1586, class115.field2700);
					class128.method993();
					class62.field1422 = -1;
					class4.method16(false);
					class86.field2004 = -1;
				}
			}
		} catch (IOException var8) {
			if (class132.field3033 < 1) {
				class132.field3033++;
				if (class26.field473 == class39.field940) {
					class39.field940 = class13.field223;
				} else {
					class39.field940 = class26.field473;
				}
				class52.field1177 = 0;
			} else {
				class66.method542(-2);
			}
		}
	}

	@ObfuscatedName("g.c(I)V")
	public static void method330() {
		for (int var0 = 0; var0 < class61.field1352; var0++) {
			int var1 = class62.field1418[var0];
			class70 var2 = class52.field1175[var1];
			int var3 = class158.field3612.method532();
			if ((var3 & 0x80) != 0) {
				var3 += class158.field3612.method532() << 8;
			}
			method333(var2, var1, var3);
		}
	}

	@ObfuscatedName("g.a(BLka;II)V")
	public static void method333(class70 arg0, int arg1, int arg2) {
		if ((arg2 & 0x400) != 0) {
			arg0.field2731 = class158.field3612.method519();
			int var3 = class158.field3612.method525();
			arg0.field2704 = class140.field3217 + (var3 & 0xFFFF);
			arg0.field2727 = var3 >> 16;
			if (arg0.field2731 == 65535) {
				arg0.field2731 = -1;
			}
			arg0.field2701 = 0;
			arg0.field2754 = 0;
			if (class140.field3217 < arg0.field2704) {
				arg0.field2754 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			int var4 = class158.field3612.method529();
			int var5 = class158.field3612.method532();
			arg0.method906(class140.field3217, var5, var4);
			arg0.field2691 = class140.field3217 + 300;
			arg0.field2755 = class158.field3612.method535();
			arg0.field2738 = class158.field3612.method529();
		}
		if ((arg2 & 0x4) != 0) {
			int var6 = class158.field3612.method531();
			int var7 = class158.field3612.method520();
			if (var6 == 65535) {
				var6 = -1;
			}
			class134.method1023(var7, arg0, var6);
		}
		if ((arg2 & 0x10) != 0) {
			int var8 = class158.field3612.method519();
			int var9 = class158.field3612.method532();
			int var10 = class158.field3612.method535();
			int var11 = class158.field3612.field1568;
			if (arg0.field1659 != null && arg0.field1631 != null) {
				boolean var12 = false;
				long var13 = arg0.field1659.method259();
				if (var9 <= 1) {
					for (int var15 = 0; var15 < class106.field2504; var15++) {
						if (var13 == class103.field2407[var15]) {
							var12 = true;
							break;
						}
					}
				}
				if (!var12 && class97.field2230 == 0) {
					class130.field2990.field1568 = 0;
					class158.field3612.method557(var10, class130.field2990.field1586);
					class130.field2990.field1568 = 0;
					class32 var16 = class99.method771(class129.method996(class130.field2990).method258());
					arg0.field2721 = var16.method275();
					arg0.field2706 = 150;
					arg0.field2753 = var8 >> 8;
					arg0.field2749 = var8 & 0xFF;
					if (var9 == 2 || var9 == 3) {
						class79.method628(var16, 1, class52.method402(new class32[] { class145.field3304, arg0.field1659 }));
					} else if (var9 == 1) {
						class79.method628(var16, 1, class52.method402(new class32[] { class143.field3278, arg0.field1659 }));
					} else {
						class79.method628(var16, 2, arg0.field1659);
					}
				}
			}
			class158.field3612.field1568 = var10 + var11;
		}
		if ((arg2 & 0x200) != 0) {
			arg0.field2710 = class158.field3612.method520();
			arg0.field2717 = class158.field3612.method520();
			arg0.field2690 = class158.field3612.method532();
			arg0.field2740 = class158.field3612.method520();
			arg0.field2730 = class158.field3612.method519() + class140.field3217;
			arg0.field2724 = class158.field3612.method531() + class140.field3217;
			arg0.field2751 = class158.field3612.method532();
			arg0.field2696 = 1;
			arg0.field2748 = 0;
		}
		if ((arg2 & 0x100) != 0) {
			int var17 = class158.field3612.method535();
			int var18 = class158.field3612.method520();
			arg0.method906(class140.field3217, var18, var17);
			arg0.field2691 = class140.field3217 + 300;
			arg0.field2755 = class158.field3612.method532();
			arg0.field2738 = class158.field3612.method529();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.field2721 = class158.field3612.method555();
			if (arg0.field2721.method260(0) == 126) {
				arg0.field2721 = arg0.field2721.method268(1);
				class79.method628(arg0.field2721, 2, arg0.field1659);
			} else if (arg0 == class20.field373) {
				class79.method628(arg0.field2721, 2, arg0.field1659);
			}
			arg0.field2706 = 150;
			arg0.field2749 = 0;
			arg0.field2753 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			arg0.field2756 = class158.field3612.method519();
			if (arg0.field2756 == 65535) {
				arg0.field2756 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			int var19 = class158.field3612.method535();
			byte[] var20 = new byte[var19];
			class66 var21 = new class66(var20);
			class158.field3612.method539(var20, var19);
			class143.field3262[arg1] = var21;
			arg0.method576(var21);
		}
		if ((arg2 & 0x1) != 0) {
			arg0.field2741 = class158.field3612.method519();
			arg0.field2697 = class158.field3612.method524();
		}
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field999 == arg0;
	}

	@ObfuscatedName("g.a(Ljava/awt/Graphics;III)V")
	@Override
	public void method122(Graphics arg0) {
		this.method334();
		arg0.drawImage(super.field1121, 0, 0, this);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.field999) {
			this.field999 = null;
		}
	}

	@ObfuscatedName("g.a(IIIII)V")
	public synchronized void method332(int arg0, int arg1, int arg2, int arg3) {
		if (this.field999 != null) {
			this.field999.setPixels(arg0, arg3, arg1, arg2, this.field984, super.field1124, super.field1120 * arg3 + arg0, super.field1120);
			this.field999.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@ObfuscatedName("g.b(Z)V")
	public synchronized void method334() {
		if (this.field999 != null) {
			this.field999.setPixels(0, 0, super.field1120, super.field1122, this.field984, super.field1124, 0, super.field1120);
			this.field999.imageComplete(2);
		}
	}

	@ObfuscatedName("g.a(IIILjava/awt/Component;)V")
	@Override
	public void method123(int arg0, int arg1, Component arg2) {
		super.field1124 = new int[arg1 * arg0 + 1];
		super.field1120 = arg1;
		super.field1122 = arg0;
		this.field984 = new DirectColorModel(32, 16711680, 65280, 255);
		super.field1121 = arg2.createImage(this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method361();
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field999 = arg0;
		arg0.setDimensions(super.field1120, super.field1122);
		arg0.setProperties(null);
		arg0.setColorModel(this.field984);
		arg0.setHints(14);
	}

	@ObfuscatedName("g.a(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method124(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method332(arg3, arg1, arg2, arg4);
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(super.field1121, 0, 0, this);
		arg0.setClip(var6);
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
