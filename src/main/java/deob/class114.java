package deob;

@ObfuscatedName("t")
public final class class114 extends class44 {

	@ObfuscatedName("t.sb")
	public static JagString field2804 = JagString.wrap("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@ObfuscatedName("t.wb")
	public static int[] field2808 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@ObfuscatedName("t.Ab")
	public static JagString field2812 = JagString.wrap(" Sekunde(Xn(Y -Ubertragen)3");

	@ObfuscatedName("t.zb")
	public static int field2811 = 0;

	@ObfuscatedName("t.Bb")
	public static int field2813 = 0;

	@ObfuscatedName("t.xb")
	public static int field2809 = 0;

	@ObfuscatedName("t.Hb")
	public static int[] field2819 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("t.Gb")
	public static JagString field2818 = JagString.wrap("sideicons");

	@ObfuscatedName("t.Db")
	public static boolean field2815 = false;

	@ObfuscatedName("t.Jb")
	public static JagString field2821 = JagString.wrap("Friends");

	@ObfuscatedName("t.Lb")
	public static JagString field2823 = JagString.wrap("Examine");

	@ObfuscatedName("t.tb")
	public static JagString field2805 = field2823;

	@ObfuscatedName("t.Fb")
	public static JagString field2817 = field2821;

	@ObfuscatedName("t.Mb")
	public static JagString field2824 = JagString.wrap("Ihr Charakter)2Profil wird in:");

	@ObfuscatedName("t.Kb")
	public static int field2822 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("t.Nb")
	public final class84[] field2825;

	@ObfuscatedName("t.a(II)Z")
	public boolean method938(int arg0) {
		return this.field2825[arg0].field2123;
	}

	public class114(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.method235(arg2);
		this.field2825 = new class84[var6];
		int[] var7 = arg0.method237(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.method217(var7[var8], arg2);
			class127 var10 = null;
			int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
			for (class127 var12 = (class127) var5.method802(); var12 != null; var12 = (class127) var5.method809()) {
				if (var12.field3114 == var11) {
					var10 = var12;
					break;
				}
			}
			if (var10 == null) {
				byte[] var13 = arg1.method227(0, var11);
				var10 = new class127(var11, var13);
				var5.method804(var10);
			}
			this.field2825[var7[var8]] = new class84(var9, var10);
		}
	}
}
