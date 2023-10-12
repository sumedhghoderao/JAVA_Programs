import java.util.Scanner;
public class ass4 {

	public static void main(String[] args) {
		
			int a,b,temp;
			System.out.println("enter values of a and b");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			
			temp=a;
			a=b;
			b=temp;	
			System.out.println("swapped values with third veriable " +a +" " +b);

			System.out.println("\nenter values of a and b\n");
			a=sc.nextInt();
			b=sc.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("swapped values without third veriable " +a +" " +b);
			sc.close();



		
	}

}
