import java.util.Scanner;

public class ArmstrongCheck {
	
	 static int digit=0;
	 
	public void armstrong()
	{
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num2=num;	
		while (num2 > 0) 
		{				
		    int rem = num2 % 10;
		    digit = digit+ rem*rem*rem;		    	   
		  // digit=+digit;
		   System.out.println(digit);
		    num2 = num2 / 10;
		}		
		if(num==digit){
			System.out.println("This number is armstrong");
		}
		else
			System.out.println("This number is not armstrong");
	}
	public static void main(String[] args) {
		ArmstrongCheck ac = new ArmstrongCheck();
		//ac.armstrong();
		ac.rangeArmstrong();
	}
	
	public void rangeArmstrong()
	{
		int i=0;
		
			while (i>=0 && i<=999)
			{
			int rem = i % 10;
		    digit = digit+ rem*rem*rem;		    	   
		  // digit=+digit;
		   System.out.println(digit);
		    i = i / 10;
		    if (i<0)break;
			}
		i=i+1;
		rangeArmstrong();
	}

}
