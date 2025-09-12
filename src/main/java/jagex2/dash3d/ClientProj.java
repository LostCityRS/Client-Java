package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("eb")
public class ClientProj extends ModelSource {

	@ObfuscatedName("eb.o")
	public SpotAnimType field514;

	@ObfuscatedName("eb.p")
	public int level;

	@ObfuscatedName("eb.q")
	public int field516;

	@ObfuscatedName("eb.r")
	public int field517;

	@ObfuscatedName("eb.s")
	public int field518;

	@ObfuscatedName("eb.t")
	public int offsetY;

	@ObfuscatedName("eb.u")
	public int startCycle;

	@ObfuscatedName("eb.v")
	public int endCycle;

	@ObfuscatedName("eb.w")
	public int field522;

	@ObfuscatedName("eb.x")
	public int field523;

	@ObfuscatedName("eb.y")
	public int target;

	@ObfuscatedName("eb.z")
	public boolean field525 = false;

	@ObfuscatedName("eb.A")
	public double field526;

	@ObfuscatedName("eb.B")
	public double field527;

	@ObfuscatedName("eb.C")
	public double field528;

	@ObfuscatedName("eb.D")
	public double field529;

	@ObfuscatedName("eb.E")
	public double field530;

	@ObfuscatedName("eb.F")
	public double field531;

	@ObfuscatedName("eb.G")
	public double field532;

	@ObfuscatedName("eb.H")
	public double field533;

	@ObfuscatedName("eb.I")
	public int field534;

	@ObfuscatedName("eb.J")
	public int field535;

	@ObfuscatedName("eb.K")
	public int field536;

	@ObfuscatedName("eb.L")
	public int field537;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg10, int arg11) {
		this.field514 = SpotAnimType.types[arg6];
		this.level = arg2;
		this.field516 = arg10;
		this.field517 = arg3;
		this.field518 = arg0;
		this.startCycle = arg11;
		this.endCycle = arg4;
		this.field522 = arg7;
		this.field523 = arg1;
		this.target = arg8;
		this.offsetY = arg5;
		this.field525 = false;
	}

	@ObfuscatedName("eb.a(IIIBI)V")
	public final void updateVelocity(int arg0, int arg1, int arg2, int arg4) {
		if (!this.field525) {
			double var6 = (double) (arg0 - this.field516);
			double var8 = (double) (arg1 - this.field517);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field526 = (double) this.field516 + var6 * (double) this.field523 / var10;
			this.field527 = (double) this.field517 + var8 * (double) this.field523 / var10;
			this.field528 = this.field518;
		}
		double var12 = (double) (this.endCycle + 1 - arg2);
		this.field529 = ((double) arg0 - this.field526) / var12;
		this.field530 = ((double) arg1 - this.field527) / var12;
		this.field531 = Math.sqrt(this.field529 * this.field529 + this.field530 * this.field530);
		if (!this.field525) {
			this.field532 = -this.field531 * Math.tan((double) this.field522 * 0.02454369D);
		}
		this.field533 = ((double) arg4 - this.field528 - this.field532 * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("eb.a(IB)V")
	public final void update(int arg0) {
		this.field525 = true;
		this.field526 += this.field529 * (double) arg0;
		this.field527 += this.field530 * (double) arg0;
		boolean var3 = false;
		this.field528 += this.field532 * (double) arg0 + this.field533 * 0.5D * (double) arg0 * (double) arg0;
		this.field532 += this.field533 * (double) arg0;
		this.field534 = (int) (Math.atan2(this.field529, this.field530) * 325.949D) + 1024 & 0x7FF;
		this.field535 = (int) (Math.atan2(this.field532, this.field531) * 325.949D) & 0x7FF;
		if (this.field514.seq == null) {
			return;
		}
		this.field537 += arg0;
		while (this.field537 > this.field514.seq.getFrameDuration(this.field536)) {
			this.field537 -= this.field514.seq.getFrameDuration(this.field536) + 1;
			this.field536++;
			if (this.field536 >= this.field514.seq.frameCount) {
				this.field536 = 0;
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final Model getModel() {
		Model var2 = this.field514.getModel();
		if (var2 == null) {
			return null;
		}
		Model var3 = new Model(true, var2, false, !this.field514.animHasAlpha);
		if (this.field514.seq != null) {
			var3.createLabelReferences();
			var3.applyTransform(this.field514.seq.frames[this.field536]);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (this.field514.resizeh != 128 || this.field514.resizev != 128) {
			var3.scale(this.field514.resizeh, this.field514.resizeh, this.field514.resizev);
		}
		var3.rotateX(this.field535);
		var3.calculateNormals(this.field514.ambient + 64, this.field514.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
