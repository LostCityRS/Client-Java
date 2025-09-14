package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("db")
public class ClientObj extends ModelSource {

	@ObfuscatedName("db.l")
	public int index;

	@ObfuscatedName("db.m")
	public int count;

	@ObfuscatedName("db.a(I)Lfb;")
	public Model getModel() {
		ObjType obj = ObjType.get(this.index);
		return obj.getModel(this.count);
	}
}
