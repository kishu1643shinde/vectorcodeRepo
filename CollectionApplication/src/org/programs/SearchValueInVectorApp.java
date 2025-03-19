package org.programs;
import java.util.*;
public class SearchValueInVectorApp {
	public static void main(String[] args) {
		Scanner xyz  = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter the size of vector: ");
		int size = xyz.nextInt();
		System.out.println("Enter the value in vector: ");
		for(int i=0;i<size;i++)
		{
			v.add(xyz.nextInt());
		}
		System.out.println("Enter the search value: ");
		int skey=xyz.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(skey==(int)v.get(i)) {
				flag=true;
				break;	
			}		
		}
		if(flag) {
			System.out.println("Search key is found: ");
		}
		else {
			System.out.println("Search key is NOT found: ");	
		}
	}

}
