package algorithmPrograms;


import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Permutation 
{
	//using iteration
	public static void permute(String s) {
	    char[] a = s.toCharArray();
	    int n = a.length;
	    int[] p = new int[n];  
	    int i = 1; 
	    
	    while (i < n) {
	        if (p[i] < i) {
	        	int j = ((i % 2) == 0) ? 0 : p[i];
	            swap(a, i, j);
	          
	            System.out.println(a);
	            p[i]++; 
	            i = 1; 
	        }
	        else { 
	            p[i] = 0;
	            i++;
	        }
	    }
	}

	private static void swap(char[] a, int i, int j) {
	    char temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	
	//using recurtion
	
	public static void permuteRecursion(String str,int start,int end) {
		if(start==end-1) {
			System.out.println(str);
		}else {
			for(int i=start;i<end;i++) {
			str=swap(str,start,i);
			permuteRecursion( str, start+1,end);
			str=swap(str,start,i);
			
			
			}
		}
	}
	public static String swap(String str,int start,int i) {
		char c[]=str.toCharArray();
		char temp=c[start];
		c[start]=c[i];
		c[i]=temp;
		
		return String.valueOf(c);
	}
	
	
	
	public static void main(String[] args) {//-------------------------------------------------------main------------------------
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to get permutation");
		String str1=sc.nextLine();
		
		int n=str1.length();
		permuteRecursion(str1,0,n);
		//permute(str1);
		sc.close();
		
		//permute(str1);
		int count=0;
	    List<String> results = new ArrayList<String>();
	    String test_str = "abc";
	    char[] chars = test_str.toCharArray();
	    results.add(new String("" + chars[0]));
	    for(int j=1; j<chars.length; j++) {
	        char c = chars[j];
	        int cur_size = results.size();
	        //create new permutations combing char 'c' with each of the existing permutations
	        for(int i=cur_size-1; i>=0; i--) {
	            String str = results.remove(i);
	            for(int l=0; l<=str.length(); l++) {
	                results.add(str.substring(0,l) + c + str.substring(l));
	                count++;
	            }
	        }
	    }
	    System.out.println("Number of Permutations: " + results.size()+", iterate:"+count);
	    System.out.println(results);
	    
	}
}
