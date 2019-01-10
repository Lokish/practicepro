import java.util.*;
public class SetDemo 
{
	public static void main(String arg[])
	{
		HashSet hset=new HashSet();
		
		hset.add("AA");
		hset.add("Svb");
		hset.add("Tfgh");
		hset.add("kl");
		
		
		System.out.println("HashSet Collection:"+hset);
		
		LinkedHashSet lhset=new LinkedHashSet();
		
		lhset.add("Vinod");
		lhset.add("Sudhir");
		lhset.add("Tarun");
		lhset.add("Rohit");
		
		System.out.println("LinkedHashSet Collection:"+lhset);
		
		TreeSet tset=new TreeSet();
		
		tset.add("Vinod");
		tset.add("Sudhir");
		tset.add("Tarun");
		tset.add("Rohit");
		
		System.out.println("TreeSet Collection:"+tset);
	}
}