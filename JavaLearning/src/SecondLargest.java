import java.util.Arrays;

public class SecondLargest {

	int a;
	static int b=0;
	int arr[]={31,4,67,5,7,100,3};
	int arr2[];
	//int j=0;
	public void largestNumber()
	{		
		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//	        for (int j = i + 1; j < arr.length; j++) {
//	            int tmp = 0;
//	            if (arr[i] > arr[j]) {
//	                tmp = arr[i];
//	                arr[i] = arr[j];
//	                arr[j] = tmp;
//	            }
//	        }
//		
//		System.out.println("Second largest : "+ arr[5]);
		for (int i = 1; i < arr.length; i++) {
			 
		      if (arr[i] > arr[i - 1]) {
		        temp = arr[i];
		        arr[i] = arr[i - 1];
		        arr[i-1] =temp;
		        i = 0;
		      }
		 
		    }
		    System.out.print("Sorted Array : ");
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println("Second largest : "+ arr[1]);
	}
		
	public static void main(String args[]){
		SecondLargest SL=new SecondLargest();
		SL.largestNumber();		
	}
}
