package deob;

import java.io.*;
import java.net.URL;

@ObfuscatedName("bb")
public final class JagException extends RuntimeException {

	@ObfuscatedName("ug.i")
	public static int revision;
	@ObfuscatedName("ae.gc")
	public static SignLink signlink;
	@ObfuscatedName("bb.d")
	public String field210;

	@ObfuscatedName("bb.i")
	public final Throwable field215;

	public JagException(Throwable arg0, String arg1) {
		this.field215 = arg0;
		this.field210 = arg1;
	}

	@ObfuscatedName("uc.a(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void report(String arg0, Throwable arg1) {
		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = method1256(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg0;
			}
			System.out.println("Error: " + var2);
			String var3 = var2.replace(':', '.');
			String var4 = var3.replace('@', '_');
			String var5 = var4.replace('&', '_');
			String var6 = var5.replace('#', '_');
			if (signlink.field3597 != null) {
				PrivilegedRequest var7 = signlink.method1293(new URL(signlink.field3597.getCodeBase(), "clienterror.ws?c=" + revision + "&u=" + client.field631 + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + var6));
				while (var7.status == 0) {
					ThreadUtil.sleepPrecise(1L);
				}
				if (var7.status == 1) {
					DataInputStream var8 = (DataInputStream) var7.field3129;
					var8.read();
					var8.close();
				}
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("qa.a(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1256(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof JagException) {
			JagException var1 = (JagException) arg0;
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

	@ObfuscatedName("oh.a(Ljava/lang/Throwable;Ljava/lang/String;)Lbb;")
	public static JagException method1076(Throwable arg0, String arg1) {
		JagException var2;
		if (arg0 instanceof JagException) {
			var2 = (JagException) arg0;
			var2.field210 = var2.field210 + ' ' + arg1;
		} else {
			var2 = new JagException(arg0, arg1);
		}
		return var2;
	}
}
