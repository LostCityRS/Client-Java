package jagex3.midi2;

import deob.ObfuscatedName;

@ObfuscatedName("uc")
public abstract class MidiPlayer extends MidiStream {

	@ObfuscatedName("ld.G")
	public static int[] channelVolumes = new int[]{12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800};
	@ObfuscatedName("na.i")
	public static int[] activeNotes = new int[128];
    @ObfuscatedName("oe.l")
    public static int globalVolume = 256;

    @ObfuscatedName("uc.a(IIJI)V")
	public final void setVolume(int arg0, int arg1, long arg2) {
		int var5 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
		if (globalVolume == var5) {
			return;
		}
		globalVolume = var5;
		for (int var6 = 0; var6 < 16; var6++) {
			int var7 = getPan(var6);
			this.sendMidiCommand(var6 + 176, 7, var7 >> 7, arg2);
			this.sendMidiCommand(var6 + 176, 39, var7 & 0x7F, arg2);
		}
	}

	@ObfuscatedName("uc.a(IJI)V")
	public final void resetVolume(long arg0, int arg1) {
		globalVolume = arg1;
		for (int var4 = 0; var4 < 16; var4++) {
			channelVolumes[var4] = 12800;
		}
		for (int var5 = 0; var5 < 16; var5++) {
			int var6 = getPan(var5);
			this.sendMidiCommand(var5 + 176, 7, var6 >> 7, arg0);
			this.sendMidiCommand(var5 + 176, 39, var6 & 0x7F, arg0);
		}
	}

	@ObfuscatedName("uc.a(BJ)V")
	public final void resetAllChannels(long arg0) {
		for (int var3 = 0; var3 < 128; var3++) {
			int var4 = activeNotes[var3];
			activeNotes[var3] = 0;
			for (int var5 = 0; var5 < 16; var5++) {
				if ((var4 & 0x1 << var5) != 0) {
					this.sendMidiCommand(var5 + 144, var3, 0, arg0);
				}
			}
		}
		for (int var6 = 0; var6 < 16; var6++) {
			this.sendMidiCommand(var6 + 176, 123, 0, arg0);
		}
		for (int var7 = 0; var7 < 16; var7++) {
			this.sendMidiCommand(var7 + 176, 120, 0, arg0);
		}
		for (int var8 = 0; var8 < 16; var8++) {
			this.sendMidiCommand(var8 + 176, 121, 0, arg0);
		}
		for (int var9 = 0; var9 < 16; var9++) {
			this.sendMidiCommand(var9 + 176, 0, 0, arg0);
		}
		for (int var10 = 0; var10 < 16; var10++) {
			this.sendMidiCommand(var10 + 176, 32, 0, arg0);
		}
		for (int var11 = 0; var11 < 16; var11++) {
			this.sendMidiCommand(var11 + 192, 0, 0, arg0);
		}
	}

	@ObfuscatedName("uc.b(IIIJ)Z")
	public final boolean loadAndQueuePatches(int arg0, int arg1, int arg2, long arg3) {
		if ((arg0 & 0xE0) == 128) {
			int var6 = 0x1 << (arg0 & 0xF);
			int var7 = activeNotes[arg1];
			if (arg0 < 144 || arg2 == 0) {
				activeNotes[arg1] = var7 & ~var6;
			} else if ((var7 & var6) == 0) {
				activeNotes[arg1] = var7 | var6;
			} else {
				this.sendMidiCommand(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.sendMidiCommand(arg0, arg1, arg2, arg3);
				int var8 = arg0 & 0xF;
				channelVolumes[var8] = 12800;
				int var9 = getPan(var8);
				this.sendMidiCommand(arg0, 7, var9 >> 7, arg3);
				this.sendMidiCommand(arg0, 39, var9 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				int var10 = arg0 & 0xF;
				if (arg1 == 7) {
					channelVolumes[var10] = (arg2 << 7) + (channelVolumes[var10] & 0x7F);
				} else {
					channelVolumes[var10] = (channelVolumes[var10] & 0x3F80) + arg2;
				}
				int var11 = getPan(var10);
				this.sendMidiCommand(arg0, 7, var11 >> 7, arg3);
				this.sendMidiCommand(arg0, 39, var11 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("uc.g(I)I")
	public static int getPan(int arg0) {
		int var1 = channelVolumes[arg0];
		int var2 = (globalVolume * var1 >> 8) * var1;
		return (int) (Math.sqrt((double) var2) + 0.5D);
	}

	@ObfuscatedName("uc.a(IIIJ)V")
	public abstract void sendMidiCommand(int arg0, int arg1, int arg2, long arg3);
}
