package num;
import java.util.Scanner;
public class Yosef_Nahon_KT2ET___2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kryptonian tempature program
		System.out.println("---Kryptonian converter online---");
		System.out.println("Input the tempature you want to convert");
		Scanner inp = new Scanner(System.in);
		double YosefKT; 
		YosefKT = inp.nextDouble();
		System.out.println("--Calculating--");
		double YosefET; 
		YosefET = ((YosefKT-25)*(3.0/13));
		int A = (int) YosefET;
		System.out.println(YosefKT + ": Kryptonian is "+ A + ": Eath tempature");
		
	
		}
	}


