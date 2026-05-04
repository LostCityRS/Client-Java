package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.DataFile;
import jagex3.io.Packet;

@ObfuscatedName("bj")
public final class Js5Loader extends Js5 {

	@ObfuscatedName("bj.cb")
	public volatile boolean[] field330;

	@ObfuscatedName("bj.fb")
	public final DataFile field333;

	@ObfuscatedName("bj.gb")
	public final int field334;

	@ObfuscatedName("bj.mb")
	public final DataFile field340;

	@ObfuscatedName("bj.ob")
	public boolean field342 = false;

	@ObfuscatedName("bj.tb")
	public int field347;

	@ObfuscatedName("bj.ub")
	public volatile boolean field348 = false;

	@ObfuscatedName("bj.vb")
	public int field349;

	@ObfuscatedName("bj.yb")
	public int field352 = -1;

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.field340 = arg1;
		this.field342 = arg5;
		this.field334 = arg2;
		this.field333 = arg0;
		Js5Net.method814(this.field334, this);
	}

	@ObfuscatedName("bj.a(I[BZIZ)V")
	public void method105(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
		if (arg3) {
			if (this.field348) {
				throw new RuntimeException();
			}
			if (this.field340 != null) {
				Js5NetThread.method244(arg1, this.field334, this.field340);
			}
			this.method967(arg1);
			this.method113();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.field2668[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.field2668[arg0];
		if (this.field333 != null) {
			Js5NetThread.method244(arg1, arg0, this.field333);
			this.field330[arg0] = true;
		}
		if (arg2) {
			super.field2706[arg0] = ByteArrayWrapper.method1153(arg1);
			return;
		}
	}

	@ObfuscatedName("bj.c(III)V")
	public void method109(int arg0, int arg1) {
		this.field349 = arg0;
		this.field347 = arg1;
		if (this.field340 == null) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
		} else {
			Js5NetThread.method540(this, this.field334, this.field340);
		}
	}

	@ObfuscatedName("bj.a(II)V")
	@Override
	public void method110(int arg0) {
		if (this.method968(arg0)) {
			Js5Net.method426(this.field334, arg0);
		}
	}

	@ObfuscatedName("bj.a([BILud;BZ)V")
	public void method111(byte[] arg0, int arg1, DataFile arg2, boolean arg3) {
		if (arg2 != this.field340) {
			if (!arg3 && arg1 == this.field352) {
				this.field348 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.field330[arg1] = false;
				if (this.field342 || arg3) {
					Js5Net.method1312(this, arg1, this.field334, (byte) 2, super.field2690[arg1], arg3);
				}
				return;
			}
			Statics.field4241.reset();
			Statics.field4241.update(arg0, 0, arg0.length - 2);
			int var5 = (int) Statics.field4241.getValue();
			int var6 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (var5 != super.field2690[arg1] || super.field2668[arg1] != var6) {
				this.field330[arg1] = false;
				if (this.field342 || arg3) {
					Js5Net.method1312(this, arg1, this.field334, (byte) 2, super.field2690[arg1], arg3);
				}
				return;
			}
			this.field330[arg1] = true;
			if (arg3) {
				super.field2706[arg1] = ByteArrayWrapper.method1153(arg0);
				return;
			}
			return;
		}
		if (this.field348) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		Statics.field4241.reset();
		Statics.field4241.update(arg0, 0, arg0.length);
		int var7 = (int) Statics.field4241.getValue();
		if (var7 != this.field349) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		Packet var8;
		try {
			var8 = new Packet(Js5.method119(arg0));
		} catch (RuntimeException var11) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		int var9 = var8.g1();
		if (var9 != 5 && var9 != 6) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		int var10 = 0;
		if (var9 >= 6) {
			var10 = var8.g4();
		}
		if (this.field347 != var10) {
			Js5Net.method1312(this, this.field334, 255, (byte) 0, this.field349, true);
			return;
		}
		this.method967(arg0);
		this.method113();
	}

	@ObfuscatedName("bj.a(IZ)V")
	@Override
	public void method112(int arg0) {
		if (!this.method968(arg0)) {
			return;
		}
		if (this.field333 == null || this.field330 == null || !this.field330[arg0]) {
			Js5Net.method1312(this, arg0, this.field334, (byte) 2, super.field2690[arg0], true);
		} else {
			Js5NetThread.method540(this, arg0, this.field333);
		}
	}

	@ObfuscatedName("bj.c(I)V")
	public void method113() {
		this.field330 = new boolean[super.field2706.length];
		for (int var1 = 0; var1 < this.field330.length; var1++) {
			this.field330[var1] = false;
		}
		if (this.field333 == null) {
			this.field348 = true;
			return;
		}
		this.field352 = -1;
		for (int var2 = 0; var2 < this.field330.length; var2++) {
			if (super.field2683[var2] > 0) {
				Js5NetThread.method828(var2, this, this.field333);
				this.field352 = var2;
			}
		}
		if (this.field352 == -1) {
			this.field348 = true;
		}
	}

	@ObfuscatedName("bj.d(Z)I")
	public int getIndexPercentage() {
		if (this.field348) {
			return 100;
		} else if (super.field2706 == null) {
			int var1 = Js5Net.method1523(255, this.field334);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("bj.a(BI)I")
	@Override
	public int method116(int arg0) {
		if (!this.method968(arg0)) {
			return 0;
		} else if (super.field2706[arg0] == null) {
			return this.field330[arg0] ? 100 : Js5Net.method1523(this.field334, arg0);
		} else {
			return 100;
		}
	}
}
