package deob;

import java.awt.Component;

@ObfuscatedName("cf")
public abstract class MouseWheelInterface {

    @ObfuscatedName("da.c(B)Lcf;")
    public static MouseWheelInterface method235() {
        try {
            return (MouseWheelInterface) Class.forName("deob.ClientMouseWheelListener").getDeclaredConstructor().newInstance();
        } catch (Throwable var0) {
            return null;
        }
    }

    @ObfuscatedName("cf.a(ILjava/awt/Component;)V")
	public abstract void method173(Component arg0);

	@ObfuscatedName("cf.a(B)I")
	public abstract int method176();

	@ObfuscatedName("cf.b(ILjava/awt/Component;)V")
	public abstract void removeListeners(Component arg0);
}
