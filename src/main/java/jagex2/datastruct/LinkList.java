package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public class LinkList {

	@ObfuscatedName("pb.a")
	public int field741;

	@ObfuscatedName("pb.b")
	public boolean field742 = false;

	@ObfuscatedName("pb.c")
	public Linkable field743 = new Linkable();

	@ObfuscatedName("pb.d")
	public Linkable field744;

	public LinkList(boolean arg0) {
		if (arg0) {
			this.field741 = -32;
		}
		this.field743.field375 = this.field743;
		this.field743.field376 = this.field743;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void method255(Linkable arg0) {
		if (arg0.field376 != null) {
			arg0.method120();
		}
		arg0.field376 = this.field743.field376;
		arg0.field375 = this.field743;
		arg0.field376.field375 = arg0;
		arg0.field375.field376 = arg0;
	}

	@ObfuscatedName("pb.a(Lv;I)V")
	public void method256(Linkable arg0, int arg1) {
		if (arg0.field376 != null) {
			arg0.method120();
		}
		arg0.field376 = this.field743;
		arg0.field375 = this.field743.field375;
		arg0.field376.field375 = arg0;
		while (arg1 >= 0) {
			this.field742 = !this.field742;
		}
		arg0.field375.field376 = arg0;
		if (Linkable.field377) {
		}
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable method257() {
		Linkable var1 = this.field743.field375;
		if (var1 == this.field743) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
	public Linkable method258() {
		Linkable var1 = this.field743.field375;
		if (var1 == this.field743) {
			this.field744 = null;
			return null;
		} else {
			this.field744 = var1.field375;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(B)Lv;")
	public Linkable method259(byte arg0) {
		if (arg0 != 2) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Linkable var3 = this.field743.field376;
		if (var3 == this.field743) {
			this.field744 = null;
			return null;
		} else {
			this.field744 = var3.field376;
			return var3;
		}
	}

	@ObfuscatedName("pb.a(I)Lv;")
	public Linkable method260(int arg0) {
		Linkable var2 = this.field744;
		if (var2 == this.field743) {
			this.field744 = null;
			return null;
		}
		this.field744 = var2.field375;
		if (arg0 != 6) {
			this.field742 = !this.field742;
		}
		return var2;
	}

	@ObfuscatedName("pb.b(I)Lv;")
	public Linkable method261(int arg0) {
		Linkable var2 = this.field744;
		if (arg0 != 0) {
			this.field741 = -273;
		}
		if (var2 == this.field743) {
			this.field744 = null;
			return null;
		} else {
			this.field744 = var2.field376;
			return var2;
		}
	}

	@ObfuscatedName("pb.c()V")
	public void method262() {
		while (true) {
			Linkable var1 = this.field743.field375;
			if (var1 == this.field743) {
				return;
			}
			var1.method120();
		}
	}
}
