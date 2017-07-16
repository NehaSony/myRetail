package com.hackerRank.soluations;

import java.util.Scanner;

public class MakingCandies {

	public static void main(String[] args) {

		int n = 0;
		int w = 0;
		int m = 0;
		int p = 0;
		int counter = 0;
		int candy = 0;
		int val = 0;
		int min = 0;

		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		w = sc.nextInt();
		p = sc.nextInt();
		n = sc.nextInt();

		System.out.println(":::::::::::");
		while (m*w <= n) {
			counter++;
			candy = m * w + candy;
			System.out.println(m);
			System.out.println(w);
			// m * w Calculator
			val = Math.floorDiv(candy, p);
			//Here
			if (candy >0){
				candy = candy - (val*p);
			}
			else candy = 0;
			candy = candy - (val*p);
			System.out.println("val : "+val);
			System.out.println("::::1:::::::");
			if (m == 1 || w == 1) {
				System.out.println("::::::3:::::");
				if (m > w) {
					w = w + val;
				} else if (m < w) {
					System.out.println("::::4:::::::");
					m = m + val;
				}				
			} else {
				m = val / 2 + m;
				w = val / 2 + w;
				System.out.println(":::::2::::::");
				
			}
		}
		System.out.println(counter);

		sc.close();
	}

}
