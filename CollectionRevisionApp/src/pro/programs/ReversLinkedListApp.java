package pro.programs;
import java.util.*;
public class ReversLinkedListApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Enter the size Of LinkedList: ");
		int  size=xyz.nextInt();
		System.out.println("Enter the value In LinkedList: ");
		for(int i=0;i<size;i++)
		{
			ll.add(xyz.nextInt());//10 20 30 40 50
		}
		System.out.println("Before Display Revers Order: ");
		Iterator it =ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Display Revers Order: ");
		ListIterator i =ll.listIterator(ll.size());
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}

}
