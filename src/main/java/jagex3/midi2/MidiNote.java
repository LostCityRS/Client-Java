package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.sound.Wave;
import jagex3.sound.WaveStream;

@ObfuscatedName("lg")
public final class MidiNote extends Linkable {

	@ObfuscatedName("lg.t")
	public int volumeChangeDuration;

	@ObfuscatedName("lg.u")
	public EnvelopeSet envelope;

	@ObfuscatedName("lg.z")
	public int decayProgress;

	@ObfuscatedName("lg.C")
	public int attackProgress;

	@ObfuscatedName("lg.E")
	public int releaseEnvelopeProgress;

	@ObfuscatedName("lg.F")
	public int vibratoProgress;

	@ObfuscatedName("lg.H")
	public int noteKey;

	@ObfuscatedName("lg.I")
	public int attackEnvelopeProgress;

	@ObfuscatedName("lg.J")
	public int volume;

	@ObfuscatedName("lg.L")
	public int secondaryNote;

	@ObfuscatedName("lg.M")
	public int channel;

	@ObfuscatedName("lg.N")
	public int releaseProgress;

	@ObfuscatedName("lg.O")
	public int portamentoAmount;

	@ObfuscatedName("lg.Q")
	public int vibratoRampProgress;

	@ObfuscatedName("lg.R")
	public int field1766;

	@ObfuscatedName("lg.T")
	public int portamentoDelta;

	@ObfuscatedName("lg.U")
	public int pan;

	@ObfuscatedName("lg.V")
	public int pitch;

	@ObfuscatedName("lg.S")
	public WaveStream stream;

	@ObfuscatedName("lg.B")
	public Patch patch;

	@ObfuscatedName("lg.G")
	public Wave sound;

	@ObfuscatedName("lg.b(I)V")
	public void dropData() {
		this.stream = null;
		this.patch = null;
		this.envelope = null;
		this.sound = null;
	}
}
