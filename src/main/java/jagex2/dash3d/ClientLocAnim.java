package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("cb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("cb.m")
	public int index;

	@ObfuscatedName("cb.n")
	public int shape;

	@ObfuscatedName("cb.o")
	public int angle;

	@ObfuscatedName("cb.p")
	public int heightSW;

	@ObfuscatedName("cb.q")
	public int heightSE;

	@ObfuscatedName("cb.r")
	public int heightNE;

	@ObfuscatedName("cb.s")
	public int heightNW;

	@ObfuscatedName("cb.t")
	public SeqType seq;

	@ObfuscatedName("cb.u")
	public int seqFrame;

	@ObfuscatedName("cb.v")
	public int seqCycle;

	public ClientLocAnim(int heightNE, int index, boolean randomFrame, int heightSW, int heightNW, int shape, int angle, int heightSE, int anim) {
		this.index = index;
		this.shape = shape;
		this.angle = angle;
		this.heightSW = heightSW;
		this.heightSE = heightSE;
		this.heightNE = heightNE;
		this.heightNW = heightNW;

		this.seq = SeqType.types[anim];
		this.seqFrame = 0;
		this.seqCycle = Client.loopCycle;

		if (randomFrame && this.seq.loops != -1) {
			this.seqFrame = (int) (Math.random() * (double) this.seq.frameCount);
			this.seqCycle -= (int) (Math.random() * (double) this.seq.getFrameLength(this.seqFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public Model getModel() {
		if (this.seq != null) {
			int delta = Client.loopCycle - this.seqCycle;
			if (delta > 100 && this.seq.loops > 0) {
				delta = 100;
			}

			while (delta > this.seq.getFrameLength(this.seqFrame)) {
				delta -= this.seq.getFrameLength(this.seqFrame);
				this.seqFrame++;

				if (this.seqFrame < this.seq.frameCount) {
					continue;
				}

				this.seqFrame -= this.seq.loops;

				if (this.seqFrame < 0 || this.seqFrame >= this.seq.frameCount) {
					this.seq = null;
					break;
				}
			}

			this.seqCycle = Client.loopCycle - delta;
		}

		int frame = -1;
		if (this.seq != null) {
			frame = this.seq.frames[this.seqFrame];
		}

		LocType loc = LocType.get(this.index);
		return loc.getModel(this.shape, this.angle, this.heightSW, this.heightSE, this.heightNE, this.heightNW, frame);
	}
}
