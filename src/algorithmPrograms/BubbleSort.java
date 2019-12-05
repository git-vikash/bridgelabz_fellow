package algorithmPrograms;

import com.bridgelabz.fellowship.Utility.Utility;

public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		int n=array.length;
		int state=0;
		for(int i=0;i<n-1;i++) {
			if(array[i+1]<array[i]) {
				int temp=array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
				state++;
			}
		}
		
		
		if(state!=0) {
			bubbleSort(array);
		}
		return array;
	}
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
		
		int sorted[]=bubbleSort(array);
		System.out.print("\nArray after sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(sorted[i]+",");
		}
	}

}
