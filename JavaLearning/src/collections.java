import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class collections {

	public void arraylist()
	{	
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");
		  list.add("Ravi"); 
		  //Traversing list through Iterator  
		 // System.out.println(list);
		  Iterator<String> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
	
	public void linkedlist()
	{
		LinkedList <String> list = new LinkedList<String>();
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");
		  list.add("Ravi"); 
		  list.add(3, "Shikha");
		  for(int i=0; i<=list.size();i++)
		  {
		  System.out.println(list.get(i));
		  }		 
	}
	
	public void hashset()
	{
		//HashSet <String> set = new HashSet<String>();
		LinkedHashSet <String> set = new LinkedHashSet<String>();
		set.add("Vijay");
		set.add("Ajay");
		set.add("Ravi");
		set.add("Shikha");
		set.add("Vijay");
				
		 Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  }
	}
	public static void main(String[] args) 
	{
		collections obj = new collections();
//		obj.arraylist();
//		obj.linkedlist();
		obj.hashset();
	}

}
