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
	public static short[][] recol1d;
	@ObfuscatedName("oe.r")
	public static int[] basePartMap = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@ObfuscatedName("fb.S")
	public static LruCache modelCache = new LruCache(260);
	@ObfuscatedName("b.j")
	public static short[] recol1s;
	@ObfuscatedName("fe.x")
	public static short[] recol2s;
	@ObfuscatedName("pb.X")
	public static short[][] recol2d;
	@ObfuscatedName("eb.a")
	public long baseId;

	@ObfuscatedName("eb.g")
	public int[] appearance;

	@ObfuscatedName("eb.j")
	public int[] colour;

	@ObfuscatedName("eb.m")
	public int transmog;

	@ObfuscatedName("eb.n")
	public long headModelHashToModelCacheID;

	@ObfuscatedName("eb.s")
	public boolean gender;

	@ObfuscatedName("qd.h(I)V")
	public static void resetCache() {
		modelCache.clear();
	}

	@ObfuscatedName("eb.a(Ljd;I)V")
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

	@ObfuscatedName("eb.a(IZ)V")
	public void idkChangeGender(boolean arg0) {
		if (this.gender != arg0) {
			this.setAppearance(this.colour, -1, null, arg0);
		}
	}

	@ObfuscatedName("eb.c(I)V")
	public void calcBaseId() {
		long var1 = this.baseId;
		this.baseId = 0L;
		int var3 = this.appearance[5];
		int var4 = this.appearance[9];
		this.appearance[9] = var3;
		this.appearance[5] = var4;
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
		this.appearance[9] = var4;
		this.appearance[5] = var3;
		if (var1 != 0L && this.baseId != var1) {
			modelCache.remove(var1);
		}
	}

	@ObfuscatedName("eb.a(BIZ)V")
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
		} while (var4 == null || var4.disable || (this.gender ? 7 : 0) + arg0 != var4.type);
		this.appearance[basePartMap[arg0]] = var3 + 256;
		this.calcBaseId();
	}

	@ObfuscatedName("eb.d(I)Lp;")
	public ModelUnlit getHeadModel() {
		if (this.transmog != -1) {
			return NPCType.list(this.transmog).getHead();
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
		ModelUnlit[] var4 = new ModelUnlit[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.appearance[var6];
			if (var7 >= 256 && var7 < 512) {
				ModelUnlit var8 = IdkType.list(var7 - 256).getHeadNoCheck();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				ModelUnlit var9 = ObjType.list(var7 - 512).getHeadModelNoCheck(this.gender);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		ModelUnlit var10 = new ModelUnlit(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (recol1d[var11].length > this.colour[var11]) {
				var10.recolour(recol1s[var11], recol1d[var11][this.colour[var11]]);
			}
			if (recol2d[var11].length > this.colour[var11]) {
				var10.recolour(recol2s[var11], recol2d[var11][this.colour[var11]]);
			}
		}
		return var10;
	}

	@ObfuscatedName("eb.a(IZI)V")
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

	@ObfuscatedName("eb.a([II[IZB)V")
	public void setAppearance(int[] arg0, int arg1, int[] arg2, boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < IdkType.numDefinitions; var6++) {
					IdkType var7 = IdkType.list(var6);
					if (var7 != null && !var7.disable && var5 + (arg3 ? 7 : 0) == var7.type) {
						arg2[basePartMap[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.transmog = arg1;
		this.appearance = arg2;
		this.colour = arg0;
		this.gender = arg3;
		this.calcBaseId();
	}

	@ObfuscatedName("eb.a(Lvc;ILvc;II)Lod;")
	public ModelLit getTempModel(SeqType arg0, int arg1, SeqType arg2, int arg3) {
		if (this.transmog != -1) {
			return NPCType.list(this.transmog).getTempModel(arg2, arg3, arg0, arg1);
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
		ModelLit var9 = (ModelLit) modelCache.find(var5);
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
					var9 = (ModelLit) modelCache.find(this.headModelHashToModelCacheID);
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
						ModelUnlit var17 = IdkType.list(var16 - 256).getModelNoCheck();
						if (var17 != null) {
							var13[var14++] = var17;
						}
					}
					if (var16 >= 512) {
						ModelUnlit var18 = ObjType.list(var16 - 512).getWearModelNoCheck(this.gender);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				ModelUnlit var19 = new ModelUnlit(var13, var14);
				for (int var20 = 0; var20 < 5; var20++) {
					if (this.colour[var20] < recol1d[var20].length) {
						var19.recolour(recol1s[var20], recol1d[var20][this.colour[var20]]);
					}
					if (this.colour[var20] < recol2d[var20].length) {
						var19.recolour(recol2s[var20], recol2d[var20][this.colour[var20]]);
					}
				}
				var9 = var19.light(64, 850, -30, -50, -30);
				modelCache.put(var5, var9);
				this.headModelHashToModelCacheID = var5;
			}
		}
		if (arg0 == null && arg2 == null) {
			return var9;
		}
		ModelLit var21;
		if (arg0 != null && arg2 != null) {
			var21 = arg0.splitAnimateModel(arg1, arg2, var9, arg3);
		} else if (arg0 == null) {
			var21 = arg2.animateModel(var9, arg1);
		} else {
			var21 = arg0.animateModel(var9, arg3);
		}
		return var21;
	}

	@ObfuscatedName("eb.e(I)I")
	public int method234() {
		return this.transmog == -1 ? (this.appearance[0] << 15) + ((this.colour[0] << 25) + (this.colour[4] << 20) + (this.appearance[8] << 10)) + (this.appearance[11] << 5) + this.appearance[1] : NPCType.list(this.transmog).id + 305419896;
	}
}
