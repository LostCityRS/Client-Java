package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("v")
public final class Square extends Linkable {

	@ObfuscatedName("v.f")
	public int level;

	@ObfuscatedName("v.g")
	public final int x;

	@ObfuscatedName("v.h")
	public final int z;

	@ObfuscatedName("v.i")
	public final int originalLevel;

	@ObfuscatedName("v.j")
	public QuickGround quickGround;

	@ObfuscatedName("v.k")
	public Ground ground;

	@ObfuscatedName("v.l")
	public Wall wall;

	@ObfuscatedName("v.m")
	public Decor decor;

	@ObfuscatedName("v.n")
	public GroundDecor groundDecor;

	@ObfuscatedName("v.o")
	public GroundObject groundObject;

	@ObfuscatedName("v.q")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("v.r")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("v.B")
	public Square linkedSquare;

	@ObfuscatedName("v.e")
	public final boolean field362 = false;

	@ObfuscatedName("v.p")
	public int field373;

	@ObfuscatedName("v.s")
	public int field376;

	@ObfuscatedName("v.t")
	public int field377;

	@ObfuscatedName("v.u")
	public boolean field378;

	@ObfuscatedName("v.v")
	public boolean field379;

	@ObfuscatedName("v.w")
	public boolean field380;

	@ObfuscatedName("v.x")
	public int field381;

	@ObfuscatedName("v.y")
	public int field382;

	@ObfuscatedName("v.z")
	public int field383;

	@ObfuscatedName("v.A")
	public int field384;

	public Square(int arg0, int arg1, int arg2) {
		originalLevel = level = arg0;
		x = arg1;
		z = arg2;
	}
}
