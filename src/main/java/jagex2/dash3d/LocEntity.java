package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.graphics.Model;

@ObfuscatedName("cb")
public class LocEntity extends Entity {

	@ObfuscatedName("cb.l")
	public boolean field487 = false;

	@ObfuscatedName("cb.m")
	public boolean field488 = false;

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
	public SeqType field496;

	@ObfuscatedName("cb.v")
	public int field497;

	@ObfuscatedName("cb.w")
	public int field498;

	public LocEntity(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
		this.field489 = arg8;
		this.field490 = arg4;
		if (!arg3) {
			this.field487 = !this.field487;
		}
		this.field491 = arg5;
		this.field492 = arg2;
		this.field493 = arg7;
		this.field494 = arg1;
		this.field495 = arg0;
		this.field496 = SeqType.types[arg9];
		this.field497 = 0;
		this.field498 = client.loopCycle;
		if (arg6 && this.field496.replayoff != -1) {
			this.field497 = (int) (Math.random() * (double) this.field496.frameCount);
			this.field498 -= (int) (Math.random() * (double) this.field496.getFrameDuration(0, this.field497));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model getModel(int arg0) {
		if (arg0 != 5560) {
			this.field488 = !this.field488;
		}
		if (this.field496 != null) {
			int var2 = client.loopCycle - this.field498;
			if (var2 > 100 && this.field496.replayoff > 0) {
				var2 = 100;
			}
			label42: {
				do {
					do {
						if (var2 <= this.field496.getFrameDuration(0, this.field497)) {
							break label42;
						}
						var2 -= this.field496.getFrameDuration(0, this.field497);
						this.field497++;
					} while (this.field497 < this.field496.frameCount);
					this.field497 -= this.field496.replayoff;
				} while (this.field497 >= 0 && this.field497 < this.field496.frameCount);
				this.field496 = null;
			}
			this.field498 = client.loopCycle - var2;
		}
		int var3 = -1;
		if (this.field496 != null) {
			var3 = this.field496.frames[this.field497];
		}
		LocType var4 = LocType.get(this.field489);
		return var4.getModel(this.field490, this.field491, this.field492, this.field493, this.field494, this.field495, var3);
	}
}
