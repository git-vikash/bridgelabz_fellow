package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class MonthlyPay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Paincipal amount:");
		double principal=sc.nextDouble();
		
		System.out.println("Enter rate per year:");
		double rate=sc.nextDouble();
		
		System.out.println("Enter time in year:");
		double time=sc.nextDouble();
		
		Utility.monthlyPayment(principal,time,rate);
		sc.close();
	}
	
}
