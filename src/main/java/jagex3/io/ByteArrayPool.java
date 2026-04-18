package jagex3.io;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.Client;

public class ByteArrayPool {
	@ObfuscatedName("fd.Cb")
	public static int field934 = 0;
    @ObfuscatedName("kb.a")
    public static byte[][] field1541 = new byte[50][];
	@ObfuscatedName("se.C")
	public static byte[][] field2801 = new byte[1000][];
	@ObfuscatedName("oe.k")
	public static byte[][] field2179 = new byte[250][];

	@ObfuscatedName("de.a(II)[B")
	public static synchronized byte[] method324(int arg0) {
		if (arg0 == 100 && Statics.field551 > 0) {
			byte[] var1 = field2801[--Statics.field551];
			field2801[Statics.field551] = null;
			return var1;
		} else if (arg0 == 5000 && Client.field585 > 0) {
			byte[] var2 = field2179[--Client.field585];
			field2179[Client.field585] = null;
			return var2;
		} else if (arg0 == 30000 && field934 > 0) {
			byte[] var3 = field1541[--field934];
			field1541[field934] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
