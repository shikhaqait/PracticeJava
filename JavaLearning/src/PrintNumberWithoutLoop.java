
public class PrintNumberWithoutLoop {

	public static void arr(int j)
	{
		System.out.println(j);
		j=j+1;
		if (j<=10)
		arr(j);		
	}
	
	public static void main(String[] args) 
	{	
		arr(1);
	}

}
