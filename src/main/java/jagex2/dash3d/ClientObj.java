package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("db")
public class ClientObj extends ModelSource {

	@ObfuscatedName("db.m")
	public int id;

	@ObfuscatedName("db.n")
	public int count;

	@ObfuscatedName("db.a(I)Lfb;")
	public Model getTempModel() {
		ObjType var2 = ObjType.get(this.id);
		return var2.getModel(this.count);
	}
}
