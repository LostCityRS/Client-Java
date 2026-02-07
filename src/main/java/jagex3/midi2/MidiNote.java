package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.sound.Wave;
import jagex3.sound.WaveStream;

@ObfuscatedName("la")
public final class MidiNote extends Linkable {

	@ObfuscatedName("la.ab")
	public int field1819;

	@ObfuscatedName("la.s")
	public int field1785;

	@ObfuscatedName("la.v")
	public WaveStream field1788;

	@ObfuscatedName("la.y")
	public int field1791;

	@ObfuscatedName("la.z")
	public int field1792;

	@ObfuscatedName("la.A")
	public int field1793;

	@ObfuscatedName("la.B")
	public int field1794;

	@ObfuscatedName("la.C")
	public int field1795;

	@ObfuscatedName("la.G")
	public int field1799;

	@ObfuscatedName("la.H")
	public int field1800;

	@ObfuscatedName("la.J")
	public int field1802;

	@ObfuscatedName("la.K")
	public int field1803;

	@ObfuscatedName("la.M")
	public int field1805;

	@ObfuscatedName("la.R")
	public int field1810;

	@ObfuscatedName("la.V")
	public int field1814;

	@ObfuscatedName("la.X")
	public int field1816;

	@ObfuscatedName("la.Y")
	public int field1817;

	@ObfuscatedName("la.Z")
	public int field1818;

	@ObfuscatedName("la.S")
	public Wave field1811;

	@ObfuscatedName("la.D")
	public EnvelopeSet field1796;

	@ObfuscatedName("la.L")
	public Patch field1804;

	@ObfuscatedName("la.d(I)V")
	public void method615() {
		this.field1804 = null;
		this.field1788 = null;
		this.field1796 = null;
		this.field1811 = null;
	}
}
