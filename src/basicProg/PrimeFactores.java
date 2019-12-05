package basicProg;

import java.util.Scanner;

public class PrimeFactores {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number whose prime factors to be found:");
		int number=sc.nextInt();
		
		for(int i=2;i<=number;i++) {
			boolean flag=true;int count=1;
			do {
				
				flag=false;
				int j=number%i;
				if(j==0) {
					if(count!=0) {
						System.out.println(i);
						count--;
					}
					
					number=number/i;
					flag=true;
					
				}else {
					flag=false;
				}
			}while(flag);
			
//			while(number%i==0) {
//				number=number/i;
//			}
			
			sc.close();
		}
		
	}

}
