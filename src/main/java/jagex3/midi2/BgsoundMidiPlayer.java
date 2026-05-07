package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.io.FileOnDisk;

@ObfuscatedName("ga")
public final class BgsoundMidiPlayer extends MidiStream {

	@ObfuscatedName("ga.db")
	public final SignLink signLink;

	@ObfuscatedName("ga.s")
	public boolean playing;

	@ObfuscatedName("ga.t")
	public PrivilegedRequest fileRequest;

	@ObfuscatedName("ga.R")
	public int volume;

	@ObfuscatedName("ga.J")
	public boolean loop;

	@ObfuscatedName("ga.X")
	public byte[] midiData;

	@ObfuscatedName("ga.a(II)V")
	@Override
	public void resetVolume(int arg0) {
	}

	@ObfuscatedName("ga.a(B)V")
	@Override
	public void stop() {
		if (this.playing) {
			try {
				Client.evalJavaScript(this.signLink.applet, "midibox.src=\"c:/silence.mid\";");
			} catch (Throwable var1) {
			}
			this.playing = false;
		}
		this.fileRequest = null;
	}

	@ObfuscatedName("ga.b(I)V")
	@Override
	public void poll() {
		if (this.fileRequest == null || this.fileRequest.status == 0) {
			return;
		}
		if (this.fileRequest.status == 1) {
			FileOnDisk var1 = (FileOnDisk) this.fileRequest.result;
			try {
				var1.write(this.midiData, 0, this.midiData.length);
				var1.close();
				try {
					Client.evalJavaScript(this.signLink.applet, "midibox.loop=" + (this.loop ? "\"infinite\"" : "0") + "; midibox.src=\"" + var1.getFile().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.volume + ";");
					this.playing = true;
				} catch (Throwable var3) {
				}
			} catch (Exception var4) {
				try {
					var1.close();
				} catch (Exception var2) {
				}
			}
		}
		this.fileRequest = null;
	}

	@ObfuscatedName("ga.c(B)V")
	@Override
	public void closeStream() {
	}

	@ObfuscatedName("ga.a(BII)V")
	@Override
	public void setVolume(int arg0, int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		int var3 = MidiManager.volumeToDecibels(arg0) - arg1;
		if (this.fileRequest != null) {
			this.volume = var3;
		} else if (this.playing) {
			try {
				Client.evalJavaScript(this.signLink.applet, "midibox.volume=" + var3 + ";");
			} catch (Throwable var4) {
			}
		}
	}

	@ObfuscatedName("ga.a([BZII)V")
	@Override
	public void play(byte[] arg0, boolean arg1, int arg2) {
		this.fileRequest = this.signLink.method658();
		if (this.fileRequest == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.volume = MidiManager.volumeToDecibels(arg2);
		this.midiData = arg0;
		this.loop = arg1;
	}

	public BgsoundMidiPlayer(SignLink arg0) {
		this.signLink = arg0;
	}
}
