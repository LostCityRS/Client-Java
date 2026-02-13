package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("rb")
public final class MidiParser {

	@ObfuscatedName("rb.a")
	public static byte[] field2854 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("rb.b")
	public final Packet packet = new Packet(null);

	@ObfuscatedName("rb.c")
	public long field2856;

	@ObfuscatedName("rb.d")
	public int[] field2857;

	@ObfuscatedName("rb.e")
	public int field2858;

	@ObfuscatedName("rb.f")
	public int[] field2859;

	@ObfuscatedName("rb.g")
	public int[] field2860;

	@ObfuscatedName("rb.h")
	public int field2861;

	@ObfuscatedName("rb.i")
	public int[] field2862;

	public MidiParser() {
	}

	public MidiParser(byte[] arg0) {
		this.method952(arg0);
	}

	@ObfuscatedName("rb.a(I)I")
	public int method939(int arg0) {
		byte var2 = this.packet.data[this.packet.pos];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field2857[arg0] = var3;
			this.packet.pos++;
		} else {
			var3 = this.field2857[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method941(arg0, var3);
		}
		int var4 = this.packet.gMidiVarLen();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.packet.data[this.packet.pos] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.packet.pos++;
				this.field2857[arg0] = var5;
				return this.method941(arg0, var5);
			}
		}
		this.packet.pos += var4;
		return 0;
	}

	@ObfuscatedName("rb.b(I)V")
	public void method940(int arg0) {
		this.field2859[arg0] = this.packet.pos;
	}

	@ObfuscatedName("rb.a(II)I")
	public int method941(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field2854[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.packet.g1() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.packet.g1() << 16;
			}
			return var8;
		}
		int var3 = this.packet.g1();
		int var4 = this.packet.gMidiVarLen();
		if (var3 == 47) {
			this.packet.pos += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.packet.g3();
			var4 -= 3;
			int var6 = this.field2862[arg0];
			this.field2856 += (long) var6 * (long) (this.field2858 - var5);
			this.field2858 = var5;
			this.packet.pos += var4;
			return 2;
		} else {
			this.packet.pos += var4;
			return 3;
		}
	}

	@ObfuscatedName("rb.a()Z")
	public boolean method942() {
		return this.packet.data != null;
	}

	@ObfuscatedName("rb.c()V")
	public void method944() {
		this.packet.data = null;
		this.field2860 = null;
		this.field2859 = null;
		this.field2862 = null;
		this.field2857 = null;
	}

	@ObfuscatedName("rb.d()Z")
	public boolean method945() {
		int var1 = this.field2859.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field2859[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("rb.e()I")
	public int method946() {
		return this.field2859.length;
	}

	@ObfuscatedName("rb.c(I)J")
	public long method947(int arg0) {
		return this.field2856 + (long) arg0 * (long) this.field2858;
	}

	@ObfuscatedName("rb.f()V")
	public void method948() {
		this.packet.pos = -1;
	}

	@ObfuscatedName("rb.g()I")
	public int method949() {
		int var1 = this.field2859.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field2859[var4] >= 0 && this.field2862[var4] < var3) {
				var2 = var4;
				var3 = this.field2862[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("rb.a(J)V")
	public void method950(long arg0) {
		this.field2856 = arg0;
		int var3 = this.field2859.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field2862[var4] = 0;
			this.field2857[var4] = 0;
			this.packet.pos = this.field2860[var4];
			this.method951(var4);
			this.field2859[var4] = this.packet.pos;
		}
	}

	@ObfuscatedName("rb.d(I)V")
	public void method951(int arg0) {
		int var2 = this.packet.gMidiVarLen();
		this.field2862[arg0] += var2;
	}

	@ObfuscatedName("rb.a([B)V")
	public void method952(byte[] arg0) {
		this.packet.data = arg0;
		this.packet.pos = 10;
		int var2 = this.packet.g2();
		this.field2861 = this.packet.g2();
		this.field2858 = 500000;
		this.field2860 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.packet.g4();
			int var5 = this.packet.g4();
			if (var4 == 1297379947) {
				this.field2860[var3] = this.packet.pos;
				var3++;
			}
			this.packet.pos += var5;
		}
		this.field2856 = 0L;
		this.field2859 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field2859[var6] = this.field2860[var6];
		}
		this.field2862 = new int[var2];
		this.field2857 = new int[var2];
	}

	@ObfuscatedName("rb.e(I)V")
	public void method953(int arg0) {
		this.packet.pos = this.field2859[arg0];
	}

	@ObfuscatedName("rb.f(I)I")
	public int method954(int arg0) {
		return this.method939(arg0);
	}
}
