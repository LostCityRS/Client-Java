package deob;

@ObfuscatedName("sa")
public final class class197 {

	@ObfuscatedName("sa.a")
	public final short[] field3774;

	@ObfuscatedName("sa.b")
	public static final short[] field3775 = new short[500];

	@ObfuscatedName("sa.c")
	public static final short[] field3776 = new short[500];

	@ObfuscatedName("sa.d")
	public boolean field3777 = false;

	@ObfuscatedName("sa.e")
	public static final short[] field3778 = new short[500];

	@ObfuscatedName("sa.f")
	public int field3779 = -1;

	@ObfuscatedName("sa.g")
	public final short[] field3780;

	@ObfuscatedName("sa.h")
	public final short[] field3781;

	@ObfuscatedName("sa.i")
	public static final short[] field3782 = new short[500];

	@ObfuscatedName("sa.j")
	public final short[] field3783;

	@ObfuscatedName("sa.k")
	public static final short[] field3784 = new short[500];

	@ObfuscatedName("sa.l")
	public final short[] field3785;

	@ObfuscatedName("sa.m")
	public class78 field3786 = null;

	public class197(byte[] arg0, class78 arg1) {
		this.field3786 = arg1;
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		var3.pos = 2;
		int var5 = var3.g1();
		int var6 = 0;
		int var7 = -1;
		int var8 = -1;
		var4.pos = var3.pos + var5;
		for (int var9 = 0; var9 < var5; var9++) {
			if (this.field3786.field1409[var9] == 0) {
				var7 = var9;
			}
			int var10 = var3.g1();
			if (var10 > 0) {
				if (this.field3786.field1409[var9] == 0) {
					var8 = var9;
				}
				field3775[var6] = (short) var9;
				short var11 = 0;
				if (this.field3786.field1409[var9] == 3) {
					var11 = 128;
				}
				if ((var10 & 0x1) == 0) {
					field3782[var6] = var11;
				} else {
					field3782[var6] = (short) var4.method342();
				}
				if ((var10 & 0x2) == 0) {
					field3778[var6] = var11;
				} else {
					field3778[var6] = (short) var4.method342();
				}
				if ((var10 & 0x4) == 0) {
					field3776[var6] = var11;
				} else {
					field3776[var6] = (short) var4.method342();
				}
				if (this.field3786.field1409[var9] == 2) {
					field3782[var6] = (short) (((field3782[var6] & 0xFF) << 3) + (field3782[var6] >> 8 & 0x7));
					field3778[var6] = (short) (((field3778[var6] & 0xFF) << 3) + (field3778[var6] >> 8 & 0x7));
					field3776[var6] = (short) (((field3776[var6] & 0xFF) << 3) + (field3776[var6] >> 8 & 0x7));
				}
				field3784[var6] = -1;
				if (this.field3786.field1409[var9] >= 1 && this.field3786.field1409[var9] <= 3 && var7 > var8) {
					field3784[var6] = (short) var7;
					var8 = var7;
				}
				var6++;
				if (this.field3786.field1409[var9] == 5) {
					this.field3777 = true;
				}
			}
		}
		if (var4.pos != arg0.length) {
			throw new RuntimeException();
		}
		this.field3779 = var6;
		this.field3781 = new short[var6];
		this.field3783 = new short[var6];
		this.field3780 = new short[var6];
		this.field3785 = new short[var6];
		this.field3774 = new short[var6];
		for (int var12 = 0; var12 < var6; var12++) {
			this.field3781[var12] = field3775[var12];
			this.field3783[var12] = field3782[var12];
			this.field3780[var12] = field3778[var12];
			this.field3785[var12] = field3776[var12];
			this.field3774[var12] = field3784[var12];
		}
	}
}
