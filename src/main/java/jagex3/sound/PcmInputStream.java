package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.util.ArrayUtil;

import java.io.InputStream;

@ObfuscatedName("lb")
public final class PcmInputStream extends InputStream {

	@ObfuscatedName("lb.a")
	public final int[] muLawSegmentTable = new int[]{0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

	@ObfuscatedName("lb.b")
	public boolean closed;

	@ObfuscatedName("lb.c")
	public final byte[] muLawTable = new byte[65536];

	@ObfuscatedName("lb.d")
	public final int[] sampleBuffer = new int[256];

	@Override
	public int read() {
		byte[] var1 = new byte[1];
		this.read(var1, 0, 1);
		return var1[0];
	}

	@ObfuscatedName("lb.a([B[I[BIII)V")
	public static void copyMuLawSamples(byte[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4) {
		for (int var5 = 0; var5 < arg4; var5++) {
			arg2[arg3++] = arg0[(arg1[var5] >> 8) + 32768];
		}
	}

	@ObfuscatedName("lb.a(I)B")
	public byte encodeMuLawSample(int arg0) {
		int var2 = arg0 >> 8 & 0x80;
		if (var2 != 0) {
			arg0 = -arg0;
		}
		if (arg0 > 32635) {
			arg0 = 32635;
		}
		arg0 += 132;
		int var3 = this.muLawSegmentTable[arg0 >> 7 & 0xFF];
		int var4 = arg0 >> var3 + 3 & 0xF;
		return (byte) ~(var2 | var3 << 4 | var4);
	}

	@Override
	public synchronized int read(byte[] arg0, int arg1, int arg2) {
		try {
			if (this.closed) {
				return -1;
			} else if (arg2 > 256) {
				this.read(arg0, arg1, 256);
				this.read(arg0, arg1 + 256, arg2 - 256);
				return arg2;
			} else {
				ArrayUtil.clear(this.sampleBuffer, arg2);
				for (int var4 = 0; var4 < arg2; var4++) {
					int var5 = this.sampleBuffer[var4];
					if ((var5 + 8388608 & 0xFF000000) != 0) {
						this.sampleBuffer[var4] = var5 >> 31 ^ 0x7FFFFF;
					}
				}
				copyMuLawSamples(this.muLawTable, this.sampleBuffer, arg0, arg1, arg2);
				return arg2;
			}
		} catch (Exception var7) {
			this.closed = true;
			JagException.report(null, var7);
			return -1;
		}
	}

	public PcmInputStream() {
		for (int var1 = -32768; var1 < 32768; var1++) {
			this.muLawTable[var1 + 32768] = this.encodeMuLawSample(var1);
		}
	}
}
