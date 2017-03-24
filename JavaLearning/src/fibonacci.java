import java.util.Scanner;

public class fibonacci {
	
	public void fibonacciSeries()
	{		
		int n1=0; int n2=1; int n3;
			for (int i=0;i<=12; i++)
			{	
				if (i==0 ||i==1)
				{					
					System.out.println(i);
				}
				else
				{
				n3 = n1+n2;
				n1=n2;
				n2=n3;				
				System.out.println(n3);
				}
			}
	}

	public static void main(String[] args) 
	{	
		fibonacci fb = new fibonacci();
		fb.fibonacciSeries();
	}

}
