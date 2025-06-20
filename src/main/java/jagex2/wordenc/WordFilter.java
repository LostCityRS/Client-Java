package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class WordFilter {

	@ObfuscatedName("qc.l")
	public static int[] fragments;

	@ObfuscatedName("qc.m")
	public static char[][] badWords;

	@ObfuscatedName("qc.n")
	public static byte[][][] badCombinations;

	@ObfuscatedName("qc.o")
	public static char[][] domains;

	@ObfuscatedName("qc.p")
	public static char[][] tlds;

	@ObfuscatedName("qc.q")
	public static int[] tldstype;

	@ObfuscatedName("qc.r")
	public static final String[] ALLOWLIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops" };

	@ObfuscatedName("qc.a(Lyb;)V")
	public static void unpack(Jagfile wordenc) {
		Packet fragments = new Packet(wordenc.read("fragmentsenc.txt", null));
		Packet bad = new Packet(wordenc.read("badenc.txt", null));
		Packet domain = new Packet(wordenc.read("domainenc.txt", null));
		Packet tld = new Packet(wordenc.read("tldlist.txt", null));
		decodeAll(fragments, bad, domain, tld);
	}

	@ObfuscatedName("qc.a(Lmb;Lmb;Lmb;Lmb;)V")
	public static void decodeAll(Packet fragments, Packet bad, Packet domain, Packet tld) {
		decodeBadWordsTxt(bad);
		decodeDomainsTxt(domain);
		decodeFragmentsTxt(fragments);
		decodeTldsTxt(tld);
	}

	@ObfuscatedName("qc.a(Lmb;I)V")
	public static void decodeTldsTxt(Packet buf) {
		int count = buf.g4();
		tlds = new char[count][];
		tldstype = new int[count];

		for (int i = 0; i < count; i++) {
			tldstype[i] = buf.g1();

			char[] tld = new char[buf.g1()];
			for (int j = 0; j < tld.length; j++) {
				tld[j] = (char) buf.g1();
			}

			tlds[i] = tld;
		}
	}

	@ObfuscatedName("qc.b(Lmb;I)V")
	public static void decodeBadWordsTxt(Packet buf) {
		int count = buf.g4();
		badWords = new char[count][];
		badCombinations = new byte[count][][];

		decodeBadCombinations(badWords, badCombinations, buf);
	}

	@ObfuscatedName("qc.a(ILmb;)V")
	public static void decodeDomainsTxt(Packet buf) {
		int count = buf.g4();
		domains = new char[count][];

		decodeDomains(buf, domains);
	}

	@ObfuscatedName("qc.a(Lmb;Z)V")
	public static void decodeFragmentsTxt(Packet buf) {
		fragments = new int[buf.g4()];
		for (int i = 0; i < fragments.length; i++) {
			fragments[i] = buf.g2();
		}
	}

	@ObfuscatedName("qc.a([[CI[[[BLmb;)V")
	public static void decodeBadCombinations(char[][] badwords, byte[][][] badCombinations, Packet buf) {
		for (int i = 0; i < badwords.length; i++) {
			char[] badword = new char[buf.g1()];
			for (int j = 0; j < badword.length; j++) {
				badword[j] = (char) buf.g1();
			}

			badwords[i] = badword;

			byte[][] combination = new byte[buf.g1()][2];
			for (int j = 0; j < combination.length; j++) {
				combination[j][0] = (byte) buf.g1();
				combination[j][1] = (byte) buf.g1();
			}

			if (combination.length > 0) {
				badCombinations[i] = combination;
			}
		}
	}

	@ObfuscatedName("qc.a(ILmb;[[C)V")
	public static void decodeDomains(Packet arg1, char[][] domains) {
		for (int i = 0; i < domains.length; i++) {
			char[] domain = new char[arg1.g1()];
			for (int j = 0; j < domain.length; j++) {
				domain[j] = (char) arg1.g1();
			}

			domains[i] = domain;
		}
	}

	@ObfuscatedName("qc.a([CI)V")
	public static void filterCharacters(char[] in) {
		int pos = 0;
		for (int i = 0; i < in.length; i++) {
			if (allowCharacter(in[i])) {
				in[pos] = in[i];
			} else {
				in[pos] = ' ';
			}

			if (pos == 0 || in[pos] != ' ' || in[pos - 1] != ' ') {
				pos++;
			}
		}

		for (int i = pos; i < in.length; i++) {
			in[i] = ' ';
		}
	}

	@ObfuscatedName("qc.a(IC)Z")
	public static boolean allowCharacter(char c) {
		return c >= ' ' && c <= 127 || c == ' ' || c == '\n' || c == '\t' || c == 163 || c == 8364;
	}

	@ObfuscatedName("qc.a(Ljava/lang/String;B)Ljava/lang/String;")
	public static String filter(String input) {
		long start = System.currentTimeMillis();

		char[] outputPre = input.toCharArray();
		filterCharacters(outputPre);

		String trimmed = (new String(outputPre)).trim();
		char[] output = trimmed.toLowerCase().toCharArray();
		String lowercase = trimmed.toLowerCase();

		filterTld(output);
		filterBad(output);
		filterDomains(output);
		filterFragments(output);

		for (int i = 0; i < ALLOWLIST.length; i++) {
			int j = -1;
			while ((j = lowercase.indexOf(ALLOWLIST[i], j + 1)) != -1) {
				char[] var12 = ALLOWLIST[i].toCharArray();
				for (int k = 0; k < var12.length; k++) {
					output[j + k] = var12[k];
				}
			}
		}

		replaceUppercase(trimmed.toCharArray(), output);
		formatUppercase(output);

		long end = System.currentTimeMillis();
		return (new String(output)).trim();
	}

	@ObfuscatedName("qc.a([C[CI)V")
	public static void replaceUppercase(char[] unfiltered, char[] in) {
		for (int i = 0; i < unfiltered.length; i++) {
			if (in[i] != '*' && isUpperCase(unfiltered[i])) {
				in[i] = unfiltered[i];
			}
		}
	}

	@ObfuscatedName("qc.a([CZ)V")
	public static void formatUppercase(char[] in) {
		boolean upper = true;

		for (int i = 0; i < in.length; i++) {
			char c = in[i];

			if (!isAlpha(c)) {
				upper = true;
			} else if (upper) {
				if (isLowercase(c)) {
					upper = false;
				}
			} else if (isUpperCase(c)) {
				in[i] = (char) (c + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("qc.a(Z[C)V")
	public static void filterBad(char[] in) {
		for (int passes = 0; passes < 2; passes++) {
			for (int i = badWords.length - 1; i >= 0; i--) {
				filter(in, badWords[i], badCombinations[i]);
			}
		}
	}

	@ObfuscatedName("qc.a(I[C)V")
	public static void filterDomains(char[] in) {
		char[] filteredAt = in.clone();
		char[] at = new char[] { '(', 'a', ')' };
		filter(filteredAt, at, null);

		char[] filteredDot = in.clone();
		char[] dot = new char[] { 'd', 'o', 't' };
		filter(filteredDot, dot, null);

		for (int i = domains.length - 1; i >= 0; i--) {
			filterDomain(filteredDot, in, domains[i], filteredAt);
		}
	}

	@ObfuscatedName("qc.a([CI[C[C[C)V")
	public static void filterDomain(char[] arg0, char[] in, char[] domain, char[] arg4) {
		if (domain.length > in.length) {
			return;
		}

		boolean compare = true;
		int stride;

		for (int start = 0; start <= in.length - domain.length; start += stride) {
			int end = start;
			int offset = 0;
			stride = 1;

			filter_pass: while (true) {
				while (true) {
					if (end >= in.length) {
						break filter_pass;
					}

					boolean match = false;
					char b = in[end];
					char c = 0;
					if (end + 1 < in.length) {
						c = in[end + 1];
					}

					int charSize;
					if (offset < domain.length && (charSize = getEmulatedDomainCharSize(c, b, domain[offset])) > 0) {
						end += charSize;
						offset++;
					} else {
						if (offset == 0) {
							break filter_pass;
						}

						int charSize2;
						if ((charSize2 = getEmulatedDomainCharSize(c, b, domain[offset - 1])) > 0) {
							end += charSize2;

							if (offset == 1) {
								stride++;
							}
						} else {
							if (offset >= domain.length || !isSymbol(b)) {
								break filter_pass;
							}

							end++;
						}
					}
				}
			}

			if (offset >= domain.length) {
				boolean match = false;
				int atFilter = getDomainAtFilterStatus(arg4, start, in);
				int dotFilter = getDomainDotFilterStatus(arg0, in, end - 1);

				if (atFilter > 2 || dotFilter > 2) {
					match = true;
				}

				if (match) {
					for (int i = start; i < end; i++) {
						in[i] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a(B[CI[C)I")
	public static int getDomainAtFilterStatus(char[] b, int end, char[] a) {
		if (end == 0) {
			return 2;
		}

		for (int i = end - 1; i >= 0 && isSymbol(a[i]); i--) {
			if (a[i] == '@') {
				return 3;
			}
		}

		int asteriskCount = 0;
		for (int i = end - 1; i >= 0 && isSymbol(b[i]); i--) {
			if (b[i] == '*') {
				asteriskCount++;
			}
		}

		if (asteriskCount >= 3) {
			return 4;
		} else if (isSymbol(a[end - 1])) {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a([C[CZI)I")
	public static int getDomainDotFilterStatus(char[] b, char[] a, int start) {
		if (start + 1 == a.length) {
			return 2;
		}

		int i = start + 1;
		while (true) {
			if (i < a.length && isSymbol(a[i])) {
				if (a[i] != '.' && a[i] != ',') {
					i++;
					continue;
				}

				return 3;
			}

			int asteriskCount = 0;
			for (int j = start + 1; j < a.length && isSymbol(b[j]); j++) {
				if (b[j] == '*') {
					asteriskCount++;
				}
			}

			if (asteriskCount >= 3) {
				return 4;
			} else if (isSymbol(a[start + 1])) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@ObfuscatedName("qc.b(I[C)V")
	public static void filterTld(char[] in) {
		char[] filteredDot = in.clone();
		char[] dot = new char[] { 'd', 'o', 't' };
		filter(filteredDot, dot, null);

		char[] filteredSlash = in.clone();
		char[] slash = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(filteredSlash, slash, null);

		for (int i = 0; i < tlds.length; i++) {
			filterTld(tlds[i], filteredSlash, filteredDot, tldstype[i], in);
		}
	}

	@ObfuscatedName("qc.a([C[C[CII[C)V")
	public static void filterTld(char[] tld, char[] filteredSlash, char[] filteredDot, int type, char[] chars) {
		if (tld.length > chars.length) {
			return;
		}

		boolean compare = true;
		int stride;
		for (int start = 0; start <= chars.length - tld.length; start += stride) {
			int end = start;
			int offset = 0;
			stride = 1;

			filter_pass: while (true) {
				while (true) {
					if (end >= chars.length) {
						break filter_pass;
					}

					boolean match = false;
					char b = chars[end];
					char c = 0;

					if (end + 1 < chars.length) {
						c = chars[end + 1];
					}

					int charLen;
					if (offset < tld.length && (charLen = getEmulatedDomainCharSize(c, b, tld[offset])) > 0) {
						end += charLen;
						offset++;
					} else {
						if (offset == 0) {
							break filter_pass;
						}

						int charLen2;
						if ((charLen2 = getEmulatedDomainCharSize(c, b, tld[offset - 1])) > 0) {
							end += charLen2;

							if (offset == 1) {
								stride++;
							}
						} else {
							if (offset >= tld.length || !isSymbol(b)) {
								break filter_pass;
							}

							end++;
						}
					}
				}
			}

			if (offset >= tld.length) {
				boolean match = false;

				int status0 = getTldDotFilterStatus(chars, start, filteredDot);
				int status1 = getTldSlashFilterStatus(filteredSlash, end - 1, chars);

				if (type == 1 && status0 > 0 && status1 > 0) {
					match = true;
				}

				if (type == 2 && (status0 > 2 && status1 > 0 || status0 > 0 && status1 > 2)) {
					match = true;
				}

				if (type == 3 && status0 > 0 && status1 > 2) {
					match = true;
				}

				boolean match2;
				if (type == 3 && status0 > 2 && status1 > 0) {
					match2 = true;
				} else {
					match2 = false;
				}

				if (match) {
					int first = start;
					int last = end - 1;

					if (status0 > 2) {
						if (status0 == 4) {
							boolean findStart = false;
							for (int i = start - 1; i >= 0; i--) {
								if (findStart) {
									if (filteredDot[i] != '*') {
										break;
									}

									first = i;
								} else if (filteredDot[i] == '*') {
									first = i;
									findStart = true;
								}
							}
						}

						boolean findStart = false;
						for (int i = first - 1; i >= 0; i--) {
							if (findStart) {
								if (isSymbol(chars[i])) {
									break;
								}

								first = i;
							} else if (!isSymbol(chars[i])) {
								findStart = true;
								first = i;
							}
						}
					}

					if (status1 > 2) {
						if (status1 == 4) {
							boolean findStart = false;
							for (int i = last + 1; i < chars.length; i++) {
								if (findStart) {
									if (filteredSlash[i] != '*') {
										break;
									}

									last = i;
								} else if (filteredSlash[i] == '*') {
									last = i;
									findStart = true;
								}
							}
						}

						boolean findStart = false;
						for (int i = last + 1; i < chars.length; i++) {
							if (findStart) {
								if (isSymbol(chars[i])) {
									break;
								}

								last = i;
							} else if (!isSymbol(chars[i])) {
								findStart = true;
								last = i;
							}
						}
					}

					for (int i = first; i <= last; i++) {
						chars[i] = '*';
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a([CII[C)I")
	public static int getTldDotFilterStatus(char[] a, int start, char[] b) {
		if (start == 0) {
			return 2;
		}

		int i = start - 1;
		while (true) {
			if (i >= 0 && isSymbol(a[i])) {
				if (a[i] != ',' && a[i] != '.') {
					i--;
					continue;
				}

				return 3;
			}

			int asteriskCount = 0;
			for (int j = start - 1; j >= 0 && isSymbol(b[j]); j--) {
				if (b[j] == '*') {
					asteriskCount++;
				}
			}

			if (asteriskCount >= 3) {
				return 4;
			} else if (isSymbol(a[start - 1])) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@ObfuscatedName("qc.a(I[CI[C)I")
	public static int getTldSlashFilterStatus(char[] b, int start, char[] a) {
		if (start + 1 == a.length) {
			return 2;
		}

		int i = start + 1;
		while (true) {
			if (i < a.length && isSymbol(a[i])) {
				if (a[i] != '\\' && a[i] != '/') {
					i++;
					continue;
				}
				return 3;
			}

			int asteriskCount = 0;
			for (int j = start + 1; j < a.length && isSymbol(b[j]); j++) {
				if (b[j] == '*') {
					asteriskCount++;
				}
			}

			if (asteriskCount >= 5) {
				return 4;
			} else if (isSymbol(a[start + 1])) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@ObfuscatedName("qc.a(I[C[C[[B)V")
	public static void filter(char[] chars, char[] fragment, byte[][] badCombinations) {
		if (fragment.length > chars.length) {
			return;
		}

		boolean compare = true;
		int stride;
		for (int start = 0; start <= chars.length - fragment.length; start += stride) {
			int end = start;
			int fragOff = 0;
			int iterations = 0;
			stride = 1;

			boolean isSymbol = false;
			boolean isEmulated = false;
			boolean isNumeral = false;

			filter_pass: while (true) {
				while (true) {
					if (end >= chars.length || isEmulated && isNumeral) {
						break filter_pass;
					}

					boolean bad = false;
					char b = chars[end];
					char c = 0;

					if (end + 1 < chars.length) {
						c = chars[end + 1];
					}

					int charLen;
					if (fragOff < fragment.length && (charLen = getEmulatedSize(fragment[fragOff], c, b)) > 0) {
						if (charLen == 1 && isNumber(b)) {
							isEmulated = true;
						}

						if (charLen == 2 && (isNumber(b) || isNumber(c))) {
							isEmulated = true;
						}

						end += charLen;
						fragOff++;
					} else {
						if (fragOff == 0) {
							break filter_pass;
						}

						int charLen2;
						if ((charLen2 = getEmulatedSize(fragment[fragOff - 1], c, b)) > 0) {
							end += charLen2;

							if (fragOff == 1) {
								stride++;
							}
						} else {
							if (fragOff >= fragment.length || !isLowercaseAlpha(b)) {
								break filter_pass;
							}

							if (isSymbol(b) && b != '\'') {
								isSymbol = true;
							}

							if (isNumber(b)) {
								isNumeral = true;
							}

							end++;
							iterations++;

							if (iterations * 100 / (end - start) > 90) {
								break filter_pass;
							}
						}
					}
				}
			}

			if (fragOff >= fragment.length && (!isEmulated || !isNumeral)) {
				boolean bad = true;

				if (isSymbol) {
					boolean badCurrent = false;
					boolean badNext = false;

					if (start - 1 < 0 || isSymbol(chars[start - 1]) && chars[start - 1] != '\'') {
						badCurrent = true;
					}

					if (end >= chars.length || isSymbol(chars[end]) && chars[end] != '\'') {
						badNext = true;
					}

					if (!badCurrent || !badNext) {
						boolean good = false;
						int cur = start - 2;
						if (badCurrent) {
							cur = start;
						}

						while (!good && cur < end) {
							if (cur >= 0 && (!isSymbol(chars[cur]) || chars[cur] == '\'')) {
								char[] frag = new char[3];

								int off;
								for (off = 0; off < 3 && cur + off < chars.length && (!isSymbol(chars[cur + off]) || chars[cur + off] == '\''); off++) {
									frag[off] = chars[cur + off];
								}

								boolean valid = true;
								if (off == 0) {
									valid = false;
								}
								if (off < 3 && cur - 1 >= 0 && (!isSymbol(chars[cur - 1]) || chars[cur - 1] == '\'')) {
									valid = false;
								}
								if (valid && !isBadFragment(frag)) {
									good = true;
								}
							}

							cur++;
						}

						if (!good) {
							bad = false;
						}
					}
				} else {
					char b = ' ';
					if (start - 1 >= 0) {
						b = chars[start - 1];
					}

					char c = ' ';
					if (end < chars.length) {
						c = chars[end];
					}

					byte bIndex = getIndex(b);
					byte cIndex = getIndex(c);

					if (badCombinations != null && comboMatches(badCombinations, bIndex, cIndex)) {
						bad = false;
					}
				}

				if (bad) {
					int numeralCount = 0;
					int alphaCount = 0;
					int alphaIndex = -1;

					for (int i = start; i < end; i++) {
						if (isNumber(chars[i])) {
							numeralCount++;
						} else if (isAlpha(chars[i])) {
							alphaCount++;
							alphaIndex = i;
						}
					}

					if (alphaIndex > -1) {
						numeralCount -= end - alphaIndex + 1;
					}

					if (numeralCount <= alphaCount) {
						for (int i = start; i < end; i++) {
							chars[i] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qc.a([[BIBB)Z")
	public static boolean comboMatches(byte[][] combos, byte a, byte b) {
		int first = 0;
		if (combos[first][0] == a && combos[first][1] == b) {
			return true;
		}

		int last = combos.length - 1;
		if (combos[last][0] == a && combos[last][1] == b) {
			return true;
		}

		do {
			int middle = (first + last) / 2;
			if (combos[middle][0] == a && combos[middle][1] == b) {
				return true;
			}

			if (a < combos[middle][0] || combos[middle][0] == a && b < combos[middle][1]) {
				last = middle;
			} else {
				first = middle;
			}
		} while (first != last && first + 1 != last);

		return false;
	}

	@ObfuscatedName("qc.a(CCCB)I")
	public static int getEmulatedDomainCharSize(char c, char a, char b) {
		if (a == b) {
			return 1;
		} else if (b == 'o' && a == '0') {
			return 1;
		} else if (b == 'o' && a == '(' && c == ')') {
			return 2;
		} else if (b == 'c' && (a == '(' || a == '<' || a == '[')) {
			return 1;
		} else if (b == 'e' && a == 8364) {
			return 1;
		} else if (b == 's' && a == '$') {
			return 1;
		} else if (b == 'l' && a == 'i') {
			return 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CBCC)I")
	public static int getEmulatedSize(char a, char c, char b) {
		if (a == b) {
			return 1;
		}

		if (a >= 'a' && a <= 'm') {
			if (a == 'a') {
				if (b != '4' && b != '@' && b != '^') {
					if (b == '/' && c == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (a == 'b') {
				if (b != '6' && b != '8') {
					if ((b != '1' || c != '3') && (b != 'i' || c != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (a == 'c') {
				if (b != '(' && b != '<' && b != '{' && b != '[') {
					return 0;
				}

				return 1;
			}

			if (a == 'd') {
				if ((b != '[' || c != ')') && (b != 'i' || c != ')')) {
					return 0;
				}

				return 2;
			}

			if (a == 'e') {
				if (b != '3' && b != 8364) {
					return 0;
				}

				return 1;
			}

			if (a == 'f') {
				if (b == 'p' && c == 'h') {
					return 2;
				}

				if (b == 163) {
					return 1;
				}

				return 0;
			}

			if (a == 'g') {
				if (b != '9' && b != '6' && b != 'q') {
					return 0;
				}

				return 1;
			}

			if (a == 'h') {
				if (b == '#') {
					return 1;
				}

				return 0;
			}

			if (a == 'i') {
				if (b != 'y' && b != 'l' && b != 'j' && b != '1' && b != '!' && b != ':' && b != ';' && b != '|') {
					return 0;
				}

				return 1;
			}

			if (a == 'j') {
				return 0;
			}

			if (a == 'k') {
				return 0;
			}

			if (a == 'l') {
				if (b != '1' && b != '|' && b != 'i') {
					return 0;
				}

				return 1;
			}

			if (a == 'm') {
				return 0;
			}
		}

		if (a >= 'n' && a <= 'z') {
			if (a == 'n') {
				return 0;
			}

			if (a == 'o') {
				if (b != '0' && b != '*') {
					if ((b != '(' || c != ')') && (b != '[' || c != ']') && (b != '{' || c != '}') && (b != '<' || c != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (a == 'p') {
				return 0;
			}

			if (a == 'q') {
				return 0;
			}

			if (a == 'r') {
				return 0;
			}

			if (a == 's') {
				if (b != '5' && b != 'z' && b != '$' && b != '2') {
					return 0;
				}

				return 1;
			}

			if (a == 't') {
				if (b != '7' && b != '+') {
					return 0;
				}

				return 1;
			}

			if (a == 'u') {
				if (b == 'v') {
					return 1;
				}

				if ((b != '\\' || c != '/') && (b != '\\' || c != '|') && (b != '|' || c != '/')) {
					return 0;
				}

				return 2;
			}

			if (a == 'v') {
				if ((b != '\\' || c != '/') && (b != '\\' || c != '|') && (b != '|' || c != '/')) {
					return 0;
				}

				return 2;
			}

			if (a == 'w') {
				if (b == 'v' && c == 'v') {
					return 2;
				}

				return 0;
			}

			if (a == 'x') {
				if ((b != ')' || c != '(') && (b != '}' || c != '{') && (b != ']' || c != '[') && (b != '>' || c != '<')) {
					return 0;
				}

				return 2;
			}

			if (a == 'y') {
				return 0;
			}

			if (a == 'z') {
				return 0;
			}
		}

		if (a >= '0' && a <= '9') {
			if (a == '0') {
				if (b == 'o' || b == 'O') {
					return 1;
				} else if ((b != '(' || c != ')') && (b != '{' || c != '}') && (b != '[' || c != ']')) {
					return 0;
				} else {
					return 2;
				}
			} else if (a == '1') {
				return b == 'l' ? 1 : 0;
			} else {
				return 0;
			}
		} else if (a == ',') {
			return b == '.' ? 1 : 0;
		} else if (a == '.') {
			return b == ',' ? 1 : 0;
		} else if (a == '!') {
			return b == 'i' ? 1 : 0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(CI)B")
	public static byte getIndex(char c) {
		if (c >= 'a' && c <= 'z') {
			return (byte) (c - 'a' + 1);
		} else if (c == '\'') {
			return 28;
		} else if (c >= '0' && c <= '9') {
			return (byte) (c - '0' + 29);
		} else {
			return 27;
		}
	}

	@ObfuscatedName("qc.c(I[C)V")
	public static void filterFragments(char[] chars) {
		boolean compare = false;
		int end = 0;
		int count = 0;
		int start = 0;

		while (true) {
			do {
				int index;
				if ((index = indexOfNumber(chars, end)) == -1) {
					return;
				}

				boolean foundLowercase = false;
				for (int i = end; i >= 0 && i < index && !foundLowercase; i++) {
					if (!isSymbol(chars[i]) && !isLowercaseAlpha(chars[i])) {
						foundLowercase = true;
					}
				}

				if (foundLowercase) {
					count = 0;
				}

				if (count == 0) {
					start = index;
				}

				end = indexOfNonNumber(index, chars);

				int value = 0;
				for (int i = index; i < end; i++) {
					value = value * 10 + chars[i] - 48;
				}

				if (value <= 255 && end - index <= 8) {
					count++;
				} else {
					count = 0;
				}
			} while (count != 4);

			for (int i = start; i < end; i++) {
				chars[i] = '*';
			}

			count = 0;
		}
	}

	@ObfuscatedName("qc.a(I[CI)I")
	public static int indexOfNumber(char[] in, int off) {
		for (int i = off; i < in.length && i >= 0; i++) {
			if (in[i] >= '0' && in[i] <= '9') {
				return i;
			}
		}
		return -1;
	}

	@ObfuscatedName("qc.a(ZI[C)I")
	public static int indexOfNonNumber(int off, char[] in) {
		int i = off;
		while (true) {
			if (i < in.length && i >= 0) {
				if (in[i] >= '0' && in[i] <= '9') {
					i++;
					continue;
				}

				return i;
			}

			return in.length;
		}
	}

	@ObfuscatedName("qc.a(BC)Z")
	public static boolean isSymbol(char c) {
		return !isAlpha(c) && !isNumber(c);
	}

	@ObfuscatedName("qc.b(IC)Z")
	public static boolean isLowercaseAlpha(char c) {
		if (c >= 'a' && c <= 'z') {
			return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
		} else {
			return true;
		}
	}

	@ObfuscatedName("qc.c(IC)Z")
	public static boolean isAlpha(char c) {
		return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
	}

	@ObfuscatedName("qc.d(IC)Z")
	public static boolean isNumber(char c) {
		return c >= '0' && c <= '9';
	}

	@ObfuscatedName("qc.b(CI)Z")
	public static boolean isLowercase(char c) {
		return c >= 'a' && c <= 'z';
	}

	@ObfuscatedName("qc.a(CZ)Z")
	public static boolean isUpperCase(char c) {
		return c >= 'A' && c <= 'Z';
	}

	@ObfuscatedName("qc.a([CB)Z")
	public static boolean isBadFragment(char[] in) {
		boolean skip = true;
		for (int i = 0; i < in.length; i++) {
			if (!isNumber(in[i]) && in[i] != 0) {
				skip = false;
			}
		}

		if (skip) {
			return true;
		}

		int i = firstFragmentId(in);
		int start = 0;
		int end = fragments.length - 1;

		if (fragments[start] == i || fragments[end] == i) {
			return true;
		}

		do {
			int middle = (start + end) / 2;
			if (fragments[middle] == i) {
				return true;
			}

			if (i < fragments[middle]) {
				end = middle;
			} else {
				start = middle;
			}
		} while (start != end && start + 1 != end);

		return false;
	}

	@ObfuscatedName("qc.b([CI)I")
	public static int firstFragmentId(char[] chars) {
		if (chars.length > 6) {
			return 0;
		}

		int value = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[chars.length - i - 1];
			if (c >= 'a' && c <= 'z') {
				value = value * 38 + c - 'a' + 1;
			} else if (c == '\'') {
				value = value * 38 + 27;
			} else if (c >= '0' && c <= '9') {
				value = value * 38 + c - '0' + 28;
			} else if (c != 0) {
				return 0;
			}
		}

		return value;
	}
}
