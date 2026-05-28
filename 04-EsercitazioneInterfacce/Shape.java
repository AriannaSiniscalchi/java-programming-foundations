package interfacce;

import java.util.List;

public abstract class Shape implements Rotatable, Scalable{

	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public abstract List<Point> getSequencwOfPointsToDraw();
	
	public void draw(TwoDimensionalCanvas canvas) {
		List<Point> points = this.getSequencwOfPointsToDraw();
		for(int i = 0; i < points.size()-1; i ++) {
			canvas.drawLine(points.get(i), points.get(i+1));
		}
	}
}
