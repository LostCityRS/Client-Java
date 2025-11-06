package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.datastruct.DoublyLinkList;
import jagex2.datastruct.LinkList;
import sign.signlink;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

@ObfuscatedName("vb")
public class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("vb.g")
	public int[][] field810 = new int[4][];

	@ObfuscatedName("vb.h")
	public int[][] field811 = new int[4][];

	@ObfuscatedName("vb.i")
	public byte[][] field812 = new byte[4][];

	@ObfuscatedName("vb.j")
	public int field813;

	@ObfuscatedName("vb.k")
	public byte[] field814;

	@ObfuscatedName("vb.l")
	public int[] field815;

	@ObfuscatedName("vb.m")
	public int[] field816;

	@ObfuscatedName("vb.n")
	public int[] field817;

	@ObfuscatedName("vb.o")
	public int[] field818;

	@ObfuscatedName("vb.p")
	public int[] field819;

	@ObfuscatedName("vb.q")
	public int[] field820;

	@ObfuscatedName("vb.r")
	public boolean field821 = true;

	@ObfuscatedName("vb.s")
	public Client field822;

	@ObfuscatedName("vb.t")
	public CRC32 field823 = new CRC32();

	@ObfuscatedName("vb.u")
	public boolean field824 = false;

	@ObfuscatedName("vb.v")
	public int field825;

	@ObfuscatedName("vb.w")
	public int field826;

	@ObfuscatedName("vb.x")
	public DoublyLinkList field827 = new DoublyLinkList();

	@ObfuscatedName("vb.y")
	public LinkList field828 = new LinkList();

	@ObfuscatedName("vb.z")
	public LinkList field829 = new LinkList();

	@ObfuscatedName("vb.A")
	public LinkList field830 = new LinkList();

	@ObfuscatedName("vb.B")
	public LinkList field831 = new LinkList();

	@ObfuscatedName("vb.C")
	public LinkList field832 = new LinkList();

	@ObfuscatedName("vb.D")
	public String field833 = "";

	@ObfuscatedName("vb.M")
	public byte[] field842 = new byte[500];

	@ObfuscatedName("vb.N")
	public byte[] field843 = new byte[65000];

	@ObfuscatedName("vb.E")
	public int field834;

	@ObfuscatedName("vb.F")
	public int field835;

	@ObfuscatedName("vb.K")
	public int field840;

	@ObfuscatedName("vb.L")
	public int field841;

	@ObfuscatedName("vb.O")
	public int field844;

	@ObfuscatedName("vb.P")
	public int field845;

	@ObfuscatedName("vb.R")
	public int field847;

	@ObfuscatedName("vb.Q")
	public long field846;

	@ObfuscatedName("vb.J")
	public OnDemandRequest field839;

	@ObfuscatedName("vb.H")
	public InputStream field837;

	@ObfuscatedName("vb.I")
	public OutputStream field838;

	@ObfuscatedName("vb.G")
	public Socket field836;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method280(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method309(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5);
			this.field810[var4] = new int[var6];
			this.field812[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				this.field810[var4][var8] = var7.method241();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method309(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11);
			this.field811[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				this.field811[var10][var14] = var13.method244();
			}
		}
		byte[] var15 = arg0.method309("model_index", null);
		int var16 = this.field810[0].length;
		this.field814 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				this.field814[var17] = var15[var17];
			} else {
				this.field814[var17] = 0;
			}
		}
		byte[] var18 = arg0.method309("map_index", null);
		Packet var19 = new Packet(var18);
		int var20 = var18.length / 7;
		this.field815 = new int[var20];
		this.field816 = new int[var20];
		this.field817 = new int[var20];
		this.field818 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.field815[var21] = var19.method241();
			this.field816[var21] = var19.method241();
			this.field817[var21] = var19.method241();
			this.field818[var21] = var19.method239();
		}
		byte[] var22 = arg0.method309("anim_index", null);
		Packet var23 = new Packet(var22);
		int var24 = var22.length / 2;
		this.field819 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.field819[var25] = var23.method241();
		}
		byte[] var26 = arg0.method309("midi_index", null);
		Packet var27 = new Packet(var26);
		int var28 = var26.length;
		this.field820 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.field820[var29] = var27.method239();
		}
		this.field822 = arg1;
		this.field821 = true;
		this.field822.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method281() {
		this.field821 = false;
	}

	@ObfuscatedName("vb.a(IB)I")
	public final int method282(int arg0) {
		return this.field810[arg0].length;
	}

	@ObfuscatedName("vb.a(Z)I")
	public final int method283(boolean arg0) {
		return arg0 ? 4 : this.field819.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method284(int arg0, int arg1, int arg2) {
		int var5 = (arg0 << 8) + arg1;
		for (int var6 = 0; var6 < this.field815.length; var6++) {
			if (this.field815[var6] == var5) {
				if (arg2 == 0) {
					return this.field816[var6];
				}
				return this.field817[var6];
			}
		}
		return -1;
	}

	@ObfuscatedName("vb.a(IZ)V")
	public final void method285(boolean arg1) {
		int var3 = this.field815.length;
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg1 || this.field818[var4] != 0) {
				this.method292(3, (byte) 2, this.field817[var4]);
				this.method292(3, (byte) 2, this.field816[var4]);
			}
		}
	}

	@ObfuscatedName("vb.b(IB)Z")
	public final boolean method286(int arg0) {
		for (int var3 = 0; var3 < this.field815.length; var3++) {
			if (this.field817[var3] == arg0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("vb.a(BI)I")
	public final int method287(int arg1) {
		return this.field814[arg1] & 0xFF;
	}

	@ObfuscatedName("vb.b(IZ)Z")
	public final boolean method288(int arg0) {
		return this.field820[arg0] == 1;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method279(int arg0) {
		this.method289(0, arg0);
	}

	@ObfuscatedName("vb.a(II)V")
	public final void method289(int arg0, int arg1) {
		if (arg0 < 0 || arg0 > this.field810.length || arg1 < 0 || arg1 > this.field810[arg0].length || this.field810[arg0][arg1] == 0) {
			return;
		}
		DoublyLinkList var3 = this.field827;
		synchronized (this.field827) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.field827.method265(); var4 != null; var4 = (OnDemandRequest) this.field827.method266()) {
				if (var4.field724 == arg0 && var4.field725 == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.field724 = arg0;
			var5.field725 = arg1;
			var5.field728 = true;
			LinkList var6 = this.field828;
			synchronized (this.field828) {
				this.field828.method255(var5);
			}
			this.field827.method263(var5);
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method290() {
		DoublyLinkList var1 = this.field827;
		synchronized (this.field827) {
			return this.field827.method267();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final OnDemandRequest method291() {
		LinkList var1 = this.field831;
		OnDemandRequest var2;
		synchronized (this.field831) {
			var2 = (OnDemandRequest) this.field831.method257();
		}
		if (var2 == null) {
			return null;
		}
		DoublyLinkList var3 = this.field827;
		synchronized (this.field827) {
			var2.method121();
		}
		if (var2.field726 == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field726));
			while (true) {
				if (var4 == this.field843.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.field843, var4, this.field843.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.field726 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field726[var7] = this.field843[var7];
		}
		return var2;
	}

	@ObfuscatedName("vb.a(IIBI)V")
	public final void method292(int arg1, byte arg2, int arg3) {
		if (this.field822.field1232[0] == null || this.field810[arg1][arg3] == 0) {
			return;
		}
		byte[] var5 = this.field822.field1232[arg1 + 1].method301(arg3);
		if (this.method299(var5, this.field810[arg1][arg3], this.field811[arg1][arg3])) {
			return;
		}
		this.field812[arg1][arg3] = arg2;
		if (arg2 > this.field813) {
			this.field813 = arg2;
		}
		this.field835++;
	}

	@ObfuscatedName("vb.b(I)V")
	public final void method293() {
		LinkList var2 = this.field832;
		synchronized (this.field832) {
			this.field832.method262();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void method294(int arg0, int arg1) {
		if (this.field822.field1232[0] == null || (this.field810[arg0][arg1] == 0 || (this.field812[arg0][arg1] == 0 || this.field813 == 0))) {
			return;
		}
		OnDemandRequest var4 = new OnDemandRequest();
		var4.field724 = arg0;
		var4.field725 = arg1;
		var4.field728 = false;
		LinkList var5 = this.field832;
		synchronized (this.field832) {
			this.field832.method255(var4);
		}
	}

	public final void run() {
		try {
			while (this.field821) {
				this.field847++;
				byte var1 = 20;
				if (this.field813 == 0 && this.field822.field1232[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.field824 = true;
				for (int var2 = 0; var2 < 100 && this.field824; var2++) {
					this.field824 = false;
					this.method295(2);
					this.method296();
					if (this.field825 == 0 && var2 >= 5) {
						break;
					}
					this.method297();
					if (this.field837 != null) {
						this.method298();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.field830.method258(); var4 != null; var4 = (OnDemandRequest) this.field830.method260()) {
					if (var4.field728) {
						var3 = true;
						var4.field727++;
						if (var4.field727 > 50) {
							var4.field727 = 0;
							this.method300(var4);
						}
					}
				}
				if (!var3) {
					for (OnDemandRequest var5 = (OnDemandRequest) this.field830.method258(); var5 != null; var5 = (OnDemandRequest) this.field830.method260()) {
						var3 = true;
						var5.field727++;
						if (var5.field727 > 50) {
							var5.field727 = 0;
							this.method300(var5);
						}
					}
				}
				if (var3) {
					this.field844++;
					if (this.field844 > 750) {
						try {
							this.field836.close();
						} catch (Exception var8) {
						}
						this.field836 = null;
						this.field837 = null;
						this.field838 = null;
						this.field841 = 0;
					}
				} else {
					this.field844 = 0;
					this.field833 = "";
				}
				if (this.field822.field1238 && this.field836 != null && this.field838 != null && (this.field813 > 0 || this.field822.field1232[0] == null)) {
					this.field845++;
					if (this.field845 > 500) {
						this.field845 = 0;
						this.field842[0] = 0;
						this.field842[1] = 0;
						this.field842[2] = 0;
						this.field842[3] = 10;
						try {
							this.field838.write(this.field842, 0, 4);
						} catch (IOException var7) {
							this.field844 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method295(int arg0) {
		if (arg0 != 2) {
			return;
		}
		LinkList var2 = this.field828;
		OnDemandRequest var3;
		synchronized (this.field828) {
			var3 = (OnDemandRequest) this.field828.method257();
		}
		while (var3 != null) {
			this.field824 = true;
			byte[] var4 = null;
			if (this.field822.field1232[0] != null) {
				var4 = this.field822.field1232[var3.field724 + 1].method301(var3.field725);
			}
			if (!this.method299(var4, this.field810[var3.field724][var3.field725], this.field811[var3.field724][var3.field725])) {
				var4 = null;
			}
			LinkList var5 = this.field828;
			synchronized (this.field828) {
				if (var4 == null) {
					this.field829.method255(var3);
				} else {
					var3.field726 = var4;
					LinkList var6 = this.field831;
					synchronized (this.field831) {
						this.field831.method255(var3);
					}
				}
				var3 = (OnDemandRequest) this.field828.method257();
			}
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method296() {
		this.field825 = 0;
		this.field826 = 0;
		for (OnDemandRequest var3 = (OnDemandRequest) this.field830.method258(); var3 != null; var3 = (OnDemandRequest) this.field830.method260()) {
			if (var3.field728) {
				this.field825++;
			} else {
				this.field826++;
			}
		}
		while (this.field825 < 10) {
			OnDemandRequest var4 = (OnDemandRequest) this.field829.method257();
			if (var4 == null) {
				break;
			}
			if (this.field812[var4.field724][var4.field725] != 0) {
				this.field834++;
			}
			this.field812[var4.field724][var4.field725] = 0;
			this.field830.method255(var4);
			this.field825++;
			this.method300(var4);
			this.field824 = true;
		}
	}

	@ObfuscatedName("vb.b(Z)V")
	public final void method297() {
		while (this.field825 == 0) {
			if (this.field826 >= 10 || this.field813 == 0) {
				return;
			}
			LinkList var2 = this.field832;
			OnDemandRequest var3;
			synchronized (this.field832) {
				var3 = (OnDemandRequest) this.field832.method257();
			}
			while (var3 != null) {
				if (this.field812[var3.field724][var3.field725] != 0) {
					this.field812[var3.field724][var3.field725] = 0;
					this.field830.method255(var3);
					this.method300(var3);
					this.field824 = true;
					if (this.field834 < this.field835) {
						this.field834++;
					}
					this.field833 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
					this.field826++;
					if (this.field826 == 10) {
						return;
					}
				}
				LinkList var4 = this.field832;
				synchronized (this.field832) {
					var3 = (OnDemandRequest) this.field832.method257();
				}
			}
			for (int var5 = 0; var5 < 4; var5++) {
				byte[] var6 = this.field812[var5];
				int var7 = var6.length;
				for (int var8 = 0; var8 < var7; var8++) {
					if (var6[var8] == this.field813) {
						var6[var8] = 0;
						OnDemandRequest var9 = new OnDemandRequest();
						var9.field724 = var5;
						var9.field725 = var8;
						var9.field728 = false;
						this.field830.method255(var9);
						this.method300(var9);
						this.field824 = true;
						if (this.field834 < this.field835) {
							this.field834++;
						}
						this.field833 = "Loading extra files - " + this.field834 * 100 / this.field835 + "%";
						this.field826++;
						if (this.field826 == 10) {
							return;
						}
					}
				}
			}
			this.field813--;
		}
	}

	@ObfuscatedName("vb.e(I)V")
	public final void method298() {
		try {
			int var2 = this.field837.available();
			if (this.field841 == 0 && var2 >= 6) {
				this.field824 = true;
				for (int var3 = 0; var3 < 6; var3 += this.field837.read(this.field842, var3, 6 - var3)) {
				}
				int var4 = this.field842[0] & 0xFF;
				int var5 = ((this.field842[1] & 0xFF) << 8) + (this.field842[2] & 0xFF);
				int var6 = ((this.field842[3] & 0xFF) << 8) + (this.field842[4] & 0xFF);
				int var7 = this.field842[5] & 0xFF;
				this.field839 = null;
				for (OnDemandRequest var8 = (OnDemandRequest) this.field830.method258(); var8 != null; var8 = (OnDemandRequest) this.field830.method260()) {
					if (var8.field724 == var4 && var8.field725 == var5) {
						this.field839 = var8;
					}
					if (this.field839 != null) {
						var8.field727 = 0;
					}
				}
				if (this.field839 != null) {
					this.field844 = 0;
					if (var6 == 0) {
						signlink.reporterror("Rej: " + var4 + "," + var5);
						this.field839.field726 = null;
						if (this.field839.field728) {
							LinkList var9 = this.field831;
							synchronized (this.field831) {
								this.field831.method255(this.field839);
							}
						} else {
							this.field839.method120();
						}
						this.field839 = null;
					} else {
						if (this.field839.field726 == null && var7 == 0) {
							this.field839.field726 = new byte[var6];
						}
						if (this.field839.field726 == null && var7 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}
				this.field840 = var7 * 500;
				this.field841 = 500;
				if (this.field841 > var6 - var7 * 500) {
					this.field841 = var6 - var7 * 500;
				}
			}
			if (this.field841 > 0 && var2 >= this.field841) {
				this.field824 = true;
				byte[] var10 = this.field842;
				int var11 = 0;
				if (this.field839 != null) {
					var10 = this.field839.field726;
					var11 = this.field840;
				}
				for (int var12 = 0; var12 < this.field841; var12 += this.field837.read(var10, var12 + var11, this.field841 - var12)) {
				}
				if (this.field841 + this.field840 >= var10.length && this.field839 != null) {
					if (this.field822.field1232[0] != null) {
						this.field822.field1232[this.field839.field724 + 1].method302(var10.length, this.field839.field725, var10);
					}
					if (!this.field839.field728 && this.field839.field724 == 3) {
						this.field839.field728 = true;
						this.field839.field724 = 93;
					}
					if (this.field839.field728) {
						LinkList var13 = this.field831;
						synchronized (this.field831) {
							this.field831.method255(this.field839);
						}
					} else {
						this.field839.method120();
					}
				}
				this.field841 = 0;
			}
		} catch (IOException var18) {
			try {
				this.field836.close();
			} catch (Exception var15) {
			}
			this.field836 = null;
			this.field837 = null;
			this.field838 = null;
			this.field841 = 0;
		}
	}

	@ObfuscatedName("vb.a([BIZI)Z")
	public final boolean method299(byte[] arg0, int arg1, int arg3) {
		if (arg0 == null || arg0.length < 2) {
			return false;
		}
		int var5 = arg0.length - 2;
		int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
		this.field823.reset();
		this.field823.update(arg0, 0, var5);
		int var7 = (int) this.field823.getValue();
		if (var6 == arg1) {
			return var7 == arg3;
		} else {
			return false;
		}
	}

	@ObfuscatedName("vb.a(Lnb;I)V")
	public final void method300(OnDemandRequest arg0) {
		try {
			if (this.field836 == null) {
				long var3 = System.currentTimeMillis();
				if (var3 - this.field846 < 5000L) {
					return;
				}
				this.field846 = var3;
				this.field836 = this.field822.method444(Client.field1240 + 43594);
				this.field837 = this.field836.getInputStream();
				this.field838 = this.field836.getOutputStream();
				this.field838.write(15);
				for (int var5 = 0; var5 < 8; var5++) {
					this.field837.read();
				}
				this.field844 = 0;
			}
			this.field842[0] = (byte) arg0.field724;
			this.field842[1] = (byte) (arg0.field725 >> 8);
			this.field842[2] = (byte) arg0.field725;
			if (arg0.field728) {
				this.field842[3] = 2;
			} else if (this.field822.field1238) {
				this.field842[3] = 0;
			} else {
				this.field842[3] = 1;
			}
			this.field838.write(this.field842, 0, 4);
			this.field845 = 0;
		} catch (IOException var8) {
			try {
				this.field836.close();
			} catch (Exception var7) {
			}
			this.field836 = null;
			this.field837 = null;
			this.field838 = null;
			this.field841 = 0;
		}
	}
}
