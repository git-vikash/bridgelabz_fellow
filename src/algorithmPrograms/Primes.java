package algorithmPrograms;

import java.util.ArrayList;

import com.bridgelabz.fellowship.Utility.Utility;

public class Primes {
	//prime method
	public static ArrayList<Integer> prime(int lo,int up) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		boolean flag=true;
		
		for(int i=lo;i<=up;i++) {
			if(i==0 || i==1) {
				continue;
			}
			int num=i/2;
			flag=true;
			
			for(int j=2;j<=num;j++) {
				
				if(i%j==0) {
					
					flag=false;
					break;
				}
			}
			if(flag) {
				list.add(i);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println("Give a range of numbers to find all primes:");
		System.out.println("Enter lower limit of range:");
		int lo=Utility.inputInteger();
		System.out.println("Enter upper limit of range:");
		int up=Utility.inputInteger();
		
		
		if(prime(lo,up).isEmpty()) {
			System.out.println("Not primes");
		}else {
			System.out.println("Primes are:"+prime(lo,up));
		}
	}
}
