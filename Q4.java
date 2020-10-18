package cybertek;
import java.util.*;
public class Q4 {

public static void main(String[] args) {
	   
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter monthly calls count: ");
	int calls=scan.nextInt();
	double payment = 200;
	int counts = calls%100;
	  if (calls<=150) {
		  payment = payment + counts*0.6;
		  }
	  else if (calls<=200) {
		  counts = calls%150;
		  payment = 230 + counts*0.5;
	      }
	  else if (calls>200) {
		  counts = calls-200;
		  payment = 255 + counts*0.4;
	  }
	  
	System.out.println("Your monthly telephone bill is : "+payment);
	     }
	  }