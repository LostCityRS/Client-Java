package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

@ObfuscatedName("qa")
public final class class175 {

	@ObfuscatedName("qa.a")
	public static long field3519 = 0L;

	@ObfuscatedName("qa.b")
	public static boolean field3520;

	@ObfuscatedName("qa.e")
	public static final class88 field3523 = class208.method1423(105, "Welcome to RuneScape");

	@ObfuscatedName("qa.d")
	public static class88 field3522 = field3523;

	@ObfuscatedName("qa.f")
	public static class144 field3524;

	@ObfuscatedName("qa.h")
	public static final class88 field3526 = class208.method1423(105, " )2> <col=00ffff>");

	@ObfuscatedName("qa.i")
	public static final class88 field3527 = class208.method1423(105, "Try again in 60 secs)3)3)3");

	@ObfuscatedName("qa.g")
	public static class88 field3525 = field3527;

	@ObfuscatedName("qa.j")
	public static int field3528 = 3;

	@ObfuscatedName("qa.k")
	public static class119 field3529;

	@ObfuscatedName("qa.n")
	public static boolean field3532 = false;

	@ObfuscatedName("qa.a(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1256(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof class14) {
			class14 var1 = (class14) arg0;
			arg0 = var1.field215;
			var2 = var1.field210 + " | ";
		} else {
			var2 = "";
		}
		StringWriter var3 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var3);
		arg0.printStackTrace(var4);
		var4.close();
		String var5 = var3.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();
		while (true) {
			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					return var2 + "| " + var7;
				}
				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						String var13 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var13 + ' ';
						continue;
					}
					var8 = var8.substring(0, var9);
				}
				String var14 = var8.trim();
				String var15 = var14.substring(var14.lastIndexOf(32) + 1);
				String var16 = var15.substring(var15.lastIndexOf(9) + 1);
				var2 = var2 + var16 + ' ';
			}
		}
	}

	@ObfuscatedName("qa.a(II)V")
	public static void method1257(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = class165.field3176[arg0];
		int var2 = class217.field4060[arg0];
		int var3 = class53.field994[arg0];
		long var4 = class74.field1352[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var6 = (int) class74.field1352[arg0];
		if (var3 == 31) {
			class44 var7 = class244.field4491[var6];
			if (var7 != null) {
				class207.method1421(1, 0, var7.field4141[0], var7.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class157.field3017 = 2;
				class147.field2757 = class226.field4239;
				class45.field796 = 0;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(192);
				class146.field2747.method331(class48.field905);
				class146.field2747.method351(class209.field3965);
				class146.field2747.method305(class58.field1105);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 1006) {
			class45.field796 = 0;
			class147.field2757 = class226.field4239;
			class155.field2997 = class172.field3339;
			class157.field3017 = 2;
			class146.field2747.method30(191);
			class146.field2747.method305(var6);
		}
		if (var3 == 7) {
			class101.method705(var2, var4, var1);
			class146.field2747.method30(53);
			class146.field2747.method305((int) (var4 >>> 32) & Integer.MAX_VALUE);
			class146.field2747.method344(class190.field3679 + var2);
			class146.field2747.method344(var1 + class223.field4212);
		}
		if (var3 == 15) {
			class174 var8 = class36.method238(var1, var2);
			if (var8 != null) {
				class47.method363();
				class158.method1064(var2, class87.method592(class80.method530(var8)), var1);
				class28.field475 = 0;
				class201.field3835 = class194.method1345(var8);
				if (class201.field3835 == null) {
					class201.field3835 = class42.field710;
				}
				if (var8.field3410) {
					class28.field464 = class166.method1140(new class88[] { var8.field3457, class88.field1637 });
					return;
				}
				class28.field464 = class166.method1140(new class88[] { class12.field182, var8.field3459, class88.field1637 });
			}
			return;
		}
		if (var3 == 30) {
			class44 var9 = class244.field4491[var6];
			if (var9 != null) {
				class207.method1421(1, 0, var9.field4141[0], var9.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class147.field2757 = class226.field4239;
				class146.field2747.method30(65);
				class146.field2747.method314(var6);
			}
		}
		if (var3 == 40) {
			class146.field2747.method30(196);
			class146.field2747.method344(client.field569);
			class146.field2747.method338(class16.field249);
			class146.field2747.method326(var2);
			class146.field2747.method331(var1);
		}
		if (var3 == 34) {
			class191 var10 = class225.field4223[var6];
			if (var10 != null) {
				class207.method1421(1, 0, var10.field4141[0], var10.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class147.field2757 = class226.field4239;
				class146.field2747.method30(78);
				class146.field2747.method331(var6);
			}
		}
		if (var3 == 58) {
			class44 var11 = class244.field4491[var6];
			if (var11 != null) {
				class207.method1421(1, 0, var11.field4141[0], var11.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class157.field3017 = 2;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(151);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 4) {
			class191 var12 = class225.field4223[var6];
			if (var12 != null) {
				class207.method1421(1, 0, var12.field4141[0], var12.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class147.field2757 = class226.field4239;
				class45.field796 = 0;
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(71);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 39) {
			class146.field2747.method30(35);
			class146.field2747.method344(var6);
			class146.field2747.method305(client.field569);
			class146.field2747.method316(class16.field249);
			class146.field2747.method331(var1);
			class146.field2747.method316(var2);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 36) {
			class146.field2747.method30(109);
			class146.field2747.method338(var2);
			class174 var13 = class239.method1579(var2);
			if (var13.field3392 != null && var13.field3392[0][0] == 5) {
				int var14 = var13.field3392[0][1];
				class113.field2050[var14] = 1 - class113.field2050[var14];
				class158.method1068(var14);
			}
		}
		if (var3 == 1001) {
			class174 var15 = class239.method1579(var2);
			if (var15 == null || var15.field3474[var1] < 100000) {
				class146.field2747.method30(191);
				class146.field2747.method305(var6);
			} else {
				class223.method1499(class166.method1140(new class88[] { class170.method1212(var15.field3474[var1]), class109.field1973, class71.method472(var6).field2892 }), 0, class174.field3453);
			}
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 1) {
			class44 var16 = class244.field4491[var6];
			if (var16 != null) {
				class207.method1421(1, 0, var16.field4141[0], var16.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class147.field2757 = class226.field4239;
				class45.field796 = 0;
				class146.field2747.method30(47);
				class146.field2747.method344(var6);
			}
		}
		if (var3 == 21) {
			class146.field2747.method30(160);
			class146.field2747.method344(var1);
			class146.field2747.method351(var2);
			class146.field2747.method331(var6);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 2) {
			class146.field2747.method30(216);
			class146.field2747.method316(var2);
			class146.field2747.method314(var1);
			class146.field2747.method344(var6);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 35) {
			class101.method705(var2, var4, var1);
			class146.field2747.method30(13);
			class146.field2747.method344(Integer.MAX_VALUE & (int) (var4 >>> 32));
			class146.field2747.method314(class223.field4212 + var1);
			class146.field2747.method314(var2 + class190.field3679);
		}
		if (var3 == 51) {
			class101.method705(var2, var4, var1);
			class146.field2747.method30(94);
			class146.field2747.method331(var1 + class223.field4212);
			class146.field2747.method305(var2 + class190.field3679);
			class146.field2747.method344(Integer.MAX_VALUE & (int) (var4 >>> 32));
		}
		if (var3 == 29) {
			class44 var17 = class244.field4491[var6];
			if (var17 != null) {
				class207.method1421(1, 0, var17.field4141[0], var17.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class157.field3017 = 2;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(118);
				class146.field2747.method331(var6);
			}
		}
		if (var3 == 48) {
			class191 var18 = class225.field4223[var6];
			if (var18 != null) {
				class207.method1421(1, 0, var18.field4141[0], var18.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class45.field796 = 0;
				class157.field3017 = 2;
				class146.field2747.method30(30);
				class146.field2747.method314(class58.field1105);
				class146.field2747.method326(class209.field3965);
				class146.field2747.method314(var6);
				class146.field2747.method344(class48.field905);
			}
		}
		if (var3 == 44) {
			class146.field2747.method30(112);
			class146.field2747.method305(var1);
			class146.field2747.method326(var2);
			class146.field2747.method344(var6);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 14) {
			class29.method174();
		}
		if (var3 == 17) {
			class191 var19 = class225.field4223[var6];
			if (var19 != null) {
				class207.method1421(1, 0, var19.field4141[0], var19.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class157.field3017 = 2;
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(164);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 57) {
			boolean var20 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var20) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class155.field2997 = class172.field3339;
			class147.field2757 = class226.field4239;
			class157.field3017 = 2;
			class45.field796 = 0;
			class146.field2747.method30(107);
			class146.field2747.method314(class190.field3679 + var2);
			class146.field2747.method314(var6);
			class146.field2747.method344(var1 + class223.field4212);
		}
		if (var3 == 12) {
			class47.method363();
			class174 var22 = class239.method1579(var2);
			class28.field475 = 1;
			class58.field1105 = var1;
			class209.field3965 = var2;
			class48.field905 = var6;
			class200.method1371(var22);
			class78.field1414 = class166.method1140(new class88[] { class136.field2529, class71.method472(var6).field2892, class88.field1637 });
			if (class78.field1414 == null) {
				class78.field1414 = class180.field3572;
			}
			return;
		}
		if (var3 == 23) {
			class44 var23 = class244.field4491[var6];
			if (var23 != null) {
				class207.method1421(1, 0, var23.field4141[0], var23.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class146.field2747.method30(6);
				class146.field2747.method344(var6);
				class146.field2747.method331(client.field569);
				class146.field2747.method326(class16.field249);
			}
		}
		if (var3 == 6) {
			class146.field2747.method30(150);
			class146.field2747.method316(var2);
			class146.field2747.method344(var1);
			class146.field2747.method305(var6);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 10) {
			class50.method374(class149.field2907, var1, var2);
		}
		if (var3 == 1004) {
			class101.method705(var2, var4, var1);
			class146.field2747.method30(97);
			class146.field2747.method344(var2 + class190.field3679);
			class146.field2747.method344((int) (var4 >>> 32) & Integer.MAX_VALUE);
			class146.field2747.method314(var1 + class223.field4212);
		}
		if (var3 == 43 || var3 == 1003) {
			class203.method1390(var6, class201.field3836[arg0], var1, var2);
		}
		if (var3 == 3) {
			boolean var24 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var24) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class155.field2997 = class172.field3339;
			class147.field2757 = class226.field4239;
			class157.field3017 = 2;
			class45.field796 = 0;
			class146.field2747.method30(138);
			class146.field2747.method331(var2 + class190.field3679);
			class146.field2747.method305(var6);
			class146.field2747.method331(class223.field4212 + var1);
		}
		if (var3 == 8) {
			class146.field2747.method30(205);
			class146.field2747.method314(var6);
			class146.field2747.method331(var1);
			class146.field2747.method316(var2);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 13) {
			class146.field2747.method30(26);
			class146.field2747.method305(var1);
			class146.field2747.method305(var6);
			class146.field2747.method338(var2);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 41) {
			boolean var26 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var26) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class155.field2997 = class172.field3339;
			class45.field796 = 0;
			class147.field2757 = class226.field4239;
			class157.field3017 = 2;
			class146.field2747.method30(77);
			class146.field2747.method344(var6);
			class146.field2747.method344(var2 + class190.field3679);
			class146.field2747.method305(var1 + class223.field4212);
		}
		if (var3 == 1002) {
			class147.field2757 = class226.field4239;
			class45.field796 = 0;
			class155.field2997 = class172.field3339;
			class157.field3017 = 2;
			class191 var28 = class225.field4223[var6];
			if (var28 != null) {
				class126 var29 = var28.field3682;
				if (var29.field2327 != null) {
					var29 = var29.method862();
				}
				if (var29 != null) {
					class146.field2747.method30(127);
					class146.field2747.method314(var29.field2314);
				}
			}
		}
		if (var3 == 49) {
			class146.field2747.method30(32);
			class146.field2747.method344(var6);
			class146.field2747.method338(var2);
			class146.field2747.method344(var1);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 26 && class101.method705(var2, var4, var1)) {
			class146.field2747.method30(170);
			class146.field2747.method331(class190.field3679 + var2);
			class146.field2747.method338(class209.field3965);
			class146.field2747.method344(var1 + class223.field4212);
			class146.field2747.method314(class58.field1105);
			class146.field2747.method331(Integer.MAX_VALUE & (int) (var4 >>> 32));
			class146.field2747.method344(class48.field905);
		}
		if (var3 == 45) {
			class44 var30 = class244.field4491[var6];
			if (var30 != null) {
				class207.method1421(1, 0, var30.field4141[0], var30.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class157.field3017 = 2;
				class146.field2747.method30(214);
				class146.field2747.method331(var6);
			}
		}
		if (var3 == 25) {
			boolean var31 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var31) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class157.field3017 = 2;
			class155.field2997 = class172.field3339;
			class147.field2757 = class226.field4239;
			class45.field796 = 0;
			class146.field2747.method30(84);
			class146.field2747.method305(var1 + class223.field4212);
			class146.field2747.method305(var6);
			class146.field2747.method314(var2 + class190.field3679);
			class146.field2747.method351(class16.field249);
			class146.field2747.method314(client.field569);
		}
		if (var3 == 22) {
			boolean var33 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var33) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class157.field3017 = 2;
			class155.field2997 = class172.field3339;
			class147.field2757 = class226.field4239;
			class45.field796 = 0;
			class146.field2747.method30(39);
			class146.field2747.method314(var1 + class223.field4212);
			class146.field2747.method331(var6);
			class146.field2747.method344(class190.field3679 + var2);
		}
		if (var3 == 38) {
			class191 var35 = class225.field4223[var6];
			if (var35 != null) {
				class207.method1421(1, 0, var35.field4141[0], var35.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class157.field3017 = 2;
				class45.field796 = 0;
				class146.field2747.method30(33);
				class146.field2747.method314(var6);
			}
		}
		if (var3 == 24 && class101.method705(var2, var4, var1)) {
			class146.field2747.method30(234);
			class146.field2747.method314(Integer.MAX_VALUE & (int) (var4 >>> 32));
			class146.field2747.method314(client.field569);
			class146.field2747.method316(class16.field249);
			class146.field2747.method314(var1 + class223.field4212);
			class146.field2747.method305(class190.field3679 + var2);
		}
		if (var3 == 28) {
			class146.field2747.method30(154);
			class146.field2747.method338(var2);
			class146.field2747.method344(var6);
			class146.field2747.method344(var1);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 20) {
			class146.field2747.method30(109);
			class146.field2747.method338(var2);
			class174 var36 = class239.method1579(var2);
			if (var36.field3392 != null && var36.field3392[0][0] == 5) {
				int var37 = var36.field3392[0][1];
				if (var36.field3486[0] != class113.field2050[var37]) {
					class113.field2050[var37] = var36.field3486[0];
					class158.method1068(var37);
				}
			}
		}
		if (var3 == 18) {
			class146.field2747.method30(251);
			class146.field2747.method305(var1);
			class146.field2747.method331(var6);
			class146.field2747.method338(var2);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 47 && class53.field967 == null) {
			class203.method1391(var1, var2);
			class53.field967 = class36.method238(var1, var2);
			class200.method1371(class53.field967);
		}
		if (var3 == 32) {
			class191 var38 = class225.field4223[var6];
			if (var38 != null) {
				class207.method1421(1, 0, var38.field4141[0], var38.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class147.field2757 = class226.field4239;
				class157.field3017 = 2;
				class45.field796 = 0;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(195);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 33) {
			class101.method705(var2, var4, var1);
			class146.field2747.method30(169);
			class146.field2747.method305(var2 + class190.field3679);
			class146.field2747.method314(Integer.MAX_VALUE & (int) (var4 >>> 32));
			class146.field2747.method344(class223.field4212 + var1);
		}
		if (var3 == 11) {
			class174 var39 = class239.method1579(var2);
			boolean var40 = true;
			if (var39.field3439 > 0) {
				var40 = class53.method389(var39);
			}
			if (var40) {
				class146.field2747.method30(109);
				class146.field2747.method338(var2);
			}
		}
		if (var3 == 9) {
			class146.field2747.method30(55);
			class146.field2747.method314(var1);
			class146.field2747.method351(var2);
			class146.field2747.method331(var6);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 5) {
			boolean var41 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var41) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class45.field796 = 0;
			class157.field3017 = 2;
			class147.field2757 = class226.field4239;
			class155.field2997 = class172.field3339;
			class146.field2747.method30(211);
			class146.field2747.method344(class223.field4212 + var1);
			class146.field2747.method314(var2 + class190.field3679);
			class146.field2747.method344(var6);
		}
		if (var3 == 42) {
			class146.field2747.method30(4);
			class146.field2747.method305(class48.field905);
			class146.field2747.method331(var6);
			class146.field2747.method331(class58.field1105);
			class146.field2747.method326(var2);
			class146.field2747.method331(var1);
			class146.field2747.method338(class209.field3965);
			class139.field2573 = 0;
			class57.field1091 = class239.method1579(var2);
			class93.field1742 = var1;
		}
		if (var3 == 37) {
			class44 var43 = class244.field4491[var6];
			if (var43 != null) {
				class207.method1421(1, 0, var43.field4141[0], var43.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class157.field3017 = 2;
				class146.field2747.method30(114);
				class146.field2747.method305(var6);
			}
		}
		if (var3 == 16) {
			class44 var44 = class244.field4491[var6];
			if (var44 != null) {
				class207.method1421(1, 0, var44.field4141[0], var44.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class155.field2997 = class172.field3339;
				class157.field3017 = 2;
				class146.field2747.method30(161);
				class146.field2747.method331(var6);
			}
		}
		if (var3 == 1005) {
			class157.field3017 = 2;
			class155.field2997 = class172.field3339;
			class45.field796 = 0;
			class147.field2757 = class226.field4239;
			class146.field2747.method30(166);
			class146.field2747.method331(var6);
		}
		if (var3 == 50) {
			class44 var45 = class244.field4491[var6];
			if (var45 != null) {
				class207.method1421(1, 0, var45.field4141[0], var45.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class157.field3017 = 2;
				class45.field796 = 0;
				class155.field2997 = class172.field3339;
				class147.field2757 = class226.field4239;
				class146.field2747.method30(204);
				class146.field2747.method344(var6);
			}
		}
		if (var3 == 19) {
			class191 var46 = class225.field4223[var6];
			if (var46 != null) {
				class207.method1421(1, 0, var46.field4141[0], var46.field4087[0], class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
				class45.field796 = 0;
				class147.field2757 = class226.field4239;
				class157.field3017 = 2;
				class155.field2997 = class172.field3339;
				class146.field2747.method30(145);
				class146.field2747.method351(class16.field249);
				class146.field2747.method314(var6);
				class146.field2747.method305(client.field569);
			}
		}
		if (var3 == 46) {
			boolean var47 = class207.method1421(0, 0, var2, var1, class240.field4456.field4087[0], 0, 0, 2, false, 0, class240.field4456.field4141[0]);
			if (!var47) {
				class207.method1421(1, 0, var2, var1, class240.field4456.field4087[0], 1, 0, 2, false, 0, class240.field4456.field4141[0]);
			}
			class157.field3017 = 2;
			class45.field796 = 0;
			class155.field2997 = class172.field3339;
			class147.field2757 = class226.field4239;
			class146.field2747.method30(176);
			class146.field2747.method314(class190.field3679 + var2);
			class146.field2747.method316(class209.field3965);
			class146.field2747.method314(class58.field1105);
			class146.field2747.method344(class223.field4212 + var1);
			class146.field2747.method344(class48.field905);
			class146.field2747.method314(var6);
		}
		if (class28.field475 != 0) {
			class28.field475 = 0;
			class200.method1371(class239.method1579(class209.field3965));
		}
		if (class10.field145) {
			class47.method363();
		}
		if (class57.field1091 != null && class139.field2573 == 0) {
			class200.method1371(class57.field1091);
		}
	}
}
