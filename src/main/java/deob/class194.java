package deob;

@ObfuscatedName("ri")
public final class class194 extends class23 {

	@ObfuscatedName("ri.S")
	public static final int[] field3708 = new int[100];

	@ObfuscatedName("ri.R")
	public static final class88 field3707 = class208.method1423(105, "event_opbase");

	@ObfuscatedName("ri.Z")
	public static final class88 field3715 = class208.method1423(105, " loggt sich aus)3");

	@ObfuscatedName("ri.Y")
	public static final int[] field3714 = new int[5];

	@ObfuscatedName("ri.b(II)I")
	public static int method1344(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("ri.a(Lq;I)Li;")
	public static class88 method1345(class174 arg0) {
		if (class87.method592(class80.method530(arg0)) == 0) {
			return null;
		} else if (arg0.field3512 == null || arg0.field3512.method602().method604() == 0) {
			return class116.field2103 ? class126.field2321 : null;
		} else {
			return arg0.field3512;
		}
	}

	public class194() {
		super(1, false);
	}

	@ObfuscatedName("ri.b(IZI)V")
	public void method1342(int arg0, int arg1) {
		int var3 = class111.field2021[arg1];
		int var4 = class22.field351[arg0];
		float var5 = (float) Math.atan2((double) (var4 - 2048), (double) (var3 - 2048));
		if ((double) var5 >= -3.141592653589793D && (double) var5 <= -2.356194490192345D) {
			class13.field203 = arg1;
			class186.field3638 = arg0;
		} else if ((double) var5 <= -1.5707963267948966D && (double) var5 >= -2.356194490192345D) {
			class13.field203 = arg0;
			class186.field3638 = arg1;
		} else if ((double) var5 <= -0.7853981633974483D && (double) var5 >= -1.5707963267948966D) {
			class186.field3638 = class70.field1276 - arg1;
			class13.field203 = arg0;
		} else if (var5 <= 0.0F && (double) var5 >= -0.7853981633974483D) {
			class186.field3638 = arg0;
			class13.field203 = class27.field460 - arg1;
		} else if (var5 >= 0.0F && (double) var5 <= 0.7853981633974483D) {
			class186.field3638 = class70.field1276 - arg0;
			class13.field203 = class27.field460 - arg1;
		} else if ((double) var5 >= 0.7853981633974483D && (double) var5 <= 1.5707963267948966D) {
			class186.field3638 = class70.field1276 - arg1;
			class13.field203 = class27.field460 - arg0;
		} else if ((double) var5 >= 1.5707963267948966D && (double) var5 <= 2.356194490192345D) {
			class186.field3638 = arg1;
			class13.field203 = class27.field460 - arg0;
		} else if ((double) var5 >= 2.356194490192345D && (double) var5 <= 3.141592653589793D) {
			class13.field203 = arg1;
			class186.field3638 = class70.field1276 - arg0;
		}
		class13.field203 &= class220.field4158;
		class186.field3638 &= class45.field789;
	}

	@ObfuscatedName("ri.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < class70.field1276; var3++) {
				this.method1342(var3, arg0);
				int[] var4 = this.method120(class13.field203, 0);
				var2[var3] = var4[class186.field3638];
			}
		}
		return var2;
	}

	@ObfuscatedName("ri.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			super.field369 = arg0.method347() == 1;
		}
	}

	@ObfuscatedName("ri.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[1];
			int[] var5 = var2[2];
			for (int var6 = 0; var6 < class70.field1276; var6++) {
				this.method1342(var6, arg0);
				int[][] var7 = this.method121(0, class13.field203);
				var3[var6] = var7[0][class186.field3638];
				var4[var6] = var7[1][class186.field3638];
				var5[var6] = var7[2][class186.field3638];
			}
		}
		return var2;
	}
}
