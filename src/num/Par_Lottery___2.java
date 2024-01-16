package num;
import java.util.Scanner;
public class Par_Lottery___2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * have a randome 2 digit number generate
		 * guess the 2 digit number
		 * if numbers are in reverse = $500 reward
		 * if one number matches = 100$ reward
		 * if complete match = $1000
		 * else say to play again
		 * no string comparisons
		 * (#/10,#%10)
		 * */
		System.out.println("Welcome To the String lotery match \n Type a 2 digit number to check"); 
		Scanner inp = new Scanner(System.in);
		int YourPick = inp.nextInt();
		int TensPI = YourPick/10;
		int OnesPI = YourPick%10;
		System.out.println("You picked "+YourPick);
		System.out.println("---Drawing ticket number---");
		int COMP = (int)(10+90*Math.random());
		int TensCPU = COMP/10;
		int OnesCPU = COMP%10;
		System.out.println("The computer drew "+COMP); 
		int Reward = 0;
		if (YourPick == COMP) 
			Reward = 1000;
		else if (TensPI==OnesCPU && OnesPI==TensCPU)
			Reward = 500;
		else if (TensPI==OnesCPU || OnesPI==TensCPU || OnesCPU == OnesPI || TensCPU==TensPI)
			Reward = 100;
		else
			Reward = 0;
		
		if (Reward == 0)
			System.out.println("Sorry, no winner today, \nre-run the program to try again");
		else
			System.out.println("Congrats! you won $"+Reward);
		
	}

}
