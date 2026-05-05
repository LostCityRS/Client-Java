package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.EnumType;
import jagex3.config.ObjType;
import jagex3.config.QuickChatDynamicProvider;
import jagex3.jstring.JagString;

@ObfuscatedName("pa")
public final class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("pa.a([IIJI)Li;")
	@Override
	public JagString formatDynamicValue(int[] arg0, int arg1, long arg2) {
		if (arg1 == 0) {
			EnumType var5 = EnumType.list(arg0[0]);
			return var5.getValueString((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			ObjType var6 = ObjType.list((int) arg2);
			return var6.name;
		} else if (arg1 == 6 || arg1 == 7) {
			return EnumType.list(arg0[0]).getValueString((int) arg2);
		} else {
			return null;
		}
	}
}
