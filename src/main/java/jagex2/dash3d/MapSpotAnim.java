package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("gb")
public class MapSpotAnim extends ModelSource {

	@ObfuscatedName("gb.o")
	public SpotAnimType field608;

	@ObfuscatedName("gb.p")
	public int field609;

	@ObfuscatedName("gb.q")
	public int field610;

	@ObfuscatedName("gb.r")
	public int field611;

	@ObfuscatedName("gb.s")
	public int field612;

	@ObfuscatedName("gb.t")
	public int field613;

	@ObfuscatedName("gb.u")
	public int field614;

	@ObfuscatedName("gb.v")
	public int field615;

	@ObfuscatedName("gb.w")
	public boolean field616 = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		this.field608 = SpotAnimType.types[arg5];
		this.field610 = arg3;
		this.field611 = arg4;
		this.field612 = arg2;
		this.field613 = arg0;
		this.field609 = arg1 + arg7;
		this.field616 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method164(int arg0) {
		this.field615 += arg0;
		while (true) {
			do {
				do {
					if (this.field615 <= this.field608.seq.getFrameLength(this.field614)) {
						return;
					}
					this.field615 -= this.field608.seq.getFrameLength(this.field614) + 1;
					this.field614++;
				} while (this.field614 < this.field608.seq.frameCount);
			} while (this.field614 >= 0 && this.field614 < this.field608.seq.frameCount);
			this.field614 = 0;
			this.field616 = true;
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model getModel() {
		Model var2 = this.field608.getModel();
		if (var2 == null) {
			return null;
		}
		int var3 = this.field608.seq.frames[this.field614];
		Model var4 = new Model(AnimFrame.isNull(var3), false, true, var2);
		if (!this.field616) {
			var4.createLabelReferences();
			var4.applyFrame(var3);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.field608.resizeh != 128 || this.field608.resizev != 128) {
			var4.resize(this.field608.resizeh, this.field608.resizeh, this.field608.resizev);
		}
		if (this.field608.angle != 0) {
			if (this.field608.angle == 90) {
				var4.rotateY90();
			}
			if (this.field608.angle == 180) {
				var4.rotateY90();
				var4.rotateY90();
			}
			if (this.field608.angle == 270) {
				var4.rotateY90();
				var4.rotateY90();
				var4.rotateY90();
			}
		}
		var4.calculateNormals(this.field608.ambient + 64, this.field608.contrast + 850, -30, -50, -30, true);
		return var4;
	}
}
