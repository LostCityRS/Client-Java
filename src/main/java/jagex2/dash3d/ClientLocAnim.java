package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("cb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("cb.m")
	public int field491;

	@ObfuscatedName("cb.n")
	public int field492;

	@ObfuscatedName("cb.o")
	public int field493;

	@ObfuscatedName("cb.p")
	public int field494;

	@ObfuscatedName("cb.q")
	public int field495;

	@ObfuscatedName("cb.r")
	public int field496;

	@ObfuscatedName("cb.s")
	public int field497;

	@ObfuscatedName("cb.t")
	public SeqType field498;

	@ObfuscatedName("cb.u")
	public int field499;

	@ObfuscatedName("cb.v")
	public int field500;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
		this.field491 = arg3;
		this.field492 = arg0;
		this.field493 = arg1;
		this.field494 = arg2;
		this.field495 = arg9;
		this.field496 = arg5;
		this.field497 = arg6;
		this.field498 = SeqType.field1112[arg8];
		this.field499 = 0;
		this.field500 = Client.field1591;
		if (arg7 && this.field498.field1117 != -1) {
			this.field499 = (int) (Math.random() * (double) this.field498.field1113);
			this.field500 -= (int) (Math.random() * (double) this.field498.method384(this.field499));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model method123() {
		if (this.field498 != null) {
			int var2 = Client.field1591 - this.field500;
			if (var2 > 100 && this.field498.field1117 > 0) {
				var2 = 100;
			}
			label37: {
				do {
					do {
						if (var2 <= this.field498.method384(this.field499)) {
							break label37;
						}
						var2 -= this.field498.method384(this.field499);
						this.field499++;
					} while (this.field499 < this.field498.field1113);
					this.field499 -= this.field498.field1117;
				} while (this.field499 >= 0 && this.field499 < this.field498.field1113);
				this.field498 = null;
			}
			this.field500 = Client.field1591 - var2;
		}
		int var3 = -1;
		if (this.field498 != null) {
			var3 = this.field498.field1114[this.field499];
		}
		LocType var4 = LocType.method334(this.field491);
		Model var5 = var4.method340(this.field492, this.field493, this.field494, this.field495, this.field496, this.field497, var3);
		return var5;
	}
}
