package deob;

@ObfuscatedName("qh")
public final class class182 extends class86 {

	@ObfuscatedName("qh.j")
	public long field3598 = System.nanoTime();

	@ObfuscatedName("qh.a(III)I")
	@Override
	public int method204(int arg0, int arg1) {
		long var3 = (long) arg0 * 1000000L;
		long var5 = this.field3598 - System.nanoTime();
		int var7 = 0;
		if (var5 < var3) {
			var5 = var3;
		}
		class21.method98(var5 / 1000000L);
		long var8 = System.nanoTime();
		while (var7 < 10 && (var7 < 1 || this.field3598 < var8)) {
			var7++;
			this.field3598 += (long) arg1 * 1000000L;
		}
		if (var8 > this.field3598) {
			this.field3598 = var8;
		}
		return var7;
	}

	@ObfuscatedName("qh.a(B)V")
	@Override
	public void method205() {
		this.field3598 = System.nanoTime();
	}
}
