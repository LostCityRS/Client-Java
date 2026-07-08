package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("nb")
public final class LocChange extends Linkable {

	@ObfuscatedName("nb.e")
	public int level;

	@ObfuscatedName("nb.f")
	public int layer;

	@ObfuscatedName("nb.g")
	public int x;

	@ObfuscatedName("nb.h")
	public int z;

	@ObfuscatedName("nb.i")
	public int oldType;

	@ObfuscatedName("nb.j")
	public int oldAngle;

	@ObfuscatedName("nb.k")
	public int oldShape;

	@ObfuscatedName("nb.l")
	public int newType;

	@ObfuscatedName("nb.m")
	public int newAngle;

	@ObfuscatedName("nb.n")
	public int newShape;

	@ObfuscatedName("nb.o")
	public int startTime;

	@ObfuscatedName("nb.p")
	public int endTime = -1;
}
