package prog.MockRevisonColl;
import java.util.*;
class Player implements Comparable{
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

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	@Override
	public int compareTo(Object o) {
		Player p=(Player)o;
		if(this.run>p.getRun()) {
			return 1;
		}
		else if(this.run<p.getRun()){
			return -1;
		}
		return 0;
	}
	
}
public class ComparableApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Player> al = new ArrayList<>();
		System.out.println("Enter the Number of Playres: ");
		int size = xyz.nextInt();
		xyz.nextLine();
		for(int i=0;i<size;i++) {
			Player p = new Player();
			System.out.println("Enter the Player Id: ");
			p.setId(xyz.nextInt());
			xyz.nextLine();
			System.out.println("Enter the Player Name: ");
			p.setName(xyz.nextLine());
			System.out.println("Enter the Player Run: ");
			p.setRun(xyz.nextInt());
			
			al.add(p);
		}
		Collections.sort(al);
		for(Player p1:al) {
			System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
		}
	}

}
