package deob;

@ObfuscatedName("pd")
public final class class108 extends class9 {

	@ObfuscatedName("pd.l")
	public long field2548 = System.nanoTime();

	@ObfuscatedName("pd.a(III)I")
	@Override
	public int method58(int arg0, int arg1) {
		long var3 = this.field2548 - System.nanoTime();
		long var5 = (long) arg1 * 1000000L;
		if (var3 < var5) {
			var3 = var5;
		}
		class54.method426(var3 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;
		while (var9 < 10 && (var9 < 1 || var7 > this.field2548)) {
			var9++;
			this.field2548 += (long) arg0 * 1000000L;
		}
		if (var7 > this.field2548) {
			this.field2548 = var7;
		}
		return var9;
	}

	@ObfuscatedName("pd.a(I)V")
	@Override
	public void method57() {
		this.field2548 = System.nanoTime();
	}
}
