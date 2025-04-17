package deob;

@ObfuscatedName("db")
public class ObjStackEntity extends Entity {

	@ObfuscatedName("db.l")
	public boolean field499 = true;

	@ObfuscatedName("db.m")
	public int field500;

	@ObfuscatedName("db.n")
	public int field501;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model method122(int arg0) {
		ObjType var2 = ObjType.method348(this.field500);
		if (arg0 != 5560) {
			this.field499 = !this.field499;
		}
		return var2.method352(this.field501);
	}
}
