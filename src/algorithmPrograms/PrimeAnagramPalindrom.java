package algorithmPrograms;

import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.fellowship.Utility.Utility;

public class PrimeAnagramPalindrom {

	// prime method
	public static ArrayList<Integer> prime(int lo, int up) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean flag = true;

		for (int i = lo; i <= up; i++) {
			if (i == 0 || i == 1) {
				continue;
			}
			int num = i / 2;
			flag = true;

			for (int j = 2; j <= num; j++) {

				if (i % j == 0) {

					flag = false;
					break;
				}
			}
			if (flag) {
				int n=i,result=0;
				while(n!=0) {
					int r=n%10;
					result=result*10+r;
					n=n/10;
				}
				if(result==i) {
					//System.out.println(i+"is prime  palindrom.");
					list.add(i);
				}
				
			}
		}
		anagram(list);
		return list;
	}

	// Anagram method
	public static void anagram(ArrayList<Integer> list) {
		ArrayList<Integer> digits = new ArrayList<Integer>();//System.out.println("list"+list);
		for (int i = 0; i < list.size(); i++) {
			
			int value = list.get(i);
			int temp = value;
			
			digits.clear();
			while (temp > 0) {
				int r = temp % 10;
				digits.add(r);
				temp = temp / 10;
				
			}
			Collections.sort(digits);//System.out.println(digits);
			int lengthTemp = digits.size(),length=digits.size();
			
			
			// max of the number with same digits
			int rev = 0;
			while (lengthTemp > 0) {
				rev = rev + digits.get(lengthTemp - 1) * (int) Math.pow(10, lengthTemp - 1);
				lengthTemp--;
			}//System.out.println(rev);
			
			int mult=value*2 , j = 3;
			ArrayList<Integer> digit_mult = new ArrayList<Integer>();//System.out.println("multi:"+mult+",j");
			if(mult>rev) {
				//System.out.println("Sorry! enter another number");
				continue;
			}
			while (mult < rev) {				//System.out.println("multo:"+mult+",j");
				int multTemp=mult;
				digit_mult.clear();
				while (multTemp > 0) {
					int r = multTemp % 10;
					digit_mult.add(r);
					multTemp = multTemp / 10;
				}
				//System.out.println(digit_mult);
				int jj = 0,kk=0;
				for (int x = 0; x < length; x++) {
//System.out.println(digit_mult.get(x)+" in "+digits);

					if (digits.contains(digit_mult.get(x))) {
						jj++;
					} else {
						kk++;
					}
				}
				if (jj == digits.size()) {
					System.out.println(value + "Its prime anagram palindrom.");
					//palindrom(value);
					break;
				}
				if (kk == digits.size()) {
					System.out.println( "Not Anagram!");
					break;
				}
				mult = value * j;
				j++;
				
			}
			
		}
	}
// palindrom method
////	static int palindrom(int value) {
//		int n=value;
//		String number=Integer.toString(n);
//		int length=number.length();
//		int mid,tempLength=length;
//		
//		mid=(tempLength/2)-1;
//		
//		int count=0;
////		for(int i=0;i<=mid;i++) {
////			//System.out.println(number.charAt(i)+","+number.charAt(length-1-i)+","+mid);
////			
////			if(number.charAt(i)==number.charAt(length-1-i)) {
////				count++;
////			}
////		}
////		if(count==mid+1) {
////			System.out.println(value+"is prime anagram palindrom.");
////			
////		}return value;
////		else {
////			System.out.println("No prime anagram palindrom");
////		}
//	}
	public static void main(String[] args) {
		System.out.println("Give a range of numbers to find all primes:");
		System.out.println("Enter lower limit of range:");
		int lo = Utility.inputInteger();
		System.out.println("Enter upper limit of range:");
		int up = Utility.inputInteger();
		prime(lo, up);
		//System.out.println();
	}
}
