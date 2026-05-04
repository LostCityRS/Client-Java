package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ab")
public final class class3 {

	@ObfuscatedName("ab.a")
	public static final int field26 = 5063219;

	@ObfuscatedName("ab.b")
	public static final class88 field27 = class208.method1423(105, "Die Adresse dieses Computers wurde gesperrt)1");

	@ObfuscatedName("ab.d")
	public int field29;

	@ObfuscatedName("ab.e")
	public static class26 field30;

	@ObfuscatedName("ab.g")
	public static int[] field32;

	@ObfuscatedName("ab.h")
	public DataInputStream field33;

	@ObfuscatedName("ab.i")
	public static final class88 field34 = class208.method1423(105, "null");

	@ObfuscatedName("ab.j")
	public byte[] field35;

	@ObfuscatedName("ab.k")
	public int field36;

	@ObfuscatedName("ab.l")
	public final long field37;

	@ObfuscatedName("ab.n")
	public final byte[] field39 = new byte[4];

	@ObfuscatedName("ab.o")
	public static final class88 field40 = class208.method1423(105, "(Z");

	@ObfuscatedName("ab.p")
	public int field41;

	@ObfuscatedName("ab.q")
	public static int[][] field42;

	@ObfuscatedName("ab.r")
	public final class163 field43;

	@ObfuscatedName("ab.t")
	public static final class88 field45 = class208.method1423(105, "Please enter your username)3");

	@ObfuscatedName("ab.m")
	public static class88 field38 = field45;

	@ObfuscatedName("ab.a(B)V")
	public static void method13() {
		class231.field4331.method670();
		class106.field1923.method134();
		class141.field2606.method134();
	}

	@ObfuscatedName("ab.a(Li;ZLi;Lnb;)[Lpf;")
	public static class169[] method15(class88 arg0, class88 arg1, class144 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return class239.method1583(var4, arg2, var3);
	}

	public class3(class181 arg0, URL arg1) {
		this.field43 = arg0.method1293(arg1);
		this.field36 = 0;
		this.field37 = class206.method1418() + 30000L;
	}

	@ObfuscatedName("ab.a(Z)[B")
	public byte[] method12() throws IOException {
		if (this.field37 < class206.method1418()) {
			throw new IOException("fdt");
		}
		if (this.field36 == 0) {
			if (this.field43.field3134 == 2) {
				throw new IOException("fds");
			}
			if (this.field43.field3134 == 1) {
				this.field36 = 1;
				this.field33 = (DataInputStream) this.field43.field3129;
			}
		}
		if (this.field36 == 1) {
			int var1 = this.field33.available();
			if (var1 > 0) {
				if (var1 + this.field29 > 4) {
					var1 = 4 - this.field29;
				}
				this.field29 += this.field33.read(this.field39, this.field29, var1);
				if (this.field29 == 4) {
					int var2 = (new class46(this.field39)).method323();
					this.field36 = 2;
					this.field35 = new byte[var2];
				}
			}
		}
		if (this.field36 == 2) {
			int var3 = this.field33.available();
			if (var3 > 0) {
				if (this.field35.length < this.field41 + var3) {
					var3 = this.field35.length - this.field41;
				}
				this.field41 += this.field33.read(this.field35, this.field41, var3);
				if (this.field41 == this.field35.length) {
					return this.field35;
				}
			}
		}
		return null;
	}
}
