package jagex2.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.c")
	public static byte[] temp = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile dat;

	@ObfuscatedName("wb.e")
	public RandomAccessFile idx;

	@ObfuscatedName("wb.f")
	public int archive;

	@ObfuscatedName("wb.g")
	public int maxFileSize = 65000;

	public FileStream(RandomAccessFile dat, int archive, int maxFileSize, RandomAccessFile idx) {
		this.archive = archive;
		this.dat = dat;
		this.idx = idx;
		this.maxFileSize = maxFileSize;
	}

	@ObfuscatedName("wb.a(ZI)[B")
	public synchronized byte[] read(int file) {
		try {
			this.seek(this.idx, file * 6);

			int n;
			for (int off = 0; off < 6; off += n) {
				n = this.idx.read(temp, off, 6 - off);
				if (n == -1) {
					return null;
				}
			}

			int size = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
			int sector = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);

			if (size < 0 || size > this.maxFileSize) {
				return null;
			}

			if (sector <= 0 || (long) sector > this.dat.length() / 520L) {
				return null;
			}

			byte[] data = new byte[size];
			int pos = 0;
			int part = 0;

			while (pos < size) {
				if (sector == 0) {
					return null;
				}

				this.seek(this.dat, sector * 520);

				int off = 0;
				int available = size - pos;
				if (available > 512) {
					available = 512;
				}

				while (off < available + 8) {
					int read = this.dat.read(temp, off, available + 8 - off);
					if (read == -1) {
						return null;
					}

					off += read;
				}

				int sectorFile = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
				int sectorPart = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
				int nextSector = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
				int sectorArchive = temp[7] & 0xFF;

				if (sectorFile != file || sectorPart != part || sectorArchive != this.archive) {
					return null;
				}

				if (nextSector < 0 || (long) nextSector > this.dat.length() / 520L) {
					return null;
				}

				for (int i = 0; i < available; i++) {
					data[pos++] = temp[i + 8];
				}

				sector = nextSector;
				part++;
			}

			return data;
		} catch (IOException ignore) {
			return null;
		}
	}

	@ObfuscatedName("wb.a([BIIB)Z")
	public synchronized boolean write(byte[] src, int file, int len) {
		boolean written = this.write(file, len, src, true);
		if (!written) {
			written = this.write(file, len, src, false);
		}
		return written;
	}

	@ObfuscatedName("wb.a(II[BZZ)Z")
	public synchronized boolean write(int file, int len, byte[] src, boolean overwrite) {
		try {
			int sector;
			if (overwrite) {
				this.seek(this.idx, file * 6);

				int n;
				for (int i = 0; i < 6; i += n) {
					n = this.idx.read(temp, i, 6 - i);
					if (n == -1) {
						return false;
					}
				}

				sector = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
				if (sector <= 0 || (long) sector > this.dat.length() / 520L) {
					return false;
				}
			} else {
				sector = (int) ((this.dat.length() + 519L) / 520L);
				if (sector == 0) {
					sector = 1;
				}
			}

			temp[0] = (byte) (len >> 16);
			temp[1] = (byte) (len >> 8);
			temp[2] = (byte) len;

			temp[3] = (byte) (sector >> 16);
			temp[4] = (byte) (sector >> 8);
			temp[5] = (byte) sector;

			this.seek(this.idx, file * 6);
			this.idx.write(temp, 0, 6);

			int pos = 0;
			int part = 0;

			while (pos < len) {
				int nextSector = 0;
				if (overwrite) {
					this.seek(this.dat, sector * 520);

					int off;
					int read;
					for (off = 0; off < 8; off += read) {
						read = this.dat.read(temp, off, 8 - off);
						if (read == -1) {
							break;
						}
					}

					if (off == 8) {
						int sectorFile = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int sectorPart = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						nextSector = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
						int sectorStore = temp[7] & 0xFF;

						if (sectorFile != file || sectorPart != part || sectorStore != this.archive) {
							return false;
						}

						if (nextSector < 0 || (long) nextSector > this.dat.length() / 520L) {
							return false;
						}
					}
				}

				if (nextSector == 0) {
					overwrite = false;
					nextSector = (int) ((this.dat.length() + 519L) / 520L);

					if (nextSector == 0) {
						nextSector++;
					}

					if (nextSector == sector) {
						nextSector++;
					}
				}

				if (len - pos <= 512) {
					nextSector = 0;
				}

				temp[0] = (byte) (file >> 8);
				temp[1] = (byte) file;

				temp[2] = (byte) (part >> 8);
				temp[3] = (byte) part;

				temp[4] = (byte) (nextSector >> 16);
				temp[5] = (byte) (nextSector >> 8);
				temp[6] = (byte) nextSector;

				temp[7] = (byte) this.archive;

				this.seek(this.dat, sector * 520);
				this.dat.write(temp, 0, 8);

				int available = len - pos;
				if (available > 512) {
					available = 512;
				}
				this.dat.write(src, pos, available);

				pos += available;
				sector = nextSector;
				part++;
			}

			return true;
		} catch (IOException ignore) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(ILjava/io/RandomAccessFile;I)V")
	public synchronized void seek(RandomAccessFile arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg2 > 62914560) {
			System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
			arg2 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
		}
		arg1.seek((long) arg2);
	}
}
