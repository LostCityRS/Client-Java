package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;

@ObfuscatedName("nb")
public final class AnimBase extends Linkable {

	@ObfuscatedName("nb.r")
	public final int[][] field2102;

	@ObfuscatedName("nb.v")
	public final int[] field2106;

	@ObfuscatedName("nb.x")
	public final int field2108;

	@ObfuscatedName("nb.A")
	public final int field2111;

	public AnimBase(int arg0, byte[] arg1) {
		this.field2108 = arg0;
		Packet var3 = new Packet(arg1);
		this.field2111 = var3.g1();
		this.field2102 = new int[this.field2111][];
		this.field2106 = new int[this.field2111];
		for (int var4 = 0; var4 < this.field2111; var4++) {
			this.field2106[var4] = var3.g1();
		}
		for (int var5 = 0; var5 < this.field2111; var5++) {
			this.field2102[var5] = new int[var3.g1()];
		}
		for (int var6 = 0; var6 < this.field2111; var6++) {
			for (int var7 = 0; var7 < this.field2102[var6].length; var7++) {
				this.field2102[var6][var7] = var3.g1();
			}
		}
	}
}
