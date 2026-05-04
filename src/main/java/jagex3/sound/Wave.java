package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("tf")
public final class Wave extends PcmStreamable {

	@ObfuscatedName("tf.u")
	public int field4028;

	@ObfuscatedName("tf.v")
	public int field4029;

	@ObfuscatedName("tf.w")
	public boolean field4030;

	@ObfuscatedName("tf.x")
	public byte[] field4031;

	@ObfuscatedName("tf.y")
	public int field4032;

	public Wave(int arg0, byte[] arg1, int arg2, int arg3) {
		this.field4028 = 22050;
		this.field4031 = arg1;
		this.field4032 = arg2;
		this.field4029 = arg3;
	}

	public Wave(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
		this.field4028 = arg0;
		this.field4031 = arg1;
		this.field4032 = arg2;
		this.field4029 = arg3;
		this.field4030 = arg4;
	}

	@ObfuscatedName("tf.a(Lqe;)Ltf;")
	public Wave method1453(Decimator arg0) {
		this.field4031 = arg0.method1278(this.field4031);
		this.field4028 = arg0.method1280(this.field4028);
		if (this.field4032 == this.field4029) {
			this.field4032 = this.field4029 = arg0.method1279(this.field4032);
		} else {
			this.field4032 = arg0.method1279(this.field4032);
			this.field4029 = arg0.method1279(this.field4029);
			if (this.field4032 == this.field4029) {
				this.field4032--;
			}
		}
		return this;
	}
}
