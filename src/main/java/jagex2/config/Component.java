package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
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
	public byte trans;

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
	public int modelType;

	@ObfuscatedName("d.bb")
	public int model;

	@ObfuscatedName("d.cb")
	public int activeModelType;

	@ObfuscatedName("d.db")
	public int activeModel;

	@ObfuscatedName("d.eb")
	public int anim;

	@ObfuscatedName("d.fb")
	public int activeAnim;

	@ObfuscatedName("d.gb")
	public int zoom;

	@ObfuscatedName("d.hb")
	public int xan;

	@ObfuscatedName("d.ib")
	public int yan;

	@ObfuscatedName("d.jb")
	public String targetVerb;

	@ObfuscatedName("d.kb")
	public String targetText;

	@ObfuscatedName("d.lb")
	public int targetMask;

	@ObfuscatedName("d.mb")
	public String option;

	@ObfuscatedName("d.nb")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("d.ob")
	public static LruCache imageCache;

	@ObfuscatedName("d.I")
	public int marginX;

	@ObfuscatedName("d.J")
	public int marginY;

	@ObfuscatedName("d.U")
	public int colour;

	@ObfuscatedName("d.V")
	public int overColour;

	@ObfuscatedName("d.W")
	public int activeColour;

	@ObfuscatedName("d.X")
	public int activeOverColour;

	@ObfuscatedName("d.C")
	public int field95;

	@ObfuscatedName("d.Y")
	public Pix32 graphic;

	@ObfuscatedName("d.Z")
	public Pix32 activeGraphic;

	@ObfuscatedName("d.R")
	public PixFont font;

	@ObfuscatedName("d.S")
	public String text;

	@ObfuscatedName("d.T")
	public String activeText;

	@ObfuscatedName("d.H")
	public boolean swappable;

	@ObfuscatedName("d.O")
	public boolean fill;

	@ObfuscatedName("d.P")
	public boolean center;

	@ObfuscatedName("d.Q")
	public boolean shadowed;

	@ObfuscatedName("d.D")
	public boolean field96;

	@ObfuscatedName("d.E")
	public boolean draggable;

	@ObfuscatedName("d.F")
	public boolean interactable;

	@ObfuscatedName("d.G")
	public boolean usable;

	@ObfuscatedName("d.L")
	public int[] invSlotOffsetX;

	@ObfuscatedName("d.M")
	public int[] invSlotOffsetY;

	@ObfuscatedName("d.A")
	public int[] childX;

	@ObfuscatedName("d.B")
	public int[] childY;

	@ObfuscatedName("d.K")
	public Pix32[] invSlotGraphic;

	@ObfuscatedName("d.N")
	public String[] iop;

	@ObfuscatedName("d.a([Llb;BLyb;Lyb;)V")
	public static void unpack(PixFont[] arg0, Jagfile arg2, Jagfile arg3) {
		imageCache = new LruCache(50000);
		Packet var4 = new Packet(arg3.read("data", null));
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
				var8.trans = (byte) var4.g1();
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
					var8.field95 = var4.g2();
					var8.field96 = var4.g1() == 1;
				}
				if (var8.type == 2) {
					var8.invSlotObjId = new int[var8.width * var8.height];
					var8.invSlotObjCount = new int[var8.width * var8.height];
					var8.draggable = var4.g1() == 1;
					var8.interactable = var4.g1() == 1;
					var8.usable = var4.g1() == 1;
					var8.swappable = var4.g1() == 1;
					var8.marginX = var4.g1();
					var8.marginY = var4.g1();
					var8.invSlotOffsetX = new int[20];
					var8.invSlotOffsetY = new int[20];
					var8.invSlotGraphic = new Pix32[20];
					for (int var17 = 0; var17 < 20; var17++) {
						int var18 = var4.g1();
						if (var18 == 1) {
							var8.invSlotOffsetX[var17] = var4.g2b();
							var8.invSlotOffsetY[var17] = var4.g2b();
							String var19 = var4.gjstr();
							if (arg2 != null && var19.length() > 0) {
								int var20 = var19.lastIndexOf(",");
								var8.invSlotGraphic[var17] = getImage(var19.substring(0, var20), arg2, Integer.parseInt(var19.substring(var20 + 1)));
							}
						}
					}
					var8.iop = new String[5];
					for (int var21 = 0; var21 < 5; var21++) {
						var8.iop[var21] = var4.gjstr();
						if (var8.iop[var21].length() == 0) {
							var8.iop[var21] = null;
						}
					}
				}
				if (var8.type == 3) {
					var8.fill = var4.g1() == 1;
				}
				if (var8.type == 4 || var8.type == 1) {
					var8.center = var4.g1() == 1;
					int var22 = var4.g1();
					if (arg0 != null) {
						var8.font = arg0[var22];
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
					var8.overColour = var4.g4();
					var8.activeColour = var4.g4();
					var8.activeOverColour = var4.g4();
				}
				if (var8.type == 5) {
					String var23 = var4.gjstr();
					if (arg2 != null && var23.length() > 0) {
						int var24 = var23.lastIndexOf(",");
						var8.graphic = getImage(var23.substring(0, var24), arg2, Integer.parseInt(var23.substring(var24 + 1)));
					}
					String var25 = var4.gjstr();
					if (arg2 != null && var25.length() > 0) {
						int var26 = var25.lastIndexOf(",");
						var8.activeGraphic = getImage(var25.substring(0, var26), arg2, Integer.parseInt(var25.substring(var26 + 1)));
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
					var8.invSlotObjId = new int[var8.width * var8.height];
					var8.invSlotObjCount = new int[var8.width * var8.height];
					var8.center = var4.g1() == 1;
					int var31 = var4.g1();
					if (arg0 != null) {
						var8.font = arg0[var31];
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

	@ObfuscatedName("d.a(IIB)V")
	public void swapObj(int arg0, int arg1) {
		int var4 = this.invSlotObjId[arg0];
		this.invSlotObjId[arg0] = this.invSlotObjId[arg1];
		this.invSlotObjId[arg1] = var4;
		int var5 = this.invSlotObjCount[arg0];
		this.invSlotObjCount[arg0] = this.invSlotObjCount[arg1];
		this.invSlotObjCount[arg1] = var5;
	}

	@ObfuscatedName("d.a(IBZI)Lfb;")
	public Model getModel(int arg0, boolean arg2, int arg3) {
		Model var5;
		if (arg2) {
			var5 = this.loadModel(this.activeModelType, this.activeModel);
		} else {
			var5 = this.loadModel(this.modelType, this.model);
		}
		if (var5 == null) {
			return null;
		} else if (arg0 == -1 && arg3 == -1 && var5.faceColour == null) {
			return var5;
		} else {
			Model var6 = new Model(true, var5, false, true);
			if (arg0 != -1 || arg3 != -1) {
				var6.createLabelReferences();
			}
			if (arg0 != -1) {
				var6.applyTransform(arg0);
			}
			if (arg3 != -1) {
				var6.applyTransform(arg3);
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

	@ObfuscatedName("d.a(ZLfb;II)V")
	public static void cacheModel(Model arg1, int arg2, int arg3) {
		modelCache.clear();
		if (arg1 != null && arg3 != 4) {
			modelCache.put(arg1, (long) ((arg3 << 16) + arg2));
		}
	}

	@ObfuscatedName("d.a(Ljava/lang/String;Lyb;IZ)Ljb;")
	public static Pix32 getImage(String arg0, Jagfile arg1, int arg2) {
		long var4 = (JString.hashCode(arg0) << 8) + (long) arg2;
		Pix32 var6 = (Pix32) imageCache.get(var4);
		if (var6 == null) {
			try {
				Pix32 var7 = new Pix32(arg1, arg0, arg2);
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
