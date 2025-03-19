package pro.programs;
import java.util.*;
public class WordFrequencyHashMap {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Paragraph: ");
		String s = xyz.nextLine();
		String []a= new String[s.length()];
		a=s.toLowerCase().split("\\s");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		System.out.println("Frequency Count: ");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> m :set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
