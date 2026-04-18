package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.ObjType;

@ObfuscatedName("je")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("je.bc")
	public int id;

	@ObfuscatedName("je.Sb")
	public int count;

	@ObfuscatedName("je.f(I)Lpa;")
	@Override
	public Model method41() {
		return ObjType.list(this.id).getModelLit(true, this.count);
	}
}
