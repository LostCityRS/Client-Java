package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.QuickChatPhraseType;
import jagex3.io.Packet;

@ObfuscatedName("tj")
public final class QuickChatPhrase {

	@ObfuscatedName("tj.d")
	public int field4058;

	@ObfuscatedName("tj.k")
	public QuickChatPhraseType field4065;

	@ObfuscatedName("tj.n")
	public int[] field4068;

	@ObfuscatedName("id.a(BLea;)Ltj;")
	public static QuickChatPhrase method667(Packet arg0) {
		QuickChatPhrase var1 = new QuickChatPhrase();
		var1.field4058 = arg0.g2();
		var1.field4065 = QuickChatPhraseType.method1150(var1.field4058);
		return var1;
	}
}
