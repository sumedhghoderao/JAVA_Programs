package ass5;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		
		int n=sc.nextInt();
		Student  [] arr=new Student[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=new Student();
			arr[i].accept();
			arr[i].setRollno(i+1);
		}
		
		for(int i=0;i<n;i++)
		{
				arr[i].display();
				System.out.println();
		}
		
	
	
	}
	
	
	
}
