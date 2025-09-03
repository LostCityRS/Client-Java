package jagex2.client;

import javax.sound.midi.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class MidiPlayer implements Receiver {
	private final Receiver receiver;
	private final Sequencer sequencer;
	private final Synthesizer synth;
	// Receiver used by the Sequencer's Transmitter to avoid leaking `this` from constructor
	private final Receiver proxyReceiver;
	private int volume;

	public MidiPlayer() throws Exception {
		synth = MidiSystem.getSynthesizer();
		synth.open();
		receiver = synth.getReceiver();
		sequencer = MidiSystem.getSequencer(false);
		// Create a proxy receiver to forward messages through our processing without exposing `this`
		proxyReceiver = new Receiver() {
			@Override
			public void send(MidiMessage msg, long tick) {
				byte[] data = msg.getMessage();
				if (data.length < 3 || !check(data[0])) {
					receiver.send(msg, tick);
				}
			}

			@Override
			public void close() {
				// no-op for proxy
			}
		};
		sequencer.getTransmitter().setReceiver(proxyReceiver);
		sequencer.open();
		setTick(-1L);
	}

	public void setSoundfont(byte[] soundfont) {
		try {
			if (synth.getDefaultSoundbank() != null) {
				synth.unloadAllInstruments(synth.getDefaultSoundbank());
			}
			synth.loadAllInstruments(MidiSystem.getSoundbank(new ByteArrayInputStream(soundfont)));
		} catch (InvalidMidiDataException | IOException ignore) {
		}
	}

	public synchronized void setVolume(int velocity, int volume) {
		setVolume(velocity, volume, -1L);
	}

	public void play(Sequence sequence, int loop, int volume) {
		try {
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(loop == 1 ? -1 : 0);
			setVolume(0, volume, -1L);
			sequencer.start();
		} catch (InvalidMidiDataException ignore) {
		}
	}

	public boolean running() {
		return sequencer.isRunning();
	}

	public void stop() {
		sequencer.stop();
	}

	public void setTick(long tick) {
		if (tick == -1L) {
			sequencer.setTickPosition(0L);
			return;
		}
		sequencer.setTickPosition(tick);
	}

	private void setVolume(int velocity, int volume, long tick) {
		if (velocity != 0 || volume > this.volume) {
			setChannels(7, volume);
			setChannels(39, volume);
			this.volume = volume;
		}

		setTick(tick);
	}

	private boolean check(int status) {
		// Swallow MIDI control change messages (0xB0 .. 0xBF); volume handled separately
		return (status & 0xF0) == 176;
	}

	private void setChannels(int control, int value) {
		for (int i = 0; i < 16; i++) {
			if (i != 9) {
				ShortMessage msg = new ShortMessage();
				try {
					msg.setMessage(176, i, control, value);
					receiver.send(msg, -1L);
				} catch (InvalidMidiDataException ignore) {
				}
			}
		}
	}

	@Override
	public void send(MidiMessage msg, long tick) {
		byte[] data = msg.getMessage();
		if (data.length >= 3) {
			if (!check(data[0])) {
				receiver.send(msg, tick);
			}
		}
	}

	@Override
	public void close() {
		sequencer.close();
		receiver.close();
		synth.close();
		proxyReceiver.close();
	}
}
