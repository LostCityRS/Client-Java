package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.T")
	public int id;

	@ObfuscatedName("cb.W")
	public int count;

	@ObfuscatedName("cb.b(B)Lod;")
	@Override
	public ModelLit getTempModel() {
		return ObjType.list(this.id).getModelLit(this.count);
	}
}
