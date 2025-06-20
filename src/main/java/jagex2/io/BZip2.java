package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class BZip2 {

	@ObfuscatedName("sb.a")
	public static BZip2State state = new BZip2State();

	@ObfuscatedName("sb.a([BI[BII)I")
	public static int decompress(byte[] decompressed, int length, byte[] stream, int avail_in, int next_in) {
		BZip2State lock = state;
		synchronized (lock) {
			state.stream = stream;
			state.next_in = next_in;
			state.decompressed = decompressed;
			state.next_out = 0;
			state.avail_in = avail_in;
			state.avail_out = length;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.total_in_lo32 = 0;
			state.total_in_hi32 = 0;
			state.total_out_lo32 = 0;
			state.total_out_hi32 = 0;
			state.currBlockNo = 0;
			decompress(state);
			return length - state.avail_out;
		}
	}

	// unRLE_obuf_to_output_FAST
	@ObfuscatedName("sb.a(Ltb;)V")
	public static void finish(BZip2State s) {
		byte c_state_out_ch = s.state_out_ch;
		int c_state_out_len = s.state_out_len;
		int c_nblock_used = s.c_nblock_used;
		int c_k0 = s.k0;
		int[] c_tt = BZip2State.tt;
		int c_tPos = s.tPos;
		byte[] cs_decompressed = s.decompressed;
		int cs_next_out = s.next_out;
		int cs_avail_out = s.avail_out;
		int avail_out_INIT = cs_avail_out;
		int s_save_nblockPP = s.save_nblock + 1;

		label67: while (true) {
			if (c_state_out_len > 0) {
				while (true) {
					if (cs_avail_out == 0) {
						break label67;
					}

					if (c_state_out_len == 1) {
						if (cs_avail_out == 0) {
							c_state_out_len = 1;
							break label67;
						}

						cs_decompressed[cs_next_out] = c_state_out_ch;
						cs_next_out++;
						cs_avail_out--;
						break;
					}

					cs_decompressed[cs_next_out] = c_state_out_ch;
					c_state_out_len--;
					cs_next_out++;
					cs_avail_out--;
				}
			}

			boolean next = true;
			byte k1;
			while (next) {
				next = false;
				if (c_nblock_used == s_save_nblockPP) {
					c_state_out_len = 0;
					break label67;
				}

				// macro: BZ_GET_FAST_C
				c_state_out_ch = (byte) c_k0;
				c_tPos = c_tt[c_tPos];
				k1 = (byte) (c_tPos & 0xFF);
				c_tPos >>= 8;
				c_nblock_used++;

				if (c_k0 != k1) {
					c_k0 = k1;
					if (cs_avail_out == 0) {
						c_state_out_len = 1;
						break label67;
					}

					cs_decompressed[cs_next_out] = c_state_out_ch;
					cs_next_out++;
					cs_avail_out--;
					next = true;
				} else if (c_nblock_used == s_save_nblockPP) {
					if (cs_avail_out == 0) {
						c_state_out_len = 1;
						break label67;
					}

					cs_decompressed[cs_next_out] = c_state_out_ch;
					cs_next_out++;
					cs_avail_out--;
					next = true;
				}
			}

			// macro: BZ_GET_FAST_C
			c_state_out_len = 2;
			c_tPos = c_tt[c_tPos];
			k1 = (byte) (c_tPos & 0xFF);
			c_tPos >>= 8;
			c_nblock_used++;

			if (c_nblock_used != s_save_nblockPP) {
				if (c_k0 == k1) {
					// macro: BZ_GET_FAST_C
					c_state_out_len = 3;
					c_tPos = c_tt[c_tPos];
					k1 = (byte) (c_tPos & 0xFF);
					c_tPos >>= 8;
					c_nblock_used++;

					if (c_nblock_used != s_save_nblockPP) {
						if (c_k0 == k1) {
							// macro: BZ_GET_FAST_C
							c_tPos = c_tt[c_tPos];
							k1 = (byte) (c_tPos & 0xFF);
							c_tPos >>= 8;
							c_nblock_used++;

							// macro: BZ_GET_FAST_C
							c_state_out_len = (k1 & 0xFF) + 4;
							c_tPos = c_tt[c_tPos];
							c_k0 = (byte) (c_tPos & 0xFF);
							c_tPos >>= 8;
							c_nblock_used++;
						} else {
							c_k0 = k1;
						}
					}
				} else {
					c_k0 = k1;
				}
			}
		}

		int var23 = s.total_out_lo32;
		s.total_out_lo32 += avail_out_INIT - cs_avail_out;
		if (s.total_out_lo32 < var23) {
			s.total_out_hi32++;
		}

		// save
		s.state_out_ch = c_state_out_ch;
		s.state_out_len = c_state_out_len;
		s.c_nblock_used = c_nblock_used;
		s.k0 = c_k0;
		BZip2State.tt = c_tt;
		s.tPos = c_tPos;
		s.decompressed = cs_decompressed;
		s.next_out = cs_next_out;
		s.avail_out = cs_avail_out;
		// end save
	}

	@ObfuscatedName("sb.b(Ltb;)V")
	public static void decompress(BZip2State s) {
		// libbzip2 uses these variables in a save area
		/*boolean save_i = false;
		boolean save_j = false;
		boolean save_t = false;
		boolean save_alphaSize = false;
		boolean save_nGroups = false;
		boolean save_nSelectors = false;
		boolean save_EOB = false;
		boolean save_groupNo = false;
		boolean save_groupPos = false;
		boolean save_nextSym = false;
		boolean save_nblockMAX = false;
		boolean save_nblock = false;
		boolean save_es = false;
		boolean save_N = false;
		boolean save_curr = false;
		boolean save_zt = false;
		boolean save_zn = false;
		boolean save_zvec = false;
		boolean save_zj = false;*/

		int gMinlen = 0;
		int[] gLimit = null;
		int[] gBase = null;
		int[] gPerm = null;

		s.blockSize100k = 1;
		if (BZip2State.tt == null) {
			BZip2State.tt = new int[s.blockSize100k * 100000];
		}

		boolean reading = true;
		while (reading) {
			byte uc = getUnsignedChar(s);
			if (uc == 0x17) {
				return;
			}

			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);

			s.currBlockNo++;

			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);
			uc = getUnsignedChar(s);

			uc = getBit(s);
			if (uc == 0) {
				s.blockRandomized = false;
			} else {
				s.blockRandomized = true;
			}

			if (s.blockRandomized) {
				System.out.println("PANIC! RANDOMISED BLOCK!");
			}

			s.origPtr = 0;
			uc = getUnsignedChar(s);
			s.origPtr = s.origPtr << 8 | uc & 0xFF;
			uc = getUnsignedChar(s);
			s.origPtr = s.origPtr << 8 | uc & 0xFF;
			uc = getUnsignedChar(s);
			s.origPtr = s.origPtr << 8 | uc & 0xFF;

			// Receive the mapping table
			for (int i = 0; i < 16; i++) {
				uc = getBit(s);
				if (uc == 1) {
					s.inUse16[i] = true;
				} else {
					s.inUse16[i] = false;
				}
			}

			for (int i = 0; i < 256; i++) {
				s.inUse[i] = false;
			}

			for (int i = 0; i < 16; i++) {
				if (s.inUse16[i]) {
					for (int j = 0; j < 16; j++) {
						uc = getBit(s);
						if (uc == 1) {
							s.inUse[i * 16 + j] = true;
						}
					}
				}
			}
			makeMaps(s);
			int alphaSize = s.nInUse + 2;

			int nGroups = getBits(3, s);
			int nSelectors = getBits(15, s);
			for (int i = 0; i < nSelectors; i++) {
				int j = 0;
				while (true) {
					uc = getBit(s);
					if (uc == 0) {
						s.selectorMtf[i] = (byte) j;
						break;
					}

					j++;
				}
			}

			// Undo the MTF values for the selectors
			byte[] pos = new byte[BZip2State.BZ_N_GROUPS];
			byte v = 0;
			while (v < nGroups) {
				pos[v] = v++;
			}

			for (int i = 0; i < nSelectors; i++) {
				v = s.selectorMtf[i];
				byte tmp = pos[v];
				while (v > 0) {
					pos[v] = pos[v - 1];
					v--;
				}
				pos[0] = tmp;
				s.selector[i] = tmp;
			}

			// Now the coding tables
			for (int t = 0; t < nGroups; t++) {
				int curr = getBits(5, s);

				for (int i = 0; i < alphaSize; i++) {
					while (true) {
						uc = getBit(s);
						if (uc == 0) {
							s.len[t][i] = (byte) curr;
							break;
						}

						uc = getBit(s);
						if (uc == 0) {
							curr++;
						} else {
							curr--;
						}
					}
				}
			}

			// Create the Huffman decoding tables
			for (int t = 0; t < nGroups; t++) {
				byte minLen = 32;
				byte maxLen = 0;

				for (int i = 0; i < alphaSize; i++) {
					if (s.len[t][i] > maxLen) {
						maxLen = s.len[t][i];
					}

					if (s.len[t][i] < minLen) {
						minLen = s.len[t][i];
					}
				}

				createDecodeTables(s.limit[t], s.base[t], s.perm[t], s.len[t], minLen, maxLen, alphaSize);
				s.minLens[t] = minLen;
			}

			// Now the MTF values
			int EOB = s.nInUse + 1;
			int nblockMAX = s.blockSize100k * 100000;
			int groupNo = -1;
			byte groupPos = 0;

			for (int i = 0; i <= 255; i++) {
				s.unzftab[i] = 0;
			}

			// MTF init
			int kk = BZip2State.MTFA_SIZE - 1;
			for (int ii = 256 / BZip2State.MTFL_SIZE - 1; ii >= 0; ii--) {
				for (int jj = BZip2State.MTFL_SIZE - 1; jj >= 0; jj--) {
					s.mtfa[kk] = (byte) (ii * 16 + jj);
					kk--;
				}

				s.mtfbase[ii] = kk + 1;
			}
			// end MTF init

			int nblock = 0;

			// macro: GET_MTF_VAL
			if (groupPos == 0) {
				groupNo++;
				groupPos = 50;
				byte gSel = s.selector[groupNo];
				gMinlen = s.minLens[gSel];
				gLimit = s.limit[gSel];
				gPerm = s.perm[gSel];
				gBase = s.base[gSel];
			}

			int gPos = groupPos - 1;
			int zn = gMinlen;
			int zvec;
			byte zj;
			for (zvec = getBits(gMinlen, s); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
				zn++;
				zj = getBit(s);
			}

			int nextSym = gPerm[zvec - gBase[zn]];
			while (EOB != nextSym) {
				if (nextSym == BZip2State.BZ_RUNA || nextSym == BZip2State.BZ_RUNB) {
					int es = -1;
					int N = 1;

					do {
						if (nextSym == BZip2State.BZ_RUNA) {
							es += N;
						} else if (nextSym == BZip2State.BZ_RUNB) {
							es += N * 2;
						}

						N *= 2;

						// macro: GET_MTF_VAL
						if (gPos == 0) {
							groupNo++;
							gPos = 50;
							byte gSel = s.selector[groupNo];
							gMinlen = s.minLens[gSel];
							gLimit = s.limit[gSel];
							gPerm = s.perm[gSel];
							gBase = s.base[gSel];
						}

						gPos--;
						zn = gMinlen;
						for (zvec = getBits(gMinlen, s); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
							zn++;
							zj = getBit(s);
						}

						nextSym = gPerm[zvec - gBase[zn]];
					} while (nextSym == BZip2State.BZ_RUNA || nextSym == BZip2State.BZ_RUNB);

					es++;
					byte var84 = s.seqToUnseq[s.mtfa[s.mtfbase[0]] & 0xFF];
					s.unzftab[var84 & 0xFF] += es;

					while (es > 0) {
						BZip2State.tt[nblock] = var84 & 0xFF;
						nblock++;
						es--;
					}
				} else {
					// uc = MTF ( nextSym-1 )

					int nn = nextSym - 1;

					if (nn < BZip2State.MTFL_SIZE) {
						// avoid general-case expense
						int pp = s.mtfbase[0];
						uc = s.mtfa[nn + pp];

						while (nn > 3) {
							int z = nn + pp;
							s.mtfa[z] = s.mtfa[z - 1];
							s.mtfa[z - 1] = s.mtfa[z - 2];
							s.mtfa[z - 2] = s.mtfa[z - 3];
							s.mtfa[z - 3] = s.mtfa[z - 4];
							nn -= 4;
						}

						while (nn > 0) {
							s.mtfa[nn + pp] = s.mtfa[nn + pp - 1];
							nn--;
						}

						s.mtfa[pp] = uc;
					} else {
						// general case
						int lno = nn / BZip2State.MTFL_SIZE;
						int off = nn % BZip2State.MTFL_SIZE;

						int pp = s.mtfbase[lno] + off;
						uc = s.mtfa[pp];

						while (pp > s.mtfbase[lno]) {
							s.mtfa[pp] = s.mtfa[pp - 1];
							pp--;
						}

						s.mtfbase[lno]++;

						while (lno > 0) {
							s.mtfbase[lno]--;
							s.mtfa[s.mtfbase[lno]] = s.mtfa[s.mtfbase[lno - 1] + 16 - 1];
							lno--;
						}

						s.mtfbase[0]--;
						s.mtfa[s.mtfbase[0]] = uc;

						if (s.mtfbase[0] == 0) {
							kk = BZip2State.MTFA_SIZE - 1;

							for (int ii = 256 / BZip2State.MTFL_SIZE - 1; ii >= 0; ii--) {
								for (int jj = BZip2State.MTFL_SIZE - 1; jj >= 0; jj--) {
									s.mtfa[kk] = s.mtfa[s.mtfbase[ii] + jj];
									kk--;
								}

								s.mtfbase[ii] = kk + 1;
							}
						}
					}
					// end uc = MTF ( nextSym-1 )

					s.unzftab[s.seqToUnseq[uc & 0xFF] & 0xFF]++;
					BZip2State.tt[nblock] = s.seqToUnseq[uc & 0xFF] & 0xFF;
					nblock++;

					// macro: GET_MTF_VAL
					if (gPos == 0) {
						groupNo++;
						gPos = 50;
						byte gSel = s.selector[groupNo];
						gMinlen = s.minLens[gSel];
						gLimit = s.limit[gSel];
						gPerm = s.perm[gSel];
						gBase = s.base[gSel];
					}

					gPos--;
					zn = gMinlen;
					for (zvec = getBits(gMinlen, s); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
						zn++;
						zj = getBit(s);
					}
					nextSym = gPerm[zvec - gBase[zn]];
				}
			}

			// Set up cftab to facilitate generation of T^(-1)

			// Actually generate cftab
			s.cftab[0] = 0;

			for (int i = 1; i <= 256; i++) {
				s.cftab[i] = s.unzftab[i - 1];
			}

			for (int i = 1; i <= 256; i++) {
				s.cftab[i] += s.cftab[i - 1];
			}

			s.state_out_len = 0;
			s.state_out_ch = 0;

			for (int i = 0; i < nblock; i++) {
				uc = (byte) (BZip2State.tt[i] & 0xFF);
				BZip2State.tt[s.cftab[uc & 0xFF]] |= i << 8;
				s.cftab[uc & 0xFF]++;
			}

			s.tPos = BZip2State.tt[s.origPtr] >> 8;
			s.c_nblock_used = 0;

			// macro: BZ_GET_FAST
			s.tPos = BZip2State.tt[s.tPos];
			s.k0 = (byte) (s.tPos & 0xFF);
			s.tPos >>= 0x8;
			s.c_nblock_used++;

			s.save_nblock = nblock;
			finish(s);

			if (s.save_nblock + 1 == s.c_nblock_used && s.state_out_len == 0) {
				reading = true;
			} else {
				reading = false;
			}
		}
	}

	@ObfuscatedName("sb.c(Ltb;)B")
	public static byte getUnsignedChar(BZip2State s) {
		return (byte) getBits(8, s);
	}

	@ObfuscatedName("sb.d(Ltb;)B")
	public static byte getBit(BZip2State s) {
		return (byte) getBits(1, s);
	}

	@ObfuscatedName("sb.a(ILtb;)I")
	public static int getBits(int n, BZip2State s) {
		while (s.bsLive < n) {
			s.bsBuff = s.bsBuff << 8 | s.stream[s.next_in] & 0xFF;
			s.bsLive += 8;

			s.next_in++;
			s.avail_in--;

			s.total_in_lo32++;
			if (s.total_in_lo32 == 0) {
				s.total_in_hi32++;
			}
		}

		int value = s.bsBuff >> s.bsLive - n & (0x1 << n) - 1;
		s.bsLive -= n;
		return value;
	}

	@ObfuscatedName("sb.e(Ltb;)V")
	public static void makeMaps(BZip2State s) {
		s.nInUse = 0;
		for (int i = 0; i < 256; i++) {
			if (s.inUse[i]) {
				s.seqToUnseq[s.nInUse] = (byte) i;
				s.nInUse++;
			}
		}
	}

	@ObfuscatedName("sb.a([I[I[I[BIII)V")
	public static void createDecodeTables(int[] limit, int[] base, int[] perm, byte[] length, int minLen, int maxLen, int alphaSize) {
		int pp = 0;

		for (int i = minLen; i <= maxLen; i++) {
			for (int j = 0; j < alphaSize; j++) {
				if (length[j] == i) {
					perm[pp] = j;
					pp++;
				}
			}
		}

		for (int i = 0; i < BZip2State.BZ_MAX_CODE_LEN; i++) {
			base[i] = 0;
		}

		for (int i = 0; i < alphaSize; i++) {
			base[length[i] + 1]++;
		}

		for (int i = 1; i < BZip2State.BZ_MAX_CODE_LEN; i++) {
			base[i] += base[i - 1];
		}

		for (int i = 0; i < BZip2State.BZ_MAX_CODE_LEN; i++) {
			limit[i] = 0;
		}

		int vec = 0;
		for (int i = minLen; i <= maxLen; i++) {
			vec += base[i + 1] - base[i];
			limit[i] = vec - 1;
			vec <<= 1;
		}

		for (int i = minLen + 1; i <= maxLen; i++) {
			base[i] = (limit[i - 1] + 1 << 1) - base[i];
		}
	}
}
