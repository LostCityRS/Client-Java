package deob;

@ObfuscatedName("ga")
public final class class38 extends class45 {

	@ObfuscatedName("ga.cb")
	public static JagString field1044 = JagString.wrap("Verbindung abgebrochen)3");

	@ObfuscatedName("ga.db")
	public final class69 field1045;

	@ObfuscatedName("ga.eb")
	public static JagString field1046 = JagString.wrap("Password: ");

	@ObfuscatedName("ga.s")
	public boolean field1008;

	@ObfuscatedName("ga.t")
	public class29 field1009;

	@ObfuscatedName("ga.v")
	public static JagString field1011 = JagString.wrap("T");

	@ObfuscatedName("ga.B")
	public static JagString[] field1017 = new JagString[100];

	@ObfuscatedName("ga.F")
	public static JagString field1021 = JagString.wrap("This computers address has been blocked");

	@ObfuscatedName("ga.I")
	public static JagString field1024 = field1021;

	@ObfuscatedName("ga.C")
	public static JagString field1018 = JagString.wrap("Enter your username (V password)3");

	@ObfuscatedName("ga.G")
	public static JagString field1022 = JagString.wrap("welle:");

	@ObfuscatedName("ga.O")
	public static JagString field1030 = field1018;

	@ObfuscatedName("ga.Y")
	public static JagString field1040 = JagString.wrap("Loaded interfaces");

	@ObfuscatedName("ga.U")
	public static JagString field1036 = JagString.wrap("Please wait 5 minutes before trying again)3");

	@ObfuscatedName("ga.bb")
	public static JagString field1043 = field1036;

	@ObfuscatedName("ga.S")
	public static JagString field1034 = JagString.wrap("headicons_prayer");

	@ObfuscatedName("ga.D")
	public static int[] field1019 = new int[5];

	@ObfuscatedName("ga.Z")
	public static JagString field1041 = JagString.wrap("Report abuse");

	@ObfuscatedName("ga.P")
	public static JagString field1031 = field1040;

	@ObfuscatedName("ga.W")
	public static JagString field1038 = field1041;

	@ObfuscatedName("ga.V")
	public static JagString field1037 = field1046;

	@ObfuscatedName("ga.E")
	public static int[] field1020 = new int[2000];

	@ObfuscatedName("ga.R")
	public int field1033;

	@ObfuscatedName("ga.J")
	public boolean field1025;

	@ObfuscatedName("ga.X")
	public byte[] field1039;

	@ObfuscatedName("ga.a(II)V")
	@Override
	public void method304(int arg0) {
	}

	@ObfuscatedName("ga.a(B)V")
	@Override
	public void method305() {
		if (this.field1008) {
			try {
				Statics.method629(this.field1045.field1719, "midibox.src=\"c:/silence.mid\";");
			} catch (Throwable var1) {
			}
			this.field1008 = false;
		}
		this.field1009 = null;
	}

	@ObfuscatedName("ga.b(I)V")
	@Override
	public void method308() {
		if (this.field1009 == null || this.field1009.field815 == 0) {
			return;
		}
		if (this.field1009.field815 == 1) {
			class96 var1 = (class96) this.field1009.field818;
			try {
				var1.method832(this.field1039, 0, this.field1039.length);
				var1.method831();
				try {
					Statics.method629(this.field1045.field1719, "midibox.loop=" + (this.field1025 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var1.method829().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1033 + ";");
					this.field1008 = true;
				} catch (Throwable var3) {
				}
			} catch (Exception var4) {
				try {
					var1.method831();
				} catch (Exception var2) {
				}
			}
		}
		this.field1009 = null;
	}

	@ObfuscatedName("ga.c(B)V")
	@Override
	public void method303() {
	}

	@ObfuscatedName("ga.a(BII)V")
	@Override
	public void method302(int arg0, int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		int var3 = Statics.method632(arg0) - arg1;
		if (this.field1009 != null) {
			this.field1033 = var3;
		} else if (this.field1008) {
			try {
				Statics.method629(this.field1045.field1719, "midibox.volume=" + var3 + ";");
			} catch (Throwable var4) {
			}
		}
	}

	@ObfuscatedName("ga.a([BZII)V")
	@Override
	public void method307(byte[] arg0, boolean arg1, int arg2) {
		this.field1009 = this.field1045.method658();
		if (this.field1009 == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.field1033 = Statics.method632(arg2);
		this.field1039 = arg0;
		this.field1025 = arg1;
	}

	public class38(class69 arg0) {
		this.field1045 = arg0;
	}
}
