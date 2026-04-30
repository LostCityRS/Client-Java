package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.LocType;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

@ObfuscatedName("be")
public final class BgSound extends Linkable {

	@ObfuscatedName("cc.zb")
	public static LinkList soundlist = new LinkList();
	@ObfuscatedName("be.eb")
	public int level;

	@ObfuscatedName("be.fb")
	public int field417;

	@ObfuscatedName("be.ib")
	public int field420;

	@ObfuscatedName("be.lb")
	public int range;

	@ObfuscatedName("be.mb")
	public WaveStream continuousStream;

	@ObfuscatedName("be.nb")
	public int field425;

	@ObfuscatedName("be.ob")
	public int field426;

	@ObfuscatedName("be.qb")
	public int[] random;

	@ObfuscatedName("be.sb")
	public int field430;

	@ObfuscatedName("be.vb")
	public WaveStream randomStream;

	@ObfuscatedName("be.wb")
	public LocType multiloc;

	@ObfuscatedName("be.xb")
	public int field435;

	@ObfuscatedName("be.yb")
	public int field436;

	@ObfuscatedName("be.zb")
	public int randomSoundTimer;

	@ObfuscatedName("n.c(I)V")
	public static void reset() {
		for (BgSound var0 = (BgSound) soundlist.head(); var0 != null; var0 = (BgSound) soundlist.next()) {
			if (var0.continuousStream != null) {
				Client.soundMixer.stopStream(var0.continuousStream);
				var0.continuousStream = null;
			}
			if (var0.randomStream != null) {
				Client.soundMixer.stopStream(var0.randomStream);
				var0.randomStream = null;
			}
		}
		soundlist.clear();
	}

	@ObfuscatedName("n.a(IZIIILia;)V")
	public static void addSound(int arg0, int arg1, int arg2, int arg3, LocType arg4) {
		BgSound var5 = new BgSound();
		var5.range = arg4.bgsound_range * 128;
		var5.field425 = arg4.bgsound_maxdelay;
		var5.random = arg4.bgsound_random;
		var5.field435 = arg4.bgsound_mindelay;
		int var6 = arg4.width;
		int var7 = arg4.length;
		var5.level = arg1;
		var5.field417 = arg3 * 128;
		if (arg2 == 1 || arg2 == 3) {
			var6 = arg4.length;
			var7 = arg4.width;
		}
		var5.field426 = arg0 * 128;
		var5.field430 = (arg0 + var7) * 128;
		var5.field436 = (arg3 + var6) * 128;
		var5.field420 = arg4.bgsound_sound;
		if (arg4.multiloc != null) {
			var5.multiloc = arg4;
			var5.recalcSound();
		}
		soundlist.push(var5);
		if (var5.random != null) {
			var5.randomSoundTimer = (int) ((double) (var5.field425 - var5.field435) * Math.random()) + var5.field435;
		}
	}

	@ObfuscatedName("r.a(IIIII)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) soundlist.head(); var4 != null; var4 = (BgSound) soundlist.next()) {
			if (var4.field420 != -1 || var4.random != null) {
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
				if (var4.range < var5 - 64 || Client.ambientVolume == 0 || var4.level != arg1) {
					if (var4.continuousStream != null) {
						Client.soundMixer.stopStream(var4.continuousStream);
						var4.continuousStream = null;
					}
					if (var4.randomStream != null) {
						Client.soundMixer.stopStream(var4.randomStream);
						var4.randomStream = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.range - var5) * Client.ambientVolume / var4.range;
					if (var4.continuousStream != null) {
						var4.continuousStream.method582(var6);
					} else if (var4.field420 >= 0) {
						JagFX var7 = JagFX.load(Client.jagFX, var4.field420);
						if (var7 != null) {
							Wave var8 = var7.toWave().decimate(Client.soundDecimator);
							WaveStream var9 = WaveStream.newRatePercent(var8, var6);
							var9.setLoopCount(-1);
							Client.soundMixer.playStream(var9);
							var4.continuousStream = var9;
						}
					}
					if (var4.randomStream != null) {
						var4.randomStream.method582(var6);
						if (!var4.randomStream.isRamping()) {
							var4.randomStream = null;
						}
					} else if (var4.random != null && (var4.randomSoundTimer -= arg2) <= 0) {
						int var10 = (int) ((double) var4.random.length * Math.random());
						JagFX var11 = JagFX.load(Client.jagFX, var4.random[var10]);
						if (var11 != null) {
							Wave var12 = var11.toWave().decimate(Client.soundDecimator);
							WaveStream var13 = WaveStream.newRatePercent(var12, var6);
							var13.setLoopCount(0);
							Client.soundMixer.playStream(var13);
							var4.randomSoundTimer = var4.field435 + (int) ((double) (var4.field425 - var4.field435) * Math.random());
							var4.randomStream = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void recalculateMultilocs() {
		for (BgSound var0 = (BgSound) soundlist.head(); var0 != null; var0 = (BgSound) soundlist.next()) {
			if (var0.multiloc != null) {
				var0.recalcSound();
			}
		}
	}

	@ObfuscatedName("be.c(I)V")
	public void recalcSound() {
		int var1 = this.field420;
		LocType var2 = this.multiloc.getMultiLoc();
		if (var2 == null) {
			this.range = 0;
			this.field435 = 0;
			this.field425 = 0;
			this.random = null;
			this.field420 = -1;
		} else {
			this.range = var2.bgsound_range * 128;
			this.field435 = var2.bgsound_mindelay;
			this.field425 = var2.bgsound_maxdelay;
			this.field420 = var2.bgsound_sound;
			this.random = var2.bgsound_random;
		}
		if (this.field420 != var1 && this.continuousStream != null) {
			Client.soundMixer.stopStream(this.continuousStream);
			this.continuousStream = null;
		}
	}
}
