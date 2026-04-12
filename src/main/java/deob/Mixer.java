package deob;

@ObfuscatedName("b")
public final class Mixer extends PcmStream {

	@ObfuscatedName("b.eb")
	public final int field240 = 16;

	@ObfuscatedName("b.fb")
	public final LinkList[] field241 = new LinkList[8];

	@ObfuscatedName("b.gb")
	public final LinkList field242 = new LinkList();

	@ObfuscatedName("b.hb")
	public int field243 = 0;

	@ObfuscatedName("b.ib")
	public int field244 = -1;

	@ObfuscatedName("b.jb")
	public int field245 = 0;

	@ObfuscatedName("b.a(Loc;)V")
	public synchronized void method126(PcmStream arg0) {
		LinkList var2 = this.field241[method130(arg0)];
		var2.method805(arg0);
	}

	@ObfuscatedName("b.b(I)V")
	@Override
	public synchronized void method127(int arg0) {
		do {
			if (this.field244 < 0) {
				this.method132(arg0);
				return;
			}
			if (this.field245 + arg0 < this.field244) {
				this.field245 += arg0;
				this.method132(arg0);
				return;
			}
			int var2 = this.field244 - this.field245;
			this.method132(var2);
			arg0 -= var2;
			this.field245 += var2;
			this.method133();
			class83 var3 = (class83) this.field242.method802();
			synchronized (var3) {
				int var5 = var3.method743(this);
				if (var5 < 0) {
					var3.field2114 = 0;
					this.method131(var3);
				} else {
					var3.field2114 = var5;
					this.method128(var3.field2087, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("b.a(Lnd;Lne;)V")
	public void method128(Linkable arg0, class83 arg1) {
		while (this.field242.field2276 != arg0 && ((class83) arg0).field2114 <= arg1.field2114) {
			arg0 = arg0.field2087;
		}
		this.field242.method811(arg0, arg1);
		this.field244 = ((class83) this.field242.field2276.field2087).field2114;
	}

	@ObfuscatedName("b.b([III)I")
	public int method129(int[] arg0, int arg1, int arg2) {
		this.field243 -= arg2;
		if (this.field243 <= 0) {
			this.field243 += Statics.field192 >> 4;
			for (int var4 = 0; var4 < 8; var4++) {
				LinkList var5 = this.field241[var4];
				for (PcmStream var6 = (PcmStream) var5.method802(); var6 != null; var6 = (PcmStream) var5.method809()) {
					int var7 = method130(var6);
					if (var4 != var7) {
						this.field241[var7].method805(var6);
					}
				}
			}
		}
		for (int var8 = 0; var8 < 8; var8++) {
			LinkList var9 = this.field241[var8];
			for (PcmStream var10 = (PcmStream) var9.method802(); var10 != null; var10 = (PcmStream) var9.method809()) {
				var10.field2167 = false;
				if (var10.field2168 != null) {
					var10.field2168.field3080 = 0;
				}
			}
		}
		int var11 = 0;
		int var12 = 255;
		int var13 = 7;
		while (var12 != 0) {
			int var14;
			int var15;
			if (var13 < 0) {
				var14 = var13 & 0x3;
				var15 = -(var13 >> 2);
			} else {
				var14 = var13;
				var15 = 0;
			}
			for (int var16 = var12 >>> var14 & 0x11111111; var16 != 0; var16 >>>= 0x4) {
				if ((var16 & 0x1) != 0) {
					var12 &= ~(0x1 << var14);
					LinkList var17 = this.field241[var14];
					for (PcmStream var18 = (PcmStream) var17.method802(); var18 != null; var18 = (PcmStream) var17.method809()) {
						if (!var18.field2167) {
							PcmStreamable var19 = var18.field2168;
							if (var19 == null || var19.field3080 <= var15) {
								if (var11 < this.field240) {
									int var20 = var18.method134(arg0, arg1, arg2);
									var11 += var20;
									if (var19 != null) {
										var19.field3080 += var20;
									}
								} else {
									var18.method127(arg2);
								}
								var18.field2167 = true;
							} else {
								var12 |= 0x1 << var14;
							}
						}
					}
				}
				var14 += 4;
				var15++;
			}
			var13--;
		}
		return var11;
	}

	@ObfuscatedName("b.b(Loc;)I")
	public static int method130(PcmStream arg0) {
		return arg0.method588() >> 5;
	}

	@ObfuscatedName("b.a(Lne;)V")
	public void method131(class83 arg0) {
		arg0.method739();
		arg0.method742();
		Linkable var2 = this.field242.field2276.field2087;
		if (this.field242.field2276 == var2) {
			this.field244 = -1;
		} else {
			this.field244 = ((class83) var2).field2114;
		}
	}

	public Mixer() {
		for (int var1 = 0; var1 < 8; var1++) {
			this.field241[var1] = new LinkList();
		}
	}

	@ObfuscatedName("b.c(I)V")
	public void method132(int arg0) {
		this.field243 -= arg0;
		if (this.field243 < 0) {
			this.field243 = 0;
		}
		for (int var2 = 0; var2 < 8; var2++) {
			LinkList var3 = this.field241[var2];
			for (PcmStream var4 = (PcmStream) var3.method802(); var4 != null; var4 = (PcmStream) var3.method809()) {
				var4.method127(arg0);
			}
		}
	}

	@ObfuscatedName("b.b()V")
	public void method133() {
		if (this.field245 <= 0) {
			return;
		}
		for (class83 var1 = (class83) this.field242.method802(); var1 != null; var1 = (class83) this.field242.method809()) {
			var1.field2114 -= this.field245;
		}
		this.field244 -= this.field245;
		this.field245 = 0;
	}

	@ObfuscatedName("b.a([III)I")
	@Override
	public synchronized int method134(int[] arg0, int arg1, int arg2) {
		int var5;
		do {
			if (this.field244 < 0) {
				return this.method129(arg0, arg1, arg2);
			}
			if (this.field245 + arg2 < this.field244) {
				this.field245 += arg2;
				return this.method129(arg0, arg1, arg2);
			}
			int var4 = this.field244 - this.field245;
			var5 = this.method129(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.field245 += var4;
			this.method133();
			class83 var6 = (class83) this.field242.method802();
			synchronized (var6) {
				int var8 = var6.method743(this);
				if (var8 < 0) {
					var6.field2114 = 0;
					this.method131(var6);
				} else {
					var6.field2114 = var8;
					this.method128(var6.field2087, var6);
				}
			}
		} while (arg2 != 0);
		return var5;
	}

	@ObfuscatedName("b.c(Loc;)V")
	public synchronized void method135(PcmStream arg0) {
		arg0.method739();
	}
}
