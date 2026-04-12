package deob;

@ObfuscatedName("mc")
public final class TextureManager implements TextureProvider {

	@ObfuscatedName("mc.i")
	public LinkList field1854 = new LinkList();

	@ObfuscatedName("mc.j")
	public static int field1855 = 0;

	@ObfuscatedName("mc.l")
	public static int field1857 = 0;

	@ObfuscatedName("mc.o")
	public static int field1860 = 0;

	@ObfuscatedName("mc.p")
	public static boolean field1861 = false;

	@ObfuscatedName("mc.q")
	public static boolean field1862 = true;

	@ObfuscatedName("mc.s")
	public static int field1864 = 0;

	@ObfuscatedName("mc.t")
	public static int[] field1865 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("mc.v")
	public final Texture[] field1867;

	@ObfuscatedName("mc.F")
	public double field1877 = 1.0D;

	@ObfuscatedName("mc.D")
	public int field1875 = 128;

	@ObfuscatedName("mc.I")
	public int field1880 = 0;

	@ObfuscatedName("mc.H")
	public final int field1879 = 20;

	@ObfuscatedName("mc.E")
	public final Js5 field1876;

	@ObfuscatedName("mc.a(I)V")
	public void method691() {
		for (int var1 = 0; var1 < this.field1867.length; var1++) {
			if (this.field1867[var1] != null) {
				this.field1867[var1].method764();
			}
		}
		this.field1854 = new LinkList();
		this.field1880 = this.field1879;
	}

	@ObfuscatedName("mc.a(II)[I")
	@Override
	public int[] method692(int arg0) {
		Texture var2 = this.field1867[arg0];
		if (var2 != null) {
			if (var2.field2194 != null) {
				this.field1854.method805(var2);
				var2.field2201 = true;
				return var2.field2194;
			}
			boolean var3 = var2.method763(this.field1877, this.field1875, this.field1876);
			if (var3) {
				if (this.field1880 == 0) {
					Texture var4 = (Texture) this.field1854.method799();
					var4.method764();
				} else {
					this.field1880--;
				}
				this.field1854.method805(var2);
				var2.field2201 = true;
				return var2.field2194;
			}
		}
		return null;
	}

	@ObfuscatedName("mc.a(ZI)I")
	@Override
	public int method693(int arg0) {
		return this.field1867[arg0] == null ? 0 : this.field1867[arg0].field2192;
	}

	@ObfuscatedName("mc.a(BI)Z")
	@Override
	public boolean method695(int arg0) {
		return this.field1867[arg0].field2198;
	}

	@ObfuscatedName("mc.a(ID)V")
	public void method696(double arg0) {
		this.field1877 = arg0;
		this.method691();
	}

	@ObfuscatedName("mc.b(BI)V")
	public void method697(int arg0) {
		for (int var2 = 0; var2 < this.field1867.length; var2++) {
			Texture var3 = this.field1867[var2];
			if (var3 != null && var3.field2191 != 0 && var3.field2201) {
				var3.method762(arg0);
				var3.field2201 = false;
			}
		}
	}

	@ObfuscatedName("mc.a(IB)Z")
	@Override
	public boolean method698(int arg0) {
		return this.field1875 == 64;
	}

	public TextureManager(Js5 arg0, Js5 arg1, int arg2, double arg3, int arg4) {
		this.field1876 = arg1;
		this.field1877 = arg3;
		this.field1875 = arg4;
		this.field1880 = this.field1879;
		int[] var7 = arg0.method237(0);
		int var8 = var7.length;
		this.field1867 = new Texture[arg0.method235(0)];
		for (int var9 = 0; var9 < var8; var9++) {
			Packet var10 = new Packet(arg0.method217(var7[var9], 0));
			this.field1867[var7[var9]] = new Texture(var10);
		}
	}
}
