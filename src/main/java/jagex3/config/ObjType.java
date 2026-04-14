package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.Model;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("ta")
public final class ObjType extends Linkable2 {

	@ObfuscatedName("pe.Yb")
	public static boolean field2384;
	@ObfuscatedName("ca.j")
	public static Js5 field458;
	@ObfuscatedName("ie.q")
	public static Js5 field1405;
	@ObfuscatedName("kc.z")
	public static int field1590;
	@ObfuscatedName("gb.t")
	public static LruCache field1066 = new LruCache(64);
	@ObfuscatedName("ta.ac")
	public int field2860 = 0;

	@ObfuscatedName("ta.bc")
	public int field2861 = 0;

	@ObfuscatedName("ta.cc")
	public int[] field2862;

	@ObfuscatedName("ta.ec")
	public int field2864 = 128;

	@ObfuscatedName("ta.fc")
	public int[] field2865;

	@ObfuscatedName("ta.hc")
	public int field2867 = -1;

	@ObfuscatedName("ta.lc")
	public int field2871 = 0;

	@ObfuscatedName("ta.mc")
	public int field2872 = -1;

	@ObfuscatedName("ta.pc")
	public int field2875 = 0;

	@ObfuscatedName("ta.qc")
	public int field2876 = -1;

	@ObfuscatedName("ta.sb")
	public int field2826 = 0;

	@ObfuscatedName("ta.tb")
	public JagString field2827 = Statics.field3017;

	@ObfuscatedName("ta.tc")
	public int field2879 = -1;

	@ObfuscatedName("ta.uc")
	public boolean field2880 = false;

	@ObfuscatedName("ta.wb")
	public JagString[] field2830 = new JagString[]{null, null, null, null, Statics.field487};

	@ObfuscatedName("ta.wc")
	public int field2882 = -1;

	@ObfuscatedName("ta.xb")
	public int field2831 = -1;

	@ObfuscatedName("ta.Pb")
	public int field2849 = 0;

	@ObfuscatedName("ta.Hb")
	public int field2841 = 0;

	@ObfuscatedName("ta.Zb")
	public int field2859 = 1;

	@ObfuscatedName("ta.Db")
	public int field2837 = 0;

	@ObfuscatedName("ta.Wb")
	public int field2856 = 0;

	@ObfuscatedName("ta.Rb")
	public int field2851 = -1;

	@ObfuscatedName("ta.Bb")
	public JagString[] field2835 = new JagString[]{null, null, Statics.field1594, null, null};

	@ObfuscatedName("ta.Kb")
	public int field2844 = 128;

	@ObfuscatedName("ta.Eb")
	public int field2838 = -1;

	@ObfuscatedName("ta.Tb")
	public int field2853 = -1;

	@ObfuscatedName("ta.Ob")
	public int field2848 = 2000;

	@ObfuscatedName("ta.Vb")
	public int field2855 = -1;

	@ObfuscatedName("ta.Ub")
	public int field2854 = 0;

	@ObfuscatedName("ta.Yb")
	public int field2858 = 0;

	@ObfuscatedName("ta.Qb")
	public int field2850 = -1;

	@ObfuscatedName("ta.yc")
	public int field2884 = 128;

	@ObfuscatedName("ta.Jb")
	public int field2843 = -1;

	@ObfuscatedName("ta.Cb")
	public int field2836;

	@ObfuscatedName("ta.xc")
	public int field2883;

	@ObfuscatedName("ta.Ab")
	public int[] field2834;

	@ObfuscatedName("ta.Nb")
	public int[] field2847;

	@ObfuscatedName("oe.a(II)Lta;")
	public static ObjType method760(int arg0) {
		ObjType var1 = (ObjType) field1066.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1405.method217(arg0, 10);
		ObjType var3 = new ObjType();
		var3.field2883 = arg0;
		if (var2 != null) {
			var3.method952(new Packet(var2));
		}
		var3.method942();
		if (var3.field2838 != -1) {
			var3.method953(method760(var3.field2838), method760(var3.field2843));
		}
		if (!field2384 && var3.field2880) {
			var3.field2830 = null;
			var3.field2854 = 0;
			var3.field2835 = null;
			var3.field2827 = Statics.field1501;
		}
		field1066.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.a(Lbd;ZLbd;I)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		field2384 = arg1;
		field458 = arg2;
		field1405 = arg0;
		field1590 = field1405.method235(10);
	}

	@ObfuscatedName("va.b(IIII)Ljd;")
	public static Pix32 method1007(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			Pix32 var3 = (Pix32) Statics.field253.find((long) arg1);
			if (var3 != null && var3.ohi != arg0 && var3.ohi != -1) {
				var3.unlink();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		ObjType var4 = method760(arg1);
		if (var4.field2862 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field2865[var6] && var4.field2865[var6] != 0) {
					var5 = var4.field2862[var6];
				}
			}
			if (var5 != -1) {
				var4 = method760(var5);
			}
		}
		Model var7 = var4.method954(true, 1);
		if (var7 == null) {
			return null;
		}
		Pix32 var8 = null;
		if (var4.field2838 != -1) {
			var8 = method1007(10, var4.field2843, -1);
			if (var8 == null) {
				return null;
			}
		}
		int[] var9 = Statics.field2747;
		int var10 = Statics.field2750;
		int var11 = Statics.field2749;
		int var12 = Pix2D.field2752;
		int var13 = Pix2D.field2753;
		int var14 = Pix2D.field2748;
		int var15 = Pix2D.field2751;
		int[] var16 = Pix3D.method367();
		int var17 = Statics.field762;
		int var18 = Statics.field777;
		Pix32 var19 = new Pix32(32, 32);
		Pix2D.method926(var19.data, 32, 32);
		Statics.field2909 = Pix3D.method362(Statics.field2909);
		Pix2D.fillRect(0, 0, 32, 32, 0);
		int var20 = var4.field2848;
		if (arg2 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg2 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		Pix3D.field776 = false;
		int var21 = Pix3D.field775[var4.field2875] * var20 >> 16;
		int var22 = Pix3D.field778[var4.field2875] * var20 >> 16;
		var7.method766();
		var7.method780(var4.field2861, var4.field2858, var4.field2875, var4.field2837, var7.field3135 / 2 + var4.field2841 + var21, var4.field2841 + var22);
		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var19.data[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var19.data[var24 * 32 + var23 - 1] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var19.data[var23 + (var24 - 1) * 32] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var19.data[var24 * 32 + var23 + 1] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var19.data[(var24 + 1) * 32 + var23] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					}
				}
			}
		}
		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var19.data[var25 + var26 * 32] == 0) {
						if (var25 > 0 && var19.data[var26 * 32 + var25 - 1] == 1) {
							var19.data[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var19.data[var25 + (var26 - 1) * 32] == 1) {
							var19.data[var25 + var26 * 32] = arg2;
						} else if (var25 < 31 && var19.data[var25 + var26 * 32 + 1] == 1) {
							var19.data[var25 + var26 * 32] = arg2;
						} else if (var26 < 31 && var19.data[var26 * 32 + var25 + 32] == 1) {
							var19.data[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var19.data[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var19.data[var27 + (var28 - 1) * 32 - 1] > 0) {
						var19.data[var28 * 32 + var27] = 3153952;
					}
				}
			}
		}
		if (var4.field2838 != -1) {
			int var29 = var8.ohi;
			int var30 = var8.owi;
			var8.ohi = 32;
			var8.owi = 32;
			var8.plotSprite(0, 0);
			var8.owi = var30;
			var8.ohi = var29;
		}
		if (arg2 == 0) {
			Statics.field253.method262((long) arg1, var19);
		}
		Pix2D.method926(var9, var11, var10);
		Pix2D.method912(var12, var14, var13, var15);
		Pix3D.method362(var16);
		Statics.field762 = var17;
		Statics.field777 = var18;
		Pix3D.method356();
		Pix3D.field776 = true;
		if (var4.field2826 == 1) {
			var19.owi = 33;
		} else {
			var19.owi = 32;
		}
		var19.ohi = arg0;
		return var19;
	}

	@ObfuscatedName("ca.a(B)V")
	public static void method254() {
		field1066.clear();
		Statics.field3035.clear();
		Statics.field253.clear();
	}

    @ObfuscatedName("qd.b(IB)La;")
    public static JagString method862(int arg0) {
        if (arg0 < 100000) {
            return Statics.method502(arg0);
        } else if (arg0 < 10000000) {
            return JagString.join(new JagString[]{Statics.method502(arg0 / 1000), Statics.field2354});
        } else {
            return JagString.join(new JagString[]{Statics.method502(arg0 / 1000000), Statics.field1184});
        }
    }

    @ObfuscatedName("ta.a(BZ)Z")
	public boolean method939(boolean arg0) {
		int var2 = this.field2831;
		int var3 = this.field2872;
		if (arg0) {
			var3 = this.field2853;
			var2 = this.field2882;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!field458.method218(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !field458.method218(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("ta.a(ZB)Z")
	public boolean method940(boolean arg0) {
		int var2 = this.field2867;
		int var3 = this.field2851;
		int var4 = this.field2855;
		if (arg0) {
			var4 = this.field2876;
			var3 = this.field2850;
			var2 = this.field2879;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!field458.method218(var2, 0)) {
			var5 = false;
		}
		if (var3 != -1 && !field458.method218(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !field458.method218(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ta.a(ZI)Lpa;")
	public Model method941(boolean arg0) {
		int var2 = this.field2867;
		int var3 = this.field2851;
		int var4 = this.field2855;
		if (arg0) {
			var2 = this.field2879;
			var3 = this.field2850;
			var4 = this.field2876;
		}
		if (var2 == -1) {
			return null;
		}
		Model var5 = Model.method798(field458, var2);
		if (var3 != -1) {
			Model var6 = Model.method798(field458, var3);
			if (var4 == -1) {
				Model[] var7 = new Model[]{var5, var6};
				var5 = new Model(var7, 2);
			} else {
				Model var8 = Model.method798(field458, var4);
				Model[] var9 = new Model[]{var5, var6, var8};
				var5 = new Model(var9, 3);
			}
		}
		if (!arg0 && this.field2849 != 0) {
			var5.method796(0, this.field2849, 0);
		}
		if (arg0 && this.field2860 != 0) {
			var5.method796(0, this.field2860, 0);
		}
		if (this.field2834 != null) {
			for (int var10 = 0; var10 < this.field2834.length; var10++) {
				var5.method771(this.field2834[var10], this.field2847[var10]);
			}
		}
		return var5;
	}

	@ObfuscatedName("ta.f(I)V")
	public void method942() {
	}

	@ObfuscatedName("ta.a(BI)Lta;")
	public ObjType method944(int arg0) {
		if (this.field2862 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2865[var3] && this.field2865[var3] != 0) {
					var2 = this.field2862[var3];
				}
			}
			if (var2 != -1) {
				return method760(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("ta.b(ZB)Lpa;")
	public Model method948(boolean arg0) {
		int var2 = this.field2831;
		int var3 = this.field2872;
		if (arg0) {
			var2 = this.field2882;
			var3 = this.field2853;
		}
		if (var2 == -1) {
			return null;
		}
		Model var4 = Model.method798(field458, var2);
		if (var3 != -1) {
			Model var5 = Model.method798(field458, var3);
			Model[] var6 = new Model[]{var4, var5};
			var4 = new Model(var6, 2);
		}
		if (this.field2834 != null) {
			for (int var7 = 0; var7 < this.field2834.length; var7++) {
				var4.method771(this.field2834[var7], this.field2847[var7]);
			}
		}
		return var4;
	}

	@ObfuscatedName("ta.a(IILba;)V")
	public void method951(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field2836 = arg1.g2();
		} else if (arg0 == 2) {
			this.field2827 = arg1.method140();
		} else if (arg0 == 4) {
			this.field2848 = arg1.g2();
		} else if (arg0 == 5) {
			this.field2875 = arg1.g2();
		} else if (arg0 == 6) {
			this.field2861 = arg1.g2();
		} else if (arg0 == 7) {
			this.field2837 = arg1.g2();
			if (this.field2837 > 32767) {
				this.field2837 -= 65536;
			}
		} else if (arg0 == 8) {
			this.field2841 = arg1.g2();
			if (this.field2841 > 32767) {
				this.field2841 -= 65536;
			}
		} else if (arg0 == 11) {
			this.field2826 = 1;
		} else if (arg0 == 12) {
			this.field2859 = arg1.method167();
		} else if (arg0 == 16) {
			this.field2880 = true;
		} else if (arg0 == 23) {
			this.field2867 = arg1.g2();
			this.field2849 = arg1.g1();
		} else if (arg0 == 24) {
			this.field2851 = arg1.g2();
		} else if (arg0 == 25) {
			this.field2879 = arg1.g2();
			this.field2860 = arg1.g1();
		} else if (arg0 == 26) {
			this.field2850 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field2835[arg0 - 30] = arg1.method140();
			if (this.field2835[arg0 - 30].method14(Statics.field2928)) {
				this.field2835[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.field2830[arg0 - 35] = arg1.method140();
		} else if (arg0 == 40) {
			int var3 = arg1.g1();
			this.field2847 = new int[var3];
			this.field2834 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2834[var4] = arg1.g2();
				this.field2847[var4] = arg1.g2();
			}
		} else if (arg0 == 78) {
			this.field2855 = arg1.g2();
		} else if (arg0 == 79) {
			this.field2876 = arg1.g2();
		} else if (arg0 == 90) {
			this.field2831 = arg1.g2();
		} else if (arg0 == 91) {
			this.field2882 = arg1.g2();
		} else if (arg0 == 92) {
			this.field2872 = arg1.g2();
		} else if (arg0 == 93) {
			this.field2853 = arg1.g2();
		} else if (arg0 == 95) {
			this.field2858 = arg1.g2();
		} else if (arg0 == 97) {
			this.field2843 = arg1.g2();
		} else if (arg0 == 98) {
			this.field2838 = arg1.g2();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.field2862 == null) {
				this.field2865 = new int[10];
				this.field2862 = new int[10];
			}
			this.field2862[arg0 - 100] = arg1.g2();
			this.field2865[arg0 - 100] = arg1.g2();
		} else if (arg0 == 110) {
			this.field2844 = arg1.g2();
		} else if (arg0 == 111) {
			this.field2884 = arg1.g2();
		} else if (arg0 == 112) {
			this.field2864 = arg1.g2();
		} else if (arg0 == 113) {
			this.field2856 = arg1.g1b();
		} else if (arg0 == 114) {
			this.field2871 = arg1.g1b() * 5;
		} else if (arg0 == 115) {
			this.field2854 = arg1.g1();
		}
	}

	@ObfuscatedName("ta.a(Lba;I)V")
	public void method952(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method951(var2, arg0);
		}
	}

	@ObfuscatedName("ta.a(Lta;ZLta;)V")
	public void method953(ObjType arg0, ObjType arg1) {
		this.field2875 = arg0.field2875;
		this.field2837 = arg0.field2837;
		this.field2858 = arg0.field2858;
		this.field2827 = arg1.field2827;
		this.field2859 = arg1.field2859;
		this.field2826 = 1;
		this.field2848 = arg0.field2848;
		this.field2880 = arg1.field2880;
		this.field2847 = arg0.field2847;
		this.field2834 = arg0.field2834;
		this.field2861 = arg0.field2861;
		this.field2841 = arg0.field2841;
		this.field2836 = arg0.field2836;
	}

	@ObfuscatedName("ta.a(ZII)Lpa;")
	public Model method954(boolean arg0, int arg1) {
		if (this.field2862 != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.field2865[var4] && this.field2865[var4] != 0) {
					var3 = this.field2862[var4];
				}
			}
			if (var3 != -1) {
				return method760(var3).method954(arg0, 1);
			}
		}
		if (arg0) {
			Model var5 = (Model) Statics.field3035.find((long) this.field2883);
			if (var5 != null) {
				return var5;
			}
		}
		Model var6 = Model.method798(field458, this.field2836);
		if (var6 == null) {
			return null;
		}
		if (this.field2844 != 128 || this.field2884 != 128 || this.field2864 != 128) {
			var6.method789(this.field2844, this.field2884, this.field2864);
		}
		if (this.field2834 != null) {
			for (int var7 = 0; var7 < this.field2834.length; var7++) {
				var6.method771(this.field2834[var7], this.field2847[var7]);
			}
		}
		if (arg0) {
			var6.method770(this.field2856 + 64, this.field2871 + 768, -50, -10, -50, true);
			var6.field2205 = true;
			Statics.field3035.method262((long) this.field2883, var6);
		}
		return var6;
	}
}
