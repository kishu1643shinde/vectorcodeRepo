package pro.programs;
import java.util.*;
public class MapConversionListApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		
		HashMap<Integer, String>hm = new HashMap<Integer,String>();
		System.out.println("Enter the number of element on HashMap: ");
		int size=xyz.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the key: ");
			int key = xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the value: ");
			String value = xyz.nextLine();
			hm.put(key, value);
		}
		List<Map.Entry<Integer, String>> al = new ArrayList<>(hm.entrySet()); 
//		for(Map.Entry<Integer, String> m :al)
//		{
//			System.out.println(m.getKey()+"\t"+m.getValue());
//		}
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
