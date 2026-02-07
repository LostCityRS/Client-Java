package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("wa")
public final class Square extends Linkable {

	@ObfuscatedName("wa.cb")
	public int spriteCount;

	@ObfuscatedName("wa.db")
	public QuickGround quickGround;

	@ObfuscatedName("wa.fb")
	public final int field3549;

	@ObfuscatedName("wa.gb")
	public int field3550;

	@ObfuscatedName("wa.I")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("wa.M")
	public int spriteSpans = 0;

	@ObfuscatedName("wa.W")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("wa.O")
	public final int field3533;

	@ObfuscatedName("wa.z")
	public int level;

	@ObfuscatedName("wa.N")
	public final int originalLevel;

	@ObfuscatedName("wa.C")
	public int backWallTypes;

	@ObfuscatedName("wa.D")
	public int blockLocSpans;

	@ObfuscatedName("wa.F")
	public int checkLocSpans;

	@ObfuscatedName("wa.G")
	public int inverseBlockLocSpans;

	@ObfuscatedName("wa.S")
	public Decor decor;

	@ObfuscatedName("wa.R")
	public Square linkedSquare;

	@ObfuscatedName("wa.X")
	public Wall wall;

	@ObfuscatedName("wa.y")
	public Ground ground;

	@ObfuscatedName("wa.E")
	public GroundDecor groundDecor;

	@ObfuscatedName("wa.Y")
	public GroundObject groundObject;

	@ObfuscatedName("wa.L")
	public boolean drawFront;

	@ObfuscatedName("wa.P")
	public boolean drawBack;

	@ObfuscatedName("wa.V")
	public boolean drawSprites;

	public Square(int arg0, int arg1, int arg2) {
		this.field3533 = arg1;
		this.field3549 = arg2;
		this.originalLevel = this.level = arg0;
	}
}
