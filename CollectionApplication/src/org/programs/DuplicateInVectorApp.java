package org.programs;
import java.util.*;

public class DuplicateInVectorApp {

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
		//Collections.sort(v);
		System.out.println("values :"+v);
		for(int i=0;i<v.size();)
		{
			for(int j=i+1;j<v.size();j++)
			{  
				if(v.get(i)==v.get(j))
				{   
					if(!v1.contains(v.get(i))) {
						v1.add(v.get(i));
					}
				}
			}
		}
		System.out.println("Duplicate----"+v1);
	}

}
