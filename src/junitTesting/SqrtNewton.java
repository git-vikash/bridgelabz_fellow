package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class SqrtNewton {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean state=false;
		double c=0;
		
		do {
		System.out.println("Enter a non-negative number:");
		c=sc.nextDouble();
		if(c<0) {
			state=true;
		}
		}while(state);
		
		Utility.sqrt(c);
		
		sc.close();
	}
}
