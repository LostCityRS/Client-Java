package deob;

@ObfuscatedName("b")
public final class class12 {

	@ObfuscatedName("b.a")
	public final TextureOp[] field168;

	@ObfuscatedName("b.c")
	public final TextureOp field170;

	@ObfuscatedName("b.f")
	public final int[] field173;

	@ObfuscatedName("b.l")
	public final TextureOp field179;

	@ObfuscatedName("b.q")
	public final int[] field184;

	public class12() {
		this.field173 = new int[0];
		this.field184 = new int[0];
		this.field179 = new TextureOp0();
		this.field179.field363 = 1;
		this.field170 = new TextureOp0();
		this.field168 = new TextureOp[] { this.field179, this.field170 };
		this.field170.field363 = 1;
	}

	public class12(Packet arg0) {
		int var2 = arg0.g1();
		this.field168 = new TextureOp[var2];
		int var3 = 0;
		int var4 = 0;
		int[][] var5 = new int[var2][];
		for (int var6 = 0; var6 < var2; var6++) {
			TextureOp var7 = Statics.method674(arg0);
			if (var7.method124() >= 0) {
				var4++;
			}
			if (var7.method129() >= 0) {
				var3++;
			}
			int var8 = var7.field376.length;
			var5[var6] = new int[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				var5[var6][var9] = arg0.g1();
			}
			this.field168[var6] = var7;
		}
		this.field173 = new int[var4];
		this.field184 = new int[var3];
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < var2; var12++) {
			TextureOp var13 = this.field168[var12];
			int var14 = var13.field376.length;
			for (int var15 = 0; var15 < var14; var15++) {
				var13.field376[var15] = this.field168[var5[var12][var15]];
			}
			int var16 = var13.method124();
			int var17 = var13.method129();
			if (var16 > 0) {
				this.field173[var10++] = var16;
			}
			if (var17 > 0) {
				this.field184[var11++] = var17;
			}
			var5[var12] = null;
		}
		this.field179 = this.field168[arg0.g1()];
		this.field170 = this.field168[arg0.g1()];
	}

	@ObfuscatedName("b.a(DIZLnb;Lfe;IIZ)[I")
	public int[] method60(double arg0, int arg1, boolean arg2, Js5 arg3, class61 arg4, int arg5, boolean arg6) {
		Statics.method282(arg0);
		Statics.field4488 = arg4;
		Statics.field684 = arg3;
		Statics.method802(arg1, arg5);
		for (int var9 = 0; var9 < this.field168.length; var9++) {
			this.field168[var9].method128(arg1, arg5);
		}
		int[] var10 = new int[arg5 * arg1];
		int var11;
		int var12;
		byte var13;
		if (arg6) {
			var11 = -1;
			var12 = arg1 - 1;
			var13 = -1;
		} else {
			var12 = 0;
			var11 = arg1;
			var13 = 1;
		}
		int var14 = 0;
		for (int var15 = 0; var15 < arg5; var15++) {
			if (arg2) {
				var14 = var15;
			}
			int[] var17;
			int[] var18;
			int[] var19;
			if (this.field179.field369) {
				int[] var20 = this.field179.method54(var15);
				var18 = var20;
				var17 = var20;
				var19 = var20;
			} else {
				int[][] var16 = this.field179.method7(var15);
				var17 = var16[1];
				var18 = var16[0];
				var19 = var16[2];
			}
			for (int var21 = var12; var21 != var11; var21 += var13) {
				int var22 = var18[var21] >> 4;
				if (var22 > 255) {
					var22 = 255;
				}
				if (var22 < 0) {
					var22 = 0;
				}
				int var23 = IfType.field3507[var22];
				int var24 = var17[var21] >> 4;
				if (var24 > 255) {
					var24 = 255;
				}
				int var25 = var19[var21] >> 4;
				if (var24 < 0) {
					var24 = 0;
				}
				if (var25 > 255) {
					var25 = 255;
				}
				int var26 = IfType.field3507[var24];
				if (var25 < 0) {
					var25 = 0;
				}
				int var27 = IfType.field3507[var25];
				var10[var14++] = var27 + (var26 << 8) + (var23 << 16);
				if (arg2) {
					var14 += arg1 - 1;
				}
			}
		}
		for (int var28 = 0; var28 < this.field168.length; var28++) {
			this.field168[var28].method127();
		}
		return var10;
	}

	@ObfuscatedName("b.a(Lfe;Lnb;I)Z")
	public boolean method63(class61 arg0, Js5 arg1) {
		for (int var3 = 0; var3 < this.field173.length; var3++) {
			if (!arg1.method953(this.field173[var3])) {
				return false;
			}
		}
		for (int var4 = 0; var4 < this.field184.length; var4++) {
			if (!arg0.method439(this.field184[var4])) {
				return false;
			}
		}
		return true;
	}
}
