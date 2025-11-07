package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("nb")
public class OnDemandRequest extends DoublyLinkable {

	@ObfuscatedName("nb.i")
	public int archive;

	@ObfuscatedName("nb.j")
	public int file;

	@ObfuscatedName("nb.k")
	public byte[] data;

	@ObfuscatedName("nb.l")
	public int cycle;

	@ObfuscatedName("nb.m")
	public boolean urgent = true;
}
