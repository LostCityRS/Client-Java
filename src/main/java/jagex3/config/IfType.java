package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.ModelUnlit;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.LruCache;
import jagex3.graphics.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("q")
public final class IfType {

	@ObfuscatedName("kd.T")
	public static final LruCache spriteCache = new LruCache(200);
	@ObfuscatedName("pe.B")
	public static final ModelSourceCache modelCache = new ModelSourceCache(50);
	@ObfuscatedName("oe.d")
	public static final LruCache fontCache = new LruCache(20);
	@ObfuscatedName("pd.Z")
	public static boolean[] open;
	@ObfuscatedName("hh.fb")
	public static Js5 interfaces;
	@ObfuscatedName("ha.D")
	public static IfType[][] list;
	@ObfuscatedName("wi.s")
	public static boolean loadingAsset = false;
	@ObfuscatedName("ib.y")
	public static Js5 models;
	@ObfuscatedName("jh.f")
	public static Js5 field1926;
	@ObfuscatedName("fi.v")
	public static Js5 field1176;
	@ObfuscatedName("q.a")
	public int field3365 = 0;

	@ObfuscatedName("q.ab")
	public int modelBaseHeight = 0;

	@ObfuscatedName("q.ac")
	public int vAlign = 0;

	@ObfuscatedName("q.b")
	public int renderX = 0;

	@ObfuscatedName("q.bb")
	public int height = 0;

	@ObfuscatedName("q.bc")
	public boolean noClickThrough = false;

	@ObfuscatedName("q.c")
	public byte xAlignment = 0;

	@ObfuscatedName("q.cc")
	public Object[] onscrollwheel;

	@ObfuscatedName("q.d")
	public int buttonType = 0;

	@ObfuscatedName("q.db")
	public boolean tiling = false;

	@ObfuscatedName("q.dc")
	public int[] invBackgroundX;

	@ObfuscatedName("q.e")
	public int[] oninvtransmitlist;

	@ObfuscatedName("q.eb")
	public int[] graphicMaskLineLengths;

	@ObfuscatedName("q.ec")
	public int graphic = -1;

	@ObfuscatedName("q.f")
	public Object[] onmouseover;

	@ObfuscatedName("q.fb")
	public int renderHeight = 0;

	@ObfuscatedName("q.fc")
	public int[] linkObjNumber;

	@ObfuscatedName("q.g")
	public int drawTime = -1;

	@ObfuscatedName("q.gb")
	public int parentId = -1;

	@ObfuscatedName("q.h")
	public int varTransmitNum = 0;

	@ObfuscatedName("q.hb")
	public int overLayerId = -1;

	@ObfuscatedName("q.i")
	public JagString[] opNames;

	@ObfuscatedName("q.ib")
	public int shadowColour = 0;

	@ObfuscatedName("q.ic")
	public boolean field3477 = false;

	@ObfuscatedName("q.j")
	public int colour2Over = 0;

	@ObfuscatedName("q.jb")
	public Object[] onresize;

	@ObfuscatedName("q.jc")
	public boolean clickTrigger = false;

	@ObfuscatedName("q.k")
	public int scrollHeight = 0;

	@ObfuscatedName("q.kb")
	public boolean draggablebehavior = false;

	@ObfuscatedName("q.kc")
	public int hAlign = 0;

	@ObfuscatedName("q.l")
	public int model2Type = 1;

	@ObfuscatedName("q.lc")
	public int trans = 0;

	@ObfuscatedName("q.m")
	public Object[] onkey;

	@ObfuscatedName("q.mb")
	public int outline = 0;

	@ObfuscatedName("q.mc")
	public Object[] onvartransmit;

	@ObfuscatedName("q.n")
	public boolean hide = false;

	@ObfuscatedName("q.nb")
	public int model1Type = 1;

	@ObfuscatedName("q.nc")
	public int invcount = 0;

	@ObfuscatedName("q.o")
	public int animFrame = 0;

	@ObfuscatedName("q.ob")
	public int colourOver = 0;

	@ObfuscatedName("q.oc")
	public boolean hFlip;

	@ObfuscatedName("q.p")
	public int renderWidth = 0;

	@ObfuscatedName("q.pb")
	public int modelXOf = 0;

	@ObfuscatedName("q.pc")
	public Object[] onfriendtransmit;

	@ObfuscatedName("q.q")
	public Object[] onclantransmit;

	@ObfuscatedName("q.qb")
	public int graphic2 = -1;

	@ObfuscatedName("q.qc")
	public int modelZoom = 100;

	@ObfuscatedName("q.r")
	public int drawCount = -1;

	@ObfuscatedName("q.rb")
	public Object[] ondialogabort;

	@ObfuscatedName("q.rc")
	public int[] scriptOperand;

	@ObfuscatedName("fj.b")
	public static final JagString EMPTY = JagString.wrap("");
	@ObfuscatedName("q.s")
	public JagString text = EMPTY;

	@ObfuscatedName("q.sb")
	public boolean shadow = false;

	@ObfuscatedName("q.sc")
	public int animCycle = 0;

	@ObfuscatedName("q.t")
	public int scrollWidth = 0;

	@ObfuscatedName("q.tb")
	public Object[] onload;

	@ObfuscatedName("q.u")
	public int modelSpin = 0;

	@ObfuscatedName("q.ub")
	public int rotate = 0;

	@ObfuscatedName("q.v")
	public int modelAnim2 = -1;

	@ObfuscatedName("q.vc")
	public Object[] onclick;

	@ObfuscatedName("q.w")
	public boolean vFlip;

	@ObfuscatedName("q.wb")
	public int clientCode = 0;

	@ObfuscatedName("q.D")
	public byte heightAlignment = 0;

	@ObfuscatedName("q.C")
	public int scrollPosX = 0;

	@ObfuscatedName("q.F")
	public int lineHeight = 0;

	@ObfuscatedName("q.M")
	public boolean orthog = false;

	@ObfuscatedName("q.I")
	public int invobject = -1;

	@ObfuscatedName("q.A")
	public int x = 0;

	@ObfuscatedName("q.X")
	public int colour = 0;

	@ObfuscatedName("q.Db")
	public JagString text2 = EMPTY;

	@ObfuscatedName("q.yb")
	public int renderY = 0;

	@ObfuscatedName("q.O")
	public int modelYOf = 0;

	@ObfuscatedName("q.Y")
	public int scrollPosY = 0;

	@ObfuscatedName("q.Qb")
	public JagString targetBase = EMPTY;

	@ObfuscatedName("q.Gb")
	public boolean hashook = false;

	@ObfuscatedName("q.W")
	public int dragdeadzone = 0;

	@ObfuscatedName("q.S")
	public int model1Id = -1;

	@ObfuscatedName("q.Xb")
	public int marginX = 0;

	@ObfuscatedName("q.Mb")
	public int modelXAn = 0;

	@ObfuscatedName("q.Ib")
	public byte yAlignment = 0;

	@ObfuscatedName("q.Zb")
	public int modelBaseWidth = 0;

	@ObfuscatedName("q.N")
	public int modelAnim = -1;

	@ObfuscatedName("q.Rb")
	public JagString buttonText = Text.OK;

	@ObfuscatedName("q.P")
	public int subId = -1;

	@ObfuscatedName("q.gc")
	public int dragdeadtime = 0;

	@ObfuscatedName("q.Sb")
	public int font = -1;

	@ObfuscatedName("q.xc")
	public boolean lineDirection = false;

	@ObfuscatedName("q.Yb")
	public boolean mouseTrigger = false;

	@ObfuscatedName("q.zb")
	public int model2Id = -1;

	@ObfuscatedName("q.Ob")
	public JagString baseOpName = EMPTY;

	@ObfuscatedName("q.Cc")
	public int lineWidth = 1;

	@ObfuscatedName("q.Q")
	public int invTransmitNum = 0;

	@ObfuscatedName("q.Bc")
	public boolean fill = false;

	@ObfuscatedName("q.Ub")
	public byte widthAlignment = 0;

	@ObfuscatedName("q.Tb")
	public int transmitNum = -1;

	@ObfuscatedName("q.T")
	public boolean v3 = false;

	@ObfuscatedName("q.Vb")
	public boolean showCount = true;

	@ObfuscatedName("q.Hc")
	public IfType draggable = null;

	@ObfuscatedName("q.Rc")
	public JagString targetVerb = EMPTY;

	@ObfuscatedName("q.Oc")
	public int modelYAn = 0;

	@ObfuscatedName("q.Jc")
	public int layerId = -1;

	@ObfuscatedName("q.Dc")
	public int field3498 = 0;

	@ObfuscatedName("q.Ec")
	public int statTransmitNum = 0;

	@ObfuscatedName("q.Nc")
	public int marginY = 0;

	@ObfuscatedName("q.Tc")
	public int y = 0;

	@ObfuscatedName("q.Gc")
	public int width = 0;

	@ObfuscatedName("q.Sc")
	public int colour2 = 0;

	@ObfuscatedName("q.Wc")
	public int modelZAn = 0;

	@ObfuscatedName("q.zc")
	public int eventCode = 0;

	@ObfuscatedName("q.z")
	public int type;

	@ObfuscatedName("q.yc")
	public byte[] hotkeys;

	@ObfuscatedName("q.x")
	public int[] linkObjType;

	@ObfuscatedName("q.y")
	public int[] invBackground;

	@ObfuscatedName("q.G")
	public int[] invBackgroundY;

	@ObfuscatedName("q.H")
	public int[] onstattransmitlist;

	@ObfuscatedName("q.L")
	public int[] graphicMaskLineOffsets;

	@ObfuscatedName("q.Hb")
	public int[] onvartransmitlist;

	@ObfuscatedName("q.Vc")
	public int[] scriptComparator;

	@ObfuscatedName("q.Wb")
	public IfType[] subcomponents;

	@ObfuscatedName("q.Qc")
	public JagString[] iop;

	@ObfuscatedName("q.K")
	public Object[] onop;

	@ObfuscatedName("q.R")
	public Object[] onrelease;

	@ObfuscatedName("q.V")
	public Object[] ondragcomplete;

	@ObfuscatedName("q.xb")
	public Object[] ontargetleave;

	@ObfuscatedName("q.Ab")
	public Object[] oninvtransmit;

	@ObfuscatedName("q.Bb")
	public Object[] onmisctransmit;

	@ObfuscatedName("q.Eb")
	public Object[] ontargetenter;

	@ObfuscatedName("q.Fb")
	public Object[] onmouseleave;

	@ObfuscatedName("q.Jb")
	public Object[] onclickrepeat;

	@ObfuscatedName("q.Lb")
	public Object[] onstattransmit;

	@ObfuscatedName("q.Nb")
	public Object[] ondrag;

	@ObfuscatedName("q.Pb")
	public Object[] ontimer;

	@ObfuscatedName("q.Ac")
	public Object[] onsubchange;

	@ObfuscatedName("q.Ic")
	public Object[] onhold;

	@ObfuscatedName("q.Kc")
	public Object[] onstocktransmit;

	@ObfuscatedName("q.Pc")
	public Object[] onmouserepeat;

	@ObfuscatedName("q.Xc")
	public Object[] onchattransmit;

	@ObfuscatedName("q.B")
	public int[][] scripts;

	@ObfuscatedName("td.c(II)Z")
	public static boolean openInterface(int arg0) {
		if (open[arg0]) {
			return true;
		}

		if (!interfaces.requestGroupDownload(arg0)) {
			return false;
		}

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
					list[arg0][var2].parentId = var2 + (arg0 << 16);
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
	}

	@ObfuscatedName("ne.a(Z)V")
	public static void resetCache() {
		spriteCache.clear();
		modelCache.clear();
		fontCache.clear();
	}

	@ObfuscatedName("lf.a(Lnb;ILnb;Lnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		models = arg3;
		field1176 = arg0;
		interfaces = arg1;
		field1926 = arg2;
		list = new IfType[interfaces.getGroupCount()][];
		open = new boolean[interfaces.getGroupCount()];
	}

	@ObfuscatedName("da.c(IB)V")
	public static void unloadInterface(int arg0) {
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

	@ObfuscatedName("w.a(II)Lq;")
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

	// might belong in IfType
	@ObfuscatedName("db.a(IIZ)Lq;")
	public static IfType get(int arg0, int arg1) {
		IfType var2 = get(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.subcomponents == null || var2.subcomponents.length <= arg0) {
			return null;
		} else {
			return var2.subcomponents[arg0];
		}
	}

	@ObfuscatedName("q.a(III)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = this.linkObjType[arg1];
		this.linkObjType[arg1] = this.linkObjType[arg0];
		this.linkObjType[arg0] = var3;
		int var4 = this.linkObjNumber[arg1];
		this.linkObjNumber[arg1] = this.linkObjNumber[arg0];
		this.linkObjNumber[arg0] = var4;
	}

	@ObfuscatedName("q.a(Lk;Ltb;IZI)Lcg;")
	public ModelLit getTempModel(SeqType arg0, PlayerModel arg1, int arg2, boolean arg3) {
		loadingAsset = false;
		int var5;
		int var6;
		if (arg3) {
			var5 = this.model2Type;
			var6 = this.model2Id;
		} else {
			var5 = this.model1Type;
			var6 = this.model1Id;
		}
		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else if (var5 == 1) {
			ModelLit var7 = (ModelLit) modelCache.find((long) (var6 + (var5 << 16)));
			if (var7 == null) {
				ModelUnlit var8 = ModelUnlit.load(models, var6);
				if (var8 == null) {
					loadingAsset = true;
					return null;
				}
				var7 = var8.light(64, 768, -50, -10, -50);
				modelCache.put((long) ((var5 << 16) + var6), var7);
			}
			if (arg0 != null) {
				var7 = arg0.animateModelWithExtra(arg2, var7);
			}
			return var7;
		} else if (var5 == 2) {
			ModelLit var9 = NpcType.list(var6).getHeadModelLit(arg2, arg0);
			if (var9 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var9;
			}
		} else if (var5 == 3) {
			if (arg1 == null) {
				return null;
			}
			ModelLit var10 = arg1.getHeadModel(arg0, arg2);
			if (var10 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var10;
			}
		} else if (var5 == 4) {
			ObjType var11 = ObjType.list(var6);
			ModelLit var12 = var11.getModelLit(10, arg2, arg0);
			if (var12 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var12;
			}
		} else if (var5 == 6) {
			ModelLit var13 = NpcType.list(var6).getTempModel(null, 0, arg2, arg0);
			if (var13 == null) {
				loadingAsset = true;
				return null;
			} else {
				return var13;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("q.a(I)Z")
	public boolean calculateGraphicMask() {
		if (this.graphicMaskLineOffsets != null) {
			return true;
		}
		SoftwarePix8 var1 = PixLoader.makeSoftwarePix8(field1176, this.graphic);
		if (var1 == null) {
			return false;
		}
		var1.trim();
		this.graphicMaskLineOffsets = new int[var1.hi];
		this.graphicMaskLineLengths = new int[var1.hi];
		for (int var2 = 0; var2 < var1.hi; var2++) {
			int var3 = 0;
			int var4 = var1.wi;
			for (int var5 = 0; var5 < var1.wi; var5++) {
				if (var1.data[var5 + var2 * var1.wi] != 0) {
					var3 = var5;
					break;
				}
			}
			for (int var6 = var3; var6 < var1.wi; var6++) {
				if (var1.data[var6 + var1.wi * var2] == 0) {
					var4 = var6;
					break;
				}
			}
			this.graphicMaskLineOffsets[var2] = var3;
			this.graphicMaskLineLengths[var2] = var4 - var3;
		}
		return true;
	}

	@ObfuscatedName("q.a(IB)Lrc;")
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
		Pix32 var4 = PixLoader.makePix32(field1176, var2, 0);
		if (var4 == null) {
			loadingAsset = true;
		} else {
			spriteCache.put((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("q.a(ZI)Lrc;")
	public Pix32 getGraphic(boolean arg0) {
		int var2;
		if (arg0) {
			var2 = this.graphic2;
		} else {
			var2 = this.graphic;
		}
		loadingAsset = false;
		if (var2 == -1) {
			return null;
		}
		long var3 = ((long) this.shadowColour << 40) + ((this.hFlip ? 1L : 0L) << 39) + ((this.vFlip ? 1L : 0L) << 38) + (long) var2 + ((this.field3477 ? 1L : 0L) << 35) + ((long) this.outline << 36);
		Pix32 var5 = (Pix32) spriteCache.find(var3);
		if (var5 != null) {
			return var5;
		}
		SoftwarePix32 var6 = PixLoader.makeSoftwarePix32(field1176, 0, var2);
		if (var6 == null) {
			loadingAsset = true;
			return null;
		}
		if (this.vFlip) {
			var6.vflip();
		}
		if (this.hFlip) {
			var6.hflip();
		}
		if (this.outline > 0) {
			var6.untrim(this.outline);
		}
		if (this.outline >= 1) {
			var6.addOutline(1);
		}
		if (this.outline >= 2) {
			var6.addOutline(16777215);
		}
		if (this.shadowColour != 0) {
			var6.addShadow(this.shadowColour);
		}
		spriteCache.put(var3, var6);
		return var6;
	}

	@ObfuscatedName("q.a(BLea;)V")
	public void decode3(Packet arg0) {
		arg0.pos++;
		this.v3 = true;
		this.type = arg0.g1();
		this.clientCode = arg0.g2();
		this.x = arg0.g2b();
		this.y = arg0.g2b();
		this.width = arg0.g2();
		this.height = arg0.g2();
		this.widthAlignment = arg0.g1b();
		this.heightAlignment = arg0.g1b();
		this.xAlignment = arg0.g1b();
		this.yAlignment = arg0.g1b();
		this.layerId = arg0.g2();
		if (this.layerId == 65535) {
			this.layerId = -1;
		} else {
			this.layerId += this.parentId & 0xFFFF0000;
		}
		this.hide = arg0.g1() == 1;
		if (this.type == 0) {
			this.scrollWidth = arg0.g2();
			this.scrollHeight = arg0.g2();
			this.noClickThrough = arg0.g1() == 1;
		}
		if (this.type == 5) {
			this.graphic = arg0.g4();
			this.rotate = arg0.g2();
			int var2 = arg0.g1();
			this.tiling = (var2 & 0x1) != 0;
			this.field3477 = (var2 & 0x2) != 0;
			this.trans = arg0.g1();
			this.outline = arg0.g1();
			this.shadowColour = arg0.g4();
			this.vFlip = arg0.g1() == 1;
			this.hFlip = arg0.g1() == 1;
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
			arg0.g2();
			if (this.widthAlignment != 0) {
				this.modelBaseWidth = arg0.g2();
			}
			if (this.heightAlignment != 0) {
				this.modelBaseHeight = arg0.g2();
			}
		}
		if (this.type == 4) {
			this.font = arg0.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
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
			this.lineWidth = arg0.g1();
			this.colour = arg0.g4();
			this.lineDirection = arg0.g1() == 1;
		}
		this.eventCode = arg0.g3();
		int var3 = arg0.g1();
		if (var3 > 0) {
			this.hotkeys = new byte[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.hotkeys[var4] = arg0.g1b();
			}
		}
		this.baseOpName = arg0.gjstr();
		int var5 = arg0.g1();
		if (var5 > 0) {
			this.opNames = new JagString[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.opNames[var6] = arg0.gjstr();
			}
		}
		this.dragdeadzone = arg0.g1();
		this.dragdeadtime = arg0.g1();
		this.draggablebehavior = arg0.g1() == 1;
		this.targetVerb = arg0.gjstr();
		this.onload = this.decodeHook(arg0);
		this.onmouseover = this.decodeHook(arg0);
		this.onmouseleave = this.decodeHook(arg0);
		this.ontargetleave = this.decodeHook(arg0);
		this.ontargetenter = this.decodeHook(arg0);
		this.onvartransmit = this.decodeHook(arg0);
		this.oninvtransmit = this.decodeHook(arg0);
		this.onstattransmit = this.decodeHook(arg0);
		this.ontimer = this.decodeHook(arg0);
		this.onop = this.decodeHook(arg0);
		this.onmouserepeat = this.decodeHook(arg0);
		this.onclick = this.decodeHook(arg0);
		this.onclickrepeat = this.decodeHook(arg0);
		this.onrelease = this.decodeHook(arg0);
		this.onhold = this.decodeHook(arg0);
		this.ondrag = this.decodeHook(arg0);
		this.ondragcomplete = this.decodeHook(arg0);
		this.onscrollwheel = this.decodeHook(arg0);
		this.onvartransmitlist = this.decodeTransmitList(arg0);
		this.oninvtransmitlist = this.decodeTransmitList(arg0);
		this.onstattransmitlist = this.decodeTransmitList(arg0);
	}

	@ObfuscatedName("q.a(Lea;B)[I")
	public int[] decodeTransmitList(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 == 0) {
			return null;
		}
		int[] var3 = new int[var2];
		for (int var4 = 0; var4 < var2; var4++) {
			var3[var4] = arg0.g4();
		}
		return var3;
	}

	@ObfuscatedName("q.a(I[Llj;)Lcc;")
	public PixfontGeneric getFont(Pix8[] arg0) {
		loadingAsset = false;
		if (this.font == -1) {
			return null;
		}
		PixfontGeneric var2 = (PixfontGeneric) fontCache.find((long) this.font);
		if (var2 != null) {
			return var2;
		}
		PixfontGeneric var3 = PixLoader.makePixFont(0, field1926, this.font, field1176);
		if (var3 == null) {
			loadingAsset = true;
		} else {
			var3.setIcons(arg0, null);
			fontCache.put((long) this.font, var3);
		}
		return var3;
	}

	@ObfuscatedName("q.a(BLi;I)V")
	public void setOpName(JagString arg0, int arg1) {
		if (this.opNames == null || arg1 >= this.opNames.length) {
			JagString[] var3 = new JagString[arg1 + 1];
			if (this.opNames != null) {
				for (int var4 = 0; var4 < this.opNames.length; var4++) {
					var3[var4] = this.opNames[var4];
				}
			}
			this.opNames = var3;
		}
		this.opNames[arg1] = arg0;
	}

	@ObfuscatedName("q.a(Lea;I)[Ljava/lang/Object;")
	public Object[] decodeHook(Packet arg0) {
		int var2 = arg0.g1();
		if (var2 == 0) {
			return null;
		}
		Object[] var3 = new Object[var2];
		for (int var4 = 0; var4 < var2; var4++) {
			int var5 = arg0.g1();
			if (var5 == 0) {
				var3[var4] = Integer.valueOf(arg0.g4());
			} else if (var5 == 1) {
				var3[var4] = arg0.gjstr();
			}
		}
		this.hashook = true;
		return var3;
	}

	@ObfuscatedName("q.a(ILea;)V")
	public void decode(Packet arg0) {
		this.v3 = false;
		this.type = arg0.g1();
		this.buttonType = arg0.g1();
		this.clientCode = arg0.g2();
		this.x = arg0.g2b();
		this.y = arg0.g2b();
		this.width = arg0.g2();
		this.height = arg0.g2();
		this.heightAlignment = 0;
		this.widthAlignment = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.trans = arg0.g1();
		this.layerId = arg0.g2();
		if (this.layerId == 65535) {
			this.layerId = -1;
		} else {
			this.layerId = (this.parentId & 0xFFFF0000) + this.layerId;
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
				this.scriptComparator[var3] = arg0.g1();
				this.scriptOperand[var3] = arg0.g2();
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
			this.scrollHeight = arg0.g2();
			this.hide = arg0.g1() == 1;
		}
		if (this.type == 1) {
			arg0.g2();
			arg0.g1();
		}
		if (this.type == 2) {
			this.linkObjType = new int[this.width * this.height];
			this.linkObjNumber = new int[this.height * this.width];
			this.heightAlignment = 3;
			this.widthAlignment = 3;
			int var8 = arg0.g1();
			if (var8 == 1) {
				this.eventCode |= 0x10000000;
			}
			int var9 = arg0.g1();
			if (var9 == 1) {
				this.eventCode |= 0x40000000;
			}
			int var10 = arg0.g1();
			if (var10 == 1) {
				this.eventCode |= Integer.MIN_VALUE;
			}
			int var11 = arg0.g1();
			if (var11 == 1) {
				this.eventCode |= 0x20000000;
			}
			this.marginX = arg0.g1();
			this.marginY = arg0.g1();
			this.invBackground = new int[20];
			this.invBackgroundY = new int[20];
			this.invBackgroundX = new int[20];
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = arg0.g1();
				if (var13 == 1) {
					this.invBackgroundX[var12] = arg0.g2b();
					this.invBackgroundY[var12] = arg0.g2b();
					this.invBackground[var12] = arg0.g4();
				} else {
					this.invBackground[var12] = -1;
				}
			}
			this.iop = new JagString[5];
			for (int var14 = 0; var14 < 5; var14++) {
				JagString var15 = arg0.gjstr();
				if (var15.length() > 0) {
					this.iop[var14] = var15;
					this.eventCode |= 0x1 << var14 + 23;
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
			if (this.font == 65535) {
				this.font = -1;
			}
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
			this.model2Type = 1;
			if (this.model1Id == 65535) {
				this.model1Id = -1;
			}
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
			this.heightAlignment = 3;
			this.linkObjType = new int[this.width * this.height];
			this.widthAlignment = 3;
			this.linkObjNumber = new int[this.width * this.height];
			this.hAlign = arg0.g1();
			this.font = arg0.g2();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.shadow = arg0.g1() == 1;
			this.colour = arg0.g4();
			this.marginX = arg0.g2b();
			this.marginY = arg0.g2b();
			int var16 = arg0.g1();
			this.iop = new JagString[5];
			if (var16 == 1) {
				this.eventCode |= 0x40000000;
			}
			for (int var17 = 0; var17 < 5; var17++) {
				JagString var18 = arg0.gjstr();
				if (var18.length() > 0) {
					this.iop[var17] = var18;
					this.eventCode |= 0x1 << var17 + 23;
				}
			}
		}
		if (this.type == 8) {
			this.text = arg0.gjstr();
		}
		if (this.buttonType == 2 || this.type == 2) {
			this.targetVerb = arg0.gjstr();
			this.targetBase = arg0.gjstr();
			int var19 = arg0.g2() & 0x3F;
			this.eventCode |= var19 << 11;
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
		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.eventCode |= 0x400000;
		}
		if (this.buttonType == 6) {
			this.eventCode |= 0x1;
		}
	}
}
