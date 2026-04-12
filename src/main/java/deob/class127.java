package deob;

@ObfuscatedName("va")
public final class class127 extends class82 {

	@ObfuscatedName("va.cb")
	public final int[][] field3107;

	@ObfuscatedName("va.fb")
	public final int field3110;

	@ObfuscatedName("va.gb")
	public static class1 field3111 = Statics.method931("Service unavailable)3");

	@ObfuscatedName("va.ib")
	public static class1 field3113 = Statics.method931("rot:");

	@ObfuscatedName("va.jb")
	public final int field3114;

	@ObfuscatedName("va.kb")
	public static class1 field3115 = Statics.method931("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@ObfuscatedName("va.lb")
	public static boolean field3116 = false;

	@ObfuscatedName("va.mb")
	public final int[] field3117;

	@ObfuscatedName("va.nb")
	public static class1 field3118 = Statics.method931("cross");

	@ObfuscatedName("va.pb")
	public static class1 field3120 = Statics.method931("Musik)2Engine vorbereitet)3");

	@ObfuscatedName("va.rb")
	public static int field3122 = 0;

	@ObfuscatedName("va.tb")
	public static class1 field3124 = Statics.method931("Titelbild geladen)3");

	@ObfuscatedName("va.ub")
	public static class1 field3125 = Statics.method931(" hat sich eingeloggt)3");

	@ObfuscatedName("va.vb")
	public static class1 field3126 = Statics.method931("You need a members account to login to this world)3");

	@ObfuscatedName("va.wb")
	public static class1 field3127 = field3126;

	@ObfuscatedName("va.xb")
	public static class1 field3128 = field3111;

	public class127(int arg0, byte[] arg1) {
		this.field3114 = arg0;
		class8 var3 = new class8(arg1);
		this.field3110 = var3.method144();
		this.field3107 = new int[this.field3110][];
		this.field3117 = new int[this.field3110];
		for (int var4 = 0; var4 < this.field3110; var4++) {
			this.field3117[var4] = var3.method144();
		}
		for (int var5 = 0; var5 < this.field3110; var5++) {
			this.field3107[var5] = new int[var3.method144()];
		}
		for (int var6 = 0; var6 < this.field3110; var6++) {
			for (int var7 = 0; var7 < this.field3107[var6].length; var7++) {
				this.field3107[var6][var7] = var3.method144();
			}
		}
	}
}
