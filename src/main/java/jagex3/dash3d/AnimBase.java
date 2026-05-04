package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.io.Packet;

@ObfuscatedName("ha")
public final class AnimBase extends Linkable {

	@ObfuscatedName("ha.u")
	public final int[] field1409;

	@ObfuscatedName("ha.v")
	public final boolean[] field1410;

	@ObfuscatedName("ha.x")
	public final int field1412;

	@ObfuscatedName("ha.H")
	public final int field1422;

	@ObfuscatedName("ha.I")
	public final int[][] field1423;

	public AnimBase(int arg0, byte[] arg1) {
		this.field1412 = arg0;
		Packet var3 = new Packet(arg1);
		this.field1422 = var3.g1();
		this.field1410 = new boolean[this.field1422];
		this.field1409 = new int[this.field1422];
		this.field1423 = new int[this.field1422][];
		for (int var4 = 0; var4 < this.field1422; var4++) {
			this.field1409[var4] = var3.g1();
		}
		for (int var5 = 0; var5 < this.field1422; var5++) {
			this.field1410[var5] = var3.g1() == 1;
		}
		for (int var6 = 0; var6 < this.field1422; var6++) {
			this.field1423[var6] = new int[var3.g1()];
		}
		for (int var7 = 0; var7 < this.field1422; var7++) {
			for (int var8 = 0; var8 < this.field1423[var7].length; var8++) {
				this.field1423[var7][var8] = var3.g1();
			}
		}
	}
}
