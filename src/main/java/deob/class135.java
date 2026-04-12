package deob;

@ObfuscatedName("wd")
public final class class135 extends class124 {

	@ObfuscatedName("wd.db")
	public byte[] field3308;

	@ObfuscatedName("wd.eb")
	public int field3309;

	@ObfuscatedName("wd.fb")
	public int field3310;

	@ObfuscatedName("wd.gb")
	public int field3311 = 22050;

	@ObfuscatedName("wd.a(Lqb;)Lwd;")
	public class135 method1055(class98 arg0) {
		this.field3308 = arg0.method845(this.field3308);
		this.field3311 = arg0.method842(this.field3311);
		if (this.field3310 == this.field3309) {
			this.field3309 = this.field3310 = arg0.method840(this.field3309);
		} else {
			this.field3309 = arg0.method840(this.field3309);
			this.field3310 = arg0.method840(this.field3310);
			if (this.field3310 == this.field3309) {
				this.field3309--;
			}
		}
		return this;
	}

	public class135(int arg0, byte[] arg1, int arg2, int arg3) {
		this.field3308 = arg1;
		this.field3309 = arg2;
		this.field3310 = arg3;
	}
}
