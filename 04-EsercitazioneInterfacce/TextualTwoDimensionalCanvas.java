package interfacce;

public class TextualTwoDimensionalCanvas implements TwoDimensionalCanvas {

	@Override
	public void drawPoint(Point point) {
		// TODO Auto-generated method stub
		System.out.println(point);
	}

	@Override
	public void drawLine(Point pointa, Point pointb) {
		// TODO Auto-generated method stub
		System.out.println("Drawing line " + pointa + "to " + pointb);
	}

	@Override
	public void printCircle(Point center, double radius) {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

}
