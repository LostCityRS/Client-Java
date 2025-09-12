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
	public int heightmapSW;

	@ObfuscatedName("cb.q")
	public int heightmapSE;

	@ObfuscatedName("cb.r")
	public int heightmapNE;

	@ObfuscatedName("cb.s")
	public int heightmapNW;

	@ObfuscatedName("cb.t")
	public SeqType seq;

	@ObfuscatedName("cb.u")
	public int seqFrame;

	@ObfuscatedName("cb.v")
	public int seqCycle;

	public ClientLocAnim(int arg0, int arg1, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.index = arg1;
		this.shape = arg6;
		this.angle = arg7;
		this.heightmapSW = arg4;
		this.heightmapSE = arg8;
		this.heightmapNE = arg0;
		this.heightmapNW = arg5;
		this.seq = SeqType.types[arg9];
		this.seqFrame = 0;
		this.seqCycle = Client.loopCycle;
		if (arg3 && this.seq.loops != -1) {
			this.seqFrame = (int) (Math.random() * (double) this.seq.frameCount);
			this.seqCycle -= (int) (Math.random() * (double) this.seq.getFrameDuration(this.seqFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model getModel() {
		if (this.seq != null) {
			int var2 = Client.loopCycle - this.seqCycle;
			if (var2 > 100 && this.seq.loops > 0) {
				var2 = 100;
			}
			label41: {
				do {
					do {
						if (var2 <= this.seq.getFrameDuration(this.seqFrame)) {
							break label41;
						}
						var2 -= this.seq.getFrameDuration(this.seqFrame);
						this.seqFrame++;
					} while (this.seqFrame < this.seq.frameCount);
					this.seqFrame -= this.seq.loops;
				} while (this.seqFrame >= 0 && this.seqFrame < this.seq.frameCount);
				this.seq = null;
			}
			this.seqCycle = Client.loopCycle - var2;
		}
		int var3 = -1;
		if (this.seq != null) {
			var3 = this.seq.frames[this.seqFrame];
		}
		LocType var4 = LocType.get(this.index);
		return var4.getModel(this.shape, this.angle, this.heightmapSW, this.heightmapSE, this.heightmapNE, this.heightmapNW, var3);
	}
}
