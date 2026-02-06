package deob;

import java.awt.Frame;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bc")
public final class class11 {

	@ObfuscatedName("bc.a")
	public int field171;

	@ObfuscatedName("bc.b")
	public int field172;

	@ObfuscatedName("bc.c")
	public static int field173 = 0;

	@ObfuscatedName("bc.d")
	public static class18 field174;

	@ObfuscatedName("bc.f")
	public static class157 field176 = new class157();

	@ObfuscatedName("bc.g")
	public byte[] field177;

	@ObfuscatedName("bc.h")
	public DataInputStream field178;

	@ObfuscatedName("bc.j")
	public final byte[] field180 = new byte[4];

	@ObfuscatedName("bc.k")
	public int field181;

	@ObfuscatedName("bc.l")
	public static long field182 = 0L;

	@ObfuscatedName("bc.m")
	public static class32 field183 = class73.method593("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", true);

	@ObfuscatedName("bc.n")
	public static Frame field184;

	@ObfuscatedName("bc.p")
	public static class32 field186 = class73.method593("Die Verbindung konnte", true);

	@ObfuscatedName("bc.r")
	public static int[] field188 = new int[128];

	@ObfuscatedName("bc.s")
	public static int field189 = 0;

	@ObfuscatedName("bc.t")
	public final long field190;

	@ObfuscatedName("bc.u")
	public static int[] field191 = new int[32];

	@ObfuscatedName("bc.v")
	public final class18 field192;

	@ObfuscatedName("bc.w")
	public static boolean field193;

	@ObfuscatedName("bc.x")
	public static int field194 = 1;

	@ObfuscatedName("bc.a(III)I")
	public static int method62(int arg0, int arg1) {
		int var2 = class97.method751(arg0 - 1, arg1 + -1) + class97.method751(arg0 - 1, arg1 + 1) + class97.method751(arg0 + 1, arg1 + -1) + class97.method751(arg0 + 1, arg1 + 1);
		int var3 = class97.method751(arg0, arg1 - 1) + class97.method751(arg0, arg1 + 1) + class97.method751(arg0 - 1, arg1) + class97.method751(arg0 + 1, arg1);
		int var4 = class97.method751(arg0, arg1);
		return var3 / 8 + var2 / 16 + var4 / 4;
	}

	public class11(class25 arg0, URL arg1) {
		this.field192 = arg0.method178(arg1);
		this.field181 = 0;
		this.field190 = class52.method407() + 30000L;
	}

	@ObfuscatedName("bc.a(Z)[B")
	public byte[] method63() throws IOException {
		if (this.field190 < class52.method407()) {
			throw new IOException("fdt");
		}
		if (this.field181 == 0) {
			if (this.field192.field355 == 2) {
				throw new IOException("fds");
			}
			if (this.field192.field355 == 1) {
				this.field181 = 1;
				this.field178 = (DataInputStream) this.field192.field352;
			}
		}
		if (this.field181 == 1) {
			int var1 = this.field178.available();
			if (var1 > 0) {
				if (var1 + this.field172 > 4) {
					var1 = 4 - this.field172;
				}
				this.field172 += this.field178.read(this.field180, this.field172, var1);
				if (this.field172 == 4) {
					int var2 = (new class66(this.field180)).method538();
					this.field177 = new byte[var2];
					this.field181 = 2;
				}
			}
		}
		if (this.field181 == 2) {
			int var3 = this.field178.available();
			if (var3 > 0) {
				if (this.field177.length < this.field171 + var3) {
					var3 = this.field177.length - this.field171;
				}
				this.field171 += this.field178.read(this.field177, this.field171, var3);
				if (this.field177.length == this.field171) {
					return this.field177;
				}
			}
		}
		return null;
	}
}
