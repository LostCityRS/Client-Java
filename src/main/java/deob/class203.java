package deob;

@ObfuscatedName("sg")
public final class class203 extends class50 {

	@ObfuscatedName("sg.k")
	public static int field3858 = 0;

	@ObfuscatedName("sg.l")
	public static int field3859 = 0;

	@ObfuscatedName("sg.m")
	public static final class88 field3860 = class208.method1423(105, "Benutzeroberfl-=che geladen)3");

	@ObfuscatedName("sg.n")
	public static int field3861 = 0;

	@ObfuscatedName("sg.o")
	public static int field3862 = 0;

	@ObfuscatedName("sg.t")
	public static boolean field3867 = false;

	@ObfuscatedName("sg.v")
	public final int field3869;

	@ObfuscatedName("sg.w")
	public static class22 field3870;

	@ObfuscatedName("sg.B")
	public static final boolean[] field3875 = new boolean[8];

	@ObfuscatedName("sg.C")
	public static int field3876 = 0;

	@ObfuscatedName("sg.E")
	public final int field3878;

	@ObfuscatedName("sg.z")
	public final int field3873;

	@ObfuscatedName("sg.A")
	public final int field3874;

	@ObfuscatedName("sg.x")
	public static class174 field3871;

	@ObfuscatedName("sg.a(IIIII)Z")
	public static boolean method1389(int arg0, int arg1, int arg2, int arg3) {
		int var4 = arg3 * class168.field3242 + arg0 * class159.field3066 >> 16;
		int var5 = arg3 * class159.field3066 - arg0 * class168.field3242 >> 16;
		int var6 = arg1 * class99.field1803 + var5 * class201.field3838 >> 16;
		int var7 = arg1 * class201.field3838 - var5 * class99.field1803 >> 16;
		if (var6 < 1) {
			var6 = 1;
		}
		int var8 = (var4 << 9) / var6;
		int var9 = (var7 << 9) / var6;
		int var10 = arg2 * class99.field1803 + var5 * class201.field3838 >> 16;
		int var11 = arg2 * class201.field3838 - var5 * class99.field1803 >> 16;
		if (var10 < 1) {
			var10 = 1;
		}
		int var12 = (var4 << 9) / var10;
		int var13 = (var11 << 9) / var10;
		if (var6 < 50 && var10 < 50) {
			return false;
		} else if (var6 > 3500 && var10 > 3500) {
			return false;
		} else if (var8 < class147.field2766 && var12 < class147.field2766) {
			return false;
		} else if (var8 > class151.field2931 && var12 > class151.field2931) {
			return false;
		} else if (var9 < class58.field1102 && var13 < class58.field1102) {
			return false;
		} else {
			return var9 <= class217.field4055 || var13 <= class217.field4055;
		}
	}

	@ObfuscatedName("sg.a(ILi;III)V")
	public static void method1390(int arg0, class88 arg1, int arg2, int arg3) {
		class174 var4 = class36.method238(arg2, arg3);
		if (var4 == null) {
			return;
		}
		if (var4.field3401 != null) {
			class39 var5 = new class39();
			var5.field679 = arg0;
			var5.field678 = var4;
			var5.field681 = var4.field3401;
			var5.field677 = arg1;
			class200.method1373(var5);
		}
		boolean var6 = true;
		if (var4.field3439 > 0) {
			var6 = class53.method389(var4);
		}
		if (!var6 || !class105.method726(arg0 - 1, class80.method530(var4))) {
			return;
		}
		if (arg0 == 1) {
			class146.field2747.method30(44);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 2) {
			class146.field2747.method30(50);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 3) {
			class146.field2747.method30(103);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 4) {
			class146.field2747.method30(64);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 5) {
			class146.field2747.method30(178);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 6) {
			class146.field2747.method30(81);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 7) {
			class146.field2747.method30(236);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 8) {
			class146.field2747.method30(188);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 9) {
			class146.field2747.method30(128);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
		if (arg0 == 10) {
			class146.field2747.method30(254);
			class146.field2747.method338(arg3);
			class146.field2747.method305(arg2);
		}
	}

	@ObfuscatedName("sg.a(IZI)V")
	public static void method1391(int arg0, int arg1) {
		class146.field2747.method30(95);
		class146.field2747.method316(arg1);
		class146.field2747.method314(arg0);
	}

	@ObfuscatedName("sg.b(B)Lrc;")
	public static class188 method1393() {
		byte[] var0 = class116.field2104[0];
		int var1 = class102.field1851[0] * class67.field1218[0];
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = class27.field456[var0[var3] & 0xFF];
		}
		class169 var4 = new class169(class15.field229, class129.field2424, class247.field4528[0], class135.field2510[0], class102.field1851[0], class67.field1218[0], var2);
		class239.method1578();
		return var4;
	}

	@ObfuscatedName("sg.a(ILdj;II)V")
	public static void method1394(int arg0, class44 arg1, int arg2) {
		if ((arg0 & 0x4) != 0) {
			arg1.field4071 = class230.field4312.method298();
			if (arg1.field4071.method599(0) == 126) {
				arg1.field4071 = arg1.field4071.method635(1);
				class223.method1499(arg1.field4071, 2, arg1.field766);
			} else if (arg1 == class240.field4456) {
				class223.method1499(arg1.field4071, 2, arg1.field766);
			}
			arg1.field4138 = 0;
			arg1.field4083 = 0;
			arg1.field4112 = 150;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.field4113 = class230.field4312.method352();
			arg1.field4094 = class230.field4312.method295();
			arg1.field4100 = class230.field4312.method295();
			arg1.field4072 = class230.field4312.method319();
			arg1.field4133 = class230.field4312.method343() + class117.field2113;
			arg1.field4130 = class230.field4312.method343() + class117.field2113;
			arg1.field4139 = class230.field4312.method319();
			arg1.field4137 = 0;
			arg1.field4135 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.field4096 = class230.field4312.method349();
			arg1.field4099 = class230.field4312.method302();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.field4080 = class230.field4312.method301();
			int var3 = class230.field4312.method313();
			if (arg1.field4080 == 65535) {
				arg1.field4080 = -1;
			}
			arg1.field4125 = var3 >> 16;
			arg1.field4082 = (var3 & 0xFFFF) + class117.field2113;
			arg1.field4075 = 0;
			arg1.field4120 = 0;
			if (class117.field2113 < arg1.field4082) {
				arg1.field4075 = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			int var4 = class230.field4312.method301();
			if (var4 == 65535) {
				var4 = -1;
			}
			int var5 = class230.field4312.method347();
			class226.method1515(var4, var5, arg1);
		}
		if ((arg0 & 0x40) != 0) {
			int var6 = class230.field4312.method347();
			byte[] var7 = new byte[var6];
			class46 var8 = new class46(var7);
			class230.field4312.method307(var6, var7);
			class77.field1397[arg2] = var8;
			arg1.method285(var8);
		}
		if ((arg0 & 0x80) != 0) {
			int var9 = class230.field4312.method352();
			int var10 = class230.field4312.method347();
			arg1.method1477(class117.field2113, var10, var9);
			arg1.field4118 = class117.field2113 + 300;
			arg1.field4109 = class230.field4312.method295();
		}
		if ((arg0 & 0x100) != 0) {
			int var11 = class230.field4312.method352();
			int var12 = class230.field4312.method352();
			arg1.method1477(class117.field2113, var12, var11);
		}
		if ((arg0 & 0x1) != 0) {
			int var13 = class230.field4312.method349();
			boolean var14 = (var13 & 0x8000) != 0;
			int var15 = class230.field4312.method352();
			int var16 = class230.field4312.method347();
			int var17 = class230.field4312.field831;
			if (arg1.field766 != null && arg1.field768 != null) {
				long var18 = arg1.field766.method630();
				boolean var20 = false;
				if (var15 <= 1) {
					if (!var14 && (class238.field4428 == 1 || class176.field3535 == 1)) {
						var20 = true;
					} else {
						for (int var21 = 0; var21 < class67.field1221; var21++) {
							if (class95.field1764[var21] == var18) {
								var20 = true;
								break;
							}
						}
					}
				}
				if (!var20 && client.field563 == 0) {
					class54.field1006.field831 = 0;
					int var22 = -1;
					class230.field4312.method315(class54.field1006.field842, var16);
					class54.field1006.field831 = 0;
					class88 var23;
					if (var14) {
						class217 var24 = class92.method667(class54.field1006);
						var22 = var24.field4058;
						var13 &= 0x7FFF;
						var23 = var24.field4065.method1409(class54.field1006);
					} else {
						var23 = class26.method162(class21.method103(class54.field1006).method622());
					}
					arg1.field4071 = var23.method602();
					arg1.field4112 = 150;
					arg1.field4083 = var13 >> 8;
					arg1.field4138 = var13 & 0xFF;
					if (var15 == 2) {
						class118.method801(var23, var22, class166.method1140(new class88[] { class28.field472, arg1.field766 }), var14 ? 17 : 1, null);
					} else if (var15 == 1) {
						class118.method801(var23, var22, class166.method1140(new class88[] { class166.field3201, arg1.field766 }), var14 ? 17 : 1, null);
					} else {
						class118.method801(var23, var22, arg1.field766, var14 ? 17 : 2, null);
					}
				}
			}
			class230.field4312.field831 = var16 + var17;
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.field4114 = class230.field4312.method301();
		if (arg1.field4114 == 65535) {
			arg1.field4114 = -1;
			return;
		}
	}

	public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(-1, arg4, arg5);
		this.field3878 = arg0;
		this.field3869 = arg3;
		this.field3873 = arg2;
		this.field3874 = arg1;
	}

	@ObfuscatedName("sg.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
	}

	@ObfuscatedName("sg.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
	}

	@ObfuscatedName("sg.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = arg0 * this.field3878 >> 12;
		int var4 = arg0 * this.field3873 >> 12;
		int var5 = arg1 * this.field3874 >> 12;
		int var6 = this.field3869 * arg1 >> 12;
		class229.method1529(var3, var6, var4, var5, super.field927);
	}
}
