package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("vb")
public abstract class ModelSource extends Linkable2 {

	@ObfuscatedName("vb.yb")
	public int minY = 1000;

	@ObfuscatedName("vb.a(IIIIIIIII)V")
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = this.getTempModel();
		if (var10 != null) {
			this.minY = var10.minY;
			var10.worldRender(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("vb.f(I)Lpa;")
	public Model getTempModel() {
		return null;
	}
}
