package newpackage;

import in.cdac.gadgets.*;
import static in.cdac.gadgets.Laptop1.showCnt;
public class tester6 
{

	
	public static void main(String[] args) 
	{
		Laptop1 l1=new Laptop1();
		l1.display();
		Laptop1 l2=new Laptop1(11,"hp",45000);
		l2.display();
		Laptop1 l3=new Laptop1(12,"apple",75000);
		l3.display();
		Laptop1 l4=new Laptop1();
		l4.display();

		showCnt();
	}

}

	
	

