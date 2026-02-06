package deob;

@ObfuscatedName("dd")
public abstract class class26 extends class13 {

	@ObfuscatedName("dd.H")
	public static int field469 = 0;

	@ObfuscatedName("dd.K")
	public static class32 field472 = class73.method593("da dieser Computer gegen unsere ", true);

	@ObfuscatedName("dd.O")
	public static boolean field476 = false;

	@ObfuscatedName("dd.N")
	public static class32 field475 = class73.method593("m-Ochte sich mit Ihnen duellieren)3", true);

	@ObfuscatedName("dd.R")
	public static class32 field479 = class73.method593("null", true);

	@ObfuscatedName("dd.I")
	public int field470 = 1000;

	@ObfuscatedName("dd.L")
	public static int field473;

	@ObfuscatedName("dd.a(Lea;I)V")
	public static void method185(class30 arg0) {
		class73.field1715 = arg0;
	}

	@ObfuscatedName("dd.a([BBII)Lec;")
	public static class32 method186(byte[] arg0, int arg1, int arg2) {
		class32 var3 = new class32();
		var3.field674 = 0;
		var3.field618 = new byte[arg2];
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			if (arg0[var4] != 0) {
				var3.field618[var3.field674++] = arg0[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("dd.a(IIIIIIIII)V")
	public void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class101 var10 = this.method132();
		if (var10 != null) {
			this.field470 = var10.field470;
			var10.method184(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("dd.b(B)Lod;")
	public class101 method132() {
		return null;
	}
}
