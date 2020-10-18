package assignment_4;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter weight");
		 System.out.println("enter distance");
		 int weight = scan.nextInt();
		 int distance = scan.nextInt();
		 double rate = (weight>2) ? (weight>6) ? (weight>10) ? 3.8 : 3.7 : 2.2 : 1.1;
		 double pay = 1.1+(distance/550)*rate;
		 System.out.println(pay);
	}

}
