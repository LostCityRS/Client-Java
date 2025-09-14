package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public class ObjType {

	@ObfuscatedName("hc.e")
	public static int count;

	@ObfuscatedName("hc.f")
	public static int[] idx;

	@ObfuscatedName("hc.g")
	public static Packet data;

	@ObfuscatedName("hc.h")
	public static ObjType[] cache;

	@ObfuscatedName("hc.i")
	public static int cachePos;

	@ObfuscatedName("hc.j")
	public static boolean membersWorld = true;

	@ObfuscatedName("hc.k")
	public int id = -1;

	@ObfuscatedName("hc.l")
	public int model;

	@ObfuscatedName("hc.m")
	public String name;

	@ObfuscatedName("hc.n")
	public byte[] desc;

	@ObfuscatedName("hc.o")
	public int[] recol_s;

	@ObfuscatedName("hc.p")
	public int[] recol_d;

	@ObfuscatedName("hc.q")
	public int zoom2d;

	@ObfuscatedName("hc.r")
	public int xan2d;

	@ObfuscatedName("hc.s")
	public int yan2d;

	@ObfuscatedName("hc.t")
	public int zan2d;

	@ObfuscatedName("hc.u")
	public int xof2d;

	@ObfuscatedName("hc.v")
	public int yof2d;

	@ObfuscatedName("hc.w")
	public boolean field1044;

	@ObfuscatedName("hc.x")
	public int field1045;

	@ObfuscatedName("hc.y")
	public boolean stackable;

	@ObfuscatedName("hc.z")
	public int cost;

	@ObfuscatedName("hc.Y")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("hc.Z")
	public static LruCache iconCache = new LruCache(100);

	@ObfuscatedName("hc.F")
	public byte manwearOffsetY;

	@ObfuscatedName("hc.I")
	public byte womanwearOffsetY;

	@ObfuscatedName("hc.D")
	public int manwear;

	@ObfuscatedName("hc.E")
	public int manwear2;

	@ObfuscatedName("hc.G")
	public int womanwear;

	@ObfuscatedName("hc.H")
	public int womanwear2;

	@ObfuscatedName("hc.J")
	public int manwear3;

	@ObfuscatedName("hc.K")
	public int womanwear3;

	@ObfuscatedName("hc.L")
	public int manhead;

	@ObfuscatedName("hc.M")
	public int manhead2;

	@ObfuscatedName("hc.N")
	public int womanhead;

	@ObfuscatedName("hc.O")
	public int womanhead2;

	@ObfuscatedName("hc.R")
	public int certlink;

	@ObfuscatedName("hc.S")
	public int certtemplate;

	@ObfuscatedName("hc.T")
	public int resizex;

	@ObfuscatedName("hc.U")
	public int resizey;

	@ObfuscatedName("hc.V")
	public int resizez;

	@ObfuscatedName("hc.W")
	public int ambient;

	@ObfuscatedName("hc.X")
	public int contrast;

	@ObfuscatedName("hc.A")
	public boolean members;

	@ObfuscatedName("hc.P")
	public int[] countobj;

	@ObfuscatedName("hc.Q")
	public int[] countco;

	@ObfuscatedName("hc.B")
	public String[] op;

	@ObfuscatedName("hc.C")
	public String[] iop;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static void unpack(Jagfile jag) {
		data = new Packet(jag.read("obj.dat", null));
		Packet index = new Packet(jag.read("obj.idx", null));

		count = index.g2();
		idx = new int[count];

		int pos = 2;
		for (int id = 0; id < count; id++) {
			idx[id] = pos;
			pos += index.g2();
		}

		cache = new ObjType[10];
		for (int i = 0; i < 10; i++) {
			cache[i] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static void unload() {
		modelCache = null;
		iconCache = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static ObjType get(int id) {
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
	public void reset() {
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
		this.field1044 = false;
		this.field1045 = -1;
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

	@ObfuscatedName("hc.a(ZLmb;)V")
	public void decode(Packet buf) {
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
				this.field1044 = true;
			} else if (code == 10) {
				this.field1045 = buf.g2();
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
				for (int i = 0; i < count; i++) {
					this.recol_s[i] = buf.g2();
					this.recol_d[i] = buf.g2();
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

	@ObfuscatedName("hc.a(Z)V")
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

	@ObfuscatedName("hc.b(I)Lfb;")
	public Model getModel(int count) {
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

		Model cached = (Model) modelCache.get(this.id);
		if (cached != null) {
			return cached;
		}

		Model model = Model.tryGet(this.model);
		if (model == null) {
			return null;
		}

		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			model.resize(this.resizex, this.resizez, this.resizey);
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
	public Model getInvModel(int count) {
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
	public static Pix32 getIcon(int outline, int count, int id) {
		if (outline == 0) {
			Pix32 cached = (Pix32) iconCache.get(id);

			if (cached != null && cached.ohi != count && cached.ohi != -1) {
				cached.unlink();
				cached = null;
			}

			if (cached != null) {
				return cached;
			}
		}

		ObjType obj = get(id);
		if (obj.countobj == null) {
			count = -1;
		}
		if (count > 1) {
			int index = -1;
			for (int i = 0; i < 10; i++) {
				if (count >= obj.countco[i] && obj.countco[i] != 0) {
					index = obj.countobj[i];
				}
			}
			if (index != -1) {
				obj = get(index);
			}
		}

		Model model = obj.getModel(1);
		if (model == null) {
			return null;
		}

		Pix32 template = null;
		if (obj.certtemplate != -1) {
			template = getIcon(-1, 10, obj.certlink);
			if (template == null) {
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
		Pix2D.bind(icon.pixels, 32, 32);
		Pix2D.fillRect(0, 32, 0, 32, 0);
		Pix3D.init2D();

		int zoom = obj.zoom2d;
		if (outline == -1) {
			zoom = (int) ((double) zoom * 1.5D);
		} else if (outline > 0) {
			zoom = (int) ((double) zoom * 1.04D);
		}

		int sinPitch = Pix3D.sinTable[obj.xan2d] * zoom >> 16;
		int cosPitch = Pix3D.cosTable[obj.xan2d] * zoom >> 16;
		model.drawSimple(0, obj.yan2d, obj.zan2d, obj.xan2d, obj.xof2d, sinPitch + model.minY / 2 + obj.yof2d, cosPitch + obj.yof2d);

		for (int x = 31; x >= 0; x--) {
			for (int y = 31; y >= 0; y--) {
				if (icon.pixels[x + y * 32] == 0) {
					if (x > 0 && icon.pixels[x - 1 + y * 32] > 1) {
						icon.pixels[x + y * 32] = 1;
					} else if (y > 0 && icon.pixels[x + (y - 1) * 32] > 1) {
						icon.pixels[x + y * 32] = 1;
					} else if (x < 31 && icon.pixels[x + 1 + y * 32] > 1) {
						icon.pixels[x + y * 32] = 1;
					} else if (y < 31 && icon.pixels[x + (y + 1) * 32] > 1) {
						icon.pixels[x + y * 32] = 1;
					}
				}
			}
		}

		if (outline > 0) {
			for (int x = 31; x >= 0; x--) {
				for (int y = 31; y >= 0; y--) {
					if (icon.pixels[x + y * 32] == 0) {
						if (x > 0 && icon.pixels[x - 1 + y * 32] == 1) {
							icon.pixels[x + y * 32] = outline;
						} else if (y > 0 && icon.pixels[x + (y - 1) * 32] == 1) {
							icon.pixels[x + y * 32] = outline;
						} else if (x < 31 && icon.pixels[x + 1 + y * 32] == 1) {
							icon.pixels[x + y * 32] = outline;
						} else if (y < 31 && icon.pixels[x + (y + 1) * 32] == 1) {
							icon.pixels[x + y * 32] = outline;
						}
					}
				}
			}
		} else if (outline == 0) {
			for (int x = 31; x >= 0; x--) {
				for (int y = 31; y >= 0; y--) {
					if (icon.pixels[x + y * 32] == 0 && x > 0 && y > 0 && icon.pixels[x - 1 + (y - 1) * 32] > 0) {
						icon.pixels[x + y * 32] = 3153952;
					}
				}
			}
		}

		if (obj.certtemplate != -1) {
			int owi = template.owi;
			int ohi = template.ohi;

			template.owi = 32;
			template.ohi = 32;
			template.plotSprite(0, 0);
			template.owi = owi;
			template.ohi = ohi;
		}

		if (outline == 0) {
			iconCache.put(icon, id);
		}

		Pix2D.bind(_data, _w, _h);
		Pix2D.setClipping(_t, _r, _b, _l);
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

	@ObfuscatedName("hc.a(ZI)Z")
	public boolean checkWearModel(int gender) {
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

	@ObfuscatedName("hc.b(II)Lfb;")
	public Model getWearModel(int gender) {
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
			if (wear3 != -1) {
				Model model2 = Model.tryGet(wear2);
				Model model3 = Model.tryGet(wear3);
				Model[] models = new Model[] { model, model2, model3 };
				model = new Model(models, 3);
			} else {
				Model model2 = Model.tryGet(wear2);
				Model[] models = new Model[] { model, model2 };
				model = new Model(models, 2);
			}
		}

		if (gender == 0 && this.manwearOffsetY != 0) {
			model.offset(0, 0, this.manwearOffsetY);
		} else if (gender == 1 && this.womanwearOffsetY != 0) {
			model.offset(0, 0, this.womanwearOffsetY);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}

	@ObfuscatedName("hc.c(II)Z")
	public boolean checkHeadModel(int gender) {
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

	@ObfuscatedName("hc.d(II)Lfb;")
	public Model getHeadModel(int gender) {
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
			model = new Model(models, 2);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}
}
