package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("si")
public final class QuickChatPhraseType extends Linkable2 {

	@ObfuscatedName("m.e")
	public static final LruCache field2447 = new LruCache(64);

	@ObfuscatedName("ha.C")
	public static Js5 field1417;
	@ObfuscatedName("wh.V")
	public static QuickChatDynamicProvider field4527 = null;
	@ObfuscatedName("db.B")
	public static Js5 field633;

	@ObfuscatedName("si.I")
	public int[] field3905;

	@ObfuscatedName("si.T")
	public int[] field3916;

	@ObfuscatedName("si.E")
	public JagString[] field3901;

	@ObfuscatedName("si.M")
	public int[][] field3909;

	@ObfuscatedName("pe.a(BI)Lsi;")
	public static QuickChatPhraseType method1150(int arg0) {
		QuickChatPhraseType var1 = (QuickChatPhraseType) field2447.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 >= 32768) {
			var2 = field633.getFile(arg0 & 0x7FFF, 1);
		} else {
			var2 = field1417.getFile(arg0, 1);
		}
		QuickChatPhraseType var3 = new QuickChatPhraseType();
		if (var2 != null) {
			var3.method1411(new Packet(var2));
		}
		if (arg0 >= 32768) {
			var3.method1415();
		}
		field2447.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.a(Lnb;Lsb;Lnb;B)V")
	public static void init(Js5 arg0, QuickChatDynamicProvider arg1, Js5 arg2) {
		field1417 = arg2;
		field4527 = arg1;
		field633 = arg0;
	}

	@ObfuscatedName("si.a(BI)I")
	public int method1405(int arg0) {
		return this.field3905 == null || arg0 < 0 || arg0 > this.field3905.length ? -1 : this.field3905[arg0];
	}

	@ObfuscatedName("si.d(B)I")
	public int method1407() {
		return this.field3905 == null ? 0 : this.field3905.length;
	}

	@ObfuscatedName("si.a(BLea;I)V")
	public void method1408(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field3901 = arg0.gjstr().method600(60);
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.field3916 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3916[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.g1();
			this.field3909 = new int[var5][];
			this.field3905 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				this.field3905[var6] = var7;
				this.field3909[var6] = new int[Statics.field1731[var7]];
				for (int var8 = 0; var8 < Statics.field1731[var7]; var8++) {
					this.field3909[var6][var8] = arg0.g2();
				}
			}
		}
	}

	@ObfuscatedName("si.a(Lea;I)Li;")
	public JagString method1409(Packet arg0) {
		JagString var2 = JagString.method1135(80);
		if (this.field3905 != null) {
			for (int var3 = 0; var3 < this.field3905.length; var3++) {
				var2.method616(this.field3901[var3]);
				var2.method616(Statics.method952(arg0.method300(Statics.field1420[this.field3905[var3]]), this.field3905[var3], this.field3909[var3]));
			}
		}
		var2.method616(this.field3901[this.field3901.length - 1]);
		return var2.method629();
	}

	@ObfuscatedName("si.e(I)Li;")
	public JagString method1410() {
		JagString var1 = JagString.method1135(80);
		if (this.field3901 == null) {
			return Statics.field1844;
		}
		var1.method616(this.field3901[0]);
		for (int var2 = 1; var2 < this.field3901.length; var2++) {
			var1.method616(Statics.field3644);
			var1.method616(this.field3901[var2]);
		}
		return var1.method629();
	}

	@ObfuscatedName("si.a(Lea;B)V")
	public void method1411(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1408(arg0, var2);
		}
	}

	@ObfuscatedName("si.a(III)I")
	public int method1412(int arg0, int arg1) {
		if (this.field3905 == null || arg1 < 0 || this.field3905.length < arg1) {
			return -1;
		} else if (this.field3909[arg1] == null || arg0 < 0 || arg0 > this.field3909[arg1].length) {
			return -1;
		} else {
			return this.field3909[arg1][arg0];
		}
	}

	@ObfuscatedName("si.a(ILea;[I)V")
	public void method1414(Packet arg0, int[] arg1) {
		if (this.field3905 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field3905.length; var3++) {
			if (var3 >= arg1.length) {
				return;
			}
			int var4 = Statics.field2508[this.method1405(var3)];
			if (var4 > 0) {
				arg0.method306(var4, (long) arg1[var3]);
			}
		}
	}

	@ObfuscatedName("si.f(I)V")
	public void method1415() {
		if (this.field3916 != null) {
			for (int var1 = 0; var1 < this.field3916.length; var1++) {
				this.field3916[var1] |= 0x8000;
			}
		}
	}
}
