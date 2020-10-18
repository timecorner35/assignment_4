package assignment_4;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter environment and distance");
		String env = scan.next();
		double distance = scan.nextInt();
		double velocity ;
		double time;
		switch (env) {
		case "Air": velocity = 1100;
		time = distance/velocity;System.out.println(time);
		break;
		case "Water" : velocity = 4900;
		time = distance/velocity;System.out.println(time);
		break;
		case "Steel" : velocity = 16400;
		time = distance/velocity;System.out.println(time);
			default : System.out.println("enter please");
		}
		
		
		
		
		
	}

}
