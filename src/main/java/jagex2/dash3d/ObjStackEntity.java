package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

@ObfuscatedName("db")
public class ObjStackEntity extends Entity {

	@ObfuscatedName("db.m")
	public int index;

	@ObfuscatedName("db.n")
	public int count;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model getModel() {
		ObjType var2 = ObjType.get(this.index);
		return var2.getModel(this.count);
	}
}
