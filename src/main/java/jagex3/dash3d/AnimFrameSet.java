package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable2;
import jagex3.js5.Js5;

@ObfuscatedName("rc")
public final class AnimFrameSet extends Linkable2 {

	@ObfuscatedName("rc.P")
	public final AnimFrame[] field2871;

	public AnimFrameSet(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.method200(arg2);
		this.field2871 = new AnimFrame[var6];
		int[] var7 = arg0.method207(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			AnimBase var9 = null;
			byte[] var10 = arg0.method206(arg2, var7[var8]);
			int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
			for (AnimBase var12 = (AnimBase) var5.head(); var12 != null; var12 = (AnimBase) var5.next()) {
				if (var11 == var12.field2108) {
					var9 = var12;
					break;
				}
			}
			if (var9 == null) {
				byte[] var13 = arg1.method217(0, var11);
				var9 = new AnimBase(var11, var13);
				var5.push(var9);
			}
			this.field2871[var7[var8]] = new AnimFrame(var10, var9);
		}
	}

	@ObfuscatedName("ed.a(BLea;Lea;ZI)Lrc;")
	public static AnimFrameSet load(Js5 arg0, Js5 arg1, int arg2) {
		int[] var3 = arg1.method207(arg2);
		boolean var4 = true;
		for (int var5 = 0; var5 < var3.length; var5++) {
			byte[] var6 = arg1.method217(var3[var5], arg2);
			if (var6 == null) {
				var4 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg0.method217(0, var7);
				if (var8 == null) {
					var4 = false;
				}
			}
		}
		if (!var4) {
			return null;
		}
		try {
			return new AnimFrameSet(arg1, arg0, arg2, false);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("rc.a(IB)Z")
	public boolean method958(int arg0) {
		return this.field2871[arg0].field977;
	}
}
