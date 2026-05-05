package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.Client;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.config.SpotType;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

@ObfuscatedName("dj")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("dj.bc")
	public short field761 = 0;

	@ObfuscatedName("dj.cc")
	public int field762 = 0;

	@ObfuscatedName("dj.ec")
	public int field764;

	@ObfuscatedName("dj.ic")
	public PlayerModel field768;

	@ObfuscatedName("dj.jc")
	public short field769 = 0;

	@ObfuscatedName("dj.nc")
	public int field773;

	@ObfuscatedName("dj.Qb")
	public int field750 = -1;

	@ObfuscatedName("dj.Nb")
	public int field747 = 0;

	@ObfuscatedName("dj.Sb")
	public int field752 = 0;

	@ObfuscatedName("dj.Pb")
	public int field749 = 0;

	@ObfuscatedName("dj.Jb")
	public boolean field743 = false;

	@ObfuscatedName("dj.Vb")
	public int field755 = 0;

	@ObfuscatedName("dj.Wb")
	public int field756 = -1;

	@ObfuscatedName("dj.Hb")
	public int field741;

	@ObfuscatedName("dj.Kb")
	public int field744;

	@ObfuscatedName("dj.Lb")
	public int field745;

	@ObfuscatedName("dj.Xb")
	public int field757;

	@ObfuscatedName("dj.Zb")
	public int field759;

	@ObfuscatedName("dj.Yb")
	public ModelLit field758;

	@ObfuscatedName("dj.gc")
	public JagString field766;

	@ObfuscatedName("md.a(Lcg;IIIIII)Lcg;")
	public static ModelLit method897(ModelLit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = (long) arg3;
		ModelLit var8 = (ModelLit) Statics.field1956.find(var6);
		if (var8 == null) {
			ModelUnlit var9 = ModelUnlit.load(Client.models, arg3);
			if (var9 == null) {
				return null;
			}
			var8 = var9.light(64, 768, -50, -10, -50);
			Statics.field1956.put(var6, var8);
		}
		int var10 = arg0.method194();
		int var11 = arg0.method196();
		int var12 = arg0.method186();
		int var13 = arg0.method198();
		ModelLit var14 = var8.method185(true, true);
		if (arg4 != 0) {
			var14.method188(arg4);
		}
		SoftwareModelLit var15 = (SoftwareModelLit) var14;
		if (arg5 != Client.getAvH(var10 + arg2, arg1 + var12, Client.field2907) || Client.getAvH(var11 + arg2, var13 + arg1, Client.field2907) != arg5) {
			for (int var16 = 0; var16 < var15.field2271; var16++) {
				var15.field2286[var16] += Client.getAvH(arg2 + var15.field2264[var16], var15.field2287[var16] - -arg1, Client.field2907) - arg5;
			}
			var15.field2258 = false;
		}
		return var14;
	}

	@ObfuscatedName("dj.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		if (this.field768 == null) {
			return;
		}
		SeqType var11 = super.field4077 != -1 && super.field4140 == 0 ? SeqType.list(super.field4077) : null;
		SeqType var12 = super.field4106 == -1 || this.field743 || super.field4106 == super.field4105 && var11 != null ? null : SeqType.list(super.field4106);
		ModelLit var13 = this.field768.method1430(var12, super.field4101, super.field4127, var11);
		if (var13 == null) {
			return;
		}
		super.field4107 = var13.method88();
		if (Client.localPlayer == this) {
			for (int var14 = Client.field1171.length - 1; var14 >= 0; var14--) {
				HintArrow var15 = Client.field1171[var14];
				if (var15 != null && var15.field2136 != -1) {
					if (var15.field2139 == 1 && var15.field2146 >= 0 && Client.field4223.length > var15.field2146) {
						ClientNpc var16 = Client.field4223[var15.field2146];
						if (var16 != null) {
							int var17 = var16.field4136 / 32 - Client.localPlayer.field4136 / 32;
							int var18 = var16.field4121 / 32 - Client.localPlayer.field4121 / 32;
							this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var18, arg4, var15.field2136, var13, arg6, var17);
						}
					}
					if (var15.field2139 == 2) {
						int var19 = (var15.field2138 - Client.field4212) * 4 + 2 - Client.localPlayer.field4136 / 32;
						int var20 = (var15.field2135 - Client.field3679) * 4 + 2 - Client.localPlayer.field4121 / 32;
						this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var20, arg4, var15.field2136, var13, arg6, var19);
					}
					if (var15.field2139 == 10 && var15.field2146 >= 0 && var15.field2146 < Client.field4491.length) {
						ClientPlayer var21 = Client.field4491[var15.field2146];
						if (var21 != null) {
							int var22 = var21.field4136 / 32 - Client.localPlayer.field4136 / 32;
							int var23 = var21.field4121 / 32 - Client.localPlayer.field4121 / 32;
							this.method286(arg2, arg3, arg7, arg1, arg5, arg0, var23, arg4, var15.field2136, var13, arg6, var22);
						}
					}
				}
			}
		}
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		if (this.field769 != 0 && this.field761 != 0) {
			int var27 = Pix3D.field3359[arg0];
			short var28 = this.field769;
			int var29 = Pix3D.field3354[arg0];
			short var30 = this.field761;
			int var31 = -var28 / 2;
			int var32 = -var30 / 2;
			int var33 = var28 / 2;
			int var34 = var27 * var32 + var31 * var29 >> 16;
			int var35 = var32 * var29 - var27 * var31 >> 16;
			int var36 = Client.getAvH(var34 + super.field4136, super.field4121 + var35, Client.field2907);
			int var37 = -var30 / 2;
			int var38 = var33 * var29 + var27 * var37 >> 16;
			int var39 = var37 * var29 - var33 * var27 >> 16;
			int var40 = Client.getAvH(super.field4136 + var38, var39 + super.field4121, Client.field2907);
			int var41 = var30 / 2;
			int var42 = -var28 / 2;
			int var43 = var29 * var41 - var27 * var42 >> 16;
			int var44 = var29 * var42 + var27 * var41 >> 16;
			int var45 = Client.getAvH(super.field4136 + var44, super.field4121 + var43, Client.field2907);
			int var46 = var28 / 2;
			int var47 = var30 / 2;
			int var48 = var29 * var47 - var27 * var46 >> 16;
			int var49 = var29 * var46 + var27 * var47 >> 16;
			int var50 = Client.getAvH(var49 + super.field4136, super.field4121 + var48, Client.field2907);
			int var51 = var36 + var50;
			if (var40 + var45 < var51) {
				var51 = var45 + var40;
			}
			int var52 = var40 <= var36 ? var40 : var36;
			int var53 = var50 <= var45 ? var50 : var45;
			var24 = (int) (Math.atan2((double) (var52 - var53), (double) var30) * 325.95D) & 0x7FF;
			if (var24 != 0) {
				var13.method197(var24);
			}
			int var54 = var50 <= var40 ? var50 : var40;
			int var55 = var45 <= var36 ? var45 : var36;
			var25 = (int) (Math.atan2((double) (var55 - var54), (double) var28) * 325.95D) & 0x7FF;
			if (var25 != 0) {
				var13.method191(var25);
			}
			var26 = (var51 >> 1) - super.field4097;
			if (var26 != 0) {
				var13.method180(0, var26, 0);
			}
		}
		ModelLit var56 = null;
		if (!this.field743 && super.field4080 != -1 && super.field4075 != -1) {
			SpotType var57 = SpotType.list(super.field4080);
			var56 = var57.getTempModel2(super.field4075);
			if (var56 != null) {
				var56.method180(0, -super.field4125, 0);
				if (var57.field527) {
					if (var24 != 0) {
						var56.method197(var24);
					}
					if (var25 != 0) {
						var56.method191(var25);
					}
					if (var26 != 0) {
						var56.method180(0, var26, 0);
					}
				}
			}
		}
		ModelLit var58 = null;
		if (!this.field743 && this.field758 != null) {
			if (this.field762 <= Client.field2113) {
				this.field758 = null;
			}
			if (this.field755 <= Client.field2113 && this.field762 > Client.field2113) {
				var58 = this.field758;
				var58.method180(this.field773 - super.field4136, this.field759 + -super.field4097, this.field757 - super.field4121);
				if (super.field4119 == 512) {
					var58.method181();
				} else if (super.field4119 == 1024) {
					var58.method190();
				} else if (super.field4119 == 1536) {
					var58.method182();
				}
			}
		}
		if (var56 != null) {
			var13 = ((SoftwareModelLit) var13).method850(var56);
		}
		if (var58 != null) {
			var13 = ((SoftwareModelLit) var13).method850(var58);
		}
		var13.field494 = true;
		var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (var58 == null) {
			return;
		}
		if (super.field4119 == 512) {
			var58.method182();
		} else if (super.field4119 == 1024) {
			var58.method190();
		} else if (super.field4119 == 1536) {
			var58.method181();
		}
		var58.method180(super.field4136 - this.field773, -this.field759 + super.field4097, super.field4121 - this.field757);
	}

	@ObfuscatedName("dj.b()I")
	@Override
	public int method88() {
		return super.field4107;
	}

	@ObfuscatedName("dj.a(Lea;Z)V")
	public void method285(Packet arg0) {
		arg0.pos = 0;
		int var2 = arg0.g1();
		if ((var2 & 0x2) == 2) {
			this.field769 = (short) (arg0.g1() << 2);
			this.field761 = (short) (arg0.g1() << 2);
		} else {
			this.field761 = 0;
			this.field769 = 0;
		}
		super.field4103 = (var2 >> 3) + 1;
		int var3 = var2 & 0x1;
		boolean var4 = (var2 & 0x4) != 0;
		int var5 = -1;
		this.field756 = arg0.g1b();
		int[] var6 = new int[12];
		this.field750 = arg0.g1b();
		this.field752 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var8 = arg0.g1();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				int var9 = arg0.g1();
				int var10 = var9 + (var8 << 8);
				if (var7 == 0 && var10 == 65535) {
					var5 = arg0.g2();
					break;
				}
				if (var10 >= 32768) {
					int var11 = Statics.field1698[var10 - 32768];
					var6[var7] = var11 | 0x40000000;
					int var12 = ObjType.list(var11).team;
					if (var12 != 0) {
						this.field752 = var12;
					}
				} else {
					var6[var7] = Integer.MIN_VALUE | var10 - 256;
				}
			}
		}
		int[] var13 = new int[5];
		for (int var14 = 0; var14 < 5; var14++) {
			int var15 = arg0.g1();
			if (var15 < 0 || var15 >= Client.field96[var14].length) {
				var15 = 0;
			}
			var13[var14] = var15;
		}
		super.field4105 = arg0.g2();
		if (super.field4105 == 65535) {
			super.field4105 = -1;
		}
		super.field4091 = arg0.g2();
		if (super.field4091 == 65535) {
			super.field4091 = -1;
		}
		super.field4128 = super.field4091;
		super.field4092 = arg0.g2();
		if (super.field4092 == 65535) {
			super.field4092 = -1;
		}
		super.field4123 = arg0.g2();
		if (super.field4123 == 65535) {
			super.field4123 = -1;
		}
		super.field4084 = arg0.g2();
		if (super.field4084 == 65535) {
			super.field4084 = -1;
		}
		super.field4122 = arg0.g2();
		if (super.field4122 == 65535) {
			super.field4122 = -1;
		}
		super.field4104 = arg0.g2();
		if (super.field4104 == 65535) {
			super.field4104 = -1;
		}
		this.field766 = JagString.method1375(arg0.g8()).method614();
		this.field747 = arg0.g1();
		if (var4) {
			this.field749 = arg0.g2();
		} else {
			this.field749 = 0;
		}
		if (this.field768 == null) {
			this.field768 = new PlayerModel();
		}
		this.field768.method1431(var5, var6, var13, var3 == 1);
	}

	@ObfuscatedName("dj.a(IIIIIIIIIILcg;II)V")
	public void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, ModelLit arg9, int arg10, int arg11) {
		int var13 = arg11 * arg11 + arg6 * arg6;
		if (var13 < 16 || var13 > 360000) {
			return;
		}
		int var14 = (int) (Math.atan2((double) arg11, (double) arg6) * 325.949D) & 0x7FF;
		ModelLit var15 = method897(arg9, super.field4121, super.field4136, arg8, var14, super.field4097);
		if (var15 != null) {
			var15.method87(0, arg3, arg0, arg1, arg7, arg4, arg10, arg2, -1L);
		}
	}

	@ObfuscatedName("dj.d(I)Z")
	@Override
	public boolean method287() {
		return this.field768 != null;
	}
}
