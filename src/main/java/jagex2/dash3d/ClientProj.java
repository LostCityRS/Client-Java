package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("eb")
public class ClientProj extends ModelSource {

	@ObfuscatedName("eb.m")
	public boolean field503 = false;

	@ObfuscatedName("eb.n")
	public int field504 = 9;

	@ObfuscatedName("eb.o")
	public SpotAnimType field505;

	@ObfuscatedName("eb.p")
	public int field506;

	@ObfuscatedName("eb.q")
	public int field507;

	@ObfuscatedName("eb.r")
	public int field508;

	@ObfuscatedName("eb.s")
	public int field509;

	@ObfuscatedName("eb.t")
	public int field510;

	@ObfuscatedName("eb.u")
	public int field511;

	@ObfuscatedName("eb.v")
	public int field512;

	@ObfuscatedName("eb.w")
	public int field513;

	@ObfuscatedName("eb.x")
	public int field514;

	@ObfuscatedName("eb.y")
	public int field515;

	@ObfuscatedName("eb.z")
	public boolean field516 = false;

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
	public double field524;

	@ObfuscatedName("eb.I")
	public int field525;

	@ObfuscatedName("eb.J")
	public int field526;

	@ObfuscatedName("eb.K")
	public int field527;

	@ObfuscatedName("eb.L")
	public int field528;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg10, int arg11) {
		this.field505 = SpotAnimType.field1132[arg1];
		this.field506 = arg0;
		this.field507 = arg6;
		this.field508 = arg10;
		this.field509 = arg4;
		this.field511 = arg2;
		this.field512 = arg3;
		this.field513 = arg7;
		this.field514 = arg11;
		this.field515 = arg8;
		this.field510 = arg5;
		this.field516 = false;
	}

	@ObfuscatedName("eb.a(IIBII)V")
	public final void method133(int arg0, int arg1, int arg3, int arg4) {
		if (!this.field516) {
			double var6 = (double) (arg3 - this.field507);
			double var8 = (double) (arg0 - this.field508);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.field517 = (double) this.field507 + var6 * (double) this.field514 / var10;
			this.field518 = (double) this.field508 + var8 * (double) this.field514 / var10;
			this.field519 = this.field509;
		}
		double var12 = (double) (this.field512 + 1 - arg4);
		this.field520 = ((double) arg3 - this.field517) / var12;
		this.field521 = ((double) arg0 - this.field518) / var12;
		this.field522 = Math.sqrt(this.field520 * this.field520 + this.field521 * this.field521);
		if (!this.field516) {
			this.field523 = -this.field522 * Math.tan((double) this.field513 * 0.02454369D);
		}
		this.field524 = ((double) arg1 - this.field519 - this.field523 * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("eb.a(II)V")
	public final void method134(int arg1) {
		this.field516 = true;
		this.field517 += this.field520 * (double) arg1;
		this.field518 += this.field521 * (double) arg1;
		this.field519 += this.field523 * (double) arg1 + this.field524 * 0.5D * (double) arg1 * (double) arg1;
		this.field523 += this.field524 * (double) arg1;
		this.field525 = (int) (Math.atan2(this.field520, this.field521) * 325.949D) + 1024 & 0x7FF;
		this.field526 = (int) (Math.atan2(this.field523, this.field522) * 325.949D) & 0x7FF;
		if (this.field505.field1136 == null) {
			return;
		}
		this.field528 += arg1;
		while (this.field528 > this.field505.field1136.method384(this.field527)) {
			this.field528 -= this.field505.field1136.method384(this.field527) + 1;
			this.field527++;
			if (this.field527 >= this.field505.field1136.field1113) {
				this.field527 = 0;
			}
		}
	}

	@ObfuscatedName("eb.a(I)Lfb;")
	public final Model method123() {
		Model var2 = this.field505.method388();
		if (var2 == null) {
			return null;
		}
		int var3 = -1;
		if (this.field505.field1136 != null) {
			var3 = this.field505.field1136.field1114[this.field527];
		}
		Model var4 = new Model(AnimFrame.method62(var3), false, true, var2);
		if (var3 != -1) {
			var4.method146();
			var4.method147(var3);
			var4.field571 = null;
			var4.field570 = null;
		}
		if (this.field505.field1139 != 128 || this.field505.field1140 != 128) {
			var4.method155(this.field505.field1139, this.field505.field1139, this.field505.field1140);
		}
		var4.method151(this.field526);
		var4.method156(this.field505.field1142 + 64, this.field505.field1143 + 850, -30, -50, -30, true);
		return var4;
	}
}
