package pro.programs;
import java.util.*;
public class RemoveDuplicateUsingSetColleApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer>al = new ArrayList<Integer>();
		System.out.println("Enter the size of Array List: ");
		int  size=xyz.nextInt();
		for(int i=0;i<size;i++)
		{
			al.add(xyz.nextInt());//1 2 3 1 2 3
		}
		System.out.println("Original List: "+al);
		HashSet<Integer>hs = new HashSet<Integer>(al);
		ArrayList<Integer>cleanedList = new ArrayList<Integer>(hs);
		System.out.println("Clean List: "+cleanedList);
//		for(int i=0;i<al.size();i++)
//		{
//		   hs.add(al.get(i));
//		}
//		System.out.println(hs);
	}

}
