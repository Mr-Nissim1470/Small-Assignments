package num;
import java.util.Scanner;
public class CookiesWeekYosef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Ans = CookieCal();
		
		System.out.println("you made $"+Ans+" selling cookies, good job!");
		
	}
public static int CookieCal() {
	String[] Days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	int [] money = new int [7];
	int Sum = 0;
	Scanner uwu = new Scanner(System.in);
	for(int d = 0;d<7;d++) {
		System.out.println("How many packets of cookies sold on "+Days[d]+"?");
		int P = uwu.nextInt();
		System.out.println("What was the price of the packet(s)?");
		int M = uwu.nextInt();
		Sum = Sum + (P*M);
		
	}
	return Sum;
	
}
}
