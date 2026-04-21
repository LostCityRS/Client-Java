package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("fa")
public final class Square extends Linkable {

	@ObfuscatedName("fa.ub")
	public Square linkedSquare;

	@ObfuscatedName("fa.vb")
	public int field867;

	@ObfuscatedName("fa.wb")
	public GroundObject groundObject;

	@ObfuscatedName("fa.Bb")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("fa.Kb")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("fa.Jb")
	public int field881 = 0;

	@ObfuscatedName("fa.xb")
	public final int field869;

	@ObfuscatedName("fa.Cb")
	public int field874;

	@ObfuscatedName("fa.Fb")
	public final int field877;

	@ObfuscatedName("fa.Ob")
	public final int field886;

	@ObfuscatedName("fa.zb")
	public int field871;

	@ObfuscatedName("fa.Ab")
	public int field872;

	@ObfuscatedName("fa.Db")
	public int field875;

	@ObfuscatedName("fa.Mb")
	public int field884;

	@ObfuscatedName("fa.Qb")
	public int field888;

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
	public boolean field870;

	@ObfuscatedName("fa.Hb")
	public boolean field879;

	@ObfuscatedName("fa.Nb")
	public boolean field885;

	public Square(int arg0, int arg1, int arg2) {
		this.field869 = arg1;
		this.field877 = this.field874 = arg0;
		this.field886 = arg2;
	}
}
