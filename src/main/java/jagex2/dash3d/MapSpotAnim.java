package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("gb")
public class MapSpotAnim extends ModelSource {

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

	public MapSpotAnim(int arg0, int arg1, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.type = SpotAnimType.types[arg5];
		this.level = arg0;
		this.x = arg6;
		this.z = arg3;
		this.y = arg4;
		this.startCycle = arg7 + arg1;
		this.seqComplete = false;
	}

	@ObfuscatedName("gb.a(IZ)V")
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
		Model var3 = this.type.getModel();
		if (var3 == null) {
			return null;
		}
		Model var4 = new Model(true, var3, false, !this.type.animHasAlpha);
		if (!this.seqComplete) {
			var4.createLabelReferences();
			var4.applyFrame(this.type.seq.frames[this.seqFrame]);
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
