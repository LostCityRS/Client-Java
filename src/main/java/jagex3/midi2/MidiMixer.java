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
	public final LinkList queue = new LinkList();

	@ObfuscatedName("jg.S")
	public final Mixer mixer = new Mixer();

	@ObfuscatedName("jg.E")
	public final MidiPlayer midiPlayer;

	public MidiMixer(MidiPlayer arg0) {
		this.midiPlayer = arg0;
	}

	@ObfuscatedName("jg.c()I")
	@Override
	public int selfMixCost() {
		return 0;
	}

	@ObfuscatedName("jg.b(I)V")
	@Override
	public void pretendToMix(int arg0) {
		this.mixer.pretendToMix(arg0);
		for (MidiNote var2 = (MidiNote) this.queue.head(); var2 != null; var2 = (MidiNote) this.queue.next()) {
			if (!this.midiPlayer.updateStreamlessNote(var2)) {
				int var3 = arg0;
				do {
					if (var2.volumeChangeDuration >= var3) {
						this.pretendToMix2(var3, var2);
						var2.volumeChangeDuration -= var3;
						break;
					}
					this.pretendToMix2(var2.volumeChangeDuration, var2);
					var3 -= var2.volumeChangeDuration;
				} while (!this.midiPlayer.updateNote(null, var3, 0, var2));
			}
		}
	}

	@ObfuscatedName("jg.d()Lef;")
	@Override
	public PcmStream substreamStart() {
		MidiNote var1 = (MidiNote) this.queue.head();
		if (var1 == null) {
			return null;
		} else if (var1.stream == null) {
			return this.substreamNext();
		} else {
			return var1.stream;
		}
	}

	@ObfuscatedName("jg.a(IILlg;)V")
	public void pretendToMix2(int arg0, MidiNote arg1) {
		if ((this.midiPlayer.channelEffects[arg1.channel] & 0x4) != 0 && arg1.releaseProgress < 0) {
			int var3 = this.midiPlayer.channelCustom3[arg1.channel] / PcmPlayer.frequency;
			int var4 = (var3 + 1048575 - arg1.field1766) / var3;
			arg1.field1766 = arg1.field1766 + arg0 * var3 & 0xFFFFF;
			if (arg0 >= var4) {
				if (this.midiPlayer.channelCustom1[arg1.channel] == 0) {
					arg1.stream = WaveStream.newRateFineVolPan(arg1.sound, arg1.stream.getRateRaw(), arg1.stream.getVolumeFine(), arg1.stream.getPanFine());
				} else {
					arg1.stream = WaveStream.newRateFineVolPan(arg1.sound, arg1.stream.getRateRaw(), 0, arg1.stream.getPanFine());
					this.midiPlayer.setSampleOffset(arg1, arg1.patch.notePitch[arg1.noteKey] < 0);
				}
				if (arg1.patch.notePitch[arg1.noteKey] < 0) {
					arg1.stream.setLoopCount(-1);
				}
				arg0 = arg1.field1766 / var3;
			}
		}
		arg1.stream.pretendToMix(arg0);
	}

	@ObfuscatedName("jg.a()Lef;")
	@Override
	public PcmStream substreamNext() {
		MidiNote var1;
		do {
			var1 = (MidiNote) this.queue.next();
			if (var1 == null) {
				return null;
			}
		} while (var1.stream == null);
		return var1.stream;
	}

	@ObfuscatedName("jg.a([III)V")
	@Override
	public void doMix(int[] arg0, int arg1, int arg2) {
		this.mixer.doMix(arg0, arg1, arg2);
		for (MidiNote var4 = (MidiNote) this.queue.head(); var4 != null; var4 = (MidiNote) this.queue.next()) {
			if (!this.midiPlayer.updateStreamlessNote(var4)) {
				int var5 = arg2;
				int var6 = arg1;
				do {
					if (var4.volumeChangeDuration >= var5) {
						this.doMix2(var5, arg0, var6 + var5, var4, var6);
						var4.volumeChangeDuration -= var5;
						break;
					}
					this.doMix2(var4.volumeChangeDuration, arg0, var5 + var6, var4, var6);
					var5 -= var4.volumeChangeDuration;
					var6 += var4.volumeChangeDuration;
				} while (!this.midiPlayer.updateNote(arg0, var5, var6, var4));
			}
		}
	}

	@ObfuscatedName("jg.a(II[IILlg;I)V")
	public void doMix2(int arg0, int[] arg1, int arg2, MidiNote arg3, int arg4) {
		if ((this.midiPlayer.channelEffects[arg3.channel] & 0x4) != 0 && arg3.releaseProgress < 0) {
			int var6 = this.midiPlayer.channelCustom3[arg3.channel] / PcmPlayer.frequency;
			while (true) {
				int var7 = (var6 + 1048575 - arg3.field1766) / var6;
				if (var7 > arg0) {
					arg3.field1766 += arg0 * var6;
					break;
				}
				arg0 -= var7;
				arg3.stream.doMix(arg1, arg4, var7);
				int var8 = PcmPlayer.frequency / 100;
				arg3.field1766 += var6 * var7 - 1048576;
				int var9 = 262144 / var6;
				WaveStream var10 = arg3.stream;
				if (var9 < var8) {
					var8 = var9;
				}
				if (this.midiPlayer.channelCustom1[arg3.channel] == 0) {
					arg3.stream = WaveStream.newRateFineVolPan(arg3.sound, var10.getRateRaw(), var10.getVolumeFine(), var10.getPanFine());
				} else {
					arg3.stream = WaveStream.newRateFineVolPan(arg3.sound, var10.getRateRaw(), 0, var10.getPanFine());
					this.midiPlayer.setSampleOffset(arg3, arg3.patch.notePitch[arg3.noteKey] < 0);
					arg3.stream.rampVolumeFine(var8, var10.getVolumeFine());
				}
				arg4 += var7;
				if (arg3.patch.notePitch[arg3.noteKey] < 0) {
					arg3.stream.setLoopCount(-1);
				}
				var10.rampOut(var8);
				var10.doMix(arg1, arg4, arg2 - arg4);
				if (var10.isRamping()) {
					this.mixer.playStream(var10);
				}
			}
		}
		arg3.stream.doMix(arg1, arg4, arg0);
	}
}
