package deob;

@ObfuscatedName("ff")
public final class class62 extends class23 {

	@ObfuscatedName("ff.ab")
	public static class144 field1146;

	@ObfuscatedName("ff.bb")
	public static final int field1147 = 4;

	@ObfuscatedName("ff.cb")
	public static final int[] field1148 = new int[field1147];

	@ObfuscatedName("ff.db")
	public static final class13[][] field1149 = new class13[field1147][500];

	@ObfuscatedName("ff.eb")
	public static int field1150 = 0;

	@ObfuscatedName("ff.fb")
	public static class163 field1151;

	@ObfuscatedName("ff.X")
	public static final class88 field1143 = class208.method1423(105, "logo");

	@ObfuscatedName("ff.U")
	public static class248 field1140 = new class248();

	@ObfuscatedName("ff.Z")
	public static final class88 field1145 = class208.method1423(105, "Geben Sie Ihren Benutzernamen");

	@ObfuscatedName("ff.Y")
	public static final class88 field1144 = class208.method1423(105, "and choose the (Wcreate account(W");

	@ObfuscatedName("ff.gb")
	public static class88 field1152 = field1144;

	@ObfuscatedName("ff.Q")
	public int field1136 = 4096;

	@ObfuscatedName("ff.T")
	public int field1139 = 0;

	@ObfuscatedName("ff.R")
	public static int[][][] field1137;

	@ObfuscatedName("ff.c(IB)Lcj;")
	public static class33 method441(int arg0) {
		class33 var1 = (class33) class137.field2533.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class59.field1114.method939(class118.method799(arg0), class142.method928(arg0));
		class33 var3 = new class33();
		var3.field539 = arg0;
		if (var2 != null) {
			var3.method211(new class46(var2));
		}
		class137.field2533.method663((long) arg0, var3);
		return var3;
	}

	public class62() {
		super(1, true);
	}

	@ObfuscatedName("ff.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				int var5 = var3[var4];
				var2[var4] = var5 >= this.field1139 && var5 <= this.field1136 ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("ff.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1139 = arg0.method301();
		} else if (arg1 == 1) {
			this.field1136 = arg0.method301();
		}
	}
}
