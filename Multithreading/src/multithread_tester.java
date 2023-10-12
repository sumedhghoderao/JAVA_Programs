
class HelloThread extends Thread
	{
		public void run()
		{
			for(int i=0;i<100;i++)
				System.out.println("Hello..."+i);
		}
		
	}
	
	class HiThread extends Thread
	{
		public void run()
		{
			for(int i=0;i<100;i++)
				System.out.println("Hi..."+i);
		}
	}
	
	public class multithread_tester {
		
		public static void main(String[] args) {
			
			HelloThread t1=new HelloThread();
			HiThread t2=new HiThread();
			t1.start();
			t2.start();
		}
		
		
		
		
}
