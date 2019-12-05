package algorithmPrograms;



import java.util.ArrayList;

import com.bridgelabz.fellowship.Utility.Utility;


public class PredicatUserMind {
static int a=1;
 static ArrayList<Integer> list=new ArrayList<Integer>();
	public static void method(int s,int e) {
		final int number;
		if(a==1) {
		int temp=s+e+1,flagi=0;number=temp;
		
		while(temp>=2) {
			if(temp%2!=0) {
				flagi=0;
			}else {
				flagi=1;
			}
			temp=temp/2;
		
		}
		if(flagi==1) {
			System.out.println("Think of a number b/w 0-"+(e)+":");
			a--;
		}else {
			if(flagi==1) {
			System.out.println("Number is not in format,N=2^n, like 2,4,8,16..:");
			a--;
			}
		}
		
		
		int array[]=new int[number];
		
		for(int i=0;i<number;i++) {
			list.add(i);
		}
		}
		//
		int end=e;
		int start=0;
		while(start<=end) {
			if(start!=end) {
			int mid=(start+end)/2;
			System.out.println("choose you guess postion :: start:"+start+"end:"+end);
			System.out.println("1.smaller than 2.greater than "+mid);
			int choice=Utility.inputInteger();
			
			switch(choice) {
			case 1:end=mid;
					method(start,end);
					break;
			case 2:start=mid+1;
					method(start,end);
					break;
			default: System.out.println("Not valid input!");
			}
			
		}else {
			System.out.println("You guess:"+list.get(start));
			break;
		}
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int N=Utility.inputInteger();
		
		method(0,N-1);
	
		
		
	}

}
