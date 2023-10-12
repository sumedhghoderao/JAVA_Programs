package ass12;
import java.util.*;

class Student{
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	public Student() {
		skillset=new LinkedHashSet<>();
	}
	
	public String getName() {
		return name;
	}
	public double getPercentage() {
		return percentage;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student info");
		rollno=sc.nextInt();
		name=sc.next();
		percentage=sc.nextDouble();
		
		System.out.println("Enter 3 skills");
		skillset.add(sc.next());
		skillset.add(sc.next());
		skillset.add(sc.next());
		
		
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+percentage+" "+skillset);
	}
}

class UtilityList{
	private List<Student>list=new ArrayList<>();
	
	public List<Student> getList(){
		return list;
	}
	
	public void createList(Student s)
	{
		list.add(s);
	}
	public void printList() {
		for(Student s:list)
			s.display();
	}
	
	
}

class UtilityReport
{
	private Map<String,Double> m;
	
	public UtilityReport() {
		m=new LinkedHashMap<>();
	}
	
	public void createReport(Student s) {
		m.put(s.getName(),s.getPercentage());
		
	}
	public void showReport() {
		System.out.println(m);
	}
}



public class Tester {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	UtilityList ul=new UtilityList();
	UtilityReport ur=new UtilityReport();
	while(true)
	{
		System.out.println("1.Add Student");
		System.out.println("2.Display All Student");
		switch(sc.nextInt())
		{
		case 1:
				Student s=new Student();
				s.accept();
				ul.createList(s);
				break;
				
		case 2:
				ul.printList();
				break;
				
		case 3:for(Student stud:ul.getList())
					ur.createReport(stud);
		ur.showReport();
		
		
		}
	}
	
}
}
