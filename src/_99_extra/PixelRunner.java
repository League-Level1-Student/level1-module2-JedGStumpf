package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		PixelParty pixel = new PixelParty();
		pixel.setRainbow(true);
		
		for (int i = 0; i < 3; i++) {
			int x = pixel.rand.nextInt(10, 25);
			int y = pixel.rand.nextInt(10, 25);
			int r = pixel.rand.nextInt(10, 25);
			pixel.drawCircle(x, y, r);
		} 
		for (int i = 0; i < 3; i++) {
			int x = pixel.rand.nextInt(10, 25);
			int y = pixel.rand.nextInt(10, 25);
			int w = pixel.rand.nextInt(10, 25);
			int h = pixel.rand.nextInt(10, 25);
			pixel.drawRectangle(x, y, w, h);
		}
		for (int i = 0; i < 3; i++) {
			int x1 = pixel.rand.nextInt(10, 25);
			int y1 = pixel.rand.nextInt(10, 25);
			int x2 = pixel.rand.nextInt(10, 25);
			int y2 = pixel.rand.nextInt(10, 25);
			int x3 = pixel.rand.nextInt(10, 25);
			int y3 = pixel.rand.nextInt(10, 25);

			pixel.drawTriangle(x1, y1, x2, y2, x3, y3);
		} 
		
		pixel.saveImage();
		pixel.displayImage();
		
	}

}
