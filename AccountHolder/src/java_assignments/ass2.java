package java_assignments;
class student
{
	private int rollno;
	private String name;
	private double percentage;
	private static int cnt;
	
	static {
		cnt=0;
	}
	
	public student() 
	{
		 cnt++;
	}
	

	public student(int rollno, String name, double percentage) 
	{
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		cnt++;
	}
	

	public void display()
	{
		System.out.println(rollno+" "+name+" "+percentage);
	}

	public static void showCnt()
	{
		
		System.out.println("Number of Objects"+" "+cnt);
	}
	
}
	
public class ass2
{
	
	public static void main(String[] args) 
	{
		student l1=new student(11,"sumedh",95);
		l1.display();
		student l2=new student(12,"akshay",35);
		l2.display();
	   

		student.showCnt();
	}

}
