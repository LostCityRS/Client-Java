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
	public static void method981() {
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
