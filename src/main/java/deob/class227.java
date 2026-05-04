package deob;

@ObfuscatedName("ui")
public final class class227 extends class136 {

	@ObfuscatedName("ui.E")
	public static final class88 field4251 = class208.method1423(105, "cross");

	@ObfuscatedName("ui.I")
	public static final class88 field4255 = class208.method1423(105, "Too many incorrect logins from your address)3");

	@ObfuscatedName("ui.G")
	public static final class88 field4253 = class208.method1423(105, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@ObfuscatedName("ui.P")
	public static final class88 field4262 = class208.method1423(105, " ");

	@ObfuscatedName("ui.M")
	public static class88 field4259 = field4255;

	@ObfuscatedName("ui.F")
	public static final class248 field4252 = new class248();

	@ObfuscatedName("ui.S")
	public static final class88 field4265 = class208.method1423(105, "cookieprefix");

	@ObfuscatedName("ui.T")
	public static final class88 field4266 = class208.method1423(105, "Der Server wird gerade aktualisiert)3");

	@ObfuscatedName("ui.L")
	public final class111 field4258;

	@ObfuscatedName("ui.J")
	public static int field4256;

	@ObfuscatedName("ui.D")
	public static class75 field4250;

	@ObfuscatedName("ui.K")
	public static class188[] field4257;

	@ObfuscatedName("ui.a(IIIILnc;Lnc;IIIIJ)V")
	public static void method1520(int arg0, int arg1, int arg2, int arg3, class145 arg4, class145 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
		if (arg4 == null) {
			return;
		}
		class64 var12 = new class64();
		var12.field1158 = arg10;
		var12.field1157 = arg1 * 128 + 64;
		var12.field1161 = arg2 * 128 + 64;
		var12.field1168 = arg3;
		var12.field1159 = arg4;
		var12.field1160 = arg5;
		var12.field1164 = arg6;
		var12.field1172 = arg7;
		var12.field1169 = arg8;
		var12.field1167 = arg9;
		for (int var13 = arg0; var13 >= 0; var13--) {
			if (class29.field489[var13][arg1][arg2] == null) {
				class29.field489[var13][arg1][arg2] = new class52(var13, arg1, arg2);
			}
		}
		class29.field489[arg0][arg1][arg2].field956 = var12;
	}

	public class227(class111 arg0) {
		this.field4258 = arg0;
	}
}
