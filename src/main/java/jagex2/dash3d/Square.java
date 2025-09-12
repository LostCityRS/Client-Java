package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("w")
public class Square extends Linkable {

	@ObfuscatedName("w.e")
	public int level;

	@ObfuscatedName("w.f")
	public int x;

	@ObfuscatedName("w.g")
	public int z;

	@ObfuscatedName("w.h")
	public int originalLevel;

	@ObfuscatedName("w.i")
	public QuickGround quickGround;

	@ObfuscatedName("w.j")
	public Ground ground;

	@ObfuscatedName("w.k")
	public Wall wall;

	@ObfuscatedName("w.l")
	public Decor decor;

	@ObfuscatedName("w.m")
	public GroundDecor groundDecor;

	@ObfuscatedName("w.n")
	public GroundObject groundObject;

	@ObfuscatedName("w.o")
	public int primaryCount;

	@ObfuscatedName("w.p")
	public Sprite[] sprite = new Sprite[5];

	@ObfuscatedName("w.q")
	public int[] primaryExtendDirections = new int[5];

	@ObfuscatedName("w.r")
	public int combinedPrimaryExtendDirections;

	@ObfuscatedName("w.s")
	public int drawLevel;

	@ObfuscatedName("w.t")
	public boolean drawFront;

	@ObfuscatedName("w.u")
	public boolean drawBack;

	@ObfuscatedName("w.v")
	public boolean drawPrimaries;

	@ObfuscatedName("w.w")
	public int cornerSides;

	@ObfuscatedName("w.x")
	public int sidesBeforeCorner;

	@ObfuscatedName("w.y")
	public int sidesAfterCorner;

	@ObfuscatedName("w.z")
	public int backWallTypes;

	@ObfuscatedName("w.A")
	public Square linkBelow;

	public Square(int arg0, int arg1, int arg2) {
		this.originalLevel = this.level = arg0;
		this.x = arg1;
		this.z = arg2;
	}
}
