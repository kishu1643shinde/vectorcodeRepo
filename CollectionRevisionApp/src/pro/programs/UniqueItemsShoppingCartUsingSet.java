package pro.programs;
import java.util.*;
class Product
{
	private int id;
	private String name;
	
	public Product() {
	}
	public Product(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
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
	
}
public class UniqueItemsShoppingCartUsingSet {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashSet<Product> hs = new HashSet<>();
		do {
			System.out.println("1: Add Items: ");
			System.out.println("2: Display Items: ");
			System.out.println("3: Remove Items: ");
			System.out.println("4: Check Items present or not: ");
			System.out.println("5: exit: ");
			System.out.println("Enter Your choice: ");
			int choice=xyz.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the Product Id: ");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter the Product name: ");
				String name = xyz.nextLine();
				Product p = new Product(id,name);
				hs.add(p);
				break;
			case 2:
				for(Product o:hs)
				{
					System.out.println(o.getId()+"\t"+o.getName());
				}
				break;
			case 3:
				System.out.println("Enter the Delete product Id: ");
				int pid=xyz.nextInt();
				
				for(Product o:hs)
				{
				  if(o.getId()==pid) {
				  hs.remove(o);
				  System.out.println("Product Removed..");
				  break;
				  }else {
					  System.out.println("Product Id Not Found..😒");
				  }
				}
				break;
			case 4:
				xyz.nextLine();
				System.out.println("Enter the Product name: ");
				String sename=xyz.nextLine();
				boolean flag=false;
				for(Product o:hs)
				{
				  if(o.getName().equals(sename))
				  {
					  System.out.println("Item are Presents...");
					  flag=true;
					break;
				  }
				  if(!flag){
					  System.out.println("item Are Not Found...");
				  }
				  
				}
				break;
			case 5:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid choice.... ");
				break;
			}
		}while(true);
	}

}
