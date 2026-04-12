package deob;

@ObfuscatedName("ka")
public final class WaveStream extends PcmStream {

	@ObfuscatedName("ka.eb")
	public int field1530;

	@ObfuscatedName("ka.fb")
	public int field1531;

	@ObfuscatedName("ka.gb")
	public final int field1532;

	@ObfuscatedName("ka.hb")
	public int field1533;

	@ObfuscatedName("ka.ib")
	public int field1534;

	@ObfuscatedName("ka.jb")
	public int field1535;

	@ObfuscatedName("ka.kb")
	public int field1536;

	@ObfuscatedName("ka.lb")
	public int field1537;

	@ObfuscatedName("ka.mb")
	public final int field1538;

	@ObfuscatedName("ka.nb")
	public boolean field1539;

	@ObfuscatedName("ka.ob")
	public int field1540;

	@ObfuscatedName("ka.a([IIIII)I")
	public int method579(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field1533 > 0) {
			int var6 = this.field1533 + arg1;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field1533 += arg1;
			if (this.field1534 == -256 && (this.field1540 & 0xFF) == 0) {
				arg1 = method584(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, this.field1530, this.field1531, var6, arg2, this);
			} else {
				arg1 = method581(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, this.field1530, this.field1531, var6, arg2, this, this.field1534, arg4);
			}
			this.field1533 -= arg1;
			if (this.field1533 != 0) {
				return arg1;
			}
			if (this.field1535 == Integer.MIN_VALUE) {
				this.method739();
				return arg3;
			}
			this.field1537 = this.field1535;
		}
		return this.field1534 == -256 && (this.field1540 & 0xFF) == 0 ? method586(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, arg3, arg2, this) : method583(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, arg3, arg2, this, this.field1534, arg4);
	}

	@ObfuscatedName("ka.a([III)I")
	@Override
	public synchronized int method134(int[] arg0, int arg1, int arg2) {
		if (this.field1537 == 0 && (this.field1533 == 0 || this.field1535 == 0 || this.field1535 == Integer.MIN_VALUE)) {
			this.method127(arg2);
			return 0;
		}
		Wave var4 = (Wave) super.field2168;
		int var5 = this.field1532 << 8;
		int var6 = this.field1538 << 8;
		int var7 = var4.field3308.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.field1536 = 0;
		}
		int var9 = arg1;
		int var10 = arg1 + arg2;
		if (this.field1536 >= 0) {
			if (this.field1536 > 0) {
				if (this.field1539) {
					label118: {
						if (this.field1534 < 0) {
							var9 = this.method579(arg0, arg1, var5, var10, var4.field3308[this.field1532]);
							if (this.field1540 >= var5) {
								return 1;
							}
							this.field1540 = var5 + var5 - this.field1540 - 1;
							this.field1534 = -this.field1534;
							if (--this.field1536 == 0) {
								break label118;
							}
						}
						do {
							var9 = this.method592(arg0, var9, var6, var10, var4.field3308[this.field1538 - 1]);
							if (this.field1540 < var6) {
								return 1;
							}
							this.field1540 = var6 + var6 - this.field1540 - 1;
							this.field1534 = -this.field1534;
							if (--this.field1536 == 0) {
								break;
							}
							var9 = this.method579(arg0, var9, var5, var10, var4.field3308[this.field1532]);
							if (this.field1540 >= var5) {
								return 1;
							}
							this.field1540 = var5 + var5 - this.field1540 - 1;
							this.field1534 = -this.field1534;
						} while (--this.field1536 != 0);
					}
				} else if (this.field1534 < 0) {
					while (true) {
						var9 = this.method579(arg0, var9, var5, var10, var4.field3308[this.field1538 - 1]);
						if (this.field1540 >= var5) {
							return 1;
						}
						int var12 = (var6 - this.field1540 - 1) / var8;
						if (var12 >= this.field1536) {
							this.field1540 += this.field1536 * var8;
							this.field1536 = 0;
							break;
						}
						this.field1540 += var8 * var12;
						this.field1536 -= var12;
					}
				} else {
					while (true) {
						var9 = this.method592(arg0, var9, var6, var10, var4.field3308[this.field1532]);
						if (this.field1540 < var6) {
							return 1;
						}
						int var13 = (this.field1540 - var5) / var8;
						if (var13 >= this.field1536) {
							this.field1540 -= this.field1536 * var8;
							this.field1536 = 0;
							break;
						}
						this.field1540 -= var8 * var13;
						this.field1536 -= var13;
					}
				}
			}
			if (this.field1534 < 0) {
				this.method579(arg0, var9, 0, var10, 0);
				if (this.field1540 < 0) {
					this.field1540 = 0;
					this.method739();
				}
			} else {
				this.method592(arg0, var9, var7, var10, 0);
				if (this.field1540 >= var7) {
					this.field1540 = var7 - 1;
					this.method739();
				}
			}
			return 1;
		} else if (this.field1539) {
			if (this.field1534 < 0) {
				var9 = this.method579(arg0, arg1, var5, var10, var4.field3308[this.field1532]);
				if (this.field1540 >= var5) {
					return 1;
				}
				this.field1540 = var5 + var5 - this.field1540 - 1;
				this.field1534 = -this.field1534;
			}
			while (true) {
				int var11 = this.method592(arg0, var9, var6, var10, var4.field3308[this.field1538 - 1]);
				if (this.field1540 < var6) {
					return 1;
				}
				this.field1540 = var6 + var6 - this.field1540 - 1;
				this.field1534 = -this.field1534;
				var9 = this.method579(arg0, var11, var5, var10, var4.field3308[this.field1532]);
				if (this.field1540 >= var5) {
					return 1;
				}
				this.field1540 = var5 + var5 - this.field1540 - 1;
				this.field1534 = -this.field1534;
			}
		} else if (this.field1534 < 0) {
			while (true) {
				var9 = this.method579(arg0, var9, var5, var10, var4.field3308[this.field1538 - 1]);
				if (this.field1540 >= var5) {
					return 1;
				}
				this.field1540 = var6 - (var6 - 1 - this.field1540) % var8 - 1;
			}
		} else {
			while (true) {
				var9 = this.method592(arg0, var9, var6, var10, var4.field3308[this.field1532]);
				if (this.field1540 < var6) {
					return 1;
				}
				this.field1540 = (this.field1540 - var5) % var8 + var5;
			}
		}
	}

	@ObfuscatedName("ka.a(II[B[IIIIIIIIILka;II)I")
	public static int method580(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9, int arg10, int arg11) {
		int var12;
		if (arg10 == 0 || (var12 = (arg8 + arg10 - arg2 - 257) / arg10 + arg3) > arg7) {
			var12 = arg7;
		}
		int var10001;
		while (arg3 < var12) {
			int var13 = arg2 >> 8;
			byte var14 = arg0[var13];
			var10001 = arg3++;
			arg1[var10001] += ((var14 << 8) + (arg2 & 0xFF) * (arg0[var13 + 1] - var14)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		int var15;
		if (arg10 == 0 || (var15 = (arg8 + arg10 - arg2 - 1) / arg10 + arg3) > arg7) {
			var15 = arg7;
		}
		while (arg3 < var15) {
			byte var16 = arg0[arg2 >> 8];
			var10001 = arg3++;
			arg1[var10001] += ((var16 << 8) + (arg2 & 0xFF) * (arg11 - var16)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.field1537 = arg4;
		arg9.field1540 = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.b(II[B[IIIIIIIIILka;II)I")
	public static int method581(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9, int arg10, int arg11) {
		int var12;
		if (arg10 == 0 || (var12 = (arg8 + arg10 + 256 - arg2) / arg10 + arg3) > arg7) {
			var12 = arg7;
		}
		int var10001;
		while (arg3 < var12) {
			int var13 = arg2 >> 8;
			byte var14 = arg0[var13 - 1];
			var10001 = arg3++;
			arg1[var10001] += ((var14 << 8) + (arg2 & 0xFF) * (arg0[var13] - var14)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		int var15;
		if (arg10 == 0 || (var15 = (arg8 + arg10 - arg2) / arg10 + arg3) > arg7) {
			var15 = arg7;
		}
		while (arg3 < var15) {
			var10001 = arg3++;
			arg1[var10001] += ((arg11 << 8) + (arg2 & 0xFF) * (arg0[arg2 >> 8] - arg11)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.field1537 = arg4;
		arg9.field1540 = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.c(I)V")
	public synchronized void method582(int arg0) {
		this.field1537 = arg0;
		this.field1533 = 0;
	}

	@ObfuscatedName("ka.a(II[B[IIIIIIILka;II)I")
	public static int method583(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
		int var10;
		if (arg8 == 0 || (var10 = (arg6 + arg8 + 256 - arg2) / arg8 + arg3) > arg5) {
			var10 = arg5;
		}
		int var10001;
		while (arg3 < var10) {
			int var11 = arg2 >> 8;
			byte var12 = arg0[var11 - 1];
			var10001 = arg3++;
			arg1[var10001] += ((var12 << 8) + (arg2 & 0xFF) * (arg0[var11] - var12)) * arg4;
			arg2 += arg8;
		}
		int var13;
		if (arg8 == 0 || (var13 = (arg6 + arg8 - arg2) / arg8 + arg3) > arg5) {
			var13 = arg5;
		}
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += ((arg9 << 8) + (arg2 & 0xFF) * (arg0[arg2 >> 8] - arg9)) * arg4;
			arg2 += arg8;
		}
		arg7.field1540 = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.a([B[IIIIIIIIILka;)I")
	public static int method584(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9) {
		int var10 = arg2 >> 8;
		int var11 = arg8 >> 8;
		int var12 = arg4 << 8;
		int var13 = arg6 << 8;
		int var14;
		if ((var14 = arg3 + var10 + 1 - var11) > arg7) {
			var14 = arg7;
		}
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10--] * var12 >> arg5;
			int var15 = var12 + var13;
			int var18 = arg3++;
			arg1[var18] += arg0[var10--] * var15 >> arg5;
			int var16 = var13 + var15;
			int var19 = arg3++;
			arg1[var19] += arg0[var10--] * var16 >> arg5;
			int var17 = var13 + var16;
			int var20 = arg3++;
			arg1[var20] += arg0[var10--] * var17 >> arg5;
			var12 = var13 + var17;
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10--] * var12 >> arg5;
			var12 += var13;
		}
		arg9.field1537 = var12 >> 8;
		arg9.field1540 = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.d(I)V")
	public synchronized void method585(int arg0) {
		this.field1536 = arg0;
	}

	@ObfuscatedName("ka.a([B[IIIIIIILka;)I")
	public static int method586(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
		int var8 = arg2 >> 8;
		int var9 = arg6 >> 8;
		int var10 = arg4 << 8;
		int var11;
		if ((var11 = arg3 + var8 + 1 - var9) > arg5) {
			var11 = arg5;
		}
		var11 -= 3;
		int var10001;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8--] * var10;
			int var12 = arg3++;
			arg1[var12] += arg0[var8--] * var10;
			int var13 = arg3++;
			arg1[var13] += arg0[var8--] * var10;
			int var14 = arg3++;
			arg1[var14] += arg0[var8--] * var10;
		}
		var11 += 3;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8--] * var10;
		}
		arg7.field1540 = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.b([B[IIIIIIIIILka;)I")
	public static int method587(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9) {
		int var10 = arg2 >> 8;
		int var11 = arg8 >> 8;
		int var12 = arg4 << 8;
		int var13 = arg6 << 8;
		int var14;
		if ((var14 = arg3 + var11 - var10) > arg7) {
			var14 = arg7;
		}
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10++] * var12 >> arg5;
			int var15 = var12 + var13;
			int var18 = arg3++;
			arg1[var18] += arg0[var10++] * var15 >> arg5;
			int var16 = var13 + var15;
			int var19 = arg3++;
			arg1[var19] += arg0[var10++] * var16 >> arg5;
			int var17 = var13 + var16;
			int var20 = arg3++;
			arg1[var20] += arg0[var10++] * var17 >> arg5;
			var12 = var13 + var17;
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10++] * var12 >> arg5;
			var12 += var13;
		}
		arg9.field1537 = var12 >> 8;
		arg9.field1540 = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.a()I")
	@Override
	public int method588() {
		int var1 = this.field1537 * 3;
		int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
		if (this.field1536 == 0) {
			var2 -= this.field1540 * var2 / (((Wave) super.field2168).field3308.length << 8);
		} else if (this.field1536 >= 0) {
			var2 -= this.field1532 * var2 / ((Wave) super.field2168).field3308.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("ka.b()Z")
	public boolean method589() {
		return this.method736();
	}

	@ObfuscatedName("ka.a(Lwd;II)Lka;")
	public static WaveStream method590(Wave arg0, int arg1) {
		return arg0.field3308 == null || arg0.field3308.length == 0 ? null : new WaveStream(arg0, (int) ((long) arg0.field3311 * 256L * (long) 100 / (long) (Statics.field192 * 100)), arg1);
	}

	@ObfuscatedName("ka.b(II[B[IIIIIIILka;II)I")
	public static int method591(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7, int arg8, int arg9) {
		int var10;
		if (arg8 == 0 || (var10 = (arg6 + arg8 - arg2 - 257) / arg8 + arg3) > arg5) {
			var10 = arg5;
		}
		int var10001;
		while (arg3 < var10) {
			int var11 = arg2 >> 8;
			byte var12 = arg0[var11];
			var10001 = arg3++;
			arg1[var10001] += ((var12 << 8) + (arg2 & 0xFF) * (arg0[var11 + 1] - var12)) * arg4;
			arg2 += arg8;
		}
		int var13;
		if (arg8 == 0 || (var13 = (arg6 + arg8 - arg2 - 1) / arg8 + arg3) > arg5) {
			var13 = arg5;
		}
		while (arg3 < var13) {
			byte var14 = arg0[arg2 >> 8];
			var10001 = arg3++;
			arg1[var10001] += ((var14 << 8) + (arg2 & 0xFF) * (arg9 - var14)) * arg4;
			arg2 += arg8;
		}
		arg7.field1540 = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.b(I)V")
	@Override
	public synchronized void method127(int arg0) {
		if (this.field1533 > 0) {
			if (arg0 >= this.field1533) {
				if (this.field1535 == Integer.MIN_VALUE) {
					this.method739();
					arg0 = this.field1533;
				} else {
					this.field1537 = this.field1535;
				}
				this.field1533 = 0;
			} else {
				this.field1537 += this.field1531 * arg0;
				this.field1533 -= arg0;
			}
		}
		this.field1540 += this.field1534 * arg0;
		Wave var2 = (Wave) super.field2168;
		int var3 = this.field1532 << 8;
		int var4 = this.field1538 << 8;
		int var5 = var2.field3308.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field1536 = 0;
		}
		if (this.field1536 >= 0) {
			if (this.field1536 > 0) {
				if (this.field1539) {
					label113: {
						if (this.field1534 < 0) {
							if (this.field1540 >= var3) {
								return;
							}
							this.field1540 = var3 + var3 - this.field1540 - 1;
							this.field1534 = -this.field1534;
							if (--this.field1536 == 0) {
								break label113;
							}
						}
						do {
							if (this.field1540 < var4) {
								return;
							}
							this.field1540 = var4 + var4 - this.field1540 - 1;
							this.field1534 = -this.field1534;
							if (--this.field1536 == 0) {
								break;
							}
							if (this.field1540 >= var3) {
								return;
							}
							this.field1540 = var3 + var3 - this.field1540 - 1;
							this.field1534 = -this.field1534;
						} while (--this.field1536 != 0);
					}
				} else if (this.field1534 < 0) {
					if (this.field1540 >= var3) {
						return;
					}
					int var7 = (var4 - this.field1540 - 1) / var6;
					if (var7 < this.field1536) {
						this.field1540 += var6 * var7;
						this.field1536 -= var7;
						return;
					}
					this.field1540 += this.field1536 * var6;
					this.field1536 = 0;
				} else if (this.field1540 >= var4) {
					int var8 = (this.field1540 - var3) / var6;
					if (var8 < this.field1536) {
						this.field1540 -= var6 * var8;
						this.field1536 -= var8;
						return;
					}
					this.field1540 -= this.field1536 * var6;
					this.field1536 = 0;
				} else {
					return;
				}
			}
			if (this.field1534 < 0) {
				if (this.field1540 < 0) {
					this.field1540 = 0;
					this.method739();
					return;
				}
			} else if (this.field1540 >= var5) {
				this.field1540 = var5 - 1;
				this.method739();
			}
		} else if (this.field1539) {
			if (this.field1534 < 0) {
				if (this.field1540 >= var3) {
					return;
				}
				this.field1540 = var3 + var3 - this.field1540 - 1;
				this.field1534 = -this.field1534;
			}
			while (this.field1540 >= var4) {
				this.field1540 = var4 + var4 - this.field1540 - 1;
				this.field1534 = -this.field1534;
				if (this.field1540 >= var3) {
					return;
				}
				this.field1540 = var3 + var3 - this.field1540 - 1;
				this.field1534 = -this.field1534;
			}
		} else if (this.field1534 < 0) {
			if (this.field1540 < var3) {
				this.field1540 = var4 - (var4 - 1 - this.field1540) % var6 - 1;
			}
		} else if (this.field1540 >= var4) {
			this.field1540 = (this.field1540 - var3) % var6 + var3;
		}
	}

	@ObfuscatedName("ka.b([IIIII)I")
	public int method592(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field1533 > 0) {
			int var6 = this.field1533 + arg1;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.field1533 += arg1;
			if (this.field1534 == 256 && (this.field1540 & 0xFF) == 0) {
				arg1 = method587(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, this.field1530, this.field1531, var6, arg2, this);
			} else {
				arg1 = method580(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, this.field1530, this.field1531, var6, arg2, this, this.field1534, arg4);
			}
			this.field1533 -= arg1;
			if (this.field1533 != 0) {
				return arg1;
			}
			if (this.field1535 == Integer.MIN_VALUE) {
				this.method739();
				return arg3;
			}
			this.field1537 = this.field1535;
		}
		return this.field1534 == 256 && (this.field1540 & 0xFF) == 0 ? method593(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, arg3, arg2, this) : method591(((Wave) super.field2168).field3308, arg0, this.field1540, arg1, this.field1537, arg3, arg2, this, this.field1534, arg4);
	}

	@ObfuscatedName("ka.b([B[IIIIIIILka;)I")
	public static int method593(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, WaveStream arg7) {
		int var8 = arg2 >> 8;
		int var9 = arg6 >> 8;
		int var10 = arg4 << 8;
		int var11;
		if ((var11 = arg3 + var9 - var8) > arg5) {
			var11 = arg5;
		}
		var11 -= 3;
		int var10001;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8++] * var10;
			int var12 = arg3++;
			arg1[var12] += arg0[var8++] * var10;
			int var13 = arg3++;
			arg1[var13] += arg0[var8++] * var10;
			int var14 = arg3++;
			arg1[var14] += arg0[var8++] * var10;
		}
		var11 += 3;
		while (arg3 < var11) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var8++] * var10;
		}
		arg7.field1540 = var8 << 8;
		return arg3;
	}

	public WaveStream(Wave arg0, int arg1, int arg2) {
		super.field2168 = arg0;
		this.field1532 = arg0.field3309;
		this.field1538 = arg0.field3310;
		this.field1534 = arg1;
		this.field1537 = arg2;
		this.field1540 = 0;
	}
}
