package org.programs;
import java.util.*;
public class OccurVectorApp {

	public static void main(String[] args) {
		Vector v = new Vector();
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of vector: ");
		int size=xyz.nextInt();//5
		System.out.println("Enter the elements in vector: ");
		//System.out.println("Enter the value");
		//int no=xyz.nextInt();//10 20  30 40 50
		for(int i=0;i<size;i++)
		{
			v.add(xyz.nextInt());
		}
		System.out.println("values :"+v);
		for(int i=0;i<v.size();i++)
		{
			int count=1;
			for(int j=i+1;j<v.size();j++)
			{
				if((int)v.get(i)==(int)v.get(j)) {
					count++;
					v.set(j, -1);
				}
			}
			if((int)v.get(i)!=-1 &&count >0)
			System.out.println(v.get(i)+"=============>"+count);
		}
		//System.out.println("after -1 insert:"+v);		
	}

}
