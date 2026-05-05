package jagex3.datastruct;

import deob.ObfuscatedName;
import deob.Statics;

import java.util.Random;

@ObfuscatedName("rd")
public final class ByteArrayNode2 extends Linkable2 {

	@ObfuscatedName("ca.g")
	public static final LruCache field388 = new LruCache(16);
	@ObfuscatedName("rd.D")
	public final byte[] field3658;

	public ByteArrayNode2(byte[] arg0) {
		this.field3658 = arg0;
	}

    @ObfuscatedName("og.b(II)[B")
    public static byte[] method1072(int arg0) {
        ByteArrayNode2 var1 = (ByteArrayNode2) field388.find((long) arg0);
        if (var1 == null) {
            byte[] var2 = new byte[512];
            Random var3 = new Random((long) arg0);
            for (int var4 = 0; var4 < 255; var4++) {
                var2[var4] = (byte) var4;
            }
            for (int var5 = 0; var5 < 255; var5++) {
                int var6 = 255 - var5;
                int var7 = Statics.method812(var6, var3);
                byte var8 = var2[var7];
                var2[var7] = var2[var6];
                var2[var6] = var2[511 - var5] = var8;
            }
            var1 = new ByteArrayNode2(var2);
            field388.put((long) arg0, var1);
        }
        return var1.field3658;
    }
}
