package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ea")
public final class MidiParser {

	@ObfuscatedName("ea.a")
	public final Packet field752 = new Packet(null);

	@ObfuscatedName("ea.b")
	public long field753;

	@ObfuscatedName("ea.c")
	public int[] field754;

	@ObfuscatedName("ea.d")
	public int[] field755;

	@ObfuscatedName("ea.e")
	public int[] field756;

	@ObfuscatedName("ea.f")
	public int[] field757;

	@ObfuscatedName("ea.g")
	public static byte[] field758 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	@ObfuscatedName("ea.h")
	public int field759;

	@ObfuscatedName("ea.i")
	public int field760;

	@ObfuscatedName("ea.h()V")
	public static void method351() {
		field758 = null;
	}

	@ObfuscatedName("ea.a()I")
	public int method335() {
		int var1 = this.field754.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field754[var4] >= 0 && this.field756[var4] < var3) {
				var2 = var4;
				var3 = this.field756[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("ea.a(I)J")
	public long method336(int arg0) {
		return (long) this.field759 * (long) arg0 + this.field753;
	}

	@ObfuscatedName("ea.b(I)I")
	public int method337(int arg0) {
		return this.method346(arg0);
	}

	@ObfuscatedName("ea.b()I")
	public int method338() {
		return this.field754.length;
	}

	@ObfuscatedName("ea.c(I)V")
	public void method339(int arg0) {
		int var2 = this.field752.method176();
		this.field756[arg0] += var2;
	}

	@ObfuscatedName("ea.c()V")
	public void method340() {
		this.field752.data = null;
		this.field755 = null;
		this.field754 = null;
		this.field756 = null;
		this.field757 = null;
	}

	@ObfuscatedName("ea.a([B)V")
	public void method341(byte[] arg0) {
		this.field752.data = arg0;
		this.field752.pos = 10;
		int var2 = this.field752.g2();
		this.field760 = this.field752.g2();
		this.field759 = 500000;
		this.field755 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.field752.method167();
			int var5 = this.field752.method167();
			if (var4 == 1297379947) {
				this.field755[var3] = this.field752.pos;
				var3++;
			}
			this.field752.pos += var5;
		}
		this.field754 = (int[]) this.field755.clone();
		this.field756 = new int[var2];
		this.field757 = new int[var2];
	}

	@ObfuscatedName("ea.d()Z")
	public boolean method342() {
		return this.field752.data != null;
	}

	@ObfuscatedName("ea.e()Z")
	public boolean method343() {
		return this.field752.pos < 0;
	}

	@ObfuscatedName("ea.a(J)V")
	public void method344(long arg0) {
		this.field753 = arg0;
		int var3 = this.field754.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field756[var4] = 0;
			this.field757[var4] = 0;
			this.field752.pos = this.field755[var4];
			this.method339(var4);
			this.field754[var4] = this.field752.pos;
		}
	}

	@ObfuscatedName("ea.d(I)V")
	public void method345(int arg0) {
		this.field754[arg0] = this.field752.pos;
	}

	@ObfuscatedName("ea.e(I)I")
	public int method346(int arg0) {
		byte var2 = this.field752.data[this.field752.pos];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field757[arg0] = var3;
			this.field752.pos++;
		} else {
			var3 = this.field757[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method347(arg0, var3);
		}
		int var4 = this.field752.method176();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.field752.data[this.field752.pos] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.field752.pos++;
				this.field757[arg0] = var5;
				return this.method347(arg0, var5);
			}
		}
		this.field752.pos += var4;
		return 0;
	}

	@ObfuscatedName("ea.a(II)I")
	public int method347(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field758[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.field752.g1() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.field752.g1() << 16;
			}
			return var8;
		}
		int var3 = this.field752.g1();
		int var4 = this.field752.method176();
		if (var3 == 47) {
			this.field752.pos += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.field752.g3();
			var4 -= 3;
			int var6 = this.field756[arg0];
			this.field753 += (long) (this.field759 - var5) * (long) var6;
			this.field759 = var5;
			this.field752.pos += var4;
			return 2;
		} else {
			this.field752.pos += var4;
			return 3;
		}
	}

	@ObfuscatedName("ea.f()Z")
	public boolean method348() {
		int var1 = this.field754.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field754[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ea.g()V")
	public void method349() {
		this.field752.pos = -1;
	}

	@ObfuscatedName("ea.f(I)V")
	public void method350(int arg0) {
		this.field752.pos = this.field754[arg0];
	}

}
