package deob;

@ObfuscatedName("pa")
public final class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("pa.a([IIJI)Li;")
	@Override
	public JagString method1126(int[] arg0, int arg1, long arg2) {
		if (arg1 == 0) {
			EnumType var5 = EnumType.method1148(arg0[0]);
			return var5.method360((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			ObjType var6 = ObjType.list((int) arg2);
			return var6.field2892;
		} else if (arg1 == 6 || arg1 == 7) {
			return EnumType.method1148(arg0[0]).method360((int) arg2);
		} else {
			return null;
		}
	}
}
