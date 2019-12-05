package com.bridgelabz.fellowship.Utility;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
	
	static Scanner sc=new Scanner(System.in);
	public static int inputInteger()
			{
				return (sc.nextInt());
			}
	
			public static String inputString()
			{
				return (sc.nextLine());
			}
			public static float inputFloat()
			{
				return (sc.nextFloat());
			}
			public static double inputDouble()
			{
				return (sc.nextDouble());
			}
			public static long inputLong()
			{
				return (sc.nextLong());
			}
	
	public static int dayOfWeek(int d,int m,int y) {
		
		int Yo=y-(14-m)/12;
		int x=Yo+Yo/4-Yo/100+Yo/400;
		int Mo=m+12*((14-m)/12)-2;
		int Do=(d+x+(31*Mo/12))%7;
		
		return Do;
	}
	
	public static void temperaturConversion(double temp,String unit) {
		switch(unit) {
		case "c": System.out.println(((temp*9/5)+32)+" F");
					break;
		case "f":System.out.println(((temp-32)*5/9)+" C");
					break;
		}
		
	}
	
	public static void monthlyPayment(double P,double Y,double R) {
		double n=12*Y;
		double r=R/(12*100);
		
		double payment= (P*r)/(1-Math.pow((1+r),(-n)));
		
		System.out.println(payment);
	}
	
	public static void sqrt(double c) {
		double epsilon=(1e-15);
		double t;
		t=c;
		
		do {
			t=(c/t+t)/2;
		}while(Math.abs(t-c/t)>epsilon*t);
		
		System.out.println(t);
		
	}
	
	public static StringBuffer toBinary(int n) {
		int num=n;
		StringBuffer buffer=new StringBuffer("");
		ArrayList<Integer> list=new ArrayList<Integer>();
		 int  i=0;int j=0;
		do {
			
			int a=(int)Math.pow(2, i);
			list.add(a);
			//System.out.println(list);
			 j=i;
			i++;
		}while(list.get(j)<=n);
		
		list.remove(j);
		
		for(int l=list.size()-1;l>=0;l--) {
			if(list.get(l)<=num) {
				num=num-list.get(l);
				buffer.append("1");
			}else {
				buffer.append("0");}
		}
		
		return buffer;

	}
	
	public static void swapBinaryNibble(int n) {
		int length=toBinary(n).length();
		
		int array[]=new int[8];
		
		int j=length-1;
		
		for(int i=8-1;i>0;i--) {
			if(j>=0) {
			array[i]=toBinary(n).charAt(j)-48;
			j--;
			}else {
				array[i]=0;
			}
		}
		
		for(int i=0;i<4;i++) {
			int a=array[i];
			array[i]=array[i+4];
			array[i+4]=a;
		}
		
		int sum=0,k=0;
		
		for(int i=7;i>=0;i--) {
			if(array[i]==1) {
				sum=sum+(int)Math.pow(2,k);
			}
			k++;
		}
		
		System.out.println("\n Decimal value after swaping binary nibbles of: "+n+" is: "+sum);
		
	}
	public static void main(String[] args) {
	
	}

}
