public class MainThreadDemo 
{
	public static void main(String arg[])
	{	
		Thread mainThread=Thread.currentThread();
		
		System.out.println("Name of Thread :"+mainThread.getName());
		System.out.println("Priority of Thread:"+mainThread.getPriority());
		
		mainThread.setName("Imp-Thread");
		mainThread.setPriority(8);
		
		System.out.println("Name of Thread After Change:"+mainThread.getName());
		System.out.println("Priority of Thread After Change:"+mainThread.getPriority());	
	}
}