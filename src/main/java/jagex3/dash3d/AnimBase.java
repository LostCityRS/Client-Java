package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;

@ObfuscatedName("ha")
public final class AnimBase extends Linkable {

	@ObfuscatedName("ha.u")
	public final int[] type;

	@ObfuscatedName("ha.v")
	public final boolean[] field1410;

	@ObfuscatedName("ha.x")
	public final int id;

	@ObfuscatedName("ha.H")
	public final int size;

	@ObfuscatedName("ha.I")
	public final int[][] labels;

	public AnimBase(int arg0, byte[] arg1) {
		this.id = arg0;
		Packet var3 = new Packet(arg1);
		this.size = var3.g1();
		this.field1410 = new boolean[this.size];
		this.type = new int[this.size];
		this.labels = new int[this.size][];
		for (int var4 = 0; var4 < this.size; var4++) {
			this.type[var4] = var3.g1();
		}
		for (int var5 = 0; var5 < this.size; var5++) {
			this.field1410[var5] = var3.g1() == 1;
		}
		for (int var6 = 0; var6 < this.size; var6++) {
			this.labels[var6] = new int[var3.g1()];
		}
		for (int var7 = 0; var7 < this.size; var7++) {
			for (int var8 = 0; var8 < this.labels[var7].length; var8++) {
				this.labels[var7][var8] = var3.g1();
			}
		}
	}
}
