package disposable;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main1 {//this file was called Main1 due to an error calling it main in one of our first programs.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter three integers separated by space ");
		File iFile = new File("Yosef.txt"); //Put your first name here.
		Scanner input = new Scanner( System.in);
		
		try {
			Scanner f = new Scanner( iFile );
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			System.out.println("File was not found");
		}
		String a = input.next();
		String b = input.next();
		String c = input.next();
		
		String[] d = new String[4];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		int i = Integer.parseInt(a) + Integer.parseInt(b)/Integer.parseInt(c);
		d[3] = Integer.toString(i);
		
		//Finally this statement should be displayed even if it runs or errors out
		System.out.println("Program Executed");
		
		

	}
}