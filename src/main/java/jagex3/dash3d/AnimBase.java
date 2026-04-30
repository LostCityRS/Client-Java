package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;

@ObfuscatedName("va")
public final class AnimBase extends Linkable {

	@ObfuscatedName("va.cb")
	public final int[][] labels;

	@ObfuscatedName("va.fb")
	public final int size;

	@ObfuscatedName("va.jb")
	public final int id;

	@ObfuscatedName("va.mb")
	public final int[] type;

	public AnimBase(int arg0, byte[] arg1) {
		this.id = arg0;
		Packet var3 = new Packet(arg1);
		this.size = var3.g1();
		this.labels = new int[this.size][];
		this.type = new int[this.size];
		for (int var4 = 0; var4 < this.size; var4++) {
			this.type[var4] = var3.g1();
		}
		for (int var5 = 0; var5 < this.size; var5++) {
			this.labels[var5] = new int[var3.g1()];
		}
		for (int var6 = 0; var6 < this.size; var6++) {
			for (int var7 = 0; var7 < this.labels[var6].length; var7++) {
				this.labels[var6][var7] = var3.g1();
			}
		}
	}
}
