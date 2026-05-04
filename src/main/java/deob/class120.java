package deob;

import java.awt.Component;
import java.util.Random;

@ObfuscatedName("l")
public final class class120 extends class23 {

	@ObfuscatedName("l.bb")
	public static final class88 field2194 = class208.method1423(105, "::");

	@ObfuscatedName("l.cb")
	public static int field2195 = -1;

	@ObfuscatedName("l.eb")
	public int field2197 = 2048;

	@ObfuscatedName("l.gb")
	public static final class88 field2199 = class208.method1423(105, "<)4col>");

	@ObfuscatedName("l.hb")
	public int field2200 = 0;

	@ObfuscatedName("l.jb")
	public int field2202 = 5;

	@ObfuscatedName("l.kb")
	public static final int[] field2203 = new int[4096];

	@ObfuscatedName("l.lb")
	public int field2204 = 1;

	@ObfuscatedName("l.T")
	public static int field2186 = 0;

	@ObfuscatedName("l.Z")
	public static short[] field2192 = new short[256];

	@ObfuscatedName("l.Q")
	public int field2183 = 5;

	@ObfuscatedName("l.U")
	public int field2187 = 2;

	@ObfuscatedName("l.W")
	public byte[] field2189 = new byte[512];

	@ObfuscatedName("l.V")
	public short[] field2188 = new short[512];

	@ObfuscatedName("l.a(Ljava/awt/Component;I)V")
	public static void method819(Component arg0) {
		arg0.removeKeyListener(class166.field3188);
		arg0.removeFocusListener(class166.field3188);
		class32.field524 = -1;
	}

	@ObfuscatedName("l.a(IIIIBI)V")
	public static void method820(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 == class140.field2595 && class110.field2014 == arg3 && (arg0 == class157.field3026 || !class245.field4497)) {
			return;
		}
		class157.field3026 = arg0;
		if (!class245.field4497) {
			class157.field3026 = 0;
		}
		class110.field2014 = arg3;
		class140.field2595 = arg2;
		class131.method881(25);
		client.method221(class242.field4478, true);
		int var5 = class223.field4212;
		int var6 = class190.field3679;
		class190.field3679 = arg3 * 8 - 48;
		int var7 = class190.field3679 - var6;
		class223.field4212 = (arg2 - 6) * 8;
		int var8 = class223.field4212 - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			class191 var10 = class225.field4223[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.field4087[var11] -= var8;
					var10.field4141[var11] -= var7;
				}
				var10.field4121 -= var7 * 128;
				var10.field4136 -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			class44 var13 = class244.field4491[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.field4087[var14] -= var8;
					var13.field4141[var14] -= var7;
				}
				var13.field4136 -= var8 * 128;
				var13.field4121 -= var7 * 128;
			}
		}
		class149.field2907 = arg0;
		byte var15 = 0;
		byte var16 = 104;
		class240.field4456.method1474(false, arg4, arg1);
		byte var17 = 0;
		byte var18 = 1;
		if (var8 < 0) {
			var16 = -1;
			var18 = -1;
			var15 = 103;
		}
		byte var19 = 1;
		byte var20 = 104;
		if (var7 < 0) {
			var20 = -1;
			var19 = -1;
			var17 = 103;
		}
		for (int var21 = var15; var21 != var16; var21 += var18) {
			for (int var22 = var17; var22 != var20; var22 += var19) {
				int var23 = var8 + var21;
				int var24 = var22 + var7;
				for (int var25 = 0; var25 < 4; var25++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
						class134.field2497[var25][var21][var22] = class134.field2497[var25][var23][var24];
					} else {
						class134.field2497[var25][var21][var22] = null;
					}
				}
			}
		}
		for (class159 var26 = (class159) class62.field1140.method1610(); var26 != null; var26 = (class159) class62.field1140.method1619()) {
			var26.field3059 -= var8;
			var26.field3052 -= var7;
			if (var26.field3059 < 0 || var26.field3052 < 0 || var26.field3059 >= 104 || var26.field3052 >= 104) {
				var26.method460();
			}
		}
		if (class116.field2102 != 0) {
			class116.field2102 -= var8;
			class140.field2594 -= var7;
		}
		class172.field3336 = -1;
		class179.field3567 = false;
		class174.field3445 = 0;
		class42.field714.method1616();
		class167.field3220.method1616();
	}

	@ObfuscatedName("l.a(Li;I)I")
	public static int method823(class88 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < class146.field2729; var1++) {
			if (arg0.method624(class23.field370[var1])) {
				return var1;
			}
		}
		return -1;
	}

	public class120() {
		super(0, true);
	}

	@ObfuscatedName("l.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2202 = this.field2183 = arg0.method347();
		} else if (arg1 == 1) {
			this.field2200 = arg0.method347();
		} else if (arg1 == 2) {
			this.field2197 = arg0.method301();
		} else if (arg1 == 3) {
			this.field2187 = arg0.method347();
		} else if (arg1 == 4) {
			this.field2204 = arg0.method347();
		} else if (arg1 == 5) {
			this.field2202 = arg0.method347();
		} else if (arg1 == 6) {
			this.field2183 = arg0.method347();
		}
	}

	@ObfuscatedName("l.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0] * this.field2183 + 2048;
			int var4 = var3 >> 12;
			int var5 = var4 + 1;
			for (int var6 = 0; var6 < class70.field1276; var6++) {
				class80.field1452 = Integer.MAX_VALUE;
				class102.field1850 = Integer.MAX_VALUE;
				class199.field3809 = Integer.MAX_VALUE;
				class132.field2472 = Integer.MAX_VALUE;
				int var7 = class22.field351[var6] * this.field2202 + 2048;
				int var8 = var7 >> 12;
				int var9 = var8 + 1;
				for (int var10 = var4 - 1; var10 <= var5; var10++) {
					int var11 = this.field2189[(var10 < this.field2183 ? var10 : var10 - this.field2183) & 0xFF] & 0xFF;
					for (int var12 = var8 - 1; var12 <= var9; var12++) {
						int var13 = (this.field2189[var11 + (this.field2202 <= var12 ? var12 - this.field2202 : var12) & 0xFF] & 0xFF) * 2;
						int var26 = var13 + 1;
						int var14 = var7 - this.field2188[var13] - (var12 << 12);
						int var15 = var3 - (var10 << 12) - this.field2188[var26];
						int var16 = this.field2204;
						int var17;
						if (var16 == 1) {
							var17 = var14 * var14 + var15 * var15 >> 12;
						} else if (var16 == 3) {
							int var18 = var15 >= 0 ? var15 : -var15;
							int var19 = var14 < 0 ? -var14 : var14;
							var17 = var19 <= var18 ? var18 : var19;
						} else if (var16 == 4) {
							int var20 = (int) (Math.sqrt((double) ((float) (var14 >= 0 ? var14 : -var14) / 4096.0F)) * 4096.0D);
							int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
							int var22 = var21 + var20;
							var17 = var22 * var22 >> 12;
						} else if (var16 == 5) {
							int var23 = var14 * var14;
							int var24 = var15 * var15;
							var17 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var23 + var24) / 1.6777216E7F))) * 4096.0D);
						} else if (var16 == 2) {
							var17 = (var15 >= 0 ? var15 : -var15) + (var14 < 0 ? -var14 : var14);
						} else {
							var17 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var14 * var14) / 1.6777216E7F)) * 4096.0D);
						}
						if (class132.field2472 > var17) {
							class80.field1452 = class102.field1850;
							class102.field1850 = class199.field3809;
							class199.field3809 = class132.field2472;
							class132.field2472 = var17;
						} else if (var17 < class199.field3809) {
							class80.field1452 = class102.field1850;
							class102.field1850 = class199.field3809;
							class199.field3809 = var17;
						} else if (var17 < class102.field1850) {
							class80.field1452 = class102.field1850;
							class102.field1850 = var17;
						} else if (var17 < class80.field1452) {
							class80.field1452 = var17;
						}
					}
				}
				int var25 = this.field2187;
				if (var25 == 0) {
					var2[var6] = class132.field2472;
				} else if (var25 == 1) {
					var2[var6] = class199.field3809;
				} else if (var25 == 3) {
					var2[var6] = class102.field1850;
				} else if (var25 == 4) {
					var2[var6] = class80.field1452;
				} else if (var25 == 2) {
					var2[var6] = class199.field3809 - class132.field2472;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("l.b(B)V")
	@Override
	public void method123() {
		this.field2189 = class159.method1072(this.field2200);
		this.method821();
	}

	@ObfuscatedName("l.e(I)V")
	public void method821() {
		Random var1 = new Random((long) this.field2200);
		this.field2188 = new short[512];
		if (this.field2197 > 0) {
			for (int var2 = 0; var2 < 512; var2++) {
				this.field2188[var2] = (short) class119.method812(this.field2197, var1);
			}
		}
	}
}
