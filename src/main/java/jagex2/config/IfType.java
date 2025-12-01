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
public class IfType {

	@ObfuscatedName("d.c")
	public static IfType[] list;

	@ObfuscatedName("d.d")
	public int[] linkObjType;

	@ObfuscatedName("d.e")
	public int[] linkObjCount;

	@ObfuscatedName("d.f")
	public int seqFrame;

	@ObfuscatedName("d.g")
	public int seqCycle;

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
	public byte transparency;

	@ObfuscatedName("d.p")
	public int x;

	@ObfuscatedName("d.q")
	public int y;

	@ObfuscatedName("d.r")
	public int[][] scripts;

	@ObfuscatedName("d.s")
	public int[] scriptComparator;

	@ObfuscatedName("d.t")
	public int[] scriptOperand;

	@ObfuscatedName("d.u")
	public int overlayer;

	@ObfuscatedName("d.v")
	public int scrollSize;

	@ObfuscatedName("d.w")
	public int scrollPosition;

	@ObfuscatedName("d.x")
	public boolean hidden;

	@ObfuscatedName("d.y")
	public int[] children;

	@ObfuscatedName("d.z")
	public int[] childX;

	@ObfuscatedName("d.ab")
	public int modelId;

	@ObfuscatedName("d.bb")
	public int model2Type;

	@ObfuscatedName("d.cb")
	public int model2Id;

	@ObfuscatedName("d.db")
	public int modelAnim;

	@ObfuscatedName("d.eb")
	public int model2Anim;

	@ObfuscatedName("d.fb")
	public int modelZoom;

	@ObfuscatedName("d.gb")
	public int modelXAn;

	@ObfuscatedName("d.hb")
	public int modelYAn;

	@ObfuscatedName("d.ib")
	public String targetVerb;

	@ObfuscatedName("d.jb")
	public String targetText;

	@ObfuscatedName("d.kb")
	public int targetMask;

	@ObfuscatedName("d.lb")
	public String option;

	@ObfuscatedName("d.mb")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("d.nb")
	public static LruCache imageCache;

	@ObfuscatedName("d.H")
	public int marginX;

	@ObfuscatedName("d.I")
	public int marginY;

	@ObfuscatedName("d.T")
	public int colour;

	@ObfuscatedName("d.U")
	public int colour2;

	@ObfuscatedName("d.V")
	public int colourOver;

	@ObfuscatedName("d.W")
	public int colour2Over;

	@ObfuscatedName("d.Z")
	public int modelType;

	@ObfuscatedName("d.B")
	public int field95;

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

	@ObfuscatedName("d.G")
	public boolean swappable;

	@ObfuscatedName("d.N")
	public boolean fill;

	@ObfuscatedName("d.O")
	public boolean center;

	@ObfuscatedName("d.P")
	public boolean shadowed;

	@ObfuscatedName("d.C")
	public boolean field96;

	@ObfuscatedName("d.D")
	public boolean draggable;

	@ObfuscatedName("d.E")
	public boolean interactable;

	@ObfuscatedName("d.F")
	public boolean usable;

	@ObfuscatedName("d.K")
	public int[] invSlotOffsetX;

	@ObfuscatedName("d.L")
	public int[] invSlotOffsetY;

	@ObfuscatedName("d.A")
	public int[] childY;

	@ObfuscatedName("d.J")
	public Pix32[] invSlotGraphic;

	@ObfuscatedName("d.M")
	public String[] iop;

	@ObfuscatedName("d.a(Lyb;I[Llb;Lyb;)V")
	public static void unpack(JagFile arg0, PixFont[] arg2, JagFile arg3) {
		imageCache = new LruCache(50000);
		Packet var4 = new Packet(arg3.read("data", null));
		int var6 = -1;
		int var7 = var4.g2();
		list = new IfType[var7];
		while (true) {
			IfType var9;
			do {
				if (var4.pos >= var4.data.length) {
					imageCache = null;
					return;
				}
				int var8 = var4.g2();
				if (var8 == 65535) {
					var6 = var4.g2();
					var8 = var4.g2();
				}
				var9 = list[var8] = new IfType();
				var9.id = var8;
				var9.layerId = var6;
				var9.type = var4.g1();
				var9.buttonType = var4.g1();
				var9.clientCode = var4.g2();
				var9.width = var4.g2();
				var9.height = var4.g2();
				var9.transparency = (byte) var4.g1();
				var9.overlayer = var4.g1();
				if (var9.overlayer == 0) {
					var9.overlayer = -1;
				} else {
					var9.overlayer = (var9.overlayer - 1 << 8) + var4.g1();
				}
				int var10 = var4.g1();
				if (var10 > 0) {
					var9.scriptComparator = new int[var10];
					var9.scriptOperand = new int[var10];
					for (int var11 = 0; var11 < var10; var11++) {
						var9.scriptComparator[var11] = var4.g1();
						var9.scriptOperand[var11] = var4.g2();
					}
				}
				int var12 = var4.g1();
				if (var12 > 0) {
					var9.scripts = new int[var12][];
					for (int var13 = 0; var13 < var12; var13++) {
						int var14 = var4.g2();
						var9.scripts[var13] = new int[var14];
						for (int var15 = 0; var15 < var14; var15++) {
							var9.scripts[var13][var15] = var4.g2();
						}
					}
				}
				if (var9.type == 0) {
					// LAEYR
					var9.scrollSize = var4.g2();
					var9.hidden = var4.g1() == 1;
					int var16 = var4.g2();
					var9.children = new int[var16];
					var9.childX = new int[var16];
					var9.childY = new int[var16];
					for (int var17 = 0; var17 < var16; var17++) {
						var9.children[var17] = var4.g2();
						var9.childX[var17] = var4.g2b();
						var9.childY[var17] = var4.g2b();
					}
				}
				if (var9.type == 1) {
					var9.field95 = var4.g2();
					var9.field96 = var4.g1() == 1;
				}
				if (var9.type == 2) {
					var9.linkObjType = new int[var9.width * var9.height];
					var9.linkObjCount = new int[var9.width * var9.height];
					var9.draggable = var4.g1() == 1;
					var9.interactable = var4.g1() == 1;
					var9.usable = var4.g1() == 1;
					var9.swappable = var4.g1() == 1;
					var9.marginX = var4.g1();
					var9.marginY = var4.g1();
					var9.invSlotOffsetX = new int[20];
					var9.invSlotOffsetY = new int[20];
					var9.invSlotGraphic = new Pix32[20];
					for (int var18 = 0; var18 < 20; var18++) {
						int var19 = var4.g1();
						if (var19 == 1) {
							var9.invSlotOffsetX[var18] = var4.g2b();
							var9.invSlotOffsetY[var18] = var4.g2b();
							String var20 = var4.gstr();
							if (arg0 != null && var20.length() > 0) {
								int var21 = var20.lastIndexOf(",");
								var9.invSlotGraphic[var18] = getImage(Integer.parseInt(var20.substring(var21 + 1)), var20.substring(0, var21), arg0);
							}
						}
					}
					var9.iop = new String[5];
					for (int var22 = 0; var22 < 5; var22++) {
						var9.iop[var22] = var4.gstr();
						if (var9.iop[var22].length() == 0) {
							var9.iop[var22] = null;
						}
					}
				}
				if (var9.type == 3) {
					// RECT
					var9.fill = var4.g1() == 1;
				}
				if (var9.type == 4 || var9.type == 1) {
					// TEXT
					var9.center = var4.g1() == 1;
					int var23 = var4.g1();
					if (arg2 != null) {
						var9.font = arg2[var23];
					}
					var9.shadowed = var4.g1() == 1;
				}
				if (var9.type == 4) {
					// TEXT
					var9.text = var4.gstr();
					var9.text2 = var4.gstr();
				}
				if (var9.type == 1 || var9.type == 3 || var9.type == 4) {
					// RECT || TEXT
					var9.colour = var4.g4();
				}
				if (var9.type == 3 || var9.type == 4) {
					// RECT || TEXT
					var9.colour2 = var4.g4();
					var9.colourOver = var4.g4();
					var9.colour2Over = var4.g4();
				}
				if (var9.type == 5) {
					// GRAPHIC
					String var24 = var4.gstr();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var9.graphic = getImage(Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25), arg0);
					}
					String var26 = var4.gstr();
					if (arg0 != null && var26.length() > 0) {
						int var27 = var26.lastIndexOf(",");
						var9.graphic2 = getImage(Integer.parseInt(var26.substring(var27 + 1)), var26.substring(0, var27), arg0);
					}
				}
				if (var9.type == 6) {
					// MODEL
					int var28 = var4.g1();
					if (var28 != 0) {
						var9.modelType = 1;
						var9.modelId = (var28 - 1 << 8) + var4.g1();
					}
					int var29 = var4.g1();
					if (var29 != 0) {
						var9.model2Type = 1;
						var9.model2Id = (var29 - 1 << 8) + var4.g1();
					}
					int var30 = var4.g1();
					if (var30 == 0) {
						var9.modelAnim = -1;
					} else {
						var9.modelAnim = (var30 - 1 << 8) + var4.g1();
					}
					int var31 = var4.g1();
					if (var31 == 0) {
						var9.model2Anim = -1;
					} else {
						var9.model2Anim = (var31 - 1 << 8) + var4.g1();
					}
					var9.modelZoom = var4.g2();
					var9.modelXAn = var4.g2();
					var9.modelYAn = var4.g2();
				}
				if (var9.type == 7) {
					var9.linkObjType = new int[var9.width * var9.height];
					var9.linkObjCount = new int[var9.width * var9.height];
					var9.center = var4.g1() == 1;
					int var32 = var4.g1();
					if (arg2 != null) {
						var9.font = arg2[var32];
					}
					var9.shadowed = var4.g1() == 1;
					var9.colour = var4.g4();
					var9.marginX = var4.g2b();
					var9.marginY = var4.g2b();
					var9.interactable = var4.g1() == 1;
					var9.iop = new String[5];
					for (int var33 = 0; var33 < 5; var33++) {
						var9.iop[var33] = var4.gstr();
						if (var9.iop[var33].length() == 0) {
							var9.iop[var33] = null;
						}
					}
				}
				if (var9.buttonType == 2 || var9.type == 2) {
					var9.targetVerb = var4.gstr();
					var9.targetText = var4.gstr();
					var9.targetMask = var4.g2();
				}
			} while (var9.buttonType != 1 && var9.buttonType != 4 && var9.buttonType != 5 && var9.buttonType != 6);
			var9.option = var4.gstr();
			if (var9.option.length() == 0) {
				if (var9.buttonType == 1) {
					var9.option = "Ok";
				}
				if (var9.buttonType == 4) {
					var9.option = "Select";
				}
				if (var9.buttonType == 5) {
					var9.option = "Select";
				}
				if (var9.buttonType == 6) {
					var9.option = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void swapObj(int arg0, int arg1) {
		int var4 = this.linkObjType[arg1];
		this.linkObjType[arg1] = this.linkObjType[arg0];
		this.linkObjType[arg0] = var4;
		int var5 = this.linkObjCount[arg1];
		this.linkObjCount[arg1] = this.linkObjCount[arg0];
		this.linkObjCount[arg0] = var5;
	}

	@ObfuscatedName("d.a(IIZI)Lfb;")
	public Model getTempModel(int arg1, boolean arg2, int arg3) {
		Model var5;
		if (arg2) {
			var5 = this.loadModel(this.model2Type, this.model2Id);
		} else {
			var5 = this.loadModel(this.modelType, this.modelId);
		}
		if (var5 == null) {
			return null;
		} else if (arg1 == -1 && arg3 == -1 && var5.faceColour == null) {
			return var5;
		} else {
			Model var6 = new Model(AnimFrame.shareAlpha(arg1) & AnimFrame.shareAlpha(arg3), false, true, var5);
			if (arg1 != -1 || arg3 != -1) {
				var6.prepareAnim();
			}
			if (arg1 != -1) {
				var6.animate(arg1);
			}
			if (arg3 != -1) {
				var6.animate(arg3);
			}
			var6.calculateNormals(64, 768, -50, -10, -50, true);
			return var6;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public Model loadModel(int arg0, int arg1) {
		Model var3 = (Model) modelCache.get((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			// MODELTYPE_BASIC
			var3 = Model.load(arg1);
		}
		if (arg0 == 2) {
			// MODELTYPE_NPC_HEAD
			var3 = NpcType.get(arg1).getHead();
		}
		if (arg0 == 3) {
			// MODELTYPE_PLAEYR_HEAD
			var3 = Client.localPlayer.getHeadModel();
		}
		if (arg0 == 4) {
			// MODELTYPE_OBJECT
			var3 = ObjType.get(arg1).getInvModel(50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			modelCache.put(var3, (long) ((arg0 << 16) + arg1));
		}
		return var3;
	}

	@ObfuscatedName("d.a(ZILfb;I)V")
	public static void cacheModel(int arg1, Model arg2, int arg3) {
		modelCache.clear();
		if (arg2 != null && arg3 != 4) {
			modelCache.put(arg2, (long) ((arg3 << 16) + arg1));
		}
	}

	@ObfuscatedName("d.a(IILjava/lang/String;Lyb;)Ljb;")
	public static Pix32 getImage(int arg1, String arg2, JagFile arg3) {
		long var4 = (JString.hashCode(arg2) << 8) + (long) arg1;
		Pix32 var6 = (Pix32) imageCache.get(var4);
		if (var6 == null) {
			try {
				Pix32 var7 = new Pix32(arg3, arg2, arg1);
				imageCache.put(var7, var4);
				return var7;
			} catch (Exception var8) {
				return null;
			}
		} else {
			return var6;
		}
	}
}
