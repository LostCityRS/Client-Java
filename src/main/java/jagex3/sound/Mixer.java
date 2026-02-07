package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

@ObfuscatedName("qe")
public final class Mixer extends PcmStream {

	@ObfuscatedName("qe.v")
	public final LinkList field2773 = new LinkList();

	@ObfuscatedName("qe.w")
	public final LinkList field2774 = new LinkList();

	@ObfuscatedName("qe.x")
	public int field2775 = -1;

	@ObfuscatedName("qe.y")
	public int field2776 = 0;

	@ObfuscatedName("qe.a(Lfd;)V")
	public synchronized void method907(PcmStream arg0) {
		arg0.unlink();
	}

	@ObfuscatedName("qe.b([III)V")
	@Override
	public synchronized void method116(int[] arg0, int arg1, int arg2) {
		do {
			if (this.field2775 < 0) {
				this.method908(arg0, arg1, arg2);
				return;
			}
			if (this.field2776 + arg2 < this.field2775) {
				this.field2776 += arg2;
				this.method908(arg0, arg1, arg2);
				return;
			}
			int var4 = this.field2775 - this.field2776;
			this.method908(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.field2776 += var4;
			this.method911();
			MixerController var5 = (MixerController) this.field2774.method1211();
			synchronized (var5) {
				int var7 = var5.method1188(this);
				if (var7 < 0) {
					var5.field3509 = 0;
					this.method913(var5);
				} else {
					var5.field3509 = var7;
					this.method909(var5.field3320, var5);
				}
			}
		} while (arg2 != 0);
	}

	@ObfuscatedName("qe.c([III)V")
	public void method908(int[] arg0, int arg1, int arg2) {
		for (PcmStream var4 = (PcmStream) this.field2773.method1211(); var4 != null; var4 = (PcmStream) this.field2773.method1209()) {
			var4.method320(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("qe.a(Lv;Lw;)V")
	public void method909(Linkable arg0, MixerController arg1) {
		while (arg0 != this.field2774.field3581 && ((MixerController) arg0).field3509 <= arg1.field3509) {
			arg0 = arg0.field3320;
		}
		this.field2774.method1216(arg1, arg0);
		this.field2775 = ((MixerController) this.field2774.field3581.field3320).field3509;
	}

	@ObfuscatedName("qe.d(I)V")
	@Override
	public synchronized void method104(int arg0) {
		do {
			if (this.field2775 < 0) {
				this.method910(arg0);
				return;
			}
			if (this.field2776 + arg0 < this.field2775) {
				this.field2776 += arg0;
				this.method910(arg0);
				return;
			}
			int var2 = this.field2775 - this.field2776;
			this.method910(var2);
			arg0 -= var2;
			this.field2776 += var2;
			this.method911();
			MixerController var3 = (MixerController) this.field2774.method1211();
			synchronized (var3) {
				int var5 = var3.method1188(this);
				if (var5 < 0) {
					var3.field3509 = 0;
					this.method913(var3);
				} else {
					var3.field3509 = var5;
					this.method909(var3.field3320, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("qe.c()Lfd;")
	@Override
	public PcmStream method106() {
		return (PcmStream) this.field2773.method1211();
	}

	@ObfuscatedName("qe.e(I)V")
	public void method910(int arg0) {
		for (PcmStream var2 = (PcmStream) this.field2773.method1211(); var2 != null; var2 = (PcmStream) this.field2773.method1209()) {
			var2.method104(arg0);
		}
	}

	@ObfuscatedName("qe.b()Lfd;")
	@Override
	public PcmStream method113() {
		return (PcmStream) this.field2773.method1209();
	}

	@ObfuscatedName("qe.e()V")
	public void method911() {
		if (this.field2776 <= 0) {
			return;
		}
		for (MixerController var1 = (MixerController) this.field2774.method1211(); var1 != null; var1 = (MixerController) this.field2774.method1209()) {
			var1.field3509 -= this.field2776;
		}
		this.field2775 -= this.field2776;
		this.field2776 = 0;
	}

	@ObfuscatedName("qe.b(Lfd;)V")
	public synchronized void method912(PcmStream arg0) {
		this.field2773.method1207(arg0);
	}

	@ObfuscatedName("qe.a(Lw;)V")
	public void method913(MixerController arg0) {
		arg0.unlink();
		arg0.method1189();
		Linkable var2 = this.field2774.field3581.field3320;
		if (var2 == this.field2774.field3581) {
			this.field2775 = -1;
		} else {
			this.field2775 = ((MixerController) var2).field3509;
		}
	}

	@ObfuscatedName("qe.a()I")
	@Override
	public int method87() {
		return 0;
	}
}
