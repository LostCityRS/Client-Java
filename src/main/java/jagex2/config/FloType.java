package jagex2.config;

import jagex2.io.Jagfile;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("kc")
public class FloType {

	@ObfuscatedName("kc.b")
	public static int count;

	@ObfuscatedName("kc.c")
	public static FloType[] types;

	@ObfuscatedName("kc.d")
	public int rgb;

	@ObfuscatedName("kc.e")
	public int texture = -1;

	@ObfuscatedName("kc.f")
	public boolean overlay = false;

	@ObfuscatedName("kc.g")
	public boolean occlude = true;

	@ObfuscatedName("kc.h")
	public String debugname;

	@ObfuscatedName("kc.i")
	public int hue;

	@ObfuscatedName("kc.j")
	public int saturation;

	@ObfuscatedName("kc.k")
	public int lightness;

	@ObfuscatedName("kc.l")
	public int chroma;

	@ObfuscatedName("kc.m")
	public int luminance;

	@ObfuscatedName("kc.n")
	public int hsl;

	@ObfuscatedName("kc.a(Lyb;B)V")
	public static void unpack(Jagfile config) {
		Packet dat = new Packet(config.read("flo.dat", null));

		count = dat.g2();
		if (types == null) {
			types = new FloType[count];
		}

		for (int i = 0; i < count; i++) {
			if (types[i] == null) {
				types[i] = new FloType();
			}

			types[i].decode(dat);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				this.rgb = buf.g3();
				this.getHsl(this.rgb);
			} else if (code == 2) {
				this.texture = buf.g1();
			} else if (code == 3) {
				this.overlay = true;
			} else if (code == 5) {
				this.occlude = false;
			} else if (code == 6) {
				this.debugname = buf.gjstr();
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void getHsl(int rgb) {
		double red = (double) (rgb >> 16 & 0xFF) / 256.0D;
		double green = (double) (rgb >> 8 & 0xFF) / 256.0D;
		double blue = (double) (rgb & 0xFF) / 256.0D;

		double min = red;
		if (green < red) {
			min = green;
		}
		if (blue < min) {
			min = blue;
		}

		double max = red;
		if (green > red) {
			max = green;
		}
		if (blue > max) {
			max = blue;
		}

		double h = 0.0D;
		double s = 0.0D;
		double l = (min + max) / 2.0D;

		if (min != max) {
			if (l < 0.5D) {
				s = (max - min) / (min + max);
			} else if (l >= 0.5D) {
				s = (max - min) / (2.0D - max - min);
			}

			if (red == max) {
				h = (green - blue) / (max - min);
			} else if (green == max) {
				h = (blue - red) / (max - min) + 2.0D;
			} else if (blue == max) {
				h = (red - green) / (max - min) + 4.0D;
			}
		}

		h /= 6.0D;

		this.hue = (int) (h * 256.0D);
		this.saturation = (int) (s * 256.0D);
		this.lightness = (int) (l * 256.0D);

		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (l > 0.5D) {
			this.luminance = (int) ((1.0D - l) * s * 512.0D);
		} else {
			this.luminance = (int) (s * l * 512.0D);
		}

		if (this.luminance < 1) {
			this.luminance = 1;
		}

		this.chroma = (int) ((double) this.luminance * h);

		int hue = this.hue + (int) (Math.random() * 16.0D) - 8;
		if (hue < 0) {
			hue = 0;
		} else if (hue > 255) {
			hue = 255;
		}

		int saturation = this.saturation + (int) (Math.random() * 48.0D) - 24;
		if (saturation < 0) {
			saturation = 0;
		} else if (saturation > 255) {
			saturation = 255;
		}

		int lightness = this.lightness + (int) (Math.random() * 48.0D) - 24;
		if (lightness < 0) {
			lightness = 0;
		} else if (lightness > 255) {
			lightness = 255;
		}

		this.hsl = this.hsl24to16(hue, saturation, lightness);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int hsl24to16(int hue, int saturation, int lightness) {
		if (lightness > 179) {
			saturation /= 2;
		}

		if (lightness > 192) {
			saturation /= 2;
		}

		if (lightness > 217) {
			saturation /= 2;
		}

		if (lightness > 243) {
			saturation /= 2;
		}

		return lightness / 2 + (hue / 4 << 10) + (saturation / 32 << 7);
	}
}
