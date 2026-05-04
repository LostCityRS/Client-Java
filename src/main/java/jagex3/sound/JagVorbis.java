package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("rj")
public final class JagVorbis extends Linkable {

	@ObfuscatedName("rj.ab")
	public byte[] field3748;

	@ObfuscatedName("rj.bb")
	public int field3749;

	@ObfuscatedName("rj.t")
	public static int field3716;

	@ObfuscatedName("rj.u")
	public int field3717;

	@ObfuscatedName("rj.v")
	public static float[] field3718;

	@ObfuscatedName("rj.w")
	public static int[] field3719;

	@ObfuscatedName("rj.A")
	public static boolean field3723 = false;

	@ObfuscatedName("rj.x")
	public static int field3720;

	@ObfuscatedName("rj.F")
	public static int field3727;

	@ObfuscatedName("rj.H")
	public int field3729;

	@ObfuscatedName("rj.I")
	public int field3730;

	@ObfuscatedName("rj.N")
	public int field3735;

	@ObfuscatedName("rj.O")
	public int field3736;

	@ObfuscatedName("rj.T")
	public int field3741;

	@ObfuscatedName("rj.X")
	public static int field3745;

	@ObfuscatedName("rj.Z")
	public int field3747;

	@ObfuscatedName("rj.Q")
	public boolean field3738;

	@ObfuscatedName("rj.U")
	public boolean field3742;

	@ObfuscatedName("rj.P")
	public static byte[] field3737;

	@ObfuscatedName("rj.y")
	public float[] field3721;

	@ObfuscatedName("rj.z")
	public static float[] field3722;

	@ObfuscatedName("rj.D")
	public static float[] field3726;

	@ObfuscatedName("rj.J")
	public static float[] field3731;

	@ObfuscatedName("rj.R")
	public static float[] field3739;

	@ObfuscatedName("rj.W")
	public static float[] field3744;

	@ObfuscatedName("rj.Y")
	public static float[] field3746;

	@ObfuscatedName("rj.M")
	public static int[] field3734;

	@ObfuscatedName("rj.S")
	public static int[] field3740;

	@ObfuscatedName("rj.C")
	public static Floor[] field3725;

	@ObfuscatedName("rj.B")
	public static CodeBook[] field3724;

	@ObfuscatedName("rj.G")
	public static Residue[] field3728;

	@ObfuscatedName("rj.V")
	public static Mapping[] field3743;

	@ObfuscatedName("rj.K")
	public static boolean[] field3732;

	@ObfuscatedName("rj.L")
	public byte[][] field3733;

	@ObfuscatedName("rj.b()I")
	public static int readBit() {
		int var0 = field3737[field3716] >> field3720 & 0x1;
		field3720++;
		field3716 += field3720 >> 3;
		field3720 &= 0x7;
		return var0;
	}

	@ObfuscatedName("rj.b([B)V")
	public static void method1349(byte[] arg0) {
		method1350(arg0);
		field3745 = 0x1 << readBits(4);
		field3727 = 0x1 << readBits(4);
		field3746 = new float[field3727];
		for (int var1 = 0; var1 < 2; var1++) {
			int var2 = var1 == 0 ? field3745 : field3727;
			int var3 = var2 >> 1;
			int var4 = var2 >> 2;
			int var5 = var2 >> 3;
			float[] var6 = new float[var3];
			for (int var7 = 0; var7 < var4; var7++) {
				var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
				var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
			}
			float[] var8 = new float[var3];
			for (int var9 = 0; var9 < var4; var9++) {
				var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
				var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
			}
			float[] var10 = new float[var4];
			for (int var11 = 0; var11 < var5; var11++) {
				var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
				var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
			}
			int[] var12 = new int[var5];
			int var13 = Statics.bitsRequired(var5 - 1);
			for (int var14 = 0; var14 < var5; var14++) {
				var12[var14] = Statics.method1524(var14, var13);
			}
			if (var1 == 0) {
				field3744 = var6;
				field3718 = var8;
				field3726 = var10;
				field3719 = var12;
			} else {
				field3731 = var6;
				field3722 = var8;
				field3739 = var10;
				field3740 = var12;
			}
		}
		int var15 = readBits(8) + 1;
		field3724 = new CodeBook[var15];
		for (int var16 = 0; var16 < var15; var16++) {
			field3724[var16] = new CodeBook();
		}
		int var17 = readBits(6) + 1;
		for (int var18 = 0; var18 < var17; var18++) {
			readBits(16);
		}
		int var19 = readBits(6) + 1;
		field3725 = new Floor[var19];
		for (int var20 = 0; var20 < var19; var20++) {
			field3725[var20] = new Floor();
		}
		int var21 = readBits(6) + 1;
		field3728 = new Residue[var21];
		for (int var22 = 0; var22 < var21; var22++) {
			field3728[var22] = new Residue();
		}
		int var23 = readBits(6) + 1;
		field3743 = new Mapping[var23];
		for (int var24 = 0; var24 < var23; var24++) {
			field3743[var24] = new Mapping();
		}
		int var25 = readBits(6) + 1;
		field3732 = new boolean[var25];
		field3734 = new int[var25];
		for (int var26 = 0; var26 < var25; var26++) {
			field3732[var26] = readBit() != 0;
			readBits(16);
			readBits(16);
			field3734[var26] = readBits(8);
		}
	}

	@ObfuscatedName("rj.a([BI)V")
	public static void method1350(byte[] arg0) {
		field3737 = arg0;
		field3716 = 0;
		field3720 = 0;
	}

	@ObfuscatedName("rj.b(I)F")
	public static float method1351(int arg0) {
		int var1 = arg0 & 0x1FFFFF;
		int var2 = arg0 & Integer.MIN_VALUE;
		int var3 = arg0 >> 21 & 0x3FF;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	@ObfuscatedName("rj.a(Lnb;)Z")
	public static boolean method1352(Js5 arg0) {
		if (!field3723) {
			byte[] var1 = arg0.getFile(0, 0);
			if (var1 == null) {
				return false;
			}
			method1349(var1);
			field3723 = true;
		}
		return true;
	}

	@ObfuscatedName("rj.c(I)I")
	public static int readBits(int arg0) {
		int var1 = 0;
		int var2 = 0;
		while (arg0 >= 8 - field3720) {
			int var3 = 8 - field3720;
			int var4 = (0x1 << var3) - 1;
			var1 += (field3737[field3716] >> field3720 & var4) << var2;
			field3720 = 0;
			field3716++;
			var2 += var3;
			arg0 -= var3;
		}
		if (arg0 > 0) {
			int var5 = (0x1 << arg0) - 1;
			var1 += (field3737[field3716] >> field3720 & var5) << var2;
			field3720 += arg0;
		}
		return var1;
	}

	@ObfuscatedName("rj.a(Lnb;II)Lrj;")
	public static JagVorbis method1354(Js5 arg0, int arg1, int arg2) {
		if (method1352(arg0)) {
			byte[] var3 = arg0.getFile(arg2, arg1);
			return var3 == null ? null : new JagVorbis(var3);
		} else {
			arg0.method959(arg1, arg2);
			return null;
		}
	}

	public JagVorbis(byte[] arg0) {
		this.method1346(arg0);
	}

	@ObfuscatedName("rj.a([B)V")
	public void method1346(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		this.field3717 = var2.g4();
		this.field3729 = var2.g4();
		this.field3736 = var2.g4();
		this.field3730 = var2.g4();
		if (this.field3730 < 0) {
			this.field3730 = ~this.field3730;
			this.field3738 = true;
		}
		int var3 = var2.g4();
		this.field3733 = new byte[var3][];
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.g1();
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.method307(var5, var7);
			this.field3733[var4] = var7;
		}
	}

	@ObfuscatedName("rj.a([I)Ltf;")
	public Wave method1355(int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.field3748 == null) {
			this.field3741 = 0;
			this.field3721 = new float[field3727];
			this.field3748 = new byte[this.field3729];
			this.field3747 = 0;
			this.field3749 = 0;
		}
		while (this.field3749 < this.field3733.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			float[] var2 = this.method1356(this.field3749);
			if (var2 != null) {
				int var3 = this.field3747;
				int var4 = var2.length;
				if (var4 > this.field3729 - var3) {
					var4 = this.field3729 - var3;
				}
				for (int var5 = 0; var5 < var4; var5++) {
					int var6 = (int) (var2[var5] * 128.0F + 128.0F);
					if ((var6 & 0xFFFFFF00) != 0) {
						var6 = ~var6 >> 31;
					}
					this.field3748[var3++] = (byte) (var6 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= var3 - this.field3747;
				}
				this.field3747 = var3;
			}
			this.field3749++;
		}
		this.field3721 = null;
		byte[] var7 = this.field3748;
		this.field3748 = null;
		return new Wave(this.field3717, var7, this.field3736, this.field3730, this.field3738);
	}

	@ObfuscatedName("rj.d(I)[F")
	public float[] method1356(int arg0) {
		method1350(this.field3733[arg0]);
		readBit();
		int var2 = readBits(Statics.bitsRequired(field3734.length - 1));
		boolean var3 = field3732[var2];
		int var4 = var3 ? field3727 : field3745;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = readBit() != 0;
			var6 = readBit() != 0;
		}
		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (field3745 >> 2);
			var9 = (var4 >> 2) + (field3745 >> 2);
			var10 = field3745 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}
		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (field3745 >> 2);
			var12 = var4 + (field3745 >> 2) - (var4 >> 2);
			var13 = field3745 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}
		Mapping var14 = field3743[field3734[var2]];
		int var15 = var14.field1524;
		int var16 = var14.field1526[var15];
		boolean var17 = !field3725[var16].method699();
		for (int var18 = 0; var18 < var14.field1525; var18++) {
			Residue var19 = field3728[var14.field1527[var18]];
			float[] var20 = field3746;
			var19.method25(var20, var4 >> 1, var17);
		}
		if (!var17) {
			int var21 = var14.field1524;
			int var22 = var14.field1526[var21];
			field3725[var22].method694(field3746, var4 >> 1);
		}
		if (var17) {
			for (int var23 = var4 >> 1; var23 < var4; var23++) {
				field3746[var23] = 0.0F;
			}
		} else {
			int var24 = var4 >> 1;
			int var25 = var4 >> 2;
			int var26 = var4 >> 3;
			float[] var27 = field3746;
			for (int var28 = 0; var28 < var24; var28++) {
				var27[var28] *= 0.5F;
			}
			for (int var29 = var24; var29 < var4; var29++) {
				var27[var29] = -var27[var4 - var29 - 1];
			}
			float[] var30 = var3 ? field3731 : field3744;
			float[] var31 = var3 ? field3722 : field3718;
			float[] var32 = var3 ? field3739 : field3726;
			int[] var33 = var3 ? field3740 : field3719;
			for (int var34 = 0; var34 < var25; var34++) {
				float var35 = var27[var34 * 4] - var27[var4 - var34 * 4 - 1];
				float var36 = var27[var34 * 4 + 2] - var27[var4 - var34 * 4 - 3];
				float var37 = var30[var34 * 2];
				float var38 = var30[var34 * 2 + 1];
				var27[var4 - var34 * 4 - 1] = var35 * var37 - var36 * var38;
				var27[var4 - var34 * 4 - 3] = var35 * var38 + var36 * var37;
			}
			for (int var39 = 0; var39 < var26; var39++) {
				float var40 = var27[var24 + var39 * 4 + 3];
				float var41 = var27[var24 + var39 * 4 + 1];
				float var42 = var27[var39 * 4 + 3];
				float var43 = var27[var39 * 4 + 1];
				var27[var24 + var39 * 4 + 3] = var40 + var42;
				var27[var24 + var39 * 4 + 1] = var41 + var43;
				float var44 = var30[var24 - var39 * 4 - 4];
				float var45 = var30[var24 - var39 * 4 - 3];
				var27[var39 * 4 + 3] = (var40 - var42) * var44 - (var41 - var43) * var45;
				var27[var39 * 4 + 1] = (var41 - var43) * var44 + (var40 - var42) * var45;
			}
			int var46 = Statics.bitsRequired(var4 - 1);
			for (int var47 = 0; var47 < var46 - 3; var47++) {
				int var48 = var4 >> var47 + 2;
				int var49 = 0x8 << var47;
				for (int var50 = 0; var50 < 0x2 << var47; var50++) {
					int var51 = var4 - var48 * 2 * var50;
					int var52 = var4 - var48 * (var50 * 2 + 1);
					for (int var53 = 0; var53 < var4 >> var47 + 4; var53++) {
						int var54 = var53 * 4;
						float var55 = var27[var51 - var54 - 1];
						float var56 = var27[var51 - var54 - 3];
						float var57 = var27[var52 - var54 - 1];
						float var58 = var27[var52 - var54 - 3];
						var27[var51 - var54 - 1] = var55 + var57;
						var27[var51 - var54 - 3] = var56 + var58;
						float var59 = var30[var53 * var49];
						float var60 = var30[var53 * var49 + 1];
						var27[var52 - var54 - 1] = (var55 - var57) * var59 - (var56 - var58) * var60;
						var27[var52 - var54 - 3] = (var56 - var58) * var59 + (var55 - var57) * var60;
					}
				}
			}
			for (int var61 = 1; var61 < var26 - 1; var61++) {
				int var62 = var33[var61];
				if (var61 < var62) {
					int var63 = var61 * 8;
					int var64 = var62 * 8;
					float var65 = var27[var63 + 1];
					var27[var63 + 1] = var27[var64 + 1];
					var27[var64 + 1] = var65;
					float var66 = var27[var63 + 3];
					var27[var63 + 3] = var27[var64 + 3];
					var27[var64 + 3] = var66;
					float var67 = var27[var63 + 5];
					var27[var63 + 5] = var27[var64 + 5];
					var27[var64 + 5] = var67;
					float var68 = var27[var63 + 7];
					var27[var63 + 7] = var27[var64 + 7];
					var27[var64 + 7] = var68;
				}
			}
			for (int var69 = 0; var69 < var24; var69++) {
				var27[var69] = var27[var69 * 2 + 1];
			}
			for (int var70 = 0; var70 < var26; var70++) {
				var27[var4 - var70 * 2 - 1] = var27[var70 * 4];
				var27[var4 - var70 * 2 - 2] = var27[var70 * 4 + 1];
				var27[var4 - var25 - var70 * 2 - 1] = var27[var70 * 4 + 2];
				var27[var4 - var25 - var70 * 2 - 2] = var27[var70 * 4 + 3];
			}
			for (int var71 = 0; var71 < var26; var71++) {
				float var72 = var32[var71 * 2];
				float var73 = var32[var71 * 2 + 1];
				float var74 = var27[var24 + var71 * 2];
				float var75 = var27[var24 + var71 * 2 + 1];
				float var76 = var27[var4 - var71 * 2 - 2];
				float var77 = var27[var4 - var71 * 2 - 1];
				float var78 = var73 * (var74 - var76) + var72 * (var75 + var77);
				var27[var24 + var71 * 2] = (var74 + var76 + var78) * 0.5F;
				var27[var4 - var71 * 2 - 2] = (var74 + var76 - var78) * 0.5F;
				float var79 = var73 * (var75 + var77) - var72 * (var74 - var76);
				var27[var24 + var71 * 2 + 1] = (var75 + var79 - var77) * 0.5F;
				var27[var4 - var71 * 2 - 1] = (var77 + var79 - var75) * 0.5F;
			}
			for (int var80 = 0; var80 < var25; var80++) {
				var27[var80] = var27[var80 * 2 + var24] * var31[var80 * 2] + var27[var80 * 2 + var24 + 1] * var31[var80 * 2 + 1];
				var27[var24 - var80 - 1] = var27[var80 * 2 + var24] * var31[var80 * 2 + 1] - var27[var80 * 2 + var24 + 1] * var31[var80 * 2];
			}
			for (int var81 = 0; var81 < var25; var81++) {
				var27[var4 + var81 - var25] = -var27[var81];
			}
			for (int var82 = 0; var82 < var25; var82++) {
				var27[var82] = var27[var25 + var82];
			}
			for (int var83 = 0; var83 < var25; var83++) {
				var27[var25 + var83] = -var27[var25 - var83 - 1];
			}
			for (int var84 = 0; var84 < var25; var84++) {
				var27[var24 + var84] = var27[var4 - var84 - 1];
			}
			for (int var85 = var8; var85 < var9; var85++) {
				float var86 = (float) Math.sin(((double) (var85 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
				field3746[var85] *= (float) Math.sin((double) var86 * 1.5707963267948966D * (double) var86);
			}
			for (int var87 = var11; var87 < var12; var87++) {
				float var88 = (float) Math.sin(((double) (var87 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				field3746[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
			}
		}
		float[] var89 = null;
		if (this.field3741 > 0) {
			int var90 = this.field3741 + var4 >> 2;
			var89 = new float[var90];
			if (!this.field3742) {
				for (int var91 = 0; var91 < this.field3735; var91++) {
					int var92 = (this.field3741 >> 1) + var91;
					var89[var91] += this.field3721[var92];
				}
			}
			if (!var17) {
				for (int var93 = var8; var93 < var4 >> 1; var93++) {
					int var94 = var89.length + var93 - (var4 >> 1);
					var89[var94] += field3746[var93];
				}
			}
		}
		float[] var95 = this.field3721;
		this.field3721 = field3746;
		field3746 = var95;
		this.field3741 = var4;
		this.field3735 = var12 - (var4 >> 1);
		this.field3742 = var17;
		return var89;
	}
}
