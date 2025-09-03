package jagex2.client.sign;

import javax.sound.midi.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class MidiPlayer implements Receiver {
	private final int[] channels = new int[16];
	private final Receiver receiver;
	private final Sequencer sequencer;
	private final Synthesizer synth;
	// Receiver used by the Sequencer's Transmitter to avoid leaking `this` from constructor
	private final Receiver proxyReceiver;
	private int volume;

	public MidiPlayer() throws Exception {
		resetChannels();
		synth = MidiSystem.getSynthesizer();
		synth.open();
		receiver = synth.getReceiver();
		sequencer = MidiSystem.getSequencer(false);
		// Create a proxy receiver to forward messages through our processing without exposing `this`
		proxyReceiver = new Receiver() {
			@Override
			public void send(MidiMessage msg, long tick) {
				byte[] data = msg.getMessage();
				if (data.length < 3 || !check(data[0], data[1], data[2], tick)) {
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

	public void stop() {
		sequencer.stop();
		setTick(-1L);
	}

	public boolean running() {
		return sequencer.isRunning();
	}

	public void resetVolume(int volume) {
		resetVolume(volume, -1L);
	}

	private void setTick(long tick) {
		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 176, 123, 0, tick);
		}

		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 176, 120, 0, tick);
		}

		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 176, 121, 0, tick);
		}

		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 176, 0, 0, tick);
		}

		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 176, 32, 0, tick);
		}

		for (int i = 0; i != 16; ++i) {
			sendMessage(i + 192, 0, 0, tick);
		}
	}

	private void sendMessage(int status, int data1, int data2, long tick) {
		try {
			ShortMessage msg = new ShortMessage();
			msg.setMessage(status, data1, data2);
			receiver.send(msg, tick);
		} catch (InvalidMidiDataException ignore) {
		}
	}

	public void closeImpl() {
		sequencer.close();
		receiver.close();
	}

	private void resetVolume(int volume, long tick) {
		this.volume = volume;
		resetChannels();
		setVolume(tick);
	}

	private void setVolume(long tick) {
		for (int i = 0; i != 16; ++i) {
			int vol = getVolume(i);
			sendMessage(i + 176, 7, vol >>> 7, tick);
			sendMessage(i + 176, 39, vol & 0x7f, tick);
		}
	}

	private void setVolume(int velocity, int volume, long tick) {
		volume = (int) ((double) volume * Math.pow(0.1D, (double) velocity * 0.0005D) + 0.5D);
		if (this.volume == volume) {
			return;
		}

		this.volume = volume;
		setVolume(tick);
	}

	private int getVolume(int channel) {
		int ch = channels[channel];
		int scaled = ((ch * volume) >>> 8) * ch;
		return (int) (Math.sqrt(scaled) + 0.5D);
	}

	private void resetChannels() {
		for (int i = 0; i != 16; ++i) {
			channels[i] = 12800;
		}
	}

	private boolean check(int status, int data1, int data2, long tick) {
		if ((status & 0xf0) == 176) {
			if (data1 == 121) {
				sendMessage(status, data1, data2, tick);
				int channel = status & 0xf;
				channels[channel] = 12800;
					int newVol = getVolume(channel);
					sendMessage(status, 7, newVol >>> 7, tick);
					sendMessage(status, 39, newVol & 0x7f, tick);
				return true;
			}
			if (data1 == 7 || data1 == 39) {
				int channel = status & 0xf;
				if (data1 == 7) {
					channels[channel] = (channels[channel] & 0x7f) | (data2 << 7);
				} else {
					channels[channel] = (channels[channel] & 0x3f80) | data2;
				}

					int newVol = getVolume(channel);
					sendMessage(status, 7, newVol >>> 7, tick);
					sendMessage(status, 39, newVol & 0x7f, tick);
				return true;
			}
		}
		return false;
	}

	@Override
	public synchronized void send(MidiMessage msg, long tick) {
		byte[] data = msg.getMessage();
		if (data.length < 3 || !check(data[0], data[1], data[2], tick)) {
			receiver.send(msg, tick);
		}
	}

	@Override
	public void close() {
		closeImpl();
	}
}
