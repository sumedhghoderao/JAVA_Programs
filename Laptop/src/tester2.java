class Laptop1
{
	private int srno;
	private String make;
	private double cost;
	private static int cnt;
	
	static {
		cnt=0;
	}
	
	public Laptop1() 
	{
		 cnt++;
	}
	

	public Laptop1(int srno, String make, double cost) 
	{
		
		this.srno = srno;
		this.make = make;
		this.cost = cost;
		cnt++;
	}
	

	public void display()
	{
		System.out.println(srno+" "+make+" "+cost);
	}

	public static void showCnt()
	{
		
		System.out.println("Number of Objects"+" "+cnt);
	}
	
}
	
public class tester2 
{
	
	public static void main(String[] args) 
	{
		Laptop1 l1=new Laptop1();
		l1.display();
		Laptop1 l2=new Laptop1(11,"hp",45000);
		l2.display();
		Laptop1 l3=new Laptop1(12,"apple",75000);
		l3.display();
		Laptop1 l4=new Laptop1();
		l4.display();

		Laptop1.showCnt();
	}

}
