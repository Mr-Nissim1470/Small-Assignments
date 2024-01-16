package num;
import java.util.Scanner;
public class KingdomCallFeeYosef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KCF();
	}
public static void KCF() {
	System.out.println("Input your call time: \n");
	Scanner uwu = new Scanner(System.in);
	int P = uwu.nextInt();
	double fee = 0;
	if(P<=10) {
		fee = P*0.50;
	}
	else if(P<20) {
		fee = (10*0.5)+(P-10)*0.25;
	}
	else if(P<40) {
		fee = (10*0.5)+(10*0.25)+(P-20)*0.20;
	}
	else if(P<60) {
		fee = (10*0.5)+(10*0.25)+(20*0.20)+(P-40)*0.10;
	}	
	else {
		fee = (P)*0.39;
	}
	
	System.out.println("Your call fee is $"+fee);
}
}
