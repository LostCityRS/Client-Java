package jagex3.client;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("m")
public final class StockMarketSlot {

	@ObfuscatedName("m.h")
	public int field2450;

	@ObfuscatedName("m.l")
	public int field2454;

	@ObfuscatedName("m.m")
	public int field2455;

	@ObfuscatedName("m.n")
	public byte field2456;

	@ObfuscatedName("m.o")
	public int field2457;

	@ObfuscatedName("m.q")
	public int field2459;

	public StockMarketSlot() {
	}

	public StockMarketSlot(Packet arg0) {
		this.field2456 = arg0.g1b();
		this.field2455 = arg0.g2();
		this.field2454 = arg0.g4();
		this.field2450 = arg0.g4();
		this.field2457 = arg0.g4();
		this.field2459 = arg0.g4();
	}

	@ObfuscatedName("m.a(I)I")
	public int method882() {
		return (this.field2456 & 0x8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("m.b(B)I")
	public int method886() {
		return this.field2456 & 0x7;
	}
}
