package jagex3.client.input.mouse;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("uf")
public abstract class MouseWheelInterface {

	@ObfuscatedName("fa.b(B)Luf;")
	public static MouseWheelInterface getProvider() {
		try {
			return (MouseWheelInterface) Class.forName("ic").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return null;
		}
	}

	@ObfuscatedName("uf.a(Ljava/awt/Component;Z)V")
	public abstract void removeListeners(Component arg0);

	@ObfuscatedName("uf.a(B)I")
	public abstract int getRotation();

	@ObfuscatedName("uf.a(ILjava/awt/Component;)V")
	public abstract void addListeners(Component arg0);
}
