package prog.MockRevisonColl;
import java.util.*;
public class StackOper {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Stack<Integer> s =new Stack<>();
		do {
			System.out.println("1: Push Data In Stack: ");
			System.out.println("2: Pop data In Stack: ");
			System.out.println("3: Display All Data In Stack: ");
			System.out.println("4: Exit: ");
			System.out.println("Enter Your Choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				s.push(xyz.nextInt());
				break;
			case 2:
				System.out.println("Pop: "+s.pop());;
				break;
			case 3:
				Iterator<Integer> itr=s.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice...");
				break;
			}
		}while(true);
	}

}
