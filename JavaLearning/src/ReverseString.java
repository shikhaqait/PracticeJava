import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	ArrayList <Character> list = new ArrayList<Character>();
	String name;
	public void ReverseString1()
	{
		System.out.println("Enter string : ");
		Scanner in = new Scanner (System.in);
		name= in.nextLine();		
		//list.add(in.nextLine());
		
	}
	
//	public void actionReverse()
//	{
//		ReverseString1();
//		
//		for(int i=0;i<name.length();i++)
//		{
//			list.add(name.charAt(i));
//		}
//		
//		for(int i=list.size()-1;i>=0;i--)
//		{
//			System.out.print(list.get(i));
//		}
//		System.out.println("==================================================");
//		
//	}
//	
//	public void removeDuplicate()
//	{
//		String name="nitin";
//		int p=name.length();
//		//ReverseString1();
//		for(int i=0;i<p;i++)
//		{
//			list.add(name.charAt(i));
//			
//		}
//		int q=list.size();
//		for(int i=0;i<q;i++)
//		{	
//			for(int j=i+1;j<q;j++)
//			{
//			if (list.get(i)==list.get(j))
//			{
//				list.remove(j);	
//				q=q-1;
//			}
//			}
//			System.out.println(list.get(i));
//		}
//		System.out.println("==================================================");
//	}
	
//	public void replcaeByStar()
//	{
//		String name = "nitin is a bad boy";
//		  char [] arr = name.toCharArray();		  
//		  char c;
//		  String newname = "";
//		  for(int i=0;i<arr.length;i++)
//		  {
//		   c = name.charAt(i);
//		   if(c!=' ')
//		   {
//		    newname = newname + c;		    
//		   }
//		   name = name.replace(c, '*');		   
//		  }
//		  
//		  System.out.println(newname);	
//		  System.out.println("==================================================");
//	}
	
	public void removeVowel()
	{
		ReverseString1();	

		ArrayList <Character> vowel = new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		
		for(int count=0;count<name.length();count++)
		{
			list.add(name.charAt(count));
		}
		
		int q=list.size();
		for(int i=0;i<vowel.size();i++)
		{
			for(int j=0;j<q;j++)
			{
				if(vowel.get(i)==list.get(j))
				{
					list.remove(j);
					q=q-1;
				}
			}			
		}
		
		for(int k=0;k<q;k++)
		{
			System.out.print(list.get(k));
		}				
	}
	
	public void charCount()
	{
		ReverseString1();		
		for(int counter=0;counter<name.length();counter++)
		{
			list.add(name.charAt(counter));
		}		
		int q=list.size();
		for (int i=0;i<q;i++)
		{
			int count=1;
			for (int j=i+1;j<q;j++)
			{
				if(list.get(i)==list.get(j))
				{	
				count=count+1;
				list.remove(j);
				q=q-1;				
				}	
			}
			System.out.print(list.get(i)+"="+count);
		}
//		for(int k=0;k<q;k++)
//		{
//			System.out.print(list.get(k)+"="+count);
//		}	
	}

	public static void main(String args[]) {
		ReverseString rs=new ReverseString();
//		rs.actionReverse();
//		rs.removeDuplicate();
//		rs.replcaeByStar();
	//	rs.removeVowel();
		rs.charCount();
	}

}
