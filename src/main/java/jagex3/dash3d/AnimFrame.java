package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ff")
public final class AnimFrame {

	@ObfuscatedName("ff.a")
	public static int[] tempTz = new int[500];

	@ObfuscatedName("ff.b")
	public static int[] tempTi = new int[500];

	@ObfuscatedName("ff.c")
	public AnimBase base = null;

	@ObfuscatedName("ff.d")
	public int size = -1;

	@ObfuscatedName("ff.e")
	public final int[] tz;

	@ObfuscatedName("ff.f")
	public boolean animateTransparencies = false;

	@ObfuscatedName("ff.g")
	public static int[] tempTy = new int[500];

	@ObfuscatedName("ff.h")
	public final int[] tx;

	@ObfuscatedName("ff.i")
	public static int[] tempTx = new int[500];

	@ObfuscatedName("ff.j")
	public final int[] ti;

	@ObfuscatedName("ff.k")
	public final int[] ty;

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
							tempTx[var7] = 0;
							tempTy[var7] = 0;
							tempTz[var7] = 0;
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
					tempTx[var7] = var11;
				} else {
					tempTx[var7] = var4.gsmarts();
				}
				if ((var9 & 0x2) == 0) {
					tempTy[var7] = var11;
				} else {
					tempTy[var7] = var4.gsmarts();
				}
				if ((var9 & 0x4) == 0) {
					tempTz[var7] = var11;
				} else {
					tempTz[var7] = var4.gsmarts();
				}
				var6 = var8;
				var7++;
				if (this.base.type[var8] == 5) {
					this.animateTransparencies = true;
				}
			}
		}
		if (var4.pos != arg0.length) {
			throw new RuntimeException();
		}
		this.size = var7;
		this.ti = new int[var7];
		this.tx = new int[var7];
		this.ty = new int[var7];
		this.tz = new int[var7];
		for (int var12 = 0; var12 < var7; var12++) {
			this.ti[var12] = tempTi[var12];
			this.tx[var12] = tempTx[var12];
			this.ty[var12] = tempTy[var12];
			this.tz[var12] = tempTz[var12];
		}
	}
}
