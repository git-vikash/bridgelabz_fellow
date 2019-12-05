package junitTesting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachine {
	static HashMap<Integer,Integer> map=new HashMap<>();
	public static void change(int amount) {
	int sum=0;
		map.put(1000,0);
		map.put(500, 0);
		map.put(100,0);
		map.put(50, 0);
		map.put(10,0);
		map.put(5, 0);
		map.put(2,0);
		map.put(1, 0);
		
		TreeMap<Integer,Integer> tree=new TreeMap<>(Collections.reverseOrder());
		tree.putAll(map);
		for(HashMap.Entry<Integer,Integer> entry:tree.entrySet()) {
			while(amount>=entry.getKey()) {
				amount=amount-(entry.getKey());
				entry.setValue(entry.getValue()+1);
			
				
			}
			if(entry.getValue()!=0) {
				sum=sum+entry.getValue();
			System.out.println(entry.getValue()+" Notes of "+entry.getKey());
			}
		}
		System.out.println(sum+" Notes Total");
		 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to get change:");
		int amount=sc.nextInt();
		change(amount);
		
		sc.close();
		
		
		
		
	}

}
