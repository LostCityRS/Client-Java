package jagex3.io;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.ClientBuild;
import jagex3.client.GameShell;
import jagex3.jstring.JagString;
import jagex3.util.MonotonicTime;

import java.util.Date;

@ObfuscatedName("pb")
public final class BZip2State {

	@ObfuscatedName("pb.c")
	public final int[][] field3147 = new int[6][258];

	@ObfuscatedName("pb.e")
	public final boolean[] field3149 = new boolean[16];

	@ObfuscatedName("pb.f")
	public final int[] field3150 = new int[6];

	@ObfuscatedName("pb.g")
	public int field3151 = 0;

	@ObfuscatedName("pb.h")
	public final byte[] field3152 = new byte[18002];

	@ObfuscatedName("pb.i")
	public final byte[][] field3153 = new byte[6][258];

	@ObfuscatedName("pb.j")
	public final byte[] field3154 = new byte[18002];

	@ObfuscatedName("pb.k")
	public int field3155;

	@ObfuscatedName("pb.m")
	public final int[] field3157 = new int[257];

	@ObfuscatedName("pb.n")
	public final byte[] field3158 = new byte[256];

	@ObfuscatedName("pb.p")
	public final int[] field3160 = new int[256];

	@ObfuscatedName("pb.q")
	public int field3161;

	@ObfuscatedName("pb.r")
	public int field3162;

	@ObfuscatedName("pb.t")
	public int field3164;

	@ObfuscatedName("pb.v")
	public int field3166;

	@ObfuscatedName("pb.w")
	public int field3167;

	@ObfuscatedName("pb.x")
	public final byte[] field3168 = new byte[4096];

	@ObfuscatedName("pb.E")
	public int field3175 = 0;

	@ObfuscatedName("pb.C")
	public final int[][] field3173 = new int[6][258];

	@ObfuscatedName("pb.A")
	public final boolean[] field3171 = new boolean[256];

	@ObfuscatedName("pb.D")
	public final int[][] field3174 = new int[6][258];

	@ObfuscatedName("pb.J")
	public final int[] field3180 = new int[16];

	@ObfuscatedName("pb.L")
	public byte field3182;

	@ObfuscatedName("pb.z")
	public int field3170;

	@ObfuscatedName("pb.B")
	public int field3172;

	@ObfuscatedName("pb.G")
	public int field3177;

	@ObfuscatedName("pb.H")
	public int field3178;

	@ObfuscatedName("pb.K")
	public int field3181;

	@ObfuscatedName("pb.O")
	public int field3184;

	@ObfuscatedName("pb.P")
	public int field3185;

	@ObfuscatedName("pb.y")
	public byte[] field3169;

	@ObfuscatedName("pb.N")
	public byte[] field3183;

	@ObfuscatedName("pb.a(ILi;)V")
	public static void method1132(JagString arg0) {
		if (GameShell.signlink.field3597 == null) {
			return;
		}
		try {
			JagString var1 = Statics.field4265.method608(GameShell.signlink.field3597);
			JagString var2 = Statics.field4516.method608(GameShell.signlink.field3597);
			JagString var3 = JagString.join(new JagString[] { var1, Statics.field651, arg0, Statics.field1005, var2 });
			JagString var4;
			if (arg0.method604() == 0) {
				var4 = JagString.join(new JagString[] { var3, Statics.field920 });
			} else {
				var4 = JagString.join(new JagString[] { var3, Statics.field1982, method1139(MonotonicTime.currentTime() + 94608000000L), Statics.field1767, Statics.method1556(94608000L) });
			}
			JagString.join(new JagString[] { Statics.field3237, var4, Statics.field591 }).method636(GameShell.signlink.field3597);
		} catch (Throwable var5) {
		}
	}

	@ObfuscatedName("pb.a(IIIII)V")
	public static void method1137(int arg0, int arg1, int arg2, int arg3) {
		Statics.field2330 = ClientBuild.field1988 * arg2 / arg0;
		Statics.field3033 = ClientBuild.field760 * arg1 / arg3;
		Statics.field594 = -1;
		Statics.field3659 = -1;
		Statics.method1604();
	}

	@ObfuscatedName("pb.b(ILi;)V")
	public static void method1138(JagString arg0) {
		try {
			GameShell.shell.getAppletContext().showDocument(arg0.method632(GameShell.shell.getCodeBase()), "_blank");
		} catch (Exception var1) {
		}
	}

	@ObfuscatedName("pb.a(JI)Li;")
	public static JagString method1139(long arg0) {
		Statics.field4545.setTime(new Date(arg0));
		int var2 = Statics.field4545.get(7);
		int var3 = Statics.field4545.get(5);
		int var4 = Statics.field4545.get(2);
		int var5 = Statics.field4545.get(1);
		int var6 = Statics.field4545.get(11);
		int var7 = Statics.field4545.get(12);
		int var8 = Statics.field4545.get(13);
		return JagString.join(new JagString[] { Statics.field1673[var2 - 1], Statics.field3772, JagString.method1212(var3 / 10), JagString.method1212(var3 % 10), Statics.field3135, Statics.field658[var4], Statics.field3135, JagString.method1212(var5), Statics.field4262, JagString.method1212(var6 / 10), JagString.method1212(var6 % 10), Statics.field1959, JagString.method1212(var7 / 10), JagString.method1212(var7 % 10), Statics.field1959, JagString.method1212(var8 / 10), JagString.method1212(var8 % 10), Statics.field82 });
	}
}
