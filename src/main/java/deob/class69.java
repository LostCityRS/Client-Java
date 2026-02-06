package deob;

@ObfuscatedName("k")
public final class class69 {

	@ObfuscatedName("k.a")
	public int field1614;

	@ObfuscatedName("k.b")
	public int field1615 = 2;

	@ObfuscatedName("k.c")
	public int field1616;

	@ObfuscatedName("k.d")
	public int[] field1617 = new int[2];

	@ObfuscatedName("k.e")
	public int[] field1618 = new int[2];

	@ObfuscatedName("k.f")
	public int field1619;

	@ObfuscatedName("k.g")
	public int field1620;

	@ObfuscatedName("k.h")
	public int field1621;

	@ObfuscatedName("k.i")
	public int field1622;

	@ObfuscatedName("k.j")
	public int field1623;

	@ObfuscatedName("k.k")
	public int field1624;

	public class69() {
		this.field1617[0] = 0;
		this.field1617[1] = 65535;
		this.field1618[0] = 0;
		this.field1618[1] = 65535;
	}

	@ObfuscatedName("k.a(I)I")
	public int method572(int arg0) {
		if (this.field1621 >= this.field1622) {
			this.field1620 = this.field1618[this.field1624++] << 15;
			if (this.field1624 >= this.field1615) {
				this.field1624 = this.field1615 - 1;
			}
			this.field1622 = (int) ((double) this.field1617[this.field1624] / 65536.0D * (double) arg0);
			if (this.field1622 > this.field1621) {
				this.field1623 = ((this.field1618[this.field1624] << 15) - this.field1620) / (this.field1622 - this.field1621);
			}
		}
		this.field1620 += this.field1623;
		this.field1621++;
		return this.field1620 - this.field1623 >> 15;
	}

	@ObfuscatedName("k.a(Ljd;)V")
	public void method573(class66 arg0) {
		this.field1619 = arg0.method532();
		this.field1616 = arg0.method538();
		this.field1614 = arg0.method538();
		this.method575(arg0);
	}

	@ObfuscatedName("k.a()V")
	public void method574() {
		this.field1622 = 0;
		this.field1624 = 0;
		this.field1623 = 0;
		this.field1620 = 0;
		this.field1621 = 0;
	}

	@ObfuscatedName("k.b(Ljd;)V")
	public void method575(class66 arg0) {
		this.field1615 = arg0.method532();
		this.field1617 = new int[this.field1615];
		this.field1618 = new int[this.field1615];
		for (int var2 = 0; var2 < this.field1615; var2++) {
			this.field1617[var2] = arg0.method531();
			this.field1618[var2] = arg0.method531();
		}
	}
}
