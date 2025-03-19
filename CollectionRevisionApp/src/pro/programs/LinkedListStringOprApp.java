package pro.programs;
import java.util.*;
public class LinkedListStringOprApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList<String> ll = new LinkedList<String>();
		do {
			System.out.println("1: Add String in Linked List: ");
			System.out.println("2: view Linked List: ");
			System.out.println("3: Remove String from Linked list: ");
			System.out.println("4: Exit: ");
			System.out.println("Enter your choice: ");
			Iterator<String> itr = ll.iterator();
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the size in LinkedList: ");
				int size=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter the Values in LinkedList: ");
				for(int i=0;i<size;i++)
				{
					ll.add(xyz.nextLine());
				}
				break;
			case 2:
				System.out.println(ll);
//				while(itr.hasNext())
//				{Object o = itr.next();
//					System.out.println(o);
//				}
				break;
			case 3:
				xyz.nextLine();
				System.out.println("Enter the delete Element: ");
				String ele=xyz.nextLine();
				boolean flag = false;
				while(itr.hasNext())
				{
					if(itr.next().equals(ele)) {
						itr.remove();
						flag=true;
						System.out.println("Remove Data...");
						break;
					}
				}
				if(!flag) {
					System.out.println("Element not found..");
				}
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice.");
				break;
			}
		}while(true);
	}

}
