package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.Model;

@ObfuscatedName("gb")
public class SpotAnimEntity extends Entity {

	@ObfuscatedName("gb.l")
	public int _flowObfuscator5 = 826;

	@ObfuscatedName("gb.m")
	public SpotAnimType type;

	@ObfuscatedName("gb.n")
	public int startCycle;

	@ObfuscatedName("gb.o")
	public int level;

	@ObfuscatedName("gb.p")
	public int x;

	@ObfuscatedName("gb.q")
	public int z;

	@ObfuscatedName("gb.r")
	public int y;

	@ObfuscatedName("gb.s")
	public int seqFrame;

	@ObfuscatedName("gb.t")
	public int seqCycle;

	@ObfuscatedName("gb.u")
	public boolean seqComplete = false;

	public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.type = SpotAnimType.types[arg3];
		if (arg5 >= 0) {
			this._flowObfuscator5 = -352;
		}
		this.level = arg2;
		this.x = arg1;
		this.z = arg0;
		this.y = arg4;
		this.startCycle = arg6 + arg7;
		this.seqComplete = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void update(int arg0, int arg1) {
		this.seqCycle += arg1;
		if (arg0 != 0) {
			return;
		}
		while (true) {
			do {
				do {
					if (this.seqCycle <= this.type.seq.getFrameDuration(0, this.seqFrame)) {
						return;
					}
					this.seqCycle -= this.type.seq.getFrameDuration(0, this.seqFrame) + 1;
					this.seqFrame++;
				} while (this.seqFrame < this.type.seq.frameCount);
			} while (this.seqFrame >= 0 && this.seqFrame < this.type.seq.frameCount);
			this.seqFrame = 0;
			this.seqComplete = true;
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model getModel(int arg0) {
		Model var2 = this.type.getModel();
		if (arg0 != 5560) {
			throw new NullPointerException();
		} else if (var2 == null) {
			return null;
		} else {
			Model var3 = new Model(var2, true, false, !this.type.animHasAlpha, -796);
			if (!this.seqComplete) {
				var3.createLabelReferences(-591);
				var3.applyTransform(this.type.seq.frames[this.seqFrame], 13056);
				var3.labelFaces = null;
				var3.labelVertices = null;
			}
			if (this.type.resizeh != 128 || this.type.resizev != 128) {
				var3.scale(this.type.resizev, this.type.resizeh, 4, this.type.resizeh);
			}
			if (this.type.angle != 0) {
				if (this.type.angle == 90) {
					var3.rotateY90((byte) 3);
				}
				if (this.type.angle == 180) {
					var3.rotateY90((byte) 3);
					var3.rotateY90((byte) 3);
				}
				if (this.type.angle == 270) {
					var3.rotateY90((byte) 3);
					var3.rotateY90((byte) 3);
					var3.rotateY90((byte) 3);
				}
			}
			var3.calculateNormals(this.type.ambient + 64, this.type.contrast + 850, -30, -50, -30, true);
			return var3;
		}
	}
}
