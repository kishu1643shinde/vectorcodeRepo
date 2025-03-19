package pro.programs;
import java.util.*;
public class MergeTwoArrayListStringSort {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Enter the number of String: ");
		int size = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter the String In Array List: ");
		for(int  i=0;i<size;i++)
		{
			al.add(xyz.nextLine());
		}
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).compareToIgnoreCase(al.get(j)) > 0) {
					String temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
	}

}
