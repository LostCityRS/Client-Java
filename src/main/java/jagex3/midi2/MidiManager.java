package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.client.SignLink;
import jagex3.datastruct.ByteArrayNode;
import jagex3.datastruct.LruCache;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class MidiManager {
	@ObfuscatedName("ie.c")
	public static boolean songRequestPending = false;
	@ObfuscatedName("u.pb")
	public static int pendingFadeTicks;
	@ObfuscatedName("bd.S")
	public static int pendingFadeStep;
	@ObfuscatedName("fc.Ub")
	public static int pendingSongVolume;
	@ObfuscatedName("d.Fc")
	public static int pendingVolume;
	@ObfuscatedName("client.Eb")
	public static boolean pendingLoop;
	@ObfuscatedName("jc.pb")
	public static int pendingCacheId;
	@ObfuscatedName("ga.M")
	public static Js5 midis;
	@ObfuscatedName("ca.o")
	public static int pendingGroupId;
	@ObfuscatedName("bb.a")
	public static MidiStream midiStream;
	@ObfuscatedName("ub.d")
	public static int currentVolume = -1;
	@ObfuscatedName("nc.l")
	public static int currentFadeOffset = 0;
	@ObfuscatedName("aa.Id")
	public static byte[] queuedMidiData;
	@ObfuscatedName("kb.h")
	public static int fadeTicks = 0;
	@ObfuscatedName("ba.gc")
	public static int fadeStep = 0;
	@ObfuscatedName("fe.Rc")
	public static int queuedVolume;
	@ObfuscatedName("la.h")
	public static boolean queuedLoop;
	@ObfuscatedName("a.D")
	public static LruCache midiCache;

	@ObfuscatedName("m.a(ZIIIILbd;I)V")
	public static synchronized void play(int arg0, int arg1, int arg2, Js5 arg3) {
		if (!isReady()) {
			return;
		}
		songRequestPending = true;
		pendingFadeTicks = -1;
		pendingFadeStep = -1;
		pendingSongVolume = arg2;
		pendingVolume = 0;
		pendingLoop = false;
		pendingCacheId = arg0;
		midis = arg3;
		pendingGroupId = arg1;
	}

	@ObfuscatedName("ib.a(I)Z")
	public static boolean isReady() {
		return midiStream != null;
	}

	@ObfuscatedName("m.a(Z)V")
	public static synchronized void stop() {
		if (isReady()) {
			stopNow();
			songRequestPending = false;
			midis = null;
		}
	}

	@ObfuscatedName("m.a(IZIILbd;IIZ)V")
	public static synchronized void playGroup(int arg0, int arg1, Js5 arg2, int arg3) {
		if (!isReady()) {
			return;
		}
		pendingLoop = false;
		pendingFadeStep = 10;
		pendingVolume = arg3;
		songRequestPending = true;
		midis = arg2;
		pendingFadeTicks = -1;
		pendingSongVolume = arg0;
		pendingCacheId = 0;
		pendingGroupId = arg1;
	}

	@ObfuscatedName("m.a(II)V")
	public static synchronized void stopWithFade() {
		if (isReady()) {
			fadeOut();
			midis = null;
			songRequestPending = false;
		}
	}

	@ObfuscatedName("m.b(B)V")
	public static synchronized void tick() {
		if (!isReady()) {
			return;
		}
		if (songRequestPending) {
			byte[] var0 = getMidiFile(pendingVolume, midis, pendingGroupId, pendingCacheId);
			if (var0 != null) {
				if (pendingFadeStep >= 0) {
					fadeOutThenPlayWithStep(pendingSongVolume, pendingLoop, var0, pendingFadeStep);
				} else if (pendingFadeTicks < 0) {
					playImmediate(pendingLoop, var0, pendingSongVolume);
				} else {
					fadeOutThenPlay(pendingSongVolume, pendingLoop, pendingFadeTicks, var0);
				}
				songRequestPending = false;
				midis = null;
			}
		}
		update();
	}

	@ObfuscatedName("hc.c(I)V")
	public static void stopNow() {
		playImmediate(false, null, 0);
	}

	@ObfuscatedName("a.a(IZ[BI)V")
	public static void playImmediate(boolean arg0, byte[] arg1, int arg2) {
		if (midiStream == null) {
			return;
		}
		if (currentVolume >= 0) {
			midiStream.stop();
			currentFadeOffset = 0;
			queuedMidiData = null;
			fadeTicks = 20;
			currentVolume = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (fadeTicks > 0) {
			midiStream.resetVolume(arg2);
			fadeTicks = 0;
		}
		currentVolume = arg2;
		midiStream.play(arg1, arg0, arg2);
	}

	@ObfuscatedName("fd.a(IZI[BI)V")
	public static void fadeOutThenPlay(int arg0, boolean arg1, int arg2, byte[] arg3) {
		if (midiStream == null) {
			return;
		}
		if (currentVolume >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			fadeTicks = arg2;
			if (currentVolume == 0) {
				fadeStep = 0;
			} else {
				int var4 = volumeToDecibels(currentVolume);
				int var5 = var4 - currentFadeOffset;
				fadeStep = (arg2 + var5 + 3600 - 1) / arg2;
			}
			queuedMidiData = arg3;
			queuedVolume = arg0;
			queuedLoop = arg1;
		} else if (fadeTicks == 0) {
			playImmediate(arg1, arg3, arg0);
		} else {
			queuedVolume = arg0;
			queuedLoop = arg1;
			queuedMidiData = arg3;
		}
	}

	@ObfuscatedName("a.a(ILbd;III)[B")
	public static byte[] getMidiFile(int arg0, Js5 arg1, int arg2, int arg3) {
		long var4 = ((long) arg3 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF) + (long) (arg2 << 16);
		if (midiCache != null) {
			ByteArrayNode var6 = (ByteArrayNode) midiCache.find(var4);
			if (var6 != null) {
				return var6.data;
			}
		}
		byte[] var7 = arg1.getFile(arg0, arg2);
		if (var7 == null) {
			return null;
		} else {
			if (midiCache != null) {
				midiCache.put(var4, new ByteArrayNode(var7));
			}
			return var7;
		}
	}

	@ObfuscatedName("oa.a(IIZ[BI)V")
	public static void fadeOutThenPlayWithStep(int arg0, boolean arg1, byte[] arg2, int arg3) {
		if (midiStream == null) {
			return;
		}
		if (currentVolume >= 0) {
			fadeStep = arg3;
			if (currentVolume == 0) {
				fadeTicks = 1;
			} else {
				int var4 = volumeToDecibels(currentVolume);
				int var5 = var4 - currentFadeOffset;
				fadeTicks = (var5 + 3600) / arg3;
				if (fadeTicks < 1) {
					fadeTicks = 1;
				}
			}
			queuedVolume = arg0;
			queuedMidiData = arg2;
			queuedLoop = arg1;
		} else if (fadeTicks == 0) {
			playImmediate(arg1, arg2, arg0);
		} else {
			queuedVolume = arg0;
			queuedMidiData = arg2;
			queuedLoop = arg1;
		}
	}

	@ObfuscatedName("tc.c(I)V")
	public static void update() {
		if (midiStream == null) {
			return;
		}
		if (currentVolume >= 0) {
			if (fadeTicks > 0) {
				currentFadeOffset += fadeStep;
				midiStream.setVolume(currentVolume, currentFadeOffset);
				fadeTicks--;
				if (fadeTicks == 0) {
					midiStream.stop();
					currentVolume = -1;
					fadeTicks = 20;
				}
			}
		} else if (fadeTicks > 0) {
			fadeTicks--;
			if (fadeTicks == 0) {
				if (queuedMidiData == null) {
					midiStream.resetVolume(256);
				} else {
					midiStream.resetVolume(queuedVolume);
					currentVolume = queuedVolume;
					midiStream.play(queuedMidiData, queuedLoop, queuedVolume);
					queuedMidiData = null;
				}
				currentFadeOffset = 0;
			}
		}
		midiStream.poll();
	}

	@ObfuscatedName("l.a(II)I")
	public static int volumeToDecibels(int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@ObfuscatedName("fc.a(II)V")
	public static void fadeOut() {
		fadeOutThenPlayWithStep(0, false, null, 10);
	}

	@ObfuscatedName("m.a(ZLbd;IBLa;ILa;I)V")
	public static synchronized void playNamed(Js5 arg0, JagString arg1, JagString arg2, int arg3) {
		if (isReady()) {
			int var4 = arg0.getGroupId(arg1);
			int var5 = arg0.getFileId(var4, arg2);
			playGroup(arg3, var4, arg0, var5);
		}
	}

	@ObfuscatedName("rb.a(II)V")
	public static void setActiveVolume(int arg0) {
		if (midiStream == null) {
			return;
		}
		if (fadeTicks == 0) {
			if (currentVolume >= 0) {
				currentVolume = arg0;
				midiStream.setVolume(arg0, 0);
			}
		} else if (queuedMidiData != null) {
			queuedVolume = arg0;
		}
	}

	@ObfuscatedName("w.a(I)V")
	public static void shutdown() {
		if (midiStream == null) {
			return;
		}
		stopNow();
		if (fadeTicks > 0) {
			midiStream.resetVolume(256);
			fadeTicks = 0;
		}
		midiStream.closeStream();
		midiStream = null;
	}

	@ObfuscatedName("nd.a(IB)V")
	public static void setVolume(int arg0) {
		if (!isReady()) {
			return;
		}
		if (songRequestPending) {
			pendingSongVolume = arg0;
		} else {
			setActiveVolume(arg0);
		}
	}

	@ObfuscatedName("m.b(Z)V")
	public static synchronized void unload() {
		shutdown();
	}

	@ObfuscatedName("nc.a(Llc;BZ)Z")
	public static boolean init(SignLink arg0, boolean arg1) {
		fadeTicks = 20;
		try {
			midiStream = (MidiStream) Class.forName("jagex3.midi2.JavaxMidiPlayer").getDeclaredConstructor().newInstance();
			return true;
		} catch (Throwable var3) {
			MidiDevice var2 = arg0.method653();
			if (var2 != null) {
				midiStream = new DeviceMidiPlayer(arg0, var2);
				return true;
			} else if (arg1) {
				midiStream = new BgsoundMidiPlayer(arg0);
				return true;
			} else {
				return false;
			}
		}
	}
}
