package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.config.StructType;
import jagex3.datastruct.ByteArrayNode;
import jagex3.datastruct.HashTable;
import jagex3.js5.Js5;
import jagex3.sound.*;

@ObfuscatedName("pg")
public final class MidiPlayer extends PcmStream {

	@ObfuscatedName("pg.cb")
	public final int[] channelCustom2 = new int[16];

	@ObfuscatedName("pg.fb")
	public final int[] channelCustom3 = new int[16];

	@ObfuscatedName("pg.jb")
	public final int[] channelCustom1 = new int[16];

	@ObfuscatedName("pg.lb")
	public final int[] channelPan = new int[16];

	@ObfuscatedName("pg.sb")
	public final MidiNote[][] channelNotes = new MidiNote[16][128];

	@ObfuscatedName("pg.wb")
	public final MidiNote[][] channelSecondaryNotes = new MidiNote[16][128];

	@ObfuscatedName("pg.x")
	public final int[] channelEffects = new int[16];

	@ObfuscatedName("pg.K")
	public final int[] channelPitchBend = new int[16];

	@ObfuscatedName("pg.Z")
	public final int[] channelPitchBendRange = new int[16];

	@ObfuscatedName("pg.V")
	public final int[] channelDefaultPatch = new int[16];

	@ObfuscatedName("pg.F")
	public final int[] channelModulation = new int[16];

	@ObfuscatedName("pg.Q")
	public final int[] channelExpression = new int[16];

	@ObfuscatedName("pg.P")
	public final int tempoMicroseconds = 1000000;

	@ObfuscatedName("pg.Cb")
	public final int[] channelPatch = new int[16];

	@ObfuscatedName("pg.R")
	public final int[] channelPortamentoTime = new int[16];

	@ObfuscatedName("pg.Hb")
	public final int[] channelBank = new int[16];

	@ObfuscatedName("pg.Gb")
	public final int[] channelVolume = new int[16];

	@ObfuscatedName("pg.Jb")
	public final int[] channelParameterNumber = new int[16];

	@ObfuscatedName("pg.Kb")
	public int globalVolume = 256;

	@ObfuscatedName("pg.C")
	public final MidiParser parser = new MidiParser();

	@ObfuscatedName("pg.Lb")
	public final MidiMixer patchStream = new MidiMixer(this);

	@ObfuscatedName("pg.B")
	public final HashTable patches = new HashTable(128);

	@ObfuscatedName("pg.Nb")
	public int trackCurrentTick;

	@ObfuscatedName("pg.Qb")
	public int track;

	@ObfuscatedName("pg.Mb")
	public long trackPreviousTime;

	@ObfuscatedName("pg.Ob")
	public long trackCurrentTime;

	@ObfuscatedName("pg.Pb")
	public boolean loop;

	public MidiPlayer() {
		this.reset();
	}

	@ObfuscatedName("pg.d()Lef;")
	@Override
	public synchronized PcmStream substreamStart() {
		return this.patchStream;
	}

	@ObfuscatedName("pg.c(I)V")
	public synchronized void clearPatches() {
		for (Patch var1 = (Patch) this.patches.search(); var1 != null; var1 = (Patch) this.patches.findnext()) {
			var1.unlink();
		}
	}

	@ObfuscatedName("pg.b(II)V")
	public void cleanRetrig(int arg0) {
		if ((this.channelEffects[arg0] & 0x4) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.patchStream.queue.head(); var2 != null; var2 = (MidiNote) this.patchStream.queue.next()) {
			if (arg0 == var2.channel) {
				var2.field1766 = 0;
			}
		}
	}

	@ObfuscatedName("pg.a(ILnj;Lic;ILnb;)Z")
	public synchronized boolean loadAndQueuePatches(WaveCache arg0, MidiFile arg1, Js5 arg2) {
		arg1.method660();
		boolean var4 = true;
		int[] var5 = new int[] { 22050 };
		for (ByteArrayNode var6 = (ByteArrayNode) arg1.patches.search(); var6 != null; var6 = (ByteArrayNode) arg1.patches.findnext()) {
			int var7 = (int) var6.key;
			Patch var8 = (Patch) this.patches.find((long) var7);
			if (var8 == null) {
				var8 = StructType.method1266(arg2, var7);
				if (var8 == null) {
					var4 = false;
					continue;
				}
				this.patches.put((long) var7, var8);
			}
			if (!var8.loadWaves(var5, arg0, var6.field2956)) {
				var4 = false;
			}
		}
		if (var4) {
			arg1.method661();
		}
		return var4;
	}

	@ObfuscatedName("pg.a([IIIILlg;)Z")
	public boolean updateNote(int[] arg0, int arg1, int arg2, MidiNote arg3) {
		arg3.volumeChangeDuration = PcmPlayer.frequency / 100;
		if (arg3.releaseProgress >= 0 && (arg3.stream == null || arg3.stream.isFinished())) {
			arg3.dropData();
			arg3.unlink();
			if (arg3.secondaryNote > 0 && arg3 == this.channelSecondaryNotes[arg3.channel][arg3.secondaryNote]) {
				this.channelSecondaryNotes[arg3.channel][arg3.secondaryNote] = null;
			}
			return true;
		}
		int var5 = arg3.portamentoAmount;
		boolean var6 = false;
		if (var5 > 0) {
			int var7 = var5 - (int) (Math.pow(2.0D, (double) this.channelPortamentoTime[arg3.channel] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (var7 < 0) {
				var7 = 0;
			}
			arg3.portamentoAmount = var7;
		}
		arg3.stream.setRateRaw(this.getRateRaw(arg3));
		EnvelopeSet var8 = arg3.envelope;
		arg3.vibratoRampProgress++;
		double var9 = (double) ((arg3.portamentoAmount * arg3.portamentoDelta >> 12) + (arg3.noteKey - 60 << 8)) * 5.086263020833333E-6D;
		arg3.vibratoProgress += var8.vibratoFrequency;
		if (var8.decayVolume > 0) {
			if (var8.decaySpeed > 0) {
				arg3.decayProgress += (int) (Math.pow(2.0D, var9 * (double) var8.decaySpeed) * 128.0D + 0.5D);
			} else {
				arg3.decayProgress += 128;
			}
			if (var8.decayVolume * arg3.decayProgress >= 819200) {
				var6 = true;
			}
		}
		if (var8.attackVolume != null) {
			if (var8.attackSpeed <= 0) {
				arg3.attackEnvelopeProgress += 128;
			} else {
				arg3.attackEnvelopeProgress += (int) (Math.pow(2.0D, var9 * (double) var8.attackSpeed) * 128.0D + 0.5D);
			}
			while (var8.attackVolume.length - 2 > arg3.releaseEnvelopeProgress && arg3.attackEnvelopeProgress > (var8.attackVolume[arg3.releaseEnvelopeProgress + 2] & 0xFF) << 8) {
				arg3.releaseEnvelopeProgress += 2;
			}
			if (arg3.releaseEnvelopeProgress == var8.attackVolume.length - 2 && var8.attackVolume[arg3.releaseEnvelopeProgress + 1] == 0) {
				var6 = true;
			}
		}
		if (arg3.releaseProgress >= 0 && var8.releaseVolume != null && (this.channelEffects[arg3.channel] & 0x1) == 0 && (arg3.secondaryNote < 0 || arg3 != this.channelSecondaryNotes[arg3.channel][arg3.secondaryNote])) {
			if (var8.releaseSpeed > 0) {
				arg3.releaseProgress += (int) (Math.pow(2.0D, var9 * (double) var8.releaseSpeed) * 128.0D + 0.5D);
			} else {
				arg3.releaseProgress += 128;
			}
			while (var8.releaseVolume.length - 2 > arg3.attackProgress && (var8.releaseVolume[arg3.attackProgress + 2] & 0xFF) << 8 < arg3.releaseProgress) {
				arg3.attackProgress += 2;
			}
			if (var8.releaseVolume.length - 2 == arg3.attackProgress) {
				var6 = true;
			}
		}
		if (!var6) {
			arg3.stream.rampVolPanFine(arg3.volumeChangeDuration, this.getVolume(arg3), this.getPan(arg3));
			return false;
		}
		arg3.stream.rampOut(arg3.volumeChangeDuration);
		if (arg0 == null) {
			arg3.stream.pretendToMix(arg1);
		} else {
			arg3.stream.doMix(arg0, arg2, arg1);
		}
		if (arg3.stream.isRamping()) {
			this.patchStream.mixer.playStream(arg3.stream);
		}
		arg3.dropData();
		if (arg3.releaseProgress >= 0) {
			arg3.unlink();
			if (arg3.secondaryNote > 0 && arg3 == this.channelSecondaryNotes[arg3.channel][arg3.secondaryNote]) {
				this.channelSecondaryNotes[arg3.channel][arg3.secondaryNote] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("pg.d(I)V")
	public void updateMidi() {
		int var1 = this.trackCurrentTick;
		int var2 = this.track;
		long var3 = this.trackCurrentTime;
		while (var1 == this.trackCurrentTick) {
			while (this.parser.trackCurrentTick[var2] == var1) {
				this.parser.setTrack(var2);
				int var5 = this.parser.getEvent(var2);
				if (var5 == 1) {
					this.parser.finishTrack();
					this.parser.unsetTrack(var2);
					if (this.parser.allTracksFinished()) {
						if (!this.loop || var1 == 0) {
							this.reset();
							this.parser.dropMidi();
							return;
						}
						this.parser.restart(var3);
					}
					break;
				}
				if ((var5 & 0x80) != 0) {
					this.processMidi(var5);
				}
				this.parser.processDeltaTime(var2);
				this.parser.unsetTrack(var2);
			}
			var2 = this.parser.nextTrackToPlay();
			var1 = this.parser.trackCurrentTick[var2];
			var3 = this.parser.timeFromTick(var1);
		}
		this.track = var2;
		this.trackCurrentTick = var1;
		this.trackCurrentTime = var3;
	}

	@ObfuscatedName("pg.a(ILic;Z)V")
	public synchronized void start(MidiFile arg0, boolean arg1) {
		this.stop();
		this.parser.setMidi(arg0.midi);
		this.trackPreviousTime = 0;
		this.loop = arg1;
		int var3 = this.parser.getTrackCount();
		for (int var4 = 0; var4 < var3; var4++) {
			this.parser.setTrack(var4);
			this.parser.processDeltaTime(var4);
			this.parser.unsetTrack(var4);
		}
		this.track = this.parser.nextTrackToPlay();
		this.trackCurrentTick = this.parser.trackCurrentTick[this.track];
		this.trackCurrentTime = this.parser.timeFromTick(this.trackCurrentTick);
	}

	@ObfuscatedName("pg.a()Lef;")
	@Override
	public synchronized PcmStream substreamNext() {
		return null;
	}

	@ObfuscatedName("pg.a(BI)V")
	public synchronized void setGlobalVolume(int arg0) {
		this.globalVolume = arg0;
	}

	@ObfuscatedName("pg.e(I)V")
	public synchronized void freeWaveIds() {
		for (Patch var1 = (Patch) this.patches.search(); var1 != null; var1 = (Patch) this.patches.findnext()) {
			var1.freeWaveIds();
		}
	}

	@ObfuscatedName("pg.a(III)V")
	public void pitchWheel(int arg0, int arg1) {
		this.channelPitchBend[arg0] = arg1;
	}

	@ObfuscatedName("pg.a(Llg;Z)I")
	public int getPan(MidiNote arg0) {
		int var2 = this.channelPan[arg0.channel];
		return var2 >= 8192 ? 16384 - ((16384 - var2) * (-arg0.pan + 128) + 32 >> 6) : var2 * arg0.pan + 32 >> 6;
	}

	@ObfuscatedName("pg.a(ZI)V")
	public void allNotesOff(int arg0) {
		for (MidiNote var2 = (MidiNote) this.patchStream.queue.head(); var2 != null; var2 = (MidiNote) this.patchStream.queue.next()) {
			if ((arg0 < 0 || var2.channel == arg0) && var2.releaseProgress < 0) {
				this.channelNotes[var2.channel][var2.noteKey] = null;
				var2.releaseProgress = 0;
			}
		}
	}

	@ObfuscatedName("pg.b(I)V")
	@Override
	public synchronized void pretendToMix(int arg0) {
		if (this.parser.gotMidi()) {
			int var2 = this.parser.division * this.tempoMicroseconds / PcmPlayer.frequency;
			do {
				long var3 = (long) var2 * (long) arg0 + this.trackPreviousTime;
				if (this.trackCurrentTime - var3 >= 0L) {
					this.trackPreviousTime = var3;
					break;
				}
				int var5 = (int) (((long) var2 + this.trackCurrentTime - this.trackPreviousTime - 1L) / (long) var2);
				this.trackPreviousTime += (long) var2 * (long) var5;
				arg0 -= var5;
				this.patchStream.pretendToMix(var5);
				this.updateMidi();
			} while (this.parser.gotMidi());
		}
		this.patchStream.pretendToMix(arg0);
	}

	@ObfuscatedName("pg.a(Llg;I)I")
	public int getVolume(MidiNote arg0) {
		EnvelopeSet var2 = arg0.envelope;
		int var3 = this.channelExpression[arg0.channel] * this.channelVolume[arg0.channel] + 4096 >> 13;
		int var4 = var3 * var3 + 16384 >> 15;
		int var5 = var4 * arg0.volume + 16384 >> 15;
		int var6 = this.globalVolume * var5 + 128 >> 8;
		if (var2.decayVolume > 0) {
			var6 = (int) ((double) var6 * Math.pow(0.5D, (double) var2.decayVolume * (double) arg0.decayProgress * 1.953125E-5D) + 0.5D);
		}
		if (var2.attackVolume != null) {
			int var7 = arg0.attackEnvelopeProgress;
			int var8 = var2.attackVolume[arg0.releaseEnvelopeProgress + 1];
			if (arg0.releaseEnvelopeProgress < var2.attackVolume.length - 2) {
				int var9 = (var2.attackVolume[arg0.releaseEnvelopeProgress] & 0xFF) << 8;
				int var10 = (var2.attackVolume[arg0.releaseEnvelopeProgress + 2] & 0xFF) << 8;
				var8 += (var2.attackVolume[arg0.releaseEnvelopeProgress + 3] - var8) * (var7 - var9) / (var10 - var9);
			}
			var6 = var8 * var6 + 32 >> 6;
		}
		if (arg0.releaseProgress > 0 && var2.releaseVolume != null) {
			int var11 = var2.releaseVolume[arg0.attackProgress + 1];
			int var12 = arg0.releaseProgress;
			if (arg0.attackProgress < var2.releaseVolume.length - 2) {
				int var13 = (var2.releaseVolume[arg0.attackProgress + 2] & 0xFF) << 8;
				int var14 = (var2.releaseVolume[arg0.attackProgress] & 0xFF) << 8;
				var11 += (var2.releaseVolume[arg0.attackProgress + 3] - var11) * (var12 - var14) / (var13 - var14);
			}
			var6 = var11 * var6 + 32 >> 6;
		}
		return var6;
	}

	@ObfuscatedName("pg.c(II)V")
	public void processMidi(int arg0) {
		int var2 = arg0 & 0xF0;
		if (var2 == 128) {
			int var3 = arg0 >> 16 & 0x7F;
			int var4 = arg0 & 0xF;
			int var5 = arg0 >> 8 & 0x7F;
			this.stopNote(var3, var5, var4);
		} else if (var2 == 144) {
			int var6 = arg0 >> 8 & 0x7F;
			int var7 = arg0 & 0xF;
			int var8 = arg0 >> 16 & 0x7F;
			if (var8 > 0) {
				this.playNote(var8, var7, var6);
			} else {
				this.stopNote(64, var6, var7);
			}
		} else if (var2 == 160) {
			int var9 = arg0 & 0xF;
			int var10 = arg0 >> 16 & 0x7F;
			int var11 = arg0 >> 8 & 0x7F;
			this.setPolyphonicKeyPressure(var10, var11, var9);
		} else if (var2 == 176) {
			int var12 = arg0 >> 8 & 0x7F;
			int var13 = arg0 & 0xF;
			int var14 = arg0 >> 16 & 0x7F;
			if (var12 == 0) {
				this.channelBank[var13] = (this.channelBank[var13] & 0xFFE03FFF) + (var14 << 14);
			}
			if (var12 == 32) {
				this.channelBank[var13] = (this.channelBank[var13] & 0xFFFFC07F) + (var14 << 7);
			}
			if (var12 == 1) {
				this.channelModulation[var13] = (var14 << 7) + (this.channelModulation[var13] & 0xFFFFC07F);
			}
			if (var12 == 33) {
				this.channelModulation[var13] = var14 + (this.channelModulation[var13] & 0xFFFFFF80);
			}
			if (var12 == 5) {
				this.channelPortamentoTime[var13] = (var14 << 7) + (this.channelPortamentoTime[var13] & 0xFFFFC07F);
			}
			if (var12 == 37) {
				this.channelPortamentoTime[var13] = (this.channelPortamentoTime[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 7) {
				this.channelVolume[var13] = (var14 << 7) + (this.channelVolume[var13] & 0xFFFFC07F);
			}
			if (var12 == 39) {
				this.channelVolume[var13] = (this.channelVolume[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 10) {
				this.channelPan[var13] = (var14 << 7) + (this.channelPan[var13] & 0xFFFFC07F);
			}
			if (var12 == 42) {
				this.channelPan[var13] = var14 + (this.channelPan[var13] & 0xFFFFFF80);
			}
			if (var12 == 11) {
				this.channelExpression[var13] = (var14 << 7) + (this.channelExpression[var13] & 0xFFFFC07F);
			}
			if (var12 == 43) {
				this.channelExpression[var13] = (this.channelExpression[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 64) {
				if (var14 < 64) {
					this.channelEffects[var13] &= 0xFFFFFFFE;
				} else {
					this.channelEffects[var13] |= 0x1;
				}
			}
			if (var12 == 65) {
				if (var14 >= 64) {
					this.channelEffects[var13] |= 0x2;
				} else {
					this.cleanPorta(var13);
					this.channelEffects[var13] &= 0xFFFFFFFD;
				}
			}
			if (var12 == 99) {
				this.channelParameterNumber[var13] = (this.channelParameterNumber[var13] & 0x7F) + (var14 << 7);
			}
			if (var12 == 98) {
				this.channelParameterNumber[var13] = var14 + (this.channelParameterNumber[var13] & 0x3F80);
			}
			if (var12 == 101) {
				this.channelParameterNumber[var13] = (var14 << 7) + (this.channelParameterNumber[var13] & 0x7F) + 16384;
			}
			if (var12 == 100) {
				this.channelParameterNumber[var13] = (this.channelParameterNumber[var13] & 0x3F80) + var14 + 16384;
			}
			if (var12 == 120) {
				this.allSoundOff(var13);
			}
			if (var12 == 121) {
				this.allControllersOff(var13);
			}
			if (var12 == 123) {
				this.allNotesOff(var13);
			}
			if (var12 == 6) {
				int var15 = this.channelParameterNumber[var13];
				if (var15 == 16384) {
					this.channelPitchBendRange[var13] = (var14 << 7) + (this.channelPitchBendRange[var13] & 0xFFFFC07F);
				}
			}
			if (var12 == 38) {
				int var16 = this.channelParameterNumber[var13];
				if (var16 == 16384) {
					this.channelPitchBendRange[var13] = var14 + (this.channelPitchBendRange[var13] & 0xFFFFFF80);
				}
			}
			if (var12 == 16) {
				this.channelCustom1[var13] = (this.channelCustom1[var13] & 0xFFFFC07F) + (var14 << 7);
			}
			if (var12 == 48) {
				this.channelCustom1[var13] = (this.channelCustom1[var13] & 0xFFFFFF80) + var14;
			}
			if (var12 == 81) {
				if (var14 >= 64) {
					this.channelEffects[var13] |= 0x4;
				} else {
					this.cleanRetrig(var13);
					this.channelEffects[var13] &= 0xFFFFFFFB;
				}
			}
			if (var12 == 17) {
				this.setRetrigRate((this.channelCustom2[var13] & 0xFFFFC07F) + (var14 << 7), var13);
			}
			if (var12 == 49) {
				this.setRetrigRate((this.channelCustom2[var13] & 0xFFFFFF80) + var14, var13);
			}
		} else if (var2 == 192) {
			int var17 = arg0 >> 8 & 0x7F;
			int var18 = arg0 & 0xF;
			this.setInst(var18, this.channelBank[var18] + var17);
		} else if (var2 == 208) {
			int var19 = arg0 & 0xF;
			int var20 = arg0 >> 8 & 0x7F;
			this.channelPressure(var20, var19);
		} else if (var2 == 224) {
			int var21 = arg0 & 0xF;
			int var22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F018F) >> 9);
			this.pitchWheel(var21, var22);
		} else {
			int var23 = arg0 & 0xFF;
			if (var23 == 255) {
				this.reset();
			}
		}
	}

	@ObfuscatedName("pg.b(III)V")
	public void method1194() {
		this.channelDefaultPatch[9] = 128;
		this.channelBank[9] = 128;
		this.setInst(9, 128);
	}

	@ObfuscatedName("pg.c(III)V")
	public void setInst(int arg0, int arg1) {
		if (arg1 != this.channelPatch[arg0]) {
			this.channelPatch[arg0] = arg1;
			for (int var3 = 0; var3 < 128; var3++) {
				this.channelSecondaryNotes[arg0][var3] = null;
			}
		}
	}

	@ObfuscatedName("pg.b(Llg;I)I")
	public int getRateRaw(MidiNote arg0) {
		int var2 = arg0.pitch + (arg0.portamentoDelta * arg0.portamentoAmount >> 12);
		int var3 = var2 + (this.channelPitchBendRange[arg0.channel] * (this.channelPitchBend[arg0.channel] - 8192) >> 12);
		EnvelopeSet var4 = arg0.envelope;
		if (var4.vibratoFrequency > 0 && (var4.vibratoAmplitude > 0 || this.channelModulation[arg0.channel] > 0)) {
			int var5 = var4.vibratoAmplitude << 2;
			int var6 = var4.vibratoRampTime << 1;
			if (var6 > arg0.vibratoRampProgress) {
				var5 = var5 * arg0.vibratoRampProgress / var6;
			}
			int var7 = var5 + (this.channelModulation[arg0.channel] >> 7);
			double var8 = Math.sin((double) (arg0.vibratoProgress & 0x1FF) * 0.01227184630308513D);
			var3 += (int) ((double) var7 * var8);
		}
		int var10 = (int) ((double) (arg0.sound.samplingFrequency * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) PcmPlayer.frequency + 0.5D);
		return var10 >= 1 ? var10 : 1;
	}

	@ObfuscatedName("pg.c(B)I")
	public int getGlobalVolume() {
		return this.globalVolume;
	}

	@ObfuscatedName("pg.f(I)V")
	public void reset() {
		this.allSoundOff(-1);
		this.allControllersOff(-1);
		for (int var1 = 0; var1 < 16; var1++) {
			this.channelPatch[var1] = this.channelDefaultPatch[var1];
		}
		for (int var2 = 0; var2 < 16; var2++) {
			this.channelBank[var2] = this.channelDefaultPatch[var2] & 0xFFFFFF80;
		}
	}

	@ObfuscatedName("pg.g(I)Z")
	public synchronized boolean loaded() {
		return this.parser.gotMidi();
	}

	@ObfuscatedName("pg.a(BLlg;)Z")
	public boolean updateStreamlessNote(MidiNote arg0) {
		if (arg0.stream != null) {
			return false;
		}
		if (arg0.releaseProgress >= 0) {
			arg0.unlink();
			if (arg0.secondaryNote > 0 && arg0 == this.channelSecondaryNotes[arg0.channel][arg0.secondaryNote]) {
				this.channelSecondaryNotes[arg0.channel][arg0.secondaryNote] = null;
			}
		}
		return true;
	}

	@ObfuscatedName("pg.a(IIII)V")
	public void stopNote(int arg0, int arg1, int arg2) {
		MidiNote var4 = this.channelNotes[arg2][arg1];
		if (var4 == null) {
			return;
		}
		this.channelNotes[arg2][arg1] = null;
		if ((this.channelEffects[arg2] & 0x2) == 0) {
			var4.releaseProgress = 0;
			return;
		}
		for (MidiNote var5 = (MidiNote) this.patchStream.queue.head(); var5 != null; var5 = (MidiNote) this.patchStream.queue.next()) {
			if (var5.channel == var4.channel && var5.releaseProgress < 0 && var4 != var5) {
				var4.releaseProgress = 0;
				return;
			}
		}
	}

	@ObfuscatedName("pg.d(II)V")
	public void allControllersOff(int arg0) {
		if (arg0 < 0) {
			for (int var2 = 0; var2 < 16; var2++) {
				this.allControllersOff(var2);
			}
			return;
		}
		this.channelVolume[arg0] = 12800;
		this.channelPan[arg0] = 8192;
		this.channelExpression[arg0] = 16383;
		this.channelPitchBend[arg0] = 8192;
		this.channelModulation[arg0] = 0;
		this.channelPortamentoTime[arg0] = 8192;
		this.cleanPorta(arg0);
		this.cleanRetrig(arg0);
		this.channelEffects[arg0] = 0;
		this.channelParameterNumber[arg0] = 32767;
		this.channelPitchBendRange[arg0] = 256;
		this.channelCustom1[arg0] = 0;
		this.setRetrigRate(8192, arg0);
	}

	@ObfuscatedName("pg.b(ZI)V")
	public void allSoundOff(int arg0) {
		for (MidiNote var2 = (MidiNote) this.patchStream.queue.head(); var2 != null; var2 = (MidiNote) this.patchStream.queue.next()) {
			if (arg0 < 0 || var2.channel == arg0) {
				if (var2.stream != null) {
					var2.stream.rampOut(PcmPlayer.frequency / 100);
					if (var2.stream.isRamping()) {
						this.patchStream.mixer.playStream(var2.stream);
					}
					var2.dropData();
				}
				if (var2.releaseProgress < 0) {
					this.channelNotes[var2.channel][var2.noteKey] = null;
				}
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("pg.e(II)V")
	public void cleanPorta(int arg0) {
		if ((this.channelEffects[arg0] & 0x2) == 0) {
			return;
		}
		for (MidiNote var2 = (MidiNote) this.patchStream.queue.head(); var2 != null; var2 = (MidiNote) this.patchStream.queue.next()) {
			if (var2.channel == arg0 && this.channelNotes[arg0][var2.noteKey] == null && var2.releaseProgress < 0) {
				var2.releaseProgress = 0;
			}
		}
	}

	@ObfuscatedName("pg.a([III)V")
	@Override
	public synchronized void doMix(int[] arg0, int arg1, int arg2) {
		if (this.parser.gotMidi()) {
			int var4 = this.parser.division * this.tempoMicroseconds / PcmPlayer.frequency;
			do {
				long var5 = this.trackPreviousTime + (long) arg2 * (long) var4;
				if (this.trackCurrentTime - var5 >= 0L) {
					this.trackPreviousTime = var5;
					break;
				}
				int var7 = (int) ((this.trackCurrentTime + (long) var4 - this.trackPreviousTime - 1L) / (long) var4);
				this.trackPreviousTime += (long) var4 * (long) var7;
				this.patchStream.doMix(arg0, arg1, var7);
				arg1 += var7;
				arg2 -= var7;
				this.updateMidi();
			} while (this.parser.gotMidi());
		}
		this.patchStream.doMix(arg0, arg1, arg2);
	}

	@ObfuscatedName("pg.d(III)V")
	public void channelPressure(int arg0, int arg1) {
	}

	@ObfuscatedName("pg.a(IIIZ)V")
	public void setPolyphonicKeyPressure(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("pg.b(IIII)V")
	public void playNote(int arg0, int arg1, int arg2) {
		this.stopNote(64, arg2, arg1);
		if ((this.channelEffects[arg1] & 0x2) != 0) {
			for (MidiNote var4 = (MidiNote) this.patchStream.queue.tail(); var4 != null; var4 = (MidiNote) this.patchStream.queue.prev()) {
				if (var4.channel == arg1 && var4.releaseProgress < 0) {
					this.channelNotes[arg1][var4.noteKey] = null;
					this.channelNotes[arg1][arg2] = var4;
					int var5 = var4.pitch + (var4.portamentoAmount * var4.portamentoDelta >> 12);
					var4.portamentoAmount = 4096;
					var4.pitch += arg2 - var4.noteKey << 8;
					var4.noteKey = arg2;
					var4.portamentoDelta = var5 - var4.pitch;
					return;
				}
			}
		}
		Patch var6 = (Patch) this.patches.find((long) this.channelPatch[arg1]);
		if (var6 == null) {
			return;
		}
		Wave var7 = var6.noteSound[arg2];
		if (var7 == null) {
			return;
		}
		MidiNote var8 = new MidiNote();
		var8.patch = var6;
		var8.channel = arg1;
		var8.sound = var7;
		var8.envelope = var6.noteEnvelope[arg2];
		var8.secondaryNote = var6.noteSecondaryNote[arg2];
		var8.noteKey = arg2;
		var8.volume = arg0 * arg0 * var6.volume * var6.noteVolume[arg2] + 1024 >> 11;
		var8.pan = var6.notePan[arg2] & 0xFF;
		var8.pitch = (arg2 << 8) - (var6.notePitch[arg2] & 0x7FFF);
		var8.releaseProgress = -1;
		var8.decayProgress = 0;
		var8.attackProgress = 0;
		var8.attackEnvelopeProgress = 0;
		var8.releaseEnvelopeProgress = 0;
		if (this.channelCustom1[arg1] == 0) {
			var8.stream = WaveStream.newRateFineVolPan(var7, this.getRateRaw(var8), this.getVolume(var8), this.getPan(var8));
		} else {
			var8.stream = WaveStream.newRateFineVolPan(var7, this.getRateRaw(var8), 0, this.getPan(var8));
			this.setSampleOffset(var8, var6.notePitch[arg2] < 0);
		}
		if (var6.notePitch[arg2] < 0) {
			var8.stream.setLoopCount(-1);
		}
		if (var8.secondaryNote >= 0) {
			MidiNote var9 = this.channelSecondaryNotes[arg1][var8.secondaryNote];
			if (var9 != null && var9.releaseProgress < 0) {
				this.channelNotes[arg1][var9.noteKey] = null;
				var9.releaseProgress = 0;
			}
			this.channelSecondaryNotes[arg1][var8.secondaryNote] = var8;
		}
		this.patchStream.queue.push(var8);
		this.channelNotes[arg1][arg2] = var8;
	}

	@ObfuscatedName("pg.b(Z)V")
	public synchronized void stop() {
		this.parser.dropMidi();
		this.reset();
	}

	@ObfuscatedName("pg.e(III)V")
	public synchronized void method1209() {
		this.method1194();
	}

	@ObfuscatedName("pg.a(IIZ)V")
	public void setRetrigRate(int arg0, int arg1) {
		this.channelCustom2[arg1] = arg0;
		this.channelCustom3[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@ObfuscatedName("pg.a(Llg;ZI)V")
	public void setSampleOffset(MidiNote arg0, boolean arg1) {
		int var3 = arg0.sound.samples.length;
		int var6;
		if (arg1 && arg0.sound.loopReversed) {
			int var4 = var3 + var3 - arg0.sound.loopStartPosition;
			int var5 = var3 << 8;
			var6 = (int) ((long) var4 * (long) this.channelCustom1[arg0.channel] >> 6);
			if (var5 <= var6) {
				arg0.stream.method1111();
				var6 = var5 + var5 - var6 - 1;
			}
		} else {
			var6 = (int) ((long) this.channelCustom1[arg0.channel] * (long) var3 >> 6);
		}
		arg0.stream.setPosition(var6);
	}

	@ObfuscatedName("pg.c()I")
	@Override
	public synchronized int selfMixCost() {
		return 0;
	}
}
