package deob;

@ObfuscatedName("ih")
public final class class95 {

	@ObfuscatedName("ih.a")
	public final int field1759;

	@ObfuscatedName("ih.b")
	public static String field1760;

	@ObfuscatedName("ih.c")
	public final int field1761;

	@ObfuscatedName("ih.d")
	public static final int[] field1762 = new int[5];

	@ObfuscatedName("ih.e")
	public final int field1763;

	@ObfuscatedName("ih.f")
	public static final long[] field1764 = new long[100];

	@ObfuscatedName("ih.h")
	public final int field1766;

	@ObfuscatedName("ih.i")
	public static final class88 field1767 = class208.method1423(105, "; Max)2Age=");

	@ObfuscatedName("ih.k")
	public boolean field1769 = true;

	@ObfuscatedName("ih.l")
	public static final class88 field1770 = class208.method1423(105, " zuerst von Ihrer Freunde)2Liste(Q");

	@ObfuscatedName("ih.m")
	public static final class88 field1771 = class208.method1423(105, "http:)4)4");

	@ObfuscatedName("ih.n")
	public final int field1772;

	@ObfuscatedName("ih.o")
	public final int field1773;

	@ObfuscatedName("ih.a(Z)V")
	public static void method676() {
		while (true) {
			if (class230.field4312.method31(class228.field4270) >= 11) {
				int var0 = class230.field4312.method28(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (class244.field4491[var0] == null) {
						var1 = true;
						class244.field4491[var0] = new class44();
						if (class77.field1397[var0] != null) {
							class244.field4491[var0].method285(class77.field1397[var0]);
						}
					}
					class174.field3428[class55.field1027++] = var0;
					class44 var2 = class244.field4491[var0];
					var2.field4081 = class117.field2113;
					int var3 = class6.field75[class230.field4312.method28(3)];
					if (var1) {
						var2.field4119 = var2.field4085 = var3;
					}
					int var4 = class230.field4312.method28(1);
					if (var4 == 1) {
						class139.field2579[class192.field3702++] = var0;
					}
					int var5 = class230.field4312.method28(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = class230.field4312.method28(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = class230.field4312.method28(1);
					var2.method1474(var7 == 1, class240.field4456.field4087[0] + var6, class240.field4456.field4141[0] - -var5);
					continue;
				}
			}
			class230.field4312.method35();
			return;
		}
	}

	@ObfuscatedName("ih.a([IIBIII[BIIII)V")
	public static void method677(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = (arg2 * (arg6 & 0xFF00FF) & 0xFF00FF00) + ((arg6 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		int var11 = 256 - arg2;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					int var14 = arg0[arg7];
					arg0[arg7++] = ((var11 * (var14 & 0xFF00FF) & 0xFF00FF00) + (var11 * (var14 & 0xFF00) & 0xFF0000) >> 8) + var10;
				}
			}
			arg7 += arg4;
			arg3 += arg9;
		}
	}

	public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.field1759 = arg3;
		this.field1769 = arg6;
		this.field1761 = arg0;
		this.field1773 = arg1;
		this.field1763 = arg4;
		this.field1772 = arg5;
		this.field1766 = arg2;
	}
}
