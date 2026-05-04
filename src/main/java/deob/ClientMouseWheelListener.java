package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ji")
public final class ClientMouseWheelListener extends MouseWheelInterface implements MouseWheelListener {

	@ObfuscatedName("ji.r")
	public int rotation = 0;

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		this.rotation += arg0.getWheelRotation();
	}

	@ObfuscatedName("ji.b(ILjava/awt/Component;)V")
	@Override
	public void removeListeners(Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@ObfuscatedName("ji.a(B)I")
	@Override
	public synchronized int method176() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

	@ObfuscatedName("ji.a(ILjava/awt/Component;)V")
	@Override
	public void method173(Component arg0) {
		arg0.addMouseWheelListener(this);
	}
}
