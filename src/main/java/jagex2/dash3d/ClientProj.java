package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("eb")
public class ClientProj extends ModelSource {

	@ObfuscatedName("eb.o")
	public SpotAnimType graphic;

	@ObfuscatedName("eb.p")
	public int level;

	@ObfuscatedName("eb.q")
	public int srcX;

	@ObfuscatedName("eb.r")
	public int srcZ;

	@ObfuscatedName("eb.s")
	public int srcY;

	@ObfuscatedName("eb.t")
	public int dstHeight;

	@ObfuscatedName("eb.u")
	public int startCycle;

	@ObfuscatedName("eb.v")
	public int endCycle;

	@ObfuscatedName("eb.w")
	public int peak;

	@ObfuscatedName("eb.x")
	public int arc;

	@ObfuscatedName("eb.y")
	public int target;

	@ObfuscatedName("eb.z")
	public boolean mobile = false;

	@ObfuscatedName("eb.A")
	public double x;

	@ObfuscatedName("eb.B")
	public double z;

	@ObfuscatedName("eb.C")
	public double y;

	@ObfuscatedName("eb.D")
	public double velocityX;

	@ObfuscatedName("eb.E")
	public double velocityZ;

	@ObfuscatedName("eb.F")
	public double velocity;

	@ObfuscatedName("eb.G")
	public double velocityY;

	@ObfuscatedName("eb.H")
	public double accelerationY;

	@ObfuscatedName("eb.I")
	public int yaw;

	@ObfuscatedName("eb.J")
	public int pitch;

	@ObfuscatedName("eb.K")
	public int seqFrame;

	@ObfuscatedName("eb.L")
	public int seqCycle;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg10, int arg11) {
		this.graphic = SpotAnimType.list[arg1];
		this.level = arg0;
		this.srcX = arg6;
		this.srcZ = arg10;
		this.srcY = arg4;
		this.startCycle = arg2;
		this.endCycle = arg3;
		this.peak = arg7;
		this.arc = arg11;
		this.target = arg8;
		this.dstHeight = arg5;
		this.mobile = false;
	}

	@ObfuscatedName("eb.a(IIBII)V")
	public void setTarget(int arg0, int arg1, int arg3, int arg4) {
		if (!this.mobile) {
			double var6 = (double) (arg3 - this.srcX);
			double var8 = (double) (arg0 - this.srcZ);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.x = (double) this.srcX + var6 * (double) this.arc / var10;
			this.z = (double) this.srcZ + var8 * (double) this.arc / var10;
			this.y = this.srcY;
		}
		double var12 = (double) (this.endCycle + 1 - arg4);
		this.velocityX = ((double) arg3 - this.x) / var12;
		this.velocityZ = ((double) arg0 - this.z) / var12;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.peak * 0.02454369D);
		}
		this.accelerationY = ((double) arg1 - this.y - this.velocityY * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("eb.a(II)V")
	public void move(int arg1) {
		this.mobile = true;
		this.x += this.velocityX * (double) arg1;
		this.z += this.velocityZ * (double) arg1;
		this.y += this.velocityY * (double) arg1 + this.accelerationY * 0.5D * (double) arg1 * (double) arg1;
		this.velocityY += this.accelerationY * (double) arg1;
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.graphic.seq != null) {
			this.seqCycle += arg1;
			while (this.seqCycle > this.graphic.seq.getDuration(this.seqFrame)) {
				this.seqCycle -= this.graphic.seq.getDuration(this.seqFrame) + 1;
				this.seqFrame++;
				if (this.seqFrame >= this.graphic.seq.numFrames) {
					this.seqFrame = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public Model getTempModel() {
		Model var2 = this.graphic.getTempModel();
		if (var2 == null) {
			return null;
		}
		int var3 = -1;
		if (this.graphic.seq != null) {
			var3 = this.graphic.seq.frames[this.seqFrame];
		}
		Model var4 = new Model(AnimFrame.shareAlpha(var3), false, true, var2);
		if (var3 != -1) {
			var4.prepareAnim();
			var4.animate(var3);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.graphic.resizeh != 128 || this.graphic.resizev != 128) {
			var4.resize(this.graphic.resizeh, this.graphic.resizeh, this.graphic.resizev);
		}
		var4.rotateXAxis(this.pitch);
		var4.calculateNormals(this.graphic.ambient + 64, this.graphic.contrast + 850, -30, -50, -30, true);
		return var4;
	}
}
