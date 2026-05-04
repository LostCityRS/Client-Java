package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.io.Packet;

public class ReflectionChecker {
	@ObfuscatedName("va.a(Lqg;IILea;)V")
	public static void method1535(SignLink arg0, int arg1, Packet arg2) {
		ReflectionCheck var3 = new ReflectionCheck();
		var3.field124 = arg2.g1();
		var3.field136 = arg2.g4();
		var3.field129 = new int[var3.field124];
		var3.field139 = new PrivilegedRequest[var3.field124];
		var3.field128 = new int[var3.field124];
		var3.field132 = new int[var3.field124];
		var3.field131 = new byte[var3.field124][][];
		var3.field138 = new PrivilegedRequest[var3.field124];
		for (int var4 = 0; var4 < var3.field124; var4++) {
			try {
				int var5 = arg2.g1();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					String var16 = new String(arg2.gjstr().method613());
					String var17 = new String(arg2.gjstr().method613());
					int var18 = 0;
					if (var5 == 1) {
						var18 = arg2.g4();
					}
					var3.field128[var4] = var5;
					var3.field129[var4] = var18;
					var3.field139[var4] = arg0.method1291(var17, Statics.method1574(var16));
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg2.gjstr().method613());
					String var7 = new String(arg2.gjstr().method613());
					int var8 = arg2.g1();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg2.gjstr().method613());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg2.g4();
							var11[var12] = new byte[var13];
							arg2.method307(var13, var11[var12]);
						}
					}
					var3.field128[var4] = var5;
					Class[] var14 = new Class[var8];
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = Statics.method1574(var9[var15]);
					}
					var3.field138[var4] = arg0.method1294(var7, Statics.method1574(var6), var14);
					var3.field131[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field132[var4] = -1;
			} catch (SecurityException var20) {
				var3.field132[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field132[var4] = -3;
			} catch (Exception var22) {
				var3.field132[var4] = -4;
			} catch (Throwable var23) {
				var3.field132[var4] = -5;
			}
		}
		Statics.field1694.push(var3);
	}
}
