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
		AnimFrameSet var1 = (AnimFrameSet) Statics.field2136.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = method690(SeqType.field939, arg0, SeqType.field2966);
		if (var2 != null) {
			Statics.field2136.method262((long) arg0, var2);
		}
		return var2;
	}

    @ObfuscatedName("mc.a(Lbd;BILbd;Z)Lt;")
    public static AnimFrameSet method690(Js5 arg0, int arg1, Js5 arg2) {
        boolean var3 = true;
        int[] var4 = arg0.method237(arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            byte[] var6 = arg0.method227(var4[var5], arg1);
            if (var6 == null) {
                var3 = false;
            } else {
                int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
                byte[] var8 = arg2.method227(0, var7);
                if (var8 == null) {
                    var3 = false;
                }
            }
        }
        if (!var3) {
            return null;
        }
        try {
            return new AnimFrameSet(arg0, arg2, arg1, false);
        } catch (Exception var9) {
            return null;
        }
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
			for (AnimBase var12 = (AnimBase) var5.head(); var12 != null; var12 = (AnimBase) var5.next()) {
				if (var12.field3114 == var11) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = arg1.method227(0, var11);
				var10 = new AnimBase(var11, var13);
				var5.push(var10);
			}
			this.field2825[var7[var8]] = new AnimFrame(var9, var10);
		}
	}
}
