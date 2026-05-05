package jagex3.datastruct;

import deob.ObfuscatedName;
import jagex3.io.ByteArrayWrapper;

import java.nio.ByteBuffer;

@ObfuscatedName("qi")
public final class ByteBufferNode extends ByteArrayWrapper {

	@ObfuscatedName("qi.l")
	public ByteBuffer buffer;

	@ObfuscatedName("qi.a(I[B)V")
	@Override
	public void set(byte[] arg0) {
		this.buffer = ByteBuffer.allocateDirect(arg0.length);
		this.buffer.position(0);
		this.buffer.put(arg0);
	}

	@ObfuscatedName("qi.a(B)[B")
	@Override
	public byte[] toByteArray() {
		byte[] var1 = new byte[this.buffer.capacity()];
		this.buffer.position(0);
		this.buffer.get(var1);
		return var1;
	}
}
