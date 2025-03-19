package pro.programs;
import java.util.*;
class Product1 
{
	private String name;
	private double price;
	public Product1() {
	}
	public Product1(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
class SortByPrice implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Product1 p1 = (Product1)o1;
		Product1 p2 = (Product1)o2;
		if(p1.getPrice()>p2.getPrice()) {
			return 1;
		}
		else if(p1.getPrice()<p2.getPrice()) {
			return -1;
		}else {
		return 0;
		}
	}	
}
public class SortingByIdUseComparator {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Product1> al = new ArrayList<Product1>();
		System.out.println("Enter the size of Product : ");
		int size=xyz.nextInt();
		
		for(int i=0;i<size;i++)
		{
			xyz.nextLine();
			System.out.println("Enter the Product Name: ");
			String name=xyz.nextLine();
			System.out.println("Enter the Product Price: ");
			double price=xyz.nextDouble();
			Product1 p = new Product1(name, price);
			al.add(p);
		}
		Comparator c = new SortByPrice();
		Collections.sort(al,c);
		for(Product1 p:al) {
			System.out.println(p.getName()+"\t"+p.getPrice());
		}
	}
}
