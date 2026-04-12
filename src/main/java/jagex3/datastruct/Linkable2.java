package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("hb")
public class Linkable2 extends Linkable {

	@ObfuscatedName("hb.db")
	public Linkable2 field1158;

	@ObfuscatedName("hb.eb")
	public static boolean field1159 = false;

	@ObfuscatedName("hb.ib")
	public Linkable2 field1163;

	@ObfuscatedName("hb.c(I)V")
	public final void method468() {
		if (this.field1163 != null) {
			this.field1163.field1158 = this.field1158;
			this.field1158.field1163 = this.field1163;
			this.field1163 = null;
			this.field1158 = null;
		}
	}
}
