package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;

@ObfuscatedName("va")
public final class AnimBase extends Linkable {

	@ObfuscatedName("va.cb")
	public final int[][] field3107;

	@ObfuscatedName("va.fb")
	public final int field3110;

	@ObfuscatedName("va.jb")
	public final int field3114;

	@ObfuscatedName("va.mb")
	public final int[] field3117;

	public AnimBase(int arg0, byte[] arg1) {
		this.field3114 = arg0;
		Packet var3 = new Packet(arg1);
		this.field3110 = var3.method144();
		this.field3107 = new int[this.field3110][];
		this.field3117 = new int[this.field3110];
		for (int var4 = 0; var4 < this.field3110; var4++) {
			this.field3117[var4] = var3.method144();
		}
		for (int var5 = 0; var5 < this.field3110; var5++) {
			this.field3107[var5] = new int[var3.method144()];
		}
		for (int var6 = 0; var6 < this.field3110; var6++) {
			for (int var7 = 0; var7 < this.field3107[var6].length; var7++) {
				this.field3107[var6][var7] = var3.method144();
			}
		}
	}
}
