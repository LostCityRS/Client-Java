package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.util.JagString;

import java.math.BigInteger;

@ObfuscatedName("nb")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("nb.ac")
	public int field1963;

	@ObfuscatedName("nb.ad")
	public int field2015 = -1;

	@ObfuscatedName("nb.bc")
	public JagString field1964 = null;

	@ObfuscatedName("nb.cc")
	public int field1965 = -1;

	@ObfuscatedName("nb.cd")
	public static volatile int field2017 = 0;

	@ObfuscatedName("nb.ec")
	public int field1967;

	@ObfuscatedName("nb.ed")
	public int field2019 = -1;

	@ObfuscatedName("nb.fc")
	public int field1968 = 0;

	@ObfuscatedName("nb.hc")
	public int field1970 = 1;

	@ObfuscatedName("nb.hd")
	public int field2022 = 0;

	@ObfuscatedName("nb.ic")
	public int field1971 = 0;

	@ObfuscatedName("nb.id")
	public static int[] field2023 = new int[1000];

	@ObfuscatedName("nb.jc")
	public int field1972;

	@ObfuscatedName("nb.kc")
	public int field1973;

	@ObfuscatedName("nb.kd")
	public static int field2025 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("nb.lc")
	public int field1974 = 0;

	@ObfuscatedName("nb.mc")
	public int field1975;

	@ObfuscatedName("nb.md")
	public static int field2027 = 0;

	@ObfuscatedName("nb.nc")
	public int field1976 = 0;

	@ObfuscatedName("nb.pc")
	public int field1978 = 0;

	@ObfuscatedName("nb.pd")
	public static ClientPlayer[] field2030 = new ClientPlayer[2048];

	@ObfuscatedName("nb.qc")
	public boolean field1979 = false;

	@ObfuscatedName("nb.sc")
	public int field1981;

	@ObfuscatedName("nb.td")
	public static JagString[] field2034 = new JagString[100];

	@ObfuscatedName("nb.uc")
	public int field1983 = 0;

	@ObfuscatedName("nb.vc")
	public int field1984;

	@ObfuscatedName("nb.Ec")
	public static BigInteger field1993 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("nb.gc")
	public int field1969 = 0;

	@ObfuscatedName("nb.Ub")
	public int field1957 = -1;

	@ObfuscatedName("nb.Tb")
	public int field1956 = -1;

	@ObfuscatedName("nb.Qb")
	public int field1953 = -1;

	@ObfuscatedName("nb.Mb")
	public int field1949 = -1;

	@ObfuscatedName("nb.Xb")
	public final int[] field1960 = new int[4];

	@ObfuscatedName("nb.Jb")
	public final boolean[] field1946 = new boolean[10];

	@ObfuscatedName("nb.yc")
	public int field1987 = 32;

	@ObfuscatedName("nb.Cc")
	public int field1991 = 200;

	@ObfuscatedName("nb.Pb")
	public int field1952 = 100;

	@ObfuscatedName("nb.Fc")
	public int field1994 = 0;

	@ObfuscatedName("nb.Hc")
	public int field1996 = 0;

	@ObfuscatedName("nb.Ob")
	public int field1951 = -1;

	@ObfuscatedName("nb.Yb")
	public final int[] field1961 = new int[4];

	@ObfuscatedName("nb.Bc")
	public int field1990 = 0;

	@ObfuscatedName("nb.Ic")
	public int field1997 = 0;

	@ObfuscatedName("nb.Lc")
	public int field2000 = -1;

	@ObfuscatedName("nb.Lb")
	public int field1948 = 0;

	@ObfuscatedName("nb.Vc")
	public final int[] field2010 = new int[4];

	@ObfuscatedName("nb.Oc")
	public int field2003 = 0;

	@ObfuscatedName("nb.Wc")
	public int field2011 = -1;

	@ObfuscatedName("nb.Uc")
	public final int[] field2009 = new int[10];

	@ObfuscatedName("nb.Yc")
	public int field2013 = -1000;

	@ObfuscatedName("nb.Qc")
	public int field2005 = -1;

	@ObfuscatedName("nb.Ac")
	public int field1989 = 0;

	@ObfuscatedName("nb.Tc")
	public int field2008 = 0;

	@ObfuscatedName("nb.Zc")
	public int field2014 = 0;

	@ObfuscatedName("nb.Zb")
	public final int[] field1962 = new int[10];

	@ObfuscatedName("nb.Rc")
	public int field2006 = -1;

	@ObfuscatedName("nb.Kb")
	public int field1947;

	@ObfuscatedName("nb.Rb")
	public int field1954;

	@ObfuscatedName("nb.Sb")
	public int field1955;

	@ObfuscatedName("nb.xc")
	public int field1986;

	@ObfuscatedName("nb.Dc")
	public int field1992;

	@ObfuscatedName("nb.Kc")
	public int field1999;

	@ObfuscatedName("nb.Mc")
	public int field2001;

	@ObfuscatedName("nb.Pc")
	public int field2004;

	@ObfuscatedName("nb.a(IBZ)V")
	public final void method725(int arg0, boolean arg1) {
		int var3 = this.field1962[0];
		int var4 = this.field2009[0];
		if (arg0 == 0) {
			var4++;
			var3--;
		}
		if (this.field2015 != -1 && Statics.method103(this.field2015).field1233 == 1) {
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
	public boolean method42() {
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
	public final void method729(int arg0, boolean arg1, int arg2) {
		if (this.field2015 != -1 && Statics.method103(this.field2015).field1233 == 1) {
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
		this.field1948 = 0;
		this.field1968 = 0;
		this.field1962[0] = arg2;
		this.field2009[0] = arg0;
		this.field1972 = this.field1962[0] * 128 + this.field1970 * 64;
		this.field1963 = this.field2009[0] * 128 + this.field1970 * 64;
	}

	@ObfuscatedName("nb.j(I)V")
	public final void method732() {
		this.field1968 = 0;
		this.field1983 = 0;
	}
}
