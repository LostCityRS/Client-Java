package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.LocType;
import jagex3.config.SeqType;

@ObfuscatedName("j")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("j.bc")
	public SeqType anim;

	@ObfuscatedName("j.cc")
	public final int id;

	@ObfuscatedName("j.Wb")
	public final int field1422;

	@ObfuscatedName("j.Ub")
	public final int field1420;

	@ObfuscatedName("j.Lb")
	public final int field1411;

	@ObfuscatedName("j.Xb")
	public final int z;

	@ObfuscatedName("j.Jb")
	public final int field1409;

	@ObfuscatedName("j.Ob")
	public final int field1414;

	@ObfuscatedName("j.Tb")
	public int animFrame;

	@ObfuscatedName("j.Rb")
	public int animCycle;

	@ObfuscatedName("j.f(I)Lpa;")
	@Override
	public Model getTempModel() {
		if (this.anim != null) {
			int var1 = Client.loopCycle - this.animCycle;
			if (var1 > 100 && this.anim.loops > 0) {
				var1 = 100;
			}
			label37:
			{
				do {
					do {
						if (this.anim.delay[this.animFrame] >= var1) {
							break label37;
						}
						var1 -= this.anim.delay[this.animFrame];
						this.animFrame++;
					} while (this.anim.frames.length > this.animFrame);
					this.animFrame -= this.anim.loops;
				} while (this.animFrame >= 0 && this.anim.frames.length > this.animFrame);
				this.anim = null;
			}
			this.animCycle = Client.loopCycle - var1;
		}
		LocType var2 = LocType.list(this.id);
		if (var2.multiloc != null) {
			var2 = var2.getMultiLoc();
		}
		return var2 == null ? null : var2.getModel(this.field1422, this.z, this.animFrame, this.field1414, this.field1411, this.anim, this.field1420, this.field1409);
	}

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		this.field1422 = arg3;
		this.id = arg0;
		this.field1420 = arg6;
		this.field1411 = arg2;
		this.z = arg4;
		this.field1409 = arg5;
		this.field1414 = arg1;
		if (arg7 != -1) {
			this.anim = SeqType.list(arg7);
			this.animFrame = 0;
			this.animCycle = Client.loopCycle - 1;
			if (arg8 && this.anim.loops != -1) {
				this.animFrame = (int) ((double) this.anim.frames.length * Math.random());
				this.animCycle -= (int) (Math.random() * (double) this.anim.delay[this.animFrame]);
				return;
			}
		}
	}
}
