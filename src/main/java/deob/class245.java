package deob;

@ObfuscatedName("wf")
public final class class245 {

	@ObfuscatedName("wf.e")
	public static Pix32 field4500;

	@ObfuscatedName("wf.g")
	public static int field4502 = -1;

	@ObfuscatedName("wf.a(IIII)V")
	public static void method1602(int arg0, int arg1, int arg2, int arg3) {
		class52 var4 = World.field489[arg0][arg1][arg2];
		if (var4 == null) {
			return;
		}
		class64 var5 = var4.field956;
		if (var5 != null) {
			var5.field1169 = var5.field1169 * arg3 / 16;
			var5.field1167 = var5.field1167 * arg3 / 16;
		}
	}

	@ObfuscatedName("wf.a(I)V")
	public static void method1604() {
		int var0 = NpcType.field2330 - (int) ((double) Statics.field1706.field3380 / Statics.field1110);
		int var1 = Statics.field3033 - (int) ((double) Statics.field1706.field3422 / Statics.field1110);
		int var2 = NpcType.field2330 + (int) ((double) Statics.field1706.field3380 / Statics.field1110);
		if (var0 < 0) {
			NpcType.field2330 = (int) ((double) Statics.field1706.field3380 / Statics.field1110);
			Statics.field3659 = -1;
			Statics.field594 = -1;
		}
		if (SeqType.field1988 < var2) {
			NpcType.field2330 = SeqType.field1988 - (int) ((double) Statics.field1706.field3380 / Statics.field1110);
			Statics.field594 = -1;
			Statics.field3659 = -1;
		}
		int var3 = (int) ((double) Statics.field1706.field3422 / Statics.field1110) + Statics.field3033;
		if (var1 < 0) {
			Statics.field3033 = (int) ((double) Statics.field1706.field3422 / Statics.field1110);
			Statics.field3659 = -1;
			Statics.field594 = -1;
		}
		if (var3 > Statics.field760) {
			Statics.field3033 = Statics.field760 - (int) ((double) Statics.field1706.field3422 / Statics.field1110);
			Statics.field3659 = -1;
			Statics.field594 = -1;
		}
	}

}
