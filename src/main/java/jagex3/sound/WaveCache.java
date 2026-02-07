package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.js5.Js5;

@ObfuscatedName("jf")
public final class WaveCache {

	@ObfuscatedName("jf.q")
	public final Js5 field1606;

	@ObfuscatedName("jf.u")
	public final HashTable field1610 = new HashTable(256);

	@ObfuscatedName("jf.w")
	public final Js5 field1612;

	@ObfuscatedName("jf.x")
	public final HashTable field1613 = new HashTable(256);

	public WaveCache(Js5 arg0, Js5 arg1) {
		this.field1606 = arg1;
		this.field1612 = arg0;
	}

	@ObfuscatedName("jf.a(II[II)Lib;")
	public Wave method564(int arg0, int[] arg1, int arg2) {
		int var4 = ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12) ^ arg0;
		int var5 = var4 | arg2 << 16;
		long var6 = (long) var5;
		Wave var8 = (Wave) this.field1613.find(var6);
		if (var8 != null) {
			return var8;
		} else if (arg1 == null || arg1[0] > 0) {
			JagFX var9 = JagFX.method972(this.field1612, arg2, arg0);
			if (var9 == null) {
				return null;
			}
			Wave var10 = var9.method971();
			this.field1613.put(var6, var10);
			if (arg1 != null) {
				arg1[0] -= var10.field1343.length;
			}
			return var10;
		} else {
			return null;
		}
	}

	@ObfuscatedName("jf.a(IB[I)Lib;")
	public Wave method566(int arg0, int[] arg1) {
		if (this.field1612.method204() == 1) {
			return this.method564(arg0, arg1, 0);
		} else if (this.field1612.method200(arg0) == 1) {
			return this.method564(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jf.a([IBI)Lib;")
	public Wave method567(int[] arg0, int arg1) {
		if (this.field1606.method204() == 1) {
			return this.method570(arg1, 0, arg0);
		} else if (this.field1606.method200(arg1) == 1) {
			return this.method570(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jf.a(IIB[I)Lib;")
	public Wave method570(int arg0, int arg1, int[] arg2) {
		int var4 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFF);
		int var5 = var4 | arg1 << 16;
		long var6 = (long) var5 ^ 0x100000000L;
		Wave var8 = (Wave) this.field1613.find(var6);
		if (var8 != null) {
			return var8;
		} else if (arg2 == null || arg2[0] > 0) {
			JagVorbis var9 = (JagVorbis) this.field1610.find(var6);
			if (var9 == null) {
				var9 = JagVorbis.method736(this.field1606, arg1, arg0);
				if (var9 == null) {
					return null;
				}
				this.field1610.put(var6, var9);
			}
			Wave var10 = var9.method732(arg2);
			if (var10 == null) {
				return null;
			} else {
				var9.unlink();
				this.field1613.put(var6, var10);
				return var10;
			}
		} else {
			return null;
		}
	}
}
