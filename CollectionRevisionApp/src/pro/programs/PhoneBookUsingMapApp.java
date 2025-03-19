package pro.programs;
import java.util.*;
public class PhoneBookUsingMapApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();	
		System.out.println("Enter the number of User: ");
		int size = xyz.nextInt();
		
		for(int i=0;i<size;i++)
		{
			xyz.nextLine();
			System.out.println("Enter the user Name: ");
			String user=xyz.nextLine();
			System.out.println("Enter the User Phone Number: ");
			int phoneNum=xyz.nextInt();
			hm.put(user, phoneNum);
		}
		Set<Map.Entry<String, Integer>> s = hm.entrySet();
		System.out.println("Display Phone Book Details: ");
		for(Map.Entry<String, Integer> m : s)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
