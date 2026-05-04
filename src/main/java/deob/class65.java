package deob;

@ObfuscatedName("fi")
public final class class65 extends class67 {

	@ObfuscatedName("fi.u")
	public int field1175;

	@ObfuscatedName("fi.v")
	public static class144 field1176;

	@ObfuscatedName("fi.w")
	public static class174 field1177;

	@ObfuscatedName("fi.x")
	public static final class88 field1178 = class208.method1423(105, "Please reload this page)3");

	@ObfuscatedName("fi.B")
	public static int field1182 = 0;

	@ObfuscatedName("fi.A")
	public static final class88 field1181 = class208.method1423(105, "Examine");

	@ObfuscatedName("fi.t")
	public static class88 field1174 = field1181;

	@ObfuscatedName("fi.D")
	public static int field1183 = 255;

	@ObfuscatedName("fi.G")
	public static class88 field1186 = field1178;

	@ObfuscatedName("fi.F")
	public static int field1185 = 0;

	@ObfuscatedName("fi.y")
	public int field1179;

	@ObfuscatedName("fi.z")
	public int field1180;

	@ObfuscatedName("fi.a(Lhj;B)V")
	public static void method453(class87 arg0) {
		if (class36.field625 != 1) {
			return;
		}
		if (class226.field4239 >= 280 && class226.field4239 <= 294 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(0, 0);
			return;
		}
		if (class226.field4239 >= 295 && class226.field4239 <= 360 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(0, 1);
			return;
		}
		if (class226.field4239 >= 390 && class226.field4239 <= 404 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(1, 0);
			return;
		}
		if (class226.field4239 >= 405 && class226.field4239 <= 470 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(1, 1);
			return;
		}
		if (class226.field4239 >= 500 && class226.field4239 <= 514 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(2, 0);
			return;
		}
		if (class226.field4239 >= 515 && class226.field4239 <= 580 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(2, 1);
			return;
		}
		if (class226.field4239 >= 610 && class226.field4239 <= 624 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(3, 0);
			return;
		}
		if (class226.field4239 >= 625 && class226.field4239 <= 690 && class172.field3339 >= 4 && class172.field3339 <= 18) {
			class90.method656(3, 1);
			return;
		}
		if (class226.field4239 >= 700 && class172.field3339 >= 4 && class226.field4239 <= 758 && class172.field3339 <= 20) {
			class209.field3959 = false;
			class221.method1493();
			return;
		}
		if (class87.field1581 == -1) {
			return;
		}
		class70 var1 = class202.field3845[class87.field1581];
		if (class67.field1215 == var1.field1257) {
			byte[] var2 = class166.method1140(new class88[] { var1.field1262, class206.field3922 }).method613();
			class95.field1760 = new String(var2, 0, var2.length);
			class28.field470 = var1.field1261;
			if (class115.field2071 != 0) {
				class49.field911 = 443;
				class115.field2071 = 0;
				class168.field3246 = 43594;
				class220.field4156 = 43594;
			}
			class209.field3959 = false;
			class221.method1493();
			return;
		}
		class88 var3 = class166.method1140(new class88[] { class95.field1771, var1.field1262, class159.field3076, class170.method1212(class126.field2348), class4.field63, class170.method1212(class245.field4497 ? 1 : 0), class2.field21, class170.method1212(class143.field2657), class74.field1351, class170.method1212(class70.field1281) });
		try {
			arg0.getAppletContext().showDocument(var3.method606(), "_self");
		} catch (Exception var4) {
		}
	}
}
