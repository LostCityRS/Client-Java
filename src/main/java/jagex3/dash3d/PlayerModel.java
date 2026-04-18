package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.IdkType;
import jagex3.config.NpcType;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;

@ObfuscatedName("la")
public final class PlayerModel {

	@ObfuscatedName("bd.s")
	public static LruCache field379 = new LruCache(260);
	@ObfuscatedName("la.d")
	public boolean field1658;

	@ObfuscatedName("la.m")
	public int[] field1667;

	@ObfuscatedName("la.q")
	public int field1671;

	@ObfuscatedName("la.M")
	public long field1693;

	@ObfuscatedName("la.N")
	public long field1694;

	@ObfuscatedName("la.H")
	public int[] field1688;

	@ObfuscatedName("ra.a(B)V")
	public static void method873() {
		field379.clear();
	}

	@ObfuscatedName("la.a(I)I")
	public int method634() {
		return this.field1671 == -1 ? (this.field1688[4] << 20) + ((this.field1688[0] << 25) + (this.field1667[0] << 15)) + (this.field1667[8] << 10) + (this.field1667[11] << 5) + this.field1667[1] : NpcType.list(this.field1671).id + 305419896;
	}

	@ObfuscatedName("la.a(ILba;)V")
	public void method635(Packet arg0) {
		arg0.p1(this.field1658 ? 1 : 0);
		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.field1667[Statics.field2808[var2]];
			if (var3 == 0) {
				arg0.p1(-1);
			} else {
				arg0.p1(var3 - 256);
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			arg0.p1(this.field1688[var4]);
		}
	}

	@ObfuscatedName("la.a(Lhe;Lhe;IIB)Lpa;")
	public Model method637(SeqType arg0, SeqType arg1, int arg2, int arg3) {
		if (this.field1671 != -1) {
			return NpcType.list(this.field1671).getTempModel(arg0, arg1, arg2, arg3);
		}
		long var5 = this.field1693;
		int[] var7 = this.field1667;
		if (arg0 != null && (arg0.replaceheldleft >= 0 || arg0.replaceheldright >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.field1667[var8];
			}
			if (arg0.replaceheldleft >= 0) {
				var5 += arg0.replaceheldleft - this.field1667[5] << 8;
				var7[5] = arg0.replaceheldleft;
			}
			if (arg0.replaceheldright >= 0) {
				var5 += arg0.replaceheldright - this.field1667[3] << 16;
				var7[3] = arg0.replaceheldright;
			}
		}
		Model var9 = (Model) field379.find(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if (var12 >= 256 && var12 < 512 && !IdkType.list(var12 - 256).checkModel()) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.list(var12 - 512).method940(this.field1658)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field1694 != -1L) {
					var9 = (Model) field379.find(this.field1694);
				}
				if (var9 == null) {
					return null;
				}
			}
			if (var9 == null) {
				Model[] var13 = new Model[12];
				int var14 = 0;
				for (int var15 = 0; var15 < 12; var15++) {
					int var16 = var7[var15];
					if (var16 >= 256 && var16 < 512) {
						Model var17 = IdkType.list(var16 - 256).getModelNoCheck();
						if (var17 != null) {
							var13[var14++] = var17;
						}
					}
					if (var16 >= 512) {
						Model var18 = ObjType.list(var16 - 512).method941(this.field1658);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				var9 = new Model(var13, var14);
				for (int var19 = 0; var19 < 5; var19++) {
					if (this.field1688[var19] != 0) {
						var9.recolour(Statics.field2894[var19][0], Statics.field2894[var19][this.field1688[var19]]);
						if (var19 == 1) {
							var9.recolour(Statics.field1865[0], Statics.field1865[this.field1688[var19]]);
						}
					}
				}
				var9.prepareAnim();
				var9.light(64, 850, -30, -50, -30, true);
				field379.put(var5, var9);
				this.field1694 = var5;
			}
		}
		if (arg0 == null && arg1 == null) {
			return var9;
		}
		Model var20;
		if (arg0 != null && arg1 != null) {
			var20 = arg0.splitAnimateModel(var9, arg1, arg3, arg2);
		} else if (arg0 == null) {
			var20 = arg1.animateModel(arg2, var9);
		} else {
			var20 = arg0.animateModel(arg3, var9);
		}
		return var20;
	}

	@ObfuscatedName("la.c(I)V")
	public void method638() {
		int var1 = this.field1667[9];
		int var2 = this.field1667[5];
		long var3 = this.field1693;
		this.field1667[5] = var1;
		this.field1667[9] = var2;
		this.field1693 = 0L;
		for (int var5 = 0; var5 < 12; var5++) {
			this.field1693 <<= 0x4;
			if (this.field1667[var5] >= 256) {
				this.field1693 += this.field1667[var5] - 256;
			}
		}
		if (this.field1667[0] >= 256) {
			this.field1693 += this.field1667[0] - 256 >> 4;
		}
		if (this.field1667[1] >= 256) {
			this.field1693 += this.field1667[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.field1693 <<= 0x3;
			this.field1693 += this.field1688[var6];
		}
		this.field1693 <<= 0x1;
		this.field1693 += this.field1658 ? 1 : 0;
		this.field1667[5] = var2;
		this.field1667[9] = var1;
		if (var3 != 0L && this.field1693 != var3) {
			field379.remove(var3);
		}
	}

	@ObfuscatedName("la.d(I)Lpa;")
	public Model method639() {
		if (this.field1671 != -1) {
			return NpcType.list(this.field1671).getHead();
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field1667[var2];
			if (var3 >= 256 && var3 < 512 && !IdkType.list(var3 - 256).checkHead()) {
				var1 = true;
			}
			if (var3 >= 512 && !ObjType.list(var3 - 512).method939(this.field1658)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		Model[] var4 = new Model[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field1667[var6];
			if (var7 >= 256 && var7 < 512) {
				Model var8 = IdkType.list(var7 - 256).getHeadNoCheck();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				Model var9 = ObjType.list(var7 - 512).method948(this.field1658);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		Model var10 = new Model(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field1688[var11] != 0) {
				var10.recolour(Statics.field2894[var11][0], Statics.field2894[var11][this.field1688[var11]]);
				if (var11 == 1) {
					var10.recolour(Statics.field1865[0], Statics.field1865[this.field1688[var11]]);
				}
			}
		}
		return var10;
	}

	@ObfuscatedName("la.a([IZI[II)V")
	public void setAppearance(int[] arg0, boolean arg1, int[] arg2, int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < IdkType.numDefinitions; var6++) {
					IdkType var7 = IdkType.list(var6);
					if (var7 != null && !var7.disable && var5 + (arg1 ? 7 : 0) == var7.type) {
						arg0[Statics.field2808[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.field1671 = arg3;
		this.field1658 = arg1;
		this.field1667 = arg0;
		this.field1688 = arg2;
		this.method638();
	}

	@ObfuscatedName("la.a(IZI)V")
	public void method642(int arg0, boolean arg1) {
		if (arg0 == 1 && this.field1658) {
			return;
		}
		int var3 = this.field1667[Statics.field2808[arg0]];
		if (var3 == 0) {
			return;
		}
		var3 -= 256;
		IdkType var4;
		do {
			if (arg1) {
				var3++;
				if (IdkType.numDefinitions <= var3) {
					var3 = 0;
				}
			} else {
				var3--;
				if (var3 < 0) {
					var3 = IdkType.numDefinitions - 1;
				}
			}
			var4 = IdkType.list(var3);
		} while (var4 == null || var4.disable || var4.type != arg0 + (this.field1658 ? 7 : 0));
		this.field1667[Statics.field2808[arg0]] = var3 + 256;
		this.method638();
	}

	@ObfuscatedName("la.a(ZB)V")
	public void method643(boolean arg0) {
		if (this.field1658 != arg0) {
			this.setAppearance(null, arg0, this.field1688, -1);
		}
	}

	@ObfuscatedName("la.b(IZI)V")
	public void method644(boolean arg0, int arg1) {
		int var3 = this.field1688[arg1];
		if (arg0) {
			var3++;
			if (var3 >= Statics.field2894[arg1].length) {
				var3 = 0;
			}
		} else {
			var3--;
			if (var3 < 0) {
				var3 = Statics.field2894[arg1].length - 1;
			}
		}
		this.field1688[arg1] = var3;
		this.method638();
	}
}
