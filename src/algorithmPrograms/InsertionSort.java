package algorithmPrograms;

import com.bridgelabz.fellowship.Utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("How many elements you have to sort:");
		int n=Utility.inputInteger();
		int array[]=new int[n];
		
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<n;i++) {
			array[i]=Utility.inputInteger();
		}
		System.out.print("Array before sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+",");
		}
		
		for(int i=0;i<n-1;i++) {
			if(array[i+1]<array[i]) {
				int temp=array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
			}
			
			for(int j=i;j>0;j--) {
				if(array[j]<array[j-1]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.print("\nSorted array:");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+",");
		}
	}

}
