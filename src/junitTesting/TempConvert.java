package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class TempConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature and its unit:");
		int temp=sc.nextInt();
		String unit=sc.next();
		
		Utility.temperaturConversion(temp,unit);
		
		sc.close();
	}

}
