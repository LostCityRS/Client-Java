package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

@ObfuscatedName("db")
public class ClientObj extends ModelSource {

	@ObfuscatedName("db.m")
	public int index;

	@ObfuscatedName("db.n")
	public int count;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model getTempModel() {
		ObjType obj = ObjType.get(this.index);
		return obj.getModel(this.count);
	}
}
