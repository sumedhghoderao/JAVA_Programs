import java.awt.*;

class MovingStrings extends Frame implements Runnable
{
	
	Thread t1,t2;
	int x1,x2;
	
	public MovingStrings() {
		x1=300;
		x2=300;
		t1=new Thread(this,"t1");
		t2=new Thread(this,"t2");
		t1.start();
		t2.start();
			
	}
	
public void paint(Graphics g)
{
	g.setColor(Color.CYAN);
	g.setFont(new Font("Tahoma",50,50));
	g.drawString("CDAC", x1, 300);
	
	g.setColor(Color.ORANGE);
	g.setFont(new Font("Tahoma",50,50));
	g.drawString("DHPCAP", x2, 300);
}

public void run() {
	while(true)
	{
		if(Thread.currentThread()==t1)
		{
			x1++;
			if(x1==this.getWidth())
				x1=-10;
			try {
				Thread.sleep(30);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(Thread.currentThread()==t2) {
			x2--;
			if(x2==0)
				x2=this.getWidth();
			
			try {
				Thread.sleep(30);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}repaint();
		
		
		
	}
}



}


public class multithreading_example {
	public static void main(String[] args) {
		MovingStrings fr=new MovingStrings();
		fr.setSize(600,600);
		fr.setVisible(true);
	}

}
