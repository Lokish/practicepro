
import java.io.*;
public class FileReadDemo 
{
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\java\\Demo.txt");
			
			
			int avl=fis.available();
			
			byte buff[]=new byte[avl];
			
			fis.read(buff,0,avl);
			
			
			String str=new String(buff);
			
			
			System.out.println("The Content in File:"+str);
			
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
