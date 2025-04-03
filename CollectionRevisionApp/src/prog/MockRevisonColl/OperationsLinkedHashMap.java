package prog.MockRevisonColl;
import java.util.*;
public class OperationsLinkedHashMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedHashMap<Integer, String> map = new LinkedHashMap <>();
		do {
			System.out.println("1: Add new Data in Map: ");
			System.out.println("2: View All data from Map Using Mpap.Entry: ");
			System.out.println("3: Search name of student using its id with the help of get() method");
			System.out.println("4: search name of student using its id with the help of containsKey() method ");
			System.out.println("5: delete student record from map using its id.");
			System.out.println("6: update the name of student using its id ");
			System.out.println("7: show all data from map using values() method ");
			System.out.println("8: show the all keys from map using keySet() method ");
			System.out.println("9: exit: ");
			System.out.println("Enter Your Choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Number of Student: ");
				int size=xyz.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter the Student Id: ");
					int id=xyz.nextInt();
					xyz.nextLine();
					System.out.println("Enter the Student Name: ");
					String name=xyz.nextLine();
					map.put(id, name);
				}
				break;
			case 2:
				System.out.println("Display All Data from Map: ");
				Set<Map.Entry<Integer, String>>s=map.entrySet();
				System.out.println("Student Id"+"\t"+"Student Name");
				for(Map.Entry<Integer, String> m:s) {
					System.out.println(m.getKey()+"\t\t"+m.getValue());
				}
				break;
			case 3:
				System.out.println("ENter the ssearch Id: ");
				int  sid=xyz.nextInt();
				System.out.println("Student Id"+"\t"+"Student Name");
				boolean flag=false;
				for(Map.Entry<Integer, String> m:map.entrySet()) {
					if(m.getKey()==sid) {
						System.out.println("Data Find: ");
						System.out.println(m.getKey()+"\t\t"+m.getValue());
						flag=true;
						break;
					}
				}
				if(!flag) {
					System.out.println("Data Not Found...");
				}
				break;
			case 4:
				System.out.println("Enter the search Id: ");
				sid=xyz.nextInt();
				if(map.containsKey(sid)) {
					System.out.println("Student Name is: "+map.get(sid));
				}
				else {
				System.out.println("Data Not Found...");
			}
				break;
			case 5:
				System.out.println("Enter the Delete Id: ");
				sid=xyz.nextInt();
			    flag=false;
				for(Map.Entry<Integer, String> m:map.entrySet()) {
					if(m.getKey()==sid) {
						map.remove(m.getKey());
						System.out.println("Remove Data SuccessFully...");
						flag=true;
						break;
					}
				}
				if(!flag) {
					System.out.println("Data Not Found...");
				}
				break;
			case 6:
				System.out.println("Enter the Student Update Id: ");
				sid=xyz.nextInt();
				xyz.nextLine();
				if(map.containsKey(sid)) {
					System.out.println("Enter the new Name Of Student: ");
					String newName=xyz.nextLine();
					map.put(sid, newName);
				}
				else {
					System.out.println("Data Not Found...");
				}
				break;
			case 7:
				System.out.println(map.values());
				break;
			case 8:
				System.out.println(map.keySet());
				break;
			case 9:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}while(true);
	}

}
