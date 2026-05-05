package jagex3.wordfilter2;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

public class WordPack {
	@ObfuscatedName("nh.j")
	public static final JagString field2918 = JagString.wrap("Cabbage");
	@ObfuscatedName("kc.b")
	public static Huffman huffman;

	@ObfuscatedName("bb.a(BLtg;)V")
	public static void setHuffman(Huffman arg0) {
		huffman = arg0;
	}

	@ObfuscatedName("pi.a(Lea;Li;B)I")
	public static int pack(Packet arg0, JagString arg1) {
		int var2 = arg0.pos;
		arg0.psmart(arg1.length);
		arg0.pos += huffman.encode(arg1.chars, arg0.pos, arg1.length, 0, arg0.data);
		return arg0.pos - var2;
	}

	@ObfuscatedName("ha.a(ZLea;I)Li;")
	public static JagString unpack(Packet arg0) {
		try {
			JagString var1 = new JagString();
			var1.length = arg0.method350();
			if (var1.length > 32767) {
				var1.length = 32767;
			}
			var1.chars = new byte[var1.length];
			arg0.pos += huffman.decode(0, var1.chars, arg0.data, var1.length, arg0.pos);
			return var1;
		} catch (Exception var2) {
			return field2918;
		}
	}

    @ObfuscatedName("bi.a(Lea;I)Li;")
    public static JagString unpack2(Packet arg0) {
        return unpack(arg0);
    }

}
