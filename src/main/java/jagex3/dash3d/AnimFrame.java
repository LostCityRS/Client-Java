package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("sa")
public final class AnimFrame {

	@ObfuscatedName("sa.a")
	public final short[] field3774;

	@ObfuscatedName("sa.b")
	public static final short[] tempTi = new short[500];

	@ObfuscatedName("sa.c")
	public static final short[] tempTz = new short[500];

	@ObfuscatedName("sa.d")
	public boolean animateTransparencies = false;

	@ObfuscatedName("sa.e")
	public static final short[] tempTy = new short[500];

	@ObfuscatedName("sa.f")
	public int size = -1;

	@ObfuscatedName("sa.g")
	public final short[] ty;

	@ObfuscatedName("sa.h")
	public final short[] ti;

	@ObfuscatedName("sa.i")
	public static final short[] tempTx = new short[500];

	@ObfuscatedName("sa.j")
	public final short[] tx;

	@ObfuscatedName("sa.k")
	public static final short[] field3784 = new short[500];

	@ObfuscatedName("sa.l")
	public final short[] tz;

	@ObfuscatedName("sa.m")
	public AnimBase base = null;

	public AnimFrame(byte[] arg0, AnimBase arg1) {
		this.base = arg1;
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		var3.pos = 2;
		int var5 = var3.g1();
		int var6 = 0;
		int var7 = -1;
		int var8 = -1;
		var4.pos = var3.pos + var5;
		for (int var9 = 0; var9 < var5; var9++) {
			if (this.base.type[var9] == 0) {
				var7 = var9;
			}
			int var10 = var3.g1();
			if (var10 > 0) {
				if (this.base.type[var9] == 0) {
					var8 = var9;
				}
				tempTi[var6] = (short) var9;
				short var11 = 0;
				if (this.base.type[var9] == 3) {
					var11 = 128;
				}
				if ((var10 & 0x1) == 0) {
					tempTx[var6] = var11;
				} else {
					tempTx[var6] = (short) var4.method342();
				}
				if ((var10 & 0x2) == 0) {
					tempTy[var6] = var11;
				} else {
					tempTy[var6] = (short) var4.method342();
				}
				if ((var10 & 0x4) == 0) {
					tempTz[var6] = var11;
				} else {
					tempTz[var6] = (short) var4.method342();
				}
				if (this.base.type[var9] == 2) {
					tempTx[var6] = (short) (((tempTx[var6] & 0xFF) << 3) + (tempTx[var6] >> 8 & 0x7));
					tempTy[var6] = (short) (((tempTy[var6] & 0xFF) << 3) + (tempTy[var6] >> 8 & 0x7));
					tempTz[var6] = (short) (((tempTz[var6] & 0xFF) << 3) + (tempTz[var6] >> 8 & 0x7));
				}
				field3784[var6] = -1;
				if (this.base.type[var9] >= 1 && this.base.type[var9] <= 3 && var7 > var8) {
					field3784[var6] = (short) var7;
					var8 = var7;
				}
				var6++;
				if (this.base.type[var9] == 5) {
					this.animateTransparencies = true;
				}
			}
		}
		if (var4.pos != arg0.length) {
			throw new RuntimeException();
		}
		this.size = var6;
		this.ti = new short[var6];
		this.tx = new short[var6];
		this.ty = new short[var6];
		this.tz = new short[var6];
		this.field3774 = new short[var6];
		for (int var12 = 0; var12 < var6; var12++) {
			this.ti[var12] = tempTi[var12];
			this.tx[var12] = tempTx[var12];
			this.ty[var12] = tempTy[var12];
			this.tz[var12] = tempTz[var12];
			this.field3774[var12] = field3784[var12];
		}
	}
}
