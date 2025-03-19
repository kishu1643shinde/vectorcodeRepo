package pro.programs;
import java.util.*;
public class FindCommanStringHashSet {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashSet<String>set1 = new HashSet<>();
		HashSet<String>set2 = new HashSet<>();
		System.out.println("Enter the Number of Skils: ");
		int size = xyz.nextInt();
		xyz.nextLine();
		for(int  i=0;i<size;i++)
		{
			System.out.println("Enter the value in first Set: ");
			set1.add(xyz.nextLine());
			System.out.println("Enter the value in Second Set: ");
			set2.add(xyz.nextLine());
		}
		
	    HashSet<String>result = new HashSet<>();
	    for(String comman:set1)
	    {
	    	if(set2.contains(comman)) {
	    		result.add(comman);
	    	}
	    }
	    System.out.println("Display Common String: ");
	    for(String Scom:result)
	    {
	    	System.out.println(Scom);
	    }
//	    Iterator itr=result.iterator();
//	    while(itr.hasNext()) {
//	    	System.out.println(itr.next());
//	    }
	}

}
