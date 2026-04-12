package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("oc")
public abstract class PcmStream extends Linkable {

	@ObfuscatedName("oc.cb")
	public boolean field2167;

	@ObfuscatedName("oc.db")
	public PcmStreamable field2168;

	@ObfuscatedName("oc.a()I")
	public int method588() {
		return 255;
	}

	@ObfuscatedName("oc.b(I)V")
	public abstract void method127(int arg0);

	@ObfuscatedName("oc.a([III)I")
	public abstract int method134(int[] arg0, int arg1, int arg2);
}
