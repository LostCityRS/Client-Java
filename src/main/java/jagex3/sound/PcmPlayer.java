package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.SignLink;
import jagex3.util.ArrayUtil;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadSleep;

import java.awt.*;

@ObfuscatedName("pd")
public abstract class PcmPlayer extends PcmPlayerBase implements Runnable {

	@ObfuscatedName("pd.O")
	public static int[] samples = new int[256];
	@ObfuscatedName("ad.e")
	public static int frequency;
	@ObfuscatedName("ca.n")
	public static long lastLoopTime;
	@ObfuscatedName("ad.D")
	public static PcmPlayerBase activePlayer;
	@ObfuscatedName("vb.Db")
	public static int streamTimeSampleCounter;
	@ObfuscatedName("hb.cb")
	public static int streamTimeMillis;
	@ObfuscatedName("id.v")
	public static PcmStream stream;

	@ObfuscatedName("pd.K")
	public int availableHistoryIndex = 0;

	@ObfuscatedName("pd.G")
	public long reopenTime = 0L;

	@ObfuscatedName("pd.M")
	public int availableThreshold = 256;

	@ObfuscatedName("pd.F")
	public boolean skipAcceptedCheck = false;

	@ObfuscatedName("pd.N")
	public int availableSum = 0;

	@ObfuscatedName("pd.H")
	public int availableMin = 0;

	@ObfuscatedName("pd.J")
	public int availableMax = 0;

	@ObfuscatedName("pd.S")
	public final int[] availableHistory = new int[512];

	@ObfuscatedName("pd.I")
	public int emptyBufferCount;

	@ObfuscatedName("pd.P")
	public int lastAvailable;

	@ObfuscatedName("pd.Q")
	public int capacity;

	@ObfuscatedName("pd.L")
	public long nextAcceptedCheckTime;

	@ObfuscatedName("pd.R")
	public long nextWriteTime;

	@ObfuscatedName("wc.a(Ljava/awt/Component;ILlc;)V")
	public static void initGlobal(Component arg0, SignLink arg1) {
		try {
			PcmPlayer var2 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var2.start(arg1, 2048);
			activePlayer = var2;
		} catch (Throwable var5) {
			try {
				activePlayer = new DevicePcmPlayer(arg1, arg0);
			} catch (Throwable var4) {
				if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						activePlayer = new SunPcmPlayer();
						return;
					} catch (Throwable var3) {
					}
				}
				activePlayer = new PcmPlayerBase(8000);
			}
		}
	}

	@ObfuscatedName("pd.b()V")
	public static void unload() {
		samples = null;
	}

    @ObfuscatedName("ha.a(B)V")
    public static void loop() {
        if (activePlayer == null) {
            return;
        }
        long var0 = MonotonicTime.currentTime();
        if (var0 <= lastLoopTime) {
            return;
        }
        activePlayer.process(var0);
        int var2 = (int) (var0 - lastLoopTime);
        lastLoopTime = var0;
        Class var3 = PcmPlayerBase.class;
        synchronized (PcmPlayerBase.class) {
            streamTimeMillis += frequency * var2;
            int var4 = (streamTimeMillis - frequency * 2000) / 1000;
            if (var4 > 0) {
                if (stream != null) {
                    stream.pretendToMix(var4);
                }
                streamTimeMillis -= var4 * 1000;
            }
        }
    }

	@ObfuscatedName("td.a(Z)V")
	public static void shutdown() {
		if (activePlayer != null) {
			activePlayer.play();
			activePlayer = null;
		}
	}

	@ObfuscatedName("ca.a(IB)V")
	public static synchronized void skipSamples() {
		if (stream != null) {
			stream.pretendToMix(256);
		}
		updateStreamTime(256);
	}

	@ObfuscatedName("ca.a(Loc;I)V")
	public static synchronized void playStream(PcmStream arg0) {
		stream = arg0;
	}

	@ObfuscatedName("ta.b(ZI)V")
	public static void updateStreamTime(int arg0) {
		for (streamTimeSampleCounter += arg0; streamTimeSampleCounter >= frequency; streamTimeSampleCounter -= frequency) {
			streamTimeMillis -= streamTimeMillis >> 2;
		}
		streamTimeMillis -= arg0 * 1000;
		if (streamTimeMillis < 0) {
			streamTimeMillis = 0;
		}
	}

	@ObfuscatedName("pd.b(J)V")
	public void skip(long arg0) throws Exception {
		this.init(this.capacity);
		while (true) {
			int var3 = this.queued();
			if (var3 < this.availableThreshold) {
				this.emptyBufferCount = 0;
				this.lastAvailable = 0;
				this.nextWriteTime = arg0;
				this.nextAcceptedCheckTime = arg0;
				return;
			}
			this.write();
		}
	}

	@ObfuscatedName("pd.c(J)V")
	public void process0(long arg0) {
		if (this.reopenTime != 0L) {
			while (true) {
				if (this.nextWriteTime >= arg0) {
					if (arg0 < this.reopenTime) {
						return;
					}
					try {
						this.skip(arg0);
					} catch (Exception var8) {
						this.close();
						this.reopenTime += 5000L;
						return;
					}
					this.reopenTime = 0L;
					break;
				}
				skipSamples();
				this.nextWriteTime += 256000 / frequency;
			}
		}
		while (this.nextWriteTime < arg0) {
			this.nextWriteTime += 250880 / frequency;
			int var3;
			try {
				var3 = this.queued();
			} catch (Exception var6) {
				this.close();
				this.reopenTime = arg0;
				return;
			}
			this.recordAvailable(var3);
			int var4 = this.availableSum * 3 / 512 - this.availableMin * 2;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > this.availableMax) {
				var4 = this.availableMax;
			}
			this.availableThreshold = this.capacity - var4 - 256;
			if (this.availableThreshold < 256) {
				this.availableThreshold = 256;
			}
			if (this.capacity < 16384) {
				if (var3 >= this.capacity) {
					this.emptyBufferCount += 5;
					if (this.emptyBufferCount >= 100) {
						this.close();
						this.capacity += 2048;
						this.reopenTime = arg0;
						return;
					}
				} else if (this.lastAvailable != var3 && this.emptyBufferCount > 0) {
					this.emptyBufferCount--;
				}
			}
			this.lastAvailable = var3;
			if (var3 < this.availableThreshold) {
				break;
			}
			ArrayUtil.clear(samples, 256);
			try {
				this.write();
			} catch (Exception var7) {
				this.close();
				this.reopenTime = arg0;
				return;
			}
			this.nextAcceptedCheckTime = arg0;
			this.lastAvailable -= 256;
		}
		if (arg0 < this.nextAcceptedCheckTime + 5000L) {
			return;
		}
		this.close();
		this.reopenTime = arg0;
		for (int var5 = 0; var5 < 512; var5++) {
			this.availableHistory[var5] = 0;
		}
		this.availableMin = this.availableMax = this.availableSum = 0;
	}

	public PcmPlayer(int arg0) throws Exception {
		super(22050);
	}

	@ObfuscatedName("pd.a(Llc;I)V")
	public final void start(SignLink arg0, int arg1) throws Exception {
		this.capacity = arg1;
		this.skip(MonotonicTime.currentTime());
		arg0.threadreq(10, this);
	}

	@ObfuscatedName("pd.a()V")
	@Override
	public final void play() {
		synchronized (this) {
			this.skipAcceptedCheck = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.skipAcceptedCheck) {
					return;
				}
			}
			ThreadSleep.sleepPrecise(50L);
		}
	}

	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.skipAcceptedCheck) {
						if (this.reopenTime == 0L) {
							this.close();
						}
						this.skipAcceptedCheck = false;
						return;
					}
					this.process(MonotonicTime.currentTime());
				}
				ThreadSleep.sleepPrecise(5L);
			}
		} catch (Exception var4) {
			JagException.report(null, var4);
		}
	}

	@ObfuscatedName("pd.a(J)V")
	@Override
	public final synchronized void process(long arg0) {
		this.process0(arg0);
		if (this.nextWriteTime < arg0) {
			this.nextWriteTime = arg0;
		}
	}

	@ObfuscatedName("pd.e(I)V")
	public void recordAvailable(int arg0) {
		int var2 = arg0 - this.availableThreshold;
		int var3 = this.availableHistory[this.availableHistoryIndex];
		this.availableHistory[this.availableHistoryIndex] = var2;
		this.availableSum += var2 - var3;
		int var4 = this.availableHistoryIndex + 1 & 0x1FF;
		if (var2 > this.availableMax) {
			this.availableMax = var2;
		}
		if (var2 < this.availableMin) {
			this.availableMin = var2;
		}
		if (this.availableMax == var3) {
			int var5 = var2;
			for (int var6 = var4; this.availableHistoryIndex != var6 && var5 < this.availableMax; var6 = var6 + 1 & 0x1FF) {
				int var7 = this.availableHistory[var6];
				if (var7 > var5) {
					var5 = var7;
				}
			}
			this.availableMax = var5;
		}
		if (this.availableMin == var3) {
			int var8 = var2;
			for (int var9 = var4; this.availableHistoryIndex != var9 && var8 > this.availableMin; var9 = var9 + 1 & 0x1FF) {
				int var10 = this.availableHistory[var9];
				if (var10 < var8) {
					var8 = var10;
				}
			}
			this.availableMin = var8;
		}
		this.availableHistoryIndex = var4;
	}

	@ObfuscatedName("pd.c()V")
	public abstract void write() throws Exception;

	@ObfuscatedName("pd.d()I")
	public abstract int queued() throws Exception;

	@ObfuscatedName("pd.e()V")
	public abstract void close();

	@ObfuscatedName("pd.d(I)V")
	public abstract void init(int arg0) throws Exception;
}
