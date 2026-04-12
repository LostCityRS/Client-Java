package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.SeqType;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable2;
import jagex3.js5.Js5;

@ObfuscatedName("t")
public final class AnimFrameSet extends Linkable2 {

	@ObfuscatedName("t.Nb")
	public final AnimFrame[] field2825;

	@ObfuscatedName("s.a(BI)Lt;")
	public static AnimFrameSet method897(int arg0) {
		AnimFrameSet var1 = (AnimFrameSet) Statics.field2136.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = Statics.method690(SeqType.field939, arg0, SeqType.field2966);
		if (var2 != null) {
			Statics.field2136.method262((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("t.a(II)Z")
	public boolean method938(int arg0) {
		return this.field2825[arg0].field2123;
	}

	public AnimFrameSet(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.method235(arg2);
		this.field2825 = new AnimFrame[var6];
		int[] var7 = arg0.method237(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.method217(var7[var8], arg2);
			AnimBase var10 = null;
			int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
			for (AnimBase var12 = (AnimBase) var5.method802(); var12 != null; var12 = (AnimBase) var5.method809()) {
				if (var12.field3114 == var11) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = arg1.method227(0, var11);
				var10 = new AnimBase(var11, var13);
				var5.method804(var10);
			}
			this.field2825[var7[var8]] = new AnimFrame(var9, var10);
		}
	}
}
