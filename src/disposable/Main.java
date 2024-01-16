import java.util.Scanner;
import java.io.File;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter three integers separated by space ");
		File iFile = new File("yourname.txt"); //Put your first name here.
		Scanner input = new Scanner( System.in);
		
		Scanner f = new Scanner( iFile );
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
