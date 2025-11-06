package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.b")
	public long field374;

	@ObfuscatedName("v.c")
	public Linkable field375;

	@ObfuscatedName("v.d")
	public Linkable field376;

	@ObfuscatedName("v.a()V")
	public void method120() {
		if (this.field376 != null) {
			this.field376.field375 = this.field375;
			this.field375.field376 = this.field376;
			this.field375 = null;
			this.field376 = null;
		}
	}
}
