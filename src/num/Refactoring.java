package num;
import  java.util.Scanner;
public class Refactoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		//function step 1
		//GetYosefValue_step1();
		
		
		//function step 2
		//GetYosefValue_step2();
		
		//function step 3
		//GetYosefValue_step3();
		
		//function step 4
		//GetYosefValue_step4();
		
		
		//function step 5
		GetYosefValue_step5();	
		
		
	}
public static void GetYosefValue_step1() {
	System.out.println("Enter an integer between 11 and 20");
	Scanner UwU = new Scanner(System.in);
	int num = UwU.nextInt();
	System.out.println("You entered a "+num);
}
public static void  GetYosefValue_step2 () {
	System.out.println("Enter an integer between 11 and 20");
	Scanner UwU = new Scanner(System.in);
	int num = UwU.nextInt();
	if (num>=11 || num<=20)
		System.out.println("You entered a "+num);
	else
		System.out.println("The value you entered is not between 11 and 20");
}
public static void GetYosefValue_step3() {
	System.out.println("Enter an integer between 11 and 20");
	Scanner UwU = new Scanner(System.in);
	int num = UwU.nextInt();
	if (num>=11 || num<=20)
		if(num == 11|| num == 18)
			System.out.println("You entered an "+num);
		else	
		System.out.println("You entered a "+num);
	else
		System.out.println("The value you entered is not between 11 and 20");
}
public static void GetYosefValue_step4() {
	System.out.println("Enter an integer between 11 and 20");
	Scanner UwU = new Scanner(System.in);
	if(UwU.hasNextInt()) {//worked better than parse-Int
		int num = UwU.nextInt();
		if (num>=11 || num<=20)
			if(num == 11|| num == 18)
				System.out.println("You entered an "+num);
			else	
			System.out.println("You entered a "+num);
		else
			System.out.println("The value you entered is not between 11 and 20");
	}
	else
		System.out.println("Idiot! Your input could not be read as a number. Get a life!");
}
public static void GetYosefValue_step5() {
	while(true) {
		System.out.println("Enter an integer between 11 and 20");
		Scanner UwU = new Scanner(System.in);
		if(UwU.hasNextInt()) {//worked better than parse-Int
			int num = UwU.nextInt();
			if (num>=11 & num<=20) {
				if(num == 11|| num == 18)
					System.out.println("You entered an "+num);
				else	
				System.out.println("You entered a "+num);
			}
				else
				System.out.println("The value you entered is not between 11 and 20");	
		//break;
		}
		else
			System.out.println("Idiot! Your input could not be read as a number. Try again");
	
	}
}
}
