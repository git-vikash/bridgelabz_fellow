package algorithmPrograms;

import com.bridgelabz.fellowship.Utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		boolean flag=true;
		String str1="",str2="" ;
		
		do {
		System.out.println("---Check Anagram---\n Please string of same length!!");
		System.out.print("Enter first string:");
		str1=Utility.inputString();
		System.out.print("Enter second string of length "+str1.length()+":");
		str2=Utility.inputString();
		
		if(str1.length()==str2.length()) {
			flag=false;
		}
		}while(flag);
		
		int j=0;
		
		
		for(int i=0;i<str1.length();i++) {
			char c=str1.charAt(i);
			
			if(str2.indexOf(c)<0) {
				System.out.println("Not Anagram!");
				break;
			}else {
				j++;
			}
		}
		
		if(j==str2.length()) {
			System.out.println("Its Anagram!");
		}
	}

}
