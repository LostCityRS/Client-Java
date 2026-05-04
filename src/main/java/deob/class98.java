package deob;

@ObfuscatedName("j")
public final class class98 {

	@ObfuscatedName("j.a")
	public static final int[] field1792 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("j.d")
	public static int field1795 = 0;

	@ObfuscatedName("j.e")
	public static final JagString field1796 = JagString.wrap("headicons_pk");

	@ObfuscatedName("j.j")
	public static int field1801;

	@ObfuscatedName("j.a(IILi;SJLi;I)V")
	public static void method685(int arg0, JagString arg1, short arg2, long arg3, JagString arg4, int arg5) {
		if (client.field1958 || client.field3862 >= 500) {
			return;
		}
		client.field1191[client.field3862] = arg1;
		client.field3836[client.field3862] = arg4;
		client.field994[client.field3862] = arg2;
		client.field1352[client.field3862] = arg3;
		client.field3176[client.field3862] = arg0;
		client.field4060[client.field3862] = arg5;
		client.field3862++;
	}

}
