package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("bf")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("bf.r")
	public SeqType anim;

	@ObfuscatedName("bf.v")
	public int field286 = -32768;

	@ObfuscatedName("bf.w")
	public final int startCycle;

	@ObfuscatedName("bf.I")
	public int animFrame = 0;

	@ObfuscatedName("bf.N")
	public int animCycle = 0;

	@ObfuscatedName("bf.M")
	public boolean animComplete = false;

	@ObfuscatedName("bf.z")
	public final int z;

	@ObfuscatedName("bf.G")
	public final int x;

	@ObfuscatedName("bf.E")
	public final int y;

	@ObfuscatedName("bf.L")
	public final int type;

	@ObfuscatedName("bf.B")
	public final int level;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.z = arg3;
		this.x = arg2;
		this.y = arg4;
		this.startCycle = arg6 + arg5;
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

	@ObfuscatedName("bf.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelLit var11 = this.getTempModel();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field286 = var11.method88();
		}
	}

	@ObfuscatedName("bf.b()I")
	@Override
	public int method88() {
		return this.field286;
	}

	@ObfuscatedName("bf.a(Z)Lcg;")
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

	@ObfuscatedName("bf.a(IZ)V")
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
