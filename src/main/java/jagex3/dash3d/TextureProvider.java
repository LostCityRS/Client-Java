package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("od")
public interface TextureProvider {

	@ObfuscatedName("od.a(II)[I")
	int[] getTexels(int arg0);

	@ObfuscatedName("od.a(BI)Z")
	boolean isOpaque(int arg0);

	@ObfuscatedName("od.a(ZI)I")
	int getAverageRgb(int arg0);

	@ObfuscatedName("od.a(IB)Z")
	boolean isLowMem(int arg0);
}
