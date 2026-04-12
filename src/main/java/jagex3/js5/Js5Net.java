package jagex3.js5;

import deob.*;
import jagex3.io.BZip2State;
import jagex3.io.Packet;

import java.io.IOException;

public class Js5Net {
	@ObfuscatedName("id.a(B)Z")
	public static boolean loop() {
		long var0 = Statics.currentTime();
		int var2 = (int) (var0 - Statics.field2271);
		Statics.field2271 = var0;
		if (var2 > 200) {
			var2 = 200;
		}
		Statics.field1189 += var2;
		if (Statics.field2144 == 0 && class31.field845 == 0 && Statics.field1260 == 0 && Statics.field3285 == 0) {
			return true;
		} else if (Statics.field2769 == null) {
			return false;
		} else {
			try {
				if (Statics.field1189 > 30000) {
					throw new IOException();
				}
				while (class31.field845 < 20 && Statics.field3285 > 0) {
					class104 var3 = (class104) class103.field2596.method497();
					Packet var4 = new Packet(4);
					var4.method141(1);
					var4.method153((int) var3.field2073);
					Statics.field2769.method1016(4, var4.field284);
					class78.field1917.method498(var3, var3.field2073);
					Statics.field3285--;
					class31.field845++;
				}
				while (Statics.field2144 < 20 && Statics.field1260 > 0) {
					class104 var5 = (class104) Statics.field996.method608();
					Packet var6 = new Packet(4);
					var6.method141(0);
					var6.method153((int) var5.field2073);
					Statics.field2769.method1016(4, var6.field284);
					var5.method468();
					BZip2State.field1831.method498(var5, var5.field2073);
					Statics.field2144++;
					Statics.field1260--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = Statics.field2769.method1020();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					Statics.field1189 = 0;
					byte var9 = 0;
					if (Statics.field967 == null) {
						var9 = 8;
					} else if (class102.field2559 == 0) {
						var9 = 1;
					}
					if (var9 <= 0) {
						int var10 = Statics.field2613.field284.length - Statics.field967.field2619;
						int var11 = 512 - class102.field2559;
						if (var10 - Statics.field2613.pos < var11) {
							var11 = var10 - Statics.field2613.pos;
						}
						if (var11 > var8) {
							var11 = var8;
						}
						Statics.field2769.method1014(Statics.field2613.pos, var11, Statics.field2613.field284);
						if (class14.field476 != 0) {
							for (int var12 = 0; var12 < var11; var12++) {
								Statics.field2613.field284[Statics.field2613.pos + var12] ^= class14.field476;
							}
						}
						Statics.field2613.pos += var11;
						class102.field2559 += var11;
						if (Statics.field2613.pos == var10) {
							if (Statics.field967.field2073 == 16711935L) {
								Statics.field2415 = Statics.field2613;
								for (int var14 = 0; var14 < 256; var14++) {
									Js5Loader var15 = class50.field1350[var14];
									if (var15 != null) {
										Statics.field2415.pos = var14 * 4 + 5;
										int var16 = Statics.field2415.method167();
										var15.method980(var16);
									}
								}
							} else {
								class52.field1363.reset();
								class52.field1363.update(Statics.field2613.field284, 0, var10);
								int var13 = (int) class52.field1363.getValue();
								if (Statics.field967.field2624 != var13) {
									try {
										Statics.field2769.method1015();
									} catch (Exception var28) {
									}
									class14.field476 = (byte) (Math.random() * 255.0D + 1.0D);
									Statics.field2769 = null;
									BZip2State.field1803++;
									return false;
								}
								Statics.field525 = 0;
								BZip2State.field1803 = 0;
								Statics.field967.field2615.method976((Statics.field967.field2073 & 0xFF0000L) == 16711680L, (int) (Statics.field967.field2073 & 0xFFFFL), Statics.field3180, Statics.field2613.field284);
							}
							Statics.field967.method739();
							Statics.field967 = null;
							Statics.field2613 = null;
							class102.field2559 = 0;
							if (Statics.field3180) {
								class31.field845--;
							} else {
								Statics.field2144--;
							}
						} else {
							if (class102.field2559 != 512) {
								break;
							}
							class102.field2559 = 0;
						}
					} else {
						int var17 = var9 - Statics.field2301.pos;
						if (var17 > var8) {
							var17 = var8;
						}
						Statics.field2769.method1014(Statics.field2301.pos, var17, Statics.field2301.field284);
						if (class14.field476 != 0) {
							for (int var18 = 0; var18 < var17; var18++) {
								Statics.field2301.field284[Statics.field2301.pos + var18] ^= class14.field476;
							}
						}
						Statics.field2301.pos += var17;
						if (var9 > Statics.field2301.pos) {
							break;
						}
						if (Statics.field967 == null) {
							Statics.field2301.pos = 0;
							int var19 = Statics.field2301.method144();
							int var20 = Statics.field2301.method145();
							int var21 = Statics.field2301.method144();
							int var22 = Statics.field2301.method167();
							long var23 = (long) ((var19 << 16) + var20);
							class104 var25 = (class104) class78.field1917.method499(var23);
							Statics.field3180 = true;
							if (var25 == null) {
								var25 = (class104) BZip2State.field1831.method499(var23);
								Statics.field3180 = false;
							}
							if (var25 == null) {
								throw new IOException();
							}
							Statics.field967 = var25;
							int var26 = var21 == 0 ? 5 : 9;
							Statics.field2613 = new Packet(Statics.field967.field2619 + var26 + var22);
							Statics.field2613.method141(var21);
							Statics.field2613.method182(var22);
							class102.field2559 = 8;
							Statics.field2301.pos = 0;
						} else if (class102.field2559 == 0) {
							if (Statics.field2301.field284[0] == -1) {
								Statics.field2301.pos = 0;
								class102.field2559 = 1;
							} else {
								Statics.field967 = null;
							}
						}
					}
				}
				return true;
			} catch (IOException var29) {
				try {
					Statics.field2769.method1015();
				} catch (Exception var27) {
				}
				Statics.field525++;
				Statics.field2769 = null;
				return false;
			}
		}
	}
}
