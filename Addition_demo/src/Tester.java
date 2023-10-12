import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) 
	{
	
	int a,b,c;
	Scanner sc=new Scanner(System.in);	
    System.out.println("enter the two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
	System.out.println("Sum is "+c);
	sc.close();
	}
	

}
