package org.programs;
import java.util.*;
public class SecondHighVectorApp {

	public static void main(String[] args) {
	  Vector v = new Vector();
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Enter The vector size");
	  int size=xyz.nextInt();
	  System.out.println("Enter the value in vector: ");
	  for(int i=0;i<size;i++)
	  {
		  v.add(xyz.nextInt());
	  }
	  Iterator i = v.iterator();
	  int max1 = 0,max2 = 0;
	  while(i.hasNext())
	  {
		  Object obj = i.next();
		  if((int)obj > max1) {
			 max2 = max1;
			 max1 = (int)obj;
		  }
		  
		  if(max1 > (int)obj) {
			  max2 = (int)obj;
		  }
	  }
	   System.out.println("Second Highest Element: "+max2);
	}

}
