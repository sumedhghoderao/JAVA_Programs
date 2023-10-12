package ass5;
import java.util.Scanner;

 class Student{
	
	private int rollno;
	private String name;
	private Date dob;
	
	public Student() {
		rollno = 0;
		name = "abc";
		dob = new Date(26,9,1990);
	}

	public Student(int rollno, String name,int d,int m,int y) {
		
		this.rollno = rollno;
		this.name = name;
		dob = new Date(d,m,y);
	}
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	
	
	public void accept()
	{
		System.out.print("Enter name: ");
		Scanner sc=new Scanner(System.in);
		String name = sc.nextLine();
		this.name=name;
		System.out.println("Enter dob");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		this.dob=new Date(d,m,y);
		//sc.close();
			
	}
	
	void display()
	{
		System.out.println("roll number= "+ rollno);
		System.out.println("name= "+name);
		System.out.println("DOB= ");
		dob.display();
	}


}

