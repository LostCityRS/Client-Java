package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("gh")
public final class TextureOpSubShape2 extends TextureOpSubShape {

	@ObfuscatedName("gh.k")
	public final int field1340;

	@ObfuscatedName("gh.n")
	public final int field1343;

	@ObfuscatedName("gh.p")
	public final int field1345;

	@ObfuscatedName("gh.q")
	public final int field1346;

	public TextureOpSubShape2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg4, arg5, arg6);
		this.field1343 = arg3;
		this.field1345 = arg2;
		this.field1340 = arg0;
		this.field1346 = arg1;
	}

	@ObfuscatedName("b.a(Lea;I)Lgh;")
	public static TextureOpSubShape2 method62(Packet arg0) {
		return new TextureOpSubShape2(arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g2b(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("gh.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = this.field1340 * arg0 >> 12;
		int var4 = this.field1345 * arg0 >> 12;
		int var5 = arg1 * this.field1346 >> 12;
		int var6 = arg1 * this.field1343 >> 12;
		TextureOpVector.method887(super.field931, var5, var4, var6, super.field927, var3);
	}

	@ObfuscatedName("gh.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
		int var3 = this.field1345 * arg1 >> 12;
		int var4 = arg1 * this.field1340 >> 12;
		int var5 = this.field1346 * arg0 >> 12;
		int var6 = arg0 * this.field1343 >> 12;
		TextureOpVector.method26(var6, var5, super.field925, var4, var3);
	}

	@ObfuscatedName("gh.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
		int var3 = arg0 * this.field1340 >> 12;
		int var4 = arg0 * this.field1345 >> 12;
		int var5 = this.field1346 * arg1 >> 12;
		int var6 = arg1 * this.field1343 >> 12;
		TextureOpVector.method368(var4, super.field927, var5, super.field931, super.field925, var3, var6);
	}
}
