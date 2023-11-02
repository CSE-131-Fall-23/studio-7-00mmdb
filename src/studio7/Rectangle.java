package studio7;

public class Rectangle 
{
	private static double length;
	private static double width;
	private static double area;
	private static double perimeter;
	private static boolean square;
	private static boolean bigger; 
	
	
	public static void rectangle(double myLength, double myWidth) {
		length = myLength;
		width = myWidth;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	private static void findArea(){
		area = length*width;
		
	}
	
	
	private double getArea() {
		findArea();
		return area;

	}
	
	private static boolean isSmallerThan(Rectangle x) {
	
	if(area<x.getArea()) 
	{
		return true;
		}
	else {
		return false;
		}
	}
	
	private static void findPerimeter() 
	{
		perimeter = (2*length) + (2*width);
	}
	
	private static boolean isSquare()
	{
		
		if(length==width)
		{
		return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	
}
		