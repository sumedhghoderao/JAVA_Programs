class Laptop0
{
	private int srno;
	private String make;
	private double cost;
	
	
	public Laptop0() 
	{
		this(101,"Laptop",4500);
	}
	
	{
		System.out.println("this is instance block");
	}
	
	
	static {System.out.println("in the static block");}

	public int getSrno() {
		return srno;
	}


	public void setSrno(int srno) {
		this.srno = srno;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public double getTest() {
		return cost;
	}


	public void setTest(double test)
	{
		this.cost = test;
	}



	public Laptop0(int srno, String make, double cost) 
	{
		
		this.srno = srno;
		this.make = make;
		this.cost = cost;
	}

	@Override
	public String toString() 
	{
		return "Laptop [srno=" + srno + ", make=" + make + ", cost=" + cost + "]";
	}
	



	public void display()
	{
		System.out.println(srno+" "+make+" "+cost);
	}

}
public class tester4 
{
	
	public static void main(String[] args) 
	{
		Laptop0 l1= new Laptop0(101,"dell",45000);
		
		System.out.println(l1);
	}

}
