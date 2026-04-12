package deob;

@ObfuscatedName("cb")
public final class class15 {

	@ObfuscatedName("cb.d")
	public final class44 field483 = new class44();

	@ObfuscatedName("cb.i")
	public static class36 field488 = new class36(5000);

	@ObfuscatedName("cb.k")
	public int field490;

	@ObfuscatedName("cb.l")
	public final int field491;

	@ObfuscatedName("cb.m")
	public final class48 field492;

	@ObfuscatedName("cb.n")
	public final class63 field493 = new class63();

	@ObfuscatedName("cb.o")
	public static volatile int field494 = 0;

	@ObfuscatedName("cb.p")
	public static final int field495 = 5063219;

	@ObfuscatedName("cb.q")
	public static volatile int field496 = -1;

	@ObfuscatedName("cb.s")
	public static int field498 = 0;

	@ObfuscatedName("cb.u")
	public static class15 field500 = new class15(200);

	@ObfuscatedName("cb.y")
	public static boolean field504 = false;

	@ObfuscatedName("cb.a(IJLhb;)V")
	public void method262(long arg0, class44 arg1) {
		if (this.field490 == 0) {
			class44 var4 = this.field493.method597();
			var4.method739();
			var4.method468();
			if (this.field483 == var4) {
				class44 var5 = this.field493.method597();
				var5.method739();
				var5.method468();
			}
		} else {
			this.field490--;
		}
		this.field492.method498(arg1, arg0);
		this.field493.method598(arg1);
	}

	@ObfuscatedName("cb.a(JB)Lhb;")
	public class44 method263(long arg0) {
		class44 var3 = (class44) this.field492.method499(arg0);
		if (var3 != null) {
			this.field493.method598(var3);
		}
		return var3;
	}

	@ObfuscatedName("cb.a(JI)V")
	public void method264(long arg0) {
		class44 var3 = (class44) this.field492.method499(arg0);
		if (var3 != null) {
			var3.method739();
			var3.method468();
			this.field490++;
		}
	}

	@ObfuscatedName("cb.a(B)V")
	public void method267() {
		while (true) {
			class44 var1 = this.field493.method597();
			if (var1 == null) {
				this.field490 = this.field491;
				return;
			}
			var1.method739();
			var1.method468();
		}
	}

	public class15(int arg0) {
		this.field491 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field490 = arg0;
		this.field492 = new class48(var2);
	}
}
