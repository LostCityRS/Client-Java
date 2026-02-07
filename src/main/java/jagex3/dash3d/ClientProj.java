package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("sc")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("sc.eb")
	public int animCycle = 0;

	@ObfuscatedName("sc.gb")
	public boolean mobile = false;

	@ObfuscatedName("sc.hb")
	public final int angle;

	@ObfuscatedName("sc.ib")
	public double velocityY;

	@ObfuscatedName("sc.kb")
	public final int t2;

	@ObfuscatedName("sc.lb")
	public double x;

	@ObfuscatedName("sc.nb")
	public double z;

	@ObfuscatedName("sc.ob")
	public double y;

	@ObfuscatedName("sc.pb")
	public final int spotanim;

	@ObfuscatedName("sc.rb")
	public int animFrame = 0;

	@ObfuscatedName("sc.sb")
	public double velocityX;

	@ObfuscatedName("sc.tb")
	public int pitch;

	@ObfuscatedName("sc.ub")
	public final SeqType anim;

	@ObfuscatedName("sc.vb")
	public double velocity;

	@ObfuscatedName("sc.wb")
	public final int field2960;

	@ObfuscatedName("sc.Cb")
	public final int startPos;

	@ObfuscatedName("sc.Z")
	public final int srcZ;

	@ObfuscatedName("sc.X")
	public final int field2935;

	@ObfuscatedName("sc.T")
	public final int h1;

	@ObfuscatedName("sc.zb")
	public final int field2963;

	@ObfuscatedName("sc.Db")
	public final int srcX;

	@ObfuscatedName("sc.U")
	public final int field2932;

	@ObfuscatedName("sc.V")
	public double velocityZ;

	@ObfuscatedName("sc.W")
	public double accelerationY;

	@ObfuscatedName("sc.Eb")
	public int yaw;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.startPos = arg8;
		this.srcZ = arg3;
		this.field2935 = arg1;
		this.h1 = arg4;
		this.field2960 = arg9;
		this.angle = arg7;
		this.spotanim = arg0;
		this.field2963 = arg5;
		this.t2 = arg6;
		this.mobile = false;
		this.srcX = arg2;
		this.field2932 = arg10;
		int var12 = SpotType.list(this.spotanim).anim;
		if (var12 == -1) {
			this.anim = null;
		} else {
			this.anim = SeqType.list(var12);
		}
	}

	@ObfuscatedName("sc.b(II)V")
	public void move(int arg0) {
		this.x += this.velocityX * (double) arg0;
		this.mobile = true;
		this.y += this.accelerationY * 0.5D * (double) arg0 * (double) arg0 + this.velocityY * (double) arg0;
		this.velocityY += (double) arg0 * this.accelerationY;
		this.z += (double) arg0 * this.velocityZ;
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

	@ObfuscatedName("sc.b(B)Lod;")
	@Override
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

	@ObfuscatedName("sc.a(IIBII)V")
	public void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!this.mobile) {
			double var5 = (double) (arg1 - this.srcX);
			double var7 = (double) (arg0 - this.srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double) this.srcX + var5 * (double) this.startPos / var9;
			this.y = this.h1;
			this.z = (double) this.srcZ + (double) this.startPos * var7 / var9;
		}
		double var11 = (double) (this.t2 + 1 - arg2);
		this.velocityX = ((double) arg1 - this.x) / var11;
		this.velocityZ = ((double) arg0 - this.z) / var11;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.angle * 0.02454369D);
		}
		this.accelerationY = ((double) arg3 - var11 * this.velocityY - this.y) * 2.0D / (var11 * var11);
	}
}
