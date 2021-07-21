package Rectangle;

public class Area {
	public static void main(String[] args)
	{
		System.out.println(area(2.1));
		System.out.println(area(1.0,2.1));
	}


public static double area(double radius)
{
	double area=0.0;
	
	if(radius>0)
	{
		area=3.14*radius;
		return area;
		
	}
	return -1.0;
		
	}
public static double area(double x,double y)
{
	double area=0.0;
	if (x>0.0 ||y>0.0)
	{
		area=x*y;
		return area;
	}
	return -1.0;
}

	
}
