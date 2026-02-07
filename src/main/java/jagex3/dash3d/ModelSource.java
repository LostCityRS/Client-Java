package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("dd")
public abstract class ModelSource extends Linkable2 {

	@ObfuscatedName("dd.I")
	public int field470 = 1000;

	@ObfuscatedName("dd.a(IIIIIIIII)V")
	public void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		ModelLit var10 = this.method132();
		if (var10 != null) {
			this.field470 = var10.field470;
			var10.method184(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("dd.b(B)Lod;")
	public ModelLit method132() {
		return null;
	}
}
