package deob;

@ObfuscatedName("bb")
public class PlayerEntity extends PathingEntity {

	@ObfuscatedName("bb.pb")
	public int field462 = 855;

	@ObfuscatedName("bb.qb")
	public int field463;

	@ObfuscatedName("bb.rb")
	public int field464 = -323;

	@ObfuscatedName("bb.sb")
	public String field465;

	@ObfuscatedName("bb.tb")
	public boolean field466 = false;

	@ObfuscatedName("bb.ub")
	public int field467;

	@ObfuscatedName("bb.vb")
	public int field468;

	@ObfuscatedName("bb.wb")
	public int[] field469 = new int[12];

	@ObfuscatedName("bb.xb")
	public int[] field470 = new int[5];

	@ObfuscatedName("bb.yb")
	public int field471;

	@ObfuscatedName("bb.zb")
	public long field472;

	@ObfuscatedName("bb.Lb")
	public boolean field484 = false;

	@ObfuscatedName("bb.Mb")
	public long field485 = -1L;

	@ObfuscatedName("bb.Nb")
	public static LruCache field486 = new LruCache(260, 1);

	@ObfuscatedName("bb.Ab")
	public int field473;

	@ObfuscatedName("bb.Bb")
	public int field474;

	@ObfuscatedName("bb.Cb")
	public int field475;

	@ObfuscatedName("bb.Db")
	public int field476;

	@ObfuscatedName("bb.Eb")
	public int field477;

	@ObfuscatedName("bb.Fb")
	public int field478;

	@ObfuscatedName("bb.Hb")
	public int field480;

	@ObfuscatedName("bb.Ib")
	public int field481;

	@ObfuscatedName("bb.Jb")
	public int field482;

	@ObfuscatedName("bb.Kb")
	public int field483;

	@ObfuscatedName("bb.Gb")
	public Model field479;

	@ObfuscatedName("bb.a(Lmb;I)V")
	public final void method129(Packet arg0, int arg1) {
		arg0.field719 = 0;
		this.field467 = arg0.method238();
		this.field468 = arg0.method238();
		for (int var3 = 0; var3 < 12; var3++) {
			int var8 = arg0.method238();
			if (var8 == 0) {
				this.field469[var3] = 0;
			} else {
				int var9 = arg0.method238();
				this.field469[var3] = (var8 << 8) + var9;
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			int var7 = arg0.method238();
			if (var7 < 0 || var7 >= client.field1379[var4].length) {
				var7 = 0;
			}
			this.field470[var4] = var7;
		}
		super.field409 = arg0.method240();
		if (super.field409 == 65535) {
			super.field409 = -1;
		}
		super.field410 = arg0.method240();
		if (super.field410 == 65535) {
			super.field410 = -1;
		}
		super.field411 = arg0.method240();
		if (super.field411 == 65535) {
			super.field411 = -1;
		}
		super.field412 = arg0.method240();
		if (super.field412 == 65535) {
			super.field412 = -1;
		}
		super.field413 = arg0.method240();
		if (super.field413 == 65535) {
			super.field413 = -1;
		}
		super.field414 = arg0.method240();
		if (super.field414 == 65535) {
			super.field414 = -1;
		}
		super.field415 = arg0.method240();
		if (arg1 >= 0) {
			return;
		}
		if (super.field415 == 65535) {
			super.field415 = -1;
		}
		this.field465 = JString.method313(true, JString.method310((byte) 88, arg0.method244(this.field462)));
		this.field471 = arg0.method238();
		this.field466 = true;
		this.field472 = 0L;
		for (int var5 = 0; var5 < 12; var5++) {
			this.field472 <<= 0x4;
			if (this.field469[var5] >= 256) {
				this.field472 += this.field469[var5] - 256;
			}
		}
		if (this.field469[0] >= 256) {
			this.field472 += this.field469[0] - 256 >> 4;
		}
		if (this.field469[1] >= 256) {
			this.field472 += this.field469[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.field472 <<= 0x3;
			this.field472 += this.field470[var6];
		}
		this.field472 <<= 0x1;
		this.field472 += this.field467;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public final Model method122(int arg0) {
		if (!this.field466) {
			return null;
		}
		Model var2 = this.method130(357);
		if (var2 == null) {
			return null;
		}
		super.field450 = var2.field400;
		var2.field576 = true;
		if (this.field484) {
			return var2;
		}
		if (super.field437 != -1 && super.field438 != -1) {
			SpotAnimType var3 = SpotAnimType.field1138[super.field437];
			Model var4 = var3.method386();
			if (var4 != null) {
				Model var5 = new Model(var4, true, false, !var3.field1143, -796);
				var5.method151(-super.field441, 0, 0, false);
				var5.method145(-591);
				var5.method146(var3.field1142.field1122[super.field438], 13056);
				var5.field575 = null;
				var5.field574 = null;
				if (var3.field1146 != 128 || var3.field1147 != 128) {
					var5.method154(var3.field1147, var3.field1146, 4, var3.field1146);
				}
				var5.method155(var3.field1149 + 64, var3.field1150 + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(this.field463, true, 2, var6);
			}
		}
		if (this.field479 != null) {
			if (client.field1588 >= this.field475) {
				this.field479 = null;
			}
			if (client.field1588 >= this.field474 && client.field1588 < this.field475) {
				Model var7 = this.field479;
				var7.method151(this.field477 - this.field473, this.field476 - super.field404, this.field478 - super.field405, false);
				if (super.field451 == 512) {
					var7.method149((byte) 3);
					var7.method149((byte) 3);
					var7.method149((byte) 3);
				} else if (super.field451 == 1024) {
					var7.method149((byte) 3);
					var7.method149((byte) 3);
				} else if (super.field451 == 1536) {
					var7.method149((byte) 3);
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(this.field463, true, 2, var8);
				if (super.field451 == 512) {
					var7.method149((byte) 3);
				} else if (super.field451 == 1024) {
					var7.method149((byte) 3);
					var7.method149((byte) 3);
				} else if (super.field451 == 1536) {
					var7.method149((byte) 3);
					var7.method149((byte) 3);
					var7.method149((byte) 3);
				}
				var7.method151(this.field473 - this.field477, super.field404 - this.field476, super.field405 - this.field478, false);
			}
		}
		var2.field576 = true;
		if (arg0 != 5560) {
			throw new NullPointerException();
		}
		return var2;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public final Model method130(int arg0) {
		long var2 = this.field472;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		if (super.field432 >= 0 && super.field435 == 0) {
			SeqType var8 = SeqType.field1120[super.field432];
			var4 = var8.field1122[super.field433];
			if (super.field429 >= 0 && super.field429 != super.field409) {
				var5 = SeqType.field1120[super.field429].field1122[super.field430];
			}
			if (var8.field1129 >= 0) {
				var6 = var8.field1129;
				var2 += var6 - this.field469[5] << 40;
			}
			if (var8.field1130 >= 0) {
				var7 = var8.field1130;
				var2 += var7 - this.field469[3] << 48;
			}
		} else if (super.field429 >= 0) {
			var4 = SeqType.field1120[super.field429].field1122[super.field430];
		}
		Model var9 = (Model) field486.method114(var2);
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = this.field469[var11];
				if (var7 >= 0 && var11 == 3) {
					var12 = var7;
				}
				if (var6 >= 0 && var11 == 5) {
					var12 = var6;
				}
				if (var12 >= 256 && var12 < 512 && !IdkType.field1101[var12 - 256].method377(6)) {
					var10 = true;
				}
				if (var12 >= 512 && !ObjType.method348(var12 - 512).method355(-526, this.field467)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field485 != -1L) {
					var9 = (Model) field486.method114(this.field485);
				}
				if (var9 == null) {
					return null;
				}
			}
		}
		if (var9 == null) {
			Model[] var13 = new Model[12];
			int var14 = 0;
			for (int var15 = 0; var15 < 12; var15++) {
				int var17 = this.field469[var15];
				if (var7 >= 0 && var15 == 3) {
					var17 = var7;
				}
				if (var6 >= 0 && var15 == 5) {
					var17 = var6;
				}
				if (var17 >= 256 && var17 < 512) {
					Model var18 = IdkType.field1101[var17 - 256].method378(597);
					if (var18 != null) {
						var13[var14++] = var18;
					}
				}
				if (var17 >= 512) {
					Model var19 = ObjType.method348(var17 - 512).method356(true, this.field467);
					if (var19 != null) {
						var13[var14++] = var19;
					}
				}
			}
			var9 = new Model(var14, 652, var13);
			for (int var16 = 0; var16 < 5; var16++) {
				if (this.field470[var16] != 0) {
					var9.method152(client.field1379[var16][0], client.field1379[var16][this.field470[var16]]);
					if (var16 == 1) {
						var9.method152(client.field1528[0], client.field1528[this.field470[var16]]);
					}
				}
			}
			var9.method145(-591);
			var9.method155(64, 850, -30, -50, -30, true);
			field486.method115(var9, var2, 39399);
			this.field485 = var2;
		}
		if (this.field484) {
			return var9;
		}
		Model var20 = Model.field538;
		var20.method140(true, var9, true);
		if (var4 != -1 && var5 != -1) {
			var20.method147((byte) 74, var4, var5, SeqType.field1120[super.field432].field1126);
		} else if (var4 != -1) {
			var20.method146(var4, 13056);
		}
		var20.method142(true);
		var20.field575 = null;
		var20.field574 = null;
		return var20;
	}

	@ObfuscatedName("bb.d(I)Lfb;")
	public final Model method131(int arg0) {
		if (!this.field466) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < 12; var3++) {
			int var13 = this.field469[var3];
			if (var13 >= 256 && var13 < 512 && !IdkType.field1101[var13 - 256].method379(8)) {
				var2 = true;
			}
			if (var13 >= 512 && !ObjType.method348(var13 - 512).method357(this.field467, -5652)) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var4 = new Model[12];
		if (arg0 <= 0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		int var6 = 0;
		for (int var7 = 0; var7 < 12; var7++) {
			int var10 = this.field469[var7];
			if (var10 >= 256 && var10 < 512) {
				Model var11 = IdkType.field1101[var10 - 256].method380(-711);
				if (var11 != null) {
					var4[var6++] = var11;
				}
			}
			if (var10 >= 512) {
				Model var12 = ObjType.method348(var10 - 512).method358(false, this.field467);
				if (var12 != null) {
					var4[var6++] = var12;
				}
			}
		}
		Model var8 = new Model(var6, 652, var4);
		for (int var9 = 0; var9 < 5; var9++) {
			if (this.field470[var9] != 0) {
				var8.method152(client.field1379[var9][0], client.field1379[var9][this.field470[var9]]);
				if (var9 == 1) {
					var8.method152(client.field1528[0], client.field1528[this.field470[var9]]);
				}
			}
		}
		return var8;
	}

	@ObfuscatedName("bb.a(B)Z")
	public final boolean method126(byte arg0) {
		if (arg0 != 8) {
			throw new NullPointerException();
		}
		return this.field466;
	}
}
