package deob;

@ObfuscatedName("qb")
public class DoublyLinkList {

	@ObfuscatedName("qb.a")
	public boolean field751 = false;

	@ObfuscatedName("qb.b")
	public int field752 = 826;

	@ObfuscatedName("qb.c")
	public DoublyLinkable field753 = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable field754;

	public DoublyLinkList(int arg0) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		this.field753.field396 = this.field753;
		this.field753.field397 = this.field753;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method262(DoublyLinkable arg0) {
		if (arg0.field397 != null) {
			arg0.method120();
		}
		arg0.field397 = this.field753.field397;
		arg0.field396 = this.field753;
		arg0.field397.field396 = arg0;
		arg0.field396.field397 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable method263() {
		DoublyLinkable var1 = this.field753.field396;
		if (this.field753 == var1) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable method264() {
		DoublyLinkable var1 = this.field753.field396;
		if (this.field753 == var1) {
			this.field754 = null;
			return null;
		} else {
			this.field754 = var1.field396;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable method265(int arg0) {
		DoublyLinkable var2 = this.field754;
		while (arg0 >= 0) {
			this.field751 = !this.field751;
		}
		if (this.field753 == var2) {
			this.field754 = null;
			return null;
		} else {
			this.field754 = var2.field396;
			return var2;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method266() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.field753.field396; var2 != this.field753; var2 = var2.field396) {
			var1++;
		}
		return var1;
	}
}
