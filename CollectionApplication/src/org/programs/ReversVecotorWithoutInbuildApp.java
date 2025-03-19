package org.programs;
import java.util.*;
public class ReversVecotorWithoutInbuildApp {
	public static void main(String[] args) {		
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter the size of vector: ");
		int size = xyz.nextInt();
		System.out.println("Enter the elements in vector: ");
		for(int i=0;i<size;i++)
		{
			v.add(xyz.nextInt());
		}
		//Collections.reverse(v);
		int mid = (v.size()/2);
		int end = (v.size()-1);
		System.out.println("Revers : ");
		for(int i=0;i<mid;i++)
		{
			int temp=(int)v.get(i);
			v.set(i, v.get(end));
			v.set(end, temp);
			end--;
		}
		System.out.println(v);
	}

}
