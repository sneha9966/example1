package PrintEqual.com;

public class Equal {
	public static void main(String[] args) {
		printequal(-2,6,3);
		
	}


public static void printequal(int x,int y,int z)
{
	
	if(x<0 ||y<0||z<0)
	{
		System.out.println("Invalid");
	}
	else if(x==y&&y==z&&z==x) 
		{
			System.out.println("numbers are eqal");
		}
		else if(x!=y&&y!=z&&z!=x)
		{
			System.out.println("numbers are not eqal");
		}
		else {
			System.out.println("numbers are neither same or different");
		}
		
		
			
		
	}
	
}

