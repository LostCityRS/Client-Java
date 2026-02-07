package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.config.LocType;
import jagex3.config.SeqType;

@ObfuscatedName("pb")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("pb.ab")
	public int animFrame;

	@ObfuscatedName("pb.bb")
	public SeqType anim;

	@ObfuscatedName("pb.eb")
	public final int x;

	@ObfuscatedName("pb.fb")
	public final int shape;

	@ObfuscatedName("pb.hb")
	public final int id;

	@ObfuscatedName("pb.ib")
	public final int z;

	@ObfuscatedName("pb.jb")
	public final int angle;

	@ObfuscatedName("pb.lb")
	public int animCycle;

	@ObfuscatedName("pb.V")
	public final int level;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, ModelSource arg8) {
		this.id = arg0;
		this.shape = arg1;
		this.level = arg3;
		this.z = arg5;
		this.angle = arg2;
		this.x = arg4;
		if (arg6 != -1) {
			this.anim = SeqType.list(arg6);
			this.animFrame = 0;
			this.animCycle = Client.loopCycle - 1;
			if (this.anim.duplicatebehavior == 0 && arg8 != null && arg8 instanceof ClientLocAnim) {
				ClientLocAnim var10 = (ClientLocAnim) arg8;
				if (this.anim == var10.anim) {
					this.animFrame = var10.animFrame;
					this.animCycle = var10.animCycle;
					return;
				}
			}
			if (arg7 && this.anim.loops != -1) {
				this.animFrame = (int) ((double) this.anim.frames.length * Math.random());
				this.animCycle -= (int) ((double) this.anim.delay[this.animFrame] * Math.random());
				return;
			}
		}
	}

	@ObfuscatedName("pb.b(B)Lod;")
	@Override
	public ModelLit getTempModel() {
		if (this.anim != null) {
			int var1 = Client.loopCycle - this.animCycle;
			if (var1 > 100 && this.anim.loops > 0) {
				var1 = 100;
			}
			label46: {
				do {
					do {
						if (var1 <= this.anim.delay[this.animFrame]) {
							break label46;
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
		if (var2 == null) {
			return null;
		}
		int var3;
		int var4;
		if (this.angle == 1 || this.angle == 3) {
			var3 = var2.width;
			var4 = var2.length;
		} else {
			var4 = var2.width;
			var3 = var2.length;
		}
		int var5 = this.x + (var4 + 1 >> 1);
		int var6 = this.x + (var4 >> 1);
		int var7 = this.z + (var3 >> 1);
		int var8 = (var3 + 1 >> 1) + this.z;
		int[][] var9 = ClientBuild.groundh[this.level];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.x << 7) + (var4 << 6);
		int var12 = (this.z << 7) + (var3 << 6);
		return var2.method415(this.anim, var12, this.shape, var9, var11, this.animFrame, var10, this.angle);
	}
}
