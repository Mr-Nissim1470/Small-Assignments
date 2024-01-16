package num;
import java.util.Scanner;
public class IntBufferMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String imp = "";
		double Number = 0;
		boolean TN = false;
		boolean TT = false;
		while (TT == false | TN == false) {
			System.out.println("Give the type of tempature you're inputing");
			Scanner uwu = new Scanner(System.in);
			String Type = uwu.next();
			
			
			if(Type.startsWith("K")|Type.startsWith("k")||
					Type.startsWith("C")|Type.startsWith("c")||
					Type.startsWith("F")|Type.startsWith("f")) {
			
			if(Type.startsWith("K")||Type.startsWith("k")) {
				imp+= "K";
				TT = true;
			}
			if(Type.startsWith("C")||Type.startsWith("c")) {
				imp+= "C";
				TT = true;
			}
			if(Type.startsWith("F")||Type.startsWith("f")) {
				imp+= "F";
				TT = true;}
			}
			else {
				System.out.println("Not a valid letter of tempature. Try again");
				continue;
				}
		
		
			System.out.println("Enter the amount in "+imp);
			if(uwu.hasNextDouble()) {
			Number = uwu.nextDouble();
			TN = true;
				}
			else {
				System.out.println("Input not valid, Try again");
				continue;
				}
		}
		TempatureYosef yay = new TempatureYosef(Number,imp);
		
		
		System.out.println(yay);
		
		
		IntigerBufferYosef pogers = new IntigerBufferYosef();
		System.out.println(pogers.addRandom());
		System.out.println(pogers.addRandom());
		System.out.println(pogers.addRandom());
		System.out.println(pogers.addRandom());
		System.out.println(pogers.getNumberOfValues());
		
		System.out.println(pogers.printToConsole());
		IntigerBufferYosef pool = new IntigerBufferYosef(5);
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.addRandom());
		System.out.println(pool.getNumberOfValues());
		System.out.println(pool.printToConsole());
		
		TempatureYosef test = new TempatureYosef();
		System.out.println(test);
		TempatureYosef me  = new TempatureYosef(32,"F");
		System.out.println(me);
		
		
		
		
	}

}
