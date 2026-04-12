package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.NpcType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("vd")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("vd.Ad")
	public NpcType field3182;

	@ObfuscatedName("vd.f(I)Lpa;")
	@Override
	public Model method41() {
		if (this.field3182 == null) {
			return null;
		}
		SeqType var1 = super.field2015 != -1 && super.field1996 == 0 ? SeqType.method103(super.field2015) : null;
		SeqType var2 = super.field1951 == -1 || super.field2000 == super.field1951 && var1 != null ? null : SeqType.method103(super.field1951);
		Model var3 = this.field3182.method448(var1, var2, super.field1990, super.field1978);
		if (var3 == null) {
			return null;
		}
		var3.method766();
		super.field1991 = var3.field3135;
		if (super.field1965 != -1 && super.field2014 != -1) {
			Model var4 = SpotType.method713(super.field1965).method371(super.field2014);
			if (var4 != null) {
				var4.method796(0, -super.field1984, 0);
				Model[] var5 = new Model[]{var3, var4};
				var3 = new Model(var5, 2, true);
			}
		}
		if (this.field3182.field1084 == 1) {
			var3.field2205 = true;
		}
		return var3;
	}

	@ObfuscatedName("vd.h(I)Z")
	@Override
	public boolean method42() {
		return this.field3182 != null;
	}
}
