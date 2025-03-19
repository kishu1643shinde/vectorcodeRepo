package org.programs;
import java.util.*;
public class MargeTwoVectorUseThirdVectorApp {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		
		Vector v2 = new Vector();
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of vector: ");
		int size = xyz.nextInt();//5
		//System.out.println("Enter the value in vector: ");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the first vecctor element: ");
			int no=xyz.nextInt();
			v1.add(no);//1  2 3 4 5
			System.out.println("Enter the second vecctor element: ");
			int no1=xyz.nextInt();
			v2.add(no1);//10 20 30 40 50
		}
		Vector v3 = new Vector();
		v3.addAll(v1);
		v3.addAll(v2);
		System.out.println("display 1 : "+v1);
		System.out.println("display 2 : "+v2);
		System.out.println("display 3 : "+v3);
	}
}
