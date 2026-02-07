package jagex3.js5;

import deob.ObfuscatedName;
import deob.class52;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.DataFile;
import jagex3.io.Packet;

import java.util.zip.CRC32;

@ObfuscatedName("ga")
public final class Js5Loader extends Js5 {

	@ObfuscatedName("tb.m")
	public static CRC32 field3120 = new CRC32();
	@ObfuscatedName("ga.db")
	public volatile boolean field1017 = false;

	@ObfuscatedName("ga.eb")
	public final int field1018;

	@ObfuscatedName("ga.fb")
	public int field1019 = -1;

	@ObfuscatedName("ga.hb")
	public int field1021;

	@ObfuscatedName("ga.jb")
	public int field1023;

	@ObfuscatedName("ga.kb")
	public final DataFile field1024;

	@ObfuscatedName("ga.nb")
	public boolean field1027 = false;

	@ObfuscatedName("ga.ob")
	public final DataFile field1028;

	@ObfuscatedName("ga.Ab")
	public volatile boolean[] field1040;

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.field1028 = arg1;
		this.field1024 = arg0;
		this.field1027 = arg5;
		this.field1018 = arg2;
		class52.method405(this.field1018, this);
	}

	@ObfuscatedName("ga.a(ZIZZ[B)V")
	public void method335(boolean arg0, int arg1, boolean arg2, byte[] arg3) {
		if (arg2) {
			if (this.field1017) {
				throw new RuntimeException();
			}
			if (this.field1028 != null) {
				Js5NetThread.method190(this.field1028, this.field1018, arg3);
			}
			this.method209(arg3);
			this.method341();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.field545[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.field545[arg1];
		if (this.field1024 != null) {
			Js5NetThread.method190(this.field1024, arg1, arg3);
			this.field1040[arg1] = true;
		}
		if (arg0) {
			super.field542[arg1] = ByteArrayWrapper.wrap(arg3);
		}
	}

	@ObfuscatedName("ga.b(BI)V")
	@Override
	public void method205(int arg0) {
		Js5Net.method226(this.field1018, arg0);
	}

	@ObfuscatedName("ga.c(III)V")
	public void requestIndex(int arg0, int arg1) {
		this.field1021 = arg0;
		this.field1023 = arg1;
		if (this.field1028 == null) {
			Js5Net.queueRequest(true, (byte) 0, this.field1018, 255, this, this.field1023);
		} else {
			Js5NetThread.queueRequest(this.field1018, this, this.field1028);
		}
	}

	@ObfuscatedName("ga.e(I)I")
	public int getIndexPercentage() {
		if (this.field1017) {
			return 100;
		} else if (super.field542 == null) {
			int var1 = Js5NetThread.method478(this.field1018, 255);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("ga.c(BI)I")
	public int method339(int arg0) {
		if (super.field542[arg0] == null) {
			return this.field1040[arg0] ? 100 : Js5NetThread.method478(arg0, this.field1018);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ga.a(ZZ[BILtb;)V")
	public void method340(boolean arg0, byte[] arg1, int arg2, DataFile arg3) {
		if (this.field1028 != arg3) {
			if (!arg0 && arg2 == this.field1019) {
				this.field1017 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.field1040[arg2] = false;
				if (this.field1027 || arg0) {
					Js5Net.queueRequest(arg0, (byte) 2, arg2, this.field1018, this, super.field564[arg2]);
				}
			} else {
				field3120.reset();
				field3120.update(arg1, 0, arg1.length - 2);
				int var5 = (int) field3120.getValue();
				int var6 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
				if (super.field564[arg2] == var5 && super.field545[arg2] == var6) {
					this.field1040[arg2] = true;
					if (arg0) {
						super.field542[arg2] = ByteArrayWrapper.wrap(arg1);
					}
				} else {
					this.field1040[arg2] = false;
					if (this.field1027 || arg0) {
						Js5Net.queueRequest(arg0, (byte) 2, arg2, this.field1018, this, super.field564[arg2]);
					}
				}
			}
		} else if (this.field1017) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Js5Net.queueRequest(true, (byte) 0, this.field1018, 255, this, this.field1023);
		} else {
			field3120.reset();
			field3120.update(arg1, 0, arg1.length);
			int var7 = (int) field3120.getValue();
			Packet var8 = new Packet(Js5.method754(arg1));
			int var9 = var8.g1();
			if (var9 != 5 && var9 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + var9);
			}
			int var10 = 0;
			if (var9 >= 6) {
				var10 = var8.g4();
			}
			if (this.field1023 == var7 && var10 == this.field1021) {
				this.method209(arg1);
				this.method341();
			} else {
				Js5Net.queueRequest(true, (byte) 0, this.field1018, 255, this, this.field1023);
			}
		}
	}

	@ObfuscatedName("ga.f(I)V")
	public void method341() {
		this.field1040 = new boolean[super.field542.length];
		for (int var1 = 0; var1 < this.field1040.length; var1++) {
			this.field1040[var1] = false;
		}
		if (this.field1024 == null) {
			this.field1017 = true;
			return;
		}
		this.field1019 = -1;
		for (int var2 = 0; var2 < this.field1040.length; var2++) {
			if (super.field548[var2] > 0) {
				Js5NetThread.method1002(var2, this.field1024, this);
				this.field1019 = var2;
			}
		}
		if (this.field1019 == -1) {
			this.field1017 = true;
		}
	}

	@ObfuscatedName("ga.a(II)V")
	@Override
	public void method199(int arg0) {
		if (this.field1024 == null || this.field1040 == null || !this.field1040[arg0]) {
			Js5Net.queueRequest(true, (byte) 2, arg0, this.field1018, this, super.field564[arg0]);
		} else {
			Js5NetThread.queueRequest(arg0, this, this.field1024);
		}
	}

	@ObfuscatedName("ga.g(I)I")
	public int method343() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < super.field542.length; var3++) {
			if (super.field548[var3] > 0) {
				var1 += this.method339(var3);
				var2 += 100;
			}
		}
		if (var2 == 0) {
			return 100;
		} else {
			return var1 * 100 / var2;
		}
	}
}
