package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable2;
import jagex3.js5.Js5;

@ObfuscatedName("li")
public final class AnimFrameSet extends Linkable2 {

	@ObfuscatedName("li.L")
	public final AnimFrame[] list;

	public AnimFrameSet(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.getFileIdLimit(arg2);
		this.list = new AnimFrame[var6];
		int[] var7 = arg0.getFileList(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.getFile(var7[var8], arg2);
			int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
			AnimBase var11 = null;
			for (AnimBase var12 = (AnimBase) var5.head(); var12 != null; var12 = (AnimBase) var5.next()) {
				if (var10 == var12.id) {
					var11 = var12;
					break;
				}
			}
			if (var11 == null) {
				byte[] var13 = arg1.peekFile(0, var10);
				var11 = new AnimBase(var10, var13);
				var5.push(var11);
			}
			this.list[var7[var8]] = new AnimFrame(var9, var11);
		}
	}

	@ObfuscatedName("li.a(ZI)Z")
	public boolean getAnimateTransparencies(int arg0) {
		return this.list[arg0].animateTransparencies;
	}
}
