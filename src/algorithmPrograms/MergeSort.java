package algorithmPrograms;

import com.bridgelabz.fellowship.Utility.Utility;

public class MergeSort {
	public static int[]  sort(int[] array,int start,int end) {
		if(start<end) {
		int	mid=(start+end)/2;
			sort(array,start,mid);
			sort(array,mid+1,end);
			
			merge(array,start,end,mid);
		}
		return array;
	}
	
	
	public static void merge(int[] array,int start,int end,int mid) {
		int size1=(mid-start)+1;
		int size2=(end-mid);
		
		int tempAry1[]=new int[size1];
		int tempAry2[]=new int[size2];
		
		for(int i=0;i<size1;i++) {
			tempAry1[i]=array[i+start];
		}
		for(int j=0;j<size2;j++) {
			tempAry2[j]=array[mid+j+1];
		}
		//copy from temp ary to original array 
		int i=0,j=0,k=start;
		while(i<size1 && j<size2) {
			if(tempAry1[i]<=tempAry2[j]) {
				array[k]=tempAry1[i];
				i++;
				
			}else {
				array[k]=tempAry2[j];
				j++;
			}
			k++;
		}
		//for remaining element if any
		while(i<size1) {
			array[k]=tempAry1[i];
			i++;
			k++;
		}
		while(j<size2) {
			array[k]=tempAry2[j];
			j++;
			k++;
		}
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
		int start=0;
		int end=array.length-1;
		int ary[]=sort(array, start, end);
		
		System.out.print("Array after sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(ary[i]+",");
		}
		
	}

}
