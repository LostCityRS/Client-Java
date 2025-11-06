package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;

@ObfuscatedName("ab")
public class ClientNpc extends ClientEntity {

	@ObfuscatedName("ab.rb")
	public NpcType field465;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final Model method123() {
		if (this.field465 == null) {
			return null;
		} else {
			Model var2 = this.method129();
			if (var2 == null) {
				return null;
			}
			super.field456 = var2.field406;
			if (super.field443 != -1 && super.field444 != -1) {
				SpotAnimType var3 = SpotAnimType.field1132[super.field443];
				Model var4 = var3.method388();
				if (var4 != null) {
					int var5 = var3.field1136.field1114[super.field444];
					Model var6 = new Model(AnimFrame.method62(var5), false, true, var4);
					var6.method152(0, 0, -super.field447);
					var6.method146();
					var6.method147(var5);
					var6.field571 = null;
					var6.field570 = null;
					if (var3.field1139 != 128 || var3.field1140 != 128) {
						var6.method155(var3.field1139, var3.field1139, var3.field1140);
					}
					var6.method156(var3.field1142 + 64, var3.field1143 + 850, -30, -50, -30, true);
					Model[] var7 = new Model[] { var2, var6 };
					var2 = new Model(2, var7, true);
				}
			}
			if (this.field465.field987 == 1) {
				var2.field572 = true;
			}
			return var2;
		}
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final Model method129() {
		if (super.field438 >= 0 && super.field441 == 0) {
			int var2 = SeqType.field1112[super.field438].field1114[super.field439];
			int var3 = -1;
			if (super.field435 >= 0 && super.field435 != super.field415) {
				var3 = SeqType.field1112[super.field435].field1114[super.field436];
			}
			return this.field465.method346(var2, SeqType.field1112[super.field438].field1118, var3);
		} else {
			int var4 = -1;
			if (super.field435 >= 0) {
				var4 = SeqType.field1112[super.field435].field1114[super.field436];
			}
			return this.field465.method346(var4, null, -1);
		}
	}

	@ObfuscatedName("ab.b(I)Z")
	public final boolean method127() {
		return this.field465 != null;
	}
}
