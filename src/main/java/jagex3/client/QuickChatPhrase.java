package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.QuickChatPhraseType;
import jagex3.io.Packet;

@ObfuscatedName("tj")
public final class QuickChatPhrase {

	@ObfuscatedName("tj.d")
	public int id;

	@ObfuscatedName("tj.k")
	public QuickChatPhraseType type;

	@ObfuscatedName("tj.n")
	public int[] dynamics;

	@ObfuscatedName("id.a(BLea;)Ltj;")
	public static QuickChatPhrase create(Packet arg0) {
		QuickChatPhrase var1 = new QuickChatPhrase();
		var1.id = arg0.g2();
		var1.type = QuickChatPhraseType.list(var1.id);
		return var1;
	}
}
