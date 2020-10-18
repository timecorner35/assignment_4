package assignment_4;
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		int price = 99; int discount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("how many packages did u buy?");
		int quantity = scan.nextInt();
		int tot = price*quantity;
		if (quantity<=0) {
			System.out.println("buy smt");
			return;
		}
		discount = (quantity>9) ? (quantity>20) ? (quantity>50) ? (quantity>100) ? 50 :40 :30 : 20 :0;
		int totdis = tot*discount/100;
		System.out.println("total discount is "+totdis+" £");
		System.out.println("total pay is "+(tot-totdis)+" £");

	}

}
