import java.util.Scanner;
public class ass5 {

	public static void main(String[] args) {
		 int bs;
		 float hra,da,pf,gs,ns;
		 
		 System.out.println("enter basic salary;\n");
		 Scanner sc=new Scanner(System.in);
		 bs=sc.nextInt();
		 
		 
		 hra=0.15f*bs;
		 da=0.3f*bs;
		 
		 gs=bs+hra+da;
		 
		 pf=0.125f*gs;
		 
		 ns=gs - pf;
		 
		 System.out.println("gross salary="+gs +"\nNET SALARY="+ns);
		 sc.close();
		 
	}

}
