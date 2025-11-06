package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class SpotAnimType {

	@ObfuscatedName("pc.a")
	public static int field1131;

	@ObfuscatedName("pc.b")
	public static SpotAnimType[] field1132;

	@ObfuscatedName("pc.c")
	public int field1133;

	@ObfuscatedName("pc.d")
	public int field1134;

	@ObfuscatedName("pc.e")
	public int field1135 = -1;

	@ObfuscatedName("pc.f")
	public SeqType field1136;

	@ObfuscatedName("pc.g")
	public int[] field1137 = new int[6];

	@ObfuscatedName("pc.h")
	public int[] field1138 = new int[6];

	@ObfuscatedName("pc.i")
	public int field1139 = 128;

	@ObfuscatedName("pc.j")
	public int field1140 = 128;

	@ObfuscatedName("pc.k")
	public int field1141;

	@ObfuscatedName("pc.l")
	public int field1142;

	@ObfuscatedName("pc.m")
	public int field1143;

	@ObfuscatedName("pc.n")
	public static LruCache field1144 = new LruCache((byte) 3, 30);

	@ObfuscatedName("pc.a(ZLyb;)V")
	public static void method386(boolean arg0, JagFile arg1) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Packet var3 = new Packet(arg1.method309("spotanim.dat", null), (byte) 3);
		field1131 = var3.method241();
		if (field1132 == null) {
			field1132 = new SpotAnimType[field1131];
		}
		for (int var4 = 0; var4 < field1131; var4++) {
			if (field1132[var4] == null) {
				field1132[var4] = new SpotAnimType();
			}
			field1132[var4].field1133 = var4;
			field1132[var4].method387(9, var3);
		}
	}

	@ObfuscatedName("pc.a(ILmb;)V")
	public void method387(int arg0, Packet arg1) {
		if (arg0 < 9 || arg0 > 9) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.method239();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field1134 = arg1.method241();
				} else if (var3 == 2) {
					this.field1135 = arg1.method241();
					if (SeqType.field1112 != null) {
						this.field1136 = SeqType.field1112[this.field1135];
					}
				} else if (var3 == 4) {
					this.field1139 = arg1.method241();
				} else if (var3 == 5) {
					this.field1140 = arg1.method241();
				} else if (var3 == 6) {
					this.field1141 = arg1.method241();
				} else if (var3 == 7) {
					this.field1142 = arg1.method239();
				} else if (var3 == 8) {
					this.field1143 = arg1.method239();
				} else if (var3 >= 40 && var3 < 50) {
					this.field1137[var3 - 40] = arg1.method241();
				} else if (var3 >= 50 && var3 < 60) {
					this.field1138[var3 - 50] = arg1.method241();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var3);
				}
			}
		}
	}

	@ObfuscatedName("pc.a()Lfb;")
	public Model method388() {
		Model var1 = (Model) field1144.method115((long) this.field1133);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.method139(0, this.field1134);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.field1137[0] != 0) {
				var2.method153(this.field1137[var3], this.field1138[var3]);
			}
		}
		field1144.method116(var2, false, (long) this.field1133);
		return var2;
	}
}
