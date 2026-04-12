package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.SeqType;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("aa")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("aa.ae")
	public static int field96 = 0;

	@ObfuscatedName("aa.be")
	public int field97;

	@ObfuscatedName("aa.de")
	public int field99;

	@ObfuscatedName("aa.vd")
	public int field65 = 0;

	@ObfuscatedName("aa.wd")
	public int field66;

	@ObfuscatedName("aa.Cd")
	public static int field72 = 0;

	@ObfuscatedName("aa.yd")
	public int field68 = 0;

	@ObfuscatedName("aa.Ed")
	public int field74 = 0;

	@ObfuscatedName("aa.Ld")
	public int field81 = -1;

	@ObfuscatedName("aa.Gd")
	public int field76 = -1;

	@ObfuscatedName("aa.Md")
	public int field82 = 0;

	@ObfuscatedName("aa.Vd")
	public int field91 = 0;

	@ObfuscatedName("aa.Zd")
	public boolean field95 = false;

	@ObfuscatedName("aa.Ad")
	public int field70;

	@ObfuscatedName("aa.Jd")
	public int field79;

	@ObfuscatedName("aa.Kd")
	public int field80;

	@ObfuscatedName("aa.Od")
	public int field84;

	@ObfuscatedName("aa.Td")
	public int field89;

	@ObfuscatedName("aa.Qd")
	public JagString field86;

	@ObfuscatedName("aa.Ud")
	public PlayerModel field90;

	@ObfuscatedName("aa.Dd")
	public ModelLit field73;

	@ObfuscatedName("aa.f(I)Lpa;")
	@Override
	public ModelLit method41() {
		if (this.field90 == null) {
			return null;
		}
		SeqType var1 = super.field2015 != -1 && super.field1996 == 0 ? Statics.method103(super.field2015) : null;
		SeqType var2 = super.field1951 == -1 || this.field95 || super.field2000 == super.field1951 && var1 != null ? null : Statics.method103(super.field1951);
		ModelLit var3 = this.field90.method637(var1, var2, super.field1990, super.field1978);
		if (var3 == null) {
			return null;
		}
		var3.method766();
		super.field1991 = var3.field3135;
		if (!this.field95 && super.field1965 != -1 && super.field2014 != -1) {
			ModelLit var4 = Statics.method713(super.field1965).method371(super.field2014);
			if (var4 != null) {
				var4.method796(0, -super.field1984, 0);
				ModelLit[] var5 = new ModelLit[] { var3, var4 };
				var3 = new ModelLit(var5, 2, true);
			}
		}
		if (!this.field95 && this.field73 != null) {
			if (Linkable.field2063 >= this.field82) {
				this.field73 = null;
			}
			if (this.field91 <= Linkable.field2063 && this.field82 > Linkable.field2063) {
				ModelLit var6 = this.field73;
				var6.method796(this.field79 - super.field1972, -this.field84 + this.field80, this.field99 - super.field1963);
				if (super.field1954 == 512) {
					var6.method781();
					var6.method781();
					var6.method781();
				} else if (super.field1954 == 1024) {
					var6.method781();
					var6.method781();
				} else if (super.field1954 == 1536) {
					var6.method781();
				}
				ModelLit[] var7 = new ModelLit[] { var3, var6 };
				var3 = new ModelLit(var7, 2, true);
				if (super.field1954 == 512) {
					var6.method781();
				} else if (super.field1954 == 1024) {
					var6.method781();
					var6.method781();
				} else if (super.field1954 == 1536) {
					var6.method781();
					var6.method781();
					var6.method781();
				}
				var6.method796(super.field1972 - this.field79, -this.field80 + this.field84, super.field1963 - this.field99);
			}
		}
		var3.field2205 = true;
		return var3;
	}

	@ObfuscatedName("aa.h(I)Z")
	@Override
	public boolean method42() {
		return this.field90 != null;
	}

	@ObfuscatedName("aa.a(BLba;)V")
	public void method43(Packet arg0) {
		arg0.field267 = 0;
		int var2 = arg0.method144();
		this.field76 = arg0.method184();
		this.field81 = arg0.method184();
		int var3 = -1;
		this.field74 = 0;
		int[] var4 = new int[12];
		for (int var5 = 0; var5 < 12; var5++) {
			int var6 = arg0.method144();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				int var7 = arg0.method144();
				var4[var5] = (var6 << 8) + var7;
				if (var5 == 0 && var4[0] == 65535) {
					var3 = arg0.method145();
					break;
				}
				if (var4[var5] >= 512) {
					int var8 = Statics.method760(var4[var5] - 512).field2854;
					if (var8 != 0) {
						this.field74 = var8;
					}
				}
			}
		}
		int[] var9 = new int[5];
		for (int var10 = 0; var10 < 5; var10++) {
			int var11 = arg0.method144();
			if (var11 < 0 || MapSpotAnim.field2894[var10].length <= var11) {
				var11 = 0;
			}
			var9[var10] = var11;
		}
		super.field2000 = arg0.method145();
		if (super.field2000 == 65535) {
			super.field2000 = -1;
		}
		super.field2019 = arg0.method145();
		if (super.field2019 == 65535) {
			super.field2019 = -1;
		}
		super.field1957 = super.field2019;
		super.field2005 = arg0.method145();
		if (super.field2005 == 65535) {
			super.field2005 = -1;
		}
		super.field1953 = arg0.method145();
		if (super.field1953 == 65535) {
			super.field1953 = -1;
		}
		super.field1949 = arg0.method145();
		if (super.field1949 == 65535) {
			super.field1949 = -1;
		}
		super.field2006 = arg0.method145();
		if (super.field2006 == 65535) {
			super.field2006 = -1;
		}
		super.field1956 = arg0.method145();
		if (super.field1956 == 65535) {
			super.field1956 = -1;
		}
		this.field86 = Statics.method969(arg0.method174()).method36();
		this.field68 = arg0.method144();
		this.field65 = arg0.method145();
		if (this.field90 == null) {
			this.field90 = new PlayerModel();
		}
		this.field90.method640(var4, var2 == 1, var9, var3);
	}
}
