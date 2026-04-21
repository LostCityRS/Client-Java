package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.IdkType;
import jagex3.config.NpcType;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;

@ObfuscatedName("la")
public final class PlayerModel {

	@ObfuscatedName("bd.s")
	public static LruCache modelCache = new LruCache(260);
    @ObfuscatedName("mc.t")
    public static int[] recol1s = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
	@ObfuscatedName("tb.Rb")
	public static int[][] recol1d = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
	@ObfuscatedName("t.wb")
	public static int[] basePartMap = new int[]{8, 11, 4, 6, 9, 7, 10};
	@ObfuscatedName("la.d")
	public boolean gender;

	@ObfuscatedName("la.m")
	public int[] appearance;

	@ObfuscatedName("la.q")
	public int transmog;

	@ObfuscatedName("la.M")
	public long baseId;

	@ObfuscatedName("la.N")
	public long headModelHashToModelCacheID;

	@ObfuscatedName("la.H")
	public int[] colour;

	@ObfuscatedName("ra.a(B)V")
	public static void resetCache() {
		modelCache.clear();
	}

	@ObfuscatedName("la.a(I)I")
	public int method634() {
		return this.transmog == -1 ? (this.colour[4] << 20) + ((this.colour[0] << 25) + (this.appearance[0] << 15)) + (this.appearance[8] << 10) + (this.appearance[11] << 5) + this.appearance[1] : NpcType.list(this.transmog).id + 305419896;
	}

	@ObfuscatedName("la.a(ILba;)V")
	public void idkSaveDesign(Packet arg0) {
		arg0.p1(this.gender ? 1 : 0);
		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.appearance[basePartMap[var2]];
			if (var3 == 0) {
				arg0.p1(-1);
			} else {
				arg0.p1(var3 - 256);
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			arg0.p1(this.colour[var4]);
		}
	}

	@ObfuscatedName("la.a(Lhe;Lhe;IIB)Lpa;")
	public Model getTempModel(SeqType arg0, SeqType arg1, int arg2, int arg3) {
		if (this.transmog != -1) {
			return NpcType.list(this.transmog).getTempModel(arg0, arg1, arg2, arg3);
		}
		long var5 = this.baseId;
		int[] var7 = this.appearance;
		if (arg0 != null && (arg0.replaceheldleft >= 0 || arg0.replaceheldright >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.appearance[var8];
			}
			if (arg0.replaceheldleft >= 0) {
				var5 += arg0.replaceheldleft - this.appearance[5] << 8;
				var7[5] = arg0.replaceheldleft;
			}
			if (arg0.replaceheldright >= 0) {
				var5 += arg0.replaceheldright - this.appearance[3] << 16;
				var7[3] = arg0.replaceheldright;
			}
		}
		Model var9 = (Model) modelCache.find(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if (var12 >= 256 && var12 < 512 && !IdkType.list(var12 - 256).checkModel()) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.list(var12 - 512).checkWearModel(this.gender)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.headModelHashToModelCacheID != -1L) {
					var9 = (Model) modelCache.find(this.headModelHashToModelCacheID);
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
						Model var18 = ObjType.list(var16 - 512).getWearModelNoCheck(this.gender);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				var9 = new Model(var13, var14);
				for (int var19 = 0; var19 < 5; var19++) {
					if (this.colour[var19] != 0) {
						var9.recolour(recol1d[var19][0], recol1d[var19][this.colour[var19]]);
						if (var19 == 1) {
							var9.recolour(recol1s[0], recol1s[this.colour[var19]]);
						}
					}
				}
				var9.prepareAnim();
				var9.light(64, 850, -30, -50, -30, true);
				modelCache.put(var5, var9);
				this.headModelHashToModelCacheID = var5;
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
	public void calcBaseId() {
		int var1 = this.appearance[9];
		int var2 = this.appearance[5];
		long var3 = this.baseId;
		this.appearance[5] = var1;
		this.appearance[9] = var2;
		this.baseId = 0L;
		for (int var5 = 0; var5 < 12; var5++) {
			this.baseId <<= 0x4;
			if (this.appearance[var5] >= 256) {
				this.baseId += this.appearance[var5] - 256;
			}
		}
		if (this.appearance[0] >= 256) {
			this.baseId += this.appearance[0] - 256 >> 4;
		}
		if (this.appearance[1] >= 256) {
			this.baseId += this.appearance[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.baseId <<= 0x3;
			this.baseId += this.colour[var6];
		}
		this.baseId <<= 0x1;
		this.baseId += this.gender ? 1 : 0;
		this.appearance[5] = var2;
		this.appearance[9] = var1;
		if (var3 != 0L && this.baseId != var3) {
			modelCache.remove(var3);
		}
	}

	@ObfuscatedName("la.d(I)Lpa;")
	public Model getHeadModel() {
		if (this.transmog != -1) {
			return NpcType.list(this.transmog).getHead();
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.appearance[var2];
			if (var3 >= 256 && var3 < 512 && !IdkType.list(var3 - 256).checkHead()) {
				var1 = true;
			}
			if (var3 >= 512 && !ObjType.list(var3 - 512).checkHeadModel(this.gender)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		Model[] var4 = new Model[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.appearance[var6];
			if (var7 >= 256 && var7 < 512) {
				Model var8 = IdkType.list(var7 - 256).getHeadNoCheck();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				Model var9 = ObjType.list(var7 - 512).getHeadModelNoCheck(this.gender);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		Model var10 = new Model(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.colour[var11] != 0) {
				var10.recolour(recol1d[var11][0], recol1d[var11][this.colour[var11]]);
				if (var11 == 1) {
					var10.recolour(recol1s[0], recol1s[this.colour[var11]]);
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
						arg0[basePartMap[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.transmog = arg3;
		this.gender = arg1;
		this.appearance = arg0;
		this.colour = arg2;
		this.calcBaseId();
	}

	@ObfuscatedName("la.a(IZI)V")
	public void idkChangePart(int arg0, boolean arg1) {
		if (arg0 == 1 && this.gender) {
			return;
		}
		int var3 = this.appearance[basePartMap[arg0]];
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
		} while (var4 == null || var4.disable || var4.type != arg0 + (this.gender ? 7 : 0));
		this.appearance[basePartMap[arg0]] = var3 + 256;
		this.calcBaseId();
	}

	@ObfuscatedName("la.a(ZB)V")
	public void idkChangeGender(boolean arg0) {
		if (this.gender != arg0) {
			this.setAppearance(null, arg0, this.colour, -1);
		}
	}

	@ObfuscatedName("la.b(IZI)V")
	public void idkChangeColour(boolean arg0, int arg1) {
		int var3 = this.colour[arg1];
		if (arg0) {
			var3++;
			if (var3 >= recol1d[arg1].length) {
				var3 = 0;
			}
		} else {
			var3--;
			if (var3 < 0) {
				var3 = recol1d[arg1].length - 1;
			}
		}
		this.colour[arg1] = var3;
		this.calcBaseId();
	}
}
