package org.programs;
import java.util.*;
public class SearchStringInVectorApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter size of vector: ");
		int  size = xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter ten String in vector: ");
		for(int i=0;i<size;i++)
		{
			v.add(xyz.nextLine());
		}
		System.out.println(v);
		for(int i=0;i<size;i++)
		{   String s = (String)v.get(i);
			if(s.length()>3 && s.endsWith("sh") ) {
				System.out.println(s);
			}
		}
	}

}
