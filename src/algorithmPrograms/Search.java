package algorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		String word_list[]= {"xyz","abc","bcd","cde","def","efg","fgh","ghi","hij","ijk","jkl"};
		Arrays.sort(word_list);
		System.out.println("Enter word to search in list:");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		int flag=1;
		for(int i=0;i<word_list.length;i++) {
		//System.out.print(word_list[i]+" ");
			flag=1;
		if(word_list[i].equals(word)) {
			System.out.println("its found");
			break;
		}
		else {
			flag=0;
		}
		}
		if(flag==0) {
		System.out.println("not ");
		}
		
		sc.close();
	}

}
