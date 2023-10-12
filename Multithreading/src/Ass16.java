import java.util.*;
class Ass161 implements Runnable
	{
		Thread t1,t2;
		int a,b;
		public Ass161()
		{
			System.out.println("enter number");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("enter number");
			b=sc.nextInt();
			
			t1=new Thread(this,"a");
			t2=new Thread(this,"b");
			t1.start();
			t2.start();
		}
		@Override
		public void run() {
			for(int i=1;i<10;i++)
			{
				if(Thread.currentThread()==t1)
					System.out.println(a++);
				else if(Thread.currentThread()==t2)
					System.out.println(b*i);
			}
			
		}
	}

public class Ass16{
	public static void main(String[] args) {
		new Ass161();
	}
}
		
	