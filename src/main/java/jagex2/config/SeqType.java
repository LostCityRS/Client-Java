package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("nc")
public class SeqType {

	@ObfuscatedName("nc.b")
	public static int count;

	@ObfuscatedName("nc.c")
	public static SeqType[] list;

	@ObfuscatedName("nc.d")
	public int numFrames;

	@ObfuscatedName("nc.e")
	public int[] frames;

	@ObfuscatedName("nc.f")
	public int[] iframes;

	@ObfuscatedName("nc.g")
	public int[] delay;

	@ObfuscatedName("nc.h")
	public int loops = -1;

	@ObfuscatedName("nc.i")
	public int[] walkmerge;

	@ObfuscatedName("nc.j")
	public boolean stretches = false;

	@ObfuscatedName("nc.k")
	public int priority = 5;

	@ObfuscatedName("nc.l")
	public int replaceheldleft = -1;

	@ObfuscatedName("nc.m")
	public int replaceheldright = -1;

	@ObfuscatedName("nc.n")
	public int maxloops = 99;

	@ObfuscatedName("nc.o")
	public int preanim_move = -1;

	@ObfuscatedName("nc.p")
	public int postanim_move = -1;

	@ObfuscatedName("nc.q")
	public int duplicatebehavior;

	@ObfuscatedName("nc.a(ZLyb;)V")
	public static void unpack(JagFile arg1) {
		Packet var2 = new Packet(arg1.read("seq.dat", null));
		count = var2.g2();
		if (list == null) {
			list = new SeqType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (list[var3] == null) {
				list[var3] = new SeqType();
			}
			list[var3].decode(var2);
		}
	}

	@ObfuscatedName("nc.a(BI)I")
	public int getDuration(int arg1) {
		int var3 = this.delay[arg1];
		if (var3 == 0) {
			AnimFrame var4 = AnimFrame.get(this.frames[arg1]);
			if (var4 != null) {
				var3 = this.delay[arg1] = var4.delay;
			}
		}
		if (var3 == 0) {
			var3 = 1;
		}
		return var3;
	}

	@ObfuscatedName("nc.a(ILmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				if (this.numFrames == 0) {
					this.numFrames = 1;
					this.frames = new int[1];
					this.frames[0] = -1;
					this.iframes = new int[1];
					this.iframes[0] = -1;
					this.delay = new int[1];
					this.delay[0] = -1;
				}
				if (this.preanim_move == -1) {
					if (this.walkmerge == null) {
						this.preanim_move = 0;
					} else {
						this.preanim_move = 2;
					}
				}
				if (this.postanim_move == -1) {
					if (this.walkmerge == null) {
						this.postanim_move = 0;
					} else {
						this.postanim_move = 2;
					}
				}
				return;
			}
			if (var3 == 1) {
				this.numFrames = arg1.g1();
				this.frames = new int[this.numFrames];
				this.iframes = new int[this.numFrames];
				this.delay = new int[this.numFrames];
				for (int var4 = 0; var4 < this.numFrames; var4++) {
					this.frames[var4] = arg1.g2();
					this.iframes[var4] = arg1.g2();
					if (this.iframes[var4] == 65535) {
						this.iframes[var4] = -1;
					}
					this.delay[var4] = arg1.g2();
				}
			} else if (var3 == 2) {
				this.loops = arg1.g2();
			} else if (var3 == 3) {
				int var5 = arg1.g1();
				this.walkmerge = new int[var5 + 1];
				for (int var6 = 0; var6 < var5; var6++) {
					this.walkmerge[var6] = arg1.g1();
				}
				this.walkmerge[var5] = 9999999;
			} else if (var3 == 4) {
				this.stretches = true;
			} else if (var3 == 5) {
				this.priority = arg1.g1();
			} else if (var3 == 6) {
				this.replaceheldleft = arg1.g2();
			} else if (var3 == 7) {
				this.replaceheldright = arg1.g2();
			} else if (var3 == 8) {
				this.maxloops = arg1.g1();
			} else if (var3 == 9) {
				this.preanim_move = arg1.g1();
			} else if (var3 == 10) {
				this.postanim_move = arg1.g1();
			} else if (var3 == 11) {
				this.duplicatebehavior = arg1.g1();
			} else {
				System.out.println("Error unrecognised seq config code: " + var3);
			}
		}
	}
}
