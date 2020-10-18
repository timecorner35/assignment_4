package cybertek;

public class Q15 {

	public static void main(String[] args) {
		int num = 8;
		String res;
		switch(num) {
		case 0,1,2:
			res = "Low number";
		break;
		case 3,4,5:
			res = "Medium number";
		break;
		default:
			res = "Other number";
			break;
		}
		System.out.println(res);

	}

}
