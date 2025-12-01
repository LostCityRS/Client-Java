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

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
		this.index = arg3;
		this.shape = arg0;
		this.angle = arg1;
		this.heightSW = arg2;
		this.heightSE = arg9;
		this.heightNE = arg5;
		this.heightNW = arg6;
		this.seq = SeqType.list[arg8];
		this.seqFrame = 0;
		this.seqCycle = Client.loopCycle;
		if (arg7 && this.seq.loops != -1) {
			this.seqFrame = (int) (Math.random() * (double) this.seq.numFrames);
			this.seqCycle -= (int) (Math.random() * (double) this.seq.getDuration(this.seqFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public Model getTempModel() {
		if (this.seq != null) {
			int var2 = Client.loopCycle - this.seqCycle;
			if (var2 > 100 && this.seq.loops > 0) {
				var2 = 100;
			}
			label37: {
				do {
					do {
						if (var2 <= this.seq.getDuration(this.seqFrame)) {
							break label37;
						}
						var2 -= this.seq.getDuration(this.seqFrame);
						this.seqFrame++;
					} while (this.seqFrame < this.seq.numFrames);
					this.seqFrame -= this.seq.loops;
				} while (this.seqFrame >= 0 && this.seqFrame < this.seq.numFrames);
				this.seq = null;
			}
			this.seqCycle = Client.loopCycle - var2;
		}
		int var3 = -1;
		if (this.seq != null) {
			var3 = this.seq.frames[this.seqFrame];
		}
		LocType var4 = LocType.get(this.index);
		Model var5 = var4.getModel(this.shape, this.angle, this.heightSW, this.heightSE, this.heightNE, this.heightNW, var3);
		return var5;
	}
}
