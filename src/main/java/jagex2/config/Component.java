package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.dash3d.Model;
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
	public static void unpack(Jagfile interfaces, Jagfile media, PixFont[] fonts) {
		imageCache = new LruCache(50000);

		Packet data = new Packet(interfaces.read("data", null));
		int layer = -1;

		int total = data.g2();
		types = new Component[total];

		while (data.pos < data.data.length) {
			int id = data.g2();
			if (id == 65535) {
				layer = data.g2();
				id = data.g2();
			}

			Component com = types[id] = new Component();
			com.id = id;
			com.layer = layer;
			com.type = data.g1();
			com.buttonType = data.g1();
			com.clientCode = data.g2();
			com.width = data.g2();
			com.height = data.g2();
			com.alpha = (byte) data.g1();

			com.overlayer = data.g1();
			if (com.overlayer == 0) {
				com.overlayer = -1;
			} else {
				com.overlayer = (com.overlayer - 1 << 8) + data.g1();
			}

			int comparatorCount = data.g1();
			if (comparatorCount > 0) {
				com.scriptComparator = new int[comparatorCount];
				com.scriptOperand = new int[comparatorCount];

				for (int i = 0; i < comparatorCount; i++) {
					com.scriptComparator[i] = data.g1();
					com.scriptOperand[i] = data.g2();
				}
			}

			int scriptCount = data.g1();
			if (scriptCount > 0) {
				com.scripts = new int[scriptCount][];

				for (int i = 0; i < scriptCount; i++) {
					int opcodeCount = data.g2();
					com.scripts[i] = new int[opcodeCount];

					for (int j = 0; j < opcodeCount; j++) {
						com.scripts[i][j] = data.g2();
					}
				}
			}

			if (com.type == 0) {
				com.scroll = data.g2();
				com.hide = data.g1() == 1;

				int childCount = data.g2();
				com.children = new int[childCount];
				com.childX = new int[childCount];
				com.childY = new int[childCount];

				for (int i = 0; i < childCount; i++) {
					com.children[i] = data.g2();
					com.childX[i] = data.g2b();
					com.childY[i] = data.g2b();
				}
			}

			if (com.type == 1) {
				com.field98 = data.g2();
				com.field99 = data.g1() == 1;
			}

			if (com.type == 2) {
				com.invSlotObjId = new int[com.height * com.width];
				com.invSlotObjCount = new int[com.height * com.width];

				com.draggable = data.g1() == 1;
				com.interactable = data.g1() == 1;
				com.usable = data.g1() == 1;
				com.marginX = data.g1();
				com.marginY = data.g1();

				com.invSlotOffsetX = new int[20];
				com.invSlotOffsetY = new int[20];
				com.invSlotGraphic = new Pix32[20];

				for (int i = 0; i < 20; i++) {
					int hasGraphic = data.g1();
					if (hasGraphic == 1) {
						com.invSlotOffsetX[i] = data.g2b();
						com.invSlotOffsetY[i] = data.g2b();

						String graphic = data.gjstr();
						if (media != null && graphic.length() > 0) {
							int spriteIndex = graphic.lastIndexOf(",");
							com.invSlotGraphic[i] = getImage(Integer.parseInt(graphic.substring(spriteIndex + 1)), media, graphic.substring(0, spriteIndex));
						}
					}
				}

				com.iop = new String[5];
				for (int i = 0; i < 5; i++) {
					com.iop[i] = data.gjstr();

					if (com.iop[i].length() == 0) {
						com.iop[i] = null;
					}
				}
			}

			if (com.type == 3) {
				com.fill = data.g1() == 1;
			}

			if (com.type == 4 || com.type == 1) {
				com.center = data.g1() == 1;
				int font = data.g1();
				if (fonts != null) {
					com.font = fonts[font];
				}
				com.shadowed = data.g1() == 1;
			}

			if (com.type == 4) {
				com.text = data.gjstr();
				com.activeText = data.gjstr();
			}

			if (com.type == 1 || com.type == 3 || com.type == 4) {
				com.colour = data.g4();
			}

			if (com.type == 3 || com.type == 4) {
				com.activeColour = data.g4();
				com.overColour = data.g4();
			}

			if (com.type == 5) {
				String graphic = data.gjstr();
				if (media != null && graphic.length() > 0) {
					int spriteIndex = graphic.lastIndexOf(",");
					com.graphic = getImage(Integer.parseInt(graphic.substring(spriteIndex + 1)), media, graphic.substring(0, spriteIndex));
				}

				String activeGraphic = data.gjstr();
				if (media != null && activeGraphic.length() > 0) {
					int spriteIndex = activeGraphic.lastIndexOf(",");
					com.activeGraphic = getImage(Integer.parseInt(activeGraphic.substring(spriteIndex + 1)), media, activeGraphic.substring(0, spriteIndex));
				}
			}

			if (com.type == 6) {
				int model = data.g1();
				if (model != 0) {
					com.modelType = 1;
					com.model = (model - 1 << 8) + data.g1();
				}

				int activeModel = data.g1();
				if (activeModel != 0) {
					com.activeModelType = 1;
					com.activeModel = (activeModel - 1 << 8) + data.g1();
				}

				int anim = data.g1();
				if (anim == 0) {
					com.anim = -1;
				} else {
					com.anim = (anim - 1 << 8) + data.g1();
				}

				int activeAnim = data.g1();
				if (activeAnim == 0) {
					com.activeAnim = -1;
				} else {
					com.activeAnim = (activeAnim - 1 << 8) + data.g1();
				}

				com.zoom = data.g2();
				com.xan = data.g2();
				com.yan = data.g2();
			}

			if (com.type == 7) {
				com.invSlotObjId = new int[com.height * com.width];
				com.invSlotObjCount = new int[com.height * com.width];

				com.center = data.g1() == 1;
				int font = data.g1();
				if (fonts != null) {
					com.font = fonts[font];
				}
				com.shadowed = data.g1() == 1;
				com.colour = data.g4();
				com.marginX = data.g2b();
				com.marginY = data.g2b();
				com.interactable = data.g1() == 1;

				com.iop = new String[5];
				for (int i = 0; i < 5; i++) {
					com.iop[i] = data.gjstr();
					if (com.iop[i].length() == 0) {
						com.iop[i] = null;
					}
				}
			}

			if (com.buttonType == 2 || com.type == 2) {
				com.targetVerb = data.gjstr();
				com.targetText = data.gjstr();
				com.targetMask = data.g2();
			}

			if (com.buttonType == 1 || com.buttonType == 4 || com.buttonType == 5 || com.buttonType == 6) {
				com.option = data.gjstr();

				if (com.option.length() == 0) {
					if (com.buttonType == 1) {
						com.option = "Ok";
					}
					if (com.buttonType == 4) {
						com.option = "Select";
					}
					if (com.buttonType == 5) {
						com.option = "Select";
					}
					if (com.buttonType == 6) {
						com.option = "Continue";
					}
				}
			}
		}

		imageCache = null;
	}

	@ObfuscatedName("d.a(IZI)V")
	public void swapObj(int src, int dst) {
		int tmp = this.invSlotObjId[src];
		this.invSlotObjId[src] = this.invSlotObjId[dst];
		this.invSlotObjId[dst] = tmp;

		tmp = this.invSlotObjCount[src];
		this.invSlotObjCount[src] = this.invSlotObjCount[dst];
		this.invSlotObjCount[dst] = tmp;
	}

	@ObfuscatedName("d.a(BIIZ)Lfb;")
	public Model getModel(int primaryTransformId, int secondaryTransformId, boolean active) {
		Model model;
		if (active) {
			model = this.loadModel(this.activeModelType, this.activeModel);
		} else {
			model = this.loadModel(this.modelType, this.model);
		}

		if (model == null) {
			return null;
		}

		if (primaryTransformId == -1 && secondaryTransformId == -1 && model.faceColour == null) {
			return model;
		}

		model = new Model(model, true, false, true);
		if (primaryTransformId != -1 || secondaryTransformId != -1) {
			model.createLabelReferences();
		}

		if (primaryTransformId != -1) {
			model.applyTransform(primaryTransformId);
		}

		if (secondaryTransformId != -1) {
			model.applyTransform(secondaryTransformId);
		}

		model.calculateNormals(64, 768, -50, -10, -50, true);
		return model;
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public Model loadModel(int type, int id) {
		Model model = (Model) modelCache.get(((long) type << 16) + id);
		if (model != null) {
			return model;
		}

		if (type == 1) {
			model = Model.tryGet(id);
		} else if (type == 2) {
			model = NpcType.get(id).getHeadModel();
		} else if (type == 3) {
			model = Client.localPlayer.getHeadModel();
		} else if (type == 4) {
			model = ObjType.get(id).getInvModel(50);
		} else if (type == 5) {
			model = null;
		}

		if (model != null) {
			modelCache.put(model, (type << 16) + id);
		}

		return model;
	}

	@ObfuscatedName("d.a(Lfb;III)V")
	public static void cacheModel(Model model, int id, int type) {
		modelCache.clear();

		if (model != null && type != 4) {
			modelCache.put(model, ((long) type << 16) + id);
		}
	}

	@ObfuscatedName("d.a(ILyb;ILjava/lang/String;)Ljb;")
	public static Pix32 getImage(int spriteIndex, Jagfile media, String name) {
		long uid = (JString.hashCode(name) << 8) + (long) spriteIndex;
		Pix32 image = (Pix32) imageCache.get(uid);

		if (image != null) {
			return image;
		}

		try {
			image = new Pix32(media, name, spriteIndex);
			imageCache.put(image, uid);
			return image;
		} catch (Exception ignore) {
			return null;
		}
	}
}
