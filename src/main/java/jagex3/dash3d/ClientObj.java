package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.T")
	public int field333;

	@ObfuscatedName("cb.W")
	public int field336;

	@ObfuscatedName("cb.b(B)Lod;")
	@Override
	public ModelLit method132() {
		return ObjType.method1092(this.field333).method470(this.field336);
	}
}
