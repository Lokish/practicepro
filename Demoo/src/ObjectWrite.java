import java.io.*;
public class ObjectWrite 
{
	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("C:\\java\\Demo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Employee employee=new Employee();
			
			employee.setEmpId("S1001");
			employee.setEmpName("SKumar");
			employee.setAddr("Delhi");
			
			oos.writeObject(employee);
			
			oos.close();
			
			System.out.println("Object is Written to the File:");
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}