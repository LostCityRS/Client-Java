package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.ObjType;

@ObfuscatedName("je")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("je.bc")
	public int field1499;

	@ObfuscatedName("je.Sb")
	public int field1490;

	@ObfuscatedName("je.f(I)Lpa;")
	@Override
	public Model method41() {
		return ObjType.method760(this.field1499).method954(true, this.field1490);
	}
}
