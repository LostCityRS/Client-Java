package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.client.Client;
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
				Client.method629(this.field1045.applet, "midibox.src=\"c:/silence.mid\";");
			} catch (Throwable var1) {
			}
			this.field1008 = false;
		}
		this.field1009 = null;
	}

	@ObfuscatedName("ga.b(I)V")
	@Override
	public void method308() {
		if (this.field1009 == null || this.field1009.status == 0) {
			return;
		}
		if (this.field1009.status == 1) {
			FileOnDisk var1 = (FileOnDisk) this.field1009.result;
			try {
				var1.write(this.field1039, 0, this.field1039.length);
				var1.close();
				try {
					Client.method629(this.field1045.applet, "midibox.loop=" + (this.field1025 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var1.getFile().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1033 + ";");
					this.field1008 = true;
				} catch (Throwable var3) {
				}
			} catch (Exception var4) {
				try {
					var1.close();
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
		int var3 = MidiManager.method632(arg0) - arg1;
		if (this.field1009 != null) {
			this.field1033 = var3;
		} else if (this.field1008) {
			try {
				Client.method629(this.field1045.applet, "midibox.volume=" + var3 + ";");
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
		this.field1033 = MidiManager.method632(arg2);
		this.field1039 = arg0;
		this.field1025 = arg1;
	}

	public JavaBrowserMidiPlayer(SignLink arg0) {
		this.field1045 = arg0;
	}
}
