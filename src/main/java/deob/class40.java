package deob;

import java.awt.*;

@ObfuscatedName("gd")
public final class class40 extends class94 {

	@ObfuscatedName("gd.d(I)V")
	@Override
	public void method433(int arg0) throws Exception {
		Statics.field1080.method664(arg0);
	}

	@ObfuscatedName("gd.d()I")
	@Override
	public int method434() {
		return Statics.field1080.method667();
	}

	public class40(class69 arg0, Component arg1) throws Exception {
		super(22050);
		Statics.field1080 = arg0.method649();
		Statics.field1080.method668(arg1);
		this.method818(arg0, 16384);
	}

	@ObfuscatedName("gd.e()V")
	@Override
	public void method435() {
		Statics.field1080.method666();
	}

	@ObfuscatedName("gd.c()V")
	@Override
	public void method436() {
		Statics.field1080.method665(class94.field2347);
	}

	@ObfuscatedName("gd.f()V")
	public static void method437() {
		Statics.field1080 = null;
	}
}
