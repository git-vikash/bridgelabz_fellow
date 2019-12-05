package algorithmPrograms;

import java.util.ArrayList;

import com.bridgelabz.fellowship.Utility.Utility;

public class PredicatUserMind {
static int a=1, end=0, start=0;
 static ArrayList<Integer> list=new ArrayList<Integer>();
 
	public static int method(int s,int e) {
		 
		if(a==1) {
		int temp=s+e+1,flagi=0;
		
		while(temp>=2) {
			if(temp%2!=0) {
				flagi=0;
			}else {
				flagi=1;
			}
			temp=temp/2;
		
		}
		if(flagi==1) {
			System.out.println("Think of a number b/w 0-"+e+":");
			a--;
		}else {
			//if(flagi==1) {
			System.out.println("Number is not in format,N=2^n, like 2,4,8,16..:");
			a--;
			//}
		}
		
		
		
		}
		//
		end=e;
		start=s;
		while(start!=end) {
			
			int mid=(start+end)/2;
			System.out.println("start:"+start+" end:"+end);
			System.out.println("1.smaller than or same as :"+mid+"\n2.greater than :"+mid);
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
			
		
		}
		//System.out.println("your number:"+start);
		if(start==end) {
		return start;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int N=Utility.inputInteger();
		
		System.out.println("your number is:"+method(0,N-1));;
	
		
		
	}

}
