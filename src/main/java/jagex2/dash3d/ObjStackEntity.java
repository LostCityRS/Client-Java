package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

@ObfuscatedName("db")
public class ObjStackEntity extends Entity {

	@ObfuscatedName("db.m")
	public int field500;

	@ObfuscatedName("db.n")
	public int field501;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model getModel() {
		ObjType var2 = ObjType.get(this.field500);
		return var2.getModel(this.field501);
	}
}
