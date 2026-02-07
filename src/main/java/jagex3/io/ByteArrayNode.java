package jagex3.io;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ha")
public final class ByteArrayNode extends Linkable {

	@ObfuscatedName("ha.r")
	public final byte[] data;

	public ByteArrayNode(byte[] arg0) {
		this.data = arg0;
	}
}
