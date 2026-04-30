package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("fa")
public final class Square extends Linkable {

	@ObfuscatedName("fa.ub")
	public Square linkedSquare;

	@ObfuscatedName("fa.vb")
	public int sidesAfterCorner;

	@ObfuscatedName("fa.wb")
	public GroundObject groundObject;

	@ObfuscatedName("fa.Bb")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("fa.Kb")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("fa.Jb")
	public int spriteSpans = 0;

	@ObfuscatedName("fa.xb")
	public final int originalLevel;

	@ObfuscatedName("fa.Cb")
	public int level;

	@ObfuscatedName("fa.Fb")
	public final int x;

	@ObfuscatedName("fa.Ob")
	public final int z;

	@ObfuscatedName("fa.zb")
	public int drawLevel;

	@ObfuscatedName("fa.Ab")
	public int backWallTypes;

	@ObfuscatedName("fa.Db")
	public int cornerSides;

	@ObfuscatedName("fa.Mb")
	public int sidesBeforeCorner;

	@ObfuscatedName("fa.Qb")
	public int spriteCount;

	@ObfuscatedName("fa.Gb")
	public QuickGround quickGround;

	@ObfuscatedName("fa.Pb")
	public Decor decor;

	@ObfuscatedName("fa.Ib")
	public Wall wall;

	@ObfuscatedName("fa.Eb")
	public Ground ground;

	@ObfuscatedName("fa.Lb")
	public GroundDecor groundDecor;

	@ObfuscatedName("fa.yb")
	public boolean drawSprites;

	@ObfuscatedName("fa.Hb")
	public boolean drawFront;

	@ObfuscatedName("fa.Nb")
	public boolean drawBack;

	public Square(int arg0, int arg1, int arg2) {
		this.originalLevel = arg1;
		this.x = this.level = arg0;
		this.z = arg2;
	}
}
