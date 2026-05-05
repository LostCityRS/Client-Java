package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.config.IdkType;
import jagex3.config.NpcType;
import jagex3.config.ObjType;
import jagex3.config.SeqType;
import jagex3.io.Packet;

@ObfuscatedName("tb")
public final class PlayerModel {

	@ObfuscatedName("ie.f")
	public static final ModelSourceCache modelCache = new ModelSourceCache(260);
	@ObfuscatedName("n.d")
	public static final ModelSourceCache field2616 = new ModelSourceCache(5);
	@ObfuscatedName("ej.j")
	public static final int[] basePartMap = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@ObfuscatedName("tb.b")
	public boolean gender;

	@ObfuscatedName("tb.g")
	public int[] colour;

	@ObfuscatedName("tb.k")
	public int[] appearance;

	@ObfuscatedName("tb.s")
	public long baseId;

	@ObfuscatedName("tb.t")
	public int transmog;

	@ObfuscatedName("tb.w")
	public long headModelHashToModelCacheID;

	@ObfuscatedName("s.c(Z)V")
	public static void resetCache() {
		modelCache.clear();
	}

	@ObfuscatedName("tb.a(I)I")
	public int method1427() {
		return this.transmog == -1 ? (this.appearance[11] << 5) + (this.colour[0] << 25) + (this.colour[4] << 20) + (this.appearance[0] << 15) + (this.appearance[8] << 10) + this.appearance[1] : 305419896 - -NpcType.list(this.transmog).id;
	}

	@ObfuscatedName("tb.a(BLk;I)Lcg;")
	public ModelLit getHeadModel(SeqType arg0, int arg1) {
		if (this.transmog != -1) {
			return NpcType.list(this.transmog).getHeadModelLit(arg1, arg0);
		}
		ModelLit var3 = (ModelLit) field2616.find(this.baseId);
		if (var3 == null) {
			boolean var4 = false;
			for (int var5 = 0; var5 < 12; var5++) {
				int var6 = this.appearance[var5];
				if ((var6 & 0x40000000) == 0) {
					if ((var6 & Integer.MIN_VALUE) != 0 && !IdkType.list(var6 & 0x3FFFFFFF).checkModel()) {
						var4 = true;
					}
				} else if (!ObjType.list(var6 & 0x3FFFFFFF).checkHeadModel(this.gender)) {
					var4 = true;
				}
			}
			if (var4) {
				return null;
			}
			int var7 = 0;
			ModelUnlit[] var8 = new ModelUnlit[12];
			for (int var9 = 0; var9 < 12; var9++) {
				int var10 = this.appearance[var9];
				if ((var10 & 0x40000000) != 0) {
					ModelUnlit var12 = ObjType.list(var10 & 0x3FFFFFFF).getHeadModelNoCheck(this.gender);
					if (var12 != null) {
						var8[var7++] = var12;
					}
				} else if ((var10 & Integer.MIN_VALUE) != 0) {
					ModelUnlit var11 = IdkType.list(var10 & 0x3FFFFFFF).getHeadNoCheck();
					if (var11 != null) {
						var8[var7++] = var11;
					}
				}
			}
			ModelUnlit var13 = new ModelUnlit(var8, var7);
			for (int var14 = 0; var14 < 5; var14++) {
				if (this.colour[var14] < Client.field96[var14].length) {
					var13.recolour(Client.field219[var14], Client.field96[var14][this.colour[var14]]);
				}
				if (this.colour[var14] < Client.field1596[var14].length) {
					var13.recolour(Client.field2750[var14], Client.field1596[var14][this.colour[var14]]);
				}
			}
			var3 = var13.light(64, 768, -50, -10, -50);
			field2616.put(this.baseId, var3);
		}
		if (arg0 != null) {
			var3 = arg0.animateModelWithExtra(arg1, var3);
		}
		return var3;
	}

	@ObfuscatedName("tb.b(I)V")
	public void calcBaseId() {
		long var1 = this.baseId;
		this.baseId = -1L;
		long[] var3 = Packet.crctable64;
		for (int var4 = 0; var4 < 12; var4++) {
			this.baseId = var3[(int) (((long) (this.appearance[var4] >> 24) ^ this.baseId) & 0xFFL)] ^ this.baseId >>> 8;
			this.baseId = this.baseId >>> 8 ^ var3[(int) (((long) (this.appearance[var4] >> 16) ^ this.baseId) & 0xFFL)];
			this.baseId = this.baseId >>> 8 ^ var3[(int) (((long) (this.appearance[var4] >> 8) ^ this.baseId) & 0xFFL)];
			this.baseId = this.baseId >>> 8 ^ var3[(int) (((long) this.appearance[var4] ^ this.baseId) & 0xFFL)];
		}
		for (int var5 = 0; var5 < 5; var5++) {
			this.baseId = var3[(int) (((long) this.colour[var5] ^ this.baseId) & 0xFFL)] ^ this.baseId >>> 8;
		}
		this.baseId = var3[(int) ((this.baseId ^ (long) (this.gender ? 1 : 0)) & 0xFFL)] ^ this.baseId >>> 8;
		if (var1 != 0L && var1 != this.baseId) {
			modelCache.method133(var1);
		}
	}

	@ObfuscatedName("tb.a(Lk;IIILk;)Lcg;")
	public ModelLit getTempModel(SeqType arg0, int arg1, int arg2, SeqType arg3) {
		if (this.transmog != -1) {
			return NpcType.list(this.transmog).getTempModel(arg0, arg2, arg1, arg3);
		}
		long var5 = this.baseId;
		int[] var7 = this.appearance;
		if (arg3 != null && (arg3.replaceheldleft >= 0 || arg3.replaceheldright >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.appearance[var8];
			}
			if (arg3.replaceheldleft >= 0) {
				if (arg3.replaceheldleft == 65535) {
					var7[5] = 0;
					var5 ^= 0xFFFFFFFF00000000L;
				} else {
					var7[5] = arg3.replaceheldleft | 0x40000000;
					var5 ^= (long) var7[5] << 32;
				}
			}
			if (arg3.replaceheldright >= 0) {
				if (arg3.replaceheldright == 65535) {
					var7[3] = 0;
					var5 ^= 0xFFFFFFFFL;
				} else {
					var7[3] = arg3.replaceheldright | 0x40000000;
					var5 ^= var7[3];
				}
			}
		}
		ModelLit var9 = (ModelLit) modelCache.find(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if ((var12 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & var12) != 0 && !IdkType.list(var12 & 0x3FFFFFFF).checkHead()) {
						var10 = true;
					}
				} else if (!ObjType.list(var12 & 0x3FFFFFFF).checkWearModel(this.gender)) {
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
					if ((var16 & 0x40000000) != 0) {
						ModelUnlit var17 = ObjType.list(var16 & 0x3FFFFFFF).getWearModelNoCheck(this.gender);
						if (var17 != null) {
							var13[var14++] = var17;
						}
					} else if ((Integer.MIN_VALUE & var16) != 0) {
						ModelUnlit var18 = IdkType.list(var16 & 0x3FFFFFFF).getModelNoCheck();
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				int var19 = var7[0];
				if ((var19 & 0x40000000) != 0) {
					ObjType var20 = ObjType.list(var19 & 0x3FFFFFFF);
					if (var20.field2839 != null) {
						for (int var21 = 0; var21 < var20.field2839.length; var21++) {
							int var22 = var20.field2839[var21][1];
							int var23 = var20.field2839[var21][3];
							int var24 = var20.field2839[var21][0];
							int var25 = var20.field2839[var21][2];
							int var26 = var20.field2839[var21][4];
							int var27 = var20.field2839[var21][5];
							var13[var21 + 1].translate(var24, var22, var25);
							var13[var21 + 1].method565(var23, var26, var27);
						}
					}
				}
				ModelUnlit var28 = new ModelUnlit(var13, var14);
				for (int var29 = 0; var29 < 5; var29++) {
					if (this.colour[var29] < Client.field96[var29].length) {
						var28.recolour(Client.field219[var29], Client.field96[var29][this.colour[var29]]);
					}
					if (Client.field1596[var29].length > this.colour[var29]) {
						var28.recolour(Client.field2750[var29], Client.field1596[var29][this.colour[var29]]);
					}
				}
				var9 = var28.light(64, 850, -30, -50, -30);
				modelCache.put(var5, var9);
				this.headModelHashToModelCacheID = var5;
			}
		}
		if (arg3 == null && arg0 == null) {
			return var9;
		}
		ModelLit var30;
		if (arg3 != null && arg0 != null) {
			var30 = arg3.splitAnimateModel(arg1, arg0, arg2, var9);
		} else if (arg3 == null) {
			var30 = arg0.animateModel2(arg2, var9);
		} else {
			var30 = arg3.animateModel2(arg1, var9);
		}
		return var30;
	}

	@ObfuscatedName("tb.a(IZ[I[IZ)V")
	public void setAppearance(int arg0, int[] arg1, int[] arg2, boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < IdkType.numDefinitions; var6++) {
					IdkType var7 = IdkType.list(var6);
					if (var7 != null && !var7.disable && var5 + (arg3 ? 7 : 0) == var7.type) {
						arg1[basePartMap[var5]] = var6 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.appearance = arg1;
		this.colour = arg2;
		this.gender = arg3;
		this.transmog = arg0;
		this.calcBaseId();
	}

	@ObfuscatedName("tb.a(BII)V")
	public void idkChangeColour(int arg0, int arg1) {
		this.colour[arg1] = arg0;
		this.calcBaseId();
	}

	@ObfuscatedName("tb.a(IZ)V")
	public void idkChangeGender(boolean arg0) {
		this.gender = arg0;
		this.calcBaseId();
	}

	@ObfuscatedName("tb.a(IBI)V")
	public void idkChangePart(int arg0, int arg1) {
		int var3 = basePartMap[arg0];
		if (this.appearance[var3] != 0 && IdkType.list(arg1) != null) {
			this.appearance[var3] = Integer.MIN_VALUE | arg1;
			this.calcBaseId();
		}
	}
}
