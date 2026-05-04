package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.config.LocType;
import jagex3.config.SeqType;

@ObfuscatedName("hd")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("hd.n")
	public final int field1454;

	@ObfuscatedName("hd.q")
	public final int field1457;

	@ObfuscatedName("hd.r")
	public final int field1458;

	@ObfuscatedName("hd.s")
	public SeqType field1459;

	@ObfuscatedName("hd.t")
	public int field1460 = -32768;

	@ObfuscatedName("hd.w")
	public int field1463;

	@ObfuscatedName("hd.F")
	public final int field1472;

	@ObfuscatedName("hd.z")
	public final int field1466;

	@ObfuscatedName("hd.C")
	public final int field1469;

	@ObfuscatedName("hd.H")
	public int field1474;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, ModelSource arg8) {
		this.field1472 = arg0;
		this.field1458 = arg2;
		this.field1466 = arg3;
		this.field1454 = arg5;
		this.field1469 = arg1;
		this.field1457 = arg4;
		if (arg6 != -1) {
			this.field1459 = SeqType.list(arg6);
			this.field1474 = 0;
			this.field1463 = Client.field2113 - 1;
			if (this.field1459.field1966 == 0 && arg8 != null && arg8 instanceof ClientLocAnim) {
				ClientLocAnim var10 = (ClientLocAnim) arg8;
				if (this.field1459 == var10.field1459) {
					this.field1474 = var10.field1474;
					this.field1463 = var10.field1463;
					return;
				}
			}
			if (arg7 && this.field1459.field1972 != -1) {
				this.field1474 = (int) ((double) this.field1459.field1965.length * Math.random());
				this.field1463 -= (int) (Math.random() * (double) this.field1459.field1990[this.field1474]);
				return;
			}
		}
	}

	@ObfuscatedName("hd.b()I")
	@Override
	public int method88() {
		return this.field1460;
	}

	@ObfuscatedName("hd.b(I)Lnc;")
	public ModelSource method536() {
		boolean var1 = World.field2721 != ClientBuild.groundh;
		LocType var2 = LocType.list(this.field1472);
		if (var2.field2770 != null) {
			var2 = var2.method998();
		}
		if (var2 == null) {
			return null;
		}
		int var3;
		int var4;
		if (this.field1458 == 1 || this.field1458 == 3) {
			var4 = var2.field2774;
			var3 = var2.field2794;
		} else {
			var3 = var2.field2774;
			var4 = var2.field2794;
		}
		int var5 = (var3 + 1 >> 1) + this.field1457;
		int var6 = (var3 >> 1) + this.field1457;
		int var7 = this.field1454 + (var4 >> 1);
		int var8 = this.field1454 + (var4 + 1 >> 1);
		this.method537(var6 * 128, var7 * 128);
		int[][] var9 = ClientBuild.groundh[this.field1466];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.field1457 << 7) + (var3 << 6);
		int[][] var12 = null;
		int var13 = (this.field1454 << 7) + (var4 << 6);
		if (var1) {
			var12 = World.field2721[0];
		} else if (this.field1466 < 3) {
			var12 = ClientBuild.groundh[this.field1466 + 1];
		}
		ModelCacheLit var14;
		if (this.field1459 == null) {
			var14 = var2.method997(this.field1469, var12, var9, var11, false, var13, this.field1458, var10);
		} else {
			var14 = var2.method1004(var10, var11, this.field1469, var13, this.field1474, this.field1459, var9, var12, this.field1458);
		}
		return var14 == null ? null : var14.field3984;
	}

	@ObfuscatedName("hd.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelSource var11 = this.method536();
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field1460 = var11.method88();
		}
	}

	@ObfuscatedName("hd.b(III)V")
	@Override
	public void method537(int arg0, int arg1) {
		if (this.field1459 == null) {
			return;
		}
		int var3 = Client.field2113 - this.field1463;
		if (var3 > 100 && this.field1459.field1972 > 0) {
			int var4 = this.field1459.field1965.length - this.field1459.field1972;
			while (this.field1474 < var4 && var3 > this.field1459.field1990[this.field1474]) {
				var3 -= this.field1459.field1990[this.field1474];
				this.field1474++;
			}
			if (var4 <= this.field1474) {
				int var5 = 0;
				for (int var6 = var4; var6 < this.field1459.field1965.length; var6++) {
					var5 += this.field1459.field1990[var6];
				}
				var3 %= var5;
			}
		}
		label56: {
			do {
				do {
					if (var3 <= this.field1459.field1990[this.field1474]) {
						break label56;
					}
					Client.method433(false, arg1, this.field1474, arg0, this.field1459);
					var3 -= this.field1459.field1990[this.field1474];
					this.field1474++;
				} while (this.field1459.field1965.length > this.field1474);
				this.field1474 -= this.field1459.field1972;
			} while (this.field1474 >= 0 && this.field1459.field1965.length > this.field1474);
			this.field1459 = null;
		}
		this.field1463 = Client.field2113 - var3;
	}
}
