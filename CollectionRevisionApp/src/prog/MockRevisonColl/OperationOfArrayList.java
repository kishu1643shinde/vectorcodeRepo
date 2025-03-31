package prog.MockRevisonColl;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationOfArrayList {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		do {
			System.out.println("1: Add data from Array List: ");
			System.out.println("2: View data from Array List: ");
			System.out.println("3: Search Data using contains method: ");
			System.out.println("4: Search data using indexOf() method");
			System.out.println("5: delete data using index");
			System.out.println("6: count total number of element from ArrayList");
			System.out.println("7: check ArrayList  is empty or not");
			System.out.println("8: Exit: ");
			System.out.println("Enter Your Choice: ");
			int choice=xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the size of Number In ArrayList: ");
				int size = xyz.nextInt();
				System.out.println("Enter the value in Array List: ");
				for(int i=0;i<size;i++)
				{
					al.add(xyz.nextInt());
				}
				break;
			case 2:
				System.out.println("Display data From Array List: ");
				for(Integer num: al)
				{
					System.out.println(num);
				}
				break;
			case 3:
				System.out.println("Enter the Search Data: ");
				int data=xyz.nextInt();
				if(al.contains(data)) {
					System.out.println("Data present in Array List---> "+data);
				}
				else {
					System.out.println("Data Not Found in Array List...");
				}
				break;
			case 4:
				System.out.println("Enter the value: ");
				int value=xyz.nextInt();
				int index =al.indexOf(value);
				if(index!=-1) {
					System.out.println("Data present in Array List---> "+value);
				}
				else {
					System.out.println("Data Not Found In Array List...");
				}
				break;
			case 5:
				System.out.println("Enter the Delete Index: ");
				index=xyz.nextInt();
				if(index>=0 && index<al.size()) {
				System.out.println("Delete Value in Array List---> "+al.remove(index));
				}
				else {
					System.out.println("Invalid Index...");
				}
				break;
			case 6:
				System.out.println("Number Of Element of ArrayList: "+al.size());
				break;
			case 7:
				if(al.isEmpty()) {
					System.out.println("Array List Is Empty...");
				}
				else {
					System.out.println("Array List Is Not Empty...");
				}
				break;
			case 8:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice.");
				break;
			}

		}while(true);
	}

}
