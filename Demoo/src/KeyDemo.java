import java.util.*;
public class KeyDemo
{
	public static void main(String arg[])
	{
		HashMap<Integer,String> records=new HashMap<Integer,String>();
		
		records.put(1001, "1001,Sudhir,Hyderabad,50000");
		records.put(1002, "1002,Vinod,Mumbai,27000");
		records.put(1003, "1003,Mohit,Mumbai,34000");
		records.put(1004, "1004,Rohit,Chennai,42000");
		
		
		Set<Integer> allKeys=records.keySet();
		
		for(Integer intr:allKeys)
		{
		String record=records.get(intr);	
		String detail[]=record.split(",");
		System.out.println("+++++++++++++++Record :of Key:"+intr+"++++++++++++++++");
		System.out.println("Employee ID:"+detail[0]);
		System.out.println("Employee Name:"+detail[1]);
		System.out.println("Employee City:"+detail[2]);
		System.out.println("Employee Salary:"+detail[3]);
		System.out.println("========================================================");
		}
		
	}
}
