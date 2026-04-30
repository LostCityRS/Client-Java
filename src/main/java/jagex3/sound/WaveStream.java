package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("ka")
public final class WaveStream extends PcmStream {

	@ObfuscatedName("ka.eb")
	public int field1530;

	@ObfuscatedName("ka.fb")
	public int field1531;

	@ObfuscatedName("ka.gb")
	public final int loopStartPosition;

	@ObfuscatedName("ka.hb")
	public int volumeChangeDelta;

	@ObfuscatedName("ka.ib")
	public int pitch;

	@ObfuscatedName("ka.jb")
	public int volume;

	@ObfuscatedName("ka.kb")
	public int loopCount;

	@ObfuscatedName("ka.lb")
	public int volumeMono;

	@ObfuscatedName("ka.mb")
	public final int loopEndPosition;

	@ObfuscatedName("ka.nb")
	public boolean loopReversed;

	@ObfuscatedName("ka.ob")
	public int position;

	@ObfuscatedName("ka.a([IIIII)I")
	public int method579(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.volumeChangeDelta > 0) {
			int var6 = this.volumeChangeDelta + arg1;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.volumeChangeDelta += arg1;
			if (this.pitch == -256 && (this.position & 0xFF) == 0) {
				arg1 = doMixBackwards1To1RampMono(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, this.field1530, this.field1531, var6, arg2, this);
			} else {
				arg1 = method581(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, this.field1530, this.field1531, var6, arg2, this, this.pitch, arg4);
			}
			this.volumeChangeDelta -= arg1;
			if (this.volumeChangeDelta != 0) {
				return arg1;
			}
			if (this.volume == Integer.MIN_VALUE) {
				this.unlink();
				return arg3;
			}
			this.volumeMono = this.volume;
		}
		return this.pitch == -256 && (this.position & 0xFF) == 0 ? method586(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this) : method583(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this, this.pitch, arg4);
	}

	@ObfuscatedName("ka.a([III)I")
	@Override
	public synchronized int doMix(int[] arg0, int arg1, int arg2) {
		if (this.volumeMono == 0 && (this.volumeChangeDelta == 0 || this.volume == 0 || this.volume == Integer.MIN_VALUE)) {
			this.pretendToMix(arg2);
			return 0;
		}
		Wave var4 = (Wave) super.field2168;
		int var5 = this.loopStartPosition << 8;
		int var6 = this.loopEndPosition << 8;
		int var7 = var4.samples.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.loopCount = 0;
		}
		int var9 = arg1;
		int var10 = arg1 + arg2;
		if (this.loopCount >= 0) {
			if (this.loopCount > 0) {
				if (this.loopReversed) {
					label118:
					{
						if (this.pitch < 0) {
							var9 = this.method579(arg0, arg1, var5, var10, var4.samples[this.loopStartPosition]);
							if (this.position >= var5) {
								return 1;
							}
							this.position = var5 + var5 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break label118;
							}
						}
						do {
							var9 = this.method592(arg0, var9, var6, var10, var4.samples[this.loopEndPosition - 1]);
							if (this.position < var6) {
								return 1;
							}
							this.position = var6 + var6 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break;
							}
							var9 = this.method579(arg0, var9, var5, var10, var4.samples[this.loopStartPosition]);
							if (this.position >= var5) {
								return 1;
							}
							this.position = var5 + var5 - this.position - 1;
							this.pitch = -this.pitch;
						} while (--this.loopCount != 0);
					}
				} else if (this.pitch < 0) {
					while (true) {
						var9 = this.method579(arg0, var9, var5, var10, var4.samples[this.loopEndPosition - 1]);
						if (this.position >= var5) {
							return 1;
						}
						int var12 = (var6 - this.position - 1) / var8;
						if (var12 >= this.loopCount) {
							this.position += this.loopCount * var8;
							this.loopCount = 0;
							break;
						}
						this.position += var8 * var12;
						this.loopCount -= var12;
					}
				} else {
					while (true) {
						var9 = this.method592(arg0, var9, var6, var10, var4.samples[this.loopStartPosition]);
						if (this.position < var6) {
							return 1;
						}
						int var13 = (this.position - var5) / var8;
						if (var13 >= this.loopCount) {
							this.position -= this.loopCount * var8;
							this.loopCount = 0;
							break;
						}
						this.position -= var8 * var13;
						this.loopCount -= var13;
					}
				}
			}
			if (this.pitch < 0) {
				this.method579(arg0, var9, 0, var10, 0);
				if (this.position < 0) {
					this.position = 0;
					this.unlink();
				}
			} else {
				this.method592(arg0, var9, var7, var10, 0);
				if (this.position >= var7) {
					this.position = var7 - 1;
					this.unlink();
				}
			}
			return 1;
		} else if (this.loopReversed) {
			if (this.pitch < 0) {
				var9 = this.method579(arg0, arg1, var5, var10, var4.samples[this.loopStartPosition]);
				if (this.position >= var5) {
					return 1;
				}
				this.position = var5 + var5 - this.position - 1;
				this.pitch = -this.pitch;
			}
			while (true) {
				int var11 = this.method592(arg0, var9, var6, var10, var4.samples[this.loopEndPosition - 1]);
				if (this.position < var6) {
					return 1;
				}
				this.position = var6 + var6 - this.position - 1;
				this.pitch = -this.pitch;
				var9 = this.method579(arg0, var11, var5, var10, var4.samples[this.loopStartPosition]);
				if (this.position >= var5) {
					return 1;
				}
				this.position = var5 + var5 - this.position - 1;
				this.pitch = -this.pitch;
			}
		} else if (this.pitch < 0) {
			while (true) {
				var9 = this.method579(arg0, var9, var5, var10, var4.samples[this.loopEndPosition - 1]);
				if (this.position >= var5) {
					return 1;
				}
				this.position = var6 - (var6 - 1 - this.position) % var8 - 1;
			}
		} else {
			while (true) {
				var9 = this.method592(arg0, var9, var6, var10, var4.samples[this.loopStartPosition]);
				if (this.position < var6) {
					return 1;
				}
				this.position = (this.position - var5) % var8 + var5;
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
		arg9.volumeMono = arg4;
		arg9.position = arg2;
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
		arg9.volumeMono = arg4;
		arg9.position = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.c(I)V")
	public synchronized void method582(int arg0) {
		this.volumeMono = arg0;
		this.volumeChangeDelta = 0;
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
		arg7.position = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.a([B[IIIIIIIIILka;)I")
	public static int doMixBackwards1To1RampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9) {
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
		arg9.volumeMono = var12 >> 8;
		arg9.position = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.d(I)V")
	public synchronized void setLoopCount(int arg0) {
		this.loopCount = arg0;
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
		arg7.position = var8 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.b([B[IIIIIIIIILka;)I")
	public static int doMixForwards1To1RampMono(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, WaveStream arg9) {
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
		arg9.volumeMono = var12 >> 8;
		arg9.position = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("ka.a()I")
	@Override
	public int priority() {
		int var1 = this.volumeMono * 3;
		int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
		if (this.loopCount == 0) {
			var2 -= this.position * var2 / (((Wave) super.field2168).samples.length << 8);
		} else if (this.loopCount >= 0) {
			var2 -= this.loopStartPosition * var2 / ((Wave) super.field2168).samples.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("ka.b()Z")
	public boolean isRamping() {
		return this.isLinked();
	}

	@ObfuscatedName("ka.a(Lwd;II)Lka;")
	public static WaveStream newRatePercent(Wave arg0, int arg1) {
		return arg0.samples == null || arg0.samples.length == 0 ? null : new WaveStream(arg0, (int) ((long) arg0.samplingFrequency * 256L * (long) 100 / (long) (PcmPlayer.frequency * 100)), arg1);
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
		arg7.position = arg2;
		return arg3;
	}

	@ObfuscatedName("ka.b(I)V")
	@Override
	public synchronized void pretendToMix(int arg0) {
		if (this.volumeChangeDelta > 0) {
			if (arg0 >= this.volumeChangeDelta) {
				if (this.volume == Integer.MIN_VALUE) {
					this.unlink();
					arg0 = this.volumeChangeDelta;
				} else {
					this.volumeMono = this.volume;
				}
				this.volumeChangeDelta = 0;
			} else {
				this.volumeMono += this.field1531 * arg0;
				this.volumeChangeDelta -= arg0;
			}
		}
		this.position += this.pitch * arg0;
		Wave var2 = (Wave) super.field2168;
		int var3 = this.loopStartPosition << 8;
		int var4 = this.loopEndPosition << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.loopCount = 0;
		}
		if (this.loopCount >= 0) {
			if (this.loopCount > 0) {
				if (this.loopReversed) {
					label113:
					{
						if (this.pitch < 0) {
							if (this.position >= var3) {
								return;
							}
							this.position = var3 + var3 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break label113;
							}
						}
						do {
							if (this.position < var4) {
								return;
							}
							this.position = var4 + var4 - this.position - 1;
							this.pitch = -this.pitch;
							if (--this.loopCount == 0) {
								break;
							}
							if (this.position >= var3) {
								return;
							}
							this.position = var3 + var3 - this.position - 1;
							this.pitch = -this.pitch;
						} while (--this.loopCount != 0);
					}
				} else if (this.pitch < 0) {
					if (this.position >= var3) {
						return;
					}
					int var7 = (var4 - this.position - 1) / var6;
					if (var7 < this.loopCount) {
						this.position += var6 * var7;
						this.loopCount -= var7;
						return;
					}
					this.position += this.loopCount * var6;
					this.loopCount = 0;
				} else if (this.position >= var4) {
					int var8 = (this.position - var3) / var6;
					if (var8 < this.loopCount) {
						this.position -= var6 * var8;
						this.loopCount -= var8;
						return;
					}
					this.position -= this.loopCount * var6;
					this.loopCount = 0;
				} else {
					return;
				}
			}
			if (this.pitch < 0) {
				if (this.position < 0) {
					this.position = 0;
					this.unlink();
					return;
				}
			} else if (this.position >= var5) {
				this.position = var5 - 1;
				this.unlink();
			}
		} else if (this.loopReversed) {
			if (this.pitch < 0) {
				if (this.position >= var3) {
					return;
				}
				this.position = var3 + var3 - this.position - 1;
				this.pitch = -this.pitch;
			}
			while (this.position >= var4) {
				this.position = var4 + var4 - this.position - 1;
				this.pitch = -this.pitch;
				if (this.position >= var3) {
					return;
				}
				this.position = var3 + var3 - this.position - 1;
				this.pitch = -this.pitch;
			}
		} else if (this.pitch < 0) {
			if (this.position < var3) {
				this.position = var4 - (var4 - 1 - this.position) % var6 - 1;
			}
		} else if (this.position >= var4) {
			this.position = (this.position - var3) % var6 + var3;
		}
	}

	@ObfuscatedName("ka.b([IIIII)I")
	public int method592(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.volumeChangeDelta > 0) {
			int var6 = this.volumeChangeDelta + arg1;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.volumeChangeDelta += arg1;
			if (this.pitch == 256 && (this.position & 0xFF) == 0) {
				arg1 = doMixForwards1To1RampMono(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, this.field1530, this.field1531, var6, arg2, this);
			} else {
				arg1 = method580(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, this.field1530, this.field1531, var6, arg2, this, this.pitch, arg4);
			}
			this.volumeChangeDelta -= arg1;
			if (this.volumeChangeDelta != 0) {
				return arg1;
			}
			if (this.volume == Integer.MIN_VALUE) {
				this.unlink();
				return arg3;
			}
			this.volumeMono = this.volume;
		}
		return this.pitch == 256 && (this.position & 0xFF) == 0 ? method593(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this) : method591(((Wave) super.field2168).samples, arg0, this.position, arg1, this.volumeMono, arg3, arg2, this, this.pitch, arg4);
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
		arg7.position = var8 << 8;
		return arg3;
	}

	public WaveStream(Wave arg0, int arg1, int arg2) {
		super.field2168 = arg0;
		this.loopStartPosition = arg0.loopStartPosition;
		this.loopEndPosition = arg0.loopEndPosition;
		this.pitch = arg1;
		this.volumeMono = arg2;
		this.position = 0;
	}
}
