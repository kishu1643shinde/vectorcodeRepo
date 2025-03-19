package pro.programs;
import java.util.*;
import java.lang.*;

class Employee implements Comparable
{
	private int id;
	private String name;
	private int salary;
	public Employee() {
		
	}
    public Employee(int id, String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.salary>e.salary)
		{
			return 1;
		}
		else if(this.salary<e.salary) {
		return -1;
		}
		else {
			return 0;
		}
	}
}
public class SortArrayListApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();
		System.out.println("Enter the number of Records: ");
		int size = xyz.nextInt();//
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Employee Id: ");
			int id =xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter the Employee Name: ");
			String name=xyz.nextLine();
			System.out.println("Enter the Employee Salary: ");
			int salary=xyz.nextInt();
			Employee emp = new Employee(id,name,salary);
			al.add(emp);
		}
		System.out.println("Before Sorting: ");
		for(Employee e:al)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		Collections.sort(al);
		System.out.println("Afetr Sorting: ");
		for(Employee e:al)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		
	}

}
