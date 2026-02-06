package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ic")
public final class class59 extends class145 implements MouseWheelListener {

	@ObfuscatedName("ic.o")
	public int field1344 = 0;

	@ObfuscatedName("ic.a(Ljava/awt/Component;Z)V")
	@Override
	public void method454(Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		this.field1344 += arg0.getWheelRotation();
	}

	@ObfuscatedName("ic.a(ILjava/awt/Component;)V")
	@Override
	public void method455(Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@ObfuscatedName("ic.a(B)I")
	@Override
	public synchronized int method456() {
		int var1 = this.field1344;
		this.field1344 = 0;
		return var1;
	}
}
