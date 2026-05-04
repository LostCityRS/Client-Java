package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("bf")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("bf.r")
	public SeqType field282;

	@ObfuscatedName("bf.v")
	public int field286 = -32768;

	@ObfuscatedName("bf.w")
	public final int field287;

	@ObfuscatedName("bf.I")
	public int field298 = 0;

	@ObfuscatedName("bf.N")
	public int field303 = 0;

	@ObfuscatedName("bf.M")
	public boolean field302 = false;

	@ObfuscatedName("bf.z")
	public final int field290;

	@ObfuscatedName("bf.G")
	public final int field296;

	@ObfuscatedName("bf.E")
	public final int field295;

	@ObfuscatedName("bf.L")
	public final int field301;

	@ObfuscatedName("bf.B")
	public final int field292;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field290 = arg3;
		this.field296 = arg2;
		this.field295 = arg4;
		this.field287 = arg6 + arg5;
		this.field301 = arg0;
		this.field292 = arg1;
		int var8 = SpotType.list(this.field301).field542;
		if (var8 == -1) {
			this.field302 = true;
		} else {
			this.field302 = false;
			this.field282 = SeqType.list(var8);
		}
	}

	@ObfuscatedName("bf.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelLit var11 = this.method89();
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
	public ModelLit method89() {
		SpotType var1 = SpotType.list(this.field301);
		ModelLit var2;
		if (this.field302) {
			var2 = var1.method209(-1);
		} else {
			var2 = var1.method209(this.field298);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("bf.a(IZ)V")
	public void method90(int arg0) {
		if (this.field302) {
			return;
		}
		this.field303 += arg0;
		while (this.field303 > this.field282.field1990[this.field298]) {
			this.field303 -= this.field282.field1990[this.field298];
			this.field298++;
			if (this.field282.field1965.length <= this.field298) {
				this.field302 = true;
				return;
			}
		}
	}
}
