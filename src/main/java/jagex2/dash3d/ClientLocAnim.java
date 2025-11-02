package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;

public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("NRPYRAWK.s")
	public int field1334;

	@ObfuscatedName("NRPYRAWK.t")
	public int field1335;

	@ObfuscatedName("NRPYRAWK.u")
	public int field1336;

	@ObfuscatedName("NRPYRAWK.n")
	public int field1329;

	@ObfuscatedName("NRPYRAWK.o")
	public int field1330;

	@ObfuscatedName("NRPYRAWK.p")
	public int field1331;

	@ObfuscatedName("NRPYRAWK.q")
	public int field1332;

	@ObfuscatedName("NRPYRAWK.w")
	public SeqType field1338;

	@ObfuscatedName("NRPYRAWK.C")
	public int field1344;

	@ObfuscatedName("NRPYRAWK.B")
	public int field1343;

	@ObfuscatedName("NRPYRAWK.x")
	public int field1339;

	@ObfuscatedName("NRPYRAWK.y")
	public int field1340;

	@ObfuscatedName("NRPYRAWK.z")
	public int[] field1341;

	@ObfuscatedName("NRPYRAWK.v")
	public static Client varProvider;

	@ObfuscatedName("NRPYRAWK.a(I)LYMYTDPVW;")
	public LocType method440() {
		int var2 = -1;
		if (this.field1339 != -1) {
			VarbitType var3 = VarbitType.field1760[this.field1339];
			int var4 = var3.field1762;
			int var5 = var3.field1763;
			int var6 = var3.field1764;
			int var7 = Client.VARBIT_MASKS[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.field1340 != -1) {
			var2 = varProvider.varps[this.field1340];
		}
		return var2 < 0 || var2 >= this.field1341.length || this.field1341[var2] == -1 ? null : LocType.method561(this.field1341[var2]);
	}

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg6, boolean arg7, int arg8, int arg9) {
		this.field1334 = arg6;
		this.field1335 = arg4;
		this.field1336 = arg9;
		this.field1329 = arg8;
		this.field1330 = arg3;
		this.field1331 = arg1;
		this.field1332 = arg2;
		if (arg0 != -1) {
			this.field1338 = SeqType.field775[arg0];
			this.field1344 = 0;
			this.field1343 = Client.loopCycle - 1;
			if (arg7 && this.field1338.field780 != -1) {
				this.field1344 = (int) (Math.random() * (double) this.field1338.field776);
				this.field1343 -= (int) (Math.random() * (double) this.field1338.method214(this.field1344));
			}
		}
		LocType var11 = LocType.method561(this.field1334);
		this.field1339 = var11.field1632;
		this.field1340 = var11.field1635;
		this.field1341 = var11.field1659;
	}

	@ObfuscatedName("NRPYRAWK.a(B)LLZYQDKJV;")
	public Model method239() {
		int var2 = -1;
		if (this.field1338 != null) {
			int var3 = Client.loopCycle - this.field1343;
			if (var3 > 100 && this.field1338.field780 > 0) {
				var3 = 100;
			}
			label49: {
				do {
					do {
						if (var3 <= this.field1338.method214(this.field1344)) {
							break label49;
						}
						var3 -= this.field1338.method214(this.field1344);
						this.field1344++;
					} while (this.field1344 < this.field1338.field776);
					this.field1344 -= this.field1338.field780;
				} while (this.field1344 >= 0 && this.field1344 < this.field1338.field776);
				this.field1338 = null;
			}
			this.field1343 = Client.loopCycle - var3;
			if (this.field1338 != null) {
				var2 = this.field1338.field777[this.field1344];
			}
		}
		LocType var4;
		if (this.field1341 == null) {
			var4 = LocType.method561(this.field1334);
		} else {
			var4 = this.method440();
		}
		return var4 == null ? null : var4.method569(this.field1335, this.field1336, this.field1329, this.field1330, this.field1331, this.field1332, var2);
	}
}
