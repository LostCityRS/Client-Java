package jagex3.io;

import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("bb")
public final class ByteBufferNode extends ByteArrayWrapper {

	@ObfuscatedName("bb.l")
	public ByteBuffer field170;

	@ObfuscatedName("bb.a([BB)V")
	@Override
	public void method60(byte[] arg0) {
		this.field170 = ByteBuffer.allocateDirect(arg0.length);
		this.field170.position(0);
		this.field170.put(arg0);
	}

	@ObfuscatedName("bb.a(B)[B")
	@Override
	public byte[] method61() {
		byte[] var1 = new byte[this.field170.capacity()];
		this.field170.position(0);
		this.field170.get(var1);
		return var1;
	}
}
