package jagex3.config;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.constants.Text;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.SoftwarePix32;
import jagex3.graphics.SoftwarePixFont;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;

@ObfuscatedName("ng")
public final class ObjType extends Linkable2 {

	@ObfuscatedName("td.V")
	public static final LruCache field3998 = new LruCache(64);
	@ObfuscatedName("wb.j")
	public static final ModelSourceCache field4470 = new ModelSourceCache(50);
	@ObfuscatedName("sj.c")
	public static final LruCache field3920 = new LruCache(100);
	@ObfuscatedName("vg.p")
	public static Js5 field4400;
	@ObfuscatedName("n.k")
	public static boolean field2623;
	@ObfuscatedName("od.x")
	public static Js5 field3008;
	@ObfuscatedName("sf.o")
	public static int field3855;
	@ObfuscatedName("qf.S")
	public static SoftwarePixFont field3571;
	@ObfuscatedName("k.N")
	public static short[] clientpalette = new short[256];
	@ObfuscatedName("ng.ab")
	public int field2857 = 0;

	@ObfuscatedName("ng.bb")
	public int field2858 = -1;

	@ObfuscatedName("ng.eb")
	public boolean field2861 = false;

	@ObfuscatedName("ng.fb")
	public int field2862;

	@ObfuscatedName("ng.gb")
	public short[] field2863;

	@ObfuscatedName("ng.ib")
	public int field2865 = -1;

	@ObfuscatedName("ng.jb")
	public int field2866 = 0;

	@ObfuscatedName("ng.kb")
	public int field2867 = -1;

	@ObfuscatedName("ng.mb")
	public HashTable params;

	@ObfuscatedName("ng.nb")
	public int field2870 = 0;

	@ObfuscatedName("ng.ob")
	public int field2871 = 128;

	@ObfuscatedName("ng.pb")
	public int field2872 = 0;

	@ObfuscatedName("ng.qb")
	public int field2873 = 0;

	@ObfuscatedName("ng.rb")
	public int field2874 = -1;

	@ObfuscatedName("ng.sb")
	public int field2875 = -1;

	@ObfuscatedName("ng.tb")
	public int field2876 = 0;

	@ObfuscatedName("ng.ub")
	public boolean field2877 = false;

	@ObfuscatedName("ng.wb")
	public int field2879 = 0;

	@ObfuscatedName("ng.G")
	public int field2838 = -1;

	@ObfuscatedName("ng.K")
	public int field2842 = -1;

	@ObfuscatedName("ng.D")
	public int field2836 = 0;

	@ObfuscatedName("ng.V")
	public int field2852 = 0;

	@ObfuscatedName("ng.Q")
	public int field2847 = 0;

	@ObfuscatedName("ng.R")
	public int field2848 = -1;

	@ObfuscatedName("ng.L")
	public int field2843 = 128;

	@ObfuscatedName("ng.W")
	public int field2853 = -1;

	@ObfuscatedName("ng.X")
	public int field2854 = 1;

	@ObfuscatedName("ng.T")
	public int field2850 = 0;

	@ObfuscatedName("ng.Ib")
	public int field2891 = -1;

	@ObfuscatedName("ng.Gb")
	public int field2889 = 2000;

	@ObfuscatedName("ng.Bb")
	public int field2884 = -1;

	@ObfuscatedName("ng.Hb")
	public int field2890 = 128;

	@ObfuscatedName("ng.xb")
	public int field2880 = -1;

	@ObfuscatedName("ng.J")
	public int field2841 = -1;

	@ObfuscatedName("aa.Q")
	public static final JagString field12 = JagString.wrap("null");
	@ObfuscatedName("ng.Jb")
	public JagString name = field12;

	@ObfuscatedName("ng.Pb")
	public JagString[] field2898 = new JagString[] { null, null, Text.field4343, null, null };

	@ObfuscatedName("ng.Fb")
	public int field2888 = -1;

	@ObfuscatedName("ng.I")
	public int field2840 = 0;

	@ObfuscatedName("ng.Vb")
	public JagString[] field2904 = new JagString[] { null, null, null, null, Text.field4171 };

	@ObfuscatedName("ng.N")
	public int field2844;

	@ObfuscatedName("ng.Eb")
	public byte[] field2887;

	@ObfuscatedName("ng.O")
	public int[] field2845;

	@ObfuscatedName("ng.Ub")
	public int[] field2903;

	@ObfuscatedName("ng.F")
	public short[] field2837;

	@ObfuscatedName("ng.S")
	public short[] field2849;

	@ObfuscatedName("ng.Y")
	public short[] field2855;

	@ObfuscatedName("ng.H")
	public int[][] field2839;

	@ObfuscatedName("ge.a(IB)Lng;")
	public static ObjType list(int arg0) {
		ObjType var1 = (ObjType) field3998.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field4400.getFile(method872(arg0), method920(arg0));
		ObjType var3 = new ObjType();
		var3.field2844 = arg0;
		if (var2 != null) {
			var3.method1014(new Packet(var2));
		}
		var3.method1013();
		if (var3.field2867 != -1) {
			var3.method1019(list(var3.field2841), list(var3.field2867));
		}
		if (var3.field2884 != -1) {
			var3.method1020(list(var3.field2874), list(var3.field2884));
		}
		if (!field2623 && var3.field2877) {
			var3.field2836 = 0;
			var3.field2898 = null;
			var3.field2861 = false;
			var3.name = Text.field3533;
			var3.field2904 = null;
		}
		field3998.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("fb.f(I)V")
	public static void resetCache() {
		field3998.clear();
		field4470.clear();
		field3920.clear();
	}

	@ObfuscatedName("rd.a(ZLnb;Ldg;Lnb;B)V")
	public static void init(boolean arg0, Js5 arg1, SoftwarePixFont arg2, Js5 arg3) {
		field3008 = arg3;
		field2623 = arg0;
		field4400 = arg1;
		int var4 = field4400.method940() - 1;
		field3855 = var4 * 256 + field4400.getFileIdLimit(var4);
		field3571 = arg2;
	}

	@ObfuscatedName("af.d(B)V")
	public static void method37() {
		field4470.clear();
	}

	@ObfuscatedName("sh.c(B)V")
	public static void method1399() {
		field3920.clear();
	}

	@ObfuscatedName("bj.a(IBIIZI)Lrc;")
	public static Pix32 method117(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		long var5 = ((long) arg4 << 40) + ((long) arg2 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38);
		Pix32 var7 = (Pix32) field3920.method665(var5);
		if (var7 != null) {
			return var7;
		}
		Pix3D.field3364 = false;
		Pix32 var8 = method516(arg1, arg2, arg4, arg0, false, arg3);
		if (var8 != null && !Pix3D.field3364) {
			field3920.method663(var5, var8);
		}
		return var8;
	}

	@ObfuscatedName("h.a(IIIIZZZZ)Lrc;")
	public static Pix32 method516(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
		ObjType var6 = list(arg0);
		if (arg1 > 1 && var6.field2903 != null) {
			int var7 = -1;
			for (int var8 = 0; var8 < 10; var8++) {
				if (arg1 >= var6.field2845[var8] && var6.field2845[var8] != 0) {
					var7 = var6.field2903[var8];
				}
			}
			if (var7 != -1) {
				var6 = list(var7);
			}
		}
		SoftwareModelLit var9 = var6.method1008();
		if (var9 == null) {
			return null;
		}
		SoftwarePix32 var10 = null;
		if (var6.field2867 != -1) {
			var10 = (SoftwarePix32) method516(var6.field2841, 10, 0, 1, true, false);
			if (var10 == null) {
				return null;
			}
		} else if (var6.field2884 != -1) {
			var10 = (SoftwarePix32) method516(var6.field2874, arg1, arg2, arg3, false, false);
			if (var10 == null) {
				return null;
			}
		}
		int[] var11 = Pix2D.field1331;
		int var12 = Pix2D.field1333;
		int var13 = Pix2D.field1337;
		int[] var14 = new int[4];
		Pix2D.method486(var14);
		SoftwarePix32 var15 = new SoftwarePix32(36, 32);
		Pix2D.method496(var15.field3247, 36, 32);
		Pix3D.setRenderClipping();
		Pix3D.method1228(16, 16);
		int var16 = var6.field2889;
		if (arg4) {
			var16 = (int) ((double) var16 * 1.5D);
		} else if (arg3 == 2) {
			var16 = (int) ((double) var16 * 1.04D);
		}
		Pix3D.field3355 = false;
		int var17 = Pix3D.field3354[var6.field2873] * var16 >> 16;
		int var18 = var16 * Pix3D.field3359[var6.field2873] >> 16;
		var9.method193(var6.field2872, var6.field2847, var6.field2873, var6.field2876, var18 + var6.field2870 - var9.method88() / 2, var6.field2870 + var17);
		if (arg3 >= 1) {
			var15.method1168(1);
			if (arg3 >= 2) {
				var15.method1168(16777215);
			}
			Pix2D.method496(var15.field3247, 36, 32);
		}
		if (arg2 != 0) {
			var15.method1154(arg2);
		}
		if (var6.field2867 != -1) {
			var10.method1155(0, 0);
		} else if (var6.field2884 != -1) {
			Pix2D.method496(var10.field3247, 36, 32);
			var15.method1155(0, 0);
			var15 = var10;
		}
		if (arg5 && (var6.field2852 == 1 || arg1 != 1) && arg1 != -1) {
			field3571.method154(Client.method889(arg1), 0, 9, 16776960, 1);
		}
		Pix2D.method496(var11, var12, var13);
		Pix2D.method494(var14);
		Pix3D.setRenderClipping();
		Pix3D.field3355 = true;
		return var15;
	}

	@ObfuscatedName("li.b(II)I")
	public static int method872(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("mg.c(II)I")
	public static int method920(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("ng.b(Z)Lle;")
	public SoftwareModelLit method1008() {
		ModelUnlit var1 = ModelUnlit.load(field3008, this.field2862);
		if (var1 == null) {
			return null;
		}
		if (this.field2855 != null) {
			for (int var2 = 0; var2 < this.field2855.length; var2++) {
				if (this.field2887 == null || var2 >= this.field2887.length) {
					var1.method564(this.field2855[var2], this.field2849[var2]);
				} else {
					var1.method564(this.field2855[var2], clientpalette[this.field2887[var2] & 0xFF]);
				}
			}
		}
		if (this.field2863 != null) {
			for (int var3 = 0; var3 < this.field2863.length; var3++) {
				var1.method553(this.field2863[var3], this.field2837[var3]);
			}
		}
		SoftwareModelLit var4 = var1.method547(this.field2866 + 64, this.field2840 + 768);
		if (this.field2890 != 128 || this.field2843 != 128 || this.field2871 != 128) {
			var4.method183(this.field2890, this.field2843, this.field2871);
		}
		return var4;
	}

	@ObfuscatedName("ng.a(Li;BI)Li;")
	public JagString method1009(JagString arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			StringNode var3 = (StringNode) this.params.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("ng.a(ZII)I")
	public int method1010(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.method1049((long) arg0);
			return var3 == null ? arg1 : var3.field3698;
		}
	}

	@ObfuscatedName("ng.a(ZI)Lhe;")
	public ModelUnlit method1011(boolean arg0) {
		int var2 = this.field2888;
		int var3 = this.field2842;
		int var4 = this.field2875;
		if (arg0) {
			var2 = this.field2853;
			var3 = this.field2858;
			var4 = this.field2880;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var5 = ModelUnlit.load(field3008, var2);
		if (var4 != -1) {
			ModelUnlit var6 = ModelUnlit.load(field3008, var4);
			if (var3 == -1) {
				ModelUnlit[] var7 = new ModelUnlit[] { var5, var6 };
				var5 = new ModelUnlit(var7, 2);
			} else {
				ModelUnlit var8 = ModelUnlit.load(field3008, var3);
				ModelUnlit[] var9 = new ModelUnlit[] { var5, var6, var8 };
				var5 = new ModelUnlit(var9, 3);
			}
		}
		if (!arg0 && this.field2857 != 0) {
			var5.method549(0, this.field2857, 0);
		}
		if (arg0 && this.field2879 != 0) {
			var5.method549(0, this.field2879, 0);
		}
		if (this.field2855 != null) {
			for (int var10 = 0; var10 < this.field2855.length; var10++) {
				var5.method564(this.field2855[var10], this.field2849[var10]);
			}
		}
		if (this.field2863 != null) {
			for (int var11 = 0; var11 < this.field2863.length; var11++) {
				var5.method553(this.field2863[var11], this.field2837[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("ng.e(I)V")
	public void method1013() {
	}

	@ObfuscatedName("ng.a(ILea;)V")
	public void method1014(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1024(var2, arg0);
		}
	}

	@ObfuscatedName("ng.b(ZI)Z")
	public boolean method1015(boolean arg0) {
		int var2 = this.field2848;
		int var3 = this.field2838;
		if (arg0) {
			var3 = this.field2865;
			var2 = this.field2891;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!field3008.method959(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !field3008.method959(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("ng.a(BZ)Lhe;")
	public ModelUnlit method1016(boolean arg0) {
		int var2 = this.field2848;
		int var3 = this.field2838;
		if (arg0) {
			var3 = this.field2865;
			var2 = this.field2891;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var4 = ModelUnlit.load(field3008, var2);
		if (var3 != -1) {
			ModelUnlit var5 = ModelUnlit.load(field3008, var3);
			ModelUnlit[] var6 = new ModelUnlit[] { var4, var5 };
			var4 = new ModelUnlit(var6, 2);
		}
		if (this.field2855 != null) {
			for (int var7 = 0; var7 < this.field2855.length; var7++) {
				var4.method564(this.field2855[var7], this.field2849[var7]);
			}
		}
		if (this.field2863 != null) {
			for (int var8 = 0; var8 < this.field2863.length; var8++) {
				var4.method553(this.field2863[var8], this.field2837[var8]);
			}
		}
		return var4;
	}

	@ObfuscatedName("ng.a(ILng;Lng;)V")
	public void method1019(ObjType arg0, ObjType arg1) {
		this.field2870 = arg1.field2870;
		this.field2887 = arg1.field2887;
		this.field2854 = arg0.field2854;
		this.field2852 = 1;
		this.field2855 = arg1.field2855;
		this.name = arg0.name;
		this.field2889 = arg1.field2889;
		this.field2873 = arg1.field2873;
		this.field2876 = arg1.field2876;
		this.field2872 = arg1.field2872;
		this.field2863 = arg1.field2863;
		this.field2877 = arg0.field2877;
		this.field2862 = arg1.field2862;
		this.field2837 = arg1.field2837;
		this.field2849 = arg1.field2849;
		this.field2847 = arg1.field2847;
	}

	@ObfuscatedName("ng.a(Lng;ILng;)V")
	public void method1020(ObjType arg0, ObjType arg1) {
		this.field2873 = arg1.field2873;
		this.field2889 = arg1.field2889;
		this.name = arg0.name;
		this.field2879 = arg0.field2879;
		this.field2880 = arg0.field2880;
		this.field2872 = arg1.field2872;
		this.field2849 = arg0.field2849;
		this.field2875 = arg0.field2875;
		this.field2876 = arg1.field2876;
		this.field2838 = arg0.field2838;
		this.field2837 = arg0.field2837;
		this.field2853 = arg0.field2853;
		this.field2898 = arg0.field2898;
		this.field2848 = arg0.field2848;
		this.field2862 = arg1.field2862;
		this.field2877 = arg0.field2877;
		this.field2847 = arg1.field2847;
		this.field2904 = new JagString[5];
		this.field2842 = arg0.field2842;
		this.field2858 = arg0.field2858;
		this.field2854 = 0;
		this.field2891 = arg0.field2891;
		this.field2887 = arg0.field2887;
		this.field2865 = arg0.field2865;
		this.field2888 = arg0.field2888;
		this.field2863 = arg0.field2863;
		this.field2870 = arg1.field2870;
		this.field2836 = arg0.field2836;
		this.field2857 = arg0.field2857;
		this.field2855 = arg0.field2855;
		this.params = arg0.params;
		if (arg0.field2904 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.field2904[var3] = arg0.field2904[var3];
			}
		}
		this.field2904[4] = Text.field592;
	}

	@ObfuscatedName("ng.d(II)Lng;")
	public ObjType method1021(int arg0) {
		if (this.field2903 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2845[var3] && this.field2845[var3] != 0) {
					var2 = this.field2903[var3];
				}
			}
			if (var2 != -1) {
				return list(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("ng.a(ZB)Z")
	public boolean method1022(boolean arg0) {
		int var2 = this.field2875;
		int var3 = this.field2888;
		int var4 = this.field2842;
		if (arg0) {
			var3 = this.field2853;
			var2 = this.field2880;
			var4 = this.field2858;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!field3008.method959(var3, 0)) {
			var5 = false;
		}
		if (var2 != -1 && !field3008.method959(var2, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !field3008.method959(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ng.a(IBLea;)V")
	public void method1024(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field2862 = arg1.g2();
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 4) {
			this.field2889 = arg1.g2();
		} else if (arg0 == 5) {
			this.field2873 = arg1.g2();
		} else if (arg0 == 6) {
			this.field2872 = arg1.g2();
		} else if (arg0 == 7) {
			this.field2876 = arg1.g2();
			if (this.field2876 > 32767) {
				this.field2876 -= 65536;
			}
		} else if (arg0 == 8) {
			this.field2870 = arg1.g2();
			if (this.field2870 > 32767) {
				this.field2870 -= 65536;
			}
		} else if (arg0 == 11) {
			this.field2852 = 1;
		} else if (arg0 == 12) {
			this.field2854 = arg1.g4();
		} else if (arg0 == 16) {
			this.field2877 = true;
		} else if (arg0 == 23) {
			this.field2888 = arg1.g2();
			this.field2857 = arg1.g1();
		} else if (arg0 == 24) {
			this.field2875 = arg1.g2();
		} else if (arg0 == 25) {
			this.field2853 = arg1.g2();
			this.field2879 = arg1.g1();
		} else if (arg0 == 26) {
			this.field2880 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field2898[arg0 - 30] = arg1.gjstr();
			if (this.field2898[arg0 - 30].method624(Text.field3693)) {
				this.field2898[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.field2904[arg0 - 35] = arg1.gjstr();
		} else if (arg0 == 40) {
			int var15 = arg1.g1();
			this.field2855 = new short[var15];
			this.field2849 = new short[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.field2855[var16] = (short) arg1.g2();
				this.field2849[var16] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.g1();
			this.field2837 = new short[var3];
			this.field2863 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2863[var4] = (short) arg1.g2();
				this.field2837[var4] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			int var13 = arg1.g1();
			this.field2887 = new byte[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field2887[var14] = arg1.g1b();
			}
		} else if (arg0 == 65) {
			this.field2861 = true;
		} else if (arg0 == 78) {
			this.field2842 = arg1.g2();
		} else if (arg0 == 79) {
			this.field2858 = arg1.g2();
		} else if (arg0 == 90) {
			this.field2848 = arg1.g2();
		} else if (arg0 == 91) {
			this.field2891 = arg1.g2();
		} else if (arg0 == 92) {
			this.field2838 = arg1.g2();
		} else if (arg0 == 93) {
			this.field2865 = arg1.g2();
		} else if (arg0 == 95) {
			this.field2847 = arg1.g2();
		} else if (arg0 == 96) {
			this.field2850 = arg1.g1();
		} else if (arg0 == 97) {
			this.field2841 = arg1.g2();
		} else if (arg0 == 98) {
			this.field2867 = arg1.g2();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.field2903 == null) {
				this.field2845 = new int[10];
				this.field2903 = new int[10];
			}
			this.field2903[arg0 - 100] = arg1.g2();
			this.field2845[arg0 - 100] = arg1.g2();
		} else if (arg0 == 110) {
			this.field2890 = arg1.g2();
		} else if (arg0 == 111) {
			this.field2843 = arg1.g2();
		} else if (arg0 == 112) {
			this.field2871 = arg1.g2();
		} else if (arg0 == 113) {
			this.field2866 = arg1.g1b();
		} else if (arg0 == 114) {
			this.field2840 = arg1.g1b() * 5;
		} else if (arg0 == 115) {
			this.field2836 = arg1.g1();
		} else if (arg0 == 121) {
			this.field2874 = arg1.g2();
		} else if (arg0 == 122) {
			this.field2884 = arg1.g2();
		} else if (arg0 == 124) {
			if (this.field2839 == null) {
				this.field2839 = new int[11][];
			}
			int var11 = arg1.g1();
			this.field2839[var11] = new int[6];
			for (int var12 = 0; var12 < 6; var12++) {
				this.field2839[var11][var12] = arg1.method334();
			}
		} else if (arg0 == 249) {
			int var5 = arg1.g1();
			if (this.params == null) {
				int var6 = IntUtil.bitceil(var5);
				this.params = new HashTable(var6);
			}
			for (int var7 = 0; var7 < var5; var7++) {
				boolean var8 = arg1.g1() == 1;
				int var9 = arg1.g3();
				Linkable var10;
				if (var8) {
					var10 = new StringNode(arg1.gjstr());
				} else {
					var10 = new IntNode(arg1.g4());
				}
				this.params.put((long) var9, var10);
			}
		}
	}

	@ObfuscatedName("ng.a(IIILk;)Lcg;")
	public ModelLit method1025(int arg0, int arg1, SeqType arg2) {
		if (this.field2903 != null && arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= this.field2845[var5] && this.field2845[var5] != 0) {
					var4 = this.field2903[var5];
				}
			}
			if (var4 != -1) {
				return list(var4).method1025(1, arg1, arg2);
			}
		}
		ModelLit var6 = (ModelLit) field4470.find((long) this.field2844);
		if (var6 == null) {
			ModelUnlit var7 = ModelUnlit.load(field3008, this.field2862);
			if (var7 == null) {
				return null;
			}
			if (this.field2855 != null) {
				for (int var8 = 0; var8 < this.field2855.length; var8++) {
					if (this.field2887 == null || this.field2887.length <= var8) {
						var7.method564(this.field2855[var8], this.field2849[var8]);
					} else {
						var7.method564(this.field2855[var8], clientpalette[this.field2887[var8] & 0xFF]);
					}
				}
			}
			if (this.field2863 != null) {
				for (int var9 = 0; var9 < this.field2863.length; var9++) {
					var7.method553(this.field2863[var9], this.field2837[var9]);
				}
			}
			var6 = var7.light(this.field2866 + 64, this.field2840 + 768, -50, -10, -50);
			if (this.field2890 != 128 || this.field2843 != 128 || this.field2871 != 128) {
				var6.method183(this.field2890, this.field2843, this.field2871);
			}
			var6.field494 = true;
			field4470.put((long) this.field2844, var6);
		}
		if (arg2 != null) {
			var6 = arg2.method758(arg1, var6);
		}
		return var6;
	}
}
