package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("xb")
public class Isaac {

	@ObfuscatedName("xb.a")
	public int count;

	@ObfuscatedName("xb.b")
	public int[] rsl = new int[256];

	@ObfuscatedName("xb.c")
	public int[] mem = new int[256];

	@ObfuscatedName("xb.d")
	public int a;

	@ObfuscatedName("xb.e")
	public int b;

	@ObfuscatedName("xb.f")
	public int c;

	public Isaac(int[] seed) {
		for (int i = 0; i < seed.length; i++) {
			this.rsl[i] = seed[i];
		}

		this.init();
	}

	@ObfuscatedName("xb.a()I")
	public int nextInt() {
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}

		return this.rsl[this.count];
	}

	@ObfuscatedName("xb.b()V")
	public void isaac() {
		this.b += ++this.c;

		for (int i = 0; i < 256; i++) {
			int x = this.mem[i];

			switch(i & 0x3) {
				case 0:
					this.a ^= this.a << 13;
					break;
				case 1:
					this.a ^= this.a >>> 6;
					break;
				case 2:
					this.a ^= this.a << 2;
					break;
				case 3:
					this.a ^= this.a >>> 16;
			}

			this.a += this.mem[i + 128 & 0xFF];
			int y;
			this.mem[i] = y = this.mem[x >> 2 & 0xFF] + this.a + this.b;
			this.rsl[i] = this.b = this.mem[y >> 8 >> 2 & 0xFF] + x;
		}
	}

	@ObfuscatedName("xb.c()V")
	public void init() {
		int h = -1640531527;
		int g = -1640531527;
		int f = -1640531527;
		int e = -1640531527;
		int d = -1640531527;
		int c = -1640531527;
		int b = -1640531527;
		int a = -1640531527;

		for (int i = 0; i < 4; i++) {
			a ^= b << 11; d += a; b += c;
			b ^= c >>> 2; e += b; c += d;
			c ^= d << 8; f += c; d += e;
			d ^= e >>> 16; g += d; e += f;
			e ^= f << 10; h += e; f += g;
			f ^= g >>> 4; a += f; g += h;
			g ^= h << 8; b += g; h += a;
			h ^= a >>> 9; c += h; a += b;
		}

		for (int i = 0; i < 256; i += 8) {
			a += this.rsl[i];
			b += this.rsl[i + 1];
			c += this.rsl[i + 2];
			d += this.rsl[i + 3];
			e += this.rsl[i + 4];
			f += this.rsl[i + 5];
			g += this.rsl[i + 6];
			h += this.rsl[i + 7];

			a ^= b << 11; d += a; b += c;
			b ^= c >>> 2; e += b; c += d;
			c ^= d << 8; f += c; d += e;
			d ^= e >>> 16; g += d; e += f;
			e ^= f << 10; h += e; f += g;
			f ^= g >>> 4; a += f; g += h;
			g ^= h << 8; b += g; h += a;
			h ^= a >>> 9; c += h; a += b;

			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}

		for (int i = 0; i < 256; i += 8) {
			a += this.mem[i];
			b += this.mem[i + 1];
			c += this.mem[i + 2];
			d += this.mem[i + 3];
			e += this.mem[i + 4];
			f += this.mem[i + 5];
			g += this.mem[i + 6];
			h += this.mem[i + 7];

			a ^= b << 11; d += a; b += c;
			b ^= c >>> 2; e += b; c += d;
			c ^= d << 8; f += c; d += e;
			d ^= e >>> 16; g += d; e += f;
			e ^= f << 10; h += e; f += g;
			f ^= g >>> 4; a += f; g += h;
			g ^= h << 8; b += g; h += a;
			h ^= a >>> 9; c += h; a += b;

			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}

		this.isaac();
		this.count = 256;
	}
}
