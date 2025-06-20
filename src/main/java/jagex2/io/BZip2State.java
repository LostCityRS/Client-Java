package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("tb")
public class BZip2State {

	@ObfuscatedName("tb.a")
	public static final int MTFA_SIZE = 4096;

	@ObfuscatedName("tb.b")
	public static final int MTFL_SIZE = 16;

	@ObfuscatedName("tb.c")
	public static final int BZ_MAX_ALPHA_SIZE = 258;

	@ObfuscatedName("tb.d")
	public static final int BZ_MAX_CODE_LEN = 23;

	@ObfuscatedName("tb.e")
	public static final int field768 = 1;

	@ObfuscatedName("tb.f")
	public static final int BZ_N_GROUPS = 6;

	@ObfuscatedName("tb.g")
	public static final int BZ_G_SIZE = 50;

	@ObfuscatedName("tb.h")
	public static final int field771 = 4;

	@ObfuscatedName("tb.i")
	public static final int BZ_MAX_SELECTORS = (2 + (900000 / BZ_G_SIZE)); // 18002

	public static final int BZ_RUNA = 0;
	public static final int BZ_RUNB = 1;

	@ObfuscatedName("tb.j")
	public byte[] stream;

	@ObfuscatedName("tb.k")
	public int next_in;

	@ObfuscatedName("tb.l")
	public int avail_in;

	@ObfuscatedName("tb.m")
	public int total_in_lo32;

	@ObfuscatedName("tb.n")
	public int total_in_hi32;

	@ObfuscatedName("tb.o")
	public byte[] decompressed;

	@ObfuscatedName("tb.p")
	public int next_out;

	@ObfuscatedName("tb.q")
	public int avail_out;

	@ObfuscatedName("tb.r")
	public int total_out_lo32;

	@ObfuscatedName("tb.s")
	public int total_out_hi32;

	@ObfuscatedName("tb.t")
	public byte state_out_ch;

	@ObfuscatedName("tb.u")
	public int state_out_len;

	@ObfuscatedName("tb.v")
	public boolean blockRandomized;

	@ObfuscatedName("tb.w")
	public int bsBuff;

	@ObfuscatedName("tb.x")
	public int bsLive;

	@ObfuscatedName("tb.y")
	public int blockSize100k;

	@ObfuscatedName("tb.z")
	public int currBlockNo;

	@ObfuscatedName("tb.D")
	public int[] unzftab = new int[256];

	@ObfuscatedName("tb.F")
	public int[] cftab = new int[257];

	@ObfuscatedName("tb.G")
	public int[] cftabCopy = new int[257];

	@ObfuscatedName("tb.J")
	public boolean[] inUse = new boolean[256];

	@ObfuscatedName("tb.K")
	public boolean[] inUse16 = new boolean[16];

	@ObfuscatedName("tb.L")
	public byte[] seqToUnseq = new byte[256];

	@ObfuscatedName("tb.M")
	public byte[] mtfa = new byte[MTFA_SIZE];

	@ObfuscatedName("tb.N")
	public int[] mtfbase = new int[256 / MTFL_SIZE];

	@ObfuscatedName("tb.O")
	public byte[] selector = new byte[BZ_MAX_SELECTORS];

	@ObfuscatedName("tb.P")
	public byte[] selectorMtf = new byte[BZ_MAX_SELECTORS];

	@ObfuscatedName("tb.Q")
	public byte[][] len = new byte[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	@ObfuscatedName("tb.R")
	public int[][] limit = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	@ObfuscatedName("tb.S")
	public int[][] base = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	@ObfuscatedName("tb.T")
	public final int[][] perm = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	@ObfuscatedName("tb.U")
	public int[] minLens = new int[BZ_N_GROUPS];

	@ObfuscatedName("tb.A")
	public int origPtr;

	@ObfuscatedName("tb.B")
	public int tPos;

	@ObfuscatedName("tb.C")
	public int k0;

	@ObfuscatedName("tb.E")
	public int c_nblock_used;

	@ObfuscatedName("tb.I")
	public int nInUse;

	@ObfuscatedName("tb.V")
	public int save_nblock;

	@ObfuscatedName("tb.H")
	public static int[] tt;
}
