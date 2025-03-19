package pro.programs;
import java.util.*;
class Student 
{
	private String name;
	private float grade;
	public Student() {
	}
	public Student(String name,float grade) {
		this.name=name;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}	
}
public class StudentGradeUsingLinkedListApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList<Student> ll = new LinkedList<>();
		do {
			System.out.println("1: Add Student: ");
			System.out.println("2: Display All Student: ");
			System.out.println("3: Display Pass Student Grade is Greater than 50: ");
			System.out.println("4: Display Student: ");
			System.out.println("5: Exit: ");
			System.out.println("Enter your choice: ");
			int choice = xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number of Student data: ");
				int size = xyz.nextInt();
				System.out.println("Enter the Student data in Linked List:\n ");
				for(int i=0;i<size;i++)
				{
					xyz.nextLine();
					System.out.println("enter the Student Name: ");
					String name=xyz.nextLine();
					System.out.println("Enter the Studetn Grade: ");
					float grade=xyz.nextFloat();
					Student s = new Student(name,grade);
					ll.add(s);
				}
				break;
			case 2:
				System.out.println("All Student: ");
				for(Student e :ll)
				{
				    System.out.println(e.getName()+"\t"+e.getGrade());
				}
				break;
			case 3:
				System.out.println("Pass Student: 😎😎");
				for(Student e :ll)
				{
					if(e.getGrade()>50)
					{
						System.out.println(e.getName()+"\t"+e.getGrade());
					}
				}
				break;
			case 4:
				System.out.println("Failed Student: 😒😒");
				for(Student e :ll)
				{
					if(e.getGrade()<50)
					{
						System.out.println(e.getName()+"\t"+e.getGrade());
					}
				}
				break;
			case 5:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice: ");
				break;
			}
		}while(true);
	}

}
