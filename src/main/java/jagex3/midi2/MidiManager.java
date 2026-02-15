package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.js5.Js5;
import jagex3.sound.WaveCache;
import jagex3.util.JagString;

public class MidiManager {
	@ObfuscatedName("kd.E")
	public static int field1724;
	@ObfuscatedName("wd.C")
	public static int field3606;
	@ObfuscatedName("oa.K")
	public static int state = 0;
	@ObfuscatedName("m.S")
	public static MidiPlayer midiPlayer;
	@ObfuscatedName("ee.Z")
	public static Js5 midis;
	@ObfuscatedName("ia.Q")
	public static int pendingVolume;
	@ObfuscatedName("sa.n")
	public static int field2928;
	@ObfuscatedName("rc.O")
	public static boolean pendingLoop;
	@ObfuscatedName("pa.s")
	public static Js5 field2499;
	@ObfuscatedName("o.Hb")
	public static Js5 patches;
	@ObfuscatedName("oa.E")
	public static Js5 field2257;
	@ObfuscatedName("wf.b")
	public static WaveCache loadingWaveCache;
	@ObfuscatedName("sd.h")
	public static MidiFile loadingMidiFile;

	@ObfuscatedName("we.a(Z)V")
	public static void updateFadeOut() {
		try {
			if (state == 1) {
				int var0 = midiPlayer.method112();
				if (var0 > 0 && midiPlayer.method90()) {
					int var1 = var0 - field1724;
					if (var1 < 0) {
						var1 = 0;
					}
					midiPlayer.setGlobalVolume(var1);
				} else {
					midiPlayer.method115();
					midiPlayer.method91();
					loadingWaveCache = null;
					if (midis == null) {
						state = 0;
					} else {
						state = 2;
					}
					loadingMidiFile = null;
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			midiPlayer.method115();
			loadingWaveCache = null;
			state = 0;
			loadingMidiFile = null;
			midis = null;
		}
	}

	@ObfuscatedName("b.d(I)Z")
	public static boolean updateLoading() {
		try {
			if (state == 2) {
				if (loadingMidiFile == null) {
					loadingMidiFile = MidiFile.load(midis, field3606, field2928);
					if (loadingMidiFile == null) {
						return false;
					}
				}
				if (loadingWaveCache == null) {
					loadingWaveCache = new WaveCache(field2499, field2257);
				}
				if (midiPlayer.loadAndQueuePatches(patches, loadingWaveCache, loadingMidiFile)) {
					midiPlayer.freeWaveIds();
					midiPlayer.setGlobalVolume(pendingVolume);
					midiPlayer.start(pendingLoop, loadingMidiFile);
					loadingWaveCache = null;
					state = 0;
					loadingMidiFile = null;
					midis = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			midiPlayer.method115();
			loadingMidiFile = null;
			midis = null;
			loadingWaveCache = null;
			state = 0;
		}
		return false;
	}

	@ObfuscatedName("ge.a(Lea;Lea;Lc;BLea;)Z")
	public static boolean init(Js5 arg0, Js5 arg1, MidiPlayer arg2, Js5 arg3) {
		midiPlayer = arg2;
		field2499 = arg0;
		patches = arg3;
		field2257 = arg1;
		return true;
	}

	@ObfuscatedName("wa.a(Lea;IIIZI)V")
	public static void play(Js5 arg0, int arg1, int arg2, int arg3) {
		field2928 = arg3;
		field3606 = arg1;
		midis = arg0;
		pendingVolume = arg2;
		state = 1;
		pendingLoop = false;
		field1724 = 10000;
	}

	@ObfuscatedName("oe.a(Lec;Lea;ZILec;B)V")
	public static void play(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg2);
		int var4 = arg1.getFileId(arg0, var3);
		play(arg1, var3, 255, var4);
	}

	@ObfuscatedName("jf.a(Z)V")
	public static void stop() {
		midiPlayer.method115();
		midis = null;
		state = 1;
	}

	@ObfuscatedName("vf.a(IB)V")
	public static void stop2() {
		field1724 = 2;
		field3606 = -1;
		state = 1;
		midis = null;
		pendingVolume = 0;
		pendingLoop = false;
		field2928 = -1;
	}

	@ObfuscatedName("kc.a(Lea;Lec;IZILec;I)V")
	public static void method590(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.getGroupId(arg1);
		int var4 = arg0.getFileId(arg2, var3);
		swapSongs(arg0, 255, var4, var3);
	}

	@ObfuscatedName("mc.a(ZLea;IZIII)V")
	public static void swapSongs(Js5 arg0, int arg1, int arg2, int arg3) {
		field1724 = 2;
		midis = arg0;
		field3606 = arg3;
		pendingLoop = false;
		pendingVolume = arg1;
		state = 1;
		field2928 = arg2;
	}

	@ObfuscatedName("jf.a(IZ)V")
	public static void setVolume(int arg0) {
		if (state == 0) {
			midiPlayer.setGlobalVolume(arg0);
		} else {
			pendingVolume = arg0;
		}
	}

	@ObfuscatedName("e.e(I)Z")
	public static boolean isInitialised() {
		return state == 0 ? midiPlayer.method90() : true;
	}
}
