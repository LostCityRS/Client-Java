package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable2;
import jagex3.js5.Js5;

@ObfuscatedName("t")
public final class AnimFrameSet extends Linkable2 {

	@ObfuscatedName("t.Nb")
	public final AnimFrame[] list;

	@ObfuscatedName("mc.a(Lbd;BILbd;Z)Lt;")
    public static AnimFrameSet load(Js5 arg0, int arg1, Js5 arg2) {
        boolean var3 = true;
        int[] var4 = arg0.getFileList(arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            byte[] var6 = arg0.peekFile(var4[var5], arg1);
            if (var6 == null) {
                var3 = false;
            } else {
                int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
                byte[] var8 = arg2.peekFile(0, var7);
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
	public boolean getAnimateTransparencies(int arg0) {
		return this.list[arg0].animateTransparencies;
	}

	public AnimFrameSet(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.getFileIdLimit(arg2);
		this.list = new AnimFrame[var6];
		int[] var7 = arg0.getFileList(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.getFile(var7[var8], arg2);
			AnimBase var10 = null;
			int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
			for (AnimBase var12 = (AnimBase) var5.head(); var12 != null; var12 = (AnimBase) var5.next()) {
				if (var12.id == var11) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = arg1.peekFile(0, var11);
				var10 = new AnimBase(var11, var13);
				var5.push(var10);
			}
			this.list[var7[var8]] = new AnimFrame(var9, var10);
		}
	}
}
