package pro.programs;
import java.util.*;
import java.util.Map.Entry;
public class HashMapOprOnMapApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		do {
			System.out.println("1: Insert Element in HashMap: ");
			System.out.println("2: Retrive data from HashMap: ");
			System.out.println("3: Delete data from HashMap: ");
			System.out.println("4: Exit: ");
			System.out.println("Enter your choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the record size of HashMap: ");
				int size = xyz.nextInt();
				System.out.println("Enter the Key and Value: ");
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the key: ");
					int key=xyz.nextInt();
					xyz.nextLine();
					System.out.println("Enter the Value: ");
					String value=xyz.nextLine();
					hm.put(key, value);
				}
				break;
			case 2:
				System.out.println("HashMap: ");
				Set<Entry<Integer, String>> set=hm.entrySet();
				for(Map.Entry<Integer, String> m:set)
				{
					System.out.println(m.getKey()+"\t"+m.getValue());
				}
				break;
			case 3:
				System.out.println("Enter the delete key: ");
				 String b = hm.remove(xyz.nextInt());
				 System.out.println("Deleted Element: "+b);
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Input: ");
				break;
			}
		}while(true);
	}

}
