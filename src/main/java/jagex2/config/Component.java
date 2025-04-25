package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("d")
public class Component {

	@ObfuscatedName("d.d")
	public static Component[] types;

	@ObfuscatedName("d.e")
	public int[] invSlotObjId;

	@ObfuscatedName("d.f")
	public int[] invSlotObjCount;

	@ObfuscatedName("d.g")
	public int seqFrame;

	@ObfuscatedName("d.h")
	public int seqCycle;

	@ObfuscatedName("d.i")
	public int id;

	@ObfuscatedName("d.j")
	public int layer;

	@ObfuscatedName("d.k")
	public int type;

	@ObfuscatedName("d.l")
	public int buttonType;

	@ObfuscatedName("d.m")
	public int clientCode;

	@ObfuscatedName("d.n")
	public int width;

	@ObfuscatedName("d.o")
	public int height;

	@ObfuscatedName("d.p")
	public byte alpha;

	@ObfuscatedName("d.q")
	public int x;

	@ObfuscatedName("d.r")
	public int y;

	@ObfuscatedName("d.s")
	public int[][] scripts;

	@ObfuscatedName("d.t")
	public int[] scriptComparator;

	@ObfuscatedName("d.u")
	public int[] scriptOperand;

	@ObfuscatedName("d.v")
	public int overlayer;

	@ObfuscatedName("d.w")
	public int scroll;

	@ObfuscatedName("d.x")
	public int scrollPosition;

	@ObfuscatedName("d.y")
	public boolean hide;

	@ObfuscatedName("d.z")
	public int[] children;

	@ObfuscatedName("d.ab")
	public int activeModelType;

	@ObfuscatedName("d.bb")
	public int activeModel;

	@ObfuscatedName("d.cb")
	public int anim;

	@ObfuscatedName("d.db")
	public int activeAnim;

	@ObfuscatedName("d.eb")
	public int zoom;

	@ObfuscatedName("d.fb")
	public int xan;

	@ObfuscatedName("d.gb")
	public int yan;

	@ObfuscatedName("d.hb")
	public String targetVerb;

	@ObfuscatedName("d.ib")
	public String targetText;

	@ObfuscatedName("d.jb")
	public int targetMask;

	@ObfuscatedName("d.kb")
	public String option;

	@ObfuscatedName("d.lb")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("d.mb")
	public static LruCache imageCache;

	@ObfuscatedName("d.H")
	public int marginX;

	@ObfuscatedName("d.I")
	public int marginY;

	@ObfuscatedName("d.T")
	public int colour;

	@ObfuscatedName("d.U")
	public int activeColour;

	@ObfuscatedName("d.V")
	public int overColour;

	@ObfuscatedName("d.Y")
	public int modelType;

	@ObfuscatedName("d.Z")
	public int model;

	@ObfuscatedName("d.C")
	public int field98;

	@ObfuscatedName("d.W")
	public Pix32 graphic;

	@ObfuscatedName("d.X")
	public Pix32 activeGraphic;

	@ObfuscatedName("d.Q")
	public PixFont font;

	@ObfuscatedName("d.R")
	public String text;

	@ObfuscatedName("d.S")
	public String activeText;

	@ObfuscatedName("d.E")
	public boolean draggable;

	@ObfuscatedName("d.F")
	public boolean interactable;

	@ObfuscatedName("d.G")
	public boolean usable;

	@ObfuscatedName("d.N")
	public boolean fill;

	@ObfuscatedName("d.O")
	public boolean center;

	@ObfuscatedName("d.P")
	public boolean shadowed;

	@ObfuscatedName("d.D")
	public boolean field99;

	@ObfuscatedName("d.K")
	public int[] invSlotOffsetX;

	@ObfuscatedName("d.L")
	public int[] invSlotOffsetY;

	@ObfuscatedName("d.A")
	public int[] childX;

	@ObfuscatedName("d.B")
	public int[] childY;

	@ObfuscatedName("d.J")
	public Pix32[] invSlotGraphic;

	@ObfuscatedName("d.M")
	public String[] iop;

	@ObfuscatedName("d.a(Lyb;ILyb;[Llb;)V")
	public static void unpack(Jagfile arg0, Jagfile arg2, PixFont[] arg3) {
		imageCache = new LruCache(50000);
		Packet var4 = new Packet(arg0.read("data", null));
		int var5 = -1;
		int var6 = var4.g2();
		types = new Component[var6];
		while (true) {
			Component var8;
			do {
				if (var4.pos >= var4.data.length) {
					imageCache = null;
					return;
				}
				int var7 = var4.g2();
				if (var7 == 65535) {
					var5 = var4.g2();
					var7 = var4.g2();
				}
				var8 = types[var7] = new Component();
				var8.id = var7;
				var8.layer = var5;
				var8.type = var4.g1();
				var8.buttonType = var4.g1();
				var8.clientCode = var4.g2();
				var8.width = var4.g2();
				var8.height = var4.g2();
				var8.alpha = (byte) var4.g1();
				var8.overlayer = var4.g1();
				if (var8.overlayer == 0) {
					var8.overlayer = -1;
				} else {
					var8.overlayer = (var8.overlayer - 1 << 8) + var4.g1();
				}
				int var9 = var4.g1();
				if (var9 > 0) {
					var8.scriptComparator = new int[var9];
					var8.scriptOperand = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						var8.scriptComparator[var10] = var4.g1();
						var8.scriptOperand[var10] = var4.g2();
					}
				}
				int var11 = var4.g1();
				if (var11 > 0) {
					var8.scripts = new int[var11][];
					for (int var12 = 0; var12 < var11; var12++) {
						int var13 = var4.g2();
						var8.scripts[var12] = new int[var13];
						for (int var14 = 0; var14 < var13; var14++) {
							var8.scripts[var12][var14] = var4.g2();
						}
					}
				}
				if (var8.type == 0) {
					var8.scroll = var4.g2();
					var8.hide = var4.g1() == 1;
					int var15 = var4.g2();
					var8.children = new int[var15];
					var8.childX = new int[var15];
					var8.childY = new int[var15];
					for (int var16 = 0; var16 < var15; var16++) {
						var8.children[var16] = var4.g2();
						var8.childX[var16] = var4.g2b();
						var8.childY[var16] = var4.g2b();
					}
				}
				if (var8.type == 1) {
					var8.field98 = var4.g2();
					var8.field99 = var4.g1() == 1;
				}
				if (var8.type == 2) {
					var8.invSlotObjId = new int[var8.height * var8.width];
					var8.invSlotObjCount = new int[var8.height * var8.width];
					var8.draggable = var4.g1() == 1;
					var8.interactable = var4.g1() == 1;
					var8.usable = var4.g1() == 1;
					var8.marginX = var4.g1();
					var8.marginY = var4.g1();
					var8.invSlotOffsetX = new int[20];
					var8.invSlotOffsetY = new int[20];
					var8.invSlotGraphic = new Pix32[20];
					for (int var17 = 0; var17 < 20; var17++) {
						int var19 = var4.g1();
						if (var19 == 1) {
							var8.invSlotOffsetX[var17] = var4.g2b();
							var8.invSlotOffsetY[var17] = var4.g2b();
							String var20 = var4.gjstr();
							if (arg2 != null && var20.length() > 0) {
								int var21 = var20.lastIndexOf(",");
								var8.invSlotGraphic[var17] = getImage(Integer.parseInt(var20.substring(var21 + 1)), arg2, var20.substring(0, var21));
							}
						}
					}
					var8.iop = new String[5];
					for (int var18 = 0; var18 < 5; var18++) {
						var8.iop[var18] = var4.gjstr();
						if (var8.iop[var18].length() == 0) {
							var8.iop[var18] = null;
						}
					}
				}
				if (var8.type == 3) {
					var8.fill = var4.g1() == 1;
				}
				if (var8.type == 4 || var8.type == 1) {
					var8.center = var4.g1() == 1;
					int var22 = var4.g1();
					if (arg3 != null) {
						var8.font = arg3[var22];
					}
					var8.shadowed = var4.g1() == 1;
				}
				if (var8.type == 4) {
					var8.text = var4.gjstr();
					var8.activeText = var4.gjstr();
				}
				if (var8.type == 1 || var8.type == 3 || var8.type == 4) {
					var8.colour = var4.g4();
				}
				if (var8.type == 3 || var8.type == 4) {
					var8.activeColour = var4.g4();
					var8.overColour = var4.g4();
				}
				if (var8.type == 5) {
					String var23 = var4.gjstr();
					if (arg2 != null && var23.length() > 0) {
						int var24 = var23.lastIndexOf(",");
						var8.graphic = getImage(Integer.parseInt(var23.substring(var24 + 1)), arg2, var23.substring(0, var24));
					}
					String var25 = var4.gjstr();
					if (arg2 != null && var25.length() > 0) {
						int var26 = var25.lastIndexOf(",");
						var8.activeGraphic = getImage(Integer.parseInt(var25.substring(var26 + 1)), arg2, var25.substring(0, var26));
					}
				}
				if (var8.type == 6) {
					int var27 = var4.g1();
					if (var27 != 0) {
						var8.modelType = 1;
						var8.model = (var27 - 1 << 8) + var4.g1();
					}
					int var28 = var4.g1();
					if (var28 != 0) {
						var8.activeModelType = 1;
						var8.activeModel = (var28 - 1 << 8) + var4.g1();
					}
					int var29 = var4.g1();
					if (var29 == 0) {
						var8.anim = -1;
					} else {
						var8.anim = (var29 - 1 << 8) + var4.g1();
					}
					int var30 = var4.g1();
					if (var30 == 0) {
						var8.activeAnim = -1;
					} else {
						var8.activeAnim = (var30 - 1 << 8) + var4.g1();
					}
					var8.zoom = var4.g2();
					var8.xan = var4.g2();
					var8.yan = var4.g2();
				}
				if (var8.type == 7) {
					var8.invSlotObjId = new int[var8.height * var8.width];
					var8.invSlotObjCount = new int[var8.height * var8.width];
					var8.center = var4.g1() == 1;
					int var31 = var4.g1();
					if (arg3 != null) {
						var8.font = arg3[var31];
					}
					var8.shadowed = var4.g1() == 1;
					var8.colour = var4.g4();
					var8.marginX = var4.g2b();
					var8.marginY = var4.g2b();
					var8.interactable = var4.g1() == 1;
					var8.iop = new String[5];
					for (int var32 = 0; var32 < 5; var32++) {
						var8.iop[var32] = var4.gjstr();
						if (var8.iop[var32].length() == 0) {
							var8.iop[var32] = null;
						}
					}
				}
				if (var8.buttonType == 2 || var8.type == 2) {
					var8.targetVerb = var4.gjstr();
					var8.targetText = var4.gjstr();
					var8.targetMask = var4.g2();
				}
			} while (var8.buttonType != 1 && var8.buttonType != 4 && var8.buttonType != 5 && var8.buttonType != 6);
			var8.option = var4.gjstr();
			if (var8.option.length() == 0) {
				if (var8.buttonType == 1) {
					var8.option = "Ok";
				}
				if (var8.buttonType == 4) {
					var8.option = "Select";
				}
				if (var8.buttonType == 5) {
					var8.option = "Select";
				}
				if (var8.buttonType == 6) {
					var8.option = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(IZI)V")
	public void swapObj(int arg0, int arg2) {
		int var4 = this.invSlotObjId[arg0];
		this.invSlotObjId[arg0] = this.invSlotObjId[arg2];
		this.invSlotObjId[arg2] = var4;
		int var5 = this.invSlotObjCount[arg0];
		this.invSlotObjCount[arg0] = this.invSlotObjCount[arg2];
		this.invSlotObjCount[arg2] = var5;
	}

	@ObfuscatedName("d.a(BIIZ)Lfb;")
	public Model getModel(int arg1, int arg2, boolean arg3) {
		Model var5;
		if (arg3) {
			var5 = this.getModel(this.activeModelType, this.activeModel);
		} else {
			var5 = this.getModel(this.modelType, this.model);
		}
		if (var5 == null) {
			return null;
		} else if (arg1 == -1 && arg2 == -1 && var5.faceColour == null) {
			return var5;
		} else {
			Model var6 = new Model(var5, true, false, true);
			if (arg1 != -1 || arg2 != -1) {
				var6.createLabelReferences();
			}
			if (arg1 != -1) {
				var6.applyTransform(arg1);
			}
			if (arg2 != -1) {
				var6.applyTransform(arg2);
			}
			var6.calculateNormals(64, 768, -50, -10, -50, true);
			return var6;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public Model getModel(int arg0, int arg1) {
		Model var3 = (Model) modelCache.get((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.tryGet(arg1);
		}
		if (arg0 == 2) {
			var3 = NpcType.get(arg1).getHeadModel();
		}
		if (arg0 == 3) {
			var3 = Client.localPlayer.getHeadModel();
		}
		if (arg0 == 4) {
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

	@ObfuscatedName("d.a(Lfb;III)V")
	public static void cacheModel(Model arg0, int arg2, int arg3) {
		modelCache.clear();
		if (arg0 != null && arg3 != 4) {
			modelCache.put(arg0, (long) ((arg3 << 16) + arg2));
		}
	}

	@ObfuscatedName("d.a(ILyb;ILjava/lang/String;)Ljb;")
	public static Pix32 getImage(int arg0, Jagfile arg1, String arg3) {
		long var4 = (JString.hashCode(arg3) << 8) + (long) arg0;
		Pix32 var6 = (Pix32) imageCache.get(var4);
		if (var6 != null) {
			return var6;
		}
		try {
			Pix32 var7 = new Pix32(arg1, arg3, arg0);
			imageCache.put(var7, var4);
			return var7;
		} catch (Exception var8) {
			return null;
		}
	}
}
