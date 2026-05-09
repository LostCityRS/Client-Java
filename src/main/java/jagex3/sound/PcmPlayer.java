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
	public static boolean stereo;
	@ObfuscatedName("uc.a")
	public static int threadPriority;
    @ObfuscatedName("nd.l")
    public static AudioThread field2738;
    @ObfuscatedName("ej.h")
	public final int maxMixCost = 32;

	@ObfuscatedName("ej.l")
	public int[] samples;

	@ObfuscatedName("ej.v")
	public long lastPlayTime = MonotonicTime.currentTime();

	@ObfuscatedName("ej.w")
	public PcmStream stream;

	@ObfuscatedName("ej.z")
	public boolean skipAcceptedCheck = true;

	@ObfuscatedName("ej.x")
	public final PcmStream[] priorityQueueTails = new PcmStream[8];

	@ObfuscatedName("ej.F")
	public long reopenTime = 0L;

	@ObfuscatedName("ej.G")
	public int samplesUntilMix = 0;

	@ObfuscatedName("ej.C")
	public int maxAccepted = 0;

	@ObfuscatedName("ej.I")
	public int previousMaxAccepted = 0;

	@ObfuscatedName("ej.E")
	public long nextAcceptedCheckTime = 0L;

	@ObfuscatedName("ej.J")
	public int previousQueued = 0;

	@ObfuscatedName("ej.L")
	public final PcmStream[] priorityQueueHeads = new PcmStream[8];

	@ObfuscatedName("ej.y")
	public int capacity;

	@ObfuscatedName("ej.D")
	public int initialTargetSampledQueued;

	@ObfuscatedName("ej.M")
	public int additionalTargetSamplesQueued;

	@ObfuscatedName("dj.a(IBZI)V")
	public static void init(boolean arg0) {
		frequency = 22050;
		stereo = arg0;
		threadPriority = 2;
	}

	@ObfuscatedName("ub.a(ILjava/awt/Component;Lqg;BI)Lej;")
	public static PcmPlayer getPlayer(int arg0, Component arg1, SignLink arg2, int arg3) {
		if (frequency == 0) {
			throw new IllegalStateException();
		}
		try {
			PcmPlayer var4 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var4.initialTargetSampledQueued = arg3;
			var4.samples = new int[(stereo ? 2 : 1) * 256];
			var4.init(arg1);
			var4.capacity = (arg3 & 0xFFFFFC00) + 1024;
			if (var4.capacity > 16384) {
				var4.capacity = 16384;
			}
			var4.open(var4.capacity);
			if (threadPriority > 0 && field2738 == null) {
				field2738 = new AudioThread();
				field2738.signLink = arg2;
				arg2.threadreq(field2738, threadPriority);
			}
			if (field2738 != null) {
				if (field2738.players[arg0] != null) {
					throw new IllegalArgumentException();
				}
				field2738.players[arg0] = var4;
			}
			return var4;
		} catch (Throwable var7) {
			try {
				JavaSafePcmPlayer var5 = new JavaSafePcmPlayer(arg2, arg0);
				var5.samples = new int[(stereo ? 2 : 1) * 256];
				var5.initialTargetSampledQueued = arg3;
				var5.init(arg1);
				var5.capacity = 16384;
				var5.open(var5.capacity);
				if (threadPriority > 0 && field2738 == null) {
					field2738 = new AudioThread();
					field2738.signLink = arg2;
					arg2.threadreq(field2738, threadPriority);
				}
				if (field2738 != null) {
					if (field2738.players[arg0] != null) {
						throw new IllegalArgumentException();
					}
					field2738.players[arg0] = var5;
				}
				return var5;
			} catch (Throwable var6) {
				return new PcmPlayer();
			}
		}
	}

	@ObfuscatedName("ej.a()I")
	public int queued() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ej.a(II)V")
	public void skip() {
		this.samplesUntilMix -= 256;
		if (this.samplesUntilMix < 0) {
			this.samplesUntilMix = 0;
		}
		if (this.stream != null) {
			this.stream.pretendToMix(256);
		}
	}

	@ObfuscatedName("ej.b()V")
	public void write() throws Exception {
	}

	@ObfuscatedName("ej.a(I)V")
	public final synchronized void play() {
		this.skipAcceptedCheck = true;
		try {
			this.flush();
		} catch (Exception var1) {
			this.close();
			this.reopenTime = MonotonicTime.currentTime() + 2000L;
		}
	}

	@ObfuscatedName("ej.b(I)V")
	public final synchronized void shutdown() {
		if (field2738 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (field2738.players[var2] == this) {
					field2738.players[var2] = null;
				}
				if (field2738.players[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				field2738.shutdown = true;
				while (field2738.running) {
					ThreadSleep.sleepPrecise(50L);
				}
				field2738 = null;
			}
		}
		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ej.a(Z)V")
	public final void skipNextAcceptedCheck() {
		this.skipAcceptedCheck = true;
	}

	@ObfuscatedName("ej.a(IILef;)V")
	public void enqueueStream(int arg0, PcmStream arg1) {
		int var3 = arg0 >> 5;
		PcmStream var4 = this.priorityQueueTails[var3];
		if (var4 == null) {
			this.priorityQueueHeads[var3] = arg1;
		} else {
			var4.stream = arg1;
		}
		this.priorityQueueTails[var3] = arg1;
		arg1.field934 = arg0;
	}

	@ObfuscatedName("ej.a([II)V")
	public void generate(int[] arg0) {
		short var2 = 256;
		if (stereo) {
			var2 = 512;
		}
		ArrayUtil.clear(arg0, 0, var2);
		this.samplesUntilMix -= 256;
		if (this.stream != null && this.samplesUntilMix <= 0) {
			this.samplesUntilMix += frequency >> 4;
			Statics.method99(this.stream);
			this.enqueueStream(this.stream.priority(), this.stream);
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
						PcmStream var10 = this.priorityQueueHeads[var6];
						label97: while (true) {
							while (true) {
								if (var10 == null) {
									break label97;
								}
								PcmStreamable var11 = var10.sound;
								if (var11 == null || var11.position <= var7) {
									var10.active = true;
									int var12 = var10.selfMixCost();
									var3 += var12;
									if (var11 != null) {
										var11.position += var12;
									}
									if (var3 >= this.maxMixCost) {
										break label103;
									}
									PcmStream var13 = var10.substreamStart();
									if (var13 != null) {
										int var14 = var10.field934;
										while (var13 != null) {
											this.enqueueStream(var14 * var13.priority() >> 8, var13);
											var13 = var10.substreamNext();
										}
									}
									PcmStream var15 = var10.stream;
									var10.stream = null;
									if (var9 == null) {
										this.priorityQueueHeads[var6] = var15;
									} else {
										var9.stream = var15;
									}
									if (var15 == null) {
										this.priorityQueueTails[var6] = var9;
									}
									var10 = var15;
								} else {
									var4 |= 0x1 << var6;
									var9 = var10;
									var10 = var10.stream;
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
				PcmStream var17 = this.priorityQueueHeads[var16];
				this.priorityQueueHeads[var16] = this.priorityQueueTails[var16] = null;
				while (var17 != null) {
					PcmStream var18 = var17.stream;
					var17.stream = null;
					var17 = var18;
				}
			}
		}
		if (this.samplesUntilMix < 0) {
			this.samplesUntilMix = 0;
		}
		if (this.stream != null) {
			this.stream.doMix(arg0, 0, 256);
		}
		this.lastPlayTime = MonotonicTime.currentTime();
	}

	@ObfuscatedName("ej.a(B)V")
	public final synchronized void cycle() {
		if (this.samples == null) {
			return;
		}
		long var1 = MonotonicTime.currentTime();
		try {
			if (this.reopenTime != 0L) {
				if (var1 < this.reopenTime) {
					return;
				}
				this.open(this.capacity);
				this.reopenTime = 0L;
				this.skipAcceptedCheck = true;
			}
			int var3 = this.queued();
			int var4 = this.additionalTargetSamplesQueued + this.initialTargetSampledQueued;
			if (this.previousQueued - var3 > this.maxAccepted) {
				this.maxAccepted = this.previousQueued - var3;
			}
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (this.capacity < var4 + 256) {
				var3 = 0;
				this.capacity += 1024;
				if (this.capacity > 16384) {
					this.capacity = 16384;
				}
				this.close();
				this.open(this.capacity);
				this.skipAcceptedCheck = true;
				if (var4 + 256 > this.capacity) {
					var4 = this.capacity - 256;
					this.additionalTargetSamplesQueued = var4 - this.initialTargetSampledQueued;
				}
			}
			while (var3 < var4) {
				this.generate(this.samples);
				this.write();
				var3 += 256;
			}
			if (var1 > this.nextAcceptedCheckTime) {
				if (this.skipAcceptedCheck) {
					this.skipAcceptedCheck = false;
				} else if (this.maxAccepted == 0 && this.previousMaxAccepted == 0) {
					this.close();
					this.reopenTime = var1 + 2000L;
					return;
				} else {
					this.additionalTargetSamplesQueued = Math.min(this.previousMaxAccepted, this.maxAccepted);
					this.previousMaxAccepted = this.maxAccepted;
				}
				this.maxAccepted = 0;
				this.nextAcceptedCheckTime = var1 + 2000L;
			}
			this.previousQueued = var3;
		} catch (Exception var6) {
			this.close();
			this.reopenTime = var1 + 2000L;
		}
		try {
			if (var1 > this.lastPlayTime + 500000L) {
				var1 = this.lastPlayTime;
			}
			while (var1 > this.lastPlayTime + 5000L) {
				this.skip();
				this.lastPlayTime += 256000 / frequency;
			}
		} catch (Exception var5) {
			this.lastPlayTime = var1;
		}
	}

	@ObfuscatedName("ej.c()V")
	public void close() {
	}

	@ObfuscatedName("ej.c(I)V")
	public void open(int arg0) throws Exception {
	}

	@ObfuscatedName("ej.a(Lef;I)V")
	public final synchronized void playStream(PcmStream arg0) {
		this.stream = arg0;
	}

	@ObfuscatedName("ej.a(Ljava/awt/Component;)V")
	public void init(Component arg0) throws Exception {
	}

	@ObfuscatedName("ej.d()V")
	public void flush() throws Exception {
	}
}
