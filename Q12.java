package cybertek;
import java.util.*;
public class Q12 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("choose package and hours");
	String pack = scan.next();
	double hours = scan.nextInt();
	double price ;
	switch (pack) {
	
	
	case "A":
		price = 9.95;
		if(hours>10) {price = (hours-10)*2+price;
		}
		System.out.println(price);
		break;
	
	case "B":
		price = 13.95;
		if(hours>10) {price = (hours-10)*2+price;
		}
		System.out.println(price);
		break;
	
	case "c":
		price = 19.95;
		System.out.println(price);
		break;

	}
	}
}

