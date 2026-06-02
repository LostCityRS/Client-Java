package jagex3.client;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("m")
public final class StockMarketSlot {

	@ObfuscatedName("m.h")
	public int count;

	@ObfuscatedName("m.l")
	public int price;

	@ObfuscatedName("m.m")
	public int item;

	@ObfuscatedName("m.n")
	public byte status;

	@ObfuscatedName("m.o")
	public int completedCount;

	@ObfuscatedName("m.q")
	public int completedGold;

	public StockMarketSlot() {
	}

	public StockMarketSlot(Packet arg0) {
		this.status = arg0.g1b();
		this.item = arg0.g2();
		this.price = arg0.g4();
		this.count = arg0.g4();
		this.completedCount = arg0.g4();
		this.completedGold = arg0.g4();
	}

	@ObfuscatedName("m.a(I)I")
	public int getType() {
		return (this.status & 0x8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("m.b(B)I")
	public int getState() {
		return this.status & 0x7;
	}
}
