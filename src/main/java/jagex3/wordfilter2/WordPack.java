package jagex3.wordfilter2;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.JagString;

public class WordPack {
	@ObfuscatedName("vf.z")
	public static JagString field3499 = JagString.wrap("Cabbage");
	@ObfuscatedName("na.n")
	public static Huffman field2088;

	@ObfuscatedName("of.a(IILjd;)Lec;")
	public static JagString unpack2(Packet arg0) {
		try {
			JagString var1 = new JagString();
			var1.length = arg0.gsmart();
			if (var1.length > 32767) {
				var1.length = 32767;
			}
			var1.data = new byte[var1.length];
			arg0.pos += field2088.method73(0, arg0.pos, var1.data, var1.length, arg0.data);
			return var1;
		} catch (Exception var2) {
			return field3499;
		}
	}

	@ObfuscatedName("sd.a(Lbf;I)V")
	public static void setHuffman(Huffman arg0) {
		field2088 = arg0;
	}
}
