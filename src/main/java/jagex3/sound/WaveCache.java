package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.js5.Js5;

@ObfuscatedName("nj")
public final class WaveCache {

	@ObfuscatedName("nj.g")
	public final HashTable field2928 = new HashTable(256);

	@ObfuscatedName("nj.h")
	public final Js5 field2929;

	@ObfuscatedName("nj.o")
	public final Js5 field2936;

	@ObfuscatedName("nj.p")
	public final HashTable field2937 = new HashTable(256);

	public WaveCache(Js5 arg0, Js5 arg1) {
		this.field2936 = arg1;
		this.field2929 = arg0;
	}

	@ObfuscatedName("nj.a(II[I)Ltf;")
	public Wave method1032(int arg0, int[] arg1) {
		if (this.field2929.method940() == 1) {
			return this.method1034(arg0, arg1, 0);
		} else if (this.field2929.getFileIdLimit(arg0) == 1) {
			return this.method1034(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nj.a([IIII)Ltf;")
	public Wave method1033(int[] arg0, int arg1, int arg2) {
		int var4 = arg2 ^ ((arg1 & 0xD0000FFF) << 4 | arg1 >>> 12);
		int var5 = var4 | arg1 << 16;
		long var6 = (long) var5 ^ 0x100000000L;
		Wave var8 = (Wave) this.field2937.method1049(var6);
		if (var8 != null) {
			return var8;
		} else if (arg0 == null || arg0[0] > 0) {
			JagVorbis var9 = (JagVorbis) this.field2928.method1049(var6);
			if (var9 == null) {
				var9 = JagVorbis.method1354(this.field2936, arg1, arg2);
				if (var9 == null) {
					return null;
				}
				this.field2928.put(var6, var9);
			}
			Wave var10 = var9.method1355(arg0);
			if (var10 == null) {
				return null;
			} else {
				var9.unlink();
				this.field2937.put(var6, var10);
				return var10;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("nj.a(II[II)Ltf;")
	public Wave method1034(int arg0, int[] arg1, int arg2) {
		int var4 = (arg2 << 4 & 0xFFF4 | arg2 >>> 12) ^ arg0;
		int var5 = var4 | arg2 << 16;
		long var6 = (long) var5;
		Wave var8 = (Wave) this.field2937.method1049(var6);
		if (var8 != null) {
			return var8;
		} else if (arg1 == null || arg1[0] > 0) {
			JagFX var9 = JagFX.method252(this.field2929, arg2, arg0);
			if (var9 == null) {
				return null;
			}
			Wave var10 = var9.method253();
			this.field2937.put(var6, var10);
			if (arg1 != null) {
				arg1[0] -= var10.field4031.length;
			}
			return var10;
		} else {
			return null;
		}
	}

	@ObfuscatedName("nj.a([III)Ltf;")
	public Wave method1035(int[] arg0, int arg1) {
		if (this.field2936.method940() == 1) {
			return this.method1033(arg0, 0, arg1);
		} else if (this.field2936.getFileIdLimit(arg1) == 1) {
			return this.method1033(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
