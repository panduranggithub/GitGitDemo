package com.gitdemo1;

import java.util.Scanner;

public class StairCase {
    public static void stairCase(int n) {
    	/*for(int i =1;i<=n;i++) {
    		for(int j = 1;j<=n-i;j++) {
    			System.out.print(" ");
    		}
    		for(int k = 1;k<=i;k++) {
    			System.out.print("#");
    		}
    		System.out.println();
    	}*/
    	String str = "#";
    	for(int i =0;i<n;i++) {
    		System.out.printf("%"+n+"s\n",str);
    		str += "#";
    	}
    }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		stairCase(n);
	}

}
