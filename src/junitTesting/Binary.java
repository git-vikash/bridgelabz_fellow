package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number to find binary:");
		int num=sc.nextInt();
		
		System.out.println(Utility.toBinary(num));
		sc.close();
	}

}
