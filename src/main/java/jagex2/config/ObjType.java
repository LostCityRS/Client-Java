package jagex2.config;

import deob.*;
import jagex2.datastruct.LruCache;
import jagex2.dash3d.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public class ObjType {

	@ObfuscatedName("hc.d")
	public static int count;

	@ObfuscatedName("hc.e")
	public static int[] idx;

	@ObfuscatedName("hc.f")
	public static Packet data;

	@ObfuscatedName("hc.g")
	public static ObjType[] cache;

	@ObfuscatedName("hc.h")
	public static int cachePos;

	@ObfuscatedName("hc.i")
	public static boolean membersWorld = true;

	@ObfuscatedName("hc.j")
	public int id = -1;

	@ObfuscatedName("hc.k")
	public int model;

	@ObfuscatedName("hc.l")
	public String name;

	@ObfuscatedName("hc.m")
	public byte[] desc;

	@ObfuscatedName("hc.n")
	public int[] recol_s;

	@ObfuscatedName("hc.o")
	public int[] recol_d;

	@ObfuscatedName("hc.p")
	public int zoom2d;

	@ObfuscatedName("hc.q")
	public int xan2d;

	@ObfuscatedName("hc.r")
	public int yan2d;

	@ObfuscatedName("hc.s")
	public int zan2d;

	@ObfuscatedName("hc.t")
	public int xof2d;

	@ObfuscatedName("hc.u")
	public int yof2d;

	@ObfuscatedName("hc.v")
	public boolean code9;

	@ObfuscatedName("hc.w")
	public int code10;

	@ObfuscatedName("hc.x")
	public boolean stackable;

	@ObfuscatedName("hc.y")
	public int cost;

	@ObfuscatedName("hc.z")
	public boolean members;

	@ObfuscatedName("hc.X")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("hc.Y")
	public static LruCache iconCache = new LruCache(100);

	@ObfuscatedName("hc.E")
	public byte manwearOffsetY;

	@ObfuscatedName("hc.H")
	public byte womanwearOffsetY;

	@ObfuscatedName("hc.C")
	public int manwear;

	@ObfuscatedName("hc.D")
	public int manwear2;

	@ObfuscatedName("hc.F")
	public int womanwear;

	@ObfuscatedName("hc.G")
	public int womanwear2;

	@ObfuscatedName("hc.I")
	public int manwear3;

	@ObfuscatedName("hc.J")
	public int womanwear3;

	@ObfuscatedName("hc.K")
	public int manhead;

	@ObfuscatedName("hc.L")
	public int manhead2;

	@ObfuscatedName("hc.M")
	public int womanhead;

	@ObfuscatedName("hc.N")
	public int womanhead2;

	@ObfuscatedName("hc.Q")
	public int certlink;

	@ObfuscatedName("hc.R")
	public int certtemplate;

	@ObfuscatedName("hc.S")
	public int resizex;

	@ObfuscatedName("hc.T")
	public int resizey;

	@ObfuscatedName("hc.U")
	public int resizez;

	@ObfuscatedName("hc.V")
	public int ambient;

	@ObfuscatedName("hc.W")
	public int contrast;

	@ObfuscatedName("hc.O")
	public int[] countobj;

	@ObfuscatedName("hc.P")
	public int[] countco;

	@ObfuscatedName("hc.A")
	public String[] op;

	@ObfuscatedName("hc.B")
	public String[] iop;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void unpack(Jagfile config) {
		data = new Packet(config.read("obj.dat", null));
		Packet temp = new Packet(config.read("obj.idx", null));

		count = temp.g2();
		idx = new int[count];

		int pos = 2;
		for (int i = 0; i < count; i++) {
			idx[i] = pos;
			pos += temp.g2();
		}

		cache = new ObjType[10];
		for (int i = 0; i < 10; i++) {
			cache[i] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static final void unload() {
		modelCache = null;
		iconCache = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final ObjType get(int id) {
		for (int i = 0; i < 10; i++) {
			if (cache[i].id == id) {
				return cache[i];
			}
		}

		cachePos = (cachePos + 1) % 10;

		ObjType obj = cache[cachePos];
		data.pos = idx[id];
		obj.id = id;
		obj.reset();
		obj.decode(data);

		if (obj.certtemplate != -1) {
			obj.genCert();
		}

		if (!membersWorld && obj.members) {
			obj.name = "Members Object";
			obj.desc = "Login to a members' server to use this object.".getBytes();
			obj.op = null;
			obj.iop = null;
		}

		return obj;
	}

	@ObfuscatedName("hc.a()V")
	public final void reset() {
		this.model = 0;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.xof2d = 0;
		this.yof2d = 0;
		this.code9 = false;
		this.code10 = -1;
		this.stackable = false;
		this.cost = 1;
		this.members = false;
		this.op = null;
		this.iop = null;
		this.manwear = -1;
		this.manwear2 = -1;
		this.manwearOffsetY = 0;
		this.womanwear = -1;
		this.womanwear2 = -1;
		this.womanwearOffsetY = 0;
		this.manwear3 = -1;
		this.womanwear3 = -1;
		this.manhead = -1;
		this.manhead2 = -1;
		this.womanhead = -1;
		this.womanhead2 = -1;
		this.countobj = null;
		this.countco = null;
		this.certlink = -1;
		this.certtemplate = -1;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("hc.a(ILmb;)V")
	public final void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				this.model = buf.g2();
			} else if (code == 2) {
				this.name = buf.gjstr();
			} else if (code == 3) {
				this.desc = buf.gjstrraw();
			} else if (code == 4) {
				this.zoom2d = buf.g2();
			} else if (code == 5) {
				this.xan2d = buf.g2();
			} else if (code == 6) {
				this.yan2d = buf.g2();
			} else if (code == 7) {
				this.xof2d = buf.g2();
				if (this.xof2d > 32767) {
					this.xof2d -= 65536;
				}
			} else if (code == 8) {
				this.yof2d = buf.g2();
				if (this.yof2d > 32767) {
					this.yof2d -= 65536;
				}
			} else if (code == 9) {
				this.code9 = true;
			} else if (code == 10) {
				this.code10 = buf.g2();
			} else if (code == 11) {
				this.stackable = true;
			} else if (code == 12) {
				this.cost = buf.g4();
			} else if (code == 16) {
				this.members = true;
			} else if (code == 23) {
				this.manwear = buf.g2();
				this.manwearOffsetY = buf.g1b();
			} else if (code == 24) {
				this.manwear2 = buf.g2();
			} else if (code == 25) {
				this.womanwear = buf.g2();
				this.womanwearOffsetY = buf.g1b();
			} else if (code == 26) {
				this.womanwear2 = buf.g2();
			} else if (code >= 30 && code < 35) {
				if (this.op == null) {
					this.op = new String[5];
				}

				this.op[code - 30] = buf.gjstr();
				if (this.op[code - 30].equalsIgnoreCase("hidden")) {
					this.op[code - 30] = null;
				}
			} else if (code >= 35 && code < 40) {
				if (this.iop == null) {
					this.iop = new String[5];
				}

				this.iop[code - 35] = buf.gjstr();
			} else if (code == 40) {
				int count = buf.g1();
				this.recol_s = new int[count];
				this.recol_d = new int[count];

				for (int var5 = 0; var5 < count; var5++) {
					this.recol_s[var5] = buf.g2();
					this.recol_d[var5] = buf.g2();
				}
			} else if (code == 78) {
				this.manwear3 = buf.g2();
			} else if (code == 79) {
				this.womanwear3 = buf.g2();
			} else if (code == 90) {
				this.manhead = buf.g2();
			} else if (code == 91) {
				this.womanhead = buf.g2();
			} else if (code == 92) {
				this.manhead2 = buf.g2();
			} else if (code == 93) {
				this.womanhead2 = buf.g2();
			} else if (code == 95) {
				this.zan2d = buf.g2();
			} else if (code == 97) {
				this.certlink = buf.g2();
			} else if (code == 98) {
				this.certtemplate = buf.g2();
			} else if (code >= 100 && code < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[code - 100] = buf.g2();
				this.countco[code - 100] = buf.g2();
			} else if (code == 110) {
				this.resizex = buf.g2();
			} else if (code == 111) {
				this.resizey = buf.g2();
			} else if (code == 112) {
				this.resizez = buf.g2();
			} else if (code == 113) {
				this.ambient = buf.g1b();
			} else if (code == 114) {
				this.contrast = buf.g1b() * 5;
			}
		}
	}

	@ObfuscatedName("hc.b(I)V")
	public void genCert() {
		ObjType template = get(this.certtemplate);
		this.model = template.model;
		this.zoom2d = template.zoom2d;
		this.xan2d = template.xan2d;
		this.yan2d = template.yan2d;
		this.zan2d = template.zan2d;
		this.xof2d = template.xof2d;
		this.yof2d = template.yof2d;
		this.recol_s = template.recol_s;
		this.recol_d = template.recol_d;

		ObjType link = get(this.certlink);
		this.name = link.name;
		this.members = link.members;
		this.cost = link.cost;

		String article = "a";
		char c = link.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			article = "an";
		}
		this.desc = ("Swap this note at any bank for " + article + " " + link.name + ".").getBytes();

		this.stackable = true;
	}

	@ObfuscatedName("hc.c(I)Lfb;")
	public final Model getModel(int count) {
		if (this.countobj != null && count > 1) {
			int index = -1;
			for (int i = 0; i < 10; i++) {
				if (count >= this.countco[i] && this.countco[i] != 0) {
					index = this.countobj[i];
				}
			}

			if (index != -1) {
				return get(index).getModel(1);
			}
		}

		Model model = (Model) modelCache.get(this.id);
		if (model != null) {
			return model;
		}

		model = Model.tryGet(this.model);
		if (model == null) {
			return null;
		}

		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			model.scale(this.resizey, this.resizez, this.resizex);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		model.calculateNormals(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
		model.picking = true;
		modelCache.put(model, this.id);
		return model;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final Model getInvModel(int count) {
		if (this.countobj != null && count > 1) {
			int index = -1;
			for (int i = 0; i < 10; i++) {
				if (count >= this.countco[i] && this.countco[i] != 0) {
					index = this.countobj[i];
				}
			}

			if (index != -1) {
				return get(index).getInvModel(1);
			}
		}

		Model model = Model.tryGet(this.model);
		if (model == null) {
			return null;
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static final Pix32 getIcon(int outlineRgb, int count, int id) {
		if (outlineRgb == 0) {
			Pix32 icon = (Pix32) iconCache.get(id);

			if (icon != null && icon.ohi != count && icon.ohi != -1) {
				icon.unlink();
				icon = null;
			}

			if (icon != null) {
				return icon;
			}
		}

		ObjType obj = get(id);

		if (obj.countobj == null) {
			count = -1;
		}

		if (count > 1) {
			int countObj = -1;
			for (int i = 0; i < 10; i++) {
				if (count >= obj.countco[i] && obj.countco[i] != 0) {
					countObj = obj.countobj[i];
				}
			}

			if (countObj != -1) {
				obj = get(countObj);
			}
		}

		Model model = obj.getModel(1);
		if (model == null) {
			return null;
		}

		Pix32 linkedIcon = null;
		if (obj.certtemplate != -1) {
			linkedIcon = getIcon(-1, 10, obj.certlink);

			if (linkedIcon == null) {
				return null;
			}
		}

		Pix32 icon = new Pix32(32, 32);

		int _cx = Pix3D.centerX;
		int _cy = Pix3D.centerY;
		int[] _loff = Pix3D.lineOffset;
		int[] _data = Pix2D.data;
		int _w = Pix2D.width2d;
		int _h = Pix2D.height2d;
		int _l = Pix2D.left;
		int _r = Pix2D.right;
		int _t = Pix2D.top;
		int _b = Pix2D.bottom;

		Pix3D.jagged = false;
		Pix2D.bind(32, icon.pixels, 32);
		Pix2D.fillRect(0, 32, 32, 0, 0);
		Pix3D.init2D();

		int zoom = obj.zoom2d;
		if (outlineRgb == -1) {
			zoom = (int) ((double) zoom * 1.5D);
		} else if (outlineRgb > 0) {
			zoom = (int) ((double) zoom * 1.04D);
		}

		int sinPitch = Pix3D.sinTable[obj.xan2d] * zoom >> 16;
		int cosPitch = Pix3D.cosTable[obj.xan2d] * zoom >> 16;

		model.drawSimple(0, obj.yan2d, obj.zan2d, obj.xan2d, obj.xof2d, model.minY / 2 + sinPitch + obj.yof2d, obj.yof2d + cosPitch);

		for (int x = 31; x >= 0; x--) {
			for (int y = 31; y >= 0; y--) {
				if (icon.pixels[y * 32 + x] == 0) {
					if (x > 0 && icon.pixels[y * 32 + (x - 1)] > 1) {
						icon.pixels[y * 32 + x] = 1;
					} else if (y > 0 && icon.pixels[(y - 1) * 32 + x] > 1) {
						icon.pixels[y * 32 + x] = 1;
					} else if (x < 31 && icon.pixels[y * 32 + x + 1] > 1) {
						icon.pixels[y * 32 + x] = 1;
					} else if (y < 31 && icon.pixels[(y + 1) * 32 + x] > 1) {
						icon.pixels[y * 32 + x] = 1;
					}
				}
			}
		}

		if (outlineRgb > 0) {
			for (int x = 31; x >= 0; x--) {
				for (int y = 31; y >= 0; y--) {
					if (icon.pixels[y * 32 + x] == 0) {
						if (x > 0 && icon.pixels[y * 32 + (x - 1)] == 1) {
							icon.pixels[y * 32 + x] = outlineRgb;
						} else if (y > 0 && icon.pixels[(y - 1) * 32 + x] == 1) {
							icon.pixels[y * 32 + x] = outlineRgb;
						} else if (x < 31 && icon.pixels[y * 32 + x + 1] == 1) {
							icon.pixels[y * 32 + x] = outlineRgb;
						} else if (y < 31 && icon.pixels[(y + 1) * 32 + x] == 1) {
							icon.pixels[y * 32 + x] = outlineRgb;
						}
					}
				}
			}
		} else if (outlineRgb == 0) {
			for (int x = 31; x >= 0; x--) {
				for (int y = 31; y >= 0; y--) {
					if (icon.pixels[y * 32 + x] == 0 && x > 0 && y > 0 && icon.pixels[(y - 1) * 32 + (x - 1)] > 0) {
						icon.pixels[y * 32 + x] = 0x302020;
					}
				}
			}
		}

		if (obj.certtemplate != -1) {
			int w = linkedIcon.owi;
			int h = linkedIcon.ohi;
			linkedIcon.owi = 32;
			linkedIcon.ohi = 32;
			linkedIcon.plotSprite(0, 0);
			linkedIcon.owi = w;
			linkedIcon.ohi = h;
		}

		if (outlineRgb == 0) {
			iconCache.put(icon, id);
		}

		Pix2D.bind(_w, _data, _h);
		Pix2D.setClipping(_r, _b, _t, _l);
		Pix3D.centerX = _cx;
		Pix3D.centerY = _cy;
		Pix3D.lineOffset = _loff;
		Pix3D.jagged = true;

		if (obj.stackable) {
			icon.owi = 33;
		} else {
			icon.owi = 32;
		}

		icon.ohi = count;
		return icon;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean checkWearModel(int gender) {
		int wear = this.manwear;
		int wear2 = this.manwear2;
		int wear3 = this.manwear3;
		if (gender == 1) {
			wear = this.womanwear;
			wear2 = this.womanwear2;
			wear3 = this.womanwear3;
		}

		if (wear == -1) {
			return true;
		}

		boolean ready = true;
		if (!Model.request(wear)) {
			ready = false;
		}
		if (wear2 != -1 && !Model.request(wear2)) {
			ready = false;
		}
		if (wear3 != -1 && !Model.request(wear3)) {
			ready = false;
		}
		return ready;
	}

	@ObfuscatedName("hc.a(ZI)Lfb;")
	public final Model getWearModel(int gender) {
		int wear = this.manwear;
		int wear2 = this.manwear2;
		int wear3 = this.manwear3;
		if (gender == 1) {
			wear = this.womanwear;
			wear2 = this.womanwear2;
			wear3 = this.womanwear3;
		}

		if (wear == -1) {
			return null;
		}

		Model model = Model.tryGet(wear);
		if (wear2 != -1) {
			if (wear3 == -1) {
				Model model2 = Model.tryGet(wear2);
				Model[] models = new Model[] { model, model2 };
				model = new Model(2, models);
			} else {
				Model model2 = Model.tryGet(wear2);
				Model model3 = Model.tryGet(wear3);
				Model[] models = new Model[] { model, model2, model3 };
				model = new Model(3, models);
			}
		}

		if (gender == 0 && this.manwearOffsetY != 0) {
			model.translate(this.manwearOffsetY, 0, 0);
		} else if (gender == 1 && this.womanwearOffsetY != 0) {
			model.translate(this.womanwearOffsetY, 0, 0);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean checkHeadModel(int gender) {
		int head = this.manhead;
		int head2 = this.manhead2;
		if (gender == 1) {
			head = this.womanhead;
			head2 = this.womanhead2;
		}

		if (head == -1) {
			return true;
		}

		boolean ready = true;
		if (!Model.request(head)) {
			ready = false;
		}
		if (head2 != -1 && !Model.request(head2)) {
			ready = false;
		}
		return ready;
	}

	@ObfuscatedName("hc.b(ZI)Lfb;")
	public final Model getHeadModel(int gender) {
		int head = this.manhead;
		int head2 = this.manhead2;
		if (gender == 1) {
			head = this.womanhead;
			head2 = this.womanhead2;
		}

		if (head == -1) {
			return null;
		}

		Model model = Model.tryGet(head);
		if (head2 != -1) {
			Model model2 = Model.tryGet(head2);
			Model[] models = new Model[] { model, model2 };
			model = new Model(2, models);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}
}
