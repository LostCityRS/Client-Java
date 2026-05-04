package deob;

import java.awt.Component;

@ObfuscatedName("hg")
public final class class84 extends class55 {

	@ObfuscatedName("hg.N")
	public final int field1528;

	@ObfuscatedName("hg.O")
	public static class178 field1529;

	public class84(class181 arg0, int arg1) {
		field1529 = arg0.method1286();
		this.field1528 = arg1;
	}

	@ObfuscatedName("hg.a(Ljava/awt/Component;)V")
	@Override
	public void method412(Component arg0) throws Exception {
		field1529.method1273(class7.field99, arg0, class11.field161);
	}

	@ObfuscatedName("hg.c()V")
	@Override
	public void method408() {
		field1529.method1271(this.field1528);
	}

	@ObfuscatedName("hg.c(I)V")
	@Override
	public void method409(int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		field1529.method1269(this.field1528, arg0);
	}

	@ObfuscatedName("hg.d()V")
	@Override
	public void method413() {
		field1529.method1274(this.field1528);
	}

	@ObfuscatedName("hg.b()V")
	@Override
	public void method400() {
		field1529.method1270(this.field1528, super.field1025);
	}

	@ObfuscatedName("hg.a()I")
	@Override
	public int method398() {
		return field1529.method1272(this.field1528);
	}
}
