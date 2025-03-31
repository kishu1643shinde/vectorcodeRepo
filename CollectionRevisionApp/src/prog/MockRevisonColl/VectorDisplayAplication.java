package prog.MockRevisonColl;
import java.util.*;
//import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Scanner;
//import java.util.Vector;

public class VectorDisplayAplication {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.println("Enter the number of Value in Vector: ");
		int size = xyz.nextInt();
		System.out.println("Enter the value in vector: ");
		for(int i=0;i<size;i++) {
			v.add(xyz.nextInt());
		}
		System.out.println("Display data using Enumeration: ");
		Enumeration<Integer>num=v.elements();
		while(num.hasMoreElements())
		{
			System.out.println(num.nextElement());
		}
//		System.out.println("Display using forEach Loop: ");
//		for(Integer num:v)
//		{
//			System.out.println(num);
//		}
		
//		System.out.println("Display using While Loop: ");
//		int i=0;
//		while(i<v.size())
//		{
//			System.out.println(v.get(i));
//			i++;
//		}
		
//		System.out.println("Display using for Loop: ");
//		for(int i=0;i<v.size();i++)
//		{
//			System.out.println(v.get(i));
//		}
		
//		System.out.println("Display using Iterator");
//		Iterator i = v.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		System.out.println("Display using ListIterator: ");
//		ListIterator<Integer>i = v.listIterator(v.size());
//		while(i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
		
	}

}
