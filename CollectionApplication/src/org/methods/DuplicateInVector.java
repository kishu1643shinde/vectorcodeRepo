package org.methods;
import java.util.*;

public class DuplicateInVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of vector: ");
		int size=xyz.nextInt();//5
		System.out.println("Enter the elements in vector: ");
		Vector v1 = new Vector();
		for(int i=0;i<size;i++)
		{
			v.add(xyz.nextInt());
		}
		Collections.sort(v);
		System.out.println("values :"+v);
		for(int i=0;i<v.size();)
		{
		    int count=1;
			for(int j=i+1;j<v.size();j++)
			{
				if(v.get(i)==v.get(j))
				{
					count++;
				}
			}
			System.out.println("occurance"+v.get(i)+"count"+count);		//10 10 10 20 20 30
			i=i+count;
		}
	}

}
