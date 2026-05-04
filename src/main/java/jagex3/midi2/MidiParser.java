package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("df")
public final class MidiParser {

	@ObfuscatedName("df.a")
	public static final byte[] field700 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("df.b")
	public final Packet field701 = new Packet(null);

	@ObfuscatedName("df.c")
	public int[] field702;

	@ObfuscatedName("df.d")
	public int[] field703;

	@ObfuscatedName("df.e")
	public int[] field704;

	@ObfuscatedName("df.f")
	public int field705;

	@ObfuscatedName("df.g")
	public int field706;

	@ObfuscatedName("df.h")
	public long field707;

	@ObfuscatedName("df.i")
	public int[] field708;

	public MidiParser() {
	}

	public MidiParser(byte[] arg0) {
		this.method270(arg0);
	}

	@ObfuscatedName("df.a(I)V")
	public void method259(int arg0) {
		this.field708[arg0] = this.field701.pos;
	}

	@ObfuscatedName("df.a()Z")
	public boolean method260() {
		int var1 = this.field708.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field708[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("df.b(I)V")
	public void method261(int arg0) {
		this.field701.pos = this.field708[arg0];
	}

	@ObfuscatedName("df.c(I)J")
	public long method262(int arg0) {
		return this.field707 + (long) arg0 * (long) this.field705;
	}

	@ObfuscatedName("df.b()Z")
	public boolean method263() {
		return this.field701.data != null;
	}

	@ObfuscatedName("df.a(J)V")
	public void method264(long arg0) {
		this.field707 = arg0;
		int var3 = this.field708.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field704[var4] = 0;
			this.field702[var4] = 0;
			this.field701.pos = this.field703[var4];
			this.method274(var4);
			this.field708[var4] = this.field701.pos;
		}
	}

	@ObfuscatedName("df.c()V")
	public void method265() {
		this.field701.data = null;
		this.field703 = null;
		this.field708 = null;
		this.field704 = null;
		this.field702 = null;
	}

	@ObfuscatedName("df.d()I")
	public int method266() {
		return this.field708.length;
	}

	@ObfuscatedName("df.a(II)I")
	public int method267(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field700[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.field701.g1() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.field701.g1() << 16;
			}
			return var8;
		}
		int var3 = this.field701.g1();
		int var4 = this.field701.method317();
		if (var3 == 47) {
			this.field701.pos += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.field701.g3();
			var4 -= 3;
			int var6 = this.field704[arg0];
			this.field707 += (long) var6 * (long) (this.field705 - var5);
			this.field705 = var5;
			this.field701.pos += var4;
			return 2;
		} else {
			this.field701.pos += var4;
			return 3;
		}
	}

	@ObfuscatedName("df.d(I)I")
	public int method269(int arg0) {
		byte var2 = this.field701.data[this.field701.pos];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field702[arg0] = var3;
			this.field701.pos++;
		} else {
			var3 = this.field702[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method267(arg0, var3);
		}
		int var4 = this.field701.method317();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.field701.data[this.field701.pos] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.field701.pos++;
				this.field702[arg0] = var5;
				return this.method267(arg0, var5);
			}
		}
		this.field701.pos += var4;
		return 0;
	}

	@ObfuscatedName("df.a([B)V")
	public void method270(byte[] arg0) {
		this.field701.data = arg0;
		this.field701.pos = 10;
		int var2 = this.field701.g2();
		this.field706 = this.field701.g2();
		this.field705 = 500000;
		this.field703 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.field701.g4();
			int var5 = this.field701.g4();
			if (var4 == 1297379947) {
				this.field703[var3] = this.field701.pos;
				var3++;
			}
			this.field701.pos += var5;
		}
		this.field707 = 0L;
		this.field708 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field708[var6] = this.field703[var6];
		}
		this.field704 = new int[var2];
		this.field702 = new int[var2];
	}

	@ObfuscatedName("df.e(I)I")
	public int method271(int arg0) {
		return this.method269(arg0);
	}

	@ObfuscatedName("df.f()I")
	public int method272() {
		int var1 = this.field708.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field708[var4] >= 0 && this.field704[var4] < var3) {
				var2 = var4;
				var3 = this.field704[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("df.g()V")
	public void method273() {
		this.field701.pos = -1;
	}

	@ObfuscatedName("df.f(I)V")
	public void method274(int arg0) {
		int var2 = this.field701.method317();
		this.field704[arg0] += var2;
	}
}
