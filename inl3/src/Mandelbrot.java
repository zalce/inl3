public class Mandelbrot {

	public static void main(String[] args) {

		MandelbrotGUI gui = new MandelbrotGUI();
		Generator gen = new Generator();
		boolean hasImage = false;

		while (true) {

			int option = gui.getCommand();

			switch (option) {

			case 1:
				System.out.println("Render");
				gen.render(gui);
				hasImage = true;
				break;

			case 2:
				if (hasImage) {
					System.out.println("Zoom");
					gui.clearPlane();
					gen.render(gui);
				} else
					System.out.println("Ingen bild att zooma på");

				break;

			case 8:
				System.out.println("Reset");
				gui.resetPlane();
				gui.clearPlane();
				hasImage = false;

				break;

			case 16:
				System.exit(1);
				break;

			case 32:
				System.out.println("Color = BW");
				break;

			case 64:
				System.out.println("Color = COLOR");
				break;

			case 128:
				System.out.println("Resulution = VeryLow");
				break;

			case 256:
				System.out.println("Resulution = Low");
				break;

			case 512:
				System.out.println("Resulution = Medium ");
				break;

			case 1024:
				System.out.println("Resulution = High");
				break;

			case 2048:
				System.out.println("Resulution = VeryHigh");
				break;

			}
		}
	}
}
