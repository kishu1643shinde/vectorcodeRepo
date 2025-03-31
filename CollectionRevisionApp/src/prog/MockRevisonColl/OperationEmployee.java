package prog.MockRevisonColl;
import java.util.*;
class Employee
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class OperationEmployee {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<>();
		do {
			
			System.out.println("1: Add Employee: ");
			System.out.println("2: View All Employee data: ");
			System.out.println("3: Search Employee by Using its Id: ");
			System.out.println("4: Delete Employee By Using its Id: ");
			System.out.println("5: Update Employee By using its Id: ");
			System.out.println("6: Find the Same Name Employee: ");
			System.out.println("7: Exit: ");
			System.out.println("Enter Your Choice: ");
			int choice = xyz.nextInt();
			switch(choice) {
			case 1:
				Employee e[] = new Employee[5];
				System.out.println("Enter the Number of Employee");
				int size = xyz.nextInt();
				for(int i = 0 ; i< size; i++)
				{
					e[i]= new Employee();
					System.out.println("Enter the Employe Id: ");
					e[i].setId(xyz.nextInt());
					xyz.nextLine();
					System.out.println("Enter the Employee Name: ");
					e[i].setName(xyz.nextLine());
				    al.add(e[i]);	
				}
				break;
			case 2:
				for(Employee emp:al) {
					System.out.println(emp.getId()+"\t"+emp.getName());
				}
				break;
			case 3:
				System.out.println("Enter the Search Employee Id");
				int skey=xyz.nextInt();
				boolean flag=false;
				for(Employee emp:al) {
					if(emp.getId()==skey) {
						System.out.println(emp.getId()+"\t"+emp.getName());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("Employe Not Found..");
				}
				break;
			case 4:
				System.out.println("Enter the Delete key: ");
				int dkey=xyz.nextInt();
				flag=false;
				Iterator<Employee>itr = al.iterator();
				while(itr.hasNext()) {
					Employee emp=itr.next();
					if(emp.getId()==dkey) {
						itr.remove();
						System.out.println("Remove SuccessFully: ");
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("Employe Not Found..");
				}
				break;
			case 5:
				System.out.println("Enter the Update Index: ");
				int ukey=xyz.nextInt();
				flag=false;
				itr=al.iterator();
				while(itr.hasNext()) {
					Employee emp=itr.next();
					if(emp.getId()==ukey) {
						System.out.println("Enter the New Name: ");
						xyz.nextLine();
						emp.setName(xyz.nextLine());
						System.out.println("Udate SuccessFully...");
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("Employe Not Found..");
				}
				break;
			case 6:
				xyz.nextLine();
				System.out.println("Enter the Search Employee Name: ");
				String Sname=xyz.nextLine();
				flag=false;
				for(Employee emp:al) {
					if(emp.getName().equals(Sname)) {
						System.out.println(emp.getId()+"\t"+emp.getName());
						flag=true;
					}
				}
				if(!flag) {
					System.out.println("Employe Not Found..");
				}
				break;
			case 7:
				System.exit(choice);
				break;
			default:
				System.out.println("Invalid Choice..");
				break;
			}

		}while(true);
	}

}
