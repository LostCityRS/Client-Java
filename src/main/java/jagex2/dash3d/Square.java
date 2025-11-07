package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("w")
public class Square extends Linkable {

	@ObfuscatedName("w.f")
	public int level;

	@ObfuscatedName("w.g")
	public int x;

	@ObfuscatedName("w.h")
	public int z;

	@ObfuscatedName("w.i")
	public int originalLevel;

	@ObfuscatedName("w.j")
	public QuickGround quickGround;

	@ObfuscatedName("w.k")
	public Ground ground;

	@ObfuscatedName("w.l")
	public Wall wall;

	@ObfuscatedName("w.m")
	public Decor decor;

	@ObfuscatedName("w.n")
	public GroundDecor groundDecor;

	@ObfuscatedName("w.o")
	public GroundObject groundObject;

	@ObfuscatedName("w.p")
	public int primaryCount;

	@ObfuscatedName("w.q")
	public Sprite[] sprite = new Sprite[5];

	@ObfuscatedName("w.r")
	public int[] primaryExtendDirections = new int[5];

	@ObfuscatedName("w.s")
	public int combinedPrimaryExtendDirections;

	@ObfuscatedName("w.t")
	public int drawLevel;

	@ObfuscatedName("w.u")
	public boolean drawFront;

	@ObfuscatedName("w.v")
	public boolean drawBack;

	@ObfuscatedName("w.w")
	public boolean drawPrimaries;

	@ObfuscatedName("w.x")
	public int cornerSides;

	@ObfuscatedName("w.y")
	public int sidesBeforeCorner;

	@ObfuscatedName("w.z")
	public int sidesAfterCorner;

	@ObfuscatedName("w.A")
	public int backWallTypes;

	@ObfuscatedName("w.B")
	public Square linkBelow;

	public Square(int arg0, int arg1, int arg2) {
		this.originalLevel = this.level = arg0;
		this.x = arg1;
		this.z = arg2;
	}
}
