package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.NpcType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;

@ObfuscatedName("rf")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("rf.Hb")
	public NpcType field3682;

	@ObfuscatedName("rf.d(I)Z")
	@Override
	public boolean method287() {
		return this.field3682 != null;
	}

	@ObfuscatedName("rf.b()I")
	@Override
	public int method88() {
		return super.field4107;
	}

	@ObfuscatedName("rf.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		if (this.field3682 == null) {
			return;
		}
		SeqType var11 = super.field4077 != -1 && super.field4140 == 0 ? SeqType.list(super.field4077) : null;
		SeqType var12 = super.field4106 == -1 || super.field4105 == super.field4106 && var11 != null ? null : SeqType.list(super.field4106);
		ModelLit var13 = this.field3682.method865(var12, super.field4127, super.field4101, var11);
		if (var13 == null) {
			return;
		}
		super.field4107 = var13.method88();
		int var14 = 0;
		int var15 = 0;
		int var16 = 0;
		if (this.field3682.field2350 != 0 && this.field3682.field2329 != 0) {
			int var17 = Pix3D.field3359[arg0];
			int var18 = Pix3D.field3354[arg0];
			short var19 = this.field3682.field2350;
			short var20 = this.field3682.field2329;
			int var21 = -var19 / 2;
			int var22 = -var20 / 2;
			int var23 = var18 * var22 - var17 * var21 >> 16;
			int var24 = var21 * var18 + var17 * var22 >> 16;
			int var25 = Client.method1584(super.field4136 + var24, var23 + super.field4121, Client.field2907);
			int var26 = var19 / 2;
			int var27 = -var20 / 2;
			int var28 = var18 * var26 + var17 * var27 >> 16;
			int var29 = var27 * var18 - var26 * var17 >> 16;
			int var30 = Client.method1584(var28 + super.field4136, var29 + super.field4121, Client.field2907);
			int var31 = -var19 / 2;
			int var32 = var20 / 2;
			int var33 = var18 * var31 + var32 * var17 >> 16;
			int var34 = var32 * var18 - var17 * var31 >> 16;
			int var35 = var19 / 2;
			int var36 = var20 / 2;
			int var37 = var17 * var36 + var18 * var35 >> 16;
			int var38 = Client.method1584(super.field4136 + var33, super.field4121 - -var34, Client.field2907);
			int var39 = var18 * var36 - var17 * var35 >> 16;
			int var40 = Client.method1584(super.field4136 + var37, super.field4121 - -var39, Client.field2907);
			int var41 = var40 + var25;
			if (var41 > var30 + var38) {
				var41 = var30 + var38;
			}
			int var42 = var40 <= var30 ? var40 : var30;
			int var43 = var25 < var30 ? var25 : var30;
			int var44 = var25 < var38 ? var25 : var38;
			int var45 = var40 <= var38 ? var40 : var38;
			var14 = (int) (Math.atan2((double) (var43 - var45), (double) var20) * 325.95D) & 0x7FF;
			if (var14 != 0) {
				var13.method197(var14);
			}
			var15 = (int) (Math.atan2((double) (var44 - var42), (double) var19) * 325.95D) & 0x7FF;
			if (var15 != 0) {
				var13.method191(var15);
			}
			var16 = (var41 >> 1) - super.field4097;
			if (var16 != 0) {
				var13.method180(0, var16, 0);
			}
		}
		ModelLit var46 = null;
		if (super.field4080 != -1 && super.field4075 != -1) {
			SpotType var47 = SpotType.list(super.field4080);
			var46 = var47.method209(super.field4075);
			if (var46 != null) {
				var46.method180(0, -super.field4125, 0);
				if (var47.field527) {
					if (var14 != 0) {
						var46.method197(var14);
					}
					if (var15 != 0) {
						var46.method191(var15);
					}
					if (var16 != 0) {
						var46.method180(0, var16, 0);
					}
				}
			}
		}
		if (var46 != null) {
			var13 = ((SoftwareModelLit) var13).method850(var46);
		}
		if (this.field3682.field2349 == 1) {
			var13.field494 = true;
		}
		var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
