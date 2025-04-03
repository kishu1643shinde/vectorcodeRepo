package prog.MockRevisonColl;
import java.util.*;
import java.util.Map.Entry;
public class MapWithinMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String, HashMap<Integer, String>> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		HashMap<Integer, String> map3 = new HashMap<>();
		String depm="";
		System.out.println("ENter the size of Student: ");
		int size=xyz.nextInt();
		xyz.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Deparmante type: ");
		    depm=xyz.nextLine();
		    
		    if(depm.equals("CSE")) {
		    	System.out.println("Enteer the id: ");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter the Name: ");
				String name=xyz.nextLine();
				
		    	map2.put(id, name);
		    	map1.put(depm, map2);
			}
		    else if(depm.equals("MECH")){
		    	System.out.println("Enteer the id: ");
				int id=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter the Name: ");
				String name=xyz.nextLine();
				
		    	map3.put(id, name);
			    map1.put(depm, map3);
			}
		    else {
		    	System.out.println("Invalid Department...");
		    }
		}

		Set<Entry<String, HashMap<Integer, String>>>set=map1.entrySet();
		for(Entry<String, HashMap<Integer, String>> m:set) {
			
			System.out.println("Deparment: "+m.getKey());
			
			Set<Map.Entry<Integer, String>>set2=m.getValue().entrySet();
			
			for(Map.Entry<Integer, String> m2:set2) {
				System.out.println(m2.getKey()+"\t"+m2.getValue());
			}
		}
	}
}
