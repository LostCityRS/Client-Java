package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList2 {

	@ObfuscatedName("pb.b")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("pb.a")
	public final int field744 = 195;

	@ObfuscatedName("pb.c")
	public Linkable2 cursor;

	public LinkList2(int arg0) {
		sentinel.next2 = sentinel;
		sentinel.prev2 = sentinel;
	}

	@ObfuscatedName("pb.a(Lw;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = sentinel.prev2;
		arg0.next2 = sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("pb.a()Lw;")
	public Linkable2 popFront() {
		Linkable2 var1 = sentinel.next2;
		if (var1 == sentinel) {
			return null;
		}
		var1.unlink2();
		return var1;
	}

	@ObfuscatedName("pb.a(Z)Lw;")
	public Linkable2 next() {
		Linkable2 var1 = cursor;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.next2;
		return var1;
	}

	@ObfuscatedName("pb.b()Lw;")
	public Linkable2 head() {
		Linkable2 var1 = sentinel.next2;
		if (var1 == sentinel) {
			cursor = null;
			return null;
		}
		cursor = var1.next2;
		return var1;
	}

	@ObfuscatedName("pb.c()I")
	public int size() {
		int var1 = 0;
		for (Linkable2 var2 = sentinel.next2; var2 != sentinel; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
