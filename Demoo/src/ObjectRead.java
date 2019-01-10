import java.io.*;
public class ObjectRead 
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\java\\Demo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee employee=(Employee)ois.readObject();
			
			System.out.println("Employee ID:"+employee.getEmpId());
			
			System.out.println("Employee Name:"+employee.getEmpName());
			
			System.out.println("Employee Address:"+employee.getAddr());
			
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
