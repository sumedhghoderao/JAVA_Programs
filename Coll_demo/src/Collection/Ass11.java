package Collection;
import java.util.*;

class Employee{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	int id;String name; float salary;	
	
	public void Employee(){
	id=1;
	name="Akshay";
	salary=65000;
}
	public Employee(int id,String name,float salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void Accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		this.name=sc.next();
		System.out.println("enter the salary");
		this.salary=sc.nextFloat();
		
		sc.close();
		
		
	}
	public void Display() {
		System.out.println("id = "+id +" name = "+name+" salary ="+salary);
		
		
}
	
	
	}




public class Ass11 {

		public static void main(String[] args)
		{
			List<Employee> e=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			
			while(true) {
				System.out.println("1.ADD EMPLOYEE");
				System.out.println("2.UPDATE EMPLOYEE");
				System.out.println("3.DISPLAY ALL EMPLOYEE");
				System.out.println("4.EXIT");
				System.out.println("ENTER YOUR CHOICE");
				switch(sc.nextInt()){
				
				case 1:
						System.out.println("enter employee details");
						e.add(new Employee(sc.nextInt(),sc.next(),sc.nextFloat()));
						break;
						
				case 2:
						System.out.println("enter id of employee to be updated");
						int id=sc.nextInt();
						for(Employee x:e) {
							if(id==x.getId()) {
								System.out.println("enter updated name and salary");
								x.setName(sc.next());
								x.setSalary(sc.nextFloat());
							}
							
						}
						
						break;
				case 3:
					for(Employee x:e) {
						x.Display();
					}
				case 4:
					System.exit(0);
				}
				}
			
			
			         
	
		
		

	
		}
}
