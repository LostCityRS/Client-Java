package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.io.ByteArrayNode;
import jagex3.js5.Js5;
import jagex3.sound.*;

@ObfuscatedName("c")
public final class MidiPlayer extends PcmStream {

	@ObfuscatedName("c.ac")
	public long field330;

	@ObfuscatedName("c.bc")
	public long field331;

	@ObfuscatedName("c.hb")
	public final MidiParser field285 = new MidiParser();

	@ObfuscatedName("c.jb")
	public final int[] field287 = new int[16];

	@ObfuscatedName("c.pb")
	public final int[] field293 = new int[16];

	@ObfuscatedName("c.rb")
	public final int[] field295 = new int[16];

	@ObfuscatedName("c.sb")
	public int field296 = 256;

	@ObfuscatedName("c.tb")
	public final int[] field297 = new int[16];

	@ObfuscatedName("c.vb")
	public final int[] field299 = new int[16];

	@ObfuscatedName("c.wb")
	public final int[] field300 = new int[16];

	@ObfuscatedName("c.L")
	public final int[] field264 = new int[16];

	@ObfuscatedName("c.D")
	public final int[] field256 = new int[16];

	@ObfuscatedName("c.R")
	public final int[] field270 = new int[16];

	@ObfuscatedName("c.Q")
	public final MidiNote[][] field269 = new MidiNote[16][128];

	@ObfuscatedName("c.xb")
	public final int[] field301 = new int[16];

	@ObfuscatedName("c.N")
	public final int[] field266 = new int[16];

	@ObfuscatedName("c.Gb")
	public final int[] field310 = new int[16];

	@ObfuscatedName("c.Ob")
	public final MidiNote[][] field318 = new MidiNote[16][128];

	@ObfuscatedName("c.Sb")
	public final int[] field322 = new int[16];

	@ObfuscatedName("c.Hb")
	public final int field311 = 1000000;

	@ObfuscatedName("c.Kb")
	public final int[] field314 = new int[16];

	@ObfuscatedName("c.Lb")
	public final int[] field315 = new int[16];

	@ObfuscatedName("c.Zb")
	public final MidiMixer field329 = new MidiMixer(this);

	@ObfuscatedName("c.Ib")
	public final HashTable patches = new HashTable(128);

	@ObfuscatedName("c.Xb")
	public int field327;

	@ObfuscatedName("c.Yb")
	public int field328;

	@ObfuscatedName("c.Wb")
	public boolean field326;

	public MidiPlayer() {
		this.method118();
	}

	@ObfuscatedName("c.a(IIB)V")
	public void method81(int arg0, int arg1) {
	}

	@ObfuscatedName("c.a(III)V")
	public void method82(int arg0, int arg1) {
		this.field293[arg1] = arg0;
	}

	@ObfuscatedName("c.a(ILla;)I")
	public int method83(MidiNote arg0) {
		int var2 = this.field315[arg0.field1818] * this.field300[arg0.field1818] + 4096 >> 13;
		EnvelopeSet var3 = arg0.field1796;
		int var4 = var2 * var2 + 16384 >> 15;
		int var5 = var4 * arg0.field1785 + 16384 >> 15;
		int var6 = this.field296 * var5 + 128 >> 8;
		if (var3.field1702 > 0) {
			var6 = (int) (Math.pow(0.5D, (double) var3.field1702 * (double) arg0.field1795 * 1.953125E-5D) * (double) var6 + 0.5D);
		}
		if (var3.field1689 != null) {
			int var7 = arg0.field1794;
			int var8 = var3.field1689[arg0.field1814 + 1];
			if (var3.field1689.length - 2 > arg0.field1814) {
				int var9 = (var3.field1689[arg0.field1814] & 0xFF) << 8;
				int var10 = (var3.field1689[arg0.field1814 + 2] & 0xFF) << 8;
				var8 += (var7 - var9) * (var3.field1689[arg0.field1814 + 3] - var8) / (var10 - var9);
			}
			var6 = var8 * var6 + 32 >> 6;
		}
		if (arg0.field1819 > 0 && var3.field1703 != null) {
			int var11 = arg0.field1819;
			int var12 = var3.field1703[arg0.field1792 + 1];
			if (arg0.field1792 < var3.field1703.length - 2) {
				int var13 = (var3.field1703[arg0.field1792] & 0xFF) << 8;
				int var14 = (var3.field1703[arg0.field1792 + 2] & 0xFF) << 8;
				var12 += (var11 - var13) * (var3.field1703[arg0.field1792 + 3] - var12) / (var14 - var13);
			}
			var6 = var6 * var12 + 32 >> 6;
		}
		return var6;
	}

	@ObfuscatedName("c.a(IZLae;)V")
	public synchronized void start(boolean arg0, MidiFile arg1) {
		this.method115();
		this.field285.method952(arg1.field111);
		this.field331 = 0L;
		this.field326 = arg0;
		int var3 = this.field285.method946();
		for (int var4 = 0; var4 < var3; var4++) {
			this.field285.method953(var4);
			this.field285.method951(var4);
			this.field285.method940(var4);
		}
		this.field327 = this.field285.method949();
		this.field328 = this.field285.field2862[this.field327];
		this.field330 = this.field285.method947(this.field328);
	}

	@ObfuscatedName("c.a(BI)V")
	public void method85(int arg0) {
		int var2 = arg0 & 0xF0;
		if (var2 == 128) {
			int var3 = arg0 & 0xF;
			int var4 = arg0 >> 8 & 0x7F;
			int var5 = arg0 >> 16 & 0x7F;
			this.method99(var4, var5, var3);
		} else if (var2 == 144) {
			int var6 = arg0 & 0xF;
			int var7 = arg0 >> 8 & 0x7F;
			int var8 = arg0 >> 16 & 0x7F;
			if (var8 <= 0) {
				this.method99(var7, 64, var6);
			} else {
				this.method94(var8, var6, var7);
			}
		} else if (var2 == 160) {
			int var9 = arg0 & 0xF;
			int var10 = arg0 >> 16 & 0x7F;
			int var11 = arg0 >> 8 & 0x7F;
			this.method95(var11, var9, var10);
		} else if (var2 == 176) {
			int var12 = arg0 >> 16 & 0x7F;
			int var13 = arg0 >> 8 & 0x7F;
			int var14 = arg0 & 0xF;
			if (var13 == 0) {
				this.field264[var14] = (var12 << 14) + (this.field264[var14] & 0xFFE03FFF);
			}
			if (var13 == 32) {
				this.field264[var14] = (var12 << 7) + (this.field264[var14] & 0xFFFFC07F);
			}
			if (var13 == 1) {
				this.field314[var14] = (var12 << 7) + (this.field314[var14] & 0xFFFFC07F);
			}
			if (var13 == 33) {
				this.field314[var14] = var12 + (this.field314[var14] & 0xFFFFFF80);
			}
			if (var13 == 5) {
				this.field295[var14] = (this.field295[var14] & 0xFFFFC07F) + (var12 << 7);
			}
			if (var13 == 37) {
				this.field295[var14] = var12 + (this.field295[var14] & 0xFFFFFF80);
			}
			if (var13 == 7) {
				this.field315[var14] = (this.field315[var14] & 0xFFFFC07F) + (var12 << 7);
			}
			if (var13 == 39) {
				this.field315[var14] = var12 + (this.field315[var14] & 0xFFFFFF80);
			}
			if (var13 == 10) {
				this.field301[var14] = (this.field301[var14] & 0xFFFFC07F) + (var12 << 7);
			}
			if (var13 == 42) {
				this.field301[var14] = var12 + (this.field301[var14] & 0xFFFFFF80);
			}
			if (var13 == 11) {
				this.field300[var14] = (var12 << 7) + (this.field300[var14] & 0xFFFFC07F);
			}
			if (var13 == 43) {
				this.field300[var14] = var12 + (this.field300[var14] & 0xFFFFFF80);
			}
			if (var13 == 64) {
				if (var12 >= 64) {
					this.field297[var14] |= 0x1;
				} else {
					this.field297[var14] &= 0xFFFFFFFE;
				}
			}
			if (var13 == 65) {
				if (var12 < 64) {
					this.method93(var14);
					this.field297[var14] &= 0xFFFFFFFD;
				} else {
					this.field297[var14] |= 0x2;
				}
			}
			if (var13 == 99) {
				this.field266[var14] = (this.field266[var14] & 0x7F) + (var12 << 7);
			}
			if (var13 == 98) {
				this.field266[var14] = var12 + (this.field266[var14] & 0x3F80);
			}
			if (var13 == 101) {
				this.field266[var14] = (var12 << 7) + ((this.field266[var14] & 0x7F) + 16384);
			}
			if (var13 == 100) {
				this.field266[var14] = (this.field266[var14] & 0x3F80) + var12 + 16384;
			}
			if (var13 == 120) {
				this.method110(var14);
			}
			if (var13 == 121) {
				this.method109(var14);
			}
			if (var13 == 123) {
				this.method100(var14);
			}
			if (var13 == 6) {
				int var15 = this.field266[var14];
				if (var15 == 16384) {
					this.field322[var14] = (var12 << 7) + (this.field322[var14] & 0xFFFFC07F);
				}
			}
			if (var13 == 38) {
				int var16 = this.field266[var14];
				if (var16 == 16384) {
					this.field322[var14] = (this.field322[var14] & 0xFFFFFF80) + var12;
				}
			}
			if (var13 == 16) {
				this.field287[var14] = (var12 << 7) + (this.field287[var14] & 0xFFFFC07F);
			}
			if (var13 == 48) {
				this.field287[var14] = (this.field287[var14] & 0xFFFFFF80) + var12;
			}
			if (var13 == 81) {
				if (var12 < 64) {
					this.method98(var14);
					this.field297[var14] &= 0xFFFFFFFB;
				} else {
					this.field297[var14] |= 0x4;
				}
			}
			if (var13 == 17) {
				this.method117((this.field299[var14] & 0xFFFFC07F) + (var12 << 7), var14);
			}
			if (var13 == 49) {
				this.method117(var12 + (this.field299[var14] & 0xFFFFFF80), var14);
			}
		} else if (var2 == 192) {
			int var17 = arg0 & 0xF;
			int var18 = arg0 >> 8 & 0x7F;
			this.method97(var17, var18 + this.field264[var17]);
		} else if (var2 == 208) {
			int var19 = arg0 & 0xF;
			int var20 = arg0 >> 8 & 0x7F;
			this.method81(var19, var20);
		} else if (var2 == 224) {
			int var21 = arg0 & 0xF;
			int var22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0072) >> 9);
			this.method82(var22, var21);
		} else {
			int var23 = arg0 & 0xFF;
			if (var23 == 255) {
				this.method118();
			}
		}
	}

	@ObfuscatedName("c.a(BII)V")
	public synchronized void method86() {
		this.method119();
	}

	@ObfuscatedName("c.a()I")
	@Override
	public synchronized int method87() {
		return 0;
	}

	@ObfuscatedName("c.e(I)V")
	public void method88() {
		int var1 = this.field327;
		int var2 = this.field328;
		long var3 = this.field330;
		while (this.field328 == var2) {
			while (var2 == this.field285.field2862[var1]) {
				this.field285.method953(var1);
				int var5 = this.field285.method954(var1);
				if (var5 == 1) {
					this.field285.method948();
					this.field285.method940(var1);
					if (this.field285.method945()) {
						if (!this.field326 || var2 == 0) {
							this.method118();
							this.field285.method944();
							return;
						}
						this.field285.method950(var3);
					}
					break;
				}
				if ((var5 & 0x80) != 0) {
					this.method85(var5);
				}
				this.field285.method951(var1);
				this.field285.method940(var1);
			}
			var1 = this.field285.method949();
			var2 = this.field285.field2862[var1];
			var3 = this.field285.method947(var2);
		}
		this.field330 = var3;
		this.field328 = var2;
		this.field327 = var1;
	}

	@ObfuscatedName("c.b(II)V")
	public synchronized void setGlobalVolume(int arg0) {
		this.field296 = arg0;
	}

	@ObfuscatedName("c.f(I)Z")
	public synchronized boolean method90() {
		return this.field285.method942();
	}

	@ObfuscatedName("c.a(B)V")
	public synchronized void method91() {
		for (Patch var1 = (Patch) this.patches.search(); var1 != null; var1 = (Patch) this.patches.findnext()) {
			var1.unlink();
		}
	}

	@ObfuscatedName("c.a(IZLla;)V")
	public void method92(boolean arg0, MidiNote arg1) {
		int var3 = arg1.field1811.field1343.length;
		int var6;
		if (arg0 && arg1.field1811.field1339) {
			int var4 = var3 + var3 - arg1.field1811.field1340;
			int var5 = var3 << 8;
			var6 = (int) ((long) var4 * (long) this.field287[arg1.field1818] >> 6);
			if (var6 >= var5) {
				arg1.field1788.method712();
				var6 = var5 + var5 - var6 - 1;
			}
		} else {
			var6 = (int) ((long) var3 * (long) this.field287[arg1.field1818] >> 6);
		}
		arg1.field1788.method702(var6);
	}

	@ObfuscatedName("c.c(II)V")
	public void method93(int arg0) {
		if ((this.field297[arg0] & 0x2) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.field329.field957.head(); var2 != null; var2 = (MidiNote) this.field329.field957.next()) {
			if (var2.field1818 == arg0 && this.field318[arg0][var2.field1803] == null && var2.field1819 < 0) {
				var2.field1819 = 0;
			}
		}
	}

	@ObfuscatedName("c.a(IIZI)V")
	public void method94(int arg0, int arg1, int arg2) {
		this.method99(arg2, 64, arg1);
		if ((this.field297[arg1] & 0x2) != 0) {
			for (MidiNote var4 = (MidiNote) this.field329.field957.tail(); var4 != null; var4 = (MidiNote) this.field329.field957.prev()) {
				if (arg1 == var4.field1818 && var4.field1819 < 0) {
					this.field318[arg1][var4.field1803] = null;
					this.field318[arg1][arg2] = var4;
					int var5 = (var4.field1805 * var4.field1816 >> 12) + var4.field1802;
					var4.field1802 += arg2 - var4.field1803 << 8;
					var4.field1803 = arg2;
					var4.field1816 = 4096;
					var4.field1805 = var5 - var4.field1802;
					return;
				}
			}
		}
		Patch var6 = (Patch) this.patches.find((long) this.field270[arg1]);
		if (var6 == null) {
			return;
		}
		Wave var7 = var6.noteSound[arg2];
		if (var7 == null) {
			return;
		}
		MidiNote var8 = new MidiNote();
		var8.field1804 = var6;
		var8.field1811 = var7;
		var8.field1818 = arg1;
		var8.field1796 = var6.field1734[arg2];
		var8.field1793 = var6.field1730[arg2];
		var8.field1803 = arg2;
		var8.field1785 = arg0 * arg0 * var6.field1714 * var6.field1721[arg2] + 1024 >> 11;
		var8.field1817 = var6.field1720[arg2] & 0xFF;
		var8.field1802 = (arg2 << 8) - (var6.field1722[arg2] & 0x7FFF);
		var8.field1795 = 0;
		var8.field1792 = 0;
		var8.field1794 = 0;
		var8.field1819 = -1;
		var8.field1814 = 0;
		if (this.field287[arg1] == 0) {
			var8.field1788 = WaveStream.method681(var7, this.method120(var8), this.method83(var8), this.method105(var8));
		} else {
			var8.field1788 = WaveStream.method681(var7, this.method120(var8), 0, this.method105(var8));
			this.method92(var6.field1722[arg2] < 0, var8);
		}
		if (var6.field1722[arg2] < 0) {
			var8.field1788.method684(-1);
		}
		if (var8.field1793 >= 0) {
			MidiNote var9 = this.field269[arg1][var8.field1793];
			if (var9 != null && var9.field1819 < 0) {
				this.field318[arg1][var9.field1803] = null;
				var9.field1819 = 0;
			}
			this.field269[arg1][var8.field1793] = var8;
		}
		this.field329.field957.push(var8);
		this.field318[arg1][arg2] = var8;
	}

	@ObfuscatedName("c.a(IIII)V")
	public void method95(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("c.a(ILea;Ljf;Lae;I)Z")
	public synchronized boolean loadAndQueuePatches(Js5 arg0, WaveCache arg1, MidiFile arg2) {
		arg2.method23();
		boolean var4 = true;
		int[] var5 = new int[] { 22050 };
		for (ByteArrayNode var6 = (ByteArrayNode) arg2.field110.search(); var6 != null; var6 = (ByteArrayNode) arg2.field110.findnext()) {
			int var7 = (int) var6.key;
			Patch var8 = (Patch) this.patches.find((long) var7);
			if (var8 == null) {
				var8 = Patch.load(var7, arg0);
				if (var8 == null) {
					var4 = false;
					continue;
				}
				this.patches.put((long) var7, var8);
			}
			if (!var8.loadWaves(arg1, var6.data, var5)) {
				var4 = false;
			}
		}
		if (var4) {
			arg2.method24();
		}
		return var4;
	}

	@ObfuscatedName("c.b(III)V")
	public void method97(int arg0, int arg1) {
		if (arg1 != this.field270[arg0]) {
			this.field270[arg0] = arg1;
			for (int var3 = 0; var3 < 128; var3++) {
				this.field269[arg0][var3] = null;
			}
		}
	}

	@ObfuscatedName("c.a(IB)V")
	public void method98(int arg0) {
		if ((this.field297[arg0] & 0x4) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.field329.field957.head(); var2 != null; var2 = (MidiNote) this.field329.field957.next()) {
			if (arg0 == var2.field1818) {
				var2.field1800 = 0;
			}
		}
	}

	@ObfuscatedName("c.a(IIBI)V")
	public void method99(int arg0, int arg1, int arg2) {
		MidiNote var4 = this.field318[arg2][arg0];
		if (var4 == null) {
			return;
		}
		this.field318[arg2][arg0] = null;
		if ((this.field297[arg2] & 0x2) == 0) {
			var4.field1819 = 0;
			return;
		}
		for (MidiNote var5 = (MidiNote) this.field329.field957.head(); var5 != null; var5 = (MidiNote) this.field329.field957.next()) {
			if (var4.field1818 == var5.field1818 && var5.field1819 < 0 && var5 != var4) {
				var4.field1819 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("c.d(II)V")
	public void method100(int arg0) {
		for (MidiNote var2 = (MidiNote) this.field329.field957.head(); var2 != null; var2 = (MidiNote) this.field329.field957.next()) {
			if ((arg0 < 0 || arg0 == var2.field1818) && var2.field1819 < 0) {
				this.field318[var2.field1818][var2.field1803] = null;
				var2.field1819 = 0;
			}
		}
	}

	@ObfuscatedName("c.d(I)V")
	@Override
	public synchronized void method104(int arg0) {
		if (this.field285.method942()) {
			int var2 = this.field311 * this.field285.field2861 / PcmPlayer.frequency;
			do {
				long var3 = this.field331 + (long) var2 * (long) arg0;
				if (this.field330 - var3 >= 0L) {
					this.field331 = var3;
					break;
				}
				int var5 = (int) ((this.field330 + (long) var2 - this.field331 - 1L) / (long) var2);
				arg0 -= var5;
				this.field331 += (long) var2 * (long) var5;
				this.field329.method104(var5);
				this.method88();
			} while (this.field285.method942());
		}
		this.field329.method104(arg0);
	}

	@ObfuscatedName("c.a(Lla;I)I")
	public int method105(MidiNote arg0) {
		int var2 = this.field301[arg0.field1818];
		return var2 >= 8192 ? 16384 - ((16384 - var2) * (-arg0.field1817 + 128) + 32 >> 6) : var2 * arg0.field1817 + 32 >> 6;
	}

	@ObfuscatedName("c.c()Lfd;")
	@Override
	public synchronized PcmStream method106() {
		return this.field329;
	}

	@ObfuscatedName("c.a(Lla;ZI[II)Z")
	public boolean method108(MidiNote arg0, int arg1, int[] arg2, int arg3) {
		arg0.field1791 = PcmPlayer.frequency / 100;
		if (arg0.field1819 >= 0 && (arg0.field1788 == null || arg0.field1788.method699())) {
			arg0.method615();
			arg0.unlink();
			if (arg0.field1793 > 0 && this.field269[arg0.field1818][arg0.field1793] == arg0) {
				this.field269[arg0.field1818][arg0.field1793] = null;
			}
			return true;
		}
		int var5 = arg0.field1816;
		if (var5 > 0) {
			int var6 = var5 - (int) (Math.pow(2.0D, (double) this.field295[arg0.field1818] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (var6 < 0) {
				var6 = 0;
			}
			arg0.field1816 = var6;
		}
		arg0.field1788.method679(this.method120(arg0));
		arg0.field1799++;
		double var7 = (double) ((arg0.field1805 * arg0.field1816 >> 12) + (arg0.field1803 - 60 << 8)) * 5.086263020833333E-6D;
		EnvelopeSet var9 = arg0.field1796;
		arg0.field1810 += var9.field1697;
		if (var9.field1702 > 0) {
			if (var9.field1698 > 0) {
				arg0.field1795 += (int) (Math.pow(2.0D, (double) var9.field1698 * var7) * 128.0D + 0.5D);
			} else {
				arg0.field1795 += 128;
			}
		}
		boolean var10 = false;
		if (var9.field1689 != null) {
			if (var9.field1691 > 0) {
				arg0.field1794 += (int) (Math.pow(2.0D, var7 * (double) var9.field1691) * 128.0D + 0.5D);
			} else {
				arg0.field1794 += 128;
			}
			while (arg0.field1814 < var9.field1689.length - 2 && (var9.field1689[arg0.field1814 + 2] & 0xFF) << 8 < arg0.field1794) {
				arg0.field1814 += 2;
			}
			if (var9.field1689.length - 2 == arg0.field1814 && var9.field1689[arg0.field1814 + 1] == 0) {
				var10 = true;
			}
		}
		if (arg0.field1819 >= 0 && var9.field1703 != null && (this.field297[arg0.field1818] & 0x1) == 0 && (arg0.field1793 < 0 || arg0 != this.field269[arg0.field1818][arg0.field1793])) {
			if (var9.field1707 <= 0) {
				arg0.field1819 += 128;
			} else {
				arg0.field1819 += (int) (Math.pow(2.0D, (double) var9.field1707 * var7) * 128.0D + 0.5D);
			}
			while (arg0.field1792 < var9.field1703.length - 2 && arg0.field1819 > (var9.field1703[arg0.field1792 + 2] & 0xFF) << 8) {
				arg0.field1792 += 2;
			}
			if (var9.field1703.length - 2 == arg0.field1792) {
				var10 = true;
			}
		}
		if (!var10) {
			arg0.field1788.method709(arg0.field1791, this.method83(arg0), this.method105(arg0));
			return false;
		}
		arg0.field1788.method682(arg0.field1791);
		if (arg2 == null) {
			arg0.field1788.method104(arg3);
		} else {
			arg0.field1788.method116(arg2, arg1, arg3);
		}
		if (arg0.field1788.method716()) {
			this.field329.field969.method912(arg0.field1788);
		}
		arg0.method615();
		if (arg0.field1819 >= 0) {
			arg0.unlink();
			if (arg0.field1793 > 0 && this.field269[arg0.field1818][arg0.field1793] == arg0) {
				this.field269[arg0.field1818][arg0.field1793] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("c.e(II)V")
	public void method109(int arg0) {
		if (arg0 < 0) {
			for (int var2 = 0; var2 < 16; var2++) {
				this.method109(var2);
			}
			return;
		}
		this.field315[arg0] = 12800;
		this.field301[arg0] = 8192;
		this.field300[arg0] = 16383;
		this.field293[arg0] = 8192;
		this.field314[arg0] = 0;
		this.field295[arg0] = 8192;
		this.method93(arg0);
		this.method98(arg0);
		this.field297[arg0] = 0;
		this.field266[arg0] = 32767;
		this.field322[arg0] = 256;
		this.field287[arg0] = 0;
		this.method117(8192, arg0);
	}

	@ObfuscatedName("c.f(II)V")
	public void method110(int arg0) {
		for (MidiNote var2 = (MidiNote) this.field329.field957.head(); var2 != null; var2 = (MidiNote) this.field329.field957.next()) {
			if (arg0 < 0 || arg0 == var2.field1818) {
				if (var2.field1788 != null) {
					var2.field1788.method682(PcmPlayer.frequency / 100);
					if (var2.field1788.method716()) {
						this.field329.field969.method912(var2.field1788);
					}
					var2.method615();
				}
				if (var2.field1819 < 0) {
					this.field318[var2.field1818][var2.field1803] = null;
				}
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("c.h(I)I")
	public int method112() {
		return this.field296;
	}

	@ObfuscatedName("c.b()Lfd;")
	@Override
	public synchronized PcmStream method113() {
		return null;
	}

	@ObfuscatedName("c.b(ILla;)Z")
	public boolean method114(MidiNote arg0) {
		if (arg0.field1788 != null) {
			return false;
		}
		if (arg0.field1819 >= 0) {
			arg0.unlink();
			if (arg0.field1793 > 0 && this.field269[arg0.field1818][arg0.field1793] == arg0) {
				this.field269[arg0.field1818][arg0.field1793] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("c.i(I)V")
	public synchronized void method115() {
		this.field285.method944();
		this.method118();
	}

	@ObfuscatedName("c.b([III)V")
	@Override
	public synchronized void method116(int[] arg0, int arg1, int arg2) {
		if (this.field285.method942()) {
			int var4 = this.field311 * this.field285.field2861 / PcmPlayer.frequency;
			do {
				long var5 = this.field331 + (long) arg2 * (long) var4;
				if (this.field330 - var5 >= 0L) {
					this.field331 = var5;
					break;
				}
				int var7 = (int) ((this.field330 + (long) var4 - this.field331 - 1L) / (long) var4);
				arg2 -= var7;
				this.field331 += (long) var4 * (long) var7;
				this.field329.method116(arg0, arg1, var7);
				arg1 += var7;
				this.method88();
			} while (this.field285.method942());
		}
		this.field329.method116(arg0, arg1, arg2);
	}

	@ObfuscatedName("c.b(BII)V")
	public void method117(int arg0, int arg1) {
		this.field299[arg1] = arg0;
		this.field310[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@ObfuscatedName("c.b(B)V")
	public void method118() {
		this.method110(-1);
		this.method109(-1);
		for (int var1 = 0; var1 < 16; var1++) {
			this.field270[var1] = this.field256[var1];
		}
		for (int var2 = 0; var2 < 16; var2++) {
			this.field264[var2] = this.field256[var2] & 0xFFFFFF80;
		}
	}

	@ObfuscatedName("c.c(III)V")
	public void method119() {
		this.field256[9] = 128;
		this.field264[9] = 128;
		this.method97(9, 128);
	}

	@ObfuscatedName("c.a(Lla;B)I")
	public int method120(MidiNote arg0) {
		int var2 = arg0.field1802 + (arg0.field1805 * arg0.field1816 >> 12);
		EnvelopeSet var3 = arg0.field1796;
		int var4 = var2 + ((this.field293[arg0.field1818] - 8192) * this.field322[arg0.field1818] >> 12);
		if (var3.field1697 > 0 && (var3.field1710 > 0 || this.field314[arg0.field1818] > 0)) {
			int var5 = var3.field1710 << 2;
			int var6 = var3.field1690 << 1;
			if (arg0.field1799 < var6) {
				var5 = arg0.field1799 * var5 / var6;
			}
			int var7 = var5 + (this.field314[arg0.field1818] >> 7);
			double var8 = Math.sin((double) (arg0.field1810 & 0x1FF) * 0.01227184630308513D);
			var4 += (int) (var8 * (double) var7);
		}
		int var10 = (int) ((double) (arg0.field1811.field1342 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) PcmPlayer.frequency + 0.5D);
		return var10 < 1 ? 1 : var10;
	}

	@ObfuscatedName("c.j(I)V")
	public synchronized void freeWaveIds() {
		for (Patch var1 = (Patch) this.patches.search(); var1 != null; var1 = (Patch) this.patches.findnext()) {
			var1.method592();
		}
	}
}
