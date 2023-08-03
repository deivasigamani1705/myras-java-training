package com.basic.program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int temp=input;
		int digits = 0;
		while(temp>=1)
		{
			digits++;
			temp=temp/10;
		}
		temp=input;
		int arm=0;
		while(temp>=1)
		{
			int digit = temp%10;
			arm = arm + (int) Math.pow(digit, digits);
			temp = temp/10;
		}
		if(arm==input) {
			System.out.print("Armstrong number");
		}
		else {
			System.out.print("Not an Armstrong number");	
		}
				
	}

}
