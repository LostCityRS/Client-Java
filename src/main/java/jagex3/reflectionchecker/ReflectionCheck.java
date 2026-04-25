package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.PrivilegedRequest;
import jagex3.datastruct.Linkable;

@ObfuscatedName("te")
public final class ReflectionCheck extends Linkable {

	@ObfuscatedName("te.jb")
	public int[] type;

	@ObfuscatedName("te.kb")
	public int[] error;

	@ObfuscatedName("te.lb")
	public PrivilegedRequest[] method;

	@ObfuscatedName("te.mb")
	public PrivilegedRequest[] field;

	@ObfuscatedName("te.ob")
	public byte[][][] methodArgs;

	@ObfuscatedName("te.pb")
	public int size;

	@ObfuscatedName("te.ub")
	public int[] fieldValue;

	@ObfuscatedName("te.vb")
	public int id;
}
