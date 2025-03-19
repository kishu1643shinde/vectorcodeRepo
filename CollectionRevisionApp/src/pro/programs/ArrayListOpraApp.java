package pro.programs;
import java.util.*;
public class ArrayListOpraApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer>al = new ArrayList<Integer>();
		do {
			System.out.println("1: Add element in Array List: ");
			System.out.println("2: view Array List: ");
			System.out.println("3: Remove element from array list: ");
			System.out.println("4: Exit: ");
			System.out.println("Enter your choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the size of Array list: ");
				int size = xyz.nextInt();
				for(int i=0;i<size;i++)
				{
					al.add(xyz.nextInt());
				}
				break;
			case 2: 
				Iterator i = al.iterator();
				while(i.hasNext())
				{   
					System.out.println(i.next());
				}
				break;
			case 3:
				System.out.println("Enter the Remove Element: ");
				int ele=xyz.nextInt();
				Iterator i1=al.iterator();
				boolean flag = false;
				while(i1.hasNext())
				{
					if((int)i1.next()== ele) {
						i1.remove();
						flag=true;
						System.out.println("Element remove. ");
						break;
					}
				}
				if(!flag) {
					System.out.println("Element not found...");
				}
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice.");
			}
		}while(true);
	}

}
