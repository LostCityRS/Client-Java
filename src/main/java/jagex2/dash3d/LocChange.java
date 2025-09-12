package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("ob")
public class LocChange extends Linkable {

	@ObfuscatedName("ob.e")
	public int level;

	@ObfuscatedName("ob.f")
	public int layer;

	@ObfuscatedName("ob.g")
	public int x;

	@ObfuscatedName("ob.h")
	public int z;

	@ObfuscatedName("ob.i")
	public int oldType;

	@ObfuscatedName("ob.j")
	public int oldAngle;

	@ObfuscatedName("ob.k")
	public int oldShape;

	@ObfuscatedName("ob.l")
	public int newType;

	@ObfuscatedName("ob.m")
	public int newAngle;

	@ObfuscatedName("ob.n")
	public int newShape;

	@ObfuscatedName("ob.o")
	public int startTime;

	@ObfuscatedName("ob.p")
	public int endTime = -1;
}
