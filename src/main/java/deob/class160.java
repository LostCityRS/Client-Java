package deob;

@ObfuscatedName("oh")
public final class class160 {

	@ObfuscatedName("oh.b")
	public class248 field3078 = new class248();

	@ObfuscatedName("oh.g")
	public static short field3083 = 320;

	@ObfuscatedName("oh.j")
	public int field3086 = -1;

	@ObfuscatedName("oh.k")
	public final int field3087;

	@ObfuscatedName("oh.l")
	public final int field3088;

	@ObfuscatedName("oh.m")
	public static final class88 field3089 = class208.method1423(105, " )2>");

	@ObfuscatedName("oh.o")
	public int[][] field3091;

	@ObfuscatedName("oh.p")
	public static final int[] field3092 = new int[200];

	@ObfuscatedName("oh.q")
	public static int field3093;

	@ObfuscatedName("oh.r")
	public static final class88 field3094 = class208.method1423(105, "glow2:");

	@ObfuscatedName("oh.e")
	public static class88 field3081 = field3094;

	@ObfuscatedName("oh.h")
	public static final class88 field3084 = field3094;

	@ObfuscatedName("oh.s")
	public class155[] field3095;

	@ObfuscatedName("oh.u")
	public int field3097 = 0;

	@ObfuscatedName("oh.v")
	public boolean field3098 = false;

	@ObfuscatedName("oh.a(Ljava/lang/Throwable;Ljava/lang/String;)Lbb;")
	public static class14 method1076(Throwable arg0, String arg1) {
		class14 var2;
		if (arg0 instanceof class14) {
			var2 = (class14) arg0;
			var2.field210 = var2.field210 + ' ' + arg1;
		} else {
			var2 = new class14(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("oh.a(ZI)I")
	public static int method1077(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("oh.c(I)V")
	public static void method1079() {
		class12.field174.method670();
	}

	@ObfuscatedName("oh.a(III)I")
	public static int method1080(int arg0, int arg1) {
		int var2 = arg1 - 1 & arg0 >> 31;
		return var2 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	public class160(int arg0, int arg1, int arg2) {
		this.field3087 = arg0;
		this.field3091 = new int[this.field3087][arg2];
		this.field3088 = arg1;
		this.field3095 = new class155[this.field3088];
	}

	@ObfuscatedName("oh.b(I)[[I")
	public int[][] method1075() {
		if (this.field3088 != this.field3087) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int var1 = 0; var1 < this.field3087; var1++) {
			this.field3095[var1] = class87.field1572;
		}
		return this.field3091;
	}

	@ObfuscatedName("oh.b(ZI)[I")
	public int[] method1078(int arg0) {
		if (this.field3087 == this.field3088) {
			this.field3098 = this.field3095[arg0] == null;
			this.field3095[arg0] = class87.field1572;
			return this.field3091[arg0];
		} else if (this.field3087 == 1) {
			this.field3098 = arg0 != this.field3086;
			this.field3086 = arg0;
			return this.field3091[0];
		} else {
			class155 var2 = this.field3095[arg0];
			if (var2 == null) {
				this.field3098 = true;
				if (this.field3087 > this.field3097) {
					var2 = new class155(arg0, this.field3097);
					this.field3097++;
				} else {
					class155 var3 = (class155) this.field3078.method1612();
					var2 = new class155(arg0, var3.field3001);
					this.field3095[var3.field2992] = null;
					var3.method460();
				}
				this.field3095[arg0] = var2;
			} else {
				this.field3098 = false;
			}
			this.field3078.method1615(var2);
			return this.field3091[var2.field3001];
		}
	}

	@ObfuscatedName("oh.a(B)V")
	public void method1081() {
		for (int var1 = 0; var1 < this.field3087; var1++) {
			this.field3091[var1] = null;
		}
		this.field3091 = null;
		this.field3095 = null;
		this.field3078.method1616();
		this.field3078 = null;
	}
}
