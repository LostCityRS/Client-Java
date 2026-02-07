package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("wa")
public final class Square extends Linkable {

	@ObfuscatedName("wa.cb")
	public int field3546;

	@ObfuscatedName("wa.db")
	public QuickGround field3547;

	@ObfuscatedName("wa.fb")
	public final int field3549;

	@ObfuscatedName("wa.gb")
	public int field3550;

	@ObfuscatedName("wa.I")
	public final Sprite[] field3527 = new Sprite[5];

	@ObfuscatedName("wa.M")
	public int field3531 = 0;

	@ObfuscatedName("wa.W")
	public final int[] field3540 = new int[5];

	@ObfuscatedName("wa.O")
	public final int field3533;

	@ObfuscatedName("wa.z")
	public int field3518;

	@ObfuscatedName("wa.N")
	public final int field3532;

	@ObfuscatedName("wa.C")
	public int field3521;

	@ObfuscatedName("wa.D")
	public int field3522;

	@ObfuscatedName("wa.F")
	public int field3524;

	@ObfuscatedName("wa.G")
	public int field3525;

	@ObfuscatedName("wa.S")
	public Decor field3537;

	@ObfuscatedName("wa.R")
	public Square field3536;

	@ObfuscatedName("wa.X")
	public Wall field3541;

	@ObfuscatedName("wa.y")
	public Ground field3517;

	@ObfuscatedName("wa.E")
	public GroundDecor field3523;

	@ObfuscatedName("wa.Y")
	public GroundObject field3542;

	@ObfuscatedName("wa.L")
	public boolean field3530;

	@ObfuscatedName("wa.P")
	public boolean field3534;

	@ObfuscatedName("wa.V")
	public boolean field3539;

	public Square(int arg0, int arg1, int arg2) {
		this.field3533 = arg1;
		this.field3549 = arg2;
		this.field3532 = this.field3518 = arg0;
	}
}
