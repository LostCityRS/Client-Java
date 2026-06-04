package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("fe")
public interface TextureProvider {

	@ObfuscatedName("fe.a(II)Z")
	boolean isOpaque(int arg0);

	@ObfuscatedName("fe.a(FIZ)[I")
	int[] getTexels(float arg0, int arg1);

	@ObfuscatedName("fe.a(IB)Z")
	boolean isTextureEnabled(int arg0);

	@ObfuscatedName("fe.b(IB)Z")
	boolean isLowMem(int arg0);

	@ObfuscatedName("fe.b(II)I")
	int getAverageRgb(int arg0);

	@ObfuscatedName("fe.c(IB)Z")
	boolean isLoaded(int arg0);

	@ObfuscatedName("fe.c(II)[I")
	int[] getTexels(int arg0);
}
