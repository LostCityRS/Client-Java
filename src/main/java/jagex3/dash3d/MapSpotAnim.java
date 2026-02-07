package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("td")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("td.db")
	public boolean animComplete = false;

	@ObfuscatedName("td.hb")
	public int field3162 = 0;

	@ObfuscatedName("td.ib")
	public final int field3163;

	@ObfuscatedName("td.jb")
	public final int field3164;

	@ObfuscatedName("td.lb")
	public int field3166 = 0;

	@ObfuscatedName("td.mb")
	public final int field3167;

	@ObfuscatedName("td.qb")
	public final int field3171;

	@ObfuscatedName("td.U")
	public final int field3149;

	@ObfuscatedName("td.W")
	public final int field3151;

	@ObfuscatedName("td.Z")
	public SeqType field3154;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field3149 = arg1;
		this.field3164 = arg2;
		this.field3151 = arg5 + arg6;
		this.field3171 = arg3;
		this.field3163 = arg0;
		this.field3167 = arg4;
		int var8 = SpotType.method316(this.field3163).field3096;
		if (var8 == -1) {
			this.animComplete = true;
		} else {
			this.animComplete = false;
			this.field3154 = SeqType.method760(var8);
		}
	}

	@ObfuscatedName("td.a(BI)V")
	public void doAnim(int arg0) {
		if (this.animComplete) {
			return;
		}
		this.field3162 += arg0;
		while (this.field3154.field3376[this.field3166] < this.field3162) {
			this.field3162 -= this.field3154.field3376[this.field3166];
			this.field3166++;
			if (this.field3154.field3393.length <= this.field3166) {
				this.animComplete = true;
				return;
			}
		}
	}

	@ObfuscatedName("td.b(B)Lod;")
	@Override
	public ModelLit method132() {
		SpotType var1 = SpotType.method316(this.field3163);
		ModelLit var2;
		if (this.animComplete) {
			var2 = var1.method1017(-1);
		} else {
			var2 = var1.method1017(this.field3166);
		}
		return var2 == null ? null : var2;
	}
}
