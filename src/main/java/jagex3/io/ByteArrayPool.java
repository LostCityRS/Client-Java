package jagex3.io;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.Client;

public class ByteArrayPool {
	@ObfuscatedName("fd.Cb")
	public static int field934 = 0;

	@ObfuscatedName("de.a(II)[B")
	public static synchronized byte[] method324(int arg0) {
		if (arg0 == 100 && Statics.field551 > 0) {
			byte[] var1 = Statics.field2801[--Statics.field551];
			Statics.field2801[Statics.field551] = null;
			return var1;
		} else if (arg0 == 5000 && Client.field585 > 0) {
			byte[] var2 = Statics.field2179[--Client.field585];
			Statics.field2179[Client.field585] = null;
			return var2;
		} else if (arg0 == 30000 && field934 > 0) {
			byte[] var3 = Statics.field1541[--field934];
			Statics.field1541[field934] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
