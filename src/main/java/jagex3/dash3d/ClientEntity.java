package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.config.SeqType;
import jagex3.util.JagString;

@ObfuscatedName("nb")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("nb.ac")
	public int z;

	@ObfuscatedName("nb.ad")
	public int field2015 = -1;

	@ObfuscatedName("nb.bc")
	public JagString chat = null;

	@ObfuscatedName("nb.cc")
	public int field1965 = -1;

	@ObfuscatedName("nb.ec")
	public int field1967;

	@ObfuscatedName("nb.ed")
	public int turnleftanim = -1;

	@ObfuscatedName("nb.fc")
	public int field1968 = 0;

	@ObfuscatedName("nb.hc")
	public int size = 1;

	@ObfuscatedName("nb.hd")
	public int targetTileX = 0;

	@ObfuscatedName("nb.ic")
	public int turnCycle = 0;

	@ObfuscatedName("nb.jc")
	public int x;

	@ObfuscatedName("nb.kc")
	public int field1973;

	@ObfuscatedName("nb.lc")
	public int targetTileZ = 0;

	@ObfuscatedName("nb.mc")
	public int field1975;

	@ObfuscatedName("nb.nc")
	public int field1976 = 0;

	@ObfuscatedName("nb.pc")
	public int field1978 = 0;

	@ObfuscatedName("nb.qc")
	public boolean field1979 = false;

	@ObfuscatedName("nb.sc")
	public int exactMoveStart;

	@ObfuscatedName("nb.uc")
	public int field1983 = 0;

	@ObfuscatedName("nb.vc")
	public int field1984;

	@ObfuscatedName("nb.gc")
	public int field1969 = 0;

	@ObfuscatedName("nb.Ub")
	public int turnrightanim = -1;

	@ObfuscatedName("nb.Tb")
	public int field1956 = -1;

	@ObfuscatedName("nb.Qb")
	public int walkanim_b = -1;

	@ObfuscatedName("nb.Mb")
	public int walkanim_r = -1;

	@ObfuscatedName("nb.Xb")
	public final int[] field1960 = new int[4];

	@ObfuscatedName("nb.Jb")
	public final boolean[] field1946 = new boolean[10];

	@ObfuscatedName("nb.yc")
	public int turnspeed = 32;

	@ObfuscatedName("nb.Cc")
	public int field1991 = 200;

	@ObfuscatedName("nb.Pb")
	public int chatTimer = 100;

	@ObfuscatedName("nb.Fc")
	public int field1994 = 0;

	@ObfuscatedName("nb.Hc")
	public int field1996 = 0;

	@ObfuscatedName("nb.Ob")
	public int secondarySeqId = -1;

	@ObfuscatedName("nb.Yb")
	public final int[] field1961 = new int[4];

	@ObfuscatedName("nb.Bc")
	public int field1990 = 0;

	@ObfuscatedName("nb.Ic")
	public int field1997 = 0;

	@ObfuscatedName("nb.Lc")
	public int readyanim = -1;

	@ObfuscatedName("nb.Lb")
	public int animDelayMove = 0;

	@ObfuscatedName("nb.Vc")
	public final int[] field2010 = new int[4];

	@ObfuscatedName("nb.Oc")
	public int field2003 = 0;

	@ObfuscatedName("nb.Wc")
	public int targetId = -1;

	@ObfuscatedName("nb.Uc")
	public final int[] field2009 = new int[10];

	@ObfuscatedName("nb.Yc")
	public int field2013 = -1000;

	@ObfuscatedName("nb.Qc")
	public int walkanim = -1;

	@ObfuscatedName("nb.Ac")
	public int field1989 = 0;

	@ObfuscatedName("nb.Tc")
	public int cycle = 0;

	@ObfuscatedName("nb.Zc")
	public int field2014 = 0;

	@ObfuscatedName("nb.Zb")
	public final int[] field1962 = new int[10];

	@ObfuscatedName("nb.Rc")
	public int walkanim_l = -1;

	@ObfuscatedName("nb.Kb")
	public int exactMoveFacing;

	@ObfuscatedName("nb.Rb")
	public int dstYaw;

	@ObfuscatedName("nb.Sb")
	public int field1955;

	@ObfuscatedName("nb.xc")
	public int exactMoveEnd;

	@ObfuscatedName("nb.Dc")
	public int yaw;

	@ObfuscatedName("nb.Kc")
	public int field1999;

	@ObfuscatedName("nb.Mc")
	public int field2001;

	@ObfuscatedName("nb.Pc")
	public int field2004;

	@ObfuscatedName("nb.a(IBZ)V")
	public final void moveCode(int arg0, boolean arg1) {
		int var3 = this.field1962[0];
		int var4 = this.field2009[0];
		if (arg0 == 0) {
			var4++;
			var3--;
		}
		if (this.field2015 != -1 && SeqType.list(this.field2015).preanim_move == 1) {
			this.field2015 = -1;
		}
		if (this.field1983 < 9) {
			this.field1983++;
		}
		for (int var5 = this.field1983; var5 > 0; var5--) {
			this.field1962[var5] = this.field1962[var5 - 1];
			this.field2009[var5] = this.field2009[var5 - 1];
			this.field1946[var5] = this.field1946[var5 - 1];
		}
		if (arg0 == 1) {
			var4++;
		}
		if (arg0 == 2) {
			var4++;
			var3++;
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var3++;
			var4--;
		}
		this.field1962[0] = var3;
		this.field2009[0] = var4;
		this.field1946[0] = arg1;
	}

	@ObfuscatedName("nb.h(I)Z")
	public boolean ready() {
		return false;
	}

	@ObfuscatedName("nb.b(IIII)V")
	public final void method727(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (arg1 >= this.field2010[var4]) {
				this.field1961[var4] = arg2;
				this.field1960[var4] = arg0;
				this.field2010[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("nb.a(IIZI)V")
	public final void teleport(int arg0, boolean arg1, int arg2) {
		if (this.field2015 != -1 && SeqType.list(this.field2015).preanim_move == 1) {
			this.field2015 = -1;
		}
		if (!arg1) {
			int var4 = arg2 - this.field1962[0];
			int var5 = arg0 - this.field2009[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (this.field1983 < 9) {
					this.field1983++;
				}
				for (int var6 = this.field1983; var6 > 0; var6--) {
					this.field1962[var6] = this.field1962[var6 - 1];
					this.field2009[var6] = this.field2009[var6 - 1];
					this.field1946[var6] = this.field1946[var6 - 1];
				}
				this.field1962[0] = arg2;
				this.field2009[0] = arg0;
				this.field1946[0] = false;
				return;
			}
		}
		this.field1983 = 0;
		this.animDelayMove = 0;
		this.field1968 = 0;
		this.field1962[0] = arg2;
		this.field2009[0] = arg0;
		this.x = this.field1962[0] * 128 + this.size * 64;
		this.z = this.field2009[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("nb.j(I)V")
	public final void abortRoute() {
		this.field1968 = 0;
		this.field1983 = 0;
	}
}
