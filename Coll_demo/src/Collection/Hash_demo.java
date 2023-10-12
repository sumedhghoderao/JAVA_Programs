package Collection;
import java.util.*;

public class Hash_demo {
	
	public static void main(String[] args) { //creating TreeSet of employee objects
		Set<Integer>set=new TreeSet<>();
		set.add(24);
		set.add(12);
		set.add(3);
		set.add(5);
		
		Map<Integer,String>map=new LinkedHashMap<>();
		map.put(101, "abc");
		map.put(105, "pqr");
		map.put(102, "sys");
		map.put(100, "stu");
		map.put(100, "lmn");
		
		System.out.println(map);
		
	
	}
	
}
