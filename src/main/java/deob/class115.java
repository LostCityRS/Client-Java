package deob;

import jagex3.client.ClientMouseListener;
import jagex3.dash3d.ModelLit;
import jagex3.datastruct.Linkable2;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("ta")
public final class class115 extends Linkable2 {

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

	@ObfuscatedName("ta.ub")
	public static int field2828 = 0;

	@ObfuscatedName("ta.uc")
	public boolean field2880 = false;

	@ObfuscatedName("ta.vb")
	public static int field2829 = 0;

	@ObfuscatedName("ta.vc")
	public static int field2881 = -1;

	@ObfuscatedName("ta.wb")
	public JagString[] field2830 = new JagString[] { null, null, null, null, Statics.field487 };

	@ObfuscatedName("ta.wc")
	public int field2882 = -1;

	@ObfuscatedName("ta.Lb")
	public static int[] field2845 = new int[50];

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
	public JagString[] field2835 = new JagString[] { null, null, Statics.field1594, null, null };

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
		if (!Statics.field458.method218(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !Statics.field458.method218(var3, 0)) {
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
		if (!Statics.field458.method218(var2, 0)) {
			var5 = false;
		}
		if (var3 != -1 && !Statics.field458.method218(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !Statics.field458.method218(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ta.a(ZI)Lpa;")
	public ModelLit method941(boolean arg0) {
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
		ModelLit var5 = ModelLit.method798(Statics.field458, var2);
		if (var3 != -1) {
			ModelLit var6 = ModelLit.method798(Statics.field458, var3);
			if (var4 == -1) {
				ModelLit[] var7 = new ModelLit[] { var5, var6 };
				var5 = new ModelLit(var7, 2);
			} else {
				ModelLit var8 = ModelLit.method798(Statics.field458, var4);
				ModelLit[] var9 = new ModelLit[] { var5, var6, var8 };
				var5 = new ModelLit(var9, 3);
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
	public class115 method944(int arg0) {
		if (this.field2862 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2865[var3] && this.field2865[var3] != 0) {
					var2 = this.field2862[var3];
				}
			}
			if (var2 != -1) {
				return Statics.method760(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("ta.b(ZB)Lpa;")
	public ModelLit method948(boolean arg0) {
		int var2 = this.field2831;
		int var3 = this.field2872;
		if (arg0) {
			var2 = this.field2882;
			var3 = this.field2853;
		}
		if (var2 == -1) {
			return null;
		}
		ModelLit var4 = ModelLit.method798(Statics.field458, var2);
		if (var3 != -1) {
			ModelLit var5 = ModelLit.method798(Statics.field458, var3);
			ModelLit[] var6 = new ModelLit[] { var4, var5 };
			var4 = new ModelLit(var6, 2);
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
			this.field2836 = arg1.method145();
		} else if (arg0 == 2) {
			this.field2827 = arg1.method140();
		} else if (arg0 == 4) {
			this.field2848 = arg1.method145();
		} else if (arg0 == 5) {
			this.field2875 = arg1.method145();
		} else if (arg0 == 6) {
			this.field2861 = arg1.method145();
		} else if (arg0 == 7) {
			this.field2837 = arg1.method145();
			if (this.field2837 > 32767) {
				this.field2837 -= 65536;
			}
		} else if (arg0 == 8) {
			this.field2841 = arg1.method145();
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
			this.field2867 = arg1.method145();
			this.field2849 = arg1.method144();
		} else if (arg0 == 24) {
			this.field2851 = arg1.method145();
		} else if (arg0 == 25) {
			this.field2879 = arg1.method145();
			this.field2860 = arg1.method144();
		} else if (arg0 == 26) {
			this.field2850 = arg1.method145();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field2835[arg0 - 30] = arg1.method140();
			if (this.field2835[arg0 - 30].method14(Statics.field2928)) {
				this.field2835[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.field2830[arg0 - 35] = arg1.method140();
		} else if (arg0 == 40) {
			int var3 = arg1.method144();
			this.field2847 = new int[var3];
			this.field2834 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2834[var4] = arg1.method145();
				this.field2847[var4] = arg1.method145();
			}
		} else if (arg0 == 78) {
			this.field2855 = arg1.method145();
		} else if (arg0 == 79) {
			this.field2876 = arg1.method145();
		} else if (arg0 == 90) {
			this.field2831 = arg1.method145();
		} else if (arg0 == 91) {
			this.field2882 = arg1.method145();
		} else if (arg0 == 92) {
			this.field2872 = arg1.method145();
		} else if (arg0 == 93) {
			this.field2853 = arg1.method145();
		} else if (arg0 == 95) {
			this.field2858 = arg1.method145();
		} else if (arg0 == 97) {
			this.field2843 = arg1.method145();
		} else if (arg0 == 98) {
			this.field2838 = arg1.method145();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.field2862 == null) {
				this.field2865 = new int[10];
				this.field2862 = new int[10];
			}
			this.field2862[arg0 - 100] = arg1.method145();
			this.field2865[arg0 - 100] = arg1.method145();
		} else if (arg0 == 110) {
			this.field2844 = arg1.method145();
		} else if (arg0 == 111) {
			this.field2884 = arg1.method145();
		} else if (arg0 == 112) {
			this.field2864 = arg1.method145();
		} else if (arg0 == 113) {
			this.field2856 = arg1.method184();
		} else if (arg0 == 114) {
			this.field2871 = arg1.method184() * 5;
		} else if (arg0 == 115) {
			this.field2854 = arg1.method144();
		}
	}

	@ObfuscatedName("ta.a(Lba;I)V")
	public void method952(Packet arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method951(var2, arg0);
		}
	}

	@ObfuscatedName("ta.a(Lta;ZLta;)V")
	public void method953(class115 arg0, class115 arg1) {
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
	public ModelLit method954(boolean arg0, int arg1) {
		if (this.field2862 != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.field2865[var4] && this.field2865[var4] != 0) {
					var3 = this.field2862[var4];
				}
			}
			if (var3 != -1) {
				return Statics.method760(var3).method954(arg0, 1);
			}
		}
		if (arg0) {
			ModelLit var5 = (ModelLit) ClientMouseListener.field3035.method263((long) this.field2883);
			if (var5 != null) {
				return var5;
			}
		}
		ModelLit var6 = ModelLit.method798(Statics.field458, this.field2836);
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
			ClientMouseListener.field3035.method262((long) this.field2883, var6);
		}
		return var6;
	}
}
