package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("nb")
public class OnDemandRequest extends DoublyLinkable {

	@ObfuscatedName("nb.h")
	public int archive;

	@ObfuscatedName("nb.i")
	public int file;

	@ObfuscatedName("nb.j")
	public byte[] data;

	@ObfuscatedName("nb.k")
	public int cycle;

	@ObfuscatedName("nb.l")
	public boolean urgent = true;
}
