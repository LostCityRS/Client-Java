package deob;

@ObfuscatedName("vb")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("ti.w")
	public static final LruCache field4047 = new LruCache(64);

	@ObfuscatedName("li.M")
	public static Js5 field2422;
	@ObfuscatedName("di.bb")
	public static Js5 field733;
	@ObfuscatedName("c.I")
	public static int field374;

	@ObfuscatedName("vb.T")
	public boolean field4337 = false;

	@ObfuscatedName("vb.V")
	public final int[] field4339 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("vb.X")
	public int field4341 = -1;

	@ObfuscatedName("vb.G")
	public int[] field4324;

	@ObfuscatedName("vb.D")
	public short[] field4321;

	@ObfuscatedName("vb.J")
	public short[] field4327;

	@ObfuscatedName("vb.M")
	public short[] field4330;

	@ObfuscatedName("vb.S")
	public short[] field4336;

	@ObfuscatedName("je.a(II)Lvb;")
	public static IdkType list(int arg0) {
		IdkType var1 = (IdkType) field4047.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2422.getFile(arg0, 3);
		IdkType var3 = new IdkType();
		if (var2 != null) {
			var3.method1546(new Packet(var2));
		}
		field4047.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("wi.d(B)V")
	public static void resetCache() {
		field4047.clear();
	}

	@ObfuscatedName("sc.a(BLnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field733 = arg0;
		field2422 = arg1;
		field374 = field2422.getFileIdLimit(3);
	}

	@ObfuscatedName("vb.d(I)Lhe;")
	public ModelUnlit method1540() {
		if (this.field4324 == null) {
			return null;
		}
		ModelUnlit[] var1 = new ModelUnlit[this.field4324.length];
		for (int var2 = 0; var2 < this.field4324.length; var2++) {
			var1[var2] = ModelUnlit.load(field733, this.field4324[var2]);
		}
		ModelUnlit var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new ModelUnlit(var1, var1.length);
		}
		if (this.field4336 != null) {
			for (int var4 = 0; var4 < this.field4336.length; var4++) {
				var3.method564(this.field4336[var4], this.field4327[var4]);
			}
		}
		if (this.field4330 != null) {
			for (int var5 = 0; var5 < this.field4330.length; var5++) {
				var3.method553(this.field4330[var5], this.field4321[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("vb.a(Lea;ZI)V")
	public void method1541(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field4341 = arg0.g1();
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.field4324 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field4324[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.field4337 = true;
		} else if (arg1 == 40) {
			int var7 = arg0.g1();
			this.field4327 = new short[var7];
			this.field4336 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field4336[var8] = (short) arg0.g2();
				this.field4327[var8] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.g1();
			this.field4321 = new short[var5];
			this.field4330 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field4330[var6] = (short) arg0.g2();
				this.field4321[var6] = (short) arg0.g2();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.field4339[arg1 - 60] = arg0.g2();
			return;
		}
	}

	@ObfuscatedName("vb.b(Z)Lhe;")
	public ModelUnlit method1543() {
		int var1 = 0;
		ModelUnlit[] var2 = new ModelUnlit[5];
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.field4339[var3] != -1) {
				var2[var1++] = ModelUnlit.load(field733, this.field4339[var3]);
			}
		}
		ModelUnlit var4 = new ModelUnlit(var2, var1);
		if (this.field4336 != null) {
			for (int var5 = 0; var5 < this.field4336.length; var5++) {
				var4.method564(this.field4336[var5], this.field4327[var5]);
			}
		}
		if (this.field4330 != null) {
			for (int var6 = 0; var6 < this.field4330.length; var6++) {
				var4.method553(this.field4330[var6], this.field4321[var6]);
			}
		}
		return var4;
	}

	@ObfuscatedName("vb.d(B)Z")
	public boolean method1545() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.field4339[var2] != -1 && !field733.method959(this.field4339[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("vb.a(ILea;)V")
	public void method1546(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1541(arg0, var2);
		}
	}

	@ObfuscatedName("vb.e(B)Z")
	public boolean method1547() {
		if (this.field4324 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field4324.length; var2++) {
			if (!field733.method959(this.field4324[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}
}
