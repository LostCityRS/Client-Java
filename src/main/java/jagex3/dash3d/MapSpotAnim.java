package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("tb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("tb.cc")
	public final int type;

	@ObfuscatedName("tb.Tb")
	public int animFrame = 0;

	@ObfuscatedName("tb.Qb")
	public boolean animComplete = false;

	@ObfuscatedName("tb.Mb")
	public int animCycle = 0;

	@ObfuscatedName("tb.Ob")
	public final int z;

	@ObfuscatedName("tb.Xb")
	public final int x;

	@ObfuscatedName("tb.Jb")
	public final int startCycle;

	@ObfuscatedName("tb.Kb")
	public final int y;

	@ObfuscatedName("tb.Sb")
	public final int level;

	@ObfuscatedName("tb.Vb")
	public SeqType anim;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.z = arg3;
		this.x = arg2;
		this.startCycle = arg5 + arg6;
		this.y = arg4;
		this.type = arg0;
		this.level = arg1;
		int var8 = SpotType.list(this.type).anim;
		if (var8 == -1) {
			this.animComplete = true;
		} else {
			this.animComplete = false;
			this.anim = SeqType.list(var8);
		}
	}

	@ObfuscatedName("tb.f(I)Lpa;")
	@Override
	public Model getTempModel() {
		SpotType var1 = SpotType.list(this.type);
		Model var2;
		if (this.animComplete) {
			var2 = var1.getTempModel2(-1);
		} else {
			var2 = var1.getTempModel2(this.animFrame);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("tb.b(II)V")
	public void doAnim(int arg0) {
		if (this.animComplete) {
			return;
		}
		this.animCycle += arg0;
		while (this.animCycle > this.anim.delay[this.animFrame]) {
			this.animCycle -= this.anim.delay[this.animFrame];
			this.animFrame++;
			if (this.anim.frames.length <= this.animFrame) {
				this.animComplete = true;
				return;
			}
		}
	}
}
