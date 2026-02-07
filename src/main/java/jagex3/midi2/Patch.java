package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.sound.Wave;
import jagex3.sound.WaveCache;

@ObfuscatedName("kd")
public final class Patch extends Linkable {

	@ObfuscatedName("kd.r")
	public Wave[] noteSound;

	@ObfuscatedName("kd.u")
	public int field1714;

	@ObfuscatedName("kd.A")
	public byte[] field1720;

	@ObfuscatedName("kd.P")
	public EnvelopeSet[] field1734;

	@ObfuscatedName("kd.N")
	public int[] noteWaveId;

	@ObfuscatedName("kd.K")
	public byte[] field1730;

	@ObfuscatedName("kd.B")
	public byte[] field1721;

	@ObfuscatedName("kd.C")
	public short[] field1722;

	public Patch() {
	}

	public Patch(byte[] arg0) {
		this.field1720 = new byte[128];
		this.field1734 = new EnvelopeSet[128];
		this.noteWaveId = new int[128];
		this.noteSound = new Wave[128];
		int var2 = 0;
		this.field1730 = new byte[128];
		this.field1721 = new byte[128];
		this.field1722 = new short[128];
		Packet var3 = new Packet(arg0);
		while (var3.data[var3.pos + var2] != 0) {
			var2++;
		}
		byte[] var4 = new byte[var2];
		for (int var5 = 0; var5 < var2; var5++) {
			var4[var5] = var3.g1b();
		}
		var3.pos++;
		var2++;
		int var6 = var3.pos;
		int var7 = 0;
		var3.pos += var2;
		while (var3.data[var3.pos + var7] != 0) {
			var7++;
		}
		byte[] var8 = new byte[var7];
		for (int var9 = 0; var9 < var7; var9++) {
			var8[var9] = var3.g1b();
		}
		var7++;
		int var10 = 0;
		var3.pos++;
		int var11 = var3.pos;
		var3.pos += var7;
		while (var3.data[var10 + var3.pos] != 0) {
			var10++;
		}
		byte[] var12 = new byte[var10];
		for (int var13 = 0; var13 < var10; var13++) {
			var12[var13] = var3.g1b();
		}
		var3.pos++;
		var10++;
		byte[] var14 = new byte[var10];
		int var15;
		if (var10 <= 1) {
			var15 = var10;
		} else {
			var15 = 2;
			int var16 = 1;
			var14[1] = 1;
			for (int var17 = 2; var17 < var10; var17++) {
				int var18 = var3.g1();
				if (var18 == 0) {
					var16 = var15++;
				} else {
					if (var16 >= var18) {
						var18--;
					}
					var16 = var18;
				}
				var14[var17] = (byte) var16;
			}
		}
		EnvelopeSet[] var19 = new EnvelopeSet[var15];
		for (int var20 = 0; var20 < var19.length; var20++) {
			EnvelopeSet var21 = var19[var20] = new EnvelopeSet();
			int var22 = var3.g1();
			if (var22 > 0) {
				var21.field1689 = new byte[var22 * 2];
			}
			int var23 = var3.g1();
			if (var23 > 0) {
				var21.field1703 = new byte[var23 * 2 + 2];
				var21.field1703[1] = 64;
			}
		}
		int var24 = var3.g1();
		byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
		int var26 = 0;
		int var27 = var3.g1();
		byte[] var28 = var27 <= 0 ? null : new byte[var27 * 2];
		while (var3.data[var26 + var3.pos] != 0) {
			var26++;
		}
		byte[] var29 = new byte[var26];
		for (int var30 = 0; var30 < var26; var30++) {
			var29[var30] = var3.g1b();
		}
		var26++;
		var3.pos++;
		int var31 = 0;
		for (int var32 = 0; var32 < 128; var32++) {
			var31 += var3.g1();
			this.field1722[var32] = (short) var31;
		}
		int var33 = 0;
		for (int var34 = 0; var34 < 128; var34++) {
			var33 += var3.g1();
			this.field1722[var34] = (short) (this.field1722[var34] + (var33 << 8));
		}
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		for (int var38 = 0; var38 < 128; var38++) {
			if (var35 == 0) {
				if (var37 < var29.length) {
					var35 = var29[var37++];
				} else {
					var35 = -1;
				}
				var36 = var3.method510();
			}
			var35--;
			this.field1722[var38] = (short) (this.field1722[var38] + ((var36 - 1 & 0x2) << 14));
			this.noteWaveId[var38] = var36;
		}
		int var39 = 0;
		int var40 = 0;
		int var41 = 0;
		for (int var42 = 0; var42 < 128; var42++) {
			if (this.noteWaveId[var42] != 0) {
				if (var41 == 0) {
					if (var4.length > var39) {
						var41 = var4[var39++];
					} else {
						var41 = -1;
					}
					var40 = var3.data[var6++] - 1;
				}
				var41--;
				this.field1730[var42] = (byte) var40;
			}
		}
		int var43 = 0;
		int var44 = 0;
		int var45 = 0;
		for (int var46 = 0; var46 < 128; var46++) {
			if (this.noteWaveId[var46] != 0) {
				if (var43 == 0) {
					var45 = var3.data[var11++] + 16 << 2;
					if (var8.length <= var44) {
						var43 = -1;
					} else {
						var43 = var8[var44++];
					}
				}
				this.field1720[var46] = (byte) var45;
				var43--;
			}
		}
		int var47 = 0;
		EnvelopeSet var48 = null;
		int var49 = 0;
		for (int var50 = 0; var50 < 128; var50++) {
			if (this.noteWaveId[var50] != 0) {
				if (var49 == 0) {
					var48 = var19[var14[var47]];
					if (var12.length <= var47) {
						var49 = -1;
					} else {
						var49 = var12[var47++];
					}
				}
				this.field1734[var50] = var48;
				var49--;
			}
		}
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < 128; var54++) {
			if (var52 == 0) {
				if (var51 >= var29.length) {
					var52 = -1;
				} else {
					var52 = var29[var51++];
				}
				if (this.noteWaveId[var54] > 0) {
					var53 = var3.g1() + 1;
				}
			}
			var52--;
			this.field1721[var54] = (byte) var53;
		}
		this.field1714 = var3.g1() + 1;
		for (int var55 = 0; var55 < var15; var55++) {
			EnvelopeSet var56 = var19[var55];
			if (var56.field1689 != null) {
				for (int var57 = 1; var57 < var56.field1689.length; var57 += 2) {
					var56.field1689[var57] = var3.g1b();
				}
			}
			if (var56.field1703 != null) {
				for (int var58 = 3; var58 < var56.field1703.length - 2; var58 += 2) {
					var56.field1703[var58] = var3.g1b();
				}
			}
		}
		if (var25 != null) {
			for (int var59 = 1; var59 < var25.length; var59 += 2) {
				var25[var59] = var3.g1b();
			}
		}
		if (var28 != null) {
			for (int var60 = 1; var60 < var28.length; var60 += 2) {
				var28[var60] = var3.g1b();
			}
		}
		for (int var61 = 0; var61 < var15; var61++) {
			EnvelopeSet var62 = var19[var61];
			if (var62.field1703 != null) {
				int var63 = 0;
				for (int var64 = 2; var64 < var62.field1703.length; var64 += 2) {
					var63 -= -var3.g1() - 1;
					var62.field1703[var64] = (byte) var63;
				}
			}
		}
		for (int var65 = 0; var65 < var15; var65++) {
			EnvelopeSet var66 = var19[var65];
			if (var66.field1689 != null) {
				int var67 = 0;
				for (int var68 = 2; var68 < var66.field1689.length; var68 += 2) {
					var67 = var3.g1() + var67 + 1;
					var66.field1689[var68] = (byte) var67;
				}
			}
		}
		if (var25 != null) {
			int var69 = var3.g1();
			var25[0] = (byte) var69;
			for (int var70 = 2; var70 < var25.length; var70 += 2) {
				var69 = var69 + var3.g1() + 1;
				var25[var70] = (byte) var69;
			}
			byte var71 = var25[0];
			byte var72 = var25[1];
			for (int var73 = 0; var73 < var71; var73++) {
				this.field1721[var73] = (byte) (var72 * this.field1721[var73] + 32 >> 6);
			}
			int var74 = 2;
			while (var25.length > var74) {
				byte var75 = var25[var74];
				byte var76 = var25[var74 + 1];
				int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
				var74 += 2;
				for (int var78 = var71; var78 < var75; var78++) {
					int var79 = method901(var77, var75 - var71);
					this.field1721[var78] = (byte) (this.field1721[var78] * var79 + 32 >> 6);
					var77 += var76 - var72;
				}
				var71 = var75;
				var72 = var76;
			}
			for (int var80 = var71; var80 < 128; var80++) {
				this.field1721[var80] = (byte) (this.field1721[var80] * var72 + 32 >> 6);
			}
		}
		if (var28 != null) {
			int var81 = var3.g1();
			var28[0] = (byte) var81;
			for (int var82 = 2; var82 < var28.length; var82 += 2) {
				var81 = var3.g1() + var81 + 1;
				var28[var82] = (byte) var81;
			}
			byte var83 = var28[0];
			int var84 = var28[1] << 1;
			for (int var85 = 0; var85 < var83; var85++) {
				int var86 = var84 + (this.field1720[var85] & 0xFF);
				if (var86 < 0) {
					var86 = 0;
				}
				if (var86 > 128) {
					var86 = 128;
				}
				this.field1720[var85] = (byte) var86;
			}
			int var87 = 2;
			while (var87 < var28.length) {
				byte var88 = var28[var87];
				int var89 = var28[var87 + 1] << 1;
				var87 += 2;
				int var90 = var84 * (var88 - var83) + (var88 - var83) / 2;
				for (int var91 = var83; var91 < var88; var91++) {
					int var92 = method901(var90, var88 - var83);
					var90 += var89 - var84;
					int var93 = (this.field1720[var91] & 0xFF) + var92;
					if (var93 < 0) {
						var93 = 0;
					}
					if (var93 > 128) {
						var93 = 128;
					}
					this.field1720[var91] = (byte) var93;
				}
				var83 = var88;
				var84 = var89;
			}
			for (int var94 = var83; var94 < 128; var94++) {
				int var95 = var84 + (this.field1720[var94] & 0xFF);
				if (var95 < 0) {
					var95 = 0;
				}
				if (var95 > 128) {
					var95 = 128;
				}
				this.field1720[var94] = (byte) var95;
			}
		}
		for (int var96 = 0; var96 < var15; var96++) {
			var19[var96].field1702 = var3.g1();
		}
		for (int var97 = 0; var97 < var15; var97++) {
			EnvelopeSet var98 = var19[var97];
			if (var98.field1689 != null) {
				var98.field1691 = var3.g1();
			}
			if (var98.field1703 != null) {
				var98.field1707 = var3.g1();
			}
			if (var98.field1702 > 0) {
				var98.field1698 = var3.g1();
			}
		}
		for (int var99 = 0; var99 < var15; var99++) {
			var19[var99].field1697 = var3.g1();
		}
		for (int var100 = 0; var100 < var15; var100++) {
			EnvelopeSet var101 = var19[var100];
			if (var101.field1697 > 0) {
				var101.field1710 = var3.g1();
			}
		}
		for (int var102 = 0; var102 < var15; var102++) {
			EnvelopeSet var103 = var19[var102];
			if (var103.field1710 > 0) {
				var103.field1690 = var3.g1();
			}
		}
	}

	@ObfuscatedName("ia.a(ILea;I)Lkd;")
	public static Patch method448(int arg0, Js5 arg1) {
		byte[] var2 = arg1.getFile(arg0);
		return var2 == null ? null : new Patch(var2);
	}

	@ObfuscatedName("qd.a(IIB)I")
	public static int method901(int arg0, int arg1) {
		int var2 = arg0 >>> 31;
		return (arg0 + var2) / arg1 - var2;
	}

	@ObfuscatedName("kd.a(Z)V")
	public void method592() {
		this.noteWaveId = null;
	}

	@ObfuscatedName("kd.a(ILjf;[B[I)Z")
	public boolean method595(WaveCache arg0, byte[] arg1, int[] arg2) {
		boolean var4 = true;
		Wave var5 = null;
		int var6 = 0;
		for (int var7 = 0; var7 < 128; var7++) {
			if (arg1 == null || arg1[var7] != 0) {
				int var8 = this.noteWaveId[var7];
				if (var8 != 0) {
					if (var6 != var8) {
						var6 = var8--;
						if ((var8 & 0x1) == 0) {
							var5 = arg0.method566(var8 >> 2, arg2);
						} else {
							var5 = arg0.method567(arg2, var8 >> 2);
						}
						if (var5 == null) {
							var4 = false;
						}
					}
					if (var5 != null) {
						this.noteSound[var7] = var5;
						this.noteWaveId[var7] = 0;
					}
				}
			}
		}
		return var4;
	}
}
