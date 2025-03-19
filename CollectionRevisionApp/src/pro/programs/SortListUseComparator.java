package pro.programs;
import java.util.*;
class Players 
{
	private int id;
	private String name;
	private int run;
	public Players()
	{
		
	}
	public Players(int id,String name,int run) {
		this.id=id;
		this.name=name;
		this.run=run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
}
class SortPlayerById implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Players p1 = (Players)o1;
		Players p2 = (Players)o2;
		if(p1.getId()>p2.getId()) {
			return 1;
		}
		else if(p1.getId()<p2.getId()) {
			return -1;
		}
		else {
		return 0;
		}
	}
}
class SortPlayerByRun implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Players p1 = (Players)o1;
		Players p2 = (Players)o2;
		if(p1.getRun()>p2.getRun()) {
			return 1;
		}
		else if(p1.getRun()<p2.getRun()) {
			return -1;
		}
		else {
		return 0;
		}
	}	
}
public class SortListUseComparator {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		List<Players> al=new ArrayList<Players>();
		do {
			System.out.println("1: Inster number of records: ");
			System.out.println("2: Sort by Id: ");
			System.out.println("3: Sort by Run: ");
			System.out.println("4: Exit: ");
			System.out.println("Enter your choice: ");
			int choice=xyz.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of record: ");
				int size=xyz.nextInt();
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the Id: ");
					int id=xyz.nextInt();
					xyz.nextLine();
					System.out.println("Enter the Player Name: ");
					String name=xyz.nextLine();
					System.out.println("Enter the Players Runs: ");
					int run=xyz.nextInt();
					Players p = new Players(id,name,run);
					al.add(p);
				}
				break;
			case 2:
				Comparator c = new SortPlayerById();
				Collections.sort(al,c);
				System.out.println("Display players recrods with sorting by Id: ");
				for(Players s:al)
				{
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getRun());
				}
				break;
			case 3:
				c=new SortPlayerByRun();
				Collections.sort(al,c);
				System.out.println("Display players recrods with sorting by Id: ");
				for(Players s:al)
				{
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getRun());
				}
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
