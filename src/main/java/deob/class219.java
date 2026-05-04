package deob;

@ObfuscatedName("ua")
public class class219 extends class27 {

	@ObfuscatedName("ua.l")
	public static final int[] field4142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ua.m")
	public static class42 field4143;

	@ObfuscatedName("ua.p")
	public static int field4146 = 0;

	@ObfuscatedName("ua.r")
	public static int field4148;

	@ObfuscatedName("ua.a(I)V")
	public static void method1479() {
		if (class114.field2056 != null) {
			class114.field2056.method406();
		}
		if (class27.field458 != null) {
			class27.field458.method406();
		}
	}

	@ObfuscatedName("ua.a(ZIII)Li;")
	public static class88 method1481(boolean arg0, int arg1) {
		int var2 = 1;
		int var3 = arg1 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg1 < 0 || arg0) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg1 < 0) {
			var5[0] = 45;
		} else if (arg0) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg1 % 10;
			arg1 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		class88 var8 = new class88();
		var8.field1660 = var4;
		var8.field1643 = var5;
		return var8;
	}

	@ObfuscatedName("ua.a(ZIIIIIIIBI[I)V")
	public static void method1482(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		if (class72.field1334 > arg4) {
			arg1 -= class72.field1334 - arg4;
			arg4 = class72.field1334;
		}
		if (class72.field1335 < arg1 + arg4) {
			arg1 = class72.field1335 - arg4;
		}
		if (class72.field1332 > arg7) {
			arg8 -= class72.field1332 - arg7;
			arg7 = class72.field1332;
		}
		int var10 = arg4 * class72.field1333 + arg7;
		if (arg6 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 8;
		}
		if (class72.field1336 < arg8 + arg7) {
			arg8 = class72.field1336 - arg7;
		}
		int var11 = class72.field1333 - arg8;
		if (arg6 == 1) {
			if (arg3 == 0) {
				for (int var12 = 0; var12 < arg1; var12++) {
					for (int var13 = 0; var13 < arg8; var13++) {
						if (var13 <= var12) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var14 = arg1 - 1; var14 >= 0; var14--) {
					for (int var15 = 0; var15 < arg8; var15++) {
						if (var14 >= var15) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var16 = 0; var16 < arg1; var16++) {
					for (int var17 = 0; var17 < arg8; var17++) {
						if (var16 <= var17) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var18 = arg1 - 1; var18 >= 0; var18--) {
					for (int var19 = 0; var19 < arg8; var19++) {
						if (var18 <= var19) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 2) {
			if (arg3 == 0) {
				for (int var20 = arg1 - 1; var20 >= 0; var20--) {
					for (int var21 = 0; var21 < arg8; var21++) {
						if (var21 <= var20 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var22 = 0; var22 < arg1; var22++) {
					for (int var23 = 0; var23 < arg8; var23++) {
						if (var23 >= var22 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var24 = 0; var24 < arg1; var24++) {
					for (int var25 = arg8 - 1; var25 >= 0; var25--) {
						if (var24 >> 1 >= var25) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var26 = arg1 - 1; var26 >= 0; var26--) {
					for (int var27 = arg8 - 1; var27 >= 0; var27--) {
						if (var27 >= var26 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 3) {
			if (arg3 == 0) {
				for (int var28 = arg1 - 1; var28 >= 0; var28--) {
					for (int var29 = arg8 - 1; var29 >= 0; var29--) {
						if (var29 <= var28 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var30 = arg1 - 1; var30 >= 0; var30--) {
					for (int var31 = 0; var31 < arg8; var31++) {
						if (var30 << 1 <= var31) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var32 = 0; var32 < arg1; var32++) {
					for (int var33 = 0; var33 < arg8; var33++) {
						if (var33 <= var32 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var34 = 0; var34 < arg1; var34++) {
					for (int var35 = arg8 - 1; var35 >= 0; var35--) {
						if (var34 << 1 <= var35) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 4) {
			if (arg3 == 0) {
				for (int var36 = arg1 - 1; var36 >= 0; var36--) {
					for (int var37 = 0; var37 < arg8; var37++) {
						if (var36 >> 1 <= var37) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var38 = 0; var38 < arg1; var38++) {
					for (int var39 = 0; var39 < arg8; var39++) {
						if (var38 << 1 >= var39) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var40 = 0; var40 < arg1; var40++) {
					for (int var41 = arg8 - 1; var41 >= 0; var41--) {
						if (var40 >> 1 <= var41) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var42 = arg1 - 1; var42 >= 0; var42--) {
					for (int var43 = arg8 - 1; var43 >= 0; var43--) {
						if (var43 <= var42 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg3 == 0) {
					for (int var52 = 0; var52 < arg1; var52++) {
						for (int var53 = 0; var53 < arg8; var53++) {
							if (var53 <= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var54 = 0; var54 < arg1; var54++) {
						for (int var55 = 0; var55 < arg8; var55++) {
							if (var54 <= arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var56 = 0; var56 < arg1; var56++) {
						for (int var57 = 0; var57 < arg8; var57++) {
							if (var57 >= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var58 = 0; var58 < arg1; var58++) {
						for (int var59 = 0; var59 < arg8; var59++) {
							if (arg1 / 2 <= var58) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg3 == 0) {
					for (int var60 = 0; var60 < arg1; var60++) {
						for (int var61 = 0; var61 < arg8; var61++) {
							if (var61 <= var60 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var62 = arg1 - 1; var62 >= 0; var62--) {
						for (int var63 = 0; var63 < arg8; var63++) {
							if (var62 - arg1 / 2 >= var63) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var64 = arg1 - 1; var64 >= 0; var64--) {
						for (int var65 = arg8 - 1; var65 >= 0; var65--) {
							if (var64 - arg1 / 2 >= var65) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var66 = 0; var66 < arg1; var66++) {
						for (int var67 = arg8 - 1; var67 >= 0; var67--) {
							if (var67 <= var66 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg3 == 0) {
					for (int var68 = 0; var68 < arg1; var68++) {
						for (int var69 = 0; var69 < arg8; var69++) {
							if (var68 - arg1 / 2 <= var69) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var70 = arg1 - 1; var70 >= 0; var70--) {
						for (int var71 = 0; var71 < arg8; var71++) {
							if (var70 - arg1 / 2 <= var71) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var72 = arg1 - 1; var72 >= 0; var72--) {
						for (int var73 = arg8 - 1; var73 >= 0; var73--) {
							if (var72 - arg1 / 2 <= var73) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var74 = 0; var74 < arg1; var74++) {
						for (int var75 = arg8 - 1; var75 >= 0; var75--) {
							if (var74 - arg1 / 2 <= var75) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (int var44 = arg1 - 1; var44 >= 0; var44--) {
				for (int var45 = arg8 - 1; var45 >= 0; var45--) {
					if (var45 >= var44 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 1) {
			for (int var46 = arg1 - 1; var46 >= 0; var46--) {
				for (int var47 = 0; var47 < arg8; var47++) {
					if (var47 <= var46 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 2) {
			for (int var48 = 0; var48 < arg1; var48++) {
				for (int var49 = 0; var49 < arg8; var49++) {
					if (var49 >= var48 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 3) {
			for (int var50 = 0; var50 < arg1; var50++) {
				for (int var51 = arg8 - 1; var51 >= 0; var51--) {
					if (var51 <= var50 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		}
	}
}
