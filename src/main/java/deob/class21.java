package deob;

import java.awt.Component;

@ObfuscatedName("cf")
public final class class21 extends class114 {

	@ObfuscatedName("cf.Q")
	public final int field376;

	@ObfuscatedName("cf.A")
	public static class22 field375;

	@ObfuscatedName("cf.e()V")
	public static void method140() {
		field375 = null;
	}

	public class21(class25 arg0, int arg1) {
		field375 = arg0.method177();
		this.field376 = arg1;
	}

	@ObfuscatedName("cf.b()I")
	@Override
	public int method138() {
		return field375.method157(this.field376);
	}

	@ObfuscatedName("cf.a()V")
	@Override
	public void method139() {
		field375.method161(this.field376, super.field2656);
	}

	@ObfuscatedName("cf.a(Ljava/awt/Component;)V")
	@Override
	public void method141(Component arg0) throws Exception {
		field375.method159(class139.field3211, arg0, class56.field1310);
	}

	@ObfuscatedName("cf.d()V")
	@Override
	public void method142() {
		field375.method160(this.field376);
	}

	@ObfuscatedName("cf.a(I)V")
	@Override
	public void method143(int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		field375.method158(this.field376, arg0);
	}

	@ObfuscatedName("cf.c()V")
	@Override
	public void method144() {
		field375.method162(this.field376);
	}
}
