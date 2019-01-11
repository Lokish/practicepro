import java.io.*;
public class FileWriteDemo 
{
	public static void main(String arg[])
	{
		try
		{
			
			FileOutputStream fos=new FileOutputStream("C:\\java\\MyFile.txt",true);
			
			String content="The Content will be Written to File";
			
			
			for(int count=0;count<content.length();count++)
			{
				fos.write(content.charAt(count));
			}
			
			System.out.println("Content written to File");

			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}