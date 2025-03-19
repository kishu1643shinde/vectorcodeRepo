package pro.programs;
import java.util.*;
public class SetCollecOperApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		do {
			System.out.println("1: Add Element in HashSet Collection: ");
			System.out.println("2: Check Element Exit in HashSet Collection: ");
			System.out.println("3: Find the size of  HashSet Collection: ");
			System.out.println("4: exit: ");
			System.out.println("Enter your choice: ");
			int  choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the size of HashSet collection: ");
				int size=xyz.nextInt();
				int i=0;
				System.out.println("Enter value in HashSet collection: ");
				while(i<size) {
					hs.add(xyz.nextInt());
					i++;
				}
				System.out.println("HashSet: "+hs);
				break;
			case 2:
				
				if(hs.isEmpty()) {
					System.out.println("HashSet is Emty: ");
				}
				else {
					System.out.println("Enter the exit element: ");
					int ele=xyz.nextInt();
					boolean b = hs.contains(ele);
					if(b) {
						System.out.println("Element is Exit... ");
					}
					else {
						System.out.println("Element is NOT Exit... ");
					}
				}
				break;
			case 3:
				System.out.println("Size of HashSet: "+hs.size());
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Input: ");
				break;
			}
		}while(true);
	}

}
