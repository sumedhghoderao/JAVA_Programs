import java.util.*;

class Product1 implements Comparable<Product1>{
	private int pid;
	private String make;
	private double cost;
	
	public int getPid() {
		return pid;
	}
	
	//Generate HashCode and equals using IDE
	
	
	public Product1(int pid, String make, double cost) {
		super();
		this.pid = pid;
		this.make = make;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product1 [pid=" + pid + ", make=" + make + ", cost=" + cost + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, make, pid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product1 other = (Product1) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(make, other.make)
				&& pid == other.pid;
	}
	
	
	
		public int compareTo(Product1 o) {
			if(this.cost>o.cost)
				return 1;
			else if(this.cost<o.cost)
				return -1;
			else
				return 0;
		}
	
}

class CompareProduct1 implements Comparator<Product1>
{

	@Override
	public int compare(Product1 o1, Product1 o2) {
	
		if(o1.getPid()>o2.getPid())
			return 1;
		else if(o1.getPid()<o2.getPid())
			 return -1;
		else
			return 0;
		
	}
	
}


public class Compare_Demo {

	public static void main(String[] args) {
		
		List<Product1>list=new ArrayList<>();
		
		list.add(new Product1(101,"marker",35));
		list.add(new Product1(102,"bottle",55));
		list.add(new Product1(103,"keyboard",500));
		list.add(new Product1(104,"mouse",200));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println();
		Collections.sort(list,new CompareProduct1());
		System.out.println(list);
		
	}

}

