package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.ObjType;

@ObfuscatedName("kb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("kb.p")
	public int field2022 = -32768;

	@ObfuscatedName("kb.w")
	public int count;

	@ObfuscatedName("kb.x")
	public int id;

	@ObfuscatedName("kb.b()I")
	@Override
	public int method88() {
		return this.field2022;
	}

	@ObfuscatedName("kb.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelLit var11 = ObjType.list(this.id).getModelLit(this.count, 0, null);
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field2022 = var11.method88();
		}
	}
}
