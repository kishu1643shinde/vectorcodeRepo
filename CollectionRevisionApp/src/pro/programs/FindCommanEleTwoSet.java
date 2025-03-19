package pro.programs;
import java.util.*;
public class FindCommanEleTwoSet {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashSet<Integer> hs1 = new HashSet<Integer>();
		System.out.println("Enter the size of first set: ");
		int size=xyz.nextInt();
		System.out.println("Enter the value in first set: ");
		for(int i=0;i<size;i++)
		{
			hs1.add(xyz.nextInt());
		}
		HashSet <Integer>hs2 = new HashSet<Integer>();
		System.out.println("Enter the value in second set: ");
		for(int i=0;i<size;i++)
		{
			hs2.add(xyz.nextInt());//10  30 40 50 20 
		}
		HashSet<Integer> comanSet = new HashSet<Integer>();
		for(int num : hs1)//10 20 30 40 
		{
			if(hs2.contains(num)) {
				comanSet.add(num);
			}
		}
		Iterator i = comanSet.iterator();
		System.out.println("Comman Data from Two sets: ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
