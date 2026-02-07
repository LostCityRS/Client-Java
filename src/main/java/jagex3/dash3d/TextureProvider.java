package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("je")
public interface TextureProvider {

	@ObfuscatedName("je.a(IZ)I")
	int getAverageRgb(int arg0);

	@ObfuscatedName("je.a(ZI)Z")
	boolean isLowMem(int arg0);

	@ObfuscatedName("je.a(II)[I")
	int[] getTexels(int arg0);

	@ObfuscatedName("je.b(II)Z")
	boolean isOpaque(int arg0);
}
