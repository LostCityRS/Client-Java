package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("df")
public final class MidiParser {

	@ObfuscatedName("df.a")
	public static final byte[] msgLen = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("df.b")
	public final Packet packet = new Packet(null);

	@ObfuscatedName("df.c")
	public int[] trackCurrentStatus;

	@ObfuscatedName("df.d")
	public int[] trackStartPos;

	@ObfuscatedName("df.e")
	public int[] trackCurrentTick;

	@ObfuscatedName("df.f")
	public int tempo;

	@ObfuscatedName("df.g")
	public int division;

	@ObfuscatedName("df.h")
	public long baseTime;

	@ObfuscatedName("df.i")
	public int[] trackCurrentPos;

	public MidiParser() {
	}

	public MidiParser(byte[] arg0) {
		this.setMidi(arg0);
	}

	@ObfuscatedName("df.a(I)V")
	public void unsetTrack(int arg0) {
		this.trackCurrentPos[arg0] = this.packet.pos;
	}

	@ObfuscatedName("df.a()Z")
	public boolean allTracksFinished() {
		int var1 = this.trackCurrentPos.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.trackCurrentPos[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("df.b(I)V")
	public void setTrack(int arg0) {
		this.packet.pos = this.trackCurrentPos[arg0];
	}

	@ObfuscatedName("df.c(I)J")
	public long timeFromTick(int arg0) {
		return this.baseTime + (long) arg0 * (long) this.tempo;
	}

	@ObfuscatedName("df.b()Z")
	public boolean gotMidi() {
		return this.packet.data != null;
	}

	@ObfuscatedName("df.a(J)V")
	public void restart(long arg0) {
		this.baseTime = arg0;
		int var3 = this.trackCurrentPos.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.trackCurrentTick[var4] = 0;
			this.trackCurrentStatus[var4] = 0;
			this.packet.pos = this.trackStartPos[var4];
			this.processDeltaTime(var4);
			this.trackCurrentPos[var4] = this.packet.pos;
		}
	}

	@ObfuscatedName("df.c()V")
	public void dropMidi() {
		this.packet.data = null;
		this.trackStartPos = null;
		this.trackCurrentPos = null;
		this.trackCurrentTick = null;
		this.trackCurrentStatus = null;
	}

	@ObfuscatedName("df.d()I")
	public int getTrackCount() {
		return this.trackCurrentPos.length;
	}

	@ObfuscatedName("df.a(II)I")
	public int getEvent3(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = msgLen[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.packet.g1() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.packet.g1() << 16;
			}
			return var8;
		}
		int var3 = this.packet.g1();
		int var4 = this.packet.gMidiVarLen();
		if (var3 == 47) {
			this.packet.pos += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.packet.g3();
			var4 -= 3;
			int var6 = this.trackCurrentTick[arg0];
			this.baseTime += (long) var6 * (long) (this.tempo - var5);
			this.tempo = var5;
			this.packet.pos += var4;
			return 2;
		} else {
			this.packet.pos += var4;
			return 3;
		}
	}

	@ObfuscatedName("df.d(I)I")
	public int getEvent2(int arg0) {
		byte var2 = this.packet.data[this.packet.pos];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.trackCurrentStatus[arg0] = var3;
			this.packet.pos++;
		} else {
			var3 = this.trackCurrentStatus[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.getEvent3(arg0, var3);
		}
		int var4 = this.packet.gMidiVarLen();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.packet.data[this.packet.pos] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.packet.pos++;
				this.trackCurrentStatus[arg0] = var5;
				return this.getEvent3(arg0, var5);
			}
		}
		this.packet.pos += var4;
		return 0;
	}

	@ObfuscatedName("df.a([B)V")
	public void setMidi(byte[] arg0) {
		this.packet.data = arg0;
		this.packet.pos = 10;
		int var2 = this.packet.g2();
		this.division = this.packet.g2();
		this.tempo = 500000;
		this.trackStartPos = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.packet.g4();
			int var5 = this.packet.g4();
			if (var4 == 1297379947) {
				this.trackStartPos[var3] = this.packet.pos;
				var3++;
			}
			this.packet.pos += var5;
		}
		this.baseTime = 0L;
		this.trackCurrentPos = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.trackCurrentPos[var6] = this.trackStartPos[var6];
		}
		this.trackCurrentTick = new int[var2];
		this.trackCurrentStatus = new int[var2];
	}

	@ObfuscatedName("df.e(I)I")
	public int getEvent(int arg0) {
		return this.getEvent2(arg0);
	}

	@ObfuscatedName("df.f()I")
	public int nextTrackToPlay() {
		int var1 = this.trackCurrentPos.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.trackCurrentPos[var4] >= 0 && this.trackCurrentTick[var4] < var3) {
				var2 = var4;
				var3 = this.trackCurrentTick[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("df.g()V")
	public void finishTrack() {
		this.packet.pos = -1;
	}

	@ObfuscatedName("df.f(I)V")
	public void processDeltaTime(int arg0) {
		int var2 = this.packet.gMidiVarLen();
		this.trackCurrentTick[arg0] += var2;
	}
}
