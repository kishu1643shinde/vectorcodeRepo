package pro.programs;
import java.util.*;
public class RemoveDuplicateNamesUsingSet {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<String>al = new ArrayList<String>();
		System.out.println("Enter the Student name list And Number of Student: ");
		int size =xyz.nextInt();
		xyz.nextLine();
		
		for(int i=0;i<size;i++)
		{
			al.add(xyz.nextLine());
		}
		System.out.println("Remove Duplicate Student Names: ");
		HashSet<String> set = new HashSet<String>(al);
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
