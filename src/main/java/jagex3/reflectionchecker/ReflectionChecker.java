package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.io.PacketBit;
import jagex3.jstring.JagString;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionChecker {
    @ObfuscatedName("ia.H")
    public static LinkList checks = new LinkList();

    @ObfuscatedName("va.a(Lqg;IILea;)V")
	public static void addCheck(SignLink arg0, int arg1, Packet arg2) {
		ReflectionCheck var3 = new ReflectionCheck();
		var3.size = arg2.g1();
		var3.id = arg2.g4();
		var3.fieldValue = new int[var3.size];
		var3.field = new PrivilegedRequest[var3.size];
		var3.type = new int[var3.size];
		var3.error = new int[var3.size];
		var3.methodArgs = new byte[var3.size][][];
		var3.method = new PrivilegedRequest[var3.size];
		for (int var4 = 0; var4 < var3.size; var4++) {
			try {
				int var5 = arg2.g1();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					String var16 = new String(arg2.gjstr().copy());
					String var17 = new String(arg2.gjstr().copy());
					int var18 = 0;
					if (var5 == 1) {
						var18 = arg2.g4();
					}
					var3.type[var4] = var5;
					var3.fieldValue[var4] = var18;
					var3.field[var4] = arg0.fieldreq(var17, ReflectionCheck.findClass(var16));
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg2.gjstr().copy());
					String var7 = new String(arg2.gjstr().copy());
					int var8 = arg2.g1();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg2.gjstr().copy());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg2.g4();
							var11[var12] = new byte[var13];
							arg2.gdata(var13, var11[var12]);
						}
					}
					var3.type[var4] = var5;
					Class[] var14 = new Class[var8];
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = ReflectionCheck.findClass(var9[var15]);
					}
					var3.method[var4] = arg0.methodreq(var7, ReflectionCheck.findClass(var6), var14);
					var3.methodArgs[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.error[var4] = -1;
			} catch (SecurityException var20) {
				var3.error[var4] = -2;
			} catch (NullPointerException var21) {
				var3.error[var4] = -3;
			} catch (Exception var22) {
				var3.error[var4] = -4;
			} catch (Throwable var23) {
				var3.error[var4] = -5;
			}
		}
		checks.push(var3);
	}

	@ObfuscatedName("bc.a(ZLae;I)V")
	public static void performCheck(PacketBit arg0) {
		while (true) {
			ReflectionCheck var1 = (ReflectionCheck) checks.head();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.size; var3++) {
				if (var1.field[var3] != null) {
					if (var1.field[var3].status == 2) {
						var1.error[var3] = -5;
					}
					if (var1.field[var3].status == 0) {
						var2 = true;
					}
				}
				if (var1.method[var3] != null) {
					if (var1.method[var3].status == 2) {
						var1.error[var3] = -6;
					}
					if (var1.method[var3].status == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.p1Enc(56);
			arg0.p1(0);
			int var4 = arg0.pos;
			arg0.p4(var1.id);
			for (int var5 = 0; var5 < var1.size; var5++) {
				if (var1.error[var5] == 0) {
					try {
						int var6 = var1.type[var5];
						if (var6 == 0) {
							Field var7 = (Field) var1.field[var5].result;
							int var8 = var7.getInt(null);
							arg0.p1(0);
							arg0.p4(var8);
						} else if (var6 == 1) {
							Field var11 = (Field) var1.field[var5].result;
							var11.setInt(null, var1.fieldValue[var5]);
							arg0.p1(0);
						} else if (var6 == 2) {
							Field var9 = (Field) var1.field[var5].result;
							int var10 = var9.getModifiers();
							arg0.p1(0);
							arg0.p4(var10);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.method[var5].result;
							byte[][] var15 = var1.methodArgs[var5];
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
							Method var12 = (Method) var1.method[var5].result;
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
					arg0.p1(var1.error[var5]);
				}
			}
			arg0.addcrc(var4);
			arg0.method341(arg0.pos - var4);
			var1.unlink();
		}
	}

	@ObfuscatedName("lh.c(B)V")
	public static void reset() {
		checks = new LinkList();
	}
}
