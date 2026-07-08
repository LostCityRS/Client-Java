package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("nc")
public final class SeqType {

	@ObfuscatedName("nc.g")
	public int[] frames;

	@ObfuscatedName("nc.h")
	public int[] iframes;

	@ObfuscatedName("nc.i")
	public int[] delay;

	@ObfuscatedName("nc.j")
	public int loops = -1;

	@ObfuscatedName("nc.k")
	public int[] walkmerge;

	@ObfuscatedName("nc.l")
	public boolean reachforward = false;

	@ObfuscatedName("nc.m")
	public int priority = 5;

	@ObfuscatedName("nc.n")
	public int replaceheldleft = -1;

	@ObfuscatedName("nc.o")
	public int replaceheldright = -1;

	@ObfuscatedName("nc.p")
	public int maxloops = 99;

	@ObfuscatedName("nc.q")
	public int preanim_move = -1;

	@ObfuscatedName("nc.r")
	public int postanim_move = -1;

	@ObfuscatedName("nc.s")
	public int duplicatebehaviour;

	@ObfuscatedName("nc.e")
	public static SeqType[] list;

	@ObfuscatedName("nc.a")
	public final boolean field1146 = false;

	@ObfuscatedName("nc.b")
	public final byte field1147 = 4;

	@ObfuscatedName("nc.c")
	public static final boolean field1148 = true;

	@ObfuscatedName("nc.d")
	public static int numDefinitions;

	@ObfuscatedName("nc.f")
	public int numFrames;

	@ObfuscatedName("nc.t")
	public int field1165;

	@ObfuscatedName("nc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("seq.dat", null), 15787);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SeqType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SeqType();
			}
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("nc.a(ZLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				if (numFrames == 0) {
					numFrames = 1;
					frames = new int[1];
					frames[0] = -1;
					iframes = new int[1];
					iframes[0] = -1;
					delay = new int[1];
					delay[0] = -1;
				}
				if (preanim_move == -1) {
					if (walkmerge == null) {
						preanim_move = 0;
					} else {
						preanim_move = 2;
					}
				}
				if (postanim_move == -1) {
					if (walkmerge == null) {
						postanim_move = 0;
					} else {
						postanim_move = 2;
					}
				}
				return;
			}
			if (var2 == 1) {
				numFrames = arg0.g1();
				frames = new int[numFrames];
				iframes = new int[numFrames];
				delay = new int[numFrames];
				for (int var3 = 0; var3 < numFrames; var3++) {
					frames[var3] = arg0.g2();
					iframes[var3] = arg0.g2();
					if (iframes[var3] == 65535) {
						iframes[var3] = -1;
					}
					delay[var3] = arg0.g2();
				}
			} else if (var2 == 2) {
				loops = arg0.g2();
			} else if (var2 == 3) {
				int var4 = arg0.g1();
				walkmerge = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					walkmerge[var5] = arg0.g1();
				}
				walkmerge[var4] = 9999999;
			} else if (var2 == 4) {
				reachforward = true;
			} else if (var2 == 5) {
				priority = arg0.g1();
			} else if (var2 == 6) {
				replaceheldleft = arg0.g2();
			} else if (var2 == 7) {
				replaceheldright = arg0.g2();
			} else if (var2 == 8) {
				maxloops = arg0.g1();
			} else if (var2 == 9) {
				preanim_move = arg0.g1();
			} else if (var2 == 10) {
				postanim_move = arg0.g1();
			} else if (var2 == 11) {
				duplicatebehaviour = arg0.g1();
			} else if (var2 == 12) {
				field1165 = arg0.g4();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int getDelay(int arg0) {
		int var2 = delay[arg0];
		if (var2 == 0) {
			AnimFrame var3 = AnimFrame.get(frames[arg0], field1147);
			if (var3 != null) {
				var2 = delay[arg0] = var3.delay;
			}
		}
		if (var2 == 0) {
			var2 = 1;
		}
		return var2;
	}
}
