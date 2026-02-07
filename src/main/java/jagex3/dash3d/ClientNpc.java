package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.NPCType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("q")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("q.Hc")
	public NPCType field2595;

	@ObfuscatedName("q.j(I)Z")
	@Override
	public boolean method578() {
		return this.field2595 != null;
	}

	@ObfuscatedName("q.b(B)Lod;")
	@Override
	public ModelLit method132() {
		if (this.field2595 == null) {
			return null;
		}
		SeqType var1 = super.field2712 != -1 && super.field2715 == 0 ? SeqType.method760(super.field2712) : null;
		SeqType var2 = super.field2708 == -1 || super.field2708 == super.field2687 && var1 != null ? null : SeqType.method760(super.field2708);
		ModelLit var3 = this.field2595.method761(var2, super.field2725, var1, super.field2728);
		if (var3 == null) {
			return null;
		}
		var3.method804();
		super.field2688 = var3.field470;
		if (super.field2731 != -1 && super.field2754 != -1) {
			ModelLit var4 = SpotType.method316(super.field2731).method1017(super.field2754);
			if (var4 != null) {
				var4.method817(0, -super.field2727, 0);
				ModelLit[] var5 = new ModelLit[] { var3, var4 };
				var3 = new ModelLit(var5, 2);
			}
		}
		if (this.field2595.field2196 == 1) {
			var3.field2322 = true;
		}
		return var3;
	}
}
