package deob;

@ObfuscatedName("g")
public class AnimBase {

	@ObfuscatedName("g.a")
	public int field157;

	@ObfuscatedName("g.b")
	public int field158;

	@ObfuscatedName("g.c")
	public int[] field159;

	@ObfuscatedName("g.d")
	public int[][] field160;

	public AnimBase(Packet arg0, int arg1) {
		this.field158 = arg0.method238();
		this.field159 = new int[this.field158];
		this.field160 = new int[this.field158][];
		for (int var3 = 0; var3 < this.field158; var3++) {
			this.field159[var3] = arg0.method238();
		}
		for (int var4 = 0; var4 < this.field158; var4++) {
			int var5 = arg0.method238();
			this.field160[var4] = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field160[var4][var6] = arg0.method238();
			}
		}
		if (arg1 < 9 || arg1 > 9) {
			this.field157 = -74;
		}
	}
}
