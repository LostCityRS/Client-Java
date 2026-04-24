package jagex3.wordfilter2;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.JagString;

public class WordPack {
	@ObfuscatedName("pe.xb")
	public static Huffman field2357;
	@ObfuscatedName("m.c")
	public static JagString field1756 = JagString.wrap("Cabbage");

	@ObfuscatedName("je.a(ZLwa;)V")
	public static void setHuffman(Huffman arg0) {
		field2357 = arg0;
	}

    @ObfuscatedName("hc.a(Lba;II)La;")
    public static JagString method474(Packet arg0) {
        try {
            JagString var1 = new JagString();
            var1.length = arg0.gsmart();
            if (var1.length > 32767) {
                var1.length = 32767;
            }
            var1.charCode = new byte[var1.length];
            arg0.pos += field2357.method1033(arg0.data, var1.length, 0, var1.charCode, arg0.pos);
            return var1;
        } catch (Exception var2) {
            return field1756;
        }
    }

	@ObfuscatedName("re.a(ILba;)La;")
	public static JagString method893(Packet arg0) {
		return method474(arg0);
	}

	@ObfuscatedName("ac.a(ILa;Lba;)I")
	public static int pack(JagString arg0, Packet arg1) {
		int var2 = arg1.pos;
		arg1.psmart(arg0.length);
		arg1.pos += field2357.method1036(0, arg1.pos, arg0.length, arg0.charCode, arg1.data);
		return arg1.pos - var2;
	}
}
