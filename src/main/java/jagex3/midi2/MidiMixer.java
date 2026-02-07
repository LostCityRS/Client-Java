package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.sound.Mixer;
import jagex3.sound.PcmPlayer;
import jagex3.sound.PcmStream;
import jagex3.sound.WaveStream;

@ObfuscatedName("fe")
public final class MidiMixer extends PcmStream {

	@ObfuscatedName("fe.E")
	public final LinkList field957 = new LinkList();

	@ObfuscatedName("fe.Q")
	public final Mixer field969 = new Mixer();

	@ObfuscatedName("fe.I")
	public final MidiPlayer field961;

	public MidiMixer(MidiPlayer arg0) {
		this.field961 = arg0;
	}

	@ObfuscatedName("fe.b()Lfd;")
	@Override
	public PcmStream method113() {
		MidiNote var1;
		do {
			var1 = (MidiNote) this.field957.next();
			if (var1 == null) {
				return null;
			}
		} while (var1.field1788 == null);
		return var1.field1788;
	}

	@ObfuscatedName("fe.a(IILla;)V")
	public void method322(int arg0, MidiNote arg1) {
		if ((this.field961.field297[arg1.field1818] & 0x4) != 0 && arg1.field1819 < 0) {
			int var3 = this.field961.field310[arg1.field1818] / PcmPlayer.frequency;
			int var4 = (var3 + 1048575 - arg1.field1800) / var3;
			arg1.field1800 = arg1.field1800 + arg0 * var3 & 0xFFFFF;
			if (var4 <= arg0) {
				if (this.field961.field287[arg1.field1818] == 0) {
					arg1.field1788 = WaveStream.method681(arg1.field1811, arg1.field1788.method692(), arg1.field1788.method701(), arg1.field1788.method697());
				} else {
					arg1.field1788 = WaveStream.method681(arg1.field1811, arg1.field1788.method692(), 0, arg1.field1788.method697());
					this.field961.method92(arg1.field1804.field1722[arg1.field1803] < 0, arg1);
				}
				if (arg1.field1804.field1722[arg1.field1803] < 0) {
					arg1.field1788.method684(-1);
				}
				arg0 = arg1.field1800 / var3;
			}
		}
		arg1.field1788.method104(arg0);
	}

	@ObfuscatedName("fe.b([III)V")
	@Override
	public void method116(int[] arg0, int arg1, int arg2) {
		this.field969.method116(arg0, arg1, arg2);
		for (MidiNote var4 = (MidiNote) this.field957.head(); var4 != null; var4 = (MidiNote) this.field957.next()) {
			if (!this.field961.method114(var4)) {
				int var5 = arg1;
				int var6 = arg2;
				do {
					if (var6 <= var4.field1791) {
						this.method327(var4, arg0, var5, var6 + var5, var6);
						var4.field1791 -= var6;
						break;
					}
					this.method327(var4, arg0, var5, var5 + var6, var4.field1791);
					var5 += var4.field1791;
					var6 -= var4.field1791;
				} while (!this.field961.method108(var4, var5, arg0, var6));
			}
		}
	}

	@ObfuscatedName("fe.c()Lfd;")
	@Override
	public PcmStream method106() {
		MidiNote var1 = (MidiNote) this.field957.head();
		if (var1 == null) {
			return null;
		} else if (var1.field1788 == null) {
			return this.method113();
		} else {
			return var1.field1788;
		}
	}

	@ObfuscatedName("fe.a()I")
	@Override
	public int method87() {
		return 0;
	}

	@ObfuscatedName("fe.d(I)V")
	@Override
	public void method104(int arg0) {
		this.field969.method104(arg0);
		for (MidiNote var2 = (MidiNote) this.field957.head(); var2 != null; var2 = (MidiNote) this.field957.next()) {
			if (!this.field961.method114(var2)) {
				int var3 = arg0;
				do {
					if (var2.field1791 >= var3) {
						this.method322(var3, var2);
						var2.field1791 -= var3;
						break;
					}
					this.method322(var2.field1791, var2);
					var3 -= var2.field1791;
				} while (!this.field961.method108(var2, 0, null, var3));
			}
		}
	}

	@ObfuscatedName("fe.a(Lla;[IIIII)V")
	public void method327(MidiNote arg0, int[] arg1, int arg2, int arg3, int arg4) {
		if ((this.field961.field297[arg0.field1818] & 0x4) != 0 && arg0.field1819 < 0) {
			int var6 = this.field961.field310[arg0.field1818] / PcmPlayer.frequency;
			while (true) {
				int var7 = (var6 + 1048575 - arg0.field1800) / var6;
				if (var7 > arg4) {
					arg0.field1800 += var6 * arg4;
					break;
				}
				arg4 -= var7;
				int var8 = 262144 / var6;
				arg0.field1788.method116(arg1, arg2, var7);
				arg0.field1800 += var7 * var6 - 1048576;
				arg2 += var7;
				WaveStream var9 = arg0.field1788;
				int var10 = PcmPlayer.frequency / 100;
				if (var8 < var10) {
					var10 = var8;
				}
				if (this.field961.field287[arg0.field1818] == 0) {
					arg0.field1788 = WaveStream.method681(arg0.field1811, var9.method692(), var9.method701(), var9.method697());
				} else {
					arg0.field1788 = WaveStream.method681(arg0.field1811, var9.method692(), 0, var9.method697());
					this.field961.method92(arg0.field1804.field1722[arg0.field1803] < 0, arg0);
					arg0.field1788.method678(var10, var9.method701());
				}
				if (arg0.field1804.field1722[arg0.field1803] < 0) {
					arg0.field1788.method684(-1);
				}
				var9.method682(var10);
				var9.method116(arg1, arg2, arg3 - arg2);
				if (var9.method716()) {
					this.field969.method912(var9);
				}
			}
		}
		arg0.field1788.method116(arg1, arg2, arg4);
	}
}
