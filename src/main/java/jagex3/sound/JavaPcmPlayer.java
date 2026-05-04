package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.util.IntUtil;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.*;

@ObfuscatedName("ii")
public final class JavaPcmPlayer extends PcmPlayer {

	@ObfuscatedName("ii.P")
	public boolean field1777 = false;

	@ObfuscatedName("ii.R")
	public int field1779;

	@ObfuscatedName("ii.O")
	public AudioFormat field1776;

	@ObfuscatedName("ii.N")
	public SourceDataLine field1775;

	@ObfuscatedName("ii.Q")
	public byte[] field1778;

	@ObfuscatedName("ii.a()I")
	@Override
	public int method398() {
		return this.field1779 - (this.field1775.available() >> (PcmPlayer.field99 ? 2 : 1));
	}

	@ObfuscatedName("ii.b()V")
	@Override
	public void method400() {
		short var1 = 256;
		if (PcmPlayer.field99) {
			var1 = 512;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = this.field1025[var2];
			if ((var3 + 8388608 & 0xFF000000) != 0) {
				var3 = var3 >> 31 ^ 0x7FFFFF;
			}
			this.field1778[var2 * 2] = (byte) (var3 >> 8);
			this.field1778[var2 * 2 + 1] = (byte) (var3 >> 16);
		}
		this.field1775.write(this.field1778, 0, var1 << 1);
	}

	@ObfuscatedName("ii.d()V")
	@Override
	public void method413() throws LineUnavailableException {
		this.field1775.flush();
		if (!this.field1777) {
			return;
		}
		this.field1775.close();
		this.field1775 = null;
		Info var1 = new Info(SourceDataLine.class, this.field1776, this.field1779 << (PcmPlayer.field99 ? 2 : 1));
		this.field1775 = (SourceDataLine) AudioSystem.getLine(var1);
		this.field1775.open();
		this.field1775.start();
	}

	@ObfuscatedName("ii.c(I)V")
	@Override
	public void method409(int arg0) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.field1776, arg0 << (PcmPlayer.field99 ? 2 : 1));
			this.field1775 = (SourceDataLine) AudioSystem.getLine(var2);
			this.field1775.open();
			this.field1775.start();
			this.field1779 = arg0;
		} catch (LineUnavailableException var4) {
			if (Statics.method1057(arg0) == 1) {
				this.field1775 = null;
				throw var4;
			} else {
				this.method409(IntUtil.bitceil(arg0));
			}
		}
	}

	@ObfuscatedName("ii.a(Ljava/awt/Component;)V")
	@Override
	public void method412(Component arg0) {
		javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.length; var3++) {
				javax.sound.sampled.Mixer.Info var4 = var2[var3];
				if (var4 != null) {
					String var5 = var4.getName();
					if (var5 != null && var5.toLowerCase().indexOf("soundmax") >= 0) {
						this.field1777 = true;
					}
				}
			}
		}
		this.field1776 = new AudioFormat((float) PcmPlayer.frequency, 16, PcmPlayer.field99 ? 2 : 1, true, false);
		this.field1778 = new byte[0x100 << (PcmPlayer.field99 ? 2 : 1)];
	}

	@ObfuscatedName("ii.c()V")
	@Override
	public void method408() {
		if (this.field1775 != null) {
			this.field1775.close();
			this.field1775 = null;
		}
	}
}
