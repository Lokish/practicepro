import java.util.*;
public class ListDemoo 
{
	public static void main(String arg[])
	{
			ArrayList list1=new ArrayList();
		
		list1.add("Adi");
		list1.add("Elango");
		list1.add("Zampa");
		list1.add("Lokish");
		list1.add("Virat");
		list1.add("Aditiya");
		
		list1.add(100);
		list1.add(200);
		
		System.out.println("Before ListIterator:"+list1);
		
		ListIterator itr=list1.listIterator();
		
		while(itr.hasNext())
		{
			Object element=itr.next();
			
			if(element instanceof String)
			{
				String str=(String)element;
				System.out.println("String Object:"+str);
				
				if(str.equals("Sunil"))
					itr.set("Yash");
				
			}
			else if(element instanceof Integer)
			{
				Integer intr=(Integer)element;
				System.out.println("Integer object:"+intr);
			}
		}
		
		System.out.println("After the ListIterator:"+list1);
	}
}

