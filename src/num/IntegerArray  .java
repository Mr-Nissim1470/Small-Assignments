//Assignment 6 
//Yosef Nahon
//2/23/21
package num;

import java.util.Arrays;

public class IntegerArrayNahon {
	
	private  int [] arr ;
	
	IntegerArrayNahon(int length) {
		int [] ARR = new int [length];
		arr=ARR;
	}
	
	IntegerArrayNahon(int[]meh) {
		arr=meh;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public void printLiteral() {
		//System.out.println(Arrays.toString(arr));
		String og = "";//an atempt to try and print without it^
		int len = arr.length;
	for (int i = 0;i< len;i++) {
		String num =""+ arr[i];
		if(i==0|i==len-1) {
			if(i==0) {
				og+="{"+ num;
			}
			else if(i==len-1) {
				og+= ","+num+"}";
			}
		}
		else {
		og+= ","+num;
		}
		}
	System.out.println(og);
	
	}
	
		public double sumOfArray() {
		int sum = 0;
		for (int i = 0;i<=arr.length;i++) {
			sum = sum + i;
		}
		return sum;
	}
	public int maxInArray() {
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}}
		return max;	
	}

	public int minInArray() {
		int min = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}}
		return min;	
	}
	
	public int rangeInArray() {
		int Max = maxInArray();
		int Min = minInArray();
		
		return Max-Min;
	}
	public double mean() {
		int Ma = maxInArray();
		int Mi = minInArray();
		double Total = (Ma+Mi)/ arr.length;
		return Total;
	}
	
	public void clip(int X) {
		;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>X) {
				arr[i] = X;
			}}
		}
		
		
	} 
