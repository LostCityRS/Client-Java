package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;

@ObfuscatedName("eb")
public final class EnumType extends Linkable2 {

	@ObfuscatedName("a.b")
	public static final LruCache field2 = new LruCache(128);
	@ObfuscatedName("sf.i")
	public static Js5 field3849;

	@ObfuscatedName("ie.o")
	public static final JagString field1749 = JagString.wrap("null");
	@ObfuscatedName("eb.J")
	public JagString field876 = field1749;

	@ObfuscatedName("eb.G")
	public int field873;

	@ObfuscatedName("eb.K")
	public int field877;

	@ObfuscatedName("eb.P")
	public int field882;

	@ObfuscatedName("eb.X")
	public static int field890;

	@ObfuscatedName("eb.E")
	public HashTable field871;

	@ObfuscatedName("pd.b(II)Leb;")
	public static EnumType list(int arg0) {
		EnumType var1 = (EnumType) field2.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3849.getFile(method1379(arg0), method1314(arg0));
		EnumType var3 = new EnumType();
		if (var2 != null) {
			var3.method355(new Packet(var2));
		}
		field2.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("gh.a(ILnb;)V")
	public static void init(Js5 arg0) {
		field3849 = arg0;
	}

	@ObfuscatedName("se.a(II)I")
	public static int method1379(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("rc.a(BI)I")
	public static int method1314(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("eb.a(BLea;)V")
	public void method355(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method364(var2, arg0);
		}
	}

	@ObfuscatedName("eb.b(II)I")
	public int method356(int arg0) {
		if (this.field871 == null) {
			return this.field877;
		} else {
			IntNode var2 = (IntNode) this.field871.method1049((long) arg0);
			return var2 == null ? this.field877 : var2.field3698;
		}
	}

	@ObfuscatedName("eb.a(IB)Li;")
	public JagString getValueString(int arg0) {
		if (this.field871 == null) {
			return this.field876;
		} else {
			StringNode var2 = (StringNode) this.field871.method1049((long) arg0);
			return var2 == null ? this.field876 : var2.field4046;
		}
	}

	@ObfuscatedName("eb.a(IBLea;)V")
	public void method364(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field873 = arg1.g1();
		} else if (arg0 == 2) {
			this.field882 = arg1.g1();
		} else if (arg0 == 3) {
			this.field876 = arg1.gjstr();
		} else if (arg0 == 4) {
			this.field877 = arg1.g4();
		} else if (arg0 == 5 || arg0 == 6) {
			int var3 = arg1.g2();
			this.field871 = new HashTable(IntUtil.bitceil(var3));
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = arg1.g4();
				Linkable var6;
				if (arg0 == 5) {
					var6 = new StringNode(arg1.gjstr());
				} else {
					var6 = new IntNode(arg1.g4());
				}
				this.field871.put((long) var5, var6);
			}
		}
	}
}
