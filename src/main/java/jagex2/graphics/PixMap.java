package jagex2.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

import org.teavm.jso.canvas.CanvasRenderingContext2D;
import org.teavm.jso.canvas.ImageData;
import org.teavm.jso.typedarrays.Uint8ClampedArray;

@ObfuscatedName("rb")
public class PixMap {

	@ObfuscatedName("rb.a")
	public int[] data;

	@ObfuscatedName("rb.b")
	public int width;

	@ObfuscatedName("rb.c")
	public int height;

	private final ImageData imageData;
	private final Uint8ClampedArray rgbPixels;

	public PixMap(CanvasRenderingContext2D context, int arg2, int arg3) {
		this.width = arg2;
		this.height = arg3;
		this.data = new int[arg2 * arg3];
		this.imageData = context.createImageData(arg2, arg3);
		this.rgbPixels = this.imageData.getData();
		this.bind();
	}

	@ObfuscatedName("rb.a(B)V")
	public void bind() {
		Pix2D.setPixels(this.height, this.data, this.width);
	}

	@ObfuscatedName("rb.a(IILjava/awt/Graphics;Z)V")
	public void draw(int arg0, int arg1, CanvasRenderingContext2D context) {
		for (int i = 0; i < width * height * 4; i += 4) {
			int pixel = this.data[i / 4];
			this.rgbPixels.set(i, (pixel >> 16) & 255);
			this.rgbPixels.set(i + 1, (pixel >> 8) & 255);
			this.rgbPixels.set(i + 2, pixel & 255);
			this.rgbPixels.set(i + 3, 255);
		}

		context.putImageData(imageData, arg1, arg0);
	}
}
