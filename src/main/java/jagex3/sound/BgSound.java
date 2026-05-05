package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.LocType;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

@ObfuscatedName("na")
public final class BgSound extends Linkable {

	@ObfuscatedName("fj.j")
	public static final LinkList soundlist = new LinkList();
	@ObfuscatedName("na.t")
	public WaveStream randomStream;

	@ObfuscatedName("na.v")
	public int randomSoundTimer;

	@ObfuscatedName("na.w")
	public int sound;

	@ObfuscatedName("na.x")
	public int maxX;

	@ObfuscatedName("na.z")
	public int minX;

	@ObfuscatedName("na.F")
	public int range;

	@ObfuscatedName("na.G")
	public int maxZ;

	@ObfuscatedName("na.H")
	public int maxdelay;

	@ObfuscatedName("na.N")
	public int mindelay;

	@ObfuscatedName("na.P")
	public int level;

	@ObfuscatedName("na.X")
	public int minZ;

	@ObfuscatedName("na.B")
	public LocType multiloc;

	@ObfuscatedName("na.M")
	public WaveStream continuousStream;

	@ObfuscatedName("na.C")
	public int[] random;

	@ObfuscatedName("bc.a(IIIIB)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) soundlist.head(); var4 != null; var4 = (BgSound) soundlist.next()) {
			if (var4.sound != -1 || var4.random != null) {
				int var5 = 0;
				if (var4.maxZ < arg2) {
					var5 = arg2 - var4.maxZ;
				} else if (arg2 < var4.minZ) {
					var5 = var4.minZ - arg2;
				}
				if (arg0 > var4.maxX) {
					var5 += arg0 - var4.maxX;
				} else if (arg0 < var4.minX) {
					var5 += var4.minX - arg0;
				}
				if (var4.range < var5 - 64 || Client.ambientVolume == 0 || var4.level != arg3) {
					if (var4.continuousStream != null) {
						Client.mixer.stopStream(var4.continuousStream);
						var4.continuousStream = null;
					}
					if (var4.randomStream != null) {
						Client.mixer.stopStream(var4.randomStream);
						var4.randomStream = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = Client.ambientVolume * (var4.range - var5) / var4.range;
					if (var4.continuousStream != null) {
						var4.continuousStream.applyVolume(var6);
					} else if (var4.sound >= 0) {
						JagFX var7 = JagFX.load(Client.jagFX, var4.sound, 0);
						if (var7 != null) {
							Wave var8 = var7.toWave().decimate(Client.decimator);
							WaveStream var9 = WaveStream.newRatePercent(var8, var6);
							var9.setLoopCount(-1);
							Client.mixer.playStream(var9);
							var4.continuousStream = var9;
						}
					}
					if (var4.randomStream != null) {
						var4.randomStream.applyVolume(var6);
						if (!var4.randomStream.isLinked()) {
							var4.randomStream = null;
						}
					} else if (var4.random != null && (var4.randomSoundTimer -= arg1) <= 0) {
						int var10 = (int) ((double) var4.random.length * Math.random());
						JagFX var11 = JagFX.load(Client.jagFX, var4.random[var10], 0);
						if (var11 != null) {
							Wave var12 = var11.toWave().decimate(Client.decimator);
							WaveStream var13 = WaveStream.newRatePercent(var12, var6);
							var13.setLoopCount(0);
							Client.mixer.playStream(var13);
							var4.randomSoundTimer = (int) ((double) (var4.maxdelay - var4.mindelay) * Math.random()) + var4.mindelay;
							var4.randomStream = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("be.a(IIIZILnf;)V")
	public static void addSound(int arg0, int arg1, int arg2, int arg3, LocType arg4) {
		BgSound var5 = new BgSound();
		var5.range = arg4.bgsound_range * 128;
		var5.random = arg4.bgsound_random;
		var5.level = arg1;
		var5.sound = arg4.bgsound_sound;
		int var6 = arg4.width;
		var5.minX = arg3 * 128;
		var5.minZ = arg0 * 128;
		var5.maxdelay = arg4.bgsound_maxdelay;
		var5.mindelay = arg4.bgsound_mindelay;
		int var7 = arg4.length;
		if (arg2 == 1 || arg2 == 3) {
			var7 = arg4.width;
			var6 = arg4.length;
		}
		var5.maxZ = (var6 + arg0) * 128;
		var5.maxX = (arg3 + var7) * 128;
		if (arg4.multiloc != null) {
			var5.multiloc = arg4;
			var5.recalcSound();
		}
		soundlist.push(var5);
		if (var5.random != null) {
			var5.randomSoundTimer = var5.mindelay + (int) ((double) (var5.maxdelay - var5.mindelay) * Math.random());
		}
	}

	@ObfuscatedName("dj.f(I)V")
	public static void reset() {
		for (BgSound var0 = (BgSound) soundlist.head(); var0 != null; var0 = (BgSound) soundlist.next()) {
			if (var0.continuousStream != null) {
				Client.mixer.stopStream(var0.continuousStream);
				var0.continuousStream = null;
			}
			if (var0.randomStream != null) {
				Client.mixer.stopStream(var0.randomStream);
				var0.randomStream = null;
			}
		}
		soundlist.clear();
	}

	@ObfuscatedName("ag.a(B)V")
	public static void recalculateMultilocs() {
		for (BgSound var0 = (BgSound) soundlist.head(); var0 != null; var0 = (BgSound) soundlist.next()) {
			if (var0.multiloc != null) {
				var0.recalcSound();
			}
		}
	}

	@ObfuscatedName("na.b(I)V")
	public void recalcSound() {
		int var1 = this.sound;
		LocType var2 = this.multiloc.getMultiLoc();
		if (var2 == null) {
			this.random = null;
			this.mindelay = 0;
			this.sound = -1;
			this.range = 0;
			this.maxdelay = 0;
		} else {
			this.range = var2.bgsound_range * 128;
			this.random = var2.bgsound_random;
			this.mindelay = var2.bgsound_mindelay;
			this.sound = var2.bgsound_sound;
			this.maxdelay = var2.bgsound_maxdelay;
		}
		if (var1 != this.sound && this.continuousStream != null) {
			Client.mixer.stopStream(this.continuousStream);
			this.continuousStream = null;
		}
	}
}
