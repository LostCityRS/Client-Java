package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.SignLink;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;

import java.awt.*;

@ObfuscatedName("b")
public final class Mixer extends PcmStream {

	@ObfuscatedName("b.eb")
	public final int maxStreams = 16;

	@ObfuscatedName("b.fb")
	public final LinkList[] streamsByPriority = new LinkList[8];

	@ObfuscatedName("b.gb")
	public final LinkList controllers = new LinkList();

	@ObfuscatedName("b.hb")
	public int priorityRefreshTimer = 0;

	@ObfuscatedName("b.ib")
	public int nextControllerTime = -1;

	@ObfuscatedName("b.jb")
	public int controllerOffset = 0;

    @ObfuscatedName("ub.a(Llc;Ljava/awt/Component;I)Lb;")
    public static Mixer create(SignLink arg0, Component arg1) {
        PcmPlayer.initGlobal(arg1, arg0);
        Mixer var2 = new Mixer();
        PcmPlayer.playStream(var2);
        return var2;
    }

    @ObfuscatedName("b.a(Loc;)V")
	public synchronized void playStream(PcmStream arg0) {
		LinkList var2 = this.streamsByPriority[priorityBucket(arg0)];
		var2.pushFront(arg0);
	}

	@ObfuscatedName("b.b(I)V")
	@Override
	public synchronized void pretendToMix(int arg0) {
		do {
			if (this.nextControllerTime < 0) {
				this.skipStreams(arg0);
				return;
			}
			if (this.controllerOffset + arg0 < this.nextControllerTime) {
				this.controllerOffset += arg0;
				this.skipStreams(arg0);
				return;
			}
			int var2 = this.nextControllerTime - this.controllerOffset;
			this.skipStreams(var2);
			arg0 -= var2;
			this.controllerOffset += var2;
			this.normalizeControllerTimes();
			PcmMixerListener var3 = (PcmMixerListener) this.controllers.head();
			synchronized (var3) {
				int var5 = var3.update(this);
				if (var5 < 0) {
					var3.remainingSamples = 0;
					this.unlinkController(var3);
				} else {
					var3.remainingSamples = var5;
					this.sortController(var3.next, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("b.a(Lnd;Lne;)V")
	public void sortController(Linkable arg0, PcmMixerListener arg1) {
		while (this.controllers.sentinel != arg0 && ((PcmMixerListener) arg0).remainingSamples <= arg1.remainingSamples) {
			arg0 = arg0.next;
		}
		this.controllers.insertBefore(arg0, arg1);
		this.nextControllerTime = ((PcmMixerListener) this.controllers.sentinel.next).remainingSamples;
	}

	@ObfuscatedName("b.b([III)I")
	public int mixStreams(int[] arg0, int arg1, int arg2) {
		this.priorityRefreshTimer -= arg2;
		if (this.priorityRefreshTimer <= 0) {
			this.priorityRefreshTimer += PcmPlayer.frequency >> 4;
			for (int var4 = 0; var4 < 8; var4++) {
				LinkList var5 = this.streamsByPriority[var4];
				for (PcmStream var6 = (PcmStream) var5.head(); var6 != null; var6 = (PcmStream) var5.next()) {
					int var7 = priorityBucket(var6);
					if (var4 != var7) {
						this.streamsByPriority[var7].pushFront(var6);
					}
				}
			}
		}
		for (int var8 = 0; var8 < 8; var8++) {
			LinkList var9 = this.streamsByPriority[var8];
			for (PcmStream var10 = (PcmStream) var9.head(); var10 != null; var10 = (PcmStream) var9.next()) {
				var10.mixed = false;
				if (var10.streamable != null) {
					var10.streamable.position = 0;
				}
			}
		}
		int var11 = 0;
		int var12 = 255;
		int var13 = 7;
		while (var12 != 0) {
			int var14;
			int var15;
			if (var13 < 0) {
				var14 = var13 & 0x3;
				var15 = -(var13 >> 2);
			} else {
				var14 = var13;
				var15 = 0;
			}
			for (int var16 = var12 >>> var14 & 0x11111111; var16 != 0; var16 >>>= 0x4) {
				if ((var16 & 0x1) != 0) {
					var12 &= ~(0x1 << var14);
					LinkList var17 = this.streamsByPriority[var14];
					for (PcmStream var18 = (PcmStream) var17.head(); var18 != null; var18 = (PcmStream) var17.next()) {
						if (!var18.mixed) {
							PcmStreamable var19 = var18.streamable;
							if (var19 == null || var19.position <= var15) {
								if (var11 < this.maxStreams) {
									int var20 = var18.doMix(arg0, arg1, arg2);
									var11 += var20;
									if (var19 != null) {
										var19.position += var20;
									}
								} else {
									var18.pretendToMix(arg2);
								}
								var18.mixed = true;
							} else {
								var12 |= 0x1 << var14;
							}
						}
					}
				}
				var14 += 4;
				var15++;
			}
			var13--;
		}
		return var11;
	}

	@ObfuscatedName("b.b(Loc;)I")
	public static int priorityBucket(PcmStream arg0) {
		return arg0.priority() >> 5;
	}

	@ObfuscatedName("b.a(Lne;)V")
	public void unlinkController(PcmMixerListener arg0) {
		arg0.unlink();
		arg0.remove();
		Linkable var2 = this.controllers.sentinel.next;
		if (this.controllers.sentinel == var2) {
			this.nextControllerTime = -1;
		} else {
			this.nextControllerTime = ((PcmMixerListener) var2).remainingSamples;
		}
	}

	public Mixer() {
		for (int var1 = 0; var1 < 8; var1++) {
			this.streamsByPriority[var1] = new LinkList();
		}
	}

	@ObfuscatedName("b.c(I)V")
	public void skipStreams(int arg0) {
		this.priorityRefreshTimer -= arg0;
		if (this.priorityRefreshTimer < 0) {
			this.priorityRefreshTimer = 0;
		}
		for (int var2 = 0; var2 < 8; var2++) {
			LinkList var3 = this.streamsByPriority[var2];
			for (PcmStream var4 = (PcmStream) var3.head(); var4 != null; var4 = (PcmStream) var3.next()) {
				var4.pretendToMix(arg0);
			}
		}
	}

	@ObfuscatedName("b.b()V")
	public void normalizeControllerTimes() {
		if (this.controllerOffset <= 0) {
			return;
		}
		for (PcmMixerListener var1 = (PcmMixerListener) this.controllers.head(); var1 != null; var1 = (PcmMixerListener) this.controllers.next()) {
			var1.remainingSamples -= this.controllerOffset;
		}
		this.nextControllerTime -= this.controllerOffset;
		this.controllerOffset = 0;
	}

	@ObfuscatedName("b.a([III)I")
	@Override
	public synchronized int doMix(int[] arg0, int arg1, int arg2) {
		int var5;
		do {
			if (this.nextControllerTime < 0) {
				return this.mixStreams(arg0, arg1, arg2);
			}
			if (this.controllerOffset + arg2 < this.nextControllerTime) {
				this.controllerOffset += arg2;
				return this.mixStreams(arg0, arg1, arg2);
			}
			int var4 = this.nextControllerTime - this.controllerOffset;
			var5 = this.mixStreams(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.controllerOffset += var4;
			this.normalizeControllerTimes();
			PcmMixerListener var6 = (PcmMixerListener) this.controllers.head();
			synchronized (var6) {
				int var8 = var6.update(this);
				if (var8 < 0) {
					var6.remainingSamples = 0;
					this.unlinkController(var6);
				} else {
					var6.remainingSamples = var8;
					this.sortController(var6.next, var6);
				}
			}
		} while (arg2 != 0);
		return var5;
	}

	@ObfuscatedName("b.c(Loc;)V")
	public synchronized void stopStream(PcmStream arg0) {
		arg0.unlink();
	}
}
