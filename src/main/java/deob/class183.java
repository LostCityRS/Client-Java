package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("qi")
public final class class183 extends class1 {

	@ObfuscatedName("qi.l")
	public ByteBuffer field3599;

	@ObfuscatedName("qi.a(I[B)V")
	@Override
	public void method4(byte[] arg0) {
		this.field3599 = ByteBuffer.allocateDirect(arg0.length);
		this.field3599.position(0);
		this.field3599.put(arg0);
	}

	@ObfuscatedName("qi.a(B)[B")
	@Override
	public byte[] method1() {
		byte[] var1 = new byte[this.field3599.capacity()];
		this.field3599.position(0);
		this.field3599.get(var1);
		return var1;
	}
}
