import java.io.*;
public class FileCharDemo 
{
	public static void main(String arg[])
	{
		
		try
		{
			FileReader reader=new FileReader("C:\\java\\Demo.txt");
			
			char buff[]=new char[30];
			
			reader.read(buff);
			
			String str=new String(buff);
			
			System.out.println("Content of File:"+str);
			
			reader.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
		
	}
}
