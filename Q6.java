package cybertek;
import java.util.*;
public class Q6 {

public static void main(String[] args) {
	   
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the mass");
	double mass=scan.nextInt();
	double weight = 9.8* mass;
	
	  if (weight<10) {
		  System.out.println("too light");
		  }
	  else if (weight>1000) {
		  System.out.println("too heavy");
		  
	      }
}
	  }