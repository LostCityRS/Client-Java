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
	public int minZ;

	@ObfuscatedName("be.ib")
	public int soundId;

	@ObfuscatedName("be.lb")
	public int range;

	@ObfuscatedName("be.mb")
	public WaveStream continuousStream;

	@ObfuscatedName("be.nb")
	public int maxDelay;

	@ObfuscatedName("be.ob")
	public int minX;

	@ObfuscatedName("be.qb")
	public int[] random;

	@ObfuscatedName("be.sb")
	public int maxX;

	@ObfuscatedName("be.vb")
	public WaveStream randomStream;

	@ObfuscatedName("be.wb")
	public LocType multiloc;

	@ObfuscatedName("be.xb")
	public int minDelay;

	@ObfuscatedName("be.yb")
	public int maxZ;

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
		var5.maxDelay = arg4.bgsound_maxdelay;
		var5.random = arg4.bgsound_random;
		var5.minDelay = arg4.bgsound_mindelay;
		int var6 = arg4.width;
		int var7 = arg4.length;
		var5.level = arg1;
		var5.minZ = arg3 * 128;
		if (arg2 == 1 || arg2 == 3) {
			var6 = arg4.length;
			var7 = arg4.width;
		}
		var5.minX = arg0 * 128;
		var5.maxX = (arg0 + var7) * 128;
		var5.maxZ = (arg3 + var6) * 128;
		var5.soundId = arg4.bgsound_sound;
		if (arg4.multiloc != null) {
			var5.multiloc = arg4;
			var5.recalcSound();
		}
		soundlist.push(var5);
		if (var5.random != null) {
			var5.randomSoundTimer = (int) ((double) (var5.maxDelay - var5.minDelay) * Math.random()) + var5.minDelay;
		}
	}

	@ObfuscatedName("r.a(IIIII)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) soundlist.head(); var4 != null; var4 = (BgSound) soundlist.next()) {
			if (var4.soundId != -1 || var4.random != null) {
				int var5 = 0;
				if (arg0 > var4.maxZ) {
					var5 = arg0 - var4.maxZ;
				} else if (arg0 < var4.minZ) {
					var5 = var4.minZ - arg0;
				}
				if (arg3 > var4.maxX) {
					var5 += arg3 - var4.maxX;
				} else if (arg3 < var4.minX) {
					var5 += var4.minX - arg3;
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
						var4.continuousStream.setVolume(var6);
					} else if (var4.soundId >= 0) {
						JagFX var7 = JagFX.load(Client.jagFX, var4.soundId);
						if (var7 != null) {
							Wave var8 = var7.toWave().decimate(Client.soundDecimator);
							WaveStream var9 = WaveStream.newRatePercent(var8, var6);
							var9.setLoopCount(-1);
							Client.soundMixer.playStream(var9);
							var4.continuousStream = var9;
						}
					}
					if (var4.randomStream != null) {
						var4.randomStream.setVolume(var6);
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
							var4.randomSoundTimer = var4.minDelay + (int) ((double) (var4.maxDelay - var4.minDelay) * Math.random());
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
		int var1 = this.soundId;
		LocType var2 = this.multiloc.getMultiLoc();
		if (var2 == null) {
			this.range = 0;
			this.minDelay = 0;
			this.maxDelay = 0;
			this.random = null;
			this.soundId = -1;
		} else {
			this.range = var2.bgsound_range * 128;
			this.minDelay = var2.bgsound_mindelay;
			this.maxDelay = var2.bgsound_maxdelay;
			this.soundId = var2.bgsound_sound;
			this.random = var2.bgsound_random;
		}
		if (this.soundId != var1 && this.continuousStream != null) {
			Client.soundMixer.stopStream(this.continuousStream);
			this.continuousStream = null;
		}
	}
}
