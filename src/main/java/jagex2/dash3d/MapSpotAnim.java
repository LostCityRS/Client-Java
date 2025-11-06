package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("gb")
public class MapSpotAnim extends ModelSource {

	@ObfuscatedName("gb.o")
	public SpotAnimType field608;

	@ObfuscatedName("gb.p")
	public int field609;

	@ObfuscatedName("gb.q")
	public int field610;

	@ObfuscatedName("gb.r")
	public int field611;

	@ObfuscatedName("gb.s")
	public int field612;

	@ObfuscatedName("gb.t")
	public int field613;

	@ObfuscatedName("gb.u")
	public int field614;

	@ObfuscatedName("gb.v")
	public int field615;

	@ObfuscatedName("gb.w")
	public boolean field616 = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		this.field608 = SpotAnimType.field1132[arg5];
		this.field610 = arg3;
		this.field611 = arg4;
		this.field612 = arg2;
		this.field613 = arg0;
		this.field609 = arg1 + arg7;
		this.field616 = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void method164(int arg0) {
		this.field615 += arg0;
		while (true) {
			do {
				do {
					if (this.field615 <= this.field608.field1136.method384(this.field614)) {
						return;
					}
					this.field615 -= this.field608.field1136.method384(this.field614) + 1;
					this.field614++;
				} while (this.field614 < this.field608.field1136.field1113);
			} while (this.field614 >= 0 && this.field614 < this.field608.field1136.field1113);
			this.field614 = 0;
			this.field616 = true;
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model method123() {
		Model var2 = this.field608.method388();
		if (var2 == null) {
			return null;
		}
		int var3 = this.field608.field1136.field1114[this.field614];
		Model var4 = new Model(AnimFrame.method62(var3), false, true, var2);
		if (!this.field616) {
			var4.method146();
			var4.method147(var3);
			var4.field571 = null;
			var4.field570 = null;
		}
		if (this.field608.field1139 != 128 || this.field608.field1140 != 128) {
			var4.method155(this.field608.field1139, this.field608.field1139, this.field608.field1140);
		}
		if (this.field608.field1141 != 0) {
			if (this.field608.field1141 == 90) {
				var4.method150();
			}
			if (this.field608.field1141 == 180) {
				var4.method150();
				var4.method150();
			}
			if (this.field608.field1141 == 270) {
				var4.method150();
				var4.method150();
				var4.method150();
			}
		}
		var4.method156(this.field608.field1142 + 64, this.field608.field1143 + 850, -30, -50, -30, true);
		return var4;
	}
}
