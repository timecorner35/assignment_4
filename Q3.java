package cybertek;
import java.util.*;
public class Q3 {

	
	
		public static void main(String[] args) {
			System.out.println("enter year");
			Scanner scan = new Scanner(System.in);
			int year = scan.nextInt();
			switch(year%4) {
			case 0:
				if(year%400==0) {
					System.out.println("Leap year");
					break;
				}
				if(year%100==0) {
					System.out.println("Not a leap year");
					break;
				}
				System.out.println("Leap  year");
				
			}	
				}
			}
		
			
		
		
			
			
		
	
		
	
		
	

