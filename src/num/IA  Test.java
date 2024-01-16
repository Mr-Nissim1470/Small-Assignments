package num;
import java.util.Scanner;
public class IANahonTest {

	public static void main(String[] args) {
		int [] arr0= { -2,-1 }; 
		int [] arr1= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		int [] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 7, 6, 22, 8, 9, 16, 5, 2, 7, 8, 12, 2, 0, 14, 17, 19, 22 }; 
		IntegerArrayNahon A1 = new IntegerArrayNahon( arr0 );
		IntegerArrayNahon A2 = new IntegerArrayNahon( arr1 );
		IntegerArrayNahon A3 = new IntegerArrayNahon( arr2 );

		testDataBuffer( A1 ); 
		testDataBuffer( A2 ); 
		testDataBuffer( A3 ); 
       }
		 
public static void testDataBuffer(IntegerArrayNahon A ) { 
		 
		A.printLiteral(); 
		
		System.out.println("Sum of Array: " + A.sumOfArray());
		System.out.println("Max of Array: " + A.maxInArray());
		System.out.println("Min of Array: " + A.minInArray());
		System.out.println("Range of Array: " + A.rangeInArray());
		System.out.println("Mean value of Array: " + A.mean()); 
		
		Scanner inp = new Scanner( System.in);
		System.out.print("Enter an  integer to clip the array with: ");
		int clipNum = inp.nextInt();
		
		A.clip( clipNum );
        A.printLiteral();
	} 



}
