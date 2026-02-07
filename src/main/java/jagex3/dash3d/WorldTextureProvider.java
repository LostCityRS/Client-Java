package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ua")
public final class WorldTextureProvider implements TextureProvider {

	@ObfuscatedName("ua.n")
	public final Texture[] field3226;

	@ObfuscatedName("ua.o")
	public LinkList field3227 = new LinkList();

	@ObfuscatedName("ua.q")
	public double field3229 = 1.0D;

	@ObfuscatedName("ua.r")
	public final int field3230;

	@ObfuscatedName("ua.s")
	public int field3231 = 0;

	@ObfuscatedName("ua.t")
	public int field3232 = 128;

	@ObfuscatedName("ua.v")
	public final Js5 field3234;

	public WorldTextureProvider(Js5 arg0, Js5 arg1, int arg2, double arg3, int arg4) {
		this.field3232 = arg4;
		this.field3229 = arg3;
		this.field3234 = arg1;
		this.field3230 = 20;
		this.field3231 = this.field3230;
		int[] var7 = arg0.method207(0);
		int var8 = var7.length;
		this.field3226 = new Texture[arg0.method200(0)];
		for (int var9 = 0; var9 < var8; var9++) {
			Packet var10 = new Packet(arg0.getFile(0, var7[var9]));
			this.field3226[var7[var9]] = new Texture(var10);
		}
	}

	@ObfuscatedName("ua.a(ID)V")
	public void method1048(double arg0) {
		this.field3229 = arg0;
		this.method1050();
	}

	@ObfuscatedName("ua.a(BI)V")
	public void method1049(int arg0) {
		for (int var2 = 0; var2 < this.field3226.length; var2++) {
			Texture var3 = this.field3226[var2];
			if (var3 != null && var3.field3356 != 0 && var3.field3365) {
				var3.method1102(arg0);
				var3.field3365 = false;
			}
		}
	}

	@ObfuscatedName("ua.a(ZI)Z")
	@Override
	public boolean method559(int arg0) {
		return this.field3232 == 64;
	}

	@ObfuscatedName("ua.a(I)V")
	public void method1050() {
		for (int var1 = 0; var1 < this.field3226.length; var1++) {
			if (this.field3226[var1] != null) {
				this.field3226[var1].method1103();
			}
		}
		this.field3227 = new LinkList();
		this.field3231 = this.field3230;
	}

	@ObfuscatedName("ua.b(II)Z")
	@Override
	public boolean method561(int arg0) {
		return this.field3226[arg0].field3359;
	}

	@ObfuscatedName("ua.a(IZ)I")
	@Override
	public int method558(int arg0) {
		return this.field3226[arg0] == null ? 0 : this.field3226[arg0].field3360;
	}

	@ObfuscatedName("ua.a(II)[I")
	@Override
	public int[] method560(int arg0) {
		Texture var2 = this.field3226[arg0];
		if (var2 != null) {
			if (var2.field3361 != null) {
				this.field3227.pushFront(var2);
				var2.field3365 = true;
				return var2.field3361;
			}
			boolean var3 = var2.method1105(this.field3229, this.field3232, this.field3234);
			if (var3) {
				if (this.field3231 == 0) {
					Texture var4 = (Texture) this.field3227.pop();
					var4.method1103();
				} else {
					this.field3231--;
				}
				this.field3227.pushFront(var2);
				var2.field3365 = true;
				return var2.field3361;
			}
		}
		return null;
	}
}
