package com.vodafone.co.uk.rest;/*
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class T1{
	 void hello() {
		System.out.println("Test");
	}
}

class T extends T1{
	void hello() {
		System.out.println("T");
	}
}

class Test{
	public static void main(String[] args) {
//		T b1 = new T1();
		T b2 = new T();
		T1 b1 = new T();
//		b1.hello();
		b2.hello();
	}
}

/*public class Test {
	
	public static void main(String[] args) {
		
		Boolean flag = false;
//		int[] input = {1,0,3,2};
		int[] input = {1,0,2,4,3,5,6,8,7,10,9,11,13,12,14,15,16,17,18,23,22,24,33,34,25,27,26,19,32,28,30,21,20,29,31};
		int[] outArray = new int[input.length]; 
		for (int i = 0 ; i < input.length-1 ; i++) {
			if(input[i]>input[i+1] && (input[i]-input[i+1] == 1 || input[i]-input[i+1] == -1 ) ){
				input[i] = input[i]+input[i+1];
				input[i+1] = input[i]-input[i+1];
				input[i] = input[i]-input[i+1];
			}
			outArray[i] = input[i];
		}
		Arrays.sort(input);
		for(int i = 0 ; i < input.length-1 ; i++) {
			if(outArray[i] != input[i]){
				flag = true;
				System.out.println("No");
				break;
			}
		}
		if (!flag) {
			System.out.println("Yes");
		}
		
		
		int array1[] = {-5,-1,3,-4,-5,0};
		int[] outArray = new int[40];
		int count = 0;
		for (int i = 0 ; i < array1.length; i++) {

			if (array1[i] > 0){
				outArray[count] = array1[i];
			count++;
			}
			if (array1[i] == 0) {
				outArray[count] = array1[i];
				count++;
			}
		}
		for (int i = 0 ; i < array1.length; i++) {
			if (array1[i] < 0) {
				outArray[count] = array1[i];
				count++;
			}

		}
		for (int i = 0 ; i < array1.length; i++) {
			System.out.println(outArray[i]);
		}
		
		

	}
}*/
