package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.DataFile;

import java.util.zip.CRC32;

@ObfuscatedName("u")
public final class Js5Loader extends Js5 {

    @ObfuscatedName("w.b")
    public static CRC32 field3198 = new CRC32();
    @ObfuscatedName("u.fb")
	public volatile boolean[] field2975;

	@ObfuscatedName("u.gb")
	public int field2976 = -1;

	@ObfuscatedName("u.jb")
	public volatile boolean field2979 = false;

	@ObfuscatedName("u.lb")
	public final DataFile field2981;

	@ObfuscatedName("u.qb")
	public final int field2986;

	@ObfuscatedName("u.tb")
	public int field2989;

	@ObfuscatedName("u.ub")
	public boolean field2990 = false;

	@ObfuscatedName("u.vb")
	public final DataFile field2991;

	@ObfuscatedName("u.a(ZZIZ[B)V")
	public void method976(boolean arg0, int arg1, boolean arg2, byte[] arg3) {
		if (!arg0) {
			arg3[arg3.length - 2] = (byte) (super.field374[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.field374[arg1];
			if (this.field2991 != null) {
				Js5NetThread.method464(arg3, this.field2991, arg1);
				this.field2975[arg1] = true;
			}
			if (arg2) {
				super.field362[arg1] = arg3;
			}
		} else if (this.field2979) {
			throw new RuntimeException();
		} else {
			if (this.field2981 != null) {
				Js5NetThread.method464(arg3, this.field2981, this.field2986);
			}
			this.method223(arg3);
			this.method979();
		}
	}

	@ObfuscatedName("u.d(I)I")
	public int method977() {
		if (this.field2979) {
			return 100;
		} else if (super.field362 == null) {
			int var1 = Js5Net.method684(255, this.field2986);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("u.a(BZ[BILsa;)V")
	public void method978(boolean arg0, byte[] arg1, int arg2, DataFile arg3) {
		if (this.field2981 == arg3) {
			if (this.field2979) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Js5Net.method495(true, this, 255, this.field2986, (byte) 0, this.field2989);
				return;
			}
			field3198.reset();
			field3198.update(arg1, 0, arg1.length);
			int var5 = (int) field3198.getValue();
			if (this.field2989 != var5) {
				Js5Net.method495(true, this, 255, this.field2986, (byte) 0, this.field2989);
				return;
			}
			this.method223(arg1);
			this.method979();
			return;
		}
		if (!arg0 && this.field2976 == arg2) {
			this.field2979 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.field2975[arg2] = false;
			if (this.field2990 || arg0) {
				Js5Net.method495(arg0, this, this.field2986, arg2, (byte) 2, super.field402[arg2]);
			}
			return;
		}
		field3198.reset();
		field3198.update(arg1, 0, arg1.length - 2);
		int var6 = (int) field3198.getValue();
		int var7 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
		if (super.field402[arg2] != var6 || super.field374[arg2] != var7) {
			this.field2975[arg2] = false;
			if (this.field2990 || arg0) {
				Js5Net.method495(arg0, this, this.field2986, arg2, (byte) 2, super.field402[arg2]);
			}
			return;
		}
		this.field2975[arg2] = true;
		if (arg0) {
			super.field362[arg2] = arg1;
		}
	}

	@ObfuscatedName("u.b(II)V")
	@Override
	public void method222(int arg0) {
		if (this.field2991 == null || this.field2975 == null || !this.field2975[arg0]) {
			Js5Net.method495(true, this, this.field2986, arg0, (byte) 2, super.field402[arg0]);
		} else {
			Js5NetThread.method507(this, arg0, this.field2991);
		}
	}

	@ObfuscatedName("u.a(IB)V")
	@Override
	public void method219(int arg0) {
		Statics.method661(this.field2986, arg0);
	}

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.field2991 = arg0;
		this.field2990 = arg5;
		this.field2981 = arg1;
		this.field2986 = arg2;
		Js5Net.method280(this, this.field2986);
	}

	@ObfuscatedName("u.e(I)V")
	public void method979() {
		this.field2975 = new boolean[super.field362.length];
		for (int var1 = 0; var1 < this.field2975.length; var1++) {
			this.field2975[var1] = false;
		}
		if (this.field2991 == null) {
			this.field2979 = true;
			return;
		}
		this.field2976 = -1;
		for (int var2 = 0; var2 < this.field2975.length; var2++) {
			if (super.field411[var2] > 0) {
				Js5NetThread.method410(var2, this, this.field2991);
				this.field2976 = var2;
			}
		}
		if (this.field2976 == -1) {
			this.field2979 = true;
		}
	}

	@ObfuscatedName("u.d(II)V")
	public void method980(int arg0) {
		this.field2989 = arg0;
		if (this.field2981 == null) {
			Js5Net.method495(true, this, 255, this.field2986, (byte) 0, this.field2989);
		} else {
			Js5NetThread.method507(this, this.field2986, this.field2981);
		}
	}

	@ObfuscatedName("u.e(II)I")
	public int method981(int arg0) {
		if (super.field362[arg0] == null) {
			return this.field2975[arg0] ? 100 : Js5Net.method684(this.field2986, arg0);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("u.c(Z)I")
	public int method982() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < super.field362.length; var3++) {
			if (super.field411[var3] > 0) {
				var1 += 100;
				var2 += this.method981(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}
}
