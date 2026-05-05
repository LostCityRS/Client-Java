package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;
import jagex3.sound.Wave;
import jagex3.sound.WaveCache;

@ObfuscatedName("sh")
public final class Patch extends Linkable {

	@ObfuscatedName("sh.D")
	public short[] notePitch;

	@ObfuscatedName("sh.E")
	public byte[] noteSecondaryNote;

	@ObfuscatedName("sh.J")
	public EnvelopeSet[] noteEnvelope;

	@ObfuscatedName("sh.I")
	public byte[] noteVolume;

	@ObfuscatedName("sh.G")
	public Wave[] noteSound;

	@ObfuscatedName("sh.B")
	public int[] noteWaveId;

	@ObfuscatedName("sh.L")
	public byte[] notePan;

	@ObfuscatedName("sh.K")
	public int volume;

	public Patch() {
	}

	public Patch(byte[] arg0) {
		this.notePitch = new short[128];
		this.noteSecondaryNote = new byte[128];
		this.noteEnvelope = new EnvelopeSet[128];
		this.noteVolume = new byte[128];
		this.noteSound = new Wave[128];
		this.noteWaveId = new int[128];
		this.notePan = new byte[128];
		Packet var2 = new Packet(arg0);
		int var3;
		for (var3 = 0; var2.data[var3 + var2.pos] != 0; var3++) {
		}
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			var4[var5] = var2.g1b();
		}
		var2.pos++;
		var3++;
		int var6 = var2.pos;
		var2.pos += var3;
		int var7;
		for (var7 = 0; var2.data[var7 + var2.pos] != 0; var7++) {
		}
		byte[] var8 = new byte[var7];
		for (int var9 = 0; var9 < var7; var9++) {
			var8[var9] = var2.g1b();
		}
		var2.pos++;
		var7++;
		int var10 = var2.pos;
		var2.pos += var7;
		int var11;
		for (var11 = 0; var2.data[var11 + var2.pos] != 0; var11++) {
		}
		byte[] var12 = new byte[var11];
		for (int var13 = 0; var13 < var11; var13++) {
			var12[var13] = var2.g1b();
		}
		var2.pos++;
		var11++;
		byte[] var14 = new byte[var11];
		int var15;
		if (var11 > 1) {
			var15 = 2;
			var14[1] = 1;
			int var16 = 1;
			for (int var17 = 2; var17 < var11; var17++) {
				int var18 = var2.g1();
				if (var18 == 0) {
					var16 = var15++;
				} else {
					if (var18 <= var16) {
						var18--;
					}
					var16 = var18;
				}
				var14[var17] = (byte) var16;
			}
		} else {
			var15 = var11;
		}
		EnvelopeSet[] var19 = new EnvelopeSet[var15];
		for (int var20 = 0; var20 < var19.length; var20++) {
			EnvelopeSet var21 = var19[var20] = new EnvelopeSet();
			int var22 = var2.g1();
			if (var22 > 0) {
				var21.attackVolume = new byte[var22 * 2];
			}
			int var23 = var2.g1();
			if (var23 > 0) {
				var21.releaseVolume = new byte[var23 * 2 + 2];
				var21.releaseVolume[1] = 64;
			}
		}
		int var24 = var2.g1();
		byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
		int var26 = var2.g1();
		byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
		int var28;
		for (var28 = 0; var2.data[var28 + var2.pos] != 0; var28++) {
		}
		byte[] var29 = new byte[var28];
		for (int var30 = 0; var30 < var28; var30++) {
			var29[var30] = var2.g1b();
		}
		var2.pos++;
		var28++;
		int var31 = 0;
		for (int var32 = 0; var32 < 128; var32++) {
			var31 += var2.g1();
			this.notePitch[var32] = (short) var31;
		}
		int var33 = 0;
		for (int var34 = 0; var34 < 128; var34++) {
			var33 += var2.g1();
			this.notePitch[var34] = (short) (this.notePitch[var34] + (var33 << 8));
		}
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;
		for (int var38 = 0; var38 < 128; var38++) {
			if (var35 == 0) {
				if (var29.length <= var37) {
					var35 = -1;
				} else {
					var35 = var29[var37++];
				}
				var36 = var2.gMidiVarLen();
			}
			this.notePitch[var38] = (short) (this.notePitch[var38] + ((var36 - 1 & 0x2) << 14));
			this.noteWaveId[var38] = var36;
			var35--;
		}
		int var39 = 0;
		int var40 = 0;
		int var41 = 0;
		for (int var42 = 0; var42 < 128; var42++) {
			if (this.noteWaveId[var42] != 0) {
				if (var39 == 0) {
					var41 = var2.data[var6++] - 1;
					if (var4.length <= var40) {
						var39 = -1;
					} else {
						var39 = var4[var40++];
					}
				}
				var39--;
				this.noteSecondaryNote[var42] = (byte) var41;
			}
		}
		int var43 = 0;
		int var44 = 0;
		int var45 = 0;
		for (int var46 = 0; var46 < 128; var46++) {
			if (this.noteWaveId[var46] != 0) {
				if (var43 == 0) {
					if (var44 >= var8.length) {
						var43 = -1;
					} else {
						var43 = var8[var44++];
					}
					var45 = var2.data[var10++] + 16 << 2;
				}
				this.notePan[var46] = (byte) var45;
				var43--;
			}
		}
		int var47 = 0;
		int var48 = 0;
		EnvelopeSet var49 = null;
		for (int var50 = 0; var50 < 128; var50++) {
			if (this.noteWaveId[var50] != 0) {
				if (var48 == 0) {
					var49 = var19[var14[var47]];
					if (var47 >= var12.length) {
						var48 = -1;
					} else {
						var48 = var12[var47++];
					}
				}
				this.noteEnvelope[var50] = var49;
				var48--;
			}
		}
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < 128; var54++) {
			if (var53 == 0) {
				if (var51 < var29.length) {
					var53 = var29[var51++];
				} else {
					var53 = -1;
				}
				if (this.noteWaveId[var54] > 0) {
					var52 = var2.g1() + 1;
				}
			}
			var53--;
			this.noteVolume[var54] = (byte) var52;
		}
		this.volume = var2.g1() + 1;
		for (int var55 = 0; var55 < var15; var55++) {
			EnvelopeSet var56 = var19[var55];
			if (var56.attackVolume != null) {
				for (int var57 = 1; var57 < var56.attackVolume.length; var57 += 2) {
					var56.attackVolume[var57] = var2.g1b();
				}
			}
			if (var56.releaseVolume != null) {
				for (int var58 = 3; var58 < var56.releaseVolume.length - 2; var58 += 2) {
					var56.releaseVolume[var58] = var2.g1b();
				}
			}
		}
		if (var25 != null) {
			for (int var59 = 1; var59 < var25.length; var59 += 2) {
				var25[var59] = var2.g1b();
			}
		}
		if (var27 != null) {
			for (int var60 = 1; var60 < var27.length; var60 += 2) {
				var27[var60] = var2.g1b();
			}
		}
		for (int var61 = 0; var61 < var15; var61++) {
			EnvelopeSet var62 = var19[var61];
			if (var62.releaseVolume != null) {
				int var63 = 0;
				for (int var64 = 2; var64 < var62.releaseVolume.length; var64 += 2) {
					var63 = var63 + var2.g1() + 1;
					var62.releaseVolume[var64] = (byte) var63;
				}
			}
		}
		for (int var65 = 0; var65 < var15; var65++) {
			EnvelopeSet var66 = var19[var65];
			if (var66.attackVolume != null) {
				int var67 = 0;
				for (int var68 = 2; var68 < var66.attackVolume.length; var68 += 2) {
					var67 = var67 + var2.g1() + 1;
					var66.attackVolume[var68] = (byte) var67;
				}
			}
		}
		if (var25 != null) {
			int var69 = var2.g1();
			var25[0] = (byte) var69;
			for (int var70 = 2; var70 < var25.length; var70 += 2) {
				var69 = var69 + var2.g1() + 1;
				var25[var70] = (byte) var69;
			}
			byte var71 = var25[0];
			byte var72 = var25[1];
			for (int var73 = 0; var73 < var71; var73++) {
				this.noteVolume[var73] = (byte) (this.noteVolume[var73] * var72 + 32 >> 6);
			}
			int var74 = 2;
			while (var25.length > var74) {
				byte var75 = var25[var74 + 1];
				byte var76 = var25[var74];
				var74 += 2;
				int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
				for (int var78 = var71; var78 < var76; var78++) {
					int var79 = method1284(var76 - var71, var77);
					var77 += var75 - var72;
					this.noteVolume[var78] = (byte) (this.noteVolume[var78] * var79 + 32 >> 6);
				}
				var71 = var76;
				var72 = var75;
			}
			for (int var80 = var71; var80 < 128; var80++) {
				this.noteVolume[var80] = (byte) (var72 * this.noteVolume[var80] + 32 >> 6);
			}
		}
		if (var27 != null) {
			int var81 = var2.g1();
			var27[0] = (byte) var81;
			for (int var82 = 2; var82 < var27.length; var82 += 2) {
				var81 = var81 + var2.g1() + 1;
				var27[var82] = (byte) var81;
			}
			byte var83 = var27[0];
			int var84 = var27[1] << 1;
			for (int var85 = 0; var85 < var83; var85++) {
				int var86 = var84 + (this.notePan[var85] & 0xFF);
				if (var86 < 0) {
					var86 = 0;
				}
				if (var86 > 128) {
					var86 = 128;
				}
				this.notePan[var85] = (byte) var86;
			}
			int var87 = 2;
			while (var27.length > var87) {
				byte var88 = var27[var87];
				int var89 = var27[var87 + 1] << 1;
				var87 += 2;
				int var90 = (var88 - var83) / 2 + (var88 - var83) * var84;
				for (int var91 = var83; var91 < var88; var91++) {
					int var92 = method1284(var88 - var83, var90);
					int var93 = (this.notePan[var91] & 0xFF) + var92;
					if (var93 < 0) {
						var93 = 0;
					}
					var90 += var89 - var84;
					if (var93 > 128) {
						var93 = 128;
					}
					this.notePan[var91] = (byte) var93;
				}
				var83 = var88;
				var84 = var89;
			}
			for (int var94 = var83; var94 < 128; var94++) {
				int var95 = var84 + (this.notePan[var94] & 0xFF);
				if (var95 < 0) {
					var95 = 0;
				}
				if (var95 > 128) {
					var95 = 128;
				}
				this.notePan[var94] = (byte) var95;
			}
		}
		for (int var96 = 0; var96 < var15; var96++) {
			var19[var96].decayVolume = var2.g1();
		}
		for (int var97 = 0; var97 < var15; var97++) {
			EnvelopeSet var98 = var19[var97];
			if (var98.attackVolume != null) {
				var98.attackSpeed = var2.g1();
			}
			if (var98.releaseVolume != null) {
				var98.releaseSpeed = var2.g1();
			}
			if (var98.decayVolume > 0) {
				var98.decaySpeed = var2.g1();
			}
		}
		for (int var99 = 0; var99 < var15; var99++) {
			var19[var99].vibratoFrequency = var2.g1();
		}
		for (int var100 = 0; var100 < var15; var100++) {
			EnvelopeSet var101 = var19[var100];
			if (var101.vibratoFrequency > 0) {
				var101.vibratoAmplitude = var2.g1();
			}
		}
		for (int var102 = 0; var102 < var15; var102++) {
			EnvelopeSet var103 = var19[var102];
			if (var103.vibratoAmplitude > 0) {
				var103.vibratoRampTime = var2.g1();
			}
		}
	}

    @ObfuscatedName("qf.a(ZII)I")
    public static int method1284(int arg0, int arg1) {
        int var2 = arg1 >>> 31;
        return (var2 + arg1) / arg0 - var2;
    }

    @ObfuscatedName("sh.a([IILnj;[B)Z")
	public boolean loadWaves(int[] arg0, WaveCache arg1, byte[] arg2) {
		boolean var4 = true;
		int var5 = 0;
		Wave var6 = null;
		for (int var7 = 0; var7 < 128; var7++) {
			if (arg2 == null || arg2[var7] != 0) {
				int var8 = this.noteWaveId[var7];
				if (var8 != 0) {
					if (var5 != var8) {
						var5 = var8--;
						if ((var8 & 0x1) == 0) {
							var6 = arg1.getJagFx(var8 >> 2, arg0);
						} else {
							var6 = arg1.getJagVorbis(arg0, var8 >> 2);
						}
						if (var6 == null) {
							var4 = false;
						}
					}
					if (var6 != null) {
						this.noteSound[var7] = var6;
						this.noteWaveId[var7] = 0;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("sh.d(B)V")
	public void freeWaveIds() {
		this.noteWaveId = null;
	}
}
