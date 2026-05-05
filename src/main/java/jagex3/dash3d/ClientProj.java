package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("h")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("h.bb")
	public double x;

	@ObfuscatedName("h.cb")
	public final int t2;

	@ObfuscatedName("h.o")
	public final SeqType anim;

	@ObfuscatedName("h.s")
	public final int t1;

	@ObfuscatedName("h.t")
	public int field1372 = -32768;

	@ObfuscatedName("h.u")
	public double velocityZ;

	@ObfuscatedName("h.v")
	public double velocity;

	@ObfuscatedName("h.w")
	public double y;

	@ObfuscatedName("h.A")
	public boolean mobile = false;

	@ObfuscatedName("h.B")
	public int animCycle = 0;

	@ObfuscatedName("h.E")
	public int animFrame = 0;

	@ObfuscatedName("h.H")
	public final int startpos;

	@ObfuscatedName("h.R")
	public final int h2;

	@ObfuscatedName("h.D")
	public final int angle;

	@ObfuscatedName("h.V")
	public final int spotanim;

	@ObfuscatedName("h.L")
	public final int level;

	@ObfuscatedName("h.J")
	public final int h1;

	@ObfuscatedName("h.W")
	public final int srcZ;

	@ObfuscatedName("h.T")
	public final int srcX;

	@ObfuscatedName("h.I")
	public final int target;

	@ObfuscatedName("h.z")
	public double velocityY;

	@ObfuscatedName("h.M")
	public double z;

	@ObfuscatedName("h.N")
	public double velocityX;

	@ObfuscatedName("h.Q")
	public double accelerationY;

	@ObfuscatedName("h.x")
	public int pitch;

	@ObfuscatedName("h.C")
	public int yaw;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.startpos = arg8;
		this.h2 = arg10;
		this.angle = arg7;
		this.spotanim = arg0;
		this.t1 = arg5;
		this.level = arg1;
		this.t2 = arg6;
		this.h1 = arg4;
		this.mobile = false;
		this.srcZ = arg3;
		this.srcX = arg2;
		this.target = arg9;
		int var12 = SpotType.list(this.spotanim).anim;
		if (var12 == -1) {
			this.anim = null;
		} else {
			this.anim = SeqType.list(var12);
		}
	}

	@ObfuscatedName("h.a(II)V")
	public void move(int arg0) {
		this.mobile = true;
		this.y += (double) arg0 * 0.5D * this.accelerationY * (double) arg0 + this.velocityY * (double) arg0;
		this.x += (double) arg0 * this.velocityX;
		this.z += this.velocityZ * (double) arg0;
		this.velocityY += (double) arg0 * this.accelerationY;
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.anim == null) {
			return;
		}
		this.animCycle += arg0;
		while (true) {
			do {
				do {
					if (this.animCycle <= this.anim.delay[this.animFrame]) {
						return;
					}
					this.animCycle -= this.anim.delay[this.animFrame];
					this.animFrame++;
				} while (this.animFrame < this.anim.frames.length);
				this.animFrame -= this.anim.loops;
			} while (this.animFrame >= 0 && this.anim.frames.length > this.animFrame);
			this.animFrame = 0;
		}
	}

	@ObfuscatedName("h.b(I)Lcg;")
	public ModelLit getTempModel() {
		SpotType var1 = SpotType.list(this.spotanim);
		ModelLit var2 = var1.getTempModel2(this.animFrame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateXAxis(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("h.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelLit var11 = this.getTempModel();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field1372 = var11.method88();
		}
	}

	@ObfuscatedName("h.b()I")
	@Override
	public int method88() {
		return this.field1372;
	}

	@ObfuscatedName("h.a(IIIII)V")
	public void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!this.mobile) {
			double var5 = (double) (arg3 - this.srcZ);
			double var7 = (double) (arg0 - this.srcX);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = var7 * (double) this.startpos / var9 + (double) this.srcX;
			this.z = (double) this.srcZ + (double) this.startpos * var5 / var9;
			this.y = this.h1;
		}
		double var11 = (double) (this.t2 + 1 - arg1);
		this.velocityZ = ((double) arg3 - this.z) / var11;
		this.velocityX = ((double) arg0 - this.x) / var11;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.angle * 0.02454369D);
		}
		this.accelerationY = ((double) arg2 - this.velocityY * var11 - this.y) * 2.0D / (var11 * var11);
	}
}
