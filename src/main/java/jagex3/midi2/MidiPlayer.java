package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.sound.EnvelopeSet;
import jagex3.sound.WaveCache;
import jagex3.sound.Patch;
import jagex3.config.StructType;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.ByteArrayNode;
import jagex3.js5.Js5;
import jagex3.sound.PcmPlayer;
import jagex3.sound.PcmStream;
import jagex3.sound.Wave;
import jagex3.sound.WaveStream;

@ObfuscatedName("pg")
public final class MidiPlayer extends PcmStream {

	@ObfuscatedName("pg.cb")
	public final int[] field3279 = new int[16];

	@ObfuscatedName("pg.fb")
	public final int[] field3282 = new int[16];

	@ObfuscatedName("pg.jb")
	public final int[] field3286 = new int[16];

	@ObfuscatedName("pg.lb")
	public final int[] field3288 = new int[16];

	@ObfuscatedName("pg.sb")
	public final MidiNote[][] field3295 = new MidiNote[16][128];

	@ObfuscatedName("pg.wb")
	public final MidiNote[][] field3299 = new MidiNote[16][128];

	@ObfuscatedName("pg.x")
	public final int[] field3248 = new int[16];

	@ObfuscatedName("pg.K")
	public final int[] field3261 = new int[16];

	@ObfuscatedName("pg.Z")
	public final int[] field3276 = new int[16];

	@ObfuscatedName("pg.V")
	public final int[] field3272 = new int[16];

	@ObfuscatedName("pg.F")
	public final int[] field3256 = new int[16];

	@ObfuscatedName("pg.Q")
	public final int[] field3267 = new int[16];

	@ObfuscatedName("pg.P")
	public final int field3266 = 1000000;

	@ObfuscatedName("pg.Cb")
	public final int[] field3305 = new int[16];

	@ObfuscatedName("pg.R")
	public final int[] field3268 = new int[16];

	@ObfuscatedName("pg.Hb")
	public final int[] field3310 = new int[16];

	@ObfuscatedName("pg.Gb")
	public final int[] field3309 = new int[16];

	@ObfuscatedName("pg.Jb")
	public final int[] field3312 = new int[16];

	@ObfuscatedName("pg.Kb")
	public int field3313 = 256;

	@ObfuscatedName("pg.C")
	public final MidiParser field3253 = new MidiParser();

	@ObfuscatedName("pg.Lb")
	public final MidiMixer field3314 = new MidiMixer(this);

	@ObfuscatedName("pg.B")
	public final HashTable field3252 = new HashTable(128);

	@ObfuscatedName("pg.Nb")
	public int field3316;

	@ObfuscatedName("pg.Qb")
	public int field3319;

	@ObfuscatedName("pg.Mb")
	public long field3315;

	@ObfuscatedName("pg.Ob")
	public long field3317;

	@ObfuscatedName("pg.Pb")
	public boolean field3318;

	public MidiPlayer() {
		this.method1198();
	}

	@ObfuscatedName("pg.d()Lef;")
	@Override
	public synchronized PcmStream method385() {
		return this.field3314;
	}

	@ObfuscatedName("pg.c(I)V")
	public synchronized void method1180() {
		for (Patch var1 = (Patch) this.field3252.method1047(); var1 != null; var1 = (Patch) this.field3252.method1048()) {
			var1.unlink();
		}
	}

	@ObfuscatedName("pg.b(II)V")
	public void method1181(int arg0) {
		if ((this.field3248[arg0] & 0x4) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.field3314.field1913.head(); var2 != null; var2 = (MidiNote) this.field3314.field1913.method1619()) {
			if (arg0 == var2.field2385) {
				var2.field2390 = 0;
			}
		}
	}

	@ObfuscatedName("pg.a(ILnj;Lic;ILnb;)Z")
	public synchronized boolean method1182(WaveCache arg0, MidiFile arg1, Js5 arg2) {
		arg1.method660();
		boolean var4 = true;
		int[] var5 = new int[] { 22050 };
		for (ByteArrayNode var6 = (ByteArrayNode) arg1.field1715.method1047(); var6 != null; var6 = (ByteArrayNode) arg1.field1715.method1048()) {
			int var7 = (int) var6.key;
			Patch var8 = (Patch) this.field3252.method1049((long) var7);
			if (var8 == null) {
				var8 = StructType.method1266(arg2, var7);
				if (var8 == null) {
					var4 = false;
					continue;
				}
				this.field3252.put((long) var7, var8);
			}
			if (!var8.method1400(var5, arg0, var6.field2956)) {
				var4 = false;
			}
		}
		if (var4) {
			arg1.method661();
		}
		return var4;
	}

	@ObfuscatedName("pg.a([IIIILlg;)Z")
	public boolean method1183(int[] arg0, int arg1, int arg2, MidiNote arg3) {
		arg3.field2367 = PcmPlayer.frequency / 100;
		if (arg3.field2386 >= 0 && (arg3.field2391 == null || arg3.field2391.method1120())) {
			arg3.method866();
			arg3.unlink();
			if (arg3.field2384 > 0 && arg3 == this.field3299[arg3.field2385][arg3.field2384]) {
				this.field3299[arg3.field2385][arg3.field2384] = null;
			}
			return true;
		}
		int var5 = arg3.field2387;
		boolean var6 = false;
		if (var5 > 0) {
			int var7 = var5 - (int) (Math.pow(2.0D, (double) this.field3268[arg3.field2385] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (var7 < 0) {
				var7 = 0;
			}
			arg3.field2387 = var7;
		}
		arg3.field2391.method1105(this.method1196(arg3));
		EnvelopeSet var8 = arg3.field2368;
		arg3.field2389++;
		double var9 = (double) ((arg3.field2387 * arg3.field2392 >> 12) + (arg3.field2381 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.field2379 += var8.field2209;
		if (var8.field2208 > 0) {
			if (var8.field2207 > 0) {
				arg3.field2373 += (int) (Math.pow(2.0D, var9 * (double) var8.field2207) * 128.0D + 0.5D);
			} else {
				arg3.field2373 += 128;
			}
			if (var8.field2208 * arg3.field2373 >= 819200) {
				var6 = true;
			}
		}
		if (var8.field2216 != null) {
			if (var8.field2215 <= 0) {
				arg3.field2382 += 128;
			} else {
				arg3.field2382 += (int) (Math.pow(2.0D, var9 * (double) var8.field2215) * 128.0D + 0.5D);
			}
			while (var8.field2216.length - 2 > arg3.field2378 && arg3.field2382 > (var8.field2216[arg3.field2378 + 2] & 0xFF) << 8) {
				arg3.field2378 += 2;
			}
			if (arg3.field2378 == var8.field2216.length - 2 && var8.field2216[arg3.field2378 + 1] == 0) {
				var6 = true;
			}
		}
		if (arg3.field2386 >= 0 && var8.field2205 != null && (this.field3248[arg3.field2385] & 0x1) == 0 && (arg3.field2384 < 0 || arg3 != this.field3299[arg3.field2385][arg3.field2384])) {
			if (var8.field2212 > 0) {
				arg3.field2386 += (int) (Math.pow(2.0D, var9 * (double) var8.field2212) * 128.0D + 0.5D);
			} else {
				arg3.field2386 += 128;
			}
			while (var8.field2205.length - 2 > arg3.field2376 && (var8.field2205[arg3.field2376 + 2] & 0xFF) << 8 < arg3.field2386) {
				arg3.field2376 += 2;
			}
			if (var8.field2205.length - 2 == arg3.field2376) {
				var6 = true;
			}
		}
		if (!var6) {
			arg3.field2391.method1092(arg3.field2367, this.method1191(arg3), this.method1189(arg3));
			return false;
		}
		arg3.field2391.method1086(arg3.field2367);
		if (arg0 == null) {
			arg3.field2391.method384(arg1);
		} else {
			arg3.field2391.method379(arg0, arg2, arg1);
		}
		if (arg3.field2391.method1121()) {
			this.field3314.field1919.method1506(arg3.field2391);
		}
		arg3.method866();
		if (arg3.field2386 >= 0) {
			arg3.unlink();
			if (arg3.field2384 > 0 && arg3 == this.field3299[arg3.field2385][arg3.field2384]) {
				this.field3299[arg3.field2385][arg3.field2384] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("pg.d(I)V")
	public void method1184() {
		int var1 = this.field3316;
		int var2 = this.field3319;
		long var3 = this.field3317;
		while (var1 == this.field3316) {
			while (this.field3253.field704[var2] == var1) {
				this.field3253.method261(var2);
				int var5 = this.field3253.method271(var2);
				if (var5 == 1) {
					this.field3253.method273();
					this.field3253.method259(var2);
					if (this.field3253.method260()) {
						if (!this.field3318 || var1 == 0) {
							this.method1198();
							this.field3253.method265();
							return;
						}
						this.field3253.method264(var3);
					}
					break;
				}
				if ((var5 & 0x80) != 0) {
					this.method1193(var5);
				}
				this.field3253.method274(var2);
				this.field3253.method259(var2);
			}
			var2 = this.field3253.method272();
			var1 = this.field3253.field704[var2];
			var3 = this.field3253.method262(var1);
		}
		this.field3319 = var2;
		this.field3316 = var1;
		this.field3317 = var3;
	}

	@ObfuscatedName("pg.a(ILic;Z)V")
	public synchronized void method1185(MidiFile arg0, boolean arg1) {
		this.method1208();
		this.field3253.method270(arg0.field1716);
		this.field3315 = 0;
		this.field3318 = arg1;
		int var3 = this.field3253.method266();
		for (int var4 = 0; var4 < var3; var4++) {
			this.field3253.method261(var4);
			this.field3253.method274(var4);
			this.field3253.method259(var4);
		}
		this.field3319 = this.field3253.method272();
		this.field3316 = this.field3253.field704[this.field3319];
		this.field3317 = this.field3253.method262(this.field3316);
	}

	@ObfuscatedName("pg.a()Lef;")
	@Override
	public synchronized PcmStream method380() {
		return null;
	}

	@ObfuscatedName("pg.a(BI)V")
	public synchronized void method1186(int arg0) {
		this.field3313 = arg0;
	}

	@ObfuscatedName("pg.e(I)V")
	public synchronized void method1187() {
		for (Patch var1 = (Patch) this.field3252.method1047(); var1 != null; var1 = (Patch) this.field3252.method1048()) {
			var1.method1404();
		}
	}

	@ObfuscatedName("pg.a(III)V")
	public void method1188(int arg0, int arg1) {
		this.field3261[arg0] = arg1;
	}

	@ObfuscatedName("pg.a(Llg;Z)I")
	public int method1189(MidiNote arg0) {
		int var2 = this.field3288[arg0.field2385];
		return var2 >= 8192 ? 16384 - ((16384 - var2) * (-arg0.field2393 + 128) + 32 >> 6) : var2 * arg0.field2393 + 32 >> 6;
	}

	@ObfuscatedName("pg.a(ZI)V")
	public void method1190(int arg0) {
		for (MidiNote var2 = (MidiNote) this.field3314.field1913.head(); var2 != null; var2 = (MidiNote) this.field3314.field1913.method1619()) {
			if ((arg0 < 0 || var2.field2385 == arg0) && var2.field2386 < 0) {
				this.field3295[var2.field2385][var2.field2381] = null;
				var2.field2386 = 0;
			}
		}
	}

	@ObfuscatedName("pg.b(I)V")
	@Override
	public synchronized void method384(int arg0) {
		if (this.field3253.method263()) {
			int var2 = this.field3253.field706 * this.field3266 / PcmPlayer.frequency;
			do {
				long var3 = (long) var2 * (long) arg0 + this.field3315;
				if (this.field3317 - var3 >= 0L) {
					this.field3315 = var3;
					break;
				}
				int var5 = (int) (((long) var2 + this.field3317 - this.field3315 - 1L) / (long) var2);
				this.field3315 += (long) var2 * (long) var5;
				arg0 -= var5;
				this.field3314.method384(var5);
				this.method1184();
			} while (this.field3253.method263());
		}
		this.field3314.method384(arg0);
	}

	@ObfuscatedName("pg.a(Llg;I)I")
	public int method1191(MidiNote arg0) {
		EnvelopeSet var2 = arg0.field2368;
		int var3 = this.field3267[arg0.field2385] * this.field3309[arg0.field2385] + 4096 >> 13;
		int var4 = var3 * var3 + 16384 >> 15;
		int var5 = var4 * arg0.field2383 + 16384 >> 15;
		int var6 = this.field3313 * var5 + 128 >> 8;
		if (var2.field2208 > 0) {
			var6 = (int) ((double) var6 * Math.pow(0.5D, (double) var2.field2208 * (double) arg0.field2373 * 1.953125E-5D) + 0.5D);
		}
		if (var2.field2216 != null) {
			int var7 = arg0.field2382;
			int var8 = var2.field2216[arg0.field2378 + 1];
			if (arg0.field2378 < var2.field2216.length - 2) {
				int var9 = (var2.field2216[arg0.field2378] & 0xFF) << 8;
				int var10 = (var2.field2216[arg0.field2378 + 2] & 0xFF) << 8;
				var8 += (var2.field2216[arg0.field2378 + 3] - var8) * (var7 - var9) / (var10 - var9);
			}
			var6 = var8 * var6 + 32 >> 6;
		}
		if (arg0.field2386 > 0 && var2.field2205 != null) {
			int var11 = var2.field2205[arg0.field2376 + 1];
			int var12 = arg0.field2386;
			if (arg0.field2376 < var2.field2205.length - 2) {
				int var13 = (var2.field2205[arg0.field2376 + 2] & 0xFF) << 8;
				int var14 = (var2.field2205[arg0.field2376] & 0xFF) << 8;
				var11 += (var2.field2205[arg0.field2376 + 3] - var11) * (var12 - var14) / (var13 - var14);
			}
			var6 = var11 * var6 + 32 >> 6;
		}
		return var6;
	}

	@ObfuscatedName("pg.c(II)V")
	public void method1193(int arg0) {
		int var2 = arg0 & 0xF0;
		if (var2 == 128) {
			int var3 = arg0 >> 16 & 0x7F;
			int var4 = arg0 & 0xF;
			int var5 = arg0 >> 8 & 0x7F;
			this.method1201(var3, var5, var4);
		} else if (var2 == 144) {
			int var6 = arg0 >> 8 & 0x7F;
			int var7 = arg0 & 0xF;
			int var8 = arg0 >> 16 & 0x7F;
			if (var8 > 0) {
				this.method1207(var8, var7, var6);
			} else {
				this.method1201(64, var6, var7);
			}
		} else if (var2 == 160) {
			int var9 = arg0 & 0xF;
			int var10 = arg0 >> 16 & 0x7F;
			int var11 = arg0 >> 8 & 0x7F;
			this.method1206(var10, var11, var9);
		} else if (var2 == 176) {
			int var12 = arg0 >> 8 & 0x7F;
			int var13 = arg0 & 0xF;
			int var14 = arg0 >> 16 & 0x7F;
			if (var12 == 0) {
				this.field3310[var13] = (this.field3310[var13] & 0xFFE03FFF) + (var14 << 14);
			}
			if (var12 == 32) {
				this.field3310[var13] = (this.field3310[var13] & 0xFFFFC07F) + (var14 << 7);
			}
			if (var12 == 1) {
				this.field3256[var13] = (var14 << 7) + (this.field3256[var13] & 0xFFFFC07F);
			}
			if (var12 == 33) {
				this.field3256[var13] = var14 + (this.field3256[var13] & 0xFFFFFF80);
			}
			if (var12 == 5) {
				this.field3268[var13] = (var14 << 7) + (this.field3268[var13] & 0xFFFFC07F);
			}
			if (var12 == 37) {
				this.field3268[var13] = (this.field3268[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 7) {
				this.field3309[var13] = (var14 << 7) + (this.field3309[var13] & 0xFFFFC07F);
			}
			if (var12 == 39) {
				this.field3309[var13] = (this.field3309[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 10) {
				this.field3288[var13] = (var14 << 7) + (this.field3288[var13] & 0xFFFFC07F);
			}
			if (var12 == 42) {
				this.field3288[var13] = var14 + (this.field3288[var13] & 0xFFFFFF80);
			}
			if (var12 == 11) {
				this.field3267[var13] = (var14 << 7) + (this.field3267[var13] & 0xFFFFC07F);
			}
			if (var12 == 43) {
				this.field3267[var13] = (this.field3267[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 64) {
				if (var14 < 64) {
					this.field3248[var13] &= 0xFFFFFFFE;
				} else {
					this.field3248[var13] |= 0x1;
				}
			}
			if (var12 == 65) {
				if (var14 >= 64) {
					this.field3248[var13] |= 0x2;
				} else {
					this.method1204(var13);
					this.field3248[var13] &= 0xFFFFFFFD;
				}
			}
			if (var12 == 99) {
				this.field3312[var13] = (this.field3312[var13] & 0x7F) + (var14 << 7);
			}
			if (var12 == 98) {
				this.field3312[var13] = var14 + (this.field3312[var13] & 0x3F80);
			}
			if (var12 == 101) {
				this.field3312[var13] = (var14 << 7) + (this.field3312[var13] & 0x7F) + 16384;
			}
			if (var12 == 100) {
				this.field3312[var13] = (this.field3312[var13] & 0x3F80) + var14 + 16384;
			}
			if (var12 == 120) {
				this.method1203(var13);
			}
			if (var12 == 121) {
				this.method1202(var13);
			}
			if (var12 == 123) {
				this.method1190(var13);
			}
			if (var12 == 6) {
				int var15 = this.field3312[var13];
				if (var15 == 16384) {
					this.field3276[var13] = (var14 << 7) + (this.field3276[var13] & 0xFFFFC07F);
				}
			}
			if (var12 == 38) {
				int var16 = this.field3312[var13];
				if (var16 == 16384) {
					this.field3276[var13] = var14 + (this.field3276[var13] & 0xFFFFFF80);
				}
			}
			if (var12 == 16) {
				this.field3286[var13] = (this.field3286[var13] & 0xFFFFC07F) + (var14 << 7);
			}
			if (var12 == 48) {
				this.field3286[var13] = (this.field3286[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 81) {
				if (var14 >= 64) {
					this.field3248[var13] |= 0x4;
				} else {
					this.method1181(var13);
					this.field3248[var13] &= 0xFFFFFFFB;
				}
			}
			if (var12 == 17) {
				this.method1210((this.field3279[var13] & 0xFFFFC07F) + (var14 << 7), var13);
			}
			if (var12 == 49) {
				this.method1210((this.field3279[var13] & 0xFFFFFF80) + var14, var13);
			}
		} else if (var2 == 192) {
			int var17 = arg0 >> 8 & 0x7F;
			int var18 = arg0 & 0xF;
			this.method1195(var18, this.field3310[var18] + var17);
		} else if (var2 == 208) {
			int var19 = arg0 & 0xF;
			int var20 = arg0 >> 8 & 0x7F;
			this.method1205(var20, var19);
		} else if (var2 == 224) {
			int var21 = arg0 & 0xF;
			int var22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F018F) >> 9);
			this.method1188(var21, var22);
		} else {
			int var23 = arg0 & 0xFF;
			if (var23 == 255) {
				this.method1198();
			}
		}
	}

	@ObfuscatedName("pg.b(III)V")
	public void method1194() {
		this.field3272[9] = 128;
		this.field3310[9] = 128;
		this.method1195(9, 128);
	}

	@ObfuscatedName("pg.c(III)V")
	public void method1195(int arg0, int arg1) {
		if (arg1 != this.field3305[arg0]) {
			this.field3305[arg0] = arg1;
			for (int var3 = 0; var3 < 128; var3++) {
				this.field3299[arg0][var3] = null;
			}
		}
	}

	@ObfuscatedName("pg.b(Llg;I)I")
	public int method1196(MidiNote arg0) {
		int var2 = arg0.field2394 + (arg0.field2392 * arg0.field2387 >> 12);
		int var3 = var2 + (this.field3276[arg0.field2385] * (this.field3261[arg0.field2385] - 8192) >> 12);
		EnvelopeSet var4 = arg0.field2368;
		if (var4.field2209 > 0 && (var4.field2211 > 0 || this.field3256[arg0.field2385] > 0)) {
			int var5 = var4.field2211 << 2;
			int var6 = var4.field2210 << 1;
			if (var6 > arg0.field2389) {
				var5 = var5 * arg0.field2389 / var6;
			}
			int var7 = var5 + (this.field3256[arg0.field2385] >> 7);
			double var8 = Math.sin((double) (arg0.field2379 & 0x1FF) * 0.01227184630308513D);
			var3 += (int) ((double) var7 * var8);
		}
		int var10 = (int) ((double) (arg0.field2380.field4028 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) PcmPlayer.frequency + 0.5D);
		return var10 >= 1 ? var10 : 1;
	}

	@ObfuscatedName("pg.c(B)I")
	public int method1197() {
		return this.field3313;
	}

	@ObfuscatedName("pg.f(I)V")
	public void method1198() {
		this.method1203(-1);
		this.method1202(-1);
		for (int var1 = 0; var1 < 16; var1++) {
			this.field3305[var1] = this.field3272[var1];
		}
		for (int var2 = 0; var2 < 16; var2++) {
			this.field3310[var2] = this.field3272[var2] & 0xFFFFFF80;
		}
	}

	@ObfuscatedName("pg.g(I)Z")
	public synchronized boolean method1199() {
		return this.field3253.method263();
	}

	@ObfuscatedName("pg.a(BLlg;)Z")
	public boolean method1200(MidiNote arg0) {
		if (arg0.field2391 != null) {
			return false;
		}
		if (arg0.field2386 >= 0) {
			arg0.unlink();
			if (arg0.field2384 > 0 && arg0 == this.field3299[arg0.field2385][arg0.field2384]) {
				this.field3299[arg0.field2385][arg0.field2384] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("pg.a(IIII)V")
	public void method1201(int arg0, int arg1, int arg2) {
		MidiNote var4 = this.field3295[arg2][arg1];
		if (var4 == null) {
			return;
		}
		this.field3295[arg2][arg1] = null;
		if ((this.field3248[arg2] & 0x2) == 0) {
			var4.field2386 = 0;
			return;
		}
		for (MidiNote var5 = (MidiNote) this.field3314.field1913.head(); var5 != null; var5 = (MidiNote) this.field3314.field1913.method1619()) {
			if (var5.field2385 == var4.field2385 && var5.field2386 < 0 && var4 != var5) {
				var4.field2386 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("pg.d(II)V")
	public void method1202(int arg0) {
		if (arg0 < 0) {
			for (int var2 = 0; var2 < 16; var2++) {
				this.method1202(var2);
			}
			return;
		}
		this.field3309[arg0] = 12800;
		this.field3288[arg0] = 8192;
		this.field3267[arg0] = 16383;
		this.field3261[arg0] = 8192;
		this.field3256[arg0] = 0;
		this.field3268[arg0] = 8192;
		this.method1204(arg0);
		this.method1181(arg0);
		this.field3248[arg0] = 0;
		this.field3312[arg0] = 32767;
		this.field3276[arg0] = 256;
		this.field3286[arg0] = 0;
		this.method1210(8192, arg0);
	}

	@ObfuscatedName("pg.b(ZI)V")
	public void method1203(int arg0) {
		for (MidiNote var2 = (MidiNote) this.field3314.field1913.head(); var2 != null; var2 = (MidiNote) this.field3314.field1913.method1619()) {
			if (arg0 < 0 || var2.field2385 == arg0) {
				if (var2.field2391 != null) {
					var2.field2391.method1086(PcmPlayer.frequency / 100);
					if (var2.field2391.method1121()) {
						this.field3314.field1919.method1506(var2.field2391);
					}
					var2.method866();
				}
				if (var2.field2386 < 0) {
					this.field3295[var2.field2385][var2.field2381] = null;
				}
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("pg.e(II)V")
	public void method1204(int arg0) {
		if ((this.field3248[arg0] & 0x2) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.field3314.field1913.head(); var2 != null; var2 = (MidiNote) this.field3314.field1913.method1619()) {
			if (var2.field2385 == arg0 && this.field3295[arg0][var2.field2381] == null && var2.field2386 < 0) {
				var2.field2386 = 0;
			}
		}
	}

	@ObfuscatedName("pg.a([III)V")
	@Override
	public synchronized void method379(int[] arg0, int arg1, int arg2) {
		if (this.field3253.method263()) {
			int var4 = this.field3253.field706 * this.field3266 / PcmPlayer.frequency;
			do {
				long var5 = this.field3315 + (long) arg2 * (long) var4;
				if (this.field3317 - var5 >= 0L) {
					this.field3315 = var5;
					break;
				}
				int var7 = (int) ((this.field3317 + (long) var4 - this.field3315 - 1L) / (long) var4);
				this.field3315 += (long) var4 * (long) var7;
				this.field3314.method379(arg0, arg1, var7);
				arg1 += var7;
				arg2 -= var7;
				this.method1184();
			} while (this.field3253.method263());
		}
		this.field3314.method379(arg0, arg1, arg2);
	}

	@ObfuscatedName("pg.d(III)V")
	public void method1205(int arg0, int arg1) {
	}

	@ObfuscatedName("pg.a(IIIZ)V")
	public void method1206(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("pg.b(IIII)V")
	public void method1207(int arg0, int arg1, int arg2) {
		this.method1201(64, arg2, arg1);
		if ((this.field3248[arg1] & 0x2) != 0) {
			for (MidiNote var4 = (MidiNote) this.field3314.field1913.method1612(); var4 != null; var4 = (MidiNote) this.field3314.field1913.method1617()) {
				if (var4.field2385 == arg1 && var4.field2386 < 0) {
					this.field3295[arg1][var4.field2381] = null;
					this.field3295[arg1][arg2] = var4;
					int var5 = var4.field2394 + (var4.field2387 * var4.field2392 >> 12);
					var4.field2387 = 4096;
					var4.field2394 += arg2 - var4.field2381 << 8;
					var4.field2381 = arg2;
					var4.field2392 = var5 - var4.field2394;
					return;
				}
			}
		}
		Patch var6 = (Patch) this.field3252.method1049((long) this.field3305[arg1]);
		if (var6 == null) {
			return;
		}
		Wave var7 = var6.field3892[arg2];
		if (var7 == null) {
			return;
		}
		MidiNote var8 = new MidiNote();
		var8.field2375 = var6;
		var8.field2385 = arg1;
		var8.field2380 = var7;
		var8.field2368 = var6.field3895[arg2];
		var8.field2384 = var6.field3890[arg2];
		var8.field2381 = arg2;
		var8.field2383 = arg0 * arg0 * var6.field3896 * var6.field3894[arg2] + 1024 >> 11;
		var8.field2393 = var6.field3897[arg2] & 0xFF;
		var8.field2394 = (arg2 << 8) - (var6.field3889[arg2] & 0x7FFF);
		var8.field2386 = -1;
		var8.field2373 = 0;
		var8.field2376 = 0;
		var8.field2382 = 0;
		var8.field2378 = 0;
		if (this.field3286[arg1] == 0) {
			var8.field2391 = WaveStream.method1098(var7, this.method1196(var8), this.method1191(var8), this.method1189(var8));
		} else {
			var8.field2391 = WaveStream.method1098(var7, this.method1196(var8), 0, this.method1189(var8));
			this.method1211(var8, var6.field3889[arg2] < 0);
		}
		if (var6.field3889[arg2] < 0) {
			var8.field2391.method1119(-1);
		}
		if (var8.field2384 >= 0) {
			MidiNote var9 = this.field3299[arg1][var8.field2384];
			if (var9 != null && var9.field2386 < 0) {
				this.field3295[arg1][var9.field2381] = null;
				var9.field2386 = 0;
			}
			this.field3299[arg1][var8.field2384] = var8;
		}
		this.field3314.field1913.push(var8);
		this.field3295[arg1][arg2] = var8;
	}

	@ObfuscatedName("pg.b(Z)V")
	public synchronized void method1208() {
		this.field3253.method265();
		this.method1198();
	}

	@ObfuscatedName("pg.e(III)V")
	public synchronized void setChannelDefaultPatch() {
		this.method1194();
	}

	@ObfuscatedName("pg.a(IIZ)V")
	public void method1210(int arg0, int arg1) {
		this.field3279[arg1] = arg0;
		this.field3282[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@ObfuscatedName("pg.a(Llg;ZI)V")
	public void method1211(MidiNote arg0, boolean arg1) {
		int var3 = arg0.field2380.field4031.length;
		int var6;
		if (arg1 && arg0.field2380.field4030) {
			int var4 = var3 + var3 - arg0.field2380.field4032;
			int var5 = var3 << 8;
			var6 = (int) ((long) var4 * (long) this.field3286[arg0.field2385] >> 6);
			if (var5 <= var6) {
				arg0.field2391.method1111();
				var6 = var5 + var5 - var6 - 1;
			}
		} else {
			var6 = (int) ((long) this.field3286[arg0.field2385] * (long) var3 >> 6);
		}
		arg0.field2391.method1108(var6);
	}

	@ObfuscatedName("pg.c()I")
	@Override
	public synchronized int method383() {
		return 0;
	}
}
