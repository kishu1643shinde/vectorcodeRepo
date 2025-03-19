package org.programs;
import java.util.*;
public class UniqueValueInVectorApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector v = new Vector();
		System.out.println("Enter the size of vector: ");
		int size = xyz.nextInt();
		System.out.println("Enter the element int vector: ");
	    for(int i=0;i<size;i++)
	    {
	    	v.add(xyz.nextInt());//1 2 1 3 4
	    }
	    boolean flag=true;
	    System.out.println("Display Unique values: ");
	    for(int i=0;i<size;i++)//1
	    {   int temp=(int)v.get(i);//2
	    	for(int j=0;j<size;i++)//0
	    	{
	    		if(i!=j &&temp==(int)v.get(j)) {//2==1
	    			flag=false;
	    			break;
	    		}
	    	}
	    	if(flag) {
		    	System.out.println(v.get(i));
		    }
	    }
	}

}
