package pro.programs;
import java.util.*;
public class LibraryBookManagementUsingStack {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Stack<String> s = new Stack();
		do {
			System.out.println("1: Add Book In Libarary: ");
			System.out.println("2: Display All Book in Libarary: ");
			System.out.println("3: Return Book in Libarary: ");
			System.out.println("4: exit: ");
			System.out.println("Enter your choice: ");
			int choice=xyz.nextInt();
			
			switch(choice) {
			case 1:
				xyz.nextLine();
				System.out.println("Enter the Book name: ");
				s.push(xyz.nextLine());
				System.out.println("Borrow book...");
				
				break;
			case 2:
				for(String stack:s) {
					System.out.println(stack);
				}
				break;
			case 3:
				String retBook=s.pop();
                System.out.println("Book returned to the library: "+s.push(retBook));
			    break;
			case 4:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice: ");
				break;
			}
		}while(true);
	}

}
