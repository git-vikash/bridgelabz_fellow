package algorithmPrograms;

import com.bridgelabz.fellowship.Utility.Utility;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Enter number to check palindrom:");
		String number=Utility.inputString();
		int length=number.length();
		int mid,tempLength=length;
		
		mid=(tempLength/2)-1;
		
		int count=0;
		for(int i=0;i<=mid;i++) {
			System.out.println(number.charAt(i)+","+number.charAt(length-1-i)+","+mid);
			
			if(number.charAt(i)==number.charAt(length-1-i)) {
				count++;
			}
		}
		if(count==mid+1) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not palindrom");
		}

	}

}
