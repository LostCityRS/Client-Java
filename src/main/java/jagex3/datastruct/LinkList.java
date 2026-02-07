package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public final class LinkList {

	@ObfuscatedName("wd.d")
	public final Linkable field3581 = new Linkable();

	@ObfuscatedName("wd.z")
	public Linkable field3603;

	public LinkList() {
		this.field3581.field3316 = this.field3581;
		this.field3581.field3320 = this.field3581;
	}

	@ObfuscatedName("wd.a(B)V")
	public void clear() {
		while (true) {
			Linkable var1 = this.field3581.field3320;
			if (var1 == this.field3581) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("wd.b(B)Lv;")
	public Linkable method1206() {
		Linkable var1 = this.field3581.field3316;
		if (this.field3581 == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(ILv;)V")
	public void method1207(Linkable arg0) {
		if (arg0.field3316 != null) {
			arg0.unlink();
		}
		arg0.field3320 = this.field3581.field3320;
		arg0.field3316 = this.field3581;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.a(I)Lv;")
	public Linkable method1208() {
		Linkable var1 = this.field3603;
		if (this.field3581 == var1) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3316;
			return var1;
		}
	}

	@ObfuscatedName("wd.b(I)Lv;")
	public Linkable method1209() {
		Linkable var1 = this.field3603;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3320;
			return var1;
		}
	}

	@ObfuscatedName("wd.c(I)Lv;")
	public Linkable method1211() {
		Linkable var1 = this.field3581.field3320;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3320;
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;B)V")
	public void method1214(Linkable arg0) {
		if (arg0.field3316 != null) {
			arg0.unlink();
		}
		arg0.field3316 = this.field3581.field3316;
		arg0.field3320 = this.field3581;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.c(B)Lv;")
	public Linkable method1215() {
		Linkable var1 = this.field3581.field3320;
		if (var1 == this.field3581) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("wd.a(Lv;Lv;I)V")
	public void method1216(Linkable arg0, Linkable arg1) {
		if (arg0.field3316 != null) {
			arg0.unlink();
		}
		arg0.field3316 = arg1.field3316;
		arg0.field3320 = arg1;
		arg0.field3316.field3320 = arg0;
		arg0.field3320.field3316 = arg0;
	}

	@ObfuscatedName("wd.e(I)Lv;")
	public Linkable method1220() {
		Linkable var1 = this.field3581.field3316;
		if (var1 == this.field3581) {
			this.field3603 = null;
			return null;
		} else {
			this.field3603 = var1.field3316;
			return var1;
		}
	}
}
