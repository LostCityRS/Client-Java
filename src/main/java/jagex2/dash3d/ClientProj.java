package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("db")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("db.o")
	public final SpotType spotanim;

	@ObfuscatedName("db.p")
	public final int level;

	@ObfuscatedName("db.q")
	public final int srcX;

	@ObfuscatedName("db.r")
	public final int srcZ;

	@ObfuscatedName("db.s")
	public final int h1;

	@ObfuscatedName("db.t")
	public final int h2;

	@ObfuscatedName("db.u")
	public final int t1;

	@ObfuscatedName("db.v")
	public final int t2;

	@ObfuscatedName("db.w")
	public final int angle;

	@ObfuscatedName("db.x")
	public final int startpos;

	@ObfuscatedName("db.y")
	public final int target;

	@ObfuscatedName("db.z")
	public boolean mobile = false;

	@ObfuscatedName("db.A")
	public double x;

	@ObfuscatedName("db.B")
	public double z;

	@ObfuscatedName("db.C")
	public double y;

	@ObfuscatedName("db.D")
	public double velocityX;

	@ObfuscatedName("db.E")
	public double velocityZ;

	@ObfuscatedName("db.F")
	public double velocity;

	@ObfuscatedName("db.G")
	public double velocityY;

	@ObfuscatedName("db.H")
	public double accelerationY;

	@ObfuscatedName("db.I")
	public int yaw;

	@ObfuscatedName("db.J")
	public int pitch;

	@ObfuscatedName("db.K")
	public int animFrame;

	@ObfuscatedName("db.L")
	public int animCycle;

	@ObfuscatedName("db.m")
	public int field498;

	@ObfuscatedName("db.n")
	public final int field499 = 6;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
		spotanim = SpotType.list[arg3];
		level = arg6;
		srcX = arg4;
		srcZ = arg7;
		h1 = arg1;
		t1 = arg2;
		t2 = arg8;
		angle = arg9;
		startpos = arg0;
		target = arg5;
		h2 = arg11;
		mobile = false;
	}

	@ObfuscatedName("db.a(IZIII)V")
	public void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!mobile) {
			double var5 = (double) (arg3 - srcX);
			double var7 = (double) (arg1 - srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			x = (double) srcX + var5 * (double) startpos / var9;
			z = (double) srcZ + var7 * (double) startpos / var9;
			y = h1;
		}
		double var11 = (double) (t2 + 1 - arg2);
		velocityX = ((double) arg3 - x) / var11;
		velocityZ = ((double) arg1 - z) / var11;
		velocity = Math.sqrt(velocityX * velocityX + velocityZ * velocityZ);
		if (!mobile) {
			velocityY = -velocity * Math.tan((double) angle * 0.02454369D);
		}
		accelerationY = ((double) arg0 - y - velocityY * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(II)V")
	public void move(int arg0) {
		mobile = true;
		x += velocityX * (double) arg0;
		z += velocityZ * (double) arg0;
		y += velocityY * (double) arg0 + accelerationY * 0.5D * (double) arg0 * (double) arg0;
		velocityY += accelerationY * (double) arg0;
		yaw = (int) (Math.atan2(velocityX, velocityZ) * 325.949D) + 1024 & 0x7FF;
		pitch = (int) (Math.atan2(velocityY, velocity) * 325.949D) & 0x7FF;
		if (spotanim.seq != null) {
			animCycle += arg0;
			while (animCycle > spotanim.seq.getDelay(animFrame)) {
				animCycle -= spotanim.seq.getDelay(animFrame) + 1;
				animFrame++;
				if (animFrame >= spotanim.seq.numFrames) {
					animFrame = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(I)Leb;")
	@Override
	public Model getTempModel() {
		Model var1 = spotanim.getTempModel2();
		if (var1 == null) {
			return null;
		}
		int var2 = -1;
		if (spotanim.seq != null) {
			var2 = spotanim.seq.frames[animFrame];
		}
		Model var3 = new Model(var1, AnimFrame.animateTransparencies(var2), false, field498, true);
		if (var2 != -1) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}
		if (spotanim.resizeh != 128 || spotanim.resizev != 128) {
			var3.resize(spotanim.resizeh, spotanim.resizeh, spotanim.resizev);
		}
		var3.rotateXAxis(pitch);
		var3.calculateNormals(spotanim.ambient + 64, spotanim.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
