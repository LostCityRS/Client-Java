package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("y")
public class ModelSource extends DoublyLinkable {

	@ObfuscatedName("y.i")
	public int field404 = 256;

	@ObfuscatedName("y.j")
	public VertexNormal[] field405;

	@ObfuscatedName("y.k")
	public int field406 = 1000;

	@ObfuscatedName("y.l")
	public static boolean field407;

	@ObfuscatedName("y.a(IIIIIIIII)V")
	public void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = this.method123(45160);
		if (var10 != null) {
			this.field406 = var10.field406;
			var10.method122(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("y.a(I)Lfb;")
	public Model method123(int arg0) {
		if (arg0 != 45160) {
			this.field404 = 422;
		}
		return null;
	}
}
