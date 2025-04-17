package deob;

@ObfuscatedName("pb")
public class LinkList {

	@ObfuscatedName("pb.a")
	public boolean field748 = true;

	@ObfuscatedName("pb.b")
	public Linkable field749 = new Linkable();

	@ObfuscatedName("pb.c")
	public Linkable field750;

	public LinkList(byte arg0) {
		this.field749.field370 = this.field749;
		if (arg0 == 7) {
			boolean var2 = false;
		} else {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field749.field371 = this.field749;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method254(Linkable arg0) {
		if (arg0.field371 != null) {
			arg0.method119();
		}
		arg0.field371 = this.field749.field371;
		arg0.field370 = this.field749;
		arg0.field371.field370 = arg0;
		arg0.field370.field371 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;B)V")
	public void method255(Linkable arg0, byte arg1) {
		if (arg0.field371 != null) {
			arg0.method119();
		}
		arg0.field371 = this.field749;
		arg0.field370 = this.field749.field370;
		if (arg1 == 80) {
			arg0.field371.field370 = arg0;
			arg0.field370.field371 = arg0;
		}
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable method256() {
		Linkable var1 = this.field749.field370;
		if (this.field749 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public Linkable method257() {
		Linkable var1 = this.field749.field370;
		if (this.field749 == var1) {
			this.field750 = null;
			return null;
		} else {
			this.field750 = var1.field370;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public Linkable method258(byte arg0) {
		Linkable var2 = this.field749.field371;
		if (arg0 != 6) {
			throw new NullPointerException();
		}
		boolean var3 = false;
		if (this.field749 == var2) {
			this.field750 = null;
			return null;
		} else {
			this.field750 = var2.field371;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable method259(int arg0) {
		Linkable var2 = this.field750;
		if (arg0 >= 0) {
			throw new NullPointerException();
		} else if (this.field749 == var2) {
			this.field750 = null;
			return null;
		} else {
			this.field750 = var2.field370;
			return var2;
		}
	}

	@ObfuscatedName("pb.a(Z)Lv;")
	public Linkable method260(boolean arg0) {
		Linkable var2 = this.field750;
		if (this.field749 == var2) {
			this.field750 = null;
			return null;
		}
		this.field750 = var2.field371;
		if (arg0) {
			throw new NullPointerException();
		}
		return var2;
	}

	@ObfuscatedName("pb.c()V")
	public void method261() {
		while (true) {
			Linkable var1 = this.field749.field370;
			if (this.field749 == var1) {
				return;
			}
			var1.method119();
		}
	}
}
