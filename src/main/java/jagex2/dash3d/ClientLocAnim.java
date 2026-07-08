package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;

@ObfuscatedName("bb")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("bb.n")
	public final int id;

	@ObfuscatedName("bb.o")
	public final int shape;

	@ObfuscatedName("bb.p")
	public final int angle;

	@ObfuscatedName("bb.u")
	public SeqType anim;

	@ObfuscatedName("bb.v")
	public int animFrame;

	@ObfuscatedName("bb.w")
	public int animCycle;

	@ObfuscatedName("bb.m")
	public static Client app;

	@ObfuscatedName("bb.q")
	public final int heightSW;

	@ObfuscatedName("bb.r")
	public final int heightSE;

	@ObfuscatedName("bb.s")
	public final int heightNE;

	@ObfuscatedName("bb.t")
	public final int heightNW;

	@ObfuscatedName("bb.x")
	public final int multivarbit;

	@ObfuscatedName("bb.y")
	public final int[] multiloc;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9) {
		id = arg1;
		shape = arg2;
		angle = arg0;
		heightSW = arg6;
		heightSE = arg9;
		heightNE = arg4;
		heightNW = arg3;
		if (arg7 != -1) {
			anim = SeqType.list[arg7];
			animFrame = 0;
			animCycle = Client.loopCycle;
			if (arg8 && anim.loops != -1) {
				animFrame = (int) (Math.random() * (double) anim.numFrames);
				animCycle -= (int) (Math.random() * (double) anim.getDelay(animFrame));
			}
		}
		LocType var11 = LocType.list(id);
		multivarbit = var11.multivarbit;
		multiloc = var11.multiloc;
	}

	@ObfuscatedName("bb.a(I)Leb;")
	@Override
	public Model getTempModel() {
		int var1 = -1;
		if (anim != null) {
			int var2 = Client.loopCycle - animCycle;
			if (var2 > 100 && anim.loops > 0) {
				var2 = 100;
			}
			label45: {
				do {
					do {
						if (var2 <= anim.getDelay(animFrame)) {
							break label45;
						}
						var2 -= anim.getDelay(animFrame);
						animFrame++;
					} while (animFrame < anim.numFrames);
					animFrame -= anim.loops;
				} while (animFrame >= 0 && animFrame < anim.numFrames);
				anim = null;
			}
			animCycle = Client.loopCycle - var2;
			var1 = anim.frames[animFrame];
		}
		LocType var9;
		if (multiloc == null) {
			var9 = LocType.list(id);
		} else {
			VarbitType var3 = VarbitType.list[multivarbit];
			int var4 = var3.basevar;
			int var5 = var3.startbit;
			int var6 = var3.endbit;
			int var7 = Client.readbit[var6 - var5];
			int var8 = app.var[var4] >> var5 & var7;
			if (var8 < 0 || var8 >= multiloc.length || multiloc[var8] == -1) {
				return null;
			}
			var9 = LocType.list(multiloc[var8]);
		}
		return var9.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, var1);
	}
}
