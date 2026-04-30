package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("d")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("d.ac")
	public int animCycle = 0;

	@ObfuscatedName("d.bc")
	public final int t1;

	@ObfuscatedName("d.dc")
	public int pitch;

	@ObfuscatedName("d.hc")
	public double x;

	@ObfuscatedName("d.ic")
	public final int level;

	@ObfuscatedName("d.jc")
	public int animFrame = 0;

	@ObfuscatedName("d.lc")
	public final int srcZ;

	@ObfuscatedName("d.qc")
	public final int startpos;

	@ObfuscatedName("d.tc")
	public double y;

	@ObfuscatedName("d.uc")
	public double z;

	@ObfuscatedName("d.wc")
	public double velocity;

	@ObfuscatedName("d.Vb")
	public boolean mobile = false;

	@ObfuscatedName("d.Lb")
	public final int srcX;

	@ObfuscatedName("d.Kb")
	public final int h1;

	@ObfuscatedName("d.Nb")
	public final int field617;

	@ObfuscatedName("d.Pb")
	public final int spotanim;

	@ObfuscatedName("d.Yb")
	public final int t2;

	@ObfuscatedName("d.Ob")
	public final int target;

	@ObfuscatedName("d.yc")
	public final int angle;

	@ObfuscatedName("d.Hc")
	public final SeqType anim;

	@ObfuscatedName("d.Zb")
	public double velocityY;

	@ObfuscatedName("d.xc")
	public double accelerationY;

	@ObfuscatedName("d.Cc")
	public double velocityZ;

	@ObfuscatedName("d.Mc")
	public double velocityX;

	@ObfuscatedName("d.Oc")
	public int yaw;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.srcX = arg2;
		this.h1 = arg4;
		this.mobile = false;
		this.field617 = arg10;
		this.startpos = arg8;
		this.spotanim = arg0;
		this.level = arg1;
		this.t2 = arg6;
		this.t1 = arg5;
		this.target = arg9;
		this.srcZ = arg3;
		this.angle = arg7;
		int var12 = SpotType.list(this.spotanim).anim;
		if (var12 == -1) {
			this.anim = null;
		} else {
			this.anim = SeqType.list(var12);
		}
	}

	@ObfuscatedName("d.f(I)Lpa;")
	@Override
	public Model getTempModel() {
		SpotType var1 = SpotType.list(this.spotanim);
		Model var2 = var1.getTempModel2(this.animFrame);
		if (var2 == null) {
			return null;
		} else {
			var2.method772(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("d.b(II)V")
	public void move(int arg0) {
		this.mobile = true;
		this.z += (double) arg0 * this.velocityZ;
		this.x += (double) arg0 * this.velocityX;
		this.y += this.accelerationY * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.velocityY;
		this.velocityY += (double) arg0 * this.accelerationY;
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.anim == null) {
			return;
		}
		this.animCycle += arg0;
		while (this.anim.delay[this.animFrame] < this.animCycle) {
			this.animCycle -= this.anim.delay[this.animFrame];
			this.animFrame++;
			if (this.anim.frames.length <= this.animFrame) {
				this.animFrame = 0;
			}
		}
	}

	@ObfuscatedName("d.a(IIIII)V")
	public void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!this.mobile) {
			double var5 = (double) (arg3 - this.srcX);
			double var7 = (double) (arg1 - this.srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double) this.startpos * var5 / var9 + (double) this.srcX;
			this.z = (double) this.startpos * var7 / var9 + (double) this.srcZ;
			this.y = this.h1;
		}
		double var11 = (double) (this.t2 + 1 - arg0);
		this.velocityZ = ((double) arg1 - this.z) / var11;
		this.velocityX = ((double) arg3 - this.x) / var11;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.angle * 0.02454369D);
		}
		this.accelerationY = ((double) arg2 - this.y - this.velocityY * var11) * 2.0D / (var11 * var11);
	}
}
