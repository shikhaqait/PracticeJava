import java.util.Scanner;

public class PrimeNumber {

	int no;
	public void number()
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number : " );
		no=in.nextInt();
		if(no%2==0)
		{
			System.out.println("Number is prime");
		}
		else
			System.out.println("Number is not prime");
		
	}
	public static void main(String[] args) {
		PrimeNumber num = new PrimeNumber();
		num.number();

	}

}
