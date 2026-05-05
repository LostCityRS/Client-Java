package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.DataFile;

@ObfuscatedName("ib")
public final class Js5WorkerRequest extends Linkable {

	@ObfuscatedName("ib.v")
	public int type;

	@ObfuscatedName("ib.w")
	public Js5Loader loader;

	@ObfuscatedName("ib.H")
	public DataFile fs;

	@ObfuscatedName("ib.z")
	public byte[] data;

}
