package logicalProg;

import com.bridgelabz.fellowship.Utility.Utility;


public class Coupon {

	public static void main(String[] args) {
		
		
		System.out.println("Enter how many number to be enter:");
		int n=Utility.inputInteger();
		int numbers[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		int num=n-1;
		while(num>=0) {
			numbers[num]=Utility.inputInteger();
			num--;
		}
		
	//	String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	//	int n=str.length();
		int rand=(int)(Math.random()*100000000);
		System.out.println(rand);
		int rem=0;
	
		while(rand>0) {
			rem=rand%n;
	
			rand=rand/n;
			//System.out.print(str.charAt(rem));
			System.out.print(numbers[rem]);
		}
		
		
		
		
		
		
	}

}
