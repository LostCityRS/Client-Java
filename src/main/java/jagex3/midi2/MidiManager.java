package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.js5.Js5;
import jagex3.sound.WaveCache;

public class MidiManager {
	@ObfuscatedName("ch.i")
	public static MidiPlayer midiPlayer;
	@ObfuscatedName("hi.e")
	public static Js5 vorbis;
	@ObfuscatedName("oa.x")
	public static Js5 jagFX;
	@ObfuscatedName("b.j")
	public static Js5 patches;
	@ObfuscatedName("lb.w")
	public static int state = 0;
	@ObfuscatedName("s.eb")
	public static MidiFile loadingMidiFile;
	@ObfuscatedName("wi.v")
	public static WaveCache loadingWaveCache;
	@ObfuscatedName("of.d")
	public static Js5 midis;
	@ObfuscatedName("wc.M")
	public static int pendingFileId;
	@ObfuscatedName("aj.Y")
	public static int pendingVolume;
	@ObfuscatedName("pi.bb")
	public static int fadeOutRate;
	@ObfuscatedName("be.B")
	public static boolean pendingLoop;
	@ObfuscatedName("uj.b")
	public static int pendingGroupId;

	@ObfuscatedName("pb.a(BLnb;Lpg;Lnb;Lnb;)Z")
	public static boolean init(Js5 arg0, MidiPlayer arg1, Js5 arg2, Js5 arg3) {
		midiPlayer = arg1;
		vorbis = arg0;
		jagFX = arg2;
		patches = arg3;
		return true;
	}

	@ObfuscatedName("n.a(Z)Z")
	public static boolean updateLoading() {
		try {
			if (state == 2) {
				if (loadingMidiFile == null) {
					loadingMidiFile = MidiFile.load(midis, pendingGroupId, pendingFileId);
					if (loadingMidiFile == null) {
						return false;
					}
				}
				if (loadingWaveCache == null) {
					loadingWaveCache = new WaveCache(jagFX, vorbis);
				}
				if (midiPlayer.loadAndQueuePatches(loadingWaveCache, loadingMidiFile, patches)) {
					midiPlayer.freeWaveIds();
					midiPlayer.setGlobalVolume(pendingVolume);
					midiPlayer.start(loadingMidiFile, pendingLoop);
					midis = null;
					loadingMidiFile = null;
					state = 0;
					loadingWaveCache = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			midiPlayer.stop();
			loadingWaveCache = null;
			midis = null;
			state = 0;
			loadingMidiFile = null;
		}
		return false;
	}

	@ObfuscatedName("kh.d(II)V")
	public static void stop2() {
		pendingFileId = -1;
		pendingVolume = 0;
		fadeOutRate = 2;
		midis = null;
		pendingLoop = false;
		state = 1;
		pendingGroupId = -1;
	}

	@ObfuscatedName("jh.a(IIZIILnb;I)V")
	public static void method730(int arg0, int arg1, Js5 arg2) {
		fadeOutRate = 2;
		pendingFileId = 0;
		pendingVolume = arg0;
		pendingLoop = false;
		midis = arg2;
		state = 1;
		pendingGroupId = arg1;
	}

	@ObfuscatedName("bj.c(Z)V")
	public static void updateFadeOut() {
		try {
			if (state == 1) {
				int var0 = midiPlayer.getGlobalVolume();
				if (var0 > 0 && midiPlayer.loaded()) {
					int var1 = var0 - fadeOutRate;
					if (var1 < 0) {
						var1 = 0;
					}
					midiPlayer.setGlobalVolume(var1);
				} else {
					midiPlayer.stop();
					midiPlayer.clearPatches();
					loadingWaveCache = null;
					loadingMidiFile = null;
					if (midis == null) {
						state = 0;
					} else {
						state = 2;
					}
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			midiPlayer.stop();
			loadingWaveCache = null;
			midis = null;
			loadingMidiFile = null;
			state = 0;
		}
	}

	@ObfuscatedName("a.b(I)V")
	public static void stop() {
		midiPlayer.stop();
		midis = null;
		state = 1;
	}

	@ObfuscatedName("je.b(II)V")
	public static void setVolume(int arg0) {
		if (state == 0) {
			midiPlayer.setGlobalVolume(arg0);
		} else {
			pendingVolume = arg0;
		}
	}

	@ObfuscatedName("jd.b(I)Z")
	public static boolean isInitialised() {
		return state == 0 ? midiPlayer.loaded() : true;
	}

	@ObfuscatedName("eh.a(ILnb;BZII)V")
	public static void play(Js5 arg0, int arg1, int arg2) {
		pendingVolume = arg2;
		midis = arg0;
		pendingGroupId = arg1;
		fadeOutRate = 10000;
		state = 1;
		pendingFileId = 0;
		pendingLoop = false;
	}
}
