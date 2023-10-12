import in.cdac.*;
public class Tester {

	public static void main(String[] args)
	{
		Employee e1=new WageEmployee(5502,"Jay",23,1,1990,9,1000);
		e1.display();
		
		System.out.println(e1.calcSalary());
		
		Employee e2=new SalesPerson(5503,"Jaya",21,2,1990,9,1000,50,100);
		e2.display();
		
		System.out.println(e2.calcSalary());
		
	}


}
