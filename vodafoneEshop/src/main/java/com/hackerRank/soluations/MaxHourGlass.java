package com.hackerRank.soluations;

public class MaxHourGlass {

	public static void main(String[] args) {
		int[][] q = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[][] frame = { { 1, 1, 1 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int sol = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = 0;
				sum = q[i][j]+q[i][j+1]+q[i][j+2]+q[i+1][j+1]+q[i+2][j]+q[i+2][j+1]+q[i+2][j+2];
				System.out.println("sum : "+sum);
				if(sum>sol){
					sol=sum;
				}
			}
			System.out.println("::::::::::::");
		}
		System.out.println(sol);
	}

}
