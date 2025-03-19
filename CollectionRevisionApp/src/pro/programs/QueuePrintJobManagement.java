package pro.programs;
import java.util.*;
public class QueuePrintJobManagement {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Queue<String> q = new LinkedList<>();
		do {
			System.out.println("\n1: Add Print Job");
            System.out.println("2: Display All Print Jobs");
            System.out.println("3: Process (Print) Job");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            int choice = xyz.nextInt();
            switch(choice) {
            case 1:
            	
            	xyz.nextLine();
            	System.out.println("Enter the Job Title: ");
            	String jobname=xyz.nextLine();
            	q.add(jobname);
            	System.out.println("Jod Added...");
            	
            	break;
            case 2:
            	if(q.isEmpty()) {
                    System.out.println("No Job Available..😒");
               	}else {
            	System.out.println("Display All jobs: ");
            	for(String s:q)
            	{
            		System.out.println(s);
            	}
               	}
            	break;
            case 3:
            	if(q.isEmpty()) {
                    System.out.println("No Job Available..😒");
               	}else {
            	String  rem=q.remove();
            	System.out.println("Processing job: "+rem);
            	System.out.println("Job Processed Sucssfully..");
               	}
            	break;
            case 4:
            	System.exit(choice);
            	break;
            default:
            	System.out.println("Invalid Choice: ");
            	break;
            }
		}while(true);
	}

}
