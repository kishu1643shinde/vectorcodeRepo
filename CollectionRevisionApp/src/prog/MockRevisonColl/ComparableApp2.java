package prog.MockRevisonColl;
import java.util.*;
class Player2 {
	private int  id;
	private String name;
	private int run;
	
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

	public Integer getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
}
public class ComparableApp2 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Player2> list = new ArrayList<>();
		System.out.println("Enter the Number of Playres: ");
		int size = xyz.nextInt();
		xyz.nextLine();
		for(int i=0;i<size;i++) {
			Player2 p = new Player2();
			System.out.println("Enter the Player Id: ");
			p.setId(xyz.nextInt());
			xyz.nextLine();
			System.out.println("Enter the Player Name: ");
			p.setName(xyz.nextLine());
			System.out.println("Enter the Player Run: ");
			p.setRun(xyz.nextInt());
			
			list.add(p);
		}
//		list.sort(new Comparator<Player2>() {
//
//			@Override
//			public int compare(Player2 o1, Player2 o2) {
//				
//				return o2.getRun().compareTo(o1.getRun());
//			}
//			
//		});
		
		list.sort((Player2 o1, Player2 o2)-> o2.getRun().compareTo(o1.getRun()));
		
		for(Player2 p1:list) {
			System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
		}
	}

}

