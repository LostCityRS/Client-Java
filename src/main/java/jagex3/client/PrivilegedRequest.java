package jagex3.client;

import deob.ObfuscatedName;

@ObfuscatedName("ed")
public final class PrivilegedRequest {

	@ObfuscatedName("ed.a")
	public int intArg;

	@ObfuscatedName("ed.b")
	public int type;

	@ObfuscatedName("ed.c")
	public volatile int status = 0;

	@ObfuscatedName("ed.d")
	public Object objArg;

	@ObfuscatedName("ed.e")
	public PrivilegedRequest next;

	@ObfuscatedName("ed.f")
	public volatile Object result;
}
