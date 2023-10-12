class Laptop
{
	private int srno;
	private String make;
	private double cost;
	
	
	public Laptop() 
	{
		
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



	public Laptop(int srno, String make, double cost) 
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
public class Tester 
{
	
	public static void main(String[] args) 
	{
		Laptop l1= new Laptop(101,"dell",45000);
		
		System.out.println(l1);
	}

}
