package com.hackerRank.soluations;

public class SuperRedusedString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("aaabccddd");
		String outstr = "";
		for(int i = 0; i<str.length()-1; i++){
			if(str.charAt(i)==str.charAt(i+1)){
				str.replace(i,i+1,"");
				str.replace(i+1,i+2,"");
				System.out.println(i);
			}
		}
		System.out.println(str);
	}

}
