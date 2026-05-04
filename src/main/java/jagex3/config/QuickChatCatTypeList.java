package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("kh")
public final class QuickChatCatTypeList extends Linkable2 {

	@ObfuscatedName("ng.Z")
	public static final LruCache field2856 = new LruCache(64);
	@ObfuscatedName("ff.ab")
	public static Js5 field1146;
	@ObfuscatedName("fj.m")
	public static Js5 field1199;
	@ObfuscatedName("kh.ab")
	public int[] field2130;

	@ObfuscatedName("kh.Y")
	public JagString field2128;

	@ObfuscatedName("kh.L")
	public int[] field2116;

	@ObfuscatedName("kh.O")
	public int[] field2119;

	@ObfuscatedName("kh.Q")
	public int[] field2121;

	@ObfuscatedName("kh.b(II)I")
	public static int method791(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("kf.a(II)Lkh;")
	public static QuickChatCatTypeList method783(int arg0) {
		QuickChatCatTypeList var1 = (QuickChatCatTypeList) field2856.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 < 32768) {
			var2 = field1146.getFile(arg0, 0);
		} else {
			var2 = field1199.getFile(arg0 & 0x7FFF, 0);
		}
		QuickChatCatTypeList var3 = new QuickChatCatTypeList();
		if (var2 != null) {
			var3.method794(new Packet(var2));
		}
		if (arg0 >= 32768) {
			var3.method797();
		}
		field2856.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("rd.a(BLnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field1146 = arg0;
		field1199 = arg1;
	}

	@ObfuscatedName("kh.c(II)I")
	public int method792(int arg0) {
		if (this.field2121 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field2121.length; var2++) {
			if (this.field2130[var2] == arg0) {
				return this.field2121[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.a(ILea;B)V")
	public void method793(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field2128 = arg1.gjstr();
		} else if (arg0 == 2) {
			int var3 = arg1.g1();
			this.field2119 = new int[var3];
			this.field2116 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2116[var4] = arg1.g2();
				int var5 = arg1.g1();
				if (var5 == 0) {
					this.field2119[var4] = -1;
				} else {
					this.field2119[var4] = var5;
				}
			}
		} else if (arg0 == 3) {
			int var6 = arg1.g1();
			this.field2130 = new int[var6];
			this.field2121 = new int[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.field2121[var7] = arg1.g2();
				int var8 = arg1.g1();
				if (var8 == 0) {
					this.field2130[var7] = -1;
				} else {
					this.field2130[var7] = var8;
				}
			}
		}
	}

	@ObfuscatedName("kh.a(BLea;)V")
	public void method794(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method793(var2, arg0);
		}
	}

	@ObfuscatedName("kh.e(II)I")
	public int method796(int arg0) {
		if (this.field2116 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field2116.length; var2++) {
			if (this.field2119[var2] == arg0) {
				return this.field2116[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.b(Z)V")
	public void method797() {
		if (this.field2121 != null) {
			for (int var1 = 0; var1 < this.field2121.length; var1++) {
				this.field2121[var1] |= 0x8000;
			}
		}
		if (this.field2116 != null) {
			for (int var2 = 0; var2 < this.field2116.length; var2++) {
				this.field2116[var2] |= 0x8000;
			}
		}
	}
}
