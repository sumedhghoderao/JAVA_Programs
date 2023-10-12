import java.util.Scanner;
public class ass6 {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("enter the character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println("ASCII value is " +(int)ch);
		
		int a=ch;
		System.out.println("ASCII value is " +a);
		sc.close();
	}
		
	}