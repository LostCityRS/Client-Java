package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public class IdkType {

	@ObfuscatedName("lc.c")
	public static int count;

	@ObfuscatedName("lc.d")
	public static IdkType[] types;

	@ObfuscatedName("lc.e")
	public int type = -1;

	@ObfuscatedName("lc.f")
	public int[] models;

	@ObfuscatedName("lc.g")
	public int[] recol_s = new int[6];

	@ObfuscatedName("lc.h")
	public int[] recol_d = new int[6];

	@ObfuscatedName("lc.i")
	public int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean disable = false;

	@ObfuscatedName("lc.a(ILyb;)V")
	public static void unpack(Jagfile jag) {
		Packet data = new Packet(jag.read("idk.dat", null));

		count = data.g2();

		if (types == null) {
			types = new IdkType[count];
		}

		for (int id = 0; id < count; id++) {
			if (types[id] == null) {
				types[id] = new IdkType();
			}

			types[id].decode(data);
		}
	}

	@ObfuscatedName("lc.a(ZLmb;)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				break;
			}

			if (code == 1) {
				this.type = buf.g1();
			} else if (code == 2) {
				int count = buf.g1();

				this.models = new int[count];
				for (int i = 0; i < count; i++) {
					this.models[i] = buf.g2();
				}
			} else if (code == 3) {
				this.disable = true;
			} else if (code >= 40 && code < 50) {
				this.recol_s[code - 40] = buf.g2();
			} else if (code >= 50 && code < 60) {
				this.recol_d[code - 50] = buf.g2();
			} else if (code >= 60 && code < 70) {
				this.head[code - 60] = buf.g2();
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean checkModel() {
		if (this.models == null) {
			return true;
		}

		boolean ready = true;
		for (int i = 0; i < this.models.length; i++) {
			if (!Model.request(this.models[i])) {
				ready = false;
			}
		}
		return ready;
	}

	@ObfuscatedName("lc.a(Z)Lfb;")
	public Model getModel() {
		if (this.models == null) {
			return null;
		}

		Model[] models = new Model[this.models.length];
		for (int i = 0; i < this.models.length; i++) {
			models[i] = Model.tryGet(this.models[i]);
		}

		Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models, models.length);
		}

		for (int i = 0; i < 6 && this.recol_s[i] != 0; i++) {
			model.recolour(this.recol_s[i], this.recol_d[i]);
		}

		return model;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean checkHead() {
		boolean ready = true;
		for (int i = 0; i < 5; i++) {
			if (this.head[i] != -1 && !Model.request(this.head[i])) {
				ready = false;
			}
		}
		return ready;
	}

	@ObfuscatedName("lc.a(B)Lfb;")
	public Model getHeadModel() {
		Model[] models = new Model[5];

		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (this.head[i] != -1) {
				models[count++] = Model.tryGet(this.head[i]);
			}
		}

		Model model = new Model(models, count);
		for (int i = 0; i < 6 && this.recol_s[i] != 0; i++) {
			model.recolour(this.recol_s[i], this.recol_d[i]);
		}
		return model;
	}
}
