package junitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowship.Utility.Utility;

public class UtilDayofWeek {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter birthday in dd-mm-yyyy format:");
		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		
		int d=Utility.dayOfWeek(date,month,year);
		
		switch(d) {
		case 0: System.out.println("It's Sunday.");
		 		break;
		case 1: System.out.println("It's Monday");
				break;
		case 2: System.out.println("It's Tuesday.");
 				break;
		case 3: System.out.println("It's Wednesday");
				break;
		case 4: System.out.println("It's Thursday.");
				break;
		case 5: System.out.println("It's Friday");
				break;
		case 6: System.out.println("It's Saturday");
		 		break;
		default: System.out.println("Something wrong!");
		}
		sc.close();
	}

}
