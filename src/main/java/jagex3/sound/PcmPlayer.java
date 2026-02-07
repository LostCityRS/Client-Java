package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.applet.SignLink;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadSleep;

import java.awt.*;

@ObfuscatedName("qc")
public class PcmPlayer {

	@ObfuscatedName("qc.c")
	public static int field2646 = 127;

	@ObfuscatedName("qc.j")
	public static int[] field2653 = new int[5];
	@ObfuscatedName("u.Q")
	public static int frequency;
	@ObfuscatedName("ec.I")
	public static int field652;
	@ObfuscatedName("t.l")
	public static AudioThread field3031;

	@ObfuscatedName("qc.m")
	public int[] field2656;

	@ObfuscatedName("qc.v")
	public PcmStream field2665;

	@ObfuscatedName("qc.w")
	public final int field2666 = 32;

	@ObfuscatedName("qc.z")
	public static JagString field2669 = JagString.wrap("l");

	@ObfuscatedName("qc.y")
	public long field2668 = MonotonicTime.currentTime();

	@ObfuscatedName("qc.F")
	public long field2674 = 0L;

	@ObfuscatedName("qc.E")
	public boolean field2673 = true;

	@ObfuscatedName("qc.H")
	public final PcmStream[] field2676 = new PcmStream[8];

	@ObfuscatedName("qc.G")
	public int field2675 = 0;

	@ObfuscatedName("qc.M")
	public int field2681 = 0;

	@ObfuscatedName("qc.J")
	public long field2678 = 0L;

	@ObfuscatedName("qc.P")
	public int field2684 = 0;

	@ObfuscatedName("qc.O")
	public int field2683 = 0;

	@ObfuscatedName("qc.N")
	public final PcmStream[] field2682 = new PcmStream[8];

	@ObfuscatedName("qc.I")
	public int field2677;

	@ObfuscatedName("qc.K")
	public int field2679;

	@ObfuscatedName("qc.L")
	public int field2680;

	@ObfuscatedName("jb.a(Ldc;IIBLjava/awt/Component;)Lqc;")
	public static PcmPlayer getPlayer(SignLink arg0, int arg1, int arg2, Component arg3) {
		if (frequency == 0) {
			throw new IllegalStateException();
		}
		try {
			PcmPlayer var4 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var4.field2679 = arg2;
			var4.field2656 = new int[(JavaPcmPlayer.field1310 ? 2 : 1) * 256];
			var4.method141(arg3);
			var4.field2680 = (arg2 & 0xFFFFFC00) + 1024;
			if (var4.field2680 > 16384) {
				var4.field2680 = 16384;
			}
			var4.method143(var4.field2680);
			if (field652 > 0 && field3031 == null) {
				field3031 = new AudioThread();
				field3031.signlink = arg0;
				arg0.threadreq(field652, field3031, 117);
			}
			if (field3031 != null) {
				if (field3031.players[arg1] != null) {
					throw new IllegalArgumentException();
				}
				field3031.players[arg1] = var4;
			}
			return var4;
		} catch (Throwable var7) {
			try {
				JavaSafePcmPlayer var5 = new JavaSafePcmPlayer(arg0, arg1);
				var5.field2679 = arg2;
				var5.field2656 = new int[(JavaPcmPlayer.field1310 ? 2 : 1) * 256];
				var5.method141(arg3);
				var5.field2680 = 16384;
				var5.method143(var5.field2680);
				if (field652 > 0 && field3031 == null) {
					field3031 = new AudioThread();
					field3031.signlink = arg0;
					arg0.threadreq(field652, field3031, 112);
				}
				if (field3031 != null) {
					if (field3031.players[arg1] != null) {
						throw new IllegalArgumentException();
					}
					field3031.players[arg1] = var5;
				}
				return var5;
			} catch (Throwable var6) {
				return new PcmPlayer();
			}
		}
	}

	@ObfuscatedName("oc.a(BLfd;)V")
	public static void method797(PcmStream arg0) {
		arg0.field947 = false;
		if (arg0.field946 != null) {
			arg0.field946.field2184 = 0;
		}
		for (PcmStream var1 = arg0.method106(); var1 != null; var1 = arg0.method113()) {
			method797(var1);
		}
	}

	@ObfuscatedName("be.a(ZIII)V")
	public static void init(boolean arg0) {
		field652 = 2;
		JavaPcmPlayer.field1310 = arg0;
		frequency = 22050;
	}

	@ObfuscatedName("qc.a(B)V")
	public final synchronized void shutdown() {
		if (field3031 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (field3031.players[var2] == this) {
					field3031.players[var2] = null;
				}
				if (field3031.players[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				field3031.shutdown = true;
				while (field3031.running) {
					ThreadSleep.sleepPrecise(50L);
				}
				field3031 = null;
			}
		}
		this.method144();
		this.field2656 = null;
	}

	@ObfuscatedName("qc.a([II)V")
	public void method889(int[] arg0) {
		short var2 = 256;
		if (JavaPcmPlayer.field1310) {
			var2 = 512;
		}
		ArrayUtil.method458(arg0, 0, var2);
		this.field2683 -= 256;
		if (this.field2665 != null && this.field2683 <= 0) {
			this.field2683 += frequency >> 4;
			method797(this.field2665);
			this.method897(this.field2665, this.field2665.method321());
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
						PcmStream var10 = this.field2676[var6];
						label97: while (true) {
							while (true) {
								if (var10 == null) {
									break label97;
								}
								PcmStreamable var11 = var10.field946;
								if (var11 == null || var11.field2184 <= var7) {
									var10.field947 = true;
									int var12 = var10.method87();
									var3 += var12;
									if (var11 != null) {
										var11.field2184 += var12;
									}
									if (var3 >= this.field2666) {
										break label103;
									}
									PcmStream var13 = var10.method106();
									if (var13 != null) {
										int var14 = var10.field945;
										while (var13 != null) {
											this.method897(var13, var14 * var13.method321() >> 8);
											var13 = var10.method113();
										}
									}
									PcmStream var15 = var10.field944;
									var10.field944 = null;
									if (var9 == null) {
										this.field2676[var6] = var15;
									} else {
										var9.field944 = var15;
									}
									if (var15 == null) {
										this.field2682[var6] = var9;
									}
									var10 = var15;
								} else {
									var4 |= 0x1 << var6;
									var9 = var10;
									var10 = var10.field944;
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
				PcmStream var17 = this.field2676[var16];
				this.field2676[var16] = this.field2682[var16] = null;
				while (var17 != null) {
					PcmStream var18 = var17.field944;
					var17.field944 = null;
					var17 = var18;
				}
			}
		}
		if (this.field2683 < 0) {
			this.field2683 = 0;
		}
		if (this.field2665 != null) {
			this.field2665.method116(arg0, 0, 256);
		}
		this.field2668 = MonotonicTime.currentTime();
	}

	@ObfuscatedName("qc.a(Lfd;I)V")
	public final synchronized void playStream(PcmStream arg0) {
		this.field2665 = arg0;
	}

	@ObfuscatedName("qc.a(Z)V")
	public final void skipNextAcceptedCheck() {
		this.field2673 = true;
	}

	@ObfuscatedName("qc.a(Ljava/awt/Component;)V")
	public void method141(Component arg0) throws Exception {
	}

	@ObfuscatedName("qc.a(I)V")
	public void method143(int arg0) throws Exception {
	}

	@ObfuscatedName("qc.a()V")
	public void method139() throws Exception {
	}

	@ObfuscatedName("qc.b(I)V")
	public final synchronized void cycle() {
		if (this.field2656 == null) {
			return;
		}
		long var1 = MonotonicTime.currentTime();
		try {
			if (this.field2678 != 0L) {
				if (var1 < this.field2678) {
					return;
				}
				this.method143(this.field2680);
				this.field2673 = true;
				this.field2678 = 0L;
			}
			int var3 = this.method138();
			if (this.field2681 - var3 > this.field2684) {
				this.field2684 = this.field2681 - var3;
			}
			int var4 = this.field2679 + this.field2677;
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (this.field2680 < var4 + 256) {
				this.field2680 += 1024;
				if (this.field2680 > 16384) {
					this.field2680 = 16384;
				}
				var3 = 0;
				this.method144();
				this.method143(this.field2680);
				if (var4 + 256 > this.field2680) {
					var4 = this.field2680 - 256;
					this.field2677 = var4 - this.field2679;
				}
				this.field2673 = true;
			}
			while (var4 > var3) {
				var3 += 256;
				this.method889(this.field2656);
				this.method139();
			}
			if (var1 > this.field2674) {
				if (this.field2673) {
					this.field2673 = false;
				} else if (this.field2684 == 0 && this.field2675 == 0) {
					this.method144();
					this.field2678 = var1 + 2000L;
					return;
				} else {
					this.field2677 = Math.min(this.field2675, this.field2684);
					this.field2675 = this.field2684;
				}
				this.field2674 = var1 + 2000L;
				this.field2684 = 0;
			}
			this.field2681 = var3;
		} catch (Exception var6) {
			this.method144();
			this.field2678 = var1 + 2000L;
		}
		try {
			if (this.field2668 + 500000L < var1) {
				var1 = this.field2668;
			}
			while (this.field2668 + 5000L < var1) {
				this.method896();
				this.field2668 += 256000 / frequency;
			}
		} catch (Exception var5) {
			this.field2668 = var1;
		}
	}

	@ObfuscatedName("qc.b(Z)V")
	public final synchronized void play() {
		this.field2673 = true;
		try {
			this.method142();
		} catch (Exception var1) {
			this.method144();
			this.field2678 = MonotonicTime.currentTime() + 2000L;
		}
	}

	@ObfuscatedName("qc.b()I")
	public int method138() throws Exception {
		return this.field2680;
	}

	@ObfuscatedName("qc.c()V")
	public void method144() {
	}

	@ObfuscatedName("qc.d()V")
	public void method142() throws Exception {
	}

	@ObfuscatedName("qc.a(II)V")
	public void method896() {
		this.field2683 -= 256;
		if (this.field2683 < 0) {
			this.field2683 = 0;
		}
		if (this.field2665 != null) {
			this.field2665.method104(256);
		}
	}

	@ObfuscatedName("qc.a(ILfd;I)V")
	public void method897(PcmStream arg0, int arg1) {
		int var3 = arg1 >> 5;
		PcmStream var4 = this.field2682[var3];
		if (var4 == null) {
			this.field2676[var3] = arg0;
		} else {
			var4.field944 = arg0;
		}
		this.field2682[var3] = arg0;
		arg0.field945 = arg1;
	}
}
