package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.config.LocType;
import jagex3.config.SeqType;

@ObfuscatedName("hd")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("hd.n")
	public final int z;

	@ObfuscatedName("hd.q")
	public final int x;

	@ObfuscatedName("hd.r")
	public final int angle;

	@ObfuscatedName("hd.s")
	public SeqType anim;

	@ObfuscatedName("hd.t")
	public int field1460 = -32768;

	@ObfuscatedName("hd.w")
	public int animCycle;

	@ObfuscatedName("hd.F")
	public final int id;

	@ObfuscatedName("hd.z")
	public final int level;

	@ObfuscatedName("hd.C")
	public final int shape;

	@ObfuscatedName("hd.H")
	public int animFrame;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, ModelSource arg8) {
		this.id = arg0;
		this.angle = arg2;
		this.level = arg3;
		this.z = arg5;
		this.shape = arg1;
		this.x = arg4;
		if (arg6 != -1) {
			this.anim = SeqType.list(arg6);
			this.animFrame = 0;
			this.animCycle = Client.loopCycle - 1;
			if (this.anim.duplicatebehaviour == 0 && arg8 != null && arg8 instanceof ClientLocAnim) {
				ClientLocAnim var10 = (ClientLocAnim) arg8;
				if (this.anim == var10.anim) {
					this.animFrame = var10.animFrame;
					this.animCycle = var10.animCycle;
					return;
				}
			}
			if (arg7 && this.anim.field1972 != -1) {
				this.animFrame = (int) ((double) this.anim.frames.length * Math.random());
				this.animCycle -= (int) (Math.random() * (double) this.anim.delay[this.animFrame]);
				return;
			}
		}
	}

	@ObfuscatedName("hd.b()I")
	@Override
	public int method88() {
		return this.field1460;
	}

	@ObfuscatedName("hd.b(I)Lnc;")
	public ModelSource getTempModel() {
		boolean var1 = World.groundh != ClientBuild.groundh;
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
			var4 = var2.width;
			var3 = var2.length;
		} else {
			var3 = var2.width;
			var4 = var2.length;
		}
		int var5 = (var3 + 1 >> 1) + this.x;
		int var6 = (var3 >> 1) + this.x;
		int var7 = this.z + (var4 >> 1);
		int var8 = this.z + (var4 + 1 >> 1);
		this.method537(var6 * 128, var7 * 128);
		int[][] var9 = ClientBuild.groundh[this.level];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.x << 7) + (var3 << 6);
		int[][] var12 = null;
		int var13 = (this.z << 7) + (var4 << 6);
		if (var1) {
			var12 = World.groundh[0];
		} else if (this.level < 3) {
			var12 = ClientBuild.groundh[this.level + 1];
		}
		ModelCacheLit var14;
		if (this.anim == null) {
			var14 = var2.method997(this.shape, var12, var9, var11, false, var13, this.angle, var10);
		} else {
			var14 = var2.method1004(var10, var11, this.shape, var13, this.animFrame, this.anim, var9, var12, this.angle);
		}
		return var14 == null ? null : var14.field3984;
	}

	@ObfuscatedName("hd.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelSource var11 = this.getTempModel();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field1460 = var11.method88();
		}
	}

	@ObfuscatedName("hd.b(III)V")
	@Override
	public void method537(int arg0, int arg1) {
		if (this.anim == null) {
			return;
		}
		int var3 = Client.loopCycle - this.animCycle;
		if (var3 > 100 && this.anim.field1972 > 0) {
			int var4 = this.anim.frames.length - this.anim.field1972;
			while (this.animFrame < var4 && var3 > this.anim.delay[this.animFrame]) {
				var3 -= this.anim.delay[this.animFrame];
				this.animFrame++;
			}
			if (var4 <= this.animFrame) {
				int var5 = 0;
				for (int var6 = var4; var6 < this.anim.frames.length; var6++) {
					var5 += this.anim.delay[var6];
				}
				var3 %= var5;
			}
		}
		label56: {
			do {
				do {
					if (var3 <= this.anim.delay[this.animFrame]) {
						break label56;
					}
					Client.method433(false, arg1, this.animFrame, arg0, this.anim);
					var3 -= this.anim.delay[this.animFrame];
					this.animFrame++;
				} while (this.anim.frames.length > this.animFrame);
				this.animFrame -= this.anim.field1972;
			} while (this.animFrame >= 0 && this.anim.frames.length > this.animFrame);
			this.anim = null;
		}
		this.animCycle = Client.loopCycle - var3;
	}
}
