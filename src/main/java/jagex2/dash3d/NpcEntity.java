package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.graphics.Model;

@ObfuscatedName("ab")
public class NpcEntity extends PathingEntity {

	@ObfuscatedName("ab.pb")
	public boolean field458 = false;

	@ObfuscatedName("ab.qb")
	public int field459 = -949;

	@ObfuscatedName("ab.rb")
	public int field460;

	@ObfuscatedName("ab.sb")
	public NpcType field461;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final Model method122(int arg0) {
		if (this.field461 == null) {
			return null;
		}
		Model var2 = this.method128(357);
		if (var2 == null) {
			return null;
		}
		super.field450 = var2.field400;
		if (arg0 != 5560) {
			this.field459 = -451;
		}
		if (super.field437 != -1 && super.field438 != -1) {
			SpotAnimType var3 = SpotAnimType.types[super.field437];
			Model var4 = var3.method386();
			if (var4 != null) {
				Model var5 = new Model(var4, true, false, !var3.animHasAlpha, -796);
				var5.translate(-super.field441, 0, 0, false);
				var5.method145(-591);
				var5.method146(var3.seq.frames[super.field438], 13056);
				var5.field575 = null;
				var5.field574 = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.scale(var3.resizev, var3.resizeh, 4, var3.resizeh);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(this.field460, true, 2, var6);
			}
		}
		if (this.field461.size == 1) {
			var2.field576 = true;
		}
		return var2;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final Model method128(int arg0) {
		if (super.field432 < 0 || super.field435 != 0) {
			int var4 = -1;
			int var5 = 59 / arg0;
			if (super.field429 >= 0) {
				var4 = SeqType.types[super.field429].frames[super.field430];
			}
			return this.field461.method344((byte) 0, var4, -1, null);
		}
		int var2 = SeqType.types[super.field432].frames[super.field433];
		int var3 = -1;
		if (super.field429 >= 0 && super.field429 != super.field409) {
			var3 = SeqType.types[super.field429].frames[super.field430];
		}
		return this.field461.method344((byte) 0, var2, var3, SeqType.types[super.field432].walkmerge);
	}

	@ObfuscatedName("ab.a(B)Z")
	public final boolean method126(byte arg0) {
		if (arg0 != 8) {
			this.field458 = !this.field458;
		}
		return this.field461 != null;
	}
}
