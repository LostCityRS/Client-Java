package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("kh")
public final class QuickChatCatTypeList extends Linkable2 {

	@ObfuscatedName("ng.Z")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("ff.ab")
	public static Js5 configClient;
	@ObfuscatedName("fj.m")
	public static Js5 globalConfigClient;
	@ObfuscatedName("kh.ab")
	public int[] phraseShortcuts;

	@ObfuscatedName("kh.Y")
	public JagString description;

	@ObfuscatedName("kh.L")
	public int[] subcategoryIds;

	@ObfuscatedName("kh.O")
	public int[] subcategoryShortcuts;

	@ObfuscatedName("kh.Q")
	public int[] phraseIds;

	@ObfuscatedName("kf.a(II)Lkh;")
	public static QuickChatCatTypeList list(int arg0) {
		QuickChatCatTypeList var1 = (QuickChatCatTypeList) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 < 32768) {
			var2 = configClient.getFile(arg0, 0);
		} else {
			var2 = globalConfigClient.getFile(arg0 & 0x7FFF, 0);
		}
		QuickChatCatTypeList var3 = new QuickChatCatTypeList();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		if (arg0 >= 32768) {
			var3.markGlobal();
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("rd.a(BLnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		configClient = arg0;
		globalConfigClient = arg1;
	}

	@ObfuscatedName("kh.c(II)I")
	public int getPhraseByShortcut(int arg0) {
		if (this.phraseIds == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.phraseIds.length; var2++) {
			if (this.phraseShortcuts[var2] == arg0) {
				return this.phraseIds[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.a(ILea;B)V")
	public void decodeInner(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.description = arg1.gjstr();
		} else if (arg0 == 2) {
			int var3 = arg1.g1();
			this.subcategoryShortcuts = new int[var3];
			this.subcategoryIds = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.subcategoryIds[var4] = arg1.g2();
				int var5 = arg1.g1();
				if (var5 == 0) {
					this.subcategoryShortcuts[var4] = -1;
				} else {
					this.subcategoryShortcuts[var4] = var5;
				}
			}
		} else if (arg0 == 3) {
			int var6 = arg1.g1();
			this.phraseShortcuts = new int[var6];
			this.phraseIds = new int[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.phraseIds[var7] = arg1.g2();
				int var8 = arg1.g1();
				if (var8 == 0) {
					this.phraseShortcuts[var7] = -1;
				} else {
					this.phraseShortcuts[var7] = var8;
				}
			}
		}
	}

	@ObfuscatedName("kh.a(BLea;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decodeInner(var2, arg0);
		}
	}

	@ObfuscatedName("kh.e(II)I")
	public int getSubcategoryByShortcut(int arg0) {
		if (this.subcategoryIds == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.subcategoryIds.length; var2++) {
			if (this.subcategoryShortcuts[var2] == arg0) {
				return this.subcategoryIds[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.b(Z)V")
	public void markGlobal() {
		if (this.phraseIds != null) {
			for (int var1 = 0; var1 < this.phraseIds.length; var1++) {
				this.phraseIds[var1] |= 0x8000;
			}
		}
		if (this.subcategoryIds != null) {
			for (int var2 = 0; var2 < this.subcategoryIds.length; var2++) {
				this.subcategoryIds[var2] |= 0x8000;
			}
		}
	}
}
