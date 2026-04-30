package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("o")
public final class AnimFrame {

	@ObfuscatedName("o.a")
	public static int[] field2115 = new int[500];

	@ObfuscatedName("o.b")
	public static int[] tempTi = new int[500];

	@ObfuscatedName("o.c")
	public static int[] field2117 = new int[500];

	@ObfuscatedName("o.d")
	public static int[] field2118 = new int[500];

	@ObfuscatedName("o.e")
	public int size = -1;

	@ObfuscatedName("o.f")
	public final int[] field2120;

	@ObfuscatedName("o.g")
	public AnimBase base = null;

	@ObfuscatedName("o.h")
	public final int[] ti;

	@ObfuscatedName("o.i")
	public boolean animateTransparencies = false;

	@ObfuscatedName("o.j")
	public final int[] field2124;

	@ObfuscatedName("o.k")
	public final int[] field2125;

	public AnimFrame(byte[] arg0, AnimBase arg1) {
		this.base = arg1;
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		var3.pos = 2;
		int var5 = var3.g1();
		int var6 = -1;
		int var7 = 0;
		var4.pos = var3.pos + var5;
		for (int var8 = 0; var8 < var5; var8++) {
			int var9 = var3.g1();
			if (var9 > 0) {
				if (this.base.type[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; var10--) {
						if (this.base.type[var10] == 0) {
							tempTi[var7] = var10;
							field2117[var7] = 0;
							field2115[var7] = 0;
							field2118[var7] = 0;
							var7++;
							break;
						}
					}
				}
				tempTi[var7] = var8;
				short var11 = 0;
				if (this.base.type[var8] == 3) {
					var11 = 128;
				}
				if ((var9 & 0x1) == 0) {
					field2117[var7] = var11;
				} else {
					field2117[var7] = var4.gsmarts();
				}
				if ((var9 & 0x2) == 0) {
					field2115[var7] = var11;
				} else {
					field2115[var7] = var4.gsmarts();
				}
				if ((var9 & 0x4) == 0) {
					field2118[var7] = var11;
				} else {
					field2118[var7] = var4.gsmarts();
				}
				var6 = var8;
				var7++;
				if (this.base.type[var8] == 5) {
					this.animateTransparencies = true;
				}
			}
		}
		if (arg0.length != var4.pos) {
			throw new RuntimeException();
		}
		this.size = var7;
		this.ti = new int[var7];
		this.field2120 = new int[var7];
		this.field2125 = new int[var7];
		this.field2124 = new int[var7];
		for (int var12 = 0; var12 < var7; var12++) {
			this.ti[var12] = tempTi[var12];
			this.field2120[var12] = field2117[var12];
			this.field2125[var12] = field2115[var12];
			this.field2124[var12] = field2118[var12];
		}
	}

	@ObfuscatedName("o.a()V")
	public static void unload() {
		tempTi = null;
		field2117 = null;
		field2115 = null;
		field2118 = null;
	}
}
