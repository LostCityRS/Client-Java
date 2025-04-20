package jagex2.config;

import jagex2.io.Jagfile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.AnimFrame;

@ObfuscatedName("nc")
public class SeqType {

	@ObfuscatedName("nc.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("nc.b")
	public int _flowObfuscator2 = -796;

	@ObfuscatedName("nc.c")
	public static int count;

	@ObfuscatedName("nc.d")
	public static SeqType[] types;

	@ObfuscatedName("nc.e")
	public int frameCount;

	@ObfuscatedName("nc.f")
	public int[] frames;

	@ObfuscatedName("nc.g")
	public int[] iframes;

	@ObfuscatedName("nc.h")
	public int[] delay;

	@ObfuscatedName("nc.i")
	public int replayoff = -1;

	@ObfuscatedName("nc.j")
	public int[] walkmerge;

	@ObfuscatedName("nc.k")
	public boolean stretches = false;

	@ObfuscatedName("nc.l")
	public int priority = 5;

	@ObfuscatedName("nc.m")
	public int righthand = -1;

	@ObfuscatedName("nc.n")
	public int lefthand = -1;

	@ObfuscatedName("nc.o")
	public int replaycount = 99;

	@ObfuscatedName("nc.p")
	public int preanim_move = -1;

	@ObfuscatedName("nc.q")
	public int postanim_mode = -1;

	@ObfuscatedName("nc.r")
	public int replacemode;

	@ObfuscatedName("nc.s")
	public static int _flowObfuscator3;

	@ObfuscatedName("nc.a(Lyb;B)V")
	public static void unpack(Jagfile arg0, byte arg1) {
		if (arg1 != 127) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Packet var3 = new Packet((byte) -109, arg0.read("seq.dat", null));
		count = var3.g2();
		if (types == null) {
			types = new SeqType[count];
		}
		for (int var4 = 0; var4 < count; var4++) {
			if (types[var4] == null) {
				types[var4] = new SeqType();
			}
			types[var4].decode(168, var3);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int getFrameDuration(int arg0, int arg1) {
		int var3 = this.delay[arg1];
		if (arg0 != 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		if (var3 == 0) {
			AnimFrame var4 = AnimFrame.get(this.frames[arg1], -404);
			if (var4 != null) {
				var3 = this.delay[arg1] = var4.id;
			}
		}
		if (var3 == 0) {
			var3 = 1;
		}
		return var3;
	}

	@ObfuscatedName("nc.a(ILmb;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			this._flowObfuscator2 = 71;
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					if (this.frameCount == 0) {
						this.frameCount = 1;
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
					if (this.postanim_mode == -1) {
						if (this.walkmerge != null) {
							this.postanim_mode = 2;
							return;
						}
						this.postanim_mode = 0;
						return;
					}
					return;
				}
				if (var3 == 1) {
					this.frameCount = arg1.g1();
					this.frames = new int[this.frameCount];
					this.iframes = new int[this.frameCount];
					this.delay = new int[this.frameCount];
					for (int var4 = 0; var4 < this.frameCount; var4++) {
						this.frames[var4] = arg1.g2();
						this.iframes[var4] = arg1.g2();
						if (this.iframes[var4] == 65535) {
							this.iframes[var4] = -1;
						}
						this.delay[var4] = arg1.g2();
					}
				} else if (var3 == 2) {
					this.replayoff = arg1.g2();
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
					this.righthand = arg1.g2();
				} else if (var3 == 7) {
					this.lefthand = arg1.g2();
				} else if (var3 == 8) {
					this.replaycount = arg1.g1();
				} else if (var3 == 9) {
					this.preanim_move = arg1.g1();
				} else if (var3 == 10) {
					this.postanim_mode = arg1.g1();
				} else if (var3 == 11) {
					this.replacemode = arg1.g1();
				} else {
					System.out.println("Error unrecognised seq config code: " + var3);
				}
			}
		}
	}
}
