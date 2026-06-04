package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("si")
public final class QuickChatPhraseType extends Linkable2 {

	@ObfuscatedName("m.e")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("md.U")
	public static final int[] ENCODE_BIT_LENGTHS = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };
	@ObfuscatedName("ha.F")
	public static final int[] DECODE_BIT_LENGTHS = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };
	@ObfuscatedName("id.o")
	public static final int[] DYNAMIC_PARAM_COUNTS = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
	@ObfuscatedName("jd.a")
	public static final JagString EMPTY = JagString.wrap("");
	@ObfuscatedName("rc.E")
	public static final JagString field3644 = JagString.wrap(")3)3)3");

	@ObfuscatedName("ha.C")
	public static Js5 configClient;
	@ObfuscatedName("wh.V")
	public static QuickChatDynamicProvider dynamicProvider = null;
	@ObfuscatedName("db.B")
	public static Js5 globalConfigClient;

	@ObfuscatedName("si.I")
	public int[] dynamicCommands;

	@ObfuscatedName("si.T")
	public int[] autoResponses;

	@ObfuscatedName("si.E")
	public JagString[] textSegments;

	@ObfuscatedName("si.M")
	public int[][] dynamicCommandParams;

	@ObfuscatedName("pe.a(BI)Lsi;")
	public static QuickChatPhraseType list(int arg0) {
		QuickChatPhraseType var1 = (QuickChatPhraseType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2;
		if (arg0 >= 32768) {
			var2 = globalConfigClient.getFile(arg0 & 0x7FFF, 1);
		} else {
			var2 = configClient.getFile(arg0, 1);
		}
		QuickChatPhraseType var3 = new QuickChatPhraseType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		if (arg0 >= 32768) {
			var3.markGlobal();
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.a(Lnb;Lsb;Lnb;B)V")
	public static void init(Js5 arg0, QuickChatDynamicProvider arg1, Js5 arg2) {
		configClient = arg2;
		dynamicProvider = arg1;
		globalConfigClient = arg0;
	}

	@ObfuscatedName("nb.a(JII[I)Li;")
	public static JagString formatDynamicValue(long arg0, int arg1, int[] arg2) {
		if (dynamicProvider != null) {
			JagString var4 = dynamicProvider.formatDynamicValue(arg2, arg1, arg0);
			if (var4 != null) {
				return var4;
			}
		}
		return arg1 == 5 ? JagString.toRawUsername(arg0).toScreenName() : JagString.valueOf(arg0);
	}

	@ObfuscatedName("si.a(BI)I")
	public int getDynamicCommand(int arg0) {
		return this.dynamicCommands == null || arg0 < 0 || arg0 > this.dynamicCommands.length ? -1 : this.dynamicCommands[arg0];
	}

	@ObfuscatedName("si.d(B)I")
	public int getDynamicCommandCount() {
		return this.dynamicCommands == null ? 0 : this.dynamicCommands.length;
	}

	@ObfuscatedName("si.a(BLea;I)V")
	public void decodeInner(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.textSegments = arg0.gjstr().splitOn(60);
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.autoResponses = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.autoResponses[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.g1();
			this.dynamicCommandParams = new int[var5][];
			this.dynamicCommands = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				this.dynamicCommands[var6] = var7;
				this.dynamicCommandParams[var6] = new int[DYNAMIC_PARAM_COUNTS[var7]];
				for (int var8 = 0; var8 < DYNAMIC_PARAM_COUNTS[var7]; var8++) {
					this.dynamicCommandParams[var6][var8] = arg0.g2();
				}
			}
		}
	}

	@ObfuscatedName("si.a(Lea;I)Li;")
	public JagString decodeMessage(Packet arg0) {
		JagString var2 = JagString.newStringBuilder(80);
		if (this.dynamicCommands != null) {
			for (int var3 = 0; var3 < this.dynamicCommands.length; var3++) {
				var2.append(this.textSegments[var3]);
				var2.append(formatDynamicValue(arg0.method300(DECODE_BIT_LENGTHS[this.dynamicCommands[var3]]), this.dynamicCommands[var3], this.dynamicCommandParams[var3]));
			}
		}
		var2.append(this.textSegments[this.textSegments.length - 1]);
		return var2.compact();
	}

	@ObfuscatedName("si.e(I)Li;")
	public JagString getText() {
		JagString var1 = JagString.newStringBuilder(80);
		if (this.textSegments == null) {
			return EMPTY;
		}
		var1.append(this.textSegments[0]);
		for (int var2 = 1; var2 < this.textSegments.length; var2++) {
			var1.append(field3644);
			var1.append(this.textSegments[var2]);
		}
		return var1.compact();
	}

	@ObfuscatedName("si.a(Lea;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decodeInner(arg0, var2);
		}
	}

	@ObfuscatedName("si.a(III)I")
	public int getDynamicCommandParam(int arg0, int arg1) {
		if (this.dynamicCommands == null || arg1 < 0 || this.dynamicCommands.length < arg1) {
			return -1;
		} else if (this.dynamicCommandParams[arg1] == null || arg0 < 0 || arg0 > this.dynamicCommandParams[arg1].length) {
			return -1;
		} else {
			return this.dynamicCommandParams[arg1][arg0];
		}
	}

	@ObfuscatedName("si.a(ILea;[I)V")
	public void encodeMessage(Packet arg0, int[] arg1) {
		if (this.dynamicCommands == null) {
			return;
		}
		for (int var3 = 0; var3 < this.dynamicCommands.length; var3++) {
			if (var3 >= arg1.length) {
				return;
			}
			int var4 = ENCODE_BIT_LENGTHS[this.getDynamicCommand(var3)];
			if (var4 > 0) {
				arg0.method306(var4, (long) arg1[var3]);
			}
		}
	}

	@ObfuscatedName("si.f(I)V")
	public void markGlobal() {
		if (this.autoResponses != null) {
			for (int var1 = 0; var1 < this.autoResponses.length; var1++) {
				this.autoResponses[var1] |= 0x8000;
			}
		}
	}
}
