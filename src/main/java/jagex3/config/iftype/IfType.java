package jagex3.config.iftype;

import deob.ObfuscatedName;
import jagex3.config.NPCType;
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

	@ObfuscatedName("ac.M")
	public static Js5 field57;
	@ObfuscatedName("mb.n")
	public static Js5 field1991;
	@ObfuscatedName("we.B")
	public static Js5 field3635;
	@ObfuscatedName("bd.u")
	public static Js5 field198;
	@ObfuscatedName("lc.b")
	public static IfType[][] field1825;
	@ObfuscatedName("nb.I")
	public static boolean[] field2119;
	@ObfuscatedName("mb.j")
	public static LruCache field1987 = new LruCache(200);
	@ObfuscatedName("s.q")
	public static boolean field2914 = false;
	@ObfuscatedName("gb.i")
	public static LruCache field1055 = new LruCache(20);
	@ObfuscatedName("sa.h")
	public static LruCache field2922 = new LruCache(50);
	@ObfuscatedName("f.ab")
	public int field770 = 1;

	@ObfuscatedName("f.ac")
	public Object[] field822;

	@ObfuscatedName("f.ad")
	public int field874 = 0;

	@ObfuscatedName("f.bb")
	public Object[] field771;

	@ObfuscatedName("f.bc")
	public int field823 = -1;

	@ObfuscatedName("f.bd")
	public int[] field875;

	@ObfuscatedName("f.cb")
	public boolean field772;

	@ObfuscatedName("f.cc")
	public IfType field824 = null;

	@ObfuscatedName("f.db")
	public int height = 0;

	@ObfuscatedName("sc.bb")
	public static JagString field2939 = JagString.wrap("");
	@ObfuscatedName("f.dc")
	public JagString field825 = field2939;

	@ObfuscatedName("f.eb")
	public JagString field774 = field2939;

	@ObfuscatedName("f.fb")
	public Object[] field775;

	@ObfuscatedName("f.gb")
	public int field776 = 0;

	@ObfuscatedName("f.hb")
	public int field777 = 0;

	@ObfuscatedName("f.hc")
	public int field829 = 0;

	@ObfuscatedName("f.ib")
	public int[] field778;

	@ObfuscatedName("f.ic")
	public int field830 = 0;

	@ObfuscatedName("f.jb")
	public Object[] field779;

	@ObfuscatedName("f.jc")
	public boolean field831 = false;

	@ObfuscatedName("f.kb")
	public Object[] field780;

	@ObfuscatedName("f.lc")
	public JagString field833 = field2939;

	@ObfuscatedName("f.mb")
	public Object[] field782;

	@ObfuscatedName("f.mc")
	public int[] field834;

	@ObfuscatedName("f.nb")
	public int field783 = 0;

	@ObfuscatedName("f.nc")
	public Object[] field835;

	@ObfuscatedName("f.ob")
	public int field784 = 0;

	@ObfuscatedName("f.oc")
	public Object[] field836;

	@ObfuscatedName("f.pb")
	public int[] field785;

	@ObfuscatedName("f.pc")
	public Object[] field837;

	@ObfuscatedName("f.qb")
	public int field786 = 0;

	@ObfuscatedName("f.qc")
	public int field838 = 0;

	@ObfuscatedName("f.rb")
	public int field787 = -1;

	@ObfuscatedName("f.rc")
	public int field839 = 0;

	@ObfuscatedName("f.s")
	public int field737 = 0;

	@ObfuscatedName("f.sb")
	public int field788 = 1;

	@ObfuscatedName("f.sc")
	public int field840 = -1;

	@ObfuscatedName("f.t")
	public JagString[] field738;

	@ObfuscatedName("f.tc")
	public int field841 = 0;

	@ObfuscatedName("f.ub")
	public int field790 = 0;

	@ObfuscatedName("f.uc")
	public int[][] field842;

	@ObfuscatedName("f.v")
	public boolean field740 = false;

	@ObfuscatedName("f.vb")
	public JagString field791 = Text.OK;

	@ObfuscatedName("f.vc")
	public int field843 = 0;

	@ObfuscatedName("f.w")
	public Object[] field741;

	@ObfuscatedName("f.wb")
	public int field792 = 0;

	@ObfuscatedName("f.wc")
	public int field844 = -1;

	@ObfuscatedName("f.X")
	public static JagString field767 = JagString.wrap("m");

	@ObfuscatedName("f.F")
	public int field750 = 0;

	@ObfuscatedName("f.B")
	public int field746 = 0;

	@ObfuscatedName("f.y")
	public int field743 = -1;

	@ObfuscatedName("f.D")
	public boolean field748 = false;

	@ObfuscatedName("f.T")
	public JagString field763 = field2939;

	@ObfuscatedName("f.Bb")
	public int field797 = 0;

	@ObfuscatedName("f.Z")
	public int field769 = 0;

	@ObfuscatedName("f.Db")
	public int field799 = 0;

	@ObfuscatedName("f.Hb")
	public boolean field803 = false;

	@ObfuscatedName("f.Y")
	public int field768 = 0;

	@ObfuscatedName("f.Ab")
	public int field796 = 0;

	@ObfuscatedName("f.P")
	public int field760 = 0;

	@ObfuscatedName("f.Wb")
	public int field818 = 0;

	@ObfuscatedName("f.Vb")
	public int field817 = 0;

	@ObfuscatedName("f.E")
	public int field749 = 0;

	@ObfuscatedName("f.Cb")
	public int field798 = 1;

	@ObfuscatedName("f.V")
	public int field765 = -1;

	@ObfuscatedName("f.Ac")
	public boolean field848 = false;

	@ObfuscatedName("f.S")
	public int field762 = 0;

	@ObfuscatedName("f.Mb")
	public int field808 = 100;

	@ObfuscatedName("f.Ob")
	public int field810 = 0;

	@ObfuscatedName("f.Rb")
	public JagString field813 = field2939;

	@ObfuscatedName("f.Pb")
	public int field811 = -1;

	@ObfuscatedName("f.Xb")
	public int field819 = -1;

	@ObfuscatedName("f.Qb")
	public int field812 = 0;

	@ObfuscatedName("f.Bc")
	public int field849 = -1;

	@ObfuscatedName("f.gc")
	public int field828 = -1;

	@ObfuscatedName("f.Ib")
	public int field804 = -1;

	@ObfuscatedName("f.Tb")
	public int field815 = 0;

	@ObfuscatedName("f.Dc")
	public int field851 = 0;

	@ObfuscatedName("f.zc")
	public boolean field847 = false;

	@ObfuscatedName("f.Ic")
	public boolean field856 = false;

	@ObfuscatedName("f.H")
	public int field752 = -1;

	@ObfuscatedName("f.Mc")
	public int field860 = 0;

	@ObfuscatedName("f.xc")
	public int field845 = 0;

	@ObfuscatedName("f.Oc")
	public boolean field862 = false;

	@ObfuscatedName("f.Ub")
	public int field816 = 0;

	@ObfuscatedName("f.Qc")
	public int field864 = -1;

	@ObfuscatedName("f.Yc")
	public int scrollPosY = 0;

	@ObfuscatedName("f.Lb")
	public int field807 = -1;

	@ObfuscatedName("f.Nc")
	public int field861 = 0;

	@ObfuscatedName("f.Kb")
	public boolean field806 = false;

	@ObfuscatedName("f.Zc")
	public int field873 = -1;

	@ObfuscatedName("f.Vc")
	public int field869 = 0;

	@ObfuscatedName("f.Fc")
	public boolean field853 = false;

	@ObfuscatedName("f.Hc")
	public int field855 = 0;

	@ObfuscatedName("f.Yb")
	public int scrollHeight = 0;

	@ObfuscatedName("f.K")
	public int field755;

	@ObfuscatedName("f.Sb")
	public boolean field814;

	@ObfuscatedName("f.A")
	public int[] field745;

	@ObfuscatedName("f.C")
	public int[] field747;

	@ObfuscatedName("f.I")
	public int[] field753;

	@ObfuscatedName("f.R")
	public int[] field761;

	@ObfuscatedName("f.Nb")
	public int[] field809;

	@ObfuscatedName("f.Zb")
	public int[] field821;

	@ObfuscatedName("f.L")
	public JagString[] field756;

	@ObfuscatedName("f.J")
	public IfType[] field754;

	@ObfuscatedName("f.G")
	public Object[] field751;

	@ObfuscatedName("f.N")
	public Object[] field758;

	@ObfuscatedName("f.W")
	public Object[] field766;

	@ObfuscatedName("f.xb")
	public Object[] field793;

	@ObfuscatedName("f.yb")
	public Object[] field794;

	@ObfuscatedName("f.zb")
	public Object[] field795;

	@ObfuscatedName("f.Eb")
	public Object[] field800;

	@ObfuscatedName("f.Gb")
	public Object[] field802;

	@ObfuscatedName("f.yc")
	public Object[] field846;

	@ObfuscatedName("f.Cc")
	public Object[] field850;

	@ObfuscatedName("f.Ec")
	public Object[] field852;

	@ObfuscatedName("f.Rc")
	public Object[] field865;

	@ObfuscatedName("f.Sc")
	public Object[] field866;

	@ObfuscatedName("f.Tc")
	public Object[] field867;

	@ObfuscatedName("f.Xc")
	public Object[] field871;

	@ObfuscatedName("mb.a(Lea;ZLea;Lea;Lea;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		field57 = arg2;
		field1991 = arg3;
		field3635 = arg1;
		field198 = arg0;
		field1825 = new IfType[field1991.getGroupCount()][];
		field2119 = new boolean[field1991.getGroupCount()];
	}

	@ObfuscatedName("df.b(II)Z")
	public static boolean method192(int arg0) {
		if (field2119[arg0]) {
			return true;
		} else if (field1991.requestGroupDownload(arg0)) {
			int var1 = field1991.getFileIdLimit(arg0);
			if (var1 == 0) {
				field2119[arg0] = true;
				return true;
			}
			if (field1825[arg0] == null) {
				field1825[arg0] = new IfType[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (field1825[arg0][var2] == null) {
					byte[] var3 = field1991.getFile(arg0, var2);
					if (var3 != null) {
						field1825[arg0][var2] = new IfType();
						field1825[arg0][var2].field743 = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							field1825[arg0][var2].method311(new Packet(var3));
						} else {
							field1825[arg0][var2].method308(new Packet(var3));
						}
					}
				}
			}
			field2119[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sc.c(II)Lf;")
	public static IfType get(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (field1825[var1] == null || field1825[var1][var2] == null) {
			boolean var3 = method192(var1);
			if (!var3) {
				return null;
			}
		}
		return field1825[var1][var2];
	}

	@ObfuscatedName("qf.a(BI)V")
	public static void method926(int arg0) {
		if (arg0 == -1 || !field2119[arg0]) {
			return;
		}
		field1991.discardFiles(arg0);
		if (field1825[arg0] == null) {
			return;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < field1825[arg0].length; var2++) {
			if (field1825[arg0][var2] != null) {
				if (field1825[arg0][var2].field755 == 2) {
					var1 = false;
				} else {
					field1825[arg0][var2] = null;
				}
			}
		}
		if (var1) {
			field1825[arg0] = null;
		}
		field2119[arg0] = false;
	}

	@ObfuscatedName("se.a(IIB)Lf;")
	public static IfType get(int arg0, int arg1) {
		IfType var2 = get(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.field754 == null || var2.field754.length <= arg0) {
			return null;
		} else {
			return var2.field754[arg0];
		}
	}

	@ObfuscatedName("b.b(B)V")
	public static void method48() {
		field1987.clear();
		field2922.clear();
		field1055.clear();
	}

	@ObfuscatedName("f.a(IZ)Lh;")
	public Pix32 method299(boolean arg0) {
		field2914 = false;
		int var2;
		if (arg0) {
			var2 = this.field844;
		} else {
			var2 = this.field819;
		}
		if (var2 == -1) {
			return null;
		}
		long var3 = ((this.field772 ? 1L : 0L) << 39) + ((this.field814 ? 1L : 0L) << 38) + ((long) this.field796 << 36) + (long) var2 + ((long) this.field817 << 40);
		Pix32 var5 = (Pix32) field1987.find(var3);
		if (var5 != null) {
			return var5;
		}
		Pix32 var6 = PixLoader.makePix32(0, field198, var2);
		if (var6 == null) {
			field2914 = true;
			return null;
		}
		if (this.field814) {
			var6.vflip();
		}
		if (this.field772) {
			var6.hflip();
		}
		if (this.field796 > 0) {
			var6.untrim(this.field796);
		}
		if (this.field796 >= 1) {
			var6.addOutline(1);
		}
		if (this.field796 >= 2) {
			var6.addOutline(16777215);
		}
		if (this.field817 != 0) {
			var6.addShadow(this.field817);
		}
		field1987.put(var3, var6);
		return var6;
	}

	@ObfuscatedName("f.a(Ljd;I)[I")
	public int[] method300(Packet arg0) {
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

	@ObfuscatedName("f.a(Lec;ZI)V")
	public void method301(JagString arg0, int arg1) {
		if (this.field738 == null || arg1 >= this.field738.length) {
			JagString[] var3 = new JagString[arg1 + 1];
			if (this.field738 != null) {
				for (int var4 = 0; var4 < this.field738.length; var4++) {
					var3[var4] = this.field738[var4];
				}
			}
			this.field738 = var3;
		}
		this.field738[arg1] = arg0;
	}

	@ObfuscatedName("f.a(Z)Lnf;")
	public PixFontGeneric method302() {
		field2914 = false;
		if (this.field807 == -1) {
			return null;
		}
		PixFontGeneric var1 = (PixFontGeneric) field1055.find((long) this.field807);
		if (var1 != null) {
			return var1;
		}
		PixFontGeneric var2 = PixLoader.makePixFont(this.field807, field57, field198, 0);
		if (var2 == null) {
			field2914 = true;
		} else {
			field1055.put((long) this.field807, var2);
		}
		return var2;
	}

	@ObfuscatedName("f.a(Lvc;ILeb;IZ)Lod;")
	public ModelLit method306(SeqType arg0, PlayerModel arg1, int arg2, boolean arg3) {
		field2914 = false;
		int var5;
		int var6;
		if (arg3) {
			var6 = this.field798;
			var5 = this.field811;
		} else {
			var5 = this.field849;
			var6 = this.field770;
		}
		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var5 == -1) {
			return null;
		} else {
			ModelLit var7 = (ModelLit) field2922.find((long) ((var6 << 16) + var5));
			if (var7 == null) {
				if (var6 == 1) {
					ModelUnlit var8 = ModelUnlit.method840(field3635, var5);
					if (var8 == null) {
						field2914 = true;
						return null;
					}
					var7 = var8.method847(64, 768, -50, -10, -50);
				}
				if (var6 == 2) {
					ModelUnlit var9 = NPCType.method130(var5).method752();
					if (var9 == null) {
						field2914 = true;
						return null;
					}
					var7 = var9.method847(64, 768, -50, -10, -50);
				}
				if (var6 == 3) {
					if (arg1 == null) {
						return null;
					}
					ModelUnlit var10 = arg1.method230();
					if (var10 == null) {
						field2914 = true;
						return null;
					}
					var7 = var10.method847(64, 768, -50, -10, -50);
				}
				if (var6 == 4) {
					ObjType var11 = ObjType.method1092(var5);
					ModelUnlit var12 = var11.method482(10);
					if (var12 == null) {
						field2914 = true;
						return null;
					}
					var7 = var12.method847(var11.field1381 + 64, var11.field1383 + 768, -50, -10, -50);
				}
				field2922.put((long) ((var6 << 16) + var5), var7);
			}
			if (arg0 != null) {
				var7 = arg0.method1113(arg2, var7);
			}
			return var7;
		}
	}

	@ObfuscatedName("f.b(II)Lh;")
	public Pix32 method307(int arg0) {
		field2914 = false;
		if (arg0 < 0 || this.field761.length <= arg0) {
			return null;
		}
		int var2 = this.field761[arg0];
		if (var2 == -1) {
			return null;
		}
		Pix32 var3 = (Pix32) field1987.find((long) var2);
		if (var3 != null) {
			return var3;
		}
		Pix32 var4 = PixLoader.makePix32(0, field198, var2);
		if (var4 == null) {
			field2914 = true;
		} else {
			field1987.put((long) var2, var4);
		}
		return var4;
	}

	@ObfuscatedName("f.b(Ljd;B)V")
	public void method308(Packet arg0) {
		this.field848 = false;
		this.field755 = arg0.g1();
		this.field790 = arg0.g1();
		this.field845 = arg0.g2();
		this.field797 = this.field829 = arg0.method551();
		this.field769 = this.field855 = arg0.method551();
		this.field810 = arg0.g2();
		this.height = arg0.g2();
		this.field861 = arg0.g1();
		this.field864 = arg0.g2();
		if (this.field864 == 65535) {
			this.field864 = -1;
		} else {
			this.field864 += this.field743 & 0xFFFF0000;
		}
		this.field752 = arg0.g2();
		if (this.field752 == 65535) {
			this.field752 = -1;
		}
		int var2 = arg0.g1();
		if (var2 > 0) {
			this.field785 = new int[var2];
			this.field778 = new int[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.field778[var3] = arg0.g1();
				this.field785[var3] = arg0.g2();
			}
		}
		int var4 = arg0.g1();
		if (var4 > 0) {
			this.field842 = new int[var4][];
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = arg0.g2();
				this.field842[var5] = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					this.field842[var5][var7] = arg0.g2();
					if (this.field842[var5][var7] == 65535) {
						this.field842[var5][var7] = -1;
					}
				}
			}
		}
		if (this.field755 == 0) {
			this.scrollHeight = arg0.g2();
			this.field740 = arg0.g1() == 1;
		}
		if (this.field755 == 1) {
			arg0.g2();
			arg0.g1();
		}
		if (this.field755 == 2) {
			this.field753 = new int[this.field810 * this.height];
			this.field834 = new int[this.height * this.field810];
			int var8 = arg0.g1();
			if (var8 == 1) {
				this.field768 |= 0x10000000;
			}
			int var9 = arg0.g1();
			if (var9 == 1) {
				this.field768 |= 0x40000000;
			}
			int var10 = arg0.g1();
			if (var10 == 1) {
				this.field768 |= Integer.MIN_VALUE;
			}
			int var11 = arg0.g1();
			if (var11 == 1) {
				this.field768 |= 0x20000000;
			}
			this.field818 = arg0.g1();
			this.field784 = arg0.g1();
			this.field745 = new int[20];
			this.field809 = new int[20];
			this.field761 = new int[20];
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = arg0.g1();
				if (var13 == 1) {
					this.field809[var12] = arg0.method551();
					this.field745[var12] = arg0.method551();
					this.field761[var12] = arg0.g4();
				} else {
					this.field761[var12] = -1;
				}
			}
			this.field756 = new JagString[5];
			for (int var14 = 0; var14 < 5; var14++) {
				JagString var15 = arg0.method555();
				if (var15.length() > 0) {
					this.field756[var14] = var15;
					this.field768 |= 0x1 << var14 + 23;
				}
			}
		}
		if (this.field755 == 3) {
			this.field803 = arg0.g1() == 1;
		}
		if (this.field755 == 4 || this.field755 == 1) {
			this.field841 = arg0.g1();
			this.field799 = arg0.g1();
			this.field838 = arg0.g1();
			this.field807 = arg0.g2();
			if (this.field807 == 65535) {
				this.field807 = -1;
			}
			this.field856 = arg0.g1() == 1;
		}
		if (this.field755 == 4) {
			this.field763 = arg0.method555();
			this.field774 = arg0.method555();
		}
		if (this.field755 == 1 || this.field755 == 3 || this.field755 == 4) {
			this.field776 = arg0.g4();
		}
		if (this.field755 == 3 || this.field755 == 4) {
			this.field869 = arg0.g4();
			this.field830 = arg0.g4();
			this.field783 = arg0.g4();
		}
		if (this.field755 == 5) {
			this.field819 = arg0.g4();
			this.field844 = arg0.g4();
		}
		if (this.field755 == 6) {
			this.field770 = 1;
			this.field849 = arg0.g2();
			this.field798 = 1;
			if (this.field849 == 65535) {
				this.field849 = -1;
			}
			this.field811 = arg0.g2();
			if (this.field811 == 65535) {
				this.field811 = -1;
			}
			this.field765 = arg0.g2();
			if (this.field765 == 65535) {
				this.field765 = -1;
			}
			this.field787 = arg0.g2();
			if (this.field787 == 65535) {
				this.field787 = -1;
			}
			this.field808 = arg0.g2();
			this.field812 = arg0.g2();
			this.field874 = arg0.g2();
		}
		if (this.field755 == 7) {
			this.field834 = new int[this.height * this.field810];
			this.field753 = new int[this.height * this.field810];
			this.field841 = arg0.g1();
			this.field807 = arg0.g2();
			if (this.field807 == 65535) {
				this.field807 = -1;
			}
			this.field856 = arg0.g1() == 1;
			this.field776 = arg0.g4();
			this.field818 = arg0.method551();
			this.field784 = arg0.method551();
			int var16 = arg0.g1();
			this.field756 = new JagString[5];
			if (var16 == 1) {
				this.field768 |= 0x40000000;
			}
			for (int var17 = 0; var17 < 5; var17++) {
				JagString var18 = arg0.method555();
				if (var18.length() > 0) {
					this.field756[var17] = var18;
					this.field768 |= 0x1 << var17 + 23;
				}
			}
		}
		if (this.field755 == 8) {
			this.field763 = arg0.method555();
		}
		if (this.field790 == 2 || this.field755 == 2) {
			this.field825 = arg0.method555();
			this.field833 = arg0.method555();
			int var19 = arg0.g2() & 0x3F;
			this.field768 |= var19 << 11;
		}
		if (this.field790 == 1 || this.field790 == 4 || this.field790 == 5 || this.field790 == 6) {
			this.field791 = arg0.method555();
			if (this.field791.length() == 0) {
				if (this.field790 == 1) {
					this.field791 = Text.OK;
				}
				if (this.field790 == 4) {
					this.field791 = Text.SELECT;
				}
				if (this.field790 == 5) {
					this.field791 = Text.SELECT;
				}
				if (this.field790 == 6) {
					this.field791 = Text.CONTINUE;
				}
			}
		}
		if (this.field790 == 1 || this.field790 == 4 || this.field790 == 5) {
			this.field768 |= 0x400000;
		}
		if (this.field790 == 6) {
			this.field768 |= 0x1;
		}
	}

	@ObfuscatedName("f.a(IZI)V")
	public void method309(int arg0, int arg1) {
		int var3 = this.field834[arg1];
		this.field834[arg1] = this.field834[arg0];
		this.field834[arg0] = var3;
		int var4 = this.field753[arg1];
		this.field753[arg1] = this.field753[arg0];
		this.field753[arg0] = var4;
	}

	@ObfuscatedName("f.a(ILjd;)[Ljava/lang/Object;")
	public Object[] method310(Packet arg0) {
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
				var3[var4] = arg0.method555();
			}
		}
		this.field847 = true;
		return var3;
	}

	@ObfuscatedName("f.b(Ljd;I)V")
	public void method311(Packet arg0) {
		arg0.g1();
		this.field848 = true;
		this.field755 = arg0.g1();
		this.field845 = arg0.g2();
		this.field797 = this.field829 = arg0.method551();
		this.field769 = this.field855 = arg0.method551();
		this.field810 = arg0.g2();
		if (this.field755 == 9) {
			this.height = arg0.method551();
		} else {
			this.height = arg0.g2();
		}
		this.field864 = arg0.g2();
		if (this.field864 == 65535) {
			this.field864 = -1;
		} else {
			this.field864 += this.field743 & 0xFFFF0000;
		}
		this.field740 = arg0.g1() == 1;
		if (this.field755 == 0) {
			this.field860 = arg0.g2();
			this.scrollHeight = arg0.g2();
		}
		if (this.field755 == 5) {
			this.field819 = arg0.g4();
			this.field777 = arg0.g2();
			this.field748 = arg0.g1() == 1;
			this.field861 = arg0.g1();
			this.field796 = arg0.g1();
			this.field817 = arg0.g4();
			this.field814 = arg0.g1() == 1;
			this.field772 = arg0.g1() == 1;
		}
		if (this.field755 == 6) {
			this.field770 = 1;
			this.field849 = arg0.g2();
			if (this.field849 == 65535) {
				this.field849 = -1;
			}
			this.field816 = arg0.method551();
			this.field851 = arg0.method551();
			this.field812 = arg0.g2();
			this.field874 = arg0.g2();
			this.field750 = arg0.g2();
			this.field808 = arg0.g2();
			this.field765 = arg0.g2();
			if (this.field765 == 65535) {
				this.field765 = -1;
			}
			this.field853 = arg0.g1() == 1;
		}
		if (this.field755 == 4) {
			this.field807 = arg0.g2();
			if (this.field807 == 65535) {
				this.field807 = -1;
			}
			this.field763 = arg0.method555();
			this.field838 = arg0.g1();
			this.field841 = arg0.g1();
			this.field799 = arg0.g1();
			this.field856 = arg0.g1() == 1;
			this.field776 = arg0.g4();
		}
		if (this.field755 == 3) {
			this.field776 = arg0.g4();
			this.field803 = arg0.g1() == 1;
			this.field861 = arg0.g1();
		}
		if (this.field755 == 9) {
			this.field788 = arg0.g1();
			this.field776 = arg0.g4();
		}
		this.field768 = arg0.g3();
		this.field813 = arg0.method555();
		int var2 = arg0.g1();
		if (var2 > 0) {
			this.field738 = new JagString[var2];
			for (int var3 = 0; var3 < var2; var3++) {
				this.field738[var3] = arg0.method555();
			}
		}
		this.field760 = arg0.g1();
		this.field746 = arg0.g1();
		this.field862 = arg0.g1() == 1;
		this.field825 = arg0.method555();
		this.field867 = this.method310(arg0);
		this.field850 = this.method310(arg0);
		this.field775 = this.method310(arg0);
		this.field802 = this.method310(arg0);
		this.field837 = this.method310(arg0);
		this.field800 = this.method310(arg0);
		this.field751 = this.method310(arg0);
		this.field771 = this.method310(arg0);
		this.field766 = this.method310(arg0);
		this.field794 = this.method310(arg0);
		this.field836 = this.method310(arg0);
		this.field865 = this.method310(arg0);
		this.field846 = this.method310(arg0);
		this.field835 = this.method310(arg0);
		this.field779 = this.method310(arg0);
		this.field852 = this.method310(arg0);
		this.field871 = this.method310(arg0);
		this.field866 = this.method310(arg0);
		this.field821 = this.method300(arg0);
		this.field747 = this.method300(arg0);
		this.field875 = this.method300(arg0);
	}
}
