package pro.programs;
import java.util.*;
public class StackOperaApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		do {
			System.out.println("1: Push Element in Stack: ");
			System.out.println("2: POP element in stack: ");
			System.out.println("3: Peek element in stack: ");
			System.out.println("4: Display All value in stack: ");
			System.out.println("5: Search value in stack: ");
			System.out.println("6: Exit: ");
			System.out.println("Enter your choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter value in Stack: ");
				s.push(xyz.nextInt());
				break;
			case 2:
				if(s.empty()) {
					System.out.println("Stack is empty: ");
				}
				else {
				System.out.println("remove element: "+s.pop());
				}
				break;
			case 3:
				System.out.println("Show last element: "+s.peek());
				break;
			case 4:
				ListIterator li = s.listIterator(s.size());
				while(li.hasPrevious())
				{
					
					System.out.println(li.previous());
				}
				break;
			case 5:
				System.out.println("Enter the Search element: ");
				int ele=xyz.nextInt();
				int index=s.search(ele);
				System.out.println(index);
				if(index!=-1) {
					System.out.println("Element found...");
				}
				else {
					System.out.println("Element not found.");
				}
				break;
			case 6:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Input: ");
				break;
			}
		}while(true);
	}

}
