//Yosef Nahon
//Assignment 4
//Lottery project
package num;
import java.util.Scanner;
public class Lotto_Ass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LottoNumYosef();
		 
		 
		LottoStrYosef(); 
		 
		 
			/*Character match-ups
			 * 
			 * PH == CH|PH == CT|PH == CO
			 * PT == CH|PT == CT|PT == CO
			 * PO == CH|PO == CT|PO == CO
			 * 
			 * */
		
	}
	//Question 1: 3 number lotto
public static void LottoNumYosef() {
	System.out.println("Welcome to the 3 digit Lotto \n Input a 3 digit number to check");
	Scanner UwU = new Scanner(System.in);
	
	int num = UwU.nextInt();
	
	int PH = num/100;
	
	int PT = (num%100)/10;
	
	int PO = num%10;
	
	System.out.println("You picked #"+num);
	
	System.out.println("---Drawing Ticket---");
	
	int COMP = (int)(100+900*Math.random());
		
	System.out.println("The CPU drew #"+COMP);

	int CH = COMP/100;
	
	int CT = (COMP%100)/10;
	
	int CO = COMP%10;
	
	String R = null;
	
	if (num==COMP)
		R = "$10,000 Congratulations!";
	
	else if (PH == CH|PH == CT|PH == CO
			&&PT == CH|PT == CT|PT == CO
			&&PO == CH|PO == CT|PO == CO)
		R = "$7,000 Congratulations!";
	
	else if (PH == CH|PH == CT|PH == CO && PT == CH|PT == CT|PT == CO 
			||PT == CH|PT == CT|PT == CO && PO == CH|PO == CT|PO == CO
			||PO == CH|PO == CT|PO == CO && PH == CH|PH == CT|PH == CO)
		R = "$4,000 Congratulations!";
		
	else if (PH == CH|PH == CT|PH == CO
			||PT == CH|PT == CT|PT == CO
			||PO == CH|PO == CT|PO == CO)
		R = "$1,000 Congratulations!";
	else
		R = "Nothing, please play again";
	
	 System.out.println("Youre reward is... "+R);
}
//Question 2: String lotto
public static void LottoStrYosef() {
	System.out.println("Welcome To the String lotery match \n Type a 2 digit number to check"); 
	Scanner inp = new Scanner(System.in);
	String YP = inp.next();
	char TensP = YP.charAt(0);
	char OnesP = YP.charAt(1);
	System.out.println("You picked "+YP);
	System.out.println("---Drawing ticket number---");
	String CPU =""+ (int)(10+90*Math.random());
	char TensCPU = CPU.charAt(0);
	char OnesCPU = CPU.charAt(1);
	System.out.println("The computer drew "+CPU); 
	int Reward = 0;
	if (TensP==TensCPU && OnesP==OnesCPU) 
		Reward = 10000;
	else if (TensP==OnesCPU && OnesP==TensCPU)
		Reward = 5000;
	else if (TensP==OnesCPU || OnesP==TensCPU || OnesCPU == OnesP || TensCPU==TensP)
		Reward = 1000;
	else
		Reward = 0;
	
	if (Reward == 0)
		System.out.println("Sorry, no winner today, \nre-run the program to try again");
	else
		System.out.println("Congrats! you won $"+Reward);
}
}
