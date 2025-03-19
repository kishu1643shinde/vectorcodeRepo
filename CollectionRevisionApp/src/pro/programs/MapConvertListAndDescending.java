package pro.programs;
import java.util.*;
public class MapConvertListAndDescending {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();
		System.out.println("Enter the size of HashMap: ");
		int size =xyz.nextInt();
		
		for(int i=0;i<size;i++)
		{
			xyz.nextLine();
			System.out.println("Enter the Name: ");
			String name=xyz.nextLine();
			System.out.println("Enter the Salary: ");
			int salary=xyz.nextInt();
	        map.put(name, salary);
		}
		System.out.println("Display Map: ");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> m : set) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		System.out.println("After Sorting Display List: ");
		ArrayList<Map.Entry<String, Integer>> al=new ArrayList(map.entrySet());
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).getValue() < al.get(j).getValue()) {
					Map.Entry<String, Integer> temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println("before Sorting Display List: ");
		Iterator itrr=al.iterator();
		while(itrr.hasNext()) {
			System.out.println(itrr.next());
		}
		
	}

}
