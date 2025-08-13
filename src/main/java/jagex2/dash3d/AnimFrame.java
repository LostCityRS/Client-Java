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
	public int size;

	@ObfuscatedName("h.g")
	public int[] ti; // transform indices (groups affected by this frame)

	@ObfuscatedName("h.h")
	public int[] tx; // transform x

	@ObfuscatedName("h.i")
	public int[] ty; // transform y

	@ObfuscatedName("h.j")
	public int[] tz; // transform z

	@ObfuscatedName("h.a(I)V")
	public static void init(int capacity) {
		instances = new AnimFrame[capacity + 1];
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
		int[] tempTi = new int[500];
		int[] tempTx = new int[500];
		int[] tempTy = new int[500];
		int[] tempTz = new int[500];

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
								tempTi[current] = group;
								tempTx[current] = 0;
								tempTy[current] = 0;
								tempTz[current] = 0;
								current++;
								break;
							}
						}
					}

					tempTi[current] = j;

					short defaultValue = 0;
					if (base.types[tempTi[current]] == 3) {
						defaultValue = 128;
					}

					if ((flags & 0x1) == 0) {
						tempTx[current] = defaultValue;
					} else {
						tempTx[current] = tran2.gsmart();
					}

					if ((flags & 0x2) == 0) {
						tempTy[current] = defaultValue;
					} else {
						tempTy[current] = tran2.gsmart();
					}

					if ((flags & 0x4) == 0) {
						tempTz[current] = defaultValue;
					} else {
						tempTz[current] = tran2.gsmart();
					}

					lastGroup = j;
					current++;
				}
			}

			frame.size = current;
			frame.ti = new int[current];
			frame.tx = new int[current];
			frame.ty = new int[current];
			frame.tz = new int[current];

			for (int j = 0; j < current; j++) {
				frame.ti[j] = tempTi[j];
				frame.tx[j] = tempTx[j];
				frame.ty[j] = tempTy[j];
				frame.tz[j] = tempTz[j];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void unload() {
		instances = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static AnimFrame get(int id) {
		if (instances == null) {
			return null;
		} else {
			return instances[id];
		}
	}
}
