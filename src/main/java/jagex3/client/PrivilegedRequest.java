package jagex3.client;

import deob.ObfuscatedName;

@ObfuscatedName("p")
public final class PrivilegedRequest {

	@ObfuscatedName("p.a")
	public volatile Object result;

	@ObfuscatedName("p.b")
	public PrivilegedRequest next;

	@ObfuscatedName("p.c")
	public int type;

	@ObfuscatedName("p.d")
	public int intArg;

	@ObfuscatedName("p.e")
	public Object objArg;

	@ObfuscatedName("p.f")
	public volatile int status = 0;
}
