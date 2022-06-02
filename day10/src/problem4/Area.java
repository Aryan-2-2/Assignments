package problem4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		
		int area = length*breadth;
		
		return area;
	}

	@Override
	public int squareArea(int side) {
	
		int area = side*side;
		
		return area;
	}

	@Override
	public int circleArea(int radius) {
		
	double	area = (radius*radius)*Math.PI;
		
	return  (int)area;
	}

	
	
	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		System.out.println("Rectangle: "+a1.rectangleArea(5, 7));
	System.out.println(	"Square: "+a1.circleArea(5));
		System.out.println("Circle: "+a1.squareArea(8));
	}
}
