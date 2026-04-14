package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.io.PacketBit;
import jagex3.util.JagString;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionChecker {
	@ObfuscatedName("re.h")
	public static LinkList field2694 = new LinkList();

	@ObfuscatedName("ie.a(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method530(String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@ObfuscatedName("h.a(Llc;BLba;I)V")
	public static void method460(SignLink arg0, Packet arg1, int arg2) {
		ReflectionCheck var3 = new ReflectionCheck();
		var3.field2964 = arg1.g1();
		var3.field2970 = arg1.method167();
		var3.field2958 = new int[var3.field2964];
		var3.field2961 = new PrivilegedRequest[var3.field2964];
		var3.field2969 = new int[var3.field2964];
		var3.field2963 = new byte[var3.field2964][][];
		var3.field2960 = new PrivilegedRequest[var3.field2964];
		var3.field2959 = new int[var3.field2964];
		for (int var4 = 0; var4 < var3.field2964; var4++) {
			try {
				int var5 = arg1.g1();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					int var16 = 0;
					String var17 = new String(arg1.method140().method31());
					String var18 = new String(arg1.method140().method31());
					if (var5 == 1) {
						var16 = arg1.method167();
					}
					var3.field2958[var4] = var5;
					var3.field2969[var4] = var16;
					var3.field2961[var4] = arg0.method654(method530(var17), var18);
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg1.method140().method31());
					String var7 = new String(arg1.method140().method31());
					int var8 = arg1.g1();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg1.method140().method31());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg1.method167();
							var11[var12] = new byte[var13];
							arg1.method173(var11[var12], var13);
						}
					}
					var3.field2958[var4] = var5;
					Class[] var14 = new Class[var8];
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = method530(var9[var15]);
					}
					var3.field2960[var4] = arg0.method648(var14, var7, method530(var6));
					var3.field2963[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field2959[var4] = -1;
			} catch (SecurityException var20) {
				var3.field2959[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field2959[var4] = -3;
			} catch (Exception var22) {
				var3.field2959[var4] = -4;
			} catch (Throwable var23) {
				var3.field2959[var4] = -5;
			}
		}
		field2694.push(var3);
	}

	@ObfuscatedName("hd.a(IILfe;)V")
	public static void method479(PacketBit arg0) {
		while (true) {
			ReflectionCheck var1 = (ReflectionCheck) field2694.head();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field2964; var3++) {
				if (var1.field2961[var3] != null) {
					if (var1.field2961[var3].status == 2) {
						var1.field2959[var3] = -5;
					}
					if (var1.field2961[var3].status == 0) {
						var2 = true;
					}
				}
				if (var1.field2960[var3] != null) {
					if (var1.field2960[var3].status == 2) {
						var1.field2959[var3] = -6;
					}
					if (var1.field2960[var3].status == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.method415(205);
			arg0.p1(0);
			int var4 = arg0.pos;
			arg0.p4(var1.field2970);
			for (int var5 = 0; var5 < var1.field2964; var5++) {
				if (var1.field2959[var5] == 0) {
					try {
						int var6 = var1.field2958[var5];
						if (var6 == 0) {
							Field var7 = (Field) var1.field2961[var5].result;
							int var8 = var7.getInt(null);
							arg0.p1(0);
							arg0.p4(var8);
						} else if (var6 == 1) {
							Field var9 = (Field) var1.field2961[var5].result;
							var9.setInt(null, var1.field2969[var5]);
							arg0.p1(0);
						} else if (var6 == 2) {
							Field var10 = (Field) var1.field2961[var5].result;
							int var11 = var10.getModifiers();
							arg0.p1(0);
							arg0.p4(var11);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field2960[var5].result;
							byte[][] var15 = var1.field2963[var5];
							Object[] var16 = new Object[var15.length];
							for (int var17 = 0; var17 < var15.length; var17++) {
								ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
								var16[var17] = var18.readObject();
							}
							Object var19 = var14.invoke(null, var16);
							if (var19 == null) {
								arg0.p1(0);
							} else if (var19 instanceof Number) {
								arg0.p1(1);
								arg0.p8(((Number) var19).longValue());
							} else if (var19 instanceof JagString) {
								arg0.p1(2);
								arg0.pjstr((JagString) var19);
							} else {
								arg0.p1(4);
							}
						} else if (var6 == 4) {
							Method var12 = (Method) var1.field2960[var5].result;
							int var13 = var12.getModifiers();
							arg0.p1(0);
							arg0.p4(var13);
						}
					} catch (ClassNotFoundException var20) {
						arg0.p1(-10);
					} catch (InvalidClassException var21) {
						arg0.p1(-11);
					} catch (StreamCorruptedException var22) {
						arg0.p1(-12);
					} catch (OptionalDataException var23) {
						arg0.p1(-13);
					} catch (IllegalAccessException var24) {
						arg0.p1(-14);
					} catch (IllegalArgumentException var25) {
						arg0.p1(-15);
					} catch (InvocationTargetException var26) {
						arg0.p1(-16);
					} catch (SecurityException var27) {
						arg0.p1(-17);
					} catch (IOException var28) {
						arg0.p1(-18);
					} catch (NullPointerException var29) {
						arg0.p1(-19);
					} catch (Exception var30) {
						arg0.p1(-20);
					} catch (Throwable var31) {
						arg0.p1(-21);
					}
				} else {
					arg0.p1(var1.field2959[var5]);
				}
			}
			arg0.method149(var4);
			arg0.method155(arg0.pos - var4);
			var1.unlink();
		}
	}

	@ObfuscatedName("hb.d(I)V")
	public static void method469() {
		field2694 = new LinkList();
	}
}
