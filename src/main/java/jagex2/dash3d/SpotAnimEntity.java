package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.Model;

@ObfuscatedName("gb")
public class SpotAnimEntity extends Entity {

	@ObfuscatedName("gb.l")
	public int field610 = 826;

	@ObfuscatedName("gb.m")
	public SpotAnimType field611;

	@ObfuscatedName("gb.n")
	public int field612;

	@ObfuscatedName("gb.o")
	public int field613;

	@ObfuscatedName("gb.p")
	public int field614;

	@ObfuscatedName("gb.q")
	public int field615;

	@ObfuscatedName("gb.r")
	public int field616;

	@ObfuscatedName("gb.s")
	public int field617;

	@ObfuscatedName("gb.t")
	public int field618;

	@ObfuscatedName("gb.u")
	public boolean field619 = false;

	public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field611 = SpotAnimType.types[arg3];
		if (arg5 >= 0) {
			this.field610 = -352;
		}
		this.field613 = arg2;
		this.field614 = arg1;
		this.field615 = arg0;
		this.field616 = arg4;
		this.field612 = arg6 + arg7;
		this.field619 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method163(int arg0, int arg1) {
		this.field618 += arg1;
		if (arg0 != 0) {
			return;
		}
		while (true) {
			do {
				do {
					if (this.field618 <= this.field611.seq.method382(0, this.field617)) {
						return;
					}
					this.field618 -= this.field611.seq.method382(0, this.field617) + 1;
					this.field617++;
				} while (this.field617 < this.field611.seq.frameCount);
			} while (this.field617 >= 0 && this.field617 < this.field611.seq.frameCount);
			this.field617 = 0;
			this.field619 = true;
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model method122(int arg0) {
		Model var2 = this.field611.method386();
		if (arg0 != 5560) {
			throw new NullPointerException();
		} else if (var2 == null) {
			return null;
		} else {
			Model var3 = new Model(var2, true, false, !this.field611.animHasAlpha, -796);
			if (!this.field619) {
				var3.method145(-591);
				var3.method146(this.field611.seq.frames[this.field617], 13056);
				var3.field575 = null;
				var3.field574 = null;
			}
			if (this.field611.resizeh != 128 || this.field611.resizev != 128) {
				var3.scale(this.field611.resizev, this.field611.resizeh, 4, this.field611.resizeh);
			}
			if (this.field611.angle != 0) {
				if (this.field611.angle == 90) {
					var3.method149((byte) 3);
				}
				if (this.field611.angle == 180) {
					var3.method149((byte) 3);
					var3.method149((byte) 3);
				}
				if (this.field611.angle == 270) {
					var3.method149((byte) 3);
					var3.method149((byte) 3);
					var3.method149((byte) 3);
				}
			}
			var3.calculateNormals(this.field611.ambient + 64, this.field611.contrast + 850, -30, -50, -30, true);
			return var3;
		}
	}
}
