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
	public static Js5 configClient;

	@ObfuscatedName("qb.a")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("se.db")
	public int inputtype;

	@ObfuscatedName("se.ab")
	public int outputtype;

	@ObfuscatedName("t.p")
	public static JagString AUTO_NULL = JagString.wrap("null");
	@ObfuscatedName("se.I")
	public JagString defaultString = AUTO_NULL;

	@ObfuscatedName("se.U")
	public int defaultInt;

	@ObfuscatedName("se.P")
	public int count = 0;

	@ObfuscatedName("se.J")
	public int[] keys;

	@ObfuscatedName("se.M")
	public int[] intValues;

	@ObfuscatedName("se.N")
	public JagString[] stringValues;

	@ObfuscatedName("oa.a(Lea;I)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("ra.a(IB)Lse;")
	public static EnumType list(int arg0) {
		EnumType var1 = (EnumType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(8, arg0);
		EnumType var3 = new EnumType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("se.a(Ljd;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("se.a(IILjd;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.inputtype = arg1.g1();
		} else if (arg0 == 2) {
			this.outputtype = arg1.g1();
		} else if (arg0 == 3) {
			this.defaultString = arg1.gjstr();
		} else if (arg0 == 4) {
			this.defaultInt = arg1.g4();
		} else if (arg0 == 5) {
			this.count = arg1.g2();
			this.stringValues = new JagString[this.count];
			this.keys = new int[this.count];
			for (int var3 = 0; var3 < this.count; var3++) {
				this.keys[var3] = arg1.g4();
				this.stringValues[var3] = arg1.gjstr();
			}
		} else if (arg0 == 6) {
			this.count = arg1.g2();
			this.intValues = new int[this.count];
			this.keys = new int[this.count];
			for (int var4 = 0; var4 < this.count; var4++) {
				this.keys[var4] = arg1.g4();
				this.intValues[var4] = arg1.g4();
			}
		}
	}
}
