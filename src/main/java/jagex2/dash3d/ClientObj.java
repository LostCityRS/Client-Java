package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.n")
	public int id;

	@ObfuscatedName("cb.o")
	public int count;

	@ObfuscatedName("cb.m")
	public final boolean field495 = true;

	@ObfuscatedName("cb.a(I)Leb;")
	@Override
	public Model getTempModel() {
		ObjType var1 = ObjType.list(id);
		return var1.getModelLit(count);
	}
}
