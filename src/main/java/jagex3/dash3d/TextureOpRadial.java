package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("ma")
public final class TextureOpRadial extends TextureOp {

	@ObfuscatedName("ma.eb")
	public int scale = 1;

	@ObfuscatedName("ma.fb")
	public int distanceMode = 0;

	@ObfuscatedName("ma.hb")
	public int waveform = 0;

	public TextureOpRadial() {
		super(0, true);
	}

	@ObfuscatedName("ma.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.distanceMode = arg0.g1();
		} else if (arg1 == 1) {
			this.waveform = arg0.g1();
		} else if (arg1 == 3) {
			this.scale = arg0.g1();
		}
	}

	@ObfuscatedName("ma.b(B)V")
	@Override
	public void postDecode() {
		Statics.method740();
	}

	@ObfuscatedName("ma.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.field2021[arg0];
			int var4 = var3 - 2048 >> 1;
			for (int var5 = 0; var5 < Texture.field1276; var5++) {
				int var6 = Texture.field351[var5];
				int var7 = var6 - 2048 >> 1;
				int var8;
				if (this.distanceMode == 0) {
					var8 = (var6 - var3) * this.scale;
				} else {
					int var9 = var4 * var4 + var7 * var7 >> 12;
					int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
					var8 = (int) ((double) (var10 * this.scale) * 3.141592653589793D);
				}
				int var11 = var8 - (var8 & 0xFFFFF000);
				if (this.waveform == 0) {
					var11 = Statics.field1734[var11 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.waveform == 2) {
					var11 -= 2048;
					if (var11 < 0) {
						var11 = -var11;
					}
					var11 = 2048 - var11 << 1;
				}
				var2[var5] = var11;
			}
		}
		return var2;
	}
}
