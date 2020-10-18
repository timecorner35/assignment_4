package assignment_4;
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter calories and fat grams");
		double calories = scan.nextInt();
		double gramfat = scan.nextInt();
		double calioriesFromFat = gramfat * 9;
		double percen = calioriesFromFat/calories*100;
		//System.out.println(percen);
		if(percen>100) {
			System.out.println("invalid iinput");
			return ;
		}
		if(percen<30) {
			System.out.println("food is low in fat");
		}
		else {
			System.out.println("food is high fat");
		}
		
		
	}

}
