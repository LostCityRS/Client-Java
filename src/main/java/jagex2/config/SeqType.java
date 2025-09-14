package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("nc")
public class SeqType {

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
	public int loops = -1;

	@ObfuscatedName("nc.j")
	public int[] walkmerge;

	@ObfuscatedName("nc.k")
	public boolean stretches = false;

	@ObfuscatedName("nc.l")
	public int priority = 5;

	@ObfuscatedName("nc.m")
	public int replaceheldleft = -1;

	@ObfuscatedName("nc.n")
	public int replaceheldright = -1;

	@ObfuscatedName("nc.o")
	public int maxloops = 99;

	@ObfuscatedName("nc.p")
	public int preanim_move = -1;

	@ObfuscatedName("nc.q")
	public int postanim_move = -1;

	@ObfuscatedName("nc.r")
	public int duplicatebehavior;

	@ObfuscatedName("nc.a(ILyb;)V")
	public static void unpack(Jagfile jag) {
		Packet data = new Packet(jag.read("seq.dat", null));

		count = data.g2();

		if (types == null) {
			types = new SeqType[count];
		}

		for (int id = 0; id < count; id++) {
			if (types[id] == null) {
				types[id] = new SeqType();
			}

			types[id].decode(data);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int getFrameLength(int i) {
		int delay = this.delay[i];

		if (delay == 0) {
			AnimFrame frame = AnimFrame.get(this.frames[i]);
			if (frame != null) {
				delay = this.delay[i] = frame.delay;
			}
		}

		if (delay == 0) {
			delay = 1;
		}

		return delay;
	}

	@ObfuscatedName("nc.a(ZLmb;)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				break;
			}

			if (code == 1) {
				this.frameCount = buf.g1();

				this.frames = new int[this.frameCount];
				this.iframes = new int[this.frameCount];
				this.delay = new int[this.frameCount];
				for (int i = 0; i < this.frameCount; i++) {
					this.frames[i] = buf.g2();
					this.iframes[i] = buf.g2();
					if (this.iframes[i] == 65535) {
						this.iframes[i] = -1;
					}
					this.delay[i] = buf.g2();
				}
			} else if (code == 2) {
				this.loops = buf.g2();
			} else if (code == 3) {
				int count = buf.g1();

				this.walkmerge = new int[count + 1];
				for (int i = 0; i < count; i++) {
					this.walkmerge[i] = buf.g1();
				}
				this.walkmerge[count] = 9999999;
			} else if (code == 4) {
				this.stretches = true;
			} else if (code == 5) {
				this.priority = buf.g1();
			} else if (code == 6) {
				this.replaceheldleft = buf.g2();
			} else if (code == 7) {
				this.replaceheldright = buf.g2();
			} else if (code == 8) {
				this.maxloops = buf.g1();
			} else if (code == 9) {
				this.preanim_move = buf.g1();
			} else if (code == 10) {
				this.postanim_move = buf.g1();
			} else if (code == 11) {
				this.duplicatebehavior = buf.g1();
			} else {
				System.out.println("Error unrecognised seq config code: " + code);
			}
		}

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

		if (this.postanim_move == -1) {
            if (this.walkmerge == null) {
                this.postanim_move = 0;
            } else {
                this.postanim_move = 2;
            }
        }
	}
}
