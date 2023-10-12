package java_assignments;


class student1
{
	private int rollno;
	private String name;
	private double percentage;
	
	
	public student1() 
	{
		
	}
	static {System.out.println("in the static block");}

	public int getrollno() {
		return rollno;
	}


	public void setrollno(int rollno) {
		this.rollno = rollno;
	}


	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public double getpercentage() {
		return percentage;
	}


	public void setpercentage(double percentage)
	{
		this.percentage = percentage;
	}



	public student1(int rollno, String name, double percentage) 
	{
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() 
	{
		return "student1 [srno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	



	public void display()
	{
		System.out.println(rollno+" "+name+" "+percentage);
	}

}
public class ass3 
{
	
	public static void main(String[] args) 
	{
		student1 l1= new student1(10,"sumedh",45);
		
		System.out.println(l1);
	}

}
