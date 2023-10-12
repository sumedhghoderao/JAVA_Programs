
interface Polygon
{
	 public int CalcArea();
	 public int CalcPeri();
		 
}

class Rectangle implements Polygon
{
	int len,brd;
	public Rectangle(int l,int b)
	{
		len=l;
		brd=b;
	}
	public int CalcArea()
	{
		return len*brd;
	}
	public  int CalcPeri()
	{
		return 2*(len+brd);
	}
}


public class Tester {
	public static void main(String [] args)
	{
		Polygon p=new Rectangle(3,4);
		System.out.println(p.CalcArea());
		System.out.println(p.CalcPeri());
	}
}

