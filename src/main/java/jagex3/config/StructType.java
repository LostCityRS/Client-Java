package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.midi2.Patch;
import jagex3.util.IntUtil;

@ObfuscatedName("qb")
public final class StructType extends Linkable2 {

	@ObfuscatedName("pe.t")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("d.X")
	public static Js5 configClient;

	@ObfuscatedName("qb.L")
	public HashTable params;

	@ObfuscatedName("qb.a(ZLnb;I)Lsh;")
	public static Patch loadPatch(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(arg1);
		return var2 == null ? null : new Patch(var2);
	}

	@ObfuscatedName("bj.b(BI)Lqb;")
	public static StructType list(int arg0) {
		StructType var1 = (StructType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 26);
		StructType var3 = new StructType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bf.a(Lnb;Z)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("qb.a(IILea;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 249) {
			int var3 = arg1.g1();
			if (this.params == null) {
				int var4 = IntUtil.bitceil(var3);
				this.params = new HashTable(var4);
			}
			for (int var5 = 0; var5 < var3; var5++) {
				boolean var6 = arg1.g1() == 1;
				int var7 = arg1.g3();
				Linkable var8;
				if (var6) {
					var8 = new StringNode(arg1.gjstr());
				} else {
					var8 = new IntNode(arg1.g4());
				}
				this.params.put((long) var7, var8);
			}
		}
	}

	@ObfuscatedName("qb.a(Li;II)Li;")
	public JagString getParamString(JagString arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			StringNode var3 = (StringNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("qb.a(Lea;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("qb.a(III)I")
	public int getParamInt(int arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			IntNode var3 = (IntNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.value;
		}
	}
}
