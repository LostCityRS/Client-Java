package deob;

@ObfuscatedName("oc")
public class SpotAnimType {

	@ObfuscatedName("oc.a")
	public boolean field1136 = true;

	@ObfuscatedName("oc.b")
	public static int field1137;

	@ObfuscatedName("oc.c")
	public static SpotAnimType[] field1138;

	@ObfuscatedName("oc.d")
	public int field1139;

	@ObfuscatedName("oc.e")
	public int field1140;

	@ObfuscatedName("oc.f")
	public int field1141 = -1;

	@ObfuscatedName("oc.g")
	public SeqType field1142;

	@ObfuscatedName("oc.h")
	public boolean field1143 = false;

	@ObfuscatedName("oc.i")
	public int[] field1144 = new int[6];

	@ObfuscatedName("oc.j")
	public int[] field1145 = new int[6];

	@ObfuscatedName("oc.k")
	public int field1146 = 128;

	@ObfuscatedName("oc.l")
	public int field1147 = 128;

	@ObfuscatedName("oc.m")
	public int field1148;

	@ObfuscatedName("oc.n")
	public int field1149;

	@ObfuscatedName("oc.o")
	public int field1150;

	@ObfuscatedName("oc.p")
	public static LruCache field1151 = new LruCache(30, 1);

	@ObfuscatedName("oc.a(Lyb;B)V")
	public static void method384(Jagfile arg0, byte arg1) {
		if (arg1 != 127) {
			return;
		}
		Packet var2 = new Packet((byte) -109, arg0.method308("spotanim.dat", null));
		field1137 = var2.method240();
		if (field1138 == null) {
			field1138 = new SpotAnimType[field1137];
		}
		for (int var3 = 0; var3 < field1137; var3++) {
			if (field1138[var3] == null) {
				field1138[var3] = new SpotAnimType();
			}
			field1138[var3].field1139 = var3;
			field1138[var3].method385(168, var2);
		}
	}

	@ObfuscatedName("oc.a(ILmb;)V")
	public void method385(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			this.field1136 = !this.field1136;
		}
		while (true) {
			while (true) {
				int var3 = arg1.method238();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field1140 = arg1.method240();
				} else if (var3 == 2) {
					this.field1141 = arg1.method240();
					if (SeqType.field1120 != null) {
						this.field1142 = SeqType.field1120[this.field1141];
					}
				} else if (var3 == 3) {
					this.field1143 = true;
				} else if (var3 == 4) {
					this.field1146 = arg1.method240();
				} else if (var3 == 5) {
					this.field1147 = arg1.method240();
				} else if (var3 == 6) {
					this.field1148 = arg1.method240();
				} else if (var3 == 7) {
					this.field1149 = arg1.method238();
				} else if (var3 == 8) {
					this.field1150 = arg1.method238();
				} else if (var3 >= 40 && var3 < 50) {
					this.field1144[var3 - 40] = arg1.method240();
				} else if (var3 >= 50 && var3 < 60) {
					this.field1145[var3 - 50] = arg1.method240();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var3);
				}
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public Model method386() {
		Model var1 = (Model) field1151.method114((long) this.field1139);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.method138(this.field1140, -404);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.field1144[0] != 0) {
				var2.method152(this.field1144[var3], this.field1145[var3]);
			}
		}
		field1151.method115(var2, (long) this.field1139, 39399);
		return var2;
	}
}
