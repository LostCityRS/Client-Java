package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.SignLink;
import jagex3.util.ArrayUtil;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadSleep;

import java.awt.*;

@ObfuscatedName("ej")
public class PcmPlayer {

	@ObfuscatedName("aj.ab")
	public static int frequency;
	@ObfuscatedName("af.G")
	public static boolean field99;
	@ObfuscatedName("uc.a")
	public static int field4167;
	@ObfuscatedName("ej.h")
	public final int field1021 = 32;

	@ObfuscatedName("ej.l")
	public int[] field1025;

	@ObfuscatedName("ej.v")
	public long field1035 = MonotonicTime.currentTime();

	@ObfuscatedName("ej.w")
	public PcmStream field1036;

	@ObfuscatedName("ej.z")
	public boolean field1039 = true;

	@ObfuscatedName("ej.x")
	public final PcmStream[] field1037 = new PcmStream[8];

	@ObfuscatedName("ej.F")
	public long field1045 = 0L;

	@ObfuscatedName("ej.G")
	public int field1046 = 0;

	@ObfuscatedName("ej.C")
	public int field1042 = 0;

	@ObfuscatedName("ej.I")
	public int field1048 = 0;

	@ObfuscatedName("ej.E")
	public long field1044 = 0L;

	@ObfuscatedName("ej.J")
	public int field1049 = 0;

	@ObfuscatedName("ej.L")
	public final PcmStream[] field1051 = new PcmStream[8];

	@ObfuscatedName("ej.y")
	public int field1038;

	@ObfuscatedName("ej.D")
	public int field1043;

	@ObfuscatedName("ej.M")
	public int field1052;

	@ObfuscatedName("dj.a(IBZI)V")
	public static void init(boolean arg0) {
		frequency = 22050;
		field99 = arg0;
		field4167 = 2;
	}

	@ObfuscatedName("ub.a(ILjava/awt/Component;Lqg;BI)Lej;")
	public static PcmPlayer getPlayer(int arg0, Component arg1, SignLink arg2, int arg3) {
		if (frequency == 0) {
			throw new IllegalStateException();
		}
		try {
			PcmPlayer var4 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var4.field1043 = arg3;
			var4.field1025 = new int[(field99 ? 2 : 1) * 256];
			var4.method412(arg1);
			var4.field1038 = (arg3 & 0xFFFFFC00) + 1024;
			if (var4.field1038 > 16384) {
				var4.field1038 = 16384;
			}
			var4.method409(var4.field1038);
			if (field4167 > 0 && Statics.field2738 == null) {
				Statics.field2738 = new AudioThread();
				Statics.field2738.field3109 = arg2;
				arg2.threadreq(Statics.field2738, field4167);
			}
			if (Statics.field2738 != null) {
				if (Statics.field2738.field3102[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Statics.field2738.field3102[arg0] = var4;
			}
			return var4;
		} catch (Throwable var7) {
			try {
				JavaSafePcmPlayer var5 = new JavaSafePcmPlayer(arg2, arg0);
				var5.field1025 = new int[(field99 ? 2 : 1) * 256];
				var5.field1043 = arg3;
				var5.method412(arg1);
				var5.field1038 = 16384;
				var5.method409(var5.field1038);
				if (field4167 > 0 && Statics.field2738 == null) {
					Statics.field2738 = new AudioThread();
					Statics.field2738.field3109 = arg2;
					arg2.threadreq(Statics.field2738, field4167);
				}
				if (Statics.field2738 != null) {
					if (Statics.field2738.field3102[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Statics.field2738.field3102[arg0] = var5;
				}
				return var5;
			} catch (Throwable var6) {
				return new PcmPlayer();
			}
		}
	}

	@ObfuscatedName("ej.a()I")
	public int method398() throws Exception {
		return this.field1038;
	}

	@ObfuscatedName("ej.a(II)V")
	public void method399() {
		this.field1046 -= 256;
		if (this.field1046 < 0) {
			this.field1046 = 0;
		}
		if (this.field1036 != null) {
			this.field1036.method384(256);
		}
	}

	@ObfuscatedName("ej.b()V")
	public void method400() throws Exception {
	}

	@ObfuscatedName("ej.a(I)V")
	public final synchronized void method401() {
		this.field1039 = true;
		try {
			this.method413();
		} catch (Exception var1) {
			this.method408();
			this.field1045 = MonotonicTime.currentTime() + 2000L;
		}
	}

	@ObfuscatedName("ej.b(I)V")
	public final synchronized void shutdown() {
		if (Statics.field2738 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (Statics.field2738.field3102[var2] == this) {
					Statics.field2738.field3102[var2] = null;
				}
				if (Statics.field2738.field3102[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				Statics.field2738.field3106 = true;
				while (Statics.field2738.field3107) {
					ThreadSleep.sleepPrecise(50L);
				}
				Statics.field2738 = null;
			}
		}
		this.method408();
		this.field1025 = null;
	}

	@ObfuscatedName("ej.a(Z)V")
	public final void method403() {
		this.field1039 = true;
	}

	@ObfuscatedName("ej.a(IILef;)V")
	public void method404(int arg0, PcmStream arg1) {
		int var3 = arg0 >> 5;
		PcmStream var4 = this.field1037[var3];
		if (var4 == null) {
			this.field1051[var3] = arg1;
		} else {
			var4.field936 = arg1;
		}
		this.field1037[var3] = arg1;
		arg1.field934 = arg0;
	}

	@ObfuscatedName("ej.a([II)V")
	public void method405(int[] arg0) {
		short var2 = 256;
		if (field99) {
			var2 = 512;
		}
		ArrayUtil.clear(arg0, 0, var2);
		this.field1046 -= 256;
		if (this.field1036 != null && this.field1046 <= 0) {
			this.field1046 += frequency >> 4;
			Statics.method99(this.field1036);
			this.method404(this.field1036.method382(), this.field1036);
			int var3 = 0;
			int var4 = 255;
			int var5 = 7;
			label103: while (var4 != 0) {
				int var6;
				int var7;
				if (var5 < 0) {
					var6 = var5 & 0x3;
					var7 = -(var5 >> 2);
				} else {
					var6 = var5;
					var7 = 0;
				}
				for (int var8 = var4 >>> var6 & 0x11111111; var8 != 0; var8 >>>= 0x4) {
					if ((var8 & 0x1) != 0) {
						var4 &= ~(0x1 << var6);
						PcmStream var9 = null;
						PcmStream var10 = this.field1051[var6];
						label97: while (true) {
							while (true) {
								if (var10 == null) {
									break label97;
								}
								PcmStreamable var11 = var10.field935;
								if (var11 == null || var11.field1254 <= var7) {
									var10.field937 = true;
									int var12 = var10.method383();
									var3 += var12;
									if (var11 != null) {
										var11.field1254 += var12;
									}
									if (var3 >= this.field1021) {
										break label103;
									}
									PcmStream var13 = var10.method385();
									if (var13 != null) {
										int var14 = var10.field934;
										while (var13 != null) {
											this.method404(var14 * var13.method382() >> 8, var13);
											var13 = var10.method380();
										}
									}
									PcmStream var15 = var10.field936;
									var10.field936 = null;
									if (var9 == null) {
										this.field1051[var6] = var15;
									} else {
										var9.field936 = var15;
									}
									if (var15 == null) {
										this.field1037[var6] = var9;
									}
									var10 = var15;
								} else {
									var4 |= 0x1 << var6;
									var9 = var10;
									var10 = var10.field936;
								}
							}
						}
					}
					var6 += 4;
					var7++;
				}
				var5--;
			}
			for (int var16 = 0; var16 < 8; var16++) {
				PcmStream var17 = this.field1051[var16];
				this.field1051[var16] = this.field1037[var16] = null;
				while (var17 != null) {
					PcmStream var18 = var17.field936;
					var17.field936 = null;
					var17 = var18;
				}
			}
		}
		if (this.field1046 < 0) {
			this.field1046 = 0;
		}
		if (this.field1036 != null) {
			this.field1036.method379(arg0, 0, 256);
		}
		this.field1035 = MonotonicTime.currentTime();
	}

	@ObfuscatedName("ej.a(B)V")
	public final synchronized void method406() {
		if (this.field1025 == null) {
			return;
		}
		long var1 = MonotonicTime.currentTime();
		try {
			if (this.field1045 != 0L) {
				if (var1 < this.field1045) {
					return;
				}
				this.method409(this.field1038);
				this.field1045 = 0L;
				this.field1039 = true;
			}
			int var3 = this.method398();
			int var4 = this.field1052 + this.field1043;
			if (this.field1049 - var3 > this.field1042) {
				this.field1042 = this.field1049 - var3;
			}
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (this.field1038 < var4 + 256) {
				var3 = 0;
				this.field1038 += 1024;
				if (this.field1038 > 16384) {
					this.field1038 = 16384;
				}
				this.method408();
				this.method409(this.field1038);
				this.field1039 = true;
				if (var4 + 256 > this.field1038) {
					var4 = this.field1038 - 256;
					this.field1052 = var4 - this.field1043;
				}
			}
			while (var3 < var4) {
				this.method405(this.field1025);
				this.method400();
				var3 += 256;
			}
			if (var1 > this.field1044) {
				if (this.field1039) {
					this.field1039 = false;
				} else if (this.field1042 == 0 && this.field1048 == 0) {
					this.method408();
					this.field1045 = var1 + 2000L;
					return;
				} else {
					this.field1052 = Math.min(this.field1048, this.field1042);
					this.field1048 = this.field1042;
				}
				this.field1042 = 0;
				this.field1044 = var1 + 2000L;
			}
			this.field1049 = var3;
		} catch (Exception var6) {
			this.method408();
			this.field1045 = var1 + 2000L;
		}
		try {
			if (var1 > this.field1035 + 500000L) {
				var1 = this.field1035;
			}
			while (var1 > this.field1035 + 5000L) {
				this.method399();
				this.field1035 += 256000 / frequency;
			}
		} catch (Exception var5) {
			this.field1035 = var1;
		}
	}

	@ObfuscatedName("ej.c()V")
	public void method408() {
	}

	@ObfuscatedName("ej.c(I)V")
	public void method409(int arg0) throws Exception {
	}

	@ObfuscatedName("ej.a(Lef;I)V")
	public final synchronized void playStream(PcmStream arg0) {
		this.field1036 = arg0;
	}

	@ObfuscatedName("ej.a(Ljava/awt/Component;)V")
	public void method412(Component arg0) throws Exception {
	}

	@ObfuscatedName("ej.d()V")
	public void method413() throws Exception {
	}
}
