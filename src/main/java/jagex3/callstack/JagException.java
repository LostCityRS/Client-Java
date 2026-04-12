package jagex3.callstack;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.GameShell;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("ha")
public final class JagException extends RuntimeException {

	@ObfuscatedName("nb.ld")
	public static SignLink signlink;
	@ObfuscatedName("ha.l")
	public final Throwable field1155;

	@ObfuscatedName("ha.m")
	public String field1156;

	public JagException(Throwable arg0, String arg1) {
		this.field1156 = arg1;
		this.field1155 = arg0;
	}

	@ObfuscatedName("bd.a(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void report(String arg0, Throwable arg1) {
		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = Statics.method896(arg1);
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
			PrivilegedRequest var7 = signlink.method650(new URL(signlink.applet.getCodeBase(), "clienterror.ws?c=" + GameShell.field2038 + "&u=" + Statics.field1843 + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&e=" + var6));
			while (var7.field815 == 0) {
				Statics.sleepPrecise(1L);
			}
			if (var7.field815 == 1) {
				DataInputStream var8 = (DataInputStream) var7.field818;
				var8.read();
				var8.close();
			}
		} catch (Exception var9) {
		}
	}
}
