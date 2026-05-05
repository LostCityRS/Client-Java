package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("eg")
public final class Square extends Linkable {

	@ObfuscatedName("eg.L")
	public int spriteSpans = 0;

	@ObfuscatedName("eg.O")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("eg.U")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("eg.A")
	public final int z;

	@ObfuscatedName("eg.X")
	public int level;

	@ObfuscatedName("eg.R")
	public final int originalLevel;

	@ObfuscatedName("eg.S")
	public final int x;

	@ObfuscatedName("eg.B")
	public int backWallTypes;

	@ObfuscatedName("eg.H")
	public int drawLevel;

	@ObfuscatedName("eg.J")
	public int blockLocSpans;

	@ObfuscatedName("eg.K")
	public int checkLocSpans;

	@ObfuscatedName("eg.M")
	public int inverseBlockLocSpans;

	@ObfuscatedName("eg.T")
	public int spriteCount;

	@ObfuscatedName("eg.Q")
	public Wall wall;

	@ObfuscatedName("eg.G")
	public GroundDecor groundDecor;

	@ObfuscatedName("eg.E")
	public GroundObject groundObject;

	@ObfuscatedName("eg.I")
	public Square linkedSquare;

	@ObfuscatedName("eg.V")
	public Ground ground;

	@ObfuscatedName("eg.N")
	public Decor decor;

	@ObfuscatedName("eg.C")
	public QuickGround quickGround;

	@ObfuscatedName("eg.z")
	public boolean drawFront;

	@ObfuscatedName("eg.P")
	public boolean drawSprites;

	@ObfuscatedName("eg.W")
	public boolean drawBack;

	public Square(int arg0, int arg1, int arg2) {
		this.z = arg2;
		this.originalLevel = this.level = arg0;
		this.x = arg1;
	}
}
