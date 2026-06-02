package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.jstring.JagString;

@ObfuscatedName("ge")
public final class ClanChannelUser extends Linkable {

	@ObfuscatedName("ge.B")
	public byte rank;

	@ObfuscatedName("ge.D")
	public int world;

	@ObfuscatedName("ge.H")
	public JagString displayName;

	@ObfuscatedName("ge.J")
	public JagString name;

}
