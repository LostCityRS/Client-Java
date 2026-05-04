package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

import java.util.Random;

@ObfuscatedName("e")
public final class TextureOp4 extends TextureOp {

	@ObfuscatedName("e.db")
	public int field787;

	@ObfuscatedName("e.eb")
	public int field788 = 81;

	@ObfuscatedName("e.gb")
	public int field790 = 204;

	@ObfuscatedName("e.hb")
	public int field791;

	@ObfuscatedName("e.jb")
	public int[][] field793;

	@ObfuscatedName("e.lb")
	public int field795;

	@ObfuscatedName("e.nb")
	public int field797 = 4;

	@ObfuscatedName("e.ob")
	public int field798 = 1024;

	@ObfuscatedName("e.pb")
	public int field799 = 8;

	@ObfuscatedName("e.V")
	public int field779 = 1024;

	@ObfuscatedName("e.X")
	public int field781 = 409;

	@ObfuscatedName("e.S")
	public int field776 = 0;

	@ObfuscatedName("e.W")
	public int[] field780;

	@ObfuscatedName("e.T")
	public int[][] field777;

	public TextureOp4() {
		super(0, true);
	}

	@ObfuscatedName("e.e(I)V")
	public void method289() {
		Random var1 = new Random((long) this.field799);
		this.field793 = new int[this.field799][this.field797];
		this.field777 = new int[this.field799][this.field797 + 1];
		this.field795 = 4096 / this.field797;
		this.field787 = this.field788 / 2;
		this.field780 = new int[this.field799 + 1];
		this.field780[0] = 0;
		this.field791 = 4096 / this.field799;
		int var2 = this.field795 / 2;
		int var3 = this.field791 / 2;
		for (int var4 = 0; var4 < this.field799; var4++) {
			if (var4 > 0) {
				int var5 = this.field791;
				int var6 = (Statics.method812(4096, var1) - 2048) * this.field790 >> 12;
				int var7 = var5 + (var3 * var6 >> 12);
				this.field780[var4] = var7 + this.field780[var4 - 1];
			}
			this.field777[var4][0] = 0;
			for (int var8 = 0; var8 < this.field797; var8++) {
				if (var8 > 0) {
					int var9 = this.field795;
					int var10 = (Statics.method812(4096, var1) - 2048) * this.field781 >> 12;
					int var11 = var9 + (var10 * var2 >> 12);
					this.field777[var4][var8] = var11 + this.field777[var4][var8 - 1];
				}
				this.field793[var4][var8] = this.field798 <= 0 ? 4096 : 4096 - Statics.method812(this.field798, var1);
			}
			this.field777[var4][this.field797] = 4096;
		}
		this.field780[this.field799] = 4096;
	}

	@ObfuscatedName("e.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field797 = arg0.g1();
		} else if (arg1 == 1) {
			this.field799 = arg0.g1();
		} else if (arg1 == 2) {
			this.field781 = arg0.g2();
		} else if (arg1 == 3) {
			this.field790 = arg0.g2();
		} else if (arg1 == 4) {
			this.field779 = arg0.g2();
		} else if (arg1 == 5) {
			this.field776 = arg0.g2();
		} else if (arg1 == 6) {
			this.field788 = arg0.g2();
		} else if (arg1 == 7) {
			this.field798 = arg0.g2();
		}
	}

	@ObfuscatedName("e.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = 0;
			int var4;
			for (var4 = this.field776 + Texture.field2021[arg0]; var4 < 0; var4 += 4096) {
			}
			while (var4 > 4096) {
				var4 -= 4096;
			}
			while (this.field799 > var3 && var4 >= this.field780[var3]) {
				var3++;
			}
			int var5 = this.field780[var3];
			boolean var6 = (var3 & 0x1) == 0;
			int var7 = var3 - 1;
			int var8 = this.field780[var3 - 1];
			if (var4 > this.field787 + var8 && var5 - this.field787 > var4) {
				for (int var9 = 0; var9 < Texture.field1276; var9++) {
					int var10 = var6 ? this.field779 : -this.field779;
					int var11 = 0;
					int var12;
					for (var12 = (var10 * this.field795 >> 12) + Texture.field351[var9]; var12 < 0; var12 += 4096) {
					}
					while (var12 > 4096) {
						var12 -= 4096;
					}
					while (this.field797 > var11 && this.field777[var7][var11] <= var12) {
						var11++;
					}
					int var13 = this.field777[var7][var11];
					int var14 = var11 - 1;
					int var15 = this.field777[var7][var14];
					if (var15 + this.field787 < var12 && var12 < var13 - this.field787) {
						var2[var9] = this.field793[var7][var14];
					} else {
						var2[var9] = 0;
					}
				}
			} else {
				ArrayUtil.method837(var2, 0, Texture.field1276, 0);
			}
		}
		return var2;
	}

	@ObfuscatedName("e.b(B)V")
	@Override
	public void method123() {
		this.method289();
	}
}
