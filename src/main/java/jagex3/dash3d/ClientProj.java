package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("sc")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("sc.eb")
	public int field2942 = 0;

	@ObfuscatedName("sc.gb")
	public boolean field2944 = false;

	@ObfuscatedName("sc.hb")
	public final int field2945;

	@ObfuscatedName("sc.ib")
	public double field2946;

	@ObfuscatedName("sc.kb")
	public final int field2948;

	@ObfuscatedName("sc.lb")
	public double field2949;

	@ObfuscatedName("sc.nb")
	public double field2951;

	@ObfuscatedName("sc.ob")
	public double field2952;

	@ObfuscatedName("sc.pb")
	public final int field2953;

	@ObfuscatedName("sc.rb")
	public int field2955 = 0;

	@ObfuscatedName("sc.sb")
	public double field2956;

	@ObfuscatedName("sc.tb")
	public int field2957;

	@ObfuscatedName("sc.ub")
	public final SeqType field2958;

	@ObfuscatedName("sc.vb")
	public double field2959;

	@ObfuscatedName("sc.wb")
	public final int field2960;

	@ObfuscatedName("sc.Cb")
	public final int field2966;

	@ObfuscatedName("sc.Z")
	public final int field2937;

	@ObfuscatedName("sc.X")
	public final int field2935;

	@ObfuscatedName("sc.T")
	public final int field2931;

	@ObfuscatedName("sc.zb")
	public final int field2963;

	@ObfuscatedName("sc.Db")
	public final int field2967;

	@ObfuscatedName("sc.U")
	public final int field2932;

	@ObfuscatedName("sc.V")
	public double field2933;

	@ObfuscatedName("sc.W")
	public double field2934;

	@ObfuscatedName("sc.Eb")
	public int field2968;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.field2966 = arg8;
		this.field2937 = arg3;
		this.field2935 = arg1;
		this.field2931 = arg4;
		this.field2960 = arg9;
		this.field2945 = arg7;
		this.field2953 = arg0;
		this.field2963 = arg5;
		this.field2948 = arg6;
		this.field2944 = false;
		this.field2967 = arg2;
		this.field2932 = arg10;
		int var12 = SpotType.method316(this.field2953).field3096;
		if (var12 == -1) {
			this.field2958 = null;
		} else {
			this.field2958 = SeqType.method760(var12);
		}
	}

	@ObfuscatedName("sc.b(II)V")
	public void method988(int arg0) {
		this.field2949 += this.field2956 * (double) arg0;
		this.field2944 = true;
		this.field2952 += this.field2934 * 0.5D * (double) arg0 * (double) arg0 + this.field2946 * (double) arg0;
		this.field2946 += (double) arg0 * this.field2934;
		this.field2951 += (double) arg0 * this.field2933;
		this.field2968 = (int) (Math.atan2(this.field2956, this.field2933) * 325.949D) + 1024 & 0x7FF;
		this.field2957 = (int) (Math.atan2(this.field2946, this.field2959) * 325.949D) & 0x7FF;
		if (this.field2958 == null) {
			return;
		}
		this.field2942 += arg0;
		while (true) {
			do {
				do {
					if (this.field2942 <= this.field2958.field3376[this.field2955]) {
						return;
					}
					this.field2942 -= this.field2958.field3376[this.field2955];
					this.field2955++;
				} while (this.field2955 < this.field2958.field3393.length);
				this.field2955 -= this.field2958.field3386;
			} while (this.field2955 >= 0 && this.field2958.field3393.length > this.field2955);
			this.field2955 = 0;
		}
	}

	@ObfuscatedName("sc.b(B)Lod;")
	@Override
	public ModelLit method132() {
		SpotType var1 = SpotType.method316(this.field2953);
		ModelLit var2 = var1.method1017(this.field2955);
		if (var2 == null) {
			return null;
		} else {
			var2.method802(this.field2957);
			return var2;
		}
	}

	@ObfuscatedName("sc.a(IIBII)V")
	public void method994(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field2944) {
			double var5 = (double) (arg1 - this.field2967);
			double var7 = (double) (arg0 - this.field2937);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field2949 = (double) this.field2967 + var5 * (double) this.field2966 / var9;
			this.field2952 = this.field2931;
			this.field2951 = (double) this.field2937 + (double) this.field2966 * var7 / var9;
		}
		double var11 = (double) (this.field2948 + 1 - arg2);
		this.field2956 = ((double) arg1 - this.field2949) / var11;
		this.field2933 = ((double) arg0 - this.field2951) / var11;
		this.field2959 = Math.sqrt(this.field2956 * this.field2956 + this.field2933 * this.field2933);
		if (!this.field2944) {
			this.field2946 = -this.field2959 * Math.tan((double) this.field2945 * 0.02454369D);
		}
		this.field2934 = ((double) arg3 - var11 * this.field2946 - this.field2952) * 2.0D / (var11 * var11);
	}
}
