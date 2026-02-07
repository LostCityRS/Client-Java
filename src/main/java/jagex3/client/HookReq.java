package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.iftype.IfType;
import jagex3.datastruct.Linkable;
import jagex3.util.JagString;

@ObfuscatedName("bd")
public final class HookReq extends Linkable {

	@ObfuscatedName("bd.v")
	public int keyCode;

	@ObfuscatedName("bd.A")
	public int mouseX;

	@ObfuscatedName("bd.B")
	public int opindex;

	@ObfuscatedName("bd.D")
	public int keyChar;

	@ObfuscatedName("bd.G")
	public int mouseY;

	@ObfuscatedName("bd.z")
	public JagString opbase;

	@ObfuscatedName("bd.y")
	public IfType drop;

	@ObfuscatedName("bd.F")
	public IfType component;

	@ObfuscatedName("bd.E")
	public Object[] onop;

}
