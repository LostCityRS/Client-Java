package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("se")
public final class EnumType extends Linkable2 {

	@ObfuscatedName("gf.o")
	public static Js5 field1133;
	@ObfuscatedName("qb.a")
	public static LruCache field2634 = new LruCache(64);
	@ObfuscatedName("se.ab")
	public int field3002;

	@ObfuscatedName("se.db")
	public int field3005;

	@ObfuscatedName("t.p")
	public static JagString field3035 = JagString.wrap("null");
	@ObfuscatedName("se.I")
	public JagString field2984 = field3035;

	@ObfuscatedName("se.P")
	public int field2991 = 0;

	@ObfuscatedName("se.U")
	public int field2996;

	@ObfuscatedName("se.J")
	public int[] field2985;

	@ObfuscatedName("se.M")
	public int[] field2988;

	@ObfuscatedName("se.N")
	public JagString[] field2989;

	@ObfuscatedName("ra.a(IB)Lse;")
	public static EnumType method938(int arg0) {
		EnumType var1 = (EnumType) field2634.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1133.getFile(8, arg0);
		EnumType var3 = new EnumType();
		if (var2 != null) {
			var3.method999(new Packet(var2));
		}
		field2634.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.a(Lea;I)V")
	public static void init(Js5 arg0) {
		field1133 = arg0;
	}

	@ObfuscatedName("se.a(Ljd;I)V")
	public void method999(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1003(var2, arg0);
		}
	}

	@ObfuscatedName("se.a(IILjd;)V")
	public void method1003(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field3005 = arg1.g1();
		} else if (arg0 == 2) {
			this.field3002 = arg1.g1();
		} else if (arg0 == 3) {
			this.field2984 = arg1.gjstr();
		} else if (arg0 == 4) {
			this.field2996 = arg1.g4();
		} else if (arg0 == 5) {
			this.field2991 = arg1.g2();
			this.field2989 = new JagString[this.field2991];
			this.field2985 = new int[this.field2991];
			for (int var3 = 0; var3 < this.field2991; var3++) {
				this.field2985[var3] = arg1.g4();
				this.field2989[var3] = arg1.gjstr();
			}
		} else if (arg0 == 6) {
			this.field2991 = arg1.g2();
			this.field2988 = new int[this.field2991];
			this.field2985 = new int[this.field2991];
			for (int var4 = 0; var4 < this.field2991; var4++) {
				this.field2985[var4] = arg1.g4();
				this.field2988[var4] = arg1.g4();
			}
		}
	}
}
