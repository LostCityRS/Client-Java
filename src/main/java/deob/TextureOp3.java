package deob;

@ObfuscatedName("ce")
public final class TextureOp3 extends TextureOp {

	public TextureOp3() {
		super(0, true);
	}

	@ObfuscatedName("ce.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			ArrayUtil.method837(var2, 0, Statics.field1276, class111.field2021[arg0]);
		}
		return var2;
	}
}
