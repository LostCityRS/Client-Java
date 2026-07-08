package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("fb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("fb.o")
	public final SpotType type;

	@ObfuscatedName("fb.t")
	public final int y;

	@ObfuscatedName("fb.p")
	public final int startCycle;

	@ObfuscatedName("fb.q")
	public final int level;

	@ObfuscatedName("fb.r")
	public final int x;

	@ObfuscatedName("fb.s")
	public final int z;

	@ObfuscatedName("fb.u")
	public int animFrame;

	@ObfuscatedName("fb.v")
	public int animCycle;

	@ObfuscatedName("fb.w")
	public boolean animComplete = false;

	@ObfuscatedName("fb.m")
	public int field603;

	@ObfuscatedName("fb.n")
	public final int field604 = 393;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		type = SpotType.list[arg6];
		level = arg1;
		x = arg0;
		z = arg5;
		y = arg2;
		startCycle = arg7 + arg3;
		animComplete = false;
	}

	@ObfuscatedName("fb.a(I)Leb;")
	@Override
	public Model getTempModel() {
		Model var1 = type.getTempModel2();
		if (var1 == null) {
			return null;
		}
		int var2 = type.seq.frames[animFrame];
		Model var3 = new Model(var1, AnimFrame.animateTransparencies(var2), false, field603, true);
		if (!animComplete) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (type.resizeh != 128 || type.resizev != 128) {
			var3.resize(type.resizeh, type.resizeh, type.resizev);
		}
		if (type.angle != 0) {
			if (type.angle == 90) {
				var3.rotate90();
			}
			if (type.angle == 180) {
				var3.rotate90();
				var3.rotate90();
			}
			if (type.angle == 270) {
				var3.rotate90();
				var3.rotate90();
				var3.rotate90();
			}
		}
		var3.calculateNormals(type.ambient + 64, type.contrast + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("fb.a(II)V")
	public void update(int arg0) {
		animCycle += arg0;
		while (true) {
			do {
				do {
					if (animCycle <= type.seq.getDelay(animFrame)) {
						return;
					}
					animCycle -= type.seq.getDelay(animFrame) + 1;
					animFrame++;
				} while (animFrame < type.seq.numFrames);
			} while (animFrame >= 0 && animFrame < type.seq.numFrames);
			animFrame = 0;
			animComplete = true;
		}
	}
}
