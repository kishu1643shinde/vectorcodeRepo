package prog.MockRevisonColl;
import java.util.*;
public class StoreDataTreeMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		TreeMap<Integer, String> map = new TreeMap<>();
		System.out.println("Enter the Size of map: ");
		int size=xyz.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Student Id: ");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the Student Name: ");
			String name=xyz.nextLine();
			map.put(id, name);
		}
		System.out.println("Display: ");
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		for(Map.Entry<Integer, String> m:set) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
