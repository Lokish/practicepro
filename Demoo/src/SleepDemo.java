
public class SleepDemo {

	public static void main(String[] args) 
	{
Thread mainThread=Thread.currentThread();
		
		System.out.println("Name of Thread :"+mainThread.getName());
		System.out.println("Priority of Thread:"+mainThread.getPriority());
		
		
		mainThread.setName("Vital-Thread");
		mainThread.setPriority(8);
		
		System.out.println("Name of Thread After Change:"+mainThread.getName());
		System.out.println("Priority of Thread After Change:"+mainThread.getPriority());
		
		for(int i=1;i<=10;i++)
		{
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e) {}
			
			System.out.println(i);
		}		

	}

}
