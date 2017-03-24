
public class MultiThread extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception handled");
			}
		System.out.println(i);
	}}

	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		MultiThread mt1 = new MultiThread();
		MultiThread mt2 = new MultiThread();
		mt.start();
		try
		{
			//mt.join();
			mt.join(1500);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception caught");
		}
		mt1.start();
		mt2.start();
	}

}
