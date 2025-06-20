package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.graphics.Model;

@ObfuscatedName("cb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("cb.n")
	public int field489;

	@ObfuscatedName("cb.o")
	public int field490;

	@ObfuscatedName("cb.p")
	public int field491;

	@ObfuscatedName("cb.q")
	public int field492;

	@ObfuscatedName("cb.r")
	public int field493;

	@ObfuscatedName("cb.s")
	public int field494;

	@ObfuscatedName("cb.t")
	public int field495;

	@ObfuscatedName("cb.u")
	public SeqType seq;

	@ObfuscatedName("cb.v")
	public int seqFrame;

	@ObfuscatedName("cb.w")
	public int seqCycle;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg4, int arg5, boolean randomFrame, int arg7, int arg8, int seq) {
		this.field489 = arg8;
		this.field490 = arg4;
		this.field491 = arg5;
		this.field492 = arg2;
		this.field493 = arg7;
		this.field494 = arg1;
		this.field495 = arg0;

		this.seq = SeqType.types[seq];
		this.seqFrame = 0;
		this.seqCycle = Client.loopCycle;

		if (randomFrame && this.seq.replayoff != -1) {
			this.seqFrame = (int) (Math.random() * (double) this.seq.frameCount);
			this.seqCycle -= (int) (Math.random() * (double) this.seq.getFrameDuration(this.seqFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model getTempModel() {
		if (this.seq != null) {
			int var2 = Client.loopCycle - this.seqCycle;
			if (var2 > 100 && this.seq.replayoff > 0) {
				var2 = 100;
			}
			label42: {
				do {
					do {
						if (var2 <= this.seq.getFrameDuration(this.seqFrame)) {
							break label42;
						}
						var2 -= this.seq.getFrameDuration(this.seqFrame);
						this.seqFrame++;
					} while (this.seqFrame < this.seq.frameCount);
					this.seqFrame -= this.seq.replayoff;
				} while (this.seqFrame >= 0 && this.seqFrame < this.seq.frameCount);
				this.seq = null;
			}
			this.seqCycle = Client.loopCycle - var2;
		}
		int var3 = -1;
		if (this.seq != null) {
			var3 = this.seq.frames[this.seqFrame];
		}
		LocType var4 = LocType.get(this.field489);
		return var4.getModel(this.field490, this.field491, this.field492, this.field493, this.field494, this.field495, var3);
	}
}
