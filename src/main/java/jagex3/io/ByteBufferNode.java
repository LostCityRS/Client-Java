package jagex3.io;

import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("bb")
public final class ByteBufferNode extends ByteArrayWrapper {

	@ObfuscatedName("bb.l")
	public ByteBuffer buffer;

	@ObfuscatedName("bb.a([BB)V")
	@Override
	public void set(byte[] arg0) {
		this.buffer = ByteBuffer.allocateDirect(arg0.length);
		this.buffer.position(0);
		this.buffer.put(arg0);
	}

	@ObfuscatedName("bb.a(B)[B")
	@Override
	public byte[] toByteArray() {
		byte[] var1 = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(var1);
		return var1;
	}
}
