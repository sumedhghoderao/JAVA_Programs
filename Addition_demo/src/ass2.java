import java.util.Scanner;
public class ass2 {

	public static void main(String[] args) {
		
		 int m1,m2,m3,m4,m5;
		 float avg;
		 
		 System.out.println("enter marks in five subjects\n");
		 Scanner sc=new Scanner(System.in);
		 m1=sc.nextInt();
		 m2=sc.nextInt();
		 m3=sc.nextInt();
		 m4=sc.nextInt();
		 m5=sc.nextInt();
		// avg=(m1+m2+m3+m4+m5)/5.0f;   // implicit typeconversion

		avg=(float)(m1+m2+m3+m4+m5)/5;  // explicit typeconversion

		System.out.println("average=%f\n" +avg);
		sc.close();

	}

}
