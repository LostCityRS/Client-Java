package jagex3.wordfilter2;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

public class WordPack {
	@ObfuscatedName("kc.b")
	public static Huffman field2033;

	@ObfuscatedName("bb.a(BLtg;)V")
	public static void method69(Huffman arg0) {
		field2033 = arg0;
	}

	@ObfuscatedName("pi.a(Lea;Li;B)I")
	public static int method1220(Packet arg0, JagString arg1) {
		int var2 = arg0.pos;
		arg0.psmart(arg1.length);
		arg0.pos += field2033.method1456(arg1.chars, arg0.pos, arg1.length, 0, arg0.data);
		return arg0.pos - var2;
	}

	@ObfuscatedName("ha.a(ZLea;I)Li;")
	public static JagString method524(Packet arg0) {
		try {
			JagString var1 = new JagString();
			var1.length = arg0.method350();
			if (var1.length > 32767) {
				var1.length = 32767;
			}
			var1.chars = new byte[var1.length];
			arg0.pos += field2033.method1457(0, var1.chars, arg0.data, var1.length, arg0.pos);
			return var1;
		} catch (Exception var2) {
			return Statics.field2918;
		}
	}

    @ObfuscatedName("bi.a(Lea;I)Li;")
    public static JagString method103(Packet arg0) {
        return method524(arg0);
    }
}
