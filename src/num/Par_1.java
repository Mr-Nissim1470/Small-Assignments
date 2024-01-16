
package num;
import java.util.Scanner;
public class Par_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input a number");
		Scanner inp = new Scanner(System.in);
		double x = inp.nextDouble();
		
		System.out.println("input a second number");
		Scanner lol = new Scanner(System.in);
		double y = lol.nextDouble();
		
		String operation;
		
		System.out.println("decide on an operation to be performed between the 2 numbers");
		System.out.println("1: Add "+ x + " and "+y);
		System.out.println("2: Subtract "+ y + " from "+x);
		System.out.println("3: Multiply "+ x + " by "+y);
		System.out.println("4: Divide "+ x + " by "+y);
		
		Scanner num = new Scanner(System.in);
		operation = num.next();
		
		switch(operation) {
		case("1"):
		case("+"):
		case("Add"):
		case("add"):
			System.out.println(x+" pluss "+y+" equals "+(x+y));
			break;
		case("2"):
		case("-"):
		case("Subtrqct"):
		case("subtract"):
			System.out.println(x+" minus "+y+" equals "+(x-y));
			break;
		case("3"):
		case("X"):
		case("*"):
		case("Multiply"):
		case("multiply"):
			System.out.println(x+" times "+y+" equals "+(x*y));
			break;
		case("4"):
		case("/"):
		case("Divide"):
		case("divide"):
			System.out.println(x+" divided by "+y+" equals "+(x/y));
			break;
		default:
			System.out.println("input is invalid, select one of the preceding numerals [1,2,3,4]");
		}
		
		
		
	}

}
