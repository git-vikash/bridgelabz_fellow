package algorithmPrograms;


import java.util.Arrays;
import java.util.Scanner;

public class BinaryGeneric{

	public static <E> void binary(E[] list,E word) {
		Arrays.sort(list);
		E end=list.length-1;
		T start=0,flag=1;
		while(start<=end) {
			int mid=(start+end)/2;
			int res=word.compareTo(list[mid]);
			if(res>0) {
				start=mid+1;
				
			}else {
				end=mid-1;
			}
			if(res==0){
				System.out.println("its found!");
				flag=0;
				break;
			}
			
		}
		if(flag==1) {
		System.out.println("not found");
		}
	}
	
	public static void main(String[] args) {
		//String list[]= {"1","abc","bcd","cde","efg","def","fgh","ghi","hij","ijk","jkl"};
		int list[]= {1,5,3,4,2,6,8,7,9,0};
		System.out.println("Enter word to binary search:");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		
		binary(list,word);
		
		sc.close();
		
	}

}
