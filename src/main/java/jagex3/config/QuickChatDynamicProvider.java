package jagex3.config;

import deob.ObfuscatedName;
import jagex3.jstring.JagString;

@ObfuscatedName("sb")
public interface QuickChatDynamicProvider {

	@ObfuscatedName("sb.a([IIJI)Li;")
    JagString formatDynamicValue(int[] arg0, int arg1, long arg2);
}
