package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;

@ObfuscatedName("z")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("z.ub")
	public NpcType type;

	@ObfuscatedName("z.rb")
	public int field451;

	@ObfuscatedName("z.sb")
	public final int field452 = 8;

	@ObfuscatedName("z.tb")
	public final boolean field453 = true;

	@ObfuscatedName("z.a(I)Leb;")
	@Override
	public Model getTempModel() {
		if (type == null) {
			return null;
		}
		Model var1 = getTempModel2();
		if (var1 == null) {
			return null;
		}
		super.height = var1.minY;
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotType var2 = SpotType.list[super.spotanimId];
			Model var3 = var2.getTempModel2();
			if (var3 != null) {
				int var4 = var2.seq.frames[super.spotanimFrame];
				Model var5 = new Model(var3, AnimFrame.animateTransparencies(var4), false, field451, true);
				var5.translate(-super.spotanimHeight, 0, 0);
				var5.prepareAnim();
				var5.animate(var4);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var2.resizeh != 128 || var2.resizev != 128) {
					var5.resize(var2.resizeh, var2.resizeh, var2.resizev);
				}
				var5.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(true, 0, var6, 2);
			}
		}
		if (type.size == 1) {
			var1.useAABBMouseCheck = true;
		}
		return var1;
	}

	@ObfuscatedName("z.c(Z)Leb;")
	public Model getTempModel2() {
		if (super.primaryAnim >= 0 && super.primaryAnimDelay == 0) {
			int var1 = SeqType.list[super.primaryAnim].frames[super.primaryFrame];
			int var2 = -1;
			if (super.secondaryAnim >= 0 && super.secondaryAnim != super.readyanim) {
				var2 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
			}
			return type.getTempModel(var2, var1, SeqType.list[super.primaryAnim].walkmerge);
		}
		int var3 = -1;
		if (super.secondaryAnim >= 0) {
			var3 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
		}
		return type.getTempModel(-1, var3, null);
	}

	@ObfuscatedName("z.b(Z)Z")
	@Override
	public boolean isReady() {
		return type != null;
	}
}
