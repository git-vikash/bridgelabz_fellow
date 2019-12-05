package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class SwapBinaryNibble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int num=sc.nextInt();
		
	
	
	
	Utility.swapBinaryNibble(num);
		sc.close();

	}

}
