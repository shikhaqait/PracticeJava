import java.util.Scanner;

public class AreaPerimeterOfCircle {
	
	static int radius;
	
	public void perimeterArea()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter radius of circle");
		radius=in.nextInt();
		areaCircle();
		perimeterCircle();
	}
	
	public void areaCircle()
	{
		 int radiusSquare = radius*radius;
		 Integer area = (int) (3.14*radiusSquare);
		 System.out.println("Area of circle" + area );
	}

	public void perimeterCircle()
	{
		int perimeter = (int) (2*3.14*radius);
		System.out.println("Perimeter of ciclre" + perimeter);
	}
	
	public static void main(String[] args) 
	{
		AreaPerimeterOfCircle apc = new AreaPerimeterOfCircle();
		apc.perimeterArea();		
	}

}
