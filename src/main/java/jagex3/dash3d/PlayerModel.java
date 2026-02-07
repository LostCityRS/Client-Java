package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.IdkType;
import jagex3.config.NPCType;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;

@ObfuscatedName("eb")
public final class PlayerModel {

	@ObfuscatedName("ua.f")
	public static short[][] field3218;
	@ObfuscatedName("oe.r")
	public static int[] field2400 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@ObfuscatedName("fb.S")
	public static LruCache field925 = new LruCache(260);
	@ObfuscatedName("b.j")
	public static short[] field141;
	@ObfuscatedName("fe.x")
	public static short[] field950;
	@ObfuscatedName("pb.X")
	public static short[][] field2505;
	@ObfuscatedName("eb.a")
	public long field588;

	@ObfuscatedName("eb.g")
	public int[] field594;

	@ObfuscatedName("eb.j")
	public int[] field597;

	@ObfuscatedName("eb.m")
	public int field600;

	@ObfuscatedName("eb.n")
	public long field601;

	@ObfuscatedName("eb.s")
	public boolean field606;

	@ObfuscatedName("qd.h(I)V")
	public static void method904() {
		field925.clear();
	}

	@ObfuscatedName("eb.a(Ljd;I)V")
	public void method222(Packet arg0) {
		arg0.p1(this.field606 ? 1 : 0);
		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.field594[field2400[var2]];
			if (var3 == 0) {
				arg0.p1(-1);
			} else {
				arg0.p1(var3 - 256);
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			arg0.p1(this.field597[var4]);
		}
	}

	@ObfuscatedName("eb.a(IZ)V")
	public void method224(boolean arg0) {
		if (this.field606 != arg0) {
			this.setAppearance(this.field597, -1, null, arg0);
		}
	}

	@ObfuscatedName("eb.c(I)V")
	public void method228() {
		long var1 = this.field588;
		this.field588 = 0L;
		int var3 = this.field594[5];
		int var4 = this.field594[9];
		this.field594[9] = var3;
		this.field594[5] = var4;
		for (int var5 = 0; var5 < 12; var5++) {
			this.field588 <<= 0x4;
			if (this.field594[var5] >= 256) {
				this.field588 += this.field594[var5] - 256;
			}
		}
		if (this.field594[0] >= 256) {
			this.field588 += this.field594[0] - 256 >> 4;
		}
		if (this.field594[1] >= 256) {
			this.field588 += this.field594[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.field588 <<= 0x3;
			this.field588 += this.field597[var6];
		}
		this.field588 <<= 0x1;
		this.field588 += this.field606 ? 1 : 0;
		this.field594[9] = var4;
		this.field594[5] = var3;
		if (var1 != 0L && this.field588 != var1) {
			field925.remove(var1);
		}
	}

	@ObfuscatedName("eb.a(BIZ)V")
	public void method229(int arg0, boolean arg1) {
		if (arg0 == 1 && this.field606) {
			return;
		}
		int var3 = this.field594[field2400[arg0]];
		if (var3 == 0) {
			return;
		}
		var3 -= 256;
		IdkType var4;
		do {
			if (arg1) {
				var3++;
				if (IdkType.field2081 <= var3) {
					var3 = 0;
				}
			} else {
				var3--;
				if (var3 < 0) {
					var3 = IdkType.field2081 - 1;
				}
			}
			var4 = IdkType.method1020(var3);
		} while (var4 == null || var4.field1504 || (this.field606 ? 7 : 0) + arg0 != var4.field1515);
		this.field594[field2400[arg0]] = var3 + 256;
		this.method228();
	}

	@ObfuscatedName("eb.d(I)Lp;")
	public ModelUnlit method230() {
		if (this.field600 != -1) {
			return NPCType.method130(this.field600).method752();
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field594[var2];
			if (var3 >= 256 && var3 < 512 && !IdkType.method1020(var3 - 256).method498()) {
				var1 = true;
			}
			if (var3 >= 512 && !ObjType.method1092(var3 - 512).method467(this.field606)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		ModelUnlit[] var4 = new ModelUnlit[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field594[var6];
			if (var7 >= 256 && var7 < 512) {
				ModelUnlit var8 = IdkType.method1020(var7 - 256).method502();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				ModelUnlit var9 = ObjType.method1092(var7 - 512).method473(this.field606);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		ModelUnlit var10 = new ModelUnlit(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field3218[var11].length > this.field597[var11]) {
				var10.method833(field141[var11], field3218[var11][this.field597[var11]]);
			}
			if (field2505[var11].length > this.field597[var11]) {
				var10.method833(field950[var11], field2505[var11][this.field597[var11]]);
			}
		}
		return var10;
	}

	@ObfuscatedName("eb.a(IZI)V")
	public void method231(boolean arg0, int arg1) {
		int var3 = this.field597[arg1];
		if (arg0) {
			var3++;
			if (var3 >= field3218[arg1].length) {
				var3 = 0;
			}
		} else {
			var3--;
			if (var3 < 0) {
				var3 = field3218[arg1].length - 1;
			}
		}
		this.field597[arg1] = var3;
		this.method228();
	}

	@ObfuscatedName("eb.a([II[IZB)V")
	public void setAppearance(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < IdkType.field2081; var6++) {
					IdkType var7 = IdkType.method1020(var6);
					if (var7 != null && !var7.field1504 && var5 + (arg3 ? 7 : 0) == var7.field1515) {
						arg2[field2400[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.field600 = arg1;
		this.field594 = arg2;
		this.field597 = arg0;
		this.field606 = arg3;
		this.method228();
	}

	@ObfuscatedName("eb.a(Lvc;ILvc;II)Lod;")
	public ModelLit method233(SeqType arg0, int arg1, SeqType arg2, int arg3) {
		if (this.field600 != -1) {
			return NPCType.method130(this.field600).method761(arg2, arg3, arg0, arg1);
		}
		long var5 = this.field588;
		int[] var7 = this.field594;
		if (arg0 != null && (arg0.field3390 >= 0 || arg0.field3366 >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.field594[var8];
			}
			if (arg0.field3390 >= 0) {
				var5 += arg0.field3390 - this.field594[5] << 8;
				var7[5] = arg0.field3390;
			}
			if (arg0.field3366 >= 0) {
				var5 += arg0.field3366 - this.field594[3] << 16;
				var7[3] = arg0.field3366;
			}
		}
		ModelLit var9 = (ModelLit) field925.find(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if (var12 >= 256 && var12 < 512 && !IdkType.method1020(var12 - 256).method495()) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.method1092(var12 - 512).method479(this.field606)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field601 != -1L) {
					var9 = (ModelLit) field925.find(this.field601);
				}
				if (var9 == null) {
					return null;
				}
			}
			if (var9 == null) {
				ModelUnlit[] var13 = new ModelUnlit[12];
				int var14 = 0;
				for (int var15 = 0; var15 < 12; var15++) {
					int var16 = var7[var15];
					if (var16 >= 256 && var16 < 512) {
						ModelUnlit var17 = IdkType.method1020(var16 - 256).method500();
						if (var17 != null) {
							var13[var14++] = var17;
						}
					}
					if (var16 >= 512) {
						ModelUnlit var18 = ObjType.method1092(var16 - 512).method469(this.field606);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				ModelUnlit var19 = new ModelUnlit(var13, var14);
				for (int var20 = 0; var20 < 5; var20++) {
					if (this.field597[var20] < field3218[var20].length) {
						var19.method833(field141[var20], field3218[var20][this.field597[var20]]);
					}
					if (this.field597[var20] < field2505[var20].length) {
						var19.method833(field950[var20], field2505[var20][this.field597[var20]]);
					}
				}
				var9 = var19.method847(64, 850, -30, -50, -30);
				field925.put(var5, var9);
				this.field601 = var5;
			}
		}
		if (arg0 == null && arg2 == null) {
			return var9;
		}
		ModelLit var21;
		if (arg0 != null && arg2 != null) {
			var21 = arg0.method1114(arg1, arg2, var9, arg3);
		} else if (arg0 == null) {
			var21 = arg2.method1116(var9, arg1);
		} else {
			var21 = arg0.method1116(var9, arg3);
		}
		return var21;
	}

	@ObfuscatedName("eb.e(I)I")
	public int method234() {
		return this.field600 == -1 ? (this.field594[0] << 15) + ((this.field597[0] << 25) + (this.field597[4] << 20) + (this.field594[8] << 10)) + (this.field594[11] << 5) + this.field594[1] : NPCType.method130(this.field600).field2224 + 305419896;
	}
}
