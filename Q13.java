package cybertek;
import java.util.*;
public class Q13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many checks");
		int checks = scan.nextInt();
		double price = 10;
		double ext;
		if(checks<20) {
			ext = checks*0.1;
		}
		else if(checks<40) {
			ext = checks*0.08;
		}
		else if(checks<60) {
			ext = checks*0.06;
		}
		else {
			ext = checks*0.04;
		}
		System.out.println(price+ext);
	}

}
