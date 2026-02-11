package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.applet.PrivilegedRequest;
import jagex3.client.applet.SignLink;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.io.PacketBit;
import jagex3.util.JagString;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionChecker {
	@ObfuscatedName("qa.o")
	public static LinkList field2627 = new LinkList();

	@ObfuscatedName("o.a(BILge;)V")
	public static void performCheck(PacketBit arg0) {
		while (true) {
			ReflectionCheck var1 = (ReflectionCheck) field2627.head();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field535; var3++) {
				if (var1.field529[var3] != null) {
					if (var1.field529[var3].status == 2) {
						var1.field524[var3] = -5;
					}
					if (var1.field529[var3].status == 0) {
						var2 = true;
					}
				}
				if (var1.field534[var3] != null) {
					if (var1.field534[var3].status == 2) {
						var1.field524[var3] = -6;
					}
					if (var1.field534[var3].status == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			// REFLECTION_CHECK_REPLY
			arg0.p1Enc(183);
			arg0.p1(0);
			int var4 = arg0.pos;
			arg0.p4(var1.field518);
			for (int var5 = 0; var5 < var1.field535; var5++) {
				if (var1.field524[var5] == 0) {
					try {
						int var6 = var1.field532[var5];
						if (var6 == 0) {
							Field var10 = (Field) var1.field529[var5].result;
							int var11 = var10.getInt(null);
							arg0.p1(0);
							arg0.p4(var11);
						} else if (var6 == 1) {
							Field var9 = (Field) var1.field529[var5].result;
							var9.setInt(null, var1.field526[var5]);
							arg0.p1(0);
						} else if (var6 == 2) {
							Field var7 = (Field) var1.field529[var5].result;
							int var8 = var7.getModifiers();
							arg0.p1(0);
							arg0.p4(var8);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field534[var5].result;
							byte[][] var15 = var1.field533[var5];
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
							Method var12 = (Method) var1.field534[var5].result;
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
					arg0.p1(var1.field524[var5]);
				}
			}
			arg0.addcrc(var4);
			arg0.psize1(arg0.pos - var4);
			var1.unlink();
		}
	}

	@ObfuscatedName("q.a(ILjd;ILdc;)V")
	public static void addCheck(int arg0, Packet arg1, SignLink arg2) {
		ReflectionCheck var3 = new ReflectionCheck();
		var3.field535 = arg1.g1();
		var3.field518 = arg1.g4();
		var3.field534 = new PrivilegedRequest[var3.field535];
		var3.field524 = new int[var3.field535];
		var3.field533 = new byte[var3.field535][][];
		var3.field526 = new int[var3.field535];
		var3.field532 = new int[var3.field535];
		var3.field529 = new PrivilegedRequest[var3.field535];
		for (int var4 = 0; var4 < var3.field535; var4++) {
			try {
				int var5 = arg1.g1();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					String var16 = new String(arg1.gjstr().method255());
					String var17 = new String(arg1.gjstr().method255());
					int var18 = 0;
					if (var5 == 1) {
						var18 = arg1.g4();
					}
					var3.field532[var4] = var5;
					var3.field526[var4] = var18;
					var3.field529[var4] = arg2.getDeclaredField(findClass(var16), var17);
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg1.gjstr().method255());
					String var7 = new String(arg1.gjstr().method255());
					int var8 = arg1.g1();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg1.gjstr().method255());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg1.g4();
							var11[var12] = new byte[var13];
							arg1.gdata(var13, var11[var12]);
						}
					}
					Class[] var14 = new Class[var8];
					var3.field532[var4] = var5;
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = findClass(var9[var15]);
					}
					var3.field534[var4] = arg2.getDeclaredMethod(var14, var7, findClass(var6));
					var3.field533[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field524[var4] = -1;
			} catch (SecurityException var20) {
				var3.field524[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field524[var4] = -3;
			} catch (Exception var22) {
				var3.field524[var4] = -4;
			} catch (Throwable var23) {
				var3.field524[var4] = -5;
			}
		}
		field2627.push(var3);
	}

	@ObfuscatedName("gb.a(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class findClass(String arg0) throws ClassNotFoundException {
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

	@ObfuscatedName("m.a(I)V")
	public static void method650() {
		field2627 = new LinkList();
	}
}
