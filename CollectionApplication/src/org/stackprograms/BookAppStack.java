package org.stackprograms;

import java.util.*;

public class BookAppStack {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Stack s = new Stack();

		do {
			System.out.println("1:Add new book in stack: ");
			System.out.println("2:View All book in stack: ");
			System.out.println("3:Check Top most book: ");
			System.out.println("4:Delete book in stack using id: ");
			System.out.println("5:Search book present in stack or not: ");
			System.out.println("6:Count  the total numbers from stack: ");
			System.out.println("7:Exit: ");
			System.out.println("Enter your choice: ");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter the book id: ");
				int id = xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter book name: ");
				String name = xyz.nextLine();
				System.out.println("Enter the publis date: ");
				String pub = xyz.nextLine();
				System.out.println("Enter the book price: ");
				double price = xyz.nextDouble();
				BookPojo b = new BookPojo(id, name, pub, price);
				s.push(b);
				break;
			case 2:
				if (s.empty()) {
					System.out.println("Stact is empty...");
				} else {
					ListIterator li = s.listIterator(s.size());
					while (li.hasPrevious()) {
						BookPojo book = (BookPojo) li.previous();
						System.out.println(
								book.getId() + "\t" + book.getName() + "\t" + book.getPub() + "\t" + book.getPrice());
					}
				}
				break;
			case 3:
				if (s.empty()) {
					System.out.println("stack is empty: ");
				} else {
					BookPojo book = (BookPojo) s.peek();
					System.out.println(
							book.getId() + "\t" + book.getName() + "\t" + book.getPub() + "\t" + book.getPrice());
				}
				break;
			case 4:
				if (s.empty()) {
					System.out.println("stack is empty: ");
				} else {
					System.out.println("Enter the delete record Id: ");
					int did = xyz.nextInt();
					ListIterator li = s.listIterator(s.size());
					boolean flag = true;
					while (li.hasPrevious()) {
						BookPojo book = (BookPojo) li.previous();
						if (book.getId() == did) {
							flag = false;
							li.remove();
							System.out.println("Deleted....");
							break;
						}
					}
					if (flag) {
						System.out.println("Not found");
					}
				}
				break;
			case 5:
				if (s.empty()) {
					System.out.println("stack is empty: ");
				} else {
					System.out.println("Enter the Search Id: ");
					int sid = xyz.nextInt();
					boolean flag = true;
					ListIterator li = s.listIterator(s.size());
					while (li.hasPrevious()) {
						BookPojo book = (BookPojo) li.previous();
						if (book.getId() == sid) {
							flag = false;
							System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPub() + "\t"
									+ book.getPrice());
							break;
							
						}
					}
					if (flag) {
						System.out.println("Not Found.......");
					}
				}
				break;
			case 6:
				if(s.empty()) {
					System.out.println("stack is empty: ");
				}else {
					ListIterator li = s.listIterator();
					int count=0;
					while(li.hasNext()) {
						BookPojo book = (BookPojo)li.next();
						count++;
					}
					System.out.println("count is: "+count);
				}
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice: ");
			}
		} while (true);
	}
}
