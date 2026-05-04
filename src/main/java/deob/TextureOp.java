package deob;

@ObfuscatedName("c")
public abstract class TextureOp extends Linkable {

	@ObfuscatedName("c.D")
	public boolean field369;

	@ObfuscatedName("c.K")
	public final TextureOp[] field376;

	@ObfuscatedName("c.x")
	public int field363;

	@ObfuscatedName("c.C")
	public static int field368;

	@ObfuscatedName("c.N")
	public class160 field379;

	@ObfuscatedName("c.y")
	public class230 field364;

	public TextureOp(int arg0, boolean arg1) {
		this.field369 = arg1;
		this.field376 = new TextureOp[arg0];
	}

	@ObfuscatedName("vd.a(IB)Lc;")
	public static TextureOp method1552(int arg0) {
		if (arg0 == 0) {
			return new TextureOp0();
		} else if (arg0 == 1) {
			return new TextureOp1();
		} else if (arg0 == 2) {
			return new TextureOp2();
		} else if (arg0 == 3) {
			return new TextureOp3();
		} else if (arg0 == 4) {
			return new TextureOp4();
		} else if (arg0 == 5) {
			return new TextureOp5();
		} else if (arg0 == 6) {
			return new TextureOp6();
		} else if (arg0 == 7) {
			return new TextureOp7();
		} else if (arg0 == 8) {
			return new TextureOp8();
		} else if (arg0 == 9) {
			return new TextureOp9();
		} else if (arg0 == 10) {
			return new TextureOp10();
		} else if (arg0 == 11) {
			return new TextureOp11();
		} else if (arg0 == 12) {
			return new TextureOp12();
		} else if (arg0 == 13) {
			return new TextureOp13();
		} else if (arg0 == 14) {
			return new TextureOp14();
		} else if (arg0 == 15) {
			return new TextureOp15();
		} else if (arg0 == 16) {
			return new TextureOp16();
		} else if (arg0 == 17) {
			return new TextureOp17();
		} else if (arg0 == 18) {
			return new TextureOp18();
		} else if (arg0 == 19) {
			return new TextureOp19();
		} else if (arg0 == 20) {
			return new TextureOp20();
		} else if (arg0 == 21) {
			return new TextureOp21();
		} else if (arg0 == 22) {
			return new TextureOp22();
		} else if (arg0 == 23) {
			return new TextureOp23();
		} else if (arg0 == 24) {
			return new TextureOp24();
		} else if (arg0 == 25) {
			return new TextureOp25();
		} else if (arg0 == 26) {
			return new TextureOp26();
		} else if (arg0 == 27) {
			return new TextureOp27();
		} else if (arg0 == 28) {
			return new TextureOp28();
		} else if (arg0 == 29) {
			return new TextureOp29();
		} else if (arg0 == 30) {
			return new TextureOp30();
		} else if (arg0 == 31) {
			return new TextureOp31();
		} else if (arg0 == 32) {
			return new TextureOp32();
		} else if (arg0 == 33) {
			return new TextureOp33();
		} else if (arg0 == 34) {
			return new TextureOp34();
		} else if (arg0 == 35) {
			return new TextureOp35();
		} else if (arg0 == 36) {
			return new TextureOp36();
		} else if (arg0 == 37) {
			return new TextureOp37();
		} else if (arg0 == 38) {
			return new TextureOp38();
		} else if (arg0 == 39) {
			return new TextureOp39();
		} else {
			return null;
		}
	}

	@ObfuscatedName("c.a(IB)[I")
	public int[] method54(int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@ObfuscatedName("c.a(IZI)[I")
	public final int[] method120(int arg0, int arg1) {
		return this.field376[arg1].field369 ? this.field376[arg1].method54(arg0) : this.field376[arg1].method7(arg0)[0];
	}

	@ObfuscatedName("c.a(Lea;II)V")
	public void method11(Packet arg0, int arg1) {
	}

	@ObfuscatedName("c.a(IBI)[[I")
	public final int[][] method121(int arg0, int arg1) {
		if (this.field376[arg0].field369) {
			int[] var3 = this.field376[arg0].method54(arg1);
			return new int[][] { var3, var3, var3 };
		} else {
			return this.field376[arg0].method7(arg1);
		}
	}

	@ObfuscatedName("c.b(B)V")
	public void method123() {
	}

	@ObfuscatedName("c.b(I)I")
	public int method124() {
		return -1;
	}

	@ObfuscatedName("c.b(IB)[[I")
	public int[][] method7(int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@ObfuscatedName("c.c(I)V")
	public void method127() {
		if (this.field369) {
			this.field379.method1081();
			this.field379 = null;
		} else {
			this.field364.method1531();
			this.field364 = null;
		}
	}

	@ObfuscatedName("c.a(BII)V")
	public final void method128(int arg0, int arg1) {
		int var3 = this.field363 == 255 ? arg1 : this.field363;
		if (this.field369) {
			this.field379 = new class160(var3, arg1, arg0);
		} else {
			this.field364 = new class230(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("c.d(I)I")
	public int method129() {
		return -1;
	}
}
