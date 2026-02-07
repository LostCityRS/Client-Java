package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.MathTool;

@ObfuscatedName("nc")
public final class JagVorbis extends Linkable {

	@ObfuscatedName("nc.r")
	public byte[][] field2126;

	@ObfuscatedName("nc.s")
	public int field2127;

	@ObfuscatedName("nc.t")
	public static Floor[] floor_config;

	@ObfuscatedName("nc.u")
	public static int[] field2129;

	@ObfuscatedName("nc.v")
	public int field2130;

	@ObfuscatedName("nc.w")
	public static float[] field2131;

	@ObfuscatedName("nc.M")
	public static boolean gotHeaders = false;

	@ObfuscatedName("nc.C")
	public int field2137;

	@ObfuscatedName("nc.D")
	public int field2138;

	@ObfuscatedName("nc.E")
	public int field2139;

	@ObfuscatedName("nc.I")
	public static int bytePos;

	@ObfuscatedName("nc.J")
	public int field2144;

	@ObfuscatedName("nc.L")
	public static int blocksize1;

	@ObfuscatedName("nc.R")
	public int field2152;

	@ObfuscatedName("nc.S")
	public static int blocksize0;

	@ObfuscatedName("nc.T")
	public int field2154;

	@ObfuscatedName("nc.Y")
	public static int bitPos;

	@ObfuscatedName("nc.y")
	public boolean field2133;

	@ObfuscatedName("nc.A")
	public boolean field2135;

	@ObfuscatedName("nc.U")
	public static byte[] staticUnpacker;

	@ObfuscatedName("nc.W")
	public byte[] field2157;

	@ObfuscatedName("nc.B")
	public float[] field2136;

	@ObfuscatedName("nc.F")
	public static float[] workBuffer;

	@ObfuscatedName("nc.G")
	public static float[] field2141;

	@ObfuscatedName("nc.H")
	public static float[] field2142;

	@ObfuscatedName("nc.O")
	public static float[] field2149;

	@ObfuscatedName("nc.P")
	public static float[] field2150;

	@ObfuscatedName("nc.X")
	public static float[] field2158;

	@ObfuscatedName("nc.z")
	public static int[] field2134;

	@ObfuscatedName("nc.V")
	public static int[] mapping;

	@ObfuscatedName("nc.x")
	public static Residue[] residue_config;

	@ObfuscatedName("nc.K")
	public static Mapping[] mapping_config;

	@ObfuscatedName("nc.N")
	public static CodeBook[] codebooks;

	@ObfuscatedName("nc.Q")
	public static boolean[] blockflag;

	@ObfuscatedName("nc.b([B)V")
	public static void processHeaders(byte[] arg0) {
		setBitPos(arg0);
		blocksize0 = 0x1 << readBits(4);
		blocksize1 = 0x1 << readBits(4);
		workBuffer = new float[blocksize1];
		for (int var1 = 0; var1 < 2; var1++) {
			int var2 = var1 == 0 ? blocksize0 : blocksize1;
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
			int var13 = MathTool.bitsRequired(var5 - 1);
			for (int var14 = 0; var14 < var5; var14++) {
				var12[var14] = MathTool.method168(var14, var13);
			}
			if (var1 == 0) {
				field2131 = var6;
				field2141 = var8;
				field2150 = var10;
				field2134 = var12;
			} else {
				field2142 = var6;
				field2158 = var8;
				field2149 = var10;
				field2129 = var12;
			}
		}
		int var15 = readBits(8) + 1;
		codebooks = new CodeBook[var15];
		for (int var16 = 0; var16 < var15; var16++) {
			codebooks[var16] = new CodeBook();
		}
		int var17 = readBits(6) + 1;
		for (int var18 = 0; var18 < var17; var18++) {
			readBits(16);
		}
		int var19 = readBits(6) + 1;
		floor_config = new Floor[var19];
		for (int var20 = 0; var20 < var19; var20++) {
			floor_config[var20] = new Floor();
		}
		int var21 = readBits(6) + 1;
		residue_config = new Residue[var21];
		for (int var22 = 0; var22 < var21; var22++) {
			residue_config[var22] = new Residue();
		}
		int var23 = readBits(6) + 1;
		mapping_config = new Mapping[var23];
		for (int var24 = 0; var24 < var23; var24++) {
			mapping_config[var24] = new Mapping();
		}
		int var25 = readBits(6) + 1;
		blockflag = new boolean[var25];
		mapping = new int[var25];
		for (int var26 = 0; var26 < var25; var26++) {
			blockflag[var26] = readBit() != 0;
			readBits(16);
			readBits(16);
			mapping[var26] = readBits(8);
		}
	}

	@ObfuscatedName("nc.a()I")
	public static int readBit() {
		int var0 = staticUnpacker[bytePos] >> bitPos & 0x1;
		bitPos++;
		bytePos += bitPos >> 3;
		bitPos &= 0x7;
		return var0;
	}

	@ObfuscatedName("nc.a(Lea;)Z")
	public static boolean getHeaders(Js5 arg0) {
		if (!gotHeaders) {
			byte[] var1 = arg0.getFile(0, 0);
			if (var1 == null) {
				return false;
			}
			processHeaders(var1);
			gotHeaders = true;
		}
		return true;
	}

	@ObfuscatedName("nc.a([BI)V")
	public static void setBitPos(byte[] arg0) {
		staticUnpacker = arg0;
		bytePos = 0;
		bitPos = 0;
	}

	@ObfuscatedName("nc.a(Lea;II)Lnc;")
	public static JagVorbis load(Js5 arg0, int arg1, int arg2) {
		if (getHeaders(arg0)) {
			byte[] var3 = arg0.getFile(arg1, arg2);
			return var3 == null ? null : new JagVorbis(var3);
		} else {
			arg0.requestDownload(arg1, arg2);
			return null;
		}
	}

	@ObfuscatedName("nc.e(I)F")
	public static float float32Unpack(int arg0) {
		int var1 = arg0 & 0x1FFFFF;
		int var2 = arg0 & Integer.MIN_VALUE;
		int var3 = arg0 >> 21 & 0x3FF;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	@ObfuscatedName("nc.f(I)I")
	public static int readBits(int arg0) {
		int var1 = 0;
		int var2 = 0;
		while (arg0 >= 8 - bitPos) {
			int var3 = 8 - bitPos;
			int var4 = (0x1 << var3) - 1;
			var1 += (staticUnpacker[bytePos] >> bitPos & var4) << var2;
			bitPos = 0;
			bytePos++;
			var2 += var3;
			arg0 -= var3;
		}
		if (arg0 > 0) {
			int var5 = (0x1 << arg0) - 1;
			var1 += (staticUnpacker[bytePos] >> bitPos & var5) << var2;
			bitPos += arg0;
		}
		return var1;
	}

	public JagVorbis(byte[] arg0) {
		this.method728(arg0);
	}

	@ObfuscatedName("nc.a([B)V")
	public void method728(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		this.field2127 = var2.g4();
		this.field2138 = var2.g4();
		this.field2139 = var2.g4();
		this.field2144 = var2.g4();
		if (this.field2144 < 0) {
			this.field2144 = ~this.field2144;
			this.field2133 = true;
		}
		int var3 = var2.g4();
		this.field2126 = new byte[var3][];
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.g1();
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.gdata(var5, var7);
			this.field2126[var4] = var7;
		}
	}

	@ObfuscatedName("nc.d(I)[F")
	public float[] method730(int arg0) {
		setBitPos(this.field2126[arg0]);
		readBit();
		int var2 = readBits(MathTool.bitsRequired(mapping.length - 1));
		boolean var3 = blockflag[var2];
		int var4 = var3 ? blocksize1 : blocksize0;
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
			var8 = (var4 >> 2) - (blocksize0 >> 2);
			var9 = (var4 >> 2) + (blocksize0 >> 2);
			var10 = blocksize0 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}
		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (blocksize0 >> 2);
			var12 = var4 + (blocksize0 >> 2) - (var4 >> 2);
			var13 = blocksize0 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}
		Mapping var14 = mapping_config[mapping[var2]];
		int var15 = var14.mux;
		int var16 = var14.submap_floor[var15];
		boolean var17 = !floor_config[var16].packetDecode();
		for (int var18 = 0; var18 < var14.submaps; var18++) {
			Residue var19 = residue_config[var14.submap_residue[var18]];
			float[] var20 = workBuffer;
			var19.packetDecode(var20, var4 >> 1, var17);
		}
		if (!var17) {
			int var21 = var14.mux;
			int var22 = var14.submap_floor[var21];
			floor_config[var22].synthMul(workBuffer, var4 >> 1);
		}
		if (var17) {
			for (int var23 = var4 >> 1; var23 < var4; var23++) {
				workBuffer[var23] = 0.0F;
			}
		} else {
			int var24 = var4 >> 1;
			int var25 = var4 >> 2;
			int var26 = var4 >> 3;
			float[] var27 = workBuffer;
			for (int var28 = 0; var28 < var24; var28++) {
				var27[var28] *= 0.5F;
			}
			for (int var29 = var24; var29 < var4; var29++) {
				var27[var29] = -var27[var4 - var29 - 1];
			}
			float[] var30 = var3 ? field2142 : field2131;
			float[] var31 = var3 ? field2158 : field2141;
			float[] var32 = var3 ? field2149 : field2150;
			int[] var33 = var3 ? field2129 : field2134;
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
			int var46 = MathTool.bitsRequired(var4 - 1);
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
				workBuffer[var85] *= (float) Math.sin((double) var86 * 1.5707963267948966D * (double) var86);
			}
			for (int var87 = var11; var87 < var12; var87++) {
				float var88 = (float) Math.sin(((double) (var87 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				workBuffer[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
			}
		}
		float[] var89 = null;
		if (this.field2137 > 0) {
			int var90 = this.field2137 + var4 >> 2;
			var89 = new float[var90];
			if (!this.field2135) {
				for (int var91 = 0; var91 < this.field2130; var91++) {
					int var92 = (this.field2137 >> 1) + var91;
					var89[var91] += this.field2136[var92];
				}
			}
			if (!var17) {
				for (int var93 = var8; var93 < var4 >> 1; var93++) {
					int var94 = var89.length + var93 - (var4 >> 1);
					var89[var94] += workBuffer[var93];
				}
			}
		}
		float[] var95 = this.field2136;
		this.field2136 = workBuffer;
		workBuffer = var95;
		this.field2137 = var4;
		this.field2130 = var12 - (var4 >> 1);
		this.field2135 = var17;
		return var89;
	}

	@ObfuscatedName("nc.a([I)Lib;")
	public Wave toWave(int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.field2157 == null) {
			this.field2137 = 0;
			this.field2136 = new float[blocksize1];
			this.field2157 = new byte[this.field2138];
			this.field2152 = 0;
			this.field2154 = 0;
		}
		while (this.field2154 < this.field2126.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			float[] var2 = this.method730(this.field2154);
			if (var2 != null) {
				int var3 = this.field2152;
				int var4 = var2.length;
				if (var4 > this.field2138 - var3) {
					var4 = this.field2138 - var3;
				}
				for (int var5 = 0; var5 < var4; var5++) {
					int var6 = (int) (var2[var5] * 128.0F + 128.0F);
					if ((var6 & 0xFFFFFF00) != 0) {
						var6 = ~var6 >> 31;
					}
					this.field2157[var3++] = (byte) (var6 - 128);
				}
				if (arg0 != null) {
					arg0[0] -= var3 - this.field2152;
				}
				this.field2152 = var3;
			}
			this.field2154++;
		}
		this.field2136 = null;
		byte[] var7 = this.field2157;
		this.field2157 = null;
		return new Wave(this.field2127, var7, this.field2139, this.field2144, this.field2133);
	}
}
