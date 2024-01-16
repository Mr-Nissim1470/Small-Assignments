package num;
import java.util.Scanner;
public class JN950_Assignment2p2___2p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is the comparison program to organize 3 values
		
		System.out.println("give a value");
		Scanner Num = new Scanner(System.in);
		double A = Num.nextDouble();
		
		System.out.println("give a second value");
		
		double B = Num.nextDouble();
		
		System.out.println("give a final value");
		
		double C = Num.nextDouble();
		
		double One = 0;
		double Two = 0;
		double Three = 0;
		
		if (A>=B && A>=C) { 
			One = A;
			if(B>=C) { 
				Two = B;
				Three = C;
				}
			else if(C>=B) {
				Two = C;
				Three = B;
				}
				
			}
			
		else if (B>=A && B>=C) {
			One = B;
			if(A>=C) {
				Two = A;
				Three = C;
				}
			else if (C>=A) {
				Two = C;
				Three = A;
				}
			}
		else if (C>=A && C>=B) {
			One = C;
			if(A>=B) {
				Two = A;
				Three = B;
				}
			else if (B>=A) {
				Two = B;
				Three = A;
				}
			}
		else {
			System.out.println("Calculation error to be determined");
			}
		System.out.println("the 3 values organized in order are:");
		System.out.println(One);
		System.out.println(Two);
		System.out.println(Three);
		System.out.println("\n"+Three+" Is your smallest value");
	}

}
