package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("tb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("tb.cc")
	public final int field2905;

	@ObfuscatedName("tb.Tb")
	public int field2896 = 0;

	@ObfuscatedName("tb.Qb")
	public boolean field2893 = false;

	@ObfuscatedName("tb.Mb")
	public int field2889 = 0;

	@ObfuscatedName("tb.Ob")
	public final int field2891;

	@ObfuscatedName("tb.Xb")
	public final int field2900;

	@ObfuscatedName("tb.Jb")
	public final int field2886;

	@ObfuscatedName("tb.Kb")
	public final int field2887;

	@ObfuscatedName("tb.Sb")
	public final int field2895;

	@ObfuscatedName("tb.Vb")
	public SeqType field2898;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field2891 = arg3;
		this.field2900 = arg2;
		this.field2886 = arg5 + arg6;
		this.field2887 = arg4;
		this.field2905 = arg0;
		this.field2895 = arg1;
		int var8 = SpotType.list(this.field2905).anim;
		if (var8 == -1) {
			this.field2893 = true;
		} else {
			this.field2893 = false;
			this.field2898 = SeqType.list(var8);
		}
	}

	@ObfuscatedName("tb.f(I)Lpa;")
	@Override
	public Model method41() {
		SpotType var1 = SpotType.list(this.field2905);
		Model var2;
		if (this.field2893) {
			var2 = var1.getTempModel2(-1);
		} else {
			var2 = var1.getTempModel2(this.field2896);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("tb.b(II)V")
	public void method958(int arg0) {
		if (this.field2893) {
			return;
		}
		this.field2889 += arg0;
		while (this.field2889 > this.field2898.delay[this.field2896]) {
			this.field2889 -= this.field2898.delay[this.field2896];
			this.field2896++;
			if (this.field2898.frames.length <= this.field2896) {
				this.field2893 = true;
				return;
			}
		}
	}
}
