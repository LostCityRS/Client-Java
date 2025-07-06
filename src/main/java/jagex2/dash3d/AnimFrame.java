package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("h")
public class AnimFrame {

	@ObfuscatedName("h.c")
	public static AnimFrame[] instances;

	@ObfuscatedName("h.d")
	public int delay;

	@ObfuscatedName("h.e")
	public AnimBase base;

	@ObfuscatedName("h.f")
	public int length;

	@ObfuscatedName("h.g")
	public int[] groups;

	@ObfuscatedName("h.h")
	public int[] x;

	@ObfuscatedName("h.i")
	public int[] y;

	@ObfuscatedName("h.j")
	public int[] z;

	@ObfuscatedName("h.a(I)V")
	public static void init(int arg0) {
		instances = new AnimFrame[arg0 + 1];
	}

	@ObfuscatedName("h.a(I[B)V")
	public static void unpack(byte[] data) {
		Packet buf = new Packet(data);
		buf.pos = data.length - 8;

		int headLength = buf.g2();
		int tran1Length = buf.g2();
		int tran2Length = buf.g2();
		int delLength = buf.g2();
		int pos = 0;

		Packet head = new Packet(data);
		head.pos = pos;
		pos += headLength + 2;

		Packet tran1 = new Packet(data);
		tran1.pos = pos;
		pos += tran1Length;

		Packet tran2 = new Packet(data);
		tran2.pos = pos;
		pos += tran2Length;

		Packet del = new Packet(data);
		del.pos = pos;
		pos += delLength;

		Packet baseBuf = new Packet(data);
		baseBuf.pos = pos;
		AnimBase base = new AnimBase(baseBuf);

		int total = head.g2();
		int[] labels = new int[500];
		int[] x = new int[500];
		int[] y = new int[500];
		int[] z = new int[500];

		for (int i = 0; i < total; i++) {
			int id = head.g2();

			AnimFrame frame = instances[id] = new AnimFrame();
			frame.delay = del.g1();
			frame.base = base;

			int groupCount = head.g1();
			int lastGroup = -1;
			int current = 0;

			for (int j = 0; j < groupCount; j++) {
				int flags = tran1.g1();
				if (flags > 0) {
					if (base.types[j] != 0) {
						for (int group = j - 1; group > lastGroup; group--) {
							if (base.types[group] == 0) {
								labels[current] = group;
								x[current] = 0;
								y[current] = 0;
								z[current] = 0;
								current++;
								break;
							}
						}
					}

					labels[current] = j;

					short defaultValue = 0;
					if (base.types[labels[current]] == 3) {
						defaultValue = 128;
					}

					if ((flags & 0x1) == 0) {
						x[current] = defaultValue;
					} else {
						x[current] = tran2.gsmart();
					}

					if ((flags & 0x2) == 0) {
						y[current] = defaultValue;
					} else {
						y[current] = tran2.gsmart();
					}

					if ((flags & 0x4) == 0) {
						z[current] = defaultValue;
					} else {
						z[current] = tran2.gsmart();
					}

					lastGroup = j;
					current++;
				}
			}

			frame.length = current;
			frame.groups = new int[current];
			frame.x = new int[current];
			frame.y = new int[current];
			frame.z = new int[current];

			for (int j = 0; j < current; j++) {
				frame.groups[j] = labels[j];
				frame.x[j] = x[j];
				frame.y[j] = y[j];
				frame.z[j] = z[j];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void unload() {
		instances = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame get(int arg0) {
		if (instances == null) {
			return null;
		} else {
			return instances[arg0];
		}
	}
}
