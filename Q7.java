package assignment_4;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter seconds");
		int minutes = 0, hours = 0, days = 0;
		int seconds = scan.nextInt();
		
			 if (seconds>=86400) {
				 days = seconds/86400;
			 	seconds = seconds&86400;
			 }
			 if (seconds>=3600) {
				 hours = seconds/3600;
				 seconds = seconds%3600;
			 }
			 if (seconds>=60) {
				 minutes = seconds/60;
				 seconds = seconds%60;
			 }
		
		
		
		
		
		System.out.println("there are "+days+" days, "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
	

}
	
}
