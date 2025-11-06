package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("db")
public class ClientObj extends ModelSource {

	@ObfuscatedName("db.m")
	public int field501;

	@ObfuscatedName("db.n")
	public int field502;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model method123(int arg0) {
		ObjType var2 = ObjType.method350(this.field501);
		if (arg0 != 45160) {
			throw new NullPointerException();
		}
		return var2.method354(this.field502);
	}
}
