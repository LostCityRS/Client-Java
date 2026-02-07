package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.util.JagString;

@ObfuscatedName("qd")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("qd.ac")
	public int field2744 = -1;

	@ObfuscatedName("qd.bb")
	public int field2693 = 32;

	@ObfuscatedName("qd.bc")
	public int field2745;

	@ObfuscatedName("qd.cb")
	public int field2694 = 0;

	@ObfuscatedName("qd.cc")
	public final int[] field2746 = new int[4];

	@ObfuscatedName("qd.dc")
	public int field2747;

	@ObfuscatedName("qd.eb")
	public int field2696 = 0;

	@ObfuscatedName("qd.ec")
	public int field2748 = 0;

	@ObfuscatedName("qd.fb")
	public int field2697 = 0;

	@ObfuscatedName("qd.fc")
	public int field2749 = 0;

	@ObfuscatedName("qd.gb")
	public int field2698;

	@ObfuscatedName("qd.hc")
	public int field2751;

	@ObfuscatedName("qd.ic")
	public int field2752 = 0;

	@ObfuscatedName("qd.jb")
	public int field2701 = 0;

	@ObfuscatedName("qd.jc")
	public int field2753 = 0;

	@ObfuscatedName("qd.kc")
	public int field2754 = 0;

	@ObfuscatedName("qd.lc")
	public int field2755;

	@ObfuscatedName("qd.mb")
	public int field2704;

	@ObfuscatedName("qd.mc")
	public int targetId = -1;

	@ObfuscatedName("qd.nb")
	public int field2705 = -1;

	@ObfuscatedName("qd.nc")
	public int field2757 = 0;

	@ObfuscatedName("qd.ob")
	public int field2706 = 100;

	@ObfuscatedName("qd.oc")
	public final int[] field2758 = new int[4];

	@ObfuscatedName("qd.pc")
	public final int[] field2759 = new int[10];

	@ObfuscatedName("qd.qb")
	public int field2708 = -1;

	@ObfuscatedName("qd.rb")
	public int field2709 = -1;

	@ObfuscatedName("qd.sb")
	public int field2710;

	@ObfuscatedName("qd.tb")
	public int field2711 = 1;

	@ObfuscatedName("qd.ub")
	public int field2712 = -1;

	@ObfuscatedName("qd.vb")
	public int field2713 = 0;

	@ObfuscatedName("qd.wb")
	public int field2714 = 0;

	@ObfuscatedName("qd.yb")
	public int field2716 = -1;

	@ObfuscatedName("qd.Fb")
	public int field2723 = -1;

	@ObfuscatedName("qd.Eb")
	public final int[] field2722 = new int[4];

	@ObfuscatedName("qd.Rb")
	public boolean field2735 = false;

	@ObfuscatedName("qd.Qb")
	public int field2734 = -1;

	@ObfuscatedName("qd.V")
	public int field2687 = -1;

	@ObfuscatedName("qd.Nb")
	public int field2731 = -1;

	@ObfuscatedName("qd.W")
	public int field2688 = 200;

	@ObfuscatedName("qd.Db")
	public JagString field2721 = null;

	@ObfuscatedName("qd.Sb")
	public final int[] field2736 = new int[10];

	@ObfuscatedName("qd.xb")
	public int field2715 = 0;

	@ObfuscatedName("qd.Kb")
	public int field2728 = 0;

	@ObfuscatedName("qd.Z")
	public int field2691 = -1000;

	@ObfuscatedName("qd.Lb")
	public int field2729 = -1;

	@ObfuscatedName("qd.Hb")
	public int field2725 = 0;

	@ObfuscatedName("qd.Pb")
	public final boolean[] field2733 = new boolean[10];

	@ObfuscatedName("qd.Tb")
	public int field2737 = 0;

	@ObfuscatedName("qd.Xb")
	public int field2741 = 0;

	@ObfuscatedName("qd.Y")
	public int field2690;

	@ObfuscatedName("qd.zb")
	public int field2717;

	@ObfuscatedName("qd.Gb")
	public int field2724;

	@ObfuscatedName("qd.Jb")
	public int field2727;

	@ObfuscatedName("qd.Mb")
	public int field2730;

	@ObfuscatedName("qd.Ub")
	public int field2738;

	@ObfuscatedName("qd.Wb")
	public int field2740;

	@ObfuscatedName("qd.Yb")
	public int field2742;

	@ObfuscatedName("qd.a(IZI)V")
	public final void method900(int arg0, boolean arg1) {
		int var3 = this.field2759[0];
		int var4 = this.field2736[0];
		if (arg0 == 0) {
			var4++;
			var3--;
		}
		if (this.field2712 != -1 && SeqType.method760(this.field2712).field3381 == 1) {
			this.field2712 = -1;
		}
		if (arg0 == 1) {
			var4++;
		}
		if (this.field2696 < 9) {
			this.field2696++;
		}
		if (arg0 == 2) {
			var4++;
			var3++;
		}
		for (int var5 = this.field2696; var5 > 0; var5--) {
			this.field2759[var5] = this.field2759[var5 - 1];
			this.field2736[var5] = this.field2736[var5 - 1];
			this.field2733[var5] = this.field2733[var5 - 1];
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		this.field2733[0] = arg1;
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var4--;
			var3++;
		}
		this.field2759[0] = var3;
		this.field2736[0] = var4;
	}

	@ObfuscatedName("qd.a(IIZI)V")
	public final void method902(int arg0, boolean arg1, int arg2) {
		if (this.field2712 != -1 && SeqType.method760(this.field2712).field3381 == 1) {
			this.field2712 = -1;
		}
		if (!arg1) {
			int var4 = arg0 - this.field2736[0];
			int var5 = arg2 - this.field2759[0];
			if (var5 >= -8 && var5 <= 8 && var4 >= -8 && var4 <= 8) {
				if (this.field2696 < 9) {
					this.field2696++;
				}
				for (int var6 = this.field2696; var6 > 0; var6--) {
					this.field2759[var6] = this.field2759[var6 - 1];
					this.field2736[var6] = this.field2736[var6 - 1];
					this.field2733[var6] = this.field2733[var6 - 1];
				}
				this.field2759[0] = arg2;
				this.field2733[0] = false;
				this.field2736[0] = arg0;
				return;
			}
		}
		this.field2694 = 0;
		this.field2696 = 0;
		this.field2759[0] = arg2;
		this.field2748 = 0;
		this.field2736[0] = arg0;
		this.field2698 = this.field2736[0] * 128 + this.field2711 * 64;
		this.field2747 = this.field2759[0] * 128 + this.field2711 * 64;
	}

	@ObfuscatedName("qd.i(I)V")
	public final void method905() {
		this.field2696 = 0;
		this.field2748 = 0;
	}

	@ObfuscatedName("qd.j(I)Z")
	public boolean method578() {
		return false;
	}

	@ObfuscatedName("qd.a(IIII)V")
	public final void method906(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.field2722[var4] <= arg0) {
				this.field2758[var4] = arg2;
				this.field2746[var4] = arg1;
				this.field2722[var4] = arg0 + 70;
				return;
			}
		}
	}
}
