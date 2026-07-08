package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("d")
public final class IfType {

	@ObfuscatedName("d.a")
	public final byte field65 = 4;

	@ObfuscatedName("d.b")
	public int field66;

	@ObfuscatedName("d.c")
	public static IfType[] list;

	@ObfuscatedName("d.d")
	public int[] linkObjType;

	@ObfuscatedName("d.e")
	public int[] linkObjNumber;

	@ObfuscatedName("d.f")
	public int animFrame;

	@ObfuscatedName("d.g")
	public int animCycle;

	@ObfuscatedName("d.h")
	public int id;

	@ObfuscatedName("d.i")
	public int layerId;

	@ObfuscatedName("d.j")
	public int type;

	@ObfuscatedName("d.k")
	public int buttonType;

	@ObfuscatedName("d.l")
	public int clientCode;

	@ObfuscatedName("d.m")
	public int width;

	@ObfuscatedName("d.n")
	public int height;

	@ObfuscatedName("d.o")
	public byte trans;

	@ObfuscatedName("d.p")
	public int field80;

	@ObfuscatedName("d.q")
	public int field81;

	@ObfuscatedName("d.r")
	public int[][] scripts;

	@ObfuscatedName("d.s")
	public int[] scriptComparator;

	@ObfuscatedName("d.t")
	public int[] scriptOperand;

	@ObfuscatedName("d.u")
	public int overLayerId;

	@ObfuscatedName("d.v")
	public int scrollHeight;

	@ObfuscatedName("d.w")
	public int scrollPos;

	@ObfuscatedName("d.x")
	public boolean hide;

	@ObfuscatedName("d.y")
	public int[] children;

	@ObfuscatedName("d.z")
	public int[] childX;

	@ObfuscatedName("d.ab")
	public int model1Id;

	@ObfuscatedName("d.bb")
	public int model2Type;

	@ObfuscatedName("d.cb")
	public int model2Id;

	@ObfuscatedName("d.db")
	public int modelAnim;

	@ObfuscatedName("d.eb")
	public int modelAnim2;

	@ObfuscatedName("d.fb")
	public int modelZoom;

	@ObfuscatedName("d.gb")
	public int modelXAn;

	@ObfuscatedName("d.hb")
	public int modelYAn;

	@ObfuscatedName("d.ib")
	public String targetVerb;

	@ObfuscatedName("d.jb")
	public String targetBase;

	@ObfuscatedName("d.kb")
	public int targetMask;

	@ObfuscatedName("d.lb")
	public String buttonText;

	@ObfuscatedName("d.mb")
	public static final LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("d.nb")
	public static LruCache spriteCache;

	@ObfuscatedName("d.T")
	public int colour;

	@ObfuscatedName("d.U")
	public int colour2;

	@ObfuscatedName("d.V")
	public int colourOver;

	@ObfuscatedName("d.W")
	public int colour2Over;

	@ObfuscatedName("d.Z")
	public int model1Type;

	@ObfuscatedName("d.B")
	public int field92;

	@ObfuscatedName("d.H")
	public int marginX;

	@ObfuscatedName("d.I")
	public int marginY;

	@ObfuscatedName("d.X")
	public Pix32 graphic;

	@ObfuscatedName("d.Y")
	public Pix32 graphic2;

	@ObfuscatedName("d.Q")
	public PixFont font;

	@ObfuscatedName("d.R")
	public String text;

	@ObfuscatedName("d.S")
	public String text2;

	@ObfuscatedName("d.N")
	public boolean fill;

	@ObfuscatedName("d.O")
	public boolean centre;

	@ObfuscatedName("d.P")
	public boolean shadow;

	@ObfuscatedName("d.C")
	public boolean field93;

	@ObfuscatedName("d.D")
	public boolean objSwap;

	@ObfuscatedName("d.E")
	public boolean objOps;

	@ObfuscatedName("d.F")
	public boolean objUse;

	@ObfuscatedName("d.G")
	public boolean objReplace;

	@ObfuscatedName("d.K")
	public int[] invBackgroundX;

	@ObfuscatedName("d.L")
	public int[] invBackgroundY;

	@ObfuscatedName("d.A")
	public int[] childY;

	@ObfuscatedName("d.J")
	public Pix32[] invBackground;

	@ObfuscatedName("d.M")
	public String[] iop;

	@ObfuscatedName("d.a([Lkb;Lxb;ILxb;)V")
	public static void unpack(PixFont[] arg0, JagFile arg1, JagFile arg2) {
		spriteCache = new LruCache((byte) 7, 50000);
		Packet var3 = new Packet(arg2.read("data", null), 15787);
		int var4 = -1;
		int var5 = var3.g2();
		list = new IfType[var5];
		while (true) {
			IfType var7;
			do {
				if (var3.pos >= var3.data.length) {
					spriteCache = null;
					return;
				}
				int var6 = var3.g2();
				if (var6 == 65535) {
					var4 = var3.g2();
					var6 = var3.g2();
				}
				var7 = list[var6] = new IfType();
				var7.id = var6;
				var7.layerId = var4;
				var7.type = var3.g1();
				var7.buttonType = var3.g1();
				var7.clientCode = var3.g2();
				var7.width = var3.g2();
				var7.height = var3.g2();
				var7.trans = (byte) var3.g1();
				var7.overLayerId = var3.g1();
				if (var7.overLayerId == 0) {
					var7.overLayerId = -1;
				} else {
					var7.overLayerId = (var7.overLayerId - 1 << 8) + var3.g1();
				}
				int var8 = var3.g1();
				if (var8 > 0) {
					var7.scriptComparator = new int[var8];
					var7.scriptOperand = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.scriptComparator[var9] = var3.g1();
						var7.scriptOperand[var9] = var3.g2();
					}
				}
				int var10 = var3.g1();
				if (var10 > 0) {
					var7.scripts = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.g2();
						var7.scripts[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.scripts[var11][var13] = var3.g2();
						}
					}
				}
				if (var7.type == 0) {
					var7.scrollHeight = var3.g2();
					var7.hide = var3.g1() == 1;
					int var14 = var3.g2();
					var7.children = new int[var14];
					var7.childX = new int[var14];
					var7.childY = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.children[var15] = var3.g2();
						var7.childX[var15] = var3.g2b();
						var7.childY[var15] = var3.g2b();
					}
				}
				if (var7.type == 1) {
					var7.field92 = var3.g2();
					var7.field93 = var3.g1() == 1;
				}
				if (var7.type == 2) {
					var7.linkObjType = new int[var7.width * var7.height];
					var7.linkObjNumber = new int[var7.width * var7.height];
					var7.objSwap = var3.g1() == 1;
					var7.objOps = var3.g1() == 1;
					var7.objUse = var3.g1() == 1;
					var7.objReplace = var3.g1() == 1;
					var7.marginX = var3.g1();
					var7.marginY = var3.g1();
					var7.invBackgroundX = new int[20];
					var7.invBackgroundY = new int[20];
					var7.invBackground = new Pix32[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.g1();
						if (var17 == 1) {
							var7.invBackgroundX[var16] = var3.g2b();
							var7.invBackgroundY[var16] = var3.g2b();
							String var18 = var3.gstr();
							if (arg1 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.invBackground[var16] = getSprite(Integer.parseInt(var18.substring(var19 + 1)), arg1, var18.substring(0, var19));
							}
						}
					}
					var7.iop = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.iop[var20] = var3.gstr();
						if (var7.iop[var20].length() == 0) {
							var7.iop[var20] = null;
						}
					}
				}
				if (var7.type == 3) {
					var7.fill = var3.g1() == 1;
				}
				if (var7.type == 4 || var7.type == 1) {
					var7.centre = var3.g1() == 1;
					int var21 = var3.g1();
					if (arg0 != null) {
						var7.font = arg0[var21];
					}
					var7.shadow = var3.g1() == 1;
				}
				if (var7.type == 4) {
					var7.text = var3.gstr();
					var7.text2 = var3.gstr();
				}
				if (var7.type == 1 || var7.type == 3 || var7.type == 4) {
					var7.colour = var3.g4();
				}
				if (var7.type == 3 || var7.type == 4) {
					var7.colour2 = var3.g4();
					var7.colourOver = var3.g4();
					var7.colour2Over = var3.g4();
				}
				if (var7.type == 5) {
					String var22 = var3.gstr();
					if (arg1 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.graphic = getSprite(Integer.parseInt(var22.substring(var23 + 1)), arg1, var22.substring(0, var23));
					}
					String var24 = var3.gstr();
					if (arg1 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.graphic2 = getSprite(Integer.parseInt(var24.substring(var25 + 1)), arg1, var24.substring(0, var25));
					}
				}
				if (var7.type == 6) {
					int var26 = var3.g1();
					if (var26 != 0) {
						var7.model1Type = 1;
						var7.model1Id = (var26 - 1 << 8) + var3.g1();
					}
					int var27 = var3.g1();
					if (var27 != 0) {
						var7.model2Type = 1;
						var7.model2Id = (var27 - 1 << 8) + var3.g1();
					}
					int var28 = var3.g1();
					if (var28 == 0) {
						var7.modelAnim = -1;
					} else {
						var7.modelAnim = (var28 - 1 << 8) + var3.g1();
					}
					int var29 = var3.g1();
					if (var29 == 0) {
						var7.modelAnim2 = -1;
					} else {
						var7.modelAnim2 = (var29 - 1 << 8) + var3.g1();
					}
					var7.modelZoom = var3.g2();
					var7.modelXAn = var3.g2();
					var7.modelYAn = var3.g2();
				}
				if (var7.type == 7) {
					var7.linkObjType = new int[var7.width * var7.height];
					var7.linkObjNumber = new int[var7.width * var7.height];
					var7.centre = var3.g1() == 1;
					int var30 = var3.g1();
					if (arg0 != null) {
						var7.font = arg0[var30];
					}
					var7.shadow = var3.g1() == 1;
					var7.colour = var3.g4();
					var7.marginX = var3.g2b();
					var7.marginY = var3.g2b();
					var7.objOps = var3.g1() == 1;
					var7.iop = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.iop[var31] = var3.gstr();
						if (var7.iop[var31].length() == 0) {
							var7.iop[var31] = null;
						}
					}
				}
				if (var7.buttonType == 2 || var7.type == 2) {
					var7.targetVerb = var3.gstr();
					var7.targetBase = var3.gstr();
					var7.targetMask = var3.g2();
				}
			} while (var7.buttonType != 1 && var7.buttonType != 4 && var7.buttonType != 5 && var7.buttonType != 6);
			var7.buttonText = var3.gstr();
			if (var7.buttonText.length() == 0) {
				if (var7.buttonType == 1) {
					var7.buttonText = "Ok";
				}
				if (var7.buttonType == 4) {
					var7.buttonText = "Select";
				}
				if (var7.buttonType == 5) {
					var7.buttonText = "Select";
				}
				if (var7.buttonType == 6) {
					var7.buttonText = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(ILeb;II)V")
	public static void cacheModel(Model arg0) {
		modelCache.clear();
		if (arg0 != null) {
			modelCache.put((long) 327680, arg0);
		}
	}

	@ObfuscatedName("d.a(ZILxb;Ljava/lang/String;)Lib;")
	public static Pix32 getSprite(int arg0, JagFile arg1, String arg2) {
		long var3 = (JString.hashCode(arg2) << 8) + (long) arg0;
		Pix32 var5 = (Pix32) spriteCache.find(var3);
		if (var5 == null) {
			try {
				Pix32 var6 = new Pix32(arg1, arg2, arg0);
				spriteCache.put(var3, var6);
				return var6;
			} catch (Exception var7) {
				return null;
			}
		} else {
			return var5;
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = linkObjType[arg1];
		linkObjType[arg1] = linkObjType[arg0];
		linkObjType[arg0] = var3;
		int var4 = linkObjNumber[arg1];
		linkObjNumber[arg1] = linkObjNumber[arg0];
		linkObjNumber[arg0] = var4;
	}

	@ObfuscatedName("d.a(IIIZ)Leb;")
	public Model getTempModel(int arg0, int arg1, boolean arg2) {
		Model var4;
		if (arg2) {
			var4 = getModel(model2Type, model2Id);
		} else {
			var4 = getModel(model1Type, model1Id);
		}
		if (var4 == null) {
			return null;
		} else if (arg1 == -1 && arg0 == -1 && var4.faceColour == null) {
			return var4;
		} else {
			Model var5 = new Model(var4, AnimFrame.animateTransparencies(arg1) & AnimFrame.animateTransparencies(arg0), false, field66, true);
			if (arg1 != -1 || arg0 != -1) {
				var5.prepareAnim();
			}
			if (arg1 != -1) {
				var5.animate(arg1);
			}
			if (arg0 != -1) {
				var5.animate(arg0);
			}
			var5.calculateNormals(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("d.a(II)Leb;")
	public Model getModel(int arg0, int arg1) {
		Model var3 = (Model) modelCache.find((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.load(arg1, field65);
		}
		if (arg0 == 2) {
			var3 = NpcType.list(arg1).getHeadModel();
		}
		if (arg0 == 3) {
			var3 = Client.localPlayer.getHeadModel();
		}
		if (arg0 == 4) {
			var3 = ObjType.list(arg1).getModelUnlit(50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			modelCache.put((long) ((arg0 << 16) + arg1), var3);
		}
		return var3;
	}
}
