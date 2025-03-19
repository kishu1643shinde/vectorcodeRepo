package pro.programs;
import java.util.*;
public class MergTwoListApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList al1 = new ArrayList();
		System.out.println("Enter the size of Arrya List: ");
		int size=xyz.nextInt();
		System.out.println("Enter the value in first Array list: ");
		for(int i=0;i<size;i++)
		{
			al1.add(xyz.nextInt());//10 20 30 40 50
		}
		ArrayList al2 = new ArrayList();
		System.out.println("Enter the value in first Array list: ");
		for(int i=0;i<size;i++)
		{
			al2.add(xyz.nextInt());//60 70 10 20 
		}
		al1.addAll(al2);//10 20 30 40 50 60 70 10 20 
		System.out.println(al1);
		HashSet hs = new HashSet(al1);//10 20 30 40 50 60 70
		ArrayList al3= new ArrayList(hs);
		System.out.println("Merg List: "+al3);
		
	}

}
