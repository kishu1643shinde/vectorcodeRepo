package pro.programs;
import java.util.*;
public class MergeTwoArrayListSort {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.println("Enter the size of arrayList: ");
		int size = xyz.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value in First Array list: ");
			al1.add(xyz.nextInt());
			System.out.println("Enter the value in Second Array list: ");
			al2.add(xyz.nextInt());
		}
		al1.addAll(al2);
		ArrayList<Integer> remodup = new ArrayList<>();
		for(int i=0;i<al1.size();i++)
		{
			for(int j=i+1;j<al1.size();j++)
			{
				if(al1.get(i)==al1.get(j)) {
					if(!remodup.contains(al1.get(i))) {
						remodup.add(al1.get(i));
					}
				}
			}
			
		}
		System.out.println(remodup);
		for(int i=0;i<remodup.size();i++)
		{
			for(int j=i+1;j<remodup.size();j++)
			{
				if(remodup.get(i)>remodup.get(j)) {
					int temp=remodup.get(i);
					remodup.set(i, remodup.get(j));
					remodup.set(j, temp);
				}
			}
		}
		System.out.println(remodup);
	}

}
