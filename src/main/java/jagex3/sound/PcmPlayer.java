package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class14;
import jagex3.callstack.JagException;
import jagex3.client.SignLink;

import java.awt.*;

@ObfuscatedName("pd")
public abstract class PcmPlayer extends class14 implements Runnable {

	@ObfuscatedName("pd.O")
	public static int[] field2347 = new int[256];
	@ObfuscatedName("ad.e")
	public static int frequency;

	@ObfuscatedName("pd.K")
	public int field2343 = 0;

	@ObfuscatedName("pd.G")
	public long field2339 = 0L;

	@ObfuscatedName("pd.M")
	public int field2345 = 256;

	@ObfuscatedName("pd.F")
	public boolean field2338 = false;

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
	public int field2349;

	@ObfuscatedName("pd.L")
	public long field2344;

	@ObfuscatedName("pd.R")
	public long field2350;

	@ObfuscatedName("wc.a(Ljava/awt/Component;ILlc;)V")
	public static void method1050(Component arg0, SignLink arg1) {
		try {
			PcmPlayer var2 = (PcmPlayer) Class.forName("jagex3.sound.JavaPcmPlayer").getDeclaredConstructor().newInstance();
			var2.method818(arg1, 2048);
			Statics.field217 = var2;
		} catch (Throwable var5) {
			try {
				Statics.field217 = new JavaSafePcmPlayer(arg1, arg0);
			} catch (Throwable var4) {
				if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Statics.field217 = new JavaMicrosoftPcmPlayer();
						return;
					} catch (Throwable var3) {
					}
				}
				Statics.field217 = new class14(8000);
			}
		}
	}

	@ObfuscatedName("k.a(Llc;IZB)Z")
	public static boolean init(SignLink arg0, boolean arg1) {
		return Statics.method734(arg0, arg1);
	}

	@ObfuscatedName("pd.b(J)V")
	public void method815(long arg0) throws Exception {
		this.method433(this.field2349);
		while (true) {
			int var3 = this.method434();
			if (var3 < this.field2345) {
				this.field2341 = 0;
				this.field2348 = 0;
				this.field2350 = arg0;
				this.field2344 = arg0;
				return;
			}
			this.method436();
		}
	}

	@ObfuscatedName("pd.c(J)V")
	public void method817(long arg0) {
		if (this.field2339 != 0L) {
			while (true) {
				if (this.field2350 >= arg0) {
					if (arg0 < this.field2339) {
						return;
					}
					try {
						this.method815(arg0);
					} catch (Exception var8) {
						this.method435();
						this.field2339 += 5000L;
						return;
					}
					this.field2339 = 0L;
					break;
				}
				Statics.method260();
				this.field2350 += 256000 / frequency;
			}
		}
		while (this.field2350 < arg0) {
			this.field2350 += 250880 / frequency;
			int var3;
			try {
				var3 = this.method434();
			} catch (Exception var6) {
				this.method435();
				this.field2339 = arg0;
				return;
			}
			this.method819(var3);
			int var4 = this.field2346 * 3 / 512 - this.field2340 * 2;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > this.field2342) {
				var4 = this.field2342;
			}
			this.field2345 = this.field2349 - var4 - 256;
			if (this.field2345 < 256) {
				this.field2345 = 256;
			}
			if (this.field2349 < 16384) {
				if (var3 >= this.field2349) {
					this.field2341 += 5;
					if (this.field2341 >= 100) {
						this.method435();
						this.field2349 += 2048;
						this.field2339 = arg0;
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
			class14.method258(field2347, 256);
			try {
				this.method436();
			} catch (Exception var7) {
				this.method435();
				this.field2339 = arg0;
				return;
			}
			this.field2344 = arg0;
			this.field2348 -= 256;
		}
		if (arg0 < this.field2344 + 5000L) {
			return;
		}
		this.method435();
		this.field2339 = arg0;
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
		this.field2349 = arg1;
		this.method815(Statics.currentTime());
		arg0.method656(10, this);
	}

	@ObfuscatedName("pd.a()V")
	@Override
	public final void method256() {
		synchronized (this) {
			this.field2338 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.field2338) {
					return;
				}
			}
			Statics.sleepPrecise(50L);
		}
	}

	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.field2338) {
						if (this.field2339 == 0L) {
							this.method435();
						}
						this.field2338 = false;
						return;
					}
					this.method255(Statics.currentTime());
				}
				Statics.sleepPrecise(5L);
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
	public abstract void method436() throws Exception;

	@ObfuscatedName("pd.d()I")
	public abstract int method434() throws Exception;

	@ObfuscatedName("pd.e()V")
	public abstract void method435();

	@ObfuscatedName("pd.d(I)V")
	public abstract void method433(int arg0) throws Exception;
}
