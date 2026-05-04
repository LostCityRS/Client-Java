package jagex3.client;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("cf")
public abstract class MouseWheelInterface {

    @ObfuscatedName("da.c(B)Lcf;")
    public static MouseWheelInterface method235() {
        try {
            return (MouseWheelInterface) Class.forName("jagex3.client.ClientMouseWheelListener").getDeclaredConstructor().newInstance();
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
