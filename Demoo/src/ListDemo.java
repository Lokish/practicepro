import java.util.*;
public class ListDemo 
{
public static void main(String arg[])
{
	ArrayList list1=new ArrayList();
	
	list1.add("Sunil");
	list1.add("Sudhir");
	list1.add("Nitin");
	
	list1.add(100);
	list1.add(200);
	
	System.out.println("Before Iterator:"+list1);
	
	Iterator itr=list1.iterator();
	
	while(itr.hasNext())
	{
		Object element=itr.next();
		
		if(element instanceof String)
		{
			String str=(String)element;
			System.out.println("String Object:"+str);
			
			if(str.equals("Sunil"))
				itr.remove();
			
		}
		else if(element instanceof Integer)
		{
			Integer intr=(Integer)element;
			System.out.println("Integer object:"+intr);
		}
	}
	
	System.out.println("After the Iterator:"+list1);
}
}


