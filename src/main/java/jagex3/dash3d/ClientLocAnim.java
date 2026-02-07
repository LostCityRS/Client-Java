package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.config.LocType;
import jagex3.config.SeqType;

@ObfuscatedName("pb")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("pb.ab")
	public int field2508;

	@ObfuscatedName("pb.bb")
	public SeqType field2509;

	@ObfuscatedName("pb.eb")
	public final int field2512;

	@ObfuscatedName("pb.fb")
	public final int field2513;

	@ObfuscatedName("pb.hb")
	public final int field2515;

	@ObfuscatedName("pb.ib")
	public final int field2516;

	@ObfuscatedName("pb.jb")
	public final int field2517;

	@ObfuscatedName("pb.lb")
	public int field2519;

	@ObfuscatedName("pb.V")
	public final int field2503;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, ModelSource arg8) {
		this.field2515 = arg0;
		this.field2513 = arg1;
		this.field2503 = arg3;
		this.field2516 = arg5;
		this.field2517 = arg2;
		this.field2512 = arg4;
		if (arg6 != -1) {
			this.field2509 = SeqType.method760(arg6);
			this.field2508 = 0;
			this.field2519 = Client.loopCycle - 1;
			if (this.field2509.field3395 == 0 && arg8 != null && arg8 instanceof ClientLocAnim) {
				ClientLocAnim var10 = (ClientLocAnim) arg8;
				if (this.field2509 == var10.field2509) {
					this.field2508 = var10.field2508;
					this.field2519 = var10.field2519;
					return;
				}
			}
			if (arg7 && this.field2509.field3386 != -1) {
				this.field2508 = (int) ((double) this.field2509.field3393.length * Math.random());
				this.field2519 -= (int) ((double) this.field2509.field3376[this.field2508] * Math.random());
				return;
			}
		}
	}

	@ObfuscatedName("pb.b(B)Lod;")
	@Override
	public ModelLit method132() {
		if (this.field2509 != null) {
			int var1 = Client.loopCycle - this.field2519;
			if (var1 > 100 && this.field2509.field3386 > 0) {
				var1 = 100;
			}
			label46: {
				do {
					do {
						if (var1 <= this.field2509.field3376[this.field2508]) {
							break label46;
						}
						var1 -= this.field2509.field3376[this.field2508];
						this.field2508++;
					} while (this.field2509.field3393.length > this.field2508);
					this.field2508 -= this.field2509.field3386;
				} while (this.field2508 >= 0 && this.field2509.field3393.length > this.field2508);
				this.field2509 = null;
			}
			this.field2519 = Client.loopCycle - var1;
		}
		LocType var2 = LocType.list(this.field2515);
		if (var2.field1251 != null) {
			var2 = var2.method422();
		}
		if (var2 == null) {
			return null;
		}
		int var3;
		int var4;
		if (this.field2517 == 1 || this.field2517 == 3) {
			var3 = var2.field1222;
			var4 = var2.field1233;
		} else {
			var4 = var2.field1222;
			var3 = var2.field1233;
		}
		int var5 = this.field2512 + (var4 + 1 >> 1);
		int var6 = this.field2512 + (var4 >> 1);
		int var7 = this.field2516 + (var3 >> 1);
		int var8 = (var3 + 1 >> 1) + this.field2516;
		int[][] var9 = ClientBuild.groundh[this.field2503];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.field2512 << 7) + (var4 << 6);
		int var12 = (this.field2516 << 7) + (var3 << 6);
		return var2.method415(this.field2509, var12, this.field2513, var9, var11, this.field2508, var10, this.field2517);
	}
}
