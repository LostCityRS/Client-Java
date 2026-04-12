package deob;

@ObfuscatedName("be")
public final class class12 extends Linkable {

	@ObfuscatedName("be.cb")
	public static JagString field414 = JagString.wrap("Ung-Ultiges Anmelde)2Paket)3");

	@ObfuscatedName("be.eb")
	public int field416;

	@ObfuscatedName("be.fb")
	public int field417;

	@ObfuscatedName("be.gb")
	public static JagString field418 = JagString.wrap("Lade Spiel)2Fenster )2 ");

	@ObfuscatedName("be.hb")
	public static int field419 = 0;

	@ObfuscatedName("be.ib")
	public int field420;

	@ObfuscatedName("be.lb")
	public int field423;

	@ObfuscatedName("be.mb")
	public class61 field424;

	@ObfuscatedName("be.nb")
	public int field425;

	@ObfuscatedName("be.ob")
	public int field426;

	@ObfuscatedName("be.qb")
	public int[] field428;

	@ObfuscatedName("be.sb")
	public int field430;

	@ObfuscatedName("be.tb")
	public static JagString field431 = JagString.wrap("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@ObfuscatedName("be.vb")
	public class61 field433;

	@ObfuscatedName("be.wb")
	public class49 field434;

	@ObfuscatedName("be.xb")
	public int field435;

	@ObfuscatedName("be.yb")
	public int field436;

	@ObfuscatedName("be.zb")
	public int field437;

	@ObfuscatedName("be.c(I)V")
	public void method247() {
		int var1 = this.field420;
		class49 var2 = this.field434.method516();
		if (var2 == null) {
			this.field423 = 0;
			this.field435 = 0;
			this.field425 = 0;
			this.field428 = null;
			this.field420 = -1;
		} else {
			this.field423 = var2.field1285 * 128;
			this.field435 = var2.field1282;
			this.field425 = var2.field1325;
			this.field420 = var2.field1296;
			this.field428 = var2.field1306;
		}
		if (this.field420 != var1 && this.field424 != null) {
			Statics.field2435.method135(this.field424);
			this.field424 = null;
		}
	}
}
