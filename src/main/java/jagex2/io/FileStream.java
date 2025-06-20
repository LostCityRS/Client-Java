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

	public FileStream(int archive, RandomAccessFile idx, RandomAccessFile dat, int maxFileSize) {
		this.archive = archive;
		this.dat = dat;
		this.idx = idx;
		this.maxFileSize = maxFileSize;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] read(int file) {
		try {
			this.seek(file * 6, this.idx);

			int n;
			for (int off = 0; off < 6; off += n) {
				n = this.idx.read(temp, off, 6 - off);
				if (n == -1) {
					return null;
				}
			}

			int size = (temp[2] & 0xFF) + ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8);
			int sector = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);

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

				this.seek(sector * 520, this.dat);

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
				int nextSector = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
				int sectorArchive = temp[7] & 0xFF;

				if (file != sectorFile || part != sectorPart || this.archive != sectorArchive) {
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

	@ObfuscatedName("wb.a([BIZI)Z")
	public synchronized boolean write(byte[] src, int file, int len) {
		boolean written = this.write(src, file, true, len);
		if (!written) {
			written = this.write(src, file, false, len);
		}
		return written;
	}

	@ObfuscatedName("wb.a([BIZII)Z")
	public synchronized boolean write(byte[] data, int file, boolean overwrite, int len) {
		try {
			int sector;

			if (overwrite) {
				this.seek(file * 6, this.idx);

				int n;
				for (int off = 0; off < 6; off += n) {
					n = this.idx.read(temp, off, 6 - off);
					if (n == -1) {
						return false;
					}
				}

				sector = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
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

			this.seek(file * 6, this.idx);
			this.idx.write(temp, 0, 6);

			int pos = 0;
			int part = 0;
			while (pos < len) {
				int nextSector = 0;

				if (overwrite) {
					this.seek(sector * 520, this.dat);

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
						nextSector = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
						int sectorStore = temp[7] & 0xFF;

						if (file != sectorFile || part != sectorPart || this.archive != sectorStore) {
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

					if (sector == nextSector) {
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

				this.seek(sector * 520, this.dat);
				this.dat.write(temp, 0, 8);

				int available = len - pos;
				if (available > 512) {
					available = 512;
				}

				this.dat.write(data, pos, available);
				pos += available;
				sector = nextSector;
				part++;
			}

			return true;
		} catch (IOException ignore) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void seek(int pos, RandomAccessFile file) throws IOException {
		if (pos < 0 || pos > 0x3c00000) {
			System.out.println("Badseek - pos:" + pos + " len:" + file.length());
			pos = 0x3c00000;

			try {
				Thread.sleep(1000L);
			} catch (Exception ignore) {
			}
		}

		file.seek(pos);
	}
}
