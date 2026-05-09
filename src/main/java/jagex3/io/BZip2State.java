package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class BZip2State {

	@ObfuscatedName("pb.c")
	public final int[][] limit = new int[6][258];

	@ObfuscatedName("pb.e")
	public final boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("pb.f")
	public final int[] minLens = new int[6];

	@ObfuscatedName("pb.g")
	public int next_in = 0;

	@ObfuscatedName("pb.h")
	public final byte[] selector = new byte[18002];

	@ObfuscatedName("pb.i")
	public final byte[][] len = new byte[6][258];

	@ObfuscatedName("pb.j")
	public final byte[] selectorMtf = new byte[18002];

	@ObfuscatedName("pb.k")
	public int k0;

	@ObfuscatedName("pb.m")
	public final int[] cftab = new int[257];

	@ObfuscatedName("pb.n")
	public final byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("pb.p")
	public final int[] unzftab = new int[256];

	@ObfuscatedName("pb.q")
	public int tPos;

	@ObfuscatedName("pb.r")
	public int origPtr;

	@ObfuscatedName("pb.t")
	public int state_out_len;

	@ObfuscatedName("pb.v")
	public int total_in_lo32;

	@ObfuscatedName("pb.w")
	public int save_nblock;

	@ObfuscatedName("pb.x")
	public final byte[] mtfa = new byte[4096];

	@ObfuscatedName("pb.E")
	public int next_out = 0;

	@ObfuscatedName("pb.C")
	public final int[][] base = new int[6][258];

	@ObfuscatedName("pb.A")
	public final boolean[] inUse = new boolean[256];

	@ObfuscatedName("pb.D")
	public final int[][] perm = new int[6][258];

	@ObfuscatedName("pb.J")
	public final int[] mtfbase = new int[16];

	@ObfuscatedName("pb.L")
	public byte state_out_ch;

	@ObfuscatedName("pb.z")
	public int total_out_lo32;

	@ObfuscatedName("pb.B")
	public int nInUse;

	@ObfuscatedName("pb.G")
	public int avail_out;

	@ObfuscatedName("pb.H")
	public int bsLive;

	@ObfuscatedName("pb.K")
	public int blockSize100k;

	@ObfuscatedName("pb.O")
	public int bsBuff;

	@ObfuscatedName("pb.P")
	public int c_nblock_used;

	@ObfuscatedName("pb.y")
	public byte[] decompressed;

	@ObfuscatedName("pb.N")
	public byte[] stream;

}
