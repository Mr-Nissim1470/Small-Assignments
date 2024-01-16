package disposable;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
public class dummy {

	
	public static void main(String[] args) {
	try {
		int bla [] = {13,2,1,4,17,10};
		int sum = 0;
		int count = 0;
		int Fin = Add(bla,sum,count);
		System.out.println(Fin);
		System.out.println(bla.length);
	}
	catch (IllegalArgumentException ex) {
		System.out.println(ex.getMessage());
	}
	catch (InputMismatchException ex) {
		System.out.println("numbers cannot be that");
	}
}

	private static int Add(int []arr, int sum, int count) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if (arr[count]<0) {
			throw new IllegalArgumentException ("array can't have negative numbers");
		}
		 if(arr.length == 0|count+1 == arr.length) { 
			 return sum+arr[count];
		 }
		 sum+=arr[count];
		 return Add(arr,sum,count+1);
	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File iFile = new File("YosefShape.txt");
		if(!iFile.exists()) {
			System.out.println("File non-existant");
	}
		
		
		Scanner finp = new Scanner(iFile);
		
		File ofile = new File("readme");
		if(ofile.exists()) {
			System.out.println("File already exists");
		}
		
		
		while (finp.hasNext()) {
			String s1 = finp.nextLine();
			String s2 = finp.nextLine();
			System.out.println("Shape of "+s1+" is "+s2);
		}
		finp.close();
		
	}	
*/}
