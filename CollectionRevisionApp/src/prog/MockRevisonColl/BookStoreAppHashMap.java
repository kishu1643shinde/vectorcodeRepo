package prog.MockRevisonColl;
import java.util.*;
class BookBank
{
	private int id;
	private String name;
	private double price;
	private String athour;
	
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
	public String getAthour() {
		return athour;
	}
	public void setAthour(String athour) {
		this.athour = athour;
	}
	
	public BookBank() {
	}
	public BookBank(int id,String name,double price,String athour) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.athour=athour;
	}
}
public class BookStoreAppHashMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String, ArrayList<BookBank>> map = new HashMap<>();
		ArrayList<BookBank> al = new ArrayList<>();
		ArrayList<BookBank> al1 = new ArrayList<>();
		
		System.out.println("Enter the Number Of Book: ");
		int size=xyz.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Book Id: ");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the Book Name: ");
			String name=xyz.nextLine();
			System.out.println("Enter the Book Price: ");
			double price=xyz.nextDouble();
			System.out.println("Enter the Author Name: ");
			xyz.nextLine();
			String authour=xyz.nextLine();
			System.out.println("Enter the category: ");
			String catg=xyz.nextLine();
			BookBank b = new BookBank(id,name,price,authour);
			if(catg.equals("Programing")) {
			al.add(b);
			map.put("Programing", al);
			}
			else {
				al1.add(b);
			map.put("Spiritual", al1);
			}
		}
		Set<Map.Entry<String, ArrayList<BookBank>>> set=map.entrySet();
		for(Map.Entry<String, ArrayList<BookBank>> m:set) {
			
//			System.out.println(m.getKey()+"\t"+m.getValue());
			System.out.println(m.getKey());
//			ArrayList<BookBank>list=m.getValue();
//			for(BookBank b:list) {
//				System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getAthour());
//			}
			Iterator<BookBank>itr=m.getValue().iterator();
			while(itr.hasNext()) {
				BookBank b=itr.next();
				System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getAthour());
				}
		}
		
	}

}
