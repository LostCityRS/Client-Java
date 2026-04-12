package deob;

// import sun.audio.AudioPlayer;

@ObfuscatedName("v")
public final class class126 extends class14 {

	@ObfuscatedName("v.F")
	public final class68 field3106 = new class68();

	@ObfuscatedName("v.a()V")
	@Override
	public void method256() {
		// AudioPlayer.player.stop(this.field3106);
		class68 var1 = this.field3106;
		synchronized (this.field3106) {
			this.field3106.field1696 = true;
		}
	}

	public class126() {
		super(8000);
		// AudioPlayer.player.start(this.field3106);
	}
}
