package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.sound.Mixer;
import jagex3.sound.PcmPlayer;
import jagex3.sound.PcmStream;
import jagex3.sound.WaveStream;

@ObfuscatedName("jg")
public final class MidiMixer extends PcmStream {

	@ObfuscatedName("jg.M")
	public final LinkList field1913 = new LinkList();

	@ObfuscatedName("jg.S")
	public final Mixer field1919 = new Mixer();

	@ObfuscatedName("jg.E")
	public final MidiPlayer field1905;

	public MidiMixer(MidiPlayer arg0) {
		this.field1905 = arg0;
	}

	@ObfuscatedName("jg.c()I")
	@Override
	public int method383() {
		return 0;
	}

	@ObfuscatedName("jg.b(I)V")
	@Override
	public void method384(int arg0) {
		this.field1919.method384(arg0);
		for (MidiNote var2 = (MidiNote) this.field1913.head(); var2 != null; var2 = (MidiNote) this.field1913.method1619()) {
			if (!this.field1905.method1200(var2)) {
				int var3 = arg0;
				do {
					if (var2.field2367 >= var3) {
						this.method724(var3, var2);
						var2.field2367 -= var3;
						break;
					}
					this.method724(var2.field2367, var2);
					var3 -= var2.field2367;
				} while (!this.field1905.method1183(null, var3, 0, var2));
			}
		}
	}

	@ObfuscatedName("jg.d()Lef;")
	@Override
	public PcmStream method385() {
		MidiNote var1 = (MidiNote) this.field1913.head();
		if (var1 == null) {
			return null;
		} else if (var1.field2391 == null) {
			return this.method380();
		} else {
			return var1.field2391;
		}
	}

	@ObfuscatedName("jg.a(IILlg;)V")
	public void method724(int arg0, MidiNote arg1) {
		if ((this.field1905.field3248[arg1.field2385] & 0x4) != 0 && arg1.field2386 < 0) {
			int var3 = this.field1905.field3282[arg1.field2385] / PcmPlayer.frequency;
			int var4 = (var3 + 1048575 - arg1.field2390) / var3;
			arg1.field2390 = arg1.field2390 + arg0 * var3 & 0xFFFFF;
			if (arg0 >= var4) {
				if (this.field1905.field3286[arg1.field2385] == 0) {
					arg1.field2391 = WaveStream.method1098(arg1.field2380, arg1.field2391.method1104(), arg1.field2391.method1093(), arg1.field2391.method1103());
				} else {
					arg1.field2391 = WaveStream.method1098(arg1.field2380, arg1.field2391.method1104(), 0, arg1.field2391.method1103());
					this.field1905.method1211(arg1, arg1.field2375.field3889[arg1.field2381] < 0);
				}
				if (arg1.field2375.field3889[arg1.field2381] < 0) {
					arg1.field2391.method1119(-1);
				}
				arg0 = arg1.field2390 / var3;
			}
		}
		arg1.field2391.method384(arg0);
	}

	@ObfuscatedName("jg.a()Lef;")
	@Override
	public PcmStream method380() {
		MidiNote var1;
		do {
			var1 = (MidiNote) this.field1913.method1619();
			if (var1 == null) {
				return null;
			}
		} while (var1.field2391 == null);
		return var1.field2391;
	}

	@ObfuscatedName("jg.a([III)V")
	@Override
	public void method379(int[] arg0, int arg1, int arg2) {
		this.field1919.method379(arg0, arg1, arg2);
		for (MidiNote var4 = (MidiNote) this.field1913.head(); var4 != null; var4 = (MidiNote) this.field1913.method1619()) {
			if (!this.field1905.method1200(var4)) {
				int var5 = arg2;
				int var6 = arg1;
				do {
					if (var4.field2367 >= var5) {
						this.method728(var5, arg0, var6 + var5, var4, var6);
						var4.field2367 -= var5;
						break;
					}
					this.method728(var4.field2367, arg0, var5 + var6, var4, var6);
					var5 -= var4.field2367;
					var6 += var4.field2367;
				} while (!this.field1905.method1183(arg0, var5, var6, var4));
			}
		}
	}

	@ObfuscatedName("jg.a(II[IILlg;I)V")
	public void method728(int arg0, int[] arg1, int arg2, MidiNote arg3, int arg4) {
		if ((this.field1905.field3248[arg3.field2385] & 0x4) != 0 && arg3.field2386 < 0) {
			int var6 = this.field1905.field3282[arg3.field2385] / PcmPlayer.frequency;
			while (true) {
				int var7 = (var6 + 1048575 - arg3.field2390) / var6;
				if (var7 > arg0) {
					arg3.field2390 += arg0 * var6;
					break;
				}
				arg0 -= var7;
				arg3.field2391.method379(arg1, arg4, var7);
				int var8 = PcmPlayer.frequency / 100;
				arg3.field2390 += var6 * var7 - 1048576;
				int var9 = 262144 / var6;
				WaveStream var10 = arg3.field2391;
				if (var9 < var8) {
					var8 = var9;
				}
				if (this.field1905.field3286[arg3.field2385] == 0) {
					arg3.field2391 = WaveStream.method1098(arg3.field2380, var10.method1104(), var10.method1093(), var10.method1103());
				} else {
					arg3.field2391 = WaveStream.method1098(arg3.field2380, var10.method1104(), 0, var10.method1103());
					this.field1905.method1211(arg3, arg3.field2375.field3889[arg3.field2381] < 0);
					arg3.field2391.method1116(var8, var10.method1093());
				}
				arg4 += var7;
				if (arg3.field2375.field3889[arg3.field2381] < 0) {
					arg3.field2391.method1119(-1);
				}
				var10.method1086(var8);
				var10.method379(arg1, arg4, arg2 - arg4);
				if (var10.method1121()) {
					this.field1919.method1506(var10);
				}
			}
		}
		arg3.field2391.method379(arg1, arg4, arg0);
	}
}
