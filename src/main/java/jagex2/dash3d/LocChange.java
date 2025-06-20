package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("ob")
public class LocChange extends Linkable {

	@ObfuscatedName("ob.f")
	public int level;

	@ObfuscatedName("ob.g")
	public int layer;

	@ObfuscatedName("ob.h")
	public int x;

	@ObfuscatedName("ob.i")
	public int z;

	@ObfuscatedName("ob.j")
	public int oldType;

	@ObfuscatedName("ob.k")
	public int oldAngle;

	@ObfuscatedName("ob.l")
	public int oldShape;

	@ObfuscatedName("ob.m")
	public int newType;

	@ObfuscatedName("ob.n")
	public int newAngle;

	@ObfuscatedName("ob.o")
	public int newShape;

	@ObfuscatedName("ob.p")
	public int startTime;

	@ObfuscatedName("ob.q")
	public int endTime = -1;
}
