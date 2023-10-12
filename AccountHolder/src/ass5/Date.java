package ass5;

public class Date {
	
	private int dd,mm,yy;
	public Date()
	{
		this.dd=1;
		this.mm=1;
		this.yy=2000;
	}

	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}

	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	
}