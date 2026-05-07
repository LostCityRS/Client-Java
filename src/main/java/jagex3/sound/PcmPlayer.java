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
	public static long field462;
	@ObfuscatedName("ad.D")
	public static PcmPlayerBase field217;
	@ObfuscatedName("vb.Db")
	public static int field3140;
	@ObfuscatedName("hb.cb")
	public static int field1157;
	@ObfuscatedName("id.v")
	public static PcmStream stream;

	@ObfuscatedName("pd.K")
	public int field2343 = 0;

	@ObfuscatedName("pd.G")
	public long reopenTime = 0L;

	@ObfuscatedName("pd.M")
	public int field2345 = 256;

	@ObfuscatedName("pd.F")
	public boolean skipAcceptedCheck = false;

	@ObfuscatedName("pd.N")
	public int field2346 = 0;

	@ObfuscatedName("pd.H")
	public int field2340 = 0;

	@ObfuscatedName("pd.J")
	public int field2342 = 0;

	@ObfuscatedName("pd.S")
	public final int[] field2351 = new int[512];

	@ObfuscatedName("pd.I")
	public int field2341;

	@ObfuscatedName("pd.P")
	public int field2348;

	@ObfuscatedName("pd.Q")
	public int capacity;

	@ObfuscatedName("pd.L")
	public long nextAcceptedCheckTime;

	@ObfuscatedName("pd.R")
	public long field2350;

	@ObfuscatedName("wc.a(Ljava/awt/Component;ILlc;)V")
	public static void method1050(Component arg0, SignLink arg1) {
		try {
			PcmPlayer var2 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var2.method818(arg1, 2048);
			field217 = var2;
		} catch (Throwable var5) {
			try {
				field217 = new JavaSafePcmPlayer(arg1, arg0);
			} catch (Throwable var4) {
				if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						field217 = new JavaMicrosoftPcmPlayer();
						return;
					} catch (Throwable var3) {
					}
				}
				field217 = new PcmPlayerBase(8000);
			}
		}
	}

	@ObfuscatedName("pd.b()V")
	public static void unload() {
		samples = null;
	}

    @ObfuscatedName("ha.a(B)V")
    public static void shutdown() {
        if (field217 == null) {
            return;
        }
        long var0 = MonotonicTime.currentTime();
        if (var0 <= field462) {
            return;
        }
        field217.method255(var0);
        int var2 = (int) (var0 - field462);
        field462 = var0;
        Class var3 = PcmPlayerBase.class;
        synchronized (PcmPlayerBase.class) {
            field1157 += frequency * var2;
            int var4 = (field1157 - frequency * 2000) / 1000;
            if (var4 > 0) {
                if (stream != null) {
                    stream.pretendToMix(var4);
                }
                field1157 -= var4 * 1000;
            }
        }
    }

	@ObfuscatedName("td.a(Z)V")
	public static void method967() {
		if (field217 != null) {
			field217.play();
			field217 = null;
		}
	}

	@ObfuscatedName("ca.a(IB)V")
	public static synchronized void method260() {
		if (stream != null) {
			stream.pretendToMix(256);
		}
		method949(256);
	}

	@ObfuscatedName("ca.a(Loc;I)V")
	public static synchronized void playStream(PcmStream arg0) {
		stream = arg0;
	}

	@ObfuscatedName("ta.b(ZI)V")
	public static void method949(int arg0) {
		for (field3140 += arg0; field3140 >= frequency; field3140 -= frequency) {
			field1157 -= field1157 >> 2;
		}
		field1157 -= arg0 * 1000;
		if (field1157 < 0) {
			field1157 = 0;
		}
	}

	@ObfuscatedName("pd.b(J)V")
	public void skip(long arg0) throws Exception {
		this.init(this.capacity);
		while (true) {
			int var3 = this.queued();
			if (var3 < this.field2345) {
				this.field2341 = 0;
				this.field2348 = 0;
				this.field2350 = arg0;
				this.nextAcceptedCheckTime = arg0;
				return;
			}
			this.write();
		}
	}

	@ObfuscatedName("pd.c(J)V")
	public void method817(long arg0) {
		if (this.reopenTime != 0L) {
			while (true) {
				if (this.field2350 >= arg0) {
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
				method260();
				this.field2350 += 256000 / frequency;
			}
		}
		while (this.field2350 < arg0) {
			this.field2350 += 250880 / frequency;
			int var3;
			try {
				var3 = this.queued();
			} catch (Exception var6) {
				this.close();
				this.reopenTime = arg0;
				return;
			}
			this.method819(var3);
			int var4 = this.field2346 * 3 / 512 - this.field2340 * 2;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > this.field2342) {
				var4 = this.field2342;
			}
			this.field2345 = this.capacity - var4 - 256;
			if (this.field2345 < 256) {
				this.field2345 = 256;
			}
			if (this.capacity < 16384) {
				if (var3 >= this.capacity) {
					this.field2341 += 5;
					if (this.field2341 >= 100) {
						this.close();
						this.capacity += 2048;
						this.reopenTime = arg0;
						return;
					}
				} else if (this.field2348 != var3 && this.field2341 > 0) {
					this.field2341--;
				}
			}
			this.field2348 = var3;
			if (var3 < this.field2345) {
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
			this.field2348 -= 256;
		}
		if (arg0 < this.nextAcceptedCheckTime + 5000L) {
			return;
		}
		this.close();
		this.reopenTime = arg0;
		for (int var5 = 0; var5 < 512; var5++) {
			this.field2351[var5] = 0;
		}
		this.field2340 = this.field2342 = this.field2346 = 0;
	}

	public PcmPlayer(int arg0) throws Exception {
		super(22050);
	}

	@ObfuscatedName("pd.a(Llc;I)V")
	public final void method818(SignLink arg0, int arg1) throws Exception {
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
					this.method255(MonotonicTime.currentTime());
				}
				ThreadSleep.sleepPrecise(5L);
			}
		} catch (Exception var4) {
			JagException.report(null, var4);
		}
	}

	@ObfuscatedName("pd.a(J)V")
	@Override
	public final synchronized void method255(long arg0) {
		this.method817(arg0);
		if (this.field2350 < arg0) {
			this.field2350 = arg0;
		}
	}

	@ObfuscatedName("pd.e(I)V")
	public void method819(int arg0) {
		int var2 = arg0 - this.field2345;
		int var3 = this.field2351[this.field2343];
		this.field2351[this.field2343] = var2;
		this.field2346 += var2 - var3;
		int var4 = this.field2343 + 1 & 0x1FF;
		if (var2 > this.field2342) {
			this.field2342 = var2;
		}
		if (var2 < this.field2340) {
			this.field2340 = var2;
		}
		if (this.field2342 == var3) {
			int var5 = var2;
			for (int var6 = var4; this.field2343 != var6 && var5 < this.field2342; var6 = var6 + 1 & 0x1FF) {
				int var7 = this.field2351[var6];
				if (var7 > var5) {
					var5 = var7;
				}
			}
			this.field2342 = var5;
		}
		if (this.field2340 == var3) {
			int var8 = var2;
			for (int var9 = var4; this.field2343 != var9 && var8 > this.field2340; var9 = var9 + 1 & 0x1FF) {
				int var10 = this.field2351[var9];
				if (var10 < var8) {
					var8 = var10;
				}
			}
			this.field2340 = var8;
		}
		this.field2343 = var4;
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
