package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("cb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("cb.n")
	public int index;

	@ObfuscatedName("cb.o")
	public int shape;

	@ObfuscatedName("cb.p")
	public int angle;

	@ObfuscatedName("cb.q")
	public int heightmapSW;

	@ObfuscatedName("cb.r")
	public int heightmapSE;

	@ObfuscatedName("cb.s")
	public int heightmapNE;

	@ObfuscatedName("cb.t")
	public int heightmapNW;

	@ObfuscatedName("cb.u")
	public SeqType seq;

	@ObfuscatedName("cb.v")
	public int seqFrame;

	@ObfuscatedName("cb.w")
	public int seqCycle;

	public ClientLocAnim(int heightmapNW, int heightmapNE, int heightmapSW, int shape, int angle, boolean randomFrame, int heightmapSE, int index, int seq) {
		this.index = index;
		this.shape = shape;
		this.angle = angle;
		this.heightmapSW = heightmapSW;
		this.heightmapSE = heightmapSE;
		this.heightmapNE = heightmapNE;
		this.heightmapNW = heightmapNW;

		this.seq = SeqType.types[seq];
		this.seqFrame = 0;
		this.seqCycle = Client.loopCycle;

		if (randomFrame && this.seq.loops != -1) {
			this.seqFrame = (int) (Math.random() * (double) this.seq.numFrames);
			this.seqCycle -= (int) (Math.random() * (double) this.seq.getFrameDuration(this.seqFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model getModel() {
		if (this.seq != null) {
			int delta = Client.loopCycle - this.seqCycle;
			if (delta > 100 && this.seq.loops > 0) {
				delta = 100;
			}

			while (delta > this.seq.getFrameDuration(this.seqFrame)) {
				delta -= this.seq.getFrameDuration((this.seqFrame));
				this.seqFrame++;

				if (this.seqFrame < this.seq.numFrames) {
					continue;
				}

				this.seqFrame -= this.seq.loops;

				if (this.seqFrame < 0 || this.seqFrame >= this.seq.numFrames) {
					this.seq = null;
					break;
				}
			}

			this.seqCycle = Client.loopCycle - delta;
		}

		int transformId = -1;
		if (this.seq != null) {
			transformId = this.seq.frames[this.seqFrame];
		}

		LocType loc = LocType.get(this.index);
		return loc.getModel(this.shape, this.angle, this.heightmapSW, this.heightmapSE, this.heightmapNE, this.heightmapNW, transformId);
	}
}
