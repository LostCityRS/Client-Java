package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.Model;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix32;
import jagex3.graphics.PixFont;
import jagex3.graphics.PixLoader;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("qd")
public final class IfType extends Linkable2 {

	@ObfuscatedName("rd.w")
	public static LruCache modelCache = new LruCache(50);
	@ObfuscatedName("cb.x")
	public static Js5 models;
	@ObfuscatedName("fd.sb")
	public static Js5 interfaces;
	@ObfuscatedName("t.yb")
	public static Js5 sprites;
	@ObfuscatedName("tc.k")
	public static IfType[][] list;
	@ObfuscatedName("wc.o")
	public static boolean[] open;
	@ObfuscatedName("cb.u")
	public static LruCache spriteCache = new LruCache(200);
	@ObfuscatedName("wb.i")
	public static LruCache fontCache = new LruCache(20);
	@ObfuscatedName("va.lb")
	public static boolean loadingAsset = false;
    @ObfuscatedName("uc.v")
    public static JagString field3058 = JagString.wrap("");
    @ObfuscatedName("qd.ac")
	public JagString text = field3058;

	@ObfuscatedName("qd.ad")
	public int scrollPos = 0;

	@ObfuscatedName("qd.bc")
	public Object[] field2475;

	@ObfuscatedName("qd.bd")
	public int overLayerId = -1;

	@ObfuscatedName("qd.cc")
	public int graphic2 = -1;

	@ObfuscatedName("qd.cd")
	public int field2528 = 0;

	@ObfuscatedName("qd.dd")
	public boolean field2529 = false;

	@ObfuscatedName("qd.ec")
	public Object[] field2478;

	@ObfuscatedName("qd.fc")
	public int model1Id = -1;

	@ObfuscatedName("qd.fd")
	public int modelZAn = 0;

	@ObfuscatedName("qd.gd")
	public int colour2 = 0;

	@ObfuscatedName("qd.hd")
	public boolean field2533 = false;

	@ObfuscatedName("qd.ic")
	public JagString buttonText = Text.OK;

	@ObfuscatedName("qd.id")
	public int modelZoom = 100;

	@ObfuscatedName("qd.jc")
	public Object[] field2483;

	@ObfuscatedName("qd.kd")
	public boolean field2536 = false;

	@ObfuscatedName("qd.lc")
	public int modelYOf = 0;

	@ObfuscatedName("qd.ld")
	public int scrollHeight = 0;

	@ObfuscatedName("qd.mc")
	public Object[] field2486;

	@ObfuscatedName("qd.md")
	public int lineHeight = 0;

	@ObfuscatedName("qd.nc")
	public Object[] field2487;

	@ObfuscatedName("qd.nd")
	public int hAlign = 0;

	@ObfuscatedName("qd.oc")
	public boolean field2488 = false;

	@ObfuscatedName("qd.od")
	public int field2540 = 0;

	@ObfuscatedName("qd.pc")
	public int type;

	@ObfuscatedName("qd.qd")
	public int field2542 = 0;

	@ObfuscatedName("qd.rc")
	public int[] linkObjType;

	@ObfuscatedName("qd.rd")
	public int modelXOf = 0;

	@ObfuscatedName("qd.sd")
	public int field2544 = -1;

	@ObfuscatedName("qd.tc")
	public int model1Type = 1;

	@ObfuscatedName("qd.ub")
	public boolean v3 = false;

	@ObfuscatedName("qd.uc")
	public boolean hashook = false;

	@ObfuscatedName("qd.vc")
	public int parentId = -1;

	@ObfuscatedName("qd.wc")
	public int modelXAn = 0;

	@ObfuscatedName("qd.wd")
	public int[] scriptOperand;

	@ObfuscatedName("qd.Jb")
	public int model2Type = 1;

	@ObfuscatedName("qd.xb")
	public int clientCode = 0;

	@ObfuscatedName("qd.Pb")
	public int modelYAn = 0;

	@ObfuscatedName("qd.Xb")
	public boolean shadow = false;

	@ObfuscatedName("qd.zb")
	public boolean tiling = false;

	@ObfuscatedName("qd.Wb")
	public JagString targetVerb = field3058;

	@ObfuscatedName("qd.Mb")
	public int field2460 = 0;

	@ObfuscatedName("qd.Zb")
	public int marginY = 0;

	@ObfuscatedName("qd.Sb")
	public int field2466 = 0;

	@ObfuscatedName("qd.Lb")
	public int modelAnim2 = -1;

	@ObfuscatedName("qd.Fb")
	public int colour = 0;

	@ObfuscatedName("qd.Ic")
	public int field2508 = 0;

	@ObfuscatedName("qd.Ac")
	public boolean field2500 = false;

	@ObfuscatedName("qd.Gb")
	public int layerId = -1;

	@ObfuscatedName("qd.Vb")
	public int colour2Over = 0;

	@ObfuscatedName("qd.Cc")
	public int y = 0;

	@ObfuscatedName("qd.Rc")
	public int model2Id = -1;

	@ObfuscatedName("qd.Hb")
	public int dataX = 0;

	@ObfuscatedName("qd.yb")
	public JagString text2 = field3058;

	@ObfuscatedName("qd.Jc")
	public boolean field2509 = false;

	@ObfuscatedName("qd.Zc")
	public int colourOver = 0;

	@ObfuscatedName("qd.yc")
	public int width = 0;

	@ObfuscatedName("qd.Rb")
	public int modelAnim = -1;

	@ObfuscatedName("qd.Pc")
	public JagString targetBase = field3058;

	@ObfuscatedName("qd.Nb")
	public boolean field2461 = false;

	@ObfuscatedName("qd.Db")
	public boolean fill = false;

	@ObfuscatedName("qd.Vc")
	public int vAlign = 0;

	@ObfuscatedName("qd.Ob")
	public int x = 0;

	@ObfuscatedName("qd.Hc")
	public boolean orthog = false;

	@ObfuscatedName("qd.yd")
	public int graphic = -1;

	@ObfuscatedName("qd.Bb")
	public int height = 0;

	@ObfuscatedName("qd.zd")
	public int trans = 0;

	@ObfuscatedName("qd.xd")
	public int dataY = 0;

	@ObfuscatedName("qd.Ad")
	public int scrollWidth = 0;

	@ObfuscatedName("qd.Ed")
	public boolean hide = false;

	@ObfuscatedName("qd.Yc")
	public int field2524 = -1;

	@ObfuscatedName("qd.Dd")
	public int marginX = 0;

	@ObfuscatedName("qd.Uc")
	public int buttonType = 0;

	@ObfuscatedName("qd.Fd")
	public int rotate = 0;

	@ObfuscatedName("qd.Ab")
	public int font;

	@ObfuscatedName("qd.zc")
	public int[] scriptComparator;

	@ObfuscatedName("qd.Fc")
	public int[] invBackgroundX;

	@ObfuscatedName("qd.Kc")
	public int[] invBackground;

	@ObfuscatedName("qd.Oc")
	public int[] invBackgroundY;

	@ObfuscatedName("qd.Qc")
	public int[] linkObjNumber;

	@ObfuscatedName("qd.Tc")
	public IfType[] field2519;

	@ObfuscatedName("qd.Tb")
	public JagString[] opNames;

	@ObfuscatedName("qd.Ec")
	public JagString[] iop;

	@ObfuscatedName("qd.Cb")
	public Object[] field2450;

	@ObfuscatedName("qd.Ib")
	public Object[] field2456;

	@ObfuscatedName("qd.Qb")
	public Object[] field2464;

	@ObfuscatedName("qd.Bc")
	public Object[] field2501;

	@ObfuscatedName("qd.Nc")
	public Object[] field2513;

	@ObfuscatedName("qd.Sc")
	public Object[] field2518;

	@ObfuscatedName("qd.Bd")
	public Object[] field2553;

	@ObfuscatedName("qd.Cd")
	public int[][] scripts;

	@ObfuscatedName("d.a(Lbd;Lbd;Lbd;B)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		models = arg2;
		interfaces = arg0;
		sprites = arg1;
		list = new IfType[interfaces.getGroupCount()][];
		open = new boolean[interfaces.getGroupCount()];
	}

	@ObfuscatedName("wc.a(II)Z")
	public static boolean openInterface(int arg0) {
		if (open[arg0]) {
			return true;
		} else if (interfaces.requestGroupDownload(arg0)) {
			int var1 = interfaces.getFileIdLimit(arg0);
			if (var1 == 0) {
				open[arg0] = true;
				return true;
			}
			if (list[arg0] == null) {
				list[arg0] = new IfType[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (list[arg0][var2] == null) {
					byte[] var3 = interfaces.getFile(var2, arg0);
					if (var3 != null) {
						list[arg0][var2] = new IfType();
						list[arg0][var2].parentId = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							list[arg0][var2].decode3(new Packet(var3));
						} else {
							list[arg0][var2].decode(new Packet(var3));
						}
					}
				}
			}
			open[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ua.a(BI)V")
	public static void closeInterface(int arg0) {
		if (arg0 == -1 || !open[arg0]) {
			return;
		}
		interfaces.discardFiles(arg0);
		if (list[arg0] == null) {
			return;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < list[arg0].length; var2++) {
			if (list[arg0][var2] != null) {
				if (list[arg0][var2].type == 2) {
					var1 = false;
				} else {
					list[arg0][var2] = null;
				}
			}
		}
		if (var1) {
			list[arg0] = null;
		}
		open[arg0] = false;
	}

	@ObfuscatedName("nb.g(I)V")
	public static void resetCache() {
		spriteCache.clear();
		modelCache.clear();
		fontCache.clear();
	}

	@ObfuscatedName("wc.a(IB)Lqd;")
	public static IfType get(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (list[var1] == null || list[var1][var2] == null) {
			boolean var3 = openInterface(var1);
			if (!var3) {
				return null;
			}
		}
		return list[var1][var2];
	}

	@ObfuscatedName("id.a(BLba;)[Ljava/lang/Object;")
	public static Object[] decodeHook(Packet arg0) {
		int var1 = arg0.g1();
		if (var1 == 0) {
			return null;
		}
		Object[] var2 = new Object[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				var2[var3] = Integer.valueOf(arg0.g4());
			} else if (var4 == 1) {
				var2[var3] = arg0.gjstr();
			}
		}
		return var2;
	}

	@ObfuscatedName("qd.a(IZI)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = this.linkObjType[arg1];
		this.linkObjType[arg1] = this.linkObjType[arg0];
		this.linkObjType[arg0] = var3;
		int var4 = this.linkObjNumber[arg1];
		this.linkObjNumber[arg1] = this.linkObjNumber[arg0];
		this.linkObjNumber[arg0] = var4;
	}

	@ObfuscatedName("qd.a(Lba;I)V")
	public void decode(Packet arg0) {
		this.v3 = false;
		this.type = arg0.g1();
		this.buttonType = arg0.g1();
		this.clientCode = arg0.g2();
		this.dataX = this.x = arg0.g2b();
		this.dataY = this.y = arg0.g2b();
		this.width = arg0.g2();
		this.height = arg0.g2();
		this.trans = arg0.g1();
		this.layerId = arg0.g2();
		if (this.layerId == 65535) {
			this.layerId = -1;
		}
		this.overLayerId = arg0.g2();
		if (this.overLayerId == 65535) {
			this.overLayerId = -1;
		}
		int var2 = arg0.g1();
		if (var2 > 0) {
			this.scriptOperand = new int[var2];
			this.scriptComparator = new int[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.scriptOperand[var3] = arg0.g1();
				this.scriptComparator[var3] = arg0.g2();
			}
		}
		int var4 = arg0.g1();
		if (var4 > 0) {
			this.scripts = new int[var4][];
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = arg0.g2();
				this.scripts[var5] = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					this.scripts[var5][var7] = arg0.g2();
					if (this.scripts[var5][var7] == 65535) {
						this.scripts[var5][var7] = -1;
					}
				}
			}
		}
		if (this.type == 0) {
			this.scrollPos = arg0.g2();
			this.hide = arg0.g1() == 1;
		}
		if (this.type == 1) {
			arg0.g2();
			arg0.g1();
		}
		if (this.type == 2) {
			this.linkObjType = new int[this.width * this.height];
			this.linkObjNumber = new int[this.width * this.height];
			this.field2509 = arg0.g1() == 1;
			this.field2533 = arg0.g1() == 1;
			this.field2461 = arg0.g1() == 1;
			this.field2529 = arg0.g1() == 1;
			this.marginX = arg0.g1();
			this.marginY = arg0.g1();
			this.invBackgroundY = new int[20];
			this.invBackground = new int[20];
			this.invBackgroundX = new int[20];
			for (int var8 = 0; var8 < 20; var8++) {
				int var9 = arg0.g1();
				if (var9 == 1) {
					this.invBackgroundX[var8] = arg0.g2b();
					this.invBackgroundY[var8] = arg0.g2b();
					this.invBackground[var8] = arg0.g4();
				} else {
					this.invBackground[var8] = -1;
				}
			}
			this.iop = new JagString[5];
			for (int var10 = 0; var10 < 5; var10++) {
				this.iop[var10] = arg0.gjstr();
				if (this.iop[var10].length() == 0) {
					this.iop[var10] = null;
				}
			}
		}
		if (this.type == 3) {
			this.fill = arg0.g1() == 1;
		}
		if (this.type == 4 || this.type == 1) {
			this.hAlign = arg0.g1();
			this.vAlign = arg0.g1();
			this.lineHeight = arg0.g1();
			this.font = arg0.g2();
			this.shadow = arg0.g1() == 1;
		}
		if (this.type == 4) {
			this.text = arg0.gjstr();
			this.text2 = arg0.gjstr();
		}
		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.colour = arg0.g4();
		}
		if (this.type == 3 || this.type == 4) {
			this.colour2 = arg0.g4();
			this.colourOver = arg0.g4();
			this.colour2Over = arg0.g4();
		}
		if (this.type == 5) {
			this.graphic = arg0.g4();
			this.graphic2 = arg0.g4();
		}
		if (this.type == 6) {
			this.model1Type = 1;
			this.model1Id = arg0.g2();
			if (this.model1Id == 65535) {
				this.model1Id = -1;
			}
			this.model2Type = 1;
			this.model2Id = arg0.g2();
			if (this.model2Id == 65535) {
				this.model2Id = -1;
			}
			this.modelAnim = arg0.g2();
			if (this.modelAnim == 65535) {
				this.modelAnim = -1;
			}
			this.modelAnim2 = arg0.g2();
			if (this.modelAnim2 == 65535) {
				this.modelAnim2 = -1;
			}
			this.modelZoom = arg0.g2();
			this.modelXAn = arg0.g2();
			this.modelYAn = arg0.g2();
		}
		if (this.type == 7) {
			this.linkObjType = new int[this.width * this.height];
			this.linkObjNumber = new int[this.width * this.height];
			this.hAlign = arg0.g1();
			this.font = arg0.g2();
			this.shadow = arg0.g1() == 1;
			this.colour = arg0.g4();
			this.marginX = arg0.g2b();
			this.marginY = arg0.g2b();
			this.field2533 = arg0.g1() == 1;
			this.iop = new JagString[5];
			for (int var11 = 0; var11 < 5; var11++) {
				this.iop[var11] = arg0.gjstr();
				if (this.iop[var11].length() == 0) {
					this.iop[var11] = null;
				}
			}
		}
		if (this.type == 8) {
			this.text = arg0.gjstr();
		}
		if (this.buttonType == 2 || this.type == 2) {
			this.targetVerb = arg0.gjstr();
			this.targetBase = arg0.gjstr();
			this.field2508 = arg0.g2();
		}
		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = arg0.gjstr();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = Text.OK;
				}
				if (this.buttonType == 4) {
					this.buttonText = Text.SELECT;
				}
				if (this.buttonType == 5) {
					this.buttonText = Text.SELECT;
				}
				if (this.buttonType == 6) {
					this.buttonText = Text.CONTINUE;
				}
			}
		}
	}

	@ObfuscatedName("qd.a(BI)Ljd;")
	public Pix32 getInvBackground(int arg0) {
		loadingAsset = false;
		if (arg0 < 0 || this.invBackground.length <= arg0) {
			return null;
		}
		int var2 = this.invBackground[arg0];
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) spriteCache.find((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.makePix32(0, sprites, var2);
		if (var4 == null) {
			loadingAsset = true;
		} else {
			spriteCache.put((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("qd.a(IZ)Ljd;")
	public Pix32 getGraphic(boolean arg0) {
		loadingAsset = false;
		int var2;
		if (arg0) {
			var2 = this.graphic2;
		} else {
			var2 = this.graphic;
		}
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) spriteCache.find((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.makePix32(0, sprites, var2);
		if (var4 == null) {
			loadingAsset = true;
		} else {
			spriteCache.put((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("qd.a(BLba;)V")
	public void decode3(Packet arg0) {
		arg0.g1();
		this.v3 = true;
		this.type = arg0.g1();
		this.clientCode = arg0.g2();
		this.dataX = this.x = arg0.g2b();
		this.dataY = this.y = arg0.g2b();
		this.width = arg0.g2();
		if (this.type == 9) {
			this.height = arg0.g2b();
		} else {
			this.height = arg0.g2();
		}
		this.layerId = arg0.g2();
		if (this.layerId == 65535) {
			this.layerId = -1;
		}
		this.hide = arg0.g1() == 1;
		this.hashook = arg0.g1() == 1;
		if (this.type == 0) {
			this.scrollWidth = arg0.g2();
			this.scrollHeight = arg0.g2();
		}
		if (this.type == 5) {
			this.graphic = arg0.g4();
			this.rotate = arg0.g2();
			this.tiling = arg0.g1() == 1;
			this.trans = arg0.g1();
		}
		if (this.type == 6) {
			this.model1Type = 1;
			this.model1Id = arg0.g2();
			if (this.model1Id == 65535) {
				this.model1Id = -1;
			}
			this.modelXOf = arg0.g2b();
			this.modelYOf = arg0.g2b();
			this.modelXAn = arg0.g2();
			this.modelYAn = arg0.g2();
			this.modelZAn = arg0.g2();
			this.modelZoom = arg0.g2();
			this.modelAnim = arg0.g2();
			if (this.modelAnim == 65535) {
				this.modelAnim = -1;
			}
			this.orthog = arg0.g1() == 1;
		}
		if (this.type == 4) {
			this.font = arg0.g2();
			this.text = arg0.gjstr();
			this.lineHeight = arg0.g1();
			this.hAlign = arg0.g1();
			this.vAlign = arg0.g1();
			this.shadow = arg0.g1() == 1;
			this.colour = arg0.g4();
		}
		if (this.type == 3) {
			this.colour = arg0.g4();
			this.fill = arg0.g1() == 1;
			this.trans = arg0.g1();
		}
		if (this.type == 9) {
			arg0.g1();
			this.colour = arg0.g4();
		}
		if (this.hashook) {
			this.field2483 = decodeHook(arg0);
			this.field2487 = decodeHook(arg0);
			this.field2450 = decodeHook(arg0);
			this.field2513 = decodeHook(arg0);
			this.field2464 = decodeHook(arg0);
			this.field2478 = decodeHook(arg0);
			this.field2475 = decodeHook(arg0);
			decodeHook(arg0);
			this.field2456 = decodeHook(arg0);
			this.field2518 = decodeHook(arg0);
			decodeHook(arg0);
			this.field2501 = decodeHook(arg0);
			this.field2553 = decodeHook(arg0);
			this.field2486 = decodeHook(arg0);
			this.field2533 = arg0.g1() == 1;
			this.field2542 = arg0.g2();
			this.field2500 = arg0.g1() == 1;
			arg0.g1();
			int var2 = arg0.g1();
			if (var2 > 0) {
				this.opNames = new JagString[var2];
				for (int var3 = 0; var3 < var2; var3++) {
					this.opNames[var3] = arg0.gjstr();
				}
			}
			this.field2544 = arg0.g2();
			if (this.field2544 == 65535) {
				this.field2544 = -1;
			}
		}
	}

	@ObfuscatedName("qd.a(BLhe;IZLla;)Lpa;")
	public Model getTempModel(SeqType arg0, int arg1, boolean arg2, PlayerModel arg3) {
		loadingAsset = false;
		int var5;
		int var6;
		if (arg2) {
			var5 = this.model2Id;
			var6 = this.model2Type;
		} else {
			var6 = this.model1Type;
			var5 = this.model1Id;
		}
		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var5 == -1) {
			return null;
		} else {
			Model var7 = (Model) modelCache.find((long) ((var6 << 16) + var5));
			if (var7 == null) {
				if (var6 == 1) {
					var7 = Model.load(models, var5);
					if (var7 == null) {
						loadingAsset = true;
						return null;
					}
					var7.prepareAnim();
					var7.light(64, 768, -50, -10, -50, true);
				}
				if (var6 == 2) {
					var7 = NpcType.list(var5).getHead();
					if (var7 == null) {
						loadingAsset = true;
						return null;
					}
					var7.prepareAnim();
					var7.light(64, 768, -50, -10, -50, true);
				}
				if (var6 == 3) {
					if (arg3 == null) {
						return null;
					}
					var7 = arg3.getHeadModel();
					if (var7 == null) {
						loadingAsset = true;
						return null;
					}
					var7.prepareAnim();
					var7.light(64, 768, -50, -10, -50, true);
				}
				if (var6 == 4) {
					ObjType var8 = ObjType.list(var5);
					var7 = var8.getModelLit(false, 10);
					if (var7 == null) {
						loadingAsset = true;
						return null;
					}
					var7.prepareAnim();
					var7.light(var8.ambient + 64, var8.contrast + 768, -50, -10, -50, true);
				}
				modelCache.put((long) ((var6 << 16) + var5), var7);
			}
			if (arg0 != null) {
				var7 = arg0.animateModelWithExtra(arg1, var7);
			}
			return var7;
		}
	}

	@ObfuscatedName("qd.d(B)Lbc;")
	public PixFont getFont() {
		loadingAsset = false;
		if (this.font == 65535) {
			return null;
		}
		PixFont var1 = (PixFont) fontCache.find((long) this.font);
		if (var1 != null) {
			return var1;
		}
		PixFont var2 = PixLoader.makePixFont(0, sprites, this.font);
		if (var2 == null) {
			loadingAsset = true;
		} else {
			fontCache.put((long) this.font, var2);
		}
		return var2;
	}
}
