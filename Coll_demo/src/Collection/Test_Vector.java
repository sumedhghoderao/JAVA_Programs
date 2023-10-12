package Collection;
import java.util.*;
public class Test_Vector {
	public static void main(String[] args)
	{
		List<Integer> v=new Vector<>();
		v.add(12);
		v.add(10);
		v.add(15);
		
		System.out.println(v);       	//using toString method
		
		for(Integer x:v)				//using for-each loop
		{
			System.out.println(x+" ");
		}
		System.out.println();
	
		Iterator itr=v.iterator();		//using Iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println();
	
	
	
	}
	
	
	

}
