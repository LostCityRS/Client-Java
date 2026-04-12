package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.io.FileOnDisk;

@ObfuscatedName("ga")
public final class JavaBrowserMidiPlayer extends MidiStream {

	@ObfuscatedName("ga.db")
	public final SignLink field1045;

	@ObfuscatedName("ga.s")
	public boolean field1008;

	@ObfuscatedName("ga.t")
	public PrivilegedRequest field1009;

	@ObfuscatedName("ga.D")
	public static int[] field1019 = new int[5];

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
			FileOnDisk var1 = (FileOnDisk) this.field1009.field818;
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

	public JavaBrowserMidiPlayer(SignLink arg0) {
		this.field1045 = arg0;
	}
}
