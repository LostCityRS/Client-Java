package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.LocType;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

@ObfuscatedName("oa")
public final class BgSound extends Linkable {

	@ObfuscatedName("ja.A")
	public static LinkList field1466 = new LinkList();
	@ObfuscatedName("oa.r")
	public int field2244;

	@ObfuscatedName("oa.s")
	public int[] field2245;

	@ObfuscatedName("oa.u")
	public WaveStream field2247;

	@ObfuscatedName("oa.v")
	public int field2248;

	@ObfuscatedName("oa.w")
	public int field2249;

	@ObfuscatedName("oa.y")
	public int field2251;

	@ObfuscatedName("oa.C")
	public int field2255;

	@ObfuscatedName("oa.D")
	public int field2256;

	@ObfuscatedName("oa.H")
	public int field2260;

	@ObfuscatedName("oa.Q")
	public int field2269;

	@ObfuscatedName("oa.W")
	public int field2275;

	@ObfuscatedName("oa.X")
	public int field2276;

	@ObfuscatedName("oa.x")
	public LocType field2250;

	@ObfuscatedName("oa.S")
	public WaveStream field2271;

	@ObfuscatedName("s.b(Z)V")
	public static void recalculateMultilocs() {
		for (BgSound var0 = (BgSound) field1466.head(); var0 != null; var0 = (BgSound) field1466.next()) {
			if (var0.field2250 != null) {
				var0.method767();
			}
		}
	}

	@ObfuscatedName("ed.a(Z)V")
	public static void reset() {
		for (BgSound var0 = (BgSound) field1466.head(); var0 != null; var0 = (BgSound) field1466.next()) {
			if (var0.field2247 != null) {
				Client.soundMixer.method907(var0.field2247);
				var0.field2247 = null;
			}
			if (var0.field2271 != null) {
				Client.soundMixer.method907(var0.field2271);
				var0.field2271 = null;
			}
		}
		field1466.clear();
	}

	@ObfuscatedName("kf.a(IILhd;III)V")
	public static void method603(int arg0, LocType arg1, int arg2, int arg3, int arg4) {
		BgSound var5 = new BgSound();
		var5.field2276 = arg4 * 128;
		var5.field2275 = arg1.bgsound_sound;
		var5.field2256 = arg3 * 128;
		var5.field2249 = arg1.bgsound_maxdelay;
		var5.field2245 = arg1.bgsound_random;
		int var6 = arg1.width;
		var5.field2251 = arg2;
		var5.field2260 = arg1.bgsound_range * 128;
		var5.field2244 = arg1.bgsound_mindelay;
		int var7 = arg1.length;
		if (arg0 == 1 || arg0 == 3) {
			var7 = arg1.width;
			var6 = arg1.length;
		}
		var5.field2248 = (var7 + arg4) * 128;
		var5.field2255 = (var6 + arg3) * 128;
		if (arg1.multiloc != null) {
			var5.field2250 = arg1;
			var5.method767();
		}
		field1466.push(var5);
		if (var5.field2245 != null) {
			var5.field2269 = (int) ((double) (var5.field2249 - var5.field2244) * Math.random()) + var5.field2244;
		}
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) field1466.head(); var4 != null; var4 = (BgSound) field1466.next()) {
			if (var4.field2275 != -1 || var4.field2245 != null) {
				int var5 = 0;
				if (arg1 > var4.field2255) {
					var5 = arg1 - var4.field2255;
				} else if (arg1 < var4.field2256) {
					var5 = var4.field2256 - arg1;
				}
				if (var4.field2248 < arg0) {
					var5 += arg0 - var4.field2248;
				} else if (var4.field2276 > arg0) {
					var5 += var4.field2276 - arg0;
				}
				if (var4.field2260 < var5 - 64 || Client.ambientVolume == 0 || arg3 != var4.field2251) {
					if (var4.field2247 != null) {
						Client.soundMixer.method907(var4.field2247);
						var4.field2247 = null;
					}
					if (var4.field2271 != null) {
						Client.soundMixer.method907(var4.field2271);
						var4.field2271 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field2260 - var5) * Client.ambientVolume / var4.field2260;
					if (var4.field2247 != null) {
						var4.field2247.method690(var6);
					} else if (var4.field2275 >= 0) {
						JagFX var7 = JagFX.load(Client.jagFX, var4.field2275, 0);
						if (var7 != null) {
							Wave var8 = var7.toWave().decimate(Client.soundDecimator);
							WaveStream var9 = WaveStream.newRatePercent(var8, var6);
							var9.setLoopCount(-1);
							Client.soundMixer.playStream(var9);
							var4.field2247 = var9;
						}
					}
					if (var4.field2271 != null) {
						var4.field2271.method690(var6);
						if (!var4.field2271.isLinked()) {
							var4.field2271 = null;
						}
					} else if (var4.field2245 != null && (var4.field2269 -= arg2) <= 0) {
						int var10 = (int) (Math.random() * (double) var4.field2245.length);
						JagFX var11 = JagFX.load(Client.jagFX, var4.field2245[var10], 0);
						if (var11 != null) {
							Wave var12 = var11.toWave().decimate(Client.soundDecimator);
							WaveStream var13 = WaveStream.newRatePercent(var12, var6);
							var13.setLoopCount(0);
							Client.soundMixer.playStream(var13);
							var4.field2269 = (int) (Math.random() * (double) (var4.field2249 - var4.field2244)) + var4.field2244;
							var4.field2271 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("oa.d(I)V")
	public void method767() {
		int var1 = this.field2275;
		LocType var2 = this.field2250.getMultiLoc();
		if (var2 == null) {
			this.field2275 = -1;
			this.field2245 = null;
			this.field2244 = 0;
			this.field2260 = 0;
			this.field2249 = 0;
		} else {
			this.field2249 = var2.bgsound_maxdelay;
			this.field2244 = var2.bgsound_mindelay;
			this.field2275 = var2.bgsound_sound;
			this.field2245 = var2.bgsound_random;
			this.field2260 = var2.bgsound_range * 128;
		}
		if (this.field2275 != var1 && this.field2247 != null) {
			Client.soundMixer.method907(this.field2247);
			this.field2247 = null;
		}
	}
}
