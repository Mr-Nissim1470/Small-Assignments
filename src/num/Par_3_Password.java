package num;
import java.util.Scanner;
public class Par_3_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * take a string input by user
 * the string is accepted if
 * 1. has one lower case
 * 2. has 1 upper case
 * 3. one digit
 * 4. length of string is more than 8
 * if all good, show accepted 
 * if not, say what is missing */
		
	System.out.println("Please enter an acceptable password containing: \n"
			+ "\t-One lower case chatacter\n"
			+ "\t-One upper case letter\n"
			+ "\t-One digit\n"
			+ "\t-is 8 cahracters long\n");
	Scanner Par = new Scanner(System.in);
	
	String Password = Par.next();
	
	int Lower = 0;
	int Upper = 0;
	int Number = 0;
	
	for (int i = 0; i<Password.length();i++) {
		if(Character.isDigit(Password.charAt(i)))
				Number = 1;
		if(Character.isUpperCase(Password.charAt(i)))
				Upper = 1;
		if(Character.isLowerCase(Password.charAt(i)))
				Lower = 1;
		}
	
	if (Lower !=0 & Number !=0 & Upper !=0 & Password.length()>=8) 
		System.out.println("Password Acceppted");
	else {
		System.out.println("Password Invalid");
		if (Password.length()<8)
			System.out.println("\t-Password must be 8 or more characters long");
		if (Lower == 0)
			System.out.println("\t-Password requires 1 lowercase letter");
		if (Upper == 0)
			System.out.println("\t-Password requires 1 uppercase letter");
		if (Number == 0)
			System.out.println("\t-Password requires 1 number");
	}
		
	
	
	
	
	}

}
