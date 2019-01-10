public class ThreadDemo extends Thread 
{
	public void run()
	{
		for(int count=1;count<=10;count++)
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
				Thread.sleep(1000);
				}
				catch(Exception e) {}
				
				System.out.println(i);
			}		
			System.out.println(Thread.currentThread().getName()+":"+count);
		}
	}
	
	public static void main(String arg[])
	{
		ThreadDemo thread1=new ThreadDemo();
		ThreadDemo thread2=new ThreadDemo();
		
		thread1.setName("First");
		thread2.setName("Second");
		
		thread1.start();
		for(int j=1;j<=10;j++)
		{
			try
			{
			Thread.sleep(500);
			}
			catch(Exception e) {}
			
			System.out.println(j);
		}		
		thread2.start();
	}
}