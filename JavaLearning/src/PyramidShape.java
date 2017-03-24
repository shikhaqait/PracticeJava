
public class PyramidShape {

	public void pyramid(int i)
	{
		for (int j=1;j<=i;j++)
		{					
			for (int k=1;k<=j;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		PyramidShape ps = new PyramidShape();
		//ps.pyramid(3);
		ps.leftPyramid(5);
	}
	
	public void leftPyramid(int num)
	{
		for (int i=1;i<=num;i++)
		{					
			for (int j=1;j<=i;j++)
			{
				for(int k=num-1;k>=i;k--)
				 {
					//if(j==1)
					 System.out.print(" ");
					if (j>=2) break;
				 }
				 System.out.print(j);
			}			
			System.out.println();
		}
	}

}
