package com.bridgelabz.dataStructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class UnOrderedList {

	public static void main(String[] args) {
		FileInputStream fis;FileOutputStream fos;
		int i=0;
		LinkedList<String> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		try {
			fis=new FileInputStream("/home/admin0/Desktop/tictoc.txt");
			String s="";
			while((i=fis.read())!=-1){
				char c=(char)i;
				if(c!=' ') {
					if(c=='.' || c=='!' || c=='?') {
						System.out.println(c);
						continue;
						
					}
					s=s+c;
				}if(c==' ') {
					ll.add(s);//System.out.println(s);
					s="";
					continue;
				}
				//System.out.print(c);
			}
			System.out.println("Enter the word to search:");
			String str=sc.next();
			
			if(ll.contains(str)) {
				System.out.println("Yes! "+str+" is present.");
				//ll.remove(str);
			}else {
				System.out.println("Not found!");
				//ll.add(str);
				str=str+" ";
				
				fos=new FileOutputStream("/home/admin0/Desktop/tictoc.txt",true);
				byte[] b=str.getBytes();
				fos.write(b);
			}
//			for(String st:ll) {
//				System.out.println(st);
//			}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
