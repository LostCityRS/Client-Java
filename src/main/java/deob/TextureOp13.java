package deob;

@ObfuscatedName("ta")
public final class TextureOp13 extends TextureOp {

	public TextureOp13() {
		super(0, true);
	}

	@ObfuscatedName("ta.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			for (int var4 = 0; var4 < Statics.field1276; var4++) {
				var2[var4] = this.method1426(var3, Statics.field351[var4]) % 4096;
			}
		}
		return var2;
	}

	@ObfuscatedName("ta.a(IIB)I")
	public int method1426(int arg0, int arg1) {
		int var3 = arg1 + arg0 * 57;
		int var4 = var3 ^ var3 << 1;
		return 4096 - ((var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
