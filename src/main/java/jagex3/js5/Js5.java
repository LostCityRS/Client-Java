package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.datastruct.IntHashTable;
import jagex3.io.BZip2;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

@ObfuscatedName("bd")
public abstract class Js5 {

    @ObfuscatedName("ra.i")
    public static final int field2597 = 0;
    @ObfuscatedName("bd.b")
	public byte[][] field362;

	@ObfuscatedName("bd.f")
	public int crc;

	@ObfuscatedName("bd.g")
	public IntHashTable[] field367;

	@ObfuscatedName("bd.j")
	public final boolean field370;

	@ObfuscatedName("bd.k")
	public int field371;

	@ObfuscatedName("bd.n")
	public int[] field374;

	@ObfuscatedName("bd.q")
	public int[] field377;

	@ObfuscatedName("bd.w")
	public final boolean field383;

	@ObfuscatedName("bd.R")
	public IntHashTable field404;

	@ObfuscatedName("bd.C")
	public int[] field389;

	@ObfuscatedName("bd.P")
	public int[] field402;

	@ObfuscatedName("bd.Y")
	public int[] field411;

	@ObfuscatedName("bd.z")
	public int[][] field386;

	@ObfuscatedName("bd.G")
	public int[][] field393;

	@ObfuscatedName("bd.M")
	public byte[][][] field399;

	@ObfuscatedName("r.a([BI)[B")
	public static byte[] method863(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		int var3 = var1.g4();
		if (var3 < 0 || field2597 != 0 && field2597 < var3) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var7 = new byte[var3];
			var1.method173(var7, var3);
			return var7;
		} else {
			int var4 = var1.g4();
			if (var4 < 0 || field2597 != 0 && var4 > field2597) {
				throw new RuntimeException();
			}
			byte[] var5 = new byte[var4];
			if (var2 == 1) {
				BZip2.method446(var5, var4, arg0, var3);
			} else {
				try {
					DataInputStream var6 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var3)));
					var6.readFully(var5);
					var6.close();
				} catch (IOException var8) {
				}
			}
			return var5;
		}
	}

	@ObfuscatedName("bd.a(La;La;I)[B")
	public final byte[] method215(JagString arg0, JagString arg1) {
		JagString var3 = arg1.method30();
		JagString var4 = arg0.method30();
		int var5 = this.field404.find(var3.method27());
		int var6 = this.field367[var5].find(var4.method27());
		return this.getFile(var6, var5);
	}

	@ObfuscatedName("bd.a(II)V")
	public final void discardFiles(int arg0) {
		for (int var2 = 0; var2 < this.field399[arg0].length; var2++) {
			this.field399[arg0][var2] = null;
		}
	}

	@ObfuscatedName("bd.a(III)[B")
	public final byte[] getFile(int arg0, int arg1) {
		return this.fetchFile(arg1, arg0, null);
	}

	@ObfuscatedName("bd.a(IBI)Z")
	public final boolean requestDownload(int arg0, int arg1) {
		if (arg0 < 0 || this.field399.length <= arg0 || this.field399[arg0] == null || arg1 < 0 || arg1 >= this.field399[arg0].length) {
			return false;
		} else if (this.field399[arg0][arg1] != null) {
			return true;
		} else if (this.field362[arg0] == null) {
			this.method222(arg0);
			return this.field362[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bd.a(IB)V")
	public void method219(int arg0) {
	}

	@ObfuscatedName("bd.a(I)I")
	public final int getGroupCount() {
		return this.field399.length;
	}

	@ObfuscatedName("bd.a(II[II)[B")
	public final byte[] fetchFile(int arg0, int arg1, int[] arg2) {
		if (arg0 < 0 || this.field399.length <= arg0 || this.field399[arg0] == null || arg1 < 0 || arg1 >= this.field399[arg0].length) {
			return null;
		}
		if (this.field399[arg0][arg1] == null) {
			boolean var4 = this.method226(arg0, arg2);
			if (!var4) {
				this.method222(arg0);
				boolean var5 = this.method226(arg0, arg2);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = this.field399[arg0][arg1];
		if (this.field370) {
			this.field399[arg0][arg1] = null;
		}
		return var6;
	}

	@ObfuscatedName("bd.b(II)V")
	public void method222(int arg0) {
	}

	@ObfuscatedName("bd.a(I[B)V")
	public final void method223(byte[] arg0) {
		this.crc = Statics.method244(arg0, arg0.length);
		Packet var2 = new Packet(method863(arg0));
		int var3 = var2.g1();
		if (var3 != 5) {
			return;
		}
		int var4 = 0;
		int var5 = var2.g1();
		this.field371 = var2.g2();
		this.field377 = new int[this.field371];
		int var6 = -1;
		for (int var7 = 0; var7 < this.field371; var7++) {
			this.field377[var7] = var4 += var2.g2();
			if (this.field377[var7] > var6) {
				var6 = this.field377[var7];
			}
		}
		this.field393 = new int[var6 + 1][];
		this.field374 = new int[var6 + 1];
		this.field402 = new int[var6 + 1];
		this.field399 = new byte[var6 + 1][][];
		this.field411 = new int[var6 + 1];
		this.field362 = new byte[var6 + 1][];
		if (var5 != 0) {
			this.field389 = new int[var6 + 1];
			for (int var8 = 0; var8 < this.field371; var8++) {
				this.field389[this.field377[var8]] = var2.g4();
			}
			this.field404 = new IntHashTable(this.field389);
		}
		for (int var9 = 0; var9 < this.field371; var9++) {
			this.field402[this.field377[var9]] = var2.g4();
		}
		for (int var10 = 0; var10 < this.field371; var10++) {
			this.field374[this.field377[var10]] = var2.g4();
		}
		for (int var11 = 0; var11 < this.field371; var11++) {
			this.field411[this.field377[var11]] = var2.g2();
		}
		for (int var12 = 0; var12 < this.field371; var12++) {
			int var13 = 0;
			int var14 = this.field377[var12];
			int var15 = -1;
			int var16 = this.field411[var14];
			this.field393[var14] = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				int var18 = this.field393[var14][var17] = var13 += var2.g2();
				if (var18 > var15) {
					var15 = var18;
				}
			}
			this.field399[var14] = new byte[var15 + 1][];
		}
		if (var5 == 0) {
			return;
		}
		this.field367 = new IntHashTable[var6 + 1];
		this.field386 = new int[var6 + 1][];
		for (int var19 = 0; var19 < this.field371; var19++) {
			int var20 = this.field377[var19];
			int var21 = this.field411[var20];
			this.field386[var20] = new int[this.field399[var20].length];
			for (int var22 = 0; var22 < var21; var22++) {
				this.field386[var20][this.field393[var20][var22]] = var2.g4();
			}
			this.field367[var20] = new IntHashTable(this.field386[var20]);
		}
	}

	@ObfuscatedName("bd.a(IILa;)I")
	public final int method224(int arg0, JagString arg1) {
		JagString var3 = arg1.method30();
		return this.field367[arg0].find(var3.method27());
	}

	@ObfuscatedName("bd.a(II[I)Z")
	public boolean method226(int arg0, int[] arg1) {
		if (this.field362[arg0] == null) {
			return false;
		}
		int var3 = this.field411[arg0];
		byte[][] var4 = this.field399[arg0];
		int[] var5 = this.field393[arg0];
		boolean var6 = true;
		for (int var7 = 0; var7 < var3; var7++) {
			if (var4[var5[var7]] == null) {
				var6 = false;
				break;
			}
		}
		if (var6) {
			return true;
		}
		byte[] var8;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			var8 = this.field362[arg0];
		} else {
			var8 = new byte[this.field362[arg0].length];
			ArrayUtil.copy(this.field362[arg0], 0, var8, 0, var8.length);
			Packet var9 = new Packet(var8);
			var9.method159(arg1, var9.data.length);
		}
		byte[] var10;
		try {
			var10 = method863(var8);
		} catch (RuntimeException var25) {
			throw JagException.report(var25, "T3 - " + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method244(var8, var8.length) + "," + Statics.method244(var8, var8.length - 2) + "," + this.field402[arg0] + "," + this.crc);
		}
		if (this.field383) {
			this.field362[arg0] = null;
		}
		if (var3 > 1) {
			int var12 = var10.length;
			int var26 = var12 - 1;
			int var13 = var10[var26] & 0xFF;
			Packet var14 = new Packet(var10);
			int var15 = var26 - var3 * var13 * 4;
			var14.pos = var15;
			int[] var16 = new int[var3];
			for (int var17 = 0; var17 < var13; var17++) {
				int var18 = 0;
				for (int var19 = 0; var19 < var3; var19++) {
					var18 += var14.g4();
					var16[var19] += var18;
				}
			}
			for (int var20 = 0; var20 < var3; var20++) {
				if (var4[var5[var20]] == null) {
					var4[var5[var20]] = new byte[var16[var20]];
				}
				var16[var20] = 0;
			}
			var14.pos = var15;
			int var21 = 0;
			for (int var22 = 0; var22 < var13; var22++) {
				int var23 = 0;
				for (int var24 = 0; var24 < var3; var24++) {
					var23 += var14.g4();
					ArrayUtil.copy(var10, var21, var4[var5[var24]], var16[var24], var23);
					var16[var24] += var23;
					var21 += var23;
				}
			}
		} else {
			var4[var5[0]] = var10;
		}
		return true;
	}

	@ObfuscatedName("bd.b(III)[B")
	public final byte[] peekFile(int arg0, int arg1) {
		if (arg1 < 0 || this.field399.length <= arg1 || this.field399[arg1] == null || arg0 < 0 || this.field399[arg1].length <= arg0) {
			return null;
		}
		if (this.field399[arg1][arg0] == null) {
			boolean var3 = this.method226(arg1, null);
			if (!var3) {
				this.method222(arg1);
				boolean var4 = this.method226(arg1, null);
				if (!var4) {
					return null;
				}
			}
		}
		return this.field399[arg1][arg0];
	}

	@ObfuscatedName("bd.a(ILa;)I")
	public final int getGroupId(JagString arg0) {
		JagString var2 = arg0.method30();
		return this.field404.find(var2.method27());
	}

	@ObfuscatedName("bd.a(B)Z")
	public final boolean method230() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field377.length; var2++) {
			int var3 = this.field377[var2];
			if (this.field362[var3] == null) {
				this.method222(var3);
				if (this.field362[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("bd.c(II)Z")
	public final boolean requestGroupDownload(int arg0) {
		if (this.field362[arg0] == null) {
			this.method222(arg0);
			return this.field362[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bd.b(IB)[B")
	public final byte[] method232(int arg0) {
		if (this.field399.length == 1) {
			return this.getFile(arg0, 0);
		} else if (this.field399[arg0].length == 1) {
			return this.getFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bd.c(IB)I")
	public final int getFileIdLimit(int arg0) {
		return this.field399[arg0].length;
	}

	@ObfuscatedName("bd.c(I)V")
	public final void method236() {
		for (int var1 = 0; var1 < this.field399.length; var1++) {
			if (this.field399[var1] != null) {
				for (int var2 = 0; var2 < this.field399[var1].length; var2++) {
					this.field399[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("bd.a(IZ)[I")
	public final int[] getFileList(int arg0) {
		return this.field393[arg0];
	}

	@ObfuscatedName("bd.a(BI)[B")
	public final byte[] method238(int arg0) {
		if (this.field399.length == 1) {
			return this.peekFile(arg0, 0);
		} else if (this.field399[arg0].length == 1) {
			return this.peekFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bd.b(La;La;I)Z")
	public final boolean method239(JagString arg0, JagString arg1) {
		JagString var3 = arg0.method30();
		JagString var4 = arg1.method30();
		int var5 = this.field404.find(var3.method27());
		int var6 = this.field367[var5].find(var4.method27());
		return this.requestDownload(var5, var6);
	}

	@ObfuscatedName("bd.b(ILa;)V")
	public final void updateCacheHint(JagString arg0) {
		JagString var2 = arg0.method30();
		int var3 = this.field404.find(var2.method27());
		if (var3 >= 0) {
			this.method219(var3);
		}
	}

	public Js5(boolean arg0, boolean arg1) {
		this.field370 = arg1;
		this.field383 = arg0;
	}
}
