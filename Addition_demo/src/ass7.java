import java.util.Scanner;
public class ass7 {

	public static void main(String[] args) {

		 int year;
		 
		 System.out.println("entser year \n");
		 Scanner sc=new Scanner(System.in);
		 year=sc.nextInt();
		 
		 if(year%4==0 && year%100!=0 || year%400==0)
		 {
			 System.out.println("leap\n");
		 }
		 else
		 {
			 System.out.println("not leap\n");
		 }
		
		 sc.close();
		 		 
		 
		 

	}

}
