package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("uc")
public abstract class MidiPlayer extends MidiStream {

	@ObfuscatedName("uc.a(IIJI)V")
	public final void method996(int arg0, int arg1, long arg2) {
		int var5 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
		if (Statics.field2180 == var5) {
			return;
		}
		Statics.field2180 = var5;
		for (int var6 = 0; var6 < 16; var6++) {
			int var7 = method1002(var6);
			this.method306(var6 + 176, 7, var7 >> 7, arg2);
			this.method306(var6 + 176, 39, var7 & 0x7F, arg2);
		}
	}

	@ObfuscatedName("uc.a(IJI)V")
	public final void method997(long arg0, int arg1) {
		Statics.field2180 = arg1;
		for (int var4 = 0; var4 < 16; var4++) {
			Statics.field1753[var4] = 12800;
		}
		for (int var5 = 0; var5 < 16; var5++) {
			int var6 = method1002(var5);
			this.method306(var5 + 176, 7, var6 >> 7, arg0);
			this.method306(var5 + 176, 39, var6 & 0x7F, arg0);
		}
	}

	@ObfuscatedName("uc.a(BJ)V")
	public final void method1000(long arg0) {
		for (int var3 = 0; var3 < 128; var3++) {
			int var4 = Statics.field1937[var3];
			Statics.field1937[var3] = 0;
			for (int var5 = 0; var5 < 16; var5++) {
				if ((var4 & 0x1 << var5) != 0) {
					this.method306(var5 + 144, var3, 0, arg0);
				}
			}
		}
		for (int var6 = 0; var6 < 16; var6++) {
			this.method306(var6 + 176, 123, 0, arg0);
		}
		for (int var7 = 0; var7 < 16; var7++) {
			this.method306(var7 + 176, 120, 0, arg0);
		}
		for (int var8 = 0; var8 < 16; var8++) {
			this.method306(var8 + 176, 121, 0, arg0);
		}
		for (int var9 = 0; var9 < 16; var9++) {
			this.method306(var9 + 176, 0, 0, arg0);
		}
		for (int var10 = 0; var10 < 16; var10++) {
			this.method306(var10 + 176, 32, 0, arg0);
		}
		for (int var11 = 0; var11 < 16; var11++) {
			this.method306(var11 + 192, 0, 0, arg0);
		}
	}

	@ObfuscatedName("uc.b(IIIJ)Z")
	public final boolean method1001(int arg0, int arg1, int arg2, long arg3) {
		if ((arg0 & 0xE0) == 128) {
			int var6 = 0x1 << (arg0 & 0xF);
			int var7 = Statics.field1937[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Statics.field1937[arg1] = var7 & ~var6;
			} else if ((var7 & var6) == 0) {
				Statics.field1937[arg1] = var7 | var6;
			} else {
				this.method306(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method306(arg0, arg1, arg2, arg3);
				int var8 = arg0 & 0xF;
				Statics.field1753[var8] = 12800;
				int var9 = method1002(var8);
				this.method306(arg0, 7, var9 >> 7, arg3);
				this.method306(arg0, 39, var9 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				int var10 = arg0 & 0xF;
				if (arg1 == 7) {
					Statics.field1753[var10] = (arg2 << 7) + (Statics.field1753[var10] & 0x7F);
				} else {
					Statics.field1753[var10] = (Statics.field1753[var10] & 0x3F80) + arg2;
				}
				int var11 = method1002(var10);
				this.method306(arg0, 7, var11 >> 7, arg3);
				this.method306(arg0, 39, var11 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("uc.g(I)I")
	public static int method1002(int arg0) {
		int var1 = Statics.field1753[arg0];
		int var2 = (Statics.field2180 * var1 >> 8) * var1;
		return (int) (Math.sqrt((double) var2) + 0.5D);
	}

	@ObfuscatedName("uc.a(IIIJ)V")
	public abstract void method306(int arg0, int arg1, int arg2, long arg3);
}
