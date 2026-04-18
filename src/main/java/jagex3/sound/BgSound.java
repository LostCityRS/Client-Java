package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.LocType;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

@ObfuscatedName("be")
public final class BgSound extends Linkable {

	@ObfuscatedName("cc.zb")
	public static LinkList field515 = new LinkList();
	@ObfuscatedName("be.eb")
	public int field416;

	@ObfuscatedName("be.fb")
	public int field417;

	@ObfuscatedName("be.ib")
	public int field420;

	@ObfuscatedName("be.lb")
	public int field423;

	@ObfuscatedName("be.mb")
	public WaveStream field424;

	@ObfuscatedName("be.nb")
	public int field425;

	@ObfuscatedName("be.ob")
	public int field426;

	@ObfuscatedName("be.qb")
	public int[] field428;

	@ObfuscatedName("be.sb")
	public int field430;

	@ObfuscatedName("be.vb")
	public WaveStream field433;

	@ObfuscatedName("be.wb")
	public LocType field434;

	@ObfuscatedName("be.xb")
	public int field435;

	@ObfuscatedName("be.yb")
	public int field436;

	@ObfuscatedName("be.zb")
	public int field437;

	@ObfuscatedName("n.c(I)V")
	public static void reset() {
		for (BgSound var0 = (BgSound) field515.head(); var0 != null; var0 = (BgSound) field515.next()) {
			if (var0.field424 != null) {
				Client.soundMixer.method135(var0.field424);
				var0.field424 = null;
			}
			if (var0.field433 != null) {
				Client.soundMixer.method135(var0.field433);
				var0.field433 = null;
			}
		}
		field515.clear();
	}

	@ObfuscatedName("n.a(IZIIILia;)V")
	public static void method719(int arg0, int arg1, int arg2, int arg3, LocType arg4) {
		BgSound var5 = new BgSound();
		var5.field423 = arg4.field1285 * 128;
		var5.field425 = arg4.field1325;
		var5.field428 = arg4.field1306;
		var5.field435 = arg4.field1282;
		int var6 = arg4.field1286;
		int var7 = arg4.field1298;
		var5.field416 = arg1;
		var5.field417 = arg3 * 128;
		if (arg2 == 1 || arg2 == 3) {
			var6 = arg4.field1298;
			var7 = arg4.field1286;
		}
		var5.field426 = arg0 * 128;
		var5.field430 = (arg0 + var7) * 128;
		var5.field436 = (arg3 + var6) * 128;
		var5.field420 = arg4.field1296;
		if (arg4.multiloc != null) {
			var5.field434 = arg4;
			var5.method247();
		}
		field515.push(var5);
		if (var5.field428 != null) {
			var5.field437 = (int) ((double) (var5.field425 - var5.field435) * Math.random()) + var5.field435;
		}
	}

	@ObfuscatedName("r.a(IIIII)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) field515.head(); var4 != null; var4 = (BgSound) field515.next()) {
			if (var4.field420 != -1 || var4.field428 != null) {
				int var5 = 0;
				if (arg0 > var4.field436) {
					var5 = arg0 - var4.field436;
				} else if (arg0 < var4.field417) {
					var5 = var4.field417 - arg0;
				}
				if (arg3 > var4.field430) {
					var5 += arg3 - var4.field430;
				} else if (arg3 < var4.field426) {
					var5 += var4.field426 - arg3;
				}
				if (var4.field423 < var5 - 64 || Client.ambientVolume == 0 || var4.field416 != arg1) {
					if (var4.field424 != null) {
						Client.soundMixer.method135(var4.field424);
						var4.field424 = null;
					}
					if (var4.field433 != null) {
						Client.soundMixer.method135(var4.field433);
						var4.field433 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field423 - var5) * Client.ambientVolume / var4.field423;
					if (var4.field424 != null) {
						var4.field424.method582(var6);
					} else if (var4.field420 >= 0) {
						JagFX var7 = JagFX.load(Client.jagFX, var4.field420);
						if (var7 != null) {
							Wave var8 = var7.toWave().decimate(Client.soundDecimator);
							WaveStream var9 = WaveStream.newRatePercent(var8, var6);
							var9.setLoopCount(-1);
							Client.soundMixer.playStream(var9);
							var4.field424 = var9;
						}
					}
					if (var4.field433 != null) {
						var4.field433.method582(var6);
						if (!var4.field433.method589()) {
							var4.field433 = null;
						}
					} else if (var4.field428 != null && (var4.field437 -= arg2) <= 0) {
						int var10 = (int) ((double) var4.field428.length * Math.random());
						JagFX var11 = JagFX.load(Client.jagFX, var4.field428[var10]);
						if (var11 != null) {
							Wave var12 = var11.toWave().decimate(Client.soundDecimator);
							WaveStream var13 = WaveStream.newRatePercent(var12, var6);
							var13.setLoopCount(0);
							Client.soundMixer.playStream(var13);
							var4.field437 = var4.field435 + (int) ((double) (var4.field425 - var4.field435) * Math.random());
							var4.field433 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void method1040() {
		for (BgSound var0 = (BgSound) field515.head(); var0 != null; var0 = (BgSound) field515.next()) {
			if (var0.field434 != null) {
				var0.method247();
			}
		}
	}

	@ObfuscatedName("be.c(I)V")
	public void method247() {
		int var1 = this.field420;
		LocType var2 = this.field434.method516();
		if (var2 == null) {
			this.field423 = 0;
			this.field435 = 0;
			this.field425 = 0;
			this.field428 = null;
			this.field420 = -1;
		} else {
			this.field423 = var2.field1285 * 128;
			this.field435 = var2.field1282;
			this.field425 = var2.field1325;
			this.field420 = var2.field1296;
			this.field428 = var2.field1306;
		}
		if (this.field420 != var1 && this.field424 != null) {
			Client.soundMixer.method135(this.field424);
			this.field424 = null;
		}
	}
}
