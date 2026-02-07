package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("td")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("td.db")
	public boolean animComplete = false;

	@ObfuscatedName("td.hb")
	public int animCycle = 0;

	@ObfuscatedName("td.ib")
	public final int type;

	@ObfuscatedName("td.jb")
	public final int field3164;

	@ObfuscatedName("td.lb")
	public int animFrame = 0;

	@ObfuscatedName("td.mb")
	public final int field3167;

	@ObfuscatedName("td.qb")
	public final int field3171;

	@ObfuscatedName("td.U")
	public final int field3149;

	@ObfuscatedName("td.W")
	public final int field3151;

	@ObfuscatedName("td.Z")
	public SeqType anim;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field3149 = arg1;
		this.field3164 = arg2;
		this.field3151 = arg5 + arg6;
		this.field3171 = arg3;
		this.type = arg0;
		this.field3167 = arg4;
		int var8 = SpotType.list(this.type).anim;
		if (var8 == -1) {
			this.animComplete = true;
		} else {
			this.animComplete = false;
			this.anim = SeqType.list(var8);
		}
	}

	@ObfuscatedName("td.a(BI)V")
	public void doAnim(int arg0) {
		if (this.animComplete) {
			return;
		}
		this.animCycle += arg0;
		while (this.anim.delay[this.animFrame] < this.animCycle) {
			this.animCycle -= this.anim.delay[this.animFrame];
			this.animFrame++;
			if (this.anim.frames.length <= this.animFrame) {
				this.animComplete = true;
				return;
			}
		}
	}

	@ObfuscatedName("td.b(B)Lod;")
	@Override
	public ModelLit getTempModel() {
		SpotType var1 = SpotType.list(this.type);
		ModelLit var2;
		if (this.animComplete) {
			var2 = var1.getTempModel2(-1);
		} else {
			var2 = var1.getTempModel2(this.animFrame);
		}
		return var2 == null ? null : var2;
	}
}
