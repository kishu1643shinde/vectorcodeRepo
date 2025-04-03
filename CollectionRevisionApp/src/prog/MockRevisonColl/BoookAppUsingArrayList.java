package prog.MockRevisonColl;
import java.util.*;
class Book
{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
class sortById implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else if(o1.getId()<o2.getId()) {
			return -1;
		}
		return 0;
	}	
}
class SortByPrice implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
		else if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}
		return 0;
	}
	
}
class SortByName implements Comparator<Book>
{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}
public class BoookAppUsingArrayList {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Book> al=new ArrayList<>();
		System.out.println("Enter the number of Books: ");
		int size = xyz.nextInt();
		for(int i=0;i<size;i++) {
			Book b = new Book();
			System.out.println("Enter the Book Id: ");
			b.setId(xyz.nextInt());
			System.out.println("Enter the Book Name: ");
			xyz.nextLine();
			b.setName(xyz.nextLine());
			System.out.println("Enter the Book Price: ");
			b.setPrice(xyz.nextDouble());
			al.add(b);
		}
		do {
			System.out.println("1: Sort Book Using its Id: ");
			System.out.println("2: Sort Book Using its Price: ");
			System.out.println("3: Sort Book Using its Name");
			System.out.println("4: exit: ");
			System.out.println("Enter Your Choice: ");
			int choice = xyz.nextInt();
			switch(choice) {
			case 1:
				sortById si = new sortById();
				Collections.sort(al, si);
				for(Book b:al) {
					System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
				}
				break;
			case 2:
				SortByPrice p = new SortByPrice();
				Collections.sort(al, p);
				for(Book b:al) {
					System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
				}
				break;
			case 3:
				SortByName sn = new SortByName();
				Collections.sort(al, sn);
				for(Book b:al) {
					System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
				}
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice.");
				break;
			}
		}while(true);
	}

}
