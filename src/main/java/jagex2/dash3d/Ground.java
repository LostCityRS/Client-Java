package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("w")
public class Ground extends Linkable {

	@ObfuscatedName("w.f")
	public int level;

	@ObfuscatedName("w.g")
	public int x;

	@ObfuscatedName("w.h")
	public int z;

	@ObfuscatedName("w.i")
	public int occludeLevel;

	@ObfuscatedName("w.j")
	public TileUnderlay underlay;

	@ObfuscatedName("w.k")
	public TileOverlay overlay;

	@ObfuscatedName("w.l")
	public Wall wall;

	@ObfuscatedName("w.m")
	public Decor decor;

	@ObfuscatedName("w.n")
	public GroundDecor groundDecor;

	@ObfuscatedName("w.o")
	public GroundObject groundObj;

	@ObfuscatedName("w.p")
	public int locCount;

	@ObfuscatedName("w.q")
	public Location[] locs = new Location[5];

	@ObfuscatedName("w.r")
	public int[] locSpan = new int[5];

	@ObfuscatedName("w.s")
	public int locSpans;

	@ObfuscatedName("w.t")
	public int drawLevel;

	@ObfuscatedName("w.u")
	public boolean visible;

	@ObfuscatedName("w.v")
	public boolean update;

	@ObfuscatedName("w.w")
	public boolean containsLocs;

	@ObfuscatedName("w.x")
	public int checkLocSpans;

	@ObfuscatedName("w.y")
	public int blockLocSpans;

	@ObfuscatedName("w.z")
	public int inverseBlockLocSpans;

	@ObfuscatedName("w.A")
	public int backWallTypes;

	@ObfuscatedName("w.B")
	public Ground bridge;

	public Ground(int arg0, int arg1, int arg2) {
		this.occludeLevel = this.level = arg0;
		this.x = arg1;
		this.z = arg2;
	}
}
