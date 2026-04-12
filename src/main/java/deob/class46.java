package deob;

import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.BufferedRandomAccessFile;

@ObfuscatedName("hd")
public final class class46 extends Linkable2 {

	@ObfuscatedName("hd.ub")
	public static BufferedRandomAccessFile[] field1193 = new BufferedRandomAccessFile[13];

	@ObfuscatedName("hd.Kb")
	public static int field1209 = 0;

	@ObfuscatedName("hd.xb")
	public static LruCache field1196 = new LruCache(64);

	@ObfuscatedName("hd.zb")
	public final byte[] field1198;

	public class46(byte[] arg0) {
		this.field1198 = arg0;
	}
}
