import java.util.Scanner;
public class ass3 {

	public static void main(String[] args) {
		
			int a,b,temp;
			System.out.println("enter values of a and b");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			temp=a+b;	
			System.out.println("Addition of a and b is " +temp);
			sc.close();
		

	}

}
