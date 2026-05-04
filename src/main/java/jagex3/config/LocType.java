package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.constants.Text;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;
import jagex3.var.VarCache;

@ObfuscatedName("nf")
public final class LocType extends Linkable2 {

	@ObfuscatedName("qe.d")
	public static final LruCache field3558 = new LruCache(64);
	@ObfuscatedName("fd.S")
	public static final ModelSourceCache field1123 = new ModelSourceCache(500);
	@ObfuscatedName("eb.M")
	public static final ModelSourceCache field879 = new ModelSourceCache(30);
	@ObfuscatedName("ra.R")
	public static final ModelCacheLit field3623 = new ModelCacheLit();
	@ObfuscatedName("fd.W")
	public static final ModelUnlit[] field1127 = new ModelUnlit[4];
	@ObfuscatedName("sd.p")
	public static Js5 field3827;
	@ObfuscatedName("hc.U")
	public static ModelSourceCache field1442;
	@ObfuscatedName("ma.U")
	public static boolean field2465 = false;
	@ObfuscatedName("bh.K")
	public static boolean field317;
	@ObfuscatedName("qa.f")
	public static Js5 field3524;
	@ObfuscatedName("l.Z")
	public static short[] clientpalette = new short[256];
	@ObfuscatedName("nf.ab")
	public short[] field2790;

	@ObfuscatedName("nf.cb")
	public int field2792 = 128;

	@ObfuscatedName("nf.eb")
	public int field2794 = 1;

	@ObfuscatedName("nf.fb")
	public int field2795 = 0;

	@ObfuscatedName("nf.gb")
	public int field2796 = 0;

	@ObfuscatedName("nf.jb")
	public boolean field2799 = false;

	@ObfuscatedName("nf.mb")
	public int field2802 = 128;

	@ObfuscatedName("nf.nb")
	public boolean field2803 = false;

	@ObfuscatedName("nf.ob")
	public short[] field2804;

	@ObfuscatedName("nf.pb")
	public int field2805 = 16;

	@ObfuscatedName("nf.qb")
	public int field2806 = -1;

	@ObfuscatedName("nf.rb")
	public int field2807 = 0;

	@ObfuscatedName("nf.tb")
	public int field2809 = 0;

	@ObfuscatedName("nf.ub")
	public int field2810 = -1;

	@ObfuscatedName("nf.vb")
	public int[] field2811;

	@ObfuscatedName("nf.I")
	public boolean field2772 = false;

	@ObfuscatedName("nf.Q")
	public int field2780 = -1;

	@ObfuscatedName("nf.X")
	public short field2787 = -1;

	@ObfuscatedName("nf.Y")
	public int field2788 = 0;

	@ObfuscatedName("nf.K")
	public int field2774 = 1;

	@ObfuscatedName("nf.D")
	public int field2767 = -1;

	@ObfuscatedName("nf.R")
	public int field2781 = 0;

	@ObfuscatedName("nf.Db")
	public int field2819 = 2;

	@ObfuscatedName("nf.H")
	public int field2771 = 0;

	@ObfuscatedName("nf.Fb")
	public int field2821 = 128;

	@ObfuscatedName("nf.Z")
	public boolean field2789 = true;

	@ObfuscatedName("nf.T")
	public boolean field2783 = false;

	@ObfuscatedName("nf.Ab")
	public JagString[] field2816 = new JagString[5];

	@ObfuscatedName("nf.S")
	public boolean field2782 = true;

	@ObfuscatedName("nf.xb")
	public byte field2813 = 0;

	@ObfuscatedName("nf.Bb")
	public int field2817 = -1;

	@ObfuscatedName("nf.J")
	public JagString field2773 = Statics.field1426;

	@ObfuscatedName("nf.Cb")
	public int field2818 = -1;

	@ObfuscatedName("nf.Nb")
	public boolean field2829 = true;

	@ObfuscatedName("nf.Ob")
	public int field2830 = 0;

	@ObfuscatedName("nf.Kb")
	public boolean field2826 = false;

	@ObfuscatedName("nf.Rb")
	public int field2833 = -1;

	@ObfuscatedName("nf.Qb")
	public int field2832 = -1;

	@ObfuscatedName("nf.Sb")
	public boolean field2834 = false;

	@ObfuscatedName("nf.Tb")
	public int field2835 = 0;

	@ObfuscatedName("nf.W")
	public boolean field2786 = false;

	@ObfuscatedName("nf.Pb")
	public int field2831;

	@ObfuscatedName("nf.N")
	public HashTable field2777;

	@ObfuscatedName("nf.Ib")
	public byte[] field2824;

	@ObfuscatedName("nf.G")
	public int[] field2770;

	@ObfuscatedName("nf.P")
	public int[] field2779;

	@ObfuscatedName("nf.zb")
	public int[] field2815;

	@ObfuscatedName("nf.M")
	public short[] field2776;

	@ObfuscatedName("nf.yb")
	public short[] field2814;

	@ObfuscatedName("re.a(II)Lnf;")
	public static LocType list(int arg0) {
		LocType var1 = (LocType) field3558.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3827.getFile(Statics.method1344(arg0), Statics.method1077(arg0));
		LocType var3 = new LocType();
		var3.field2831 = arg0;
		if (var2 != null) {
			var3.method1002(new Packet(var2));
		}
		var3.method1003();
		if (!field317 && var3.field2834) {
			var3.field2816 = null;
		}
		if (var3.field2803) {
			var3.field2819 = 0;
			var3.field2789 = false;
		}
		field3558.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("h.c(I)V")
	public static void resetCache() {
		field3558.clear();
		field1123.clear();
		field1442.clear();
		field879.clear();
	}

	@ObfuscatedName("cd.a(Lnb;ILnb;ZZ)V")
	public static void init(Js5 arg0, Js5 arg1, boolean arg2, boolean arg3) {
		field2465 = arg3;
		field317 = arg2;
		field3827 = arg0;
		field3524 = arg1;
		field1442 = new ModelSourceCache(30);
	}

	@ObfuscatedName("nf.d(I)Z")
	public boolean method990() {
		if (this.field2779 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field2779.length; var2++) {
			var1 &= field3524.method959(this.field2779[var2] & 0xFFFF, 0);
		}
		return var1;
	}

	@ObfuscatedName("nf.a(BI)Z")
	public boolean method991(int arg0) {
		if (this.field2811 != null) {
			for (int var4 = 0; var4 < this.field2811.length; var4++) {
				if (arg0 == this.field2811[var4]) {
					return field3524.method959(this.field2779[var4] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.field2779 == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field2779.length; var3++) {
				var2 &= field3524.method959(this.field2779[var3] & 0xFFFF, 0);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nf.f(I)Z")
	public boolean method994() {
		if (this.field2770 == null) {
			return this.field2806 != -1 || this.field2815 != null;
		}
		for (int var1 = 0; var1 < this.field2770.length; var1++) {
			if (this.field2770[var1] != -1) {
				LocType var2 = list(this.field2770[var1]);
				if (var2.field2806 != -1 || var2.field2815 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("nf.a(BII)I")
	public int method995(int arg0, int arg1) {
		if (this.field2777 == null) {
			return arg0;
		} else {
			IntNode var3 = (IntNode) this.field2777.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field3698;
		}
	}

	@ObfuscatedName("nf.a(I[[I[[IIZIIII)Ltc;")
	public ModelCacheLit method997(int arg0, int[][] arg1, int[][] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		long var9;
		if (this.field2811 == null) {
			var9 = arg6 + (this.field2831 << 10);
		} else {
			var9 = arg6 + (this.field2831 << 10) + (arg0 << 3);
		}
		boolean var11;
		if (arg4 && this.field2783) {
			var11 = true;
			var9 |= Long.MIN_VALUE;
		} else {
			var11 = false;
		}
		ModelSource var12 = field1442.find(var9);
		if (var12 == null) {
			ModelUnlit var13 = this.method1000(arg6, arg0);
			if (var13 == null) {
				field3623.field3984 = null;
				return field3623;
			}
			var13.method563();
			if (var11) {
				var12 = var13;
				var13.field1523 = (short) (this.field2796 * 5 + 768);
				var13.field1498 = (short) (this.field2809 + 64);
				var13.method548();
			} else {
				var12 = new SoftwareModelLit(var13, this.field2809 + 64, 768 - -(this.field2796 * 5), -50, -10, -50);
			}
			field1442.put(var9, var12);
		}
		if (var11) {
			var12 = ((ModelUnlit) var12).copyForShareLight();
		}
		if (this.field2813 != 0) {
			if (var12 instanceof SoftwareModelLit) {
				var12 = ((SoftwareModelLit) var12).hillSkew(this.field2813, this.field2787, arg2, arg1, arg3, arg7, arg5, true);
			} else if (var12 instanceof ModelUnlit) {
				var12 = ((ModelUnlit) var12).hillSkew(this.field2813, this.field2787, arg2, arg1, arg3, arg7, arg5);
			}
		}
		field3623.field3984 = var12;
		return field3623;
	}

	@ObfuscatedName("nf.d(B)Lnf;")
	public LocType method998() {
		int var1 = -1;
		if (this.field2767 != -1) {
			var1 = VarCache.method930(this.field2767);
		} else if (this.field2818 != -1) {
			var1 = VarCache.field2050[this.field2818];
		}
		if (var1 < 0 || var1 >= this.field2770.length - 1 || this.field2770[var1] == -1) {
			int var2 = this.field2770[this.field2770.length - 1];
			return var2 == -1 ? null : list(var2);
		} else {
			return list(this.field2770[var1]);
		}
	}

	@ObfuscatedName("nf.a(ILi;I)Li;")
	public JagString method999(JagString arg0, int arg1) {
		if (this.field2777 == null) {
			return arg0;
		} else {
			StringNode var3 = (StringNode) this.field2777.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("nf.a(IIB)Lhe;")
	public ModelUnlit method1000(int arg0, int arg1) {
		ModelUnlit var3 = null;
		boolean var4 = this.field2786;
		if (arg1 == 2 && arg0 > 3) {
			var4 = !var4;
		}
		if (this.field2811 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.field2779 == null) {
				return null;
			}
			int var5 = this.field2779.length;
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = this.field2779[var6];
				if (var4) {
					var7 += 65536;
				}
				var3 = (ModelUnlit) field1123.find((long) var7);
				if (var3 == null) {
					var3 = ModelUnlit.load(field3524, var7 & 0xFFFF);
					if (var3 == null) {
						return null;
					}
					if (var4) {
						var3.method551();
					}
					field1123.put((long) var7, var3);
				}
				if (var5 > 1) {
					field1127[var6] = var3;
				}
			}
			if (var5 > 1) {
				var3 = new ModelUnlit(field1127, var5);
			}
		} else {
			int var8 = -1;
			for (int var9 = 0; var9 < this.field2811.length; var9++) {
				if (arg1 == this.field2811[var9]) {
					var8 = var9;
					break;
				}
			}
			if (var8 == -1) {
				return null;
			}
			int var10 = this.field2779[var8];
			if (var4) {
				var10 += 65536;
			}
			var3 = (ModelUnlit) field1123.find((long) var10);
			if (var3 == null) {
				var3 = ModelUnlit.load(field3524, var10 & 0xFFFF);
				if (var3 == null) {
					return null;
				}
				if (var4) {
					var3.method551();
				}
				field1123.put((long) var10, var3);
			}
		}
		boolean var11;
		if (this.field2792 == 128 && this.field2821 == 128 && this.field2802 == 128) {
			var11 = false;
		} else {
			var11 = true;
		}
		boolean var12;
		if (this.field2830 == 0 && this.field2788 == 0 && this.field2835 == 0) {
			var12 = false;
		} else {
			var12 = true;
		}
		ModelUnlit var13 = new ModelUnlit(var3, arg0 == 0 && !var11 && !var12, this.field2804 == null, this.field2776 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			var13.method573();
			var13.method549(45, 0, -45);
		}
		int var14 = arg0 & 0x3;
		if (var14 == 1) {
			var13.method555();
		} else if (var14 == 2) {
			var13.method572();
		} else if (var14 == 3) {
			var13.method566();
		}
		if (this.field2804 != null) {
			for (int var15 = 0; var15 < this.field2804.length; var15++) {
				if (this.field2824 == null || var15 >= this.field2824.length) {
					var13.method564(this.field2804[var15], this.field2790[var15]);
				} else {
					var13.method564(this.field2804[var15], clientpalette[this.field2824[var15] & 0xFF]);
				}
			}
		}
		if (this.field2776 != null) {
			for (int var16 = 0; var16 < this.field2776.length; var16++) {
				var13.method553(this.field2776[var16], this.field2814[var16]);
			}
		}
		if (var11) {
			var13.method552(this.field2792, this.field2821, this.field2802);
		}
		if (var12) {
			var13.method549(this.field2830, this.field2788, this.field2835);
		}
		return var13;
	}

	@ObfuscatedName("nf.a(BILea;)V")
	public void method1001(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			if (var3 > 0) {
				if (this.field2779 != null && !field2465) {
					arg1.pos += var3 * 3;
					return;
				}
				this.field2811 = new int[var3];
				this.field2779 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.field2779[var4] = arg1.g2();
					this.field2811[var4] = arg1.g1();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.field2773 = arg1.gjstr();
		} else if (arg0 == 5) {
			int var22 = arg1.g1();
			if (var22 > 0) {
				if (this.field2779 != null && !field2465) {
					arg1.pos += var22 * 2;
					return;
				}
				this.field2779 = new int[var22];
				this.field2811 = null;
				for (int var23 = 0; var23 < var22; var23++) {
					this.field2779[var23] = arg1.g2();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.field2774 = arg1.g1();
			return;
		} else if (arg0 == 15) {
			this.field2794 = arg1.g1();
			return;
		} else if (arg0 == 17) {
			this.field2789 = false;
			this.field2819 = 0;
			return;
		} else if (arg0 == 18) {
			this.field2789 = false;
			return;
		} else if (arg0 == 19) {
			this.field2833 = arg1.g1();
			return;
		} else if (arg0 == 21) {
			this.field2813 = 1;
			return;
		} else {
			if (arg0 == 22) {
				this.field2783 = true;
			} else if (arg0 == 23) {
				this.field2772 = true;
				return;
			} else if (arg0 == 24) {
				this.field2810 = arg1.g2();
				if (this.field2810 == 65535) {
					this.field2810 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.field2819 = 1;
				return;
			} else if (arg0 == 28) {
				this.field2805 = arg1.g1();
				return;
			} else if (arg0 == 29) {
				this.field2809 = arg1.g1b();
				return;
			} else if (arg0 == 39) {
				this.field2796 = arg1.g1b() * 5;
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.field2816[arg0 - 30] = arg1.gjstr();
					if (this.field2816[arg0 - 30].method624(Text.field3693)) {
						this.field2816[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					int var5 = arg1.g1();
					this.field2804 = new short[var5];
					this.field2790 = new short[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.field2804[var6] = (short) arg1.g2();
						this.field2790[var6] = (short) arg1.g2();
					}
					return;
				} else if (arg0 == 41) {
					int var20 = arg1.g1();
					this.field2814 = new short[var20];
					this.field2776 = new short[var20];
					for (int var21 = 0; var21 < var20; var21++) {
						this.field2776[var21] = (short) arg1.g2();
						this.field2814[var21] = (short) arg1.g2();
					}
				} else if (arg0 == 42) {
					int var7 = arg1.g1();
					this.field2824 = new byte[var7];
					for (int var8 = 0; var8 < var7; var8++) {
						this.field2824[var8] = arg1.g1b();
					}
					return;
				} else if (arg0 == 60) {
					this.field2817 = arg1.g2();
					return;
				} else if (arg0 == 62) {
					this.field2786 = true;
					return;
				} else if (arg0 == 64) {
					this.field2782 = false;
					return;
				} else if (arg0 == 65) {
					this.field2792 = arg1.g2();
					return;
				} else if (arg0 == 66) {
					this.field2821 = arg1.g2();
					return;
				} else if (arg0 == 67) {
					this.field2802 = arg1.g2();
					return;
				} else if (arg0 == 68) {
					this.field2832 = arg1.g2();
					return;
				} else if (arg0 == 69) {
					this.field2781 = arg1.g1();
					return;
				} else if (arg0 == 70) {
					this.field2830 = arg1.method334();
					return;
				} else if (arg0 == 71) {
					this.field2788 = arg1.method334();
					return;
				} else if (arg0 == 72) {
					this.field2835 = arg1.method334();
					return;
				} else if (arg0 == 73) {
					this.field2826 = true;
					return;
				} else if (arg0 == 74) {
					this.field2803 = true;
					return;
				} else if (arg0 == 75) {
					this.field2780 = arg1.g1();
					return;
				} else if (arg0 == 77 || arg0 == 92) {
					this.field2767 = arg1.g2();
					if (this.field2767 == 65535) {
						this.field2767 = -1;
					}
					int var17 = -1;
					this.field2818 = arg1.g2();
					if (this.field2818 == 65535) {
						this.field2818 = -1;
					}
					if (arg0 == 92) {
						var17 = arg1.g2();
						if (var17 == 65535) {
							var17 = -1;
						}
					}
					int var18 = arg1.g1();
					this.field2770 = new int[var18 + 2];
					for (int var19 = 0; var19 <= var18; var19++) {
						this.field2770[var19] = arg1.g2();
						if (this.field2770[var19] == 65535) {
							this.field2770[var19] = -1;
						}
					}
					this.field2770[var18 + 1] = var17;
					return;
				} else if (arg0 == 78) {
					this.field2806 = arg1.g2();
					this.field2771 = arg1.g1();
					return;
				} else {
					if (arg0 == 79) {
						this.field2807 = arg1.g2();
						this.field2795 = arg1.g2();
						this.field2771 = arg1.g1();
						int var15 = arg1.g1();
						this.field2815 = new int[var15];
						for (int var16 = 0; var16 < var15; var16++) {
							this.field2815[var16] = arg1.g2();
						}
					} else if (arg0 == 81) {
						this.field2813 = 2;
						this.field2787 = (short) (arg1.g1() * 256);
						return;
					} else if (arg0 != 82 && arg0 != 88) {
						if (arg0 == 89) {
							this.field2829 = false;
						} else if (arg0 == 90) {
							this.field2799 = true;
							return;
						} else if (arg0 == 91) {
							this.field2834 = true;
							return;
						} else if (arg0 == 93) {
							this.field2813 = 3;
							this.field2787 = (short) arg1.g2();
							return;
						} else if (arg0 == 94) {
							this.field2813 = 4;
							return;
						} else if (arg0 == 95) {
							this.field2813 = 5;
							return;
						} else if (arg0 == 249) {
							int var9 = arg1.g1();
							if (this.field2777 == null) {
								int var10 = IntUtil.bitceil(var9);
								this.field2777 = new HashTable(var10);
							}
							for (int var11 = 0; var11 < var9; var11++) {
								boolean var12 = arg1.g1() == 1;
								int var13 = arg1.g3();
								Linkable var14;
								if (var12) {
									var14 = new StringNode(arg1.gjstr());
								} else {
									var14 = new IntNode(arg1.g4());
								}
								this.field2777.put((long) var13, var14);
							}
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@ObfuscatedName("nf.a(Lea;I)V")
	public void method1002(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1001(var2, arg0);
		}
	}

	@ObfuscatedName("nf.g(I)V")
	public void method1003() {
		if (this.field2833 == -1) {
			this.field2833 = 0;
			if (this.field2779 != null && (this.field2811 == null || this.field2811[0] == 10)) {
				this.field2833 = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.field2816[var1] != null) {
					this.field2833 = 1;
					break;
				}
			}
		}
		if (this.field2780 == -1) {
			this.field2780 = this.field2819 == 0 ? 0 : 1;
		}
	}

	@ObfuscatedName("nf.a(BIIIIILk;[[I[[II)Ltc;")
	public ModelCacheLit method1004(int arg0, int arg1, int arg2, int arg3, int arg4, SeqType arg5, int[][] arg6, int[][] arg7, int arg8) {
		long var10;
		if (this.field2811 == null) {
			var10 = arg8 + (this.field2831 << 10);
		} else {
			var10 = arg8 + (this.field2831 << 10) + (arg2 << 3);
		}
		SoftwareModelLit var12 = (SoftwareModelLit) field879.find(var10);
		if (var12 == null) {
			ModelUnlit var13 = this.method1000(arg8, arg2);
			if (var13 == null) {
				return null;
			}
			var12 = new SoftwareModelLit(var13, this.field2809 + 64, this.field2796 * 5 + 768, -50, -10, -50);
			field879.put(var10, var12);
		}
		if (arg5 != null) {
			var12 = (SoftwareModelLit) arg5.method749(arg8, var12, arg4);
		}
		if (this.field2813 != 0) {
			if (arg5 == null) {
				var12 = (SoftwareModelLit) var12.method184(true, true);
			}
			var12 = var12.hillSkew(this.field2813, this.field2787, arg6, arg7, arg1, arg0, arg3, false);
		}
		field3623.field3984 = var12;
		return field3623;
	}
}
