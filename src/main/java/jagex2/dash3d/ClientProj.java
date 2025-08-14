package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("eb")
public class ClientProj extends ModelSource {

	@ObfuscatedName("eb.l")
	public boolean field502 = true;

	@ObfuscatedName("eb.m")
	public byte field503 = -2;

	@ObfuscatedName("eb.n")
	public SpotAnimType field504;

	@ObfuscatedName("eb.o")
	public int level;

	@ObfuscatedName("eb.p")
	public int field506;

	@ObfuscatedName("eb.q")
	public int field507;

	@ObfuscatedName("eb.r")
	public int field508;

	@ObfuscatedName("eb.s")
	public int offsetY;

	@ObfuscatedName("eb.t")
	public int startCycle;

	@ObfuscatedName("eb.u")
	public int endCycle;

	@ObfuscatedName("eb.v")
	public int field512;

	@ObfuscatedName("eb.w")
	public int field513;

	@ObfuscatedName("eb.x")
	public int target;

	@ObfuscatedName("eb.y")
	public boolean field515 = false;

	@ObfuscatedName("eb.z")
	public double field516;

	@ObfuscatedName("eb.A")
	public double field517;

	@ObfuscatedName("eb.B")
	public double field518;

	@ObfuscatedName("eb.C")
	public double field519;

	@ObfuscatedName("eb.D")
	public double field520;

	@ObfuscatedName("eb.E")
	public double field521;

	@ObfuscatedName("eb.F")
	public double field522;

	@ObfuscatedName("eb.G")
	public double field523;

	@ObfuscatedName("eb.H")
	public int field524;

	@ObfuscatedName("eb.I")
	public int field525;

	@ObfuscatedName("eb.J")
	public int field526;

	@ObfuscatedName("eb.K")
	public int field527;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		this.field504 = SpotAnimType.types[arg1];
		this.level = arg5;
		this.field506 = arg0;
		this.field507 = arg6;
		this.field508 = arg7;
		this.startCycle = arg9;
		this.endCycle = arg11;
		this.field512 = arg2;
		this.field513 = arg8;
		this.target = arg10;
		this.offsetY = arg3;
		this.field515 = false;
	}

	@ObfuscatedName("eb.a(IBIII)V")
	public final void updateVelocity(int arg0, int arg2, int arg3, int arg4) {
		if (!this.field515) {
			double var6 = (double) (arg3 - this.field506);
			double var8 = (double) (arg0 - this.field507);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field516 = (double) this.field513 * var6 / var10 + (double) this.field506;
			this.field517 = (double) this.field513 * var8 / var10 + (double) this.field507;
			this.field518 = this.field508;
		}
		double var12 = (double) (this.endCycle + 1 - arg4);
		this.field519 = ((double) arg3 - this.field516) / var12;
		this.field520 = ((double) arg0 - this.field517) / var12;
		this.field521 = Math.sqrt(this.field520 * this.field520 + this.field519 * this.field519);
		if (!this.field515) {
			this.field522 = -this.field521 * Math.tan((double) this.field512 * 0.02454369D);
		}
		this.field523 = ((double) arg2 - this.field518 - this.field522 * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("eb.a(II)V")
	public final void update(int arg1) {
		this.field515 = true;
		this.field516 += (double) arg1 * this.field519;
		this.field517 += (double) arg1 * this.field520;
		this.field518 += this.field523 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field522;
		this.field522 += (double) arg1 * this.field523;
		this.field524 = (int) (Math.atan2(this.field519, this.field520) * 325.949D) + 1024 & 0x7FF;
		this.field525 = (int) (Math.atan2(this.field522, this.field521) * 325.949D) & 0x7FF;
		if (this.field504.seq == null) {
			return;
		}
		this.field527 += arg1;
		while (this.field527 > this.field504.seq.getFrameDuration(this.field526)) {
			this.field527 -= this.field504.seq.getFrameDuration(this.field526) + 1;
			this.field526++;
			if (this.field526 >= this.field504.seq.numFrames) {
				this.field526 = 0;
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final Model getModel() {
		Model var2 = this.field504.getModel();
		if (var2 == null) {
			return null;
		}
		Model var4 = new Model(var2, true, false, !this.field504.animHasAlpha);
		if (this.field504.seq != null) {
			var4.createLabelReferences();
			var4.applyTransform(this.field504.seq.frames[this.field526]);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.field504.resizeh != 128 || this.field504.resizev != 128) {
			var4.scale(this.field504.resizev, this.field504.resizeh, this.field504.resizeh);
		}
		var4.rotateX(this.field525);
		var4.calculateNormals(this.field504.ambient + 64, this.field504.contrast + 850, -30, -50, -30, true);
		return var4;
	}
}
