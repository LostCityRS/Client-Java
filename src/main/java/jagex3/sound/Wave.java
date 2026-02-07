package jagex3.sound;

import deob.ObfuscatedName;

@ObfuscatedName("ib")
public final class Wave extends PcmStreamable {

	@ObfuscatedName("ib.s")
	public boolean field1339;

	@ObfuscatedName("ib.t")
	public int field1340;

	@ObfuscatedName("ib.u")
	public int field1341;

	@ObfuscatedName("ib.v")
	public int field1342;

	@ObfuscatedName("ib.w")
	public byte[] field1343;

	public Wave(int arg0, byte[] arg1, int arg2, int arg3) {
		this.field1342 = 22050;
		this.field1343 = arg1;
		this.field1340 = arg2;
		this.field1341 = arg3;
	}

	public Wave(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
		this.field1342 = arg0;
		this.field1343 = arg1;
		this.field1340 = arg2;
		this.field1341 = arg3;
		this.field1339 = arg4;
	}

	@ObfuscatedName("ib.a(Led;)Lib;")
	public Wave method453(Decimator arg0) {
		this.field1343 = arg0.method280(this.field1343);
		this.field1342 = arg0.method282(this.field1342);
		if (this.field1340 == this.field1341) {
			this.field1340 = this.field1341 = arg0.method284(this.field1340);
		} else {
			this.field1340 = arg0.method284(this.field1340);
			this.field1341 = arg0.method284(this.field1341);
			if (this.field1340 == this.field1341) {
				this.field1340--;
			}
		}
		return this;
	}
}
