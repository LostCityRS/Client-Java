package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("rc")
public final class VarpType {

	@ObfuscatedName("rc.d")
	public static int numDefinitions;

	@ObfuscatedName("rc.e")
	public static VarpType[] list;

	@ObfuscatedName("rc.a")
	public int field1196 = -550;

	@ObfuscatedName("rc.b")
	public static final boolean field1197 = true;

	@ObfuscatedName("rc.c")
	public static final int field1198 = 810;

	@ObfuscatedName("rc.f")
	public static int field1201;

	@ObfuscatedName("rc.g")
	public static int[] field1202;

	@ObfuscatedName("rc.h")
	public String field1203;

	@ObfuscatedName("rc.i")
	public int field1204;

	@ObfuscatedName("rc.j")
	public int field1205;

	@ObfuscatedName("rc.k")
	public boolean field1206 = false;

	@ObfuscatedName("rc.l")
	public boolean field1207 = true;

	@ObfuscatedName("rc.m")
	public int clientCode;

	@ObfuscatedName("rc.n")
	public boolean field1209 = false;

	@ObfuscatedName("rc.o")
	public int field1210;

	@ObfuscatedName("rc.p")
	public int field1211;

	@ObfuscatedName("rc.q")
	public boolean field1212 = false;

	@ObfuscatedName("rc.r")
	public int field1213 = -1;

	@ObfuscatedName("rc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null), 15787);
		field1201 = 0;
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarpType[numDefinitions];
		}
		if (field1202 == null) {
			field1202 = new int[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarpType();
			}
			list[var2].decode(field1198, var2, var1);
		}
		if (var1.pos != var1.data.length) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(IILlb;)V")
	public void decode(int arg0, int arg1, Packet arg2) {
		if (arg0 <= 0) {
			field1196 = 68;
		}
		while (true) {
			int var4 = arg2.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				field1204 = arg2.g1();
			} else if (var4 == 2) {
				field1205 = arg2.g1();
			} else if (var4 == 3) {
				field1206 = true;
				field1202[field1201++] = arg1;
			} else if (var4 == 4) {
				field1207 = false;
			} else if (var4 == 5) {
				clientCode = arg2.g2();
			} else if (var4 == 6) {
				field1209 = true;
			} else if (var4 == 7) {
				field1210 = arg2.g4();
			} else if (var4 == 8) {
				field1211 = 1;
				field1212 = true;
			} else if (var4 == 10) {
				field1203 = arg2.gstr();
			} else if (var4 == 11) {
				field1212 = true;
			} else if (var4 == 12) {
				field1213 = arg2.g4();
			} else if (var4 == 13) {
				field1211 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}
}
