package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("je")
public final class TextureOp29SubOp1 extends TextureOp29SubOp {

	@ObfuscatedName("je.j")
	public final int field1854;

	@ObfuscatedName("je.k")
	public final int field1855;

	@ObfuscatedName("je.l")
	public final int field1856;

	@ObfuscatedName("je.o")
	public final int field1859;

	@ObfuscatedName("je.p")
	public final int field1860;

	@ObfuscatedName("je.q")
	public final int field1861;

	@ObfuscatedName("je.u")
	public final int field1865;

	@ObfuscatedName("je.w")
	public final int field1867;

	public TextureOp29SubOp1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		super(-1, arg8, arg9);
		this.field1861 = arg1;
		this.field1855 = arg7;
		this.field1865 = arg4;
		this.field1860 = arg2;
		this.field1859 = arg5;
		this.field1856 = arg3;
		this.field1854 = arg0;
		this.field1867 = arg6;
	}

	@ObfuscatedName("na.a(BLea;)Lje;")
	public static TextureOp29SubOp1 method936(Packet arg0) {
		return new TextureOp29SubOp1(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("je.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = arg0 * this.field1860 >> 12;
		int var4 = this.field1856 * arg1 >> 12;
		int var5 = this.field1859 * arg1 >> 12;
		int var6 = this.field1854 * arg0 >> 12;
		int var7 = arg1 * this.field1861 >> 12;
		int var8 = this.field1867 * arg0 >> 12;
		int var9 = this.field1865 * arg0 >> 12;
		int var10 = arg1 * this.field1855 >> 12;
		Statics.method739(var4, var7, var6, var3, var5, var8, var10, super.field927, var9);
	}

	@ObfuscatedName("je.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
	}

	@ObfuscatedName("je.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
	}
}
