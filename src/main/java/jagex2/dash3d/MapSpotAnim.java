package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("gb")
public class MapSpotAnim extends ModelSource {

	@ObfuscatedName("gb.o")
	public SpotAnimType type;

	@ObfuscatedName("gb.p")
	public int startCycle;

	@ObfuscatedName("gb.q")
	public int level;

	@ObfuscatedName("gb.r")
	public int x;

	@ObfuscatedName("gb.s")
	public int z;

	@ObfuscatedName("gb.t")
	public int y;

	@ObfuscatedName("gb.u")
	public int seqFrame;

	@ObfuscatedName("gb.v")
	public int seqCycle;

	@ObfuscatedName("gb.w")
	public boolean seqComplete = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		this.type = SpotAnimType.types[arg5];
		this.level = arg3;
		this.x = arg4;
		this.z = arg2;
		this.y = arg0;
		this.startCycle = arg1 + arg7;
		this.seqComplete = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public void update(int arg0) {
		this.seqCycle += arg0;
		while (true) {
			do {
				do {
					if (this.seqCycle <= this.type.seq.getFrameLength(this.seqFrame)) {
						return;
					}
					this.seqCycle -= this.type.seq.getFrameLength(this.seqFrame) + 1;
					this.seqFrame++;
				} while (this.seqFrame < this.type.seq.frameCount);
			} while (this.seqFrame >= 0 && this.seqFrame < this.type.seq.frameCount);
			this.seqFrame = 0;
			this.seqComplete = true;
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public Model getModel() {
		Model var2 = this.type.getModel();
		if (var2 == null) {
			return null;
		}
		int var3 = this.type.seq.frames[this.seqFrame];
		Model var4 = new Model(AnimFrame.shareAlpha(var3), false, true, var2);
		if (!this.seqComplete) {
			var4.createLabelReferences();
			var4.applyFrame(var3);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.type.resizeh != 128 || this.type.resizev != 128) {
			var4.resize(this.type.resizeh, this.type.resizeh, this.type.resizev);
		}
		if (this.type.angle != 0) {
			if (this.type.angle == 90) {
				var4.rotateY90();
			}
			if (this.type.angle == 180) {
				var4.rotateY90();
				var4.rotateY90();
			}
			if (this.type.angle == 270) {
				var4.rotateY90();
				var4.rotateY90();
				var4.rotateY90();
			}
		}
		var4.calculateNormals(this.type.ambient + 64, this.type.contrast + 850, -30, -50, -30, true);
		return var4;
	}
}
