package com.bridgelabz.dataStructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteWord {

	public static void main(String[] args) {
		FileInputStream fis;FileOutputStream fos;
		int i=0;
		LinkedList<String> ll=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		try {
			fis=new FileInputStream("/home/admin0/Desktop/tictoc.txt");
			String s="";StringBuffer sb=new StringBuffer();
			while((i=fis.read())!=-1){
				char c=(char)i;
				sb.append(c);
					
			}
			final int index=sb.indexOf("you");
			System.out.println(index);int j=0;
			while(sb.charAt(119)!=' ' ) {
			//sb.deleteCharAt(119+j);j++;
			}
			System.out.println(sb.toString());
				fos=new FileOutputStream("/home/admin0/Desktop/tictoc.txt",true);
			//	byte[] b=str.getBytes();
			//	fos.write(b);
			
//			for(String st:ll) {
//				System.out.println(st);
//			}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
