package deob;

import java.util.Random;

@ObfuscatedName("gd")
public final class class70 {

	@ObfuscatedName("gd.a")
	public int field1255;

	@ObfuscatedName("gd.c")
	public boolean field1257;

	@ObfuscatedName("gd.d")
	public int field1258;

	@ObfuscatedName("gd.e")
	public static final Random field1259 = new Random();

	@ObfuscatedName("gd.f")
	public int field1260;

	@ObfuscatedName("gd.g")
	public int field1261;

	@ObfuscatedName("gd.h")
	public class88 field1262;

	@ObfuscatedName("gd.j")
	public static int field1264;

	@ObfuscatedName("gd.k")
	public static final short[] field1265 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@ObfuscatedName("gd.p")
	public static int field1270 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("gd.v")
	public static int field1276;

	@ObfuscatedName("gd.A")
	public static int field1281 = 1;

	@ObfuscatedName("gd.L")
	public static final class88 field1292 = class208.method1423(105, "");

	@ObfuscatedName("gd.l")
	public static class88 field1266 = field1292;

	@ObfuscatedName("gd.m")
	public static class88 field1267 = field1292;

	@ObfuscatedName("gd.n")
	public static class88 field1268 = field1292;

	@ObfuscatedName("gd.o")
	public static class88 field1269 = field1292;

	@ObfuscatedName("gd.q")
	public static class88 field1271 = field1292;

	@ObfuscatedName("gd.r")
	public static class88 field1272 = field1292;

	@ObfuscatedName("gd.s")
	public static class88 field1273 = field1292;

	@ObfuscatedName("gd.t")
	public static class88 field1274 = field1292;

	@ObfuscatedName("gd.u")
	public static class88 field1275 = field1292;

	@ObfuscatedName("gd.w")
	public static class88 field1277 = field1292;

	@ObfuscatedName("gd.N")
	public static class88 field1294 = field1292;

	@ObfuscatedName("gd.x")
	public static class88 field1278 = field1292;

	@ObfuscatedName("gd.B")
	public static class88 field1282 = field1292;

	@ObfuscatedName("gd.z")
	public static class88 field1280 = field1292;

	@ObfuscatedName("gd.Q")
	public static class88 field1297 = field1292;

	@ObfuscatedName("gd.E")
	public static class88 field1285 = field1292;

	@ObfuscatedName("gd.S")
	public static class88 field1299 = field1292;

	@ObfuscatedName("gd.J")
	public static class88 field1290 = field1292;

	@ObfuscatedName("gd.V")
	public static class88 field1302 = field1292;

	@ObfuscatedName("gd.C")
	public static class88 field1283 = field1292;

	@ObfuscatedName("gd.M")
	public static class88 field1293 = field1292;

	@ObfuscatedName("gd.I")
	public static class88 field1289 = field1292;

	@ObfuscatedName("gd.F")
	public static class88 field1286 = field1292;

	@ObfuscatedName("gd.W")
	public static class88 field1303 = field1292;

	@ObfuscatedName("gd.O")
	public static class88 field1295 = field1292;

	@ObfuscatedName("gd.y")
	public static final class88 field1279 = field1292;

	@ObfuscatedName("gd.D")
	public static class88 field1284 = field1292;

	@ObfuscatedName("gd.X")
	public static class88 field1304 = field1292;

	@ObfuscatedName("gd.K")
	public static class88 field1291 = field1292;

	@ObfuscatedName("gd.P")
	public static final class88 field1296 = field1292;

	@ObfuscatedName("gd.R")
	public static class88 field1298 = field1292;

	@ObfuscatedName("gd.Y")
	public static class88 field1305 = field1292;

	@ObfuscatedName("gd.U")
	public static class88 field1301 = field1292;

	@ObfuscatedName("gd.T")
	public static class88 field1300 = field1292;

	@ObfuscatedName("gd.H")
	public static class88 field1288 = field1292;

	@ObfuscatedName("gd.G")
	public static class88 field1287 = field1292;

	@ObfuscatedName("gd.Z")
	public static class88 field1306 = field1292;

	@ObfuscatedName("gd.a(IZLi;)V")
	public static void method467(boolean arg0, class88 arg1) {
		class88 var2 = arg1.method639();
		int var3 = 0;
		short[] var4 = new short[16];
		for (int var5 = 0; var5 < class202.field3855; var5++) {
			class149 var6 = class71.method472(var5);
			if ((!arg0 || var6.field2861) && var6.field2867 == -1 && var6.field2884 == -1 && var6.field2850 == 0 && var6.field2892.method639().method617(var2) != -1) {
				if (var3 >= 250) {
					class204.field3893 = -1;
					class67.field1210 = null;
					return;
				}
				if (var3 >= var4.length) {
					short[] var7 = new short[var4.length * 2];
					for (int var8 = 0; var8 < var3; var8++) {
						var7[var8] = var4[var8];
					}
					var4 = var7;
				}
				var4[var3++] = (short) var5;
			}
		}
		class116.field2107 = 0;
		class204.field3893 = var3;
		class67.field1210 = var4;
		class88[] var9 = new class88[class204.field3893];
		for (int var10 = 0; var10 < class204.field3893; var10++) {
			var9[var10] = class71.method472(var4[var10]).field2892;
		}
		class200.method1376(class67.field1210, var9);
	}

	@ObfuscatedName("gd.a(IIIIBII)I")
	public static int method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}
		int var7 = arg1 & 0x3;
		if (var7 == 0) {
			return arg3;
		} else if (var7 == 1) {
			return arg2;
		} else if (var7 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 8 - arg2 - arg4;
		}
	}
}
