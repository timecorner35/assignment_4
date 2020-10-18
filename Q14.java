package cybertek;
import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many books");
		int earn = 0;
		int num = scan.nextInt();
		if(num==0)earn = 0;
		else if(num==1)earn = 5;
		else if(num==2)earn = 15;
		else if(num==3)earn = 30;
		else if(num>=4)earn = 60;
		System.out.println(earn+" points you are awarded this month");
	}

}
