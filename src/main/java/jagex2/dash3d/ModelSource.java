package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("x")
public class ModelSource extends Linkable2 {

	@ObfuscatedName("x.k")
	public int minY = 1000;

	@ObfuscatedName("x.i")
	public final int field390 = 772;

	@ObfuscatedName("x.j")
	public PointNormal[] pointNormal;

	@ObfuscatedName("x.a(IIIIIIIII)V")
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = getTempModel();
		if (var10 != null) {
			minY = var10.minY;
			var10.worldRender(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("x.a(I)Leb;")
	public Model getTempModel() {
		return null;
	}
}
