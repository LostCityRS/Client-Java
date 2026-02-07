package jagex3.callstack;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.applet.PrivilegedRequest;
import jagex3.client.applet.SignLink;
import jagex3.util.ThreadSleep;

import java.io.*;
import java.net.URL;

@ObfuscatedName("wf")
public final class JagException extends RuntimeException {

	@ObfuscatedName("mc.k")
	public static SignLink signlink;
	@ObfuscatedName("qf.J")
	public static int revision;
	@ObfuscatedName("wf.a")
	public String cause;

	@ObfuscatedName("wf.e")
	public final Throwable message;

	public JagException(Throwable arg0, String arg1) {
		this.message = arg0;
		this.cause = arg1;
	}

	@ObfuscatedName("pf.a(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void report(Throwable arg0, String arg1) {
		try {
			String var2 = "";
			if (arg0 != null) {
				var2 = method571(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg1;
			}
			System.out.println("Error: " + var2);
			String var3 = var2.replace(':', '.');
			String var4 = var3.replace('@', '_');
			String var5 = var4.replace('&', '_');
			String var6 = var5.replace('#', '_');
			if (signlink.applet != null) {
				PrivilegedRequest var7 = signlink.urlreq(new URL(signlink.applet.getCodeBase(), "clienterror.ws?c=" + revision + "&u=" + Client.field2259 + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + var6));
				while (var7.status == 0) {
					ThreadSleep.sleepPrecise(1L);
				}
				if (var7.status == 1) {
					DataInputStream var8 = (DataInputStream) var7.result;
					var8.read();
					var8.close();
				}
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("jf.a(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method571(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof JagException) {
			JagException var1 = (JagException) arg0;
			arg0 = var1.message;
			var2 = var1.cause + " | ";
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

	@ObfuscatedName("oa.a(Ljava/lang/Throwable;Ljava/lang/String;)Lwf;")
	public static JagException method765(Throwable arg0, String arg1) {
		JagException var2;
		if (arg0 instanceof JagException) {
			var2 = (JagException) arg0;
			var2.cause = var2.cause + ' ' + arg1;
		} else {
			var2 = new JagException(arg0, arg1);
		}
		return var2;
	}
}
