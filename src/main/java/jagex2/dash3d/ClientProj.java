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

	public ClientProj(int srcY, int arc, int level, int srcZ, int endCycle, int dstHeight, int graphic, int peak, int target, int srcX, int startCycle) {
		this.graphic = SpotAnimType.types[graphic];
		this.level = level;
		this.srcX = srcX;
		this.srcZ = srcZ;
		this.srcY = srcY;
		this.startCycle = startCycle;
		this.endCycle = endCycle;
		this.peak = peak;
		this.arc = arc;
		this.target = target;
		this.dstHeight = dstHeight;
		this.mobile = false;
	}

	@ObfuscatedName("eb.a(IIIBI)V")
	public void updateVelocity(int arg0, int arg1, int arg2, int arg4) {
		if (!this.mobile) {
			double var6 = (double) (arg0 - this.srcX);
			double var8 = (double) (arg1 - this.srcZ);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.x = (double) this.srcX + var6 * (double) this.arc / var10;
			this.z = (double) this.srcZ + var8 * (double) this.arc / var10;
			this.y = this.srcY;
		}
		double var12 = (double) (this.endCycle + 1 - arg2);
		this.velocityX = ((double) arg0 - this.x) / var12;
		this.velocityZ = ((double) arg1 - this.z) / var12;
		this.velocity = Math.sqrt(this.velocityX * this.velocityX + this.velocityZ * this.velocityZ);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.peak * 0.02454369D);
		}
		this.accelerationY = ((double) arg4 - this.y - this.velocityY * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("eb.a(IB)V")
	public void update(int arg0) {
		this.mobile = true;
		this.x += this.velocityX * (double) arg0;
		this.z += this.velocityZ * (double) arg0;
		boolean var3 = false;
		this.y += this.velocityY * (double) arg0 + this.accelerationY * 0.5D * (double) arg0 * (double) arg0;
		this.velocityY += this.accelerationY * (double) arg0;
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.graphic.seq != null) {
			this.seqCycle += arg0;
			while (this.seqCycle > this.graphic.seq.getFrameLength(this.seqFrame)) {
				this.seqCycle -= this.graphic.seq.getFrameLength(this.seqFrame) + 1;
				this.seqFrame++;
				if (this.seqFrame >= this.graphic.seq.frameCount) {
					this.seqFrame = 0;
				}
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public Model getModel() {
		Model var2 = this.graphic.getModel();
		if (var2 == null) {
			return null;
		}
		Model var3 = new Model(true, var2, false, !this.graphic.animHasAlpha);
		if (this.graphic.seq != null) {
			var3.createLabelReferences();
			var3.applyFrame(this.graphic.seq.frames[this.seqFrame]);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (this.graphic.resizeh != 128 || this.graphic.resizev != 128) {
			var3.resize(this.graphic.resizeh, this.graphic.resizeh, this.graphic.resizev);
		}
		var3.rotateX(this.pitch);
		var3.calculateNormals(this.graphic.ambient + 64, this.graphic.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
