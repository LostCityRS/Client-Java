package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("lb")
public final class TextureOp29SubOp3 extends TextureOp29SubOp {

	@ObfuscatedName("lb.m")
	public final int field2220;

	@ObfuscatedName("lb.p")
	public final int field2223;

	@ObfuscatedName("lb.q")
	public final int field2224;

	@ObfuscatedName("lb.x")
	public final int field2231;

	public TextureOp29SubOp3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg4, arg5, arg6);
		this.field2220 = arg3;
		this.field2223 = arg2;
		this.field2224 = arg1;
		this.field2231 = arg0;
	}

	@ObfuscatedName("hh.a(Lea;I)Llb;")
	public static TextureOp29SubOp3 method577(Packet arg0) {
		return new TextureOp29SubOp3(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("lb.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
		int var3 = arg1 * this.field2224 >> 12;
		int var4 = arg1 * this.field2220 >> 12;
		int var5 = this.field2231 * arg0 >> 12;
		int var6 = this.field2223 * arg0 >> 12;
		Statics.method1514(super.field931, var4, var6, var5, super.field927, super.field925, var3);
	}

	@ObfuscatedName("lb.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
		int var3 = this.field2231 * arg1 >> 12;
		int var4 = arg1 * this.field2223 >> 12;
		int var5 = arg0 * this.field2220 >> 12;
		int var6 = arg0 * this.field2224 >> 12;
		Statics.method1565(var4, super.field925, var6, var3, var5);
	}

	@ObfuscatedName("lb.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
	}
}
