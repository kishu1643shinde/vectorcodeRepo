package prog.MockRevisonColl;
import java.util.*;
public class OperationLinkedList {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		do {
			System.out.println("1: Add node at first: ");
			System.out.println("2: Add node at last: ");
			System.out.println("3: Remove node from first: ");
			System.out.println("4: Remove node from last: ");
			System.out.println("5: view all data from List: ");
			System.out.println("6: Exit: ");
			System.out.println("Enter your choice: ");
			int choice = xyz.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter the Value first: ");
				list.addFirst(xyz.nextInt());
				break;
			case 2:
				System.out.println("Enter the Value Second: ");
				list.addLast(xyz.nextInt());
				break;
			case 3:
				System.out.println("Remove First value: "+list.removeFirst());
				break;
			case 4:
				System.out.println("Remove Last Value: "+list.removeLast());
				break;
			case 5:
				System.out.println("Dispaly All data From List: ");
				for(Integer num: list)
				{
					System.out.println(num);
				}
				break;
			case 6:
				System.exit(choice);
				break;
			default:
				System.out.println("Invaid choice..");
				break;
			}
		}while(true);
	}

}
