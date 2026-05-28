package interfacce;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {

	
	private final Point centro;
	private final double radius;
	
	
	public Circle(Point centro, double radius) {
		this.centro = centro;
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public List<Point> getSequencwOfPointsToDraw() {
		// TODO Auto-generated method stub
		List<Point> points = new ArrayList<>();
		int numberOfSegments = 256;
		for(int i = 0; i <numberOfSegments; i ++) {
			double newPointX = this.centro.getX() + radius*Math.cos(2*Math.PI*i/numberOfSegments);
			double newPointY = this.centro.getY() + radius*Math.sin(2*Math.PI*i/numberOfSegments);
			
			points.add(new Point(newPointX, newPointY));
		}
		
		return points;
	}


	@Override
	public Shape rotable() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Shape resize() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Shape rotable(double angle) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Shape resize(double scale) {
		// TODO Auto-generated method stub
		return null;
	}

}
