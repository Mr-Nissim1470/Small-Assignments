package num;

public class Par_append_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = new int [10];
		
		int [] arr2 = new int[7];
		
	  /*
	   * fill aray 1 with first 10 odd numbers 
	   * fill aray 2  with 7 random numbers between 1 to 99 (include 99)
	   * create function append Array which appends arr2 at the end of arr1*/
	
		int CountA1 = 0;
		int CountA2 = 0;
		
		while (CountA1 != 10) {
			int Num1 = (int) (1+Math.random()*99);
			System.out.println("---Checking---\n"+Num1);
			if (Num1 %2==1) {
				arr1[CountA1]=Num1;
				CountA1++;
			}
			else
				continue;
		}
		System.out.println("Your list of numbers for array 1:");
		for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}	
		while (CountA2 != 7) {
			int Num2 = (int) (1+Math.random()*99);
			System.out.println("---Checking---\n"+Num2);
			arr2[CountA2]=Num2;
			CountA2++;
		}
		
		
		System.out.println("Your list of numbers for array 2:");
		for (int j=0;j<arr1.length;j++) {
			System.out.println(arr2[j]);
		}
		
	}

}
