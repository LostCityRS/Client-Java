package jagex3.config.iftype;

import deob.ObfuscatedName;
import jagex3.config.NpcType;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.Linkable;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix32;
import jagex3.graphics.PixFontGeneric;
import jagex3.graphics.PixLoader;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("f")
public final class IfType extends Linkable {
	@ObfuscatedName("lc.b")
	public static IfType[][] list;

	@ObfuscatedName("nb.I")
	public static boolean[] open;

	@ObfuscatedName("mb.n")
	public static Js5 interfaces;

	@ObfuscatedName("we.B")
	public static Js5 models;

	@ObfuscatedName("bd.u")
	public static Js5 sprites;

	@ObfuscatedName("ac.M")
	public static Js5 fontMetrics;

	@ObfuscatedName("mb.j")
	public static LruCache spriteCache = new LruCache(200);

	@ObfuscatedName("sa.h")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("gb.i")
	public static LruCache fontCache = new LruCache(20);

	@ObfuscatedName("s.q")
	public static boolean loadingAsset = false;

	@ObfuscatedName("f.Ac")
	public boolean v3 = false;

	@ObfuscatedName("f.y")
	public int parentId = -1;

	@ObfuscatedName("f.gc")
	public int subId = -1;

	@ObfuscatedName("f.K")
	public int type;

	@ObfuscatedName("f.ub")
	public int buttonType = 0;

	@ObfuscatedName("f.xc")
	public int clientCode = 0;

	@ObfuscatedName("f.hc")
	public int x = 0;

	@ObfuscatedName("f.Hc")
	public int y = 0;

	@ObfuscatedName("f.Bb")
	public int dataX = 0;

	@ObfuscatedName("f.Z")
	public int dataY = 0;

	@ObfuscatedName("f.Ob")
	public int width = 0;

	@ObfuscatedName("f.db")
	public int height = 0;

	@ObfuscatedName("f.Qc")
	public int layerId = -1;

	@ObfuscatedName("f.v")
	public boolean hide = false;

	@ObfuscatedName("f.Yc")
	public int scrollPosY = 0;

	@ObfuscatedName("f.Mc")
	public int scrollWidth = 0;

	@ObfuscatedName("f.Yb")
	public int scrollHeight = 0;

	@ObfuscatedName("f.gb")
	public int colour = 0;

	@ObfuscatedName("f.Vc")
	public int colour2 = 0;

	@ObfuscatedName("f.ic")
	public int colourOver = 0;

	@ObfuscatedName("f.nb")
	public int colour2Over = 0;

	@ObfuscatedName("f.Hb")
	public boolean fill = false;

	@ObfuscatedName("f.Nc")
	public int trans = 0;

	@ObfuscatedName("f.sb")
	public int lineWidth = 1;

	@ObfuscatedName("f.Xb")
	public int graphic = -1;

	@ObfuscatedName("f.wc")
	public int graphic2 = -1;

	@ObfuscatedName("f.hb")
	public int rotate = 0;

	@ObfuscatedName("f.D")
	public boolean tiling = false;

	@ObfuscatedName("f.Ab")
	public int outline = 0;

	@ObfuscatedName("f.Vb")
	public int shadowColour = 0;

	@ObfuscatedName("f.Sb")
	public boolean vFlip;

	@ObfuscatedName("f.cb")
	public boolean hFlip;

	@ObfuscatedName("f.ab")
	public int model1Type = 1;

	@ObfuscatedName("f.Bc")
	public int model1Id = -1;

	@ObfuscatedName("f.Cb")
	public int model2Type = 1;

	@ObfuscatedName("f.Pb")
	public int model2Id = -1;

	@ObfuscatedName("f.V")
	public int modelAnim = -1;

	@ObfuscatedName("f.rb")
	public int modelAnim2 = -1;

	@ObfuscatedName("f.Ub")
	public int modelXOf = 0;

	@ObfuscatedName("f.Dc")
	public int modelYOf = 0;

	@ObfuscatedName("f.Qb")
	public int modelXAn = 0;

	@ObfuscatedName("f.ad")
	public int modelYAn = 0;

	@ObfuscatedName("f.F")
	public int modelZAn = 0;

	@ObfuscatedName("f.Mb")
	public int modelZoom = 100;

	@ObfuscatedName("f.Fc")
	public boolean orthog = false;

	@ObfuscatedName("f.Lb")
	public int font = -1;

	@ObfuscatedName("sc.bb")
	public static JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("f.T")
	public JagString text = AUTO_EMPTY;

	@ObfuscatedName("f.eb")
	public JagString text2 = AUTO_EMPTY;

	@ObfuscatedName("f.qc")
	public int lineHeight = 0;

	@ObfuscatedName("f.tc")
	public int hAlign = 0;

	@ObfuscatedName("f.Db")
	public int vAlign = 0;

	@ObfuscatedName("f.Ic")
	public boolean shadow = false;

	@ObfuscatedName("f.Wb")
	public int marginX = 0;

	@ObfuscatedName("f.ob")
	public int marginY = 0;

	@ObfuscatedName("f.Nb")
	public int[] invBackgroundX;

	@ObfuscatedName("f.A")
	public int[] invBackgroundY;

	@ObfuscatedName("f.R")
	public int[] invBackground;

	@ObfuscatedName("f.L")
	public JagString[] iop;

	@ObfuscatedName("f.Y")
	public int eventCode = 0;

	@ObfuscatedName("f.Rb")
	public JagString baseOpName = AUTO_EMPTY;

	@ObfuscatedName("f.t")
	public JagString[] opNames;

	@ObfuscatedName("f.P")
	public int dragdeadzone = 0;

	@ObfuscatedName("f.B")
	public int dragdeadtime = 0;

	@ObfuscatedName("f.Oc")
	public boolean draggablebehavior = false;

	@ObfuscatedName("f.dc")
	public JagString targetVerb = AUTO_EMPTY;

	@ObfuscatedName("f.zc")
	public boolean hashook = false;

	@ObfuscatedName("f.Tc")
	public Object[] onload;

	@ObfuscatedName("f.Rc")
	public Object[] onclick;

	@ObfuscatedName("f.yc")
	public Object[] onclickrepeat;

	@ObfuscatedName("f.nc")
	public Object[] onrelease;

	@ObfuscatedName("f.jb")
	public Object[] onhold;

	@ObfuscatedName("f.Cc")
	public Object[] onmouseover;

	@ObfuscatedName("f.oc")
	public Object[] onmouserepeat;

	@ObfuscatedName("f.fb")
	public Object[] onmouseleave;

	@ObfuscatedName("f.Ec")
	public Object[] ondrag;

	@ObfuscatedName("f.Xc")
	public Object[] ondragcomplete;

	@ObfuscatedName("f.pc")
	public Object[] ontargetenter;

	@ObfuscatedName("f.Gb")
	public Object[] ontargetleave;

	@ObfuscatedName("f.Eb")
	public Object[] onvartransmit;

	@ObfuscatedName("f.Zb")
	public int[] onvartransmitlist;

	@ObfuscatedName("f.G")
	public Object[] oninvtransmit;

	@ObfuscatedName("f.C")
	public int[] oninvtransmitlist;

	@ObfuscatedName("f.bb")
	public Object[] onstattransmit;

	@ObfuscatedName("f.bd")
	public int[] onstattransmitlist;

	@ObfuscatedName("f.W")
	public Object[] ontimer;

	@ObfuscatedName("f.yb")
	public Object[] onop;

	@ObfuscatedName("f.Sc")
	public Object[] onscrollwheel;

	@ObfuscatedName("f.uc")
	public int[][] scripts;

	@ObfuscatedName("f.ib")
	public int[] scriptComparator;

	@ObfuscatedName("f.pb")
	public int[] scriptOperand;

	@ObfuscatedName("f.H")
	public int overLayerId = -1;

	@ObfuscatedName("f.lc")
	public JagString targetBase = AUTO_EMPTY;

	@ObfuscatedName("f.vb")
	public JagString buttonText = Text.OK;

	@ObfuscatedName("f.mc")
	public int[] linkObjType;

	@ObfuscatedName("f.I")
	public int[] linkObjNumber;

	// ---- todo: identify and sort these

	@ObfuscatedName("f.ac")
	public Object[] onmisctransmit;

	@ObfuscatedName("f.bc")
	public int drawCount = -1;

	@ObfuscatedName("f.cc")
	public IfType draggable = null;

	@ObfuscatedName("f.jc")
	public boolean mouseTrigger = false;

	@ObfuscatedName("f.kb")
	public Object[] onfriendtransmit;

	@ObfuscatedName("f.mb")
	public Object[] onchattransmit;

	@ObfuscatedName("f.qb")
	public int invcount = 0;

	@ObfuscatedName("f.rc")
	public int field839 = 0;

	@ObfuscatedName("f.s")
	public int invTransmitNum = 0;

	@ObfuscatedName("f.sc")
	public int drawTime = -1;

	@ObfuscatedName("f.vc")
	public int field843 = 0;

	@ObfuscatedName("f.w")
	public Object[] onkey;

	@ObfuscatedName("f.wb")
	public int varTransmitNum = 0;

	@ObfuscatedName("f.E")
	public int field749 = 0;

	@ObfuscatedName("f.S")
	public int field762 = 0;

	@ObfuscatedName("f.Ib")
	public int invobject = -1;

	@ObfuscatedName("f.Tb")
	public int statTransmitNum = 0;

	@ObfuscatedName("f.Kb")
	public boolean clickTrigger = false;

	@ObfuscatedName("f.Zc")
	public int transmitNum = -1;

	@ObfuscatedName("f.J")
	public IfType[] subcomponents;

	@ObfuscatedName("f.N")
	public Object[] field758;

	@ObfuscatedName("f.xb")
	public Object[] onclantransmit;

	@ObfuscatedName("f.zb")
	public Object[] field795;

	// ----

	@ObfuscatedName("mb.a(Lea;ZLea;Lea;Lea;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		fontMetrics = arg2;
		interfaces = arg3;
		models = arg1;
		sprites = arg0;
		list = new IfType[interfaces.getGroupCount()][];
		open = new boolean[interfaces.getGroupCount()];
	}

	@ObfuscatedName("sc.c(II)Lf;")
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

	@ObfuscatedName("se.a(IIB)Lf;")
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

	@ObfuscatedName("df.b(II)Z")
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
			if (list[arg0][var2] != null) {
				continue;
			}

			byte[] var3 = interfaces.getFile(arg0, var2);
			if (var3 == null) {
				continue;
			}

			list[arg0][var2] = new IfType();
			list[arg0][var2].parentId = (arg0 << 16) + var2;
			if (var3[0] == -1) {
				list[arg0][var2].decode3(new Packet(var3));
			} else {
				list[arg0][var2].decode(new Packet(var3));
			}
		}

		open[arg0] = true;
		return true;
	}

	@ObfuscatedName("f.b(Ljd;B)V")
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
		} else {
			this.layerId += this.parentId & 0xFFFF0000;
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
			this.linkObjNumber = new int[this.width * this.height];
			this.linkObjType = new int[this.height * this.width];
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
				this.eventCode |= 0x80000000;
			}
			int var11 = arg0.g1();
			if (var11 == 1) {
				this.eventCode |= 0x20000000;
			}
			this.marginX = arg0.g1();
			this.marginY = arg0.g1();
			this.invBackgroundY = new int[20];
			this.invBackgroundX = new int[20];
			this.invBackground = new int[20];
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
			this.linkObjType = new int[this.height * this.width];
			this.linkObjNumber = new int[this.height * this.width];
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

	@ObfuscatedName("f.b(Ljd;I)V")
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
		} else {
			this.layerId += this.parentId & 0xFFFF0000;
		}
		this.hide = arg0.g1() == 1;
		if (this.type == 0) {
			this.scrollWidth = arg0.g2();
			this.scrollHeight = arg0.g2();
		}
		if (this.type == 5) {
			this.graphic = arg0.g4();
			this.rotate = arg0.g2();
			this.tiling = arg0.g1() == 1;
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
		}
		this.eventCode = arg0.g3();
		this.baseOpName = arg0.gjstr();
		int var2 = arg0.g1();
		if (var2 > 0) {
			this.opNames = new JagString[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.opNames[var3] = arg0.gjstr();
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

	@ObfuscatedName("f.a(ILjd;)[Ljava/lang/Object;")
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

	@ObfuscatedName("f.a(Ljd;I)[I")
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

	@ObfuscatedName("qf.a(BI)V")
	public static void closeInterface(int arg0) {
		if (arg0 == -1 || !open[arg0]) {
			return;
		}
		interfaces.discardFiles(arg0);
		if (list[arg0] == null) {
			return;
		}
		boolean hasNoInv = true;
		for (int var2 = 0; var2 < list[arg0].length; var2++) {
			if (list[arg0][var2] != null) {
				if (list[arg0][var2].type == 2) {
					hasNoInv = false;
				} else {
					list[arg0][var2] = null;
				}
			}
		}
		if (hasNoInv) {
			list[arg0] = null;
		}
		open[arg0] = false;
	}

	@ObfuscatedName("f.a(IZI)V")
	public void swapSlots(int arg0, int arg1) {
		int var3 = this.linkObjType[arg1];
		this.linkObjType[arg1] = this.linkObjType[arg0];
		this.linkObjType[arg0] = var3;
		int var4 = this.linkObjNumber[arg1];
		this.linkObjNumber[arg1] = this.linkObjNumber[arg0];
		this.linkObjNumber[arg0] = var4;
	}

	@ObfuscatedName("f.a(IZ)Lh;")
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
		long var3 = ((this.hFlip ? 1L : 0L) << 39) + ((this.vFlip ? 1L : 0L) << 38) + ((long) this.outline << 36) + (long) var2 + ((long) this.shadowColour << 40);
		Pix32 var5 = (Pix32) spriteCache.find(var3);
		if (var5 != null) {
			return var5;
		}
		Pix32 var6 = PixLoader.makePix32(0, sprites, var2);
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

	@ObfuscatedName("f.a(Z)Lnf;")
	public PixFontGeneric getFont() {
		loadingAsset = false;
		if (this.font == -1) {
			return null;
		}
		PixFontGeneric var1 = (PixFontGeneric) fontCache.find((long) this.font);
		if (var1 != null) {
			return var1;
		}
		PixFontGeneric var2 = PixLoader.makePixFont(this.font, fontMetrics, sprites, 0);
		if (var2 == null) {
			loadingAsset = true;
		} else {
			fontCache.put((long) this.font, var2);
		}
		return var2;
	}

	@ObfuscatedName("f.b(II)Lh;")
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

	@ObfuscatedName("f.a(Lvc;ILeb;IZ)Lod;")
	public ModelLit getTempModel(SeqType arg0, PlayerModel arg1, int arg2, boolean arg3) {
		loadingAsset = false;
		int var5;
		int var6;
		if (arg3) {
			var6 = this.model2Type;
			var5 = this.model2Id;
		} else {
			var5 = this.model1Id;
			var6 = this.model1Type;
		}
		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var5 == -1) {
			return null;
		} else {
			ModelLit var7 = (ModelLit) modelCache.find((long) ((var6 << 16) + var5));
			if (var7 == null) {
				if (var6 == 1) {
					ModelUnlit var8 = ModelUnlit.load(models, var5);
					if (var8 == null) {
						loadingAsset = true;
						return null;
					}
					var7 = var8.light(64, 768, -50, -10, -50);
				}
				if (var6 == 2) {
					ModelUnlit var9 = NpcType.list(var5).getHead();
					if (var9 == null) {
						loadingAsset = true;
						return null;
					}
					var7 = var9.light(64, 768, -50, -10, -50);
				}
				if (var6 == 3) {
					if (arg1 == null) {
						return null;
					}
					ModelUnlit var10 = arg1.getHeadModel();
					if (var10 == null) {
						loadingAsset = true;
						return null;
					}
					var7 = var10.light(64, 768, -50, -10, -50);
				}
				if (var6 == 4) {
					ObjType var11 = ObjType.list(var5);
					ModelUnlit var12 = var11.getModelUnlit(10);
					if (var12 == null) {
						loadingAsset = true;
						return null;
					}
					var7 = var12.light(var11.ambient + 64, var11.contrast + 768, -50, -10, -50);
				}
				modelCache.put((long) ((var6 << 16) + var5), var7);
			}
			if (arg0 != null) {
				var7 = arg0.animateModelWithExtra(arg2, var7);
			}
			return var7;
		}
	}

	@ObfuscatedName("b.b(B)V")
	public static void resetCache() {
		spriteCache.clear();
		modelCache.clear();
		fontCache.clear();
	}

	@ObfuscatedName("f.a(Lec;ZI)V")
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
}
