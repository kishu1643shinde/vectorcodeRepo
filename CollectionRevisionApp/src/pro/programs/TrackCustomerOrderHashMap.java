package pro.programs;
import  java.util.*;
public class TrackCustomerOrderHashMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String ,ArrayList> hm = new HashMap<>();
		
		do {
			
			System.out.println("1: Add Customer and Customer Order: ");
			System.out.println("2: Display Customer And Order: ");
			System.out.println("3: Remove Order for customer: ");
			System.out.println("4: Modify customer order: ");
			System.out.println("5: Exit: ");
			System.out.println("Enter Your choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				xyz.nextLine();
				System.out.println("Enter the Customer Name: ");
				String name=xyz.nextLine();
				ArrayList<String> al =new ArrayList<>();
				System.out.println("Enter the number of items: ");
				int size=xyz.nextInt();
				xyz.nextLine();
				for(int i=0;i<size;i++)
				{
					al.add(xyz.nextLine());
				}
				hm.put(name, al);
				break;
			case 2:
				System.out.println("Display Customer And Order: ");
				Set<Map.Entry<String, ArrayList>>set=hm.entrySet();
				
				for(Map.Entry<String, ArrayList>m:set)
				{
					System.out.println(m.getKey()+"\t"+m.getValue());
				}
				break;
			case 3:
				xyz.nextLine();
				System.out.println("Enter delete customer:");
				String dkey=xyz.nextLine();
				if(hm.containsKey(dkey))
				{
					hm.remove(dkey);
				}
				System.out.println("Remove Order: ");
				break;
			case 4:
				xyz.nextLine();
				System.out.println("Enter Modify customer order:");
				String Mkey=xyz.nextLine();
				if(hm.containsKey(Mkey)) {
					System.out.println("Enter the delete product index or Modify: ");
					int pindex=xyz.nextInt();
					ArrayList mal = hm.get(Mkey);
					xyz.nextLine();
					if(pindex<mal.size()) {
						mal.remove(pindex);
						System.out.println("Enter the new Product: ");
						String newProd=xyz.nextLine();
						mal.add(pindex, newProd);
						System.out.println("Modify Success...");
					}
					else {
						System.out.println("Intedx Not found.");
					}
				}
				break;
			case 5:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid choice..");
				break;
			}
		}while(true);
	}

}
