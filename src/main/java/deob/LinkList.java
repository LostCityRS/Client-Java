package deob;

@ObfuscatedName("pb")
public final class LinkList {

	@ObfuscatedName("pb.f")
	public final Linkable field2276 = new Linkable();

	@ObfuscatedName("pb.n")
	public static LinkList field2284 = new LinkList();

	@ObfuscatedName("pb.r")
	public Linkable field2288;

	@ObfuscatedName("pb.w")
	public static volatile int field2293 = 0;

	@ObfuscatedName("pb.y")
	public static int field2295 = 0;

	@ObfuscatedName("pb.E")
	public static Packet field2301 = new Packet(8);

	@ObfuscatedName("pb.G")
	public static int[] field2303 = new int[1000];

	@ObfuscatedName("pb.F")
	public static PlayerModel field2302 = new PlayerModel();

	@ObfuscatedName("pb.a(B)Lnd;")
	public Linkable method799() {
		Linkable var1 = this.field2276.field2105;
		if (this.field2276 == var1) {
			return null;
		} else {
			var1.method739();
			return var1;
		}
	}

	@ObfuscatedName("pb.b(B)Lnd;")
	public Linkable method801() {
		Linkable var1 = this.field2276.field2105;
		if (this.field2276 == var1) {
			this.field2288 = null;
			return null;
		} else {
			this.field2288 = var1.field2105;
			return var1;
		}
	}

	@ObfuscatedName("pb.c(B)Lnd;")
	public Linkable method802() {
		Linkable var1 = this.field2276.field2087;
		if (this.field2276 == var1) {
			this.field2288 = null;
			return null;
		} else {
			this.field2288 = var1.field2087;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(Lnd;I)V")
	public void method804(Linkable arg0) {
		if (arg0.field2105 != null) {
			arg0.method739();
		}
		arg0.field2105 = this.field2276.field2105;
		arg0.field2087 = this.field2276;
		arg0.field2105.field2087 = arg0;
		arg0.field2087.field2105 = arg0;
	}

	@ObfuscatedName("pb.a(ILnd;)V")
	public void method805(Linkable arg0) {
		if (arg0.field2105 != null) {
			arg0.method739();
		}
		arg0.field2087 = this.field2276.field2087;
		arg0.field2105 = this.field2276;
		arg0.field2105.field2087 = arg0;
		arg0.field2087.field2105 = arg0;
	}

	@ObfuscatedName("pb.b(I)V")
	public void method806() {
		while (true) {
			Linkable var1 = this.field2276.field2087;
			if (this.field2276 == var1) {
				return;
			}
			var1.method739();
		}
	}

	public LinkList() {
		this.field2276.field2105 = this.field2276;
		this.field2276.field2087 = this.field2276;
	}

	@ObfuscatedName("pb.d(I)Lnd;")
	public Linkable method809() {
		Linkable var1 = this.field2288;
		if (this.field2276 == var1) {
			this.field2288 = null;
			return null;
		} else {
			this.field2288 = var1.field2087;
			return var1;
		}
	}

	@ObfuscatedName("pb.a(ILnd;Lnd;)V")
	public void method811(Linkable arg0, Linkable arg1) {
		if (arg1.field2105 != null) {
			arg1.method739();
		}
		arg1.field2087 = arg0;
		arg1.field2105 = arg0.field2105;
		arg1.field2105.field2087 = arg1;
		arg1.field2087.field2105 = arg1;
	}

	@ObfuscatedName("pb.f(I)Lnd;")
	public Linkable method812() {
		Linkable var1 = this.field2288;
		if (this.field2276 == var1) {
			this.field2288 = null;
			return null;
		} else {
			this.field2288 = var1.field2105;
			return var1;
		}
	}

	@ObfuscatedName("pb.g(I)Lnd;")
	public Linkable method813() {
		Linkable var1 = this.field2276.field2087;
		if (this.field2276 == var1) {
			return null;
		} else {
			var1.method739();
			return var1;
		}
	}
}
